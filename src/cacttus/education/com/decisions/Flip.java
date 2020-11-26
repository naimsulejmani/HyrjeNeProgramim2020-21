package cacttus.education.com.decisions;

import java.util.Scanner;

public class Flip {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Zgjidh: Heads or Tails => ");
        String zgjidhja = reader.nextLine();

        if(Math.random()<0.5) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }

    }
}
