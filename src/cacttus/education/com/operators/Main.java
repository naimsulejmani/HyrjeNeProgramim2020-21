package cacttus.education.com.operators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int b = 5;
        int c = 2;
        double rrenja = Math.sqrt(b * b - 4 * c);
//        double quadraticPositive = (- b + Math.sqrt(b*b - 4 * c ))/ 2;
//        double quadraticNegative = (- b - Math.sqrt( b * b - 4 * c)) / 2;
        double quadraticPositive = (-b + rrenja) / 2;
        double quadraticNegative = (-b - rrenja) / 2;

        System.out.println(quadraticNegative);
        System.out.println(quadraticPositive);

        int a = 17;
        b = 29;

        System.out.println(a & b);
        System.out.println(~(a ^ b));

        a = 8;

        System.out.println(a >> 1);
        System.out.println(a << 2);
        System.out.println(17 >>> 32);


        int year = 2019;
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0) && (year % 100 != 0);

        isLeapYear = isLeapYear || (year % 400 == 0);
        //variabla boolean mund te llogaritet si shprehje krahasuese
        // 1==3
        System.out.println(isLeapYear == true ? "Eshte vit i brishte!" : "Eshte vit normal!");
        System.out.println(isLeapYear ? "Eshte vit i brishte!" : "Eshte vit normal!");


//        int numri = 123972 % 3 == 0 ? 10 : 20;
//        System.out.println("Numri = " + numri);

        double tatimPerDite = 1.75;
        double totalTatimi = isLeapYear ? tatimPerDite * 366 : tatimPerDite * 365;

        double totalTatimi1 = tatimPerDite * (isLeapYear ? 366 : 365);

        System.out.println("Tatimi = " + totalTatimi);

    }
}
