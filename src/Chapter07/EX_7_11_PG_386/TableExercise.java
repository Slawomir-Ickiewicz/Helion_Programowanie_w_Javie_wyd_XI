package Chapter07.EX_7_11_PG_386;

public class TableExercise {


    public static void main(String[] args) {

        int [] counts = new int [10];
        int [] bonus = new int[15];
        int [] bestScores = new int[5];

        for (int i = 0; i <counts.length ; i++) {
            counts[i] = 0;
        }

        for (int i = 0; i <bonus.length ; i++) {
            bonus[i] = bonus[i+1];

        }

        for (int i = 0; i <bestScores.length ; i++) {

            System.out.println(bestScores[i]);

        }


    }


}
