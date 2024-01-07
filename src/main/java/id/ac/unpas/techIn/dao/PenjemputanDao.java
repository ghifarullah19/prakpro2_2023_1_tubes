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
                    "Insert into penjemputan(id, namaKurir, alamatPenjemputan, status, idPermintaan, idKurir) values (?, ?, ?, ?, ?, ?)");

            statement.setInt(1, 0);
            statement.setString(2, penjemputan.getNama());
            statement.setString(3, "");
            statement.setBoolean(4, true);
            statement.setNull(5, 0);
            statement.setInt(6, this.selectKurir("namaKurir", penjemputan.getNama()).getId());

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
            int id = this.selectPermintaan("status", !(penjemputan.getStatus())).getId();

            LacakDao lacakDao = new LacakDao();
            Lacak lacak = new Lacak();

            lacak.setNamaKurir(penjemputan.getNama());
            lacak.setNamaPelanggan(permintaanDao.select("id", String.valueOf(id)).getNama());
            lacak.setAlamatPenjemputan(penjemputan.getAlamat());
            lacak.setAlamatTujuan(penjemputan.getAlamatTujuan());
            lacak.setStatus(penjemputan.getStatus());
            lacak.setIdPenjemputan(this.select("namaKurir", penjemputan.getNama()).getId());
            lacak.setIdKurir(this.selectKurir("namaKurir", penjemputan.getNama()).getId());

            System.out.println(lacak.getNamaKurir());
            System.out.println(lacak.getNamaPelanggan());
            System.out.println(lacak.getAlamatPenjemputan());
            System.out.println(lacak.getAlamatTujuan());
            System.out.println(lacak.getIdKurir());
            System.out.println(lacak.getIdPenjemputan());
            lacakDao.update(lacak);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    // delete digunakan untuk menghapus data jenis member di database
    public int delete(int id) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi
        // query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement("delete from penjemputan where idPermintaan = ?");
            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari
            // parameter jenisMember
            statement.setInt(1, id);

            // result diberikan nilai dari eksekusi query (Berisi jumlah row dari statement
            // berarti berhasil, Berisi 0 berarti gagal)
            result = statement.executeUpdate();
        } catch (SQLException e) {
            // jika terjadi error, maka akan ditampilkan errornya
            e.printStackTrace();
        }

        // mengembalikan nilai result
        return result;
    }

    // findAll digunakan untuk mengambil semua data jenis member di database
    public List<Penjemputan> findAll() {
        // list adalah variabel yang digunakan untuk menyimpan semua data jenis member
        List<Penjemputan> list = new ArrayList<>();

        // try with resources digunakan untuk mengambil koneksi dari database dan
        // membuat statement untuk mengeksekusi query
        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {

            // ResultSet digunakan untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement.executeQuery("select * from penjemputan");) {

                // while digunakan untuk mengambil semua data jenis member dari ResultSet
                while (resultSet.next()) {
                    // Instansiasi JenisMember dengan nama jenisMember
                    Penjemputan penjemputan = new Penjemputan();

                    // jenisMember.setId digunakan untuk mengubah nilai dari variabel id dengan
                    // nilai dari ResultSet berdasarkan kolom id
                    penjemputan.setId(resultSet.getInt("id"));
                    // jenisMember.setNama digunakan untuk mengubah nilai dari variabel nama dengan
                    // nilai dari ResultSet berdasarkan kolom nama
                    penjemputan.setNama(resultSet.getString("namaKurir"));
                    penjemputan.setAlamat(resultSet.getString("alamatPenjemputan"));
                    penjemputan.setStatus(resultSet.getBoolean("status"));

                    // list.add digunakan untuk menambahkan data jenis member ke list
                    list.add(penjemputan);
                }
            } catch (SQLException e) {
                // jika terjadi error, maka akan ditampilkan errornya
                e.printStackTrace();
            }
        } catch (SQLException e) {
            // jika terjadi error, maka akan ditampilkan errornya
            e.printStackTrace();
        }

        // mengembalikan nilai list
        return list;
    }

    public Penjemputan select(String column, String value) {
        // Membuat object permintaan untuk menyimpan data
        Penjemputan penjemputan = new Penjemputan();

        // Try with resources untuk membuat koneksi ke database
        try (
                // Membuat koneksi ke database
                Connection connection = MySqlConnection.getInstance().getConnection();
                // Statement untuk mengirim query ke database
                Statement statement = connection.createStatement();) {
            // Membuat ResultSet untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement
                    .executeQuery("select * from penjemputan where " + column + " = '" + value + "'");) {
                // Looping untuk mengambil semua data dari database
                while (resultSet.next()) {
                    // Set nilai dari object permintaan
                    penjemputan.setId(resultSet.getInt("id")); // id
                    penjemputan.setNama(resultSet.getString("namaKurir")); // nama
                    penjemputan.setAlamat(resultSet.getString("alamatPenjemputan")); // alamat
                    penjemputan.setAlamatTujuan(resultSet.getString("alamatTujuan"));
                    penjemputan.setStatus(resultSet.getBoolean("status")); // no_telepon
                }
            } catch (SQLException e) {
                // Print error jika terjadi error
                e.printStackTrace();
            }
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai permintaan
        return penjemputan;
    }

    public Kurir selectKurir(String column, String value) {
        // Membuat object permintaan untuk menyimpan data
        Kurir kurir = new Kurir();

        // Try with resources untuk membuat koneksi ke database
        try (
                // Membuat koneksi ke database
                Connection connection = MySqlConnection.getInstance().getConnection();
                // Statement untuk mengirim query ke database
                Statement statement = connection.createStatement();) {
            // Membuat ResultSet untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement
                    .executeQuery("select * from kurir where " + column + " = '" + value + "'");) {
                // Looping untuk mengambil semua data dari database
                while (resultSet.next()) {
                    // Set nilai dari object permintaan
                    kurir.setId(resultSet.getInt("idKurir")); // id
                    kurir.setNama(resultSet.getString("namaKurir")); // nama
                    kurir.setNoKendaraan(resultSet.getString("noKendaraan")); // alamat
                }
            } catch (SQLException e) {
                // Print error jika terjadi error
                e.printStackTrace();
            }
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai permintaan
        return kurir;
    }

    public Permintaan selectPermintaan(String column, boolean value) {
        // Membuat object permintaan untuk menyimpan data
        Permintaan permintaan = new Permintaan();

        // Try with resources untuk membuat koneksi ke database
        try (
                // Membuat koneksi ke database
                Connection connection = MySqlConnection.getInstance().getConnection();
                // Statement untuk mengirim query ke database
                Statement statement = connection.createStatement();) {
            // Membuat ResultSet untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement
                    .executeQuery("select * from permintaan where " + column + " = '" + value + "'");) {
                // Looping untuk mengambil semua data dari database
                while (resultSet.next()) {
                    // Set nilai dari object permintaan
                    permintaan.setId(resultSet.getInt("id")); // id
                    permintaan.setNama(resultSet.getString("namaPelanggan")); // nama
                    permintaan.setAlamat(resultSet.getString("alamatPenjemputan")); // alamat
                    permintaan.setStatus(resultSet.getBoolean("status")); // no_telepon
                }
            } catch (SQLException e) {
                // Print error jika terjadi error
                e.printStackTrace();
            }
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai permintaan
        return permintaan;
    }
}
