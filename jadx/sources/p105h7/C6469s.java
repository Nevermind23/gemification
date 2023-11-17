package p105h7;

import java.util.NoSuchElementException;

/* renamed from: h7.s */
final class C6469s extends C6473w {

    /* renamed from: d */
    boolean f19781d;

    /* renamed from: e */
    final /* synthetic */ Object f19782e;

    C6469s(Object obj) {
        this.f19782e = obj;
    }

    public final boolean hasNext() {
        return !this.f19781d;
    }

    public final Object next() {
        if (!this.f19781d) {
            this.f19781d = true;
            return this.f19782e;
        }
        throw new NoSuchElementException();
    }
}
