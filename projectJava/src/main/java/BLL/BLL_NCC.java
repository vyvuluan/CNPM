/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_NCC;
import DTO.NhaCungCap;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class BLL_NCC 
{
    DAL_NCC ncc = new DAL_NCC();
    public ArrayList<NhaCungCap> getArrayList()
    {
        return ncc.getList();
    }
    public ArrayList<NhaCungCap> timKiemTheoMa(String ma)
    {
        return ncc.timKiemTheoMa(ma);
    }
    public ArrayList<NhaCungCap> timKiemTheoTen(String ten)
    {
        return ncc.timKiemTheoTen(ten);
    }
    public String sua(NhaCungCap tk1)
    {
        
        if(ncc.sua(tk1) == true)
        {
            return "Cập nhật dữ liệu thành công";
        }
        return "Lỗi cập nhật dữ liệu";
        
                
    }
    public String xoa(String maNCC)
    {
        
        if(ncc.xoa(maNCC) == true)
        {
            return "Xóa dữ liệu thành công";
        }
        return "Lỗi xóa liệu dữ liệu";
        
                
    }
    public String them(NhaCungCap nv1)
    {        
        if(ncc.them(nv1))
        {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }
}
