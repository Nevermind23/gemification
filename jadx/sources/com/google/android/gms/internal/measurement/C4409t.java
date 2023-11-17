package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.t */
final class C4409t implements Iterator {

    /* renamed from: d */
    private int f13677d = 0;

    /* renamed from: e */
    final /* synthetic */ C4426u f13678e;

    C4409t(C4426u uVar) {
        this.f13678e = uVar;
    }

    public final boolean hasNext() {
        return this.f13677d < this.f13678e.f13710d.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f13677d;
        C4426u uVar = this.f13678e;
        if (i < uVar.f13710d.length()) {
            String g = uVar.f13710d;
            this.f13677d = i + 1;
            return new C4426u(String.valueOf(g.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
