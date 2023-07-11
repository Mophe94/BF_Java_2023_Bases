package be.Bajeux.exercices;

import java.util.Scanner;

public class Exo10Factoriel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("rentrer le nombre a calcululer ");
        int nb = scan.nextInt();
        int i = 1;
        int result = 1;
        while (i <= nb-1){
           result  *=  i+1 ;
            i++;
            System.out.println(result);
        }
    }
}
