/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class TrinhDoHocVan {
    private String maTD;
    private String tenTD;
    private String cNganh;

    public TrinhDoHocVan(String maTD, String tenTD, String cNganh) {
        this.maTD = maTD;
        this.tenTD = tenTD;
        this.cNganh = cNganh;
    }

    public String getMaTD() {
        return maTD;
    }

    public String getTenTD() {
        return tenTD;
    }

    public String getcNganh() {
        return cNganh;
    }

    public void setTenTD(String tenTD) {
        this.tenTD = tenTD;
    }

    public void setcNganh(String cNganh) {
        this.cNganh = cNganh;
    }
}
