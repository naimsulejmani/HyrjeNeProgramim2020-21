package cacttus.education.com.decisions;

//import java.io.IOException;
import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) { //throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Zgjidh operatorin (+,-,/,*,%): ");
        char op = scan.next().charAt(0);
        //char op = (char)System.in.read();
        System.out.println("Shkruaj numrin e pare:");
        int nr1 = scan.nextInt();
        System.out.println("Shkruaj numrin e dyte:");
        int nr2 = scan.nextInt();
        int rez=0;

        switch (op) {
            case '+':
                rez = nr1 + nr2;
                break;
            case '-':
                rez = nr1 - nr2;
                break;
            case '*':
                rez = nr1 * nr2;
                break;
            case '/':
                if (nr2 != 0)
                    rez = nr1 / nr2;
                else
                    System.out.println("Can't devide by 0");
                break;
            case '%':
                if (nr2 != 0)
                    rez = nr1 % nr2;
                else
                    System.out.println("Can't devide by 0");
                break;
            default:
                System.out.println("No such operator!");
                break;

        }
        if (nr2 == 0 && (op == '/' || op == '%')) System.out.println("");
        else System.out.println("Rezultati = " + rez);

    }
}
