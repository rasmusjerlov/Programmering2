package stack;

import java.util.NoSuchElementException;

public class NodeStack implements StackI{
    private Node top;
    private int size = 0;
    @Override
    public void push(Object element) {
        Node node = new Node();
        node.data = element;
        node.next = (Node) top;
        top = node;
        size++;
    }

    @Override
    public Object pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        Node element = top;
        top = top.next;
        size--;
        return element.data;
    }

    @Override
    public Object peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (this.top == null) {
            return true;
        }
        return false;
    }
}
class Node {
    public Object data;
    public Node next;
}
