package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.e */
final class C4154e implements Iterator {

    /* renamed from: d */
    private int f13203d = 0;

    /* renamed from: e */
    final /* synthetic */ C4171f f13204e;

    C4154e(C4171f fVar) {
        this.f13204e = fVar;
    }

    public final boolean hasNext() {
        return this.f13203d < this.f13204e.mo13086l();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f13203d < this.f13204e.mo13086l()) {
            C4171f fVar = this.f13204e;
            int i = this.f13203d;
            this.f13203d = i + 1;
            return fVar.mo13087n(i);
        }
        int i2 = this.f13203d;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}
