package homework.concept;

import homework.exceptions.AccountIsLockedException;
import homework.exceptions.NotEnoughMoneyException;

/**
 * Created by artem on 12.04.17.
 */
public interface Account {
    void changeSaldo(double sum) throws NotEnoughMoneyException;
    double getSaldo();
    boolean getAccess(short pin) throws AccountIsLockedException;
    boolean checkAccess();
}
