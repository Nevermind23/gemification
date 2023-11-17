package com.google.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.t0 */
final class C5724t0 extends C5637c implements RandomAccess {

    /* renamed from: g */
    private static final C5724t0 f18076g;

    /* renamed from: e */
    private Object[] f18077e;

    /* renamed from: f */
    private int f18078f;

    static {
        C5724t0 t0Var = new C5724t0(new Object[0], 0);
        f18076g = t0Var;
        t0Var.mo18555y();
    }

    private C5724t0(Object[] objArr, int i) {
        this.f18077e = objArr;
        this.f18078f = i;
    }

    /* renamed from: c */
    private static Object[] m23009c(int i) {
        return new Object[i];
    }

    /* renamed from: g */
    public static C5724t0 m23010g() {
        return f18076g;
    }

    /* renamed from: i */
    private void m23011i(int i) {
        if (i < 0 || i >= this.f18078f) {
            throw new IndexOutOfBoundsException(m23012j(i));
        }
    }

    /* renamed from: j */
    private String m23012j(int i) {
        return "Index:" + i + ", Size:" + this.f18078f;
    }

    public boolean add(Object obj) {
        mo18547b();
        int i = this.f18078f;
        Object[] objArr = this.f18077e;
        if (i == objArr.length) {
            this.f18077e = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f18077e;
        int i2 = this.f18078f;
        this.f18078f = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }

    public Object get(int i) {
        m23011i(i);
        return this.f18077e[i];
    }

    /* renamed from: k */
    public C5724t0 mo18774a(int i) {
        if (i >= this.f18078f) {
            return new C5724t0(Arrays.copyOf(this.f18077e, i), this.f18078f);
        }
        throw new IllegalArgumentException();
    }

    public Object remove(int i) {
        mo18547b();
        m23011i(i);
        Object[] objArr = this.f18077e;
        Object obj = objArr[i];
        int i2 = this.f18078f;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f18078f--;
        this.modCount++;
        return obj;
    }

    public Object set(int i, Object obj) {
        mo18547b();
        m23011i(i);
        Object[] objArr = this.f18077e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public int size() {
        return this.f18078f;
    }

    public void add(int i, Object obj) {
        int i2;
        mo18547b();
        if (i < 0 || i > (i2 = this.f18078f)) {
            throw new IndexOutOfBoundsException(m23012j(i));
        }
        Object[] objArr = this.f18077e;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] c = m23009c(((i2 * 3) / 2) + 1);
            System.arraycopy(this.f18077e, 0, c, 0, i);
            System.arraycopy(this.f18077e, i, c, i + 1, this.f18078f - i);
            this.f18077e = c;
        }
        this.f18077e[i] = obj;
        this.f18078f++;
        this.modCount++;
    }
}
