package cacttus.education.com.iteration.whileexample;

import java.io.Reader;
import java.util.Locale;
import java.util.Scanner;

public class DetyreShtepie {

    private static Scanner reader = new Scanner(System.in);
    public static final String SENTINEL = "exit";

    public static void main(String[] args) {
        //mesazhi_exit_RS();
       // mesazhi_exit_EH();
        mesazhi_exit_RB();
    }

    private static void mesazhi_exit_RB() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Shkruaj cfare te duash, 'exit' per ta perfunduar programin");
        String word = scan.nextLine();

        while (!word.equalsIgnoreCase(SENTINEL)) {
            System.out.println(word);
            System.out.println("Shkruaj cfare te duash, 'exit' per ta perfunduar programin");
            word = scan.nextLine();
        }
    }

    private static void mesazhi_exit_EH() {
        System.out.println("Shkruaj nje tekst (\"exit\" per ta ndalur) : ");
        String teksti = reader.nextLine();
        while(!teksti.equalsIgnoreCase("exit")) { // !-negacion e ndryshon pyetjen Nuk
            System.out.println(teksti);
            System.out.println("Shkruaj nje tekst (\"exit\" per ta ndalur) : ");
            teksti = reader.nextLine();
            teksti.toLowerCase(); //kjo nuk e ndryshon vlerne e tektit
            //teksti = teksti.toLowerCase();  //-> e kjo po e ndryshjon
        }
    }


    private static void mesazhi_exit_RS() {
        System.out.println("Type a string ('exit' to quit): ");
        String stringu = reader.nextLine();
        int count = 0;
        while (!stringu.equalsIgnoreCase("exit")) {
            System.out.println(stringu);
            count++;
            System.out.println("Type a string ('exit' to quit): ");
            stringu = reader.nextLine();
        }
        System.out.printf("You have written %d words! %n", count);
        System.out.println("You typed 'exit', you quit the while loop!");
    }


    public static void formulaPordhimi() {

        System.out.println("Shkruaj numrin n = ");
        int n = reader.nextInt();

        int i = 1;
        int prod = 1;
        while (i < n) {
            if (i != 2)
                prod *= (i - 2);
            i++;
        }

        System.out.println("Prodhimi eshte: "+prod);
    }

    public static void formulaShuma() {
        System.out.println("Shkruaj vleren n: ");
        int n = reader.nextInt();
        if (n >= 1 && n <= 100) {
            int x = 0;
            int sum = 0;
            while (x <= n) {
                sum += (x - 2);
                x++;
            }
            System.out.println("Shuma = " + sum);
        } else {
            System.out.println("Numri n nuk eshte ne rangun e vlerave te leujuar nga 1 deri me 100!");
        }
    }


    public static void mbledhjaNumraveTekNga1DeriNeN() {
        System.out.println("Shkruaj numrin N: ");
        int n = reader.nextInt();

        int i = 1; // per cift duhet te jete ose 0 ose 2
        int sum = 0;


        while (i < n) {
            sum += i; // shumes shtoja vleren e numratorit
            i += 2; // qe me shku sekuenca 1, 3, 5 ,...99
        }

        System.out.println("Shuma e numrave tek nga 1 deri ne " + n + " eshte: " + sum);
        System.out.printf("Shuma e numrave tek nga 1 deri ne %d eshte: %d", n, sum);
    }



}
