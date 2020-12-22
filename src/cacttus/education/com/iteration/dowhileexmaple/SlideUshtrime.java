package cacttus.education.com.iteration.dowhileexmaple;

import java.util.Scanner;

public class SlideUshtrime {
    public static void main(String[] args) {
        //do_while_positiveNo();
        do_while_reverseNum();
    }

    public static void do_while_positiveNo() {
        Scanner reader = new Scanner(System.in);
        int numri;
        do {
            System.out.print("Shkruaj nje numer positive: ");
            numri = reader.nextInt();
            if (numri <= 0)
                System.out.println("Numri nuk eshte positive...");
        } while (numri <= 0);
        System.out.println("Wow numer positiv...");
    }

    public static void do_while_reverseNum() {
        int reverserNum = 0; // reveresd number will be stored at this variable :)
        System.out.println("enter an positive integer: ");
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();

        do {
            int lastDigit = num % 10; // merr shifren e fundit te num  sipas logjikes se modulus
            reverserNum = (reverserNum * 10) + lastDigit;
            num /= 10;
        } while (num > 0);

        System.out.printf("Numri reverse eshte %d", reverserNum);
    }
}
