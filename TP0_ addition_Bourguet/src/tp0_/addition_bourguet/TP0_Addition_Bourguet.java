/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_.addition_bourguet;
import java.util.Scanner;
/**
 * 
 * @author romai
 */
public class TP0_Addition_Bourguet {

    /**
     * @param args the command line arguments
     */
    

public class Main {
    public static void main(String[] args) {
        int nb;      // nombre d'entiers à additionner
        int result;  // resultat
        int ind;     // indice

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre :");
        nb = sc.nextInt();  // saisie clavier

        result = 0;

        ind = 1;
        while (ind <= nb) {   // <= pour inclure nb dans la somme
            result = result + ind;
            ind++;
        }

        System.out.println("La somme des " + nb + " entiers est : " + result);
    }
}
    

