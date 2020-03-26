package queue;

public abstract class AbstractQueue implements Queue {
    private  int size = 0;

    @Override
    public abstract void enqueue(Object object);

    @Override
    public abstract Object element();

    @Override
    public abstract Object dequeue();

    @Override
    public int size() {
        return size;
    };

    @Override
    public boolean isEmpty() {
        return size == 0;
    };

    @Override
    public abstract void clear();

    @Override
    public abstract Object[] toArray();
}
