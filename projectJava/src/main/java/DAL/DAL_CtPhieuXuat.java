/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.CtPhieuXuat;
import DTO.PhieuXuat;
import DTO.ThongKe_PX;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ad
 */
public class DAL_CtPhieuXuat 
{
    
         private KetNoi con;
    public DAL_CtPhieuXuat()
    {
        con = new KetNoi();
//        con.openConnection();
    }
    public ArrayList<CtPhieuXuat> getListCtPX()
    {
        ArrayList<CtPhieuXuat> list = new ArrayList<>();
        if(con.openConnection())
        {
             String sql = "select ct.maPX , concat(ct.maTB,'-',tb.tenTB) as 'maTB' , ct.donGia, ct.soLuong from CtPhieuXuat ct , ThietBi tb where ct.maTB = tb.maTB";
//            String sql = "SELECT * From CtPhieuXuat";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    CtPhieuXuat ct = new CtPhieuXuat();
                    ct.setMaPX(rs.getString("maPX"));
                    ct.setMaTB(rs.getString("maTB"));
                    ct.setSoLuong(rs.getInt("soLuong"));
                    ct.setDonGia(rs.getInt("donGia"));                   
                    
                    
                   list.add(ct);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_CtPhieuXuat .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
            
        }
        
        
        return list;
    }
    public ArrayList<ThongKe_PX> getListCtPXTK()
    {
        ArrayList<ThongKe_PX> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "select  PhieuXuat.maPX,maTB,ngayMua,tenNV,tenKH,soLuong,donGia from CtPhieuXuat,PhieuXuat,NhanVien,KhachHang where CtPhieuXuat.maPX = PhieuXuat.maPX \n" +
"and PhieuXuat.maKH = KhachHang.maKH\n" +
"and PhieuXuat.maNV = NhanVien.maNV";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    ThongKe_PX ct = new ThongKe_PX();
                    ct.setDonGia(rs.getInt("donGia"));
                    ct.setMaPX(rs.getString("maPX"));
                    ct.setMaTB(rs.getString("maTB"));
                    ct.setNgayMua(rs.getDate("ngayMua"));
                    ct.setSoLuong(rs.getInt("soLuong"));
                    ct.setTenKH(rs.getString("tenKH"));
                    ct.setTenNV(rs.getString("tenNV"));
                    
                    
                   list.add(ct);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_CtPhieuXuat .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
            
        }
        
        
        return list;
    }
    public ArrayList<ThongKe_PX> thongKe_PX_ngay(String ngay1, String ngay2)
    {
        ArrayList<ThongKe_PX> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "select  PhieuXuat.maPX,maTB,ngayMua,tenNV,tenKH,soLuong,donGia from CtPhieuXuat,PhieuXuat,NhanVien,KhachHang where CtPhieuXuat.maPX = PhieuXuat.maPX \n" +
"and PhieuXuat.maKH = KhachHang.maKH\n" +
"and PhieuXuat.maNV = NhanVien.maNV and ngayMua BETWEEN '"+ ngay1+"' AND '"+ ngay2+"'";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    ThongKe_PX ct = new ThongKe_PX();
                    ct.setDonGia(rs.getInt("donGia"));
                    ct.setMaPX(rs.getString("maPX"));
                    ct.setMaTB(rs.getString("maTB"));
                    ct.setNgayMua(rs.getDate("ngayMua"));
                    ct.setSoLuong(rs.getInt("soLuong"));
                    ct.setTenKH(rs.getString("tenKH"));
                    ct.setTenNV(rs.getString("tenNV"));
                    
                    
                   list.add(ct);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_CtPhieuXuat .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
            
        }
        
        
        return list;
    }
      public boolean themCtPX(CtPhieuXuat ctPX)
    {
        boolean kq=false;
        if(con.openConnection())
        {
            String sql ="insert into CtPhieuXuat(maPX,maTB,soLuong,donGia) values (?,?,?,?)";
            
            try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                
                ps.setString(1, ctPX.getMaPX());             
                ps.setString(2, ctPX.getMaTB());
                ps.setInt(3, ctPX.getSoLuong());
                ps.setInt(4, ctPX.getDonGia()); 
               
                
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
         public boolean checkTT(String maPX)
    {
        boolean kq=false;
        if(con.openConnection())
        {
            String sql ="select * from CtPhieuXuat where maPX=" +maPX;
           
            
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
          public boolean sua(CtPhieuXuat x)
    {
        
        String sql = "UPDATE CtPhieuXuat SET maTB=?,soLuong=? ,donGia=? WHERE maPX=?";
        boolean kq= false;
        if(con.openConnection())
        {
            
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);                               
                ps.setString(1, x.getMaTB());                
                ps.setInt(2, x.getSoLuong());
                ps.setInt(3, x.getDonGia());
                ps.setString(4, x.getMaPX());                               
             
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
    public boolean xoa(String maPX)
    {
        String sql = "DELETE from CtPhieuXuat where maPX=? ";
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
    
    public boolean suaCT(CtPhieuXuat x)
       {
           
        String sql = "UPDATE CtPhieuXuat SET soLuong=?,donGia=? WHERE maPX=? and maTB=?";
        boolean kq= false;
        if(con.openConnection())
        {
            
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);                                                         
                ps.setInt(1, x.getSoLuong());
                ps.setInt(2, x.getDonGia());
                ps.setString(3, x.getMaPX());
                ps.setString(4, x.getMaTB());                               
             
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
     public boolean xoaCT(String maPX,String maTB)
    {
        String sql = "DELETE from CtPhieuXuat where maPX=? and maTB=? ";
        boolean kq= false;
        if(con.openConnection())
        {
            
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, maPX );
                ps.setString(2, maTB );
               
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
