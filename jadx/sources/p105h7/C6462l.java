package p105h7;

import java.util.NoSuchElementException;

/* renamed from: h7.l */
abstract class C6462l extends C6474x {

    /* renamed from: d */
    private final int f19771d;

    /* renamed from: e */
    private int f19772e;

    protected C6462l(int i, int i2) {
        C6460j.m25555b(i2, i, "index");
        this.f19771d = i;
        this.f19772e = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo20327b(int i);

    public final boolean hasNext() {
        return this.f19772e < this.f19771d;
    }

    public final boolean hasPrevious() {
        return this.f19772e > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f19772e;
            this.f19772e = i + 1;
            return mo20327b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f19772e;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f19772e - 1;
            this.f19772e = i;
            return mo20327b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f19772e - 1;
    }
}
