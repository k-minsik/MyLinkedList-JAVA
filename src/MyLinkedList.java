import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList <T> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public int size() {
        return size;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T get(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < idx; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void delete(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (idx == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            Node<T> current = head;
            for (int i = 0; i < idx - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            if (current.next == null) {
                tail = current;
            }
        }
        size--;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

}
