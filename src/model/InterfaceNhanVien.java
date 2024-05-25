/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public interface InterfaceNhanVien {
    double tinhLuong();
    int getMaNV();
    String getHoTen();
    String getGioiTinh();
    String getQueQuan();
    String getNgaySinh();
    String getSoDT();
    float getLuongCB();
    int getNgayLV();
    double getLuongThang();
    
    void setHoTen(String ten);
    void setGioiTinh(String gt);
    void setQueQuan(String qq);
    void setNgaySinh(String ns);
    void setSoDT(String sdt);
    void setLuongCB(float luongCB);
    void setNgayLV(int ngayLV);
    void setLuongThang(double luongNew);
}
