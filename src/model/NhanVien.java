/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class NhanVien {

    private String maNV;
    private String hoTen;
    private String danToc;
    private String gioiTinh;
    private String queQuan;
    private String ngaySinh;
    private String soDT;
    private ChucVu chucVu;
    private PhongBan phongBan;
    private TrinhDoHocVan trinhDo;
    private Luong bacLuong;

    public NhanVien(String maNV, String hoTen, String danToc, String gioiTinh, String queQuan, String ngaySinh, String soDT, ChucVu chucVu, PhongBan phongBan, TrinhDoHocVan trinhDo, Luong bacLuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.danToc = danToc;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.soDT = soDT;
        this.chucVu = chucVu;
        this.phongBan = phongBan;
        this.trinhDo = trinhDo;
        this.bacLuong = bacLuong;
    }

    @Override
    public String toString() {
        return this.maNV + " - " + this.hoTen;
    }

    public String getMaNV() {
        return this.maNV;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public String getQueQuan() {
        return this.queQuan;
    }

    public String getNgaySinh() {
        return this.ngaySinh;
    }

    public String getSoDT() {
        return this.soDT;
    }

    public void setHoTen(String ten) {
        this.hoTen = ten;
    }

    public void setGioiTinh(String gt) {
        this.gioiTinh = gt;
    }

    public void setQueQuan(String qq) {
        this.queQuan = qq;
    }

    public void setNgaySinh(String ns) {
        this.ngaySinh = ns;
    }
    
    public void setSoDT(String sdt) {
        this.soDT = sdt;
    }
    
    public String getDanToc() {
        return this.danToc;
    }
    
    public void setDanToc(String dt) {
        this.danToc = dt;
    }
    
    public ChucVu getChucVu() {
        return this.chucVu;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public Luong getBacLuong() {
        return bacLuong;
    }

    public TrinhDoHocVan getTrinhDo() {
        return trinhDo;
    }

    public void setBacLuong(Luong bacLuong) {
        this.bacLuong = bacLuong;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public void setTrinhDo(TrinhDoHocVan trinhDo) {
        this.trinhDo = trinhDo;
    }
    
}
