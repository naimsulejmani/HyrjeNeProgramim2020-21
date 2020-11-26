package cacttus.education.com.decisions;

public class SimpleIfDescision {
    public static void main(String[] args) {
        int number = 20;

        if (number > 10) {
            System.out.println("Number is greater than 10!");
        }

        if(number>0) {
            System.out.println("Number is positive!");
        }
        else {
            System.out.println("Number is not positive!");
        }

        System.out.println("This statement is always executed!");


        int x = 20;
        int y = x;

        if (x < 0) {
            y = -x; // vetem per disa raste mu ekzekutu nje pjese e nje kodit
            y++;
            y--;
        }


        if (x < 0)
            y = -x; // vetem per disa raste mu ekzekutu nje pjese e nje kodit
        y++;
        y--;

/*
Rregull ne Java:
 Nese kemi vetem nje statement (deklarate) me ekzektutu nuk ka nevoje per kllapa.
 Nese kemi me shume se nje deklarate me ekzekutu ka nevoje per kllapa


 */

        System.out.printf("Vlera absolute e |%d| = %d", x, y);




    }
}
