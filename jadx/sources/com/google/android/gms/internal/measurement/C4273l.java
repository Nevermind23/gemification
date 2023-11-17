package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.l */
final class C4273l implements Iterator {

    /* renamed from: d */
    final /* synthetic */ Iterator f13447d;

    C4273l(Iterator it) {
        this.f13447d = it;
    }

    public final boolean hasNext() {
        return this.f13447d.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new C4426u((String) this.f13447d.next());
    }
}
