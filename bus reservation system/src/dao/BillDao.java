/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import java.sql.*;
import model.Bill;

/**
 *
 * @author rifaa
 */
public class BillDao {
    public static String getId(){
        int id=1;
        try{
            ResultSet rs = dboperations.getData("select max(id) from bill");
            if(rs.next()){
                id = rs.getInt(1);
                id = id + 1;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    public static void save(Bill bill){
        String query = "insert into bill (name,contact,Bus_No,Bus_name,Source,Destination,date,price)values('"+bill.getName()+"','"+bill.getContact()+"','"+bill.getBusno()+"','"+bill.getBusname()+"','"+bill.getSource()+"','"+bill.getDestination()+"','"+bill.getDate()+"','"+bill.getPrice()+"')";
        dboperations.setDataOrDelete(query, "Bill Details Added Successfully");
    }
    
}
