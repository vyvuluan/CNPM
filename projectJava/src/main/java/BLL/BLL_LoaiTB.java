/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_LoaiTb;
import DTO.LoaiThietBi;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class BLL_LoaiTB 
{
    DAL_LoaiTb dal_ltb = new DAL_LoaiTb();
    public ArrayList<LoaiThietBi> getArrayList()
    {
        return dal_ltb.getList();
    }
    public ArrayList<LoaiThietBi> timKiemTheoMaLoai(String maLoai)
    {
        return dal_ltb.timKiemTheoMaLoai(maLoai);
    }
    public ArrayList<LoaiThietBi> timKiemTheoTenLoai(String tenLoai)
    {
        return dal_ltb.timKiemTheoTenLoai(tenLoai);
    }
    public String them(LoaiThietBi nv1)
    {
        
        if(dal_ltb.them(nv1))
        {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }
    public String sua(LoaiThietBi tk1)
    {
        
        if(dal_ltb.sua(tk1) == true)
        {
            return "Cập nhật dữ liệu thành công";
        }
        return "Lỗi cập nhật dữ liệu";
        
                
    }
    public String xoa(String maNV)
    {
        
        if(dal_ltb.xoa(maNV) == true)
        {
            return "Xóa dữ liệu thành công";
        }
        return "Lỗi xóa liệu dữ liệu";
        
                
    }
}
