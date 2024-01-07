package id.ac.unpas.techIn.dao;

import id.ac.unpas.techIn.db.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import id.ac.unpas.techIn.lacak.Lacak;

// JenisMemberDao adalah class yang digunakan untuk mengakses data jenis member dari database
public class LacakDao {
    // insert digunakan untuk menyimpan data jenis member ke database
    public int insert(Lacak lacak) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi
        // query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement(
                    "Insert into lacak(id, namaPelanggan, namaKurir, alamatPenjemputan, alamatTujuan, status, idPenjemputan, idKurir) values (?, ?, ?, ?, ?, ?, ?, ?)");

            System.out.println(lacak.getIdKurir() + " " + lacak.getIdPenjemputan());

            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari
            // parameter jenisMember
            statement.setInt(1, 0);
            statement.setString(2, lacak.getNamaPelanggan());
            statement.setString(3, lacak.getNamaKurir());
            statement.setString(4, lacak.getAlamatPenjemputan());
            statement.setString(5, lacak.getAlamatTujuan());
            statement.setBoolean(6, lacak.getStatus());
            statement.setInt(7, lacak.getIdPenjemputan());
            statement.setInt(8, lacak.getIdKurir());

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

    // update digunakan untuk mengubah data jenis member di database
    public int update(Lacak lacak) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi
        // query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement(
                    "update lacak set namaPelanggan = ?, namaKurir = ?, alamatPenjemputan = ?, alamatTujuan = ?, status = ? where idPenjemputan = ?");

            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari
            // parameter jenisMember
            statement.setString(1, lacak.getNamaPelanggan());
            statement.setString(2, lacak.getNamaKurir());
            statement.setString(3, lacak.getAlamatPenjemputan());
            statement.setString(4, lacak.getAlamatTujuan());
            statement.setBoolean(5, lacak.getStatus());
            statement.setInt(6, lacak.getIdPenjemputan());

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

    // delete digunakan untuk menghapus data jenis member di database
    public int delete(int id) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi
        // query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement("delete from lacak where id = ?");

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
    public List<Lacak> findAll() {
        // list adalah variabel yang digunakan untuk menyimpan semua data jenis member
        List<Lacak> list = new ArrayList<>();

        // try with resources digunakan untuk mengambil koneksi dari database dan
        // membuat statement untuk mengeksekusi query
        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {

            // ResultSet digunakan untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement.executeQuery("select * from lacak order by id desc");) {

                // while digunakan untuk mengambil semua data jenis member dari ResultSet
                while (resultSet.next()) {
                    // Instansiasi JenisMember dengan nama jenisMember
                    Lacak lacak = new Lacak();

                    // jenisMember.setId digunakan untuk mengubah nilai dari variabel id dengan
                    // nilai dari ResultSet berdasarkan kolom id
                    lacak.setId(resultSet.getInt("id"));
                    // jenisMember.setNama digunakan untuk mengubah nilai dari variabel nama dengan
                    // nilai dari ResultSet berdasarkan kolom nama
                    lacak.setNamaPelanggan(resultSet.getString("namaPelanggan"));
                    lacak.setNamaKurir(resultSet.getString("namaKurir"));
                    lacak.setAlamatPenjemputan(resultSet.getString("alamatPenjemputan"));
                    lacak.setAlamatTujuan(resultSet.getString("alamatTujuan"));
                    lacak.setStatus(resultSet.getBoolean("status"));

                    // list.add digunakan untuk menambahkan data jenis member ke list
                    list.add(lacak);
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

    public Lacak select(String column, String value) {
        // Membuat object lacak untuk menyimpan data
        Lacak lacak = new Lacak();

        // Try with resources untuk membuat koneksi ke database
        try (
                // Membuat koneksi ke database
                Connection connection = MySqlConnection.getInstance().getConnection();
                // Statement untuk mengirim query ke database
                Statement statement = connection.createStatement();) {
            // Membuat ResultSet untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement
                    .executeQuery("select * from lacak where " + column + " = '" + value + "'");) {
                // Looping untuk mengambil semua data dari database
                while (resultSet.next()) {
                    // Set nilai dari object lacak
                    lacak.setId(resultSet.getInt("id")); // id
                    lacak.setNamaPelanggan(resultSet.getString("namaPelanggan")); // nama
                    lacak.setNamaKurir(resultSet.getString("namaKurir")); // nama
                    lacak.setAlamatPenjemputan(resultSet.getString("alamatPenjemputan")); // alamat
                    lacak.setAlamatTujuan(resultSet.getString("alamatTujuan")); // alamat
                    lacak.setStatus(resultSet.getBoolean("status")); // no_telepon
                }
            } catch (SQLException e) {
                // Print error jika terjadi error
                e.printStackTrace();
            }
        } catch (SQLException e) {
            // Print error jika terjadi error
            e.printStackTrace();
        }

        // Kembalikan nilai lacak
        return lacak;
    }
}
