
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author jsingh
 */
public class MyList<T> extends ArrayList<T> {

    public <T> Iterator reverseIterator() {
        return new MyReverseIterator(this);
    }

    public <T> Iterator selectiveIterator(MyPredicate<T> myPredicate) {
        return new MySelectiveIterator(this, myPredicate);
    }
}
