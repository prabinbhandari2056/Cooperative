/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SupplierDetails;

import Home.Home;
import SupplierDetails.AddNewSupplier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import SupplierDetails.ViewSupplier;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class Supplier extends javax.swing.JFrame {

    /**
     * Creates new form Supplier
     */
    public Supplier() {
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

        jButtonAddNewSupplier = new javax.swing.JButton();
        jButtonViewSupplier = new javax.swing.JButton();
        jSupplierHead = new javax.swing.JLabel();
        jSupplier = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAddNewSupplier.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonAddNewSupplier.setText("Add New Supplier");
        jButtonAddNewSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewSupplierActionPerformed(evt);
            }
        });

        jButtonViewSupplier.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonViewSupplier.setText("View Supplier");
        jButtonViewSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewSupplierActionPerformed(evt);
            }
        });

        jSupplierHead.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jSupplierHead.setText("Pashupati Mahila Jibikoparjan Krishi Sahakari Sanstha");

        jSupplier.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jSupplier.setText("Supplier");

        jButtonBack.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSupplierHead)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSupplier)
                        .addGap(294, 294, 294))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonViewSupplier)
                            .addComponent(jButtonAddNewSupplier))
                        .addGap(253, 253, 253))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonBack)
                        .addGap(299, 299, 299))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jSupplierHead)
                .addGap(25, 25, 25)
                .addComponent(jSupplier)
                .addGap(25, 25, 25)
                .addComponent(jButtonAddNewSupplier)
                .addGap(15, 15, 15)
                .addComponent(jButtonViewSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButtonBack)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddNewSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewSupplierActionPerformed
        // Adding Supplier
        new AddNewSupplier().setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jButtonAddNewSupplierActionPerformed

    private void jButtonViewSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewSupplierActionPerformed
        // TODO add your handling code here:

        new ViewSupplier().setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jButtonViewSupplierActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        //Back to Home
        new Home().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddNewSupplier;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonViewSupplier;
    private javax.swing.JLabel jSupplier;
    private javax.swing.JLabel jSupplierHead;
    // End of variables declaration//GEN-END:variables
}
