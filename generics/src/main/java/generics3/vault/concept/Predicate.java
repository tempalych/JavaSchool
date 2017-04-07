package generics3.vault.concept;

/**
 * Created by artem on 06.04.17.
 */
public interface Predicate<E> {
    /**
     *
     * @param elm
     * @return
     */
    boolean apply(E elm);
}
