package be.Bajeux.exercices;

import java.util.Scanner;

public class ExoforcerNombre1et10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entrer un nombre entre 1 et 10 ");

        int a ;

        do {
            System.out.println("Un chiffre entre 1 et 10 ");
            a = scan.nextInt();
        } while (!(a >= 1 && a <=10));

        System.out.println("Votre nombre est " +  a);
    }

}











