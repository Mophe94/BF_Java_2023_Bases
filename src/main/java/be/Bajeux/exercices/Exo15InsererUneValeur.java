package be.Bajeux.exercices;

import java.util.Scanner;

public class Exo15InsererUneValeur {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] tab = new int[]{18, 22, 42, 60, 80,0};
        final int SIZE = tab.length;

        int nbChoisi = scan.nextInt();
        for (int i = 0; i < SIZE; i++) {

            if (nbChoisi < tab[i]) {
                int temp = tab[i];
                tab[i] = nbChoisi;
                nbChoisi = temp;
            }

        }
        tab[SIZE - 1] = nbChoisi;
        for (int i = 0; i < SIZE; i++) {
            System.out.println(tab[i]);
        }
    }
}
