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
public class PhieuXuat 
{
    private String maPX,maNV,maKH,tinhTrang;
    private  Date ngayMua;

    public PhieuXuat(String maPX, String maNV, String maKH, Date ngayMua) {
        this.maPX = maPX;
        this.maNV = maNV;
        this.maKH = maKH;
        this.ngayMua = ngayMua;
        this.tinhTrang = tinhTrang;
    }

    public PhieuXuat() {
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    
    
    public String getMaPX() {
        return maPX;
    }

    public void setMaPX(String maPX) {
        this.maPX = maPX;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }
    
}
