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
import id.ac.unpas.techIn.kurir.Kurir;

public class KurirDao {
    public int insert(Kurir kurir) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("Insert into kurir(idKurir, namaKurir, noKendaraan) values (?, ?, ?)");

            statement.setInt(1, 0);
            statement.setString(2, kurir.getNama());
            statement.setString(3, kurir.getNoKendaraan());

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
    
    public int update(Kurir kurir) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("update kurir set nama = ? where id = ?");

            statement.setString(1, kurir.getNama());
            statement.setInt(2, kurir.getId());

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
    
    public int delete(Kurir kurir) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("delete from kurir where idKurir = ?");

            statement.setInt(1, kurir.getId());
            
            LacakDao lacakDao = new LacakDao();
            lacakDao.delete(lacakDao.select("idKurir", String.valueOf(kurir.getId())).getId());
            
            PenjemputanDao penjemputanDao = new PenjemputanDao();
            penjemputanDao.deleteBasedKurir(penjemputanDao.select("idKurir", String.valueOf(kurir.getId())).getId());
            
            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<Kurir> findAll() {
        List<Kurir> list = new ArrayList<>();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();
            ) {

            try (ResultSet resultSet = statement.executeQuery("select * from kurir");) {
                
                while(resultSet.next()) {
                    Kurir kurir = new Kurir();

                    kurir.setId(resultSet.getInt("idKurir"));
                    kurir.setNama(resultSet.getString("namaKurir"));
                    kurir.setNoKendaraan(resultSet.getString("noKendaraan"));
                    
                    list.add(kurir);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
    
    public Kurir select(String column, String value) {
        Kurir kurir = new Kurir();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();
            ) {
            try (ResultSet resultSet = statement.executeQuery("select * from kurir where " + column+ " = '" + value + "'");) {
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
}
