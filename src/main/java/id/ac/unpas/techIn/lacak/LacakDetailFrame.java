/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.unpas.techIn.lacak;

import java.util.List;
import id.ac.unpas.techIn.dao.LacakDao;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author ghifarullah19
 */
public class LacakDetailFrame
        extends javax.swing.JFrame {
    
    // jenisMemberList adalah variabel yang digunakan untuk menyimpan data jenis member
    private List<Lacak> lacakList;
    
    // jenisMemberDao adalah variabel yang digunakan untuk menyimpan data jenis member yang didapat dari database
    private LacakDao lacakDao;

    /**
     * Creates new form LacakFrame2
     */
    public LacakDetailFrame(Lacak lacak) {
        initComponents();
        alamatPenjemputan.setText(lacak.getAlamatPenjemputan());
        iconLacak.setText("");
        iconLacak.setIcon(imageIcon("C:\\Users\\ghifarullah19\\Documents\\NetBeansProjects\\tech-in\\src\\main\\java\\id\\ac\\unpas\\techIn\\img\\route2.png",
                203,
                558));
    }
    
    public ImageIcon imageIcon(String imageURL, int height, int width) {
        ImageIcon icon = new ImageIcon(imageURL);
        Image image = icon.getImage();
        Image newImage = image.getScaledInstance(width,
                        height,
                        Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImage);
        return icon;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLacak = new javax.swing.JPanel();
        panelTitlePermintaan = new javax.swing.JPanel();
        labelTitlePermintaan = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        alamatPenjemputan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        iconLacak = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelLacak.setBackground(new java.awt.Color(155, 190, 200));

        panelTitlePermintaan.setBackground(new java.awt.Color(66, 125, 157));

        labelTitlePermintaan.setForeground(new java.awt.Color(255, 255, 255));
        labelTitlePermintaan.setText("Detail Penjemputan");

        javax.swing.GroupLayout panelTitlePermintaanLayout = new javax.swing.GroupLayout(panelTitlePermintaan);
        panelTitlePermintaan.setLayout(panelTitlePermintaanLayout);
        panelTitlePermintaanLayout.setHorizontalGroup(
            panelTitlePermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitlePermintaanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitlePermintaan)
                .addContainerGap(735, Short.MAX_VALUE))
        );
        panelTitlePermintaanLayout.setVerticalGroup(
            panelTitlePermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitlePermintaanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitlePermintaan)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(66, 125, 157));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alamat");

        alamatPenjemputan.setBackground(new java.awt.Color(255, 255, 255));
        alamatPenjemputan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        alamatPenjemputan.setForeground(new java.awt.Color(255, 255, 255));
        alamatPenjemputan.setText("alamatPenjemputan");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estimasi waktu penjemputan");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("20 menit");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(alamatPenjemputan, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alamatPenjemputan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        iconLacak.setText("iconLacak");
        iconLacak.setMaximumSize(new java.awt.Dimension(558, 203));
        iconLacak.setMinimumSize(new java.awt.Dimension(558, 203));
        iconLacak.setPreferredSize(new java.awt.Dimension(558, 203));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(iconLacak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(iconLacak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelLacakLayout = new javax.swing.GroupLayout(panelLacak);
        panelLacak.setLayout(panelLacakLayout);
        panelLacakLayout.setHorizontalGroup(
            panelLacakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitlePermintaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLacakLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLacakLayout.setVerticalGroup(
            panelLacakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLacakLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelTitlePermintaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLacak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLacak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamatPenjemputan;
    private javax.swing.JLabel iconLacak;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTitlePermintaan;
    private javax.swing.JPanel panelLacak;
    private javax.swing.JPanel panelTitlePermintaan;
    // End of variables declaration//GEN-END:variables
}
