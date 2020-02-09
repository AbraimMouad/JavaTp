/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecter {
   private static Connection conn; 
   
   private Connecter(){
       try {
			Class.forName("com.mysql.jdbc.Driver");  
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestioncabinet","root","");   
                        
		}
		catch(ClassNotFoundException e){ 
			//System.out.println("Problème au niveau du pilote");
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println("Problème au niveau de base ou accès au données ");
		}
	}
   
   public static Connection getConnect(){
       if(conn==null){
           new Connecter();
       }
       return conn;
   }
   }
