package p342j$.util.stream;

import java.util.EnumMap;
import java.util.Map;
import p342j$.util.C9371P;
import p342j$.util.C9381a;

/* renamed from: j$.util.stream.V2 */
enum C9607V2 {
    DISTINCT(0, r2),
    SORTED(1, r6),
    ORDERED(2, r8),
    SIZED(3, r11),
    SHORT_CIRCUIT(12, r14);
    

    /* renamed from: f */
    static final int f26298f = 0;

    /* renamed from: g */
    static final int f26299g = 0;

    /* renamed from: h */
    static final int f26300h = 0;

    /* renamed from: i */
    private static final int f26301i = 0;

    /* renamed from: j */
    private static final int f26302j = 0;

    /* renamed from: k */
    private static final int f26303k = 0;

    /* renamed from: l */
    static final int f26304l = 0;

    /* renamed from: m */
    static final int f26305m = 0;

    /* renamed from: n */
    static final int f26306n = 0;

    /* renamed from: o */
    static final int f26307o = 0;

    /* renamed from: p */
    static final int f26308p = 0;

    /* renamed from: q */
    static final int f26309q = 0;

    /* renamed from: r */
    static final int f26310r = 0;

    /* renamed from: s */
    static final int f26311s = 0;

    /* renamed from: t */
    static final int f26312t = 0;

    /* renamed from: u */
    static final int f26313u = 0;

    /* renamed from: a */
    private final Map f26315a;

    /* renamed from: b */
    private final int f26316b;

    /* renamed from: c */
    private final int f26317c;

    /* renamed from: d */
    private final int f26318d;

    /* renamed from: e */
    private final int f26319e;

    static {
        C9603U2 u2;
        C9603U2 u22;
        C9603U2 u23;
        int i;
        C9603U2 u24;
        C9603U2 u25;
        f26298f = m35303c(u2);
        f26299g = m35303c(u22);
        f26300h = m35303c(u23);
        m35303c(u24);
        m35303c(u25);
        int i2 = 0;
        for (C9607V2 v2 : values()) {
            i2 |= v2.f26319e;
        }
        f26301i = i2;
        int i3 = f26299g;
        f26302j = i3;
        int i4 = i3 << 1;
        f26303k = i4;
        f26304l = i3 | i4;
        C9607V2 v22 = DISTINCT;
        f26305m = v22.f26317c;
        f26306n = v22.f26318d;
        C9607V2 v23 = SORTED;
        f26307o = v23.f26317c;
        f26308p = v23.f26318d;
        C9607V2 v24 = ORDERED;
        f26309q = v24.f26317c;
        f26310r = v24.f26318d;
        C9607V2 v25 = SIZED;
        f26311s = v25.f26317c;
        f26312t = v25.f26318d;
        f26313u = SHORT_CIRCUIT.f26317c;
    }

    private C9607V2(int i, C9599T2 t2) {
        C9603U2[] values = C9603U2.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            Map map = t2.f26281a;
            if (i2 < length) {
                C9381a.m34643H(map, values[i2], 0);
                i2++;
            } else {
                this.f26315a = map;
                int i3 = i * 2;
                this.f26316b = i3;
                this.f26317c = 1 << i3;
                this.f26318d = 2 << i3;
                this.f26319e = 3 << i3;
                return;
            }
        }
    }

    /* renamed from: a */
    static int m35302a(int i, int i2) {
        return i | (i2 & (i == 0 ? f26301i : ~(((f26302j & i) << 1) | i | ((f26303k & i) >> 1))));
    }

    /* renamed from: c */
    private static int m35303c(C9603U2 u2) {
        int i = 0;
        for (C9607V2 v2 : values()) {
            i |= ((Integer) v2.f26315a.get(u2)).intValue() << v2.f26316b;
        }
        return i;
    }

    /* renamed from: e */
    static int m35304e(C9371P p) {
        int characteristics = p.characteristics();
        int i = characteristics & 4;
        int i2 = f26298f;
        return (i == 0 || p.getComparator() == null) ? characteristics & i2 : characteristics & i2 & -5;
    }

    /* renamed from: i */
    private static C9599T2 m35305i(C9603U2 u2) {
        C9599T2 t2 = new C9599T2(new EnumMap(C9603U2.class));
        t2.mo26007a(u2);
        return t2;
    }

    /* renamed from: j */
    static int m35306j(int i) {
        return i & ((~i) >> 1) & f26302j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo26013f(int i) {
        return (i & this.f26319e) == this.f26317c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo26014h(int i) {
        int i2 = this.f26319e;
        return (i & i2) == i2;
    }
}
