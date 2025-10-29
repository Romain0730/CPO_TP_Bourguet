/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette_bourguet;

/**
 *
 * @author romai
 */
public class TP0_Calculette_Bourguet {

    /**
     * @param args the command line arguments
     */
 public class TP0_Calculette {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int operateur;        // choix de l'opération
        double operande1;     // premier nombre
        double operande2;     // deuxième nombre
        double resultat;      // résultat final

        // 1) Affichage du menu
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) subtract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        // 2) Lecture de l'opérateur
        operateur = sc.nextInt();

        // 3) Vérification du choix avant de demander les opérandes
        if (operateur < 1 || operateur > 5) {
            System.out.println("Error: invalid operator choice! Must be between 1 and 5.");
        } else {
            // 4) Lecture des opérandes
            System.out.print("Please enter the first number: ");
            operande1 = sc.nextDouble();

            System.out.print("Please enter the second number: ");
            operande2 = sc.nextDouble();

            // 5) Calcul du résultat selon l'opérateur choisi
            switch (operateur) {
                case 1:
                    resultat = operande1 + operande2;
                    System.out.println("The result is : " + resultat);
                    break;
                case 2:
                    resultat = operande1 - operande2;
                    System.out.println("The result is : " + resultat);
                    break;
                case 3:
                    resultat = operande1 * operande2;
                    System.out.println("The result is : " + resultat);
                    break;
                case 4:
                    if (operande2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                    } else {
                        resultat = operande1 / operande2;
                        System.out.println("The result is : " + resultat);
                    }
                    break;
                case 5:
                    if (operande2 == 0) {
                        System.out.println("Error: Modulo by zero is not allowed!");
                    } else {
                        resultat = operande1 % operande2;
                        System.out.println("The result is : " + resultat);
                    }
                    break;
                default:
                    System.out.println("Unexpected error!");
            }
        }

        sc.close();
    }
}