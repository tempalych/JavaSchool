package classwork;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by artem on 16.05.17.
 */
public class Deposit extends Product {

    private static final long serialVersionUID = 101L;

    String code;
    String percent;

    public Deposit(String code) {
        super(code + new Date().getTime());
        this.code = code;
    }

    @Override
    public String toString() {
        return super.toString() + "____Deposit(" + this.hashCode() + "){" +
                "code='" + code + '\'' +
                "percent='" + percent + '\'' +
                '}';

    }
}
