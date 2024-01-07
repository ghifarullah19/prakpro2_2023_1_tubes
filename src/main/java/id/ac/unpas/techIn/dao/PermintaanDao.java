package id.ac.unpas.techIn.dao;

import id.ac.unpas.techIn.db.MySqlConnection;
import id.ac.unpas.techIn.pelanggan.Pelanggan;
import id.ac.unpas.techIn.penjemputan.Penjemputan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import id.ac.unpas.techIn.permintaan.Permintaan;

public class PermintaanDao {
    public int insert(Permintaan permintaan) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "Insert into permintaan(id, namaPelanggan, alamatPenjemputan, status, idPelanggan) values (?, ?, ?, ?, ?)");

            statement.setInt(1, 0);
            statement.setString(2, permintaan.getNama());
            statement.setString(3, permintaan.getAlamat());
            statement.setBoolean(4, permintaan.getStatus());
            statement.setInt(5, this.selectPelanggan("namaPelanggan", permintaan.getNama()).getId());

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int update(Permintaan permintaan) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "update permintaan set namaPelanggan = ?, alamatPenjemputan = ?, status = ? where id = ?");

            statement.setString(1, permintaan.getNama());
            statement.setString(2, permintaan.getAlamat());
            statement.setBoolean(3, permintaan.getStatus());
            statement.setInt(4, permintaan.getId());

            result = statement.executeUpdate();

            PenjemputanDao penjemputanDao = new PenjemputanDao();
            Penjemputan penjemputan = new Penjemputan();
            penjemputan.setNama(penjemputanDao.select("idPermintaan", String.valueOf(permintaan.getId())).getNama());
            penjemputan
                    .setAlamat(penjemputanDao.select("idPermintaan", String.valueOf(permintaan.getId())).getAlamat());
            penjemputan.setAlamatTujuan(
                    penjemputanDao.select("idPermintaan", String.valueOf(permintaan.getId())).getAlamatTujuan());
            penjemputan.setStatus(permintaan.getStatus());
            penjemputan.setIdPermintaan(permintaan.getId());
            penjemputan
                    .setIdKurir(penjemputanDao.select("idPermintaan", String.valueOf(permintaan.getId())).getIdKurir());
            penjemputanDao.updateToTrue(penjemputan);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public int delete(Permintaan permintaan) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("delete from permintaan where id = ?");

            statement.setInt(1, permintaan.getId());

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<Permintaan> findAll() {
        List<Permintaan> list = new ArrayList<>();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {

            try (ResultSet resultSet = statement.executeQuery("select * from permintaan");) {

                while (resultSet.next()) {
                    Permintaan permintaan = new Permintaan();

                    permintaan.setId(resultSet.getInt("id"));

                    permintaan.setNama(resultSet.getString("namaPelanggan"));
                    permintaan.setAlamat(resultSet.getString("alamatPenjemputan"));
                    permintaan.setStatus(resultSet.getBoolean("status"));

                    list.add(permintaan);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // mengembalikan nilai list
        return list;
    }

    public Permintaan select(String column, String value) {
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

    public Pelanggan selectPelanggan(String column, String value) {
        Pelanggan pelanggan = new Pelanggan();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {
            try (ResultSet resultSet = statement
                    .executeQuery("select * from pelanggan where " + column + " = '" + value + "'");) {
                while (resultSet.next()) {
                    pelanggan.setId(resultSet.getInt("idPelanggan")); // id
                    pelanggan.setNama(resultSet.getString("namaPelanggan")); // nama
                    pelanggan.setAlamat(resultSet.getString("alamatPelanggan")); // alamat
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Kembalikan nilai permintaan
        return pelanggan;
    }
}
