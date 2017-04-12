package homework.impl;

import homework.concept.AccessProvider;
import homework.concept.Account;
import homework.exceptions.AccountIsLockedException;
import homework.exceptions.NotEnoughMoneyException;

/**
 * Created by artem on 12.04.17.
 */
public class AccountImpl implements Account {
    private String id;
    private double saldo;
    private short pin;
    private AccessProvider accessProvider;

    public AccountImpl(String id, short pin) {
        this.id = id;
        this.pin = pin;
        this.saldo = 0;
        this.accessProvider = new AccessProviderImpl(10, 3);
    }

    @Override
    public void changeSaldo(double sum) throws NotEnoughMoneyException {
        if (sum < 0 && Math.abs(sum) > this.saldo) {
            throw new NotEnoughMoneyException("Не хватает денег");
        }
        this.saldo += sum;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public boolean getAccess(short pin) throws AccountIsLockedException {
        return this.accessProvider.getAccess(this.pin, pin);
    }

    @Override
    public boolean checkAccess() {
        return this.accessProvider.checkAccess();
    }
}
