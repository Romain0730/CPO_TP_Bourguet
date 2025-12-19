/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bourguet_version_console;
import java.util.Scanner;
/**
 *
 * @author romai
 */
public class Partie {
    private GrilleDeJeu grille;
    private int nbCoups;

    public Partie() {
        this.grille = new GrilleDeJeu();
        this.nbCoups = 0;
    }

    public void initialiserPartie() {
        grille.melangerGrille();
        nbCoups = 0;
    }

    public void lancerPartie() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Début de la partie LightOff ===");
        grille.afficherGrille();

        while (!grille.cellulesToutesEteintes()) {

            System.out.print("Entrez le numéro de ligne : ");
            int ligne = sc.nextInt();

            System.out.print("Entrez le numéro de colonne : ");
            int colonne = sc.nextInt();

            grille.activerCellule(ligne, colonne);
            nbCoups++;

            grille.afficherGrille();
            System.out.println("Nombre de coups joués : " + nbCoups);
        }

        System.out.println("🎉 Bravo ! Toutes les cellules sont éteintes !");
        System.out.println("Partie gagnée en " + nbCoups + " coups.");
    }
}
