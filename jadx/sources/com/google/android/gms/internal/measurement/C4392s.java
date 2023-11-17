package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.s */
final class C4392s implements Iterator {

    /* renamed from: d */
    private int f13649d = 0;

    /* renamed from: e */
    final /* synthetic */ C4426u f13650e;

    C4392s(C4426u uVar) {
        this.f13650e = uVar;
    }

    public final boolean hasNext() {
        return this.f13649d < this.f13650e.f13710d.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f13649d;
        if (i < this.f13650e.f13710d.length()) {
            this.f13649d = i + 1;
            return new C4426u(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
