package be.Bajeux.demos;

public class DemoBoucle {
    public static void main(String[] args) {

        int count = 0;
// quand on attend un resultat on va utiliser un "tant que" quand on ne connais pas le resultat
        while (count < 10){
            System.out.println(count);
            count +=1; // raccourcie qui permet d'additioner la valeur et la placer en memoire equivaut a count = count +1
//            count ++; il s'execute puis il va rajouter 1 post incrementation
//            ++count ; il rajoute 1 a la valeur puis s'éxécute pre incrémentation
        }
        // quand on sait le nombre d'iteration on va utiliser le for "pour"
        for(int i = 0; i < 10 ; i++){
            System.out.println(i);
        }
        // quand on veut rentrer ou moins une fois dans la boucle on va plus utiliser le "do"
        do {
            System.out.println(count++ );
        } while (count < 10);
    }
}
