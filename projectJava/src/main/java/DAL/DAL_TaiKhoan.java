/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.TaiKhoan;
import java.sql.*;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DAL_TaiKhoan 
{
    private KetNoi con;
    public DAL_TaiKhoan()
    {
        con = new KetNoi();
//        con.openConnection();
    }
    public ArrayList<TaiKhoan> getListTK()
    {
        ArrayList<TaiKhoan> list = new ArrayList<>();
        if(con.openConnection())
        {
            
            String sql = "SELECT * From TaiKhoan";
            try {
                Statement st = con.getCon().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {
                    TaiKhoan tk = new TaiKhoan();
                    tk.setMaTK(rs.getString("maTK"));
                    tk.setUsername(rs.getString("taiKhoan"));
                    tk.setPassword(rs.getString("matKhau"));
                    tk.setQuyen(rs.getString("quyen"));
                    tk.setMaNV(rs.getString("maNV"));
                    
                    if(rs.getString("tinhTrang").equals("true"))
                    {
                        
                        tk.setTinhTrang(true);
                        
                    }
                    else tk.setTinhTrang(false);
                    list.add(tk);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                con.closeConnection();
            }
            
            
            
        }
        
        
        return list;
    }
    public boolean themTK(TaiKhoan tk)
    {
        boolean kq= false;
        if(con.openConnection())
        {
            
            String sql ="insert into TaiKhoan(taiKhoan,matKhau,quyen,maNV,tinhTrang) values (?,?,?,?,?)";
            
            try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                
                ps.setString(1, tk.getUsername());
                ps.setString(2, tk.getPassword());
                ps.setString(3, tk.getQuyen());
                ps.setString(4, tk.getMaNV());
                if(tk.isTinhTrang())
                {
                    ps.setString(5, "true");
                }
                else ps.setString(5, "false");
//                ps.setString(5, tk.getMaTK());
                if(ps.executeUpdate() >=1)
                {
                    kq=true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAL_TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return kq;
    }
    public boolean suaTK(TaiKhoan tk)
    {
        String sql = "UPDATE TaiKhoan SET taiKhoan=?,matKhau=?,quyen=? ,tinhTrang=? WHERE maTK=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, tk.getUsername() );
                ps.setString(2, tk.getPassword());
                ps.setString(3, tk.getQuyen());
                if(tk.isTinhTrang())
                {
                    ps.setString(4, "true");
                }
                else ps.setString(4, "false");
               
                ps.setString(5, tk.getMaTK());
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public boolean doiPass(String taiKhoan,String matKhau)
    {
        String sql = "UPDATE TaiKhoan SET matKhau=? WHERE taiKhoan=?";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, matKhau );
                ps.setString(2, taiKhoan);
                
                
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public boolean xoaTK(String maTK)
    {
        String sql = "DELETE from TaiKhoan where maTK=? ";
        boolean kq= false;
        if(con.openConnection())
        {
                try {
                PreparedStatement ps = con.getCon().prepareStatement(sql);
                ps.setString(1, maTK );
               
                if(ps.executeUpdate()>=1)
                {
//                    System.out.println("1");
                    kq = true;
                }
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return kq;
    }
    public ArrayList<TaiKhoan> timKiem(String taiKhoan)
    {
        ArrayList<TaiKhoan> list = new ArrayList<>();
        String sql = "Select * from TaiKhoan where taiKhoan LIKE '%"+taiKhoan+"%' ";
        
        if(con.openConnection())
        {
                try {
                Statement ps = con.getCon().createStatement();
                
               
               
                ResultSet rs = ps.executeQuery(sql);
                while(rs.next())
                {
                    TaiKhoan tk = new TaiKhoan();
                    tk.setMaTK(rs.getString("maTK"));
                    tk.setMaNV(rs.getString("maNV"));
                    tk.setPassword(rs.getString("matKhau"));
                    tk.setQuyen(rs.getString("quyen"));
                    if(rs.getString("tinhTrang").equals("true"))
                    {
                        
                        tk.setTinhTrang(true);
                        
                    }
                    else tk.setTinhTrang(false);
                    tk.setUsername(rs.getString("taiKhoan"));
                    
                    list.add(tk);
                }
                
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return list;
    }
    public ArrayList<TaiKhoan> timKiemTheoMa(String maTK)
    {
        ArrayList<TaiKhoan> list = new ArrayList<>();
        String sql = "Select * from TaiKhoan where maTK LIKE '%"+maTK+"%' ";
        
        if(con.openConnection())
        {
                try {
                Statement ps = con.getCon().createStatement();
                
               
               
                ResultSet rs = ps.executeQuery(sql);
                while(rs.next())
                {
                    TaiKhoan tk = new TaiKhoan();
                    tk.setMaTK(rs.getString("maTK"));
                    tk.setMaNV(rs.getString("maNV"));
                    tk.setPassword(rs.getString("matKhau"));
                    tk.setQuyen(rs.getString("quyen"));
                    if(rs.getString("tinhTrang").equals("true"))
                    {
                        
                        tk.setTinhTrang(true);
                        
                    }
                    else tk.setTinhTrang(false);
                    tk.setUsername(rs.getString("taiKhoan"));
                    
                    list.add(tk);
                }
                
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return list;
    }
    public ArrayList<TaiKhoan> timKiemTheoMaNV(String maNV)
    {
        ArrayList<TaiKhoan> list = new ArrayList<>();
        String sql = "Select * from TaiKhoan where maNV LIKE '%"+maNV+"%' ";
        
        if(con.openConnection())
        {
                try {
                Statement ps = con.getCon().createStatement();
                
               
               
                ResultSet rs = ps.executeQuery(sql);
                while(rs.next())
                {
                    TaiKhoan tk = new TaiKhoan();
                    tk.setMaTK(rs.getString("maTK"));
                    tk.setMaNV(rs.getString("maNV"));
                    tk.setPassword(rs.getString("matKhau"));
                    tk.setQuyen(rs.getString("quyen"));
                    if(rs.getString("tinhTrang").equals("true"))
                    {
                        
                        tk.setTinhTrang(true);
                        
                    }
                    else tk.setTinhTrang(false);
                    tk.setUsername(rs.getString("taiKhoan"));
                    
                    list.add(tk);
                }
                
                    
            } catch (SQLException ex) {
                    Logger.getLogger(DAL_TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
                finally
                {
                    con.closeConnection();
                }
            
        }
        return list;
    }
}
