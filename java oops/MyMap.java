import java.util.*;
interface MyMap<K,V>
{
public abstract void add(K key,V value);
public abstract void remove(K key);
public abstract int size();
public abstract boolean isEmpty();
public abstract void keys();
public abstract void print();
}
class Entry<K, V>
{
private K key;
private V value;
private Entry<K,V> next;
public Entry(K key, V value, Entry<K, V> next)
{
this.key = key;
this.value = value;
this.next = next;
}
public K getKey()
{
return key;
}
public void setKey(K key)
{
this.key = key;
}
public V getValue()
{
return value;
}
public void setValue(V value)
{
this.value = value;
}
public Entry getNext()
{
return next;
}
public void setNext(Entry<K, V> next)
{
this.next = next;
}
}