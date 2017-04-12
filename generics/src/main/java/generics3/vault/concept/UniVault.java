package generics3.vault.concept;

import java.util.Collection;
import java.util.Map;

/**
 * Created by artem on 06.04.17.
 */
public interface UniVault<K,V> {
    void put (K key, V value);
    V get (K key);
    void putAll(Map<K,? extends V> entries);
    Map<K,V> getAllByKeys(Collection<K> keys);
    Collection<V> getAllByPredicate(Predicate<? super V> predicate);
}
