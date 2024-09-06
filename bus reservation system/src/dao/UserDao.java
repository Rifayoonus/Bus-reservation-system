/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import model.user;
import java.sql.*;

/**
 *
 * @author rifaa
 */
public class UserDao {
    public static void save(user User){
        String query = "insert into user(name,email,password) values('"+User.getName()+"','"+User.getEmail()+"','"+User.getPassword()+"')";
        dboperations.setDataOrDelete(query, "Registered Successfully! ");
    }
    
    public static user login(String email,String password){
        user User = null;
   
        try{
            ResultSet rs = dboperations.getData("select * from user where email='"+email+"' and password='"+password+"'");
            while(rs.next()){
                User = new user();
                User.setStatus(rs.getString("status"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return User;
    }
}
