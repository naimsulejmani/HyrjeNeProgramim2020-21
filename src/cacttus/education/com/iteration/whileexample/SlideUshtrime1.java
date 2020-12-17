package cacttus.education.com.iteration.whileexample;

public class SlideUshtrime1 {
    public static void main(String[] args) {
        infiniteLoop1();
    }

    public static void infiniteLoop1() {
        double num = 2.0;

        while (num != 0.0) {
            System.out.println(num);
            num = num - 0.1;
        }
        System.out.println("Kodi perfundoj");
    }

    public static void infiniteLoopFix() {
        double num = 2.0;

        while (num != 0.0 ) {
            System.out.println(num);
            num = num - 0.1;
        }
        System.out.println("Kodi perfundoj");
    }
}
