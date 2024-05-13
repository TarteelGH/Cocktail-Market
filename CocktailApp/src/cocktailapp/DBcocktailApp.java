/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author tarteel
 */
public class DBcocktailApp {
    
       public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbcocktailapp", "root", ""
            );

            Statement statement = connection.createStatement();
            
            // Insert rows into the test1 table
            statement.executeUpdate("INSERT INTO cocktail (Name) VALUES ('John')");
            statement.executeUpdate("INSERT INTO cocktail (Name) VALUES ('Alice')");
            statement.executeUpdate("INSERT INTO cocktail (Name) VALUES ('Bob')");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM cocktail");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + resultSet.getString(4));
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
