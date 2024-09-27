package LowLevelDesign.Cache.Storage;

import java.util.Map;

public class HashMapBasedStorage<Key, Value> implements Storage<Key, Value> {

    Map<Key, Value> mapStorage;

    HashMapBasedStorage(Map<Key, Value> mapStorage) {
        this.mapStorage = mapStorage;
    }

    @Override
    public void add(Key key, Value value) {
        //TODO to check for merge function that will work for all
//        mapStorage.merge(key,value,Sum:1);

    }

    @Override
    public Value get(Key key) {
        return mapStorage.get(key);
    }
}
