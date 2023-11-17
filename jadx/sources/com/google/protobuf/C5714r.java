package com.google.protobuf;

import com.google.protobuf.C5716s;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.r */
final class C5714r extends C5637c implements C5716s.C5720d, RandomAccess, C5713q0 {

    /* renamed from: g */
    private static final C5714r f18061g;

    /* renamed from: e */
    private int[] f18062e;

    /* renamed from: f */
    private int f18063f;

    static {
        C5714r rVar = new C5714r(new int[0], 0);
        f18061g = rVar;
        rVar.mo18555y();
    }

    private C5714r(int[] iArr, int i) {
        this.f18062e = iArr;
        this.f18063f = i;
    }

    /* renamed from: i */
    private void m22976i(int i, int i2) {
        int i3;
        mo18547b();
        if (i < 0 || i > (i3 = this.f18063f)) {
            throw new IndexOutOfBoundsException(m22979n(i));
        }
        int[] iArr = this.f18062e;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f18062e, i, iArr2, i + 1, this.f18063f - i);
            this.f18062e = iArr2;
        }
        this.f18062e[i] = i2;
        this.f18063f++;
        this.modCount++;
    }

    /* renamed from: j */
    public static C5714r m22977j() {
        return f18061g;
    }

    /* renamed from: k */
    private void m22978k(int i) {
        if (i < 0 || i >= this.f18063f) {
            throw new IndexOutOfBoundsException(m22979n(i));
        }
    }

    /* renamed from: n */
    private String m22979n(int i) {
        return "Index:" + i + ", Size:" + this.f18063f;
    }

    public boolean addAll(Collection collection) {
        mo18547b();
        C5716s.m22990a(collection);
        if (!(collection instanceof C5714r)) {
            return super.addAll(collection);
        }
        C5714r rVar = (C5714r) collection;
        int i = rVar.f18063f;
        if (i == 0) {
            return false;
        }
        int i2 = this.f18063f;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f18062e;
            if (i3 > iArr.length) {
                this.f18062e = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(rVar.f18062e, 0, this.f18062e, this.f18063f, rVar.f18063f);
            this.f18063f = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i, Integer num) {
        m22976i(i, num.intValue());
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5714r)) {
            return super.equals(obj);
        }
        C5714r rVar = (C5714r) obj;
        if (this.f18063f != rVar.f18063f) {
            return false;
        }
        int[] iArr = rVar.f18062e;
        for (int i = 0; i < this.f18063f; i++) {
            if (this.f18062e[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public boolean add(Integer num) {
        mo18784p(num.intValue());
        return true;
    }

    public int getInt(int i) {
        m22978k(i);
        return this.f18062e[i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f18063f; i2++) {
            i = (i * 31) + this.f18062e[i2];
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f18062e[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    /* renamed from: o */
    public Integer remove(int i) {
        mo18547b();
        m22978k(i);
        int[] iArr = this.f18062e;
        int i2 = iArr[i];
        int i3 = this.f18063f;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f18063f--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* renamed from: p */
    public void mo18784p(int i) {
        mo18547b();
        int i2 = this.f18063f;
        int[] iArr = this.f18062e;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f18062e = iArr2;
        }
        int[] iArr3 = this.f18062e;
        int i3 = this.f18063f;
        this.f18063f = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: r */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(mo18789v(i, num.intValue()));
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo18547b();
        if (i2 >= i) {
            int[] iArr = this.f18062e;
            System.arraycopy(iArr, i2, iArr, i, this.f18063f - i2);
            this.f18063f -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f18063f;
    }

    /* renamed from: v */
    public int mo18789v(int i, int i2) {
        mo18547b();
        m22978k(i);
        int[] iArr = this.f18062e;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    /* renamed from: a */
    public C5716s.C5720d m22981a(int i) {
        if (i >= this.f18063f) {
            return new C5714r(Arrays.copyOf(this.f18062e, i), this.f18063f);
        }
        throw new IllegalArgumentException();
    }
}
