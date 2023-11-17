package ie1;

import java.util.Iterator;
import ve1.C43151a;

/* renamed from: ie1.k0 */
public abstract class C41330k0 implements Iterator, C43151a {
    public abstract int nextInt();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Integer next() {
        return Integer.valueOf(nextInt());
    }
}
