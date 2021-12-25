/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_PhieuXuat;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import DTO.PhieuXuat;
import DTO.CtPhieuXuat;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Acer
 */
public class BLL_PhieuXuat 
{
        
        
             DAL_PhieuXuat px = new DAL_PhieuXuat();

    
    public ArrayList<PhieuXuat> getArrayList()
    {
        return px.getListPX();
    }
    public void in(String ma)
    {
        px.in(ma);
    }
    public int countDong(String maPX)
    {
        return px.countDong(maPX);
    }
    public String suaTinhTrang(String maPN)
    {        
        if(px.suaTinhTrang(maPN))
        {
            
            return "Thanh toán hóa đơn thành công";
            
        }
        return "Thanh toán hóa đơn thất bại";
    }
    public String timTinhTrang(String maPN)
    {        
        return px.timTinhTrang(maPN);
        
    }
    public String addPX(PhieuXuat px1)
    {
        if(px.checkTT(px1.getMaPX()))
        {
            return "Mã PX tồn tại";
        }
        if(px.themPX(px1))
        {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }
     public String sua(PhieuXuat px1)
    {
        
        if(px.sua(px1) == true)
        {
            return "Cập nhật dữ liệu thành công";
        }
        return "Lỗi cập nhật dữ liệu";
        
                
    }
    public String xoa(String maPX)
    {
        
        if(px.xoa(maPX) == true)
        {
            return "Xóa dữ liệu thành công";
        }
        return "Lỗi xóa liệu dữ liệu";
        
                
    }
          
}
 