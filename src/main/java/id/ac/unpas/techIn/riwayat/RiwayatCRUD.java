/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.unpas.techIn.riwayat;

import id.ac.unpas.techIn.penjemputan.*;
import id.ac.unpas.techIn.permintaan.*;
import id.ac.unpas.techIn.dao.PermintaanDao;
import id.ac.unpas.techIn.pelanggan.Pelanggan;
import id.ac.unpas.techIn.penjemputan.Penjemputan;
import id.ac.unpas.techIn.permintaan.PermintaanModelTable;
import java.util.List;

/**
 *
 * @author ghifarullah19
 */
public class RiwayatCRUD
        extends javax.swing.JFrame {
    
    private List<Permintaan> permintaanList;
    private Permintaan permintaanUbah;
    private PermintaanDao permintaanDao;
    private PermintaanModelTable permintaanModelTable;

    /**
     * Creates new form PermintaanCRUD
     */
    public RiwayatCRUD(PermintaanDao permintaanDao) {
        this.permintaanDao = permintaanDao;
        this.permintaanList = this.permintaanDao.findAll();
        this.permintaanModelTable = new PermintaanModelTable(permintaanList);
        
        initComponents();
        
        buttonGroup1.add(radioTrue);
        buttonGroup1.add(radioFalse);
        
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        frameCRUDPermintaan = new javax.swing.JPanel();
        panelCRUDPermintaan = new javax.swing.JPanel();
        labelNamaPelanggan = new javax.swing.JLabel();
        textfieldNamaPelanggan = new javax.swing.JTextField();
        labelAlamatPelanggan = new javax.swing.JLabel();
        textfieldAlamatPelanggan = new javax.swing.JTextField();
        labelStatus = new javax.swing.JLabel();
        radioTrue = new javax.swing.JRadioButton();
        radioFalse = new javax.swing.JRadioButton();
        titleCRUDPermintaan = new javax.swing.JLabel();
        buttonKembali = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonKirim = new javax.swing.JButton();
        buttonSimpanUbah = new javax.swing.JButton();
        labelNamaKurir = new javax.swing.JLabel();
        textfieldNamaKurir = new javax.swing.JTextField();
        labelAlamatTujuan = new javax.swing.JLabel();
        textfieldAlamatTujuan = new javax.swing.JTextField();
        scrollableTable = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePermintaan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frameCRUDPermintaan.setBackground(new java.awt.Color(102, 153, 255));

        panelCRUDPermintaan.setBackground(new java.awt.Color(255, 255, 255));

        labelNamaPelanggan.setText("Nama Pelanggan");

        labelAlamatPelanggan.setText("Almat Penjemputan");

        labelStatus.setText("Status");

        radioTrue.setText("Sudah");

        radioFalse.setText("Menunggu");

        titleCRUDPermintaan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleCRUDPermintaan.setText("Form Permintaan");

        buttonKembali.setText("Kembali");

        buttonUbah.setText("Ubah");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonKirim.setText("Kirim");
        buttonKirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKirimActionPerformed(evt);
            }
        });

        buttonSimpanUbah.setText("Simpan Ubah");
        buttonSimpanUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanUbahActionPerformed(evt);
            }
        });

        labelNamaKurir.setText("Nama Kurir");

        textfieldNamaKurir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldNamaKurirActionPerformed(evt);
            }
        });

        labelAlamatTujuan.setText("Alamat Tujuan");

        javax.swing.GroupLayout panelCRUDPermintaanLayout = new javax.swing.GroupLayout(panelCRUDPermintaan);
        panelCRUDPermintaan.setLayout(panelCRUDPermintaanLayout);
        panelCRUDPermintaanLayout.setHorizontalGroup(
            panelCRUDPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCRUDPermintaanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleCRUDPermintaan)
                .addGap(164, 164, 164))
            .addGroup(panelCRUDPermintaanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCRUDPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCRUDPermintaanLayout.createSequentialGroup()
                        .addGroup(panelCRUDPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCRUDPermintaanLayout.createSequentialGroup()
                                .addComponent(buttonKembali)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSimpanUbah))
                            .addGroup(panelCRUDPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelNamaPelanggan)
                                .addComponent(labelAlamatPelanggan)
                                .addComponent(textfieldAlamatPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addComponent(textfieldNamaPelanggan)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCRUDPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNamaKurir)
                            .addGroup(panelCRUDPermintaanLayout.createSequentialGroup()
                                .addComponent(buttonHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonKirim))
                            .addComponent(textfieldNamaKurir)
                            .addComponent(labelAlamatTujuan)
                            .addComponent(textfieldAlamatTujuan, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                    .addComponent(labelStatus)
                    .addGroup(panelCRUDPermintaanLayout.createSequentialGroup()
                        .addComponent(radioTrue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioFalse)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCRUDPermintaanLayout.setVerticalGroup(
            panelCRUDPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCRUDPermintaanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleCRUDPermintaan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCRUDPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamaPelanggan)
                    .addComponent(labelNamaKurir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCRUDPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldNamaKurir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCRUDPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlamatPelanggan)
                    .addComponent(labelAlamatTujuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCRUDPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldAlamatPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldAlamatTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCRUDPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTrue)
                    .addComponent(radioFalse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCRUDPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonKembali)
                    .addComponent(buttonUbah)
                    .addComponent(buttonHapus)
                    .addComponent(buttonKirim)
                    .addComponent(buttonSimpanUbah))
                .addGap(52, 52, 52))
        );

        tablePermintaan.setModel(permintaanModelTable);
        jScrollPane1.setViewportView(tablePermintaan);

        scrollableTable.setViewportView(jScrollPane1);

        javax.swing.GroupLayout frameCRUDPermintaanLayout = new javax.swing.GroupLayout(frameCRUDPermintaan);
        frameCRUDPermintaan.setLayout(frameCRUDPermintaanLayout);
        frameCRUDPermintaanLayout.setHorizontalGroup(
            frameCRUDPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameCRUDPermintaanLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(frameCRUDPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCRUDPermintaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollableTable, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        frameCRUDPermintaanLayout.setVerticalGroup(
            frameCRUDPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameCRUDPermintaanLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panelCRUDPermintaan, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollableTable, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameCRUDPermintaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameCRUDPermintaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKirimActionPerformed
        // TODO add your handling code here:
        boolean status = false;
        
        if (radioTrue.isSelected()) {
            status = true;
        }
        
        if (radioFalse.isSelected()){
            status = false;
        }
        
        String namaPelanggan = this.textfieldNamaPelanggan.getText();
        String namaKurir = this.textfieldNamaKurir.getText();
        String alamatPenjemputan = this.textfieldAlamatPelanggan.getText();
        String alamatTujuan = this.textfieldAlamatTujuan.getText();

        Permintaan permintaan = new Permintaan();
        Penjemputan penjemputan = new Penjemputan();
        
        permintaan.setNama(namaPelanggan);
        permintaan.setAlamat(alamatPenjemputan);
        permintaan.setStatus(status);
        
        penjemputan.setNama(namaKurir);
        penjemputan.setAlamat(alamatTujuan);
        penjemputan.setStatus(status);

        this.permintaanDao.insert(permintaan);
        this.addData(permintaan);
    }//GEN-LAST:event_buttonKirimActionPerformed

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
        // TODO add your handling code here:
        int row = tablePermintaan.getSelectedRow();
        int column = tablePermintaan.getSelectedColumn();

        if (row == -1 || column == -1) {
            return;
        }

        String dataUbah = (String) tablePermintaan.getModel().getValueAt(row, column);

        int id = -1;
        String col = "";

        switch (column) {
            case 0:
                col = "namaPelanggan";
                break;
            case 1:
                col = "alamatPenjemputan";
                break;
            case 2:
                col = "status";
                break;
            default:
                System.out.println("Kolom tidak ditemukan");
                break;
        }
        id = this.permintaanDao.select(col, dataUbah).getId();
       
        this.textfieldNamaPelanggan.setText(this.permintaanDao.select(col, dataUbah).getNama());
        this.textfieldAlamatPelanggan.setText(this.permintaanDao.select(col, dataUbah).getAlamat());

        if (this.permintaanDao.select(col, dataUbah).getStatus() == true) {
            this.radioTrue.setSelected(true);
        } else {
            this.radioFalse.setSelected(true);
        }
        
        permintaanUbah = new Permintaan();
        permintaanUbah.setId(id);
    }//GEN-LAST:event_buttonUbahActionPerformed

    private void buttonSimpanUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanUbahActionPerformed
        // TODO add your handling code here:
        boolean status = false;
        
        if (radioTrue.isSelected()) {
            status = true;
        }
        
        if (radioFalse.isSelected()){
            status = false;
        }
        
        String nama = this.textfieldNamaPelanggan.getText();
        String alamat = this.textfieldAlamatPelanggan.getText();

        Permintaan permintaan = new Permintaan();
        permintaan.setId(permintaanUbah.getId());
        permintaan.setNama(nama);
        permintaan.setAlamat(alamat);
        permintaan.setStatus(status);

        this.permintaanDao.update(permintaan);
        this.update(permintaan);
    }//GEN-LAST:event_buttonSimpanUbahActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // TODO add your handling code here:
        int row = this.tablePermintaan.getSelectedRow();
        int column = this.tablePermintaan.getSelectedColumn();

        if (row == -1 || column == -1) {
          return;
        } else {
          String newValue = (String) this.tablePermintaan.getModel().getValueAt(row, column);
     
          Permintaan id = new Permintaan();

          String col = "";

          switch (column) {
                case 0:
                    col = "namaPelanggan";
                    break;
                case 1:
                    col = "alamatPenjemputan";
                    break;
                case 2:
                    col = "status";
                    break;
                default:
                    System.out.println("Kolom tidak ditemukan");
                    break;
            }
            id = this.permintaanDao.select(col, newValue);

            this.delete(id);
            this.permintaanDao.delete(id);
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void textfieldNamaKurirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldNamaKurirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldNamaKurirActionPerformed

    // Method untuk menambahkan permintaan ke tableModel
    public void addData(Permintaan permintaan) {
        permintaanModelTable.add(permintaan);
        textfieldNamaPelanggan.setText("");
        textfieldAlamatPelanggan.setText("");
        radioFalse.setSelected(true);
    }
    
    // Method untuk mengubah permintaan ke tableModel
    public void update(Permintaan permintaan) {
        permintaanModelTable.update(permintaan);
        textfieldNamaPelanggan.setText("");
        textfieldAlamatPelanggan.setText("");
    }
    
    // Method untuk menghapus permintaan ke tableModel
    public void delete(Permintaan permintaan) {
        // Tambahkan permintaan ke tableModel
        permintaanModelTable.delete(permintaan);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKembali;
    private javax.swing.JButton buttonKirim;
    private javax.swing.JButton buttonSimpanUbah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JPanel frameCRUDPermintaan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlamatPelanggan;
    private javax.swing.JLabel labelAlamatTujuan;
    private javax.swing.JLabel labelNamaKurir;
    private javax.swing.JLabel labelNamaPelanggan;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JPanel panelCRUDPermintaan;
    private javax.swing.JRadioButton radioFalse;
    private javax.swing.JRadioButton radioTrue;
    private javax.swing.JScrollPane scrollableTable;
    private javax.swing.JTable tablePermintaan;
    private javax.swing.JTextField textfieldAlamatPelanggan;
    private javax.swing.JTextField textfieldAlamatTujuan;
    private javax.swing.JTextField textfieldNamaKurir;
    private javax.swing.JTextField textfieldNamaPelanggan;
    private javax.swing.JLabel titleCRUDPermintaan;
    // End of variables declaration//GEN-END:variables
}
