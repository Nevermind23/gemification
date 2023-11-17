package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.r */
final class C4764r implements Iterator {

    /* renamed from: d */
    final Iterator f14807d;

    /* renamed from: e */
    final /* synthetic */ zzau f14808e;

    C4764r(zzau zzau) {
        this.f14808e = zzau;
        this.f14807d = zzau.f15102d.keySet().iterator();
    }

    /* renamed from: b */
    public final String next() {
        return (String) this.f14807d.next();
    }

    public final boolean hasNext() {
        return this.f14807d.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
