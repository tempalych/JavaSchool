package homework;

import com.sun.media.jfxmedia.logging.Logger;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by artem on 15.04.17.
 */
public class BeanUtils {
    /**
     *      * Scans object "from" for all getters. If object "to"
     *      * contains correspondent setter, it will invoke it
     *      * to set property value for "to" which equals to the property
     *      * of "from".
     *      * <p/>
     *      * The type in setter should be compatible to the value returned
     *      * by getter (if not, no invocation performed).
     *      * Compatible means that parameter type in setter should
     *      * be the same or be superclass of the return type of the getter.
     *      * <p/>
     *      * The method takes care only about public methods.
     *      *
     *      * @param to   Object which properties will be set.
     *      * @param from Object which properties will be used to get values.
     *      
     */
    public static void assign(Object to, Object from) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        PropertyDescriptor[] propertyDescriptorsFrom = Introspector.getBeanInfo(from.getClass()).getPropertyDescriptors();
        PropertyDescriptor[] propertyDescriptorsTo = Introspector.getBeanInfo(to.getClass()).getPropertyDescriptors();

        for (PropertyDescriptor propertyFrom : propertyDescriptorsFrom) {
            for (PropertyDescriptor propertyTo : propertyDescriptorsTo) {
                if (propertyFrom.getReadMethod() != null && propertyTo.getWriteMethod() != null) {
                    if (propertyFrom.getName().equals(propertyTo.getName())
                            && (propertyFrom.getReadMethod().getReturnType() == propertyTo.getPropertyType()
                            || propertyFrom.getReadMethod().getReturnType() == propertyTo.getPropertyType().getSuperclass())) {
                        propertyTo.getWriteMethod().invoke(to, propertyFrom.getReadMethod().invoke(from));
                    }
                }
            }
        }
    }
}
