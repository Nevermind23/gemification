package ie1;

import java.util.Iterator;
import ve1.C43151a;

/* renamed from: ie1.l0 */
public abstract class C41332l0 implements Iterator, C43151a {
    public abstract long nextLong();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Long next() {
        return Long.valueOf(nextLong());
    }
}
