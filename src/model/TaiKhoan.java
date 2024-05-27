/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class TaiKhoan {
    private String maTK;
    private String tenTK;
    private String maNV;
    private String role;

    public TaiKhoan(String maTK, String tenTK, String maNV, String role) {
        this.maTK = maTK;
        this.tenTK = tenTK;
        this.maNV = maNV;
        this.role = role;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getMaTK() {
        return maTK;
    }

    public String getTenTK() {
        return tenTK;
    }
}
