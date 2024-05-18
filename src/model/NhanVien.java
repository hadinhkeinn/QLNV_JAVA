/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class NhanVien implements InterfaceNhanVien, InterfaceQuanLy {

    protected int maNV;
    protected String hoTen;
    protected float luongCB;
    protected int ngayLV;
    protected double luongThang;

    public NhanVien(int maNV, String hoTen, float luongCB, int ngayLV) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.ngayLV = ngayLV;
        this.luongThang = 0;
    }

    @Override
    public String toString() {
        return this.maNV + " - " + this.hoTen;
    }

    public void println() {
        System.out.printf("%6d | %20s%5s| %15.1f | %10.1f \n", maNV, hoTen, " ", luongCB, luongThang);
    }

    @Override
    public double tinhLuong() {
        this.luongThang = this.luongCB + this.ngayLV * 100000;
        return this.luongThang;
    }

    @Override
    public void hienThi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void quanLy() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getMaNV() {
        return this.maNV;
    }

    @Override
    public String getHoTen() {
        return this.hoTen;
    }

    @Override
    public float getLuongCB() {
        return this.luongCB;
    }

    @Override
    public int getNgayLV() {
        return this.ngayLV;
    }

    @Override
    public double getLuongThang() {
        return this.luongThang;
    }

}
