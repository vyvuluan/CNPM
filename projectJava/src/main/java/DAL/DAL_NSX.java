/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhaSanXuat;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DAL_NSX 
{
    private KetNoi con;
    public DAL_NSX ()
    {
        con = new KetNoi();
    }
    public ArrayList<NhaSanXuat> getList()
    {
        ArrayList<NhaSanXuat> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "SELECT * From NhaSanXuat";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    NhaSanXuat tk = new NhaSanXuat();
                    tk.setMaNSX(rs.getString("maNSX"));
                    tk.setTenNSX(rs.getString("tenNSX"));
                    tk.setQuocGia(rs.getString("quocGia"));
                    
                    
                    
                    
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_NSX .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
        }
        
        
        return list;
    }
    public ArrayList<NhaSanXuat> timKiemTheoMa(String maNSX)
    {
        ArrayList<NhaSanXuat> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "SELECT * From NhaSanXuat where maNSX LIKE '%"+maNSX+"%'";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    NhaSanXuat tk = new NhaSanXuat();
                    tk.setMaNSX(rs.getString("maNSX"));
                    tk.setTenNSX(rs.getString("tenNSX"));
                    tk.setQuocGia(rs.getString("quocGia"));
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_NSX .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
        }
        
        
        return list;
    }
    public ArrayList<NhaSanXuat> timKiemTheoTen(String ten)
    {
        ArrayList<NhaSanXuat> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "SELECT * From NhaSanXuat where tenNSX LIKE N'%"+ten+"%'";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    NhaSanXuat tk = new NhaSanXuat();
                    tk.setMaNSX(rs.getString("maNSX"));
                    tk.setTenNSX(rs.getString("tenNSX"));
                    tk.setQuocGia(rs.getString("quocGia"));
                    
                    
                    
                    
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_NSX .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
        }
        
        
        return list;
    }
    public boolean sua(NhaSanXuat tk)
    {
        String sql = "UPDATE NhaSanXuat SET tenNSX=?,quocGia=? WHERE maNSX=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, tk.getTenNSX());                
                ps.setString(2, tk.getQuocGia());
                ps.setString(3, tk.getMaNSX());
             
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
    public boolean xoa(String maNSX)
    {
        String sql = "DELETE from NhaSanXuat where maNSX=? ";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, maNSX );
               
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
    public boolean them(NhaSanXuat tk)
    {
        boolean kq=false;
        if(con.openConnection())
        {
            String sql ="insert into NhaSanXuat(tenNSX,quocGia) values (?,?)";
            
            try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                
                ps.setString(1, tk.getTenNSX());              
                ps.setString(2, tk.getQuocGia());
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
