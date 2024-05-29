/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.user;

import model.TaiKhoan;

/**
 *
 * @author admin
 */
public class TrangChuUser extends javax.swing.JFrame {

    private DanhSachNhanVien dsnvView;
    private ThongTinNhanVien thongtinNVView;
    private javax.swing.JTabbedPane tabUser;
    private TaiKhoan taiKhoanUser;

    public TrangChuUser(TaiKhoan tk) {
        this.taiKhoanUser = tk;
        initComponent();
    }

    private void initComponent() {
        dsnvView = new DanhSachNhanVien();
        thongtinNVView = new ThongTinNhanVien(taiKhoanUser);
        thongtinNVView.setTaiKhoan(taiKhoanUser);
        tabUser = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang thông tin dành cho nhân viên");

        tabUser.addTab("DS Nhân Viên", dsnvView);
        tabUser.addTab("Thông tin nhân viên", thongtinNVView);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabUser)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabUser)
        );
        pack();
    }

    public void display() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuUser(taiKhoanUser).setVisible(true);
            }
        });
    }

    public void setTaiKhoan(TaiKhoan tk) {
        this.taiKhoanUser = tk;
    }
}
