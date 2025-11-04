/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP2_Bieres_Bourguet2;

/**
 *
 * @author romai
 */
public class TP2_Bieres_BourguetN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herepublic static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere();
        uneBiere.nom = "Cuvée des Trolls";
        uneBiere.degreAlcool = 7.0;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;

        uneBiere.lireEtiquette();
    }

    }
    
}
