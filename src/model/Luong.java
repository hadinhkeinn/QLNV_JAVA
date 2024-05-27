/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Luong {

    private String bacLuong;
    private float luongCB;
    private float hsLuong;
    private float hsPhuCap;

    public Luong(String bacLuong, float luongCB, float hsLuong, float hsPhuCap) {
        this.bacLuong = bacLuong;
        this.luongCB = luongCB;
        this.hsLuong = hsLuong;
        this.hsPhuCap = hsPhuCap;
    }

    public String getBacLuong() {
        return bacLuong;
    }

    public float getLuongCB() {
        return luongCB;
    }

    public float getHsLuong() {
        return hsLuong;
    }

    public float getHsPhuCap() {
        return hsPhuCap;
    }

    public void setLuongCB(float luongCB) {
        this.luongCB = luongCB;
    }

    public void setHsLuong(float hsLuong) {
        this.hsLuong = hsLuong;
    }

    public void setHsPhuCap(float hsPhuCap) {
        this.hsPhuCap = hsPhuCap;
    }

}
