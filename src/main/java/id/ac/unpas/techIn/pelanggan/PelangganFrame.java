/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.unpas.techIn.pelanggan;

import java.util.List;
import javax.swing.JTextField;
import id.ac.unpas.techIn.dao.PelangganDao;
import id.ac.unpas.techIn.permintaan.PermintaanCard;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 *
 * @author ghifarullah19
 */
public class PelangganFrame
        extends javax.swing.JFrame {
    
    // jenisMemberList adalah variabel yang digunakan untuk menyimpan data jenis member
    private List<Pelanggan> pelangganList;
    
    // jenisMemberDao adalah variabel yang digunakan untuk menyimpan data jenis member yang didapat dari database
    private PelangganDao pelangganDao;
    
    private PelangganModelTable PelangganModelTable;

    /**
     * Creates new form PelangganFrame2
     */
    public PelangganFrame(PelangganDao pelangganDao) {
        // this.jenisMemberDao diberikan nilai dari parameter jenisMemberDao
        this.pelangganDao = pelangganDao;
        // this.jenisMemberList diberikan nilai dari data jenis member yang didapat dari database
        this.pelangganList = this.pelangganDao.findAll();
        this.PelangganModelTable = new PelangganModelTable(pelangganList);
        
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        buttonSimpan = new javax.swing.JButton();
        textFieldNama = new javax.swing.JTextField();
        textFieldAlamat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jTable1.setModel(PelangganModelTable);
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setText("Pelanggan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(583, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Show", jPanel1);

        jLabel2.setText("Permintaan Add");

        labelNama.setText("Nama");

        labelAlamat.setText("Alamat");

        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        textFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNamaActionPerformed(evt);
            }
        });

        textFieldAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAlamatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(buttonSimpan)
                        .addComponent(labelAlamat)
                        .addComponent(textFieldNama)
                        .addComponent(textFieldAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addComponent(labelNama))
                .addContainerGap(461, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelAlamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonSimpan)
                .addContainerGap(531, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNamaActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        // TODO add your handling code here:
        // Variable nama untuk menyimpan nilai dari objek textFieldNama (nama)
        String nama = this.textFieldNama.getText();
        // Variable alamat untuk menyimpan nilai dari objek txtOutput (alamat)
        String alamat = this.textFieldAlamat.getText();

        // Instansiasi objek biodata dengan nama biodata
        Pelanggan pelanggan = new Pelanggan();

        // Set nama biodata dengan nilai dari variable nama
        pelanggan.setNama(nama);
        // Set alamat biodata dengan nilai dari variable alamat
        pelanggan.setAlamat(alamat);

        this.pelangganDao.insert(pelanggan);
        this.addBiodata(pelanggan);
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void textFieldAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAlamatActionPerformed

    // Method untuk menambahkan biodata ke tableModel
    public void addBiodata(Pelanggan pelanggan) {
        // Tambahkan biodata ke tableModel
        PelangganModelTable.add(pelanggan);
        // Kembalikan isi textFieldNama ke kondisi kosong
        textFieldNama.setText("");
        textFieldAlamat.setText("");
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelNama;
    private javax.swing.JTextField textFieldAlamat;
    private javax.swing.JTextField textFieldNama;
    // End of variables declaration//GEN-END:variables
}
