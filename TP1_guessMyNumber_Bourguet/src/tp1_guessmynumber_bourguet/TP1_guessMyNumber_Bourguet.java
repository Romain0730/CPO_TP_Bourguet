/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_bourguet;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author romai
 */
public class TP1_guessMyNumber_Bourguet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Random generateurAleat = new Random();
    Scanner scanner = new Scanner(System.in);
    
    int max=100;
    int coupsMax = Integer.MAX_VALUE;
    System.out.println("choisissez le niveau de difficulté : facile, normal, difficile");
    String difficulte = scanner.nextLine().toLowerCase();
    
    switch (difficulte) {
        case "facile":
            coupsMax = 20;
            break;
        case "normal":
            coupsMax = 15;
            break;
        case "difficile":
            coupsMax = 10;
            break;
    }
        int m = generateurAleat.nextInt(101);
    System.out.println("Saisissez un nombre entre 0 et 100");
    int essais = 0;
    
    int nombre = scanner.nextInt();
    
    while( m!=nombre && essais < coupsMax) {
    if (m < nombre) {
            System.out.println("valeur saisi trop grande");
    }
    else {
       System.out.println("valeur saisie trop petite");
    }
    
    System.out.print("essayez encore: ");
    nombre = scanner.nextInt();
    essais++;
    }
    if (essais == coupsMax){
        System.out.println("Nombre de max atteint. Perdu");
    }
    if (essais != coupsMax){
        System.out.println("Bravo vous avez gagne");
   
    System.out.println("vous avez fait" +essais + "tentatives");
    scanner.close();
    }
    }
}
    

