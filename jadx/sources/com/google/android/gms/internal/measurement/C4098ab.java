package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ab */
final class C4098ab extends C4163e8 implements RandomAccess {

    /* renamed from: g */
    private static final C4098ab f13143g = new C4098ab(new Object[0], 0, false);

    /* renamed from: e */
    private Object[] f13144e;

    /* renamed from: f */
    private int f13145f;

    private C4098ab(Object[] objArr, int i, boolean z) {
        super(z);
        this.f13144e = objArr;
        this.f13145f = i;
    }

    /* renamed from: c */
    public static C4098ab m15505c() {
        return f13143g;
    }

    /* renamed from: g */
    private final String m15506g(int i) {
        int i2 = this.f13145f;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m15507i(int i) {
        if (i < 0 || i >= this.f13145f) {
            throw new IndexOutOfBoundsException(m15506g(i));
        }
    }

    public final void add(int i, Object obj) {
        int i2;
        mo13060b();
        if (i < 0 || i > (i2 = this.f13145f)) {
            throw new IndexOutOfBoundsException(m15506g(i));
        }
        Object[] objArr = this.f13144e;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f13144e, i, objArr2, i + 1, this.f13145f - i);
            this.f13144e = objArr2;
        }
        this.f13144e[i] = obj;
        this.f13145f++;
        this.modCount++;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C4453v9 mo12866e(int i) {
        if (i >= this.f13145f) {
            return new C4098ab(Arrays.copyOf(this.f13144e, i), this.f13145f, true);
        }
        throw new IllegalArgumentException();
    }

    public final Object get(int i) {
        m15507i(i);
        return this.f13144e[i];
    }

    public final Object remove(int i) {
        mo13060b();
        m15507i(i);
        Object[] objArr = this.f13144e;
        Object obj = objArr[i];
        int i2 = this.f13145f;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f13145f--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo13060b();
        m15507i(i);
        Object[] objArr = this.f13144e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f13145f;
    }

    public final boolean add(Object obj) {
        mo13060b();
        int i = this.f13145f;
        Object[] objArr = this.f13144e;
        if (i == objArr.length) {
            this.f13144e = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f13144e;
        int i2 = this.f13145f;
        this.f13145f = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
