package cacttus.education.com.methods;

public class MyClass {
    //modifier -> default
    static void myMethod() {
        System.out.println("metoda myMethod mund te thirret direkt pa krijuar objekt");
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!!!");
        } else {
            System.out.println("Access granted - You are old enough!!!");
        }
    }

    //gjinBardhi
    static boolean hasAccess(int age) {
        if (age < 18)
            return false;
        else
            return true;
    }

    //viktori
    static boolean hasAccessVA(int age) {
        if (age < 18)
            return false;
        return true;
    }

    //profa
//age20, age15
    static boolean hasAccessProfa(int age) {
        return age >= 18; // boolean expression pa nevoje per if..else
    }


    //detyra eshte kete metode checkage me kthy boolean true ose false varesisth a plotesohet kushti
    // nese plotesohet kushti kthe true perndrsyhe kthe false


    public static void main(String[] args) {
        checkAge(20);
        System.out.println(hasAccess(10));
        System.out.println(hasAccessVA(10));
        System.out.println(hasAccessProfa(10));

    }
}
