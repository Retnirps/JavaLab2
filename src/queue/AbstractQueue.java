package queue;

public abstract class AbstractQueue implements Queue {
    @Override
    public abstract void enqueue(Object object);

    @Override
    public abstract Object element();

    @Override
    public abstract Object dequeue();

    @Override
    public abstract int size();

    @Override
    public abstract boolean isEmpty();

    @Override
    public abstract void clear();

    @Override
    public abstract Object[] toArray();
}
