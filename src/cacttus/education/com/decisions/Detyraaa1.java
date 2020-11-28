package cacttus.education.com.decisions;

import java.util.Scanner;

public class Detyraaa1 {
    public static void main(String[] args) {

    }

    public static void d1RionHasolli() {

    }

    public static void d1EnGashi() {
        int nota = 75;
        if (nota >= 0 && nota <= 100) {
            //ktu menaxho piket
        } else {
            System.out.println("vlerat nuk jane ne rangun 0 deri me 100");
        }
    }

    public static void d1EnsarHoxha() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sa jane piket e juaja ne test");
        int piket = reader.nextInt();
        if (piket > 100) {
            System.out.println("Keni pike gabim ose je qika e drejtorit");
        } else if (piket < 0) {
            System.out.println("Jeni perjashtuar");
        } else if (piket <= 49) {
            System.out.println("Keni mare noten 5");
        } else if (piket <= 59) {
            System.out.println("Keni mare noten 6");
        } else if (piket <= 69) {
            System.out.println("Keni mare noten 7");
        } else if (piket <= 79) {
            System.out.println("Keni mare noten 8");
        } else if (piket <= 89) {
            System.out.println("Keni mare noten 9");
        } else if (piket <= 100) {
            System.out.println("Keni mare noten 10");
        }
    }

    public static void d1ResulSelmani() {
        Scanner vlera = new Scanner(System.in);
        System.out.println("Shkruaji piket e provimit");
        int piket = vlera.nextInt();
        if (piket < 50) {
            System.out.println("Ec me hi nriprovim se 5 e ke mar");
        } else if (piket < 60) {
            System.out.println("E ke mare noten 6");
        } else if (piket < 70) {
            System.out.println("So keq jo, 7she per marakli");
        } else if (piket < 80) {
            System.out.println("Perpaaaaaak 9she ");
        } else if (piket < 90) {
            System.out.println("9she e ke mar, ke mujt me mar 10she po nejse...");
        } else if (piket >= 90 && piket <= 100) {
            System.out.println("Hallall mk, 10she e ke mare");
        } else {
            System.out.println("Pos ajo qika e drejtorit t'mjeksis tani ti me kto pike!!!");
        }
    }
}
