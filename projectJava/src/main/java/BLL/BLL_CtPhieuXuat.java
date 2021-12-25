/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_CtPhieuXuat;
import DAL.DAL_PhieuXuat;
import DTO.CtPhieuXuat;
import DTO.PhieuXuat;
import DTO.ThongKe_PX;
import java.util.ArrayList;

/**
 *
 * @author ad
 */
public class BLL_CtPhieuXuat
{
         DAL_CtPhieuXuat ctpx = new DAL_CtPhieuXuat();

    
    public ArrayList<CtPhieuXuat> getArrayList()
    {
        return ctpx.getListCtPX();
    }
    public ArrayList<ThongKe_PX> getArrayListTK()
    {
        return ctpx.getListCtPXTK();
    }
    public ArrayList<ThongKe_PX> thongKe_PX_ngay(String ngay1,String ngay2)
    {
        return ctpx.thongKe_PX_ngay(ngay1, ngay2);
    }
    public String addCtPX(CtPhieuXuat px1)
    {
       if(ctpx.themCtPX(px1))
        {
            
            return "Thêm thành công";
            
        }
        return "Thêm thất bại";
    }
     public String sua(CtPhieuXuat ct)
    {
        
        if(ctpx.sua(ct) == true)
        {
            return "Cập nhật dữ liệu thành công";
        }
        return "Lỗi cập nhật dữ liệu";
                      
    }
    public String xoa(String maPX)
    {
        
        if(ctpx.xoa(maPX) == true)
        {
            return "Xóa dữ liệu thành công";
        }
        return "Lỗi xóa liệu dữ liệu";
        
                
    }
    public String suaCT(CtPhieuXuat ct)
    {
       
        if(ctpx.suaCT(ct) == true)
        {
            return "Cập nhật dữ liệu thành công";
        }
        return "Lỗi cập nhật dữ liệu CT";
        
    }
     public String xoaCT(String maPX,String maTB)
    {
        
        if(ctpx.xoaCT(maPX,maTB) == true)
        {
            return "Xóa dữ liệu thành công";
        }
        return "Lỗi xóa liệu dữ liệu";
        
                
    }
    
}
