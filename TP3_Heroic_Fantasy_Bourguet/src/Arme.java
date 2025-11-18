/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author romai
 */
public abstract class Arme {
    // 1. Toute arme possède un nom et un niveau d’attaque
    private String nom;
    private int niveauAttaque;
    // 2. Initialisation des 2 paramètres à la création
    public Arme(String nom, int niveauAttaque) {
        // Optionnel : s'assurer que niveauAttaque <= 100
        if (niveauAttaque > 100) {
            this.niveauAttaque = 100;
        } else {
            this.niveauAttaque = niveauAttaque;
        }
        this.nom = nom;
    }
    // 3. et 5. On doit pouvoir connaître le niveau d’attaque et le nom
    public int getNiveauAttaque() {
        return niveauAttaque;
    }
    public String getNom() {
        return nom;
    }
    // 4. On doit pouvoir visualiser le nom et le niveau (redéfinir toString)
    @Override
    public String toString() {
        return "Arme [nom=" + nom + ", niveauAttaque=" + niveauAttaque + "]";
    }
   
}
    
    

