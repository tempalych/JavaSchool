package classwork;

/**
 * Created by artem on 11.04.17.
 */
public class Test4 {
    public static void main(String[] args) {
        try {
            throw new Exception("1");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
