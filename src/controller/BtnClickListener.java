/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.MainView;

/**
 *
 * @author admin
 */
public class BtnClickListener implements ActionListener {

    private MainView mainView;

    public BtnClickListener(MainView mainView) {
        this.mainView = mainView;
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        switch (src) {
            case "Load data" -> {
                try {
                    mainView.initTableData();
                } catch (SQLException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            case "Tính lương" -> {
                
            }
        }
    }
    
}
