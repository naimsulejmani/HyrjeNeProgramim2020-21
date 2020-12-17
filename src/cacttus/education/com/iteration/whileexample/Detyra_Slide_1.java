package cacttus.education.com.iteration.whileexample;

import java.util.Scanner;

public class Detyra_Slide_1 {
    public static void main(String[] args) {
        //printNrWithSquare_MXH();
        //sumTilHundred_RS();
        //sumVA();
        palindromeVA();
    }

    public static void printNrWithSquare_MXH() {
        System.out.printf("n %20s %n", "n^2");

        int num = 1; // inicializimi
        while (num <= 100) { // kontrolla -
            System.out.printf("%d %20d  %n", num, num * num);
            num++; // increment ndryshimi i control varibales
        }
    }

    public static void sumTilHundred_RS() {
        int count = 1;
        int sum = 0;

        while (count <= 100) { //perderisa count eshte me i vogel ose barabarte me 100
            sum += count; // shumes shtoja vleren e count-it
            count++;
        }

        System.out.println("Shuma = " + sum);
    }

    public static void sumVA() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shkruaj nje numer deri ku: ");
        int nr = scan.nextInt(); // 100
        int sum = 0;

        while (nr > 0) {
            sum += nr; // 1+2+3, 3+2+1
            nr--;
        }

        System.out.println("Shuma = " + sum);
    }

    public static void palindromeVA() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shkruaj Tekstin");
        String teksti = scan.nextLine();

        int i = 0; //charIndex -> prej cilit indeks kemi me fillu me shiku
        //per te kontrolluar palindrome shkojme shkronjen e pare me te fundit
        // te dyten me te parafundit (shkojme deri tek shkronja e mesit)

        //nje variabel kontrolluese supozuese
        boolean isPalindrome = true;


        //Perderisa nuk kemi mri ne mes te karaktereve
        //dhe teksti eshte akoma palindrome shiko karakterin tjeter
        while (i <= teksti.length() / 2 && isPalindrome) {
            //NAIM -> 4 karakter indeksi i pare eshte 0 indeksi i fundit eshte 3
            //nese teksti qe gjendet ne indeksin i - kah fillimi
            if (teksti.charAt(i) != teksti.charAt(teksti.length() - 1 - i)) {
                isPalindrome = false;
            }
            i++; // shko tek indeksi i shkronjes tjeter
        }

        System.out.printf("Teksti i dhene %s palindrom!",
                isPalindrome ? "eshte" : "nuk eshte"
        );
    }
}














