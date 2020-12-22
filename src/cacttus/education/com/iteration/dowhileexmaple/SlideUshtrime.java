package cacttus.education.com.iteration.dowhileexmaple;

import java.util.Scanner;

public class SlideUshtrime {
    public static void main(String[] args) {
        //do_while_positiveNo();
        //do_while_reverseNum();
//        do_while_printSeries1();
        //do_while_printSeries2();
        do_while_tabelaShumezimit_EH();
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


    public static void do_while_printSeries1() {
        int numri = 1;
        do {
            System.out.printf("%d %20d %n", numri, numri * numri);
            numri++;
        } while (numri <= 100);
    }

    public static void do_while_printSeries2() {
        int numri = 1;
        do {
            System.out.printf("%d %20d %20d %n", numri, numri * numri, numri * numri * numri);
            numri++;
        } while (numri <= 100);
    }


    public static void do_while_tabelaShumezimit_EH() {
        int nr = 1;
        Scanner reader = new Scanner(System.in);
        System.out.println("Sa eshte numri juaj : ");
        int numri = reader.nextInt();
        if (numri >= 1 && numri <= 10)
            do {
                System.out.printf("%d * %d = %d %n", nr, numri, nr * numri);
                nr++;
            } while (nr <= 10);
    }

    public static void do_while_pjestuesit_EH() {
        int i = 1;
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer : ");
        int numri = reader.nextInt();
        if (numri > 0) {
            do {
                int plot = numri % i;
                if (plot == 0)
                    System.out.println(i);
                i++;
            } while (i <= numri);
        }
    }

    public static void do_while_pjestuesit_GJB() {
        Scanner reader = new Scanner(System.in);
        int count = 1;
        System.out.println("shkruje nje numer");
        int nr = reader.nextInt();
        do {
            if (nr % count == 0)
                System.out.println(count);
            count++;
        } while (count <= nr);
    }

    //edhe Resuli

    public static void do_while_pjestuesit_Profa() {
        Scanner reader = new Scanner(System.in);
        System.out.println("shkruje nje numer");
        int nr = reader.nextInt();
        if (nr > 0) {
            int count = nr;
            do {
                if (nr % count == 0) System.out.println(count);
                count--;
            } while (count >= 1);
        }
    }

    public static void do_while_InfiniteRS() {
        boolean amProgrammer = true;
        do {
            System.out.println("Une jam programer");
        } while (amProgrammer);
    }

    public static void do_while_InfiniteEH() {
        int i = 1;
        do {
            System.out.println("Une jam programer");
        } while (i == 1);
    }

    public static void do_while_infinite1() {
        do {
            System.out.println("Une jam programer");
        } while (true);
    }
}
















