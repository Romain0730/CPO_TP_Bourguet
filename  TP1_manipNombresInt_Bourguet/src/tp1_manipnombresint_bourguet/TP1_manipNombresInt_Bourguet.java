/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_bourguet;

import java.util.Scanner;

/**
 *
 * @author romai
 */
public class TP1_manipNombresInt_Bourguet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier entier : ");
        int nombre1 = scanner.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int nombre2 = scanner.nextInt();

        System.out.println("Vous avez saisi : " + nombre1 + " et " + nombre2);
        System.out.println("Le produits des 2 nombres est :" + (nombre1*nombre2)+ "");
        System.out.println("La différence des 2 nombres est :" + (nombre1-nombre2)+ "");
        System.out.println("La somme des 2 nombres est :" + (nombre1+nombre2)+ "");
        System.out.println("La quotient des 2 nombres est :" + (nombre1/nombre2)+ "Le reste de cette opération est:"+ nombre1%nombre2 +"");
        scanner.close();
    }
}
        
        // TODO code application logic here
    }
    
}
