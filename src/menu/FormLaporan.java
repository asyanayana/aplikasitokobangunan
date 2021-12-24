package menu;

import javax.swing.table.DefaultTableModel;
import services.ServiceLoadData;

public class FormLaporan extends javax.swing.JFrame {

    private ServiceLoadData serviceLoadData; // Mendeklarasikan Class ServiceRegister yang di buat di folder services
    private DefaultTableModel tableSupplier, tableMerek, tableJenis, tableBarang, tableTransaksi;
    private String dbTableNameSupplier, dbTableNameMerek, dbTableNameJenis, dbTableNameBarang, dbTableNameTransaksi;
    private String[] dbTableDatasSupplier, dbTableDatasMerek, dbTableDatasJenis, dbTableDatasBarang, dbTableDatasTransaksi;
    private String buttonEnable;

    public String getButtonEnable() {
        return buttonEnable;
    }

    public void setButtonEnable(String buttonEnable) {
        this.buttonEnable = buttonEnable;
    }

    public FormLaporan(String buttonEnable) {
        initComponents();
        cPilihan.addItem("Supplier");
        cPilihan.addItem("Merek");
        cPilihan.addItem("Jenis");
        cPilihan.addItem("Barang");
        cPilihan.addItem("Transaksi");
        this.buttonEnable = buttonEnable;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUtama = new javax.swing.JPanel();
        panelJudul = new javax.swing.JPanel();
        jJudul = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();
        panelJenis = new javax.swing.JPanel();
        cPilihan = new javax.swing.JComboBox<>();
        panelTombol = new javax.swing.JPanel();
        buttonLaporan = new javax.swing.JButton();
        buttonKembali = new javax.swing.JButton();
        panelTabel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInput = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        userName = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelUtama.setBackground(new java.awt.Color(0, 51, 51));
        panelUtama.setPreferredSize(new java.awt.Dimension(953, 476));

        panelJudul.setBackground(new java.awt.Color(102, 102, 255));
        panelJudul.setForeground(new java.awt.Color(0, 0, 255));

        jJudul.setBackground(new java.awt.Color(0, 0, 0));
        jJudul.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jJudul.setForeground(new java.awt.Color(0, 0, 0));
        jJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jJudul.setText("FORM LAPORAN");
        panelJudul.add(jJudul);

        panelForm.setLayout(new java.awt.GridLayout(0, 1));

        panelJenis.setLayout(new java.awt.GridLayout(1, 0));

        panelJenis.add(cPilihan);

        panelForm.add(panelJenis);

        panelTombol.setMinimumSize(new java.awt.Dimension(200, 24));
        panelTombol.setLayout(new java.awt.GridLayout(1, 0));

        buttonLaporan.setText("LAPORAN");
        buttonLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLaporanActionPerformed(evt);
            }
        });
        panelTombol.add(buttonLaporan);

        buttonKembali.setText("KEMBALI");
        buttonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembaliActionPerformed(evt);
            }
        });
        panelTombol.add(buttonKembali);

        panelTabel.setLayout(new java.awt.GridLayout(1, 0));

        tableInput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableInput);

        panelTabel.add(jScrollPane2);

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTombol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTabel, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addComponent(panelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelTombol, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTabel, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLaporanActionPerformed
        switch (cPilihan.getSelectedItem().toString()) {

            case "Supplier":
                tableSupplier = new DefaultTableModel();
                tableInput.setModel(tableSupplier);
                tableSupplier.addColumn("Id Supplier");
                tableSupplier.addColumn("Nama Supplier");
                dbTableNameSupplier = "supplier";
                dbTableDatasSupplier = new String[]{
                    "id",
                    "nama_supplier"
                };
                serviceLoadData = new ServiceLoadData(); // Memanggil class ServiceRegister dengan membuat variable serviceRegister yang baru
                serviceLoadData.loadDataTable(dbTableNameSupplier, dbTableDatasSupplier, tableSupplier);
                break;

            case "Merek":
                tableMerek = new DefaultTableModel();
                tableInput.setModel(tableMerek);
                tableMerek.addColumn("ID Merek");
                tableMerek.addColumn("Nama Merek");
                dbTableNameMerek = "merek";
                dbTableDatasMerek = new String[]{
                    "id",
                    "nama_merek"
                };
                serviceLoadData = new ServiceLoadData(); // Memanggil class ServiceRegister dengan membuat variable serviceRegister yang baru
                serviceLoadData.loadDataTable(dbTableNameMerek, dbTableDatasMerek, tableMerek);
                break;

            case "Jenis":
                tableJenis = new DefaultTableModel();
                tableInput.setModel(tableJenis);
                tableJenis.addColumn("ID Jenis");
                tableJenis.addColumn("Nama Jenis");
                dbTableNameJenis = "jenis";
                dbTableDatasJenis = new String[]{
                    "id",
                    "nama_jenis"
                };
                serviceLoadData = new ServiceLoadData(); // Memanggil class ServiceRegister dengan membuat variable serviceRegister yang baru
                serviceLoadData.loadDataTable(dbTableNameJenis, dbTableDatasJenis, tableJenis);
                break;

            case "Barang":
                tableBarang = new DefaultTableModel();
                tableInput.setModel(tableBarang);
                tableBarang.addColumn("ID Barang");
                tableBarang.addColumn("Nama Barang");
                tableBarang.addColumn("ID Supplier");
                tableBarang.addColumn("ID Merek");
                tableBarang.addColumn("ID Jenis");
                tableBarang.addColumn("Jumlah");
                tableBarang.addColumn("Harga");
                dbTableNameBarang = "barang";
                dbTableDatasBarang = new String[]{
                    "id",
                    "nama_barang",
                    "id_supplier",
                    "id_merek",
                    "id_jenis",
                    "jumlah",
                    "harga"
                };
                serviceLoadData = new ServiceLoadData(); // Memanggil class ServiceRegister dengan membuat variable serviceRegister yang baru
                serviceLoadData.loadDataTable(dbTableNameBarang, dbTableDatasBarang, tableBarang);
                break;

            case "Transaksi":
                tableTransaksi = new DefaultTableModel();
                tableInput.setModel(tableTransaksi);
                tableTransaksi.addColumn("ID Transaksi");
                tableTransaksi.addColumn("ID Merek");
                tableTransaksi.addColumn("ID Jenis");
                tableTransaksi.addColumn("ID Barang");
                tableTransaksi.addColumn("Tanggal");
                tableTransaksi.addColumn("Jumlah");
                tableTransaksi.addColumn("Harga");
                dbTableNameTransaksi = "transaksi";
                dbTableDatasTransaksi = new String[]{
                    "id",
                    "id_merek",
                    "id_jenis",
                    "id_barang",
                    "tanggal",
                    "jumlah",
                    "harga"
                };
                serviceLoadData = new ServiceLoadData(); // Memanggil class ServiceRegister dengan membuat variable serviceRegister yang baru
                serviceLoadData.loadDataTable(dbTableNameTransaksi, dbTableDatasTransaksi, tableTransaksi);
                break;
        }

    }//GEN-LAST:event_buttonLaporanActionPerformed

    private void buttonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembaliActionPerformed
        FormHalamanUtama formHalamanUtama = new FormHalamanUtama(getButtonEnable());
        formHalamanUtama.setVisible(true);
        formHalamanUtama.userName.setText(userName.getText());
        this.setVisible(false);
    }//GEN-LAST:event_buttonKembaliActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormLandingPage formLandingPage = new FormLandingPage();
        formLandingPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormLaporan().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonKembali;
    private javax.swing.JButton buttonLaporan;
    private javax.swing.JComboBox<String> cPilihan;
    private javax.swing.JLabel jJudul;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelJenis;
    private javax.swing.JPanel panelJudul;
    private javax.swing.JPanel panelTabel;
    private javax.swing.JPanel panelTombol;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JTable tableInput;
    public javax.swing.JMenu userName;
    // End of variables declaration//GEN-END:variables
}
