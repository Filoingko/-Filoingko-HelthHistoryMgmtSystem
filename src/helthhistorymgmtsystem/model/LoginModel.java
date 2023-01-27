/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helthhistorymgmtsystem.model;

import com.mysql.jdbc.ResultSet;
import helthhistorymgmtsystem.controller.LoginController;
import java.sql.SQLException;


public class LoginModel {
    
    public boolean login(String username, String pwd) throws SQLException, ClassNotFoundException{
        LoginController loginController = new LoginController();
        ResultSet resultSet = (ResultSet) loginController.login(username);
        
        if(resultSet.next()){
            if (resultSet.getString("password").equals(pwd)) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
