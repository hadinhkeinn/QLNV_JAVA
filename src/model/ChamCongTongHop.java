/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class ChamCongTongHop {

    private NhanVien nhanVien;
    private int thang;
    private int nam;
    private int soNgayLam;
    private int soSP;
    private float luongThang;

    public ChamCongTongHop(NhanVien nhanVien, int thang, int nam, int soNgayLam, int soSP, float luongThang) {
        this.nhanVien = nhanVien;
        this.thang = thang;
        this.nam = nam;
        this.soNgayLam = soNgayLam;
        this.soSP = soSP;
        this.luongThang = luongThang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public int getSoSP() {
        return soSP;
    }

    public float getLuongThang() {
        return luongThang;
    }

    public void setLuongThang(float luongThang) {
        this.luongThang = luongThang;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

}
