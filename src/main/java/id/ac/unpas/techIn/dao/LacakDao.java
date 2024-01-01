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
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement("Insert into lacak(idLacak, namaPelanggan, namaKurir, alamatPenjemputan, alamatTujuan) values (?, ?, ?, ?, ?)");

            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari parameter jenisMember
            statement.setInt(1, 0);
            statement.setString(2, lacak.getNamaPelanggan());
            statement.setString(3, lacak.getNamaKurir());
            statement.setString(4, lacak.getAlamatPenjemputan());
            statement.setString(5, lacak.getAlamatTujuan());

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
    public int update(Lacak lacak) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement("update lacak set namaKurir = ? where id = ?");

            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari parameter jenisMember
            statement.setString(1, lacak.getNamaKurir());
            statement.setInt(2, lacak.getId());

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
    public int delete(Lacak lacak) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement("delete from lacak where id = ?");

            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari parameter jenisMember
            statement.setInt(1, lacak.getId());

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
    public List<Lacak> findAll() {
        // list adalah variabel yang digunakan untuk menyimpan semua data jenis member
        List<Lacak> list = new ArrayList<>();

        // try with resources digunakan untuk mengambil koneksi dari database dan membuat statement untuk mengeksekusi query
        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();
            ) {

            // ResultSet digunakan untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement.executeQuery("select * from lacak");) {
                
                // while digunakan untuk mengambil semua data jenis member dari ResultSet
                while(resultSet.next()) {
                    // Instansiasi JenisMember dengan nama jenisMember
                    Lacak lacak = new Lacak();

                    // jenisMember.setId digunakan untuk mengubah nilai dari variabel id dengan nilai dari ResultSet berdasarkan kolom id
                    lacak.setId(resultSet.getInt("id"));
                    // jenisMember.setNama digunakan untuk mengubah nilai dari variabel nama dengan nilai dari ResultSet berdasarkan kolom nama
                    lacak.setNamaPelanggan(resultSet.getString("namaPelanggan"));
                    lacak.setNamaKurir(resultSet.getString("namaKurir"));
                    lacak.setAlamatPenjemputan(resultSet.getString("alamatPenjemputan"));
                    lacak.setAlamatTujuan(resultSet.getString("alamatTujuan"));

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
}
