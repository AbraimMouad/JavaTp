/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncabinet;

public class Creneaux {
    public int id,ver,hdebut,mdebut,hfin,mfin,id_medecine;
    
    Creneaux(int a,int b,int c,int d,int e,int f,int g){
        id=a; ver=b; hdebut=c; mdebut=d; hfin=e; mfin=f; id_medecine=g;
    }
    
    Creneaux(Creneaux crn){
        id=crn.id; ver=crn.ver; hdebut=crn.hdebut; mdebut=crn.mdebut; hfin=crn.hfin; mfin=crn.mfin; id_medecine=crn.id_medecine;
    }
}
