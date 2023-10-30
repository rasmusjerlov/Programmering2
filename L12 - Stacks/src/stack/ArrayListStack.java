package stack;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack implements StackI {
    private Object top;
    private ArrayList<Object> stack = new ArrayList();
    @Override
    public void push(Object element) {
        stack.add(element);
    }

    @Override
    public Object pop() {
        if (stack.size() == 0) {
            throw new NoSuchElementException();
        }

        return stack.remove(stack.size() - 1);
    }

    @Override
    public Object peek() {
        if (stack.size() == 0) {
            throw new NoSuchElementException();
        }
        return stack.get(stack.size() - 1);
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
