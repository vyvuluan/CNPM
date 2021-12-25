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
public class ConNguoi 
{
    private String ten,diaChi,sdt;
    private Date ngSinh;

    public ConNguoi(String ten, String diaChi, String sdt, Date ngSinh) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.ngSinh = ngSinh;
    }

    
    
    public ConNguoi() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgSinh() {
        return ngSinh;
    }

    public void setNgSinh(Date ngSinh) {
        this.ngSinh = ngSinh;
    }

    

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
}
