/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helthhistorymgmtsystem.controller;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginController {

    private Connection connection;

    private void createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/helthhistorymgmtdb", "root", "");
    }

    public ResultSet login(String username) throws SQLException, ClassNotFoundException  {
        createConnection();
        String sql = "select password from login where username ='"+username+"'";
        Statement stmt = connection.createStatement();
        
        ResultSet resultSet = stmt.executeQuery(sql);
        return resultSet;
    }
}
