/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncabinet;

public class Clients {
    public int id, ver;
    public String titre, nom, prenom;
    
    public Clients(int a,int b,String c,String d,String e){
        id=a; ver=b; titre=c; nom=d; prenom=e;
    }
    
    Clients(Clients cln){
        id=cln.id; ver=cln.ver; titre=cln.titre; nom=cln.nom; prenom=cln.prenom;
    }

    Clients() {
        id=0; ver=0; titre=""; nom=""; prenom="";
    }

    
}
