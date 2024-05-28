/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DataBaseConnection.ConnectSQLServer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import model.HopDongLaoDong;

/**
 *
 * @author admin
 */
public class HopDongLaoDongDAO {

    public static int getSoLuongHD() {
        Connection conn = ConnectSQLServer.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select COUNT(MaHD) as SoLuong from HopDongLaoDong");
            while (rs.next()) {
                return rs.getInt("SoLuong");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void insertHDLD(HopDongLaoDong hd) {
        Connection conn = ConnectSQLServer.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement("Insert HopDongLaoDong values(?,?,?,?,?)");
            pst.setString(1, hd.getMaHD());
            pst.setString(2, hd.getMaNV());
            pst.setString(3, hd.getLoaiHD());
            pst.setString(4, hd.getNgayBD());
            pst.setString(5, hd.getNgayKT());
            pst.executeUpdate();
            ConnectSQLServer.closeConnection(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
