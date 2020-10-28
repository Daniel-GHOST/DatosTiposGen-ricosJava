package ejercicio_generics_box;
/**
 * @author Daniel
 */
public class OrderedPair <K, V> implements Pair <K, V>{
    private K key;
    private V value;
    
    public OrderedPair (K key, V value){
        this.key = key;
        this.value = value;
    }
    
    public K getKey (){ return key; }
    @Override
    public V getValue(){ return value;}
}
