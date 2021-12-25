/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import DTO.PhieuXuat;
import DTO.CtPhieuXuat;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Acer
 */
public class DAL_PhieuXuat {
      

    private KetNoi con;
    public DAL_PhieuXuat()
    {
        con = new KetNoi();
//        con.openConnection();
    }
    public void in (String ma)
    {
        
        
        try {
            con.openConnection();
            Hashtable map = new Hashtable();
            map.put("idPX", ma);
//            JasperDesign jd = JRXmlLoader.load("D:\\code java\\projectJava\\projectJava\\projectJava\\src\\main\\java\\GUI\\HD.jrxml");

            JasperDesign jd = JRXmlLoader.load("src/main/java/GUI/HD.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, map,con.getCon());
            JasperViewer.viewReport(jp,false);
        } catch (JRException ex) {
            Logger.getLogger(DAL_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            con.closeConnection();
        }
        
    }
    public ArrayList<PhieuXuat> getListPX()
    {
        ArrayList<PhieuXuat> list = new ArrayList<>();
        if(con.openConnection())
        {
            String sql = "select px.maPX , nv.tenNV  ,px.ngayMua ,concat(kh.maKH,'-',kh.tenKH) as tenKH, tinhTrang  from PhieuXuat px , NhanVien nv ,KhachHang kh where px.maKH = kh.maKH and px.maNV = nv.maNV";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    PhieuXuat px = new PhieuXuat();
                    px.setMaPX(rs.getString("maPX"));
                    px.setMaNV(rs.getString("tenNV"));
                    px.setMaKH(rs.getString("tenKH"));
                    px.setNgayMua(rs.getDate("ngayMua"));
                    px.setTinhTrang(rs.getString("tinhTrang"));
                    
                   list.add(px);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_PhieuXuat .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
            
        }
        
        
        return list;
    }
    public boolean themPX(PhieuXuat PX)
    {
        boolean kq=false;
        if(con.openConnection())
        {
            String sql ="insert into PhieuXuat(maNV,maKH,ngayMua,tinhTrang) values (?,?,?,?)";
            
            try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                            
                 ps.setString(1, PX.getMaNV());
                 ps.setString(2, PX.getMaKH());
                 ps.setDate(3, new Date(PX.getNgayMua().getTime()));
                 ps.setString(4, "false");
                
                if(ps.executeUpdate() >=1)
                {
                    kq=true;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DAL_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
        }
        return kq;
    }
    public int countDong(String maPX)
    {
        String sql = "select count(*) as dem from CtPhieuXuat  WHERE maPX='"+ maPX +"'";
        int s=0;
        if(con.openConnection())
        {
                try {
                Statement st = con.getCon().createStatement();
                
             
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    s= rs.getInt("dem");
                }
                
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return s;
    }
    public String timTinhTrang(String maPX)
    {
        String sql = "select tinhTrang from PhieuXuat  WHERE maPX='"+ maPX +"'";
        String s="";
        if(con.openConnection())
        {
                try {
                Statement st = con.getCon().createStatement();
                
             
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    s= rs.getString("tinhTrang");
                }
                
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return s;
    }
     public boolean checkTT(String maPX)
    {
        boolean kq=false;
        if(con.openConnection())
        {
            String sql ="select * from PhieuXuat where maPX=" +maPX;
           
            
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                kq = rs.next();
                
            } catch (SQLException ex) {
                Logger.getLogger(DAL_PhieuXuat .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
        }
        return kq;
    }
         public boolean sua(PhieuXuat PX)
    {
        String sql = "UPDATE PhieuXuat SET maNV=?,maKH=? ,ngayMua=? WHERE maPX=? ";
      
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                               
                ps.setString(1, PX.getMaNV());
                ps.setString(2, PX.getMaKH());
                ps.setDate(3, new Date(PX.getNgayMua().getTime()));
                ps.setString(4, PX.getMaPX()); 
                
             
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
     public boolean suaTinhTrang(String maPX)
    {
        String sql = "UPDATE PhieuXuat SET tinhTrang=? WHERE maPX=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, "true");                
                ps.setString(2, maPX);
                
             
                if(ps.executeUpdate()>=1)
                {
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public boolean xoa(String maPX)
    {
        String sql = "DELETE from PhieuXuat where maPX=? ";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, maPX );
               
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
        
}
