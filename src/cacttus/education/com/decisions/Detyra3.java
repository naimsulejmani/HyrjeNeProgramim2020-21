package cacttus.education.com.decisions;

import java.util.Scanner;

public class Detyra3 {
    public static void main(String[] args) {

    }

    public static void d3ViktorAhmetiNaimSulejmani() {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        if (x >= -10000 && x <= 10000)
            System.out.println("Brenda rangut");
        else
            System.out.println("Jashte rangut");
    }

    public static void d3ViktorAhmeti() {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        if (x < -10000 || x > 10000)
            System.out.println("Jashte rangut");
        else
            System.out.println("Brenda rangut");
    }
}
