package p118i7;

import java.util.NoSuchElementException;

/* renamed from: i7.u */
abstract class C6610u extends C6591c0 {

    /* renamed from: d */
    private final int f20103d;

    /* renamed from: e */
    private int f20104e;

    protected C6610u(int i, int i2) {
        C6608s.m25970b(i2, i, "index");
        this.f20103d = i;
        this.f20104e = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo20595b(int i);

    public final boolean hasNext() {
        return this.f20104e < this.f20103d;
    }

    public final boolean hasPrevious() {
        return this.f20104e > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f20104e;
            this.f20104e = i + 1;
            return mo20595b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f20104e;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f20104e - 1;
            this.f20104e = i;
            return mo20595b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f20104e - 1;
    }
}
