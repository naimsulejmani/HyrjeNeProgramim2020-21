package cacttus.education.com.StringExample;

import java.util.Scanner;

public class DetyratMeString {
    public static void main(String[] args) {

        //A - zgjidhur prej EN GASHI-t
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruj tekstin");
        String teksti = reader.nextLine();
        System.out.printf("%nTeksti %s ka gjithsej %d karaktere", teksti, teksti.length());

        System.out.printf(
                "%nShkruaj nje indeks nga 0 deri me %d per te paraqitur tekstin e dhene nga indeksi deri ne fund:",
                teksti.length() - 1);


    }
}
