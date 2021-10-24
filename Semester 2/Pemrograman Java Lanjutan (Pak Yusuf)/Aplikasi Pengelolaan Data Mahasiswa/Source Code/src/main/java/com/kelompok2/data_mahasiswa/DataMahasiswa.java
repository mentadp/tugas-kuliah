/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok2.data_mahasiswa;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import java.sql.*;
//import com.mysql.jdbc.Statement;
//import java.awt.HeadlessException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import javax.swing.JOptionPane;
//import com.kelompok2.data_mahasiswa.Connect;
import com.kelompok2.data_mahasiswa.Connect;
//import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class DataMahasiswa extends javax.swing.JFrame {

    private static Connection c = null;

    /**
     * Creates new form DataMahasiswa
     */
    public DataMahasiswa() {
        initComponents();
        datatable();
    }

    public void datatable() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("NIM");
        tbl.addColumn("Nama");
        tbl.addColumn("Jurusan");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("Alamat");
        tabel.setModel(tbl);

        try {
            c = Connect.getConn();
            Statement stmt = (Statement) c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tab_mahasiswa ORDER BY nim ASC");
//            Statement statement = (Statement) Connect.GetConnection().createStatement();
//            ResultSet res = statement.executeQuery("SELECT * FROM tab_mahasiswa ORDER BY nim ASC");
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("nim"),
                    rs.getString("nama"),
                    rs.getString("jurusan"),
                    rs.getString("jeniskelamin"),
                    rs.getString("alamat")
                });
                tabel.setModel(tbl);
            }
//            rs.close();
//            stmt.close();
//            c.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
        }
        System.out.println("Operation done successfully");
        //System.out.println(PathToApp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputJenisKelamin = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputNim = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputJurusan = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        laki = new javax.swing.JRadioButton();
        perempuan = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputAlamat = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        btnUbah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int collIndex){
                return false;
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Mahasiswa");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Data Mahasiswa");

        jLabel2.setText("NIM");

        inputNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNimActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama");

        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });

        jLabel4.setText("Jurusan");

        inputJurusan.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Teknik Informatika", "Sistem Informasi"}));

        jLabel5.setText("Jenis Kelamin");

        inputJenisKelamin.add(laki);
        laki.setText("Laki-laki");

        inputJenisKelamin.add(perempuan);
        perempuan.setText("Perempuan");

        jLabel6.setText("Alamat");

        inputAlamat.setColumns(20);
        inputAlamat.setRows(5);
        jScrollPane1.setViewportView(inputAlamat);

        jLabel7.setText("Proses");

        btnUbah.setText("Ubah");
        btnUbah.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnUbahFocusGained(evt);
            }
        });
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUbahMouseEntered(evt);
            }
        });
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(laki, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(perempuan)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(inputNim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                        .addComponent(inputNama, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(inputJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(laki))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perempuan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCari)
                            .addComponent(btnHapus)
                            .addComponent(btnKeluar)
                            .addComponent(btnUbah)
                            .addComponent(btnSimpan))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNimActionPerformed

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        String nim = inputNim.getText();
        int opsi = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data?", "Hapus Data", JOptionPane.YES_NO_OPTION);
        if (opsi == JOptionPane.YES_OPTION) {
            try {
                c = Connect.getConn();
                Statement stmt = (Statement) c.createStatement();
//                Statement statement = (Statement) Connect.GetConnection().createStatement();
                stmt.executeUpdate("DELETE from tab_mahasiswa WHERE nim = ('" + nim + "');");
//                c.commit();
                inputNim.setText("");
                inputNama.setText("");
                inputJurusan.setSelectedItem("");
                String jeniskelamin = null;
                inputAlamat.setText("");
                inputNim.requestFocus();

//                stmt.close();
//                c.close();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            } catch (Exception t) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus");
            }
        }
        datatable();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        String nim = inputNim.getText();
        String nama = inputNama.getText();
        String jurusan = (String) inputJurusan.getSelectedItem();
        String alamat = inputAlamat.getText();
        String jeniskelamin = null;
        if (laki.isSelected()) {
            jeniskelamin = "Laki-laki";
        } else if (perempuan.isSelected()) {
            jeniskelamin = "Perempuan";
        }

        try {
            c = Connect.getConn();
            Statement stmt = (Statement) c.createStatement();
            stmt.executeUpdate("UPDATE tab_mahasiswa SET nama = '" + nama + "',"
                    + "jurusan = '" + jurusan + "',"
                    + "jeniskelamin = '" + jeniskelamin + "',"
                    + "alamat = '" + alamat + "'"
                    + "WHERE nim = '" + nim + "';");
            //c.commit();
//            stmt.close();
//            c.close();
            inputNim.setText("");
            inputNama.setText("");
            inputJurusan.setSelectedItem("");
            inputJenisKelamin.clearSelection();
            inputAlamat.setText("");
            JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, "Data gagal diubah!" + t);
        }

        datatable();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String nim = inputNim.getText();
        String nama = inputNama.getText();
        String jurusan = (String) inputJurusan.getSelectedItem();
        String alamat = inputAlamat.getText();
        String jeniskelamin = null;
        if (laki.isSelected()) {
            jeniskelamin = "Laki-laki";
        } else if (perempuan.isSelected()) {
            jeniskelamin = "Perempuan";
        }

        try {
            c = Connect.getConn();
            Statement stmt = (Statement) c.createStatement();
            stmt.executeUpdate("INSERT INTO tab_mahasiswa VALUES ('" + nim + "','" + nama + "','" + jurusan + "','" + jeniskelamin + "','" + alamat + "');");
//            stmt.close();
            //c.commit();
//            c.close();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
            inputNim.setText("");
            inputNama.setText("");
            inputJurusan.setSelectedItem("");
            inputJenisKelamin.clearSelection();
            inputAlamat.setText("");
        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan!");
        }

        datatable();

    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        try {
            c = Connect.getConn();
            Statement stmt = (Statement) c.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tab_mahasiswa WHERE nim ='" + inputNim.getText() + "'");
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("NIM");
            tbl.addColumn("Nama");
            tbl.addColumn("Jurusan");
            tbl.addColumn("Jenis Kelamin");
            tbl.addColumn("Alamat");
            tabel.setModel(tbl);
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("nim"),
                    res.getString("nama"),
                    res.getString("jurusan"),
                    res.getString("jeniskelamin"),
                    res.getString("alamat")
                });
                tabel.setModel(tbl);
                String nama = res.getString("nama");
                String jurusan = res.getString("jurusan");
                String jeniskelamin = res.getString("jeniskelamin");
                System.out.println(jeniskelamin);
                String alamat = res.getString("alamat");
                inputNama.setText(nama);
                inputJurusan.setSelectedItem(jurusan);
                if (jeniskelamin.equals("Laki-laki")) {
                    laki.setSelected(true);
                } else if (jeniskelamin.equals("Perempuan")) {
                    perempuan.setSelected(true);
                }
                inputAlamat.setText(alamat);
            }
//            res.close();
//            stmt.close();
//            c.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah " + e);
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnUbahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseEntered
        // TODO add your handling code here:
        btnUbah.setToolTipText("PERINGATAN!!! NIM tidak dapat diubah");
    }//GEN-LAST:event_btnUbahMouseEntered

    private void btnUbahFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnUbahFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahFocusGained

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("img/icon.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JTextArea inputAlamat;
    private javax.swing.ButtonGroup inputJenisKelamin;
    private javax.swing.JComboBox<String> inputJurusan;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputNim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton laki;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}