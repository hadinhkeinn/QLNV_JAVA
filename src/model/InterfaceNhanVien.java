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
//    double tinhLuong();
    String getMaNV();
    String getHoTen();
    String getDanToc();
    String getGioiTinh();
    String getQueQuan();
    String getNgaySinh();
    String getSoDT();
    
    void setHoTen(String ten);
    void setDanToc(String dt);
    void setGioiTinh(String gt);
    void setQueQuan(String qq);
    void setNgaySinh(String ns);
    void setSoDT(String sdt);
}
