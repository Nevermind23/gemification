package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ga */
final class C4199ga extends C4163e8 implements RandomAccess, C4436u9, C4503ya {

    /* renamed from: g */
    private static final C4199ga f13256g = new C4199ga(new long[0], 0, false);

    /* renamed from: e */
    private long[] f13257e;

    /* renamed from: f */
    private int f13258f;

    private C4199ga(long[] jArr, int i, boolean z) {
        super(z);
        this.f13257e = jArr;
        this.f13258f = i;
    }

    /* renamed from: c */
    public static C4199ga m15905c() {
        return f13256g;
    }

    /* renamed from: i */
    private final String m15906i(int i) {
        int i2 = this.f13258f;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: j */
    private final void m15907j(int i) {
        if (i < 0 || i >= this.f13258f) {
            throw new IndexOutOfBoundsException(m15906i(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo13060b();
        if (i < 0 || i > (i2 = this.f13258f)) {
            throw new IndexOutOfBoundsException(m15906i(i));
        }
        long[] jArr = this.f13257e;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f13257e, i, jArr2, i + 1, this.f13258f - i);
            this.f13257e = jArr2;
        }
        this.f13257e[i] = longValue;
        this.f13258f++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo13060b();
        byte[] bArr = C4470w9.f13784d;
        collection.getClass();
        if (!(collection instanceof C4199ga)) {
            return super.addAll(collection);
        }
        C4199ga gaVar = (C4199ga) collection;
        int i = gaVar.f13258f;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13258f;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f13257e;
            if (i3 > jArr.length) {
                this.f13257e = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(gaVar.f13257e, 0, this.f13257e, this.f13258f, gaVar.f13258f);
            this.f13258f = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final long mo13150d(int i) {
        m15907j(i);
        return this.f13257e[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4199ga)) {
            return super.equals(obj);
        }
        C4199ga gaVar = (C4199ga) obj;
        if (this.f13258f != gaVar.f13258f) {
            return false;
        }
        long[] jArr = gaVar.f13257e;
        for (int i = 0; i < this.f13258f; i++) {
            if (this.f13257e[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void mo13151g(long j) {
        mo13060b();
        int i = this.f13258f;
        long[] jArr = this.f13257e;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f13257e = jArr2;
        }
        long[] jArr3 = this.f13257e;
        int i2 = this.f13258f;
        this.f13258f = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* synthetic */ Object get(int i) {
        m15907j(i);
        return Long.valueOf(this.f13257e[i]);
    }

    /* renamed from: h */
    public final C4436u9 mo12866e(int i) {
        if (i >= this.f13258f) {
            return new C4199ga(Arrays.copyOf(this.f13257e, i), this.f13258f, true);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13258f; i2++) {
            long j = this.f13257e[i2];
            byte[] bArr = C4470w9.f13784d;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f13258f;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13257e[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo13060b();
        m15907j(i);
        long[] jArr = this.f13257e;
        long j = jArr[i];
        int i2 = this.f13258f;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f13258f--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo13060b();
        if (i2 >= i) {
            long[] jArr = this.f13257e;
            System.arraycopy(jArr, i2, jArr, i, this.f13258f - i2);
            this.f13258f -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo13060b();
        m15907j(i);
        long[] jArr = this.f13257e;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f13258f;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13151g(((Long) obj).longValue());
        return true;
    }
}
