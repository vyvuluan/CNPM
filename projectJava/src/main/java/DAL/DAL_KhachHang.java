/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.KhachHang;
import DTO.PhieuXuat;
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
public class DAL_KhachHang 
{
           private KetNoi con;
    public DAL_KhachHang()
    {
        con = new KetNoi();
//        con.openConnection();
    }
    public ArrayList<KhachHang> getListKH()
    {
        ArrayList<KhachHang> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "SELECT * From KhachHang";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    KhachHang kh = new KhachHang();
                    kh.setMaKH(rs.getString("maKH"));
                    kh.setTen(rs.getString("tenKH"));
                    kh.setNgSinh(rs.getDate("ngaySinh"));
                    kh.setDiaChi(rs.getString("diaChi"));
                    kh.setSdt(rs.getString("sdt"));
                    
                    
                   list.add(kh);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_KhachHang .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
            
        }
        
        
        return list;
    }
    public boolean themKH(KhachHang KH)
    {
        boolean kq=false;
        if(con.openConnection())
        {
            String sql ="insert into KhachHang(tenKH,ngaySinh,diaChi,sdt) values (?,?,?,?)";
            
            try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, KH.getTen());                                        
                ps.setDate(2, new Date(KH.getNgSinh().getTime()));
                ps.setString(3, KH.getDiaChi());
                ps.setString(4, KH.getSdt());    
                
                if(ps.executeUpdate() >=1)
                {
                    kq=true;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DAL_KhachHang.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
        }
        return kq;
    }
     public boolean checkTT(String maKH)
    {
        boolean kq=false;
        if(con.openConnection())
        {
            String sql ="select * from KhachHang where maKH=" +maKH;
           
            
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                kq = rs.next();
                
            } catch (SQLException ex) {
                Logger.getLogger(DAL_KhachHang .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
        }
        return kq;
    }
         public boolean sua(KhachHang kh)
    {
        String sql = "UPDATE KhachHang SET tenKH=?,ngaySinh=?,diaChi=?,sdt=? WHERE maKH=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                                
                ps.setString(1, kh.getTen());
                ps.setDate(2, new Date(kh.getNgSinh().getTime()));
                ps.setString(3, kh.getDiaChi());
                ps.setString(4, kh.getSdt());
                ps.setString(5, kh.getMaKH());
                
             
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
    public boolean xoa(String maKH)
    {
        String sql = "DELETE from KhachHang where maKH=? ";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, maKH );
               
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
    public ArrayList<KhachHang> timKiem(String ten)
    {
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "Select * from KhachHang where tenKH LIKE N'%"+ten+"%' ";
        
        if(con.openConnection())
        {
                try {
                Statement ps = con.getCon().createStatement();
                
               
               
                ResultSet rs = ps.executeQuery(sql);
                while(rs.next())
                {
                    KhachHang tk = new KhachHang();
                    tk.setMaKH(rs.getString("maKH"));
                    tk.setDiaChi(rs.getString("diaChi"));
                    tk.setNgSinh(rs.getDate("ngaySinh"));
                    tk.setSdt(rs.getString("sdt"));
                    tk.setTen(rs.getString("tenKH"));
                    list.add(tk);
                }
                
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_KhachHang.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return list;
    }
    public ArrayList<KhachHang> timKiemTheoMa(String maKH)
    {
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "Select * from KhachHang where maKH LIKE '%"+maKH+"%' ";
        
        if(con.openConnection())
        {
                try {
                Statement ps = con.getCon().createStatement();
                
               
               
                ResultSet rs = ps.executeQuery(sql);
                while(rs.next())
                {
                    KhachHang tk = new KhachHang();
                    tk.setMaKH(rs.getString("maKH"));
                    tk.setDiaChi(rs.getString("diaChi"));
                    tk.setNgSinh(rs.getDate("ngaySinh"));
                    tk.setSdt(rs.getString("sdt"));
                    tk.setTen(rs.getString("tenKH"));
                    list.add(tk);
                }
                
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_KhachHang.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return list;
    }
        
    
}
