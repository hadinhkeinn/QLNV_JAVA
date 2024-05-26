/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBaseConnection;

import java.sql.*;

/**
 *
 * @author admin
 */
public class ConnectSQLServer {

    private static final String url = "jdbc:sqlserver://localhost:1433;"
            + "encrypt=true;trustServerCertificate=true;"
            + "databaseName=QLNV_APP;";
    private static final String username = "sa";
    private static final String password = "sa";

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void closeConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
