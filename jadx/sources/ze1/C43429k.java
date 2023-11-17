package ze1;

import kotlin.jvm.internal.C41536l;
import ze1.C43417c;

/* renamed from: ze1.k */
abstract class C43429k extends C43428j {
    /* renamed from: c */
    public static float m124584c(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    /* renamed from: d */
    public static int m124585d(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: e */
    public static long m124586e(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: f */
    public static float m124587f(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    /* renamed from: g */
    public static int m124588g(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: h */
    public static long m124589h(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: i */
    public static int m124590i(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: j */
    public static long m124591j(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    /* renamed from: k */
    public static C43417c m124592k(int i, int i2) {
        return C43417c.f101274g.mo102114a(i, i2, -1);
    }

    /* renamed from: l */
    public static boolean m124593l(C43414a aVar, long j) {
        C41536l.m120489i(aVar, "<this>");
        Integer n = m124595n(j);
        if (n != null) {
            return aVar.mo102099c(n);
        }
        return false;
    }

    /* renamed from: m */
    public static C43417c m124594m(C43417c cVar, int i) {
        boolean z;
        C41536l.m120489i(cVar, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C43428j.m124582a(z, Integer.valueOf(i));
        C43417c.C43418a aVar = C43417c.f101274g;
        int j = cVar.mo102109j();
        int l = cVar.mo102110l();
        if (cVar.mo102111n() <= 0) {
            i = -i;
        }
        return aVar.mo102114a(j, l, i);
    }

    /* renamed from: n */
    public static final Integer m124595n(long j) {
        if (new C43425h(-2147483648L, 2147483647L).mo102128r(j)) {
            return Integer.valueOf((int) j);
        }
        return null;
    }

    /* renamed from: o */
    public static C43420e m124596o(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C43420e.f101282h.mo102119a();
        }
        return new C43420e(i, i2 - 1);
    }

    /* renamed from: p */
    public static C43425h m124597p(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return C43425h.f101292h.mo102132a();
        }
        return new C43425h((long) i, j - 1);
    }
}
