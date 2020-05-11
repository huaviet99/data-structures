package stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack<E> {
    private int top;
    private List<E> stackList;

    public MyStack() {
        stackList = new ArrayList<E>();
        top = -1;
    }

    public void push(E data) {
        top++;
        stackList.add(data);

    }

    public void pop() {
        if (!isEmpty()) {
            stackList.remove(top);
            top--;
        } else {
            System.out.println("Your stack is empty");
        }
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public E peek() throws Exception {
        if (!isEmpty()) {
            return stackList.get(top);
        } else {
           throw new Exception();
        }
    }


    public void displayStack() {
        System.out.println(top);
        for (int i = 0; i < stackList.size(); i++) {
            System.out.print(stackList.get(i) + " ");
        }
    }
}
