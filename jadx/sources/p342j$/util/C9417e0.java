package p342j$.util;

import java.util.Iterator;

/* renamed from: j$.util.e0 */
public abstract class C9417e0 {

    /* renamed from: a */
    private static final C9371P f26057a = new C9382a0();

    /* renamed from: b */
    private static final C9362G f26058b = new C9379Y();

    /* renamed from: c */
    private static final C9365J f26059c = new C9380Z();

    /* renamed from: d */
    private static final C9359D f26060d = new C9378X();

    /* renamed from: a */
    private static void m34753a(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
        } else if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(i2);
        } else if (i3 > i) {
            throw new ArrayIndexOutOfBoundsException(i3);
        }
    }

    /* renamed from: b */
    public static C9359D m34754b() {
        return f26060d;
    }

    /* renamed from: c */
    public static C9362G m34755c() {
        return f26058b;
    }

    /* renamed from: d */
    public static C9365J m34756d() {
        return f26059c;
    }

    /* renamed from: e */
    public static C9371P m34757e() {
        return f26057a;
    }

    /* renamed from: f */
    public static C9510q m34758f(C9359D d) {
        d.getClass();
        return new C9375U(d);
    }

    /* renamed from: g */
    public static C9755u m34759g(C9362G g) {
        g.getClass();
        return new C9373S(g);
    }

    /* renamed from: h */
    public static C9759y m34760h(C9365J j) {
        j.getClass();
        return new C9374T(j);
    }

    /* renamed from: i */
    public static Iterator m34761i(C9371P p) {
        p.getClass();
        return new C9372Q(p);
    }

    /* renamed from: j */
    public static C9359D m34762j(double[] dArr, int i, int i2) {
        dArr.getClass();
        m34753a(dArr.length, i, i2);
        return new C9377W(dArr, i, i2, 1040);
    }

    /* renamed from: k */
    public static C9362G m34763k(int[] iArr, int i, int i2) {
        iArr.getClass();
        m34753a(iArr.length, i, i2);
        return new C9384b0(iArr, i, i2, 1040);
    }

    /* renamed from: l */
    public static C9365J m34764l(long[] jArr, int i, int i2) {
        jArr.getClass();
        m34753a(jArr.length, i, i2);
        return new C9415d0(jArr, i, i2, 1040);
    }

    /* renamed from: m */
    public static C9371P m34765m(Object[] objArr, int i, int i2) {
        objArr.getClass();
        m34753a(objArr.length, i, i2);
        return new C9376V(objArr, i, i2, 1040);
    }
}
