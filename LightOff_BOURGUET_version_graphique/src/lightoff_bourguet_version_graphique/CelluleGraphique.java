
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author romai
 */


package lightoff_bourguet_version_graphique;


import java.awt.Color;
import javax.swing.JButton;
import java.awt.Graphics;
import lightoff_bourguet_version_console.CelluleLumineuse;

/**
 * Représentation graphique d'une cellule lumineuse
 */
public class CelluleGraphique extends JButton {

    // Dimensions en pixels
    public int largeur;
    public int hauteur;

    // Cellule du modèle associée
    public CelluleLumineuse celluleLumineuseAssociee;

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
    int w = this.getWidth();
    int h = this.getHeight();
    if (celluleLumineuseAssociee.estEteint() == true) {
        g.setColor(Color.green);
    } else { 
        g.setColor(Color.red); 
    } 
    g.fillOval(2, 2, w - 4, h - 4);
    }
}
