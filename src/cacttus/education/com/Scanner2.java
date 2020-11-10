package cacttus.education.com;


import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter name, age and salary: ");
        String name = reader.nextLine();
        byte age = reader.nextByte();
        float salary = reader.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);


    }
}
