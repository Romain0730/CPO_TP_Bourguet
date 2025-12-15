/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author romai
 */
public class Combinaison {
     private int[] chiffres;  // tableau de 4 chiffres

    // Constructeur avec chiffres précis (pour la combinaison testée)
    public Combinaison(int c1, int c2, int c3, int c4) {
        chiffres = new int[]{c1, c2, c3, c4};
    }

    // Méthode pour comparer avec une autre combinaison
    public int[] comparer(Combinaison secret) {
        int exacts = 0;
        int tropHaute = 0;
        int tropBas = 0;

        for (int i = 0; i < 4; i++) {
            if (this.chiffres[i] == secret.chiffres[i]) {
                exacts++;
            } else if (this.chiffres[i] > secret.chiffres[i]) {
                tropHaute++;
            } else {
                tropBas++;
            }
        }

        return new int[]{exacts, tropHaute, tropBas};
    }

    public String toString() {
        return "" + chiffres[0] + chiffres[1] + chiffres[2] + chiffres[3];
    }
}
