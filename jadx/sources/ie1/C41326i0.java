package ie1;

import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import ue1.C43064a;
import ve1.C43151a;

/* renamed from: ie1.i0 */
public final class C41326i0 implements Iterable, C43151a {

    /* renamed from: d */
    private final C43064a f97380d;

    public C41326i0(C43064a aVar) {
        C41536l.m120489i(aVar, "iteratorFactory");
        this.f97380d = aVar;
    }

    public Iterator iterator() {
        return new C41328j0((Iterator) this.f97380d.invoke());
    }
}
