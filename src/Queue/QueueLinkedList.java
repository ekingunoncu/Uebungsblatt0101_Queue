package Queue;

public class QueueLinkedList<T> implements Queue<T> {

    Node head = null, tail = null;

    public boolean isEmpty() {
        return head == null;
    }


    public void enqueue(T nd) {
        Node<T> p = new Node(nd);
        if (this.isEmpty()) {
            head = p;
            tail = p; }
        else {
            tail.next = p;
            tail = p;
        }
    }

    public T dequeue() {
        if (this.isEmpty()) {
            System.out.printf("Attempt to remove from an empty queue");
            System.exit(1);
        }
        T hold = (T) head.data;
        head = head.next;
        if (head == null) tail = null;
        return hold;
    }

}

class Node<T>{
    T data;
    Node next;
    public Node(T d) {
        data = d;
        next = null; }
}