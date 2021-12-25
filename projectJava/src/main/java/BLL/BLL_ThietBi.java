/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_ThietBi;
import DTO.ThietBi;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class BLL_ThietBi 
{
    DAL_ThietBi dal_tb = new DAL_ThietBi();
    public ArrayList<ThietBi> getArrayList()
    {
        return dal_tb.getList();
    }
    public ArrayList<ThietBi> timKiemTheoMaTB(String maTB)
    {
        return dal_tb.timKiemTheoMaTB(maTB);
    }
    public ArrayList<ThietBi> timKiemTheoMaNCC(String maNCC)
    {
        return dal_tb.timKiemTheoMaNCC(maNCC);
    }
    public ArrayList<ThietBi> timKiemTheoMaNSX(String maNSX)
    {
        return dal_tb.timKiemTheoMaNSX(maNSX);
    }
    public ArrayList<ThietBi> timKiemTheoMaLoai(String maLoai)
    {
        return dal_tb.timKiemTheoMaLoai(maLoai);
    }
    public ArrayList<ThietBi> timKiemTheoTenTb(String tenTb)
    {
        return dal_tb.timKiemTheoTen(tenTb);
    }
    public String themTB(ThietBi nv1)
    {        
        if(dal_tb.themTB(nv1))
        {
            
            return "Thêm thành công";
            
        }
        return "Thêm thất bại";
    }
    public boolean suaSL(String maTB,int soLuong)
    {        
        if(dal_tb.suaSL(maTB,soLuong))
        {
            
            return true;
            
        }
        return false;
    }
    public String sua1(ThietBi tb)
    {        
        if(dal_tb.sua(tb))
        {
            
            return "Sửa thành công";
            
        }
        return "Sửa thất bại";
    }
    public String xoa(String maTB)
    {        
        if(dal_tb.xoa(maTB))
        {
            
            return "Xóa thành công";
            
        }
        return "Xóa thất bại";
    }
     public String sua(ThietBi tb1)
    {
        
        if(dal_tb.CnTB(tb1) == true)
        {
            return "Cập nhật dữ liệu thành công";
        }
        return "Lỗi cập nhật dữ liệu";
        
                
    }
     public String suaSL_DG(String maTB,int soLuong,int donGia)
    {
        
        if(dal_tb.suaSL_DG(maTB,soLuong,donGia) == true)
        {
            return "Thêm dữ liệu thành công";
        }
        return "Thêm thất bại";
        
                
    }
}
