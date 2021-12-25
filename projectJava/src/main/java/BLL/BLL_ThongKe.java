/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_ThongKe;

import java.util.ArrayList;


/**
 *
 * @author ADMIN
 */
public class BLL_ThongKe 
{
    DAL_ThongKe dal_tke= new DAL_ThongKe();
    public ArrayList<String> getArrayList(String ngay)
    {
        return dal_tke.getList(ngay);
    }
    public ArrayList<String> getArrayListmaPn(String ngay)
    {
        return dal_tke.getListmaPN(ngay);
    }
    public int getSL(String ngay)
    {
        return dal_tke.getSL(ngay);
    }
    public int getGia(String ngay)
    {
        return dal_tke.getGia(ngay);
    }
    public int getSLPN(String ngay)
    {
        return dal_tke.getSLPN(ngay);
    }
    public int getGiaPN(String ngay)
    {
        return dal_tke.getGiaPN(ngay);
    }
}
