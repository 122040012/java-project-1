package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author filberthamijoyo
 */
public class DatabaseConnection {
  
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/cuk?allowPublicKeyRetrieval=true&useSSL=false&characterEncoding=utf-8";
    static final String USER = "root";
    static final String PASS = "Filbert02";
     
        
    
    public static Connection cuk(){
         Connection conn;
         try{
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                return conn;
        }catch(Exception ex){
            System.out.println("There is an error connecting to Database.");
            ex.printStackTrace();
            return null;
        }
        
    }

 
  
}
