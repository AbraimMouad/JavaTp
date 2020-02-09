 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncabinet;

import interfacePackage.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mouad
 */
public class GestionCabinet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //  try{  
//			Class.forName("com.mysql.jdbc.Driver");  
//			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/gestioncabinet","root","");   
//			Statement statement=connection.createStatement();  
//			ResultSet rs=statement.executeQuery("select * from clients");  
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)); 
//			}
//			 
//			connection.close();  
//			}catch(Exception e){ System.out.println(e);} 
//    }

       ClientsDAO clnd=new ClientsDAO();
//       Clients cln=new Clients();
       List<Clients> lst=new ArrayList<Clients>();
       lst=clnd.gatAllClient();
       for(Clients cln: lst)
       {
       	 System.out.println(cln.id+","+cln.ver+","+cln.titre+","+cln.nom+","+cln.prenom);
       }
        
    }
}
