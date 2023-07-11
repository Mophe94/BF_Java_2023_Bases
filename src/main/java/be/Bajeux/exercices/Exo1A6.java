package be.Bajeux.exercices;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Exo1A6 {
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


        //exo 2 / -18 acces
//
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Bonjour rentrer votre age");
//        int age = scan.nextInt();
//        if (age < 18) {
//            System.out.println("vous être trop jeune !");
//        }else {
//        System.out.println("Bienvenue sur notre app ");}
//

        // exo 3 / 2 nombre


//        Scanner scan = new Scanner(System.in);
//
//
//        System.out.println("Nombre 1 :  ");
//        int a = scan.nextInt();
//        System.out.println("Nombre 2 :  ");
//        int b = scan.nextInt();
//
//
//        if (a > b){
//            System.out.println(a + " > " + b);
//        } else if (a < b) {
//            System.out.println(a + " < " + b);
//        } else {
//                System.out.println( a + " = " + b);
//            }


        // exo 4/  3 nombre

//        Scanner scan = new Scanner(System.in);
//
//
//        System.out.println("Nombre 1 :  ");
//        int nb1 = scan.nextInt();
//        System.out.println("Nombre 2 :  ");
//        int nb2 = scan.nextInt();
//        System.out.println("Nombre 3 :  ");
//        int nb3 = scan.nextInt();
//
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

         //exo 5 / conversion seconde en heure minute et seconde


//        Scanner scan = new Scanner(System.in);
//
//        int input = scan.nextInt();
//        int heure = input / 3600;
//        int resteHeure = input % 3600;
//        int minute = resteHeure / 60 ;
//        int resteMinute = resteHeure % 60 ;
//        int seconde =  resteMinute;
//
//
//      System.out.printf("%d heure %d minute %d seconde  ",heure,minute,seconde);
// ici on utilise le printf utiliser le %d et separer la chaine de caractère par une virgule et entrée les variable dans l'odre
    }
}