package be.Bajeux.exercices;

import java.util.Scanner;

public class Exo11NombrePremier {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int longeur = scan.nextInt();
        int decroissant = longeur;
        for (int i = 1; i < longeur; i++) {
            while (decroissant > 0 ){
                if (i % decroissant == 0){
                    System.out.println(i);
                }
                decroissant--;
            }
        }
    }
}

