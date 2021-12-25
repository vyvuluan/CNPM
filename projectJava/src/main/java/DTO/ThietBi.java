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
public class ThietBi 
{
    private String maTB,tenTB,maNSX,maNCC,maLoai,thongSo,hinh;
    private int giaThanh,soLuong;

    public ThietBi(String maTB, String tenTB, String maNSX, String maNCC, String maLoai, int giaThanh,String thongSo,int soLuong,String hinh) {
        this.maTB = maTB;
        this.tenTB = tenTB;
        this.maNSX = maNSX;
        this.maNCC = maNCC;
        this.maLoai = maLoai;
        this.giaThanh = giaThanh;
        this.thongSo = thongSo;
        this.soLuong = soLuong;
        this.hinh = hinh;
    }

	public ThietBi(String maTB, int soLuong) {
        this.maTB = maTB;
        this.soLuong = soLuong;
    }	

    public ThietBi() {
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    
    public String getThongSo() {
        return thongSo;
    }

    public void setThongSo(String thongSo) {
        this.thongSo = thongSo;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    
    
    public String getMaTB() {
        return maTB;
    }

    public void setMaTB(String maTB) {
        this.maTB = maTB;
    }

    public String getTenTB() {
        return tenTB;
    }

    public void setTenTB(String tenTB) {
        this.tenTB = tenTB;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public int getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(int giaThanh) {
        this.giaThanh = giaThanh;
    }
    
}
