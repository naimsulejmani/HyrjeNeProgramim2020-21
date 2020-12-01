package cacttus.education.com.decisions;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Zgjidh menyn e sistemit: ");
        String menu = reader.nextLine();
        //byte, int, char dhe String

//        System.out.println((int)'A');
//        System.out.println((int)'a');

        switch (menu) { //se cili rang i vlerave eshte zgjedhur
            case "administrator":
            case "Administrator":
                System.out.println("Welcome to Administration page!");
//            case "administrator","Administrator": // per java verzione me te reja 15
//                System.out.println("Welcome to Administration page!");
                break;
            case "Dashboard":
                System.out.println("Welcome to Dashboard page!");
                break;
           //Art: // case "Administrator" -> System.out.println("Welcome to adminstration page");
            default:
                System.out.println("Page not found 404!");
                break;
        }

    }
}
