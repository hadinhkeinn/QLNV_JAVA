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
    private NhanVien nv;
    private String role;

    public TaiKhoan(String maTK, String tenTK, NhanVien nv, String role) {
        this.maTK = maTK;
        this.tenTK = tenTK;
        this.nv = nv;
        this.role = role;
    }

    public NhanVien getNv() {
        return nv;
    }

    public String getMaTK() {
        return maTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }
    
}
