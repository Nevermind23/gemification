package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.y9 */
public final class C4502y9 extends C4163e8 implements RandomAccess, C4518z9 {

    /* renamed from: f */
    private static final C4502y9 f13841f;

    /* renamed from: g */
    public static final C4518z9 f13842g;

    /* renamed from: e */
    private final List f13843e;

    static {
        C4502y9 y9Var = new C4502y9(false);
        f13841f = y9Var;
        f13842g = y9Var;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4502y9(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.f13843e = arrayList;
    }

    /* renamed from: g */
    private static String m17202g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C4418t8) {
            return ((C4418t8) obj).mo13648x(C4470w9.f13782b);
        }
        return C4470w9.m17098d((byte[]) obj);
    }

    /* renamed from: F0 */
    public final void mo13365F0(C4418t8 t8Var) {
        mo13060b();
        this.f13843e.add(t8Var);
        this.modCount++;
    }

    /* renamed from: Q */
    public final Object mo13366Q(int i) {
        return this.f13843e.get(i);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo13060b();
        this.f13843e.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo13060b();
        if (collection instanceof C4518z9) {
            collection = ((C4518z9) collection).mo13372u();
        }
        boolean addAll = this.f13843e.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: c */
    public final String get(int i) {
        Object obj = this.f13843e.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C4418t8) {
            C4418t8 t8Var = (C4418t8) obj;
            String x = t8Var.mo13648x(C4470w9.f13782b);
            if (t8Var.mo13464o()) {
                this.f13843e.set(i, x);
            }
            return x;
        }
        byte[] bArr = (byte[]) obj;
        String d = C4470w9.m17098d(bArr);
        if (C4472wb.m17102d(bArr)) {
            this.f13843e.set(i, d);
        }
        return d;
    }

    public final void clear() {
        mo13060b();
        this.f13843e.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C4453v9 mo12866e(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f13843e);
            return new C4502y9(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13060b();
        Object remove = this.f13843e.remove(i);
        this.modCount++;
        return m17202g(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo13060b();
        return m17202g(this.f13843e.set(i, (String) obj));
    }

    public final int size() {
        return this.f13843e.size();
    }

    /* renamed from: t */
    public final C4518z9 mo13371t() {
        return mo13068s() ? new C4302mb(this) : this;
    }

    /* renamed from: u */
    public final List mo13372u() {
        return Collections.unmodifiableList(this.f13843e);
    }

    private C4502y9(ArrayList arrayList) {
        super(true);
        this.f13843e = arrayList;
    }

    private C4502y9(boolean z) {
        super(false);
        this.f13843e = Collections.emptyList();
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
