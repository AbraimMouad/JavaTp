/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacePackage;

import gestioncabinet.Creneaux;
import java.util.List;

public interface Creneau {
    public List<Creneaux> gatAllCreneau();
    public Creneaux getCreneau(int id);
    public void AjouterCreneau(Creneaux crn);
    public void SupprimerCreneau(Creneaux crn);
    public void ModifierCreneau(Creneaux crn);
}
