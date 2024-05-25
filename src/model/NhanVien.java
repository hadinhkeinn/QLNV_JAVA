/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class NhanVien implements InterfaceNhanVien {

    protected int maNV;
    protected String hoTen;
    protected String gioiTinh;
    protected String queQuan;
    protected String ngaySinh;
    protected String soDT;
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

    @Override
    public String getGioiTinh() {
        return this.gioiTinh;
    }

    @Override
    public String getQueQuan() {
        return this.queQuan;
    }

    @Override
    public String getNgaySinh() {
        return this.ngaySinh;
    }

    @Override
    public String getSoDT() {
        return this.soDT;
    }

    @Override
    public void setHoTen(String ten) {
        this.hoTen = ten;
    }

    @Override
    public void setGioiTinh(String gt) {
        this.gioiTinh = gt;
    }

    @Override
    public void setQueQuan(String qq) {
        this.queQuan = qq;
    }

    @Override
    public void setNgaySinh(String ns) {
        this.ngaySinh = ns;
    }

    @Override
    public void setSoDT(String sdt) {
        this.soDT = sdt;
    }

    @Override
    public void setLuongCB(float luongCB) {
        this.luongCB = luongCB;
    }

    @Override
    public void setNgayLV(int ngayLV) {
        this.ngayLV = ngayLV;
    }

    @Override
    public void setLuongThang(double luongNew) {
        this.luongThang = luongNew;
    }

}
