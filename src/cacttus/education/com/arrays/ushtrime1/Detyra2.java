package cacttus.education.com.arrays.ushtrime1;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("sa shok po don mi permen ?");
        int n = reader.nextInt();
        reader.nextLine(); // kur lexojme string pasi se kemi lexu Int duhetme zbraze buffer-in e scannerit
        String[] shoket = new String[n];

        for (int count = 0; count < shoket.length; count++) {
            System.out.println("qysh e ka emrin shoku " + (count+1));
            shoket[count] = reader.nextLine();
        }

        for (int count = 0; count < shoket.length; count++) {
            System.out.println(shoket[count]);
        }
    }
}
