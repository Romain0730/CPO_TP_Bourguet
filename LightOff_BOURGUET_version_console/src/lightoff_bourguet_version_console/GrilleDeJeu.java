/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bourguet_version_console;
import java.util.Random;
/**
 *
 * @author romai
 */
public class GrilleDeJeu {
    //Matrice contenant les cellules lumineuses
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

   //Constructeur de la grille de jeu.
     // Initialise la matrice et crée toutes les cellules lumineuses.
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }
    public void activerLigneDeCellules(int idLigne){
     for (int col = 0; col < nbColonnes; col++) {
        matriceCellules[idLigne][col].activerCellule();
      }
    }
    public void activerColonneDeCellules(int idColonne){
        for (int lig = 0; lig < nbLignes; lig++) {
        matriceCellules[lig][idColonne].activerCellule();
    }
    }
    public void activerDiagonaleDescendante() {
         for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
        matriceCellules[i][i].activerCellule();
      }
    }
    public void activerDiagonaleMontante(){
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
        matriceCellules[i][nbColonnes - 1 - i].activerCellule();
      }
    }
    public void eteindreToutesLesCellules() {
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[i][j].eteindreCellule();
        }
    }
}
    //Vérifie si toutes les cellules de la grille sont éteintes.
    public boolean cellulesToutesEteintes() {
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            if (!matriceCellules[i][j].estEteint()) {
                return false;
            }
        }
    }
    return true;
}
//Active aléatoirement une ligne, une colonne ou une diagonale.
    public void activerLigneColonneOuDiagonaleAleatoire(){
        Random rand = new Random();
    int choix = rand.nextInt(4);

    switch (choix) {
        case 0 -> activerLigneDeCellules(rand.nextInt(nbLignes));
        case 1 -> activerColonneDeCellules(rand.nextInt(nbColonnes));
        case 2 -> activerDiagonaleDescendante();
        case 3 -> activerDiagonaleMontante();
    }
      }
    public void melangerMatriceAleatoirement(int nbTours){
        eteindreToutesLesCellules();
    for (int i = 0; i < nbTours; i++) {
        activerLigneColonneOuDiagonaleAleatoire();
      }
    }
    //Retourne une représentation textuelle de la grille.
    @Override
    public String toString(){
        String resultat ="";
        for (int i = 0 ; i <nbLignes; i++){
            for(int j = 0 ; j< nbColonnes; j++){
            resultat += matriceCellules[i][j];
        }
        resultat += "\n";
    }
    return resultat;
   }
}
    