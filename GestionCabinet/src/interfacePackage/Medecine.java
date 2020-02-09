/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacePackage;

import gestioncabinet.Medecines;
import java.util.List;

public interface Medecine {
    public List<Medecines> gatAllMedecine();
    public Medecines getMedecine(int id);
    public void AjouterMedecine(Medecines rv);
    public void SupprimerMedecine(Medecines rv);
    public void ModifierMedecine(Medecines rv);
}
