package iterator;

import com.sun.xml.internal.fastinfoset.util.StringArray;

public interface DataList<T> {
    Iterator<T> creatIterator();
}

class Datas implements DataList<Data> {

    private Data[] datas;

    public Datas(Data[] datas) {
        this.datas = datas;
    }

    @Override
    public Iterator<Data> creatIterator() {
        return new ArrayIterator<Data>(datas);
    }
}

class Data{}
