package Queue;

import java.util.Arrays;

public class ArrayQueue <T> implements Queue<T>{

    int size = 5, head = 0,tail = 0;

    @SuppressWarnings("unchecked")
    T[] QA = (T[])(new Object[size]);

    public boolean isEmpty() {
        return head == tail;
    }

    public boolean arrayFull(){ return tail == size; }

    public void enqueue(T data) {
        tail += 1;
        if (arrayFull()) {
            System.out.println("Queue is full, size +1 increased ");
            size += 1;
            increaseQueueSize(size);
            QA[tail] = data;
        }else{
            QA[tail] = data;
        }


    }

    public T dequeue() {
        if (this.isEmpty()) {
            System.out.printf("\nAttempt to remove from an empty queue\n");
            System.exit(2);
        }
        head = (head + 1);
        return QA[head];
    }

    public void increaseQueueSize(int size){
        this.size += size;
        QA = Arrays.copyOf(QA,this.size);
    }
}
