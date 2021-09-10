/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson18.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author jaden
 */
public class DatingDBConnection {
    
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/DatingDB";
        String username = "postgres";
        String password = "admin";
        String query = "SELECT * FROM my_contacts";
        try (Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query)){
            while (rs.next()) {
                int contact_id = rs.getInt("contact_id");
                String first = rs.getString("first_name");
                String last = rs.getString("last_name");
                Date birthDate = rs.getDate("birthday");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String gender = rs.getString("gender");
                
                System.out.println("Contact ID:   " + contact_id + "\n"
                        + "Contact Name: " + first + " " + last + "\n"
                        + "Birth Date:    " + birthDate + "\n"
                        + "Phone:        " + phone + "\n"
                        + "Email:        " + email + "\n"
                        + "Gender:        " + gender + "\n");
            } // end of while
        } catch (SQLException ex) {
            while (ex != null) {
                System.out.println("SQLState:  " + ex.getSQLState());
                System.out.println("Error Code:" + ex.getErrorCode());
                System.out.println("Message:   " + ex.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause:" + t);
                    t = t.getCause();
                }
                ex = ex.getNextException();
            }
        }
    }
}
