package be.Bajeux.exercices;

import java.util.Scanner;

public class Exo14TableauxTrier {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] tab = new int[10];

        System.out.println("entrer 10 nombre de votre tableaux");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = scan.nextInt();
        }

        for (int i = 1; i < tab.length; i++) {

            if (tab[i] < tab[i - 1]) {
                for (int j = i; j > 0 && (tab[j] < tab[j-1]); j--) {

                    int temp = tab[j];
                    tab[j]= tab[j-1];
                    tab[j-1] = temp;

                }
            }
        }
        for (int i = 0; i < tab.length;i++){
            System.out.print(tab[i] +"|");
        }
    }
}
