package bf1;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41536l;

/* renamed from: bf1.a */
public final class C40333a implements C40342g {

    /* renamed from: a */
    private final AtomicReference f95822a;

    public C40333a(C40342g gVar) {
        C41536l.m120489i(gVar, "sequence");
        this.f95822a = new AtomicReference(gVar);
    }

    public Iterator iterator() {
        C40342g gVar = (C40342g) this.f95822a.getAndSet((Object) null);
        if (gVar != null) {
            return gVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
