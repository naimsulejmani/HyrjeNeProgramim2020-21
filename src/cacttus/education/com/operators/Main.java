package cacttus.education.com.operators;

public class Main {
    public static void main(String[] args) {
        int b = 5;
        int c = 2;
        double rrenja = Math.sqrt(b * b - 4 * c);
//        double quadraticPositive = (- b + Math.sqrt(b*b - 4 * c ))/ 2;
//        double quadraticNegative = (- b - Math.sqrt( b * b - 4 * c)) / 2;
        double quadraticPositive = (-b + rrenja) / 2;
        double quadraticNegative = (-b - rrenja) / 2;

        System.out.println(quadraticNegative);
        System.out.println(quadraticPositive);
    }
}
