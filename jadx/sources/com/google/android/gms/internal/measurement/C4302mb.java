package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.mb */
public final class C4302mb extends AbstractList implements RandomAccess, C4518z9 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4518z9 f13471d;

    public C4302mb(C4518z9 z9Var) {
        this.f13471d = z9Var;
    }

    /* renamed from: F0 */
    public final void mo13365F0(C4418t8 t8Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: Q */
    public final Object mo13366Q(int i) {
        return this.f13471d.mo13366Q(i);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C4502y9) this.f13471d).get(i);
    }

    public final Iterator iterator() {
        return new C4285lb(this);
    }

    public final ListIterator listIterator(int i) {
        return new C4268kb(this, i);
    }

    public final int size() {
        return this.f13471d.size();
    }

    /* renamed from: t */
    public final C4518z9 mo13371t() {
        return this;
    }

    /* renamed from: u */
    public final List mo13372u() {
        return this.f13471d.mo13372u();
    }
}
