package cacttus.education.com.methods.recursion;

public class Main {

    public static void main(String[] args) {
        //System.out.println(convertIntegerToBinary(1024));
        System.out.println(convertToBinary(37));
        System.out.println(fact(5));
    }

    public static String convertIntegerToBinary(int n) {
        String binary = "";
        while (n != 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }
        return binary;
    }

    //convert(10)
    public static String convertToBinary(int N) {
        if (N == 1)
            return "1";
        return convertToBinary(N / 2) + (N % 2);
    }


    public static int fact(int n) {
        //kushti baze i cili nuk e therret vetveten
        if (n <= 1) return 1;
        //shko deduction
        return n * fact(n - 1);
    }


}
