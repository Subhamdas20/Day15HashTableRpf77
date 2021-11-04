package com.bz.hashtable;

import linkedlist.MyLinkedList;

public class MyHashMap<K , V> {
    MyLinkedList<K> myLinkedList;
    public MyHashMap(){
        this.myLinkedList = new MyLinkedList<>();

    }
    public V get(K key){
       MyMapNode<K , V> myMapNode =  (MyMapNode <K , V>) this.myLinkedList.findNode(key) ;

        return (myMapNode == null) ? null : myMapNode.getValue();
    }
    public void add(K key, V value) {
        MyMapNode<K ,V> myMapNode =(MyMapNode<K, V>) this.myLinkedList.findNode(key);
        if (myMapNode == null){
            myMapNode = new MyMapNode<>(key , value);
            this.myLinkedList.append(myMapNode);
        }
        else
            myMapNode.setValue(value);
        System.out.println(myMapNode.getNext());
    }
    public void show(){
        myLinkedList.printNodes();
    }

    @Override
    public String toString() {
        return "MyHashMapNodes{" + myLinkedList +
                '}';
    }
}
