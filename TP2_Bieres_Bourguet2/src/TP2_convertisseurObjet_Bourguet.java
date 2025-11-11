/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author romai
 */
import java.util.Scanner;

public class TP2_convertisseurObjet_Bourguet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convertisseur conv = new Convertisseur();

        int choix;
        double temp;
        double resultat;

        System.out.println("=== Convertisseur de Températures ===");

        do {
            System.out.println("\nChoisissez une conversion :");
            System.out.println("1 - Celsius vers Kelvin");
            System.out.println("2 - Kelvin vers Celsius");
            System.out.println("3 - Fahrenheit vers Celsius");
            System.out.println("4 - Celsius vers Fahrenheit");
            System.out.println("5 - Kelvin vers Fahrenheit");
            System.out.println("6 - Fahrenheit vers Kelvin");
            System.out.println("0 - Quitter");

            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            if (choix == 0) break;

            System.out.print("Entrez la température à convertir : ");
            temp = sc.nextDouble();

            switch (choix) {
                case 1 -> resultat = conv.CelciusVersKelvin(temp);
                case 2 -> resultat = conv.KelvinVersCelcius(temp);
                case 3 -> resultat = conv.FarenheitVersCelcius(temp);
                case 4 -> resultat = conv.CelciusVersFarenheit(temp);
                case 5 -> resultat = conv.KelvinVersFarenheit(temp);
                case 6 -> resultat = conv.FarenheitVersKelvin(temp);
                default -> {
                    System.out.println("Choix invalide !");
                    continue;
                }
            }

            System.out.println("Résultat = " + resultat);
            System.out.println(conv);

        } while (choix != 0);

        System.out.println("=== Fin du programme ===");
    }
}