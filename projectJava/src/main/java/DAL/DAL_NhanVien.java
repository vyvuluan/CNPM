/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhanVien;
import java.sql.PreparedStatement;

import java.sql.*;


import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DAL_NhanVien 
{
    private KetNoi con;
    public DAL_NhanVien()
    {
        con = new KetNoi();
    }
    public ArrayList<NhanVien> getList()
    {
        ArrayList<NhanVien> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "SELECT * From NhanVien";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    NhanVien tk = new NhanVien();
                    tk.setMaNV(rs.getString("maNV"));
                    tk.setDiaChi(rs.getString("diaChi"));
                    tk.setNgSinh(rs.getDate("ngaySinh"));
                    tk.setSdt(rs.getString("sdt"));
                    tk.setTen(rs.getString("tenNV"));
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_NhanVien .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }

        }
        
        
        return list;
    }
    public boolean themNV(NhanVien tk)
    {
        boolean kq=false;
        if(con.openConnection())
        {
            String sql ="insert into NhanVien(tenNV,ngaySinh,diaChi,sdt) values (?,?,?,?)";
            
            try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                
                ps.setNString(1, tk.getTen());
                ps.setDate(2, new Date(tk.getNgSinh().getTime()));
                ps.setString(3, tk.getDiaChi());
                ps.setString(4, tk.getSdt());
                if(ps.executeUpdate() >=1)
                {
                    kq=true;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DAL_NhanVien .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
        }
        return kq;
    }
    public boolean hasNV(String maNV)
    {
        boolean kq=false;
        if(con.openConnection())
        {
            String sql ="select * from NhanVien where maNV=" +maNV;
            
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                kq = rs.next();
                
            } catch (SQLException ex) {
                Logger.getLogger(DAL_NhanVien .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
        }
        return kq;
    }
    public boolean sua(NhanVien tk)
    {
        String sql = "UPDATE NhanVien SET tenNV=?,ngaySinh=?,diaChi=? ,sdt=? WHERE maNV=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, tk.getTen());
                ps.setDate(2, new Date(tk.getNgSinh().getTime()));
                ps.setString(3, tk.getDiaChi());
                ps.setString(4, tk.getSdt());
                ps.setString(5, tk.getMaNV());
             
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public boolean xoa(String maNV)
    {
        String sql = "DELETE from NhanVien where maNV=? ";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, maNV );
               
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public ArrayList<NhanVien> timKiem(String ten)
    {
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "Select * from NhanVien where tenNV LIKE N'%"+ten+"%' ";
        
        if(con.openConnection())
        {
                try {
                Statement ps = con.getCon().createStatement();
                
               
               
                ResultSet rs = ps.executeQuery(sql);
                while(rs.next())
                {
                    NhanVien tk = new NhanVien();
                    tk.setMaNV(rs.getString("maNV"));
                    tk.setDiaChi(rs.getString("diaChi"));
                    tk.setNgSinh(rs.getDate("ngaySinh"));
                    tk.setSdt(rs.getString("sdt"));
                    tk.setTen(rs.getString("tenNV"));
                    list.add(tk);
                }
                
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return list;
    }
    public ArrayList<NhanVien> timKiemTheoMa(String maNV)
    {
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "Select * from NhanVien where maNV LIKE '%"+maNV+"%' ";
        
        if(con.openConnection())
        {
                try {
                Statement ps = con.getCon().createStatement();
                
               
               
                ResultSet rs = ps.executeQuery(sql);
                while(rs.next())
                {
                    NhanVien tk = new NhanVien();
                    tk.setMaNV(rs.getString("maNV"));
                    tk.setDiaChi(rs.getString("diaChi"));
                    tk.setNgSinh(rs.getDate("ngaySinh"));
                    tk.setSdt(rs.getString("sdt"));
                    tk.setTen(rs.getString("tenNV"));
                    list.add(tk);
                }
                
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return list;
    }
    
    
}
