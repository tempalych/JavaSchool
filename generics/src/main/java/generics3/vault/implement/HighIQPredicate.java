package generics3.vault.implement;

import generics3.vault.concept.Predicate;
import generics3.vault.developers.Developer;

/**
 * Created by artem on 06.04.17.
 */
public class HighIQPredicate implements Predicate<Developer> {

    @Override
    public boolean apply(Developer elm) {
        if (elm.getIq().compareTo(125) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
