/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncabinet;

import java.util.Date;

public class Rv {
    public int id;
    public Date jour;
    public int id_client, id_cren;
    
    
    Rv(int a,Date b,int c,int d){
        id=a; jour=b; id_client=c; id_cren=d;
    }
    
    Rv(Rv rv){
        id=rv.id; jour=rv.jour; id_client=rv.id_client; id_cren=rv.id_cren;    
    }
}
