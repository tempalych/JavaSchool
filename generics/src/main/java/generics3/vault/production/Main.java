package generics3.vault.production;

import generics3.vault.concept.UniVault;
import generics3.vault.developers.javaDevelopers.JavaDeveloper;
import generics3.vault.implement.HashMapVault;
import generics3.vault.implement.HighIQPredicate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by artem on 06.04.17.
 */
public class Main {
    public static void main(String[] args) {
        UniVault<String, JavaDeveloper> vault = new HashMapVault<>();
        Map<String, JavaDeveloper> javaDeveloperMap = new HashMap<>();
        javaDeveloperMap.put("Yanis", new JavaDeveloper("Yanis", 120, false));
        javaDeveloperMap.put("Maxim", new JavaDeveloper("Maxim", 125, true));
        javaDeveloperMap.put("Irina", new JavaDeveloper("Irina", 140, false));
        javaDeveloperMap.put("Vadim", new JavaDeveloper("Vadim", 130, true));

        vault.putAll(javaDeveloperMap);
//        System.out.println(vault);
        System.out.println(vault.getAllByPredicate(new HighIQPredicate()));

    }
}
