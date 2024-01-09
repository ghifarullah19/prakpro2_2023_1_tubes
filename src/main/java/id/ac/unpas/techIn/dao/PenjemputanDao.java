package id.ac.unpas.techIn.dao;

import id.ac.unpas.techIn.db.MySqlConnection;
import id.ac.unpas.techIn.kurir.Kurir;
import id.ac.unpas.techIn.lacak.Lacak;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import id.ac.unpas.techIn.penjemputan.Penjemputan;
import id.ac.unpas.techIn.permintaan.Permintaan;

public class PenjemputanDao {
    public int insert(Kurir penjemputan) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "Insert into penjemputan(id, namaKurir, alamatPenjemputan, alamatTujuan, status, idPermintaan, idKurir) values (?, ?, ?, ?, ?, ?, ?)");

            statement.setInt(1, 0);
            statement.setString(2, penjemputan.getNama());
            statement.setString(3, "");
            statement.setString(4, "");
            statement.setBoolean(5, true);
            statement.setNull(6, 0);
            statement.setInt(7, this.selectKurir("namaKurir", penjemputan.getNama()).getId());

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public int update(Penjemputan penjemputan, Permintaan permintaan) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "update penjemputan set namaKurir = ?, alamatPenjemputan = ?, alamatTujuan = ?, status = ?, idPermintaan = ?, idKurir = ? where id = ?");

            statement.setString(1, penjemputan.getNama());
            statement.setString(2, penjemputan.getAlamat());
            statement.setString(3, penjemputan.getAlamatTujuan());
            statement.setBoolean(4, penjemputan.getStatus());
            statement.setInt(5, this.selectPermintaan("status", false).getId());
            statement.setInt(6, this.selectKurir("namaKurir", penjemputan.getNama()).getId());
            statement.setInt(7, this.select("namaKurir", penjemputan.getNama()).getId());

            result = statement.executeUpdate();

            LacakDao lacakDao = new LacakDao();
            Lacak lacak = new Lacak();
            lacak.setNamaKurir(penjemputan.getNama());
            lacak.setNamaPelanggan(permintaan.getNama());
            lacak.setAlamatPenjemputan(penjemputan.getAlamat());
            lacak.setAlamatTujuan(penjemputan.getAlamatTujuan());
            lacak.setStatus(penjemputan.getStatus());
            lacak.setIdPenjemputan(this.select("namaKurir", penjemputan.getNama()).getId());
            lacak.setIdKurir(this.selectKurir("namaKurir", penjemputan.getNama()).getId());
            lacakDao.insert(lacak);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public int updateToTrue(Penjemputan penjemputan) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "update penjemputan set namaKurir = ?, alamatPenjemputan = ?, alamatTujuan = ?, status = ?, idPermintaan = ?, idKurir = ? where id = ?");

            System.out.println(penjemputan.getStatus());

            statement.setString(1, penjemputan.getNama());
            statement.setString(2, penjemputan.getAlamat());
            statement.setString(3, this.select("namaKurir", penjemputan.getNama()).getAlamatTujuan());
            statement.setBoolean(4, penjemputan.getStatus());
            statement.setInt(5, penjemputan.getIdPermintaan());
            statement.setInt(6, this.selectKurir("namaKurir", penjemputan.getNama()).getId());
            statement.setInt(7, this.select("namaKurir", penjemputan.getNama()).getId());

            result = statement.executeUpdate();

            // lacak
            PermintaanDao permintaanDao = new PermintaanDao();
            int id = this.selectPermintaanV2("id", String.valueOf(penjemputan.getIdPermintaan())).getId();

            LacakDao lacakDao = new LacakDao();
            Lacak lacak = new Lacak();

            lacak.setNamaKurir(penjemputan.getNama());
            lacak.setNamaPelanggan(permintaanDao.select("id", String.valueOf(id)).getNama());
            lacak.setAlamatPenjemputan(penjemputan.getAlamat());
            lacak.setAlamatTujuan(penjemputan.getAlamatTujuan());
            lacak.setStatus(penjemputan.getStatus());
            lacak.setIdPenjemputan(this.select("namaKurir", penjemputan.getNama()).getId());
            lacak.setIdKurir(this.selectKurir("namaKurir", penjemputan.getNama()).getId());
            lacakDao.update(lacak);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public int updateBasedDelete(Penjemputan penjemputan) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "update penjemputan set namaKurir = ?, alamatPenjemputan = ?, alamatTujuan = ?, status = ?, idPermintaan = ?, idKurir = ? where id = ?");

            System.out.println(penjemputan.getStatus());

            statement.setString(1, penjemputan.getNama());
            statement.setString(2, "");
            statement.setString(3, "");
            statement.setBoolean(4, true);
            statement.setNull(5, 0);
            statement.setInt(6, this.selectKurir("namaKurir", penjemputan.getNama()).getId());
            statement.setInt(7, this.select("namaKurir", penjemputan.getNama()).getId());

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public int delete(int id) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("delete from penjemputan where idPermintaan = ?");
            statement.setInt(1, id);

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public int deleteBasedKurir(int id) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("delete from penjemputan where id = ?");
            statement.setInt(1, id);

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<Penjemputan> findAll() {
        List<Penjemputan> list = new ArrayList<>();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {

            try (ResultSet resultSet = statement.executeQuery("select * from penjemputan");) {

                while (resultSet.next()) {
                    Penjemputan penjemputan = new Penjemputan();

                    penjemputan.setId(resultSet.getInt("id"));
                    penjemputan.setNama(resultSet.getString("namaKurir"));
                    penjemputan.setAlamat(resultSet.getString("alamatPenjemputan"));
                    penjemputan.setStatus(resultSet.getBoolean("status"));

                    list.add(penjemputan);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public Penjemputan select(String column, String value) {
        Penjemputan penjemputan = new Penjemputan();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {
            try (ResultSet resultSet = statement
                    .executeQuery("select * from penjemputan where " + column + " = '" + value + "'");) {
                while (resultSet.next()) {
                    penjemputan.setId(resultSet.getInt("id")); // id
                    penjemputan.setNama(resultSet.getString("namaKurir")); // nama
                    penjemputan.setAlamat(resultSet.getString("alamatPenjemputan")); // alamat
                    penjemputan.setAlamatTujuan(resultSet.getString("alamatTujuan"));
                    penjemputan.setStatus(resultSet.getBoolean("status")); // no_telepon
                    penjemputan.setIdKurir(resultSet.getInt("idKurir"));
                    penjemputan.setIdPermintaan(resultSet.getInt("idPermintaan"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return penjemputan;
    }

    public Kurir selectKurir(String column, String value) {
        Kurir kurir = new Kurir();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {
            try (ResultSet resultSet = statement
                    .executeQuery("select * from kurir where " + column + " = '" + value + "'");) {
                while (resultSet.next()) {
                    kurir.setId(resultSet.getInt("idKurir")); // id
                    kurir.setNama(resultSet.getString("namaKurir")); // nama
                    kurir.setNoKendaraan(resultSet.getString("noKendaraan")); // alamat
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return kurir;
    }

    public Permintaan selectPermintaan(String column, boolean value) {
        Permintaan permintaan = new Permintaan();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {
            try (ResultSet resultSet = statement
                    .executeQuery("select * from permintaan where " + column + " = '" + value + "'");) {
                while (resultSet.next()) {
                    permintaan.setId(resultSet.getInt("id")); // id
                    permintaan.setNama(resultSet.getString("namaPelanggan")); // nama
                    permintaan.setAlamat(resultSet.getString("alamatPenjemputan")); // alamat
                    permintaan.setStatus(resultSet.getBoolean("status")); // no_telepon
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return permintaan;
    }
    
    public Permintaan selectPermintaanV2(String column, String value) {
        Permintaan permintaan = new Permintaan();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {
            try (ResultSet resultSet = statement
                    .executeQuery("select * from permintaan where " + column + " = '" + value + "'");) {
                while (resultSet.next()) {
                    permintaan.setId(resultSet.getInt("id")); // id
                    permintaan.setNama(resultSet.getString("namaPelanggan")); // nama
                    permintaan.setAlamat(resultSet.getString("alamatPenjemputan")); // alamat
                    permintaan.setStatus(resultSet.getBoolean("status")); // no_telepon
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return permintaan;
    }
}
