/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.sql.SQLException;
import view.admin.TrangChu;
import view.login.DangNhap;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
//         DangNhap login = new DangNhap();
//         login.display();
        TrangChu home = new TrangChu();
        home.display();
    }
}
