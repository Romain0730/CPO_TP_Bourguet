/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bieres_darties;

/**
 *
 * @author romai
 */
public class BouteilleBiere {

    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie );
BouteilleBiere uneBiere = new BouteilleBiere() ; 
uneBiere.nom = "Cuvée des trolls"; 
uneBiere.degreAlcool = 7.0 ; 
uneBiere.brasserie = "Dubuisson";
uneBiere.ouverte = false;

}
}