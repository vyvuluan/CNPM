/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_NSX;
import DTO.NhaSanXuat;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class BLL_NSX 
{
    DAL_NSX nsx = new DAL_NSX();
    public ArrayList<NhaSanXuat> getArrayList()
    {
        return nsx.getList();
    }
    public ArrayList<NhaSanXuat> timKiemTheoMa(String ma)
    {
        return nsx.timKiemTheoMa(ma);
    }
    public ArrayList<NhaSanXuat> timKiemTheoten(String ten)
    {
        return nsx.timKiemTheoTen(ten);
    }
    public String sua(NhaSanXuat tk1)
    {
        
        if(nsx.sua(tk1) == true)
        {
            return "Cập nhật dữ liệu thành công";
        }
        return "Lỗi cập nhật dữ liệu";
        
                
    }
    public String xoa(String maNSX)
    {
        
        if(nsx.xoa(maNSX) == true)
        {
            return "Xóa dữ liệu thành công";
        }
        return "Lỗi xóa liệu dữ liệu";
        
                
    }
    public String them(NhaSanXuat nv1)
    {        
        if(nsx.them(nv1))
        {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }
}
