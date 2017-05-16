package classwork;


import java.beans.Transient;
import java.util.List;

import java.io.Serializable;

/**
 * Created by artem on 16.05.17.
 */
public class Product implements Serializable{
    private String name;
    private List<ProductRegister> productRegisters;
    private ProductRegister mainRegister;

    public ProductRegister getMainRegister() {
        return mainRegister;
    }

    public void setMainRegister(ProductRegister mainRegister) {
        this.mainRegister = mainRegister;
    }

    public void setProductRegisters(List<ProductRegister> productRegisters) {
        this.productRegisters = productRegisters;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
