/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncabinet;

public class Medecines {
    public int id,ver;
    public String titre,nom,prenom;
    
    Medecines(int a,int b,String c,String d, String e){
        id=a; ver=b; titre=c; nom=d; prenom=e;
    }
    
    Medecines(Medecines mdn){
        id=mdn.id; ver=mdn.ver; titre=mdn.titre; nom=mdn.nom; prenom=mdn.prenom;
    }
}
