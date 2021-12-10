package menu;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.ServiceData;
import services.ServiceLoadData;

public class FormSupplier extends javax.swing.JFrame {

    private final ServiceData serviceData; // Mendeklarasikan Class ServiceRegister yang di buat di folder services
    private final ServiceLoadData serviceLoadData; // Mendeklarasikan Class ServiceRegister yang di buat di folder services
    private final DefaultTableModel defaultTableModel;
    private final String dbTableName;
    private final String[] dbTableDatas;
    private String[] dbDatas;

    public FormSupplier() { // Membuat constructor yang merupakan keunggulan dari java OOP
        initComponents(); // Memanggil Class Java Swing yang telah di buat fungsi sebelumnya
        textId.setEditable(false);
        serviceData = new ServiceData(); // Memanggil class ServiceRegister dengan membuat variable serviceRegister yang baru
        serviceLoadData = new ServiceLoadData(); // Memanggil class ServiceRegister dengan membuat variable serviceRegister yang baru

        defaultTableModel = new DefaultTableModel();
        tableInput.setModel(defaultTableModel);
        defaultTableModel.addColumn("Id Supplier");
        defaultTableModel.addColumn("Nama Supplier");
        dbTableName = "supplier";
        dbTableDatas = new String[]{"id", "nama_supplier"};
        serviceLoadData.loadDataTable(dbTableName, dbTableDatas, defaultTableModel);
    }

    private void emptyText() { // Fungsi untuk mengosongkan TextFiled
        textId.setText(""); // Mengosongkan text text Username
        textNama.setText(""); // Mengosongkan Password
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
        panelNama = new javax.swing.JPanel();
        jNama = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        panelTombol = new javax.swing.JPanel();
        buttonSimpan = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonKembali = new javax.swing.JButton();
        panelTabel = new javax.swing.JPanel();
        tableScroll = new javax.swing.JScrollPane();
        tableInput = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        userName = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelUtama.setBackground(new java.awt.Color(0, 51, 51));

        panelJudul.setBackground(new java.awt.Color(102, 102, 255));
        panelJudul.setForeground(new java.awt.Color(0, 0, 255));

        jJudul.setBackground(new java.awt.Color(0, 0, 0));
        jJudul.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jJudul.setForeground(new java.awt.Color(0, 0, 0));
        jJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jJudul.setText("FORM SUPPLIER");
        panelJudul.add(jJudul);

        panelForm.setLayout(new java.awt.GridLayout(0, 2));

        panelId.setLayout(new java.awt.GridLayout(1, 0));

        jId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jId.setText("Id Supplier");
        panelId.add(jId);
        panelId.add(textId);

        panelForm.add(panelId);

        panelNama.setLayout(new java.awt.GridLayout(1, 0));

        jNama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jNama.setText("Nama Supplier");
        panelNama.add(jNama);
        panelNama.add(textNama);

        panelForm.add(panelNama);

        panelTombol.setMinimumSize(new java.awt.Dimension(200, 24));
        panelTombol.setLayout(new java.awt.GridLayout(1, 0));

        buttonSimpan.setText("SIMPAN");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });
        panelTombol.add(buttonSimpan);

        buttonHapus.setText("HAPUS");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });
        panelTombol.add(buttonHapus);

        buttonEdit.setText("EDIT");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });
        panelTombol.add(buttonEdit);

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
                .addComponent(panelTabel, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
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
                .addGap(0, 0, 0)
                .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        dbDatas = new String[]{textId.getText(), textNama.getText()};

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
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        String result = serviceData.deleteDatas(dbTableName, textId.getText()); // String result
        switch (result) { //
            case "BERHASIL":
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "TB PERSADA", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, result);
                break;
        }
        serviceLoadData.loadDataTable(dbTableName, dbTableDatas, defaultTableModel);
        emptyText();
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        dbDatas = new String[]{textId.getText(), textNama.getText()};

        String checkDatas = serviceData.checkDatas(dbDatas); // String result

        switch (checkDatas) {
            case "LENGKAPI_DATA":
                JOptionPane.showMessageDialog(null, "Lengkapi Data", "TB PERSADA", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "LENGKAP":
                String result = serviceData.editDatas(dbTableName, dbTableDatas, dbDatas); // String result
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
    }//GEN-LAST:event_buttonEditActionPerformed

    private void tableInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInputMouseClicked
        int i = tableInput.getSelectedRow();
        textId.setText(defaultTableModel.getValueAt(i, 0).toString());
        textNama.setText(defaultTableModel.getValueAt(i, 1).toString());
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
                new FormSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKembali;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JLabel jId;
    private javax.swing.JLabel jJudul;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel jNama;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelId;
    private javax.swing.JPanel panelJudul;
    private javax.swing.JPanel panelNama;
    private javax.swing.JPanel panelTabel;
    private javax.swing.JPanel panelTombol;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JTable tableInput;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textNama;
    public javax.swing.JMenu userName;
    // End of variables declaration//GEN-END:variables
}
