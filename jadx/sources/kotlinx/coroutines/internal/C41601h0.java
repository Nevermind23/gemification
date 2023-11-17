package kotlinx.coroutines.internal;

import java.util.Arrays;
import kotlin.jvm.internal.C41536l;

/* renamed from: kotlinx.coroutines.internal.h0 */
public abstract class C41601h0 {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    private C41603i0[] f97799a;

    /* renamed from: f */
    private final C41603i0[] m120681f() {
        C41603i0[] i0VarArr = this.f97799a;
        if (i0VarArr == null) {
            C41603i0[] i0VarArr2 = new C41603i0[4];
            this.f97799a = i0VarArr2;
            return i0VarArr2;
        } else if (mo96379c() < i0VarArr.length) {
            return i0VarArr;
        } else {
            Object[] copyOf = Arrays.copyOf(i0VarArr, mo96379c() * 2);
            C41536l.m120488h(copyOf, "copyOf(this, newSize)");
            C41603i0[] i0VarArr3 = (C41603i0[]) copyOf;
            this.f97799a = i0VarArr3;
            return i0VarArr3;
        }
    }

    /* renamed from: j */
    private final void m120682j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    private final void m120683k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo96379c()) {
                C41603i0[] i0VarArr = this.f97799a;
                C41536l.m120486f(i0VarArr);
                int i3 = i2 + 1;
                if (i3 < mo96379c()) {
                    C41603i0 i0Var = i0VarArr[i3];
                    C41536l.m120486f(i0Var);
                    C41603i0 i0Var2 = i0VarArr[i2];
                    C41536l.m120486f(i0Var2);
                    if (((Comparable) i0Var).compareTo(i0Var2) < 0) {
                        i2 = i3;
                    }
                }
                C41603i0 i0Var3 = i0VarArr[i];
                C41536l.m120486f(i0Var3);
                C41603i0 i0Var4 = i0VarArr[i2];
                C41536l.m120486f(i0Var4);
                if (((Comparable) i0Var3).compareTo(i0Var4) > 0) {
                    m120685m(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private final void m120684l(int i) {
        while (i > 0) {
            C41603i0[] i0VarArr = this.f97799a;
            C41536l.m120486f(i0VarArr);
            int i2 = (i - 1) / 2;
            C41603i0 i0Var = i0VarArr[i2];
            C41536l.m120486f(i0Var);
            C41603i0 i0Var2 = i0VarArr[i];
            C41536l.m120486f(i0Var2);
            if (((Comparable) i0Var).compareTo(i0Var2) > 0) {
                m120685m(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    private final void m120685m(int i, int i2) {
        C41603i0[] i0VarArr = this.f97799a;
        C41536l.m120486f(i0VarArr);
        C41603i0 i0Var = i0VarArr[i2];
        C41536l.m120486f(i0Var);
        C41603i0 i0Var2 = i0VarArr[i];
        C41536l.m120486f(i0Var2);
        i0VarArr[i] = i0Var;
        i0VarArr[i2] = i0Var2;
        i0Var.mo95290e(i);
        i0Var2.mo95290e(i2);
    }

    /* renamed from: a */
    public final void mo96377a(C41603i0 i0Var) {
        i0Var.mo95287a(this);
        C41603i0[] f = m120681f();
        int c = mo96379c();
        m120682j(c + 1);
        f[c] = i0Var;
        i0Var.mo95290e(c);
        m120684l(c);
    }

    /* renamed from: b */
    public final C41603i0 mo96378b() {
        C41603i0[] i0VarArr = this.f97799a;
        if (i0VarArr != null) {
            return i0VarArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int mo96379c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean mo96380d() {
        return mo96379c() == 0;
    }

    /* renamed from: e */
    public final C41603i0 mo96381e() {
        C41603i0 b;
        synchronized (this) {
            b = mo96378b();
        }
        return b;
    }

    /* renamed from: g */
    public final boolean mo96382g(C41603i0 i0Var) {
        boolean z;
        synchronized (this) {
            if (i0Var.mo95288c() == null) {
                z = false;
            } else {
                mo96383h(i0Var.mo95291f());
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public final C41603i0 mo96383h(int i) {
        C41603i0[] i0VarArr = this.f97799a;
        C41536l.m120486f(i0VarArr);
        m120682j(mo96379c() - 1);
        if (i < mo96379c()) {
            m120685m(i, mo96379c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                C41603i0 i0Var = i0VarArr[i];
                C41536l.m120486f(i0Var);
                C41603i0 i0Var2 = i0VarArr[i2];
                C41536l.m120486f(i0Var2);
                if (((Comparable) i0Var).compareTo(i0Var2) < 0) {
                    m120685m(i, i2);
                    m120684l(i2);
                }
            }
            m120683k(i);
        }
        C41603i0 i0Var3 = i0VarArr[mo96379c()];
        C41536l.m120486f(i0Var3);
        i0Var3.mo95287a((C41601h0) null);
        i0Var3.mo95290e(-1);
        i0VarArr[mo96379c()] = null;
        return i0Var3;
    }

    /* renamed from: i */
    public final C41603i0 mo96384i() {
        C41603i0 i0Var;
        synchronized (this) {
            if (mo96379c() > 0) {
                i0Var = mo96383h(0);
            } else {
                i0Var = null;
            }
        }
        return i0Var;
    }
}
