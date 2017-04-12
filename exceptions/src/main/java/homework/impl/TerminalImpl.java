package homework.impl;

import homework.concept.Terminal;
import homework.concept.TerminalServer;
import homework.exceptions.AccessDeniedEcxeption;
import homework.exceptions.AccountIsLockedException;
import homework.exceptions.NotEnoughMoneyException;

/**
 * Created by artem on 12.04.17.
 */
public class TerminalImpl implements Terminal{
    TerminalServer terminalServer;

    public TerminalImpl() {
        this.terminalServer = new TerminalServerImpl();
    }

    @Override
    public double getSaldo(String id) throws AccessDeniedEcxeption {
        return terminalServer.getSaldo(id);
    }

    @Override
    public void makeTransaction(String id, double sum) throws AccessDeniedEcxeption, NotEnoughMoneyException {
        terminalServer.makeTransaction(id, sum);
    }

    @Override
    public void addAccount(String id, short pin) throws IllegalArgumentException {
        terminalServer.addAccount(id, pin);
    }

    @Override
    public void logIn(String id, short pin) throws AccountIsLockedException, AccessDeniedEcxeption {
        terminalServer.getAccess(id, pin);
    }
}
