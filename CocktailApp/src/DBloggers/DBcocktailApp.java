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

import java.sql.*;


/**
 *
 * @author tarteel
 */

public class DBcocktailApp implements myLog{
    String url = "jdbc:mysql://localhost:3306/cocktail";
    String username = "root";
    String password = "";
   

            
    @Override
    public void log( String log) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Exception in database logger");
        }

        String insertSql = "INSERT INTO cocktail_table (info) VALUES(\"" + log + "\")";

       try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Exception in database logger");
            }
            Connection conn = DriverManager.getConnection(url, username, password);
//            Statement statement = conn.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from history");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2));
//            }
            PreparedStatement preparedStmt = conn.prepareStatement(insertSql);
            preparedStmt.execute();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}