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

    protected String maNV;
    protected String hoTen;
    protected String danToc;
    protected String gioiTinh;
    protected String queQuan;
    protected String ngaySinh;
    protected String soDT;

    public NhanVien(String maNV, String hoTen, String danToc, String gioiTinh, String queQuan, String ngaySinh, String soDT) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.danToc = danToc;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.soDT = soDT;
    }

    @Override
    public String toString() {
        return this.maNV + " - " + this.hoTen;
    }

    @Override
    public String getMaNV() {
        return this.maNV;
    }

    @Override
    public String getHoTen() {
        return this.hoTen;
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
    public String getDanToc() {
        return this.danToc;
    }

    @Override
    public void setDanToc(String dt) {
        this.danToc = dt;
    }
}
