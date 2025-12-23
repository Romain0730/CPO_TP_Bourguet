/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bourguet_version_console;


/**
 *
 * @author romai
 */
public class CelluleLumineuse {
    private boolean etat;

    public CelluleLumineuse() {
        this.etat = false;
    }
    public void activerCellule() {
        etat = !etat;
    }
    public void eteindreCellule() {
        etat = false;
    }
    public boolean estEteint() {
        return etat == false;
    }
    public boolean getEtat() {
        return etat;
    }
    @Override
    public String toString() {
        if (etat) {
            return "X"; 
        } else {
            return "O"; 
        }
    }
}
