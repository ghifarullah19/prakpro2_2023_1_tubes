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

public class LacakDao {
    public int insert(Lacak lacak) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "Insert into lacak(id, namaPelanggan, namaKurir, alamatPenjemputan, alamatTujuan, status, idPenjemputan, idKurir) values (?, ?, ?, ?, ?, ?, ?, ?)");

            statement.setInt(1, 0);
            statement.setString(2, lacak.getNamaPelanggan());
            statement.setString(3, lacak.getNamaKurir());
            statement.setString(4, lacak.getAlamatPenjemputan());
            statement.setString(5, lacak.getAlamatTujuan());
            statement.setBoolean(6, lacak.getStatus());
            statement.setInt(7, lacak.getIdPenjemputan());
            statement.setInt(8, lacak.getIdKurir());

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public int update(Lacak lacak) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "update lacak set namaPelanggan = ?, namaKurir = ?, alamatPenjemputan = ?, alamatTujuan = ?, status = ? where idPenjemputan = ?");

            statement.setString(1, lacak.getNamaPelanggan());
            statement.setString(2, lacak.getNamaKurir());
            statement.setString(3, lacak.getAlamatPenjemputan());
            statement.setString(4, lacak.getAlamatTujuan());
            statement.setBoolean(5, lacak.getStatus());
            statement.setInt(6, lacak.getIdPenjemputan());

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public int delete(int id) {
        int result = -1;

        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("delete from lacak where idPenjemputan = ?");

            statement.setInt(1, id);

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<Lacak> findAll() {
        List<Lacak> list = new ArrayList<>();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {

            try (ResultSet resultSet = statement.executeQuery("select * from lacak order by id desc");) {

                while (resultSet.next()) {
                    Lacak lacak = new Lacak();

                    lacak.setId(resultSet.getInt("id"));
                    lacak.setNamaPelanggan(resultSet.getString("namaPelanggan"));
                    lacak.setNamaKurir(resultSet.getString("namaKurir"));
                    lacak.setAlamatPenjemputan(resultSet.getString("alamatPenjemputan"));
                    lacak.setAlamatTujuan(resultSet.getString("alamatTujuan"));
                    lacak.setStatus(resultSet.getBoolean("status"));

                    list.add(lacak);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public Lacak select(String column, String value) {
        Lacak lacak = new Lacak();

        try (
                Connection connection = MySqlConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();) {
            try (ResultSet resultSet = statement
                    .executeQuery("select * from lacak where " + column + " = '" + value + "'");) {
                while (resultSet.next()) {
                    lacak.setId(resultSet.getInt("id")); // id
                    lacak.setNamaPelanggan(resultSet.getString("namaPelanggan")); // nama
                    lacak.setNamaKurir(resultSet.getString("namaKurir")); // nama
                    lacak.setAlamatPenjemputan(resultSet.getString("alamatPenjemputan")); // alamat
                    lacak.setAlamatTujuan(resultSet.getString("alamatTujuan")); // alamat
                    lacak.setStatus(resultSet.getBoolean("status")); // no_telepon
                    lacak.setIdKurir(resultSet.getInt("idKurir"));
                    lacak.setIdPenjemputan(resultSet.getInt("idPenjemputan"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lacak;
    }
}
