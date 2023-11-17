package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.d */
final class C4137d implements Iterator {

    /* renamed from: d */
    final /* synthetic */ Iterator f13191d;

    /* renamed from: e */
    final /* synthetic */ Iterator f13192e;

    C4137d(C4171f fVar, Iterator it, Iterator it2) {
        this.f13191d = it;
        this.f13192e = it2;
    }

    public final boolean hasNext() {
        if (this.f13191d.hasNext()) {
            return true;
        }
        return this.f13192e.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f13191d.hasNext()) {
            return new C4426u(((Integer) this.f13191d.next()).toString());
        }
        if (this.f13192e.hasNext()) {
            return new C4426u((String) this.f13192e.next());
        }
        throw new NoSuchElementException();
    }
}
