package cacttus.education.com;


import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        //fillimisht krijojme objektin prej klases Scanner qe e ofron java
        Scanner reader = new Scanner(System.in);
        String email; // prej klasave kemi objkete

        System.out.println("Ju lutem shkruani emailin: "); // ne console/terminal
        email = reader.nextLine(); // = assignment operatori

        System.out.println("U regjistrua me sukses emaila: " + email);


    }
}
