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
    
        int m = generateurAleat.nextInt(101);
    System.out.println("Saisissez un nombre entre 0 et 100");
    int essais = 1;
    
    int nombre = scanner.nextInt();
    
    while( m!=nombre) {
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
    System.out.println("Bravo vous avez gagne");
    System.out.println("vous avez fait" +essais + "tentatives");
    scanner.close();
    }
    }
    

