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
import model.ChucVu;

/**
 *
 * @author admin
 */
public class ChucVuDAO {

    public static ChucVu getCV(String tenCV) {
        Connection conn = ConnectSQLServer.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement("Select * from ChucVu Where TenCV = ?");
            pst.setString(1, tenCV);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maCV = rs.getString("MaCV");
                String ten = rs.getString("TenCV");
                return new ChucVu(maCV, ten);
            }
            ConnectSQLServer.closeConnection(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getMaCV(String tenCV) {
        Connection conn = ConnectSQLServer.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement("Select * from ChucVu Where TenCV = ?");
            pst.setString(1, tenCV);
            
            return pst.executeQuery().getString("MaCV");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }
}
