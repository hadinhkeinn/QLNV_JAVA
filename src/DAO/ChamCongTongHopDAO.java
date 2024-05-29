/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DataBaseConnection.ConnectSQLServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import model.ChamCongTongHop;
import model.ChucVu;
import model.Luong;
import model.NhanVien;
import model.PhongBan;
import model.TrinhDoHocVan;

/**
 *
 * @author admin
 */
public class ChamCongTongHopDAO {

    public static ArrayList<ChamCongTongHop> getBangLuong(String thang, String nam) {
        Connection conn = ConnectSQLServer.getConnection();
        try {
            ArrayList<ChamCongTongHop> list = new ArrayList<>();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from NhanVien NV join ChucVu CV on NV.MaCV = CV.MaCV join PhongBan PB on NV.MaPB = PB.MaPB join TrinhDoHocVan TD on NV.MaTDHV = TD.MaTDHV join Luong on NV.BacLuong = Luong.BacLuong join ChamCongTongHop CC on NV.MaNV = CC.MaNV where Thang = " + thang + " and Nam =" + nam);
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
                ChamCongTongHop cc = new ChamCongTongHop(nv, rs.getInt("Thang"), rs.getInt("Nam"), rs.getInt("SoNgayLam"), rs.getInt("SoSanPham"), rs.getFloat("LuongThang"));
                list.add(cc);
            }
            ConnectSQLServer.closeConnection(conn);
            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void capNhatLuongThang(String maNV, int thang, int nam, float luongThang) {
        Connection conn = ConnectSQLServer.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement("Update ChamCongTongHop set LuongThang = ? where MaNV = ? and Thang = ? and Nam = ?");
            pst.setString(1, luongThang + "");
            pst.setString(2, maNV);
            pst.setString(3, thang + "");
            pst.setString(4, nam + "");
            pst.executeUpdate();
            ConnectSQLServer.closeConnection(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Object[]> getBangLuongNV(String _maNV, String thang, String nam) {
        Connection conn = ConnectSQLServer.getConnection();
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(0);
        try {
            ArrayList<Object[]> kq = new ArrayList<>();
            if (thang.equals("Tất cả")) {
                PreparedStatement pst = conn.prepareStatement("Select * from ChamCongTongHop where MaNV = ? and Nam = ?");
                pst.setString(1, _maNV);
                pst.setString(2, nam);
                ResultSet rs = pst.executeQuery();
                int i = 1;
                while (rs.next()) {
                    kq.add(new Object[]{i++, rs.getString("Thang"), rs.getString("Nam"), rs.getString("SoNgayLam"), rs.getString("SoSanPham"), String.valueOf(df.format(rs.getFloat("LuongThang")))});
                }
                return kq;
            } else {
                PreparedStatement pst = conn.prepareStatement("Select * from ChamCongTongHop where MaNV = ? and Nam = ? and Thang = ?");
                pst.setString(1, _maNV);
                pst.setString(2, nam);
                pst.setString(3, thang);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    kq.add(new Object[]{1, rs.getString("Thang"), rs.getString("Nam"), rs.getString("SoNgayLam"), rs.getString("SoSanPham"), String.valueOf(df.format(rs.getFloat("LuongThang")))});
                }
                return kq;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
