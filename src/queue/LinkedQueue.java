package queue;

public class LinkedQueue extends AbstractQueue {

    /*public static void main(String[] args) {
        LinkedQueue linkedQueue = new LinkedQueue();
    }*/

    private class Node {
        public Object value;
        public Node next;
    }

    private int size = 0;
    Node head = null;

    @Override
    public void enqueue(Object object) {
        if (head == null) {
            head = new Node();
            head.value = object;
        }
        else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = new Node();
            current.next.value = object;
        }

        size++;
    }

    @Override
    public Object element() {
        return head.value;
    }

    @Override
    public Object dequeue() {
        Node temp = head;
        head = head.next;
        size--;
        return temp.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];

        for (int i = 0; i < size; i++) {
            array[i] = head.value;
            head = head.next;
        }

        return array;
    }
}
