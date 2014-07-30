
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author jsingh
 */
public class MySelectiveIterator<T> implements Iterator<T> {

    private ListIterator<T> it;
    private MyPredicate<T> myPredicate;

    public MySelectiveIterator(List<T> list, MyPredicate<T> myPredicate) {
        this.it = list.listIterator();
        this.myPredicate = myPredicate;
    }

    @Override
    public boolean hasNext() {
        while (it.hasNext()) {
            if (myPredicate.criteria(it.next())) {
                it.previous();
                return true;
            }
        }
        return false;
    }

    @Override
    public T next() {
        while (it.hasNext()) {
            if (myPredicate.criteria(it.next())) {
                it.previous();
                return it.next();
            }
        }
        return null;
    }

    @Override
    public void remove() {
        it.remove();
    }
}
