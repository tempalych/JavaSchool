package generics3.vault.implement;

import generics3.vault.concept.Predicate;
import generics3.vault.concept.UniVault;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by artem on 06.04.17.
 */
public class HashMapVault<K,V> implements UniVault<K,V> {

    private Map<K,V> map = new HashMap<K,V>();

    @Override
    public void put(K key, V value) {
        map.put(key, value);
    }

    @Override
    public V get(K key) {
        return map.get(key);
    }

    @Override
    public void putAll(Map<K, ? extends V> entries) {
        map.putAll(entries);
    }

    @Override
    public Map<K, V> getAllByKeys(Collection<K> keys) {
        Map<K,V> innerMap = new HashMap<K, V>();
        for (K key: keys
             ) {
            innerMap.put(key, map.get(key));

        }
        return innerMap;
    }

    @Override
    public Collection<V> getAllByPredicate(Predicate<? super V> predicate) {
        Collection<V> collection = new ArrayList<V>();
        for (V v : map.values()
             ) {
            if (predicate.apply(v))
            {
                collection.add(v);
            }

        }
        return collection;
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
