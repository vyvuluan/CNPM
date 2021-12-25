/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author ADMIN
 */
public class CtPhieuNhap 
{
    private String maPN,maTB;
    private int soLuong, donGia;

    public CtPhieuNhap(String maPN, String maTB, int soLuong, int donGia) {
        this.maPN = maPN;
        this.maTB = maTB;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public CtPhieuNhap() {
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public String getMaTB() {
        return maTB;
    }

    public void setMaTB(String maTB) {
        this.maTB = maTB;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
    
    
}
