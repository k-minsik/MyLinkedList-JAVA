import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println("myStack.isEmpty() = " + myStack.isEmpty());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.isEmpty() = " + myStack.isEmpty());

        Queue<Integer> myQueue = new Queue<Integer>();
        myQueue.push(5);
        myQueue.push(6);
        myQueue.push(7);
        myQueue.push(8);

        System.out.println("myQueue.isEmpty() = " + myQueue.isEmpty());
        System.out.println("myQueue.popleft() = " + myQueue.popleft());
        System.out.println("myQueue.popleft() = " + myQueue.popleft());
        System.out.println("myQueue.popleft() = " + myQueue.popleft());
        System.out.println("myQueue.popleft() = " + myQueue.popleft());
        System.out.println("myQueue.isEmpty() = " + myQueue.isEmpty());


        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("K");
        myLinkedList.add("M");
        myLinkedList.add("S");

        Iterator<String> it = myLinkedList.iterator();
        while (it.hasNext()) {
            String data = it.next();
            System.out.println(data);
        }

    }
}