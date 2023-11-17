package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.y7 */
final class C4500y7 extends C4434u7 {

    /* renamed from: k */
    private static final Object[] f13831k;

    /* renamed from: l */
    static final C4500y7 f13832l;

    /* renamed from: f */
    final transient Object[] f13833f;

    /* renamed from: g */
    private final transient int f13834g;

    /* renamed from: h */
    final transient Object[] f13835h;

    /* renamed from: i */
    private final transient int f13836i;

    /* renamed from: j */
    private final transient int f13837j;

    static {
        Object[] objArr = new Object[0];
        f13831k = objArr;
        f13832l = new C4500y7(objArr, 0, objArr, 0, 0);
    }

    C4500y7(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f13833f = objArr;
        this.f13834g = i;
        this.f13835h = objArr2;
        this.f13836i = i2;
        this.f13837j = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo13419b(Object[] objArr, int i) {
        System.arraycopy(this.f13833f, 0, objArr, 0, this.f13837j);
        return this.f13837j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo13420c() {
        return this.f13837j;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f13835h;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int a = C4281l7.m16224a(obj.hashCode());
        while (true) {
            int i = a & this.f13836i;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo13423g() {
        return 0;
    }

    public final int hashCode() {
        return this.f13834g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo13424i() {
        return this.f13833f;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo13752l().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final C4417t7 mo13753n() {
        return C4417t7.m16742l(this.f13833f, this.f13837j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean mo13754r() {
        return true;
    }

    public final int size() {
        return this.f13837j;
    }
}
