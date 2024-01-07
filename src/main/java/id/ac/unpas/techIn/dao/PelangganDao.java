package id.ac.unpas.techIn.dao;

import id.ac.unpas.techIn.db.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import id.ac.unpas.techIn.pelanggan.Pelanggan;

public class PelangganDao {
    public int insert(Pelanggan pelanggan) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "Insert into pelanggan(idPelanggan, namaPelanggan, alamatPelanggan) values (?, ?, ?)");

            statement.setInt(1, 0);
            statement.setString(2, pelanggan.getNama());
            statement.setString(3, pelanggan.getAlamat());

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public int update(Pelanggan pelanggan) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("update pelanggan set namaPelanggan = ? where idPelanggan = ?");

            statement.setString(1, pelanggan.getNama());
            statement.setInt(2, pelanggan.getId());

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public int delete(Pelanggan pelanggan) {
        int result = -1;
        PermintaanDao permintaanDao = new PermintaanDao();
        PenjemputanDao penjemputanDao = new PenjemputanDao();
        LacakDao lacakDao = new LacakDao();
        int idPermintaan = permintaanDao.select("namaPelanggan", pelanggan.getNama()).getId();
        int idPenjemputan = penjemputanDao.select("idPermintaan", String.valueOf(idPermintaan)).getId();
        
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("delete from pelanggan where idPelanggan = ?");

            statement.setInt(1, permintaanDao.select("namaPelanggan", pelanggan.getNama()).getIdPelanggan());
            
            lacakDao.delete(lacakDao.select("idPenjemputan", String.valueOf(idPenjemputan)).getIdPenjemputan());
            
            penjemputanDao.updateBasedDelete(penjemputanDao.select("idPermintaan", String.valueOf(idPermintaan)));
            
            permintaanDao.delete(permintaanDao.select("namaPelanggan", pelanggan.getNama()));

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<Pelanggan> findAll() {
        List<Pelanggan> list = new ArrayList<>();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {

            try (ResultSet resultSet = statement.executeQuery("select * from pelanggan");) {

                while (resultSet.next()) {
                    Pelanggan pelanggan = new Pelanggan();

                    pelanggan.setId(resultSet.getInt("idPelanggan"));
                    pelanggan.setNama(resultSet.getString("namaPelanggan"));
                    pelanggan.setAlamat(resultSet.getString("alamatPelanggan"));

                    list.add(pelanggan);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public Pelanggan select(String column, String value) {
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

        return pelanggan;
    }
}
