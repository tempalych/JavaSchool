package homework.concept;

import homework.exceptions.AccountIsLockedException;

/**
 * Created by artem on 12.04.17.
 */
public interface AccessProvider {
    boolean getAccess(short accountPin, short userPin) throws AccountIsLockedException;
    boolean checkAccess();
}
