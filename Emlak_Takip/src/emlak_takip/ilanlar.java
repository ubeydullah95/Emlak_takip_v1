/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emlak_takip;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class ilanlar extends javax.swing.JFrame {

  //  public Giris parent;
    
    public ilanekle parent;
    
    

    
    
     
    
    
    TabloBilgisi tb=new TabloBilgisi();
    public ilanlar() {
        initComponents();
        this.getContentPane().setBackground(Color.darkGray);
        tb.IlanTablosu(tb_ilanlar);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_ilanlar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_ilansil = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EMLAK TAKİP SİSTEMİ");

        tb_ilanlar.setBackground(java.awt.Color.lightGray);
        tb_ilanlar.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_ilanlar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ilanlarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_ilanlar);

        jButton1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emlak_takip/icons8-edit-50.png"))); // NOI18N
        jButton1.setText("İlan Düzenle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emlak_takip/icons8-ok-50.png"))); // NOI18N
        jButton2.setText("İlan Ekle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_ilansil.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btn_ilansil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emlak_takip/icons8-trash-50.png"))); // NOI18N
        btn_ilansil.setText("Seçili İlanı Sil");
        btn_ilansil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ilansilMouseClicked(evt);
            }
        });
        btn_ilansil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ilansilActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jButton4.setText("Satış - Kiralama");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        label1.setBackground(java.awt.Color.darkGray);
        label1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("İLANLAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btn_ilansil, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ilansil, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ilanekle yeni = new ilanekle();
      
       yeni.setVisible(true);
     this.setVisible(false);
       yeni.parent=this;
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ilanduzenle yeni = new ilanduzenle();
      
       yeni.setVisible(true);
      this.setVisible(false);
       yeni.parent=this;
    }//GEN-LAST:event_jButton1ActionPerformed
    VeriTabani veri=new VeriTabani();
    
    private void btn_ilansilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ilansilActionPerformed
       
     
    }//GEN-LAST:event_btn_ilansilActionPerformed
    public void versil(java.awt.event.MouseEvent evt)
    {
        
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        satis_kira yeni = new satis_kira();
      
       yeni.setVisible(true);
      this.setVisible(false);
       yeni.parent=this;
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void tb_ilanlarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ilanlarMouseClicked
        // TODO add your handling code here:
        
        int row = tb_ilanlar.rowAtPoint(evt.getPoint());
        int col = tb_ilanlar.columnAtPoint(evt.getPoint());
       
    }//GEN-LAST:event_tb_ilanlarMouseClicked

    private void btn_ilansilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ilansilMouseClicked
        // TODO add your handling code here:
        int row=tb_ilanlar.getSelectedRow();
        int col=0;
        int id=0;
        if(row>=0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult =JOptionPane.showConfirmDialog (null, "Müşteri bilğisi silinsin mi? ","Warning",dialogButton);
               if(dialogResult==0)
               {    id= (int) tb_ilanlar.getValueAt(row, col);
                      veri.IlanSil(id);
                      tb.IlanTablosu(tb_ilanlar);
               }
        }
        else
        {    
        JOptionPane.showMessageDialog(null,"Lütfen silmek istediniz ilanı seçiniz");
        }
        
        
       
        
    }//GEN-LAST:event_btn_ilansilMouseClicked
       
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
            java.util.logging.Logger.getLogger(ilanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ilanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ilanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ilanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ilanlar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ilansil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTable tb_ilanlar;
    // End of variables declaration//GEN-END:variables
}
