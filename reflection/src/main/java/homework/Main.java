package homework;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by artem on 15.04.17.
 */
public class Main {
    public static void main(String[] args) {
        Person personFrom = new Person(1, "Marty McFly", true);
        Person personTo = new Person(2, "Sarah Connor", false);

        System.out.println(personFrom.toString());
        System.out.println(personTo.toString());

        System.out.println("***===***magic***===***");

        try {
            BeanUtils.assign(personTo, personFrom);
        } catch (IntrospectionException e) {
            System.out.println(e.toString());
        } catch (InvocationTargetException e) {
            System.out.println(e.toString());
        } catch (IllegalAccessException e) {
            System.out.println(e.toString());
        } catch (Exception e){
            System.out.println(e.toString());
        }

        System.out.println(personFrom.toString());
        System.out.println(personTo.toString());
    }
}
