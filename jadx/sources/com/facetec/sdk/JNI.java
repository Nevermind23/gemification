package com.facetec.sdk;

import com.guardsquare.dexguard.annotation.VirtualizeCode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import p341ge.bog.mobilebank.model.PensionStatusResult;

@VirtualizeCode
final class JNI {

    /* renamed from: a */
    private static int f8672a = 0;

    /* renamed from: b */
    private static final Map<Object, String> f8673b;

    /* renamed from: c */
    public static final byte[] f8674c = null;

    /* renamed from: d */
    private static int f8675d = 1;

    /* renamed from: e */
    public static final int f8676e = 0;

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.facetec.sdk.JNI$c */
    @interface C2746c {
        /* renamed from: e */
        long mo8795e();
    }

    static {
        m10675d();
        HashMap hashMap = new HashMap();
        f8673b = hashMap;
        hashMap.put(Boolean.TYPE, "Z");
        hashMap.put(Byte.TYPE, "B");
        hashMap.put(Character.TYPE, "C");
        hashMap.put(Double.TYPE, "D");
        hashMap.put(Float.TYPE, "F");
        hashMap.put(Integer.TYPE, PensionStatusResult.STATUS_INACTIVE);
        hashMap.put(Long.TYPE, "J");
        hashMap.put(Short.TYPE, "S");
        hashMap.put(Void.TYPE, "V");
    }

    JNI() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x04ce, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0171, code lost:
        r0.f9941i = r1;
        r0.mo9115d(31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x024d, code lost:
        r0.f9941i = r1;
        r0.mo9115d(31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x039f, code lost:
        r0.f9941i = r5;
        r0.mo9115d(31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0414, code lost:
        r0.f9934b = r5;
        r0.mo9115d(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x042e, code lost:
        r5 = r9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m10671a(java.lang.reflect.Method r17) {
        /*
            com.facetec.sdk.dj r0 = new com.facetec.sdk.dj
            r1 = r17
            r0.<init>(r1)
            byte[] r1 = f8674c
            r2 = 2
            byte r3 = r1[r2]
            int r3 = -r3
            byte r3 = (byte) r3
            r4 = 285(0x11d, float:4.0E-43)
            short r4 = (short) r4
            r5 = 543(0x21f, float:7.61E-43)
            short r5 = (short) r5
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            m10677f(r3, r4, r5, r7)
            r3 = 0
            r4 = r7[r3]
            java.lang.String r4 = (java.lang.String) r4
            r5 = 74
            byte r7 = (byte) r5
            r8 = 34
            byte r9 = r1[r8]
            short r9 = (short) r9
            r10 = r9 | 136(0x88, float:1.9E-43)
            short r10 = (short) r10
            java.lang.Object[] r11 = new java.lang.Object[r6]
            m10677f(r7, r9, r10, r11)
            r7 = r11[r3]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x04d1 }
            r9[r3] = r7     // Catch:{ all -> 0x04d1 }
            r7 = 21
            byte r10 = r1[r7]     // Catch:{ all -> 0x04d1 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x04d1 }
            r11 = 134(0x86, float:1.88E-43)
            byte r12 = r1[r11]     // Catch:{ all -> 0x04d1 }
            short r12 = (short) r12     // Catch:{ all -> 0x04d1 }
            r13 = 865(0x361, float:1.212E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x04d1 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x04d1 }
            m10677f(r10, r12, r13, r14)     // Catch:{ all -> 0x04d1 }
            r10 = r14[r3]     // Catch:{ all -> 0x04d1 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x04d1 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x04d1 }
            r12 = 260(0x104, float:3.64E-43)
            byte r12 = r1[r12]     // Catch:{ all -> 0x04d1 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x04d1 }
            r14 = 60
            byte r14 = r1[r14]     // Catch:{ all -> 0x04d1 }
            short r14 = (short) r14     // Catch:{ all -> 0x04d1 }
            r15 = 513(0x201, float:7.19E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x04d1 }
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ all -> 0x04d1 }
            m10677f(r12, r14, r15, r5)     // Catch:{ all -> 0x04d1 }
            r5 = r5[r3]     // Catch:{ all -> 0x04d1 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x04d1 }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x04d1 }
            byte r14 = r1[r7]     // Catch:{ all -> 0x04d1 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x04d1 }
            byte r1 = r1[r11]     // Catch:{ all -> 0x04d1 }
            short r1 = (short) r1     // Catch:{ all -> 0x04d1 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x04d1 }
            m10677f(r14, r1, r13, r15)     // Catch:{ all -> 0x04d1 }
            r1 = r15[r3]     // Catch:{ all -> 0x04d1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x04d1 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x04d1 }
            r12[r3] = r1     // Catch:{ all -> 0x04d1 }
            java.lang.reflect.Method r1 = r10.getMethod(r5, r12)     // Catch:{ all -> 0x04d1 }
            java.lang.Object r1 = r1.invoke(r4, r9)     // Catch:{ all -> 0x04d1 }
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch:{ all -> 0x04d1 }
            int r4 = r1.length
            int[] r4 = new int[r4]
            r5 = r3
        L_0x008c:
            int r9 = r1.length
            r10 = 109(0x6d, float:1.53E-43)
            if (r5 >= r9) goto L_0x0146
            r9 = r1[r5]
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x013d }
            r14[r3] = r9     // Catch:{ all -> 0x013d }
            byte[] r9 = f8674c     // Catch:{ all -> 0x013d }
            byte r15 = r9[r7]     // Catch:{ all -> 0x013d }
            byte r15 = (byte) r15     // Catch:{ all -> 0x013d }
            byte r2 = r9[r10]     // Catch:{ all -> 0x013d }
            short r2 = (short) r2     // Catch:{ all -> 0x013d }
            int r10 = f8676e     // Catch:{ all -> 0x013d }
            r12 = r10 & 1004(0x3ec, float:1.407E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x013d }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x013d }
            m10677f(r15, r2, r12, r11)     // Catch:{ all -> 0x013d }
            r2 = r11[r3]     // Catch:{ all -> 0x013d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x013d }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x013d }
            byte r11 = r9[r8]     // Catch:{ all -> 0x013d }
            byte r11 = (byte) r11     // Catch:{ all -> 0x013d }
            r12 = 9
            byte r12 = r9[r12]     // Catch:{ all -> 0x013d }
            short r12 = (short) r12     // Catch:{ all -> 0x013d }
            r15 = 101(0x65, float:1.42E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x013d }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x013d }
            m10677f(r11, r12, r15, r8)     // Catch:{ all -> 0x013d }
            r8 = r8[r3]     // Catch:{ all -> 0x013d }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x013d }
            java.lang.Class[] r11 = new java.lang.Class[r6]     // Catch:{ all -> 0x013d }
            byte r12 = r9[r7]     // Catch:{ all -> 0x013d }
            byte r12 = (byte) r12     // Catch:{ all -> 0x013d }
            r15 = 134(0x86, float:1.88E-43)
            byte r7 = r9[r15]     // Catch:{ all -> 0x013d }
            short r7 = (short) r7     // Catch:{ all -> 0x013d }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x013d }
            m10677f(r12, r7, r13, r15)     // Catch:{ all -> 0x013d }
            r7 = r15[r3]     // Catch:{ all -> 0x013d }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x013d }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x013d }
            r11[r3] = r7     // Catch:{ all -> 0x013d }
            java.lang.reflect.Method r2 = r2.getMethod(r8, r11)     // Catch:{ all -> 0x013d }
            r7 = 0
            java.lang.Object r2 = r2.invoke(r7, r14)     // Catch:{ all -> 0x013d }
            r7 = 21
            byte r8 = r9[r7]     // Catch:{ all -> 0x0134 }
            byte r7 = (byte) r8     // Catch:{ all -> 0x0134 }
            r8 = 109(0x6d, float:1.53E-43)
            byte r8 = r9[r8]     // Catch:{ all -> 0x0134 }
            short r8 = (short) r8     // Catch:{ all -> 0x0134 }
            r10 = r10 & 1004(0x3ec, float:1.407E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0134 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0134 }
            m10677f(r7, r8, r10, r11)     // Catch:{ all -> 0x0134 }
            r7 = r11[r3]     // Catch:{ all -> 0x0134 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0134 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0134 }
            r8 = 26
            byte r8 = r9[r8]     // Catch:{ all -> 0x0134 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0134 }
            r10 = 11
            byte r10 = r9[r10]     // Catch:{ all -> 0x0134 }
            short r10 = (short) r10     // Catch:{ all -> 0x0134 }
            byte r9 = r9[r3]     // Catch:{ all -> 0x0134 }
            int r9 = r9 + r6
            short r9 = (short) r9     // Catch:{ all -> 0x0134 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0134 }
            m10677f(r8, r10, r9, r11)     // Catch:{ all -> 0x0134 }
            r8 = r11[r3]     // Catch:{ all -> 0x0134 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0134 }
            r9 = 0
            java.lang.reflect.Method r7 = r7.getMethod(r8, r9)     // Catch:{ all -> 0x0134 }
            java.lang.Object r2 = r7.invoke(r2, r9)     // Catch:{ all -> 0x0134 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0134 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0134 }
            r4[r5] = r2
            int r5 = r5 + 1
            r2 = 2
            r7 = 21
            r8 = 34
            r11 = 134(0x86, float:1.88E-43)
            goto L_0x008c
        L_0x0134:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x013c
            throw r1
        L_0x013c:
            throw r0
        L_0x013d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0145
            throw r1
        L_0x0145:
            throw r0
        L_0x0146:
            r1 = r3
        L_0x0147:
            int r2 = r1 + 1
            r1 = r4[r1]
            int r1 = r0.mo9115d(r1)
            r5 = 16
            r9 = 20
            r10 = 828(0x33c, float:1.16E-42)
            r11 = 110(0x6e, float:1.54E-43)
            r12 = 10
            r14 = 14
            r15 = 31
            r7 = 6
            r8 = 4
            switch(r1) {
                case -35: goto L_0x04c4;
                case -34: goto L_0x04a6;
                case -33: goto L_0x049b;
                case -32: goto L_0x0486;
                case -31: goto L_0x047b;
                case -30: goto L_0x0470;
                case -29: goto L_0x045e;
                case -28: goto L_0x0452;
                case -27: goto L_0x0446;
                case -26: goto L_0x0431;
                case -25: goto L_0x041a;
                case -24: goto L_0x040a;
                case -23: goto L_0x0405;
                case -22: goto L_0x03f9;
                case -21: goto L_0x03e6;
                case -20: goto L_0x03d1;
                case -19: goto L_0x03c6;
                case -18: goto L_0x03c1;
                case -17: goto L_0x03b7;
                case -16: goto L_0x03b2;
                case -15: goto L_0x03a6;
                case -14: goto L_0x0389;
                case -13: goto L_0x0336;
                case -12: goto L_0x02d0;
                case -11: goto L_0x02ca;
                case -10: goto L_0x025a;
                case -9: goto L_0x023b;
                case -8: goto L_0x0235;
                case -7: goto L_0x022f;
                case -6: goto L_0x0220;
                case -5: goto L_0x021a;
                case -4: goto L_0x01ca;
                case -3: goto L_0x0177;
                case -2: goto L_0x016f;
                case -1: goto L_0x016c;
                default: goto L_0x0162;
            }
        L_0x0162:
            r1 = 2
            r5 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            goto L_0x04ce
        L_0x016c:
            r1 = 33
            goto L_0x0147
        L_0x016f:
            java.lang.String r1 = "("
        L_0x0171:
            r0.f9941i = r1
            r0.mo9115d(r15)
            goto L_0x0162
        L_0x0177:
            r0.f9934b = r6
            r0.mo9115d(r8)
            r0.mo9115d(r7)
            java.lang.Object r1 = r0.f9939g
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ all -> 0x01c1 }
            r5[r3] = r1     // Catch:{ all -> 0x01c1 }
            byte[] r1 = f8674c     // Catch:{ all -> 0x01c1 }
            r7 = 21
            byte r8 = r1[r7]     // Catch:{ all -> 0x01c1 }
            byte r7 = (byte) r8     // Catch:{ all -> 0x01c1 }
            byte r8 = r1[r11]     // Catch:{ all -> 0x01c1 }
            short r8 = (short) r8     // Catch:{ all -> 0x01c1 }
            short r9 = (short) r10     // Catch:{ all -> 0x01c1 }
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x01c1 }
            m10677f(r7, r8, r9, r10)     // Catch:{ all -> 0x01c1 }
            r7 = r10[r3]     // Catch:{ all -> 0x01c1 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01c1 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x01c1 }
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ all -> 0x01c1 }
            r9 = 21
            byte r10 = r1[r9]     // Catch:{ all -> 0x01c1 }
            byte r9 = (byte) r10     // Catch:{ all -> 0x01c1 }
            r10 = 134(0x86, float:1.88E-43)
            byte r1 = r1[r10]     // Catch:{ all -> 0x01c1 }
            short r1 = (short) r1     // Catch:{ all -> 0x01c1 }
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x01c1 }
            m10677f(r9, r1, r13, r10)     // Catch:{ all -> 0x01c1 }
            r1 = r10[r3]     // Catch:{ all -> 0x01c1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01c1 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x01c1 }
            r8[r3] = r1     // Catch:{ all -> 0x01c1 }
            java.lang.reflect.Constructor r1 = r7.getDeclaredConstructor(r8)     // Catch:{ all -> 0x01c1 }
            java.lang.Object r1 = r1.newInstance(r5)     // Catch:{ all -> 0x01c1 }
            goto L_0x0171
        L_0x01c1:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01c9
            throw r1
        L_0x01c9:
            throw r0
        L_0x01ca:
            r0.f9934b = r6
            r0.mo9115d(r8)
            r0.mo9115d(r7)
            java.lang.Object r1 = r0.f9939g
            byte[] r5 = f8674c     // Catch:{ all -> 0x0211 }
            r7 = 21
            byte r8 = r5[r7]     // Catch:{ all -> 0x0211 }
            byte r7 = (byte) r8     // Catch:{ all -> 0x0211 }
            r8 = 111(0x6f, float:1.56E-43)
            byte r8 = r5[r8]     // Catch:{ all -> 0x0211 }
            int r8 = -r8
            short r8 = (short) r8     // Catch:{ all -> 0x0211 }
            r9 = 994(0x3e2, float:1.393E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0211 }
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x0211 }
            m10677f(r7, r8, r9, r10)     // Catch:{ all -> 0x0211 }
            r7 = r10[r3]     // Catch:{ all -> 0x0211 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0211 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0211 }
            r8 = 134(0x86, float:1.88E-43)
            byte r9 = r5[r8]     // Catch:{ all -> 0x0211 }
            byte r8 = (byte) r9     // Catch:{ all -> 0x0211 }
            r16 = 109(0x6d, float:1.53E-43)
            byte r5 = r5[r16]     // Catch:{ all -> 0x0211 }
            short r5 = (short) r5     // Catch:{ all -> 0x0211 }
            r9 = r5 | 104(0x68, float:1.46E-43)
            short r9 = (short) r9     // Catch:{ all -> 0x0211 }
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x0211 }
            m10677f(r8, r5, r9, r10)     // Catch:{ all -> 0x0211 }
            r5 = r10[r3]     // Catch:{ all -> 0x0211 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0211 }
            r8 = 0
            java.lang.reflect.Method r5 = r7.getMethod(r5, r8)     // Catch:{ all -> 0x0211 }
            java.lang.Object r1 = r5.invoke(r1, r8)     // Catch:{ all -> 0x0211 }
            goto L_0x024d
        L_0x0211:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0219
            throw r1
        L_0x0219:
            throw r0
        L_0x021a:
            r16 = 109(0x6d, float:1.53E-43)
            r1 = 66
            goto L_0x0147
        L_0x0220:
            r16 = 109(0x6d, float:1.53E-43)
            r1 = 44
            r0.mo9115d(r1)
            int r1 = r0.f9935c
            if (r1 != 0) goto L_0x04ce
            r1 = 13
            goto L_0x0147
        L_0x022f:
            r16 = 109(0x6d, float:1.53E-43)
            r1 = 79
            goto L_0x0147
        L_0x0235:
            r16 = 109(0x6d, float:1.53E-43)
            r1 = 77
            goto L_0x0147
        L_0x023b:
            r16 = 109(0x6d, float:1.53E-43)
            r0.f9934b = r6
            r0.mo9115d(r8)
            r0.mo9115d(r7)
            java.lang.Object r1 = r0.f9939g
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = m10673b(r1)
        L_0x024d:
            r0.f9941i = r1
            r0.mo9115d(r15)
            r1 = 2
        L_0x0253:
            r5 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            goto L_0x04ce
        L_0x025a:
            r1 = 2
            r16 = 109(0x6d, float:1.53E-43)
            r0.f9934b = r1
            r0.mo9115d(r8)
            r0.mo9115d(r7)
            java.lang.Object r1 = r0.f9939g
            r0.mo9115d(r7)
            java.lang.Object r5 = r0.f9939g
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x02c1 }
            r7[r3] = r5     // Catch:{ all -> 0x02c1 }
            byte[] r5 = f8674c     // Catch:{ all -> 0x02c1 }
            r8 = 21
            byte r9 = r5[r8]     // Catch:{ all -> 0x02c1 }
            byte r8 = (byte) r9     // Catch:{ all -> 0x02c1 }
            byte r9 = r5[r11]     // Catch:{ all -> 0x02c1 }
            short r9 = (short) r9     // Catch:{ all -> 0x02c1 }
            short r10 = (short) r10     // Catch:{ all -> 0x02c1 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x02c1 }
            m10677f(r8, r9, r10, r11)     // Catch:{ all -> 0x02c1 }
            r8 = r11[r3]     // Catch:{ all -> 0x02c1 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x02c1 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x02c1 }
            r9 = 106(0x6a, float:1.49E-43)
            byte r9 = r5[r9]     // Catch:{ all -> 0x02c1 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x02c1 }
            r10 = 5
            byte r10 = r5[r10]     // Catch:{ all -> 0x02c1 }
            short r10 = (short) r10     // Catch:{ all -> 0x02c1 }
            r11 = 1017(0x3f9, float:1.425E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x02c1 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x02c1 }
            m10677f(r9, r10, r11, r12)     // Catch:{ all -> 0x02c1 }
            r9 = r12[r3]     // Catch:{ all -> 0x02c1 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x02c1 }
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ all -> 0x02c1 }
            r11 = 21
            byte r12 = r5[r11]     // Catch:{ all -> 0x02c1 }
            byte r11 = (byte) r12     // Catch:{ all -> 0x02c1 }
            r12 = 134(0x86, float:1.88E-43)
            byte r5 = r5[r12]     // Catch:{ all -> 0x02c1 }
            short r5 = (short) r5     // Catch:{ all -> 0x02c1 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x02c1 }
            m10677f(r11, r5, r13, r12)     // Catch:{ all -> 0x02c1 }
            r5 = r12[r3]     // Catch:{ all -> 0x02c1 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x02c1 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x02c1 }
            r10[r3] = r5     // Catch:{ all -> 0x02c1 }
            java.lang.reflect.Method r5 = r8.getMethod(r9, r10)     // Catch:{ all -> 0x02c1 }
            java.lang.Object r1 = r5.invoke(r1, r7)     // Catch:{ all -> 0x02c1 }
            goto L_0x024d
        L_0x02c1:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02c9
            throw r1
        L_0x02c9:
            throw r0
        L_0x02ca:
            r16 = 109(0x6d, float:1.53E-43)
            r1 = 54
            goto L_0x0147
        L_0x02d0:
            r1 = 2
            r16 = 109(0x6d, float:1.53E-43)
            r0.f9934b = r1
            r0.mo9115d(r8)
            r0.mo9115d(r7)
            java.lang.Object r5 = r0.f9939g
            r0.mo9115d(r14)
            int r7 = r0.f9935c
            char r7 = (char) r7
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x032d }
            java.lang.Character r7 = java.lang.Character.valueOf(r7)     // Catch:{ all -> 0x032d }
            r8[r3] = r7     // Catch:{ all -> 0x032d }
            byte[] r7 = f8674c     // Catch:{ all -> 0x032d }
            r9 = 21
            byte r12 = r7[r9]     // Catch:{ all -> 0x032d }
            byte r9 = (byte) r12     // Catch:{ all -> 0x032d }
            byte r11 = r7[r11]     // Catch:{ all -> 0x032d }
            short r11 = (short) r11     // Catch:{ all -> 0x032d }
            short r10 = (short) r10     // Catch:{ all -> 0x032d }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x032d }
            m10677f(r9, r11, r10, r12)     // Catch:{ all -> 0x032d }
            r9 = r12[r3]     // Catch:{ all -> 0x032d }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x032d }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x032d }
            r10 = 106(0x6a, float:1.49E-43)
            byte r10 = r7[r10]     // Catch:{ all -> 0x032d }
            byte r10 = (byte) r10     // Catch:{ all -> 0x032d }
            r11 = 5
            byte r7 = r7[r11]     // Catch:{ all -> 0x032d }
            short r7 = (short) r7     // Catch:{ all -> 0x032d }
            r11 = 1017(0x3f9, float:1.425E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x032d }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x032d }
            m10677f(r10, r7, r11, r12)     // Catch:{ all -> 0x032d }
            r7 = r12[r3]     // Catch:{ all -> 0x032d }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x032d }
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ all -> 0x032d }
            java.lang.Class r11 = java.lang.Character.TYPE     // Catch:{ all -> 0x032d }
            r10[r3] = r11     // Catch:{ all -> 0x032d }
            java.lang.reflect.Method r7 = r9.getMethod(r7, r10)     // Catch:{ all -> 0x032d }
            java.lang.Object r5 = r7.invoke(r5, r8)     // Catch:{ all -> 0x032d }
            r0.f9941i = r5
            r0.mo9115d(r15)
            goto L_0x0253
        L_0x032d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0335
            throw r1
        L_0x0335:
            throw r0
        L_0x0336:
            r1 = 2
            r16 = 109(0x6d, float:1.53E-43)
            r0.f9934b = r6
            r0.mo9115d(r8)
            r0.mo9115d(r7)
            java.lang.Object r5 = r0.f9939g
            byte[] r7 = f8674c     // Catch:{ all -> 0x0380 }
            r8 = 21
            byte r9 = r7[r8]     // Catch:{ all -> 0x0380 }
            byte r8 = (byte) r9     // Catch:{ all -> 0x0380 }
            r9 = 111(0x6f, float:1.56E-43)
            byte r9 = r7[r9]     // Catch:{ all -> 0x0380 }
            int r9 = -r9
            short r9 = (short) r9     // Catch:{ all -> 0x0380 }
            r10 = 994(0x3e2, float:1.393E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0380 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0380 }
            m10677f(r8, r9, r10, r11)     // Catch:{ all -> 0x0380 }
            r8 = r11[r3]     // Catch:{ all -> 0x0380 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0380 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0380 }
            r10 = 134(0x86, float:1.88E-43)
            byte r9 = r7[r10]     // Catch:{ all -> 0x0380 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0380 }
            r11 = 21
            byte r7 = r7[r11]     // Catch:{ all -> 0x0380 }
            short r7 = (short) r7     // Catch:{ all -> 0x0380 }
            r12 = 517(0x205, float:7.24E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0380 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0380 }
            m10677f(r9, r7, r12, r14)     // Catch:{ all -> 0x0380 }
            r7 = r14[r3]     // Catch:{ all -> 0x0380 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0380 }
            r9 = 0
            java.lang.reflect.Method r7 = r8.getMethod(r7, r9)     // Catch:{ all -> 0x0380 }
            java.lang.Object r5 = r7.invoke(r5, r9)     // Catch:{ all -> 0x0380 }
            goto L_0x039f
        L_0x0380:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0388
            throw r1
        L_0x0388:
            throw r0
        L_0x0389:
            r1 = 2
            r9 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r0.f9934b = r6
            r0.mo9115d(r8)
            r0.mo9115d(r7)
            java.lang.Object r5 = r0.f9939g
            java.lang.String r5 = r5.toString()
        L_0x039f:
            r0.f9941i = r5
            r0.mo9115d(r15)
            goto L_0x042e
        L_0x03a6:
            r1 = 2
            r9 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r2 = 36
            goto L_0x04ce
        L_0x03b2:
            r16 = 109(0x6d, float:1.53E-43)
            r1 = r6
            goto L_0x0147
        L_0x03b7:
            r1 = 17
            r0.mo9115d(r1)
            java.lang.Object r0 = r0.f9939g
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x03c1:
            r16 = 109(0x6d, float:1.53E-43)
            r1 = r12
            goto L_0x0147
        L_0x03c6:
            r1 = 2
            r9 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            int r5 = f8675d
            goto L_0x0414
        L_0x03d1:
            r1 = 2
            r9 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r0.f9934b = r6
            r0.mo9115d(r8)
            r0.mo9115d(r14)
            int r5 = r0.f9935c
            f8672a = r5
            goto L_0x042e
        L_0x03e6:
            r1 = 2
            r9 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r0.mo9115d(r5)
            int r5 = r0.f9935c
            if (r5 != 0) goto L_0x04ce
            r2 = 52
            goto L_0x04ce
        L_0x03f9:
            r1 = 2
            r9 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r2 = 53
            goto L_0x04ce
        L_0x0405:
            r16 = 109(0x6d, float:1.53E-43)
            r1 = r14
            goto L_0x0147
        L_0x040a:
            r1 = 2
            r9 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            int r5 = f8672a
        L_0x0414:
            r0.f9934b = r5
            r0.mo9115d(r12)
            goto L_0x042e
        L_0x041a:
            r1 = 2
            r9 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r0.f9934b = r6
            r0.mo9115d(r8)
            r0.mo9115d(r14)
            int r5 = r0.f9935c
            f8675d = r5
        L_0x042e:
            r5 = r9
            goto L_0x04ce
        L_0x0431:
            r1 = 2
            r9 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r5 = 28
            r0.mo9115d(r5)
            int r5 = r0.f9935c
            if (r5 != 0) goto L_0x04ce
            r2 = 62
            goto L_0x04ce
        L_0x0446:
            r1 = 2
            r9 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r2 = 84
            goto L_0x04ce
        L_0x0452:
            r1 = 2
            r9 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r2 = 82
            goto L_0x04ce
        L_0x045e:
            r1 = 2
            r9 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r0.mo9115d(r5)
            int r5 = r0.f9935c
            if (r5 != 0) goto L_0x04ce
            r2 = 74
            goto L_0x04ce
        L_0x0470:
            r1 = 2
            r9 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r2 = 75
            goto L_0x04ce
        L_0x047b:
            r1 = 2
            r9 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r2 = 42
            goto L_0x04ce
        L_0x0486:
            r1 = 2
            r5 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r0.mo9115d(r9)
            int r2 = r0.f9935c
            if (r2 == 0) goto L_0x0498
            r2 = 45
            goto L_0x04ce
        L_0x0498:
            r2 = 23
            goto L_0x04ce
        L_0x049b:
            r1 = 2
            r5 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r2 = 76
            goto L_0x04ce
        L_0x04a6:
            r1 = 2
            r5 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r0.mo9115d(r9)
            int r2 = r0.f9935c
            r7 = 63
            r8 = 52
            if (r2 == r8) goto L_0x04c1
            r8 = 79
            if (r2 == r8) goto L_0x04be
            goto L_0x04c1
        L_0x04be:
            r2 = 38
            r7 = r2
        L_0x04c1:
            r1 = r7
            goto L_0x0147
        L_0x04c4:
            r1 = 2
            r5 = 0
            r10 = 134(0x86, float:1.88E-43)
            r11 = 21
            r16 = 109(0x6d, float:1.53E-43)
            r2 = 81
        L_0x04ce:
            r1 = r2
            goto L_0x0147
        L_0x04d1:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x04d9
            throw r1
        L_0x04d9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.JNI.m10671a(java.lang.reflect.Method):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x049a, code lost:
        r9 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04ed, code lost:
        r1.mo9115d(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0181, code lost:
        r1.mo9115d(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01a4, code lost:
        r1.mo9115d(31);
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03ed A[Catch:{ all -> 0x03de, all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03ee A[Catch:{ all -> 0x03de, all -> 0x03ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0468 A[Catch:{ all -> 0x045d, all -> 0x0480 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0469 A[Catch:{ all -> 0x045d, all -> 0x0480 }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0624  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0627  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m10673b(java.lang.Class<?> r19) {
        /*
            com.facetec.sdk.dj r1 = new com.facetec.sdk.dj
            r0 = r19
            r1.<init>(r0)
            byte[] r0 = f8674c
            r2 = 2
            byte r3 = r0[r2]
            int r3 = -r3
            byte r3 = (byte) r3
            r4 = r3 | 288(0x120, float:4.04E-43)
            short r4 = (short) r4
            int r5 = f8676e
            r6 = 3
            int r5 = r5 - r6
            short r5 = (short) r5
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            m10677f(r3, r4, r5, r8)
            r3 = 0
            r4 = r8[r3]
            java.lang.String r4 = (java.lang.String) r4
            r5 = 74
            byte r5 = (byte) r5
            r8 = 34
            byte r9 = r0[r8]
            short r9 = (short) r9
            r10 = r9 | 136(0x88, float:1.9E-43)
            short r10 = (short) r10
            java.lang.Object[] r11 = new java.lang.Object[r7]
            m10677f(r5, r9, r10, r11)
            r5 = r11[r3]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x063a }
            r9[r3] = r5     // Catch:{ all -> 0x063a }
            r5 = 21
            byte r10 = r0[r5]     // Catch:{ all -> 0x063a }
            byte r10 = (byte) r10     // Catch:{ all -> 0x063a }
            r11 = 134(0x86, float:1.88E-43)
            byte r12 = r0[r11]     // Catch:{ all -> 0x063a }
            short r12 = (short) r12     // Catch:{ all -> 0x063a }
            r13 = 865(0x361, float:1.212E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x063a }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x063a }
            m10677f(r10, r12, r13, r14)     // Catch:{ all -> 0x063a }
            r10 = r14[r3]     // Catch:{ all -> 0x063a }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x063a }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x063a }
            r12 = 260(0x104, float:3.64E-43)
            byte r12 = r0[r12]     // Catch:{ all -> 0x063a }
            byte r12 = (byte) r12     // Catch:{ all -> 0x063a }
            r14 = 60
            byte r15 = r0[r14]     // Catch:{ all -> 0x063a }
            short r15 = (short) r15     // Catch:{ all -> 0x063a }
            r14 = 513(0x201, float:7.19E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x063a }
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ all -> 0x063a }
            m10677f(r12, r15, r14, r6)     // Catch:{ all -> 0x063a }
            r6 = r6[r3]     // Catch:{ all -> 0x063a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x063a }
            java.lang.Class[] r12 = new java.lang.Class[r7]     // Catch:{ all -> 0x063a }
            byte r14 = r0[r5]     // Catch:{ all -> 0x063a }
            byte r14 = (byte) r14     // Catch:{ all -> 0x063a }
            byte r0 = r0[r11]     // Catch:{ all -> 0x063a }
            short r0 = (short) r0     // Catch:{ all -> 0x063a }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x063a }
            m10677f(r14, r0, r13, r15)     // Catch:{ all -> 0x063a }
            r0 = r15[r3]     // Catch:{ all -> 0x063a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x063a }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x063a }
            r12[r3] = r0     // Catch:{ all -> 0x063a }
            java.lang.reflect.Method r0 = r10.getMethod(r6, r12)     // Catch:{ all -> 0x063a }
            java.lang.Object r0 = r0.invoke(r4, r9)     // Catch:{ all -> 0x063a }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x063a }
            int r4 = r0.length
            int[] r4 = new int[r4]
            r6 = r3
        L_0x008e:
            int r9 = r0.length
            if (r6 >= r9) goto L_0x0147
            r9 = r0[r6]
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x013e }
            r10[r3] = r9     // Catch:{ all -> 0x013e }
            byte[] r9 = f8674c     // Catch:{ all -> 0x013e }
            byte r12 = r9[r5]     // Catch:{ all -> 0x013e }
            byte r12 = (byte) r12     // Catch:{ all -> 0x013e }
            r14 = 109(0x6d, float:1.53E-43)
            byte r14 = r9[r14]     // Catch:{ all -> 0x013e }
            short r14 = (short) r14     // Catch:{ all -> 0x013e }
            int r15 = f8676e     // Catch:{ all -> 0x013e }
            r2 = r15 & 1004(0x3ec, float:1.407E-42)
            short r2 = (short) r2     // Catch:{ all -> 0x013e }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x013e }
            m10677f(r12, r14, r2, r11)     // Catch:{ all -> 0x013e }
            r2 = r11[r3]     // Catch:{ all -> 0x013e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x013e }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x013e }
            byte r11 = r9[r8]     // Catch:{ all -> 0x013e }
            byte r11 = (byte) r11     // Catch:{ all -> 0x013e }
            r12 = 9
            byte r12 = r9[r12]     // Catch:{ all -> 0x013e }
            short r12 = (short) r12     // Catch:{ all -> 0x013e }
            r14 = 101(0x65, float:1.42E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x013e }
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x013e }
            m10677f(r11, r12, r14, r8)     // Catch:{ all -> 0x013e }
            r8 = r8[r3]     // Catch:{ all -> 0x013e }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x013e }
            java.lang.Class[] r11 = new java.lang.Class[r7]     // Catch:{ all -> 0x013e }
            byte r12 = r9[r5]     // Catch:{ all -> 0x013e }
            byte r12 = (byte) r12     // Catch:{ all -> 0x013e }
            r14 = 134(0x86, float:1.88E-43)
            byte r5 = r9[r14]     // Catch:{ all -> 0x013e }
            short r5 = (short) r5     // Catch:{ all -> 0x013e }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x013e }
            m10677f(r12, r5, r13, r14)     // Catch:{ all -> 0x013e }
            r5 = r14[r3]     // Catch:{ all -> 0x013e }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x013e }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x013e }
            r11[r3] = r5     // Catch:{ all -> 0x013e }
            java.lang.reflect.Method r2 = r2.getMethod(r8, r11)     // Catch:{ all -> 0x013e }
            r5 = 0
            java.lang.Object r2 = r2.invoke(r5, r10)     // Catch:{ all -> 0x013e }
            r8 = 21
            byte r10 = r9[r8]     // Catch:{ all -> 0x0135 }
            byte r8 = (byte) r10     // Catch:{ all -> 0x0135 }
            r10 = 109(0x6d, float:1.53E-43)
            byte r10 = r9[r10]     // Catch:{ all -> 0x0135 }
            short r10 = (short) r10     // Catch:{ all -> 0x0135 }
            r11 = r15 & 1004(0x3ec, float:1.407E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0135 }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x0135 }
            m10677f(r8, r10, r11, r12)     // Catch:{ all -> 0x0135 }
            r8 = r12[r3]     // Catch:{ all -> 0x0135 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0135 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0135 }
            r10 = 26
            byte r10 = r9[r10]     // Catch:{ all -> 0x0135 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0135 }
            r11 = 11
            byte r11 = r9[r11]     // Catch:{ all -> 0x0135 }
            short r11 = (short) r11     // Catch:{ all -> 0x0135 }
            byte r9 = r9[r3]     // Catch:{ all -> 0x0135 }
            int r9 = r9 + r7
            short r9 = (short) r9     // Catch:{ all -> 0x0135 }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x0135 }
            m10677f(r10, r11, r9, r12)     // Catch:{ all -> 0x0135 }
            r9 = r12[r3]     // Catch:{ all -> 0x0135 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0135 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r5)     // Catch:{ all -> 0x0135 }
            java.lang.Object r2 = r8.invoke(r2, r5)     // Catch:{ all -> 0x0135 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0135 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0135 }
            r4[r6] = r2
            int r6 = r6 + 1
            r2 = 2
            r5 = 21
            r8 = 34
            r11 = 134(0x86, float:1.88E-43)
            goto L_0x008e
        L_0x0135:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x013d
            throw r1
        L_0x013d:
            throw r0
        L_0x013e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0146
            throw r1
        L_0x0146:
            throw r0
        L_0x0147:
            r0 = r3
        L_0x0148:
            int r2 = r0 + 1
            r0 = r4[r0]     // Catch:{ all -> 0x0613 }
            int r0 = r1.mo9115d(r0)     // Catch:{ all -> 0x0613 }
            r9 = 828(0x33c, float:1.16E-42)
            r10 = 110(0x6e, float:1.54E-43)
            r11 = 5
            r14 = 10
            r15 = 16
            r5 = 14
            r6 = 31
            r12 = 4
            r8 = 6
            switch(r0) {
                case -48: goto L_0x0604;
                case -47: goto L_0x05e6;
                case -46: goto L_0x05da;
                case -45: goto L_0x05be;
                case -44: goto L_0x05ba;
                case -43: goto L_0x05a0;
                case -42: goto L_0x058d;
                case -41: goto L_0x0581;
                case -40: goto L_0x0575;
                case -39: goto L_0x0560;
                case -38: goto L_0x0547;
                case -37: goto L_0x0535;
                case -36: goto L_0x0529;
                case -35: goto L_0x051d;
                case -34: goto L_0x0508;
                case -33: goto L_0x04f2;
                case -32: goto L_0x04e1;
                case -31: goto L_0x04d5;
                case -30: goto L_0x04c9;
                case -29: goto L_0x04b6;
                case -28: goto L_0x049d;
                case -27: goto L_0x048b;
                case -26: goto L_0x0485;
                case -25: goto L_0x046f;
                case -24: goto L_0x03fc;
                case -23: goto L_0x036d;
                case -22: goto L_0x0359;
                case -21: goto L_0x0353;
                case -20: goto L_0x034f;
                case -19: goto L_0x0341;
                case -18: goto L_0x02c8;
                case -17: goto L_0x02c2;
                case -16: goto L_0x02be;
                case -15: goto L_0x02ba;
                case -14: goto L_0x02af;
                case -13: goto L_0x029b;
                case -12: goto L_0x0297;
                case -11: goto L_0x0285;
                case -10: goto L_0x0215;
                case -9: goto L_0x0202;
                case -8: goto L_0x01ad;
                case -7: goto L_0x01a8;
                case -6: goto L_0x0192;
                case -5: goto L_0x0190;
                case -4: goto L_0x018e;
                case -3: goto L_0x0185;
                case -2: goto L_0x016f;
                case -1: goto L_0x016c;
                default: goto L_0x0162;
            }     // Catch:{ all -> 0x0613 }
        L_0x0162:
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            goto L_0x0610
        L_0x016c:
            r0 = 37
            goto L_0x0148
        L_0x016f:
            r1.f9934b = r7     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r8)     // Catch:{ all -> 0x0613 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0613 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x0613 }
            boolean r0 = r0.isArray()     // Catch:{ all -> 0x0613 }
            r1.f9934b = r0     // Catch:{ all -> 0x0613 }
        L_0x0181:
            r1.mo9115d(r14)     // Catch:{ all -> 0x0613 }
            goto L_0x0162
        L_0x0185:
            r1.mo9115d(r15)     // Catch:{ all -> 0x0613 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x0613 }
            if (r0 != 0) goto L_0x0610
            r0 = r11
            goto L_0x0148
        L_0x018e:
            r0 = r8
            goto L_0x0148
        L_0x0190:
            r0 = r15
            goto L_0x0148
        L_0x0192:
            r1.f9934b = r7     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r8)     // Catch:{ all -> 0x0613 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0613 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x0613 }
            java.lang.Class r0 = r0.getComponentType()     // Catch:{ all -> 0x0613 }
            r1.f9941i = r0     // Catch:{ all -> 0x0613 }
        L_0x01a4:
            r1.mo9115d(r6)     // Catch:{ all -> 0x0613 }
            goto L_0x0162
        L_0x01a8:
            java.lang.String r0 = "["
            r1.f9941i = r0     // Catch:{ all -> 0x0613 }
            goto L_0x01a4
        L_0x01ad:
            r1.f9934b = r7     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r8)     // Catch:{ all -> 0x0613 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0613 }
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ all -> 0x01f9 }
            r5[r3] = r0     // Catch:{ all -> 0x01f9 }
            byte[] r0 = f8674c     // Catch:{ all -> 0x01f9 }
            r8 = 21
            byte r11 = r0[r8]     // Catch:{ all -> 0x01f9 }
            byte r8 = (byte) r11     // Catch:{ all -> 0x01f9 }
            byte r10 = r0[r10]     // Catch:{ all -> 0x01f9 }
            short r10 = (short) r10     // Catch:{ all -> 0x01f9 }
            short r9 = (short) r9     // Catch:{ all -> 0x01f9 }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x01f9 }
            m10677f(r8, r10, r9, r11)     // Catch:{ all -> 0x01f9 }
            r8 = r11[r3]     // Catch:{ all -> 0x01f9 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01f9 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x01f9 }
            java.lang.Class[] r9 = new java.lang.Class[r7]     // Catch:{ all -> 0x01f9 }
            r10 = 21
            byte r11 = r0[r10]     // Catch:{ all -> 0x01f9 }
            byte r10 = (byte) r11     // Catch:{ all -> 0x01f9 }
            r11 = 134(0x86, float:1.88E-43)
            byte r0 = r0[r11]     // Catch:{ all -> 0x01f9 }
            short r0 = (short) r0     // Catch:{ all -> 0x01f9 }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x01f9 }
            m10677f(r10, r0, r13, r11)     // Catch:{ all -> 0x01f9 }
            r0 = r11[r3]     // Catch:{ all -> 0x01f9 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01f9 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x01f9 }
            r9[r3] = r0     // Catch:{ all -> 0x01f9 }
            java.lang.reflect.Constructor r0 = r8.getDeclaredConstructor(r9)     // Catch:{ all -> 0x01f9 }
            java.lang.Object r0 = r0.newInstance(r5)     // Catch:{ all -> 0x01f9 }
            r1.f9941i = r0     // Catch:{ all -> 0x0613 }
            goto L_0x01a4
        L_0x01f9:
            r0 = move-exception
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x0613 }
            if (r5 == 0) goto L_0x0201
            throw r5     // Catch:{ all -> 0x0613 }
        L_0x0201:
            throw r0     // Catch:{ all -> 0x0613 }
        L_0x0202:
            r1.f9934b = r7     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r8)     // Catch:{ all -> 0x0613 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0613 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x0613 }
            java.lang.String r0 = m10673b(r0)     // Catch:{ all -> 0x0613 }
            r1.f9941i = r0     // Catch:{ all -> 0x0613 }
            goto L_0x01a4
        L_0x0215:
            r5 = 2
            r1.f9934b = r5     // Catch:{ all -> 0x033d }
            r1.mo9115d(r12)     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r8)     // Catch:{ all -> 0x0613 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r8)     // Catch:{ all -> 0x0613 }
            java.lang.Object r5 = r1.f9939g     // Catch:{ all -> 0x0613 }
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x027c }
            r8[r3] = r5     // Catch:{ all -> 0x027c }
            byte[] r5 = f8674c     // Catch:{ all -> 0x027c }
            r12 = 21
            byte r14 = r5[r12]     // Catch:{ all -> 0x027c }
            byte r12 = (byte) r14     // Catch:{ all -> 0x027c }
            byte r10 = r5[r10]     // Catch:{ all -> 0x027c }
            short r10 = (short) r10     // Catch:{ all -> 0x027c }
            short r9 = (short) r9     // Catch:{ all -> 0x027c }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x027c }
            m10677f(r12, r10, r9, r14)     // Catch:{ all -> 0x027c }
            r9 = r14[r3]     // Catch:{ all -> 0x027c }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x027c }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x027c }
            r10 = 106(0x6a, float:1.49E-43)
            byte r10 = r5[r10]     // Catch:{ all -> 0x027c }
            byte r10 = (byte) r10     // Catch:{ all -> 0x027c }
            byte r11 = r5[r11]     // Catch:{ all -> 0x027c }
            short r11 = (short) r11     // Catch:{ all -> 0x027c }
            r12 = 1017(0x3f9, float:1.425E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x027c }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x027c }
            m10677f(r10, r11, r12, r14)     // Catch:{ all -> 0x027c }
            r10 = r14[r3]     // Catch:{ all -> 0x027c }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x027c }
            java.lang.Class[] r11 = new java.lang.Class[r7]     // Catch:{ all -> 0x027c }
            r12 = 21
            byte r14 = r5[r12]     // Catch:{ all -> 0x027c }
            byte r12 = (byte) r14     // Catch:{ all -> 0x027c }
            r14 = 134(0x86, float:1.88E-43)
            byte r5 = r5[r14]     // Catch:{ all -> 0x027c }
            short r5 = (short) r5     // Catch:{ all -> 0x027c }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x027c }
            m10677f(r12, r5, r13, r14)     // Catch:{ all -> 0x027c }
            r5 = r14[r3]     // Catch:{ all -> 0x027c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x027c }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x027c }
            r11[r3] = r5     // Catch:{ all -> 0x027c }
            java.lang.reflect.Method r5 = r9.getMethod(r10, r11)     // Catch:{ all -> 0x027c }
            java.lang.Object r0 = r5.invoke(r0, r8)     // Catch:{ all -> 0x027c }
            r1.f9941i = r0     // Catch:{ all -> 0x0613 }
            goto L_0x01a4
        L_0x027c:
            r0 = move-exception
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x0613 }
            if (r5 == 0) goto L_0x0284
            throw r5     // Catch:{ all -> 0x0613 }
        L_0x0284:
            throw r0     // Catch:{ all -> 0x0613 }
        L_0x0285:
            r1.f9934b = r7     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r8)     // Catch:{ all -> 0x0613 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0613 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0613 }
            r1.f9941i = r0     // Catch:{ all -> 0x0613 }
            goto L_0x01a4
        L_0x0297:
            r0 = 45
            goto L_0x0148
        L_0x029b:
            r1.f9934b = r7     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r8)     // Catch:{ all -> 0x0613 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0613 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x0613 }
            boolean r0 = r0.isPrimitive()     // Catch:{ all -> 0x0613 }
            r1.f9934b = r0     // Catch:{ all -> 0x0613 }
            goto L_0x0181
        L_0x02af:
            r1.mo9115d(r15)     // Catch:{ all -> 0x0613 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x0613 }
            if (r0 != 0) goto L_0x0610
            r0 = 20
            goto L_0x0148
        L_0x02ba:
            r0 = 102(0x66, float:1.43E-43)
            goto L_0x0148
        L_0x02be:
            r0 = 100
            goto L_0x0148
        L_0x02c2:
            java.util.Map<java.lang.Object, java.lang.String> r0 = f8673b     // Catch:{ all -> 0x0613 }
            r1.f9941i = r0     // Catch:{ all -> 0x0613 }
            goto L_0x01a4
        L_0x02c8:
            r5 = 2
            r1.f9934b = r5     // Catch:{ all -> 0x033d }
            r1.mo9115d(r12)     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r8)     // Catch:{ all -> 0x0613 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r8)     // Catch:{ all -> 0x0613 }
            java.lang.Object r5 = r1.f9939g     // Catch:{ all -> 0x0613 }
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0334 }
            r8[r3] = r5     // Catch:{ all -> 0x0334 }
            byte[] r5 = f8674c     // Catch:{ all -> 0x0334 }
            r9 = 21
            byte r10 = r5[r9]     // Catch:{ all -> 0x0334 }
            byte r9 = (byte) r10     // Catch:{ all -> 0x0334 }
            short r10 = (short) r9     // Catch:{ all -> 0x0334 }
            r11 = 529(0x211, float:7.41E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x0334 }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x0334 }
            m10677f(r9, r10, r11, r12)     // Catch:{ all -> 0x0334 }
            r9 = r12[r3]     // Catch:{ all -> 0x0334 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0334 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0334 }
            r10 = 134(0x86, float:1.88E-43)
            byte r11 = r5[r10]     // Catch:{ all -> 0x0334 }
            byte r10 = (byte) r11     // Catch:{ all -> 0x0334 }
            r11 = 100
            byte r11 = r5[r11]     // Catch:{ all -> 0x0334 }
            short r11 = (short) r11     // Catch:{ all -> 0x0334 }
            r12 = 541(0x21d, float:7.58E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0334 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0334 }
            m10677f(r10, r11, r12, r14)     // Catch:{ all -> 0x0334 }
            r10 = r14[r3]     // Catch:{ all -> 0x0334 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0334 }
            java.lang.Class[] r11 = new java.lang.Class[r7]     // Catch:{ all -> 0x0334 }
            r12 = 21
            byte r14 = r5[r12]     // Catch:{ all -> 0x0334 }
            byte r12 = (byte) r14     // Catch:{ all -> 0x0334 }
            r14 = 134(0x86, float:1.88E-43)
            byte r5 = r5[r14]     // Catch:{ all -> 0x0334 }
            short r5 = (short) r5     // Catch:{ all -> 0x0334 }
            r14 = 850(0x352, float:1.191E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0334 }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x0334 }
            m10677f(r12, r5, r14, r15)     // Catch:{ all -> 0x0334 }
            r5 = r15[r3]     // Catch:{ all -> 0x0334 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0334 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0334 }
            r11[r3] = r5     // Catch:{ all -> 0x0334 }
            java.lang.reflect.Method r5 = r9.getMethod(r10, r11)     // Catch:{ all -> 0x0334 }
            java.lang.Object r0 = r5.invoke(r0, r8)     // Catch:{ all -> 0x0334 }
            r1.f9941i = r0     // Catch:{ all -> 0x0613 }
            goto L_0x01a4
        L_0x0334:
            r0 = move-exception
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x0613 }
            if (r5 == 0) goto L_0x033c
            throw r5     // Catch:{ all -> 0x0613 }
        L_0x033c:
            throw r0     // Catch:{ all -> 0x0613 }
        L_0x033d:
            r0 = move-exception
            r6 = r5
            goto L_0x0615
        L_0x0341:
            r1.f9934b = r7     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r8)     // Catch:{ all -> 0x0613 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0613 }
            r1.f9941i = r0     // Catch:{ all -> 0x0613 }
            goto L_0x01a4
        L_0x034f:
            r0 = 41
            goto L_0x0148
        L_0x0353:
            java.lang.String r0 = "L"
            r1.f9941i = r0     // Catch:{ all -> 0x0613 }
            goto L_0x01a4
        L_0x0359:
            r1.f9934b = r7     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x0613 }
            r1.mo9115d(r8)     // Catch:{ all -> 0x0613 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0613 }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x0613 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0613 }
            r1.f9941i = r0     // Catch:{ all -> 0x0613 }
            goto L_0x01a4
        L_0x036d:
            r15 = 3
            r1.f9934b = r15     // Catch:{ all -> 0x03f1 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x03f1 }
            r1.mo9115d(r8)     // Catch:{ all -> 0x03f1 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x03f1 }
            r1.mo9115d(r5)     // Catch:{ all -> 0x03f1 }
            int r8 = r1.f9935c     // Catch:{ all -> 0x03f1 }
            char r8 = (char) r8     // Catch:{ all -> 0x03f1 }
            r1.mo9115d(r5)     // Catch:{ all -> 0x03f1 }
            int r5 = r1.f9935c     // Catch:{ all -> 0x03f1 }
            char r5 = (char) r5
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x03e2 }
            java.lang.Character r5 = java.lang.Character.valueOf(r5)     // Catch:{ all -> 0x03e2 }
            r10[r7] = r5     // Catch:{ all -> 0x03e2 }
            java.lang.Character r5 = java.lang.Character.valueOf(r8)     // Catch:{ all -> 0x03e2 }
            r10[r3] = r5     // Catch:{ all -> 0x03e2 }
            byte[] r5 = f8674c     // Catch:{ all -> 0x03e2 }
            r8 = 21
            byte r9 = r5[r8]     // Catch:{ all -> 0x03e2 }
            byte r8 = (byte) r9
            r16 = 134(0x86, float:1.88E-43)
            byte r9 = r5[r16]     // Catch:{ all -> 0x03e0 }
            short r9 = (short) r9     // Catch:{ all -> 0x03e0 }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x03e0 }
            m10677f(r8, r9, r13, r11)     // Catch:{ all -> 0x03e0 }
            r8 = r11[r3]     // Catch:{ all -> 0x03e0 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x03e0 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x03e0 }
            r18 = 60
            byte r9 = r5[r18]     // Catch:{ all -> 0x03de }
            byte r9 = (byte) r9     // Catch:{ all -> 0x03de }
            r11 = 9
            byte r5 = r5[r11]     // Catch:{ all -> 0x03de }
            short r5 = (short) r5     // Catch:{ all -> 0x03de }
            r11 = 114(0x72, float:1.6E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x03de }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x03de }
            m10677f(r9, r5, r11, r12)     // Catch:{ all -> 0x03de }
            r5 = r12[r3]     // Catch:{ all -> 0x03de }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x03de }
            r9 = 2
            java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch:{ all -> 0x03de }
            java.lang.Class r9 = java.lang.Character.TYPE     // Catch:{ all -> 0x03de }
            r11[r3] = r9     // Catch:{ all -> 0x03de }
            r11[r7] = r9     // Catch:{ all -> 0x03de }
            java.lang.reflect.Method r5 = r8.getMethod(r5, r11)     // Catch:{ all -> 0x03de }
            java.lang.Object r0 = r5.invoke(r0, r10)     // Catch:{ all -> 0x03de }
            r1.f9941i = r0     // Catch:{ all -> 0x03ef }
            r1.mo9115d(r6)     // Catch:{ all -> 0x03ef }
            r9 = r15
            r6 = 2
            r17 = 21
            goto L_0x0610
        L_0x03de:
            r0 = move-exception
            goto L_0x03e7
        L_0x03e0:
            r0 = move-exception
            goto L_0x03e5
        L_0x03e2:
            r0 = move-exception
            r16 = 134(0x86, float:1.88E-43)
        L_0x03e5:
            r18 = 60
        L_0x03e7:
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x03ef }
            if (r5 == 0) goto L_0x03ee
            throw r5     // Catch:{ all -> 0x03ef }
        L_0x03ee:
            throw r0     // Catch:{ all -> 0x03ef }
        L_0x03ef:
            r0 = move-exception
            goto L_0x03f6
        L_0x03f1:
            r0 = move-exception
            r16 = 134(0x86, float:1.88E-43)
            r18 = 60
        L_0x03f6:
            r9 = r15
            r6 = 2
            r17 = 21
            goto L_0x061c
        L_0x03fc:
            r14 = 2
            r15 = 3
            r16 = 134(0x86, float:1.88E-43)
            r18 = 60
            r1.f9934b = r14     // Catch:{ all -> 0x046a }
            r1.mo9115d(r12)     // Catch:{ all -> 0x046a }
            r1.mo9115d(r8)     // Catch:{ all -> 0x046a }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x046a }
            r1.mo9115d(r5)     // Catch:{ all -> 0x046a }
            int r5 = r1.f9935c     // Catch:{ all -> 0x046a }
            char r5 = (char) r5
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x045f }
            java.lang.Character r5 = java.lang.Character.valueOf(r5)     // Catch:{ all -> 0x045f }
            r8[r3] = r5     // Catch:{ all -> 0x045f }
            byte[] r5 = f8674c     // Catch:{ all -> 0x045f }
            r17 = 21
            byte r12 = r5[r17]     // Catch:{ all -> 0x045d }
            byte r12 = (byte) r12     // Catch:{ all -> 0x045d }
            byte r10 = r5[r10]     // Catch:{ all -> 0x045d }
            short r10 = (short) r10     // Catch:{ all -> 0x045d }
            short r9 = (short) r9     // Catch:{ all -> 0x045d }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x045d }
            m10677f(r12, r10, r9, r14)     // Catch:{ all -> 0x045d }
            r9 = r14[r3]     // Catch:{ all -> 0x045d }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x045d }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x045d }
            r10 = 106(0x6a, float:1.49E-43)
            byte r10 = r5[r10]     // Catch:{ all -> 0x045d }
            byte r10 = (byte) r10     // Catch:{ all -> 0x045d }
            byte r5 = r5[r11]     // Catch:{ all -> 0x045d }
            short r5 = (short) r5     // Catch:{ all -> 0x045d }
            r11 = 1017(0x3f9, float:1.425E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x045d }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x045d }
            m10677f(r10, r5, r11, r12)     // Catch:{ all -> 0x045d }
            r5 = r12[r3]     // Catch:{ all -> 0x045d }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x045d }
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch:{ all -> 0x045d }
            java.lang.Class r11 = java.lang.Character.TYPE     // Catch:{ all -> 0x045d }
            r10[r3] = r11     // Catch:{ all -> 0x045d }
            java.lang.reflect.Method r5 = r9.getMethod(r5, r10)     // Catch:{ all -> 0x045d }
            java.lang.Object r0 = r5.invoke(r0, r8)     // Catch:{ all -> 0x045d }
            r1.f9941i = r0     // Catch:{ all -> 0x0480 }
            r1.mo9115d(r6)     // Catch:{ all -> 0x0480 }
            r9 = r15
            r6 = 2
            goto L_0x0610
        L_0x045d:
            r0 = move-exception
            goto L_0x0462
        L_0x045f:
            r0 = move-exception
            r17 = 21
        L_0x0462:
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x0480 }
            if (r5 == 0) goto L_0x0469
            throw r5     // Catch:{ all -> 0x0480 }
        L_0x0469:
            throw r0     // Catch:{ all -> 0x0480 }
        L_0x046a:
            r0 = move-exception
            r17 = 21
            r6 = r14
            goto L_0x04b3
        L_0x046f:
            r15 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r0 = 17
            r1.mo9115d(r0)     // Catch:{ all -> 0x0480 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0480 }
            return r0
        L_0x0480:
            r0 = move-exception
            r9 = r15
            r6 = 2
            goto L_0x061c
        L_0x0485:
            r17 = 21
            r0 = 71
            goto L_0x0148
        L_0x048b:
            r6 = 2
            r15 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            int r0 = f8675d     // Catch:{ all -> 0x04b2 }
            r1.f9934b = r0     // Catch:{ all -> 0x04b2 }
            r1.mo9115d(r14)     // Catch:{ all -> 0x04b2 }
        L_0x049a:
            r9 = r15
            goto L_0x0610
        L_0x049d:
            r6 = 2
            r15 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r1.f9934b = r7     // Catch:{ all -> 0x04b2 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x04b2 }
            r1.mo9115d(r5)     // Catch:{ all -> 0x04b2 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x04b2 }
            f8672a = r0     // Catch:{ all -> 0x04b2 }
            goto L_0x049a
        L_0x04b2:
            r0 = move-exception
        L_0x04b3:
            r9 = r15
            goto L_0x061c
        L_0x04b6:
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r1.mo9115d(r15)     // Catch:{ all -> 0x0602 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x0602 }
            if (r0 != 0) goto L_0x0610
            r0 = 52
            goto L_0x0148
        L_0x04c9:
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r0 = 53
            goto L_0x0148
        L_0x04d5:
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r0 = 43
            goto L_0x0148
        L_0x04e1:
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            int r0 = f8672a     // Catch:{ all -> 0x0602 }
            r1.f9934b = r0     // Catch:{ all -> 0x0602 }
        L_0x04ed:
            r1.mo9115d(r14)     // Catch:{ all -> 0x0602 }
            goto L_0x0610
        L_0x04f2:
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r1.f9934b = r7     // Catch:{ all -> 0x0602 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x0602 }
            r1.mo9115d(r5)     // Catch:{ all -> 0x0602 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x0602 }
            f8675d = r0     // Catch:{ all -> 0x0602 }
            goto L_0x0610
        L_0x0508:
            r0 = 28
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r1.mo9115d(r0)     // Catch:{ all -> 0x0602 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x0602 }
            if (r0 != 0) goto L_0x0610
            r0 = 61
            goto L_0x0148
        L_0x051d:
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r0 = 97
            goto L_0x0148
        L_0x0529:
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r0 = 95
            goto L_0x0148
        L_0x0535:
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r0 = 17
            r1.mo9115d(r0)     // Catch:{ all -> 0x0602 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0602 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0602 }
            throw r0     // Catch:{ all -> 0x0602 }
        L_0x0547:
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r1.f9934b = r7     // Catch:{ all -> 0x0602 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x0602 }
            r1.mo9115d(r8)     // Catch:{ all -> 0x0602 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0602 }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x0602 }
            r1.f9934b = r0     // Catch:{ all -> 0x0602 }
            goto L_0x04ed
        L_0x0560:
            r0 = 28
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r1.mo9115d(r0)     // Catch:{ all -> 0x0602 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x0602 }
            if (r0 != 0) goto L_0x0610
            r0 = 79
            goto L_0x0148
        L_0x0575:
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r0 = 92
            goto L_0x0148
        L_0x0581:
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r0 = 90
            goto L_0x0148
        L_0x058d:
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r1.mo9115d(r15)     // Catch:{ all -> 0x0602 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x0602 }
            if (r0 != 0) goto L_0x0610
            r0 = 88
            goto L_0x0148
        L_0x05a0:
            r0 = 20
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r1.mo9115d(r0)     // Catch:{ all -> 0x0602 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x0602 }
            r2 = 8
            if (r0 == r2) goto L_0x05b6
            r0 = r7
            goto L_0x0148
        L_0x05b6:
            r0 = 81
            goto L_0x0148
        L_0x05ba:
            r0 = 89
            goto L_0x0148
        L_0x05be:
            r0 = 20
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r1.mo9115d(r0)     // Catch:{ all -> 0x0602 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x0602 }
            if (r0 == 0) goto L_0x05d6
            if (r0 == r7) goto L_0x05d2
            goto L_0x05d6
        L_0x05d2:
            r8 = 63
            goto L_0x018e
        L_0x05d6:
            r0 = r17
            goto L_0x0148
        L_0x05da:
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r0 = 94
            goto L_0x0148
        L_0x05e6:
            r0 = 20
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r1.mo9115d(r0)     // Catch:{ all -> 0x0602 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x0602 }
            if (r0 == 0) goto L_0x05fe
            if (r0 == r7) goto L_0x05fa
            goto L_0x05fe
        L_0x05fa:
            r0 = 26
            goto L_0x0148
        L_0x05fe:
            r0 = 54
            goto L_0x0148
        L_0x0602:
            r0 = move-exception
            goto L_0x061c
        L_0x0604:
            r6 = 2
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
            r0 = 99
            goto L_0x0148
        L_0x0610:
            r0 = r2
            goto L_0x0148
        L_0x0613:
            r0 = move-exception
            r6 = 2
        L_0x0615:
            r9 = 3
            r16 = 134(0x86, float:1.88E-43)
            r17 = 21
            r18 = 60
        L_0x061c:
            r5 = 67
            if (r2 < r5) goto L_0x0627
            r5 = 71
            if (r2 > r5) goto L_0x0627
            r2 = 62
            goto L_0x0631
        L_0x0627:
            r5 = 83
            if (r2 < r5) goto L_0x0639
            r5 = 89
            if (r2 > r5) goto L_0x0639
            r2 = 80
        L_0x0631:
            r1.f9941i = r0
            r0 = 23
            r1.mo9115d(r0)
            goto L_0x0610
        L_0x0639:
            throw r0
        L_0x063a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0642
            throw r1
        L_0x0642:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.JNI.m10673b(java.lang.Class):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0187, code lost:
        r1.mo9115d(10);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m10674c(java.lang.Class<com.facetec.sdk.C2885cd> r16, java.lang.Class<com.facetec.sdk.C2954dn> r17) {
        /*
            com.facetec.sdk.dj r1 = new com.facetec.sdk.dj
            r0 = r16
            r2 = r17
            r1.<init>((java.lang.Object) r0, (java.lang.Object) r2)
            byte[] r0 = f8674c
            r2 = 2
            byte r3 = r0[r2]
            int r3 = -r3
            byte r3 = (byte) r3
            r4 = 101(0x65, float:1.42E-43)
            short r4 = (short) r4
            r5 = 1022(0x3fe, float:1.432E-42)
            short r5 = (short) r5
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            m10677f(r3, r4, r5, r7)
            r3 = 0
            r5 = r7[r3]
            java.lang.String r5 = (java.lang.String) r5
            r7 = 74
            byte r7 = (byte) r7
            r8 = 34
            byte r9 = r0[r8]
            short r9 = (short) r9
            r10 = r9 | 136(0x88, float:1.9E-43)
            short r10 = (short) r10
            java.lang.Object[] r11 = new java.lang.Object[r6]
            m10677f(r7, r9, r10, r11)
            r7 = r11[r3]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x01f8 }
            r9[r3] = r7     // Catch:{ all -> 0x01f8 }
            r7 = 21
            byte r10 = r0[r7]     // Catch:{ all -> 0x01f8 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x01f8 }
            r11 = 134(0x86, float:1.88E-43)
            byte r12 = r0[r11]     // Catch:{ all -> 0x01f8 }
            short r12 = (short) r12     // Catch:{ all -> 0x01f8 }
            r13 = 865(0x361, float:1.212E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x01f8 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x01f8 }
            m10677f(r10, r12, r13, r14)     // Catch:{ all -> 0x01f8 }
            r10 = r14[r3]     // Catch:{ all -> 0x01f8 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01f8 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x01f8 }
            r12 = 260(0x104, float:3.64E-43)
            byte r12 = r0[r12]     // Catch:{ all -> 0x01f8 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x01f8 }
            r14 = 60
            byte r14 = r0[r14]     // Catch:{ all -> 0x01f8 }
            short r14 = (short) r14     // Catch:{ all -> 0x01f8 }
            r15 = 513(0x201, float:7.19E-43)
            short r15 = (short) r15     // Catch:{ all -> 0x01f8 }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ all -> 0x01f8 }
            m10677f(r12, r14, r15, r2)     // Catch:{ all -> 0x01f8 }
            r2 = r2[r3]     // Catch:{ all -> 0x01f8 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01f8 }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x01f8 }
            byte r14 = r0[r7]     // Catch:{ all -> 0x01f8 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x01f8 }
            byte r0 = r0[r11]     // Catch:{ all -> 0x01f8 }
            short r0 = (short) r0     // Catch:{ all -> 0x01f8 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x01f8 }
            m10677f(r14, r0, r13, r15)     // Catch:{ all -> 0x01f8 }
            r0 = r15[r3]     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01f8 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x01f8 }
            r12[r3] = r0     // Catch:{ all -> 0x01f8 }
            java.lang.reflect.Method r0 = r10.getMethod(r2, r12)     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r0.invoke(r5, r9)     // Catch:{ all -> 0x01f8 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x01f8 }
            int r2 = r0.length
            int[] r2 = new int[r2]
            r5 = r3
        L_0x008e:
            int r9 = r0.length
            if (r5 >= r9) goto L_0x0148
            r9 = r0[r5]
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x013f }
            r10[r3] = r9     // Catch:{ all -> 0x013f }
            byte[] r9 = f8674c     // Catch:{ all -> 0x013f }
            byte r12 = r9[r7]     // Catch:{ all -> 0x013f }
            byte r12 = (byte) r12     // Catch:{ all -> 0x013f }
            r14 = 109(0x6d, float:1.53E-43)
            byte r15 = r9[r14]     // Catch:{ all -> 0x013f }
            short r15 = (short) r15     // Catch:{ all -> 0x013f }
            int r14 = f8676e     // Catch:{ all -> 0x013f }
            r11 = r14 & 1004(0x3ec, float:1.407E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x013f }
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x013f }
            m10677f(r12, r15, r11, r7)     // Catch:{ all -> 0x013f }
            r7 = r7[r3]     // Catch:{ all -> 0x013f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x013f }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x013f }
            byte r11 = r9[r8]     // Catch:{ all -> 0x013f }
            byte r11 = (byte) r11     // Catch:{ all -> 0x013f }
            r12 = 9
            byte r12 = r9[r12]     // Catch:{ all -> 0x013f }
            short r12 = (short) r12     // Catch:{ all -> 0x013f }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x013f }
            m10677f(r11, r12, r4, r15)     // Catch:{ all -> 0x013f }
            r11 = r15[r3]     // Catch:{ all -> 0x013f }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x013f }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x013f }
            r15 = 21
            byte r8 = r9[r15]     // Catch:{ all -> 0x013f }
            byte r8 = (byte) r8     // Catch:{ all -> 0x013f }
            r15 = 134(0x86, float:1.88E-43)
            byte r3 = r9[r15]     // Catch:{ all -> 0x013f }
            short r3 = (short) r3     // Catch:{ all -> 0x013f }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x013f }
            m10677f(r8, r3, r13, r15)     // Catch:{ all -> 0x013f }
            r3 = 0
            r8 = r15[r3]     // Catch:{ all -> 0x013f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x013f }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x013f }
            r12[r3] = r8     // Catch:{ all -> 0x013f }
            java.lang.reflect.Method r3 = r7.getMethod(r11, r12)     // Catch:{ all -> 0x013f }
            r7 = 0
            java.lang.Object r3 = r3.invoke(r7, r10)     // Catch:{ all -> 0x013f }
            r8 = 21
            byte r10 = r9[r8]     // Catch:{ all -> 0x0136 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0136 }
            r11 = 109(0x6d, float:1.53E-43)
            byte r11 = r9[r11]     // Catch:{ all -> 0x0136 }
            short r11 = (short) r11     // Catch:{ all -> 0x0136 }
            r12 = r14 & 1004(0x3ec, float:1.407E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0136 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0136 }
            m10677f(r10, r11, r12, r14)     // Catch:{ all -> 0x0136 }
            r10 = 0
            r11 = r14[r10]     // Catch:{ all -> 0x0136 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0136 }
            java.lang.Class r10 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0136 }
            r11 = 26
            byte r11 = r9[r11]     // Catch:{ all -> 0x0136 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0136 }
            r12 = 11
            byte r12 = r9[r12]     // Catch:{ all -> 0x0136 }
            short r12 = (short) r12     // Catch:{ all -> 0x0136 }
            r14 = 0
            byte r9 = r9[r14]     // Catch:{ all -> 0x0136 }
            int r9 = r9 + r6
            short r9 = (short) r9     // Catch:{ all -> 0x0136 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x0136 }
            m10677f(r11, r12, r9, r15)     // Catch:{ all -> 0x0136 }
            r9 = r15[r14]     // Catch:{ all -> 0x0136 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0136 }
            java.lang.reflect.Method r9 = r10.getMethod(r9, r7)     // Catch:{ all -> 0x0136 }
            java.lang.Object r3 = r9.invoke(r3, r7)     // Catch:{ all -> 0x0136 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0136 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0136 }
            r2[r5] = r3
            int r5 = r5 + 1
            r7 = r8
            r3 = r14
            r8 = 34
            r11 = 134(0x86, float:1.88E-43)
            goto L_0x008e
        L_0x0136:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x013e
            throw r1
        L_0x013e:
            throw r0
        L_0x013f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0147
            throw r1
        L_0x0147:
            throw r0
        L_0x0148:
            r14 = r3
            r8 = r7
        L_0x014a:
            int r4 = r3 + 1
            r5 = 20
            r7 = 28
            r0 = r2[r3]     // Catch:{ all -> 0x01e5 }
            int r0 = r1.mo9115d(r0)     // Catch:{ all -> 0x01e5 }
            r3 = 6
            r9 = 4
            r10 = 10
            switch(r0) {
                case -14: goto L_0x01df;
                case -13: goto L_0x01cc;
                case -12: goto L_0x01ba;
                case -11: goto L_0x01af;
                case -10: goto L_0x01ab;
                case -9: goto L_0x01a7;
                case -8: goto L_0x019b;
                case -7: goto L_0x018b;
                case -6: goto L_0x0182;
                case -5: goto L_0x0181;
                case -4: goto L_0x017f;
                case -3: goto L_0x017b;
                case -2: goto L_0x0162;
                case -1: goto L_0x0160;
                default: goto L_0x015d;
            }
        L_0x015d:
            r11 = 2
            goto L_0x01e2
        L_0x0160:
            r3 = 5
            goto L_0x014a
        L_0x0162:
            r11 = 2
            r1.f9934b = r11     // Catch:{ all -> 0x01dd }
            r1.mo9115d(r9)     // Catch:{ all -> 0x01dd }
            r1.mo9115d(r3)     // Catch:{ all -> 0x01dd }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x01dd }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x01dd }
            r1.mo9115d(r3)     // Catch:{ all -> 0x01dd }
            java.lang.Object r3 = r1.f9939g     // Catch:{ all -> 0x01dd }
            java.lang.Class r3 = (java.lang.Class) r3     // Catch:{ all -> 0x01dd }
            fnm(r0, r3)     // Catch:{ all -> 0x01dd }
            goto L_0x01e2
        L_0x017b:
            r11 = 2
            r3 = 8
            goto L_0x014a
        L_0x017f:
            r3 = r10
            goto L_0x014a
        L_0x0181:
            return
        L_0x0182:
            r11 = 2
            int r0 = f8672a     // Catch:{ all -> 0x01dd }
            r1.f9934b = r0     // Catch:{ all -> 0x01dd }
        L_0x0187:
            r1.mo9115d(r10)     // Catch:{ all -> 0x01dd }
            goto L_0x01e2
        L_0x018b:
            r11 = 2
            r1.f9934b = r6     // Catch:{ all -> 0x01dd }
            r1.mo9115d(r9)     // Catch:{ all -> 0x01dd }
            r0 = 14
            r1.mo9115d(r0)     // Catch:{ all -> 0x01dd }
            int r0 = r1.f9935c     // Catch:{ all -> 0x01dd }
            f8675d = r0     // Catch:{ all -> 0x01dd }
            goto L_0x01e2
        L_0x019b:
            r11 = 2
            r1.mo9115d(r7)     // Catch:{ all -> 0x01dd }
            int r0 = r1.f9935c     // Catch:{ all -> 0x01dd }
            if (r0 != 0) goto L_0x01e2
            r0 = 19
            r3 = r0
            goto L_0x014a
        L_0x01a7:
            r11 = 2
            r3 = 31
            goto L_0x014a
        L_0x01ab:
            r11 = 2
            r3 = 29
            goto L_0x014a
        L_0x01af:
            r11 = 2
            r0 = 17
            r1.mo9115d(r0)     // Catch:{ all -> 0x01dd }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x01dd }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01dd }
            throw r0     // Catch:{ all -> 0x01dd }
        L_0x01ba:
            r11 = 2
            r1.f9934b = r6     // Catch:{ all -> 0x01dd }
            r1.mo9115d(r9)     // Catch:{ all -> 0x01dd }
            r1.mo9115d(r3)     // Catch:{ all -> 0x01dd }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x01dd }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x01dd }
            r1.f9934b = r0     // Catch:{ all -> 0x01dd }
            goto L_0x0187
        L_0x01cc:
            r11 = 2
            r1.mo9115d(r5)     // Catch:{ all -> 0x01dd }
            int r0 = r1.f9935c     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x01da
            if (r0 == r6) goto L_0x01d7
            goto L_0x01da
        L_0x01d7:
            r3 = r6
            goto L_0x014a
        L_0x01da:
            r3 = r8
            goto L_0x014a
        L_0x01dd:
            r0 = move-exception
            goto L_0x01e7
        L_0x01df:
            r3 = r7
            goto L_0x014a
        L_0x01e2:
            r3 = r4
            goto L_0x014a
        L_0x01e5:
            r0 = move-exception
            r11 = 2
        L_0x01e7:
            r3 = 24
            if (r4 < r3) goto L_0x01f7
            if (r4 > r7) goto L_0x01f7
            r1.f9941i = r0
            r0 = 23
            r1.mo9115d(r0)
            r3 = r5
            goto L_0x014a
        L_0x01f7:
            throw r0
        L_0x01f8:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0200
            throw r1
        L_0x0200:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.JNI.m10674c(java.lang.Class, java.lang.Class):void");
    }

    /* renamed from: d */
    static void m10675d() {
        byte[] bArr = new byte[1128];
        System.arraycopy("j°·âü\u0005û\u0005ú\u0006ù\u0007ÿû\u0006ÿú\u0007õ\u000bô\fÿù\bó\rÿø\tÿ÷\nû\u0000\u0005ûÿ\u0006ûþ\u0007ÿö\u000bûü\tûþ\u0007ÿõ\fÿô\rÿü\u0001\u0004ÿü\u0000\u0005ûù\fÿû\u0006ûø\rÿüÿ\u0006ô\fÿú\u0007ÿüþ\u0007ú\u0001\u0005ÿüý\bú\u0000\u0006ÿüý\u0002ñ&íô\b\u0015õ÷\u0010\u0016éûú\u001eõõ÷\u0010\rõ\u0004\u000bþþ\u0002ñ$ïï\u0011ô\bñ\u000fó\u001eÛ\t\u000bò\të\u00153Â\u000bó\u00079åÛú\u000fþ\u0002óü\u0005úþ\bÿû\u0006ÿú\u0007ÿù\bÿø\túþ\bÿ÷\nö\u0004\u0006ÿö\u000bÿõ\fúþ\bÿô\rÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006úþ\bÿüþ\u0007ÿüý\bÿüü\tÿüû\nÿüú\u000búþ\bÿüù\fÿüø\rÿû\u0002\u0004ÿû\u0001\u0005ÿõ\fúþ\bÿû\u0000\u0006ö\u0003\u0007ÿûÿ\u0007ÿü\u0001\u0004ö\u0002\bÿûþ\bÿü\u0000\u0005ÿûý\tûü\tûü\t÷\u0005\u0004ÿûü\nó\rÿûý\tó\rÿûý\tÿûû\u000bö\u0001\tùþ\tÿûú\fùý\nÿûù\rÿú\u0003\u0004ÿú\u0002\u0005ÿú\u0002\u0005ÿú\u0001\u0006ö\u0000\n÷\u0002\u0007ÿú\u0000\u0007ùý\nÿúÿ\bÿúþ\tÿúý\nÿúü\u000bÿüú\u000búþ\bÿüù\fÿüø\rûø\rÿúû\fô\fÿû\u0002\u0004ÿú\u0001\u0006öÿ\u000böþ\fûþ\u0007ÿú\u0000\u0007ùý\nÿúú\rÿù\u0004\u0004ÿù\u0003\u0005ÿúü\u000búþ\bÿû\u0006öý\rõ\u0007\u0004õ\u0006\u0005ÿù\u0002\u0006ÿù\bÿø\tÿù\u0001\u0007ú\u0001\u0005ÿù\u0000\bõ\u0005\u0006ÿù\u0000\bÿùÿ\tù\u0003\u0004ÿùþ\núù\rÿùþ\nÿùý\u000búù\rÿùü\fù\u0003\u0004ÿùü\u0003\u0004\u0003õ\u0002ñ\"íñÿ\u0003\u0004\u001aÛ\t\u000b\të\u00153¹\u0001\u000bý>áìñ\u0002ñü\u0005ÿû\u0006ÿú\u0007ø\u0004\u0004úþ\bÿù\bø\u0003\u0005ø\u0002\u0006ø\u0001\u0007ÿø\tøÿ\tÿ÷\nÿö\u000bÿõ\fú\u0006øþ\núý\tøý\u000bÿô\rÿü\u0001\u0004ô\føü\fÿü\u0000\u0005øû\rÿüÿ\u0006úþ\bÿüþ\u0007ÿô\rÿü\u0001\u0004ô\fúý\tÿüý\bÿüü\tõ\u000bô\fÿüû\nó\rÿüú\u000bûü\tûü\t÷\u0005\u0004ÿüù\f÷\u0004\u0005÷\u0005\u0004ÿüù\fÿüø\r÷\u0003\u0006÷\u0002\u0007ÿû\u0002\u0004ùý\nÿû\u0001\u0005ÿû\u0000\u0006ÿûÿ\u0007ÿûÿ\u0007ÿûþ\b÷\u0001\b÷\u0000\tûþ\u0007ÿûý\tùý\nÿûü\nÿûû\u000bÿûú\f÷ÿ\n÷þ\u000bÿüù\fÿüø\r÷ý\f÷ü\rùþ\tÿû\u0002\u0004ùý\nÿûù\rÿú\u0003\u0004ÿú\u0002\u0005ÿú\u0002\u0005ÿú\u0001\u0006ù\u0003\u0004ÿú\u0000\u0007úù\rÿú\u0000\u0007ÿúÿ\bö\u0006\u0004ÿúþ\tö\u0005\u0005ÿúþ\të\u00153Â\u000bó\u00079Ûß\u0002\tû\u0007%Í\fý\bÿó\të\u00153Â\u000bó\u00079ßíø\u0005\u0002ï\të\u00153Â\u000bó\u00079Ûß\u0002\tû\u0007ü\u0005ú\u0006ÿû\u0006ù\u0001\u0006ù\u0000\u0007ÿú\u0007ù\u0007ÿù\bÿø\tõ\u000bô\fÿ÷\nó\rÿö\u000bÿõ\fùÿ\bùþ\tÿô\rùý\nÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ú\u0006ÿû\u0006ùü\u000bú\u0006ÿú\u0007ù\u0007ÿù\bûø\rÿüý\bô\fÿø\tÿüü\tùû\fÿüû\nùú\rÿüû\të\u00153Â\u000bó\u00079¼\rÿú\u0007\u0002ïFáèñ\fù\u000bñ\u0000\u000b÷\nü\u0005úþ\búý\tÿû\u0006ÿú\u0007ûü\túü\nÿù\bó\rÿø\tÿ÷\núû\u000bûÿ\u0006ûþ\u0007ÿö\u000bûü\tûþ\u0007ÿõ\fÿô\rÿü\u0001\u0004ÿü\u0000\u0005úþ\búý\tÿû\u0006ûø\rÿüÿ\u0006ô\fÿú\u0007ÿüþ\u0007úù\rÿüý\bù\u0003\u0004ÿüý".getBytes("ISO-8859-1"), 0, bArr, 0, 1128);
        f8674c = bArr;
        f8676e = 155;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10677f(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 + 1
            byte[] r0 = f8674c
            int r6 = 118 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L_0x0014
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L_0x0030
        L_0x0014:
            r3 = r2
        L_0x0015:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            int r8 = r8 + 1
            if (r3 != r7) goto L_0x0026
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x0026:
            byte r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L_0x0030:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.JNI.m10677f(byte, short, int, java.lang.Object[]):void");
    }

    private static native void fnm(Class<C2885cd> cls, Class<C2954dn> cls2);

    private static native void rnm(long j, String str, String str2);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10672a(long r16, java.lang.String r18, java.lang.String r19) {
        /*
            com.facetec.sdk.dj r1 = new com.facetec.sdk.dj
            r2 = r16
            r0 = r18
            r4 = r19
            r1.<init>(r2, r0, r4)
            byte[] r0 = f8674c
            r2 = 2
            byte r2 = r0[r2]
            int r2 = -r2
            byte r2 = (byte) r2
            r3 = 96
            short r3 = (short) r3
            r4 = 12
            byte r4 = r0[r4]
            short r4 = (short) r4
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            m10677f(r2, r3, r4, r6)
            r2 = 0
            r3 = r6[r2]
            java.lang.String r3 = (java.lang.String) r3
            r4 = 74
            byte r4 = (byte) r4
            r6 = 34
            byte r7 = r0[r6]
            short r7 = (short) r7
            r8 = r7 | 136(0x88, float:1.9E-43)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r5]
            m10677f(r4, r7, r8, r9)
            r4 = r9[r2]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x01f8 }
            r7[r2] = r4     // Catch:{ all -> 0x01f8 }
            r4 = 21
            byte r8 = r0[r4]     // Catch:{ all -> 0x01f8 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x01f8 }
            r9 = 134(0x86, float:1.88E-43)
            byte r10 = r0[r9]     // Catch:{ all -> 0x01f8 }
            short r10 = (short) r10     // Catch:{ all -> 0x01f8 }
            r11 = 865(0x361, float:1.212E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x01f8 }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x01f8 }
            m10677f(r8, r10, r11, r12)     // Catch:{ all -> 0x01f8 }
            r8 = r12[r2]     // Catch:{ all -> 0x01f8 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01f8 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x01f8 }
            r10 = 260(0x104, float:3.64E-43)
            byte r10 = r0[r10]     // Catch:{ all -> 0x01f8 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x01f8 }
            r12 = 60
            byte r12 = r0[r12]     // Catch:{ all -> 0x01f8 }
            short r12 = (short) r12     // Catch:{ all -> 0x01f8 }
            r13 = 513(0x201, float:7.19E-43)
            short r13 = (short) r13     // Catch:{ all -> 0x01f8 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x01f8 }
            m10677f(r10, r12, r13, r14)     // Catch:{ all -> 0x01f8 }
            r10 = r14[r2]     // Catch:{ all -> 0x01f8 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01f8 }
            java.lang.Class[] r12 = new java.lang.Class[r5]     // Catch:{ all -> 0x01f8 }
            byte r13 = r0[r4]     // Catch:{ all -> 0x01f8 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x01f8 }
            byte r0 = r0[r9]     // Catch:{ all -> 0x01f8 }
            short r0 = (short) r0     // Catch:{ all -> 0x01f8 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x01f8 }
            m10677f(r13, r0, r11, r14)     // Catch:{ all -> 0x01f8 }
            r0 = r14[r2]     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01f8 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x01f8 }
            r12[r2] = r0     // Catch:{ all -> 0x01f8 }
            java.lang.reflect.Method r0 = r8.getMethod(r10, r12)     // Catch:{ all -> 0x01f8 }
            java.lang.Object r0 = r0.invoke(r3, r7)     // Catch:{ all -> 0x01f8 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x01f8 }
            int r3 = r0.length
            int[] r3 = new int[r3]
            r7 = r2
        L_0x0092:
            int r8 = r0.length
            r10 = 9
            if (r7 >= r8) goto L_0x014b
            r8 = r0[r7]
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x0142 }
            r13[r2] = r8     // Catch:{ all -> 0x0142 }
            byte[] r8 = f8674c     // Catch:{ all -> 0x0142 }
            byte r14 = r8[r4]     // Catch:{ all -> 0x0142 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0142 }
            r15 = 109(0x6d, float:1.53E-43)
            byte r12 = r8[r15]     // Catch:{ all -> 0x0142 }
            short r12 = (short) r12     // Catch:{ all -> 0x0142 }
            int r15 = f8676e     // Catch:{ all -> 0x0142 }
            r9 = r15 & 1004(0x3ec, float:1.407E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0142 }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ all -> 0x0142 }
            m10677f(r14, r12, r9, r4)     // Catch:{ all -> 0x0142 }
            r4 = r4[r2]     // Catch:{ all -> 0x0142 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0142 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0142 }
            byte r9 = r8[r6]     // Catch:{ all -> 0x0142 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0142 }
            byte r10 = r8[r10]     // Catch:{ all -> 0x0142 }
            short r10 = (short) r10     // Catch:{ all -> 0x0142 }
            r12 = 101(0x65, float:1.42E-43)
            short r12 = (short) r12     // Catch:{ all -> 0x0142 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0142 }
            m10677f(r9, r10, r12, r14)     // Catch:{ all -> 0x0142 }
            r9 = r14[r2]     // Catch:{ all -> 0x0142 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0142 }
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ all -> 0x0142 }
            r12 = 21
            byte r14 = r8[r12]     // Catch:{ all -> 0x0142 }
            byte r12 = (byte) r14     // Catch:{ all -> 0x0142 }
            r14 = 134(0x86, float:1.88E-43)
            byte r6 = r8[r14]     // Catch:{ all -> 0x0142 }
            short r6 = (short) r6     // Catch:{ all -> 0x0142 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0142 }
            m10677f(r12, r6, r11, r14)     // Catch:{ all -> 0x0142 }
            r6 = r14[r2]     // Catch:{ all -> 0x0142 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0142 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x0142 }
            r10[r2] = r6     // Catch:{ all -> 0x0142 }
            java.lang.reflect.Method r4 = r4.getMethod(r9, r10)     // Catch:{ all -> 0x0142 }
            r6 = 0
            java.lang.Object r4 = r4.invoke(r6, r13)     // Catch:{ all -> 0x0142 }
            r9 = 21
            byte r10 = r8[r9]     // Catch:{ all -> 0x0139 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0139 }
            r12 = 109(0x6d, float:1.53E-43)
            byte r12 = r8[r12]     // Catch:{ all -> 0x0139 }
            short r12 = (short) r12     // Catch:{ all -> 0x0139 }
            r13 = r15 & 1004(0x3ec, float:1.407E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0139 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0139 }
            m10677f(r10, r12, r13, r14)     // Catch:{ all -> 0x0139 }
            r10 = r14[r2]     // Catch:{ all -> 0x0139 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0139 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0139 }
            r12 = 26
            byte r12 = r8[r12]     // Catch:{ all -> 0x0139 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0139 }
            r13 = 11
            byte r13 = r8[r13]     // Catch:{ all -> 0x0139 }
            short r13 = (short) r13     // Catch:{ all -> 0x0139 }
            byte r8 = r8[r2]     // Catch:{ all -> 0x0139 }
            int r8 = r8 + r5
            short r8 = (short) r8     // Catch:{ all -> 0x0139 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0139 }
            m10677f(r12, r13, r8, r14)     // Catch:{ all -> 0x0139 }
            r8 = r14[r2]     // Catch:{ all -> 0x0139 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0139 }
            java.lang.reflect.Method r8 = r10.getMethod(r8, r6)     // Catch:{ all -> 0x0139 }
            java.lang.Object r4 = r8.invoke(r4, r6)     // Catch:{ all -> 0x0139 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0139 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0139 }
            r3[r7] = r4
            int r7 = r7 + 1
            r4 = r9
            r6 = 34
            r9 = 134(0x86, float:1.88E-43)
            goto L_0x0092
        L_0x0139:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0141
            throw r1
        L_0x0141:
            throw r0
        L_0x0142:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x014a
            throw r1
        L_0x014a:
            throw r0
        L_0x014b:
            r9 = r4
            r13 = 11
        L_0x014e:
            int r4 = r2 + 1
            r6 = 28
            r0 = r3[r2]     // Catch:{ all -> 0x01e6 }
            int r0 = r1.mo9115d(r0)     // Catch:{ all -> 0x01e6 }
            r2 = 10
            r7 = 14
            r8 = 20
            r11 = 4
            r12 = 6
            switch(r0) {
                case -14: goto L_0x01e0;
                case -13: goto L_0x01cc;
                case -12: goto L_0x01bb;
                case -11: goto L_0x01b1;
                case -10: goto L_0x01ae;
                case -9: goto L_0x01ab;
                case -8: goto L_0x01a0;
                case -7: goto L_0x0193;
                case -6: goto L_0x018b;
                case -5: goto L_0x018a;
                case -4: goto L_0x0188;
                case -3: goto L_0x0186;
                case -2: goto L_0x0167;
                case -1: goto L_0x0165;
                default: goto L_0x0163;
            }     // Catch:{ all -> 0x01e6 }
        L_0x0163:
            goto L_0x01e3
        L_0x0165:
            r2 = r12
            goto L_0x014e
        L_0x0167:
            r0 = 3
            r1.f9934b = r0     // Catch:{ all -> 0x01e6 }
            r1.mo9115d(r11)     // Catch:{ all -> 0x01e6 }
            r0 = 5
            r1.mo9115d(r0)     // Catch:{ all -> 0x01e6 }
            long r7 = r1.f9933a     // Catch:{ all -> 0x01e6 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x01e6 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01e6 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x01e6 }
            java.lang.Object r2 = r1.f9939g     // Catch:{ all -> 0x01e6 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01e6 }
            rnm(r7, r0, r2)     // Catch:{ all -> 0x01e6 }
            goto L_0x01e3
        L_0x0186:
            r2 = r10
            goto L_0x014e
        L_0x0188:
            r2 = r13
            goto L_0x014e
        L_0x018a:
            return
        L_0x018b:
            int r0 = f8675d     // Catch:{ all -> 0x01e6 }
            r1.f9934b = r0     // Catch:{ all -> 0x01e6 }
        L_0x018f:
            r1.mo9115d(r2)     // Catch:{ all -> 0x01e6 }
            goto L_0x01e3
        L_0x0193:
            r1.f9934b = r5     // Catch:{ all -> 0x01e6 }
            r1.mo9115d(r11)     // Catch:{ all -> 0x01e6 }
            r1.mo9115d(r7)     // Catch:{ all -> 0x01e6 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x01e6 }
            f8672a = r0     // Catch:{ all -> 0x01e6 }
            goto L_0x01e3
        L_0x01a0:
            r0 = 16
            r1.mo9115d(r0)     // Catch:{ all -> 0x01e6 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x01e6 }
            if (r0 != 0) goto L_0x01e3
            r2 = r8
            goto L_0x014e
        L_0x01ab:
            r2 = 31
            goto L_0x014e
        L_0x01ae:
            r2 = 29
            goto L_0x014e
        L_0x01b1:
            r0 = 17
            r1.mo9115d(r0)     // Catch:{ all -> 0x01e6 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x01e6 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01e6 }
            throw r0     // Catch:{ all -> 0x01e6 }
        L_0x01bb:
            r1.f9934b = r5     // Catch:{ all -> 0x01e6 }
            r1.mo9115d(r11)     // Catch:{ all -> 0x01e6 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x01e6 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x01e6 }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x01e6 }
            r1.f9934b = r0     // Catch:{ all -> 0x01e6 }
            goto L_0x018f
        L_0x01cc:
            r1.mo9115d(r8)     // Catch:{ all -> 0x01e6 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x01e6 }
            if (r0 == r7) goto L_0x01dd
            r2 = 93
            if (r0 == r2) goto L_0x01d8
            goto L_0x01dd
        L_0x01d8:
            r0 = 22
            r2 = r0
            goto L_0x014e
        L_0x01dd:
            r2 = r5
            goto L_0x014e
        L_0x01e0:
            r2 = r6
            goto L_0x014e
        L_0x01e3:
            r2 = r4
            goto L_0x014e
        L_0x01e6:
            r0 = move-exception
            r2 = 24
            if (r4 < r2) goto L_0x01f7
            if (r4 > r6) goto L_0x01f7
            r1.f9941i = r0
            r0 = 23
            r1.mo9115d(r0)
            r2 = r9
            goto L_0x014e
        L_0x01f7:
            throw r0
        L_0x01f8:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0200
            throw r1
        L_0x0200:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.JNI.m10672a(long, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x021d, code lost:
        r1.mo9115d(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0299, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01da A[Catch:{ all -> 0x01c8, all -> 0x0292 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01db A[Catch:{ all -> 0x01c8, all -> 0x0292 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02b4  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m10676d(long r17, java.lang.reflect.Method r19) {
        /*
            com.facetec.sdk.dj r1 = new com.facetec.sdk.dj
            r2 = r17
            r0 = r19
            r1.<init>((long) r2, (java.lang.Object) r0)
            byte[] r0 = f8674c
            r2 = 2
            byte r3 = r0[r2]
            int r3 = -r3
            byte r3 = (byte) r3
            r4 = 114(0x72, float:1.6E-43)
            short r4 = (short) r4
            r5 = 880(0x370, float:1.233E-42)
            short r5 = (short) r5
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            m10677f(r3, r4, r5, r7)
            r3 = 0
            r4 = r7[r3]
            java.lang.String r4 = (java.lang.String) r4
            r5 = 74
            byte r5 = (byte) r5
            r7 = 34
            byte r8 = r0[r7]
            short r8 = (short) r8
            r9 = r8 | 136(0x88, float:1.9E-43)
            short r9 = (short) r9
            java.lang.Object[] r10 = new java.lang.Object[r6]
            m10677f(r5, r8, r9, r10)
            r5 = r10[r3]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x02b5 }
            r8[r3] = r5     // Catch:{ all -> 0x02b5 }
            r5 = 21
            byte r9 = r0[r5]     // Catch:{ all -> 0x02b5 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x02b5 }
            r10 = 134(0x86, float:1.88E-43)
            byte r11 = r0[r10]     // Catch:{ all -> 0x02b5 }
            short r11 = (short) r11     // Catch:{ all -> 0x02b5 }
            r12 = 865(0x361, float:1.212E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x02b5 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x02b5 }
            m10677f(r9, r11, r12, r13)     // Catch:{ all -> 0x02b5 }
            r9 = r13[r3]     // Catch:{ all -> 0x02b5 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x02b5 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x02b5 }
            r11 = 260(0x104, float:3.64E-43)
            byte r11 = r0[r11]     // Catch:{ all -> 0x02b5 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x02b5 }
            r13 = 60
            byte r13 = r0[r13]     // Catch:{ all -> 0x02b5 }
            short r13 = (short) r13     // Catch:{ all -> 0x02b5 }
            r14 = 513(0x201, float:7.19E-43)
            short r14 = (short) r14     // Catch:{ all -> 0x02b5 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x02b5 }
            m10677f(r11, r13, r14, r15)     // Catch:{ all -> 0x02b5 }
            r11 = r15[r3]     // Catch:{ all -> 0x02b5 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x02b5 }
            java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch:{ all -> 0x02b5 }
            byte r14 = r0[r5]     // Catch:{ all -> 0x02b5 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x02b5 }
            byte r0 = r0[r10]     // Catch:{ all -> 0x02b5 }
            short r0 = (short) r0     // Catch:{ all -> 0x02b5 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x02b5 }
            m10677f(r14, r0, r12, r15)     // Catch:{ all -> 0x02b5 }
            r0 = r15[r3]     // Catch:{ all -> 0x02b5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x02b5 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x02b5 }
            r13[r3] = r0     // Catch:{ all -> 0x02b5 }
            java.lang.reflect.Method r0 = r9.getMethod(r11, r13)     // Catch:{ all -> 0x02b5 }
            java.lang.Object r0 = r0.invoke(r4, r8)     // Catch:{ all -> 0x02b5 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x02b5 }
            int r4 = r0.length
            int[] r4 = new int[r4]
            r8 = r3
        L_0x008e:
            int r9 = r0.length
            r11 = 9
            if (r8 >= r9) goto L_0x0148
            r9 = r0[r8]
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x013f }
            r14[r3] = r9     // Catch:{ all -> 0x013f }
            byte[] r9 = f8674c     // Catch:{ all -> 0x013f }
            byte r15 = r9[r5]     // Catch:{ all -> 0x013f }
            byte r15 = (byte) r15     // Catch:{ all -> 0x013f }
            r16 = 109(0x6d, float:1.53E-43)
            byte r2 = r9[r16]     // Catch:{ all -> 0x013f }
            short r2 = (short) r2     // Catch:{ all -> 0x013f }
            int r13 = f8676e     // Catch:{ all -> 0x013f }
            r10 = r13 & 1004(0x3ec, float:1.407E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x013f }
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ all -> 0x013f }
            m10677f(r15, r2, r10, r5)     // Catch:{ all -> 0x013f }
            r2 = r5[r3]     // Catch:{ all -> 0x013f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x013f }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x013f }
            byte r5 = r9[r7]     // Catch:{ all -> 0x013f }
            byte r5 = (byte) r5     // Catch:{ all -> 0x013f }
            byte r10 = r9[r11]     // Catch:{ all -> 0x013f }
            short r10 = (short) r10     // Catch:{ all -> 0x013f }
            r11 = 101(0x65, float:1.42E-43)
            short r11 = (short) r11     // Catch:{ all -> 0x013f }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x013f }
            m10677f(r5, r10, r11, r15)     // Catch:{ all -> 0x013f }
            r5 = r15[r3]     // Catch:{ all -> 0x013f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x013f }
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ all -> 0x013f }
            r11 = 21
            byte r15 = r9[r11]     // Catch:{ all -> 0x013f }
            byte r11 = (byte) r15     // Catch:{ all -> 0x013f }
            r15 = 134(0x86, float:1.88E-43)
            byte r7 = r9[r15]     // Catch:{ all -> 0x013f }
            short r7 = (short) r7     // Catch:{ all -> 0x013f }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x013f }
            m10677f(r11, r7, r12, r15)     // Catch:{ all -> 0x013f }
            r7 = r15[r3]     // Catch:{ all -> 0x013f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x013f }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x013f }
            r10[r3] = r7     // Catch:{ all -> 0x013f }
            java.lang.reflect.Method r2 = r2.getMethod(r5, r10)     // Catch:{ all -> 0x013f }
            r5 = 0
            java.lang.Object r2 = r2.invoke(r5, r14)     // Catch:{ all -> 0x013f }
            r5 = 21
            byte r7 = r9[r5]     // Catch:{ all -> 0x0136 }
            byte r5 = (byte) r7     // Catch:{ all -> 0x0136 }
            byte r7 = r9[r16]     // Catch:{ all -> 0x0136 }
            short r7 = (short) r7     // Catch:{ all -> 0x0136 }
            r10 = r13 & 1004(0x3ec, float:1.407E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0136 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0136 }
            m10677f(r5, r7, r10, r11)     // Catch:{ all -> 0x0136 }
            r5 = r11[r3]     // Catch:{ all -> 0x0136 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0136 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0136 }
            r7 = 26
            byte r7 = r9[r7]     // Catch:{ all -> 0x0136 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x0136 }
            r10 = 11
            byte r10 = r9[r10]     // Catch:{ all -> 0x0136 }
            short r10 = (short) r10     // Catch:{ all -> 0x0136 }
            byte r9 = r9[r3]     // Catch:{ all -> 0x0136 }
            int r9 = r9 + r6
            short r9 = (short) r9     // Catch:{ all -> 0x0136 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0136 }
            m10677f(r7, r10, r9, r11)     // Catch:{ all -> 0x0136 }
            r7 = r11[r3]     // Catch:{ all -> 0x0136 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0136 }
            r9 = 0
            java.lang.reflect.Method r5 = r5.getMethod(r7, r9)     // Catch:{ all -> 0x0136 }
            java.lang.Object r2 = r5.invoke(r2, r9)     // Catch:{ all -> 0x0136 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0136 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0136 }
            r4[r8] = r2
            int r8 = r8 + 1
            r2 = 2
            r5 = 21
            r7 = 34
            r10 = 134(0x86, float:1.88E-43)
            goto L_0x008e
        L_0x0136:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x013e
            throw r1
        L_0x013e:
            throw r0
        L_0x013f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0147
            throw r1
        L_0x0147:
            throw r0
        L_0x0148:
            r0 = r3
        L_0x0149:
            int r2 = r0 + 1
            r5 = 23
            r0 = r4[r0]     // Catch:{ all -> 0x029c }
            int r0 = r1.mo9115d(r0)     // Catch:{ all -> 0x029c }
            r7 = 31
            r8 = 10
            r9 = 14
            r10 = 6
            r12 = 4
            switch(r0) {
                case -16: goto L_0x0295;
                case -15: goto L_0x027d;
                case -14: goto L_0x0267;
                case -13: goto L_0x0258;
                case -12: goto L_0x024f;
                case -11: goto L_0x0246;
                case -10: goto L_0x0235;
                case -9: goto L_0x0223;
                case -8: goto L_0x0214;
                case -7: goto L_0x0213;
                case -6: goto L_0x0210;
                case -5: goto L_0x0207;
                case -4: goto L_0x01e4;
                case -3: goto L_0x017e;
                case -2: goto L_0x0168;
                case -1: goto L_0x0166;
                default: goto L_0x015e;
            }     // Catch:{ all -> 0x029c }
        L_0x015e:
            r7 = 2
            r13 = 21
            r14 = 134(0x86, float:1.88E-43)
            r15 = 0
            goto L_0x0299
        L_0x0166:
            r0 = r11
            goto L_0x0149
        L_0x0168:
            r1.f9934b = r6     // Catch:{ all -> 0x029c }
            r1.mo9115d(r12)     // Catch:{ all -> 0x029c }
            r1.mo9115d(r10)     // Catch:{ all -> 0x029c }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x029c }
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch:{ all -> 0x029c }
            java.lang.String r0 = m10671a(r0)     // Catch:{ all -> 0x029c }
            r1.f9941i = r0     // Catch:{ all -> 0x029c }
            r1.mo9115d(r7)     // Catch:{ all -> 0x029c }
            goto L_0x015e
        L_0x017e:
            r1.f9934b = r6     // Catch:{ all -> 0x01dc }
            r1.mo9115d(r12)     // Catch:{ all -> 0x01dc }
            r1.mo9115d(r10)     // Catch:{ all -> 0x01dc }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x01dc }
            byte[] r8 = f8674c     // Catch:{ all -> 0x01ce }
            r13 = 21
            byte r9 = r8[r13]     // Catch:{ all -> 0x01cc }
            byte r9 = (byte) r9     // Catch:{ all -> 0x01cc }
            r10 = 111(0x6f, float:1.56E-43)
            byte r10 = r8[r10]     // Catch:{ all -> 0x01cc }
            int r10 = -r10
            short r10 = (short) r10     // Catch:{ all -> 0x01cc }
            r12 = 994(0x3e2, float:1.393E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x01cc }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x01cc }
            m10677f(r9, r10, r12, r14)     // Catch:{ all -> 0x01cc }
            r9 = r14[r3]     // Catch:{ all -> 0x01cc }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01cc }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x01cc }
            r14 = 134(0x86, float:1.88E-43)
            byte r10 = r8[r14]     // Catch:{ all -> 0x01ca }
            byte r10 = (byte) r10     // Catch:{ all -> 0x01ca }
            byte r8 = r8[r11]     // Catch:{ all -> 0x01ca }
            short r8 = (short) r8     // Catch:{ all -> 0x01ca }
            r12 = r8 | 89
            short r12 = (short) r12     // Catch:{ all -> 0x01ca }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x01ca }
            m10677f(r10, r8, r12, r15)     // Catch:{ all -> 0x01ca }
            r8 = r15[r3]     // Catch:{ all -> 0x01ca }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01ca }
            r15 = 0
            java.lang.reflect.Method r8 = r9.getMethod(r8, r15)     // Catch:{ all -> 0x01c8 }
            java.lang.Object r0 = r8.invoke(r0, r15)     // Catch:{ all -> 0x01c8 }
            r1.f9941i = r0     // Catch:{ all -> 0x0292 }
            r1.mo9115d(r7)     // Catch:{ all -> 0x0292 }
            goto L_0x0220
        L_0x01c8:
            r0 = move-exception
            goto L_0x01d4
        L_0x01ca:
            r0 = move-exception
            goto L_0x01d3
        L_0x01cc:
            r0 = move-exception
            goto L_0x01d1
        L_0x01ce:
            r0 = move-exception
            r13 = 21
        L_0x01d1:
            r14 = 134(0x86, float:1.88E-43)
        L_0x01d3:
            r15 = 0
        L_0x01d4:
            java.lang.Throwable r7 = r0.getCause()     // Catch:{ all -> 0x0292 }
            if (r7 == 0) goto L_0x01db
            throw r7     // Catch:{ all -> 0x0292 }
        L_0x01db:
            throw r0     // Catch:{ all -> 0x0292 }
        L_0x01dc:
            r0 = move-exception
            r13 = 21
            r14 = 134(0x86, float:1.88E-43)
            r15 = 0
            goto L_0x0293
        L_0x01e4:
            r13 = 21
            r14 = 134(0x86, float:1.88E-43)
            r15 = 0
            r0 = 3
            r1.f9934b = r0     // Catch:{ all -> 0x0292 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x0292 }
            r0 = 5
            r1.mo9115d(r0)     // Catch:{ all -> 0x0292 }
            long r7 = r1.f9933a     // Catch:{ all -> 0x0292 }
            r1.mo9115d(r10)     // Catch:{ all -> 0x0292 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0292 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0292 }
            r1.mo9115d(r10)     // Catch:{ all -> 0x0292 }
            java.lang.Object r9 = r1.f9939g     // Catch:{ all -> 0x0292 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0292 }
            m10672a(r7, r0, r9)     // Catch:{ all -> 0x0292 }
            goto L_0x0220
        L_0x0207:
            r13 = 21
            r14 = 134(0x86, float:1.88E-43)
            r15 = 0
            r0 = 12
            goto L_0x0149
        L_0x0210:
            r0 = r9
            goto L_0x0149
        L_0x0213:
            return
        L_0x0214:
            r13 = 21
            r14 = 134(0x86, float:1.88E-43)
            r15 = 0
            int r0 = f8672a     // Catch:{ all -> 0x0292 }
            r1.f9934b = r0     // Catch:{ all -> 0x0292 }
        L_0x021d:
            r1.mo9115d(r8)     // Catch:{ all -> 0x0292 }
        L_0x0220:
            r7 = 2
            goto L_0x0299
        L_0x0223:
            r13 = 21
            r14 = 134(0x86, float:1.88E-43)
            r15 = 0
            r1.f9934b = r6     // Catch:{ all -> 0x0292 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x0292 }
            r1.mo9115d(r9)     // Catch:{ all -> 0x0292 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x0292 }
            f8675d = r0     // Catch:{ all -> 0x0292 }
            goto L_0x0220
        L_0x0235:
            r13 = 21
            r14 = 134(0x86, float:1.88E-43)
            r15 = 0
            r0 = 28
            r1.mo9115d(r0)     // Catch:{ all -> 0x0292 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x0292 }
            if (r0 != 0) goto L_0x0299
            r0 = r13
            goto L_0x0149
        L_0x0246:
            r13 = 21
            r14 = 134(0x86, float:1.88E-43)
            r15 = 0
            r0 = 37
            goto L_0x0149
        L_0x024f:
            r13 = 21
            r14 = 134(0x86, float:1.88E-43)
            r15 = 0
            r0 = 35
            goto L_0x0149
        L_0x0258:
            r13 = 21
            r14 = 134(0x86, float:1.88E-43)
            r15 = 0
            r0 = 17
            r1.mo9115d(r0)     // Catch:{ all -> 0x0292 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0292 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0292 }
            throw r0     // Catch:{ all -> 0x0292 }
        L_0x0267:
            r13 = 21
            r14 = 134(0x86, float:1.88E-43)
            r15 = 0
            r1.f9934b = r6     // Catch:{ all -> 0x0292 }
            r1.mo9115d(r12)     // Catch:{ all -> 0x0292 }
            r1.mo9115d(r10)     // Catch:{ all -> 0x0292 }
            java.lang.Object r0 = r1.f9939g     // Catch:{ all -> 0x0292 }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x0292 }
            r1.f9934b = r0     // Catch:{ all -> 0x0292 }
            goto L_0x021d
        L_0x027d:
            r13 = 21
            r14 = 134(0x86, float:1.88E-43)
            r15 = 0
            r0 = 20
            r1.mo9115d(r0)     // Catch:{ all -> 0x0292 }
            int r0 = r1.f9935c     // Catch:{ all -> 0x0292 }
            r7 = 2
            if (r0 == r7) goto L_0x028f
            r0 = r5
            goto L_0x0149
        L_0x028f:
            r0 = r6
            goto L_0x0149
        L_0x0292:
            r0 = move-exception
        L_0x0293:
            r7 = 2
            goto L_0x02a3
        L_0x0295:
            r0 = 34
            goto L_0x0149
        L_0x0299:
            r0 = r2
            goto L_0x0149
        L_0x029c:
            r0 = move-exception
            r7 = 2
            r13 = 21
            r14 = 134(0x86, float:1.88E-43)
            r15 = 0
        L_0x02a3:
            r8 = 30
            if (r2 < r8) goto L_0x02b4
            r8 = 34
            if (r2 > r8) goto L_0x02b4
            r1.f9941i = r0
            r1.mo9115d(r5)
            r0 = 22
            goto L_0x0149
        L_0x02b4:
            throw r0
        L_0x02b5:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02bd
            throw r1
        L_0x02bd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.JNI.m10676d(long, java.lang.reflect.Method):void");
    }
}
