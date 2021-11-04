package linkedlist;

public class MyNode <T>implements INode<T>{
    /*
    * Implementation of interface
    * */
    public  INode<T> next;
    public T key;

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public void setKey(T key) {
        this.key=key;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }
    public MyNode(T key) {
        this.key = key;
        this.next = null;
    }
}

