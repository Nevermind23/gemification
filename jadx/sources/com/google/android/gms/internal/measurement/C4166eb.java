package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.eb */
abstract class C4166eb {

    /* renamed from: a */
    private static final Class f13214a;

    /* renamed from: b */
    private static final C4217hb f13215b = m15766x(false);

    /* renamed from: c */
    private static final C4217hb f13216c = m15766x(true);

    /* renamed from: d */
    private static final C4217hb f13217d = new C4251jb();

    /* renamed from: e */
    public static final /* synthetic */ int f13218e = 0;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f13214a = cls;
    }

    /* renamed from: A */
    static int m15719A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15720B(list) + (size * C4096a9.m15484y(i << 3));
    }

    /* renamed from: B */
    static int m15720B(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4368q9) {
            C4368q9 q9Var = (C4368q9) list;
            i = 0;
            while (i2 < size) {
                i += C4096a9.m15481v(q9Var.mo13495c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4096a9.m15481v(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: C */
    static int m15721C(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C4096a9.m15484y(i << 3) + 4);
    }

    /* renamed from: D */
    static int m15722D(List list) {
        return list.size() * 4;
    }

    /* renamed from: E */
    static int m15723E(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C4096a9.m15484y(i << 3) + 8);
    }

    /* renamed from: F */
    static int m15724F(List list) {
        return list.size() * 8;
    }

    /* renamed from: G */
    static int m15725G(int i, List list, C4132cb cbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C4096a9.m15480u(i, (C4386ra) list.get(i3), cbVar);
        }
        return i2;
    }

    /* renamed from: H */
    static int m15726H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15727I(list) + (size * C4096a9.m15484y(i << 3));
    }

    /* renamed from: I */
    static int m15727I(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4368q9) {
            C4368q9 q9Var = (C4368q9) list;
            i = 0;
            while (i2 < size) {
                i += C4096a9.m15481v(q9Var.mo13495c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4096a9.m15481v(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: J */
    static int m15728J(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m15729K(list) + (list.size() * C4096a9.m15484y(i << 3));
    }

    /* renamed from: K */
    static int m15729K(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4199ga) {
            C4199ga gaVar = (C4199ga) list;
            i = 0;
            while (i2 < size) {
                i += C4096a9.m15485z(gaVar.mo13150d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4096a9.m15485z(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: L */
    static int m15730L(int i, Object obj, C4132cb cbVar) {
        return C4096a9.m15484y(i << 3) + C4096a9.m15482w((C4386ra) obj, cbVar);
    }

    /* renamed from: M */
    static int m15731M(int i, List list, C4132cb cbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = C4096a9.m15484y(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            y += C4096a9.m15482w((C4386ra) list.get(i2), cbVar);
        }
        return y;
    }

    /* renamed from: N */
    static int m15732N(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15733O(list) + (size * C4096a9.m15484y(i << 3));
    }

    /* renamed from: O */
    static int m15733O(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4368q9) {
            C4368q9 q9Var = (C4368q9) list;
            i = 0;
            while (i2 < size) {
                int c = q9Var.mo13495c(i2);
                i += C4096a9.m15484y((c >> 31) ^ (c + c));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + C4096a9.m15484y((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: P */
    static int m15734P(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15735Q(list) + (size * C4096a9.m15484y(i << 3));
    }

    /* renamed from: Q */
    static int m15735Q(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4199ga) {
            C4199ga gaVar = (C4199ga) list;
            i = 0;
            while (i2 < size) {
                long d = gaVar.mo13150d(i2);
                i += C4096a9.m15485z((d >> 63) ^ (d + d));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + C4096a9.m15485z((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: R */
    static int m15736R(int i, List list) {
        int x;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int i3 = C4096a9.f13141d;
        boolean z = list instanceof C4518z9;
        int y = C4096a9.m15484y(i << 3) * size;
        if (z) {
            C4518z9 z9Var = (C4518z9) list;
            while (i2 < size) {
                Object Q = z9Var.mo13366Q(i2);
                if (Q instanceof C4418t8) {
                    int g = ((C4418t8) Q).mo13355g();
                    y += C4096a9.m15484y(g) + g;
                } else {
                    y += C4096a9.m15483x((String) Q);
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof C4418t8) {
                    int g2 = ((C4418t8) obj).mo13355g();
                    x = y + C4096a9.m15484y(g2) + g2;
                } else {
                    x = y + C4096a9.m15483x((String) obj);
                }
                i2++;
            }
        }
        return y;
    }

    /* renamed from: S */
    static int m15737S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15738T(list) + (size * C4096a9.m15484y(i << 3));
    }

    /* renamed from: T */
    static int m15738T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4368q9) {
            C4368q9 q9Var = (C4368q9) list;
            i = 0;
            while (i2 < size) {
                i += C4096a9.m15484y(q9Var.mo13495c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4096a9.m15484y(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m15739U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m15740V(list) + (size * C4096a9.m15484y(i << 3));
    }

    /* renamed from: V */
    static int m15740V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4199ga) {
            C4199ga gaVar = (C4199ga) list;
            i = 0;
            while (i2 < size) {
                i += C4096a9.m15485z(gaVar.mo13150d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4096a9.m15485z(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    public static C4217hb m15741W() {
        return f13215b;
    }

    /* renamed from: X */
    public static C4217hb m15742X() {
        return f13216c;
    }

    /* renamed from: a */
    public static C4217hb m15743a() {
        return f13217d;
    }

    /* renamed from: b */
    static Object m15744b(Object obj, int i, int i2, Object obj2, C4217hb hbVar) {
        if (obj2 == null) {
            obj2 = hbVar.mo13213c(obj);
        }
        hbVar.mo13216f(obj2, i, (long) i2);
        return obj2;
    }

    /* renamed from: c */
    static void m15745c(C4217hb hbVar, Object obj, Object obj2) {
        hbVar.mo13218h(obj, hbVar.mo13215e(hbVar.mo13214d(obj), hbVar.mo13214d(obj2)));
    }

    /* renamed from: d */
    public static void m15746d(Class cls) {
        Class cls2;
        if (!C4351p9.class.isAssignableFrom(cls) && (cls2 = f13214a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: e */
    public static void m15747e(int i, List list, C4504yb ybVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12929g(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m15748f(int i, List list, C4504yb ybVar) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12924b(i, list);
        }
    }

    /* renamed from: g */
    public static void m15749g(int i, List list, C4504yb ybVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12919G(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m15750h(int i, List list, C4504yb ybVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12913A(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m15751i(int i, List list, C4504yb ybVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12947y(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m15752j(int i, List list, C4504yb ybVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12934l(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m15753k(int i, List list, C4504yb ybVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12939q(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m15754l(int i, List list, C4504yb ybVar, C4132cb cbVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C4113b9) ybVar).mo12923a(i, list.get(i2), cbVar);
            }
        }
    }

    /* renamed from: m */
    public static void m15755m(int i, List list, C4504yb ybVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12930h(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m15756n(int i, List list, C4504yb ybVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12917E(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m15757o(int i, List list, C4504yb ybVar, C4132cb cbVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C4113b9) ybVar).mo12933k(i, list.get(i2), cbVar);
            }
        }
    }

    /* renamed from: p */
    public static void m15758p(int i, List list, C4504yb ybVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12918F(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m15759q(int i, List list, C4504yb ybVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12943u(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m15760r(int i, List list, C4504yb ybVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12916D(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m15761s(int i, List list, C4504yb ybVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12922J(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m15762t(int i, List list, C4504yb ybVar) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12914B(i, list);
        }
    }

    /* renamed from: u */
    public static void m15763u(int i, List list, C4504yb ybVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12946x(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m15764v(int i, List list, C4504yb ybVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            ybVar.mo12936n(i, list, z);
        }
    }

    /* renamed from: w */
    static boolean m15765w(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* renamed from: x */
    private static C4217hb m15766x(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C4217hb) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: y */
    static int m15767y(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C4096a9.m15484y(i << 3) + 1);
    }

    /* renamed from: z */
    static int m15768z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = size * C4096a9.m15484y(i << 3);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int g = ((C4418t8) list.get(i2)).mo13355g();
            y += C4096a9.m15484y(g) + g;
        }
        return y;
    }
}
