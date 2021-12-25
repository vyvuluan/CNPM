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
public class CtPhieuXuat 
{
    private String maPX,maTB;
    private int soLuong, donGia;

    public CtPhieuXuat() {
    }

    public CtPhieuXuat(String maPX, String maTB, int soLuong, int donGia) {
        this.maPX = maPX;
        this.maTB = maTB;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaPX() {
        return maPX;
    }

    public void setMaPX(String maPX) {
        this.maPX = maPX;
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
