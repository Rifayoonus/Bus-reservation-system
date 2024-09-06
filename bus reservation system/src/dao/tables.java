/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author rifaa
 */
public class tables {
    public static void main(String[] args){
        try{
           String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),password varchar(200),Status varchar(10) default 'false',UNIQUE (email))";
          //String adminDetails = "insert into user(name,email,password,status)values('Admin','admin@gmail.com','admin','true')";
            String bustable = "create table addbus(Bus_No varchar(10) primary key,Bus_name varchar(100),Source varchar(50),Destination varchar(50),price varchar(20),Status varchar(10) default 'false')";
            String billtable = "create table bill(id int AUTO_INCREMENT  primary key ,name varchar(20),contact varchar(10),Bus_name varchar(100),Bus_No varchar(20),Source varchar(50),Destination varchar(50),date varchar(20),price varchar(10))";
           
            dboperations.setDataOrDelete(userTable, "User Table Created Successfully");
            //dboperations.setDataOrDelete(adminDetails, "Admin details added Successfully");
           dboperations.setDataOrDelete(bustable, "Bus Table Created Successfully");
         dboperations.setDataOrDelete(billtable, "Bill Table Created Successfully");
         
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
