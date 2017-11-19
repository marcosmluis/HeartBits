package com.example.jose.heartbits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

/**
 * Created by jose on 19-11-2017.
 */

public class DatabaseDAO {
    String url = "jdbc:mysql://192.168.137.1:3306/heartbits";
    String username = "user";
    String password = "pass";

    public void connect() {
        try {
            System.out.println("Database connected!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Connection connection = DriverManager.getConnection(url, "root", "");
            System.out.println("Database connected!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM cama");
            int i=0;

            while(rs.next()) {
                while(rs.isLast()) {
                    System.out.println("" + rs.getString(i) + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11");
                    i++;
                }
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }


    }

}
