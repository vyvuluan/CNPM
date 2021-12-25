/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.LoaiThietBi;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DAL_LoaiTb 
{
    private KetNoi con;
    public DAL_LoaiTb ()
    {
        con = new KetNoi();
    }
    public ArrayList<LoaiThietBi> getList()
    {
        ArrayList<LoaiThietBi> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "SELECT * From LoaiThietBi";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    LoaiThietBi tk = new LoaiThietBi();
                    tk.setMaLoai(rs.getString("maLoai"));
                    tk.setTenLoai(rs.getString("tenLoai"));
                    
                    
                    
                    
                    
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_LoaiTb .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
        }
        
        
        return list;
    }
    public ArrayList<LoaiThietBi> timKiemTheoMaLoai(String maLoai)
    {
        ArrayList<LoaiThietBi> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "SELECT * From LoaiThietBi where maLoai LIKE '%"+maLoai+"%'";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    LoaiThietBi tk = new LoaiThietBi();
                    tk.setMaLoai(rs.getString("maLoai"));
                    tk.setTenLoai(rs.getString("tenLoai"));  
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_LoaiTb .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
        }
        
        
        return list;
    }
    public ArrayList<LoaiThietBi> timKiemTheoTenLoai(String tenLoai)
    {
        ArrayList<LoaiThietBi> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "SELECT * From LoaiThietBi where tenLoai LIKE N'%"+tenLoai+"%'";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    LoaiThietBi tk = new LoaiThietBi();
                    tk.setMaLoai(rs.getString("maLoai"));
                    tk.setTenLoai(rs.getString("tenLoai"));      
                    
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_LoaiTb .class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
        }
        
        
        return list;
    }
    public boolean them(LoaiThietBi tk)
    {
        boolean kq= false;
        if(con.openConnection())
        {
            
            String sql ="insert into LoaiThietBi(tenLoai) values (?)";
            
            try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                
                ps.setString(1, tk.getTenLoai());
                
                if(ps.executeUpdate() >=1)
                {
                    kq=true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_LoaiTb.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return kq;
    }
    public boolean sua(LoaiThietBi tk)
    {
        String sql = "UPDATE LoaiThietBi SET tenLoai=? WHERE maLoai=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, tk.getTenLoai());
                ps.setString(2, tk.getMaLoai());
                
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_LoaiTb.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public boolean xoa(String maLoai)
    {
        String sql = "DELETE from LoaiThietBi where maLoai=? ";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, maLoai );
               
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_LoaiTb.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
}
