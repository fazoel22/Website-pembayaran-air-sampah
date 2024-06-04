/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.damdes;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author M FAKIH IZZUL HAQ
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DAMDES {
    private static Connection mysqlkoneksi;

    public static Connection connect() {
        // Informasi login ke server MySQL
        String username = "root"; // Nama pengguna MySQL
        String password = ""; // Kata sandi MySQL

        try {
            // Load driver JDBC untuk MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Buat koneksi ke database MySQL
            String url = "jdbc:mysql://localhost:3306/damdes";
            Connection conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch (ClassNotFoundException e) {
            // Tangani kesalahan jika driver JDBC tidak ditemukan
            JOptionPane.showMessageDialog(null, "Driver JDBC tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            // Tangani kesalahan jika koneksi ke database gagal
            JOptionPane.showMessageDialog(null, "Koneksi ke database gagal: " + e.getMessage());
        }
 
        return null; // Jika gagal, kembalikan nilai null
    }

    public static void main(String[] args) {
        // Tes koneksi ke database
        Connection conn = DAMDES.connect();
        if (conn != null) {
            JOptionPane.showMessageDialog(null, "Koneksi ke database berhasil!");
        } else {
            JOptionPane.showMessageDialog(null, "Koneksi ke database gagal!");
        }
        
    }
}