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
import model.Luong;

/**
 *
 * @author admin
 */
public class LuongDAO {

    public static Luong getLuong(String bac) {
        Connection conn = ConnectSQLServer.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement("Select * from Luong Where BacLuong = ?");
            pst.setString(1, bac);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                return new Luong(rs.getString("BacLuong"), rs.getFloat("LuongCB"), rs.getFloat("HSLuong"), rs.getFloat("HSPhuCap"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
