package be.Bajeux.exercices;

import java.util.Scanner;

public class Exo9Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int longueur = scan.nextInt();
        int result;
        int nb1 = 0;
        int nb2 = 1;
        for (int i = 0; i < longueur; i++) {
            result = nb1 + (nb2 - nb1);
            System.out.println(result);
            nb1 = result;
        }
    }
}
