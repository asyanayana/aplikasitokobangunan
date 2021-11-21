package menu;

import javax.swing.JOptionPane;
import model.User;
import services.ServiceLogin;

public class FormLogin extends javax.swing.JFrame {

    private final ServiceLogin serviceLogin; // Mendeklarasikan Class ServiceRegister yang di buat di folder services
    private User user; // Mendeklarasikan Class User yang di buat di folder model

    public FormLogin() { // Membuat constructor yang merupakan keunggulan dari java OOP
        initComponents(); // Memanggil Class Java Swing yang telah di buat fungsi sebelumnya
        serviceLogin = new ServiceLogin(); // Memanggil class ServiceRegister dengan membuat variable serviceRegister yang baru
    }

    private void emptyText() { // Fungsi untuk mengosongkan TextFiled
        textUserName.setText(""); // Mengosongkan text text Username
        textPassword.setText(""); // Mengosongkan Password
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textPassword = new javax.swing.JPasswordField();
        buttonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("LOGIN");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);

        textUserName.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);

        textPassword.setBackground(new java.awt.Color(204, 255, 255));

        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textUserName)
                                    .addComponent(textPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))))))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonLogin)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        user = new User(textUserName.getText(), textPassword.getText()); // Memanggil class User dengan membuat variable user yang baru
        String result = serviceLogin.login(user.getUserName(), user.getPassword()); // String result 
        switch (result) { // 
            case "LENGKAPI_DATA":
                JOptionPane.showMessageDialog(null, "LENGKAPI DATA", "PT Riyad Kurniawan", JOptionPane.INFORMATION_MESSAGE); // akan muncul pesan kalau datanya ada yang kosong
                break;
            case "PASSWORD_BEDA":
                JOptionPane.showMessageDialog(null, "PASSWORD BEDA", "PT Riyad Kurniawan", JOptionPane.INFORMATION_MESSAGE); // akan muncul pesan kalau passwordnya beda
                break;
            case "USERNAME_SAMA":
                JOptionPane.showMessageDialog(null, "USERNAME ADA YANG SAMA", "PT Riyad Kurniawan", JOptionPane.INFORMATION_MESSAGE); // akan muncul pesan kalau userNamenya sudah ada
                break;
            case "BERHASIL":
                JOptionPane.showMessageDialog(null, "BERHASIL", "PT Riyad Kurniawan", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, result);
                break;
        }
        FormLandingPage formLandingPage = new FormLandingPage();
        formLandingPage.setVisible(true);
        JOptionPane.showMessageDialog(null, "Username atau Password yang anda masukkan SALAH!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        emptyText();
    }//GEN-LAST:event_buttonLoginActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUserName;
    // End of variables declaration//GEN-END:variables
}
