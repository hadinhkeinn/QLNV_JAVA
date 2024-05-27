/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class PhongBan {
    private String maPB;
    private String tenPB;
    private String diaChi;
    private String SDTPB;

    public PhongBan(String maPB, String tenPB, String diaChi, String SDTPB) {
        this.maPB = maPB;
        this.tenPB = tenPB;
        this.diaChi = diaChi;
        this.SDTPB = SDTPB;
    }

    public String getMaPB() {
        return maPB;
    }

    public String getTenPB() {
        return tenPB;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSDTPB() {
        return SDTPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSDTPB(String SDTPB) {
        this.SDTPB = SDTPB;
    }
    
}
