/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_bourguet_version_console;

/**
 *
 * @author romai
 */
public class LightOff_BOURGUET_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       GrilleDeJeu grille = new GrilleDeJeu(5, 5);
        System.out.println("Grille initiale :");
        System.out.println(grille);

        grille.activerLigneDeCellules(2);
        System.out.println("Après activation de la ligne 2 :");
        System.out.println(grille);

        grille.activerColonneDeCellules(1);
        System.out.println("Après activation de la colonne 1 :");
        System.out.println(grille);

        grille.activerDiagonaleDescendante();
        System.out.println("Après activation de la diagonale descendante :");
        System.out.println(grille);

        grille.activerDiagonaleMontante();
        System.out.println("Après activation de la diagonale montante :");
        System.out.println(grille);

        grille.melangerMatriceAleatoirement(10);
        System.out.println("Après mélange aléatoire :");
        System.out.println(grille);
    }
}
