/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhaCungCap;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DAL_NCC 
{
    private KetNoi con;
    public DAL_NCC ()
    {
        con = new KetNoi();
    }
    public ArrayList<NhaCungCap> getList()
    {
        ArrayList<NhaCungCap> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "SELECT * From NhaCungCap";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    NhaCungCap tk = new NhaCungCap();
                    tk.setMaNCC(rs.getString("maNCC"));
                    tk.setTenNCC(rs.getString("tenNCC"));
                    tk.setDiaChi(rs.getString("diaChi"));
                    tk.setSdt(rs.getString("sdt"));
                    
                    
                    
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_NCC .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
        }
        
        
        return list;
    }
    public ArrayList<NhaCungCap> timKiemTheoMa(String maNCC)
    {
        ArrayList<NhaCungCap> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "SELECT * From NhaCungCap where maNCC LIKE '%"+maNCC+"%'";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    NhaCungCap tk = new NhaCungCap();
                    tk.setMaNCC(rs.getString("maNCC"));
                    tk.setTenNCC(rs.getString("tenNCC"));
                    tk.setDiaChi(rs.getString("diaChi"));
                    tk.setSdt(rs.getString("sdt"));
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_NCC .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }      
        }
        return list;
    }
    public ArrayList<NhaCungCap> timKiemTheoTen(String ten)
    {
        ArrayList<NhaCungCap> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "SELECT * From NhaCungCap where tenNCC LIKE N'%"+ten+"%'";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    NhaCungCap tk = new NhaCungCap();
                    tk.setMaNCC(rs.getString("maNCC"));
                    tk.setTenNCC(rs.getString("tenNCC"));
                    tk.setDiaChi(rs.getString("diaChi"));
                    tk.setSdt(rs.getString("sdt"));
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_NCC .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }      
        }
        return list;
    }
    public boolean sua(NhaCungCap tk)
    {
        String sql = "UPDATE NhaCungCap SET tenNCC=?,diaChi=?,sdt=? WHERE maNCC=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, tk.getTenNCC());                
                ps.setString(2, tk.getDiaChi());
                ps.setString(3, tk.getSdt());
                ps.setString(4, tk.getMaNCC());
             
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
    public boolean xoa(String maNCC)
    {
        String sql = "DELETE from NhaCungCap where maNCC=? ";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, maNCC );
               
                if(ps.executeUpdate()>=1)
                {
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
    public boolean them(NhaCungCap tk)
    {
        boolean kq=false;
        if(con.openConnection())
        {
            String sql ="insert into NhaCungCap(tenNCC,diaChi,sdt) values (?,?,?)";
            
            try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                
                ps.setString(1, tk.getTenNCC());              
                ps.setString(2, tk.getDiaChi());
                ps.setString(3, tk.getSdt());
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
}
