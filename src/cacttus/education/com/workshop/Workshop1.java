package cacttus.education.com.workshop;

import java.util.Scanner;

public class Workshop1 {
    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        String[] teams; //deklarimi i vargjeve
        String[] tournaments;

        teams = generatePopulatedArray("Ekipe");
        tournaments = generatePopulatedArray("Turnire");

        int[][] earnedPlaces = new int[teams.length][tournaments.length];
//i-rresht, j-kolona, rowIndex, colIndex

        //mbushja e vargut 2 dimensional (matrix) me vlera randome prej 0 deri me 20
        for (int rowIndex = 0; rowIndex < earnedPlaces.length; rowIndex++) {
            for (int colIndex = 0; colIndex < earnedPlaces[rowIndex].length; colIndex++) {
                earnedPlaces[rowIndex][colIndex] = (int) (Math.random() * 21);
            }
        }

        



        // me marr vlera prej shfrytezuesit

//        System.out.println("Shkruaj numrin e ekipeve pjesmarrese: ");
//        int n = reader.nextInt();
//        teams = new String[n];
//
//        for (int i = 0; i < teams.length; i++) {
//            System.out.printf("Ekipi %d:", (i + 1));
//            teams[i] = reader.nextLine();
//        }
//
//        System.out.println("Shkruaj numrin e turneve te ndryshem: ");
//        int m = reader.nextInt();
//        tournaments = new String[m];
//
//        for (int i = 0; i < tournaments.length; i++) {
//            System.out.printf("Turniri %d: ", (i + 1));
//            tournaments[i] = reader.nextLine();
//        }
    }


    static String[] generatePopulatedArray(String reason) {
        System.out.printf("Shkruaj numrin e %s", reason);
        int n = reader.nextInt();
        reader.nextLine();
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s %d:", reason, (i + 1));
            array[i] = reader.nextLine();
        }
        return array;
    }
}
