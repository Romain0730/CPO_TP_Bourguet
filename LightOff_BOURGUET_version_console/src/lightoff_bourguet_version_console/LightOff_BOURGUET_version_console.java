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
       CelluleLumineuse Cellule1 = new CelluleLumineuse();
       CelluleLumineuse Cellule2 = new CelluleLumineuse();
       
       System.out.println("etat initial des cellules :");
       System.out.println("Cellule 1 : " + Cellule1);
       System.out.println("Cellule 2 : " + Cellule2);
       Cellule1.activerCellule();
       Cellule1.eteindreCellule();
       
       System.out.println("\netat après modification :");
       System.out.println("Cellule 1 : " + Cellule1);
       System.out.println("Cellule 2 : " + Cellule2);
       
       System.out.println("\nTests des méthodes :");
       System.out.println("Cellule 1 est eteinte ? " + Cellule1.estEteint());
       System.out.println("Cellule 2 est eteinte ? " + Cellule2.estEteint());
       
       System.out.println("etat brut cellule 1 (getEtat) : " + Cellule1.getEtat());
       System.out.println("etat brut cellule 2 (getEtat) : " + Cellule2.getEtat());
       
       GrilleDeJeux grille = new GrilleDeJeux(3);

    System.out.println("Affichage de la grille :");
    System.out.println(grille);
    }
    
}
