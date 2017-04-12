package homework.concept;

import homework.exceptions.AccessDeniedEcxeption;
import homework.exceptions.AccountIsLockedException;
import homework.exceptions.NotEnoughMoneyException;

/**
 * Created by artem on 12.04.17.
 */
public interface Terminal {
    double getSaldo(String id) throws AccessDeniedEcxeption;

    void makeTransaction(String id, double sum) throws AccessDeniedEcxeption, NotEnoughMoneyException;

    void addAccount(String id, short pin) throws IllegalArgumentException;

    void logIn(String id, short pin) throws AccountIsLockedException, AccessDeniedEcxeption;

}
