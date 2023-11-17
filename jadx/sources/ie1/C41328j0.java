package ie1;

import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import ve1.C43151a;

/* renamed from: ie1.j0 */
public final class C41328j0 implements Iterator, C43151a {

    /* renamed from: d */
    private final Iterator f97381d;

    /* renamed from: e */
    private int f97382e;

    public C41328j0(Iterator it) {
        C41536l.m120489i(it, "iterator");
        this.f97381d = it;
    }

    /* renamed from: b */
    public final C41324h0 next() {
        int i = this.f97382e;
        this.f97382e = i + 1;
        if (i < 0) {
            C41341q.m119917t();
        }
        return new C41324h0(i, this.f97381d.next());
    }

    public final boolean hasNext() {
        return this.f97381d.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
