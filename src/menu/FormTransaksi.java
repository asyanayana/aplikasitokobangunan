package menu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.ServiceData;
import services.ServiceLoadData;

public class FormTransaksi extends javax.swing.JFrame {

    private final ServiceData serviceData; // Mendeklarasikan Class ServiceRegister yang di buat di folder services
    private final ServiceLoadData serviceLoadData; // Mendeklarasikan Class ServiceRegister yang di buat di folder services
    private final DefaultTableModel defaultTableModel;
    private final String dbTableName;
    private final String[] dbTableDatas;
    private String[] dbDatas;
    private String timeStamp;

    public FormTransaksi() { // Membuat constructor yang merupakan keunggulan dari java OOP
        initComponents(); // Memanggil Class Java Swing yang telah di buat fungsi sebelumnya
        textId.setEditable(false);
        serviceData = new ServiceData(); // Memanggil class ServiceRegister dengan membuat variable serviceRegister yang baru
        serviceLoadData = new ServiceLoadData(); // Memanggil class ServiceRegister dengan membuat variable serviceRegister yang baru

        defaultTableModel = new DefaultTableModel();
        tableInput.setModel(defaultTableModel);
        defaultTableModel.addColumn("ID Transaksi");
        defaultTableModel.addColumn("ID Merek");
        defaultTableModel.addColumn("ID Jenis");
        defaultTableModel.addColumn("ID Barang");
        defaultTableModel.addColumn("Tanggal");
        defaultTableModel.addColumn("Jumlah");
        defaultTableModel.addColumn("Harga");
        dbTableName = "transaksi";
        dbTableDatas = new String[]{
            "id",
            "id_merek",
            "id_jenis",
            "id_barang",
            "tanggal",
            "jumlah",
            "harga"
        };
        serviceLoadData.loadDataTable(dbTableName, dbTableDatas, defaultTableModel);
        serviceData.showCombo(cMerek, "merek", "id", "nama_merek");
        serviceData.showCombo(cJenis, "jenis", "id", "nama_jenis");
        serviceData.showCombo(cBarang, "barang", "id", "nama_barang");
    }

    private void emptyText() { // Fungsi untuk mengosongkan TextFiled
        textId.setText(""); // Mengosongkan text text Username
        textJumlah.setText(""); // Mengosongkan text text Username
        textHarga.setText(""); // Mengosongkan text text Username
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUtama = new javax.swing.JPanel();
        panelJudul = new javax.swing.JPanel();
        jJudul = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();
        panelId = new javax.swing.JPanel();
        jId = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        panelMerek = new javax.swing.JPanel();
        jMerek = new javax.swing.JLabel();
        cMerek = new javax.swing.JComboBox<>();
        panelJenis = new javax.swing.JPanel();
        jJenis = new javax.swing.JLabel();
        cJenis = new javax.swing.JComboBox<>();
        panelBarang = new javax.swing.JPanel();
        jBarang = new javax.swing.JLabel();
        cBarang = new javax.swing.JComboBox<>();
        panelJumlah = new javax.swing.JPanel();
        jJumlah = new javax.swing.JLabel();
        textJumlah = new javax.swing.JTextField();
        panelHarga = new javax.swing.JPanel();
        jHarga = new javax.swing.JLabel();
        textHarga = new javax.swing.JTextField();
        panelTombol = new javax.swing.JPanel();
        buttonTransaksi = new javax.swing.JButton();
        buttonKembali = new javax.swing.JButton();
        panelTabel = new javax.swing.JPanel();
        tableScroll = new javax.swing.JScrollPane();
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
        jJudul.setText("FORM TRANSAKSI");
        panelJudul.add(jJudul);

        panelForm.setLayout(new java.awt.GridLayout(0, 2));

        panelId.setLayout(new java.awt.GridLayout(1, 0));

        jId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jId.setText("ID Transaksi");
        panelId.add(jId);
        panelId.add(textId);

        panelForm.add(panelId);

        panelMerek.setLayout(new java.awt.GridLayout(1, 0));

        jMerek.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMerek.setText("ID Merek");
        panelMerek.add(jMerek);

        panelMerek.add(cMerek);

        panelForm.add(panelMerek);

        panelJenis.setLayout(new java.awt.GridLayout(1, 0));

        jJenis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jJenis.setText("ID Jenis");
        panelJenis.add(jJenis);

        panelJenis.add(cJenis);

        panelForm.add(panelJenis);

        panelBarang.setLayout(new java.awt.GridLayout(1, 0));

        jBarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBarang.setText("ID Supplier");
        panelBarang.add(jBarang);

        panelBarang.add(cBarang);

        panelForm.add(panelBarang);

        panelJumlah.setLayout(new java.awt.GridLayout(1, 0));

        jJumlah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jJumlah.setText("Jumlah");
        panelJumlah.add(jJumlah);
        panelJumlah.add(textJumlah);

        panelForm.add(panelJumlah);

        panelHarga.setLayout(new java.awt.GridLayout(1, 0));

        jHarga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jHarga.setText("Harga");
        panelHarga.add(jHarga);
        panelHarga.add(textHarga);

        panelForm.add(panelHarga);

        panelTombol.setMinimumSize(new java.awt.Dimension(200, 24));
        panelTombol.setLayout(new java.awt.GridLayout(1, 0));

        buttonTransaksi.setText("TRANSAKSI");
        buttonTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTransaksiActionPerformed(evt);
            }
        });
        panelTombol.add(buttonTransaksi);

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
        tableInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableInputMouseClicked(evt);
            }
        });
        tableScroll.setViewportView(tableInput);

        panelTabel.add(tableScroll);

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
                .addGap(159, 159, 159)
                .addComponent(panelTabel, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
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

    private void buttonTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransaksiActionPerformed
        timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        dbDatas = new String[]{
            textId.getText(),
            cMerek.getSelectedItem().toString().split(" ")[0],
            cJenis.getSelectedItem().toString().split(" ")[0],
            cBarang.getSelectedItem().toString().split(" ")[0],
            timeStamp,
            textJumlah.getText(),
            textHarga.getText()
        };

        String checkDatas = serviceData.checkDatas(dbDatas); // String result

        switch (checkDatas) {
            case "LENGKAPI_DATA":
                JOptionPane.showMessageDialog(null, "Lengkapi Data", "TB PERSADA", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "LENGKAP":
                String result = serviceData.saveDatas(dbTableName, dbDatas); // String result
                switch (result) {
                    case "BERHASIL":
                        JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan", "TB PERSADA", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, result);
                        break;
                }
                serviceLoadData.loadDataTable(dbTableName, dbTableDatas, defaultTableModel);
                emptyText();
                break;
            default:
                JOptionPane.showMessageDialog(null, checkDatas);
                break;

        }
    }//GEN-LAST:event_buttonTransaksiActionPerformed

    private void tableInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInputMouseClicked
        textId.setText(defaultTableModel.getValueAt(tableInput.getSelectedRow(), 0).toString());
        textJumlah.setText(defaultTableModel.getValueAt(tableInput.getSelectedRow(), 5).toString());
        textHarga.setText(defaultTableModel.getValueAt(tableInput.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_tableInputMouseClicked

    private void buttonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembaliActionPerformed
        FormHalamanUtama formHalamanUtama = new FormHalamanUtama();
        formHalamanUtama.setVisible(true);
        formHalamanUtama.userName.setText(userName.getText());
        this.setVisible(false);
    }//GEN-LAST:event_buttonKembaliActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormLandingPage formLandingPage = new FormLandingPage();
        formLandingPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonKembali;
    private javax.swing.JButton buttonTransaksi;
    private javax.swing.JComboBox<String> cBarang;
    private javax.swing.JComboBox<String> cJenis;
    private javax.swing.JComboBox<String> cMerek;
    private javax.swing.JLabel jBarang;
    private javax.swing.JLabel jHarga;
    private javax.swing.JLabel jId;
    private javax.swing.JLabel jJenis;
    private javax.swing.JLabel jJudul;
    private javax.swing.JLabel jJumlah;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel jMerek;
    private javax.swing.JPanel panelBarang;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelHarga;
    private javax.swing.JPanel panelId;
    private javax.swing.JPanel panelJenis;
    private javax.swing.JPanel panelJudul;
    private javax.swing.JPanel panelJumlah;
    private javax.swing.JPanel panelMerek;
    private javax.swing.JPanel panelTabel;
    private javax.swing.JPanel panelTombol;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JTable tableInput;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JTextField textHarga;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textJumlah;
    public javax.swing.JMenu userName;
    // End of variables declaration//GEN-END:variables
}
