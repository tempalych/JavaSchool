package genericsHomework.homework1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by artem on 10.04.17.
 */
public class CountMapImpl<E> implements CountMap<E> {
    Map<E, Integer> map;

    public CountMapImpl() {
        this.map = new HashMap<E, Integer>();
    }

    @Override
    public void add(E o) {
        if (map.containsKey(o)) {
            map.put(o, map.get(o) + 1);
        } else {
            map.put(o, 1);
        }
    }

    @Override
    public int getCount(E o) {
        return map.containsKey(o) ? map.get(o) : 0;
    }

    @Override
    public int remove(E o) {
        return map.remove(o);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<E> source) {
        for (Map.Entry<E, Integer> entry : source.toMap().entrySet()) {
            if (map.containsKey(entry.getKey())) {
                Integer newValue;
                newValue = map.get(entry.getKey()) + entry.getValue();
                map.put(entry.getKey(), newValue);
            } else {
                map.put(entry.getKey(), 1);
            }
        }
    }

    @Override
    public Map<E, Integer> toMap() {
        Map<E, Integer> newMap = new HashMap<>();
        for (Map.Entry<E, Integer> entry : map.entrySet()) {
            newMap.put(entry.getKey(), entry.getValue());
        }
        return newMap;
    }

    @Override
    public void toMap(Map destination) {
        for (Map.Entry<E, Integer> entry : map.entrySet()) {
            destination.put(entry.getKey(), entry.getValue());
        }
    }
}
