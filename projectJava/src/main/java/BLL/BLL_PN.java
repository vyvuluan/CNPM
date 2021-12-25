/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_PN;
import DTO.CtPhieuNhap;
import DTO.PhieuNhap;
import DTO.ThietBi;
import DTO.ThongKe_PN;
import GUI.MainJFrame;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class BLL_PN {
    DAL_PN bll_pn = new DAL_PN();
    public ArrayList<PhieuNhap> getArrayList()
    {
        return bll_pn.getList();
    }
    public void in(String ma)
    {
        bll_pn.in(ma);
    }
    public ArrayList<CtPhieuNhap> getArrayListCTPN()
    {
        return bll_pn.getListCTPN();
    }
    public ArrayList<ThongKe_PN> getArrayListCTPNTK()
    {
        return bll_pn.getListCTPNTK();
    }
    public ArrayList<ThongKe_PN> thongKe_PN_ngay(String ngay1,String ngay2)
    {
        return bll_pn.thongKe_PN_ngay(ngay1, ngay2);
    }
    public int countDong(String maPN)
    {
        return bll_pn.countDong(maPN);
    }
    public String them(PhieuNhap nv1)
    {        
        if(bll_pn.them(nv1))
        {
            
            return "Thêm thành công";
            
        }
        return "Thêm thất bại";
    }
    public String themCTPN(CtPhieuNhap nv1)
    {        
        if(bll_pn.themCTPN(nv1))
        {
            
            return "Thêm thành công";
            
        }
        return "Thêm thất bại";
    }
    public boolean sua(PhieuNhap nv1)
    {        
        if(bll_pn.sua(nv1))
        {
            
            return true;
            
        }
        return false;
    }
    public String suaTinhTrang(String maPN)
    {        
        if(bll_pn.suaTinhTrang(maPN))
        {
            
            return "Thanh toán phiếu nhập thành công";
            
        }
        return "Thanh toán phiếu nhập thất bại";
    }
    public boolean suaCtPN(CtPhieuNhap nv1)
    {        
        if(bll_pn.suaCtPN(nv1))
        {
            
            return true;
            
        }
        return false;
    }
    public String suaCtPNsoLuong_donGia(String maPN,String maTB,int soLuong,int donGia)
    {        
        if(bll_pn.suaCtPNsoLuong_donGia(maPN,maTB,soLuong,donGia))
        {
            
            return "Thêm thành công";
            
        }
        return "Thêm thất bại";
    }
    public String xoa(String maPN)
    {        
        if(bll_pn.xoa(maPN))
        {
            
            return "Xóa thành công";
            
        }
        return "Xóa thất bại";
    }
    public String xoaCtPN(String maPN,String maTB)
    {        
        if(bll_pn.xoaCtPN(maPN,maTB))
        {
            
            return "Xóa thành công";
            
        }
        return "Xóa thất bại";
    }
    public String xoaCtPNma(String maPN)
    {        
        if(bll_pn.xoaCtPNma(maPN))
        {
            
            return "Xóa thành công";
            
        }
        return "Xóa thất bại";
    }
    
}
