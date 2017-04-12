package homework.impl;

import homework.concept.Account;
import homework.exceptions.AccessDeniedEcxeption;
import homework.exceptions.AccountIsLockedException;
import homework.exceptions.NotEnoughMoneyException;
import homework.concept.TerminalServer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by artem on 12.04.17.
 */
public class TerminalServerImpl implements TerminalServer {
    private Map<String, Account> accounts;

    public TerminalServerImpl() {
        this.accounts = new HashMap<>();
    }

    @Override
    public double getSaldo(String id) throws AccessDeniedEcxeption {
        Account acc;
        try {
            acc = getAccount(id);
        } catch (IllegalArgumentException e) {
            throw new AccessDeniedEcxeption("Ошибка поиска счета");
        }
        if (acc.checkAccess()) {
            return acc.getSaldo();
        } else {
            throw new AccessDeniedEcxeption("В доступе отказано");
        }
    }

    @Override
    public boolean getAccess(String id, short pin) throws AccountIsLockedException, AccessDeniedEcxeption {
        try {
            Account acc = getAccount(id);
            return acc.getAccess(pin);
        } catch (IllegalArgumentException e) {
            throw new AccessDeniedEcxeption("Ошибка поиска счета");
        }
    }

    @Override
    public void makeTransaction(String id, double sum) throws NotEnoughMoneyException, AccessDeniedEcxeption {
        Account acc;
        try {
            acc = getAccount(id);
        } catch (IllegalArgumentException e) {
            throw new AccessDeniedEcxeption("Ошибка поиска счета");
        }
        if (acc.checkAccess()) {
            acc.changeSaldo(sum);
        } else {
            throw new AccessDeniedEcxeption("В доступе отказано");
        }
    }

    @Override
    public void addAccount(String id, short pin) throws IllegalArgumentException {
        if (!accounts.containsKey(id)) {
            Account account = new AccountImpl(id, pin);
            accounts.put(id, account);
        } else {
            throw new IllegalArgumentException("Такой счет уже есть в системе");
        }
    }

    private Account getAccount(String id) throws IllegalArgumentException {
        if (accounts.containsKey(id)) {
            return accounts.get(id);
        } else {
            throw new IllegalArgumentException("Ошибка поиска счета "+id);
        }
    }
}
