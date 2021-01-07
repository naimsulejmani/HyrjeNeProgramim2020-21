package cacttus.education.com.arrays;

public class Main {
    public static void main(String[] args) {

        //deklarimi i vargjeve
        int[] numbers;
        double[] doubles;
        //krijimi dhe inicializimi i vargjeve
        //inicializimi i vargejve per numerike eshte default 0
        numbers = new int[500_000_000];
        //krijimi dhe inicializimi u be ketu per nga numri i elementeve te vargut numbers
        doubles = new double[numbers.length];


        //e shtyp references ne memorie (hexadecimal)
        System.out.println(numbers);
        System.out.println(doubles);



    }
}
