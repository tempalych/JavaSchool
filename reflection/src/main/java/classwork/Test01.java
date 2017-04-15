package classwork;

/**
 * Created by artem on 13.04.17.
 */
public class Test01 {
    public static void main(String[] args) {
        Integer b1 = 40;
        Integer b2 = 40;
        Integer b3 = 200;
        Integer b4 = 200;
        int a1 = 200;
        int a2 = 200;

        System.out.println(b1 == b2); // true
        System.out.println(b3 == b4); // false
        System.out.println(a1 == a2); // true
        System.out.println(b3.compareTo(b4)); // false

    }
}
