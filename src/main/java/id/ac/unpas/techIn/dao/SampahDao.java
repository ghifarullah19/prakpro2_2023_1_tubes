package id.ac.unpas.techIn.dao;

import id.ac.unpas.techIn.db.MySqlConnection;
import id.ac.unpas.techIn.riwayat.Riwayat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import id.ac.unpas.techIn.sampah.Sampah;

// JenisMemberDao adalah class yang digunakan untuk mengakses data jenis member dari database
public class SampahDao {
    // insert digunakan untuk menyimpan data jenis member ke database
    public int insert(Sampah sampah) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi query berhasil dilakukan atau tidak
        int result = -1;
        
        PermintaanDao permintaan = new PermintaanDao();
        PelangganDao pelanggan = new PelangganDao();
        KurirDao kurir = new KurirDao();
        RiwayatDao detail = new RiwayatDao();
        Riwayat riwayat = new Riwayat();

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement("Insert into sampah(idSampah, namaPelanggan,namaKurir, alamatPenjemputan, noKendaraan, jumlahSampah, jenisSampah, beratSampah, poin, idPelanggan, idKurir) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari parameter jenisMember
            statement.setInt(1, 0);
            statement.setString(2, sampah.getNamaPelanggan());
            statement.setString(3, sampah.getNamaKurir());
            statement.setString(4, sampah.getAlamatPenjemputan());
            statement.setString(5, sampah.getNoKendaraan());
            statement.setInt(6, sampah.getJumlahSampah());
            statement.setString(7, sampah.getJenisSampah());
            statement.setFloat(8, sampah.getBeratSampah());
            statement.setInt(9, sampah.getPoin());
            statement.setInt(10, pelanggan.select("namaPelanggan",
                            sampah.getNamaPelanggan()).getId());
            statement.setInt(11, kurir.select("namaKurir",
                            sampah.getNamaKurir()).getId());
            
            result = statement.executeUpdate();
            
            riwayat.setNamaPelanggan(sampah.getNamaPelanggan());
            riwayat.setNamaKurir(sampah.getNamaKurir());
            riwayat.setBeratSampah(sampah.getBeratSampah());
            riwayat.setJumlahSampah(sampah.getJumlahSampah());
            riwayat.setHargaSampah(sampah.getHargaSampah());
            riwayat.setPoinSampah(sampah.getPoin());
            riwayat.setIdPermintaan(permintaan.select("namaPelanggan", sampah.getNamaPelanggan()).getId());
            riwayat.setIdPelanggan(pelanggan.select("namaPelanggan", sampah.getNamaPelanggan()).getId());
            riwayat.setAlamatPenjemputan(sampah.getAlamatPenjemputan());
            riwayat.setNoKendaraan(sampah.getNoKendaraan());
            riwayat.setIdSampah(this.select("namaPelanggan",sampah.getNamaPelanggan()).getId());

            detail.insert(riwayat);
        } catch (SQLException e) {
            // jika terjadi error, maka akan ditampilkan errornya
            e.printStackTrace();
        }

        // mengembalikan nilai result
        return result;
    }
    
    // update digunakan untuk mengubah data jenis member di database
    public int update(Sampah sampah) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement("update sampah set jumlahSampah = ?, jenisSampah = ?, beratSampah = ?, poin = ? where idSampah = ?");

            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari parameter jenisMember
            statement.setInt(1, sampah.getJumlahSampah());
            statement.setString(2, sampah.getJenisSampah());
            statement.setFloat(3, sampah.getBeratSampah());
            statement.setInt(4, sampah.getPoin());
            statement.setInt(5, this.select("jenisSampah", String.valueOf(sampah.getJenisSampah())).getId());

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
    public int delete(Sampah sampah) {
        // result adalah variabel yang digunakan untuk menyimpan nilai apakah eksekusi query berhasil dilakukan atau tidak
        int result = -1;

        // try with resources digunakan untuk mengambil koneksi dari database
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            // PreparedStatement digunakan untuk menyiapkan query yang akan dijalankan
            PreparedStatement statement = connection.prepareStatement("delete from sampah where idSampah = ?");

            // statement.setString digunakan untuk mengisi parameter query dengan nilai dari parameter jenisMember
            statement.setInt(1, this.select("jumlahSampah", String.valueOf(sampah.getJumlahSampah())).getId());

            // result diberikan nilai dari eksekusi query (Berisi jumlah row dari statement berarti berhasil, Berisi 0 berarti gagal)
            
            RiwayatDao riwayat = new RiwayatDao();
            Riwayat detail = new Riwayat();
            detail.setIdSampah(this.select("jumlahSampah",
                    String.valueOf(sampah.getJumlahSampah())).getId());
            riwayat.delete(detail);
            
            result = statement.executeUpdate();
        } catch (SQLException e) {
            // jika terjadi error, maka akan ditampilkan errornya
            e.printStackTrace();
        }

        // mengembalikan nilai result
        return result;
    }
    
    // findAll digunakan untuk mengambil semua data jenis member di database
    public List<Sampah> findAll() {
        // list adalah variabel yang digunakan untuk menyimpan semua data jenis member
        List<Sampah> list = new ArrayList<>();

        // try with resources digunakan untuk mengambil koneksi dari database dan membuat statement untuk mengeksekusi query
        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();
            ) {

            // ResultSet digunakan untuk menyimpan hasil dari eksekusi query
            try (ResultSet resultSet = statement.executeQuery("select * from sampah");) {
                
                // while digunakan untuk mengambil semua data jenis member dari ResultSet
                while(resultSet.next()) {
                    // Instansiasi JenisMember dengan nama jenisMember
                    Sampah sampah = new Sampah();
                    sampah.setId(resultSet.getInt("idSampah"));
                    sampah.setBeratSampah(resultSet.getFloat("beratSampah"));
                    sampah.setJumlahSampah(resultSet.getInt("jumlahSampah"));
                    sampah.setJenisSampah(resultSet.getString("jenisSampah"));
                    sampah.setPoin(resultSet.getInt("poin"));

                    // list.add digunakan untuk menambahkan data jenis member ke list
                    list.add(sampah);
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
    
    public Sampah select(String column, String value) {
        Sampah sampah = new Sampah();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {
            try (ResultSet resultSet = statement
                    .executeQuery("select * from sampah where " + column + " = '" + value + "'");) {
                while (resultSet.next()) {
                    sampah.setId(resultSet.getInt("idSampah"));
                    sampah.setBeratSampah(resultSet.getFloat("beratSampah"));
                    sampah.setJumlahSampah(resultSet.getInt("jumlahSampah"));
                    sampah.setJenisSampah(resultSet.getString("jenisSampah"));
                    sampah.setPoin(resultSet.getInt("poin"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sampah;
    }
}
