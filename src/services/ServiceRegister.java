package services;

import connection.Conn; // Memanggil Class Conn yang ada di folder connection
import java.sql.Connection; // Memanggil class SQL Connection
import java.sql.PreparedStatement; // Memanggil Class PreparedStatement
import java.sql.ResultSet; // Memanggil Class ResultSet
import java.sql.SQLException; // Memanggil Class SQLException
import javax.swing.JOptionPane; // Memanggil Class JOptionPane

public class ServiceRegister {

    private final Connection connection; // Mendeklarasikan Class Connection bawaan java untuk keperluan query
    private ResultSet resultSet; // Mendeklarasikan Class ResultSet bawaan java untuk keperluan query
    private PreparedStatement preparedStatement; // Mendeklarasikan Class PreparedStatement bawaan java untuk keperluan query
    private String sql; // Mendeklarasikan Class String Untuk Keperluan Query

    public ServiceRegister() { // Membuat constructor yang merupakan keunggulan dari java OOP
        connection = Conn.getConnection(); // Memanggil class connection
    }

    public boolean checkExistRegister(String userName) {
        boolean usernameCheck; // boolean usernameCheck di gunakan untuk nilai kembali ketika ada username yang sama
        try {
            sql = "SELECT * FROM user"; // Masih sekedar Statment
            preparedStatement = connection.prepareStatement(sql); // Pemanggilan SQL
            resultSet = preparedStatement.executeQuery(sql); // Eksekusi SQL
            while (resultSet.next()) { // Lopping
                if (resultSet.getString(1).equals(userName)) { // Ketika ada id yang sama bakalan di tolak
                    usernameCheck = false;
                    return usernameCheck; // ketika idnya sama booleannya bakalan bernilai false
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        usernameCheck = true;
        return usernameCheck;
    }

    public String saveRegister(String userName, String name, String password, String confirmPassword) {

        if (userName.isEmpty() || name.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) { // fungsi untuk agar data tidak boleh kosong
            return "LENGKAPI_DATA";
//            JOptionPane.showMessageDialog(null, "LENGKAPI DATA", "PT Riyad Kurniawan", JOptionPane.INFORMATION_MESSAGE); // akan muncul pesan kalau datanya ada yang kosong
        } else { // Ketiika datanya lengkap statment di bawah bakalan di panggil
            if (!password.equals(confirmPassword)) { // Ketika Passwordnya tidak sama
                return "PASSWORD_BEDA";
//                JOptionPane.showMessageDialog(null, "PASSWORD BEDA", "PT Riyad Kurniawan", JOptionPane.INFORMATION_MESSAGE); // akan muncul pesan kalau passwordnya beda
            } else if (checkExistRegister(userName) == false) { // Ketika Usernamenya ada yang sama
                return "USERNAME_SAMA";
//                JOptionPane.showMessageDialog(null, "USERNAME ADA YANG SAMA", "PT Riyad Kurniawan", JOptionPane.INFORMATION_MESSAGE); // akan muncul pesan kalau userNamenya sudah ada
            } else { // ketika tidak terjadi masalah pada penyimpanan maka fungsi di bawah akan di jalankan
                try {
                    sql = "INSERT INTO user VALUES (?, ?, ?)"; // Statment
                    preparedStatement = connection.prepareStatement(sql); // pemanggilan SQL
                    preparedStatement.setString(1, userName); // pemanggilan SQL yang pertama
                    preparedStatement.setString(2, name);
                    preparedStatement.setString(3, password);
                    preparedStatement.executeUpdate(); // Eksekusi
                    preparedStatement.close();
                    return "BERHASIL";
//                    JOptionPane.showMessageDialog(null, "BERHASIL", "PT Riyad Kurniawan", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException e) {
//                    JOptionPane.showMessageDialog(null, e);
                    return e.getMessage();
                }
            }
        }
    }
}
