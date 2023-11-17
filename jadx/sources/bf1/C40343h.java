package bf1;

import he1.C41225n;
import he1.C41228o;
import he1.C41238w;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import me1.C41752f;
import me1.C41758g;
import oe1.C41857h;
import ve1.C43151a;

/* renamed from: bf1.h */
final class C40343h extends C40344i implements Iterator, Continuation, C43151a {

    /* renamed from: d */
    private int f95840d;

    /* renamed from: e */
    private Object f95841e;

    /* renamed from: f */
    private Iterator f95842f;

    /* renamed from: g */
    private Continuation f95843g;

    /* renamed from: m */
    private final Throwable m116808m() {
        int i = this.f95840d;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f95840d);
    }

    /* renamed from: n */
    private final Object m116809n() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public C41752f mo94380b() {
        return C41758g.f98029d;
    }

    /* renamed from: d */
    public Object mo94381d(Object obj, Continuation continuation) {
        this.f95841e = obj;
        this.f95840d = 3;
        this.f95843g = continuation;
        Object c = C41793d.m121157c();
        if (c == C41793d.m121157c()) {
            C41857h.m121275c(continuation);
        }
        if (c == C41793d.m121157c()) {
            return c;
        }
        return C41238w.f97225a;
    }

    /* renamed from: h */
    public void mo94382h(Object obj) {
        C41228o.m119483b(obj);
        this.f95840d = 4;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.f95840d;
            if (i != 0) {
                if (i == 1) {
                    Iterator it = this.f95842f;
                    C41536l.m120486f(it);
                    if (it.hasNext()) {
                        this.f95840d = 2;
                        return true;
                    }
                    this.f95842f = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw m116808m();
                }
            }
            this.f95840d = 5;
            Continuation continuation = this.f95843g;
            C41536l.m120486f(continuation);
            this.f95843g = null;
            C41225n.C41226a aVar = C41225n.f97210d;
            continuation.mo94382h(C41225n.m119478a(C41238w.f97225a));
        }
    }

    /* renamed from: j */
    public Object mo94384j(Iterator it, Continuation continuation) {
        if (!it.hasNext()) {
            return C41238w.f97225a;
        }
        this.f95842f = it;
        this.f95840d = 2;
        this.f95843g = continuation;
        Object c = C41793d.m121157c();
        if (c == C41793d.m121157c()) {
            C41857h.m121275c(continuation);
        }
        if (c == C41793d.m121157c()) {
            return c;
        }
        return C41238w.f97225a;
    }

    public Object next() {
        int i = this.f95840d;
        if (i == 0 || i == 1) {
            return m116809n();
        }
        if (i == 2) {
            this.f95840d = 1;
            Iterator it = this.f95842f;
            C41536l.m120486f(it);
            return it.next();
        } else if (i == 3) {
            this.f95840d = 0;
            Object obj = this.f95841e;
            this.f95841e = null;
            return obj;
        } else {
            throw m116808m();
        }
    }

    /* renamed from: o */
    public final void mo94386o(Continuation continuation) {
        this.f95843g = continuation;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
