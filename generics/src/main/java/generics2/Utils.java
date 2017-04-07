package generics2;

import com.sbt.generics.Box;

import java.util.List;

/**
 * Created by artem on 06.04.17.
 */
public class Utils {
    public static void printListCount(List<? extends Integer> integerList){  // <?> - wildcard
        System.out.println(integerList.size());
    }
}
