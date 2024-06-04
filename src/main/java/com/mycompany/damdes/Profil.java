/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.damdes;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author M FAKIH IZZUL HAQ
 */
public class Profil extends javax.swing.JFrame {
    private JPanel currentPanel;
    PreparedStatement pst = null;
    Connection conn = null;
    ResultSet rs = null;

    /**
     * Creates new form Profil
     */
    public Profil() {
        initComponents();
        conn = DAMDES.connect();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Username = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_comment = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_brnd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_logout1 = new javax.swing.JButton();
        jabatan_p = new javax.swing.JTextField();
        nama_p = new javax.swing.JTextField();
        username_p = new javax.swing.JTextField();
        simpn_p = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        password_p = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Username.setBackground(new java.awt.Color(0, 232, 232));
        Username.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4), "Profil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 3, 60), new java.awt.Color(0, 51, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        txt_comment.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_brnd.setBackground(new java.awt.Color(0, 232, 232));
        btn_brnd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_brnd.setText("Beranda");
        btn_brnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_brndActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 232, 232));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Profil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_logout1.setBackground(new java.awt.Color(204, 204, 204));
        btn_logout1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_logout1.setText("LOG OUT");
        btn_logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_brnd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btn_logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btn_brnd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(btn_logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jabatan_p.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jabatan_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabatan_pActionPerformed(evt);
            }
        });

        nama_p.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        nama_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_pActionPerformed(evt);
            }
        });

        username_p.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        username_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_pActionPerformed(evt);
            }
        });

        simpn_p.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        simpn_p.setText("Simpan");
        simpn_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpn_pActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Jabatan");

        password_p.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        password_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_pActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UsernameLayout = new javax.swing.GroupLayout(Username);
        Username.setLayout(UsernameLayout);
        UsernameLayout.setHorizontalGroup(
            UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsernameLayout.createSequentialGroup()
                .addGroup(UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UsernameLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1))
                    .addGroup(UsernameLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(txt_comment, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UsernameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UsernameLayout.createSequentialGroup()
                                .addGap(447, 447, 447)
                                .addComponent(simpn_p, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UsernameLayout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addGroup(UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(42, 42, 42)
                                .addGroup(UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(username_p, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jabatan_p, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(password_p, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                                    .addComponent(nama_p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        UsernameLayout.setVerticalGroup(
            UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsernameLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UsernameLayout.createSequentialGroup()
                        .addGroup(UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UsernameLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2))
                            .addGroup(UsernameLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(nama_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addGroup(UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(71, 71, 71)
                        .addGroup(UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(password_p, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(UsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jabatan_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(simpn_p, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_comment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_pActionPerformed

    private void nama_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_pActionPerformed

    private void jabatan_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jabatan_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jabatan_pActionPerformed

    private void btn_logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logout1ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin log out?", "Konfirmasi Log Out", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            // Menutup frame saat ini dan membuka kembali layar login
            this.dispose();

            // Membuka kembali layar login
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btn_logout1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_brndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_brndActionPerformed
        // TODO add your handling code here:
        new Beranda().show();
    }//GEN-LAST:event_btn_brndActionPerformed

    private void simpn_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpn_pActionPerformed
        // TODO add your handling code here
String Nama = nama_p.getText();
String Usernama = username_p.getText();
String Password = password_p.getText();
String Jabatan = jabatan_p.getText();

// Create a SQL query to insert all the data into the database table
String sqlquery = "INSERT INTO profil (Nama, Username, Password, Jabatan) VALUES (?, ?, ?, ?)";
try {
    pst = conn.prepareStatement(sqlquery);
    if (Nama.isEmpty() && Usernama.isEmpty() && Password.isEmpty() && Jabatan.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Masukan Data Anda");
    } else {
        // Set the values for the prepared statement
        pst.setString(1, Nama);
        pst.setString(2, Usernama);
        pst.setString(3, Password);
        pst.setString(4, Jabatan);

        // Execute the prepared statement
        pst.executeUpdate();

        // Clear the text fields
        nama_p.setText("");
        username_p.setText("");
        password_p.setText("");
        jabatan_p.setText("");
        
        JOptionPane.showMessageDialog(null, "Profil Anda Telah Diperbarui");
    }
} catch (HeadlessException | SQLException e) {
    JOptionPane.showMessageDialog(null, e);
}

    }//GEN-LAST:event_simpn_pActionPerformed

    private void password_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_pActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Username;
    private javax.swing.JButton btn_brnd;
    private javax.swing.JButton btn_logout1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jabatan_p;
    private javax.swing.JTextField nama_p;
    private javax.swing.JPasswordField password_p;
    private javax.swing.JButton simpn_p;
    private javax.swing.JLabel txt_comment;
    private javax.swing.JTextField username_p;
    // End of variables declaration//GEN-END:variables
}