package p157l7;

import java.util.NoSuchElementException;

/* renamed from: l7.m */
abstract class C6999m extends C6976a0 {

    /* renamed from: d */
    private final int f20873d;

    /* renamed from: e */
    private int f20874e;

    protected C6999m(int i, int i2) {
        C6995k.m27123b(i2, i, "index");
        this.f20873d = i;
        this.f20874e = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo21172b(int i);

    public final boolean hasNext() {
        return this.f20874e < this.f20873d;
    }

    public final boolean hasPrevious() {
        return this.f20874e > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f20874e;
            this.f20874e = i + 1;
            return mo21172b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f20874e;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f20874e - 1;
            this.f20874e = i;
            return mo21172b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f20874e - 1;
    }
}
