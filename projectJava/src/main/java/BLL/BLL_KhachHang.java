/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_KhachHang;
import DTO.CtPhieuXuat;
import DTO.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author ad
 */
public class BLL_KhachHang 
{
           DAL_KhachHang kh = new DAL_KhachHang();

    
    public ArrayList<KhachHang> getArrayList()
    {
        return kh.getListKH();
    }
    public String addKH(KhachHang kh1)
    {
        if(kh.checkTT(kh1.getMaKH()))
        {
            return "Mã PX tồn tại";
        }
        if(kh.themKH(kh1))
        {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }
      public String sua(KhachHang kh1)
    {
        
        if(kh.sua(kh1) == true)
        {
            return "Cập nhật dữ liệu thành công";
        }
        return "Lỗi cập nhật dữ liệu";
        
                
    }
    public String xoa(String maKH)
    {
        
        if(kh.xoa(maKH) == true)
        {
            return "Xóa dữ liệu thành công";
        }
        return "Lỗi xóa liệu dữ liệu";
        
                
    }
    public ArrayList<KhachHang> timKiem(String ten)
    {
        return kh.timKiem(ten);
    }
    public ArrayList<KhachHang> timKiemTheoMa(String maNV)
    {
        return kh.timKiemTheoMa(maNV);
    }
    
}
