package LowLevelDesign.Cache.EvictionPolicy;

public interface EvictionPolicy<Key> {

    public void accessKey(Key key);

    public Key evictKey();
}
