
package emlak_takip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class VeriTabani {
    public int KayitEkle(String durum, String tip, int fiyat,int metrekare,int oda_sayisi,int salon_sayisi,int bina_yasi,int kat,String isitma_turu,boolean esya, String adres,String aciklama,boolean aktif,String d1,String d2,String d3) throws SQLException {
           
             try {          
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = null;
                Statement st = null;
                ResultSet rs = null;

                con = DriverManager.getConnection("jdbc:mysql://localhost/emlak","root","1234");
                
                st =(Statement) con.createStatement();
            
                 
               String sql= "INSERT INTO ilanlar (durum, tip,fiyat,metrekare,oda_sayisi,salon_sayisi,bina_yasi,kat,isitma_turu,esya, adres,aciklama,aktif,d1,d2,d3,musteri_id,musteriler_musteri_Id) VALUES (" +
                    "'" + durum + "', " + "'" + tip + "', " + fiyat + ", " +
                    "" + metrekare + ", " +
                    "" + oda_sayisi + ", " +
                    "" + salon_sayisi + ", " +
                    "" + bina_yasi + ", " +
                    "" + kat + ", " +
                    "'" + isitma_turu + "', " +
                    "" + esya + ", " +
                    "'" + adres + "', " +
                    "'" + aciklama + "', " +
                    "" + aktif + ", " +
                    "'" + d1 + "', " +
                    "'" + d2 + "', " +
                    "'" + d3 + "',1,1)";

                st.executeUpdate(sql); 
                JOptionPane.showMessageDialog(null," İlan Bilgisi Eklenmiştir.");
               
                   }
       catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } 
        return 1;
       
        
    }

    public int IlanSil(int id){
         try{
           
            
            
            
             Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
                Statement st = null;
                ResultSet rs = null;
                con = DriverManager.getConnection("jdbc:mysql://localhost/emlak","root","1234");
                st =(Statement) con.createStatement();
                String sql="DELETE FROM `ilanlar` WHERE ilan_id="+id;
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"İlan Bilgisi Silinmiştir");
                
                
        } catch (ClassNotFoundException ex) 
            {
            Logger.getLogger(musteriler.class.getName()).log(Level.SEVERE, null, ex);
            
            } 
         catch (SQLException ex) 
         {
            Logger.getLogger(VeriTabani.class.getName()).log(Level.SEVERE, null, ex);
            if(ex.getErrorCode()==1451)
                    {
                         
                           JOptionPane.showMessageDialog(null, "İşlem görmüş ilan silinemez!!!", "UYARI", 0);
                    }
        }
        return 1;
    }
    
    public int IlanGunclle(int id,String durum, String tip, int fiyat,int metrekare,int oda_sayisi,int salon_sayisi,int bina_yasi,String isitma_turu,boolean esya, String adres,String aciklama,boolean aktif,String d1,String d2,String d3){
        
        try{
            
                    
                    int drm=0;
                    if (esya==true) {
                            drm=1;
                    }
                   
                    
                    aktif = true;
                  
      
             Class.forName("com.mysql.jdbc.Driver");
            com.mysql.jdbc.Connection con = null;
                com.mysql.jdbc.Statement st = null;
                ResultSet rs = null;
                con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/emlak","root","1234");
                st =(com.mysql.jdbc.Statement) con.createStatement();
                
                String sql = "UPDATE `ilanlar` SET durum='"+durum+"', tip='"+tip+"',fiyat='"+fiyat+"',metrekare='"+metrekare+"',oda_sayisi='"+oda_sayisi+"',salon_sayisi='"+salon_sayisi+"',bina_yasi='"+bina_yasi+"',isitma_turu='"+isitma_turu+"',esya='"+drm+"',adres='"+adres+"',aciklama='"+aciklama+"',aktif='1',d1='"+d1+"',d2='"+d2+"',d3='"+d3+"' WHERE ilan_id="+id;
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"İlan Bilgisi Güncellenmiştir.");
         
              } catch (ClassNotFoundException ex) 
                {
                    Logger.getLogger(musteriler.class.getName()).log(Level.SEVERE, null, ex);
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(musteriler.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
        return 1;
    }

    void IlanGunclle(String durum, String tip, int parseInt, int parseInt0, int parseInt1, int parseInt2, int parseInt3, String itma, boolean drm, String text, String text0, boolean b, String d1, String d2, String d3) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     void satis_kirala(int emlak, int musteri,int fiyat, String tarih) throws SQLException
     {
         try{
           
           
       
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = null;
                Statement st = null;
                ResultSet rs = null;

                con = DriverManager.getConnection("jdbc:mysql://localhost/emlak","root","1234");
                
                st =(Statement) con.createStatement();
            
                 
                String sql = "INSERT INTO kayitlar (s_tarih,s_fiyat,musteri_id,ilan_id,ilanlar_ilan_id,musteriler_musteri_id)"+" values('"+tarih+"',"+fiyat+","+musteri+","+emlak+","+emlak+","+musteri+")";

                st.executeUpdate(sql); //
                sql ="update `ilanlar` set aktif= 0 where ilan_id="+emlak;
                 st.executeUpdate(sql); 
                JOptionPane.showMessageDialog(null," İşlem Bilgisi Eklenmiştir.");
              
            
       }
       catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

       }
     }
      void MusteriGuncelle(int musteri_id,String ad,String soyad,String tel, String mail)
      {
          try{
            
           
             Class.forName("com.mysql.jdbc.Driver");
            com.mysql.jdbc.Connection con = null;
                com.mysql.jdbc.Statement st = null;
                ResultSet rs = null;
                con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/emlak","root","1234");
                st =(com.mysql.jdbc.Statement) con.createStatement();
                String sql="UPDATE `musteriler` SET ad='"+ad+"', soyad='"+soyad+"',tel='"+tel+"',mail='"+mail+"' WHERE musteri_id="+musteri_id;
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"müşteri Bilgisi Güncellenmiştir.");
                
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(musteriler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(musteriler.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      void MusteriEkle(String ad, String soyad,String tel,String mail) throws SQLException
      {
          try{
             
                 
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = null;
                Statement st = null;
                ResultSet rs = null;

                con = DriverManager.getConnection("jdbc:mysql://localhost/emlak","root","1234");
                
                st =(Statement) con.createStatement();
            
                 
                String sql = "INSERT INTO musteriler (ad,soyad,mail,tel)"
                        + " VALUES ('"+ad+"','"+soyad+"','"+mail+"','"+tel+"')";

                st.executeUpdate(sql); //
                JOptionPane.showMessageDialog(null," müşteri Bilgisi Eklenmiştir.");
              
            
       }
       catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        }
      }
      void MusteriSil(int musteri)
      {
          
          try{
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
                Statement st = null;
                ResultSet rs = null;
                con = DriverManager.getConnection("jdbc:mysql://localhost/emlak","root","1234");
                st =(Statement) con.createStatement();
                String sql="DELETE  FROM `musteriler` WHERE musteri_id="+musteri;
                
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Müşteri Bilgisi Silinmiştir");
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(musteriler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            if(ex.getErrorCode()==1451)
            {
             
             JOptionPane.showMessageDialog(null, "İşlem yapmış müşteri silinemez!!!", "UYARI", 0);
            }
            else
            {
              Logger.getLogger(musteriler.class.getName()).log(Level.SEVERE, null, ex);// sql de yakalanan hataları ıde ye yazdırır.

            }
            
        }
      }
}
