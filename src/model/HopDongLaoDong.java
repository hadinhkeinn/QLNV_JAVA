/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class HopDongLaoDong {
    private String maHD;
    private String maNV;
    private String loaiHD;
    private String ngayBD;
    private String ngayKT;

    public HopDongLaoDong(String maHD, String maNV, String loaiHD, String ngayBD, String ngayKT) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.loaiHD = loaiHD;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    public String getMaHD() {
        return maHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getLoaiHD() {
        return loaiHD;
    }

    public String getNgayBD() {
        return ngayBD;
    }

    public String getNgayKT() {
        return ngayKT;
    }
    
}
