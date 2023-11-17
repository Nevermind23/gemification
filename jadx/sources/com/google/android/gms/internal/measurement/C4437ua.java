package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.session.C0125b;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.ua */
final class C4437ua implements C4132cb {

    /* renamed from: p */
    private static final int[] f13731p = new int[0];

    /* renamed from: q */
    private static final Unsafe f13732q = C4387rb.m16585l();

    /* renamed from: a */
    private final int[] f13733a;

    /* renamed from: b */
    private final Object[] f13734b;

    /* renamed from: c */
    private final int f13735c;

    /* renamed from: d */
    private final int f13736d;

    /* renamed from: e */
    private final C4386ra f13737e;

    /* renamed from: f */
    private final boolean f13738f;

    /* renamed from: g */
    private final boolean f13739g;

    /* renamed from: h */
    private final int[] f13740h;

    /* renamed from: i */
    private final int f13741i;

    /* renamed from: j */
    private final int f13742j;

    /* renamed from: k */
    private final C4182fa f13743k;

    /* renamed from: l */
    private final C4217hb f13744l;

    /* renamed from: m */
    private final C4181f9 f13745m;

    /* renamed from: n */
    private final C4471wa f13746n;

    /* renamed from: o */
    private final C4301ma f13747o;

    private C4437ua(int[] iArr, Object[] objArr, int i, int i2, C4386ra raVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, C4471wa waVar, C4182fa faVar, C4217hb hbVar, C4181f9 f9Var, C4301ma maVar) {
        this.f13733a = iArr;
        this.f13734b = objArr;
        this.f13735c = i;
        this.f13736d = i2;
        this.f13739g = z;
        boolean z3 = false;
        if (f9Var != null && f9Var.mo13125c(raVar)) {
            z3 = true;
        }
        this.f13738f = z3;
        this.f13740h = iArr2;
        this.f13741i = i3;
        this.f13742j = i4;
        this.f13746n = waVar;
        this.f13743k = faVar;
        this.f13744l = hbVar;
        this.f13745m = f9Var;
        this.f13737e = raVar;
        this.f13747o = maVar;
    }

    /* renamed from: A */
    private static boolean m16966A(Object obj, int i, C4132cb cbVar) {
        return cbVar.mo12995h(C4387rb.m16584k(obj, (long) (i & 1048575)));
    }

    /* renamed from: B */
    private static boolean m16967B(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C4351p9) {
            return ((C4351p9) obj).mo13478x();
        }
        return true;
    }

    /* renamed from: C */
    private final boolean m16968C(Object obj, int i, int i2) {
        if (C4387rb.m16581h(obj, (long) (m16982R(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    private static boolean m16969D(Object obj, long j) {
        return ((Boolean) C4387rb.m16584k(obj, j)).booleanValue();
    }

    /* renamed from: E */
    private static final void m16970E(int i, Object obj, C4504yb ybVar) {
        if (obj instanceof String) {
            ybVar.mo12927e(i, (String) obj);
        } else {
            ybVar.mo12937o(i, (C4418t8) obj);
        }
    }

    /* renamed from: G */
    static C4234ib m16971G(Object obj) {
        C4351p9 p9Var = (C4351p9) obj;
        C4234ib ibVar = p9Var.zzc;
        if (ibVar != C4234ib.m16102c()) {
            return ibVar;
        }
        C4234ib f = C4234ib.m16104f();
        p9Var.zzc = f;
        return f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0372  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.measurement.C4437ua m16972H(java.lang.Class r31, com.google.android.gms.internal.measurement.C4335oa r32, com.google.android.gms.internal.measurement.C4471wa r33, com.google.android.gms.internal.measurement.C4182fa r34, com.google.android.gms.internal.measurement.C4217hb r35, com.google.android.gms.internal.measurement.C4181f9 r36, com.google.android.gms.internal.measurement.C4301ma r37) {
        /*
            r0 = r32
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C4115bb
            if (r1 == 0) goto L_0x03da
            com.google.android.gms.internal.measurement.bb r0 = (com.google.android.gms.internal.measurement.C4115bb) r0
            int r1 = r0.mo12955s()
            java.lang.String r2 = r0.mo12952b()
            int r3 = r2.length()
            r4 = 0
            char r5 = r2.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0029
            r5 = 1
        L_0x001f:
            int r8 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x002a
            r5 = r8
            goto L_0x001f
        L_0x0029:
            r8 = 1
        L_0x002a:
            int r5 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x0049
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0036:
            int r11 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x0046
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r10
            r8 = r8 | r5
            int r10 = r10 + 13
            r5 = r11
            goto L_0x0036
        L_0x0046:
            int r5 = r5 << r10
            r8 = r8 | r5
            r5 = r11
        L_0x0049:
            if (r8 != 0) goto L_0x0059
            int[] r8 = f13731p
            r10 = r4
            r12 = r10
            r13 = r12
            r14 = r13
            r19 = r14
            r18 = r8
            r8 = r19
            goto L_0x016f
        L_0x0059:
            int r8 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x0078
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0065:
            int r11 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x0075
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r5 = r5 | r8
            int r10 = r10 + 13
            r8 = r11
            goto L_0x0065
        L_0x0075:
            int r8 = r8 << r10
            r5 = r5 | r8
            r8 = r11
        L_0x0078:
            int r10 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x0097
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x0084:
            int r12 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r6) goto L_0x0094
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r8 = r8 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x0084
        L_0x0094:
            int r10 = r10 << r11
            r8 = r8 | r10
            r10 = r12
        L_0x0097:
            int r11 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r6) goto L_0x00b6
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a3:
            int r13 = r11 + 1
            char r11 = r2.charAt(r11)
            if (r11 < r6) goto L_0x00b3
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00a3
        L_0x00b3:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00b6:
            int r12 = r11 + 1
            char r11 = r2.charAt(r11)
            if (r11 < r6) goto L_0x00d5
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c2:
            int r14 = r12 + 1
            char r12 = r2.charAt(r12)
            if (r12 < r6) goto L_0x00d2
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c2
        L_0x00d2:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00d5:
            int r13 = r12 + 1
            char r12 = r2.charAt(r12)
            if (r12 < r6) goto L_0x00f4
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e1:
            int r15 = r13 + 1
            char r13 = r2.charAt(r13)
            if (r13 < r6) goto L_0x00f1
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e1
        L_0x00f1:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f4:
            int r14 = r13 + 1
            char r13 = r2.charAt(r13)
            if (r13 < r6) goto L_0x0115
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0100:
            int r16 = r14 + 1
            char r14 = r2.charAt(r14)
            if (r14 < r6) goto L_0x0111
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0100
        L_0x0111:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0115:
            int r15 = r14 + 1
            char r14 = r2.charAt(r14)
            if (r14 < r6) goto L_0x0138
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0121:
            int r17 = r15 + 1
            char r15 = r2.charAt(r15)
            if (r15 < r6) goto L_0x0133
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0121
        L_0x0133:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0138:
            int r16 = r15 + 1
            char r15 = r2.charAt(r15)
            if (r15 < r6) goto L_0x015d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x0146:
            int r17 = r4 + 1
            char r4 = r2.charAt(r4)
            if (r4 < r6) goto L_0x0158
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r17
            goto L_0x0146
        L_0x0158:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r17
        L_0x015d:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int r14 = r5 + r5
            int r14 = r14 + r8
            int[] r8 = new int[r4]
            r4 = r5
            r18 = r8
            r8 = r10
            r10 = r14
            r19 = r15
            r5 = r16
            r14 = r11
        L_0x016f:
            sun.misc.Unsafe r11 = f13732q
            java.lang.Object[] r15 = r0.mo12953c()
            com.google.android.gms.internal.measurement.ra r16 = r0.mo12951a()
            java.lang.Class r9 = r16.getClass()
            int r20 = r19 + r13
            int r13 = r12 + r12
            int r12 = r12 * 3
            int[] r12 = new int[r12]
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r21 = r19
            r22 = r20
            r16 = 0
            r17 = 0
        L_0x018f:
            r7 = 2
            if (r1 != r7) goto L_0x0194
            r7 = 1
            goto L_0x0195
        L_0x0194:
            r7 = 0
        L_0x0195:
            if (r5 >= r3) goto L_0x03b9
            int r24 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x01c4
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r6 = r24
            r24 = 13
        L_0x01a5:
            int r26 = r6 + 1
            char r6 = r2.charAt(r6)
            r27 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r1) goto L_0x01be
            r1 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r5 = r5 | r1
            int r24 = r24 + 13
            r6 = r26
            r1 = r27
            goto L_0x01a5
        L_0x01be:
            int r1 = r6 << r24
            r5 = r5 | r1
            r1 = r26
            goto L_0x01c8
        L_0x01c4:
            r27 = r1
            r1 = r24
        L_0x01c8:
            int r6 = r1 + 1
            char r1 = r2.charAt(r1)
            r24 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r3) goto L_0x01f3
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x01d9:
            int r28 = r6 + 1
            char r6 = r2.charAt(r6)
            if (r6 < r3) goto L_0x01ee
            r3 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r26
            r1 = r1 | r3
            int r26 = r26 + 13
            r6 = r28
            r3 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01d9
        L_0x01ee:
            int r3 = r6 << r26
            r1 = r1 | r3
            r6 = r28
        L_0x01f3:
            r3 = r1 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x01fd
            int r3 = r16 + 1
            r18[r16] = r17
            r16 = r3
        L_0x01fd:
            r3 = r1 & 255(0xff, float:3.57E-43)
            r26 = r14
            r14 = 51
            if (r3 < r14) goto L_0x029f
            int r14 = r6 + 1
            char r6 = r2.charAt(r6)
            r28 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r14) goto L_0x0237
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r14 = r28
            r28 = 13
        L_0x0218:
            int r29 = r14 + 1
            char r14 = r2.charAt(r14)
            r30 = r8
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r8) goto L_0x0231
            r8 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r28
            r6 = r6 | r8
            int r28 = r28 + 13
            r14 = r29
            r8 = r30
            goto L_0x0218
        L_0x0231:
            int r8 = r14 << r28
            r6 = r6 | r8
            r14 = r29
            goto L_0x023b
        L_0x0237:
            r30 = r8
            r14 = r28
        L_0x023b:
            int r8 = r3 + -51
            r28 = r14
            r14 = 9
            if (r8 == r14) goto L_0x025a
            r14 = 17
            if (r8 != r14) goto L_0x0248
            goto L_0x025a
        L_0x0248:
            r14 = 12
            if (r8 != r14) goto L_0x0266
            if (r7 != 0) goto L_0x0266
            int r7 = r17 / 3
            int r7 = r7 + r7
            r8 = 1
            int r7 = r7 + r8
            int r8 = r10 + 1
            r10 = r15[r10]
            r13[r7] = r10
            goto L_0x0265
        L_0x025a:
            int r7 = r17 / 3
            int r7 = r7 + r7
            r8 = 1
            int r7 = r7 + r8
            int r8 = r10 + 1
            r10 = r15[r10]
            r13[r7] = r10
        L_0x0265:
            r10 = r8
        L_0x0266:
            int r6 = r6 + r6
            r7 = r15[r6]
            boolean r8 = r7 instanceof java.lang.reflect.Field
            if (r8 == 0) goto L_0x0270
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0278
        L_0x0270:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m16992n(r9, r7)
            r15[r6] = r7
        L_0x0278:
            long r7 = r11.objectFieldOffset(r7)
            int r7 = (int) r7
            int r6 = r6 + 1
            r8 = r15[r6]
            boolean r14 = r8 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0288
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x0290
        L_0x0288:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m16992n(r9, r8)
            r15[r6] = r8
        L_0x0290:
            r14 = r7
            long r6 = r11.objectFieldOffset(r8)
            int r6 = (int) r6
            r7 = r14
            r23 = r15
            r25 = r28
            r14 = r6
            r6 = 0
            goto L_0x0384
        L_0x029f:
            r30 = r8
            int r8 = r10 + 1
            r10 = r15[r10]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = m16992n(r9, r10)
            r14 = 9
            if (r3 == r14) goto L_0x030f
            r14 = 17
            if (r3 != r14) goto L_0x02b4
            goto L_0x030f
        L_0x02b4:
            r14 = 27
            if (r3 == r14) goto L_0x0301
            r14 = 49
            if (r3 != r14) goto L_0x02bd
            goto L_0x0301
        L_0x02bd:
            r14 = 12
            if (r3 == r14) goto L_0x02f1
            r14 = 30
            if (r3 == r14) goto L_0x02f1
            r14 = 44
            if (r3 != r14) goto L_0x02ca
            goto L_0x02f1
        L_0x02ca:
            r7 = 50
            if (r3 != r7) goto L_0x02ff
            int r7 = r21 + 1
            r18[r21] = r17
            int r14 = r17 / 3
            int r21 = r8 + 1
            r8 = r15[r8]
            int r14 = r14 + r14
            r13[r14] = r8
            r8 = r1 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02ea
            int r14 = r14 + 1
            int r8 = r21 + 1
            r21 = r15[r21]
            r13[r14] = r21
            r21 = r7
            goto L_0x031a
        L_0x02ea:
            r23 = r15
            r8 = r21
            r21 = r7
            goto L_0x031c
        L_0x02f1:
            if (r7 != 0) goto L_0x02ff
            int r7 = r17 / 3
            int r7 = r7 + r7
            r14 = 1
            int r7 = r7 + r14
            int r23 = r8 + 1
            r8 = r15[r8]
            r13[r7] = r8
            goto L_0x030c
        L_0x02ff:
            r14 = 1
            goto L_0x031a
        L_0x0301:
            r14 = 1
            int r7 = r17 / 3
            int r7 = r7 + r7
            int r7 = r7 + r14
            int r23 = r8 + 1
            r8 = r15[r8]
            r13[r7] = r8
        L_0x030c:
            r8 = r23
            goto L_0x031a
        L_0x030f:
            r14 = 1
            int r7 = r17 / 3
            int r7 = r7 + r7
            int r7 = r7 + r14
            java.lang.Class r23 = r10.getType()
            r13[r7] = r23
        L_0x031a:
            r23 = r15
        L_0x031c:
            long r14 = r11.objectFieldOffset(r10)
            int r7 = (int) r14
            r10 = r1 & 4096(0x1000, float:5.74E-42)
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r15 = 4096(0x1000, float:5.74E-42)
            if (r10 != r15) goto L_0x0372
            r10 = 17
            if (r3 > r10) goto L_0x0372
            int r10 = r6 + 1
            char r6 = r2.charAt(r6)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r15) goto L_0x0351
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x033d:
            int r25 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r15) goto L_0x034e
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r14
            r6 = r6 | r10
            int r14 = r14 + 13
            r10 = r25
            goto L_0x033d
        L_0x034e:
            int r10 = r10 << r14
            r6 = r6 | r10
            goto L_0x0353
        L_0x0351:
            r25 = r10
        L_0x0353:
            int r10 = r4 + r4
            int r14 = r6 / 32
            int r10 = r10 + r14
            r14 = r23[r10]
            boolean r15 = r14 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0361
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x0369
        L_0x0361:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = m16992n(r9, r14)
            r23[r10] = r14
        L_0x0369:
            long r14 = r11.objectFieldOffset(r14)
            int r10 = (int) r14
            int r6 = r6 % 32
            r14 = r10
            goto L_0x0375
        L_0x0372:
            r25 = r6
            r6 = 0
        L_0x0375:
            r10 = 18
            if (r3 < r10) goto L_0x0383
            r10 = 49
            if (r3 > r10) goto L_0x0383
            int r10 = r22 + 1
            r18[r22] = r7
            r22 = r10
        L_0x0383:
            r10 = r8
        L_0x0384:
            int r8 = r17 + 1
            r12[r17] = r5
            int r5 = r8 + 1
            r15 = r1 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x0391
            r15 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0392
        L_0x0391:
            r15 = 0
        L_0x0392:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0399
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039a
        L_0x0399:
            r1 = 0
        L_0x039a:
            int r3 = r3 << 20
            r1 = r1 | r15
            r1 = r1 | r3
            r1 = r1 | r7
            r12[r8] = r1
            int r17 = r5 + 1
            int r1 = r6 << 20
            r1 = r1 | r14
            r12[r5] = r1
            r15 = r23
            r3 = r24
            r5 = r25
            r14 = r26
            r1 = r27
            r8 = r30
            r6 = 55296(0xd800, float:7.7486E-41)
            goto L_0x018f
        L_0x03b9:
            r30 = r8
            r26 = r14
            com.google.android.gms.internal.measurement.ua r1 = new com.google.android.gms.internal.measurement.ua
            com.google.android.gms.internal.measurement.ra r15 = r0.mo12951a()
            r17 = 0
            r10 = r1
            r11 = r12
            r12 = r13
            r13 = r30
            r16 = r7
            r21 = r33
            r22 = r34
            r23 = r35
            r24 = r36
            r25 = r37
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r1
        L_0x03da:
            android.support.p013v4.media.session.C0125b.m366a(r32)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4437ua.m16972H(java.lang.Class, com.google.android.gms.internal.measurement.oa, com.google.android.gms.internal.measurement.wa, com.google.android.gms.internal.measurement.fa, com.google.android.gms.internal.measurement.hb, com.google.android.gms.internal.measurement.f9, com.google.android.gms.internal.measurement.ma):com.google.android.gms.internal.measurement.ua");
    }

    /* renamed from: I */
    private static double m16973I(Object obj, long j) {
        return ((Double) C4387rb.m16584k(obj, j)).doubleValue();
    }

    /* renamed from: J */
    private static float m16974J(Object obj, long j) {
        return ((Float) C4387rb.m16584k(obj, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x032c, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x036c, code lost:
        r6 = r6 + r3;
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03a0, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04ae, code lost:
        r3 = r3 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0561, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0570, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0574, code lost:
        r5 = r5 + 3;
        r4 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f1, code lost:
        r3 = r3 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01af, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bf, code lost:
        r3 = r3 + 8;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m16975K(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f13732q
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r4
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x000c:
            int[] r9 = r0.f13733a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x057b
            int r9 = r15.m16985U(r5)
            int[] r10 = r0.f13733a
            r11 = r10[r5]
            int r12 = m16984T(r9)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0035
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r4
            int r10 = r10 >>> 20
            if (r13 == r7) goto L_0x0032
            long r7 = (long) r13
            int r8 = r2.getInt(r1, r7)
            r7 = r13
        L_0x0032:
            int r10 = r14 << r10
            goto L_0x0036
        L_0x0035:
            r10 = 0
        L_0x0036:
            r9 = r9 & r4
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x0565;
                case 1: goto L_0x0556;
                case 2: goto L_0x0540;
                case 3: goto L_0x052c;
                case 4: goto L_0x0518;
                case 5: goto L_0x050c;
                case 6: goto L_0x0500;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04c4;
                case 9: goto L_0x04b1;
                case 10: goto L_0x0492;
                case 11: goto L_0x047d;
                case 12: goto L_0x0468;
                case 13: goto L_0x045b;
                case 14: goto L_0x044e;
                case 15: goto L_0x0434;
                case 16: goto L_0x041a;
                case 17: goto L_0x0406;
                case 18: goto L_0x03f8;
                case 19: goto L_0x03ec;
                case 20: goto L_0x03e0;
                case 21: goto L_0x03d4;
                case 22: goto L_0x03c8;
                case 23: goto L_0x03bc;
                case 24: goto L_0x03b0;
                case 25: goto L_0x03a4;
                case 26: goto L_0x0396;
                case 27: goto L_0x0387;
                case 28: goto L_0x037c;
                case 29: goto L_0x0370;
                case 30: goto L_0x0361;
                case 31: goto L_0x0355;
                case 32: goto L_0x0349;
                case 33: goto L_0x033d;
                case 34: goto L_0x0331;
                case 35: goto L_0x0316;
                case 36: goto L_0x02ff;
                case 37: goto L_0x02e8;
                case 38: goto L_0x02d1;
                case 39: goto L_0x02ba;
                case 40: goto L_0x02a2;
                case 41: goto L_0x028a;
                case 42: goto L_0x0270;
                case 43: goto L_0x0258;
                case 44: goto L_0x0240;
                case 45: goto L_0x0228;
                case 46: goto L_0x0210;
                case 47: goto L_0x01f8;
                case 48: goto L_0x01e0;
                case 49: goto L_0x01d0;
                case 50: goto L_0x01c3;
                case 51: goto L_0x01b3;
                case 52: goto L_0x01a3;
                case 53: goto L_0x018d;
                case 54: goto L_0x0177;
                case 55: goto L_0x0161;
                case 56: goto L_0x0154;
                case 57: goto L_0x0147;
                case 58: goto L_0x0138;
                case 59: goto L_0x0108;
                case 60: goto L_0x00f4;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00be;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009a;
                case 65: goto L_0x008c;
                case 66: goto L_0x0071;
                case 67: goto L_0x0055;
                case 68: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x03a1
        L_0x003f:
            boolean r9 = r15.m16968C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.ra r3 = (com.google.android.gms.internal.measurement.C4386ra) r3
            com.google.android.gms.internal.measurement.cb r4 = r15.m16988j(r5)
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15480u(r11, r3, r4)
            goto L_0x03a0
        L_0x0055:
            boolean r10 = r15.m16968C(r1, r11, r5)
            if (r10 == 0) goto L_0x03a1
            long r3 = m16986V(r1, r3)
            int r10 = r11 << 3
            long r11 = r3 + r3
            long r3 = r3 >> r9
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r10)
            long r3 = r3 ^ r11
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15485z(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x03a1
        L_0x0071:
            boolean r9 = r15.m16968C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = m16976L(r1, r3)
            int r4 = r11 << 3
            int r9 = r3 + r3
            int r3 = r3 >> 31
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            goto L_0x032d
        L_0x008c:
            boolean r3 = r15.m16968C(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            goto L_0x01bf
        L_0x009a:
            boolean r3 = r15.m16968C(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            goto L_0x01af
        L_0x00a8:
            boolean r9 = r15.m16968C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = m16976L(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15481v(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032d
        L_0x00be:
            boolean r9 = r15.m16968C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = m16976L(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032d
        L_0x00d4:
            boolean r9 = r15.m16968C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.t8 r3 = (com.google.android.gms.internal.measurement.C4418t8) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.f13141d
            int r3 = r3.mo13355g()
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
        L_0x00f1:
            int r3 = r3 + r9
            goto L_0x03a0
        L_0x00f4:
            boolean r9 = r15.m16968C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.cb r4 = r15.m16988j(r5)
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15730L(r11, r3, r4)
            goto L_0x03a0
        L_0x0108:
            boolean r9 = r15.m16968C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.C4418t8
            if (r4 == 0) goto L_0x012a
            com.google.android.gms.internal.measurement.t8 r3 = (com.google.android.gms.internal.measurement.C4418t8) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.f13141d
            int r3 = r3.mo13355g()
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x00f1
        L_0x012a:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15483x(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032d
        L_0x0138:
            boolean r3 = r15.m16968C(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r3 = r3 + r14
            goto L_0x03a0
        L_0x0147:
            boolean r3 = r15.m16968C(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            goto L_0x01af
        L_0x0154:
            boolean r3 = r15.m16968C(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            goto L_0x01bf
        L_0x0161:
            boolean r9 = r15.m16968C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            int r3 = m16976L(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15481v(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032d
        L_0x0177:
            boolean r9 = r15.m16968C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            long r3 = m16986V(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15485z(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r9)
            goto L_0x032d
        L_0x018d:
            boolean r9 = r15.m16968C(r1, r11, r5)
            if (r9 == 0) goto L_0x03a1
            long r3 = m16986V(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15485z(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r9)
            goto L_0x032d
        L_0x01a3:
            boolean r3 = r15.m16968C(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
        L_0x01af:
            int r3 = r3 + 4
            goto L_0x03a0
        L_0x01b3:
            boolean r3 = r15.m16968C(r1, r11, r5)
            if (r3 == 0) goto L_0x03a1
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
        L_0x01bf:
            int r3 = r3 + 8
            goto L_0x03a0
        L_0x01c3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r15.m16989k(r5)
            com.google.android.gms.internal.measurement.C4301ma.m16281a(r11, r3, r4)
            goto L_0x03a1
        L_0x01d0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.cb r4 = r15.m16988j(r5)
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15725G(r11, r3, r4)
            goto L_0x03a0
        L_0x01e0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15735Q(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032c
        L_0x01f8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15733O(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032c
        L_0x0210:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15724F(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032c
        L_0x0228:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15722D(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032c
        L_0x0240:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15720B(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032c
        L_0x0258:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15738T(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032c
        L_0x0270:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r4 = com.google.android.gms.internal.measurement.C4166eb.f13218e
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032c
        L_0x028a:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15722D(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032c
        L_0x02a2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15724F(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032c
        L_0x02ba:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15727I(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032c
        L_0x02d1:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15740V(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032c
        L_0x02e8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15729K(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032c
        L_0x02ff:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15722D(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x032c
        L_0x0316:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15724F(r3)
            if (r3 <= 0) goto L_0x03a1
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
        L_0x032c:
            int r4 = r4 + r9
        L_0x032d:
            int r4 = r4 + r3
            int r6 = r6 + r4
            goto L_0x03a1
        L_0x0331:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r9 = 0
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15734P(r11, r3, r9)
            goto L_0x036c
        L_0x033d:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15732N(r11, r3, r9)
            goto L_0x036c
        L_0x0349:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15723E(r11, r3, r9)
            goto L_0x036c
        L_0x0355:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15721C(r11, r3, r9)
            goto L_0x036c
        L_0x0361:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15719A(r11, r3, r9)
        L_0x036c:
            int r6 = r6 + r3
            r12 = r9
            goto L_0x0574
        L_0x0370:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15737S(r11, r3, r9)
            goto L_0x03a0
        L_0x037c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15768z(r11, r3)
            goto L_0x03a0
        L_0x0387:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.cb r4 = r15.m16988j(r5)
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15731M(r11, r3, r4)
            goto L_0x03a0
        L_0x0396:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15736R(r11, r3)
        L_0x03a0:
            int r6 = r6 + r3
        L_0x03a1:
            r12 = 0
            goto L_0x0574
        L_0x03a4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15767y(r11, r3, r12)
            goto L_0x0403
        L_0x03b0:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15721C(r11, r3, r12)
            goto L_0x0403
        L_0x03bc:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15723E(r11, r3, r12)
            goto L_0x0403
        L_0x03c8:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15726H(r11, r3, r12)
            goto L_0x0403
        L_0x03d4:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15739U(r11, r3, r12)
            goto L_0x0403
        L_0x03e0:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15728J(r11, r3, r12)
            goto L_0x0403
        L_0x03ec:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15721C(r11, r3, r12)
            goto L_0x0403
        L_0x03f8:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15723E(r11, r3, r12)
        L_0x0403:
            int r6 = r6 + r3
            goto L_0x0574
        L_0x0406:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.ra r3 = (com.google.android.gms.internal.measurement.C4386ra) r3
            com.google.android.gms.internal.measurement.cb r4 = r15.m16988j(r5)
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15480u(r11, r3, r4)
            goto L_0x0403
        L_0x041a:
            r12 = 0
            r10 = r10 & r8
            if (r10 == 0) goto L_0x0574
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            long r13 = r3 + r3
            long r3 = r3 >> r9
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r10)
            long r3 = r3 ^ r13
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15485z(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x0574
        L_0x0434:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r9 = r3 + r3
            int r3 = r3 >> 31
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            goto L_0x0553
        L_0x044e:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            goto L_0x0570
        L_0x045b:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            goto L_0x0561
        L_0x0468:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15481v(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x0553
        L_0x047d:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x0553
        L_0x0492:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.t8 r3 = (com.google.android.gms.internal.measurement.C4418t8) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.f13141d
            int r3 = r3.mo13355g()
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
        L_0x04ae:
            int r3 = r3 + r9
            goto L_0x0403
        L_0x04b1:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.cb r4 = r15.m16988j(r5)
            int r3 = com.google.android.gms.internal.measurement.C4166eb.m15730L(r11, r3, r4)
            goto L_0x0403
        L_0x04c4:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.C4418t8
            if (r4 == 0) goto L_0x04e5
            com.google.android.gms.internal.measurement.t8 r3 = (com.google.android.gms.internal.measurement.C4418t8) r3
            int r4 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C4096a9.f13141d
            int r3 = r3.mo13355g()
            int r9 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r9 = r9 + r3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x04ae
        L_0x04e5:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15483x(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x0553
        L_0x04f2:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            int r3 = r3 + r14
            goto L_0x0403
        L_0x0500:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            goto L_0x0561
        L_0x050c:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
            goto L_0x0570
        L_0x0518:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15481v(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x0553
        L_0x052c:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15485z(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r9)
            goto L_0x0553
        L_0x0540:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0574
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15485z(r3)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r9)
        L_0x0553:
            int r4 = r4 + r3
            int r6 = r6 + r4
            goto L_0x0574
        L_0x0556:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
        L_0x0561:
            int r3 = r3 + 4
            goto L_0x0403
        L_0x0565:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0574
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r3)
        L_0x0570:
            int r3 = r3 + 8
            goto L_0x0403
        L_0x0574:
            int r5 = r5 + 3
            r4 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000c
        L_0x057b:
            com.google.android.gms.internal.measurement.hb r2 = r0.f13744l
            java.lang.Object r3 = r2.mo13214d(r1)
            int r2 = r2.mo13211a(r3)
            int r6 = r6 + r2
            boolean r2 = r0.f13738f
            if (r2 != 0) goto L_0x058b
            return r6
        L_0x058b:
            com.google.android.gms.internal.measurement.f9 r2 = r0.f13745m
            r2.mo13123a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4437ua.m16975K(java.lang.Object):int");
    }

    /* renamed from: L */
    private static int m16976L(Object obj, long j) {
        return ((Integer) C4387rb.m16584k(obj, j)).intValue();
    }

    /* renamed from: M */
    private final int m16977M(Object obj, byte[] bArr, int i, int i2, int i3, long j, C4197g8 g8Var) {
        Unsafe unsafe = f13732q;
        Object k = m16989k(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((C4284la) object).mo13326e()) {
            C4284la b = C4284la.m16228a().mo13322b();
            C4301ma.m16282b(b, object);
            unsafe.putObject(obj, j, b);
        }
        C0125b.m366a(k);
        throw null;
    }

    /* renamed from: N */
    private final int m16978N(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C4197g8 g8Var) {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        long j2 = j;
        int i15 = i8;
        C4197g8 g8Var2 = g8Var;
        Unsafe unsafe = f13732q;
        long j3 = (long) (this.f13733a[i15 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(C4214h8.m15997p(bArr, i))));
                    int i16 = i9 + 8;
                    unsafe.putInt(obj2, j3, i13);
                    return i16;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(C4214h8.m15983b(bArr, i))));
                    int i17 = i9 + 4;
                    unsafe.putInt(obj2, j3, i13);
                    return i17;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int m = C4214h8.m15994m(bArr2, i9, g8Var2);
                    unsafe.putObject(obj2, j2, Long.valueOf(g8Var2.f13253b));
                    unsafe.putInt(obj2, j3, i13);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int j4 = C4214h8.m15991j(bArr2, i9, g8Var2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(g8Var2.f13252a));
                    unsafe.putInt(obj2, j3, i13);
                    return j4;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj2, j2, Long.valueOf(C4214h8.m15997p(bArr, i)));
                    int i18 = i9 + 8;
                    unsafe.putInt(obj2, j3, i13);
                    return i18;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj2, j2, Integer.valueOf(C4214h8.m15983b(bArr, i)));
                    int i19 = i9 + 4;
                    unsafe.putInt(obj2, j3, i13);
                    return i19;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int m2 = C4214h8.m15994m(bArr2, i9, g8Var2);
                    unsafe.putObject(obj2, j2, Boolean.valueOf(g8Var2.f13253b != 0));
                    unsafe.putInt(obj2, j3, i13);
                    return m2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int j5 = C4214h8.m15991j(bArr2, i9, g8Var2);
                    int i22 = g8Var2.f13252a;
                    if (i22 == 0) {
                        unsafe.putObject(obj2, j2, "");
                    } else if ((i6 & 536870912) == 0 || C4472wb.m17103e(bArr2, j5, j5 + i22)) {
                        unsafe.putObject(obj2, j2, new String(bArr2, j5, i22, C4470w9.f13782b));
                        j5 += i22;
                    } else {
                        throw zzll.m17329c();
                    }
                    unsafe.putInt(obj2, j3, i13);
                    return j5;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object m3 = m16991m(obj2, i13, i15);
                    int o = C4214h8.m15996o(m3, m16988j(i15), bArr, i, i2, g8Var);
                    m16999v(obj2, i13, i15, m3);
                    return o;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int a = C4214h8.m15982a(bArr2, i9, g8Var2);
                    unsafe.putObject(obj2, j2, g8Var2.f13254c);
                    unsafe.putInt(obj2, j3, i13);
                    return a;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int j6 = C4214h8.m15991j(bArr2, i9, g8Var2);
                    int i23 = g8Var2.f13252a;
                    C4402s9 i24 = m16987i(i15);
                    if (i24 == null || i24.mo12904d(i23)) {
                        unsafe.putObject(obj2, j2, Integer.valueOf(i23));
                        unsafe.putInt(obj2, j3, i13);
                    } else {
                        m16971G(obj).mo13265j(i12, Long.valueOf((long) i23));
                    }
                    return j6;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int j7 = C4214h8.m15991j(bArr2, i9, g8Var2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(C4485x8.m17147a(g8Var2.f13252a)));
                    unsafe.putInt(obj2, j3, i13);
                    return j7;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int m4 = C4214h8.m15994m(bArr2, i9, g8Var2);
                    unsafe.putObject(obj2, j2, Long.valueOf(C4485x8.m17148b(g8Var2.f13253b)));
                    unsafe.putInt(obj2, j3, i13);
                    return m4;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object m5 = m16991m(obj2, i13, i15);
                    int n = C4214h8.m15995n(m5, m16988j(i15), bArr, i, i2, (i12 & -8) | 4, g8Var);
                    m16999v(obj2, i13, i15, m5);
                    return n;
                }
                break;
        }
        return i9;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0426 A[SYNTHETIC] */
    /* renamed from: O */
    private final int m16979O(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.C4197g8 r29) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r8 = r21
            r6 = r22
            r9 = r23
            r10 = r27
            r7 = r29
            sun.misc.Unsafe r12 = f13732q
            java.lang.Object r13 = r12.getObject(r1, r10)
            com.google.android.gms.internal.measurement.v9 r13 = (com.google.android.gms.internal.measurement.C4453v9) r13
            boolean r14 = r13.mo13068s()
            if (r14 != 0) goto L_0x0034
            int r14 = r13.size()
            if (r14 != 0) goto L_0x002c
            r14 = 10
            goto L_0x002d
        L_0x002c:
            int r14 = r14 + r14
        L_0x002d:
            com.google.android.gms.internal.measurement.v9 r13 = r13.mo12866e(r14)
            r12.putObject(r1, r10, r13)
        L_0x0034:
            r10 = 5
            r11 = 1
            r12 = 0
            r14 = 2
            switch(r26) {
                case 18: goto L_0x03d7;
                case 19: goto L_0x03aa;
                case 20: goto L_0x0367;
                case 21: goto L_0x0367;
                case 22: goto L_0x034e;
                case 23: goto L_0x030d;
                case 24: goto L_0x02cc;
                case 25: goto L_0x02a4;
                case 26: goto L_0x01ef;
                case 27: goto L_0x01d6;
                case 28: goto L_0x017c;
                case 29: goto L_0x034e;
                case 30: goto L_0x00fb;
                case 31: goto L_0x02cc;
                case 32: goto L_0x030d;
                case 33: goto L_0x00ac;
                case 34: goto L_0x005d;
                case 35: goto L_0x03d7;
                case 36: goto L_0x03aa;
                case 37: goto L_0x0367;
                case 38: goto L_0x0367;
                case 39: goto L_0x034e;
                case 40: goto L_0x030d;
                case 41: goto L_0x02cc;
                case 42: goto L_0x02a4;
                case 43: goto L_0x034e;
                case 44: goto L_0x00fb;
                case 45: goto L_0x02cc;
                case 46: goto L_0x030d;
                case 47: goto L_0x00ac;
                case 48: goto L_0x005d;
                default: goto L_0x003b;
            }
        L_0x003b:
            r1 = 3
            if (r6 != r1) goto L_0x0425
            com.google.android.gms.internal.measurement.cb r1 = r15.m16988j(r9)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.measurement.C4214h8.m15984c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f13254c
            r13.add(r8)
            goto L_0x0403
        L_0x005d:
            if (r6 != r14) goto L_0x0081
            com.google.android.gms.internal.measurement.ga r13 = (com.google.android.gms.internal.measurement.C4199ga) r13
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r2 = r7.f13252a
            int r2 = r2 + r1
        L_0x0068:
            if (r1 >= r2) goto L_0x0078
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15994m(r3, r1, r7)
            long r4 = r7.f13253b
            long r4 = com.google.android.gms.internal.measurement.C4485x8.m17148b(r4)
            r13.mo13151g(r4)
            goto L_0x0068
        L_0x0078:
            if (r1 != r2) goto L_0x007c
            goto L_0x0426
        L_0x007c:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17332f()
            throw r1
        L_0x0081:
            if (r6 != 0) goto L_0x0425
            com.google.android.gms.internal.measurement.ga r13 = (com.google.android.gms.internal.measurement.C4199ga) r13
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15994m(r3, r4, r7)
            long r8 = r7.f13253b
            long r8 = com.google.android.gms.internal.measurement.C4485x8.m17148b(r8)
            r13.mo13151g(r8)
        L_0x0092:
            if (r1 >= r5) goto L_0x00ab
            int r4 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r1, r7)
            int r6 = r7.f13252a
            if (r2 == r6) goto L_0x009d
            goto L_0x00ab
        L_0x009d:
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15994m(r3, r4, r7)
            long r8 = r7.f13253b
            long r8 = com.google.android.gms.internal.measurement.C4485x8.m17148b(r8)
            r13.mo13151g(r8)
            goto L_0x0092
        L_0x00ab:
            return r1
        L_0x00ac:
            if (r6 != r14) goto L_0x00d0
            com.google.android.gms.internal.measurement.q9 r13 = (com.google.android.gms.internal.measurement.C4368q9) r13
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r2 = r7.f13252a
            int r2 = r2 + r1
        L_0x00b7:
            if (r1 >= r2) goto L_0x00c7
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r1, r7)
            int r4 = r7.f13252a
            int r4 = com.google.android.gms.internal.measurement.C4485x8.m17147a(r4)
            r13.mo13498i(r4)
            goto L_0x00b7
        L_0x00c7:
            if (r1 != r2) goto L_0x00cb
            goto L_0x0426
        L_0x00cb:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17332f()
            throw r1
        L_0x00d0:
            if (r6 != 0) goto L_0x0425
            com.google.android.gms.internal.measurement.q9 r13 = (com.google.android.gms.internal.measurement.C4368q9) r13
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r4 = r7.f13252a
            int r4 = com.google.android.gms.internal.measurement.C4485x8.m17147a(r4)
            r13.mo13498i(r4)
        L_0x00e1:
            if (r1 >= r5) goto L_0x00fa
            int r4 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r1, r7)
            int r6 = r7.f13252a
            if (r2 == r6) goto L_0x00ec
            goto L_0x00fa
        L_0x00ec:
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r4 = r7.f13252a
            int r4 = com.google.android.gms.internal.measurement.C4485x8.m17147a(r4)
            r13.mo13498i(r4)
            goto L_0x00e1
        L_0x00fa:
            return r1
        L_0x00fb:
            if (r6 != r14) goto L_0x0102
            int r2 = com.google.android.gms.internal.measurement.C4214h8.m15987f(r3, r4, r13, r7)
            goto L_0x0113
        L_0x0102:
            if (r6 != 0) goto L_0x0425
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r13
            r7 = r29
            int r2 = com.google.android.gms.internal.measurement.C4214h8.m15993l(r2, r3, r4, r5, r6, r7)
        L_0x0113:
            com.google.android.gms.internal.measurement.s9 r3 = r15.m16987i(r9)
            com.google.android.gms.internal.measurement.hb r4 = r0.f13744l
            int r5 = com.google.android.gms.internal.measurement.C4166eb.f13218e
            if (r3 == 0) goto L_0x0179
            boolean r5 = r13 instanceof java.util.RandomAccess
            if (r5 == 0) goto L_0x0157
            int r5 = r13.size()
            r6 = 0
            r7 = r6
        L_0x0127:
            if (r6 >= r5) goto L_0x014d
            java.lang.Object r9 = r13.get(r6)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            boolean r10 = r3.mo12904d(r9)
            if (r10 == 0) goto L_0x0145
            if (r6 == r7) goto L_0x0142
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13.set(r7, r9)
        L_0x0142:
            int r7 = r7 + 1
            goto L_0x014a
        L_0x0145:
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4166eb.m15744b(r1, r8, r9, r12, r4)
            r12 = r9
        L_0x014a:
            int r6 = r6 + 1
            goto L_0x0127
        L_0x014d:
            if (r7 == r5) goto L_0x0179
            java.util.List r1 = r13.subList(r7, r5)
            r1.clear()
            return r2
        L_0x0157:
            java.util.Iterator r5 = r13.iterator()
        L_0x015b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0179
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            boolean r7 = r3.mo12904d(r6)
            if (r7 != 0) goto L_0x015b
            java.lang.Object r12 = com.google.android.gms.internal.measurement.C4166eb.m15744b(r1, r8, r6, r12, r4)
            r5.remove()
            goto L_0x015b
        L_0x0179:
            r1 = r2
            goto L_0x0426
        L_0x017c:
            if (r6 != r14) goto L_0x0425
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r4 = r7.f13252a
            if (r4 < 0) goto L_0x01d1
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01cc
            if (r4 != 0) goto L_0x0192
            com.google.android.gms.internal.measurement.t8 r4 = com.google.android.gms.internal.measurement.C4418t8.f13699e
            r13.add(r4)
            goto L_0x019a
        L_0x0192:
            com.google.android.gms.internal.measurement.t8 r6 = com.google.android.gms.internal.measurement.C4418t8.m16750w(r3, r1, r4)
            r13.add(r6)
        L_0x0199:
            int r1 = r1 + r4
        L_0x019a:
            if (r1 >= r5) goto L_0x01cb
            int r4 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r1, r7)
            int r6 = r7.f13252a
            if (r2 == r6) goto L_0x01a5
            goto L_0x01cb
        L_0x01a5:
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r4 = r7.f13252a
            if (r4 < 0) goto L_0x01c6
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01c1
            if (r4 != 0) goto L_0x01b9
            com.google.android.gms.internal.measurement.t8 r4 = com.google.android.gms.internal.measurement.C4418t8.f13699e
            r13.add(r4)
            goto L_0x019a
        L_0x01b9:
            com.google.android.gms.internal.measurement.t8 r6 = com.google.android.gms.internal.measurement.C4418t8.m16750w(r3, r1, r4)
            r13.add(r6)
            goto L_0x0199
        L_0x01c1:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17332f()
            throw r1
        L_0x01c6:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17330d()
            throw r1
        L_0x01cb:
            return r1
        L_0x01cc:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17332f()
            throw r1
        L_0x01d1:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17330d()
            throw r1
        L_0x01d6:
            if (r6 != r14) goto L_0x0425
            com.google.android.gms.internal.measurement.cb r1 = r15.m16988j(r9)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r13
            r27 = r29
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15986e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01ef:
            if (r6 != r14) goto L_0x0425
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            r10 = 0
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x0244
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r4 = r7.f13252a
            if (r4 < 0) goto L_0x023f
            if (r4 != 0) goto L_0x020c
            r13.add(r6)
            goto L_0x0217
        L_0x020c:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C4470w9.f13782b
            r8.<init>(r3, r1, r4, r9)
            r13.add(r8)
        L_0x0216:
            int r1 = r1 + r4
        L_0x0217:
            if (r1 >= r5) goto L_0x0426
            int r4 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r1, r7)
            int r8 = r7.f13252a
            if (r2 != r8) goto L_0x0426
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r4 = r7.f13252a
            if (r4 < 0) goto L_0x023a
            if (r4 != 0) goto L_0x022f
            r13.add(r6)
            goto L_0x0217
        L_0x022f:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C4470w9.f13782b
            r8.<init>(r3, r1, r4, r9)
            r13.add(r8)
            goto L_0x0216
        L_0x023a:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17330d()
            throw r1
        L_0x023f:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17330d()
            throw r1
        L_0x0244:
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r4 = r7.f13252a
            if (r4 < 0) goto L_0x029f
            if (r4 != 0) goto L_0x0252
            r13.add(r6)
            goto L_0x0265
        L_0x0252:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.C4472wb.m17103e(r3, r1, r8)
            if (r9 == 0) goto L_0x029a
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C4470w9.f13782b
            r9.<init>(r3, r1, r4, r10)
            r13.add(r9)
        L_0x0264:
            r1 = r8
        L_0x0265:
            if (r1 >= r5) goto L_0x0426
            int r4 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r1, r7)
            int r8 = r7.f13252a
            if (r2 != r8) goto L_0x0426
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r4 = r7.f13252a
            if (r4 < 0) goto L_0x0295
            if (r4 != 0) goto L_0x027d
            r13.add(r6)
            goto L_0x0265
        L_0x027d:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.C4472wb.m17103e(r3, r1, r8)
            if (r9 == 0) goto L_0x0290
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C4470w9.f13782b
            r9.<init>(r3, r1, r4, r10)
            r13.add(r9)
            goto L_0x0264
        L_0x0290:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17329c()
            throw r1
        L_0x0295:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17330d()
            throw r1
        L_0x029a:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17329c()
            throw r1
        L_0x029f:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17330d()
            throw r1
        L_0x02a4:
            if (r6 != r14) goto L_0x02bf
            android.support.p013v4.media.session.C0125b.m366a(r13)
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r2 = r7.f13252a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x02bb
            if (r1 != r2) goto L_0x02b6
            goto L_0x0426
        L_0x02b6:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17332f()
            throw r1
        L_0x02bb:
            com.google.android.gms.internal.measurement.C4214h8.m15994m(r3, r1, r7)
            throw r12
        L_0x02bf:
            if (r6 == 0) goto L_0x02c3
            goto L_0x0425
        L_0x02c3:
            android.support.p013v4.media.session.C0125b.m366a(r13)
            com.google.android.gms.internal.measurement.C4214h8.m15994m(r3, r4, r7)
            long r1 = r7.f13253b
            throw r12
        L_0x02cc:
            if (r6 != r14) goto L_0x02ec
            com.google.android.gms.internal.measurement.q9 r13 = (com.google.android.gms.internal.measurement.C4368q9) r13
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r2 = r7.f13252a
            int r2 = r2 + r1
        L_0x02d7:
            if (r1 >= r2) goto L_0x02e3
            int r4 = com.google.android.gms.internal.measurement.C4214h8.m15983b(r3, r1)
            r13.mo13498i(r4)
            int r1 = r1 + 4
            goto L_0x02d7
        L_0x02e3:
            if (r1 != r2) goto L_0x02e7
            goto L_0x0426
        L_0x02e7:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17332f()
            throw r1
        L_0x02ec:
            if (r6 != r10) goto L_0x0425
            com.google.android.gms.internal.measurement.q9 r13 = (com.google.android.gms.internal.measurement.C4368q9) r13
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15983b(r17, r18)
            r13.mo13498i(r1)
        L_0x02f7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x030c
            int r4 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r1, r7)
            int r6 = r7.f13252a
            if (r2 == r6) goto L_0x0304
            goto L_0x030c
        L_0x0304:
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15983b(r3, r4)
            r13.mo13498i(r1)
            goto L_0x02f7
        L_0x030c:
            return r1
        L_0x030d:
            if (r6 != r14) goto L_0x032d
            com.google.android.gms.internal.measurement.ga r13 = (com.google.android.gms.internal.measurement.C4199ga) r13
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r2 = r7.f13252a
            int r2 = r2 + r1
        L_0x0318:
            if (r1 >= r2) goto L_0x0324
            long r4 = com.google.android.gms.internal.measurement.C4214h8.m15997p(r3, r1)
            r13.mo13151g(r4)
            int r1 = r1 + 8
            goto L_0x0318
        L_0x0324:
            if (r1 != r2) goto L_0x0328
            goto L_0x0426
        L_0x0328:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17332f()
            throw r1
        L_0x032d:
            if (r6 != r11) goto L_0x0425
            com.google.android.gms.internal.measurement.ga r13 = (com.google.android.gms.internal.measurement.C4199ga) r13
            long r8 = com.google.android.gms.internal.measurement.C4214h8.m15997p(r17, r18)
            r13.mo13151g(r8)
        L_0x0338:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x034d
            int r4 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r1, r7)
            int r6 = r7.f13252a
            if (r2 == r6) goto L_0x0345
            goto L_0x034d
        L_0x0345:
            long r8 = com.google.android.gms.internal.measurement.C4214h8.m15997p(r3, r4)
            r13.mo13151g(r8)
            goto L_0x0338
        L_0x034d:
            return r1
        L_0x034e:
            if (r6 != r14) goto L_0x0356
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15987f(r3, r4, r13, r7)
            goto L_0x0426
        L_0x0356:
            if (r6 != 0) goto L_0x0425
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r13
            r25 = r29
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15993l(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0367:
            if (r6 != r14) goto L_0x0387
            com.google.android.gms.internal.measurement.ga r13 = (com.google.android.gms.internal.measurement.C4199ga) r13
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r2 = r7.f13252a
            int r2 = r2 + r1
        L_0x0372:
            if (r1 >= r2) goto L_0x037e
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15994m(r3, r1, r7)
            long r4 = r7.f13253b
            r13.mo13151g(r4)
            goto L_0x0372
        L_0x037e:
            if (r1 != r2) goto L_0x0382
            goto L_0x0426
        L_0x0382:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17332f()
            throw r1
        L_0x0387:
            if (r6 != 0) goto L_0x0425
            com.google.android.gms.internal.measurement.ga r13 = (com.google.android.gms.internal.measurement.C4199ga) r13
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15994m(r3, r4, r7)
            long r8 = r7.f13253b
            r13.mo13151g(r8)
        L_0x0394:
            if (r1 >= r5) goto L_0x03a9
            int r4 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r1, r7)
            int r6 = r7.f13252a
            if (r2 == r6) goto L_0x039f
            goto L_0x03a9
        L_0x039f:
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15994m(r3, r4, r7)
            long r8 = r7.f13253b
            r13.mo13151g(r8)
            goto L_0x0394
        L_0x03a9:
            return r1
        L_0x03aa:
            if (r6 != r14) goto L_0x03c9
            android.support.p013v4.media.session.C0125b.m366a(r13)
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r2 = r7.f13252a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x03c1
            if (r1 != r2) goto L_0x03bc
            goto L_0x0426
        L_0x03bc:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17332f()
            throw r1
        L_0x03c1:
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15983b(r3, r1)
            java.lang.Float.intBitsToFloat(r1)
            throw r12
        L_0x03c9:
            if (r6 == r10) goto L_0x03cc
            goto L_0x0425
        L_0x03cc:
            android.support.p013v4.media.session.C0125b.m366a(r13)
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15983b(r17, r18)
            java.lang.Float.intBitsToFloat(r1)
            throw r12
        L_0x03d7:
            if (r6 != r14) goto L_0x03f5
            android.support.p013v4.media.session.C0125b.m366a(r13)
            int r1 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r2 = r7.f13252a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x03ed
            if (r1 != r2) goto L_0x03e8
            goto L_0x0426
        L_0x03e8:
            com.google.android.gms.internal.measurement.zzll r1 = com.google.android.gms.internal.measurement.zzll.m17332f()
            throw r1
        L_0x03ed:
            long r1 = com.google.android.gms.internal.measurement.C4214h8.m15997p(r3, r1)
            java.lang.Double.longBitsToDouble(r1)
            throw r12
        L_0x03f5:
            if (r6 == r11) goto L_0x03f8
            goto L_0x0425
        L_0x03f8:
            android.support.p013v4.media.session.C0125b.m366a(r13)
            long r1 = com.google.android.gms.internal.measurement.C4214h8.m15997p(r17, r18)
            java.lang.Double.longBitsToDouble(r1)
            throw r12
        L_0x0403:
            if (r4 >= r5) goto L_0x0424
            int r8 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r3, r4, r7)
            int r9 = r7.f13252a
            if (r2 == r9) goto L_0x040e
            goto L_0x0424
        L_0x040e:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.measurement.C4214h8.m15984c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f13254c
            r13.add(r8)
            goto L_0x0403
        L_0x0424:
            return r4
        L_0x0425:
            r1 = r4
        L_0x0426:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4437ua.m16979O(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.g8):int");
    }

    /* renamed from: P */
    private final int m16980P(int i) {
        if (i < this.f13735c || i > this.f13736d) {
            return -1;
        }
        return m16983S(i, 0);
    }

    /* renamed from: Q */
    private final int m16981Q(int i, int i2) {
        if (i < this.f13735c || i > this.f13736d) {
            return -1;
        }
        return m16983S(i, i2);
    }

    /* renamed from: R */
    private final int m16982R(int i) {
        return this.f13733a[i + 2];
    }

    /* renamed from: S */
    private final int m16983S(int i, int i2) {
        int length = (this.f13733a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f13733a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: T */
    private static int m16984T(int i) {
        return (i >>> 20) & C11051p3.f31759c;
    }

    /* renamed from: U */
    private final int m16985U(int i) {
        return this.f13733a[i + 1];
    }

    /* renamed from: V */
    private static long m16986V(Object obj, long j) {
        return ((Long) C4387rb.m16584k(obj, j)).longValue();
    }

    /* renamed from: i */
    private final C4402s9 m16987i(int i) {
        int i2 = i / 3;
        return (C4402s9) this.f13734b[i2 + i2 + 1];
    }

    /* renamed from: j */
    private final C4132cb m16988j(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        C4132cb cbVar = (C4132cb) this.f13734b[i3];
        if (cbVar != null) {
            return cbVar;
        }
        C4132cb b = C4519za.m17310a().mo13872b((Class) this.f13734b[i3 + 1]);
        this.f13734b[i3] = b;
        return b;
    }

    /* renamed from: k */
    private final Object m16989k(int i) {
        int i2 = i / 3;
        return this.f13734b[i2 + i2];
    }

    /* renamed from: l */
    private final Object m16990l(Object obj, int i) {
        C4132cb j = m16988j(i);
        int U = m16985U(i) & 1048575;
        if (!m17002y(obj, i)) {
            return j.mo12996t();
        }
        Object object = f13732q.getObject(obj, (long) U);
        if (m16967B(object)) {
            return object;
        }
        Object t = j.mo12996t();
        if (object != null) {
            j.mo12993f(t, object);
        }
        return t;
    }

    /* renamed from: m */
    private final Object m16991m(Object obj, int i, int i2) {
        C4132cb j = m16988j(i2);
        if (!m16968C(obj, i, i2)) {
            return j.mo12996t();
        }
        Object object = f13732q.getObject(obj, (long) (m16985U(i2) & 1048575));
        if (m16967B(object)) {
            return object;
        }
        Object t = j.mo12996t();
        if (object != null) {
            j.mo12993f(t, object);
        }
        return t;
    }

    /* renamed from: n */
    private static Field m16992n(Class cls, String str) {
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

    /* renamed from: o */
    private static void m16993o(Object obj) {
        if (!m16967B(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* renamed from: p */
    private final void m16994p(Object obj, Object obj2, int i) {
        if (m17002y(obj2, i)) {
            Unsafe unsafe = f13732q;
            long U = (long) (m16985U(i) & 1048575);
            Object object = unsafe.getObject(obj2, U);
            if (object != null) {
                C4132cb j = m16988j(i);
                if (!m17002y(obj, i)) {
                    if (!m16967B(object)) {
                        unsafe.putObject(obj, U, object);
                    } else {
                        Object t = j.mo12996t();
                        j.mo12993f(t, object);
                        unsafe.putObject(obj, U, t);
                    }
                    m16996r(obj, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, U);
                if (!m16967B(object2)) {
                    Object t2 = j.mo12996t();
                    j.mo12993f(t2, object2);
                    unsafe.putObject(obj, U, t2);
                    object2 = t2;
                }
                j.mo12993f(object2, object);
                return;
            }
            int i2 = this.f13733a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i2 + " is present but null: " + obj3);
        }
    }

    /* renamed from: q */
    private final void m16995q(Object obj, Object obj2, int i) {
        int i2 = this.f13733a[i];
        if (m16968C(obj2, i2, i)) {
            Unsafe unsafe = f13732q;
            long U = (long) (m16985U(i) & 1048575);
            Object object = unsafe.getObject(obj2, U);
            if (object != null) {
                C4132cb j = m16988j(i);
                if (!m16968C(obj, i2, i)) {
                    if (!m16967B(object)) {
                        unsafe.putObject(obj, U, object);
                    } else {
                        Object t = j.mo12996t();
                        j.mo12993f(t, object);
                        unsafe.putObject(obj, U, t);
                    }
                    m16997s(obj, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, U);
                if (!m16967B(object2)) {
                    Object t2 = j.mo12996t();
                    j.mo12993f(t2, object2);
                    unsafe.putObject(obj, U, t2);
                    object2 = t2;
                }
                j.mo12993f(object2, object);
                return;
            }
            int i3 = this.f13733a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i3 + " is present but null: " + obj3);
        }
    }

    /* renamed from: r */
    private final void m16996r(Object obj, int i) {
        int R = m16982R(i);
        long j = (long) (1048575 & R);
        if (j != 1048575) {
            C4387rb.m16595v(obj, j, (1 << (R >>> 20)) | C4387rb.m16581h(obj, j));
        }
    }

    /* renamed from: s */
    private final void m16997s(Object obj, int i, int i2) {
        C4387rb.m16595v(obj, (long) (m16982R(i2) & 1048575), i);
    }

    /* renamed from: u */
    private final void m16998u(Object obj, int i, Object obj2) {
        f13732q.putObject(obj, (long) (m16985U(i) & 1048575), obj2);
        m16996r(obj, i);
    }

    /* renamed from: v */
    private final void m16999v(Object obj, int i, int i2, Object obj2) {
        f13732q.putObject(obj, (long) (m16985U(i2) & 1048575), obj2);
        m16997s(obj, i, i2);
    }

    /* renamed from: w */
    private final void m17000w(C4504yb ybVar, int i, Object obj, int i2) {
        if (obj != null) {
            C0125b.m366a(m16989k(i2));
            throw null;
        }
    }

    /* renamed from: x */
    private final boolean m17001x(Object obj, Object obj2, int i) {
        return m17002y(obj, i) == m17002y(obj2, i);
    }

    /* renamed from: y */
    private final boolean m17002y(Object obj, int i) {
        int R = m16982R(i);
        long j = (long) (R & 1048575);
        if (j == 1048575) {
            int U = m16985U(i);
            long j2 = (long) (U & 1048575);
            switch (m16984T(U)) {
                case 0:
                    if (Double.doubleToRawLongBits(C4387rb.m16579f(obj, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(C4387rb.m16580g(obj, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C4387rb.m16582i(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C4387rb.m16582i(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C4387rb.m16581h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C4387rb.m16582i(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C4387rb.m16581h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C4387rb.m16570B(obj, j2);
                case 8:
                    Object k = C4387rb.m16584k(obj, j2);
                    if (k instanceof String) {
                        if (!((String) k).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(k instanceof C4418t8)) {
                        throw new IllegalArgumentException();
                    } else if (!C4418t8.f13699e.equals(k)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (C4387rb.m16584k(obj, j2) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!C4418t8.f13699e.equals(C4387rb.m16584k(obj, j2))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (C4387rb.m16581h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C4387rb.m16581h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C4387rb.m16581h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C4387rb.m16582i(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C4387rb.m16581h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C4387rb.m16582i(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C4387rb.m16584k(obj, j2) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((C4387rb.m16581h(obj, j) & (1 << (R >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: z */
    private final boolean m17003z(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m17002y(obj, i) : (i3 & i4) != 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v88, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x030c, code lost:
        if (r0 != r15) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x032a, code lost:
        r2 = r0;
        r7 = r20;
        r6 = r23;
        r0 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x035e, code lost:
        if (r0 != r15) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0386, code lost:
        if (r0 != r15) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0152, code lost:
        r5 = r7 | r8;
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0155, code lost:
        r1 = r11;
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0159, code lost:
        r12 = r6;
        r20 = r13;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ee, code lost:
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0221, code lost:
        r6 = r23;
        r8 = -1;
        r13 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x024f, code lost:
        r0 = r13 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0251, code lost:
        r5 = r7 | r8;
        r13 = r31;
        r2 = r6;
        r1 = r11;
        r3 = r20;
        r6 = r23;
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x025c, code lost:
        r11 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0260, code lost:
        r12 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0261, code lost:
        r0 = r32;
        r19 = r7;
        r26 = r10;
        r30 = r11;
        r21 = r12;
        r2 = r13;
        r7 = r20;
        r6 = r23;
        r18 = -1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03bf  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13755F(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.measurement.C4197g8 r33) {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r33
            m16993o(r28)
            sun.misc.Unsafe r10 = f13732q
            r16 = 0
            r8 = -1
            r0 = r30
            r1 = r8
            r2 = r16
            r3 = r2
            r5 = r3
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001e:
            if (r0 >= r13) goto L_0x03e5
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002f
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15992k(r0, r12, r3, r9)
            int r3 = r9.f13252a
            r4 = r3
            r3 = r0
            goto L_0x0030
        L_0x002f:
            r4 = r0
        L_0x0030:
            int r0 = r4 >>> 3
            r7 = 3
            if (r0 <= r1) goto L_0x003b
            int r2 = r2 / r7
            int r1 = r15.m16981Q(r0, r2)
            goto L_0x003f
        L_0x003b:
            int r1 = r15.m16980P(r0)
        L_0x003f:
            r2 = r1
            if (r2 != r8) goto L_0x0051
            r30 = r0
            r2 = r3
            r7 = r4
            r19 = r5
            r18 = r8
            r26 = r10
            r0 = r11
            r21 = r16
            goto L_0x0389
        L_0x0051:
            r1 = r4 & 7
            int[] r8 = r15.f13733a
            int r19 = r2 + 1
            r7 = r8[r19]
            int r11 = m16984T(r7)
            r19 = r0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r7 & r17
            r21 = r3
            r20 = r4
            long r3 = (long) r0
            r0 = 17
            if (r11 > r0) goto L_0x0274
            int r0 = r2 + 2
            r0 = r8[r0]
            int r8 = r0 >>> 20
            r13 = 1
            int r8 = r13 << r8
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r13
            r17 = r7
            if (r0 == r6) goto L_0x008d
            if (r6 == r13) goto L_0x0084
            long r6 = (long) r6
            r10.putInt(r14, r6, r5)
        L_0x0084:
            long r5 = (long) r0
            int r5 = r10.getInt(r14, r5)
            r23 = r0
            r7 = r5
            goto L_0x0090
        L_0x008d:
            r7 = r5
            r23 = r6
        L_0x0090:
            r0 = 5
            switch(r11) {
                case 0: goto L_0x023c;
                case 1: goto L_0x0227;
                case 2: goto L_0x0202;
                case 3: goto L_0x0202;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01d6;
                case 6: goto L_0x01c4;
                case 7: goto L_0x01a8;
                case 8: goto L_0x018a;
                case 9: goto L_0x015f;
                case 10: goto L_0x013f;
                case 11: goto L_0x01f1;
                case 12: goto L_0x0110;
                case 13: goto L_0x01c4;
                case 14: goto L_0x01d6;
                case 15: goto L_0x00f9;
                case 16: goto L_0x00ca;
                default: goto L_0x0094;
            }
        L_0x0094:
            r6 = r2
            r11 = r19
            r13 = r21
            r0 = 3
            if (r1 != r0) goto L_0x0260
            java.lang.Object r5 = r15.m16990l(r14, r6)
            int r0 = r11 << 3
            r17 = r0 | 4
            com.google.android.gms.internal.measurement.cb r1 = r15.m16988j(r6)
            r0 = r5
            r2 = r29
            r3 = r13
            r4 = r31
            r13 = r5
            r5 = r17
            r12 = r6
            r6 = r33
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15995n(r0, r1, r2, r3, r4, r5, r6)
            r15.m16998u(r14, r12, r13)
            r5 = r7 | r8
            r13 = r31
            r1 = r11
            r2 = r12
            r3 = r20
            r6 = r23
            r8 = -1
            r12 = r29
            goto L_0x025c
        L_0x00ca:
            if (r1 != 0) goto L_0x00f2
            r5 = r21
            int r6 = com.google.android.gms.internal.measurement.C4214h8.m15994m(r12, r5, r9)
            long r0 = r9.f13253b
            long r21 = com.google.android.gms.internal.measurement.C4485x8.m17148b(r0)
            r11 = r19
            r0 = r10
            r1 = r28
            r5 = r2
            r2 = r3
            r17 = r6
            r13 = r20
            r6 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            r5 = r7 | r8
            r2 = r6
            r1 = r11
            r3 = r13
            r0 = r17
            goto L_0x0221
        L_0x00f2:
            r11 = r19
            r12 = r2
            r13 = r21
            goto L_0x0261
        L_0x00f9:
            r6 = r2
            r11 = r19
            r13 = r20
            r5 = r21
            if (r1 != 0) goto L_0x0159
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r12, r5, r9)
            int r1 = r9.f13252a
            int r1 = com.google.android.gms.internal.measurement.C4485x8.m17147a(r1)
            r10.putInt(r14, r3, r1)
            goto L_0x0152
        L_0x0110:
            r6 = r2
            r11 = r19
            r13 = r20
            r5 = r21
            if (r1 != 0) goto L_0x0159
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r12, r5, r9)
            int r1 = r9.f13252a
            com.google.android.gms.internal.measurement.s9 r2 = r15.m16987i(r6)
            if (r2 == 0) goto L_0x013b
            boolean r2 = r2.mo12904d(r1)
            if (r2 == 0) goto L_0x012c
            goto L_0x013b
        L_0x012c:
            com.google.android.gms.internal.measurement.ib r2 = m16971G(r28)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo13265j(r13, r1)
            r2 = r6
            r5 = r7
            goto L_0x0155
        L_0x013b:
            r10.putInt(r14, r3, r1)
            goto L_0x0152
        L_0x013f:
            r6 = r2
            r11 = r19
            r13 = r20
            r5 = r21
            r0 = 2
            if (r1 != r0) goto L_0x0159
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15982a(r12, r5, r9)
            java.lang.Object r1 = r9.f13254c
            r10.putObject(r14, r3, r1)
        L_0x0152:
            r5 = r7 | r8
            r2 = r6
        L_0x0155:
            r1 = r11
            r3 = r13
            goto L_0x0221
        L_0x0159:
            r12 = r6
            r20 = r13
            r13 = r5
            goto L_0x0261
        L_0x015f:
            r6 = r2
            r11 = r19
            r13 = r20
            r5 = r21
            r0 = 2
            if (r1 != r0) goto L_0x0186
            java.lang.Object r4 = r15.m16990l(r14, r6)
            com.google.android.gms.internal.measurement.cb r1 = r15.m16988j(r6)
            r0 = r4
            r2 = r29
            r3 = r5
            r5 = r4
            r4 = r31
            r20 = r13
            r13 = r5
            r5 = r33
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15996o(r0, r1, r2, r3, r4, r5)
            r15.m16998u(r14, r6, r13)
            goto L_0x0251
        L_0x0186:
            r20 = r13
            goto L_0x01ee
        L_0x018a:
            r6 = r2
            r11 = r19
            r5 = r21
            r0 = 2
            if (r1 != r0) goto L_0x01ee
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r17 & r0
            if (r0 != 0) goto L_0x019d
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15988g(r12, r5, r9)
            goto L_0x01a1
        L_0x019d:
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15989h(r12, r5, r9)
        L_0x01a1:
            java.lang.Object r1 = r9.f13254c
            r10.putObject(r14, r3, r1)
            goto L_0x0251
        L_0x01a8:
            r6 = r2
            r11 = r19
            r5 = r21
            if (r1 != 0) goto L_0x01ee
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15994m(r12, r5, r9)
            long r1 = r9.f13253b
            r21 = 0
            int r1 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r1 == 0) goto L_0x01bd
            r13 = 1
            goto L_0x01bf
        L_0x01bd:
            r13 = r16
        L_0x01bf:
            com.google.android.gms.internal.measurement.C4387rb.m16591r(r14, r3, r13)
            goto L_0x0251
        L_0x01c4:
            r6 = r2
            r11 = r19
            r5 = r21
            if (r1 != r0) goto L_0x01ee
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15983b(r12, r5)
            r10.putInt(r14, r3, r0)
            int r0 = r5 + 4
            goto L_0x0251
        L_0x01d6:
            r6 = r2
            r11 = r19
            r5 = r21
            r0 = 1
            if (r1 != r0) goto L_0x01ee
            long r21 = com.google.android.gms.internal.measurement.C4214h8.m15997p(r12, r5)
            r0 = r10
            r1 = r28
            r13 = r5
            r2 = r3
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x024f
        L_0x01ee:
            r13 = r5
            goto L_0x0260
        L_0x01f1:
            r6 = r2
            r11 = r19
            r13 = r21
            if (r1 != 0) goto L_0x0260
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r12, r13, r9)
            int r1 = r9.f13252a
            r10.putInt(r14, r3, r1)
            goto L_0x0251
        L_0x0202:
            r6 = r2
            r11 = r19
            r13 = r21
            if (r1 != 0) goto L_0x0260
            int r13 = com.google.android.gms.internal.measurement.C4214h8.m15994m(r12, r13, r9)
            long r1 = r9.f13253b
            r0 = r10
            r21 = r1
            r1 = r28
            r2 = r3
            r4 = r21
            r0.putLong(r1, r2, r4)
            r5 = r7 | r8
            r2 = r6
            r1 = r11
            r0 = r13
            r3 = r20
        L_0x0221:
            r6 = r23
            r8 = -1
            r13 = r31
            goto L_0x025c
        L_0x0227:
            r6 = r2
            r11 = r19
            r13 = r21
            if (r1 != r0) goto L_0x0260
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15983b(r12, r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.C4387rb.m16594u(r14, r3, r0)
            int r0 = r13 + 4
            goto L_0x0251
        L_0x023c:
            r6 = r2
            r11 = r19
            r13 = r21
            r0 = 1
            if (r1 != r0) goto L_0x0260
            long r0 = com.google.android.gms.internal.measurement.C4214h8.m15997p(r12, r13)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.C4387rb.m16593t(r14, r3, r0)
        L_0x024f:
            int r0 = r13 + 8
        L_0x0251:
            r5 = r7 | r8
            r13 = r31
            r2 = r6
            r1 = r11
            r3 = r20
            r6 = r23
            r8 = -1
        L_0x025c:
            r11 = r32
            goto L_0x001e
        L_0x0260:
            r12 = r6
        L_0x0261:
            r0 = r32
            r19 = r7
            r26 = r10
            r30 = r11
            r21 = r12
            r2 = r13
            r7 = r20
            r6 = r23
            r18 = -1
            goto L_0x0389
        L_0x0274:
            r12 = r2
            r17 = r7
            r8 = r19
            r13 = r21
            r0 = 27
            if (r11 != r0) goto L_0x02d6
            r0 = 2
            if (r1 != r0) goto L_0x02c7
            java.lang.Object r0 = r10.getObject(r14, r3)
            com.google.android.gms.internal.measurement.v9 r0 = (com.google.android.gms.internal.measurement.C4453v9) r0
            boolean r1 = r0.mo13068s()
            if (r1 != 0) goto L_0x029f
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0297
            r1 = 10
            goto L_0x0298
        L_0x0297:
            int r1 = r1 + r1
        L_0x0298:
            com.google.android.gms.internal.measurement.v9 r0 = r0.mo12866e(r1)
            r10.putObject(r14, r3, r0)
        L_0x029f:
            r7 = r0
            com.google.android.gms.internal.measurement.cb r0 = r15.m16988j(r12)
            r1 = r20
            r2 = r29
            r3 = r13
            r4 = r31
            r19 = r5
            r5 = r7
            r23 = r6
            r6 = r33
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15986e(r0, r1, r2, r3, r4, r5, r6)
            r13 = r31
            r11 = r32
            r1 = r8
            r2 = r12
            r5 = r19
            r3 = r20
            r6 = r23
            r8 = -1
            r12 = r29
            goto L_0x001e
        L_0x02c7:
            r19 = r5
            r23 = r6
            r30 = r8
            r26 = r10
            r21 = r12
            r15 = r13
            r18 = -1
            goto L_0x0361
        L_0x02d6:
            r19 = r5
            r23 = r6
            r0 = 49
            if (r11 > r0) goto L_0x0333
            r7 = r17
            long r6 = (long) r7
            r0 = r27
            r5 = r1
            r1 = r28
            r2 = r29
            r24 = r3
            r3 = r13
            r4 = r31
            r17 = r5
            r5 = r20
            r21 = r6
            r6 = r8
            r7 = r17
            r30 = r8
            r18 = -1
            r8 = r12
            r26 = r10
            r9 = r21
            r15 = r32
            r21 = r12
            r15 = r13
            r12 = r24
            r14 = r33
            int r0 = r0.m16979O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x032a
        L_0x030e:
            r15 = r27
            r14 = r28
            r12 = r29
            r1 = r30
            r13 = r31
            r11 = r32
            r9 = r33
            r8 = r18
            r5 = r19
            r3 = r20
            r2 = r21
            r6 = r23
        L_0x0326:
            r10 = r26
            goto L_0x001e
        L_0x032a:
            r2 = r0
            r7 = r20
            r6 = r23
            r0 = r32
            goto L_0x0389
        L_0x0333:
            r24 = r3
            r30 = r8
            r26 = r10
            r21 = r12
            r15 = r13
            r7 = r17
            r18 = -1
            r17 = r1
            r0 = 50
            if (r11 != r0) goto L_0x0369
            r8 = r17
            r0 = 2
            if (r8 != r0) goto L_0x0361
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r21
            r6 = r24
            r8 = r33
            int r0 = r0.m16977M(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x032a
            goto L_0x030e
        L_0x0361:
            r0 = r32
            r2 = r15
            r7 = r20
            r6 = r23
            goto L_0x0389
        L_0x0369:
            r8 = r17
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r20
            r6 = r30
            r9 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r10 = r24
            r12 = r21
            r13 = r33
            int r0 = r0.m16978N(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x032a
            goto L_0x030e
        L_0x0389:
            if (r7 != r0) goto L_0x0396
            if (r0 == 0) goto L_0x0396
            r8 = r27
            r9 = r0
            r0 = r2
            r3 = r7
            r5 = r19
            goto L_0x03ed
        L_0x0396:
            r8 = r27
            r9 = r0
            boolean r0 = r8.f13738f
            if (r0 == 0) goto L_0x03bf
            r10 = r33
            com.google.android.gms.internal.measurement.e9 r0 = r10.f13255d
            com.google.android.gms.internal.measurement.e9 r1 = com.google.android.gms.internal.measurement.C4164e9.f13212c
            if (r0 == r1) goto L_0x03bc
            com.google.android.gms.internal.measurement.ra r1 = r8.f13737e
            r11 = r30
            r0.mo13069b(r1, r11)
            com.google.android.gms.internal.measurement.ib r4 = m16971G(r28)
            r0 = r7
            r1 = r29
            r3 = r31
            r5 = r33
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15990i(r0, r1, r2, r3, r4, r5)
            goto L_0x03d2
        L_0x03bc:
            r11 = r30
            goto L_0x03c3
        L_0x03bf:
            r11 = r30
            r10 = r33
        L_0x03c3:
            com.google.android.gms.internal.measurement.ib r4 = m16971G(r28)
            r0 = r7
            r1 = r29
            r3 = r31
            r5 = r33
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15990i(r0, r1, r2, r3, r4, r5)
        L_0x03d2:
            r14 = r28
            r12 = r29
            r13 = r31
            r3 = r7
            r15 = r8
            r1 = r11
            r8 = r18
            r5 = r19
            r2 = r21
            r11 = r9
            r9 = r10
            goto L_0x0326
        L_0x03e5:
            r19 = r5
            r23 = r6
            r26 = r10
            r9 = r11
            r8 = r15
        L_0x03ed:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r1) goto L_0x03fb
            long r6 = (long) r6
            r2 = r28
            r4 = r26
            r4.putInt(r2, r6, r5)
            goto L_0x03fd
        L_0x03fb:
            r2 = r28
        L_0x03fd:
            int r4 = r8.f13741i
        L_0x03ff:
            int r5 = r8.f13742j
            if (r4 >= r5) goto L_0x042c
            int[] r5 = r8.f13740h
            r5 = r5[r4]
            int[] r6 = r8.f13733a
            r6 = r6[r5]
            int r6 = r8.m16985U(r5)
            r6 = r6 & r1
            long r6 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r2, r6)
            if (r6 != 0) goto L_0x0418
            goto L_0x041e
        L_0x0418:
            com.google.android.gms.internal.measurement.s9 r7 = r8.m16987i(r5)
            if (r7 != 0) goto L_0x0421
        L_0x041e:
            int r4 = r4 + 1
            goto L_0x03ff
        L_0x0421:
            com.google.android.gms.internal.measurement.la r6 = (com.google.android.gms.internal.measurement.C4284la) r6
            java.lang.Object r0 = r8.m16989k(r5)
            android.support.p013v4.media.session.C0125b.m366a(r0)
            r0 = 0
            throw r0
        L_0x042c:
            if (r9 != 0) goto L_0x0438
            r1 = r31
            if (r0 != r1) goto L_0x0433
            goto L_0x043e
        L_0x0433:
            com.google.android.gms.internal.measurement.zzll r0 = com.google.android.gms.internal.measurement.zzll.m17331e()
            throw r0
        L_0x0438:
            r1 = r31
            if (r0 > r1) goto L_0x043f
            if (r3 != r9) goto L_0x043f
        L_0x043e:
            return r0
        L_0x043f:
            com.google.android.gms.internal.measurement.zzll r0 = com.google.android.gms.internal.measurement.zzll.m17331e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4437ua.mo13755F(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.g8):int");
    }

    /* renamed from: a */
    public final void mo12988a(Object obj) {
        if (m16967B(obj)) {
            if (obj instanceof C4351p9) {
                C4351p9 p9Var = (C4351p9) obj;
                p9Var.mo13477w(Integer.MAX_VALUE);
                p9Var.zzb = 0;
                p9Var.mo13476u();
            }
            int length = this.f13733a.length;
            for (int i = 0; i < length; i += 3) {
                int U = m16985U(i);
                int i2 = 1048575 & U;
                int T = m16984T(U);
                long j = (long) i2;
                if (T != 9) {
                    if (T == 60 || T == 68) {
                        if (m16968C(obj, this.f13733a[i], i)) {
                            m16988j(i).mo12988a(f13732q.getObject(obj, j));
                        }
                    } else {
                        switch (T) {
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
                                this.f13743k.mo12949a(obj, j);
                                continue;
                            case 50:
                                Unsafe unsafe = f13732q;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((C4284la) object).mo13323c();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (m17002y(obj, i)) {
                    m16988j(i).mo12988a(f13732q.getObject(obj, j));
                }
            }
            this.f13744l.mo13217g(obj);
            if (this.f13738f) {
                this.f13745m.mo13124b(obj);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0499, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x06f3, code lost:
        r14 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x08a4, code lost:
        r8 = r8 + 3;
        r6 = r14;
        r7 = 1048575;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12989b(java.lang.Object r17, com.google.android.gms.internal.measurement.C4504yb r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f13739g
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 == 0) goto L_0x0462
            boolean r3 = r0.f13738f
            if (r3 != 0) goto L_0x045c
            int[] r3 = r0.f13733a
            int r3 = r3.length
            r4 = r6
        L_0x0018:
            if (r4 >= r3) goto L_0x0452
            int r8 = r0.m16985U(r4)
            int[] r9 = r0.f13733a
            r9 = r9[r4]
            int r10 = m16984T(r8)
            switch(r10) {
                case 0: goto L_0x043f;
                case 1: goto L_0x042f;
                case 2: goto L_0x041f;
                case 3: goto L_0x040f;
                case 4: goto L_0x03ff;
                case 5: goto L_0x03ef;
                case 6: goto L_0x03df;
                case 7: goto L_0x03ce;
                case 8: goto L_0x03bd;
                case 9: goto L_0x03a8;
                case 10: goto L_0x0395;
                case 11: goto L_0x0384;
                case 12: goto L_0x0373;
                case 13: goto L_0x0362;
                case 14: goto L_0x0351;
                case 15: goto L_0x0340;
                case 16: goto L_0x032f;
                case 17: goto L_0x031a;
                case 18: goto L_0x030d;
                case 19: goto L_0x0300;
                case 20: goto L_0x02f3;
                case 21: goto L_0x02e6;
                case 22: goto L_0x02d9;
                case 23: goto L_0x02cc;
                case 24: goto L_0x02bf;
                case 25: goto L_0x02b2;
                case 26: goto L_0x02a5;
                case 27: goto L_0x0294;
                case 28: goto L_0x0287;
                case 29: goto L_0x027a;
                case 30: goto L_0x026d;
                case 31: goto L_0x0260;
                case 32: goto L_0x0253;
                case 33: goto L_0x0246;
                case 34: goto L_0x0239;
                case 35: goto L_0x022c;
                case 36: goto L_0x021f;
                case 37: goto L_0x0212;
                case 38: goto L_0x0205;
                case 39: goto L_0x01f8;
                case 40: goto L_0x01eb;
                case 41: goto L_0x01de;
                case 42: goto L_0x01d1;
                case 43: goto L_0x01c4;
                case 44: goto L_0x01b7;
                case 45: goto L_0x01aa;
                case 46: goto L_0x019d;
                case 47: goto L_0x0190;
                case 48: goto L_0x0183;
                case 49: goto L_0x0172;
                case 50: goto L_0x0167;
                case 51: goto L_0x0156;
                case 52: goto L_0x0145;
                case 53: goto L_0x0134;
                case 54: goto L_0x0123;
                case 55: goto L_0x0112;
                case 56: goto L_0x0101;
                case 57: goto L_0x00f0;
                case 58: goto L_0x00df;
                case 59: goto L_0x00ce;
                case 60: goto L_0x00b9;
                case 61: goto L_0x00a6;
                case 62: goto L_0x0095;
                case 63: goto L_0x0084;
                case 64: goto L_0x0073;
                case 65: goto L_0x0062;
                case 66: goto L_0x0051;
                case 67: goto L_0x0040;
                case 68: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x044e
        L_0x002b:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            com.google.android.gms.internal.measurement.cb r10 = r0.m16988j(r4)
            r2.mo12923a(r9, r8, r10)
            goto L_0x044e
        L_0x0040:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = m16986V(r1, r10)
            r2.mo12940r(r9, r10)
            goto L_0x044e
        L_0x0051:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m16976L(r1, r10)
            r2.mo12926d(r9, r8)
            goto L_0x044e
        L_0x0062:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = m16986V(r1, r10)
            r2.mo12945w(r9, r10)
            goto L_0x044e
        L_0x0073:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m16976L(r1, r10)
            r2.mo12935m(r9, r8)
            goto L_0x044e
        L_0x0084:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m16976L(r1, r10)
            r2.mo12948z(r9, r8)
            goto L_0x044e
        L_0x0095:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m16976L(r1, r10)
            r2.mo12942t(r9, r8)
            goto L_0x044e
        L_0x00a6:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            com.google.android.gms.internal.measurement.t8 r8 = (com.google.android.gms.internal.measurement.C4418t8) r8
            r2.mo12937o(r9, r8)
            goto L_0x044e
        L_0x00b9:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            com.google.android.gms.internal.measurement.cb r10 = r0.m16988j(r4)
            r2.mo12933k(r9, r8, r10)
            goto L_0x044e
        L_0x00ce:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            m16970E(r9, r8, r2)
            goto L_0x044e
        L_0x00df:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            boolean r8 = m16969D(r1, r10)
            r2.mo12925c(r9, r8)
            goto L_0x044e
        L_0x00f0:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m16976L(r1, r10)
            r2.mo12944v(r9, r8)
            goto L_0x044e
        L_0x0101:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = m16986V(r1, r10)
            r2.mo12921I(r9, r10)
            goto L_0x044e
        L_0x0112:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m16976L(r1, r10)
            r2.mo12931i(r9, r8)
            goto L_0x044e
        L_0x0123:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = m16986V(r1, r10)
            r2.mo12920H(r9, r10)
            goto L_0x044e
        L_0x0134:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = m16986V(r1, r10)
            r2.mo12928f(r9, r10)
            goto L_0x044e
        L_0x0145:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            float r8 = m16974J(r1, r10)
            r2.mo12915C(r9, r8)
            goto L_0x044e
        L_0x0156:
            boolean r10 = r0.m16968C(r1, r9, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            double r10 = m16973I(r1, r10)
            r2.mo12932j(r9, r10)
            goto L_0x044e
        L_0x0167:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            r0.m17000w(r2, r9, r8, r4)
            goto L_0x044e
        L_0x0172:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.cb r10 = r0.m16988j(r4)
            com.google.android.gms.internal.measurement.C4166eb.m15754l(r9, r8, r2, r10)
            goto L_0x044e
        L_0x0183:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15761s(r9, r8, r2, r5)
            goto L_0x044e
        L_0x0190:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15760r(r9, r8, r2, r5)
            goto L_0x044e
        L_0x019d:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15759q(r9, r8, r2, r5)
            goto L_0x044e
        L_0x01aa:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15758p(r9, r8, r2, r5)
            goto L_0x044e
        L_0x01b7:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15750h(r9, r8, r2, r5)
            goto L_0x044e
        L_0x01c4:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15763u(r9, r8, r2, r5)
            goto L_0x044e
        L_0x01d1:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15747e(r9, r8, r2, r5)
            goto L_0x044e
        L_0x01de:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15751i(r9, r8, r2, r5)
            goto L_0x044e
        L_0x01eb:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15752j(r9, r8, r2, r5)
            goto L_0x044e
        L_0x01f8:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15755m(r9, r8, r2, r5)
            goto L_0x044e
        L_0x0205:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15764v(r9, r8, r2, r5)
            goto L_0x044e
        L_0x0212:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15756n(r9, r8, r2, r5)
            goto L_0x044e
        L_0x021f:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15753k(r9, r8, r2, r5)
            goto L_0x044e
        L_0x022c:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15749g(r9, r8, r2, r5)
            goto L_0x044e
        L_0x0239:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15761s(r9, r8, r2, r6)
            goto L_0x044e
        L_0x0246:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15760r(r9, r8, r2, r6)
            goto L_0x044e
        L_0x0253:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15759q(r9, r8, r2, r6)
            goto L_0x044e
        L_0x0260:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15758p(r9, r8, r2, r6)
            goto L_0x044e
        L_0x026d:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15750h(r9, r8, r2, r6)
            goto L_0x044e
        L_0x027a:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15763u(r9, r8, r2, r6)
            goto L_0x044e
        L_0x0287:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15748f(r9, r8, r2)
            goto L_0x044e
        L_0x0294:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.cb r10 = r0.m16988j(r4)
            com.google.android.gms.internal.measurement.C4166eb.m15757o(r9, r8, r2, r10)
            goto L_0x044e
        L_0x02a5:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15762t(r9, r8, r2)
            goto L_0x044e
        L_0x02b2:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15747e(r9, r8, r2, r6)
            goto L_0x044e
        L_0x02bf:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15751i(r9, r8, r2, r6)
            goto L_0x044e
        L_0x02cc:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15752j(r9, r8, r2, r6)
            goto L_0x044e
        L_0x02d9:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15755m(r9, r8, r2, r6)
            goto L_0x044e
        L_0x02e6:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15764v(r9, r8, r2, r6)
            goto L_0x044e
        L_0x02f3:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15756n(r9, r8, r2, r6)
            goto L_0x044e
        L_0x0300:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15753k(r9, r8, r2, r6)
            goto L_0x044e
        L_0x030d:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4166eb.m15749g(r9, r8, r2, r6)
            goto L_0x044e
        L_0x031a:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            com.google.android.gms.internal.measurement.cb r10 = r0.m16988j(r4)
            r2.mo12923a(r9, r8, r10)
            goto L_0x044e
        L_0x032f:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C4387rb.m16582i(r1, r10)
            r2.mo12940r(r9, r10)
            goto L_0x044e
        L_0x0340:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r1, r10)
            r2.mo12926d(r9, r8)
            goto L_0x044e
        L_0x0351:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C4387rb.m16582i(r1, r10)
            r2.mo12945w(r9, r10)
            goto L_0x044e
        L_0x0362:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r1, r10)
            r2.mo12935m(r9, r8)
            goto L_0x044e
        L_0x0373:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r1, r10)
            r2.mo12948z(r9, r8)
            goto L_0x044e
        L_0x0384:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r1, r10)
            r2.mo12942t(r9, r8)
            goto L_0x044e
        L_0x0395:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            com.google.android.gms.internal.measurement.t8 r8 = (com.google.android.gms.internal.measurement.C4418t8) r8
            r2.mo12937o(r9, r8)
            goto L_0x044e
        L_0x03a8:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            com.google.android.gms.internal.measurement.cb r10 = r0.m16988j(r4)
            r2.mo12933k(r9, r8, r10)
            goto L_0x044e
        L_0x03bd:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r1, r10)
            m16970E(r9, r8, r2)
            goto L_0x044e
        L_0x03ce:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.measurement.C4387rb.m16570B(r1, r10)
            r2.mo12925c(r9, r8)
            goto L_0x044e
        L_0x03df:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r1, r10)
            r2.mo12944v(r9, r8)
            goto L_0x044e
        L_0x03ef:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C4387rb.m16582i(r1, r10)
            r2.mo12921I(r9, r10)
            goto L_0x044e
        L_0x03ff:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r1, r10)
            r2.mo12931i(r9, r8)
            goto L_0x044e
        L_0x040f:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C4387rb.m16582i(r1, r10)
            r2.mo12920H(r9, r10)
            goto L_0x044e
        L_0x041f:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C4387rb.m16582i(r1, r10)
            r2.mo12928f(r9, r10)
            goto L_0x044e
        L_0x042f:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.measurement.C4387rb.m16580g(r1, r10)
            r2.mo12915C(r9, r8)
            goto L_0x044e
        L_0x043f:
            boolean r10 = r0.m17002y(r1, r4)
            if (r10 == 0) goto L_0x044e
            r8 = r8 & r7
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.measurement.C4387rb.m16579f(r1, r10)
            r2.mo12932j(r9, r10)
        L_0x044e:
            int r4 = r4 + 3
            goto L_0x0018
        L_0x0452:
            com.google.android.gms.internal.measurement.hb r3 = r0.f13744l
            java.lang.Object r1 = r3.mo13214d(r1)
            r3.mo13219i(r1, r2)
            return
        L_0x045c:
            com.google.android.gms.internal.measurement.f9 r2 = r0.f13745m
            r2.mo13123a(r1)
            throw r4
        L_0x0462:
            boolean r3 = r0.f13738f
            if (r3 != 0) goto L_0x08b6
            int[] r3 = r0.f13733a
            int r3 = r3.length
            sun.misc.Unsafe r4 = f13732q
            r8 = r6
            r10 = r8
            r9 = r7
        L_0x046e:
            if (r8 >= r3) goto L_0x08ac
            int r11 = r0.m16985U(r8)
            int[] r12 = r0.f13733a
            r13 = r12[r8]
            int r14 = m16984T(r11)
            r15 = 17
            if (r14 > r15) goto L_0x0493
            int r15 = r8 + 2
            r12 = r12[r15]
            r15 = r12 & r7
            if (r15 == r9) goto L_0x048e
            long r9 = (long) r15
            int r10 = r4.getInt(r1, r9)
            r9 = r15
        L_0x048e:
            int r12 = r12 >>> 20
            int r12 = r5 << r12
            goto L_0x0494
        L_0x0493:
            r12 = r6
        L_0x0494:
            r11 = r11 & r7
            long r6 = (long) r11
            switch(r14) {
                case 0: goto L_0x0898;
                case 1: goto L_0x088b;
                case 2: goto L_0x087e;
                case 3: goto L_0x0871;
                case 4: goto L_0x0864;
                case 5: goto L_0x0857;
                case 6: goto L_0x084a;
                case 7: goto L_0x083d;
                case 8: goto L_0x082f;
                case 9: goto L_0x081d;
                case 10: goto L_0x080d;
                case 11: goto L_0x07ff;
                case 12: goto L_0x07f1;
                case 13: goto L_0x07e3;
                case 14: goto L_0x07d5;
                case 15: goto L_0x07c7;
                case 16: goto L_0x07b9;
                case 17: goto L_0x07a7;
                case 18: goto L_0x0797;
                case 19: goto L_0x0787;
                case 20: goto L_0x0777;
                case 21: goto L_0x0767;
                case 22: goto L_0x0757;
                case 23: goto L_0x0747;
                case 24: goto L_0x0737;
                case 25: goto L_0x0727;
                case 26: goto L_0x0718;
                case 27: goto L_0x0705;
                case 28: goto L_0x06f6;
                case 29: goto L_0x06e5;
                case 30: goto L_0x06d6;
                case 31: goto L_0x06c7;
                case 32: goto L_0x06b8;
                case 33: goto L_0x06a9;
                case 34: goto L_0x069a;
                case 35: goto L_0x068b;
                case 36: goto L_0x067c;
                case 37: goto L_0x066d;
                case 38: goto L_0x065e;
                case 39: goto L_0x064f;
                case 40: goto L_0x0640;
                case 41: goto L_0x0631;
                case 42: goto L_0x0622;
                case 43: goto L_0x0613;
                case 44: goto L_0x0604;
                case 45: goto L_0x05f5;
                case 46: goto L_0x05e6;
                case 47: goto L_0x05d7;
                case 48: goto L_0x05c8;
                case 49: goto L_0x05b5;
                case 50: goto L_0x05ac;
                case 51: goto L_0x059d;
                case 52: goto L_0x058e;
                case 53: goto L_0x057f;
                case 54: goto L_0x0570;
                case 55: goto L_0x0561;
                case 56: goto L_0x0552;
                case 57: goto L_0x0543;
                case 58: goto L_0x0534;
                case 59: goto L_0x0525;
                case 60: goto L_0x0512;
                case 61: goto L_0x0502;
                case 62: goto L_0x04f4;
                case 63: goto L_0x04e6;
                case 64: goto L_0x04d8;
                case 65: goto L_0x04ca;
                case 66: goto L_0x04bc;
                case 67: goto L_0x04ae;
                case 68: goto L_0x049c;
                default: goto L_0x0499;
            }
        L_0x0499:
            r14 = 0
            goto L_0x08a4
        L_0x049c:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.gms.internal.measurement.cb r7 = r0.m16988j(r8)
            r2.mo12923a(r13, r6, r7)
            goto L_0x0499
        L_0x04ae:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            long r6 = m16986V(r1, r6)
            r2.mo12940r(r13, r6)
            goto L_0x0499
        L_0x04bc:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            int r6 = m16976L(r1, r6)
            r2.mo12926d(r13, r6)
            goto L_0x0499
        L_0x04ca:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            long r6 = m16986V(r1, r6)
            r2.mo12945w(r13, r6)
            goto L_0x0499
        L_0x04d8:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            int r6 = m16976L(r1, r6)
            r2.mo12935m(r13, r6)
            goto L_0x0499
        L_0x04e6:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            int r6 = m16976L(r1, r6)
            r2.mo12948z(r13, r6)
            goto L_0x0499
        L_0x04f4:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            int r6 = m16976L(r1, r6)
            r2.mo12942t(r13, r6)
            goto L_0x0499
        L_0x0502:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.gms.internal.measurement.t8 r6 = (com.google.android.gms.internal.measurement.C4418t8) r6
            r2.mo12937o(r13, r6)
            goto L_0x0499
        L_0x0512:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.gms.internal.measurement.cb r7 = r0.m16988j(r8)
            r2.mo12933k(r13, r6, r7)
            goto L_0x0499
        L_0x0525:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            java.lang.Object r6 = r4.getObject(r1, r6)
            m16970E(r13, r6, r2)
            goto L_0x0499
        L_0x0534:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            boolean r6 = m16969D(r1, r6)
            r2.mo12925c(r13, r6)
            goto L_0x0499
        L_0x0543:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            int r6 = m16976L(r1, r6)
            r2.mo12944v(r13, r6)
            goto L_0x0499
        L_0x0552:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            long r6 = m16986V(r1, r6)
            r2.mo12921I(r13, r6)
            goto L_0x0499
        L_0x0561:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            int r6 = m16976L(r1, r6)
            r2.mo12931i(r13, r6)
            goto L_0x0499
        L_0x0570:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            long r6 = m16986V(r1, r6)
            r2.mo12920H(r13, r6)
            goto L_0x0499
        L_0x057f:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            long r6 = m16986V(r1, r6)
            r2.mo12928f(r13, r6)
            goto L_0x0499
        L_0x058e:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            float r6 = m16974J(r1, r6)
            r2.mo12915C(r13, r6)
            goto L_0x0499
        L_0x059d:
            boolean r11 = r0.m16968C(r1, r13, r8)
            if (r11 == 0) goto L_0x0499
            double r6 = m16973I(r1, r6)
            r2.mo12932j(r13, r6)
            goto L_0x0499
        L_0x05ac:
            java.lang.Object r6 = r4.getObject(r1, r6)
            r0.m17000w(r2, r13, r6, r8)
            goto L_0x0499
        L_0x05b5:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.cb r7 = r0.m16988j(r8)
            com.google.android.gms.internal.measurement.C4166eb.m15754l(r11, r6, r2, r7)
            goto L_0x0499
        L_0x05c8:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15761s(r11, r6, r2, r5)
            goto L_0x0499
        L_0x05d7:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15760r(r11, r6, r2, r5)
            goto L_0x0499
        L_0x05e6:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15759q(r11, r6, r2, r5)
            goto L_0x0499
        L_0x05f5:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15758p(r11, r6, r2, r5)
            goto L_0x0499
        L_0x0604:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15750h(r11, r6, r2, r5)
            goto L_0x0499
        L_0x0613:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15763u(r11, r6, r2, r5)
            goto L_0x0499
        L_0x0622:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15747e(r11, r6, r2, r5)
            goto L_0x0499
        L_0x0631:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15751i(r11, r6, r2, r5)
            goto L_0x0499
        L_0x0640:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15752j(r11, r6, r2, r5)
            goto L_0x0499
        L_0x064f:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15755m(r11, r6, r2, r5)
            goto L_0x0499
        L_0x065e:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15764v(r11, r6, r2, r5)
            goto L_0x0499
        L_0x066d:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15756n(r11, r6, r2, r5)
            goto L_0x0499
        L_0x067c:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15753k(r11, r6, r2, r5)
            goto L_0x0499
        L_0x068b:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15749g(r11, r6, r2, r5)
            goto L_0x0499
        L_0x069a:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 0
            com.google.android.gms.internal.measurement.C4166eb.m15761s(r11, r6, r2, r12)
            goto L_0x06f3
        L_0x06a9:
            r12 = 0
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15760r(r11, r6, r2, r12)
            goto L_0x06f3
        L_0x06b8:
            r12 = 0
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15759q(r11, r6, r2, r12)
            goto L_0x06f3
        L_0x06c7:
            r12 = 0
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15758p(r11, r6, r2, r12)
            goto L_0x06f3
        L_0x06d6:
            r12 = 0
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15750h(r11, r6, r2, r12)
            goto L_0x06f3
        L_0x06e5:
            r12 = 0
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15763u(r11, r6, r2, r12)
        L_0x06f3:
            r14 = r12
            goto L_0x08a4
        L_0x06f6:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15748f(r11, r6, r2)
            goto L_0x0499
        L_0x0705:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.cb r7 = r0.m16988j(r8)
            com.google.android.gms.internal.measurement.C4166eb.m15757o(r11, r6, r2, r7)
            goto L_0x0499
        L_0x0718:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15762t(r11, r6, r2)
            goto L_0x0499
        L_0x0727:
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r14 = 0
            com.google.android.gms.internal.measurement.C4166eb.m15747e(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x0737:
            r14 = 0
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15751i(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x0747:
            r14 = 0
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15752j(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x0757:
            r14 = 0
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15755m(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x0767:
            r14 = 0
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15764v(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x0777:
            r14 = 0
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15756n(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x0787:
            r14 = 0
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15753k(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x0797:
            r14 = 0
            int[] r11 = r0.f13733a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.C4166eb.m15749g(r11, r6, r2, r14)
            goto L_0x08a4
        L_0x07a7:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.gms.internal.measurement.cb r7 = r0.m16988j(r8)
            r2.mo12923a(r13, r6, r7)
            goto L_0x08a4
        L_0x07b9:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            long r6 = r4.getLong(r1, r6)
            r2.mo12940r(r13, r6)
            goto L_0x08a4
        L_0x07c7:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            int r6 = r4.getInt(r1, r6)
            r2.mo12926d(r13, r6)
            goto L_0x08a4
        L_0x07d5:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            long r6 = r4.getLong(r1, r6)
            r2.mo12945w(r13, r6)
            goto L_0x08a4
        L_0x07e3:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            int r6 = r4.getInt(r1, r6)
            r2.mo12935m(r13, r6)
            goto L_0x08a4
        L_0x07f1:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            int r6 = r4.getInt(r1, r6)
            r2.mo12948z(r13, r6)
            goto L_0x08a4
        L_0x07ff:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            int r6 = r4.getInt(r1, r6)
            r2.mo12942t(r13, r6)
            goto L_0x08a4
        L_0x080d:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.gms.internal.measurement.t8 r6 = (com.google.android.gms.internal.measurement.C4418t8) r6
            r2.mo12937o(r13, r6)
            goto L_0x08a4
        L_0x081d:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.google.android.gms.internal.measurement.cb r7 = r0.m16988j(r8)
            r2.mo12933k(r13, r6, r7)
            goto L_0x08a4
        L_0x082f:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            java.lang.Object r6 = r4.getObject(r1, r6)
            m16970E(r13, r6, r2)
            goto L_0x08a4
        L_0x083d:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            boolean r6 = com.google.android.gms.internal.measurement.C4387rb.m16570B(r1, r6)
            r2.mo12925c(r13, r6)
            goto L_0x08a4
        L_0x084a:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            int r6 = r4.getInt(r1, r6)
            r2.mo12944v(r13, r6)
            goto L_0x08a4
        L_0x0857:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            long r6 = r4.getLong(r1, r6)
            r2.mo12921I(r13, r6)
            goto L_0x08a4
        L_0x0864:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            int r6 = r4.getInt(r1, r6)
            r2.mo12931i(r13, r6)
            goto L_0x08a4
        L_0x0871:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            long r6 = r4.getLong(r1, r6)
            r2.mo12920H(r13, r6)
            goto L_0x08a4
        L_0x087e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            long r6 = r4.getLong(r1, r6)
            r2.mo12928f(r13, r6)
            goto L_0x08a4
        L_0x088b:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            float r6 = com.google.android.gms.internal.measurement.C4387rb.m16580g(r1, r6)
            r2.mo12915C(r13, r6)
            goto L_0x08a4
        L_0x0898:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x08a4
            double r6 = com.google.android.gms.internal.measurement.C4387rb.m16579f(r1, r6)
            r2.mo12932j(r13, r6)
        L_0x08a4:
            int r8 = r8 + 3
            r6 = r14
            r7 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x046e
        L_0x08ac:
            com.google.android.gms.internal.measurement.hb r3 = r0.f13744l
            java.lang.Object r1 = r3.mo13214d(r1)
            r3.mo13219i(r1, r2)
            return
        L_0x08b6:
            com.google.android.gms.internal.measurement.f9 r2 = r0.f13745m
            r2.mo13123a(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4437ua.mo12989b(java.lang.Object, com.google.android.gms.internal.measurement.yb):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b4, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0210, code lost:
        r3 = (int) (r3 ^ (r3 >>> 32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0214, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0215, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12990c(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r0 = r9.f13733a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0219
            int r3 = r9.m16985U(r1)
            int[] r4 = r9.f13733a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            int r3 = m16984T(r3)
            long r5 = (long) r5
            r7 = 37
            r8 = 32
            switch(r3) {
                case 0: goto L_0x0204;
                case 1: goto L_0x01f9;
                case 2: goto L_0x01f0;
                case 3: goto L_0x01e7;
                case 4: goto L_0x01e0;
                case 5: goto L_0x01d7;
                case 6: goto L_0x01d0;
                case 7: goto L_0x01c5;
                case 8: goto L_0x01b8;
                case 9: goto L_0x01aa;
                case 10: goto L_0x019e;
                case 11: goto L_0x0196;
                case 12: goto L_0x018e;
                case 13: goto L_0x0186;
                case 14: goto L_0x017c;
                case 15: goto L_0x0174;
                case 16: goto L_0x016a;
                case 17: goto L_0x015f;
                case 18: goto L_0x0153;
                case 19: goto L_0x0153;
                case 20: goto L_0x0153;
                case 21: goto L_0x0153;
                case 22: goto L_0x0153;
                case 23: goto L_0x0153;
                case 24: goto L_0x0153;
                case 25: goto L_0x0153;
                case 26: goto L_0x0153;
                case 27: goto L_0x0153;
                case 28: goto L_0x0153;
                case 29: goto L_0x0153;
                case 30: goto L_0x0153;
                case 31: goto L_0x0153;
                case 32: goto L_0x0153;
                case 33: goto L_0x0153;
                case 34: goto L_0x0153;
                case 35: goto L_0x0153;
                case 36: goto L_0x0153;
                case 37: goto L_0x0153;
                case 38: goto L_0x0153;
                case 39: goto L_0x0153;
                case 40: goto L_0x0153;
                case 41: goto L_0x0153;
                case 42: goto L_0x0153;
                case 43: goto L_0x0153;
                case 44: goto L_0x0153;
                case 45: goto L_0x0153;
                case 46: goto L_0x0153;
                case 47: goto L_0x0153;
                case 48: goto L_0x0153;
                case 49: goto L_0x0153;
                case 50: goto L_0x0147;
                case 51: goto L_0x0133;
                case 52: goto L_0x0121;
                case 53: goto L_0x0111;
                case 54: goto L_0x0101;
                case 55: goto L_0x00f3;
                case 56: goto L_0x00e3;
                case 57: goto L_0x00d5;
                case 58: goto L_0x00c3;
                case 59: goto L_0x00af;
                case 60: goto L_0x009d;
                case 61: goto L_0x008b;
                case 62: goto L_0x007d;
                case 63: goto L_0x006f;
                case 64: goto L_0x0061;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0033;
                case 68: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0215
        L_0x0021:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x0033:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            long r3 = m16986V(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C4470w9.f13784d
            goto L_0x0210
        L_0x0043:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            int r3 = m16976L(r10, r5)
            goto L_0x0214
        L_0x0051:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            long r3 = m16986V(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C4470w9.f13784d
            goto L_0x0210
        L_0x0061:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            int r3 = m16976L(r10, r5)
            goto L_0x0214
        L_0x006f:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            int r3 = m16976L(r10, r5)
            goto L_0x0214
        L_0x007d:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            int r3 = m16976L(r10, r5)
            goto L_0x0214
        L_0x008b:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x009d:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r10, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x00af:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x00c3:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            boolean r3 = m16969D(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.C4470w9.m17095a(r3)
            goto L_0x0214
        L_0x00d5:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            int r3 = m16976L(r10, r5)
            goto L_0x0214
        L_0x00e3:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            long r3 = m16986V(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C4470w9.f13784d
            goto L_0x0210
        L_0x00f3:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            int r3 = m16976L(r10, r5)
            goto L_0x0214
        L_0x0101:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            long r3 = m16986V(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C4470w9.f13784d
            goto L_0x0210
        L_0x0111:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            long r3 = m16986V(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C4470w9.f13784d
            goto L_0x0210
        L_0x0121:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            float r3 = m16974J(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0214
        L_0x0133:
            boolean r3 = r9.m16968C(r10, r4, r1)
            if (r3 == 0) goto L_0x0215
            int r2 = r2 * 53
            double r3 = m16973I(r10, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            byte[] r5 = com.google.android.gms.internal.measurement.C4470w9.f13784d
            goto L_0x0210
        L_0x0147:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x0153:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x015f:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r10, r5)
            if (r3 == 0) goto L_0x01b4
            int r7 = r3.hashCode()
            goto L_0x01b4
        L_0x016a:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C4387rb.m16582i(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C4470w9.f13784d
            goto L_0x0210
        L_0x0174:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r10, r5)
            goto L_0x0214
        L_0x017c:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C4387rb.m16582i(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C4470w9.f13784d
            goto L_0x0210
        L_0x0186:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r10, r5)
            goto L_0x0214
        L_0x018e:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r10, r5)
            goto L_0x0214
        L_0x0196:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r10, r5)
            goto L_0x0214
        L_0x019e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r10, r5)
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x01aa:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r10, r5)
            if (r3 == 0) goto L_0x01b4
            int r7 = r3.hashCode()
        L_0x01b4:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0215
        L_0x01b8:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0214
        L_0x01c5:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.C4387rb.m16570B(r10, r5)
            int r3 = com.google.android.gms.internal.measurement.C4470w9.m17095a(r3)
            goto L_0x0214
        L_0x01d0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r10, r5)
            goto L_0x0214
        L_0x01d7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C4387rb.m16582i(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C4470w9.f13784d
            goto L_0x0210
        L_0x01e0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r10, r5)
            goto L_0x0214
        L_0x01e7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C4387rb.m16582i(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C4470w9.f13784d
            goto L_0x0210
        L_0x01f0:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C4387rb.m16582i(r10, r5)
            byte[] r5 = com.google.android.gms.internal.measurement.C4470w9.f13784d
            goto L_0x0210
        L_0x01f9:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.C4387rb.m16580g(r10, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0214
        L_0x0204:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.C4387rb.m16579f(r10, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            byte[] r5 = com.google.android.gms.internal.measurement.C4470w9.f13784d
        L_0x0210:
            long r5 = r3 >>> r8
            long r3 = r3 ^ r5
            int r3 = (int) r3
        L_0x0214:
            int r2 = r2 + r3
        L_0x0215:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0219:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.hb r0 = r9.f13744l
            java.lang.Object r0 = r0.mo13214d(r10)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r9.f13738f
            if (r0 != 0) goto L_0x022b
            return r2
        L_0x022b:
            com.google.android.gms.internal.measurement.f9 r0 = r9.f13745m
            r0.mo13123a(r10)
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4437ua.mo12990c(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0329, code lost:
        if (r0 != r14) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x034c, code lost:
        if (r0 != r14) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0115, code lost:
        r6 = r6 | r10;
        r13 = r34;
        r9 = r7;
        r2 = r15;
        r7 = r20;
        r1 = r23;
        r8 = 1048575;
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014c, code lost:
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021c, code lost:
        r0 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0239, code lost:
        r6 = r6 | r10;
        r9 = r7;
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x023c, code lost:
        r8 = r19;
        r7 = r20;
        r1 = r23;
        r10 = -1;
        r15 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0244, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0248, code lost:
        r2 = r4;
        r29 = r7;
        r7 = r20;
        r18 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02e8, code lost:
        if (r0 != r24) goto L_0x02ea;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12991d(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.C4197g8 r35) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.f13739g
            if (r0 == 0) goto L_0x0390
            m16993o(r31)
            sun.misc.Unsafe r9 = f13732q
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r7 = r8
            r1 = r10
            r2 = r16
            r6 = r2
        L_0x0020:
            if (r0 >= r13) goto L_0x0375
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0032
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15992k(r0, r12, r3, r11)
            int r3 = r11.f13252a
            r4 = r0
            r17 = r3
            goto L_0x0035
        L_0x0032:
            r17 = r0
            r4 = r3
        L_0x0035:
            int r5 = r17 >>> 3
            if (r5 <= r1) goto L_0x0040
            int r2 = r2 / 3
            int r0 = r15.m16981Q(r5, r2)
            goto L_0x0044
        L_0x0040:
            int r0 = r15.m16980P(r5)
        L_0x0044:
            r2 = r0
            if (r2 != r10) goto L_0x0052
            r2 = r4
            r23 = r5
            r29 = r9
            r18 = r10
            r15 = r16
            goto L_0x034f
        L_0x0052:
            r3 = r17 & 7
            int[] r0 = r15.f13733a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r13 = m16984T(r1)
            r10 = r1 & r8
            r19 = r9
            long r8 = (long) r10
            r10 = 17
            r33 = r5
            if (r13 > r10) goto L_0x0251
            int r10 = r2 + 2
            r0 = r0[r10]
            int r10 = r0 >>> 20
            r5 = 1
            int r10 = r5 << r10
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r15
            r22 = r1
            r20 = r2
            if (r0 == r7) goto L_0x0092
            if (r7 == r15) goto L_0x0085
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0087
        L_0x0085:
            r7 = r19
        L_0x0087:
            if (r0 == r15) goto L_0x008f
            long r1 = (long) r0
            int r1 = r7.getInt(r14, r1)
            r6 = r1
        L_0x008f:
            r2 = r7
            r7 = r0
            goto L_0x0094
        L_0x0092:
            r2 = r19
        L_0x0094:
            r0 = 5
            switch(r13) {
                case 0: goto L_0x021f;
                case 1: goto L_0x0204;
                case 2: goto L_0x01e4;
                case 3: goto L_0x01e4;
                case 4: goto L_0x01cd;
                case 5: goto L_0x01ae;
                case 6: goto L_0x0198;
                case 7: goto L_0x0177;
                case 8: goto L_0x0153;
                case 9: goto L_0x0124;
                case 10: goto L_0x0102;
                case 11: goto L_0x01cd;
                case 12: goto L_0x00ef;
                case 13: goto L_0x0198;
                case 14: goto L_0x01ae;
                case 15: goto L_0x00d8;
                case 16: goto L_0x00a5;
                default: goto L_0x0098;
            }
        L_0x0098:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            goto L_0x0248
        L_0x00a5:
            if (r3 != 0) goto L_0x00cf
            int r13 = com.google.android.gms.internal.measurement.C4214h8.m15994m(r12, r4, r11)
            long r0 = r11.f13253b
            long r4 = com.google.android.gms.internal.measurement.C4485x8.m17148b(r0)
            r0 = r2
            r1 = r31
            r15 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r23 = r33
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r9 = r7
            r0 = r13
            r2 = r15
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r30
            goto L_0x0244
        L_0x00cf:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            goto L_0x014c
        L_0x00d8:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x014c
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r12, r4, r11)
            int r1 = r11.f13252a
            int r1 = com.google.android.gms.internal.measurement.C4485x8.m17147a(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0115
        L_0x00ef:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x014c
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r12, r4, r11)
            int r1 = r11.f13252a
            r7.putInt(r14, r8, r1)
            goto L_0x0115
        L_0x0102:
            r23 = r33
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x014c
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15982a(r12, r4, r11)
            java.lang.Object r1 = r11.f13254c
            r7.putObject(r14, r8, r1)
        L_0x0115:
            r6 = r6 | r10
            r13 = r34
            r9 = r7
            r2 = r15
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x0371
        L_0x0124:
            r23 = r33
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x014c
            r13 = r30
            r19 = 1048575(0xfffff, float:1.469367E-39)
            java.lang.Object r8 = r13.m16990l(r14, r15)
            com.google.android.gms.internal.measurement.cb r1 = r13.m16988j(r15)
            r0 = r8
            r2 = r32
            r3 = r4
            r4 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15996o(r0, r1, r2, r3, r4, r5)
            r13.m16998u(r14, r15, r8)
            goto L_0x0239
        L_0x014c:
            r13 = r30
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0248
        L_0x0153:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0248
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r22 & r0
            if (r0 != 0) goto L_0x016c
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15988g(r12, r4, r11)
            goto L_0x0170
        L_0x016c:
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15989h(r12, r4, r11)
        L_0x0170:
            java.lang.Object r1 = r11.f13254c
            r7.putObject(r14, r8, r1)
            goto L_0x0239
        L_0x0177:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0248
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15994m(r12, r4, r11)
            long r1 = r11.f13253b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0191
            goto L_0x0193
        L_0x0191:
            r5 = r16
        L_0x0193:
            com.google.android.gms.internal.measurement.C4387rb.m16591r(r14, r8, r5)
            goto L_0x0239
        L_0x0198:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0248
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15983b(r12, r4)
            r7.putInt(r14, r8, r0)
            goto L_0x021c
        L_0x01ae:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != r5) goto L_0x0248
            long r21 = com.google.android.gms.internal.measurement.C4214h8.m15997p(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0239
        L_0x01cd:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0248
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15991j(r12, r4, r11)
            int r1 = r11.f13252a
            r7.putInt(r14, r8, r1)
            goto L_0x0239
        L_0x01e4:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0248
            int r17 = com.google.android.gms.internal.measurement.C4214h8.m15994m(r12, r4, r11)
            long r4 = r11.f13253b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r9 = r7
            r2 = r15
            r0 = r17
            goto L_0x023c
        L_0x0204:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0248
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15983b(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.C4387rb.m16594u(r14, r8, r0)
        L_0x021c:
            int r0 = r4 + 4
            goto L_0x0239
        L_0x021f:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != r5) goto L_0x0248
            long r0 = com.google.android.gms.internal.measurement.C4214h8.m15997p(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.C4387rb.m16593t(r14, r8, r0)
            int r0 = r4 + 8
        L_0x0239:
            r6 = r6 | r10
            r9 = r7
            r2 = r15
        L_0x023c:
            r8 = r19
            r7 = r20
            r1 = r23
            r10 = -1
            r15 = r13
        L_0x0244:
            r13 = r34
            goto L_0x0020
        L_0x0248:
            r2 = r4
            r29 = r7
            r7 = r20
            r18 = -1
            goto L_0x034f
        L_0x0251:
            r23 = r33
            r22 = r1
            r20 = r7
            r10 = r15
            r7 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r2
            r0 = 27
            if (r13 != r0) goto L_0x02af
            r0 = 2
            if (r3 != r0) goto L_0x02a4
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.measurement.v9 r0 = (com.google.android.gms.internal.measurement.C4453v9) r0
            boolean r1 = r0.mo13068s()
            if (r1 != 0) goto L_0x0282
            int r1 = r0.size()
            if (r1 != 0) goto L_0x027a
            r1 = 10
            goto L_0x027b
        L_0x027a:
            int r1 = r1 + r1
        L_0x027b:
            com.google.android.gms.internal.measurement.v9 r0 = r0.mo12866e(r1)
            r7.putObject(r14, r8, r0)
        L_0x0282:
            r5 = r0
            com.google.android.gms.internal.measurement.cb r0 = r10.m16988j(r15)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15986e(r0, r1, r2, r3, r4, r5, r6)
            r13 = r34
            r9 = r7
            r6 = r8
            r2 = r15
            r8 = r19
            r7 = r20
            r1 = r23
            r15 = r10
            r10 = -1
            goto L_0x0020
        L_0x02a4:
            r14 = r4
            r25 = r6
            r29 = r7
            r26 = r20
            r18 = -1
            goto L_0x032c
        L_0x02af:
            r0 = 49
            if (r13 > r0) goto L_0x02ff
            r1 = r22
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r5 = r3
            r3 = r4
            r24 = r4
            r4 = r34
            r33 = r5
            r5 = r17
            r25 = r6
            r6 = r23
            r26 = r20
            r20 = r7
            r7 = r33
            r27 = r8
            r9 = r19
            r8 = r15
            r29 = r20
            r18 = -1
            r9 = r21
            r11 = r13
            r12 = r27
            r14 = r35
            int r0 = r0.m16979O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r24
            if (r0 == r14) goto L_0x02fd
        L_0x02ea:
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r15
            r10 = r18
            r1 = r23
            r6 = r25
            r7 = r26
            goto L_0x036c
        L_0x02fd:
            r2 = r0
            goto L_0x032d
        L_0x02ff:
            r33 = r3
            r14 = r4
            r25 = r6
            r29 = r7
            r27 = r8
            r26 = r20
            r1 = r22
            r18 = -1
            r0 = 50
            if (r13 != r0) goto L_0x0332
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x032c
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r15
            r6 = r27
            r8 = r35
            int r0 = r0.m16977M(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r14) goto L_0x02fd
            goto L_0x02ea
        L_0x032c:
            r2 = r14
        L_0x032d:
            r6 = r25
            r7 = r26
            goto L_0x034f
        L_0x0332:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r17
            r6 = r23
            r9 = r13
            r10 = r27
            r12 = r15
            r13 = r35
            int r0 = r0.m16978N(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x02fd
            goto L_0x02ea
        L_0x034f:
            com.google.android.gms.internal.measurement.ib r4 = m16971G(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C4214h8.m15990i(r0, r1, r2, r3, r4, r5)
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r15
            r10 = r18
            r1 = r23
        L_0x036c:
            r9 = r29
            r8 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0371:
            r15 = r30
            goto L_0x0020
        L_0x0375:
            r25 = r6
            r1 = r8
            r29 = r9
            if (r7 == r1) goto L_0x0386
            long r1 = (long) r7
            r3 = r31
            r6 = r25
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x0386:
            r4 = r34
            if (r0 != r4) goto L_0x038b
            return
        L_0x038b:
            com.google.android.gms.internal.measurement.zzll r0 = com.google.android.gms.internal.measurement.zzll.m17331e()
            throw r0
        L_0x0390:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.mo13755F(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4437ua.mo12991d(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.g8):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0326, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0420, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04a2, code lost:
        r4 = r4 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04f4, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x055f, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x056f, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0573, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12992e(java.lang.Object r12) {
        /*
            r11 = this;
            boolean r0 = r11.f13739g
            if (r0 == 0) goto L_0x0583
            sun.misc.Unsafe r0 = f13732q
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0009:
            int[] r4 = r11.f13733a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0577
            int r4 = r11.m16985U(r2)
            int r5 = m16984T(r4)
            int[] r6 = r11.f13733a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            com.google.android.gms.internal.measurement.j9 r7 = com.google.android.gms.internal.measurement.C4249j9.DOUBLE_LIST_PACKED
            int r7 = r7.mo13289a()
            if (r5 < r7) goto L_0x0034
            com.google.android.gms.internal.measurement.j9 r7 = com.google.android.gms.internal.measurement.C4249j9.SINT64_LIST_PACKED
            int r7 = r7.mo13289a()
            if (r5 > r7) goto L_0x0034
            int[] r7 = r11.f13733a
            int r8 = r2 + 2
            r7 = r7[r8]
        L_0x0034:
            long r7 = (long) r4
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0563;
                case 1: goto L_0x0553;
                case 2: goto L_0x053c;
                case 3: goto L_0x0527;
                case 4: goto L_0x0512;
                case 5: goto L_0x0505;
                case 6: goto L_0x04f8;
                case 7: goto L_0x04e8;
                case 8: goto L_0x04b9;
                case 9: goto L_0x04a5;
                case 10: goto L_0x0485;
                case 11: goto L_0x046f;
                case 12: goto L_0x0459;
                case 13: goto L_0x044b;
                case 14: goto L_0x043d;
                case 15: goto L_0x0422;
                case 16: goto L_0x0406;
                case 17: goto L_0x03f1;
                case 18: goto L_0x03e4;
                case 19: goto L_0x03d9;
                case 20: goto L_0x03ce;
                case 21: goto L_0x03c3;
                case 22: goto L_0x03b8;
                case 23: goto L_0x03ad;
                case 24: goto L_0x03a2;
                case 25: goto L_0x0397;
                case 26: goto L_0x038c;
                case 27: goto L_0x037d;
                case 28: goto L_0x0371;
                case 29: goto L_0x0365;
                case 30: goto L_0x0359;
                case 31: goto L_0x034d;
                case 32: goto L_0x0341;
                case 33: goto L_0x0335;
                case 34: goto L_0x0329;
                case 35: goto L_0x0310;
                case 36: goto L_0x02f9;
                case 37: goto L_0x02e2;
                case 38: goto L_0x02cb;
                case 39: goto L_0x02b4;
                case 40: goto L_0x029c;
                case 41: goto L_0x0284;
                case 42: goto L_0x026a;
                case 43: goto L_0x0252;
                case 44: goto L_0x023a;
                case 45: goto L_0x0222;
                case 46: goto L_0x020a;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01da;
                case 49: goto L_0x01ca;
                case 50: goto L_0x01bd;
                case 51: goto L_0x01af;
                case 52: goto L_0x01a1;
                case 53: goto L_0x018b;
                case 54: goto L_0x0175;
                case 55: goto L_0x015f;
                case 56: goto L_0x0151;
                case 57: goto L_0x0143;
                case 58: goto L_0x0135;
                case 59: goto L_0x0104;
                case 60: goto L_0x00f0;
                case 61: goto L_0x00d1;
                case 62: goto L_0x00bb;
                case 63: goto L_0x00a5;
                case 64: goto L_0x0097;
                case 65: goto L_0x0089;
                case 66: goto L_0x006e;
                case 67: goto L_0x0052;
                case 68: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0573
        L_0x003c:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            com.google.android.gms.internal.measurement.ra r4 = (com.google.android.gms.internal.measurement.C4386ra) r4
            com.google.android.gms.internal.measurement.cb r5 = r11.m16988j(r2)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15480u(r6, r4, r5)
            goto L_0x03ee
        L_0x0052:
            boolean r5 = r11.m16968C(r12, r6, r2)
            if (r5 == 0) goto L_0x0573
            long r7 = m16986V(r12, r7)
            int r5 = r6 << 3
            long r9 = r7 + r7
            long r6 = r7 >> r4
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            long r5 = r9 ^ r6
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15485z(r5)
            goto L_0x0420
        L_0x006e:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = m16976L(r12, r7)
            int r5 = r6 << 3
            int r6 = r4 + r4
            int r4 = r4 >> 31
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x0550
        L_0x0089:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x056f
        L_0x0097:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x055f
        L_0x00a5:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = m16976L(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15481v(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0550
        L_0x00bb:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = m16976L(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0550
        L_0x00d1:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            com.google.android.gms.internal.measurement.t8 r4 = (com.google.android.gms.internal.measurement.C4418t8) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.f13141d
            int r4 = r4.mo13355g()
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x04a2
        L_0x00f0:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            com.google.android.gms.internal.measurement.cb r5 = r11.m16988j(r2)
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15730L(r6, r4, r5)
            goto L_0x03ee
        L_0x0104:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.C4418t8
            if (r5 == 0) goto L_0x0127
            com.google.android.gms.internal.measurement.t8 r4 = (com.google.android.gms.internal.measurement.C4418t8) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.f13141d
            int r4 = r4.mo13355g()
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x04a2
        L_0x0127:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15483x(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0550
        L_0x0135:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x04f4
        L_0x0143:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x055f
        L_0x0151:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x056f
        L_0x015f:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = m16976L(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15481v(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0550
        L_0x0175:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            long r4 = m16986V(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15485z(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r6)
            goto L_0x0550
        L_0x018b:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            long r4 = m16986V(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15485z(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r6)
            goto L_0x0550
        L_0x01a1:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x055f
        L_0x01af:
            boolean r4 = r11.m16968C(r12, r6, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x056f
        L_0x01bd:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.lang.Object r5 = r11.m16989k(r2)
            com.google.android.gms.internal.measurement.C4301ma.m16281a(r6, r4, r5)
            goto L_0x0573
        L_0x01ca:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.cb r5 = r11.m16988j(r2)
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15725G(r6, r4, r5)
            goto L_0x03ee
        L_0x01da:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15735Q(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0326
        L_0x01f2:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15733O(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0326
        L_0x020a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15724F(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0326
        L_0x0222:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15722D(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0326
        L_0x023a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15720B(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0326
        L_0x0252:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15738T(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0326
        L_0x026a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r5 = com.google.android.gms.internal.measurement.C4166eb.f13218e
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0326
        L_0x0284:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15722D(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0326
        L_0x029c:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15724F(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0326
        L_0x02b4:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15727I(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0326
        L_0x02cb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15740V(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0326
        L_0x02e2:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15729K(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0326
        L_0x02f9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15722D(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0326
        L_0x0310:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15724F(r4)
            if (r4 <= 0) goto L_0x0573
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
        L_0x0326:
            int r5 = r5 + r6
            goto L_0x0550
        L_0x0329:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15734P(r6, r4, r1)
            goto L_0x03ee
        L_0x0335:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15732N(r6, r4, r1)
            goto L_0x03ee
        L_0x0341:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15723E(r6, r4, r1)
            goto L_0x03ee
        L_0x034d:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15721C(r6, r4, r1)
            goto L_0x03ee
        L_0x0359:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15719A(r6, r4, r1)
            goto L_0x03ee
        L_0x0365:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15737S(r6, r4, r1)
            goto L_0x03ee
        L_0x0371:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15768z(r6, r4)
            goto L_0x03ee
        L_0x037d:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.cb r5 = r11.m16988j(r2)
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15731M(r6, r4, r5)
            goto L_0x03ee
        L_0x038c:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15736R(r6, r4)
            goto L_0x03ee
        L_0x0397:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15767y(r6, r4, r1)
            goto L_0x03ee
        L_0x03a2:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15721C(r6, r4, r1)
            goto L_0x03ee
        L_0x03ad:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15723E(r6, r4, r1)
            goto L_0x03ee
        L_0x03b8:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15726H(r6, r4, r1)
            goto L_0x03ee
        L_0x03c3:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15739U(r6, r4, r1)
            goto L_0x03ee
        L_0x03ce:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15728J(r6, r4, r1)
            goto L_0x03ee
        L_0x03d9:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15721C(r6, r4, r1)
            goto L_0x03ee
        L_0x03e4:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15723E(r6, r4, r1)
        L_0x03ee:
            int r3 = r3 + r4
            goto L_0x0573
        L_0x03f1:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            com.google.android.gms.internal.measurement.ra r4 = (com.google.android.gms.internal.measurement.C4386ra) r4
            com.google.android.gms.internal.measurement.cb r5 = r11.m16988j(r2)
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15480u(r6, r4, r5)
            goto L_0x03ee
        L_0x0406:
            boolean r5 = r11.m17002y(r12, r2)
            if (r5 == 0) goto L_0x0573
            long r7 = com.google.android.gms.internal.measurement.C4387rb.m16582i(r12, r7)
            int r5 = r6 << 3
            long r9 = r7 + r7
            long r6 = r7 >> r4
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            long r5 = r9 ^ r6
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15485z(r5)
        L_0x0420:
            int r4 = r4 + r5
            goto L_0x03ee
        L_0x0422:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r12, r7)
            int r5 = r6 << 3
            int r6 = r4 + r4
            int r4 = r4 >> 31
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x0550
        L_0x043d:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x056f
        L_0x044b:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x055f
        L_0x0459:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15481v(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0550
        L_0x046f:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0550
        L_0x0485:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            com.google.android.gms.internal.measurement.t8 r4 = (com.google.android.gms.internal.measurement.C4418t8) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.f13141d
            int r4 = r4.mo13355g()
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
        L_0x04a2:
            int r4 = r4 + r6
            goto L_0x03ee
        L_0x04a5:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            com.google.android.gms.internal.measurement.cb r5 = r11.m16988j(r2)
            int r4 = com.google.android.gms.internal.measurement.C4166eb.m15730L(r6, r4, r5)
            goto L_0x03ee
        L_0x04b9:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4387rb.m16584k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.C4418t8
            if (r5 == 0) goto L_0x04db
            com.google.android.gms.internal.measurement.t8 r4 = (com.google.android.gms.internal.measurement.C4418t8) r4
            int r5 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C4096a9.f13141d
            int r4 = r4.mo13355g()
            int r6 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            int r6 = r6 + r4
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x04a2
        L_0x04db:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15483x(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0550
        L_0x04e8:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
        L_0x04f4:
            int r4 = r4 + 1
            goto L_0x03ee
        L_0x04f8:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x055f
        L_0x0505:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
            goto L_0x056f
        L_0x0512:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = com.google.android.gms.internal.measurement.C4387rb.m16581h(r12, r7)
            int r5 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15481v(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r5)
            goto L_0x0550
        L_0x0527:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            long r4 = com.google.android.gms.internal.measurement.C4387rb.m16582i(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15485z(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r6)
            goto L_0x0550
        L_0x053c:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            long r4 = com.google.android.gms.internal.measurement.C4387rb.m16582i(r12, r7)
            int r6 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15485z(r4)
            int r5 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r6)
        L_0x0550:
            int r5 = r5 + r4
            int r3 = r3 + r5
            goto L_0x0573
        L_0x0553:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
        L_0x055f:
            int r4 = r4 + 4
            goto L_0x03ee
        L_0x0563:
            boolean r4 = r11.m17002y(r12, r2)
            if (r4 == 0) goto L_0x0573
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C4096a9.m15484y(r4)
        L_0x056f:
            int r4 = r4 + 8
            goto L_0x03ee
        L_0x0573:
            int r2 = r2 + 3
            goto L_0x0009
        L_0x0577:
            com.google.android.gms.internal.measurement.hb r0 = r11.f13744l
            java.lang.Object r12 = r0.mo13214d(r12)
            int r12 = r0.mo13211a(r12)
            int r3 = r3 + r12
            goto L_0x0587
        L_0x0583:
            int r3 = r11.m16975K(r12)
        L_0x0587:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4437ua.mo12992e(java.lang.Object):int");
    }

    /* renamed from: f */
    public final void mo12993f(Object obj, Object obj2) {
        m16993o(obj);
        obj2.getClass();
        for (int i = 0; i < this.f13733a.length; i += 3) {
            int U = m16985U(i);
            int i2 = this.f13733a[i];
            long j = (long) (1048575 & U);
            switch (m16984T(U)) {
                case 0:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16593t(obj, j, C4387rb.m16579f(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 1:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16594u(obj, j, C4387rb.m16580g(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 2:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16596w(obj, j, C4387rb.m16582i(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 3:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16596w(obj, j, C4387rb.m16582i(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 4:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16595v(obj, j, C4387rb.m16581h(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 5:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16596w(obj, j, C4387rb.m16582i(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 6:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16595v(obj, j, C4387rb.m16581h(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 7:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16591r(obj, j, C4387rb.m16570B(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 8:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16597x(obj, j, C4387rb.m16584k(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 9:
                    m16994p(obj, obj2, i);
                    break;
                case 10:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16597x(obj, j, C4387rb.m16584k(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 11:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16595v(obj, j, C4387rb.m16581h(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 12:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16595v(obj, j, C4387rb.m16581h(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 13:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16595v(obj, j, C4387rb.m16581h(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 14:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16596w(obj, j, C4387rb.m16582i(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 15:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16595v(obj, j, C4387rb.m16581h(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 16:
                    if (!m17002y(obj2, i)) {
                        break;
                    } else {
                        C4387rb.m16596w(obj, j, C4387rb.m16582i(obj2, j));
                        m16996r(obj, i);
                        break;
                    }
                case 17:
                    m16994p(obj, obj2, i);
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
                    this.f13743k.mo12950b(obj, obj2, j);
                    break;
                case 50:
                    int i3 = C4166eb.f13218e;
                    C4387rb.m16597x(obj, j, C4301ma.m16282b(C4387rb.m16584k(obj, j), C4387rb.m16584k(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!m16968C(obj2, i2, i)) {
                        break;
                    } else {
                        C4387rb.m16597x(obj, j, C4387rb.m16584k(obj2, j));
                        m16997s(obj, i2, i);
                        break;
                    }
                case 60:
                    m16995q(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m16968C(obj2, i2, i)) {
                        break;
                    } else {
                        C4387rb.m16597x(obj, j, C4387rb.m16584k(obj2, j));
                        m16997s(obj, i2, i);
                        break;
                    }
                case 68:
                    m16995q(obj, obj2, i);
                    break;
            }
        }
        C4166eb.m15745c(this.f13744l, obj, obj2);
        if (this.f13738f) {
            this.f13745m.mo13123a(obj2);
            throw null;
        }
    }

    /* renamed from: g */
    public final boolean mo12994g(Object obj, Object obj2) {
        boolean z;
        int length = this.f13733a.length;
        for (int i = 0; i < length; i += 3) {
            int U = m16985U(i);
            long j = (long) (U & 1048575);
            switch (m16984T(U)) {
                case 0:
                    if (m17001x(obj, obj2, i) && Double.doubleToLongBits(C4387rb.m16579f(obj, j)) == Double.doubleToLongBits(C4387rb.m16579f(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (m17001x(obj, obj2, i) && Float.floatToIntBits(C4387rb.m16580g(obj, j)) == Float.floatToIntBits(C4387rb.m16580g(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (m17001x(obj, obj2, i) && C4387rb.m16582i(obj, j) == C4387rb.m16582i(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (m17001x(obj, obj2, i) && C4387rb.m16582i(obj, j) == C4387rb.m16582i(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (m17001x(obj, obj2, i) && C4387rb.m16581h(obj, j) == C4387rb.m16581h(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (m17001x(obj, obj2, i) && C4387rb.m16582i(obj, j) == C4387rb.m16582i(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (m17001x(obj, obj2, i) && C4387rb.m16581h(obj, j) == C4387rb.m16581h(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (m17001x(obj, obj2, i) && C4387rb.m16570B(obj, j) == C4387rb.m16570B(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (m17001x(obj, obj2, i) && C4166eb.m15765w(C4387rb.m16584k(obj, j), C4387rb.m16584k(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (m17001x(obj, obj2, i) && C4166eb.m15765w(C4387rb.m16584k(obj, j), C4387rb.m16584k(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (m17001x(obj, obj2, i) && C4166eb.m15765w(C4387rb.m16584k(obj, j), C4387rb.m16584k(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (m17001x(obj, obj2, i) && C4387rb.m16581h(obj, j) == C4387rb.m16581h(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (m17001x(obj, obj2, i) && C4387rb.m16581h(obj, j) == C4387rb.m16581h(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (m17001x(obj, obj2, i) && C4387rb.m16581h(obj, j) == C4387rb.m16581h(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (m17001x(obj, obj2, i) && C4387rb.m16582i(obj, j) == C4387rb.m16582i(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (m17001x(obj, obj2, i) && C4387rb.m16581h(obj, j) == C4387rb.m16581h(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (m17001x(obj, obj2, i) && C4387rb.m16582i(obj, j) == C4387rb.m16582i(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (m17001x(obj, obj2, i) && C4166eb.m15765w(C4387rb.m16584k(obj, j), C4387rb.m16584k(obj2, j))) {
                        continue;
                    }
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
                    z = C4166eb.m15765w(C4387rb.m16584k(obj, j), C4387rb.m16584k(obj2, j));
                    break;
                case 50:
                    z = C4166eb.m15765w(C4387rb.m16584k(obj, j), C4387rb.m16584k(obj2, j));
                    break;
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
                    long R = (long) (m16982R(i) & 1048575);
                    if (C4387rb.m16581h(obj, R) == C4387rb.m16581h(obj2, R) && C4166eb.m15765w(C4387rb.m16584k(obj, j), C4387rb.m16584k(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f13744l.mo13214d(obj).equals(this.f13744l.mo13214d(obj2))) {
            return false;
        }
        if (!this.f13738f) {
            return true;
        }
        this.f13745m.mo13123a(obj);
        this.f13745m.mo13123a(obj2);
        throw null;
    }

    /* renamed from: h */
    public final boolean mo12995h(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.f13741i) {
            int i6 = this.f13740h[i4];
            int i7 = this.f13733a[i6];
            int U = m16985U(i6);
            int i8 = this.f13733a[i6 + 2];
            int i9 = i8 & 1048575;
            int i12 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = f13732q.getInt(obj2, (long) i9);
                }
                i = i3;
                i2 = i9;
            } else {
                i2 = i5;
                i = i3;
            }
            if ((268435456 & U) != 0 && !m17003z(obj, i6, i2, i, i12)) {
                return false;
            }
            int T = m16984T(U);
            if (T != 9 && T != 17) {
                if (T != 27) {
                    if (T == 60 || T == 68) {
                        if (m16968C(obj2, i7, i6) && !m16966A(obj2, U, m16988j(i6))) {
                            return false;
                        }
                    } else if (T != 49) {
                        if (T == 50 && !((C4284la) C4387rb.m16584k(obj2, (long) (U & 1048575))).isEmpty()) {
                            C0125b.m366a(m16989k(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) C4387rb.m16584k(obj2, (long) (U & 1048575));
                if (!list.isEmpty()) {
                    C4132cb j = m16988j(i6);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!j.mo12995h(list.get(i13))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m17003z(obj, i6, i2, i, i12) && !m16966A(obj2, U, m16988j(i6))) {
                return false;
            }
            i4++;
            i5 = i2;
            i3 = i;
        }
        if (!this.f13738f) {
            return true;
        }
        this.f13745m.mo13123a(obj2);
        throw null;
    }

    /* renamed from: t */
    public final Object mo12996t() {
        return ((C4351p9) this.f13737e).mo13473l();
    }
}
