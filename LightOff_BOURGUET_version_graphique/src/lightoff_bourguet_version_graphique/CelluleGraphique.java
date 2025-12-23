
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author romai
 */


package lightoff_bourguet_version_graphique;



import javax.swing.JButton;
import java.awt.Graphics;
import lightoff_bourguet_version_console.CelluleLumineuse;

/**
 * Représentation graphique d'une cellule lumineuse
 */
public class CelluleGraphique extends JButton {

    // Dimensions en pixels
    private int largeur;
    private int hauteur;

    // Cellule du modèle associée
    private CelluleLumineuse celluleLumineuseAssociee;

    /**
     * Constructeur
     * @param celluleLumineuseAssociee cellule logique associée
     * @param l largeur en pixels
     * @param h hauteur en pixels
     */
    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int l, int h) {
        this.largeur = l;
        this.hauteur = h;
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;

        this.setPreferredSize(new java.awt.Dimension(l, h));
        this.setFocusPainted(false);
    }

    /**
     * Dessin du composant graphique
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Affiche l'état de la cellule (ex: X ou O)
        this.setText(celluleLumineuseAssociee.toString());
    }
}
