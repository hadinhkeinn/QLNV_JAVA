/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import DataBaseConnection.ConnectSQLServer;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class CongTy {

    public int maCT;
    public String tenCT;
    public ArrayList<NhanVien> DSNV;

    public CongTy(int maCT, String tenCT) {
        this.maCT = maCT;
        this.tenCT = tenCT;
        this.DSNV = new ArrayList<>();
    }

    // 1. Khởi tạo tự động các nhân viên.
    public void initNhanVien() throws SQLException {
        ConnectSQLServer SQL = new ConnectSQLServer();
        String query = "select nv.MaNhanVien, HoTen, LuongCoBan, LoaiNhanVien, SoNgayLam, SoSanPham"
                + " from NhanVien nv JOIN ChamCongTongHop cc on nv.MaNhanVien = cc.MaNhanVien";
        ResultSet rs = SQL.queryDB(query);

        while (rs.next()) {
            int maNV = Integer.parseInt(rs.getString("MaNhanVien"));
            String hoTen = rs.getString("HoTen");
            float luongCB = rs.getFloat("LuongCoBan");
            String loaiNV = rs.getString("LoaiNhanVien");
            int ngayLV = rs.getInt("SoNgayLam");
            int soSP = rs.getInt("SoSanPham");

            switch (loaiNV) {
                case "Bán Hàng" -> {
                    this.DSNV.add(new NhanVienBanHang(maNV, hoTen, luongCB, ngayLV, soSP));
                }

                case "Văn Phòng" -> {
                    this.DSNV.add(new NhanVienVanPhong(maNV, hoTen, luongCB, ngayLV));
                }
                default -> {
                    this.DSNV.add(new NhanVien(maNV, hoTen, luongCB, ngayLV));
                }
            }
        }
    }

    // 2. Tính lương hằng tháng
    public void tinhLuongNV() {
        for (NhanVien nv : this.DSNV) {
            nv.tinhLuong();
        }
    }

    // 3. Xuất các nhân viên
    public void xuatNhanVien() {
        System.out.printf("%6s | %20s%5s | %15s | %10s \n", "Ma NV", "Ho Ten", " ", "Luong CB", "Luong Thang");
        System.out.println("-----------------------------------------------------------------------");
        for (NhanVien nv : this.DSNV) {
            nv.println();
        }
        System.out.println("-----------------------------------------------------------------------");
    }

    // 4. Tìm nhân viên theo mã
    public NhanVien timNhanVien(int maNV) {
        for (NhanVien nv : this.DSNV) {
            if (nv.getMaNV() == maNV) {
                return nv;
            }
        }
        return null;
    }
    
    // 5. 
}
