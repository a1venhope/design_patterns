package iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private T[] data;
    private int position;
    private int length;

    public ArrayIterator(T[] data) {
        this.data = data;
        this.position = 0;
        this.length = data.length;
    }

    @Override
    public boolean hasNext() {
        return position < length;
    }

    @Override
    public T Next() {
        return data[position++];
    }
}
