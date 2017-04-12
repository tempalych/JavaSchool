package homework.concept;

import homework.exceptions.AccessDeniedEcxeption;
import homework.exceptions.AccountIsLockedException;
import homework.exceptions.NotEnoughMoneyException;

/**
 * Created by artem on 12.04.17.
 */
public interface TerminalServer {
    double getSaldo(String id) throws AccessDeniedEcxeption;
    boolean getAccess(String id, short pin) throws AccountIsLockedException, AccessDeniedEcxeption;
    void makeTransaction(String id, double sum) throws NotEnoughMoneyException, AccessDeniedEcxeption;
    void addAccount(String id, short pin) throws IllegalArgumentException;
}
