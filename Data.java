/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdl;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author A102PC24
 */
public class Data {
    public static Connection getConnection(String strSever, String strDatabase,String strUser,String strPassword){
        Connection conn = null;
        try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String connectionURL ="jdbc:sqlserver://"+ strSever +":1433;databasename =" + strDatabase + ";user=" + strUser +  ";password=" + strPassword;
           conn = DriverManager.getConnection(connectionURL);
            
            
        }
               
        catch(SQLException ex1){
            System.out.println("sql exception" + ex1.toString());
        }
        
        catch(ClassNotFoundException ex2){
            System.out.println("sql ket noi csdl loi" + ex2.toString());
        }
        
        
        return conn;
        
        
    }
    public static void main(String[] args) {
        String strSever = "MMTNGUYENQUANGM\\SQLEXPRESS";
        String strDatabase ="DBVANPHONGPHAM";
        String strUser ="sa";
        String strPassword ="123";
        Connection conn =getConnection(strSever, strDatabase, strUser, strPassword);
        if (conn != null) {
            System.out.println("ket noi thanh cong");
            
        }
        else{
            System.out.println("ket noi that bai");
        }
       
    }        
                
   }
        

