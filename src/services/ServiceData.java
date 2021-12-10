package services;

import connection.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

public class ServiceData {

    private final Connection connection; // Mendeklarasikan Class Connection bawaan java untuk keperluan query
    private ResultSet resultSet; // Mendeklarasikan Class ResultSet bawaan java untuk keperluan query
    private PreparedStatement preparedStatement; // Mendeklarasikan Class PreparedStatement bawaan java untuk keperluan query
    private String sql; // Mendeklarasikan Class String Untuk Keperluan Query

    public ServiceData() { // Membuat constructor yang merupakan keunggulan dari java OOP
        connection = Conn.getConnection(); // Memanggil class connection
    }

    public String checkDatas(String[] dbDatas) {
        for (String dbData : dbDatas) {
            if (dbDatas[0].isEmpty()) {
                break;
            } else if (dbData.isEmpty()) { // fungsi untuk agar data tidak boleh kosong
                return "LENGKAPI_DATA";
            }
        }
        return "LENGKAP";
    }

    public String saveDatas(String dbTableName, String[] dbDatas) {
        try {
            sql = "INSERT INTO " + dbTableName + " VALUES (" + sumSaveDb(dbDatas) + ")";
            preparedStatement = connection.prepareStatement(sql);
            Integer i = 1;
            dbDatas[0] = null;
            for (String dbData : dbDatas) {
                preparedStatement.setString(i, dbData);
                i++;
            }
            preparedStatement.executeUpdate();
            preparedStatement.close();
            return "BERHASIL";
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String deleteDatas(String dbTableName, String id) {
        try {
            sql = "DELETE FROM " + dbTableName + " WHERE id = '" + id + "'";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            return "BERHASIL";
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String editDatas(String dbTableName, String[] dbTableDatas, String[] dbDatas) {

        try {
            sql = "UPDATE " + dbTableName + " SET " + sumEditDb(dbTableDatas) + " WHERE id = '" + dbDatas[0] + "'";
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 1; i < dbDatas.length; i++) {
                preparedStatement.setString(i, dbDatas[i]);
            }
            preparedStatement.executeUpdate();
            preparedStatement.close();
            return "BERHASIL";
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public void showCombo(JComboBox<String> comboBox, String dbTableName, String id, String relationTable) {
        try {
            sql = "SELECT * FROM " + dbTableName + " ORDER by " + id + "";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery(sql);
            while (resultSet.next()) {
                comboBox.addItem(resultSet.getString(id) + " - " + resultSet.getString(relationTable));
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public String sumSaveDb(String[] dbDatas) {
        String result = "?";
        for (int i = 1; i < dbDatas.length; i++) {
            result = result.concat(", ?");
        }

        return result;
    }

    public String sumEditDb(String[] dbDatas) {
        String result = "";
        for (int i = 1; i < dbDatas.length; i++) {
            if (i < dbDatas.length - 1) {
                result = result.concat(dbDatas[i].concat(" = ?, "));
            } else {
                result = result.concat(dbDatas[i].concat(" = ? "));
            }
        }
        return result;
    }

    public String transaction(String dbTableName, String[] dbTableDatas, String[] dbDatas) {
        try {
            sql = "INSERT INTO " + dbTableName + " VALUES (" + sumSaveDb(dbDatas) + ")";
            preparedStatement = connection.prepareStatement(sql);
            Integer i = 1;
            dbDatas[0] = null;
            for (String dbData : dbDatas) {
                preparedStatement.setString(i, dbData);
                i++;
            }
            preparedStatement.executeUpdate();
            preparedStatement.close();
            return "BERHASIL";
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
}
