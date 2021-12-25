/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DAL_ThongKe 
{
    private KetNoi con;
    public DAL_ThongKe()
    {
        con = new KetNoi();
//        con.openConnection();
    }
    public ArrayList<String> getList(String ngay)
    {
        ArrayList<String> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            
            String sql = "SELECT maPX From PhieuXuat where ngayMua='" + ngay +"'";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    
                    list.add(rs.getString("maPX"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_ThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
        }
        
        
        return list;
    }
    public ArrayList<String> getListmaPN(String ngay)
    {
        ArrayList<String> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            
            String sql = "SELECT maPN From PhieuNhap where ngayNhap='" + ngay +"'";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    
                    list.add(rs.getString("maPN"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_ThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
        }
        
        
        return list;
    }
    public int getSL(String maPX)
    {
        
        int s=0;
        if(con.openConnection())
        {
            
            
            String sql = "select SUM(soLuong) as so_Luong from CtPhieuXuat where maPX = '"+ maPX +"'";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    
                    s = rs.getInt("so_Luong");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_ThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
        }
        
        
        return s;
    }
    public int getSLPN(String maPN)
    {
        
        int s=0;
        if(con.openConnection())
        {
            
            
            String sql = "select SUM(soLuong) as so_Luong from CtPhieuNhap where maPN = '"+ maPN +"'";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    
                    s = rs.getInt("so_Luong");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_ThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
        }
        
        
        return s;
    }
    public int getGia(String maPX)
    {
        
        int s=0;
        if(con.openConnection())
        {
            
            
            String sql = "select SUM(donGia) as gia from CtPhieuXuat where maPX = '"+ maPX +"'";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    
                    s = rs.getInt("gia");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_ThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
        }
        
        
        return s;
    }
    public int getGiaPN(String maPN)
    {
        
        int s=0;
        if(con.openConnection())
        {
            
            
            String sql = "select SUM(donGia) as gia from CtPhieuNhap where maPN = '"+ maPN +"'";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    
                    s = rs.getInt("gia");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_ThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
        }
        
        
        return s;
    }
}
