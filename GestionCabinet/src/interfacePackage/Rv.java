/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacePackage;

import gestioncabinet.*;
import java.util.List;

public interface Rv {
    public List<Rv> gatAllClient();
    public Rv getRv(int id);
    public void AjouterRv(Rv rv);
    public void SupprimerRv(Rv rv);
    public void ModifierRv(Rv rv);
}
