package p157l7;

import java.util.NoSuchElementException;

/* renamed from: l7.t */
final class C7007t extends C7013z {

    /* renamed from: d */
    boolean f20883d;

    /* renamed from: e */
    final /* synthetic */ Object f20884e;

    C7007t(Object obj) {
        this.f20884e = obj;
    }

    public final boolean hasNext() {
        return !this.f20883d;
    }

    public final Object next() {
        if (!this.f20883d) {
            this.f20883d = true;
            return this.f20884e;
        }
        throw new NoSuchElementException();
    }
}
