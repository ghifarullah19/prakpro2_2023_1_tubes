package id.ac.unpas.techIn.dao;

import id.ac.unpas.techIn.db.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import id.ac.unpas.techIn.kurir.Kurir;

// JenisMemberDao adalah class yang digunakan untuk mengakses data jenis member dari database
public class KurirDao {
    // insert digunakan untuk menyimpan data jenis member ke database
    public int insert(Kurir kurir) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement("Insert into kurir(idKurir, namaKurir, noKendaraan) values (?, ?, ?)");

            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari parameter jenisMember
            statement.setInt(1, 0);
            statement.setString(2, kurir.getNama());
            statement.setString(3, kurir.getAlamat());

            // result diberikan nilai dari eksekusi query (Berisi jumlah row dari statement berarti berhasil, Berisi 0 berarti gagal)
            result = statement.executeUpdate();
        } catch (SQLException e) {
            // jika terjadi error, maka akan ditampilkan errornya
            e.printStackTrace();
        }

        // mengembalikan nilai result
        return result;
    }
    
    // update digunakan untuk mengubah data jenis member di database
    public int update(Kurir kurir) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement("update kurir set nama = ? where id = ?");

            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari parameter jenisMember
            statement.setString(1, kurir.getNama());
            statement.setInt(2, kurir.getId());

            // result diberikan nilai dari eksekusi query (Berisi jumlah row dari statement berarti berhasil, Berisi 0 berarti gagal)
            result = statement.executeUpdate();
        } catch (SQLException e) {
            // jika terjadi error, maka akan ditampilkan errornya
            e.printStackTrace();
        }

        // mengembalikan nilai result
        return result;
    }
    
    // delete digunakan untuk menghapus data jenis member di database
    public int delete(Kurir kurir) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement("delete from kurir where id = ?");

            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari parameter jenisMember
            statement.setInt(1, kurir.getId());

            // result diberikan nilai dari eksekusi query (Berisi jumlah row dari statement berarti berhasil, Berisi 0 berarti gagal)
            result = statement.executeUpdate();
        } catch (SQLException e) {
            // jika terjadi error, maka akan ditampilkan errornya
            e.printStackTrace();
        }

        // mengembalikan nilai result
        return result;
    }
    
    // findAll digunakan untuk mengambil semua data jenis member di database
    public List<Kurir> findAll() {
        // list adalah variabel yang digunakan untuk menyimpan semua data jenis member
        List<Kurir> list = new ArrayList<>();

        // try with resources digunakan untuk mengambil koneksi dari database dan membuat statement untuk mengeksekusi query
        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();
            ) {

            // ResultSet digunakan untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement.executeQuery("select * from kurir");) {
                
                // while digunakan untuk mengambil semua data jenis member dari ResultSet
                while(resultSet.next()) {
                    // Instansiasi JenisMember dengan nama jenisMember
                    Kurir kurir = new Kurir();

                    // jenisMember.setId digunakan untuk mengubah nilai dari variabel id dengan nilai dari ResultSet berdasarkan kolom id
                    kurir.setId(resultSet.getInt("idKurir"));
                    // jenisMember.setNama digunakan untuk mengubah nilai dari variabel nama dengan nilai dari ResultSet berdasarkan kolom nama
                    kurir.setNama(resultSet.getString("namaKurir"));
                    kurir.setAlamat(resultSet.getString("noKendaraan"));

                    // list.add digunakan untuk menambahkan data jenis member ke list
                    list.add(kurir);
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
}
