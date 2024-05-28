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
import model.PhongBan;

/**
 *
 * @author admin
 */
public class PhongBanDAO {

    public static PhongBan getPhongBan(String tenPB) {
        Connection conn = ConnectSQLServer.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement("Select * from PhongBan Where TenPB = ?");
            pst.setString(1, tenPB);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                return new PhongBan(rs.getString("MaPB"), rs.getString("TenPB"), rs.getString("DiaChi"), rs.getString("SDTPB"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
