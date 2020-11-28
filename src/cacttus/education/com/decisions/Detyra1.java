package cacttus.education.com.decisions;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        d1ArtElashani();
        //d1ViktorAhmeti();
       // d1NaimSulejmaniJoMire();
    }

    public static void d1NaimSulejmaniJoMire() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shtyp nr");
        int nr = sc.nextInt();
        if (nr == 1) {
            System.out.println("E kuqe");
        }
        if (nr == 2) {
            System.out.println("E verdhe");
        }
        if (nr == 3) {
            System.out.println("E gjelber");
        }
        if (nr == 4) {
            System.out.println("duke blinkuar");
        }
        if (nr < 1 || nr > 4) {
            System.out.println("Prishur");
        }
    }

    public static void d1ArtElashani() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shtyp nr");
        int nr = sc.nextInt();
        if (nr == 1) {
            System.out.println("E kuqe");
        } else if (nr == 2) {
            System.out.println("E verdhe");
        } else if (nr == 3) {
            System.out.println("E gjelber");
        } else if (nr == 4) {
            System.out.println("duke blinkuar");
        } else {
            System.out.println("Prishur");
        }
    }

    public static void d1ViktorAhmeti() {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

// zgjidhja me eliminim te gabimeve -> defensive programing
        if (x < 1 || x > 4)
            System.out.println("Semafori nuk eshte i leshuar");
        else {
            if (x == 1)
                System.out.println("Semafori eshte i kuq");
            else if (x == 2)
                System.out.println("Semafori eshte i verdhe");
            else if (x == 3)
                System.out.println("Semafori eshte i gjelber");
            else
                System.out.println("Semafori eshte duke blinkuar");
        }
    }

    public static void d1EnsarHoxha() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sa  eshte numri juaj : ");
        int a = reader.nextInt();
        if (a == 1) {
            System.out.println("Semafori eshte i kuq");
        } else if (a == 2) {
            System.out.println("Semafori eshte i verdhe");
        } else if (a == 3) {
            System.out.println("Semafori eshte i gjelbert");
        } else if (a == 4) {
            System.out.println("Semafori eshete duke blinkuar");
        } else {
            System.out.println("Semafori eshte pa rryme");
        }
    }


    public static void d1ResulSelmani() {
        Scanner vlera = new Scanner(System.in);
        System.out.println("Jepe vleren e semaforit");
        int numriSemaforit = vlera.nextInt();
        if (numriSemaforit == 1) {
            System.out.println("Semafori eshte i kuq! PRIT!!!!");
        } else if (numriSemaforit == 2) {
            System.out.println("Semafori eshte i verdhe, Prit apet");
        } else if (numriSemaforit == 3) {
            System.out.println("Jepi gazit shko kah dush!");
        } else if (numriSemaforit == 4) {
            System.out.println("Semafori eshte duke blinkuar");
        } else {
            System.out.println("Ehhhh KEDSI ta nal rrymen t len pa semafor");
        }
    }

}
