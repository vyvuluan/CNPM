/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class KhachHang extends ConNguoi
{
    private String maKH;

    public KhachHang() 
    {
        super();
        maKH = null;
        
    }

    public KhachHang(String maKH, String ten, Date ngaySinh, String diaChi, String sdt) {
        super(ten, diaChi, sdt, ngaySinh);
        this.maKH = maKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }
    
    
}
