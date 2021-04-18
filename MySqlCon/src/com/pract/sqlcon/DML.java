package com.pract.sqlcon;

import java.sql.*;

/*
DML(Data Manipulation Language): The SQL commands that deals with the manipulation of data present in the database belong to DML or Data Manipulation Language and this includes most of the SQL statements. 
Examples of DML: 

INSERT – is used to insert data into a table.
UPDATE – is used to update existing data within a table.
DELETE – is used to delete records from a database table.
different from Drop Table
https://www.javatpoint.com/Statement-interface
To get connector jar file https://dev.mysql.com/downloads/connector/j/ 
*/

class DML {
    public static void main(String[] args) {
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraing", "root", "root");
            // here javatraing is database name, ___ is username and password
            Statement stmt = con.createStatement();

            boolean isDone = stmt.execute(
                    "insert into Trainers(PersonID , LastName ,FirstName, Address,City) values(2,'kumar','akshay','a/p juhu','Mumbai')");
            if (!isDone) { // if executed it is false
                System.out.println("Success");
            } else {
                System.out.println("failure");
            }

            // Delete rows
            boolean isDone2 = stmt.execute("DELETE FROM Trainers WHERE LastName='kumar';");
            if (!isDone2) { // if executed it is false
                System.out.println("Success");
            } else {
                System.out.println("failure");
            }

            // another way
            PreparedStatement Pstmt = con.prepareStatement(
                    "insert into Trainers(PersonID , LastName ,FirstName, Address,City) values(?,?,?,?,?)");
            Pstmt.setInt(1, 78);
            Pstmt.setString(2, "deep");
            Pstmt.setString(3, "arya");
            Pstmt.setString(4, "Banglore");
            Pstmt.setString(5, "mysoru");

            int ps = Pstmt.executeUpdate(); // this acts like executor of all 6 statements above
            System.out.println(ps); // prints 1 after inserting

            // boolean isDone3 = stmt.execute( //this code is to show data of different name
            // will stay
            // "insert into Trainers(PersonID , LastName ,FirstName, Address,City)
            // values(2,'khan','akshay','a/p juhu','Mumbai')");
            // if (!isDone3) { // if executed it is false
            // System.out.println("Success");
            // } else {
            // System.out.println("failure");
            // }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
 *
 * 1) public ResultSet executeQuery(String sql): is used to execute SELECT
 * query. It returns the object of ResultSet. 2) public int executeUpdate(String
 * sql): is used to execute specified query, it may be create, drop, insert,
 * update, delete etc. 3) public boolean execute(String sql): is used to execute
 * queries that may return multiple results. 4) public int[] executeBatch(): is
 * used to execute batch of commands.
 */