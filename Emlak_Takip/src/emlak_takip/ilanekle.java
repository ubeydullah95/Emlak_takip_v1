/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emlak_takip;
import static emlak_takip.musteriler.harftestYap;
import static emlak_takip.musteriler.sayitestYap;
import java.awt.Color;
import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class ilanekle extends javax.swing.JFrame {

  /*  private final Connection conn = null; //Bağlantı nesnemiz
    private final String url = "jdbc:mysql://localhost:5004/";//veritabanının adresi ve portu
    private final String dbName = "emlak"; //veritabanının ismi
    private final String properties= "?useUnicode=true&characterEncoding=utf8"; //Türkçe karakter problemi yaşamamak için
    private final String driver = "com.mysql.jdbc.Driver";//MySQL-Java bağlantısını sağlayan JDBC sürücüsü
    private final String userName = "root"; //veritabanı için kullanıcı adı
    private final String password = "ubey"; //kullanıcı şifresi
    private ResultSet res; // sorgulardan dönecek kayıtlar (sonuç kümesi) bu nesne içerisinde tutulacak*/
    public ilanlar parent;
    public ilanekle() {
        initComponents();
        this.getContentPane().setBackground(Color.darkGray);
        cb_durum.addItem("Satilik");
        cb_durum.addItem("Kiralik");
        cb_tip.addItem("Daire");
        cb_tip.addItem("Müstakil");
        cb_tip.addItem("Apart");
        cb_tip.addItem("Villa");
        cb_tip.addItem("Yali");
        cb_isitma.addItem("Soba");
        cb_isitma.addItem("Kombi");
        cb_isitma.addItem("Merkezi Sistem");
        cb_isitma.addItem("Merkezi Pay Ölçer");
         cb_diger1.addItem("Yok");
        cb_diger1.addItem("Alarm");
        cb_diger1.addItem("Havuz");
        cb_diger1.addItem("Güvenlik");
        cb_diger2.addItem("Yok");
        cb_diger2.addItem("Alarm");
        cb_diger2.addItem("Havuz");        
        cb_diger2.addItem("Güvenlik");
        cb_diger3.addItem("Yok");
        cb_diger3.addItem("Alarm");
        cb_diger3.addItem("Havuz");
        cb_diger3.addItem("Güvenlik");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_tip = new javax.swing.JComboBox<>();
        cb_diger3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_fiyat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_aciklama = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txt_yas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_metre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_oda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cb_durum = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        chb_esya = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_adres = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cb_isitma = new javax.swing.JComboBox<>();
        cb_diger1 = new javax.swing.JComboBox<>();
        cb_diger2 = new javax.swing.JComboBox<>();
        btn_ekle = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txt_kat = new javax.swing.JTextField();
        txt_salon = new javax.swing.JTextField();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EMLAK TAKİP SİSTEMİ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Emlak Durumu");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Emlak Tipi");

        cb_tip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        cb_diger3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Fiyat*");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Açıklama");

        txt_aciklama.setColumns(20);
        txt_aciklama.setRows(5);
        jScrollPane1.setViewportView(txt_aciklama);

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Eşya");

        txt_yas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_yasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Metrekare*:");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Oda Sayısı*:");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Salon Sayısı*:");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Bina Yaşı:");

        cb_durum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Isıtma Türü:");

        chb_esya.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        chb_esya.setForeground(java.awt.Color.white);
        chb_esya.setText("Evet");

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("Adres:");

        txt_adres.setColumns(20);
        txt_adres.setRows(5);
        jScrollPane2.setViewportView(txt_adres);

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Diğer Özellik 3:");

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Diğer Özellik 1:");

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Diğer Özellik 2:");

        cb_isitma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        cb_diger1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        cb_diger2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        btn_ekle.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btn_ekle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emlak_takip/icons8-ok-50.png"))); // NOI18N
        btn_ekle.setText("İlan Ekle");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("Bulundugu Kat* :");

        txt_kat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_katActionPerformed(evt);
            }
        });

        txt_salon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salonActionPerformed(evt);
            }
        });

        label1.setBackground(java.awt.Color.darkGray);
        label1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("İLAN EKLE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 397, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_yas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_salon)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txt_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_metre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_oda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cb_tip, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cb_durum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(1, 1, 1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(chb_esya))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(cb_isitma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_kat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(69, 132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_diger3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cb_diger2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cb_diger1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_durum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_tip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_metre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_oda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_yas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_kat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_isitma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(54, 54, 54))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cb_diger1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cb_diger2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cb_diger3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chb_esya)
                    .addComponent(btn_ekle))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   //baglati veri=new baglati();
    
    private void txt_yasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_yasActionPerformed
       
    }//GEN-LAST:event_txt_yasActionPerformed

    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed
        if(txt_fiyat.getText().length()==0 ||txt_metre.getText().length()==0 || txt_oda.getText().length()==0 || txt_yas.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null,"Alanlar Boş Olamaz");
            }  
        else if(!(sayitestYap(txt_fiyat.getText())))
            {
                JOptionPane.showMessageDialog(null,"Lütfen Fiyat alanına harf girmeyiniz!!!");
           
            }
       else  if(!(sayitestYap(txt_kat.getText())))
            {
                JOptionPane.showMessageDialog(null,"Lütfen Bulunduğu Kat alanına harf girmeyiniz!!!");

            }
       else if(!(sayitestYap(txt_metre.getText())))
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
                VeriTabani veri=new VeriTabani();     
                String durum=String.valueOf(cb_durum.getSelectedItem());
                String tip=String.valueOf(cb_tip.getSelectedItem());
                String d1=String.valueOf(cb_diger1.getSelectedItem());
                String d2=String.valueOf(cb_diger2.getSelectedItem());
                String d3=String.valueOf(cb_diger3.getSelectedItem());
                String isitma=String.valueOf(cb_isitma.getSelectedItem());
                boolean drm=false;
                if (chb_esya.isSelected()==true)
                    {
                        drm=true;
                    }       
                try
                    {
                         //durum, tip,fiyat,metrekare,oda_sayisi,salon_sayisi,bina_yasi,kat,isitma_turu,esya, adres,aciklama,aktif,d1,d2,d3
                        veri.KayitEkle(durum,tip,Integer.parseInt(txt_fiyat.getText()),Integer.parseInt(txt_metre.getText()),Integer.parseInt(txt_oda.getText()),Integer.parseInt(txt_salon.getText()),Integer.parseInt(txt_yas.getText()),Integer.parseInt(txt_kat.getText()),isitma,drm,txt_adres.getText(),txt_aciklama.getText(),true,d1,d2,d3);
                    }
                catch (SQLException ex)
                    {
                        Logger.getLogger(ilanekle.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
        
                txt_fiyat.setText("");
                txt_aciklama.setText("");
                txt_adres.setText("");
                txt_kat.setText("");
                txt_metre.setText("");
                txt_oda.setText("");
                txt_salon.setText("");
                txt_yas.setText("");
       
        }
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void txt_katActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_katActionPerformed
       
    }//GEN-LAST:event_txt_katActionPerformed

    private void txt_salonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salonActionPerformed
        
    }//GEN-LAST:event_txt_salonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
         ilanlar yeni = new ilanlar();
      
         yeni.setVisible(true);
    
         yeni.parent=this;
    }//GEN-LAST:event_formWindowClosed

    
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(ilanekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ilanekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ilanekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ilanekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() -> {
            new ilanekle().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ekle;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> cb_diger1;
    private javax.swing.JComboBox<String> cb_diger2;
    private javax.swing.JComboBox<String> cb_diger3;
    private javax.swing.JComboBox<String> cb_durum;
    private javax.swing.JComboBox<String> cb_isitma;
    private javax.swing.JComboBox<String> cb_tip;
    private javax.swing.JCheckBox chb_esya;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private java.awt.Label label1;
    private javax.swing.JTextArea txt_aciklama;
    private javax.swing.JTextArea txt_adres;
    private javax.swing.JTextField txt_fiyat;
    private javax.swing.JTextField txt_kat;
    private javax.swing.JTextField txt_metre;
    private javax.swing.JTextField txt_oda;
    private javax.swing.JTextField txt_salon;
    private javax.swing.JTextField txt_yas;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
