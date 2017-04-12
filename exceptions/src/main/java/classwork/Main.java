package classwork;

/**
 * Created by artem on 11.04.17.
 */
public class Main {
    public static void main(String[] args) {
        anyMethod();
    }

    public static void anyMethod() {
        divisionByZero();
    }


    private static void divisionByZero() {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }

    }
}
