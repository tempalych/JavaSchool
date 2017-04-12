package homework.impl;

import homework.concept.AccessProvider;
import homework.exceptions.AccountIsLockedException;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by artem on 12.04.17.
 */
public class AccessProviderImpl implements AccessProvider {

    private int pinAttempts;
    private int maxPinAttempts;
    private int lockTimeout;
    private boolean locked;
    private Date lockDate;
    private boolean access;

    @Override
    public boolean checkAccess() {
        return access;
    }

    @Override
    public boolean getAccess(short accountPin, short userPin) throws AccountIsLockedException {
        if (this.locked) {
            Date now = new Date();
            Date unlockDate = getDatePlusXSeconds(this.lockDate, lockTimeout);
            if (unlockDate.compareTo(now) > 0) {
                throw new AccountIsLockedException("Счет заблокирован. Разблокировка в " + unlockDate);
            } else {
                this.unlock();
            }
        }
        if (accountPin == userPin) {
            this.pinAttempts = 0;
            this.access = true;
            return this.access;
        } else {
            this.pinAttempts += 1;
            if (this.pinAttempts >= maxPinAttempts) {
                this.lock();
            }
            this.access = false;
            return this.access;
        }
    }

    public AccessProviderImpl(int lockTimeout, int maxPinAttempts) {
        this.lockTimeout = lockTimeout;
        this.maxPinAttempts = maxPinAttempts;
        this.access = false;
        this.pinAttempts = 0;
        this.locked = false;
        this.lockDate = null;
        this.access = false;
    }

    private Date getDatePlusXSeconds(Date date, int x) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        long t = calendar.getTimeInMillis();
        Date datePlusXSeconds = new Date(t + x * 1000);
        return datePlusXSeconds;
    }

    public void lock() {
        this.locked = true;
        this.lockDate = new Date();
    }

    public void unlock() {
        this.locked = false;
        this.lockDate = null;
    }


}
