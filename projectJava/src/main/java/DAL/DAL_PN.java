/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.CtPhieuNhap;
import DTO.PhieuNhap;
import DTO.ThietBi;
import DTO.ThongKe_PN;
import java.sql.*;
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
 * @author ADMIN
 */
public class DAL_PN {
    private KetNoi con;
    public DAL_PN ()
    {
        con = new KetNoi();
    }
    public int countDong(String maPN)
    {
        String sql = "select count(*) as dem from CtPhieuNhap  WHERE maPN='"+ maPN +"'";
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
                    Logger.getLogger(DAL_PN.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return s;
    }
    public void in (String ma)
    {
        
        
        try {
            con.openConnection();
            Hashtable map = new Hashtable();
            map.put("idPN", ma);
//            JasperDesign jd = JRXmlLoader.load("D:\\code java\\projectJava\\projectJava\\projectJava\\src\\main\\java\\GUI\\PN.jrxml");
            JasperDesign jd = JRXmlLoader.load("src/main/java/GUI/PN.jrxml");
            
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, map,con.getCon());
            JasperViewer.viewReport(jp,false);
        } catch (JRException ex) {
            Logger.getLogger(DAL_PN.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            con.closeConnection();
        }
        
    }
    public ArrayList<PhieuNhap> getList()
    {
        ArrayList<PhieuNhap> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "SELECT * From PhieuNhap";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    PhieuNhap tk = new PhieuNhap();
                    tk.setMaNCC(rs.getString("maNCC"));
                    tk.setMaNV(rs.getString("maNV"));
                    tk.setMaPN(rs.getString("maPN"));
                    tk.setNgayNhap(rs.getDate("ngayNhap"));
                    tk.setTinhTrang(rs.getString("tinhTrang"));
                    
                    
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_PN .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
        }
        
        
        return list;
    }
    public ArrayList<CtPhieuNhap> getListCTPN()
    {
        ArrayList<CtPhieuNhap> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "SELECT * From CtPhieuNhap";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    CtPhieuNhap tk = new CtPhieuNhap();
                    tk.setMaPN(rs.getString("maPN"));
                    tk.setDonGia(rs.getInt("donGia"));
                    tk.setMaTB(rs.getString("maTB"));
                    tk.setSoLuong(rs.getInt("soLuong"));
                    
                    
                    
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_PN .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
        }
        
        
        return list;
    }
    public ArrayList<ThongKe_PN> getListCTPNTK()
    {
        ArrayList<ThongKe_PN> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "select  PhieuNhap.maPN,maTB,ngayNhap,tenNV,tenNCC,soLuong,donGia from CtPhieuNhap,PhieuNhap,NhaCungCap,NhanVien where CtPhieuNhap.maPN = PhieuNhap.maPN \n" +
"and PhieuNhap.maNCC = NhaCungCap.maNCC\n" +
"and PhieuNhap.maNV = NhanVien.maNV";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    ThongKe_PN tk = new ThongKe_PN();
                    tk.setDonGia(rs.getInt("donGia"));
                    tk.setMaPN(rs.getString("maPN"));
                    tk.setMaTB(rs.getString("maTB"));
                    tk.setNgayNhap(rs.getDate("ngayNhap"));
                    tk.setSoLuong(rs.getInt("soLuong"));
                    tk.setTenNCC(rs.getString("tenNCC"));
                    tk.setTenNV(rs.getString("tenNV"));
                    
                    
                    
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_PN .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
        }
        
        
        return list;
    }
    public ArrayList<ThongKe_PN> thongKe_PN_ngay(String ngay1,String ngay2)
    {
        ArrayList<ThongKe_PN> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "select  PhieuNhap.maPN,maTB,ngayNhap,tenNV,tenNCC,soLuong,donGia from CtPhieuNhap,PhieuNhap,NhaCungCap,NhanVien where CtPhieuNhap.maPN = PhieuNhap.maPN \n" +
"and PhieuNhap.maNCC = NhaCungCap.maNCC\n" +
"and PhieuNhap.maNV = NhanVien.maNV and ngayNhap BETWEEN '"+ ngay1+"' AND '"+ ngay2+"'";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    ThongKe_PN tk = new ThongKe_PN();
                    tk.setDonGia(rs.getInt("donGia"));
                    tk.setMaPN(rs.getString("maPN"));
                    tk.setMaTB(rs.getString("maTB"));
                    tk.setNgayNhap(rs.getDate("ngayNhap"));
                    tk.setSoLuong(rs.getInt("soLuong"));
                    tk.setTenNCC(rs.getString("tenNCC"));
                    tk.setTenNV(rs.getString("tenNV"));
                    
                    
                    
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_PN .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
        }
        
        
        return list;
    }
    public boolean them(PhieuNhap tk)
    {
        boolean kq=false;
        if(con.openConnection())
        {
            String sql ="insert into PhieuNhap(maNV,maNCC,ngayNhap,tinhTrang) values (?,?,?,?)";
            
            try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                
                ps.setString(1, tk.getMaNV());
                
                ps.setString(2, tk.getMaNCC());
                ps.setDate(3, new Date(tk.getNgayNhap().getTime()));
                ps.setString(4, "false");
                if(ps.executeUpdate() >=1)
                {
                    kq=true;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DAL_PN .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
        }
        return kq;
    }
    public boolean themCTPN(CtPhieuNhap tk)
    {
        boolean kq=false;
        if(con.openConnection())
        {
            String sql ="insert into CtPhieuNhap(maPN,maTB,soLuong,donGia) values (?,?,?,?)";
            
            try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                
                ps.setString(1, tk.getMaPN());
                
                ps.setString(2, tk.getMaTB());
                ps.setInt(3, tk.getSoLuong());
                ps.setInt(4, tk.getDonGia());
                
                if(ps.executeUpdate() >=1)
                {
                    kq=true;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DAL_PN .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
        }
        return kq;
    }
     public boolean sua(PhieuNhap tk)
    {
        String sql = "UPDATE PhieuNhap SET maNV=?,maNCC=?,ngayNhap=? WHERE maPN=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, tk.getMaNV());                
                ps.setString(2, tk.getMaNCC());
                ps.setDate(3, new Date(tk.getNgayNhap().getTime()));
                ps.setString(4, tk.getMaPN());
             
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_PN.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
      public boolean suaTinhTrang(String maPN)
    {
        String sql = "UPDATE PhieuNhap SET tinhTrang=? WHERE maPN=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, "true");                
                ps.setString(2, maPN);
                
             
                if(ps.executeUpdate()>=1)
                {
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_PN.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
      public boolean suaCtPN(CtPhieuNhap tk)
    {
        String sql = "UPDATE CtPhieuNhap SET soLuong=?,donGia=? WHERE maPN=? and maTB=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(4, tk.getMaTB());                
                ps.setInt(1, tk.getSoLuong());
                ps.setInt(2, tk.getDonGia());
                ps.setString(3, tk.getMaPN());
             
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_PN.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public boolean suaCtPNsoLuong_donGia(String maPN,String maTB,int soLuong,int donGia)
    {
        String sql = "UPDATE CtPhieuNhap set soLuong=?, donGia=? WHERE maPN=? and maTB=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setInt(1, soLuong);  
                ps.setInt(2, donGia);
                ps.setString(3, maPN);
                ps.setString(4, maTB);
                
             
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_PN.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public boolean xoa(String maPN)
    {
        String sql = "DELETE from PhieuNhap where maPN=? ";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, maPN );
               
                if(ps.executeUpdate()>=1)
                {
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_PN.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public boolean xoaCtPN(String maPN,String maTB)
    {
        String sql = "DELETE from CtPhieuNhap where maPN=? and maTB=? ";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, maPN );
                ps.setString(2, maTB );
               
                if(ps.executeUpdate()>=1)
                {
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_PN.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public boolean xoaCtPNma(String maPN)
    {
        String sql = "DELETE from CtPhieuNhap where maPN=? ";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, maPN );
               
               
                if(ps.executeUpdate()>=1)
                {
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_PN.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    
}
