package generics3.vault.production;

import generics3.vault.concept.UniVault;
import generics3.vault.developers.javaDevelopers.JavaDeveloper;
import generics3.vault.implement.HashMapVault;
import generics3.vault.implement.HighIQPredicate;

/**
 * Created by artem on 06.04.17.
 */
public class Main {
    public static void main(String[] args) {
        UniVault<String, JavaDeveloper> vault = new HashMapVault<>();
        vault.put("Yanis", new JavaDeveloper("Yanis", 120, false));
        vault.put("Maxim", new JavaDeveloper("Maxim", 125, true));
        vault.put("Irina", new JavaDeveloper("Irina", 140, false));
        vault.put("Vadim", new JavaDeveloper("Vadim", 130, true));

//        System.out.println(vault);
        System.out.println(vault.getAllByPredicate(new HighIQPredicate()));

    }
}
