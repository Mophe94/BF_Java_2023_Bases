package be.Bajeux.exercices;

import java.util.Scanner;

public class Exo8DeBalle {

    public static void main(String[] args) {


        int nbBalles = 10;

        while (nbBalles > 0) {
            Scanner scan = new Scanner(System.in);
            boolean joueurPret;
            String input;
            do {
                System.out.println("êtes vous pret ? y/n");
                input = scan.next().toLowerCase();
            } while (!input.equals("y") && !input.equals("n"));

            joueurPret = input.equals("y");
            if (joueurPret) {
                System.out.println("lancer une balle");
                System.out.println(nbBalles + " balles restantes");
                nbBalles--;
            }
            if (nbBalles == 0) {
                do {
                    {
                        System.out.println("voulez vous la remplir a nouveau ? y/n");
                        input = scan.next().toLowerCase();
                    }
                    while (!input.equals("y") && !input.equals("n")) ;
                    if ((input.equals(("y")))) ;
                }
            }
        }
    }
}