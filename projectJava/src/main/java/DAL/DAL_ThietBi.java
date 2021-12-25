/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ThietBi;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DAL_ThietBi 
{
    private KetNoi con;
    public DAL_ThietBi ()
    {
        con = new KetNoi();
    }
    public ArrayList<ThietBi> getList()
    {
        ArrayList<ThietBi> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "SELECT * From ThietBi";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    ThietBi tk = new ThietBi();
                    tk.setMaNCC(rs.getString("maNCC"));
                    tk.setMaTB(rs.getString("maTB"));
                    tk.setGiaThanh(rs.getInt("giaThanh"));
                    tk.setSoLuong(rs.getInt("soLuong"));
                    tk.setMaNSX(rs.getString("maNSX"));
                    tk.setTenTB(rs.getString("tenTB"));
                    tk.setThongSo(rs.getString("thongSoTB"));
                    tk.setMaLoai(rs.getString("maLoai"));
                    
                    tk.setHinh(rs.getString("hinh"));
                    
                    
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_ThietBi .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
        }
        
        
        return list;
    }
    public boolean themTB(ThietBi tk)
    {
        boolean kq=false;
        if(con.openConnection())
        {
            String sql ="insert into ThietBi(tenTB,maNSX,thongSoTB,maNCC,maLoai, giaThanh ,soLuong,hinh) values (?,?,?,?,?,?,?,?)";
            
            try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                
                ps.setString(1, tk.getTenTB());
                
                ps.setString(2, tk.getMaNSX());
                ps.setString(3, tk.getThongSo());
                ps.setString(4, tk.getMaNCC());
                ps.setString(5, tk.getMaLoai());
                ps.setInt(6, tk.getGiaThanh());
                ps.setInt(7, tk.getSoLuong());
                ps.setString(8, tk.getHinh());
                if(ps.executeUpdate() >=1)
                {
                    kq=true;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DAL_ThietBi .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
        }
        return kq;
    }
    public boolean suaSL(String maTB, int soLuong)
    {
        String sql = "UPDATE ThietBi SET soLuong=? WHERE maTB=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setInt(1, soLuong);                
                ps.setString(2, maTB);
               
             
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_ThietBi.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public boolean sua(ThietBi tk)
    {
        String sql = "UPDATE ThietBi SET tenTB=?,maNSX=?,thongSoTB=?,maNCC=?,maLoai=?, giaThanh=? ,soLuong=? ,hinh=? WHERE maTB=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, tk.getTenTB());
                
                ps.setString(2, tk.getMaNSX());
                ps.setString(3, tk.getThongSo());
                ps.setString(4, tk.getMaNCC());
                ps.setString(5, tk.getMaLoai());
                ps.setInt(6, tk.getGiaThanh());
                ps.setInt(7, tk.getSoLuong());
                ps.setString(8, tk.getHinh());
               ps.setString(9, tk.getMaTB());
             
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_ThietBi.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public boolean xoa(String maTB)
    {
        String sql = "DELETE from ThietBi where maTB=? ";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, maTB );
               
                if(ps.executeUpdate()>=1)
                {
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_ThietBi.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public boolean suaSL_DG(String maTB,int soLuong,int donGia)
    {
        String sql = "UPDATE ThietBi SET soLuong=?,donGia=? WHERE maTB=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(3, maTB );
                ps.setInt(1, soLuong);
                ps.setInt(2, donGia);
                
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_ThietBi.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public boolean CnTB(ThietBi tb)
    {
        String sql = "UPDATE ThietBi SET soLuong=? WHERE maTB=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(2, tb.getMaTB() );
                ps.setInt(1, tb.getSoLuong());
                
                
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_ThietBi.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public ArrayList<ThietBi> timKiemTheoTen(String ten)
    {
        ArrayList<ThietBi> list = new ArrayList<>();
        String sql = "Select * from ThietBi where tenTB LIKE N'%"+ten+"%' ";
        
        if(con.openConnection())
        {
                try {
                Statement ps = con.getCon().createStatement();
                
               
               
                ResultSet rs = ps.executeQuery(sql);
                while(rs.next())
                {
                    ThietBi tk = new ThietBi();
                    tk.setGiaThanh(rs.getInt("giaThanh"));
                    tk.setHinh(rs.getString("hinh"));
                    tk.setMaLoai(rs.getString("maLoai"));
                    tk.setMaNCC(rs.getString("maNCC"));
                    tk.setMaNSX(rs.getString("maNSX"));
                    tk.setMaTB(rs.getString("maTB"));
                    tk.setSoLuong(rs.getInt("soLuong"));
                    tk.setTenTB(rs.getString("tenTB"));
                    tk.setThongSo(rs.getString("thongSoTB"));
                    list.add(tk);
                }
                
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_ThietBi.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return list;
    }
    public ArrayList<ThietBi> timKiemTheoMaTB(String maTB)
    {
        ArrayList<ThietBi> list = new ArrayList<>();
        String sql = "Select * from ThietBi where maTB LIKE '%"+maTB+"%' ";
        
        if(con.openConnection())
        {
                try {
                Statement ps = con.getCon().createStatement();
                
               
               
                ResultSet rs = ps.executeQuery(sql);
                while(rs.next())
                {
                    ThietBi tk = new ThietBi();
                    tk.setGiaThanh(rs.getInt("giaThanh"));
                    tk.setHinh(rs.getString("hinh"));
                    tk.setMaLoai(rs.getString("maLoai"));
                    tk.setMaNCC(rs.getString("maNCC"));
                    tk.setMaNSX(rs.getString("maNSX"));
                    tk.setMaTB(rs.getString("maTB"));
                    tk.setSoLuong(rs.getInt("soLuong"));
                    tk.setTenTB(rs.getString("tenTB"));
                    tk.setThongSo(rs.getString("thongSoTB"));
                    list.add(tk);
                }
                
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_ThietBi.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return list;
    }
    public ArrayList<ThietBi> timKiemTheoMaLoai(String maloai)
    {
        ArrayList<ThietBi> list = new ArrayList<>();
        String sql = "Select * from ThietBi where maLoai LIKE '%"+maloai+"%' ";
        
        if(con.openConnection())
        {
                try {
                Statement ps = con.getCon().createStatement();
                
               
               
                ResultSet rs = ps.executeQuery(sql);
                while(rs.next())
                {
                    ThietBi tk = new ThietBi();
                    tk.setGiaThanh(rs.getInt("giaThanh"));
                    tk.setHinh(rs.getString("hinh"));
                    tk.setMaLoai(rs.getString("maLoai"));
                    tk.setMaNCC(rs.getString("maNCC"));
                    tk.setMaNSX(rs.getString("maNSX"));
                    tk.setMaTB(rs.getString("maTB"));
                    tk.setSoLuong(rs.getInt("soLuong"));
                    tk.setTenTB(rs.getString("tenTB"));
                    tk.setThongSo(rs.getString("thongSoTB"));
                    list.add(tk);
                }
                
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_ThietBi.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return list;
    }
    public ArrayList<ThietBi> timKiemTheoMaNCC(String maNCC)
    {
        ArrayList<ThietBi> list = new ArrayList<>();
        String sql = "Select * from ThietBi where maNCC LIKE '%"+maNCC+"%' ";
        
        if(con.openConnection())
        {
                try {
                Statement ps = con.getCon().createStatement();
                
               
               
                ResultSet rs = ps.executeQuery(sql);
                while(rs.next())
                {
                    ThietBi tk = new ThietBi();
                    tk.setGiaThanh(rs.getInt("giaThanh"));
                    tk.setHinh(rs.getString("hinh"));
                    tk.setMaLoai(rs.getString("maLoai"));
                    tk.setMaNCC(rs.getString("maNCC"));
                    tk.setMaNSX(rs.getString("maNSX"));
                    tk.setMaTB(rs.getString("maTB"));
                    tk.setSoLuong(rs.getInt("soLuong"));
                    tk.setTenTB(rs.getString("tenTB"));
                    tk.setThongSo(rs.getString("thongSoTB"));
                    list.add(tk);
                }
                
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_ThietBi.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return list;
    }
    public ArrayList<ThietBi> timKiemTheoMaNSX(String maNSX)
    {
        ArrayList<ThietBi> list = new ArrayList<>();
        String sql = "Select * from ThietBi where maNSX LIKE '%"+maNSX+"%' ";
        
        if(con.openConnection())
        {
                try {
                Statement ps = con.getCon().createStatement();
                
               
               
                ResultSet rs = ps.executeQuery(sql);
                while(rs.next())
                {
                    ThietBi tk = new ThietBi();
                    tk.setGiaThanh(rs.getInt("giaThanh"));
                    tk.setHinh(rs.getString("hinh"));
                    tk.setMaLoai(rs.getString("maLoai"));
                    tk.setMaNCC(rs.getString("maNCC"));
                    tk.setMaNSX(rs.getString("maNSX"));
                    tk.setMaTB(rs.getString("maTB"));
                    tk.setSoLuong(rs.getInt("soLuong"));
                    tk.setTenTB(rs.getString("tenTB"));
                    tk.setThongSo(rs.getString("thongSoTB"));
                    list.add(tk);
                }
                
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_ThietBi.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return list;
    }
}
