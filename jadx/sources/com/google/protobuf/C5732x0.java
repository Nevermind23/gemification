package com.google.protobuf;

import java.util.List;

/* renamed from: com.google.protobuf.x0 */
abstract class C5732x0 {

    /* renamed from: a */
    private static final Class f18101a = m23101z();

    /* renamed from: b */
    private static final C5636b1 f18102b = m23048A(false);

    /* renamed from: c */
    private static final C5636b1 f18103c = m23048A(true);

    /* renamed from: d */
    private static final C5636b1 f18104d = new C5642d1();

    /* renamed from: A */
    private static C5636b1 m23048A(boolean z) {
        try {
            Class B = m23049B();
            if (B == null) {
                return null;
            }
            return (C5636b1) B.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: B */
    private static Class m23049B() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    static void m23050C(C5693k kVar, Object obj, Object obj2) {
        C5699n b = kVar.mo18712b(obj2);
        if (!b.mo18733j()) {
            kVar.mo18713c(obj).mo18737p(b);
        }
    }

    /* renamed from: D */
    static void m23051D(C5638c0 c0Var, Object obj, Object obj2, long j) {
        C5660f1.m22589R(obj, j, c0Var.mo18556a(C5660f1.m22574C(obj, j), C5660f1.m22574C(obj2, j)));
    }

    /* renamed from: E */
    static void m23052E(C5636b1 b1Var, Object obj, Object obj2) {
        b1Var.mo18540f(obj, b1Var.mo18539e(b1Var.mo18535a(obj), b1Var.mo18535a(obj2)));
    }

    /* renamed from: F */
    public static C5636b1 m23053F() {
        return f18102b;
    }

    /* renamed from: G */
    public static C5636b1 m23054G() {
        return f18103c;
    }

    /* renamed from: H */
    public static void m23055H(Class cls) {
        Class cls2;
        if (!C5709q.class.isAssignableFrom(cls) && (cls2 = f18101a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* renamed from: I */
    static boolean m23056I(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: J */
    public static C5636b1 m23057J() {
        return f18104d;
    }

    /* renamed from: K */
    public static void m23058K(int i, List list, C5689i1 i1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18668F(i, list, z);
        }
    }

    /* renamed from: L */
    public static void m23059L(int i, List list, C5689i1 i1Var) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18677O(i, list);
        }
    }

    /* renamed from: M */
    public static void m23060M(int i, List list, C5689i1 i1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18675M(i, list, z);
        }
    }

    /* renamed from: N */
    public static void m23061N(int i, List list, C5689i1 i1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18694q(i, list, z);
        }
    }

    /* renamed from: O */
    public static void m23062O(int i, List list, C5689i1 i1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18690m(i, list, z);
        }
    }

    /* renamed from: P */
    public static void m23063P(int i, List list, C5689i1 i1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18666D(i, list, z);
        }
    }

    /* renamed from: Q */
    public static void m23064Q(int i, List list, C5689i1 i1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18679b(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m23065R(int i, List list, C5689i1 i1Var, C5728v0 v0Var) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18695r(i, list, v0Var);
        }
    }

    /* renamed from: S */
    public static void m23066S(int i, List list, C5689i1 i1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18685h(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m23067T(int i, List list, C5689i1 i1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18674L(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m23068U(int i, List list, C5689i1 i1Var, C5728v0 v0Var) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18678a(i, list, v0Var);
        }
    }

    /* renamed from: V */
    public static void m23069V(int i, List list, C5689i1 i1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18667E(i, list, z);
        }
    }

    /* renamed from: W */
    public static void m23070W(int i, List list, C5689i1 i1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18698u(i, list, z);
        }
    }

    /* renamed from: X */
    public static void m23071X(int i, List list, C5689i1 i1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18672J(i, list, z);
        }
    }

    /* renamed from: Y */
    public static void m23072Y(int i, List list, C5689i1 i1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18692o(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m23073Z(int i, List list, C5689i1 i1Var) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18682e(i, list);
        }
    }

    /* renamed from: a */
    static int m23074a(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m22319O(i) + CodedOutputStream.m22351z(size);
        }
        return size * CodedOutputStream.m22329d(i, true);
    }

    /* renamed from: a0 */
    public static void m23075a0(int i, List list, C5689i1 i1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18691n(i, list, z);
        }
    }

    /* renamed from: b */
    static int m23076b(List list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m23077b0(int i, List list, C5689i1 i1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            i1Var.mo18699v(i, list, z);
        }
    }

    /* renamed from: c */
    static int m23078c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O = size * CodedOutputStream.m22319O(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            O += CodedOutputStream.m22333h((C5648f) list.get(i2));
        }
        return O;
    }

    /* renamed from: d */
    static int m23079d(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = m23080e(list);
        if (z) {
            return CodedOutputStream.m22319O(i) + CodedOutputStream.m22351z(e);
        }
        return e + (size * CodedOutputStream.m22319O(i));
    }

    /* renamed from: e */
    static int m23080e(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5714r) {
            C5714r rVar = (C5714r) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m22337l(rVar.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m22337l(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    static int m23081f(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m22319O(i) + CodedOutputStream.m22351z(size * 4);
        }
        return size * CodedOutputStream.m22338m(i, 0);
    }

    /* renamed from: g */
    static int m23082g(List list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    static int m23083h(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m22319O(i) + CodedOutputStream.m22351z(size * 8);
        }
        return size * CodedOutputStream.m22340o(i, 0);
    }

    /* renamed from: i */
    static int m23084i(List list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    static int m23085j(int i, List list, C5728v0 v0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m22344s(i, (C5677h0) list.get(i3), v0Var);
        }
        return i2;
    }

    /* renamed from: k */
    static int m23086k(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = m23087l(list);
        if (z) {
            return CodedOutputStream.m22319O(i) + CodedOutputStream.m22351z(l);
        }
        return l + (size * CodedOutputStream.m22319O(i));
    }

    /* renamed from: l */
    static int m23087l(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5714r) {
            C5714r rVar = (C5714r) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m22348w(rVar.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m22348w(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    static int m23088m(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = m23089n(list);
        if (z) {
            return CodedOutputStream.m22319O(i) + CodedOutputStream.m22351z(n);
        }
        return n + (list.size() * CodedOutputStream.m22319O(i));
    }

    /* renamed from: n */
    static int m23089n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.m22350y(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    /* renamed from: o */
    static int m23090o(int i, Object obj, C5728v0 v0Var) {
        return CodedOutputStream.m22305A(i, (C5677h0) obj, v0Var);
    }

    /* renamed from: p */
    static int m23091p(int i, List list, C5728v0 v0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O = CodedOutputStream.m22319O(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            O += CodedOutputStream.m22307C((C5677h0) list.get(i2), v0Var);
        }
        return O;
    }

    /* renamed from: q */
    static int m23092q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = m23093r(list);
        if (z) {
            return CodedOutputStream.m22319O(i) + CodedOutputStream.m22351z(r);
        }
        return r + (size * CodedOutputStream.m22319O(i));
    }

    /* renamed from: r */
    static int m23093r(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5714r) {
            C5714r rVar = (C5714r) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m22314J(rVar.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m22314J(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    static int m23094s(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = m23095t(list);
        if (z) {
            return CodedOutputStream.m22319O(i) + CodedOutputStream.m22351z(t);
        }
        return t + (size * CodedOutputStream.m22319O(i));
    }

    /* renamed from: t */
    static int m23095t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.m22316L(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    /* renamed from: u */
    static int m23096u(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int O = CodedOutputStream.m22319O(i) * size;
        if (list instanceof C5731x) {
            C5731x xVar = (C5731x) list;
            while (i4 < size) {
                Object z1 = xVar.mo18586z1(i4);
                if (z1 instanceof C5648f) {
                    i3 = CodedOutputStream.m22333h((C5648f) z1);
                } else {
                    i3 = CodedOutputStream.m22318N((String) z1);
                }
                O += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C5648f) {
                    i2 = CodedOutputStream.m22333h((C5648f) obj);
                } else {
                    i2 = CodedOutputStream.m22318N((String) obj);
                }
                O += i2;
                i4++;
            }
        }
        return O;
    }

    /* renamed from: v */
    static int m23097v(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = m23098w(list);
        if (z) {
            return CodedOutputStream.m22319O(i) + CodedOutputStream.m22351z(w);
        }
        return w + (size * CodedOutputStream.m22319O(i));
    }

    /* renamed from: w */
    static int m23098w(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5714r) {
            C5714r rVar = (C5714r) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m22321Q(rVar.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m22321Q(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    static int m23099x(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = m23100y(list);
        if (z) {
            return CodedOutputStream.m22319O(i) + CodedOutputStream.m22351z(y);
        }
        return y + (size * CodedOutputStream.m22319O(i));
    }

    /* renamed from: y */
    static int m23100y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.m22323S(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    /* renamed from: z */
    private static Class m23101z() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }
}
