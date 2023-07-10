package be.Bajeux.demos;
// exemple de creation d'une saisie utilisateur (input)
import java.time.LocalDate;
import java.util.Scanner;

public class DemoInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//system.in  sert a dire qu'on va scanner quelque chose qu'on va rentrer au clavier
        System.out.print("");//difference entre un print et un println le print ne va pas a la ligne

//        System.out.print(("jour : "));
//        int day  =  scan.nextInt();
//        System.out.print("Mois : ");
//        String month = scan.next();
//        System.out.print("Année : ");
//        long years =  scan.nextLong();

        System.out.print(("jour : "));
        int day  =  scan.nextInt();// input d'un int
        System.out.print("Mois : ");
        String month = scan.next();//input d'un String
        System.out.print("Année : ");
        long year = scan.nextLong();// input d'un long

        LocalDate date = LocalDate.of(4,4,1994);//declaration qui permet

        System.out.println(date);
        System.out.print(day+" "+month+ " "+ year);
    }
}
