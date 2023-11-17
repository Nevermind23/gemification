package bf1;

import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import ve1.C43151a;

/* renamed from: bf1.b */
public final class C40334b implements C40342g, C40336c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C40342g f95823a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f95824b;

    /* renamed from: bf1.b$a */
    public static final class C40335a implements Iterator, C43151a {

        /* renamed from: d */
        private final Iterator f95825d;

        /* renamed from: e */
        private int f95826e;

        C40335a(C40334b bVar) {
            this.f95825d = bVar.f95823a.iterator();
            this.f95826e = bVar.f95824b;
        }

        /* renamed from: b */
        private final void m116794b() {
            while (this.f95826e > 0 && this.f95825d.hasNext()) {
                this.f95825d.next();
                this.f95826e--;
            }
        }

        public boolean hasNext() {
            m116794b();
            return this.f95825d.hasNext();
        }

        public Object next() {
            m116794b();
            return this.f95825d.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C40334b(C40342g gVar, int i) {
        boolean z;
        C41536l.m120489i(gVar, "sequence");
        this.f95823a = gVar;
        this.f95824b = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    /* renamed from: a */
    public C40342g mo94367a(int i) {
        int i2 = this.f95824b + i;
        return i2 < 0 ? new C40334b(this, i) : new C40334b(this.f95823a, i2);
    }

    /* renamed from: b */
    public C40342g mo94368b(int i) {
        int i2 = this.f95824b;
        int i3 = i2 + i;
        return i3 < 0 ? new C40361q(this, i) : new C40359p(this.f95823a, i2, i3);
    }

    public Iterator iterator() {
        return new C40335a(this);
    }
}
