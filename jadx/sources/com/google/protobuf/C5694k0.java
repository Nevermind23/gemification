package com.google.protobuf;

import android.support.p013v4.media.session.C0125b;
import com.google.protobuf.C5679h1;
import com.google.protobuf.C5689i1;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.k0 */
final class C5694k0 implements C5728v0 {

    /* renamed from: r */
    private static final int[] f17949r = new int[0];

    /* renamed from: s */
    private static final Unsafe f17950s = C5660f1.m22575D();

    /* renamed from: a */
    private final int[] f17951a;

    /* renamed from: b */
    private final Object[] f17952b;

    /* renamed from: c */
    private final int f17953c;

    /* renamed from: d */
    private final int f17954d;

    /* renamed from: e */
    private final C5677h0 f17955e;

    /* renamed from: f */
    private final boolean f17956f;

    /* renamed from: g */
    private final boolean f17957g;

    /* renamed from: h */
    private final boolean f17958h;

    /* renamed from: i */
    private final boolean f17959i;

    /* renamed from: j */
    private final int[] f17960j;

    /* renamed from: k */
    private final int f17961k;

    /* renamed from: l */
    private final int f17962l;

    /* renamed from: m */
    private final C5698m0 f17963m;

    /* renamed from: n */
    private final C5733y f17964n;

    /* renamed from: o */
    private final C5636b1 f17965o;

    /* renamed from: p */
    private final C5693k f17966p;

    /* renamed from: q */
    private final C5638c0 f17967q;

    private C5694k0(int[] iArr, Object[] objArr, int i, int i2, C5677h0 h0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C5698m0 m0Var, C5733y yVar, C5636b1 b1Var, C5693k kVar, C5638c0 c0Var) {
        boolean z3;
        this.f17951a = iArr;
        this.f17952b = objArr;
        this.f17953c = i;
        this.f17954d = i2;
        this.f17957g = h0Var instanceof C5709q;
        this.f17958h = z;
        if (kVar == null || !kVar.mo18714d(h0Var)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f17956f = z3;
        this.f17959i = z2;
        this.f17960j = iArr2;
        this.f17961k = i3;
        this.f17962l = i4;
        this.f17963m = m0Var;
        this.f17964n = yVar;
        this.f17965o = b1Var;
        this.f17966p = kVar;
        this.f17955e = h0Var;
        this.f17967q = c0Var;
    }

    /* renamed from: A */
    private boolean m22818A(Object obj, Object obj2, int i) {
        long S = (long) (m22836S(i) & 1048575);
        if (C5660f1.m22617z(obj, S) == C5660f1.m22617z(obj2, S)) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    private boolean m22819B(Object obj, int i, int i2) {
        if (C5660f1.m22617z(obj, (long) (m22836S(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    private static boolean m22820C(int i) {
        return (i & 268435456) != 0;
    }

    /* renamed from: D */
    private static List m22821D(Object obj, long j) {
        return (List) C5660f1.m22574C(obj, j);
    }

    /* renamed from: E */
    private static long m22822E(Object obj, long j) {
        return C5660f1.m22572A(obj, j);
    }

    /* renamed from: F */
    private void m22823F(Object obj, Object obj2, int i) {
        if (m22860u(obj2, i)) {
            long M = m22830M(m22841X(i));
            Unsafe unsafe = f17950s;
            Object object = unsafe.getObject(obj2, M);
            if (object != null) {
                C5728v0 p = m22855p(i);
                if (!m22860u(obj, i)) {
                    if (!m22865z(object)) {
                        unsafe.putObject(obj, M, object);
                    } else {
                        Object f = p.mo18722f();
                        p.mo18717a(f, object);
                        unsafe.putObject(obj, M, f);
                    }
                    m22838U(obj, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, M);
                if (!m22865z(object2)) {
                    Object f2 = p.mo18722f();
                    p.mo18717a(f2, object2);
                    unsafe.putObject(obj, M, f2);
                    object2 = f2;
                }
                p.mo18717a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + m22829L(i) + " is present but null: " + obj2);
        }
    }

    /* renamed from: G */
    private void m22824G(Object obj, Object obj2, int i) {
        int L = m22829L(i);
        if (m22819B(obj2, L, i)) {
            long M = m22830M(m22841X(i));
            Unsafe unsafe = f17950s;
            Object object = unsafe.getObject(obj2, M);
            if (object != null) {
                C5728v0 p = m22855p(i);
                if (!m22819B(obj, L, i)) {
                    if (!m22865z(object)) {
                        unsafe.putObject(obj, M, object);
                    } else {
                        Object f = p.mo18722f();
                        p.mo18717a(f, object);
                        unsafe.putObject(obj, M, f);
                    }
                    m22839V(obj, L, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, M);
                if (!m22865z(object2)) {
                    Object f2 = p.mo18722f();
                    p.mo18717a(f2, object2);
                    unsafe.putObject(obj, M, f2);
                    object2 = f2;
                }
                p.mo18717a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + m22829L(i) + " is present but null: " + obj2);
        }
    }

    /* renamed from: H */
    private void m22825H(Object obj, Object obj2, int i) {
        int X = m22841X(i);
        long M = m22830M(X);
        int L = m22829L(i);
        switch (m22840W(X)) {
            case 0:
                if (m22860u(obj2, i)) {
                    C5660f1.m22585N(obj, M, C5660f1.m22615x(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 1:
                if (m22860u(obj2, i)) {
                    C5660f1.m22586O(obj, M, C5660f1.m22616y(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 2:
                if (m22860u(obj2, i)) {
                    C5660f1.m22588Q(obj, M, C5660f1.m22572A(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 3:
                if (m22860u(obj2, i)) {
                    C5660f1.m22588Q(obj, M, C5660f1.m22572A(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 4:
                if (m22860u(obj2, i)) {
                    C5660f1.m22587P(obj, M, C5660f1.m22617z(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 5:
                if (m22860u(obj2, i)) {
                    C5660f1.m22588Q(obj, M, C5660f1.m22572A(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 6:
                if (m22860u(obj2, i)) {
                    C5660f1.m22587P(obj, M, C5660f1.m22617z(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 7:
                if (m22860u(obj2, i)) {
                    C5660f1.m22579H(obj, M, C5660f1.m22609r(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 8:
                if (m22860u(obj2, i)) {
                    C5660f1.m22589R(obj, M, C5660f1.m22574C(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 9:
                m22823F(obj, obj2, i);
                return;
            case 10:
                if (m22860u(obj2, i)) {
                    C5660f1.m22589R(obj, M, C5660f1.m22574C(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 11:
                if (m22860u(obj2, i)) {
                    C5660f1.m22587P(obj, M, C5660f1.m22617z(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 12:
                if (m22860u(obj2, i)) {
                    C5660f1.m22587P(obj, M, C5660f1.m22617z(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 13:
                if (m22860u(obj2, i)) {
                    C5660f1.m22587P(obj, M, C5660f1.m22617z(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 14:
                if (m22860u(obj2, i)) {
                    C5660f1.m22588Q(obj, M, C5660f1.m22572A(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 15:
                if (m22860u(obj2, i)) {
                    C5660f1.m22587P(obj, M, C5660f1.m22617z(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 16:
                if (m22860u(obj2, i)) {
                    C5660f1.m22588Q(obj, M, C5660f1.m22572A(obj2, M));
                    m22838U(obj, i);
                    return;
                }
                return;
            case 17:
                m22823F(obj, obj2, i);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f17964n.mo18817d(obj, obj2, M);
                return;
            case 50:
                C5732x0.m23051D(this.f17967q, obj, obj2, M);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (m22819B(obj2, L, i)) {
                    C5660f1.m22589R(obj, M, C5660f1.m22574C(obj2, M));
                    m22839V(obj, L, i);
                    return;
                }
                return;
            case 60:
                m22824G(obj, obj2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (m22819B(obj2, L, i)) {
                    C5660f1.m22589R(obj, M, C5660f1.m22574C(obj2, M));
                    m22839V(obj, L, i);
                    return;
                }
                return;
            case 68:
                m22824G(obj, obj2, i);
                return;
            default:
                return;
        }
    }

    /* renamed from: I */
    static C5694k0 m22826I(Class cls, C5659f0 f0Var, C5698m0 m0Var, C5733y yVar, C5636b1 b1Var, C5693k kVar, C5638c0 c0Var) {
        if (f0Var instanceof C5726u0) {
            return m22828K((C5726u0) f0Var, m0Var, yVar, b1Var, kVar, c0Var);
        }
        C0125b.m366a(f0Var);
        return m22827J((C5750z0) null, m0Var, yVar, b1Var, kVar, c0Var);
    }

    /* renamed from: J */
    static C5694k0 m22827J(C5750z0 z0Var, C5698m0 m0Var, C5733y yVar, C5636b1 b1Var, C5693k kVar, C5638c0 c0Var) {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x036d  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.protobuf.C5694k0 m22828K(com.google.protobuf.C5726u0 r34, com.google.protobuf.C5698m0 r35, com.google.protobuf.C5733y r36, com.google.protobuf.C5636b1 r37, com.google.protobuf.C5693k r38, com.google.protobuf.C5638c0 r39) {
        /*
            com.google.protobuf.r0 r0 = r34.mo18634c()
            com.google.protobuf.r0 r1 = com.google.protobuf.C5715r0.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = r2
        L_0x000c:
            java.lang.String r0 = r34.mo18801e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0028
            r4 = 1
        L_0x001e:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0029
            r4 = r6
            goto L_0x001e
        L_0x0028:
            r6 = 1
        L_0x0029:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0035:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0045
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0035
        L_0x0045:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0048:
            if (r6 != 0) goto L_0x0058
            int[] r6 = f17949r
            r8 = r2
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0162
        L_0x0058:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0077
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0064:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0074
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0064
        L_0x0074:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0077:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0096
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0083:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0093
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0083
        L_0x0093:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0096:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b5
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a2:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a2
        L_0x00b2:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b5:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c1:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c1
        L_0x00d1:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d4:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f3
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00e0:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00f0
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00e0
        L_0x00f0:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f3:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0112
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ff:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010f
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ff
        L_0x010f:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0112:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0133
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011e:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012f
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011e
        L_0x012f:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0133:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0156
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013f:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0151
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013f
        L_0x0151:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0156:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
        L_0x0162:
            sun.misc.Unsafe r15 = f17950s
            java.lang.Object[] r17 = r34.mo18800d()
            com.google.protobuf.h0 r18 = r34.mo18633b()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 * 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r20 = r14 + r12
            r22 = r14
            r23 = r20
            r12 = 0
            r21 = 0
        L_0x0181:
            if (r4 >= r1) goto L_0x03bd
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01a9
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0191:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a3
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0191
        L_0x01a3:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01ab
        L_0x01a9:
            r3 = r24
        L_0x01ab:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01d8
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01b9:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d2
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01b9
        L_0x01d2:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01dc
        L_0x01d8:
            r28 = r1
            r1 = r24
        L_0x01dc:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01e9
            int r14 = r12 + 1
            r13[r12] = r21
            r12 = r14
        L_0x01e9:
            r14 = 51
            r30 = r12
            if (r5 < r14) goto L_0x0286
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0218
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
        L_0x01fe:
            int r33 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r12) goto L_0x0213
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r32
            r1 = r1 | r12
            int r32 = r32 + 13
            r14 = r33
            r12 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fe
        L_0x0213:
            int r12 = r14 << r32
            r1 = r1 | r12
            r14 = r33
        L_0x0218:
            int r12 = r5 + -51
            r32 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0238
            r14 = 17
            if (r12 != r14) goto L_0x0225
            goto L_0x0238
        L_0x0225:
            r14 = 12
            if (r12 != r14) goto L_0x0246
            if (r10 != 0) goto L_0x0246
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0244
        L_0x0238:
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0244:
            r16 = r14
        L_0x0246:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0251
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0259
        L_0x0251:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m22837T(r2, r12)
            r17[r1] = r12
        L_0x0259:
            r14 = r8
            r33 = r9
            long r8 = r15.objectFieldOffset(r12)
            int r8 = (int) r8
            int r1 = r1 + 1
            r9 = r17[r1]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x026c
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0274
        L_0x026c:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m22837T(r2, r9)
            r17[r1] = r9
        L_0x0274:
            r1 = r8
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r31 = r0
            r9 = r8
            r0 = r10
            r29 = r32
            r25 = 1
            r8 = r1
            r1 = 0
            goto L_0x0386
        L_0x0286:
            r14 = r8
            r33 = r9
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m22837T(r2, r9)
            r12 = 9
            if (r5 == r12) goto L_0x02fe
            r12 = 17
            if (r5 != r12) goto L_0x029c
            goto L_0x02fe
        L_0x029c:
            r12 = 27
            if (r5 == r12) goto L_0x02ed
            r12 = 49
            if (r5 != r12) goto L_0x02a5
            goto L_0x02ed
        L_0x02a5:
            r12 = 12
            if (r5 == r12) goto L_0x02dc
            r12 = 30
            if (r5 == r12) goto L_0x02dc
            r12 = 44
            if (r5 != r12) goto L_0x02b2
            goto L_0x02dc
        L_0x02b2:
            r12 = 50
            if (r5 != r12) goto L_0x02d2
            int r12 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r22] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02d5
            int r22 = r22 + 1
            int r8 = r27 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02d2:
            r25 = 1
            goto L_0x030c
        L_0x02d5:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x030d
        L_0x02dc:
            if (r10 != 0) goto L_0x02d2
            int r12 = r21 / 3
            int r12 = r12 * 2
            r25 = 1
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02fb
        L_0x02ed:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
        L_0x02fb:
            r12 = r27
            goto L_0x030d
        L_0x02fe:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r27 = r9.getType()
            r11[r12] = r27
        L_0x030c:
            r12 = r8
        L_0x030d:
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r9 = r3 & 4096(0x1000, float:5.74E-42)
            r27 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            if (r9 != r12) goto L_0x031d
            r9 = r25
            goto L_0x031e
        L_0x031d:
            r9 = 0
        L_0x031e:
            if (r9 == 0) goto L_0x036d
            r9 = 17
            if (r5 > r9) goto L_0x036d
            int r9 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0349
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x0333:
            int r29 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r12) goto L_0x0345
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r26
            r1 = r1 | r9
            int r26 = r26 + 13
            r9 = r29
            goto L_0x0333
        L_0x0345:
            int r9 = r9 << r26
            r1 = r1 | r9
            goto L_0x034b
        L_0x0349:
            r29 = r9
        L_0x034b:
            int r9 = r6 * 2
            int r26 = r1 / 32
            int r9 = r9 + r26
            r12 = r17[r9]
            r31 = r0
            boolean r0 = r12 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x035c
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0364
        L_0x035c:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m22837T(r2, r12)
            r17[r9] = r12
        L_0x0364:
            r0 = r10
            long r9 = r15.objectFieldOffset(r12)
            int r9 = (int) r9
            int r1 = r1 % 32
            goto L_0x0376
        L_0x036d:
            r31 = r0
            r0 = r10
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r1
            r1 = 0
        L_0x0376:
            r10 = 18
            if (r5 < r10) goto L_0x0384
            r10 = 49
            if (r5 > r10) goto L_0x0384
            int r10 = r23 + 1
            r13[r23] = r8
            r23 = r10
        L_0x0384:
            r16 = r27
        L_0x0386:
            int r10 = r21 + 1
            r7[r21] = r4
            int r4 = r10 + 1
            r12 = r3 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0393
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0394
        L_0x0393:
            r12 = 0
        L_0x0394:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x039b
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039c
        L_0x039b:
            r3 = 0
        L_0x039c:
            r3 = r3 | r12
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r8
            r7[r10] = r3
            int r21 = r4 + 1
            int r1 = r1 << 20
            r1 = r1 | r9
            r7[r4] = r1
            r10 = r0
            r8 = r14
            r14 = r24
            r1 = r28
            r4 = r29
            r12 = r30
            r0 = r31
            r9 = r33
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0181
        L_0x03bd:
            r33 = r9
            r0 = r10
            r24 = r14
            r14 = r8
            com.google.protobuf.k0 r1 = new com.google.protobuf.k0
            com.google.protobuf.h0 r9 = r34.mo18633b()
            r2 = 0
            r4 = r1
            r5 = r7
            r6 = r11
            r7 = r14
            r8 = r33
            r11 = r2
            r12 = r13
            r13 = r24
            r14 = r20
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5694k0.m22828K(com.google.protobuf.u0, com.google.protobuf.m0, com.google.protobuf.y, com.google.protobuf.b1, com.google.protobuf.k, com.google.protobuf.c0):com.google.protobuf.k0");
    }

    /* renamed from: L */
    private int m22829L(int i) {
        return this.f17951a[i];
    }

    /* renamed from: M */
    private static long m22830M(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: N */
    private static boolean m22831N(Object obj, long j) {
        return ((Boolean) C5660f1.m22574C(obj, j)).booleanValue();
    }

    /* renamed from: O */
    private static double m22832O(Object obj, long j) {
        return ((Double) C5660f1.m22574C(obj, j)).doubleValue();
    }

    /* renamed from: P */
    private static float m22833P(Object obj, long j) {
        return ((Float) C5660f1.m22574C(obj, j)).floatValue();
    }

    /* renamed from: Q */
    private static int m22834Q(Object obj, long j) {
        return ((Integer) C5660f1.m22574C(obj, j)).intValue();
    }

    /* renamed from: R */
    private static long m22835R(Object obj, long j) {
        return ((Long) C5660f1.m22574C(obj, j)).longValue();
    }

    /* renamed from: S */
    private int m22836S(int i) {
        return this.f17951a[i + 2];
    }

    /* renamed from: T */
    private static Field m22837T(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: U */
    private void m22838U(Object obj, int i) {
        int S = m22836S(i);
        long j = (long) (1048575 & S);
        if (j != 1048575) {
            C5660f1.m22587P(obj, j, (1 << (S >>> 20)) | C5660f1.m22617z(obj, j));
        }
    }

    /* renamed from: V */
    private void m22839V(Object obj, int i, int i2) {
        C5660f1.m22587P(obj, (long) (m22836S(i2) & 1048575), i);
    }

    /* renamed from: W */
    private static int m22840W(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: X */
    private int m22841X(int i) {
        return this.f17951a[i + 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22842Y(java.lang.Object r18, com.google.protobuf.C5689i1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f17956f
            if (r3 == 0) goto L_0x0021
            com.google.protobuf.k r3 = r0.f17966p
            com.google.protobuf.n r3 = r3.mo18712b(r1)
            boolean r5 = r3.mo18733j()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo18735n()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f17951a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f17950s
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r8
            r10 = 0
            r12 = 0
        L_0x002e:
            if (r10 >= r6) goto L_0x048d
            int r13 = r0.m22841X(r10)
            int r14 = r0.m22829L(r10)
            int r15 = m22840W(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0056
            int[] r4 = r0.f17951a
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L_0x0050
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L_0x0050:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            if (r5 == 0) goto L_0x0075
            com.google.protobuf.k r9 = r0.f17966p
            int r9 = r9.mo18711a(r5)
            if (r9 > r14) goto L_0x0075
            com.google.protobuf.k r9 = r0.f17966p
            r9.mo18716f(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0057
        L_0x0073:
            r5 = 0
            goto L_0x0057
        L_0x0075:
            long r8 = m22830M(r13)
            switch(r15) {
                case 0: goto L_0x047b;
                case 1: goto L_0x046f;
                case 2: goto L_0x0463;
                case 3: goto L_0x0457;
                case 4: goto L_0x044b;
                case 5: goto L_0x043f;
                case 6: goto L_0x0433;
                case 7: goto L_0x0427;
                case 8: goto L_0x041b;
                case 9: goto L_0x040a;
                case 10: goto L_0x03fb;
                case 11: goto L_0x03ee;
                case 12: goto L_0x03e1;
                case 13: goto L_0x03d4;
                case 14: goto L_0x03c7;
                case 15: goto L_0x03ba;
                case 16: goto L_0x03ad;
                case 17: goto L_0x039c;
                case 18: goto L_0x038c;
                case 19: goto L_0x037c;
                case 20: goto L_0x036c;
                case 21: goto L_0x035c;
                case 22: goto L_0x034c;
                case 23: goto L_0x033c;
                case 24: goto L_0x032c;
                case 25: goto L_0x031c;
                case 26: goto L_0x030d;
                case 27: goto L_0x02fa;
                case 28: goto L_0x02eb;
                case 29: goto L_0x02db;
                case 30: goto L_0x02cb;
                case 31: goto L_0x02bb;
                case 32: goto L_0x02ab;
                case 33: goto L_0x029b;
                case 34: goto L_0x028b;
                case 35: goto L_0x027b;
                case 36: goto L_0x026b;
                case 37: goto L_0x025b;
                case 38: goto L_0x024b;
                case 39: goto L_0x023b;
                case 40: goto L_0x022b;
                case 41: goto L_0x021b;
                case 42: goto L_0x020b;
                case 43: goto L_0x01fb;
                case 44: goto L_0x01eb;
                case 45: goto L_0x01db;
                case 46: goto L_0x01cb;
                case 47: goto L_0x01bb;
                case 48: goto L_0x01ab;
                case 49: goto L_0x0198;
                case 50: goto L_0x018f;
                case 51: goto L_0x0180;
                case 52: goto L_0x0171;
                case 53: goto L_0x0162;
                case 54: goto L_0x0153;
                case 55: goto L_0x0144;
                case 56: goto L_0x0135;
                case 57: goto L_0x0126;
                case 58: goto L_0x0117;
                case 59: goto L_0x0108;
                case 60: goto L_0x00f5;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d7;
                case 63: goto L_0x00c9;
                case 64: goto L_0x00bb;
                case 65: goto L_0x00ad;
                case 66: goto L_0x009f;
                case 67: goto L_0x0091;
                case 68: goto L_0x007f;
                default: goto L_0x007c;
            }
        L_0x007c:
            r13 = 0
            goto L_0x0486
        L_0x007f:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.v0 r8 = r0.m22855p(r10)
            r2.mo18686i(r14, r4, r8)
            goto L_0x007c
        L_0x0091:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m22835R(r1, r8)
            r2.mo18693p(r14, r8)
            goto L_0x007c
        L_0x009f:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m22834Q(r1, r8)
            r2.mo18676N(r14, r4)
            goto L_0x007c
        L_0x00ad:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m22835R(r1, r8)
            r2.mo18689l(r14, r8)
            goto L_0x007c
        L_0x00bb:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m22834Q(r1, r8)
            r2.mo18664B(r14, r4)
            goto L_0x007c
        L_0x00c9:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m22834Q(r1, r8)
            r2.mo18673K(r14, r4)
            goto L_0x007c
        L_0x00d7:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m22834Q(r1, r8)
            r2.mo18696s(r14, r4)
            goto L_0x007c
        L_0x00e5:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.f r4 = (com.google.protobuf.C5648f) r4
            r2.mo18687j(r14, r4)
            goto L_0x007c
        L_0x00f5:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.v0 r8 = r0.m22855p(r10)
            r2.mo18700w(r14, r4, r8)
            goto L_0x007c
        L_0x0108:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.m22846c0(r14, r4, r2)
            goto L_0x007c
        L_0x0117:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            boolean r4 = m22831N(r1, r8)
            r2.mo18663A(r14, r4)
            goto L_0x007c
        L_0x0126:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m22834Q(r1, r8)
            r2.mo18681d(r14, r4)
            goto L_0x007c
        L_0x0135:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m22835R(r1, r8)
            r2.mo18701x(r14, r8)
            goto L_0x007c
        L_0x0144:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m22834Q(r1, r8)
            r2.mo18688k(r14, r4)
            goto L_0x007c
        L_0x0153:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m22835R(r1, r8)
            r2.mo18684g(r14, r8)
            goto L_0x007c
        L_0x0162:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m22835R(r1, r8)
            r2.mo18703z(r14, r8)
            goto L_0x007c
        L_0x0171:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            float r4 = m22833P(r1, r8)
            r2.mo18670H(r14, r4)
            goto L_0x007c
        L_0x0180:
            boolean r4 = r0.m22819B(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            double r8 = m22832O(r1, r8)
            r2.mo18697t(r14, r8)
            goto L_0x007c
        L_0x018f:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.m22845b0(r2, r14, r4, r10)
            goto L_0x007c
        L_0x0198:
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.v0 r9 = r0.m22855p(r10)
            com.google.protobuf.C5732x0.m23065R(r4, r8, r2, r9)
            goto L_0x007c
        L_0x01ab:
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.protobuf.C5732x0.m23072Y(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01bb:
            r13 = 1
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23071X(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01cb:
            r13 = 1
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23070W(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01db:
            r13 = 1
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23069V(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01eb:
            r13 = 1
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23061N(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01fb:
            r13 = 1
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23075a0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x020b:
            r13 = 1
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23058K(r4, r8, r2, r13)
            goto L_0x007c
        L_0x021b:
            r13 = 1
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23062O(r4, r8, r2, r13)
            goto L_0x007c
        L_0x022b:
            r13 = 1
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23063P(r4, r8, r2, r13)
            goto L_0x007c
        L_0x023b:
            r13 = 1
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23066S(r4, r8, r2, r13)
            goto L_0x007c
        L_0x024b:
            r13 = 1
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23077b0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x025b:
            r13 = 1
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23067T(r4, r8, r2, r13)
            goto L_0x007c
        L_0x026b:
            r13 = 1
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23064Q(r4, r8, r2, r13)
            goto L_0x007c
        L_0x027b:
            r13 = 1
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23060M(r4, r8, r2, r13)
            goto L_0x007c
        L_0x028b:
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.C5732x0.m23072Y(r4, r8, r2, r13)
            goto L_0x0486
        L_0x029b:
            r13 = 0
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23071X(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02ab:
            r13 = 0
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23070W(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02bb:
            r13 = 0
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23069V(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02cb:
            r13 = 0
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23061N(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02db:
            r13 = 0
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23075a0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02eb:
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23059L(r4, r8, r2)
            goto L_0x007c
        L_0x02fa:
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.v0 r9 = r0.m22855p(r10)
            com.google.protobuf.C5732x0.m23068U(r4, r8, r2, r9)
            goto L_0x007c
        L_0x030d:
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23073Z(r4, r8, r2)
            goto L_0x007c
        L_0x031c:
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.C5732x0.m23058K(r4, r8, r2, r13)
            goto L_0x0486
        L_0x032c:
            r13 = 0
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23062O(r4, r8, r2, r13)
            goto L_0x0486
        L_0x033c:
            r13 = 0
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23063P(r4, r8, r2, r13)
            goto L_0x0486
        L_0x034c:
            r13 = 0
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23066S(r4, r8, r2, r13)
            goto L_0x0486
        L_0x035c:
            r13 = 0
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23077b0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x036c:
            r13 = 0
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23067T(r4, r8, r2, r13)
            goto L_0x0486
        L_0x037c:
            r13 = 0
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23064Q(r4, r8, r2, r13)
            goto L_0x0486
        L_0x038c:
            r13 = 0
            int r4 = r0.m22829L(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C5732x0.m23060M(r4, r8, r2, r13)
            goto L_0x0486
        L_0x039c:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.v0 r8 = r0.m22855p(r10)
            r2.mo18686i(r14, r4, r8)
            goto L_0x0486
        L_0x03ad:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo18693p(r14, r8)
            goto L_0x0486
        L_0x03ba:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo18676N(r14, r4)
            goto L_0x0486
        L_0x03c7:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo18689l(r14, r8)
            goto L_0x0486
        L_0x03d4:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo18664B(r14, r4)
            goto L_0x0486
        L_0x03e1:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo18673K(r14, r4)
            goto L_0x0486
        L_0x03ee:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo18696s(r14, r4)
            goto L_0x0486
        L_0x03fb:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.f r4 = (com.google.protobuf.C5648f) r4
            r2.mo18687j(r14, r4)
            goto L_0x0486
        L_0x040a:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.v0 r8 = r0.m22855p(r10)
            r2.mo18700w(r14, r4, r8)
            goto L_0x0486
        L_0x041b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.m22846c0(r14, r4, r2)
            goto L_0x0486
        L_0x0427:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            boolean r4 = m22849j(r1, r8)
            r2.mo18663A(r14, r4)
            goto L_0x0486
        L_0x0433:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo18681d(r14, r4)
            goto L_0x0486
        L_0x043f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo18701x(r14, r8)
            goto L_0x0486
        L_0x044b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo18688k(r14, r4)
            goto L_0x0486
        L_0x0457:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo18684g(r14, r8)
            goto L_0x0486
        L_0x0463:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo18703z(r14, r8)
            goto L_0x0486
        L_0x046f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            float r4 = m22853n(r1, r8)
            r2.mo18670H(r14, r4)
            goto L_0x0486
        L_0x047b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            double r8 = m22851l(r1, r8)
            r2.mo18697t(r14, r8)
        L_0x0486:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x002e
        L_0x048d:
            if (r5 == 0) goto L_0x04a4
            com.google.protobuf.k r4 = r0.f17966p
            r4.mo18716f(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a2
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x048d
        L_0x04a2:
            r5 = 0
            goto L_0x048d
        L_0x04a4:
            com.google.protobuf.b1 r3 = r0.f17965o
            r0.m22847d0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5694k0.m22842Y(java.lang.Object, com.google.protobuf.i1):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22843Z(java.lang.Object r13, com.google.protobuf.C5689i1 r14) {
        /*
            r12 = this;
            boolean r0 = r12.f17956f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.google.protobuf.k r0 = r12.f17966p
            com.google.protobuf.n r0 = r0.mo18712b(r13)
            boolean r2 = r0.mo18733j()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.mo18735n()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f17951a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.m22841X(r5)
            int r7 = r12.m22829L(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            com.google.protobuf.k r8 = r12.f17966p
            int r8 = r8.mo18711a(r2)
            if (r8 > r7) goto L_0x004b
            com.google.protobuf.k r8 = r12.f17966p
            r8.mo18716f(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = m22840W(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0571;
                case 1: goto L_0x055f;
                case 2: goto L_0x054d;
                case 3: goto L_0x053b;
                case 4: goto L_0x0529;
                case 5: goto L_0x0517;
                case 6: goto L_0x0505;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04df;
                case 9: goto L_0x04c8;
                case 10: goto L_0x04b3;
                case 11: goto L_0x04a0;
                case 12: goto L_0x048d;
                case 13: goto L_0x047a;
                case 14: goto L_0x0467;
                case 15: goto L_0x0454;
                case 16: goto L_0x0441;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0582
        L_0x0055:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            com.google.protobuf.v0 r8 = r12.m22855p(r5)
            r14.mo18686i(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            long r8 = m22835R(r13, r8)
            r14.mo18693p(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            int r6 = m22834Q(r13, r8)
            r14.mo18676N(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            long r8 = m22835R(r13, r8)
            r14.mo18689l(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            int r6 = m22834Q(r13, r8)
            r14.mo18664B(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            int r6 = m22834Q(r13, r8)
            r14.mo18673K(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            int r6 = m22834Q(r13, r8)
            r14.mo18696s(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            com.google.protobuf.f r6 = (com.google.protobuf.C5648f) r6
            r14.mo18687j(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            com.google.protobuf.v0 r8 = r12.m22855p(r5)
            r14.mo18700w(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            r12.m22846c0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            boolean r6 = m22831N(r13, r8)
            r14.mo18663A(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            int r6 = m22834Q(r13, r8)
            r14.mo18681d(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            long r8 = m22835R(r13, r8)
            r14.mo18701x(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            int r6 = m22834Q(r13, r8)
            r14.mo18688k(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            long r8 = m22835R(r13, r8)
            r14.mo18684g(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            long r8 = m22835R(r13, r8)
            r14.mo18703z(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            float r6 = m22833P(r13, r8)
            r14.mo18670H(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.m22819B(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            double r8 = m22832O(r13, r8)
            r14.mo18697t(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            r12.m22845b0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.v0 r8 = r12.m22855p(r5)
            com.google.protobuf.C5732x0.m23065R(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.m22829L(r5)
            long r10 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23072Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.m22829L(r5)
            long r10 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23071X(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.m22829L(r5)
            long r10 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23070W(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.m22829L(r5)
            long r10 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23069V(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.m22829L(r5)
            long r10 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23061N(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.m22829L(r5)
            long r10 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23075a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.m22829L(r5)
            long r10 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23058K(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.m22829L(r5)
            long r10 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23062O(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.m22829L(r5)
            long r10 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23063P(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.m22829L(r5)
            long r10 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23066S(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.m22829L(r5)
            long r10 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23077b0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.m22829L(r5)
            long r10 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23067T(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.m22829L(r5)
            long r10 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23064Q(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.m22829L(r5)
            long r10 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23060M(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23072Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23071X(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23070W(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23069V(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23061N(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23075a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23059L(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.v0 r8 = r12.m22855p(r5)
            com.google.protobuf.C5732x0.m23068U(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23073Z(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23058K(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23062O(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23063P(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23066S(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23077b0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23067T(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23064Q(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.m22829L(r5)
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C5732x0.m23060M(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            com.google.protobuf.v0 r8 = r12.m22855p(r5)
            r14.mo18686i(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            long r8 = m22822E(r13, r8)
            r14.mo18693p(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            int r6 = m22859t(r13, r8)
            r14.mo18676N(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            long r8 = m22822E(r13, r8)
            r14.mo18689l(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            int r6 = m22859t(r13, r8)
            r14.mo18664B(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            int r6 = m22859t(r13, r8)
            r14.mo18673K(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            int r6 = m22859t(r13, r8)
            r14.mo18696s(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            com.google.protobuf.f r6 = (com.google.protobuf.C5648f) r6
            r14.mo18687j(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            com.google.protobuf.v0 r8 = r12.m22855p(r5)
            r14.mo18700w(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r13, r8)
            r12.m22846c0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            boolean r6 = m22849j(r13, r8)
            r14.mo18663A(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            int r6 = m22859t(r13, r8)
            r14.mo18681d(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            long r8 = m22822E(r13, r8)
            r14.mo18701x(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            int r6 = m22859t(r13, r8)
            r14.mo18688k(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            long r8 = m22822E(r13, r8)
            r14.mo18684g(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            long r8 = m22822E(r13, r8)
            r14.mo18703z(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            float r6 = m22853n(r13, r8)
            r14.mo18670H(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.m22860u(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m22830M(r6)
            double r8 = m22851l(r13, r8)
            r14.mo18697t(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            com.google.protobuf.k r3 = r12.f17966p
            r3.mo18716f(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            com.google.protobuf.b1 r0 = r12.f17965o
            r12.m22847d0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5694k0.m22843Z(java.lang.Object, com.google.protobuf.i1):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22844a0(java.lang.Object r11, com.google.protobuf.C5689i1 r12) {
        /*
            r10 = this;
            com.google.protobuf.b1 r0 = r10.f17965o
            r10.m22847d0(r0, r11, r12)
            boolean r0 = r10.f17956f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.google.protobuf.k r0 = r10.f17966p
            com.google.protobuf.n r0 = r0.mo18712b(r11)
            boolean r2 = r0.mo18733j()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.mo18728e()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f17951a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.m22841X(r3)
            int r5 = r10.m22829L(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            com.google.protobuf.k r6 = r10.f17966p
            int r6 = r6.mo18711a(r2)
            if (r6 <= r5) goto L_0x0050
            com.google.protobuf.k r6 = r10.f17966p
            r6.mo18716f(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = m22840W(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            com.google.protobuf.v0 r6 = r10.m22855p(r3)
            r12.mo18686i(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            long r6 = m22835R(r11, r6)
            r12.mo18693p(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            int r4 = m22834Q(r11, r6)
            r12.mo18676N(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            long r6 = m22835R(r11, r6)
            r12.mo18689l(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            int r4 = m22834Q(r11, r6)
            r12.mo18664B(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            int r4 = m22834Q(r11, r6)
            r12.mo18673K(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            int r4 = m22834Q(r11, r6)
            r12.mo18696s(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            com.google.protobuf.f r4 = (com.google.protobuf.C5648f) r4
            r12.mo18687j(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            com.google.protobuf.v0 r6 = r10.m22855p(r3)
            r12.mo18700w(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            r10.m22846c0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            boolean r4 = m22831N(r11, r6)
            r12.mo18663A(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            int r4 = m22834Q(r11, r6)
            r12.mo18681d(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            long r6 = m22835R(r11, r6)
            r12.mo18701x(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            int r4 = m22834Q(r11, r6)
            r12.mo18688k(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            long r6 = m22835R(r11, r6)
            r12.mo18684g(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            long r6 = m22835R(r11, r6)
            r12.mo18703z(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            float r4 = m22833P(r11, r6)
            r12.mo18670H(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.m22819B(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            double r6 = m22832O(r11, r6)
            r12.mo18697t(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            r10.m22845b0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.v0 r6 = r10.m22855p(r3)
            com.google.protobuf.C5732x0.m23065R(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.m22829L(r3)
            long r8 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23072Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.m22829L(r3)
            long r8 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23071X(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.m22829L(r3)
            long r8 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23070W(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.m22829L(r3)
            long r8 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23069V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.m22829L(r3)
            long r8 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23061N(r5, r4, r12, r7)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.m22829L(r3)
            long r8 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23075a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.m22829L(r3)
            long r8 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23058K(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.m22829L(r3)
            long r8 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23062O(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.m22829L(r3)
            long r8 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23063P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.m22829L(r3)
            long r8 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23066S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.m22829L(r3)
            long r8 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23077b0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.m22829L(r3)
            long r8 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23067T(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.m22829L(r3)
            long r8 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23064Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.m22829L(r3)
            long r8 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23060M(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23072Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23071X(r5, r4, r12, r8)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23070W(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23069V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23061N(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23075a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23059L(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.v0 r6 = r10.m22855p(r3)
            com.google.protobuf.C5732x0.m23068U(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23073Z(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23058K(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23062O(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23063P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23066S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23077b0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23067T(r5, r4, r12, r8)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23064Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.m22829L(r3)
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C5732x0.m23060M(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            com.google.protobuf.v0 r6 = r10.m22855p(r3)
            r12.mo18686i(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            long r6 = m22822E(r11, r6)
            r12.mo18693p(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            int r4 = m22859t(r11, r6)
            r12.mo18676N(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            long r6 = m22822E(r11, r6)
            r12.mo18689l(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            int r4 = m22859t(r11, r6)
            r12.mo18664B(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            int r4 = m22859t(r11, r6)
            r12.mo18673K(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            int r4 = m22859t(r11, r6)
            r12.mo18696s(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            com.google.protobuf.f r4 = (com.google.protobuf.C5648f) r4
            r12.mo18687j(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            com.google.protobuf.v0 r6 = r10.m22855p(r3)
            r12.mo18700w(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            java.lang.Object r4 = com.google.protobuf.C5660f1.m22574C(r11, r6)
            r10.m22846c0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            boolean r4 = m22849j(r11, r6)
            r12.mo18663A(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            int r4 = m22859t(r11, r6)
            r12.mo18681d(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            long r6 = m22822E(r11, r6)
            r12.mo18701x(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            int r4 = m22859t(r11, r6)
            r12.mo18688k(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            long r6 = m22822E(r11, r6)
            r12.mo18684g(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            long r6 = m22822E(r11, r6)
            r12.mo18703z(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            float r4 = m22853n(r11, r6)
            r12.mo18670H(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.m22860u(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m22830M(r4)
            double r6 = m22851l(r11, r6)
            r12.mo18697t(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            com.google.protobuf.k r11 = r10.f17966p
            r11.mo18716f(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5694k0.m22844a0(java.lang.Object, com.google.protobuf.i1):void");
    }

    /* renamed from: b0 */
    private void m22845b0(C5689i1 i1Var, int i, Object obj, int i2) {
        if (obj != null) {
            i1Var.mo18669G(i, this.f17967q.mo18557b(m22854o(i2)), this.f17967q.mo18558c(obj));
        }
    }

    /* renamed from: c0 */
    private void m22846c0(int i, Object obj, C5689i1 i1Var) {
        if (obj instanceof String) {
            i1Var.mo18683f(i, (String) obj);
        } else {
            i1Var.mo18687j(i, (C5648f) obj);
        }
    }

    /* renamed from: d0 */
    private void m22847d0(C5636b1 b1Var, Object obj, C5689i1 i1Var) {
        b1Var.mo18542h(b1Var.mo18535a(obj), i1Var);
    }

    /* renamed from: i */
    private boolean m22848i(Object obj, Object obj2, int i) {
        return m22860u(obj, i) == m22860u(obj2, i);
    }

    /* renamed from: j */
    private static boolean m22849j(Object obj, long j) {
        return C5660f1.m22609r(obj, j);
    }

    /* renamed from: k */
    private static void m22850k(Object obj) {
        if (!m22865z(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    /* renamed from: l */
    private static double m22851l(Object obj, long j) {
        return C5660f1.m22615x(obj, j);
    }

    /* renamed from: m */
    private boolean m22852m(Object obj, Object obj2, int i) {
        int X = m22841X(i);
        long M = m22830M(X);
        switch (m22840W(X)) {
            case 0:
                if (!m22848i(obj, obj2, i) || Double.doubleToLongBits(C5660f1.m22615x(obj, M)) != Double.doubleToLongBits(C5660f1.m22615x(obj2, M))) {
                    return false;
                }
                return true;
            case 1:
                if (!m22848i(obj, obj2, i) || Float.floatToIntBits(C5660f1.m22616y(obj, M)) != Float.floatToIntBits(C5660f1.m22616y(obj2, M))) {
                    return false;
                }
                return true;
            case 2:
                if (!m22848i(obj, obj2, i) || C5660f1.m22572A(obj, M) != C5660f1.m22572A(obj2, M)) {
                    return false;
                }
                return true;
            case 3:
                if (!m22848i(obj, obj2, i) || C5660f1.m22572A(obj, M) != C5660f1.m22572A(obj2, M)) {
                    return false;
                }
                return true;
            case 4:
                if (!m22848i(obj, obj2, i) || C5660f1.m22617z(obj, M) != C5660f1.m22617z(obj2, M)) {
                    return false;
                }
                return true;
            case 5:
                if (!m22848i(obj, obj2, i) || C5660f1.m22572A(obj, M) != C5660f1.m22572A(obj2, M)) {
                    return false;
                }
                return true;
            case 6:
                if (!m22848i(obj, obj2, i) || C5660f1.m22617z(obj, M) != C5660f1.m22617z(obj2, M)) {
                    return false;
                }
                return true;
            case 7:
                if (!m22848i(obj, obj2, i) || C5660f1.m22609r(obj, M) != C5660f1.m22609r(obj2, M)) {
                    return false;
                }
                return true;
            case 8:
                if (!m22848i(obj, obj2, i) || !C5732x0.m23056I(C5660f1.m22574C(obj, M), C5660f1.m22574C(obj2, M))) {
                    return false;
                }
                return true;
            case 9:
                if (!m22848i(obj, obj2, i) || !C5732x0.m23056I(C5660f1.m22574C(obj, M), C5660f1.m22574C(obj2, M))) {
                    return false;
                }
                return true;
            case 10:
                if (!m22848i(obj, obj2, i) || !C5732x0.m23056I(C5660f1.m22574C(obj, M), C5660f1.m22574C(obj2, M))) {
                    return false;
                }
                return true;
            case 11:
                if (!m22848i(obj, obj2, i) || C5660f1.m22617z(obj, M) != C5660f1.m22617z(obj2, M)) {
                    return false;
                }
                return true;
            case 12:
                if (!m22848i(obj, obj2, i) || C5660f1.m22617z(obj, M) != C5660f1.m22617z(obj2, M)) {
                    return false;
                }
                return true;
            case 13:
                if (!m22848i(obj, obj2, i) || C5660f1.m22617z(obj, M) != C5660f1.m22617z(obj2, M)) {
                    return false;
                }
                return true;
            case 14:
                if (!m22848i(obj, obj2, i) || C5660f1.m22572A(obj, M) != C5660f1.m22572A(obj2, M)) {
                    return false;
                }
                return true;
            case 15:
                if (!m22848i(obj, obj2, i) || C5660f1.m22617z(obj, M) != C5660f1.m22617z(obj2, M)) {
                    return false;
                }
                return true;
            case 16:
                if (!m22848i(obj, obj2, i) || C5660f1.m22572A(obj, M) != C5660f1.m22572A(obj2, M)) {
                    return false;
                }
                return true;
            case 17:
                if (!m22848i(obj, obj2, i) || !C5732x0.m23056I(C5660f1.m22574C(obj, M), C5660f1.m22574C(obj2, M))) {
                    return false;
                }
                return true;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return C5732x0.m23056I(C5660f1.m22574C(obj, M), C5660f1.m22574C(obj2, M));
            case 50:
                return C5732x0.m23056I(C5660f1.m22574C(obj, M), C5660f1.m22574C(obj2, M));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!m22818A(obj, obj2, i) || !C5732x0.m23056I(C5660f1.m22574C(obj, M), C5660f1.m22574C(obj2, M))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: n */
    private static float m22853n(Object obj, long j) {
        return C5660f1.m22616y(obj, j);
    }

    /* renamed from: o */
    private Object m22854o(int i) {
        return this.f17952b[(i / 3) * 2];
    }

    /* renamed from: p */
    private C5728v0 m22855p(int i) {
        int i2 = (i / 3) * 2;
        C5728v0 v0Var = (C5728v0) this.f17952b[i2];
        if (v0Var != null) {
            return v0Var;
        }
        C5728v0 c = C5722s0.m23005a().mo18792c((Class) this.f17952b[i2 + 1]);
        this.f17952b[i2] = c;
        return c;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0344, code lost:
        r4 = (r4 + r9) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0410, code lost:
        r6 = r6 + r3;
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0462, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0519, code lost:
        r5 = r5 + 3;
        r4 = 1048575;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m22856q(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f17950s
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r4
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x000d:
            int[] r9 = r0.f17951a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0520
            int r9 = r0.m22841X(r5)
            int r10 = r0.m22829L(r5)
            int r11 = m22840W(r9)
            r12 = 17
            r13 = 1
            if (r11 > r12) goto L_0x0038
            int[] r12 = r0.f17951a
            int r14 = r5 + 2
            r12 = r12[r14]
            r14 = r12 & r4
            int r15 = r12 >>> 20
            int r15 = r13 << r15
            if (r14 == r7) goto L_0x0056
            long r7 = (long) r14
            int r8 = r2.getInt(r1, r7)
            r7 = r14
            goto L_0x0056
        L_0x0038:
            boolean r12 = r0.f17959i
            if (r12 == 0) goto L_0x0054
            com.google.protobuf.o r12 = com.google.protobuf.C5703o.DOUBLE_LIST_PACKED
            int r12 = r12.mo18743b()
            if (r11 < r12) goto L_0x0054
            com.google.protobuf.o r12 = com.google.protobuf.C5703o.SINT64_LIST_PACKED
            int r12 = r12.mo18743b()
            if (r11 > r12) goto L_0x0054
            int[] r12 = r0.f17951a
            int r14 = r5 + 2
            r12 = r12[r14]
            r12 = r12 & r4
            goto L_0x0055
        L_0x0054:
            r12 = 0
        L_0x0055:
            r15 = 0
        L_0x0056:
            long r13 = m22830M(r9)
            r9 = 0
            r3 = 0
            switch(r11) {
                case 0: goto L_0x050d;
                case 1: goto L_0x0503;
                case 2: goto L_0x04f5;
                case 3: goto L_0x04e7;
                case 4: goto L_0x04d9;
                case 5: goto L_0x04cf;
                case 6: goto L_0x04c5;
                case 7: goto L_0x04ba;
                case 8: goto L_0x049e;
                case 9: goto L_0x048d;
                case 10: goto L_0x047e;
                case 11: goto L_0x0471;
                case 12: goto L_0x0464;
                case 13: goto L_0x0459;
                case 14: goto L_0x0450;
                case 15: goto L_0x0443;
                case 16: goto L_0x0436;
                case 17: goto L_0x0423;
                case 18: goto L_0x0414;
                case 19: goto L_0x0405;
                case 20: goto L_0x03f9;
                case 21: goto L_0x03ed;
                case 22: goto L_0x03e1;
                case 23: goto L_0x03d5;
                case 24: goto L_0x03c9;
                case 25: goto L_0x03bd;
                case 26: goto L_0x03b2;
                case 27: goto L_0x03a2;
                case 28: goto L_0x0396;
                case 29: goto L_0x0389;
                case 30: goto L_0x037c;
                case 31: goto L_0x036f;
                case 32: goto L_0x0362;
                case 33: goto L_0x0355;
                case 34: goto L_0x0348;
                case 35: goto L_0x0328;
                case 36: goto L_0x030b;
                case 37: goto L_0x02ee;
                case 38: goto L_0x02d1;
                case 39: goto L_0x02b3;
                case 40: goto L_0x0295;
                case 41: goto L_0x0277;
                case 42: goto L_0x0259;
                case 43: goto L_0x023b;
                case 44: goto L_0x021d;
                case 45: goto L_0x01ff;
                case 46: goto L_0x01e1;
                case 47: goto L_0x01c3;
                case 48: goto L_0x01a5;
                case 49: goto L_0x0195;
                case 50: goto L_0x0185;
                case 51: goto L_0x0177;
                case 52: goto L_0x016b;
                case 53: goto L_0x015b;
                case 54: goto L_0x014b;
                case 55: goto L_0x013b;
                case 56: goto L_0x012f;
                case 57: goto L_0x0122;
                case 58: goto L_0x0115;
                case 59: goto L_0x00f7;
                case 60: goto L_0x00e3;
                case 61: goto L_0x00d1;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00b1;
                case 64: goto L_0x00a4;
                case 65: goto L_0x0098;
                case 66: goto L_0x0088;
                case 67: goto L_0x0078;
                case 68: goto L_0x0062;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0420
        L_0x0062:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.h0 r3 = (com.google.protobuf.C5677h0) r3
            com.google.protobuf.v0 r4 = r0.m22855p(r5)
            int r3 = com.google.protobuf.CodedOutputStream.m22344s(r10, r3, r4)
            goto L_0x041f
        L_0x0078:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            long r3 = m22835R(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m22315K(r10, r3)
            goto L_0x041f
        L_0x0088:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m22834Q(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m22313I(r10, r3)
            goto L_0x041f
        L_0x0098:
            boolean r9 = r0.m22819B(r1, r10, r5)
            if (r9 == 0) goto L_0x0420
            int r3 = com.google.protobuf.CodedOutputStream.m22311G(r10, r3)
            goto L_0x041f
        L_0x00a4:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.m22309E(r10, r3)
            goto L_0x0462
        L_0x00b1:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m22834Q(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m22336k(r10, r3)
            goto L_0x041f
        L_0x00c1:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m22834Q(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m22320P(r10, r3)
            goto L_0x041f
        L_0x00d1:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.f r3 = (com.google.protobuf.C5648f) r3
            int r3 = com.google.protobuf.CodedOutputStream.m22332g(r10, r3)
            goto L_0x041f
        L_0x00e3:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.v0 r4 = r0.m22855p(r5)
            int r3 = com.google.protobuf.C5732x0.m23090o(r10, r3, r4)
            goto L_0x041f
        L_0x00f7:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.C5648f
            if (r4 == 0) goto L_0x010d
            com.google.protobuf.f r3 = (com.google.protobuf.C5648f) r3
            int r3 = com.google.protobuf.CodedOutputStream.m22332g(r10, r3)
            goto L_0x041f
        L_0x010d:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.m22317M(r10, r3)
            goto L_0x041f
        L_0x0115:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 1
            int r3 = com.google.protobuf.CodedOutputStream.m22329d(r10, r3)
            goto L_0x041f
        L_0x0122:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.m22338m(r10, r3)
            goto L_0x0462
        L_0x012f:
            boolean r9 = r0.m22819B(r1, r10, r5)
            if (r9 == 0) goto L_0x0420
            int r3 = com.google.protobuf.CodedOutputStream.m22340o(r10, r3)
            goto L_0x041f
        L_0x013b:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m22834Q(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m22347v(r10, r3)
            goto L_0x041f
        L_0x014b:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            long r3 = m22835R(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m22322R(r10, r3)
            goto L_0x041f
        L_0x015b:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            long r3 = m22835R(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m22349x(r10, r3)
            goto L_0x041f
        L_0x016b:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = com.google.protobuf.CodedOutputStream.m22342q(r10, r9)
            goto L_0x041f
        L_0x0177:
            boolean r3 = r0.m22819B(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r3 = com.google.protobuf.CodedOutputStream.m22334i(r10, r3)
            goto L_0x041f
        L_0x0185:
            com.google.protobuf.c0 r3 = r0.f17967q
            java.lang.Object r4 = r2.getObject(r1, r13)
            java.lang.Object r9 = r0.m22854o(r5)
            int r3 = r3.mo18560e(r10, r4, r9)
            goto L_0x041f
        L_0x0195:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.v0 r4 = r0.m22855p(r5)
            int r3 = com.google.protobuf.C5732x0.m23085j(r10, r3, r4)
            goto L_0x041f
        L_0x01a5:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23095t(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f17959i
            if (r4 == 0) goto L_0x01b9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01b9:
            int r4 = com.google.protobuf.CodedOutputStream.m22319O(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m22321Q(r3)
            goto L_0x0344
        L_0x01c3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23093r(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f17959i
            if (r4 == 0) goto L_0x01d7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01d7:
            int r4 = com.google.protobuf.CodedOutputStream.m22319O(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m22321Q(r3)
            goto L_0x0344
        L_0x01e1:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23084i(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f17959i
            if (r4 == 0) goto L_0x01f5
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01f5:
            int r4 = com.google.protobuf.CodedOutputStream.m22319O(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m22321Q(r3)
            goto L_0x0344
        L_0x01ff:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23082g(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f17959i
            if (r4 == 0) goto L_0x0213
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0213:
            int r4 = com.google.protobuf.CodedOutputStream.m22319O(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m22321Q(r3)
            goto L_0x0344
        L_0x021d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23080e(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f17959i
            if (r4 == 0) goto L_0x0231
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0231:
            int r4 = com.google.protobuf.CodedOutputStream.m22319O(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m22321Q(r3)
            goto L_0x0344
        L_0x023b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23098w(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f17959i
            if (r4 == 0) goto L_0x024f
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x024f:
            int r4 = com.google.protobuf.CodedOutputStream.m22319O(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m22321Q(r3)
            goto L_0x0344
        L_0x0259:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23076b(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f17959i
            if (r4 == 0) goto L_0x026d
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x026d:
            int r4 = com.google.protobuf.CodedOutputStream.m22319O(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m22321Q(r3)
            goto L_0x0344
        L_0x0277:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23082g(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f17959i
            if (r4 == 0) goto L_0x028b
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x028b:
            int r4 = com.google.protobuf.CodedOutputStream.m22319O(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m22321Q(r3)
            goto L_0x0344
        L_0x0295:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23084i(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f17959i
            if (r4 == 0) goto L_0x02a9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02a9:
            int r4 = com.google.protobuf.CodedOutputStream.m22319O(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m22321Q(r3)
            goto L_0x0344
        L_0x02b3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23087l(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f17959i
            if (r4 == 0) goto L_0x02c7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02c7:
            int r4 = com.google.protobuf.CodedOutputStream.m22319O(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m22321Q(r3)
            goto L_0x0344
        L_0x02d1:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23100y(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f17959i
            if (r4 == 0) goto L_0x02e5
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02e5:
            int r4 = com.google.protobuf.CodedOutputStream.m22319O(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m22321Q(r3)
            goto L_0x0344
        L_0x02ee:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23089n(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f17959i
            if (r4 == 0) goto L_0x0302
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0302:
            int r4 = com.google.protobuf.CodedOutputStream.m22319O(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m22321Q(r3)
            goto L_0x0344
        L_0x030b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23082g(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f17959i
            if (r4 == 0) goto L_0x031f
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x031f:
            int r4 = com.google.protobuf.CodedOutputStream.m22319O(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m22321Q(r3)
            goto L_0x0344
        L_0x0328:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23084i(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f17959i
            if (r4 == 0) goto L_0x033c
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x033c:
            int r4 = com.google.protobuf.CodedOutputStream.m22319O(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m22321Q(r3)
        L_0x0344:
            int r4 = r4 + r9
            int r4 = r4 + r3
            goto L_0x0462
        L_0x0348:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.C5732x0.m23094s(r10, r3, r4)
            goto L_0x0410
        L_0x0355:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23092q(r10, r3, r4)
            goto L_0x0410
        L_0x0362:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23083h(r10, r3, r4)
            goto L_0x0410
        L_0x036f:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23081f(r10, r3, r4)
            goto L_0x0410
        L_0x037c:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23079d(r10, r3, r4)
            goto L_0x0410
        L_0x0389:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23097v(r10, r3, r4)
            goto L_0x041f
        L_0x0396:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23078c(r10, r3)
            goto L_0x041f
        L_0x03a2:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.v0 r4 = r0.m22855p(r5)
            int r3 = com.google.protobuf.C5732x0.m23091p(r10, r3, r4)
            goto L_0x041f
        L_0x03b2:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23096u(r10, r3)
            goto L_0x041f
        L_0x03bd:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.C5732x0.m23074a(r10, r3, r4)
            goto L_0x0410
        L_0x03c9:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23081f(r10, r3, r4)
            goto L_0x0410
        L_0x03d5:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23083h(r10, r3, r4)
            goto L_0x0410
        L_0x03e1:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23086k(r10, r3, r4)
            goto L_0x0410
        L_0x03ed:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23099x(r10, r3, r4)
            goto L_0x0410
        L_0x03f9:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23088m(r10, r3, r4)
            goto L_0x0410
        L_0x0405:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23081f(r10, r3, r4)
        L_0x0410:
            int r6 = r6 + r3
            r11 = r4
            goto L_0x0519
        L_0x0414:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C5732x0.m23083h(r10, r3, r4)
        L_0x041f:
            int r6 = r6 + r3
        L_0x0420:
            r11 = 0
            goto L_0x0519
        L_0x0423:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.h0 r3 = (com.google.protobuf.C5677h0) r3
            com.google.protobuf.v0 r4 = r0.m22855p(r5)
            int r3 = com.google.protobuf.CodedOutputStream.m22344s(r10, r3, r4)
            goto L_0x041f
        L_0x0436:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m22315K(r10, r3)
            goto L_0x041f
        L_0x0443:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m22313I(r10, r3)
            goto L_0x041f
        L_0x0450:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x0420
            int r3 = com.google.protobuf.CodedOutputStream.m22311G(r10, r3)
            goto L_0x041f
        L_0x0459:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.m22309E(r10, r3)
        L_0x0462:
            int r6 = r6 + r4
            goto L_0x0420
        L_0x0464:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m22336k(r10, r3)
            goto L_0x041f
        L_0x0471:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m22320P(r10, r3)
            goto L_0x041f
        L_0x047e:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.f r3 = (com.google.protobuf.C5648f) r3
            int r3 = com.google.protobuf.CodedOutputStream.m22332g(r10, r3)
            goto L_0x041f
        L_0x048d:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.v0 r4 = r0.m22855p(r5)
            int r3 = com.google.protobuf.C5732x0.m23090o(r10, r3, r4)
            goto L_0x041f
        L_0x049e:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.C5648f
            if (r4 == 0) goto L_0x04b2
            com.google.protobuf.f r3 = (com.google.protobuf.C5648f) r3
            int r3 = com.google.protobuf.CodedOutputStream.m22332g(r10, r3)
            goto L_0x041f
        L_0x04b2:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.m22317M(r10, r3)
            goto L_0x041f
        L_0x04ba:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            r3 = 1
            int r3 = com.google.protobuf.CodedOutputStream.m22329d(r10, r3)
            goto L_0x041f
        L_0x04c5:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            r11 = 0
            int r3 = com.google.protobuf.CodedOutputStream.m22338m(r10, r11)
            goto L_0x0518
        L_0x04cf:
            r11 = 0
            r9 = r8 & r15
            if (r9 == 0) goto L_0x0519
            int r3 = com.google.protobuf.CodedOutputStream.m22340o(r10, r3)
            goto L_0x0518
        L_0x04d9:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m22347v(r10, r3)
            goto L_0x0518
        L_0x04e7:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m22322R(r10, r3)
            goto L_0x0518
        L_0x04f5:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m22349x(r10, r3)
            goto L_0x0518
        L_0x0503:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            int r3 = com.google.protobuf.CodedOutputStream.m22342q(r10, r9)
            goto L_0x0518
        L_0x050d:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            r3 = 0
            int r3 = com.google.protobuf.CodedOutputStream.m22334i(r10, r3)
        L_0x0518:
            int r6 = r6 + r3
        L_0x0519:
            int r5 = r5 + 3
            r4 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x0520:
            com.google.protobuf.b1 r2 = r0.f17965o
            int r2 = r0.m22858s(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f17956f
            if (r2 == 0) goto L_0x0536
            com.google.protobuf.k r2 = r0.f17966p
            com.google.protobuf.n r1 = r2.mo18712b(r1)
            int r1 = r1.mo18731h()
            int r6 = r6 + r1
        L_0x0536:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5694k0.m22856q(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m22857r(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f17950s
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0008:
            int[] r6 = r0.f17951a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04e3
            int r6 = r15.m22841X(r4)
            int r7 = m22840W(r6)
            int r8 = r15.m22829L(r4)
            long r9 = m22830M(r6)
            com.google.protobuf.o r6 = com.google.protobuf.C5703o.DOUBLE_LIST_PACKED
            int r6 = r6.mo18743b()
            if (r7 < r6) goto L_0x0038
            com.google.protobuf.o r6 = com.google.protobuf.C5703o.SINT64_LIST_PACKED
            int r6 = r6.mo18743b()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f17951a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = r3
        L_0x0039:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L_0x04d1;
                case 1: goto L_0x04c5;
                case 2: goto L_0x04b5;
                case 3: goto L_0x04a5;
                case 4: goto L_0x0495;
                case 5: goto L_0x0489;
                case 6: goto L_0x047d;
                case 7: goto L_0x0471;
                case 8: goto L_0x0453;
                case 9: goto L_0x043f;
                case 10: goto L_0x042e;
                case 11: goto L_0x041f;
                case 12: goto L_0x0410;
                case 13: goto L_0x0405;
                case 14: goto L_0x03fa;
                case 15: goto L_0x03eb;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03bc;
                case 19: goto L_0x03b3;
                case 20: goto L_0x03aa;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0398;
                case 23: goto L_0x038f;
                case 24: goto L_0x0386;
                case 25: goto L_0x037d;
                case 26: goto L_0x0374;
                case 27: goto L_0x0367;
                case 28: goto L_0x035e;
                case 29: goto L_0x0355;
                case 30: goto L_0x034b;
                case 31: goto L_0x0341;
                case 32: goto L_0x0337;
                case 33: goto L_0x032d;
                case 34: goto L_0x0323;
                case 35: goto L_0x0303;
                case 36: goto L_0x02e6;
                case 37: goto L_0x02c9;
                case 38: goto L_0x02ac;
                case 39: goto L_0x028e;
                case 40: goto L_0x0270;
                case 41: goto L_0x0252;
                case 42: goto L_0x0234;
                case 43: goto L_0x0216;
                case 44: goto L_0x01f8;
                case 45: goto L_0x01da;
                case 46: goto L_0x01bc;
                case 47: goto L_0x019e;
                case 48: goto L_0x0180;
                case 49: goto L_0x0172;
                case 50: goto L_0x0162;
                case 51: goto L_0x0154;
                case 52: goto L_0x0148;
                case 53: goto L_0x0138;
                case 54: goto L_0x0128;
                case 55: goto L_0x0118;
                case 56: goto L_0x010c;
                case 57: goto L_0x0100;
                case 58: goto L_0x00f4;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00c2;
                case 61: goto L_0x00b0;
                case 62: goto L_0x00a0;
                case 63: goto L_0x0090;
                case 64: goto L_0x0084;
                case 65: goto L_0x0078;
                case 66: goto L_0x0068;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x04df
        L_0x0042:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r1, r9)
            com.google.protobuf.h0 r6 = (com.google.protobuf.C5677h0) r6
            com.google.protobuf.v0 r7 = r15.m22855p(r4)
            int r6 = com.google.protobuf.CodedOutputStream.m22344s(r8, r6, r7)
            goto L_0x03c4
        L_0x0058:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m22835R(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m22315K(r8, r6)
            goto L_0x03c4
        L_0x0068:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m22834Q(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m22313I(r8, r6)
            goto L_0x03c4
        L_0x0078:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m22311G(r8, r13)
            goto L_0x03c4
        L_0x0084:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m22309E(r8, r3)
            goto L_0x03c4
        L_0x0090:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m22834Q(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m22336k(r8, r6)
            goto L_0x03c4
        L_0x00a0:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m22834Q(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m22320P(r8, r6)
            goto L_0x03c4
        L_0x00b0:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r1, r9)
            com.google.protobuf.f r6 = (com.google.protobuf.C5648f) r6
            int r6 = com.google.protobuf.CodedOutputStream.m22332g(r8, r6)
            goto L_0x03c4
        L_0x00c2:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r1, r9)
            com.google.protobuf.v0 r7 = r15.m22855p(r4)
            int r6 = com.google.protobuf.C5732x0.m23090o(r8, r6, r7)
            goto L_0x03c4
        L_0x00d6:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.C5648f
            if (r7 == 0) goto L_0x00ec
            com.google.protobuf.f r6 = (com.google.protobuf.C5648f) r6
            int r6 = com.google.protobuf.CodedOutputStream.m22332g(r8, r6)
            goto L_0x03c4
        L_0x00ec:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.CodedOutputStream.m22317M(r8, r6)
            goto L_0x03c4
        L_0x00f4:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m22329d(r8, r11)
            goto L_0x03c4
        L_0x0100:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m22338m(r8, r3)
            goto L_0x03c4
        L_0x010c:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m22340o(r8, r13)
            goto L_0x03c4
        L_0x0118:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m22834Q(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m22347v(r8, r6)
            goto L_0x03c4
        L_0x0128:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m22835R(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m22322R(r8, r6)
            goto L_0x03c4
        L_0x0138:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m22835R(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m22349x(r8, r6)
            goto L_0x03c4
        L_0x0148:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m22342q(r8, r12)
            goto L_0x03c4
        L_0x0154:
            boolean r6 = r15.m22819B(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.protobuf.CodedOutputStream.m22334i(r8, r6)
            goto L_0x03c4
        L_0x0162:
            com.google.protobuf.c0 r6 = r0.f17967q
            java.lang.Object r7 = com.google.protobuf.C5660f1.m22574C(r1, r9)
            java.lang.Object r9 = r15.m22854o(r4)
            int r6 = r6.mo18560e(r8, r7, r9)
            goto L_0x03c4
        L_0x0172:
            java.util.List r6 = m22821D(r1, r9)
            com.google.protobuf.v0 r7 = r15.m22855p(r4)
            int r6 = com.google.protobuf.C5732x0.m23085j(r8, r6, r7)
            goto L_0x03c4
        L_0x0180:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C5732x0.m23095t(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f17959i
            if (r9 == 0) goto L_0x0194
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0194:
            int r6 = com.google.protobuf.CodedOutputStream.m22319O(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m22321Q(r7)
            goto L_0x031f
        L_0x019e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C5732x0.m23093r(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f17959i
            if (r9 == 0) goto L_0x01b2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01b2:
            int r6 = com.google.protobuf.CodedOutputStream.m22319O(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m22321Q(r7)
            goto L_0x031f
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C5732x0.m23084i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f17959i
            if (r9 == 0) goto L_0x01d0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01d0:
            int r6 = com.google.protobuf.CodedOutputStream.m22319O(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m22321Q(r7)
            goto L_0x031f
        L_0x01da:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C5732x0.m23082g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f17959i
            if (r9 == 0) goto L_0x01ee
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ee:
            int r6 = com.google.protobuf.CodedOutputStream.m22319O(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m22321Q(r7)
            goto L_0x031f
        L_0x01f8:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C5732x0.m23080e(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f17959i
            if (r9 == 0) goto L_0x020c
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x020c:
            int r6 = com.google.protobuf.CodedOutputStream.m22319O(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m22321Q(r7)
            goto L_0x031f
        L_0x0216:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C5732x0.m23098w(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f17959i
            if (r9 == 0) goto L_0x022a
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x022a:
            int r6 = com.google.protobuf.CodedOutputStream.m22319O(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m22321Q(r7)
            goto L_0x031f
        L_0x0234:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C5732x0.m23076b(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f17959i
            if (r9 == 0) goto L_0x0248
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0248:
            int r6 = com.google.protobuf.CodedOutputStream.m22319O(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m22321Q(r7)
            goto L_0x031f
        L_0x0252:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C5732x0.m23082g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f17959i
            if (r9 == 0) goto L_0x0266
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0266:
            int r6 = com.google.protobuf.CodedOutputStream.m22319O(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m22321Q(r7)
            goto L_0x031f
        L_0x0270:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C5732x0.m23084i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f17959i
            if (r9 == 0) goto L_0x0284
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0284:
            int r6 = com.google.protobuf.CodedOutputStream.m22319O(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m22321Q(r7)
            goto L_0x031f
        L_0x028e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C5732x0.m23087l(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f17959i
            if (r9 == 0) goto L_0x02a2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02a2:
            int r6 = com.google.protobuf.CodedOutputStream.m22319O(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m22321Q(r7)
            goto L_0x031f
        L_0x02ac:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C5732x0.m23100y(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f17959i
            if (r9 == 0) goto L_0x02c0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02c0:
            int r6 = com.google.protobuf.CodedOutputStream.m22319O(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m22321Q(r7)
            goto L_0x031f
        L_0x02c9:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C5732x0.m23089n(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f17959i
            if (r9 == 0) goto L_0x02dd
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02dd:
            int r6 = com.google.protobuf.CodedOutputStream.m22319O(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m22321Q(r7)
            goto L_0x031f
        L_0x02e6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C5732x0.m23082g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f17959i
            if (r9 == 0) goto L_0x02fa
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02fa:
            int r6 = com.google.protobuf.CodedOutputStream.m22319O(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m22321Q(r7)
            goto L_0x031f
        L_0x0303:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C5732x0.m23084i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f17959i
            if (r9 == 0) goto L_0x0317
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0317:
            int r6 = com.google.protobuf.CodedOutputStream.m22319O(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m22321Q(r7)
        L_0x031f:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x03c4
        L_0x0323:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23094s(r8, r6, r3)
            goto L_0x03c4
        L_0x032d:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23092q(r8, r6, r3)
            goto L_0x03c4
        L_0x0337:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23083h(r8, r6, r3)
            goto L_0x03c4
        L_0x0341:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23081f(r8, r6, r3)
            goto L_0x03c4
        L_0x034b:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23079d(r8, r6, r3)
            goto L_0x03c4
        L_0x0355:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23097v(r8, r6, r3)
            goto L_0x03c4
        L_0x035e:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23078c(r8, r6)
            goto L_0x03c4
        L_0x0367:
            java.util.List r6 = m22821D(r1, r9)
            com.google.protobuf.v0 r7 = r15.m22855p(r4)
            int r6 = com.google.protobuf.C5732x0.m23091p(r8, r6, r7)
            goto L_0x03c4
        L_0x0374:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23096u(r8, r6)
            goto L_0x03c4
        L_0x037d:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23074a(r8, r6, r3)
            goto L_0x03c4
        L_0x0386:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23081f(r8, r6, r3)
            goto L_0x03c4
        L_0x038f:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23083h(r8, r6, r3)
            goto L_0x03c4
        L_0x0398:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23086k(r8, r6, r3)
            goto L_0x03c4
        L_0x03a1:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23099x(r8, r6, r3)
            goto L_0x03c4
        L_0x03aa:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23088m(r8, r6, r3)
            goto L_0x03c4
        L_0x03b3:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23081f(r8, r6, r3)
            goto L_0x03c4
        L_0x03bc:
            java.util.List r6 = m22821D(r1, r9)
            int r6 = com.google.protobuf.C5732x0.m23083h(r8, r6, r3)
        L_0x03c4:
            int r5 = r5 + r6
            goto L_0x04df
        L_0x03c7:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r1, r9)
            com.google.protobuf.h0 r6 = (com.google.protobuf.C5677h0) r6
            com.google.protobuf.v0 r7 = r15.m22855p(r4)
            int r6 = com.google.protobuf.CodedOutputStream.m22344s(r8, r6, r7)
            goto L_0x03c4
        L_0x03dc:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.C5660f1.m22572A(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m22315K(r8, r6)
            goto L_0x03c4
        L_0x03eb:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C5660f1.m22617z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m22313I(r8, r6)
            goto L_0x03c4
        L_0x03fa:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m22311G(r8, r13)
            goto L_0x03c4
        L_0x0405:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m22309E(r8, r3)
            goto L_0x03c4
        L_0x0410:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C5660f1.m22617z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m22336k(r8, r6)
            goto L_0x03c4
        L_0x041f:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C5660f1.m22617z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m22320P(r8, r6)
            goto L_0x03c4
        L_0x042e:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r1, r9)
            com.google.protobuf.f r6 = (com.google.protobuf.C5648f) r6
            int r6 = com.google.protobuf.CodedOutputStream.m22332g(r8, r6)
            goto L_0x03c4
        L_0x043f:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r1, r9)
            com.google.protobuf.v0 r7 = r15.m22855p(r4)
            int r6 = com.google.protobuf.C5732x0.m23090o(r8, r6, r7)
            goto L_0x03c4
        L_0x0453:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C5660f1.m22574C(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.C5648f
            if (r7 == 0) goto L_0x0469
            com.google.protobuf.f r6 = (com.google.protobuf.C5648f) r6
            int r6 = com.google.protobuf.CodedOutputStream.m22332g(r8, r6)
            goto L_0x03c4
        L_0x0469:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.CodedOutputStream.m22317M(r8, r6)
            goto L_0x03c4
        L_0x0471:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m22329d(r8, r11)
            goto L_0x03c4
        L_0x047d:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m22338m(r8, r3)
            goto L_0x03c4
        L_0x0489:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m22340o(r8, r13)
            goto L_0x03c4
        L_0x0495:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C5660f1.m22617z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m22347v(r8, r6)
            goto L_0x03c4
        L_0x04a5:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.C5660f1.m22572A(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m22322R(r8, r6)
            goto L_0x03c4
        L_0x04b5:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.C5660f1.m22572A(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m22349x(r8, r6)
            goto L_0x03c4
        L_0x04c5:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m22342q(r8, r12)
            goto L_0x03c4
        L_0x04d1:
            boolean r6 = r15.m22860u(r1, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.protobuf.CodedOutputStream.m22334i(r8, r6)
            goto L_0x03c4
        L_0x04df:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04e3:
            com.google.protobuf.b1 r2 = r0.f17965o
            int r1 = r15.m22858s(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5694k0.m22857r(java.lang.Object):int");
    }

    /* renamed from: s */
    private int m22858s(C5636b1 b1Var, Object obj) {
        return b1Var.mo18536b(b1Var.mo18535a(obj));
    }

    /* renamed from: t */
    private static int m22859t(Object obj, long j) {
        return C5660f1.m22617z(obj, j);
    }

    /* renamed from: u */
    private boolean m22860u(Object obj, int i) {
        int S = m22836S(i);
        long j = (long) (1048575 & S);
        if (j == 1048575) {
            int X = m22841X(i);
            long M = m22830M(X);
            switch (m22840W(X)) {
                case 0:
                    if (Double.doubleToRawLongBits(C5660f1.m22615x(obj, M)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(C5660f1.m22616y(obj, M)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C5660f1.m22572A(obj, M) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C5660f1.m22572A(obj, M) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C5660f1.m22617z(obj, M) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C5660f1.m22572A(obj, M) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C5660f1.m22617z(obj, M) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C5660f1.m22609r(obj, M);
                case 8:
                    Object C = C5660f1.m22574C(obj, M);
                    if (C instanceof String) {
                        return !((String) C).isEmpty();
                    }
                    if (C instanceof C5648f) {
                        return !C5648f.f17856e.equals(C);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C5660f1.m22574C(obj, M) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !C5648f.f17856e.equals(C5660f1.m22574C(obj, M));
                case 11:
                    if (C5660f1.m22617z(obj, M) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C5660f1.m22617z(obj, M) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C5660f1.m22617z(obj, M) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C5660f1.m22572A(obj, M) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C5660f1.m22617z(obj, M) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C5660f1.m22572A(obj, M) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C5660f1.m22574C(obj, M) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((C5660f1.m22617z(obj, j) & (1 << (S >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: v */
    private boolean m22861v(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m22860u(obj, i) : (i3 & i4) != 0;
    }

    /* renamed from: w */
    private static boolean m22862w(Object obj, int i, C5728v0 v0Var) {
        return v0Var.mo18720d(C5660f1.m22574C(obj, m22830M(i)));
    }

    /* renamed from: x */
    private boolean m22863x(Object obj, int i, int i2) {
        List list = (List) C5660f1.m22574C(obj, m22830M(i));
        if (list.isEmpty()) {
            return true;
        }
        C5728v0 p = m22855p(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!p.mo18720d(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y */
    private boolean m22864y(Object obj, int i, int i2) {
        Map c = this.f17967q.mo18558c(C5660f1.m22574C(obj, m22830M(i)));
        if (c.isEmpty()) {
            return true;
        }
        if (this.f17967q.mo18557b(m22854o(i2)).f17832c.mo18708b() != C5679h1.C5686c.MESSAGE) {
            return true;
        }
        C5728v0 v0Var = null;
        for (Object next : c.values()) {
            if (v0Var == null) {
                v0Var = C5722s0.m23005a().mo18792c(next.getClass());
            }
            if (!v0Var.mo18720d(next)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: z */
    private static boolean m22865z(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C5709q) {
            return ((C5709q) obj).mo18749H();
        }
        return true;
    }

    /* renamed from: a */
    public void mo18717a(Object obj, Object obj2) {
        m22850k(obj);
        obj2.getClass();
        for (int i = 0; i < this.f17951a.length; i += 3) {
            m22825H(obj, obj2, i);
        }
        C5732x0.m23052E(this.f17965o, obj, obj2);
        if (this.f17956f) {
            C5732x0.m23050C(this.f17966p, obj, obj2);
        }
    }

    /* renamed from: b */
    public void mo18718b(Object obj, C5689i1 i1Var) {
        if (i1Var.mo18702y() == C5689i1.C5690a.DESCENDING) {
            m22844a0(obj, i1Var);
        } else if (this.f17958h) {
            m22843Z(obj, i1Var);
        } else {
            m22842Y(obj, i1Var);
        }
    }

    /* renamed from: c */
    public void mo18719c(Object obj) {
        if (m22865z(obj)) {
            if (obj instanceof C5709q) {
                C5709q qVar = (C5709q) obj;
                qVar.mo18760q();
                qVar.mo18759p();
                qVar.mo18751J();
            }
            int length = this.f17951a.length;
            for (int i = 0; i < length; i += 3) {
                int X = m22841X(i);
                long M = m22830M(X);
                int W = m22840W(X);
                if (W != 9) {
                    switch (W) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f17964n.mo18816c(obj, M);
                            continue;
                        case 50:
                            Unsafe unsafe = f17950s;
                            Object object = unsafe.getObject(obj, M);
                            if (object != null) {
                                unsafe.putObject(obj, M, this.f17967q.mo18559d(object));
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (m22860u(obj, i)) {
                    m22855p(i).mo18719c(f17950s.getObject(obj, M));
                }
            }
            this.f17965o.mo18538d(obj);
            if (this.f17956f) {
                this.f17966p.mo18715e(obj);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo18720d(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f17961k) {
            int i6 = this.f17960j[i5];
            int L = m22829L(i6);
            int X = m22841X(i6);
            int i7 = this.f17951a[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = f17950s.getInt(obj2, (long) i8);
                }
                i = i4;
                i2 = i8;
            } else {
                i2 = i3;
                i = i4;
            }
            if (m22820C(X) && !m22861v(obj, i6, i2, i, i9)) {
                return false;
            }
            int W = m22840W(X);
            if (W != 9 && W != 17) {
                if (W != 27) {
                    if (W == 60 || W == 68) {
                        if (m22819B(obj2, L, i6) && !m22862w(obj2, X, m22855p(i6))) {
                            return false;
                        }
                    } else if (W != 49) {
                        if (W == 50 && !m22864y(obj2, X, i6)) {
                            return false;
                        }
                    }
                }
                if (!m22863x(obj2, X, i6)) {
                    return false;
                }
            } else if (m22861v(obj, i6, i2, i, i9) && !m22862w(obj2, X, m22855p(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f17956f || this.f17966p.mo18712b(obj2).mo18734k()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int mo18721e(Object obj) {
        return this.f17958h ? m22857r(obj) : m22856q(obj);
    }

    /* renamed from: f */
    public Object mo18722f() {
        return this.f17963m.mo18725a(this.f17955e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0225, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0226, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo18723g(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f17951a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.m22841X(r1)
            int r4 = r8.m22829L(r1)
            long r5 = m22830M(r3)
            int r3 = m22840W(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020c;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f6;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01e4;
                case 6: goto L_0x01dd;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01ab;
                case 11: goto L_0x01a3;
                case 12: goto L_0x019b;
                case 13: goto L_0x0193;
                case 14: goto L_0x0187;
                case 15: goto L_0x017f;
                case 16: goto L_0x0173;
                case 17: goto L_0x0168;
                case 18: goto L_0x015c;
                case 19: goto L_0x015c;
                case 20: goto L_0x015c;
                case 21: goto L_0x015c;
                case 22: goto L_0x015c;
                case 23: goto L_0x015c;
                case 24: goto L_0x015c;
                case 25: goto L_0x015c;
                case 26: goto L_0x015c;
                case 27: goto L_0x015c;
                case 28: goto L_0x015c;
                case 29: goto L_0x015c;
                case 30: goto L_0x015c;
                case 31: goto L_0x015c;
                case 32: goto L_0x015c;
                case 33: goto L_0x015c;
                case 34: goto L_0x015c;
                case 35: goto L_0x015c;
                case 36: goto L_0x015c;
                case 37: goto L_0x015c;
                case 38: goto L_0x015c;
                case 39: goto L_0x015c;
                case 40: goto L_0x015c;
                case 41: goto L_0x015c;
                case 42: goto L_0x015c;
                case 43: goto L_0x015c;
                case 44: goto L_0x015c;
                case 45: goto L_0x015c;
                case 46: goto L_0x015c;
                case 47: goto L_0x015c;
                case 48: goto L_0x015c;
                case 49: goto L_0x015c;
                case 50: goto L_0x0150;
                case 51: goto L_0x013a;
                case 52: goto L_0x0128;
                case 53: goto L_0x0116;
                case 54: goto L_0x0104;
                case 55: goto L_0x00f6;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00d6;
                case 58: goto L_0x00c4;
                case 59: goto L_0x00b0;
                case 60: goto L_0x009e;
                case 61: goto L_0x008c;
                case 62: goto L_0x007e;
                case 63: goto L_0x0070;
                case 64: goto L_0x0062;
                case 65: goto L_0x0050;
                case 66: goto L_0x0042;
                case 67: goto L_0x0030;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0226
        L_0x001e:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = com.google.protobuf.C5660f1.m22574C(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0030:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m22835R(r9, r5)
            int r3 = com.google.protobuf.C5716s.m22995f(r3)
            goto L_0x0225
        L_0x0042:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m22834Q(r9, r5)
            goto L_0x0225
        L_0x0050:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m22835R(r9, r5)
            int r3 = com.google.protobuf.C5716s.m22995f(r3)
            goto L_0x0225
        L_0x0062:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m22834Q(r9, r5)
            goto L_0x0225
        L_0x0070:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m22834Q(r9, r5)
            goto L_0x0225
        L_0x007e:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m22834Q(r9, r5)
            goto L_0x0225
        L_0x008c:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C5660f1.m22574C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x009e:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = com.google.protobuf.C5660f1.m22574C(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00b0:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C5660f1.m22574C(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00c4:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = m22831N(r9, r5)
            int r3 = com.google.protobuf.C5716s.m22992c(r3)
            goto L_0x0225
        L_0x00d6:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m22834Q(r9, r5)
            goto L_0x0225
        L_0x00e4:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m22835R(r9, r5)
            int r3 = com.google.protobuf.C5716s.m22995f(r3)
            goto L_0x0225
        L_0x00f6:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m22834Q(r9, r5)
            goto L_0x0225
        L_0x0104:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m22835R(r9, r5)
            int r3 = com.google.protobuf.C5716s.m22995f(r3)
            goto L_0x0225
        L_0x0116:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m22835R(r9, r5)
            int r3 = com.google.protobuf.C5716s.m22995f(r3)
            goto L_0x0225
        L_0x0128:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = m22833P(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x013a:
            boolean r3 = r8.m22819B(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = m22832O(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C5716s.m22995f(r3)
            goto L_0x0225
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C5660f1.m22574C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x015c:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C5660f1.m22574C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0168:
            java.lang.Object r3 = com.google.protobuf.C5660f1.m22574C(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
            goto L_0x01c1
        L_0x0173:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C5660f1.m22572A(r9, r5)
            int r3 = com.google.protobuf.C5716s.m22995f(r3)
            goto L_0x0225
        L_0x017f:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C5660f1.m22617z(r9, r5)
            goto L_0x0225
        L_0x0187:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C5660f1.m22572A(r9, r5)
            int r3 = com.google.protobuf.C5716s.m22995f(r3)
            goto L_0x0225
        L_0x0193:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C5660f1.m22617z(r9, r5)
            goto L_0x0225
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C5660f1.m22617z(r9, r5)
            goto L_0x0225
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C5660f1.m22617z(r9, r5)
            goto L_0x0225
        L_0x01ab:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C5660f1.m22574C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01b7:
            java.lang.Object r3 = com.google.protobuf.C5660f1.m22574C(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
        L_0x01c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c5:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C5660f1.m22574C(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01d2:
            int r2 = r2 * 53
            boolean r3 = com.google.protobuf.C5660f1.m22609r(r9, r5)
            int r3 = com.google.protobuf.C5716s.m22992c(r3)
            goto L_0x0225
        L_0x01dd:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C5660f1.m22617z(r9, r5)
            goto L_0x0225
        L_0x01e4:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C5660f1.m22572A(r9, r5)
            int r3 = com.google.protobuf.C5716s.m22995f(r3)
            goto L_0x0225
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C5660f1.m22617z(r9, r5)
            goto L_0x0225
        L_0x01f6:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C5660f1.m22572A(r9, r5)
            int r3 = com.google.protobuf.C5716s.m22995f(r3)
            goto L_0x0225
        L_0x0201:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C5660f1.m22572A(r9, r5)
            int r3 = com.google.protobuf.C5716s.m22995f(r3)
            goto L_0x0225
        L_0x020c:
            int r2 = r2 * 53
            float r3 = com.google.protobuf.C5660f1.m22616y(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x0217:
            int r2 = r2 * 53
            double r3 = com.google.protobuf.C5660f1.m22615x(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C5716s.m22995f(r3)
        L_0x0225:
            int r2 = r2 + r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.protobuf.b1 r0 = r8.f17965o
            java.lang.Object r0 = r0.mo18535a(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f17956f
            if (r0 == 0) goto L_0x0248
            int r2 = r2 * 53
            com.google.protobuf.k r0 = r8.f17966p
            com.google.protobuf.n r9 = r0.mo18712b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x0248:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5694k0.mo18723g(java.lang.Object):int");
    }

    /* renamed from: h */
    public boolean mo18724h(Object obj, Object obj2) {
        int length = this.f17951a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m22852m(obj, obj2, i)) {
                return false;
            }
        }
        if (!this.f17965o.mo18535a(obj).equals(this.f17965o.mo18535a(obj2))) {
            return false;
        }
        if (this.f17956f) {
            return this.f17966p.mo18712b(obj).equals(this.f17966p.mo18712b(obj2));
        }
        return true;
    }
}
