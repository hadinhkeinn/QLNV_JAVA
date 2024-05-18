/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class NhanVienVanPhong extends NhanVien {

    public NhanVienVanPhong(int maNV, String hoTen, float luongCB, int ngayLV) {
        super(maNV, hoTen, luongCB, ngayLV);
    }

    @Override
    public double tinhLuong() {
        this.luongThang = this.luongCB + this.ngayLV * 150000;
        return this.luongThang;
    }
}
