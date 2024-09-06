/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.Addbus;
        import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
import bus.reservation.system.Home.*;
/**
 *
 * @author rifaa
 */
public class addbusDao {
    public static void save(Addbus addbus){
    String query = "insert into addbus(Bus_No,Bus_name,Source,Destination,Price) values ('"+addbus.getBus_No()+"','"+addbus.getBus_name()+"','"+addbus.getSource()+"','"+addbus.getDestination()+"','"+addbus.getPrice()+"')";
    dboperations.setDataOrDelete(query, "Bus added successfully");
    
           
    }
     
    public static ArrayList<Addbus> getAllRecords(){
        ArrayList<Addbus> arrayList = new ArrayList<>();
        try{
        ResultSet rs = dboperations.getData("select * from addbus");
        while(rs.next()){
            Addbus addbus = new Addbus();
            addbus.setBus_No(rs.getString("Bus_No"));
            addbus.setBus_name(rs.getString("Bus_name"));
            addbus.setSource(rs.getString("Source"));
            addbus.setDestination(rs.getString("Destination"));
            addbus.setPrice(rs.getString("Price"));
            arrayList.add(addbus);
            
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
            
            
        }
        return arrayList;
    }
    
     public static ArrayList<Addbus> getBus(String Source,String Destination){
        ArrayList<Addbus> arrayList = new ArrayList<>();
        try{
        ResultSet rs = dboperations.getData("select * from addbus where Source='"+Source+"' and Destination='"+Destination+"' ");
        while(rs.next()){
            Addbus addbus = new Addbus();
            addbus.setBus_No(rs.getString("Bus_No"));
            addbus.setBus_name(rs.getString("Bus_name"));
            addbus.setSource(rs.getString("Source"));
            addbus.setDestination(rs.getString("Destination"));
            addbus.setPrice(rs.getString("Price"));
            arrayList.add(addbus);
            
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
            
            
        }
        return arrayList;
    }
    
    
    
    public static void update(Addbus addbus)
    {
        String query = "update addbus set Bus_name='"+addbus.getBus_name()+"',Source='"+addbus.getSource()+"',Destination='"+addbus.getDestination()+"',Price='"+addbus.getPrice()+"'  where Bus_No = '"+addbus.getBus_No()+"'";
        dboperations.setDataOrDelete(query, "Bus Details Updated Succesfully");
    }
    public static void delete(String Bus_No){
        String query = "delete from addbus where Bus_No='"+Bus_No+"'";
        dboperations.setDataOrDelete(query, "Bus removed Succesfully");
    }
    
    public static Addbus search(String Source,String Destination){
       
        Addbus addbus = null;
        try{
            ResultSet rs = dboperations.getData("select * from addbus where Source='"+Source+"' and Destination='"+Destination+"'");
            while(rs.next()){
                addbus = new Addbus();
                addbus.setStatus(rs.getString("Status"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return addbus;
       
    }
    
}
