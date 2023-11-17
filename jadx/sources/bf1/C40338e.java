package bf1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;
import ve1.C43151a;

/* renamed from: bf1.e */
public final class C40338e implements C40342g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C40342g f95828a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f95829b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C43075l f95830c;

    /* renamed from: bf1.e$a */
    public static final class C40339a implements Iterator, C43151a {

        /* renamed from: d */
        private final Iterator f95831d;

        /* renamed from: e */
        private int f95832e = -1;

        /* renamed from: f */
        private Object f95833f;

        /* renamed from: g */
        final /* synthetic */ C40338e f95834g;

        C40339a(C40338e eVar) {
            this.f95834g = eVar;
            this.f95831d = eVar.f95828a.iterator();
        }

        /* renamed from: b */
        private final void m116804b() {
            while (this.f95831d.hasNext()) {
                Object next = this.f95831d.next();
                if (((Boolean) this.f95834g.f95830c.invoke(next)).booleanValue() == this.f95834g.f95829b) {
                    this.f95833f = next;
                    this.f95832e = 1;
                    return;
                }
            }
            this.f95832e = 0;
        }

        public boolean hasNext() {
            if (this.f95832e == -1) {
                m116804b();
            }
            if (this.f95832e == 1) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.f95832e == -1) {
                m116804b();
            }
            if (this.f95832e != 0) {
                Object obj = this.f95833f;
                this.f95833f = null;
                this.f95832e = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C40338e(C40342g gVar, boolean z, C43075l lVar) {
        C41536l.m120489i(gVar, "sequence");
        C41536l.m120489i(lVar, "predicate");
        this.f95828a = gVar;
        this.f95829b = z;
        this.f95830c = lVar;
    }

    public Iterator iterator() {
        return new C40339a(this);
    }
}
