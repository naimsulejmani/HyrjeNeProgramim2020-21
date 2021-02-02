package cacttus.education.com.detyraProvimi;

import java.util.Scanner;

public class ViktorDiceRoll {
    static int[] rezultatet = new int[6];

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Press S to start rollin the dice or Q to quit: ");
        char ans = scan.next().charAt(0);

        switch(ans){
            case 'Q':
            case 'q':
                return;
            case 'S':
            case 's':
                rollDice();
                break;
            default:
                System.out.println("Opsion invalid!");
                return;
        }

        System.out.println("The dice have been rolled");
        System.out.print("Press D to display the results or Q to quit: ");
        ans = scan.next().charAt(0);

        switch(ans){
            case 'Q':
                return;
            case 'D':
                display();
                break;
            default:
                System.out.println("Opsion invalid!");
                return;
        }
    }

    static void display(){
        for(int i = 0; i < 6; i++){
            System.out.printf("Zari ka rene ne numrin %d ne total %d here%n", i+1, rezultatet[i]);
        }
    }

    static void rollDice(){
        int k;
        for(int i = 0; i < 10e7; i++){
            k = (int)Math.floor((Math.random() * 6) + 1);
            rezultatet[k - 1]++;
        }
    }
}
