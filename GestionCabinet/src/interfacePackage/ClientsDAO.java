
package interfacePackage;

import Connection.Connecter;
import gestioncabinet.Clients;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mouad
 */
public class ClientsDAO implements Client{
    
    Connection con;
    
    @Override
    public List<Clients> gatAllClient() {
        Clients client=null;
		List<Clients> lc=new ArrayList<>();
		con=Connecter.getConnect();
        String req="Select * From Clients";
        try {
            PreparedStatement ps= con.prepareStatement(req);
            ResultSet res=ps.executeQuery();
            while(res.next()) {
            	Clients c =new Clients(res.getInt("id"),res.getInt("version"),res.getString("titre"),res.getString("nom"),res.getString("prenom"));
            	lc.add(c);
            }
        } catch (SQLException e) {
        	e.printStackTrace();
        }
		return lc;
    }

    @Override
    public Clients getClient(int id) {
Clients client=null;
		con=Connecter.getConnect();
        String req="Select Version, Titre, Nom,Prenom From Clients WHERE Id=?";
        try {
           PreparedStatement ps= con.prepareStatement(req);
            ps.setInt(1,id);
            ResultSet res=ps.executeQuery();
            if(res.next()) {
            	client=new Clients(id,res.getInt("version"),res.getString("titre"),res.getString("nom"),res.getString("prenom"));
            }
        } catch (SQLException e) {
        	e.printStackTrace();
        }
		return client;    }

    @Override
    public void AjouterClient(Clients cln) {
        con=Connecter.getConnect();
	        String req="INSERT into Clients(Version,Titre,Nom,Prenom) VALUES(?,?,?,?)";
	        try {
	            PreparedStatement ps= con.prepareStatement(req);
	            ps.setInt(1, cln.ver);
	            ps.setString(2, cln.titre);
	            ps.setString(3, cln.nom);
	            ps.setString(4, cln.prenom);
	            int i=ps.executeUpdate();  
	            System.out.println(i+" records inserted");  
	
	        } catch (SQLException e) {
	        	e.printStackTrace();
	        }
    }

    @Override
    public void ModifierClient(Clients cln) {
        con=Connecter.getConnect();
        String req="UPDATE Clients SET Version=?, Titre=? , Nom=?, Prenom=? where Id=?";
        try {
            PreparedStatement ps= con.prepareStatement(req);
            ps.setInt(1, cln.ver);
            ps.setString(2, cln.titre);
            ps.setString(3, cln.nom);
            ps.setString(4, cln.prenom);
            ps.setInt(5, cln.id);
            int i=ps.executeUpdate();  
            System.out.println(i+" records updated");  

        } catch (SQLException e) {
        	e.printStackTrace();
        }
    }

    @Override
    public void SupprimerClient(Clients cln) {
        con=Connecter.getConnect();
		String req = "DELETE FROM Clients where Id = ?";
		try {
		    PreparedStatement ps= con.prepareStatement(req);
	        ps.setInt(1, cln.id);
	        int i=ps.executeUpdate();  
            System.out.println(i+" records deleted");  
	    } catch (SQLException e) {
	    	e.printStackTrace();
	}
    }  
}