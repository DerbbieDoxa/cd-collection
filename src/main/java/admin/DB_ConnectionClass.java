/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author iamdveloper
 */
public class DB_ConnectionClass {

    private static Connection conn = null;

    String password = "password";
    String username = "root";
    String url = "jdbc:mysql://localhost:3306/music";

//    private Statement stmt;
    public Connection connect() throws Exception {
        try {
            if (conn == null || conn.isClosed()) {

                conn = DriverManager.getConnection(url, username, password);
            }
            return conn;

        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }

    }

    public static void closeConnection() throws Exception {
        try {
            if(conn != null && !conn.isClosed()){
                conn.close();
            }
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }
}
