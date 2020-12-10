package cacttus.education.com.iteration.forexample;

import java.util.Locale;
import java.util.Scanner;

public class DetyraForExample {
    public static void main(String[] args) {
        //numratCift();
        //numratCiftVA();
        detyra3Profa();
    }

    public static void numratCift() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj nje numer: ");
        int nr = reader.nextInt();

        for (int counter = 1; counter <= nr; counter++) {
            if (counter % 2 == 0) {
                System.out.printf("%d ", counter);
            }
        }
    }

    public static void numratCiftVA() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Shkruaj numrin: ");
        int n = scan.nextInt();

        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void numratCiftRS() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj numrin: ");
        int nr = reader.nextInt();
        for (int i = 2; i < nr; i++) {
            System.out.println(i++);
        }
    }

    public static void detyra2EnGashi() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj numrin: ");
        int nr = reader.nextInt();
        for (int i = 1; i <= nr; i++) {
            System.out.println(i++);
        }
    }

    public static void detyra2VA() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj numrin: ");
        int nr = reader.nextInt();
        for (int i = 1; i <= nr; i += 2) {
            System.out.println(i);
        }
    }

    public static void detyra3Profa() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj numrin: ");
        int nr = reader.nextInt();
        System.out.println("Zgjidh (C-Cift / T-Tek): ");
        char zgjedhja = reader.next().toLowerCase().charAt(0);

        if (zgjedhja == 'c' || zgjedhja == 't') {
            int count = zgjedhja == 'c' ? 2 : 1; // ternary operator

            for (; count <= nr; count += 2) {
                System.out.printf("%d ", count);
            }
            //for
        }
//        else if(zgjedhja=='t') {
//            //for
//        }
        else {
            System.out.println("Zgjedhja eshte e gabuar!!!");
        }

        //1 dhe me u rrit per 2  qe me pas sekuence 1,3,5,7...
        //2 dhe me u rrite per 2 qe me pas sekuence 2,4,6,8...
    }
}

