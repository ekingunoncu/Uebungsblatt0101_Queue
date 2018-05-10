package Queue;

public interface Queue<T> {
    T dequeue();
    void enqueue(T data);

}
