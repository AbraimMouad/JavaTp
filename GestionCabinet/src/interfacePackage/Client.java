/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacePackage;

import gestioncabinet.Clients;
import java.util.List;

public interface Client {
    public List<Clients> gatAllClient();
    public Clients getClient(int id);
    public void AjouterClient(Clients cln);
    public void SupprimerClient(Clients cln);
    public void ModifierClient(Clients cln);
}
