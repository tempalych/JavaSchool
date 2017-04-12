package genericsHomework.homework2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by artem on 10.04.17.
 */
public class CollectionUtils {
    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<T>();
    }
/*
    public static int indexOf(List source, Object o) {
    }

    public static List limit(List source, int size) {
    }

    public static void add(List source, Object o) {
    }

    public static void removeAll(List removeFrom, List c2) {
    }

    public static boolean containsAll(List c1, List c2) {
    }

    public static boolean containsAny(List c1, List c2) {
    }

    public static List range(List list, Object min, Object max) {
    }

    public static List range(List list, Object min, Object max, Comparator comparator) {
    }
*/
}
