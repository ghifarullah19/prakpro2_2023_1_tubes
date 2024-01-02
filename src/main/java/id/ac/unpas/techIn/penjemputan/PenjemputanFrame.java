/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.unpas.techIn.penjemputan;

import id.ac.unpas.techIn.penjemputan.*;
import java.util.List;
import id.ac.unpas.techIn.dao.PenjemputanDao;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author ghifarullah19
 */
public class PenjemputanFrame
        extends javax.swing.JFrame {
    
    // jenisMemberList adalah variabel yang digunakan untuk menyimpan data jenis member
    private List<Penjemputan> penjemputanList;
    
    // jenisMemberDao adalah variabel yang digunakan untuk menyimpan data jenis member yang didapat dari database
    private PenjemputanDao penjemputanDao;

    /**
     * Creates new form PermintaanFrame2
     */
    public PenjemputanFrame(PenjemputanDao penjemputanDao) {
        // this.jenisMemberDao diberikan nilai dari parameter jenisMemberDao
        this.penjemputanDao = penjemputanDao;
        // this.jenisMemberList diberikan nilai dari data jenis member yang didapat dari database
        this.penjemputanList = this.penjemputanDao.findAll();
        
        initComponents();
        
//        showPermintaanPane.setLayout(new BoxLayout(showPermintaanPane, BoxLayout.PAGE_AXIS));
        showPenjemputanPane.setLayout(new GridLayout(penjemputanList.size(), 1, 0, 10));
        
        for (int i = 0; i < penjemputanList.size(); i++) {
            JPanel panel = new JPanel();
            PenjemputanCard penjemputan = new PenjemputanCard();
            penjemputan.setPanelData(penjemputanList.get(i));
            panel.setBackground(new Color(0,0,0,0));
            panel.add(penjemputan.getFrame());
            showPenjemputanPane.add(panel);
        }
        showPenjemputanScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPenjemputan = new javax.swing.JPanel();
        panelTitlePenjemputan = new javax.swing.JPanel();
        labelTitlePenjemputan = new javax.swing.JLabel();
        showPenjemputanScrollPane = new javax.swing.JScrollPane();
        showPenjemputanPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelPenjemputan.setBackground(new java.awt.Color(102, 204, 255));

        panelTitlePenjemputan.setBackground(new java.awt.Color(51, 153, 255));

        labelTitlePenjemputan.setText("Recylce Bin");

        javax.swing.GroupLayout panelTitlePenjemputanLayout = new javax.swing.GroupLayout(panelTitlePenjemputan);
        panelTitlePenjemputan.setLayout(panelTitlePenjemputanLayout);
        panelTitlePenjemputanLayout.setHorizontalGroup(
            panelTitlePenjemputanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitlePenjemputanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitlePenjemputan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTitlePenjemputanLayout.setVerticalGroup(
            panelTitlePenjemputanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitlePenjemputanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitlePenjemputan)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        showPenjemputanPane.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout showPenjemputanPaneLayout = new javax.swing.GroupLayout(showPenjemputanPane);
        showPenjemputanPane.setLayout(showPenjemputanPaneLayout);
        showPenjemputanPaneLayout.setHorizontalGroup(
            showPenjemputanPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
        );
        showPenjemputanPaneLayout.setVerticalGroup(
            showPenjemputanPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        showPenjemputanScrollPane.setViewportView(showPenjemputanPane);

        javax.swing.GroupLayout panelPenjemputanLayout = new javax.swing.GroupLayout(panelPenjemputan);
        panelPenjemputan.setLayout(panelPenjemputanLayout);
        panelPenjemputanLayout.setHorizontalGroup(
            panelPenjemputanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitlePenjemputan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(showPenjemputanScrollPane)
        );
        panelPenjemputanLayout.setVerticalGroup(
            panelPenjemputanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPenjemputanLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelTitlePenjemputan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showPenjemputanScrollPane))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPenjemputan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPenjemputan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelTitlePenjemputan;
    private javax.swing.JPanel panelPenjemputan;
    private javax.swing.JPanel panelTitlePenjemputan;
    private javax.swing.JPanel showPenjemputanPane;
    private javax.swing.JScrollPane showPenjemputanScrollPane;
    // End of variables declaration//GEN-END:variables
}
