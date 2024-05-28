/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import java.sql.*;
import DataBaseConnection.ConnectSQLServer;
import model.ChucVu;
import model.Luong;
import model.NhanVien;
import model.PhongBan;
import model.TrinhDoHocVan;

/**
 *
 * @author admin
 */
public class NhanVienDAO {

    public static ArrayList<NhanVien> getDS() {
        Connection conn = ConnectSQLServer.getConnection();

        try {
            ArrayList<NhanVien> list = new ArrayList<>();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from NhanVien NV join ChucVu CV on NV.MaCV = CV.MaCV join PhongBan PB on NV.MaPB = PB.MaPB join TrinhDoHocVan TD on NV.MaTDHV = TD.MaTDHV join Luong on NV.BacLuong = Luong.BacLuong");
            while (rs.next()) {
                String maNV = rs.getString("MaNV");
                String hoTen = rs.getString("HoTen");
                String danToc = rs.getString("DanToc");
                String gioiTinh = rs.getString("GioiTinh");
                String queQuan = rs.getString("QueQuan");
                String soDT = rs.getString("SoDienThoai");
                String ngaySinh = rs.getString("NgaySinh").split(" ")[0];
                ChucVu chucVu = new ChucVu(rs.getString("MaCV"), rs.getString("TenCV"));
                PhongBan phong = new PhongBan(rs.getString("MaPB"), rs.getString("TenPB"), rs.getString("DiaChi"), rs.getString("SDTPB"));
                TrinhDoHocVan trinhDo = new TrinhDoHocVan(rs.getString("MaTDHV"), rs.getString("TenTDHV"), rs.getString("CNganh"));
                Luong luong = new Luong(rs.getString("BacLuong"), rs.getFloat("LuongCB"), rs.getFloat("HSLuong"), rs.getFloat("HSPhuCap"));
                NhanVien nv = new NhanVien(maNV, hoTen, danToc, gioiTinh, queQuan, ngaySinh, soDT, chucVu, phong, trinhDo, luong);
                list.add(nv);
            }
            ConnectSQLServer.closeConnection(conn);
            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static NhanVien getNV(String maNV) {
        Connection conn = ConnectSQLServer.getConnection();

        try {
            NhanVien nv;
            PreparedStatement pst = conn.prepareStatement("Select * from NhanVien NV join ChucVu CV on NV.MaCV = CV.MaCV join PhongBan PB on NV.MaPB = PB.MaPB join TrinhDoHocVan TD on NV.MaTDHV = TD.MaTDHV join Luong on NV.BacLuong = Luong.BacLuong Where MaNV = ?");
            pst.setString(1, maNV);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String ma = rs.getString("MaNV");
                String hoTen = rs.getString("HoTen");
                String danToc = rs.getString("DanToc");
                String gioiTinh = rs.getString("GioiTinh");
                String queQuan = rs.getString("QueQuan");
                String soDT = rs.getString("SoDienThoai");
                String ngaySinh = rs.getString("NgaySinh").split(" ")[0];
                ChucVu chucVu = new ChucVu(rs.getString("MaCV"), rs.getString("TenCV"));
                PhongBan phong = new PhongBan(rs.getString("MaPB"), rs.getString("TenPB"), rs.getString("DiaChi"), rs.getString("SDTPB"));
                TrinhDoHocVan trinhDo = new TrinhDoHocVan(rs.getString("MaTDHV"), rs.getString("TenTDHV"), rs.getString("CNganh"));
                Luong luong = new Luong(rs.getString("BacLuong"), rs.getFloat("LuongCB"), rs.getFloat("HSLuong"), rs.getFloat("HSPhuCap"));
                nv = new NhanVien(ma, hoTen, danToc, gioiTinh, queQuan, ngaySinh, soDT, chucVu, phong, trinhDo, luong);
                return nv;
            }
            ConnectSQLServer.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void insertNV(NhanVien nv) {
        Connection conn = ConnectSQLServer.getConnection();

        try {
            PreparedStatement pst = conn.prepareStatement("Insert NhanVien values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, nv.getMaNV());
            pst.setString(2, nv.getHoTen());
            pst.setString(3, nv.getDanToc());
            pst.setString(4, nv.getGioiTinh());
            pst.setString(5, nv.getQueQuan());
            pst.setString(6, nv.getNgaySinh());
            pst.setString(7, nv.getSoDT());
            pst.setString(8, nv.getChucVu().getMaCV());
            pst.setString(9, nv.getPhongBan().getMaPB());
            pst.setString(10, nv.getTrinhDo().getMaTD());
            pst.setString(11, nv.getBacLuong().getBacLuong());
            pst.executeUpdate();
            ConnectSQLServer.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateNV(NhanVien nv) {
        Connection conn = ConnectSQLServer.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement("Update NhanVien set HoTen = ?, DanToc = ?, GioiTinh = ?, QueQuan = ?, NgaySinh = ?, SoDienThoai = ?, MaCV = ?, MaPB = ?, BacLuong = ? where MaNV = ?");
            pst.setString(1, nv.getHoTen());
            pst.setString(2, nv.getDanToc());
            pst.setString(3, nv.getGioiTinh());
            pst.setString(4, nv.getQueQuan());
            pst.setString(5, nv.getNgaySinh());
            pst.setString(6, nv.getSoDT());
            pst.setString(7, nv.getChucVu().getMaCV());
            pst.setString(8, nv.getPhongBan().getMaPB());
            pst.setString(9, nv.getBacLuong().getBacLuong());
            pst.setString(10, nv.getMaNV());
            pst.executeUpdate();
            ConnectSQLServer.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void xoaNV(String maNV) {
        Connection conn = ConnectSQLServer.getConnection();

        try {
            // Xoa HopDong
            PreparedStatement pst = conn.prepareStatement("Delete HopDongLaoDong where MaNV = ?");
            pst.setString(1, maNV);
            pst.executeUpdate();
            // Xoa thong tin luong
            pst = conn.prepareStatement("Delete ChamCongTongHop where MaNV = ?");
            pst.setString(1, maNV);
            pst.executeUpdate();
            // Xoa TaiKhoan
            pst = conn.prepareStatement("Delete TaiKhoan where MaNV = ?");
            pst.setString(1, maNV);
            pst.executeUpdate();
            // Xoa NV
            pst = conn.prepareStatement("Delete NhanVien where MaNV = ?");
            pst.setString(1, maNV);
            pst.executeUpdate();
            ConnectSQLServer.closeConnection(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
