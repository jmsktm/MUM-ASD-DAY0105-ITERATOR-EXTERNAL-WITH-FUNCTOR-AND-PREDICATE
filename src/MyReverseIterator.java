import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author jsingh
 */
public class MyReverseIterator<T> implements Iterator<T> {
    
    private ListIterator<T> it;
    
    public MyReverseIterator(List<T> list) {
        this.it = list.listIterator(list.size());
    }

    @Override
    public boolean hasNext() {
        return it.hasPrevious();
    }

    @Override
    public T next() {
        return it.previous();
    }

    @Override
    public void remove() {
        it.remove();
    }
    
}
