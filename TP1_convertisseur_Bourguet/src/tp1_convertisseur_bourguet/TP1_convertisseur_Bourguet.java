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
        
        System.out.print("Entrez la Temperature reel : ");
        double nombre1 = scanner.nextDouble();
        System.out.println("La température 1 est:" +nombre1+"");
        System.out.println("La température en Kelvin est: " +(nombre1+273.15)+"");
        
        double kelvin = CelciusVersKelvin(nombre1);
        System.out.println("Celsius → Kelvin : " + kelvin);

        double fahrenheit = CelciusVersFarenheit(nombre1);
        System.out.println("Celsius → Fahrenheit : " + fahrenheit);

        double celsiusRetour = KelvinVersCelcius(kelvin);
        System.out.println("Kelvin → Celsius : " + celsiusRetour);

        double kelvinDepuisF = FarenheitVersKelvin(fahrenheit);
        System.out.println("Fahrenheit → Kelvin : " + kelvinDepuisF);

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
