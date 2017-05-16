package classwork;

import java.util.ArrayList;
import java.util.List;

import java.io.IOException;

/**
 * Created by artem on 16.05.17.
 */
public class MyFirstUnforgottenSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Если родитель implements Serializable - все потомки так же Serializable по умолчанию
        // Если потомок Serializable - у родителя долже быть конструктор без параметров
        // Несериализуемые поля объявлять как transient

        Deposit deposit = new Deposit("vklad99");
        List<ProductRegister> productRegisters = new ArrayList<>();
        productRegisters.add(new ProductRegister(1L, deposit));
        productRegisters.add(new ProductRegister(2L, deposit));
        productRegisters.add(new ProductRegister(71L, deposit));
        productRegisters.add(new ProductRegister(10L, deposit));
        deposit.setProductRegisters(productRegisters);
        deposit.setMainRegister(productRegisters.get(0));


        DepositSerializer.serialize("MyFile.txt", deposit);
        System.out.println(deposit.toString());

        Deposit deposit1 = DepositSerializer.deserialize("MyFile.txt");
        System.out.println(deposit1.toString());
    }
}
