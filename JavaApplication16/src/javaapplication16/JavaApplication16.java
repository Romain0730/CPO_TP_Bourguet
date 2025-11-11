/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author romai
 */
public class JavaApplication16 {
public class TP2_relation_1_NOM1_NOM2 {
    public static void main(String[] args) {
        // 3-4 : création d'objets
        voiture uneClio = new voiture("Clio", "Renault", 5);
        voiture uneAutreClio = new voiture("Clio", "Renault", 5);
        voiture une2008 = new voiture("2008", "Peugeot", 6);
        voiture uneMicra = new voiture("Micra", "Nissan", 4);

        Personne bob = new Personne("Sixkiller", "Bobby");
        Personne reno = new Personne("Raines", "Reno");

        System.out.println("liste des voitures disponibles :\n" + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

        // 8 : Bob possède uneClio
        bob.liste_voitures[0] = uneClio;
        bob.nbVoitures = 1;
        uneClio.proprietaire = bob;

        System.out.println("\nAprès affectation directe :");
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0]);

        // 9 : ajout via la méthode ajouter_voiture
        boolean ajout1 = bob.ajouter_voiture(uneAutreClio); // doit réussir -> bob a maintenant 2 voitures
        System.out.println("\nAjout uneAutreClio à Bob via ajouter_voiture() => " + ajout1);

        boolean ajout2 = reno.ajouter_voiture(une2008); // doit réussir
        boolean ajout3 = reno.ajouter_voiture(uneMicra); // doit réussir

        System.out.println("\nEtat des propriétaires après ajouts :");
        System.out.println("uneClio proprietaire = " + uneClio.proprietaire);
        System.out.println("uneAutreClio proprietaire = " + uneAutreClio.proprietaire);
        System.out.println("une2008 proprietaire = " + une2008.proprietaire);
        System.out.println("uneMicra proprietaire = " + uneMicra.proprietaire);

        System.out.println("\nBob => " + bob);
        System.out.println("Reno => " + reno);

        // Test : essayer d'ajouter une voiture déjà possédée à une autre personne
        boolean volTest = reno.ajouter_voiture(uneClio); // doit retourner false car uneClio a déjà un proprietaire
        System.out.println("\nTentative d'ajouter uneClio (déjà possédée) à Reno => " + volTest);

        // Test : remplir Bob jusqu'à la limite (déjà 2 si on a ajouté uneAutreClio)
        voiture troisieme = new voiture("Test", "Test", 3);
        boolean ajoutTroisieme = bob.ajouter_voiture(troisieme); // selon état, pourra réussir ou échouer si limite atteinte
        System.out.println("Ajout troisieme à Bob => " + ajoutTroisieme);
    }
}
