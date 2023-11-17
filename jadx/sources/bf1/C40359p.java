package bf1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import ve1.C43151a;

/* renamed from: bf1.p */
public final class C40359p implements C40342g, C40336c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C40342g f95853a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f95854b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f95855c;

    /* renamed from: bf1.p$a */
    public static final class C40360a implements Iterator, C43151a {

        /* renamed from: d */
        private final Iterator f95856d;

        /* renamed from: e */
        private int f95857e;

        /* renamed from: f */
        final /* synthetic */ C40359p f95858f;

        C40360a(C40359p pVar) {
            this.f95858f = pVar;
            this.f95856d = pVar.f95853a.iterator();
        }

        /* renamed from: b */
        private final void m116876b() {
            while (this.f95857e < this.f95858f.f95854b && this.f95856d.hasNext()) {
                this.f95856d.next();
                this.f95857e++;
            }
        }

        public boolean hasNext() {
            m116876b();
            if (this.f95857e >= this.f95858f.f95855c || !this.f95856d.hasNext()) {
                return false;
            }
            return true;
        }

        public Object next() {
            m116876b();
            if (this.f95857e < this.f95858f.f95855c) {
                this.f95857e++;
                return this.f95856d.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C40359p(C40342g gVar, int i, int i2) {
        boolean z;
        boolean z2;
        C41536l.m120489i(gVar, "sequence");
        this.f95853a = gVar;
        this.f95854b = i;
        this.f95855c = i2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (!(i2 < i ? false : z3)) {
                    throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i2).toString());
        }
        throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i).toString());
    }

    /* renamed from: f */
    private final int m116873f() {
        return this.f95855c - this.f95854b;
    }

    /* renamed from: a */
    public C40342g mo94367a(int i) {
        return i >= m116873f() ? C40349m.m116844e() : new C40359p(this.f95853a, this.f95854b + i, this.f95855c);
    }

    /* renamed from: b */
    public C40342g mo94368b(int i) {
        if (i >= m116873f()) {
            return this;
        }
        C40342g gVar = this.f95853a;
        int i2 = this.f95854b;
        return new C40359p(gVar, i2, i + i2);
    }

    public Iterator iterator() {
        return new C40360a(this);
    }
}
