package be.Bajeux.exercices;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class exo {
    public static void main(String[] args) {

        //exo Bonjour prenom + date


//        Scanner scan = new Scanner(System.in);
//
//        LocalDate date = LocalDate.now();
//        String day = LocalDate.now().getDayOfWeek().name();
//        String month = LocalDate.now().getMonth().name();
//        int year = LocalDate.now().getYear();
//
//
//        System.out.println("Bonjour entrer votre prenom puis votre nom de famille");
//        String name2 = scan.next();
//        String name = scan.next();
//        System.out.println( "Bonjour " + name2 + name + " nous somme le " +date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")) );


        // exo 2 / -18 acces


//        Scanner scan = new Scanner(System.in);
//
//        int age = scan.nextInt();
//
//        if (age >= 18) {
//            System.out.println("Bienvenue sur notre app");
//        }else {
//        System.out.println("vous être trop jeune ");}
//

        // exo 3 / 2 nombre


//        Scanner scan = new Scanner(System.in);
//
//        int nb1 = scan.nextInt();
//        int nb2 = scan.nextInt();
//
//        if (nb1 > nb2){
//            System.out.println(nb1 + " > " + nb2);
//        } else if (nb1 < nb2) {
//            System.out.println(nb1 + " < " + nb2);
//        } else {
//                System.out.println(nb1 + " = " + nb2);
//            }


        // exo 4/  3 nombre

//        Scanner scan = new Scanner(System.in);
//
//        int nb1 = scan.nextInt();
//        int nb2 = scan.nextInt();
//        int nb3 = scan.nextInt();
//        int pl1 = 0;
//        int pl2 = 0;
//        int pl3 = 0;
//
//        if (nb1 >= nb2 && nb1 >= nb3   ) {
//            pl3 = nb1;
//        } else if (nb2 >= nb1 && nb2 >= nb3 ) {
//            pl3 = nb2;
//        } else {
//            pl3 = nb3;
//        }
//
//        if (nb1 <= nb2 && nb1 <= nb3) {
//            pl1 = nb1;
//        } else if (nb2 <= nb1 && nb2 <= nb3) {
//            pl1 = nb2;
//        } else {
//            pl1 = nb3;
//        }
//
//        if ((nb1 >= nb2 && nb1 <= nb3) || (nb1 >= nb3 && nb1 <= nb2)) {
//            pl2 = nb1;
//        } else if ((nb2 >= nb1 && nb2 <= nb3) || (nb2 >= nb3 && nb2 <= nb1)) {
//            pl2 = nb2;
//        } else {
//            pl2 = nb3;
//        }
//
//        System.out.println( (pl1 == pl2 ?  pl1 + " = "   : pl1 +" < ") + (pl2 == pl3 ? pl2 + " = " + pl3 : pl2 + " < " + pl3));
//    }

          // exo 5 / conversion seconde en heure minute et seconde


        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int heure = input / 3600;
        int resteHeure = input % 3600;
        int minute = resteHeure / 60 ;
        int resteMinute = resteHeure % 60 ;
        int seconde =  resteMinute;


        System.out.println("la conversion des seconde que vous avez donner est " + heure + " heure " + minute + " minute " + seconde + " seconde ");
    }
}