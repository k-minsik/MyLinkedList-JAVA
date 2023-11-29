import java.util.NoSuchElementException;

public class Queue<T> {
    private MyLinkedList<T> queue = new MyLinkedList<>();

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public void push(T data) {
        queue.add(data);
    }

    public T popleft() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }

        T data = queue.get(0);
        queue.delete(0);

        return data;
    }

}
