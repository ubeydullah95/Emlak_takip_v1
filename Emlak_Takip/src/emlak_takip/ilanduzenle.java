/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emlak_takip;

import static emlak_takip.musteriler.harftestYap;
import static emlak_takip.musteriler.sayitestYap;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ilanduzenle extends javax.swing.JFrame {

    public ilanlar parent;

    TabloBilgisi tb = new TabloBilgisi();
    VeriTabani veri = new VeriTabani();

    public ilanduzenle() {
        initComponents();
        this.getContentPane().setBackground(Color.darkGray);
        tb.IlanTablosu(tb_ilanlar);
        cb_durum.addItem("Satilik");
        cb_durum.addItem("Kiralik");
        cb_tip.addItem("Daire");
        cb_tip.addItem("Müstakil");
        cb_tip.addItem("Apart");
        cb_tip.addItem("Villa");
        cb_tip.addItem("Yali");
        cb_tur.addItem("Soba");
        cb_tur.addItem("Kombi");
        cb_tur.addItem("Merkezi Sistem");
        cb_tur.addItem("Merkezi Pay Ölçer");
        cb_diger1.addItem("Alarm");
        cb_diger1.addItem("Havuz");
        cb_diger1.addItem("Güvenlik");
        cb_diger2.addItem("Alarm");
        cb_diger2.addItem("Havuz");
        cb_diger2.addItem("Güvenlik");
        cb_diger3.addItem("Alarm");
        cb_diger3.addItem("Havuz");
        cb_diger3.addItem("Güvenlik");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_fiyat = new javax.swing.JTextField();
        cb_tur = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cb_diger1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_aciklama = new javax.swing.JTextArea();
        cb_diger2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_yas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_metrekare = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_oda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_salon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cb_durum = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        chb_esya = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_adres = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        cb_tip = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cb_diger3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        bt_duzenle = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_ilanlar = new javax.swing.JTable();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EMLAK TAKİP SİSTEMİ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Diğer Özellik 1:");

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Diğer Özellik 2:");

        txt_fiyat.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N

        cb_tur.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        cb_tur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Açıklama");

        cb_diger1.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        cb_diger1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        txt_aciklama.setColumns(20);
        txt_aciklama.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        txt_aciklama.setRows(5);
        jScrollPane1.setViewportView(txt_aciklama);

        cb_diger2.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        cb_diger2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Eşya");

        txt_yas.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        txt_yas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_yasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Metrekare:");

        txt_metrekare.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Oda Sayısı:");

        txt_oda.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Salon Sayısı:");

        txt_salon.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        txt_salon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bina Yaşı:");

        cb_durum.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        cb_durum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Isıtma Türü:");

        chb_esya.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        chb_esya.setForeground(new java.awt.Color(255, 255, 255));
        chb_esya.setText("Evet");

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Adres");

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Emlak Durumu");

        txt_adres.setColumns(20);
        txt_adres.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        txt_adres.setRows(5);
        jScrollPane2.setViewportView(txt_adres);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Emlak Tipi");

        cb_tip.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        cb_tip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Diğer Özellik 3:");

        cb_diger3.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        cb_diger3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fiyat");

        bt_duzenle.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        bt_duzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emlak_takip/icons8-edit-50.png"))); // NOI18N
        bt_duzenle.setText("İlan Düzenle");
        bt_duzenle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_duzenleMouseClicked(evt);
            }
        });
        bt_duzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_duzenleActionPerformed(evt);
            }
        });

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
        jScrollPane3.setViewportView(tb_ilanlar);

        label1.setBackground(java.awt.Color.darkGray);
        label1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("İLAN DÜZENLE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_metrekare, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_oda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_salon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_durum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_tip, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_diger2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_diger1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11)
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel12)
                        .addGap(20, 20, 20)
                        .addComponent(cb_diger3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txt_yas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cb_tur, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chb_esya))
                        .addGap(310, 310, 310)
                        .addComponent(bt_duzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_metrekare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txt_oda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txt_salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel13)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cb_durum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cb_tip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_diger1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(cb_diger2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(cb_diger3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_yas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_duzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_tur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(chb_esya))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_yasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_yasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yasActionPerformed

    private void txt_salonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salonActionPerformed
    public void ilangetir(int ilan_id) {

    }
    private void bt_duzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_duzenleActionPerformed


    }//GEN-LAST:event_bt_duzenleActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        ilanlar yeni = new ilanlar();

        yeni.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void bt_duzenleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_duzenleMouseClicked
      if(txt_fiyat.getText().length()==0 ||txt_metrekare.getText().length()==0 || txt_oda.getText().length()==0 || txt_yas.getText().length()==0)
      {
          JOptionPane.showMessageDialog(null,"Alanlar Boş Olamaz");
      }
        else if(!(sayitestYap(txt_fiyat.getText())))
       {
           JOptionPane.showMessageDialog(null,"Lütfen Fiyat alanına harf girmeyiniz!!!");
           
       }
       
       else if(!(sayitestYap(txt_metrekare.getText())))
                {
                     JOptionPane.showMessageDialog(null,"Lütfen MetreKare alanına harf girmeyiniz!!!");

                }
       else if(!(sayitestYap(txt_oda.getText())))
                {
                     JOptionPane.showMessageDialog(null,"Lütfen Oda sayısı alanına harf girmeyiniz!!!");

                }
       else if(!(sayitestYap(txt_yas.getText())))
                {
                     JOptionPane.showMessageDialog(null,"Lütfen Bina yaşı alanına harf girmeyiniz!!!");

                }
       else
       {
        int row = tb_ilanlar.getSelectedRow();
        int col = 0;
        int id = (int) tb_ilanlar.getValueAt(row, col);

        String durum = String.valueOf(cb_durum.getSelectedItem());
        String tip = String.valueOf(cb_tip.getSelectedItem());
        String d1 = String.valueOf(cb_diger1.getSelectedItem());
        String d2 = String.valueOf(cb_diger2.getSelectedItem());
        String d3 = String.valueOf(cb_diger3.getSelectedItem());
        String isitma = String.valueOf(cb_tur.getSelectedItem());
        boolean drm = chb_esya.isSelected();
        
      


        veri.IlanGunclle(id, durum, tip, Integer.parseInt(txt_fiyat.getText()), Integer.parseInt(txt_metrekare.getText()), Integer.parseInt(txt_oda.getText()), Integer.parseInt(txt_salon.getText()), Integer.parseInt(txt_yas.getText()), isitma, drm, txt_adres.getText(), txt_aciklama.getText(), true, d1, d2, d3);

        tb.IlanTablosu(tb_ilanlar);
       }
    }//GEN-LAST:event_bt_duzenleMouseClicked

    private void tb_ilanlarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ilanlarMouseClicked
        // TODO add your handling code here:
        
        int row = tb_ilanlar.getSelectedRow();
        int col = 0;
        int id = (int) tb_ilanlar.getValueAt(row, col);
        cb_durum.setSelectedItem((String) tb_ilanlar.getValueAt(row, 1));
        cb_tip.setSelectedItem((String) tb_ilanlar.getValueAt(row, 2));
        cb_diger1.setSelectedItem((String) tb_ilanlar.getValueAt(row, 13));
        cb_diger2.setSelectedItem((String) tb_ilanlar.getValueAt(row, 14));
        cb_diger3.setSelectedItem((String) tb_ilanlar.getValueAt(row, 15));
        ///// deiger özelliklere yok eklenmeli....
        cb_tur.setSelectedItem((String) tb_ilanlar.getValueAt(row, 9));
        Object valueAt = tb_ilanlar.getValueAt(row,10);
         String valuat = valueAt.toString();
       
         if("1".equals(valuat))
         {
            chb_esya.setSelected(true);
         }
         else
         {
              chb_esya.setSelected(false);
         }
         
        txt_fiyat.setText(String.valueOf(tb_ilanlar.getValueAt(row, 3)));
        txt_aciklama.setText(String.valueOf(tb_ilanlar.getValueAt(row, 12)));
        txt_adres.setText(String.valueOf(tb_ilanlar.getValueAt(row, 11)));
        txt_metrekare.setText(String.valueOf(tb_ilanlar.getValueAt(row, 4)));
        txt_oda.setText(String.valueOf(tb_ilanlar.getValueAt(row, 5)));
        txt_salon.setText(String.valueOf(tb_ilanlar.getValueAt(row, 6)));
        txt_yas.setText(String.valueOf(tb_ilanlar.getValueAt(row, 7)));

    }//GEN-LAST:event_tb_ilanlarMouseClicked

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
            java.util.logging.Logger.getLogger(ilanduzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ilanduzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ilanduzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ilanduzenle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ilanduzenle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_duzenle;
    private javax.swing.JComboBox<String> cb_diger1;
    private javax.swing.JComboBox<String> cb_diger2;
    private javax.swing.JComboBox<String> cb_diger3;
    private javax.swing.JComboBox<String> cb_durum;
    private javax.swing.JComboBox<String> cb_tip;
    private javax.swing.JComboBox<String> cb_tur;
    private javax.swing.JCheckBox chb_esya;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private javax.swing.JTable tb_ilanlar;
    private javax.swing.JTextArea txt_aciklama;
    private javax.swing.JTextArea txt_adres;
    private javax.swing.JTextField txt_fiyat;
    private javax.swing.JTextField txt_metrekare;
    private javax.swing.JTextField txt_oda;
    private javax.swing.JTextField txt_salon;
    private javax.swing.JTextField txt_yas;
    // End of variables declaration//GEN-END:variables

}
