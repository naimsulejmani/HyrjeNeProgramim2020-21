package cacttus.education.com.iteration.forexample;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        //po krijojme nje objekt i cili na sherben per me marr vlera nga shfrytezuesi
        Scanner reader = new Scanner(System.in);
        //pe shfaqim nje mesazh qe paraqitet ne console me tesktin
        System.out.println("Enter an integer: ");
        //deklarojme variablen x dhe marrim vleren nga shfrytezuesi dhe ruajm ne ate variabel
        int x = reader.nextInt();
        //deklarojme dhe inicializojme variablen prime me vlere 1
        int prime = 1;
        //po kontorllojme se a eshte vlera e x me e madhe se 3
        if (x > 3) {
            //nese po
            //deklarojme dhe inicilialojme variablen i (index) =2
            // kontrollojme se kjo variable i a eshte me e vogel se x DHE prime a eshte e barabtert me 1
            //rrite per nje variablen i
            for (int i = 2; i < x && prime == 1; i++) {
                //nese mbetja ndermjet pjestimit te x dhe i eshte 0 atehere ai numer nuk eeshte prime
                //nese x plotpjestohet me i atehere ai numer nuk eshte prime
                if (x % i == 0) prime = 0;
                switch (prime) { //switch kontrollo variablen prime
                    case 1: //nese mbetja 1 atehere ai numer eshte prime
                        System.out.println(x + " is prime number!");
                        break;
                    case 0://nese mbetja 0 atehere ai numer nuk eshte prime
                        System.out.println(x + " is not prime number");
                        break;
                }
            }
        }
    }
}
