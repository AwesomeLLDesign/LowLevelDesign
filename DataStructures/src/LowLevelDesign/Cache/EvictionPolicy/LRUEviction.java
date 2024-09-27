package LowLevelDesign.Cache.EvictionPolicy;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUEviction<Key> implements EvictionPolicy<Key> {

//    Map<Key,Value> lruCache = new LinkedHashMap<>();

    @Override
    public void accessKey(Key key) {

    }

    @Override
    public Key evictKey() {
        return null;
    }
}
