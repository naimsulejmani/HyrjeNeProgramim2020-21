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
                earnedPlaces[rowIndex][colIndex] = (int) (Math.random() * 10);
            }
        }

        for (int[] array : earnedPlaces) {
            for (int nr : array) {
                System.out.printf("%d  ", nr);
            }
            System.out.println();
        }

//ekipi me me se paku pjesmarrje ne tourne
        int teamWithLeastParticipationIndex = -1; //si vler enenkupton qe asnje nuk eshte zgjedhur
        int teamWithLeastParticipationNo = 0;

        for (int rowIndex = 0; rowIndex < earnedPlaces.length; rowIndex++) {
//            int countZeros = 0;
//            for (int colIndex = 0; colIndex < earnedPlaces[rowIndex].length; colIndex++) {
//                int value = earnedPlaces[rowIndex][colIndex];
//                if (value == 0) countZeros++;
//            }
            int countZeros = countValues(earnedPlaces[rowIndex], 0);
            //int countOnes = countValues(earnedPlaces[rowIndex], 1);
            //int count10 = countValues(new int[]{1, 10, 100, 10, 10, 5}, 10);
            if (countZeros > teamWithLeastParticipationNo) {
                teamWithLeastParticipationNo = countZeros;
                teamWithLeastParticipationIndex = rowIndex;
            }
        }

        if (teamWithLeastParticipationIndex > -1)
            System.out.printf("Ekipi me me se shumti zero eshte %s dhe ka ne total %d zero!",
                    teams[teamWithLeastParticipationIndex], teamWithLeastParticipationNo);
        else
            System.out.println("No teams ever ....");

        System.out.println();
        for (int i = 0; i < teams.length; i++) {
            int totalMedals =
                    countValues(earnedPlaces[i], 1) +
                            countValues(earnedPlaces[i], 2) +
                            countValues(earnedPlaces[i], 3);
            //sa elementa i ka - sa medalja i ka fitu - sa here ska marr pjese
            System.out.printf("Ekipi %s ka fituar gjithsej %d medalje, dhe nuk ka fituar %d here! %n",
                    teams[i], totalMedals,
                    earnedPlaces[i].length - totalMedals - countValues(earnedPlaces[i], 0)
            );

        }

        countEarnedPlaceFor(teams,"Real Madrid",1,earnedPlaces);
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

    static void countEarnedPlaceFor(String[] teams, String team, int place, int[][] matrix) {
        int selectedIndex = -1;
        for (int i = 0; i < teams.length; i++) {
            if (teams[i].equals(team)) {
                selectedIndex = i;
                break;
            }
        }

        if (selectedIndex > -1) {
            System.out.println(countValues(matrix[selectedIndex], place));
        }
    }


    static int countValues(int[] array, int value) {
        int counter = 0;
        for (int number : array) {
            if (number == value) counter++;
        }
        return counter;
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
