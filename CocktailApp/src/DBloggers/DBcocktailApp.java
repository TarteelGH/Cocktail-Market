/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBloggers;

import cocktailapp.Cup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;


/**
 *
 * @author tarteel
 */

public class DBcocktailApp {
    String url = "jdbc:mysql://localhost:3306/cocktaildatabase";
    String username = "root";
    String password = "";
    String date, time;
//    String log = Cup.getinfo();
            
    public void DBLogger(String NDate, String NTime, String log) throws ClassNotFoundException {
        date = "" + NDate;
        time = "" + NTime;

        Class.forName("com.mysql.jdbc.Driver");

        String insertSql = "INSERT INTO Cocktail (date, time, info) VALUES(\"" + date + "\",\"" + time + "\",\"" + log + "\")";

        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBcocktailApp.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStmt = conn.prepareStatement(insertSql);
            preparedStmt.execute();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        DBcocktailApp app = new DBcocktailApp();
        String currentDate = "2024-05-21"; // Replace with actual date
        String currentTime = "12:00:00";   // Replace with actual time
        String logMessage = "Example log message"; // Replace with actual log message

        try {
            app.DBLogger(currentDate, currentTime, logMessage);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(DBcocktailApp.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
