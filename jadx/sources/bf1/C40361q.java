package bf1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import ve1.C43151a;

/* renamed from: bf1.q */
public final class C40361q implements C40342g, C40336c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C40342g f95859a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f95860b;

    /* renamed from: bf1.q$a */
    public static final class C40362a implements Iterator, C43151a {

        /* renamed from: d */
        private int f95861d;

        /* renamed from: e */
        private final Iterator f95862e;

        C40362a(C40361q qVar) {
            this.f95861d = qVar.f95860b;
            this.f95862e = qVar.f95859a.iterator();
        }

        public boolean hasNext() {
            return this.f95861d > 0 && this.f95862e.hasNext();
        }

        public Object next() {
            int i = this.f95861d;
            if (i != 0) {
                this.f95861d = i - 1;
                return this.f95862e.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C40361q(C40342g gVar, int i) {
        boolean z;
        C41536l.m120489i(gVar, "sequence");
        this.f95859a = gVar;
        this.f95860b = i;
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
        int i2 = this.f95860b;
        return i >= i2 ? C40349m.m116844e() : new C40359p(this.f95859a, i, i2);
    }

    /* renamed from: b */
    public C40342g mo94368b(int i) {
        return i >= this.f95860b ? this : new C40361q(this.f95859a, i);
    }

    public Iterator iterator() {
        return new C40362a(this);
    }
}
