package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.kb */
final class C4268kb implements ListIterator {

    /* renamed from: d */
    final ListIterator f13437d;

    /* renamed from: e */
    final /* synthetic */ int f13438e;

    /* renamed from: f */
    final /* synthetic */ C4302mb f13439f;

    C4268kb(C4302mb mbVar, int i) {
        this.f13439f = mbVar;
        this.f13438e = i;
        this.f13437d = mbVar.f13471d.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f13437d.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f13437d.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f13437d.next();
    }

    public final int nextIndex() {
        return this.f13437d.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f13437d.previous();
    }

    public final int previousIndex() {
        return this.f13437d.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
