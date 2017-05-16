package classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by artem on 27.04.17.
 */
public class Main {
    public static void main(String[] args) {
        Apple a1 = new Apple("red", 155);
        Apple a2 = new Apple("green", 150);
        Apple a3 = new Apple("green", 151);
        List<Apple> apples = new ArrayList<>();
        apples.addAll(Arrays.asList(a1, a2, a3));

        System.out.println(filterApple(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        }));

        System.out.println(filterApple(apples, (paramApple) -> "green".equals(paramApple.getColor())));

    }

    public static List<Apple> filterApple(List<Apple> apples, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for (Apple a: apples) {
            if (p.test(a)){
                result.add(a);
            }
        }
        return result;
    }

}
