package classwork;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by artem on 13.04.17.
 */
public class Test03 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<Integer> integerClass = Integer.class;
        Integer i = 30;
        Class iClass = i.getClass();
        System.out.println(iClass.getName());
//        for (Method method: iClass.getMethods()) {
//            System.out.println(method.toString());
//        }

        Method[] aMethods = A.class.getMethods();
        A a = new A();
        aMethods[0].invoke(a);

        System.out.println(Object.class.getSuperclass());

        // создание экземпляра класса
        try {
            A a1 = A.class.newInstance();
            a1.method1();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        Annotation[] annotations = A.class.getAnnotations();

        A a2 = A.createAWithoutParameters();
        int xx = A.USUAL_A;
    }
}


class A {
    @Deprecated
    public void method1() {
        System.out.println("Hello from A!!");
    }

    public static final int USUAL_A = 1;

    public static A createAWithoutParameters() {
        return new A();
    }

    @int1(min = 1, max = 4)
    public Integer val;

    @defVal
    public Integer val2;
}


@interface int1 {
    int min();

    int max();
}

@Retention(RetentionPolicy.CLASS)
@interface defVal {
    int value() default 6;
}
