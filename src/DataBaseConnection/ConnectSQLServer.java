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
    private String dbName;

    private Connection conn;

    public ConnectSQLServer() throws SQLException {
        try {
            this.conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.out.println("Cannot connect database, " + ex);
        }
    }

    public void testConnection() throws SQLException {
        try {
            System.out.println("Connected");
            DatabaseMetaData dm = (DatabaseMetaData) this.conn.getMetaData();
            System.out.println("Driver name: " + dm.getDriverName());
            System.out.println("Driver version: " + dm.getDriverVersion());
            System.out.println("Product name: " + dm.getDatabaseProductName());
            System.out.println("Product version: " + dm.getDatabaseProductVersion());
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public ResultSet queryDB(String query) throws SQLException {
        try {
            Statement stmt = this.conn.createStatement();

            return stmt.executeQuery(query);
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
}
