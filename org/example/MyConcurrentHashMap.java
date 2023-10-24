package org.example;


import java.util.concurrent.TimeUnit;

//@BenchmarkMode(Mode.Throughput)
//@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class MyConcurrentHashMap<K,V> {
    Node<K, V>[] nodes = new Node[Constants.DEFAULT_HASHMAP_SIZE];
    private static volatile int size;

     private static final class Node<K, V> {

     }


    public void put(K key, V value){

    }

    public V get(K key){

        return (V) new Object();
    }

    public void remove(K key){

    }

    public void resize(){
    }




}
