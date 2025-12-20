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

    //Constructeur de la classe Partie.
     //Initialise une nouvelle grille 5x5 et met le nombre de coups à zéro
    public Partie() {
        grille = new GrilleDeJeu(5,5);
        nbCoups = 0;
    }

    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10);
        nbCoups = 0;
    }

     //Lance la partie et gère la boucle de jeu.
     // Tant que toutes les cellules ne sont pas éteintes, le joueur peut
     //effectuer des actions sur la grille.
    public void lancerPartie() {
        Scanner sc = new Scanner(System.in);

        initialiserPartie();
        System.out.println("=== Début de la partie LightOff ===");
        System.out.println(grille);

        // Boucle principale du jeu
        while (!grille.cellulesToutesEteintes()) {

            System.out.println("Choisissez une action :");
            System.out.println("0 : activer une ligne");
            System.out.println("1 : activer une colonne");
            System.out.println("2 : diagonale descendante");
            System.out.println("3 : diagonale montante");

            int choix = sc.nextInt();

            // Traitement du choix du joueur
            switch (choix) {
                case 0 -> {
                    System.out.print("Numéro de ligne : ");
                    int l = sc.nextInt();
                    grille.activerLigneDeCellules(l);
                }
                case 1 -> {
                    System.out.print("Numéro de colonne : ");
                    int c = sc.nextInt();
                    grille.activerColonneDeCellules(c);
                }
                case 2 -> grille.activerDiagonaleDescendante();
                case 3 -> grille.activerDiagonaleMontante();
                default -> System.out.println("Choix invalide");
            }

            nbCoups++;
            System.out.println(grille);
            System.out.println("Nombre de coups : " + nbCoups);
        }

        System.out.println("🎉 Bravo ! Partie gagnée en " + nbCoups + " coups !");
    }
}