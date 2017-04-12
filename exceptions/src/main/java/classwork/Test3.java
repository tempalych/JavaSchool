package classwork;

/**
 * Created by artem on 11.04.17.
 */
public class Test3 {
    public static void main(String[] args) {
        try {
            anyMethod();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    private static void anyMethod() throws MyException {
        if (true){
            throw new MyException("Это наш личный эксепшн");
        }
    }
}
