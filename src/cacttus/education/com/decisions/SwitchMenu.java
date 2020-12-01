package cacttus.education.com.decisions;

import java.util.Scanner;

public class SwitchMenu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("1 - File");
        System.out.println("2 - Edit");
        System.out.println("3 - View");
        System.out.println("4 - Help");
        System.out.println("5 - Tools");
        System.out.println("Tjeter - per EXIT!");
        System.out.println("--------------------");
        System.out.println("Zgjidh menun: ");
        int menu = reader.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Keni zgjedhur menun FILE!"); break;
            case 2:
                System.out.println("Keni zgjedhur menun EDIT!"); break;
            case 3:
                System.out.println("Keni zgjedhur menun View"); break;
            case 4:
                System.out.println("Keni zgjedhur menun Help"); break;
            case 5:
                System.out.println("Keni zgjedhur menun Tools"); break;
            default:
                System.out.println("Aplikacioni u mbyll!");
                break;
        }
    }
}
