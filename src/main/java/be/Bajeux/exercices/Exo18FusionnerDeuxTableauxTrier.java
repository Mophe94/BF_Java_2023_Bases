package be.Bajeux.exercices;

public class Exo18FusionnerDeuxTableauxTrier {
    public static void main(String[] args) {


        int[] tab1s = new int[]{1, 54, 75, 145, 154};
        int[] tab2s = new int[]{45, 85, 144, 200, 325};
        int[] tabResult = new int[tab1s.length + tab2s.length];

        System.out.println("tableaux 1");
        for (int tab1 : tab1s) {
            System.out.print(tab1 + "|");
        }
        System.out.println('\n' + "tableaux 2");
        for (int tab2 : tab2s) {
            System.out.print(tab2 + "|");
        }

        for (int i = 0; i < tab1s.length; i++) {
            tabResult[i] = tab1s[i];
        }

        for (int i = 0; i < tab2s.length; i++) {

            int temp = 0;
            int temp2 = 0;
            boolean placement = true;
            for (int j = 0; j < tabResult.length; j++) {

                if (tab2s[i] <= tabResult[j] && placement) {
                    temp = tabResult[j];
                    tabResult[j] = tab2s[i];
                    placement = false;
                }
                if (tab2s[i] > tabResult[j] && temp >= tabResult[i] && !placement) {
                    temp2 = tabResult[i];
                    tabResult[j] = temp;
                    temp = temp2;

                }
            }

        for (int j = 0; j < tabResult.length; j++) {
            int index = j;
            int nextIndex = index + 1;
            if (tab2s[i] >= tabResult[index] && tab2s[i] <= tabResult[nextIndex]) {
                int nextElement = tabResult[nextIndex];
                tabResult[j] = tab2s[i];
                for (int k = nextElement; k < tabResult.length; k++) {

                }
            }
        }
    }

        System.out.println('\n'+"tableaux trier");
        for(
    int result :tabResult)

    {
        System.out.print(result + "|");
    }
}


