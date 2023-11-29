import java.util.NoSuchElementException;

public class Stack<T> {
    private MyLinkedList<T> stack = new MyLinkedList<>();

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public void push(T data) {
        stack.add(data);
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        T data = stack.get(stack.size() - 1);
        stack.delete(stack.size() - 1);

        return data;
    }

}
