package cacttus.education.com.arrays.ushtrime1;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        //krijimi i vargut me string
        String[] emrat = new String[10];

        emrat[0] = "Filani";
        emrat[1] = "Fistekja";
        emrat[2] = "Kusha";
        emrat[3] = "Kusherina";
        emrat[4] = "Syla";
        emrat[5] = "Sylani";
        emrat[6] = "Ana";
        emrat[7] = "Zana";
        emrat[8] = "Test";
        emrat[9] = "Kosovar";
//        emrat[10]="    "; //

        //mbushja e vargut me vlera dinamike duker perdore Scaner dhe loop
        //scaner na sherben me i marr te dhenat nga shfrytezuesi
        //loop me bredhe per secilin indext te vargut dhe me i dhane vlere atij elementi
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < emrat.length; i++) {
            System.out.printf("Shkruaj emrin e shokut %d: ", i + 1);
            emrat[i] = reader.nextLine();
        }

        System.out.println("Vargu me shoket me te mire!");
        System.out.println("-----------------------------------");

        for (int i = 0; i < emrat.length; i++) {
            System.out.println(emrat[i]);
        }

        System.out.println("-----------------------------------");
        //emrat= new String[20];


        //B) array initializes
        String[] emrat1 = {"Bota", "Test", "AAA", "SPO DI SPO DI"};


        for (int i = 0; i < emrat1.length; i++) {
            System.out.println(emrat1[i]);
        }


    }
}

