/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu;

/**
 *
 * @author asus rog g512li
 */
public class FormHalamanUtama extends javax.swing.JFrame {

    /**
     * Creates new form HalamanUtama
     */
    public FormHalamanUtama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonBarang = new javax.swing.JButton();
        buttonSupplier = new javax.swing.JButton();
        buttonBarangMasuk = new javax.swing.JButton();
        buttonBarangKeluar = new javax.swing.JButton();
        buttonTransaksi = new javax.swing.JButton();
        buttonLaporan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        name = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 635));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jPanel2.setLayout(new java.awt.GridLayout());

        buttonBarang.setBackground(new java.awt.Color(102, 255, 0));
        buttonBarang.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBarang.setText("Barang");
        buttonBarang.setToolTipText("");
        buttonBarang.setBorderPainted(false);
        buttonBarang.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        buttonBarang.setFocusPainted(false);
        buttonBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBarangActionPerformed(evt);
            }
        });
        jPanel2.add(buttonBarang);

        buttonSupplier.setBackground(new java.awt.Color(153, 153, 255));
        buttonSupplier.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonSupplier.setText("Supplier");
        buttonSupplier.setBorderPainted(false);
        buttonSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSupplierActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSupplier);

        buttonBarangMasuk.setBackground(new java.awt.Color(51, 255, 51));
        buttonBarangMasuk.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBarangMasuk.setForeground(new java.awt.Color(255, 0, 0));
        buttonBarangMasuk.setText("Barang Masuk");
        buttonBarangMasuk.setBorderPainted(false);
        buttonBarangMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBarangMasukActionPerformed(evt);
            }
        });
        jPanel2.add(buttonBarangMasuk);

        buttonBarangKeluar.setBackground(new java.awt.Color(0, 204, 204));
        buttonBarangKeluar.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        buttonBarangKeluar.setText("Barang Keluar");
        buttonBarangKeluar.setToolTipText("");
        buttonBarangKeluar.setBorderPainted(false);
        buttonBarangKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBarangKeluarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonBarangKeluar);

        buttonTransaksi.setBackground(new java.awt.Color(0, 255, 153));
        buttonTransaksi.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonTransaksi.setForeground(new java.awt.Color(0, 0, 255));
        buttonTransaksi.setText("Transaksi");
        buttonTransaksi.setBorderPainted(false);
        buttonTransaksi.setFocusPainted(false);
        buttonTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTransaksiActionPerformed(evt);
            }
        });
        jPanel2.add(buttonTransaksi);

        buttonLaporan.setBackground(new java.awt.Color(0, 204, 204));
        buttonLaporan.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonLaporan.setForeground(new java.awt.Color(51, 51, 51));
        buttonLaporan.setText("Laporan");
        buttonLaporan.setBorderPainted(false);
        buttonLaporan.setFocusPainted(false);
        buttonLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLaporanActionPerformed(evt);
            }
        });
        jPanel2.add(buttonLaporan);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO TB PERSADA");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Copyright @Tubes PBO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(872, 872, 872)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(97, 97, 97)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(422, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, 990));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/4.2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1637, 630));

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 255));

        name.setBackground(new java.awt.Color(153, 153, 255));
        name.setText("Username");
        name.setOpaque(true);

        jMenuItem1.setText("Log Out");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        name.add(jMenuItem1);

        jMenuBar1.add(name);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBarangActionPerformed
        FormBarang barang = new FormBarang();
        barang.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonBarangActionPerformed

    private void buttonSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSupplierActionPerformed
        FormSupplier supplier = new FormSupplier();
        supplier.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonSupplierActionPerformed

    private void buttonBarangMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBarangMasukActionPerformed
        FormBarangMasuk barangmasuk = new FormBarangMasuk();
        barangmasuk.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonBarangMasukActionPerformed

    private void buttonBarangKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBarangKeluarActionPerformed
        FormBarangKeluar barangkeluar = new FormBarangKeluar();
        barangkeluar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonBarangKeluarActionPerformed

    private void buttonTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransaksiActionPerformed
        FormTransaksi transaksi = new FormTransaksi();
        transaksi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonTransaksiActionPerformed

    private void buttonLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLaporanActionPerformed
        FormLaporan laporan = new FormLaporan();
        laporan.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonLaporanActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormLandingPage landingpage = new FormLandingPage();
        landingpage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormHalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHalamanUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBarang;
    private javax.swing.JButton buttonBarangKeluar;
    private javax.swing.JButton buttonBarangMasuk;
    private javax.swing.JButton buttonLaporan;
    private javax.swing.JButton buttonSupplier;
    private javax.swing.JButton buttonTransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JMenu name;
    // End of variables declaration//GEN-END:variables
}