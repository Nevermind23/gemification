package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.k7 */
abstract class C4264k7 extends C4112b8 {

    /* renamed from: d */
    private final int f13431d;

    /* renamed from: e */
    private int f13432e;

    protected C4264k7(int i, int i2) {
        C4111b7.m15557b(i2, i, "index");
        this.f13431d = i;
        this.f13432e = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo13297b(int i);

    public final boolean hasNext() {
        return this.f13432e < this.f13431d;
    }

    public final boolean hasPrevious() {
        return this.f13432e > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f13432e;
            this.f13432e = i + 1;
            return mo13297b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f13432e;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f13432e - 1;
            this.f13432e = i;
            return mo13297b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f13432e - 1;
    }
}
