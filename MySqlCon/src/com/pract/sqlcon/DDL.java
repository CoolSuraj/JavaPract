package com.pract.sqlcon;

// import java.util.*;
//can be written in seaprate functions but I took main to try out faster
import java.sql.*;

class DDL {
    /**
     * This class and methods are dedicated to show DDL commands and how that are
     * executed; CREATE – is used to create the database or its objects (like table,
     * index, function, views, store procedure and triggers). DROP – is used to
     * delete objects from the database. ALTER-is used to alter the structure of the
     * database. TRUNCATE–is used to remove all records from a table, including all
     * spaces allocated for the records are removed. COMMENT –is used to add
     * comments to the data dictionary. RENAME –is used to rename an object existing
     * in the database. https://www.javatpoint.com/Statement-interface To get
     * connector jar file https://dev.mysql.com/downloads/connector/j/
     */

    public static void main(String[] args) {
        try {
            /**
             * // Class.forName("com.mysql.cj.jdbc.Driver"); // now new class
             * https://www.javatpoint.com/Statement-interface //link
             * com.mysql.cj.jdbc.Driver is to be load here but // now if we have loaded jar
             * file then we do not need to // load this class also (read below notice)
             * 
             * Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver
             * class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered
             * via the SPI and manual loading of the driver class is generally unnecessary.
             */
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraing", "root", "root");
            // here javatraing is database name, ___ is username and password
            Statement stmt = con.createStatement();

            // create Table
            int result = stmt.executeUpdate(
                    "CREATE TABLE Trainers(PersonID int, LastName varchar(255),FirstName varchar(255), Address varchar(255),City varchar(255));");
            System.out.println(result);
            if (result == 0) {
                System.out.println("table  Trainers  created");
            }

            // drop table
            result = stmt.executeUpdate("DROP TABLE Trainers");
            System.out.println(result);
            if (result == 0) {
                System.out.println("table  Trainers  dropped");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
