/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_TaiKhoan;
import DTO.TaiKhoan;
import GUI.MainJFrame;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class BLL_TaiKhoan 
{
    DAL_TaiKhoan tk = new DAL_TaiKhoan();
    public ArrayList<TaiKhoan> getArrayList()
    {
        return tk.getListTK();
    }
    public ArrayList<TaiKhoan> timKiemTheoTen(String a)
    {
        return tk.timKiem(a);
    }
    public ArrayList<TaiKhoan> timKiemTheoMaTK(String a)
    {
        return tk.timKiemTheoMa(a);
    }
    public ArrayList<TaiKhoan> timKiemTheoMaNV(String a)
    {
        return tk.timKiemTheoMaNV(a);
    }
    public int kiemTraTK(ArrayList<TaiKhoan> list,String username,String password)
    {
        list = getArrayList();
        
        if(username.equals("admin") && password.equals("admin"))
        {
            MainJFrame.userName = "admin";
            MainJFrame.quyen = "admin";
            return 1;
        }
        else 
        {
            for(int i = 0 ;i < list.size();i++)
            {
                if(username.equals(list.get(i).getUsername()) && password.equals(list.get(i).getPassword())  )
                {
                    if( list.get(i).isTinhTrang() == true)
                    {
                        
                            MainJFrame.userName = list.get(i).getUsername();
                            MainJFrame.quyen = list.get(i).getQuyen();
                            MainJFrame.maNV = list.get(i).getMaNV();
                            return 1;

                        
                    }
                    else return 2;
                }

            }
            return 3;
        }
        
    }
    public int suaTK(TaiKhoan tk1)
    {
        
        if(tk.suaTK(tk1) == true)
        {
            return 1;
        }
         return 0;
        
                
    }
    public String xoaTK(String maTK)
    {
        
        if(tk.xoaTK(maTK) == true)
        {
            return "xóa thành công";
        }
         return "xóa thất bại";
        
                
    }
    public String addTK(TaiKhoan tk1)
    {
        
        if(tk.themTK(tk1))
        {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }
    public String doiPass(String taiKhoan,String matKhau)
    {
        
        if(tk.doiPass(taiKhoan,matKhau))
        {
            return "Đổi mật khẩu thành công";
        }
        return "Đổi mật khẩu thất bại";
    }
}
