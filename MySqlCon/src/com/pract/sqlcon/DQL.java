package com.pract.sqlcon;

import java.sql.*;

/*
DQL (Data Query Language) :

DQL statements are used for performing queries on the data within schema objects. The purpose of the DQL Command is to get some schema relation based on the query passed to it. 
Example of DQL: 

SELECT – is used to retrieve data from the database.
https://www.javatpoint.com/Statement-interface
To get connector jar file https://dev.mysql.com/downloads/connector/j/ 
*/

public class DQL {
    public static void main(String[] args) {
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraing", "root", "root");
            // here javatraing is database name, ___ is username and password
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Trainers");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
                        + " " + rs.getString(5));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}