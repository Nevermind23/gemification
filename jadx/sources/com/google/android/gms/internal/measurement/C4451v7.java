package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.v7 */
final class C4451v7 extends C4095a8 {

    /* renamed from: d */
    boolean f13760d;

    /* renamed from: e */
    final /* synthetic */ Object f13761e;

    C4451v7(Object obj) {
        this.f13761e = obj;
    }

    public final boolean hasNext() {
        return !this.f13760d;
    }

    public final Object next() {
        if (!this.f13760d) {
            this.f13760d = true;
            return this.f13761e;
        }
        throw new NoSuchElementException();
    }
}
