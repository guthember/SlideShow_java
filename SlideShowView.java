/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.slideshow;

import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author tanar
 */
public class SlideShowView extends javax.swing.JFrame {
    
    private ArrayList<ImageIcon> images;
    /**
     * Creates new form SlideShowView
     */
    public SlideShowView() {
        initComponents();
        
        // own file filter
        ImageFileFilter filter = new ImageFileFilter();
        fileChooserjFileChooser.setFileFilter(filter);
        images = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooserjFileChooser = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        imageLabeljLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        OpenjMenuItem = new javax.swing.JMenuItem();
        ExitjMenuItem = new javax.swing.JMenuItem();

        fileChooserjFileChooser.setAcceptAllFileFilterUsed(false);
        fileChooserjFileChooser.setCurrentDirectory(new java.io.File("C:\\Users\\guthe\\Pictures"));
        fileChooserjFileChooser.setMultiSelectionEnabled(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Slide Show");
        setLocationByPlatform(true);

        imageLabeljLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabeljLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imageLabeljLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imageLabeljLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imageLabeljLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imageLabeljLabelMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(imageLabeljLabel);

        jMenu1.setText("File");

        OpenjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        OpenjMenuItem.setText("Open");
        OpenjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenjMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(OpenjMenuItem);

        ExitjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        ExitjMenuItem.setText("Exit");
        ExitjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitjMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(ExitjMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenjMenuItemActionPerformed
        // TODO add your handling code here:

        if( fileChooserjFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            File[] files = fileChooserjFileChooser.getSelectedFiles();
       
            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                String path = file.getAbsolutePath();
                ImageIcon icon = new ImageIcon(path);
                images.add(icon);
            }
            
            ImageIcon imageicon =  images.get(0);
            imageLabeljLabel.setIcon(imageicon);
            
//            File file = files[0];
//            String path = file.getAbsolutePath();
//            ImageIcon icon = new ImageIcon(path);
//            imageLabeljLabel.setIcon(icon);
        }
    }//GEN-LAST:event_OpenjMenuItemActionPerformed

    private void ExitjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitjMenuItemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitjMenuItemActionPerformed

    private void imageLabeljLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabeljLabelMouseEntered
        // TODO add your handling code here:
        imageLabeljLabel.setEnabled(true);
    }//GEN-LAST:event_imageLabeljLabelMouseEntered

    private void imageLabeljLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabeljLabelMouseExited
        // TODO add your handling code here:
        imageLabeljLabel.setEnabled(false);
    }//GEN-LAST:event_imageLabeljLabelMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SlideShowView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlideShowView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlideShowView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlideShowView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlideShowView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExitjMenuItem;
    private javax.swing.JMenuItem OpenjMenuItem;
    private javax.swing.JFileChooser fileChooserjFileChooser;
    private javax.swing.JLabel imageLabeljLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
