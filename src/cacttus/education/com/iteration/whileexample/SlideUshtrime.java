package cacttus.education.com.iteration.whileexample;

import java.util.Scanner;

public class SlideUshtrime {
    //static final int SENTINEL = 0; // variabla e sentinelit me u ruajt ne variable
    static final int NUMRI_PER_ME_DAL_NGA_LOOP_SENTINEL = 0;

    public static void main(String[] args) {
        //sentinelLoop();
        //taskLoop1_VA();
        taskLoop_SlideSolution();
    }

    //unaza me rojtar
    public static void sentinelLoop() {
        Scanner reader = new Scanner(System.in);

        int sum, num, count;
//        sum = 0;
//        num = 0;
        sum = count = 0; //nga ana ae djatht ne te majte
        double avg = 0.0;

        //0 po eshte vlera qe rojtari e ruan per mo sme lan me perserite
        System.out.println("Enter an integer (0 to quit):");
        num = reader.nextInt();

        while (num != NUMRI_PER_ME_DAL_NGA_LOOP_SENTINEL) {
            count++;
            sum += num; // += shtoja
            System.out.println("Enter an integer (0 to quit):");
            num = reader.nextInt(); // ketu lexohet vlera e variables kontrolluese brenda unazes (loop)
        }
        avg = sum / (double) count;
        System.out.println("The average is: " + avg);
    }

    public static void hasanWhileLoop() {
        int count = 0; // deklaru nje variable count e tipit int dhe u inicializu me vleren 0
        int sum = 0;   //
        while (count < 10) // perderisa count eshte me i vogel se 10
        {
            count++; // rrite count per 1
            sum += count; //shtoja shumes vleren e count-it

        }
        double avg = (double) sum / count; // llogarite mesatare shuma  pjestu count
        System.out.println("average = " + avg);//shtyp rreshtin me tekstin average = vleren e avg-se
    }

    public static void taskLoop1_VA() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shtypni numrin e pare: ");
        int num1 = scan.nextInt();
        int num1_copy = num1;
        System.out.println("Shtypni numrin e dyte: ");
        int num2 = scan.nextInt();

        int counter = 0;

        while (num1 >= num2) {
            counter++;
            num1 -= num2;
            System.out.printf("num1= %d, counter = %d %n", num1, counter);
        }
        System.out.printf("%d / %d = %d dhe mbetja eshte %d", num1_copy, num2, counter, num1);
        // VA
        // System.out.printf("%d / %d = %d dhe mbetja eshte %d", num1 + num2 * counter, num2, counter, num1);
    }


    public static void taskLoop_SlideSolution() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shtypni numrin e pare: ");
        int num1 = scan.nextInt();
        int num1_copy = num1;
        System.out.println("Shtypni numrin e dyte: ");
        int num2 = scan.nextInt();

        int res = 0;

        while ((res + 1) * num2 <= num1)
            res++;

        System.out.printf("%d eshte %d  here tek numri %d", num2, res, num1);

    }
}
