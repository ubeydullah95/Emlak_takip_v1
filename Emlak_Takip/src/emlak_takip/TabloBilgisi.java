
package emlak_takip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TabloBilgisi {
    public JTable IlanTablosu(JTable a){
         try {
            Class.forName("com.mysql.jdbc.Driver");
               com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/emlak", "root", "1234"); //Mysql sunucusuna bağlandık
            com.mysql.jdbc.Statement st = (com.mysql.jdbc.Statement) con.createStatement();
            try (ResultSet rs = st.executeQuery("Select ilan_id,durum,tip,fiyat,metrekare,oda_sayisi,salon_sayisi,bina_yasi,kat,isitma_turu,esya,adres,aciklama,d1,d2,d3 from ilanlar WHERE aktif=1")) { //Veritabanındaki tabloya bağlandık
                int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
                DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
      
                    tm.addColumn("İlan No"); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
                     tm.addColumn("İşlem Türü");
                      tm.addColumn("Tipi");
                       tm.addColumn("Fiyatı");
                        tm.addColumn("Metre Karesi");
                         tm.addColumn("Oda Sayısı");
                          tm.addColumn("Salon Sayısı");
                           tm.addColumn("Bina Yaşı");
                            tm.addColumn("Bulunduğu Kat");
                             tm.addColumn("Isıtma Türü");
                              tm.addColumn("Eşya Durumu");
                               tm.addColumn("Adresi");
                                tm.addColumn("Açıklama");
                                 tm.addColumn("Özellik");
                                  tm.addColumn("Özellik");
                                   tm.addColumn("Özellik");
                               
                while(rs.next())
                    {
                        Object[] row = new Object[colcount];
                        for(int i=1;i<=colcount;i++)
                            row[i-1] = rs.getObject(i);
                        tm.addRow(row);
                    }
                a.setModel(tm);



            }
            con.close();
        } catch (ClassNotFoundException | SQLException hata) {
            Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, hata);
        }
        return null;

    }
    public JTable MusteriTablosu(JTable b){
          try {
        Class.forName("com.mysql.jdbc.Driver");
           com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/emlak", "root", "1234"); //Mysql sunucusuna bağlandık
        com.mysql.jdbc.Statement st = (com.mysql.jdbc.Statement) con.createStatement();
        try (ResultSet rs = st.executeQuery("Select * from musteriler")) { //Veritabanındaki tabloya bağlandık
            int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
            DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
            
                tm.addColumn("Müşteri No"); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
                tm.addColumn("Adı");
                tm.addColumn("Soyadı");
                tm.addColumn("Mail");
                tm.addColumn("Telefon No");
            while(rs.next())
                {
                    Object[] row = new Object[colcount];
                    for(int i=1;i<=colcount;i++)
                        row[i-1] = rs.getObject(i);
                        
                    tm.addRow(row);
                    
                }
            
            b.setModel(tm);
            
                
            
        }
        con.close();
    } catch (ClassNotFoundException | SQLException hata) {
        Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, hata);
    }
        return null;
        
    }
    public JTable KayitlarTablosu(JTable c){
        
         try {
        Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/emlak","root","1234"); //Mysql sunucusuna bağlandık
        Statement st = (Statement) con.createStatement();
        try (ResultSet rs = st.executeQuery("Select * from kayitlar")) { //Veritabanındaki tabloya bağlandık
            int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
            DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
            for(int i = 1;i<=colcount;i++)
                tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
            while(rs.next())
                {
                    Object[] row = new Object[colcount];
                    for(int i=1;i<=colcount;i++)
                        row[i-1] = rs.getObject(i);
                    tm.addRow(row);
                }
            c.setModel(tm);
        }
        
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(musteriler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(musteriler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
        
        
    
  
    }
   public JTable emlaktipinegore(JTable d)
      {
      try {
        Class.forName("com.mysql.jdbc.Driver");
           com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/emlak", "root", "1234"); //Mysql sunucusuna bağlandık
        com.mysql.jdbc.Statement st = (com.mysql.jdbc.Statement) con.createStatement();
        try (ResultSet rs = st.executeQuery("Select * from emlak_tipine_gore")) { //Veritabanındaki tabloya bağlandık
            int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
            DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
            for(int i = 1;i<=colcount;i++)
                tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
            while(rs.next())
                {
                    Object[] row = new Object[colcount];
                    for(int i=1;i<=colcount;i++)
                        row[i-1] = rs.getObject(i);
                    tm.addRow(row);
                }
            d.setModel(tm);
            
                
            
        }
        con.close();
    } catch (ClassNotFoundException | SQLException hata) {
        Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, hata);
    }
        return null;
      
      }
     public JTable isitma_turune_gore(JTable f){
          try {
        Class.forName("com.mysql.jdbc.Driver");
           com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/emlak", "root", "1234"); //Mysql sunucusuna bağlandık
        com.mysql.jdbc.Statement st = (com.mysql.jdbc.Statement) con.createStatement();
        try (ResultSet rs = st.executeQuery("Select * from isitma_turune_gore")) { //Veritabanındaki tabloya bağlandık
            int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
            DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
            for(int i = 1;i<=colcount;i++)
                tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
            while(rs.next())
                {
                    Object[] row = new Object[colcount];
                    for(int i=1;i<=colcount;i++)
                        row[i-1] = rs.getObject(i);
                    tm.addRow(row);
                }
            f.setModel(tm);
            
                
            
        }
        con.close();
    } catch (ClassNotFoundException | SQLException hata) {
        Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, hata);
    }
        return null;
         
     }
     public JTable kiralanan_emlak (JTable e)
     {
         try {
        Class.forName("com.mysql.jdbc.Driver");
           com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/emlak", "root", "1234"); //Mysql sunucusuna bağlandık
        com.mysql.jdbc.Statement st = (com.mysql.jdbc.Statement) con.createStatement();
        try (ResultSet rs = st.executeQuery("Select * from kiralanan_ilan")) { //Veritabanındaki tabloya bağlandık
            int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
            DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
            for(int i = 1;i<=colcount;i++)
                tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
            while(rs.next())
                {
                    Object[] row = new Object[colcount];
                    for(int i=1;i<=colcount;i++)
                        row[i-1] = rs.getObject(i);
                    tm.addRow(row);
                }
            e.setModel(tm);
            
                
            
        }
        con.close();
    } catch (ClassNotFoundException | SQLException hata) {
        Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, hata);
    }
        return null;
     
     }
     public JTable kiralik_emlak(JTable g)
     {
         try {
        Class.forName("com.mysql.jdbc.Driver");
           com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/emlak", "root", "1234"); //Mysql sunucusuna bağlandık
        com.mysql.jdbc.Statement st = (com.mysql.jdbc.Statement) con.createStatement();
        try (ResultSet rs = st.executeQuery("Select * from kiralik_ilan")) { //Veritabanındaki tabloya bağlandık
            int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
            DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
            for(int i = 1;i<=colcount;i++)
                tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
            while(rs.next())
                {
                    Object[] row = new Object[colcount];
                    for(int i=1;i<=colcount;i++)
                        row[i-1] = rs.getObject(i);
                    tm.addRow(row);
                }
            g.setModel(tm);
            
                
            
        }
        con.close();
    } catch (ClassNotFoundException | SQLException hata) {
        Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, hata);
    }
        return null;
     }
     public JTable satilan_emlak(JTable h)
     {
          try {
        Class.forName("com.mysql.jdbc.Driver");
           com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/emlak", "root", "1234"); //Mysql sunucusuna bağlandık
        com.mysql.jdbc.Statement st = (com.mysql.jdbc.Statement) con.createStatement();
        try (ResultSet rs = st.executeQuery("Select * from satilan_ilan")) { //Veritabanındaki tabloya bağlandık
            int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
            DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
            for(int i = 1;i<=colcount;i++)
                tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
            while(rs.next())
                {
                    Object[] row = new Object[colcount];
                    for(int i=1;i<=colcount;i++)
                        row[i-1] = rs.getObject(i);
                    tm.addRow(row);
                }
            h.setModel(tm);
            
                
            
        }
        con.close();
    } catch (ClassNotFoundException | SQLException hata) {
        Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, hata);
    }
        return null;
     }
     public JTable satilik_emlak(JTable k)
     {
          try {
        Class.forName("com.mysql.jdbc.Driver");
           com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/emlak", "root", "1234"); //Mysql sunucusuna bağlandık
        com.mysql.jdbc.Statement st = (com.mysql.jdbc.Statement) con.createStatement();
        try (ResultSet rs = st.executeQuery("Select * from satilik_ilan")) { //Veritabanındaki tabloya bağlandık
            int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
            DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
            for(int i = 1;i<=colcount;i++)
                tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
            while(rs.next())
                {
                    Object[] row = new Object[colcount];
                    for(int i=1;i<=colcount;i++)
                        row[i-1] = rs.getObject(i);
                    tm.addRow(row);
                }
            k.setModel(tm);
            
                
            
        }
        con.close();
    } catch (ClassNotFoundException | SQLException hata) {
        Logger.getLogger(ilanlar.class.getName()).log(Level.SEVERE, null, hata);
    }
        return null;
     }
    }

