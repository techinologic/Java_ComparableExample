/**
 * Created by Paolo T. Inocencion on 09/25/17.
 */
public class OrderedPair<K,V> implements Pair<K,V> {

    private final K key;
    private final V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key;}
    public V getValue() {return value;}


}
