/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.unpas.techIn.main;

import id.ac.unpas.techIn.dao.PelangganDao;
import id.ac.unpas.techIn.dao.PermintaanDao;
import id.ac.unpas.techIn.dao.LacakDao;
import id.ac.unpas.techIn.dao.PenjemputanDao;
import id.ac.unpas.techIn.dao.RiwayatDao;
import id.ac.unpas.techIn.dao.SampahDao;
import id.ac.unpas.techIn.pelanggan.PelangganFrame;
import id.ac.unpas.techIn.permintaan.PermintaanFrame;
import id.ac.unpas.techIn.lacak.LacakFrame;
import id.ac.unpas.techIn.penjemputan.PenjemputanFrame;
import id.ac.unpas.techIn.permintaan.Permintaan;
import id.ac.unpas.techIn.riwayat.RiwayatFrame;
import id.ac.unpas.techIn.sampah.Sampah;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author ghifarullah19
 */
public class MainFrame
        extends javax.swing.JFrame {

    private PelangganFrame pelangganFrame;
    private PermintaanFrame permintaanFrame;
    private LacakFrame lacakFrame;
    private PenjemputanFrame penjemputanFrame;
    private RiwayatFrame riwayatFrame;
    private PelangganDao pelangganDao;
    private PermintaanDao permintaanDao;
    private LacakDao lacakDao;
    private PenjemputanDao penjemputanDao;
    private RiwayatDao riwayatDao;
    private SampahDao sampahDao;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        SampahDao sampahDao = new SampahDao();
        List<Sampah> sampahList = sampahDao.findAll();
        PermintaanDao permintaanDao = new PermintaanDao();
        List<Permintaan> permintaanList = permintaanDao.findAll();
        initComponents();
        jumlahTotalSampah.setText(String.valueOf(sampahList.size()));
        jumlahTotalPermintaan.setText(String.valueOf(permintaanList.size()));
        
        iconMain.setText("");
        iconMain.setIcon(imageIcon("C:\\Users\\ghifarullah19\\Documents\\NetBeansProjects\\tech-in\\src\\main\\java\\id\\ac\\unpas\\techIn\\img\\rycle.png",
                35,
                35));
        
        iconTotalSampah.setText("");
        iconTotalSampah.setIcon(imageIcon("C:\\Users\\ghifarullah19\\Documents\\NetBeansProjects\\tech-in\\src\\main\\java\\id\\ac\\unpas\\techIn\\img\\sampah.png",
                50,
                80));
        
        iconTotalPermintaan.setText("");
        iconTotalPermintaan.setIcon(imageIcon("C:\\Users\\ghifarullah19\\Documents\\NetBeansProjects\\tech-in\\src\\main\\java\\id\\ac\\unpas\\techIn\\img\\mobil.png",
                50,
                83));
        
        grafik.setText("");
        grafik.setIcon(imageIcon("C:\\Users\\ghifarullah19\\Documents\\NetBeansProjects\\tech-in\\src\\main\\java\\id\\ac\\unpas\\techIn\\img\\grafik.png",
                207,
                806));
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();
        cobaShowPelanggan = new javax.swing.JButton();
        buttonPenjemputan = new javax.swing.JButton();
        buttonLacak = new javax.swing.JButton();
        iconTitle = new javax.swing.JLabel();
        buttonRiwayat = new javax.swing.JButton();
        iconMain = new javax.swing.JLabel();
        panelHome = new javax.swing.JPanel();
        panelTotalSampah = new javax.swing.JPanel();
        labelTotalSampah = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        iconTotalSampah = new javax.swing.JLabel();
        jumlahTotalSampah = new javax.swing.JLabel();
        panelTotalPermintaan = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        labelTotalPermintaan = new javax.swing.JLabel();
        iconTotalPermintaan = new javax.swing.JLabel();
        jumlahTotalPermintaan = new javax.swing.JLabel();
        panelGrafik = new javax.swing.JPanel();
        grafik = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonCRUD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(22, 72, 99));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        buttonHome.setBackground(new java.awt.Color(22, 72, 99));
        buttonHome.setForeground(new java.awt.Color(255, 255, 255));
        buttonHome.setText("Home");
        buttonHome.setBorderPainted(false);
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });

        cobaShowPelanggan.setBackground(new java.awt.Color(22, 72, 99));
        cobaShowPelanggan.setForeground(new java.awt.Color(255, 255, 255));
        cobaShowPelanggan.setText("Permintaan");
        cobaShowPelanggan.setBorderPainted(false);
        cobaShowPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobaShowPelangganActionPerformed(evt);
            }
        });

        buttonPenjemputan.setBackground(new java.awt.Color(22, 72, 99));
        buttonPenjemputan.setForeground(new java.awt.Color(255, 255, 255));
        buttonPenjemputan.setText("Penjemputan");
        buttonPenjemputan.setBorderPainted(false);
        buttonPenjemputan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPenjemputanActionPerformed(evt);
            }
        });

        buttonLacak.setBackground(new java.awt.Color(22, 72, 99));
        buttonLacak.setForeground(new java.awt.Color(255, 255, 255));
        buttonLacak.setText("Lacak");
        buttonLacak.setBorderPainted(false);
        buttonLacak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLacakActionPerformed(evt);
            }
        });

        iconTitle.setFont(new java.awt.Font("Kaushan Script", 0, 12)); // NOI18N
        iconTitle.setForeground(new java.awt.Color(255, 255, 255));
        iconTitle.setText("Recycle Bin");

        buttonRiwayat.setBackground(new java.awt.Color(22, 72, 99));
        buttonRiwayat.setForeground(new java.awt.Color(255, 255, 255));
        buttonRiwayat.setText("Riwayat");
        buttonRiwayat.setBorderPainted(false);
        buttonRiwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRiwayatActionPerformed(evt);
            }
        });

        iconMain.setText("iconMain");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(iconMain, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cobaShowPelanggan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPenjemputan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLacak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRiwayat)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iconMain, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconTitle)
                    .addComponent(buttonHome)
                    .addComponent(cobaShowPelanggan)
                    .addComponent(buttonPenjemputan)
                    .addComponent(buttonLacak)
                    .addComponent(buttonRiwayat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelHome.setBackground(new java.awt.Color(204, 204, 204));

        panelTotalSampah.setBackground(new java.awt.Color(255, 255, 255));
        panelTotalSampah.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        panelTotalSampah.setPreferredSize(new java.awt.Dimension(295, 120));

        labelTotalSampah.setBackground(new java.awt.Color(51, 153, 255));
        labelTotalSampah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTotalSampah.setForeground(new java.awt.Color(22, 72, 99));
        labelTotalSampah.setText("Total Sampah didapat");

        iconTotalSampah.setText("iconTotalSampah");

        jumlahTotalSampah.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jumlahTotalSampah.setForeground(new java.awt.Color(22, 72, 99));
        jumlahTotalSampah.setText("jumlahTotalSampah");

        javax.swing.GroupLayout panelTotalSampahLayout = new javax.swing.GroupLayout(panelTotalSampah);
        panelTotalSampah.setLayout(panelTotalSampahLayout);
        panelTotalSampahLayout.setHorizontalGroup(
            panelTotalSampahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(panelTotalSampahLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTotalSampahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotalSampah)
                    .addGroup(panelTotalSampahLayout.createSequentialGroup()
                        .addComponent(iconTotalSampah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jumlahTotalSampah)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTotalSampahLayout.setVerticalGroup(
            panelTotalSampahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalSampahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTotalSampah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelTotalSampahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTotalSampahLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jumlahTotalSampah)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelTotalSampahLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconTotalSampah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        panelTotalPermintaan.setBackground(new java.awt.Color(255, 255, 255));
        panelTotalPermintaan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        panelTotalPermintaan.setPreferredSize(new java.awt.Dimension(295, 120));

        labelTotalPermintaan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTotalPermintaan.setForeground(new java.awt.Color(22, 72, 99));
        labelTotalPermintaan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTotalPermintaan.setText("Jumlah Permintaan Penjemputan Sampah");

        iconTotalPermintaan.setText("iconTotalPermintaan");

        jumlahTotalPermintaan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jumlahTotalPermintaan.setForeground(new java.awt.Color(22, 72, 99));
        jumlahTotalPermintaan.setText("jumlahTotalPermintaan");

        javax.swing.GroupLayout panelTotalPermintaanLayout = new javax.swing.GroupLayout(panelTotalPermintaan);
        panelTotalPermintaan.setLayout(panelTotalPermintaanLayout);
        panelTotalPermintaanLayout.setHorizontalGroup(
            panelTotalPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalPermintaanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTotalPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotalPermintaan)
                    .addGroup(panelTotalPermintaanLayout.createSequentialGroup()
                        .addComponent(iconTotalPermintaan, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jumlahTotalPermintaan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelTotalPermintaanLayout.setVerticalGroup(
            panelTotalPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalPermintaanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTotalPermintaan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelTotalPermintaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTotalPermintaanLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jumlahTotalPermintaan)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTotalPermintaanLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconTotalPermintaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        panelGrafik.setBackground(new java.awt.Color(255, 255, 255));
        panelGrafik.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));

        grafik.setText("grafik");

        javax.swing.GroupLayout panelGrafikLayout = new javax.swing.GroupLayout(panelGrafik);
        panelGrafik.setLayout(panelGrafikLayout);
        panelGrafikLayout.setHorizontalGroup(
            panelGrafikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grafik, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        panelGrafikLayout.setVerticalGroup(
            panelGrafikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grafik, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(22, 72, 99));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 72, 99));
        jLabel1.setText("Jumlah Penjemputan Sampah per Bulan");

        buttonCRUD.setText("CRUD");
        buttonCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCRUDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCRUD))
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addComponent(panelTotalSampah, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(panelTotalPermintaan, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelGrafik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buttonCRUD))
                .addGap(18, 18, 18)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTotalSampah, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(panelTotalPermintaan, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGrafik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRiwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRiwayatActionPerformed
        // TODO add your handling code here:
        riwayatDao = new RiwayatDao();
        riwayatFrame = new RiwayatFrame(riwayatDao);
        riwayatFrame.setVisible(true);
    }//GEN-LAST:event_buttonRiwayatActionPerformed

    private void cobaShowPelangganActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cobaShowPelangganActionPerformed
        // TODO add your handling code here:
        pelangganDao = new PelangganDao();
        permintaanDao = new PermintaanDao();
        // menampilkan frame jenis member dengan parameter jenisMemberDao
        pelangganFrame = new PelangganFrame(pelangganDao);
        permintaanFrame = new PermintaanFrame(permintaanDao);

        // frame jenis member akan ditampilkan
        permintaanFrame.setVisible(true);
        // panelHome.add(permintaanFrame.getPermintaan());
    }// GEN-LAST:event_cobaShowPelangganActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonHomeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_buttonHomeActionPerformed

    private void buttonLacakActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonLacakActionPerformed
        // TODO add your handling code here:
        lacakDao = new LacakDao();
        // menampilkan frame jenis member dengan parameter jenisMemberDao
        lacakFrame = new LacakFrame(lacakDao);
        lacakFrame.setVisible(true);
    }// GEN-LAST:event_buttonLacakActionPerformed

    private void buttonCRUDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonCRUDActionPerformed
        // TODO add your handling code here:
        MenuCRUD menuCRUD = new MenuCRUD();
        menuCRUD.setVisible(true);
    }// GEN-LAST:event_buttonCRUDActionPerformed

    private void buttonPenjemputanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonPenjemputanActionPerformed
        // TODO add your handling code here:
        penjemputanDao = new PenjemputanDao();
        penjemputanFrame = new PenjemputanFrame(penjemputanDao);
        penjemputanFrame.setVisible(true);
    }// GEN-LAST:event_buttonPenjemputanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCRUD;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonLacak;
    private javax.swing.JButton buttonPenjemputan;
    private javax.swing.JButton buttonRiwayat;
    private javax.swing.JButton cobaShowPelanggan;
    private javax.swing.JLabel grafik;
    private javax.swing.JLabel iconMain;
    private javax.swing.JLabel iconTitle;
    private javax.swing.JLabel iconTotalPermintaan;
    private javax.swing.JLabel iconTotalSampah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jumlahTotalPermintaan;
    private javax.swing.JLabel jumlahTotalSampah;
    private javax.swing.JLabel labelTotalPermintaan;
    private javax.swing.JLabel labelTotalSampah;
    private javax.swing.JPanel panelGrafik;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelTotalPermintaan;
    private javax.swing.JPanel panelTotalSampah;
    // End of variables declaration//GEN-END:variables
}
