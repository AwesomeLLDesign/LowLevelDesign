package LowLevelDesign.Cache.Storage;

public interface Storage<Key, Value> {

    public void add(Key key, Value value);

    public Value get(Key key);
}
