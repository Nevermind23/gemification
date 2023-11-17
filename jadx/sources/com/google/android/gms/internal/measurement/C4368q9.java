package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.q9 */
final class C4368q9 extends C4163e8 implements RandomAccess, C4419t9, C4503ya {

    /* renamed from: g */
    private static final C4368q9 f13614g = new C4368q9(new int[0], 0, false);

    /* renamed from: e */
    private int[] f13615e;

    /* renamed from: f */
    private int f13616f;

    private C4368q9(int[] iArr, int i, boolean z) {
        super(z);
        this.f13615e = iArr;
        this.f13616f = i;
    }

    /* renamed from: g */
    public static C4368q9 m16503g() {
        return f13614g;
    }

    /* renamed from: j */
    private final String m16504j(int i) {
        int i2 = this.f13616f;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: k */
    private final void m16505k(int i) {
        if (i < 0 || i >= this.f13616f) {
            throw new IndexOutOfBoundsException(m16504j(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo13060b();
        if (i < 0 || i > (i2 = this.f13616f)) {
            throw new IndexOutOfBoundsException(m16504j(i));
        }
        int[] iArr = this.f13615e;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f13615e, i, iArr2, i + 1, this.f13616f - i);
            this.f13615e = iArr2;
        }
        this.f13615e[i] = intValue;
        this.f13616f++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo13060b();
        byte[] bArr = C4470w9.f13784d;
        collection.getClass();
        if (!(collection instanceof C4368q9)) {
            return super.addAll(collection);
        }
        C4368q9 q9Var = (C4368q9) collection;
        int i = q9Var.f13616f;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13616f;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f13615e;
            if (i3 > iArr.length) {
                this.f13615e = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(q9Var.f13615e, 0, this.f13615e, this.f13616f, q9Var.f13616f);
            this.f13616f = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final int mo13495c(int i) {
        m16505k(i);
        return this.f13615e[i];
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4368q9)) {
            return super.equals(obj);
        }
        C4368q9 q9Var = (C4368q9) obj;
        if (this.f13616f != q9Var.f13616f) {
            return false;
        }
        int[] iArr = q9Var.f13615e;
        for (int i = 0; i < this.f13616f; i++) {
            if (this.f13615e[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m16505k(i);
        return Integer.valueOf(this.f13615e[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13616f; i2++) {
            i = (i * 31) + this.f13615e[i2];
        }
        return i;
    }

    /* renamed from: i */
    public final void mo13498i(int i) {
        mo13060b();
        int i2 = this.f13616f;
        int[] iArr = this.f13615e;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f13615e = iArr2;
        }
        int[] iArr3 = this.f13615e;
        int i3 = this.f13616f;
        this.f13616f = i3 + 1;
        iArr3[i3] = i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f13616f;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13615e[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public final C4419t9 mo12866e(int i) {
        if (i >= this.f13616f) {
            return new C4368q9(Arrays.copyOf(this.f13615e, i), this.f13616f, true);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13060b();
        m16505k(i);
        int[] iArr = this.f13615e;
        int i2 = iArr[i];
        int i3 = this.f13616f;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f13616f--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13060b();
        if (i2 >= i) {
            int[] iArr = this.f13615e;
            System.arraycopy(iArr, i2, iArr, i, this.f13616f - i2);
            this.f13616f -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo13060b();
        m16505k(i);
        int[] iArr = this.f13615e;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f13616f;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13498i(((Integer) obj).intValue());
        return true;
    }
}
