/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_bourguet;

import java.util.Scanner;

/**
 *
 * @author romai
 */
public class TP1_convertisseur_Bourguet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bonjour! Saisissez une valeur de température");
        double valeur = scanner.nextDouble();
        
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Celsius vers Fahrenheit");
        System.out.println("4) De Fahrenheit vers Celsius");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

        System.out.print("Votre choix : ");
        int choix = scanner.nextInt();

        double resultat = 0;        // Pour stocker le résultat
        String uniteDepart = "";    // Unité d’origine
        String uniteArrivee = "";   // Unité de destination

        // Sélection du bon calcul selon le choix
        switch (choix) {
            case 1:
                resultat = CelciusVersKelvin(valeur);
                uniteDepart = "Celsius";
                uniteArrivee = "Kelvin";
                break;
            case 2:
                resultat = KelvinVersCelcius(valeur);
                uniteDepart = "Kelvin";
                uniteArrivee = "Celsius";
                break;
            case 3:
                resultat = CelciusVersFarenheit(valeur);
                uniteDepart = "Celsius";
                uniteArrivee = "Fahrenheit";
                break;
            case 4:
                resultat = FarenheitVersCelcius(valeur);
                uniteDepart = "Fahrenheit";
                uniteArrivee = "Celsius";
                break;
            case 5:
                resultat = KelvinVersFarenheit(valeur);
                uniteDepart = "Kelvin";
                uniteArrivee = "Fahrenheit";
                break;
            case 6:
                resultat = FarenheitVersKelvin(valeur);
                uniteDepart = "Fahrenheit";
                uniteArrivee = "Kelvin";
                break;
            default:
                System.out.println("Choix invalide !");
                scanner.close();
                return;
        }

        // Affichage du résultat formaté
        System.out.println(valeur + " degrés " + uniteDepart + " est égal à " + resultat + " degrés " + uniteArrivee + ".");
        scanner.close();
    }
public static double CelciusVersKelvin (double tCelcius) { 
    return tCelcius + 273.15;
    
}
public static double KelvinVersCelcius(double tKelvin) {
    return tKelvin -273.15;
}
public static double FarenheitVersCelcius( double tFCelcius){
    return ((tFCelcius-32)*5/9) ;
}
public static double CelciusVersFarenheit( double tCelciusF) {
    return ((tCelciusF*9/5)+32) ;
}
public static double KelvinVersFarenheit( double tKelvinF) {
    return (((tKelvinF-273.15)*9/5)+32);
}
public static double FarenheitVersKelvin( double tFKelvin) {
    return CelciusVersKelvin(FarenheitVersCelcius(tFKelvin));
}
}
