package classwork;

import java.lang.reflect.Field;

/**
 * Created by artem on 13.04.17.
 */
public class Test02 {

    static {
        Class<?>[] declaredClasses = Integer.class.getDeclaredClasses();
        Class<?> declaredClass = declaredClasses[0];
        Field cache = null;
        try {
            cache = declaredClass.getField("cache");
            ((Integer[]) cache.get(null))[128 + 20] = 30;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Integer b1 = 20;
        Integer b2 = 30;

        if (b1 + b2 == 60) {
            System.out.println("WOW!");
        }
    }
}
