/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.sql.SQLException;
import model.NhanVienDAO;
import view.admin.Home;
import view.admin.MainView;
import view.admin.TrangChu;

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
//        MainView mainView = new MainView();
//        mainView.display();
        Home home = new Home();
        home.display();
    }
}
