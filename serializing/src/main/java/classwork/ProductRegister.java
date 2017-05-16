package classwork;

import java.io.Serializable;

/**
 * Created by artem on 16.05.17.
 */
public class ProductRegister implements Serializable {
    Long value;
    Product product;

    public ProductRegister(Long value, Product product) {
        this.value = value;
        this.product = product;
    }
}
