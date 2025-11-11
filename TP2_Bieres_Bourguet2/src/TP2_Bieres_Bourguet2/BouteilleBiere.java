/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_Bieres_Bourguet2;

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
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres)\nBrasserie : " + brasserie);
    }
    BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
    nom = unNom; 
    degreAlcool = unDegre; 
    brasserie = uneBrasserie; 
    ouverte = false; } 
} 

