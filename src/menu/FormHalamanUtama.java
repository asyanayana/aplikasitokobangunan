package menu;

public class FormHalamanUtama extends javax.swing.JFrame {

    private String buttonEnable;

    public String getButtonEnable() {
        return buttonEnable;
    }

    public void setButtonEnable(String buttonEnable) {
        this.buttonEnable = buttonEnable;
    }

    @SuppressWarnings("fallthrough")
    public FormHalamanUtama(String buttonEnable) {
        initComponents();
        switch (buttonEnable) {
            case "Admin":
                buttonBarangMasuk.setEnabled(true);
                buttonJenis.setEnabled(true);
                buttonLaporan.setEnabled(true);
                buttonMerek.setEnabled(true);
                buttonSupplier.setEnabled(true);
                buttonTransaksi.setEnabled(true);
                break;
            case "Gudang":
                buttonBarangMasuk.setEnabled(true);
                buttonJenis.setEnabled(true);
                buttonLaporan.setEnabled(false);
                buttonMerek.setEnabled(true);
                buttonSupplier.setEnabled(true);
                buttonTransaksi.setEnabled(true);
                break;
            case "Owner":
                buttonBarangMasuk.setEnabled(false);
                buttonJenis.setEnabled(false);
                buttonLaporan.setEnabled(true);
                buttonMerek.setEnabled(false);
                buttonSupplier.setEnabled(false);
                buttonTransaksi.setEnabled(false);
                break;
            default:
                buttonBarangMasuk.setEnabled(false);
                buttonJenis.setEnabled(false);
                buttonLaporan.setEnabled(false);
                buttonMerek.setEnabled(false);
                buttonSupplier.setEnabled(false);
                buttonTransaksi.setEnabled(false);
                break;
        }

        this.buttonEnable = buttonEnable;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonSupplier = new javax.swing.JButton();
        buttonMerek = new javax.swing.JButton();
        buttonJenis = new javax.swing.JButton();
        buttonBarangMasuk = new javax.swing.JButton();
        buttonTransaksi = new javax.swing.JButton();
        buttonLaporan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        userName = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

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

        buttonMerek.setBackground(new java.awt.Color(102, 255, 0));
        buttonMerek.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonMerek.setText("Merek");
        buttonMerek.setToolTipText("");
        buttonMerek.setBorderPainted(false);
        buttonMerek.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        buttonMerek.setFocusPainted(false);
        buttonMerek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMerekActionPerformed(evt);
            }
        });
        jPanel2.add(buttonMerek);

        buttonJenis.setBackground(new java.awt.Color(51, 255, 51));
        buttonJenis.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonJenis.setForeground(new java.awt.Color(255, 0, 0));
        buttonJenis.setText("Jenis");
        buttonJenis.setBorderPainted(false);
        buttonJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJenisActionPerformed(evt);
            }
        });
        jPanel2.add(buttonJenis);

        buttonBarangMasuk.setBackground(new java.awt.Color(0, 204, 204));
        buttonBarangMasuk.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        buttonBarangMasuk.setText("Barang Masuk");
        buttonBarangMasuk.setToolTipText("");
        buttonBarangMasuk.setBorderPainted(false);
        buttonBarangMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBarangMasukActionPerformed(evt);
            }
        });
        jPanel2.add(buttonBarangMasuk);

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
                .addGap(244, 244, 244)
                .addComponent(jLabel4)
                .addContainerGap(422, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, 990));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/4.2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1637, 630));

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 255));

        userName.setBackground(new java.awt.Color(153, 153, 255));
        userName.setText("Username");

        jMenuItem1.setText("Log Out");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        userName.add(jMenuItem1);

        jMenuBar1.add(userName);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMerekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMerekActionPerformed
        FormMerek formMerek = new FormMerek(getButtonEnable());
        formMerek.setVisible(true);
        formMerek.userName.setText(userName.getText());
        this.setVisible(false);
    }//GEN-LAST:event_buttonMerekActionPerformed

    private void buttonSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSupplierActionPerformed
        FormSupplier formSupplier = new FormSupplier(getButtonEnable());
        formSupplier.setVisible(true);
        formSupplier.userName.setText(userName.getText());
        this.setVisible(false);
    }//GEN-LAST:event_buttonSupplierActionPerformed

    private void buttonBarangMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBarangMasukActionPerformed
        FormBarangMasuk formBarangMasuk = new FormBarangMasuk(getButtonEnable());
        formBarangMasuk.setVisible(true);
        formBarangMasuk.userName.setText(userName.getText());
        this.setVisible(false);
    }//GEN-LAST:event_buttonBarangMasukActionPerformed

    private void buttonTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransaksiActionPerformed
        FormTransaksi formTransaksi = new FormTransaksi(getButtonEnable());
        formTransaksi.setVisible(true);
        formTransaksi.userName.setText(userName.getText());
        this.setVisible(false);
    }//GEN-LAST:event_buttonTransaksiActionPerformed

    private void buttonLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLaporanActionPerformed
        FormLaporan formLaporan = new FormLaporan(getButtonEnable());
        formLaporan.setVisible(true);
        formLaporan.userName.setText(userName.getText());
        this.setVisible(false);
    }//GEN-LAST:event_buttonLaporanActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormLandingPage formLandingPage = new FormLandingPage();
        formLandingPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void buttonJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJenisActionPerformed
        FormJenis formJenis = new FormJenis(getButtonEnable());
        formJenis.setVisible(true);
        formJenis.userName.setText(userName.getText());
        this.setVisible(false);
    }//GEN-LAST:event_buttonJenisActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormHalamanUtama().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBarangMasuk;
    private javax.swing.JButton buttonJenis;
    private javax.swing.JButton buttonLaporan;
    private javax.swing.JButton buttonMerek;
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
    public javax.swing.JMenu userName;
    // End of variables declaration//GEN-END:variables
}
