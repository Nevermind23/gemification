package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.lb */
final class C4285lb implements Iterator {

    /* renamed from: d */
    final Iterator f13455d;

    /* renamed from: e */
    final /* synthetic */ C4302mb f13456e;

    C4285lb(C4302mb mbVar) {
        this.f13456e = mbVar;
        this.f13455d = mbVar.f13471d.iterator();
    }

    public final boolean hasNext() {
        return this.f13455d.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f13455d.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
