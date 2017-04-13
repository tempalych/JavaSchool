package homework;

import homework.concept.Terminal;
import homework.exceptions.AccessDeniedEcxeption;
import homework.exceptions.AccountIsLockedException;
import homework.exceptions.NotEnoughMoneyException;
import homework.impl.TerminalImpl;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by artem on 12.04.17.
 */
public class Main {
    public static void main(String[] args) {
        Terminal terminal = new TerminalImpl();
        String currentAccountId = "-1";

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите тип операции (1 - Новый счет; 2 - Проверить остаток; 3 - Операция по счету; 0 - Выход): ");
            String action = scanner.next();
            if (action.equals("0"))
            {
                break;
            }
            if (action.equals("1")) {

                System.out.print("Новый счет. Введите номер счета: ");
                String accId = scanner.next();
                System.out.print("Новый счет. Введите pin: ");
                String accPinStr = scanner.next();
                short accPin;
                try {
                    accPin = Short.parseShort(accPinStr);
                } catch (NumberFormatException e) {
                    System.out.println("Новый счет. Некорректный pin");
                    continue;
                }
                try {
                    terminal.addAccount(accId, accPin);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.toString());
                }
            }
            if (action.equals("2") || action.equals("3")) {
                do {
                    System.out.print("Введите номер счета: ");
                    currentAccountId = scanner.next();
                    System.out.print("Введите pin: ");
                    short pin = Short.parseShort(scanner.next());
                    try {
                        terminal.logIn(currentAccountId, pin);
                    } catch (AccountIsLockedException e) {
                        System.out.println(e.toString());
                        currentAccountId = "-1";
                        break;
                    } catch (AccessDeniedEcxeption accessDeniedEcxeption) {
                        System.out.println(accessDeniedEcxeption.toString());
                        currentAccountId = "-1";
                        break;
                    }
                } while (currentAccountId.equals("-1"));
                if (!currentAccountId.equals("-1") && action.equals("2"))
                {
                    try {
                        System.out.println("Остаток по счету " + currentAccountId + ": " + terminal.getSaldo(currentAccountId));
                    } catch (AccessDeniedEcxeption accessDeniedEcxeption) {
                        System.out.println(accessDeniedEcxeption.toString());
                    }
                }
                if (!currentAccountId.equals("-1") && action.equals("3")){
                    System.out.print("Операция по счету. Введите сумму: ");
                    double sum = Double.parseDouble(scanner.next());
                    try {
                        terminal.makeTransaction(currentAccountId, sum);
                        System.out.println("Операция по счету " + currentAccountId + " исполнена.");
                    } catch (AccessDeniedEcxeption accessDeniedEcxeption) {
                        System.out.println(accessDeniedEcxeption.toString());
                        //break;
                    } catch (NotEnoughMoneyException e) {
                        System.out.println(e.toString());
                        //break;
                    }
                }
            }
        } while (true);

    }
}
