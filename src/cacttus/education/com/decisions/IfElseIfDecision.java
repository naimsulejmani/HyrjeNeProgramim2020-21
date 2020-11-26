package cacttus.education.com.decisions;

public class IfElseIfDecision {
    public static void main(String[] args) {
        int number = 20;
        if (number > 0)
            System.out.println("Numri eshte pozitiv");
        else if (number < 0)
            System.out.println("Numri eshte negativ");
        else
            System.out.println("Numri eshte 0");
    }
}
