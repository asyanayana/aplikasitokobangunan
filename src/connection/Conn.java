package connection; // berada pada folder connection

import com.mysql.jdbc.Driver; // Memanggil class SQL Driver
import java.sql.Connection; // Memanggil class SQL Connection
import java.sql.DriverManager; // Memanggil class SQL DriverManager
import java.sql.SQLException; // Memanggil class SQL SQLException
import javax.swing.JOptionPane; // Memanggil class JOptionPane

public class Conn {

    private static Connection connection; // Mendeklarasikan Class Connection bawaan java untuk keperluan query

    public static Connection getConnection() { // Membuat getter dari connection

        try { // try di gunakan setiap fungsi yang berhubungan dengan sql
            String url = "jdbc:mysql://localhost/aplikasibangunan"; // url dari sql yang ada di xampp
            String user = "root"; // user dari sql
            String password = ""; // password dari sql

            DriverManager.registerDriver(new Driver()); // Membuat driver dari sql yang baru

            connection = DriverManager.getConnection(url, user, password); // menghubungkan driver dengan deklarasi sql yang telah di buat sebelumnya
            
        } catch (SQLException exception) { // jika ada masalah pada try maka akan di eksekusi di catch
            JOptionPane.showMessageDialog(null, "Gagal memanggil Connection", "PT Riyad Kurniawan", JOptionPane.INFORMATION_MESSAGE); // Pesan dari catch
        }
        
        return connection; // mengembalikan nilai connection yang nantinya akan di panggil
    }
}
