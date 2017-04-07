package generics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by artem on 06.04.17.
 */
public class Main
{
    public static void main(String[] args) {
        Utils.printListCount(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)));
    }
}
