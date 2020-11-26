package cacttus.education.com.decisions;

public class SimpleIfElseDecision {
    public static void main(String[] args) {
        int x = 50;
        int y = 30;

        int max;

        if (x >= y) {
            max = x;
        } else {
            max = y;
        }

        System.out.printf("Vlera maksimales nga vlera %d dhe %d eshte %d", x, y, max);

    }
}
