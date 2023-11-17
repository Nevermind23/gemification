package bf1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;
import ve1.C43151a;

/* renamed from: bf1.r */
public final class C40363r implements C40342g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C40342g f95863a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C43075l f95864b;

    /* renamed from: bf1.r$a */
    public static final class C40364a implements Iterator, C43151a {

        /* renamed from: d */
        private final Iterator f95865d;

        /* renamed from: e */
        private int f95866e = -1;

        /* renamed from: f */
        private Object f95867f;

        /* renamed from: g */
        final /* synthetic */ C40363r f95868g;

        C40364a(C40363r rVar) {
            this.f95868g = rVar;
            this.f95865d = rVar.f95863a.iterator();
        }

        /* renamed from: b */
        private final void m116883b() {
            if (this.f95865d.hasNext()) {
                Object next = this.f95865d.next();
                if (((Boolean) this.f95868g.f95864b.invoke(next)).booleanValue()) {
                    this.f95866e = 1;
                    this.f95867f = next;
                    return;
                }
            }
            this.f95866e = 0;
        }

        public boolean hasNext() {
            if (this.f95866e == -1) {
                m116883b();
            }
            if (this.f95866e == 1) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.f95866e == -1) {
                m116883b();
            }
            if (this.f95866e != 0) {
                Object obj = this.f95867f;
                this.f95867f = null;
                this.f95866e = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C40363r(C40342g gVar, C43075l lVar) {
        C41536l.m120489i(gVar, "sequence");
        C41536l.m120489i(lVar, "predicate");
        this.f95863a = gVar;
        this.f95864b = lVar;
    }

    public Iterator iterator() {
        return new C40364a(this);
    }
}
