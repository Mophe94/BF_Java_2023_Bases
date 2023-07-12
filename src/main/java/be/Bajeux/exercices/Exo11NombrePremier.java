package be.Bajeux.exercices;

import java.util.Scanner;

public class Exo11NombrePremier {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int longeur = scan.nextInt();
        int nbElements = 0;
        for (int i = 2; nbElements < longeur; i++) {
            int j ;
            for ( j = 2; i % j !=0 ; j++){
                }
            if (j == i){
                System.out.println(i);
                nbElements++;
            }
        }
    }
}

