package services;

import connection.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ServiceLoadData {

    private final Connection connection; // Mendeklarasikan Class Connection bawaan java untuk keperluan query
    private ResultSet resultSet; // Mendeklarasikan Class ResultSet bawaan java untuk keperluan query
    private PreparedStatement preparedStatement; // Mendeklarasikan Class PreparedStatement bawaan java untuk keperluan query
    private String sql; // Mendeklarasikan Class String Untuk Keperluan Query

    public ServiceLoadData() { // Membuat constructor yang merupakan keunggulan dari java OOP
        connection = Conn.getConnection(); // Memanggil class connection
    }

    public void loadDataTable(String dbTableName, String[] dbTableDatas, DefaultTableModel defaultTableModel) {
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();

        try {
            sql = "SELECT * FROM " + dbTableName;
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery(sql);
            while (resultSet.next()) {
                Object[] objects = new Object[dbTableDatas.length];
                Integer i = 0;
                for (String dbTableData : dbTableDatas) {
                    objects[i] = resultSet.getString(dbTableData);
                    i++;
                }
                defaultTableModel.addRow(objects);
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
