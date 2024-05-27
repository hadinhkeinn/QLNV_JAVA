/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import java.sql.*;
import DataBaseConnection.ConnectSQLServer;
import model.NhanVien;

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
            ResultSet rs = st.executeQuery("Select * from NhanVien");
            while (rs.next()) {
                String maNV = rs.getString("MaNV");
                String hoTen = rs.getString("HoTen");
                String danToc = rs.getString("DanToc");
                String gioiTinh = rs.getString("GioiTinh");
                String queQuan = rs.getString("QueQuan");
                String soDT = rs.getString("SoDienThoai");
                String ngaySinh = rs.getString("NgaySinh").split(" ")[0];
                NhanVien nv = new NhanVien(maNV, hoTen, danToc, gioiTinh, queQuan, ngaySinh, soDT);
                list.add(nv);
            }
            ConnectSQLServer.closeConnection(conn);
            return list;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
