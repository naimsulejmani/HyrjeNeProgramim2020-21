package cacttus.education.com.detyraProvimi;

import java.util.Random;

public class Detyra4 {
    private static void detyra3(int howManyRolls) {
        //int [] diceValues = {1,2,3,4,5,6}; //pse e ke deklaur kete varg
        int[] diceCounter = new int[6];//indeksi 0 eshte per 1, ... indeksi 5 eshte 6
//        int howManyOnes = 0;
//        int howManyTwos = 0;
//        int howManyThrees = 0;
//        int howManyFours = 0;
//        int howManyFives = 0;
//        int howManySixes = 0;
        int valueChosen;
        for (int i = 0; i < howManyRolls; i++) {
            valueChosen = new Random().nextInt(6) + 1; //valueChosen vlera prej 1..6
            diceCounter[valueChosen - 1]++;
//            if(valueChosen==1)
//                diceCounter[0]++;
//            else if(valueChosen==2)
//                diceCounter[1]++;
//            else if(valueChosen==3)
//                diceCounter[2]++;
//            else if(valueChosen==4)
//                diceCounter[3]++;


//            if(valueChosen == 1){
//                howManyOnes++;
//            }
//            else if(valueChosen == 2){
//                howManyTwos++;
//            }
//            else if(valueChosen == 3){
//                howManyThrees++;
//            }
//            else if(valueChosen == 4){
//                howManyFours++;
//            }
//            else if(valueChosen == 4){
//                howManyFives++;
//            }
//            else{
//                howManySixes++;
//            }
        }
//        System.out.printf("Number 1 has been chosen %d times %n", howManyOnes);
//        System.out.printf("Number 2 has been chosen %d times %n", howManyTwos);
//        System.out.printf("Number 3 has been chosen %d times %n", howManyThrees);
//        System.out.printf("Number 4 has been chosen %d times %n", howManyFours);
//        System.out.printf("Number 5 has been chosen %d times %n", howManyFives);
//        System.out.printf("Number 6 has been chosen %d times %n", howManySixes);
    }
}
