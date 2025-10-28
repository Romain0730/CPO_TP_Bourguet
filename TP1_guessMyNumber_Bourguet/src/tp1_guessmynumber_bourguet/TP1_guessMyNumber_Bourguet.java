/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_bourguet;
import java.util.Random;
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
        System.out.println("voici 5 nombres aléatoires entre 0 et 100:");
    for (int i=1; i<=5; i++){
        int n = generateurAleat.nextInt(101);
        System.out.println("Nombre aléatoire " +i+ " : " +n);
    }
    }
    }
    

