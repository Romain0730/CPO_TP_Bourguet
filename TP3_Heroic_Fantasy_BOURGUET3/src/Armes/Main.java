/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author romai
 */
package tp3_heroic_fantasy_bourguet3;  // ← Mets EXACTEMENT le vrai nom ici

import Armes.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Création des 2 épées
        Epee e1 = new Epee("Excalibur", 7, 5);
        Epee e2 = new Epee("Durandal", 4, 7);

        // Création des 2 bâtons
        Baton b1 = new Baton("Chêne", 4, 5);
        Baton b2 = new Baton("Charme", 5, 6);

        // Liste d'armes
        ArrayList<Arme> listeArmes = new ArrayList<>();
        listeArmes.add(e1);
        listeArmes.add(e2);
        listeArmes.add(b1);
        listeArmes.add(b2);

        // Affichage
        for (Arme a : listeArmes) {
            System.out.println(a);
        }
    }
