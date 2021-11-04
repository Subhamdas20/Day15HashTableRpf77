package linkedlist;

public class MyLinkedList<T> {
    /*
    * LinkedList implementation class
     */
    public INode tail;
    public INode head;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }
/*
* add method is used to add nodes to linked list
* */
    public void add(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
/*
* append is used to append node
*/
    public void append(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
/*
* used to search and insert new node
 */
    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
/*
* pop is used to remove head node
*/
    public void pop() {
        this.head = head.getNext();
    }

    public <T> INode popLast() {
        INode tempNode = this.head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }
/*
* findNode is used to search node
*/
    public INode findNode(MyNode myNode) {
        INode tempNode = this.head;
        INode temp = null;
        while (!tempNode.getNext().equals(tail)) {

            if (tempNode.getNext() == myNode) {
                System.out.println("Found node with key : " + myNode.getKey());
                temp = myNode;
            }
            return temp;
        }
        return temp;
    }
    /*
    * Delete is used to delete specified node
    */
    public INode delete(INode node){
        INode tempNode = this.head;
        INode temp = null;
        while (!tempNode.getNext().equals(node)) {
            tempNode = tempNode.getNext();
            temp=tempNode;
        }
        temp.setNext(node.getNext());
        return temp.getNext();
    }
    /*
    * used to show the size of linkedlist
    */
    public void size(INode node){
        INode tempNode = this.head;
        int size=1;
        while (!tempNode.getNext().equals(node)) {
            tempNode = tempNode.getNext();
            size=size+1;
        }
        System.out.println(size+1);

    }
    /*
    * searchAndInsert is used to insert node after specified node
    * */

    public INode searchAndInsert(MyNode myNode, INode keyToInsert) {
        INode tempNode = this.head;
        INode temp = null;
        INode tempInsert = keyToInsert;
        while (!tempNode.getNext().equals(tail)) {
            if (tempNode.getNext() == myNode) {
                System.out.println("Found node with key : " + myNode.getKey());
                temp = tempNode;
                break;
            }
        }
        keyToInsert.setNext(temp.getNext().getNext());
        temp.getNext().setNext(tempInsert);
        tempInsert.setKey((keyToInsert.getKey()));
        temp.getNext().setNext(keyToInsert);
        return tempInsert;

    }
/*
* ussd to print node
* */
    public void printNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes : ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

}
