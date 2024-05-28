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
import model.TrinhDoHocVan;

/**
 *
 * @author admin
 */
public class TrinhDoHocVanDAO {

    public static TrinhDoHocVan getTDHV(String td, String cn) {
        Connection conn = ConnectSQLServer.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement("Select * from TrinhDoHocVan Where TenTDHV = ? and CNganh = ?");
            pst.setString(1, td);
            pst.setString(2, cn);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                return new TrinhDoHocVan(rs.getString("MaTDHV"), rs.getString("TenTDHV"), rs.getString("CNganh"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
