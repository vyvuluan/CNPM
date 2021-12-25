/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_NhanVien;
import DTO.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class BLL_NhanVien 
{
    DAL_NhanVien nv = new DAL_NhanVien();
    public ArrayList<NhanVien> getArrayList()
    {
        return nv.getList();
    }
    public String addNV(NhanVien nv1)
    {
        if(nv.hasNV(nv1.getMaNV()))
        {
            return "Mã nhân viên tồn tại";
        }
        if(nv.themNV(nv1))
        {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }
    public String sua(NhanVien tk1)
    {
        
        if(nv.sua(tk1) == true)
        {
            return "Cập nhật dữ liệu thành công";
        }
        return "Lỗi cập nhật dữ liệu";
        
                
    }
    public String xoa(String maNV)
    {
        
        if(nv.xoa(maNV) == true)
        {
            return "Xóa dữ liệu thành công";
        }
        return "Lỗi xóa liệu dữ liệu";
        
                
    }
    public ArrayList<NhanVien> timKiem(String ten)
    {
        return nv.timKiem(ten);
    }
    public ArrayList<NhanVien> timKiemTheoMa(String maNV)
    {
        return nv.timKiemTheoMa(maNV);
    }
}
