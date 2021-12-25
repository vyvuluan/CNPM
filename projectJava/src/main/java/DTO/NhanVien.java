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
public class NhanVien extends ConNguoi
{
    private String maNV;

    public NhanVien() 
    {
        super();
        maNV = null;
    }

    public NhanVien(String maNV, String ten, Date ngaySinh, String diaChi, String sdt) 
    {
        super(ten, diaChi, sdt, ngaySinh);
        this.maNV = maNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    
}
