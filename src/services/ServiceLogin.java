package services;

import connection.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import menu.FormHalamanUtama;
import menu.FormLogin;

public class ServiceLogin {

    private final Connection connection; // Mendeklarasikan Class Connection bawaan java untuk keperluan query
    private ResultSet resultSet; // Mendeklarasikan Class ResultSet bawaan java untuk keperluan query
    private PreparedStatement preparedStatement; // Mendeklarasikan Class PreparedStatement bawaan java untuk keperluan query
    private String sql; // Mendeklarasikan Class String Untuk Keperluan Query

    public ServiceLogin() { // Membuat constructor yang merupakan keunggulan dari java OOP
        connection = Conn.getConnection(); // Memanggil class connection
    }

    public String login(FormLogin formLogin, String userName, String password) {
        if (userName.isEmpty() || password.isEmpty()) { // fungsi untuk agar data tidak boleh kosong
            return "LENGKAPI_DATA";
        } else {
            try {
                sql = "SELECT * FROM users WHERE username = ? AND password = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, userName);
                preparedStatement.setString(2, password);
                resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    formLogin.setButtonEnable(resultSet.getString("sebagai"));
                    return "BERHASIL";
                } else {
                    return "SALAH";
                }
            } catch (SQLException e) {
                return e.getMessage();
            }
        }
    }
}
