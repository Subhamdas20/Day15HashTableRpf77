package linkedlist;

public interface INode<T> {
    /*
    * Used interface
    * */
    T getKey();
    void setKey(T key);
    INode<T> getNext();
    void setNext(INode<T> next);
}
