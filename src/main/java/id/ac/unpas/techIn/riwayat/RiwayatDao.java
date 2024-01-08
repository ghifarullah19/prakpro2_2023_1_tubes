package id.ac.unpas.techIn.dao;

import id.ac.unpas.techIn.db.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import id.ac.unpas.techIn.riwayat.Riwayat;

// JenisMemberDao adalah class yang digunakan untuk mengakses data jenis member dari database
public class RiwayatDao {

    public RiwayatDao() {
    }
    // insert digunakan untuk menyimpan data jenis member ke database
    public int insert(Riwayat riwayat) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement("Insert into detail(id, namaPelanggan, namaKurir, alamatPenjemputan, noKendaraan, beratSampah, jumlahSampah, hargaSampah, poinSampah, idPermintaan, idPelanggan) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )");

            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari parameter jenisMember
            statement.setInt(1, 0);
            statement.setString(2, riwayat.getNamaPelanggan());
            statement.setString(3, riwayat.getNamaKurir());
            statement.setString(4, riwayat.getAlamatPenjemputan());
            statement.setString(5, riwayat.getNoKendaraan());
            statement.setFloat(6, riwayat.getBeratSampah());
            statement.setInt(7, riwayat.getJumlahSampah());
            statement.setFloat(8, riwayat.getHargaSampah());
            statement.setInt(9, riwayat.getPoinSampah());
            statement.setInt(10, riwayat.getIdPermintaan());
            statement.setInt(11, riwayat.getIdPelanggan());

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
    public int update(Riwayat riwayat) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement("update detail set namaPelanggan = ?, namaKurir = ?, alamatPenjemputan = ?, noKendaraan = ?, beratSampah = ?, jumlahSampah = ?, hargaSampah = ?, poinSampah = ? where id = ?");

            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari parameter jenisMember
            statement.setString(1, riwayat.getNamaPelanggan());
            statement.setString(2, riwayat.getNamaKurir());
            statement.setString(3, riwayat.getAlamatPenjemputan());
            statement.setString(4, riwayat.getNoKendaraan());
            statement.setFloat(5, riwayat.getBeratSampah());
            statement.setInt(6, riwayat.getJumlahSampah());
            statement.setFloat(7, riwayat.getHargaSampah());
            statement.setInt(8, riwayat.getPoinSampah());
            statement.setInt(9, riwayat.getId());

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
    public int delete(Riwayat riwayat) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement("delete from detail where id = ?");

            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari parameter jenisMember
            statement.setInt(1, riwayat.getId());

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
    public List<Riwayat> findAll() {
        // list adalah variabel yang digunakan untuk menyimpan semua data jenis member
        List<Riwayat> list = new ArrayList<>();

        // try with resources digunakan untuk mengambil koneksi dari database dan membuat statement untuk mengeksekusi query
        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();
            ) {

            // ResultSet digunakan untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement.executeQuery("select * from detail");) {
                
                // while digunakan untuk mengambil semua data jenis member dari ResultSet
                while(resultSet.next()) {
                    // Instansiasi JenisMember dengan nama jenisMember
                    Riwayat riwayat = new Riwayat();

                    // jenisMember.setId digunakan untuk mengubah nilai dari variabel id dengan nilai dari ResultSet berdasarkan kolom id
                    riwayat.setId(resultSet.getInt("id"));
                    riwayat.setNamaPelanggan(resultSet.getString("namaPelanggan"));
                    riwayat.setNamaKurir(resultSet.getString("namaKurir"));
                    riwayat.setAlamatPenjemputan(resultSet.getString("alamatPenjemputan"));
                    riwayat.setNoKendaraan(resultSet.getString("noKendaraan"));
                    riwayat.setBeratSampah(resultSet.getFloat("beratSampah"));
                    riwayat.setJumlahSampah(resultSet.getInt("jumlahSampah"));
                    riwayat.setHargaSampah(resultSet.getFloat("hargaSampah"));
                    riwayat.setPoinSampah(resultSet.getInt("poinSampah"));
                    riwayat.setIdPermintaan(resultSet.getInt("idPermintaan"));
                    riwayat.setIdPelanggan(resultSet.getInt("idPelanggan"));

                    // list.add digunakan untuk menambahkan data jenis member ke list
                    list.add(riwayat);
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
    
    public Riwayat select(String column, String value) {
        Riwayat riwayat = new Riwayat();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {
            try (ResultSet resultSet = statement
                    .executeQuery("select * from detail where " + column + " = '" + value + "'");) {
                while (resultSet.next()) {
                    riwayat.setNamaPelanggan(resultSet.getString("namaPelanggan"));
                    riwayat.setNamaKurir(resultSet.getString("namaKurir"));
                    riwayat.setAlamatPenjemputan(resultSet.getString("alamatPenjemputan"));
                    riwayat.setNoKendaraan(resultSet.getString("noKendaraan"));
                    riwayat.setBeratSampah(resultSet.getFloat("beratSampah"));
                    riwayat.setJumlahSampah(resultSet.getInt("jumlahSampah"));
                    riwayat.setHargaSampah(resultSet.getFloat("hargaSampah"));
                    riwayat.setPoinSampah(resultSet.getInt("poinSampah"));
                    riwayat.setIdPermintaan(resultSet.getInt("idPermintaan"));
                    riwayat.setIdPelanggan(resultSet.getInt("idPelanggan"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return riwayat;
    }
}
