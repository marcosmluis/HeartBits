package com.example.jose.heartbits;

import android.os.AsyncTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Created by jose on 19-11-2017.
 */

public class DatabaseDAO extends AsyncTask<String,Void,String> {
    String url = "jdbc:mysql://192.168.137.1:3306/heartbits";
    String username = "root";
    String password = "";

    public void connect() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection =DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Database connected!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM heartbits.cama");
            int i=0;
            ResultSetMetaData metadata = rs.getMetaData();
            int columnCount = rs.getMetaData().getColumnCount();
            for (i = 1; i <= columnCount; i++) {
                System.out.print(metadata.getColumnName(i) + ", ");
            }
            System.out.println();
            while (rs.next()) {
                String row = "";
                for (i = 1; i <= columnCount; i++) {
                    row += rs.getString(i) + ", ";
                }
                System.out.println(row);

            }

        } catch (SQLException e1) {
            e1.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected String doInBackground(String... strings) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection =DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Database connected!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM heartbits.cama");
            int i=0;
            ResultSetMetaData metadata = rs.getMetaData();
            int columnCount = rs.getMetaData().getColumnCount();
            for (i = 1; i <= columnCount; i++) {
                System.out.print(metadata.getColumnName(i) + ", ");
            }
            System.out.println();
            while (rs.next()) {
                String row = "";
                for (i = 1; i <= columnCount; i++) {
                    row += rs.getString(i) + ", ";
                }
                System.out.println(row);

            }

        } catch (SQLException e1) {
            e1.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}