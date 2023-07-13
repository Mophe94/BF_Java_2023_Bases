package be.Bajeux.exercices;

public class Exo17TrouverUneValeurMax {

    public static void main(String[] args) {

        int[] tabs = new int[]{15, 28, 5875, 965, 54, 21, 47, 24};

        for (int tab : tabs) {
            System.out.print(tab + "|");
        }
        int valeurMax = 0;
        int index = 0;
        for (int i = 0; i < tabs.length; i++) {
                boolean isMax = true;
            if (tabs[i] > valeurMax ) {
                valeurMax = tabs[i];
                isMax = false;
            }
            if (valeurMax >= tabs[i] && !isMax  ) {
                index = i;
                isMax = true;
            }
        }
        System.out.println("La valeur max du tableaux est : " + valeurMax + '\n' + " et son index est : " + index);
    }
}
