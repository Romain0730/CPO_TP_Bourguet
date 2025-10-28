/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_bourguet;

/**
 *
 * @author romai
 */
import java.util.Random;
import java.util.Scanner;
public class TP1_stats_Bourguet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
    int[] tab = new int[6];
    Scanner scanner = new Scanner(System.in);
       System.out.println("Saisissez un entier ");     
       int m = scanner.nextInt();
       System.out.println("Vous avez saisi : " +m); 
    
    for (int i = 0; i < m; i++) {
    int face = generateurAleat.nextInt(6);
    tab[face]++;
    }
    System.out.println("resultat des lancers");
    for (int i =0; i < 6; i++){
    System.out.println("Face" + (i+1)+ " : " + tab[i]+" fois");
}
   scanner.close(); 
}
    }

