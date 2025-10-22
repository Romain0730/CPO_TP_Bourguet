/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_helloworld;

//20/10/

import java.io.PrintStream;
import java.util.Scanner;

//utiliser 
/**
 *
 * @author romai
 */
public class TP0_helloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour");
        PrintStream out = System.out;
        int i = 20;

        // Déclaration du scanner et du prénom
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est votre prénom ?");
        String prenom = sc.nextLine();

        // Messages personnalisés
        System.out.println("Bonjour " + prenom + " !");
        System.out.println("Au revoir " + prenom + " !");
    }
}
