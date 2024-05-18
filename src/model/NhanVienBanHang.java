/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author admin
 */
public class NhanVienBanHang extends NhanVien {

    public int soSP;

    public NhanVienBanHang(int maNV, String hoTen, float luongCB, int ngayLV, int soSP) {
        super(maNV, hoTen, luongCB, ngayLV);
        this.soSP = soSP;
    }

    @Override
    public double tinhLuong() {
        this.luongThang = this.luongCB + this.soSP * 18000;
        return this.luongThang;
    }
}
