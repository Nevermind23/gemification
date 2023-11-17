package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facetec.sdk.JNI;
import com.github.mikephil.charting.utils.Utils;
import com.guardsquare.dexguard.annotation.EncryptStrings;
import com.guardsquare.dexguard.annotation.VirtualizeCode;
import java.lang.reflect.Method;
import java.util.Map;

@VirtualizeCode
@EncryptStrings
/* renamed from: com.facetec.sdk.cd */
final class C2885cd {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    public static final byte[] $$d = null;
    public static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: a */
    private static boolean f9516a = false;

    /* renamed from: b */
    private static String f9517b = null;

    /* renamed from: c */
    public static final byte[] f9518c = null;

    /* renamed from: d */
    public static final int f9519d = 0;

    /* renamed from: e */
    private static boolean f9520e = false;

    /* renamed from: f */
    private static char[] f9521f;

    /* renamed from: g */
    private static char f9522g;

    /* renamed from: h */
    private static char f9523h;

    /* renamed from: i */
    private static int[] f9524i;

    /* renamed from: j */
    private static char[] f9525j;

    /* renamed from: m */
    private static int f9526m = 0;

    /* renamed from: n */
    private static int f9527n;

    static {
        char c;
        init$1();
        init$0();
        m11773H();
        f9527n = 1;
        m11764C();
        m11866z();
        Color.alpha(0);
        Color.alpha(0);
        TextUtils.indexOf("", "", 0, 0);
        ViewConfiguration.getZoomControlsTimeout();
        int i = f9526m + 1;
        f9527n = i % 128;
        if (i % 2 == 0) {
            c = 26;
        } else {
            c = 'B';
        }
        if (c != 'B') {
            throw null;
        }
    }

    C2885cd() {
    }

    @JNI.C2746c(mo8795e = 336358377)
    /* renamed from: A */
    static native void m11762A();

    @JNI.C2746c(mo8795e = 605746527)
    /* renamed from: B */
    static native void m11763B();

    /* renamed from: C */
    static void m11764C() {
        f9524i = new int[]{994492643, 2022962509, -290223803, 1970458661, -944333985, 969698805, -1798744022, -2085199658, -256585838, 1713144091, 515407422, -97867420, -2106473645, 1515155717, 643769389, -1556072202, 2072115159, 1473334089};
        f9523h = 9123;
        f9521f = new char[]{5682, 5717, 5747, 5740, 5691, 5677, 5695, 5736, 5741, 5738, 5742, 5755, 5749, 5638, 5688, 5732, 5636, 5744, 5693, 5723, 5713, 5637, 5689, 5692, 5708, 5759, 5676, 5746, 5712, 5632, 5722, 5757, 5649, 5683, 5727, 5745, 5639, 5672, 5720, 5751, 5719, 5681, 5754, 8205, 5729, 5690, 5753, 5694, 5703};
    }

    @JNI.C2746c(mo8795e = 895026767)
    /* renamed from: C */
    static native void m11765C(Map<String, String> map);

    @JNI.C2746c(mo8795e = 122908087)
    /* renamed from: D */
    static native void m11766D();

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x05be, code lost:
        r1.mo9125d(24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x05c1, code lost:
        r18 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x06b6, code lost:
        r1.mo9125d(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x06e4, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0932, code lost:
        r1.mo9125d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x015f, code lost:
        r18 = r4;
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0b8d, code lost:
        r1.mo9125d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0163, code lost:
        r9 = 1050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0ca6, code lost:
        r1.mo9125d(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0196, code lost:
        r1.mo9125d(24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0f96, code lost:
        r1.mo9125d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x101e, code lost:
        r12 = 1050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x108c, code lost:
        r2 = r3;
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01e4, code lost:
        r1.mo9125d(84);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03c6, code lost:
        r1.mo9125d(1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x05aa A[Catch:{ all -> 0x059e, all -> 0x0619 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x05ab A[Catch:{ all -> 0x059e, all -> 0x0619 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x06c6 A[Catch:{ all -> 0x083f, all -> 0x073a, all -> 0x06ba, all -> 0x0899 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x06c7 A[Catch:{ all -> 0x083f, all -> 0x073a, all -> 0x06ba, all -> 0x0899 }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0b9e A[Catch:{ all -> 0x0ec7, all -> 0x0da3, all -> 0x0c2c, all -> 0x0b92, all -> 0x0f5e }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0b9f A[Catch:{ all -> 0x0ec7, all -> 0x0da3, all -> 0x0c2c, all -> 0x0b92, all -> 0x0f5e }] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0d0d A[Catch:{ all -> 0x0ec7, all -> 0x0da3, all -> 0x0c2c, all -> 0x0b92, all -> 0x0f5e }] */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0d0e A[Catch:{ all -> 0x0ec7, all -> 0x0da3, all -> 0x0c2c, all -> 0x0b92, all -> 0x0f5e }] */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x1113  */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x111e  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11767E() {
        /*
            com.facetec.sdk.do r1 = new com.facetec.sdk.do
            r1.<init>()
            byte[] r2 = f9518c
            r3 = 18
            byte r3 = r2[r3]
            short r3 = (short) r3
            r4 = 21
            byte r4 = r2[r4]
            byte r4 = (byte) r4
            r5 = r4 | 1230(0x4ce, float:1.724E-42)
            short r5 = (short) r5
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            m11815as(r3, r4, r5, r7)
            r3 = 0
            r4 = r7[r3]
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1066(0x42a, float:1.494E-42)
            short r5 = (short) r5
            r7 = 18
            byte r7 = r2[r7]
            byte r7 = (byte) r7
            r8 = r7 | 6193(0x1831, float:8.678E-42)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r6]
            m11815as(r5, r7, r8, r9)
            r5 = r9[r3]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x111f }
            r7[r3] = r5     // Catch:{ all -> 0x111f }
            r5 = 1051(0x41b, float:1.473E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x111f }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r2[r8]     // Catch:{ all -> 0x111f }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x111f }
            r10 = 5290(0x14aa, float:7.413E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x111f }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x111f }
            m11815as(r5, r9, r10, r11)     // Catch:{ all -> 0x111f }
            r9 = r11[r3]     // Catch:{ all -> 0x111f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x111f }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x111f }
            r11 = 1062(0x426, float:1.488E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x111f }
            r12 = 3127(0xc37, float:4.382E-42)
            byte r12 = r2[r12]     // Catch:{ all -> 0x111f }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x111f }
            r13 = 4131(0x1023, float:5.789E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x111f }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x111f }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x111f }
            r12 = r14[r3]     // Catch:{ all -> 0x111f }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x111f }
            java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch:{ all -> 0x111f }
            byte r2 = r2[r8]     // Catch:{ all -> 0x111f }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x111f }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x111f }
            m11815as(r5, r2, r10, r14)     // Catch:{ all -> 0x111f }
            r2 = r14[r3]     // Catch:{ all -> 0x111f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x111f }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x111f }
            r13[r3] = r2     // Catch:{ all -> 0x111f }
            java.lang.reflect.Method r2 = r9.getMethod(r12, r13)     // Catch:{ all -> 0x111f }
            java.lang.Object r2 = r2.invoke(r4, r7)     // Catch:{ all -> 0x111f }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x111f }
            int r4 = r2.length
            int[] r4 = new int[r4]
            r7 = r3
        L_0x0088:
            int r9 = r2.length
            r12 = 1050(0x41a, float:1.471E-42)
            if (r7 >= r9) goto L_0x0142
            r9 = r2[r7]
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0138 }
            r14[r3] = r9     // Catch:{ all -> 0x0138 }
            short r9 = (short) r12     // Catch:{ all -> 0x0138 }
            byte[] r12 = f9518c     // Catch:{ all -> 0x0138 }
            byte r15 = r12[r8]     // Catch:{ all -> 0x0138 }
            int r15 = -r15
            byte r15 = (byte) r15     // Catch:{ all -> 0x0138 }
            int r13 = f9519d     // Catch:{ all -> 0x0138 }
            r8 = r13 | 6720(0x1a40, float:9.417E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0138 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0138 }
            m11815as(r9, r15, r8, r3)     // Catch:{ all -> 0x0138 }
            r8 = 0
            r3 = r3[r8]     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0138 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0138 }
            r8 = 1060(0x424, float:1.485E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0138 }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x0138 }
            r16 = r2
            r2 = 1465(0x5b9, float:2.053E-42)
            short r2 = (short) r2     // Catch:{ all -> 0x0138 }
            r17 = r11
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0138 }
            m11815as(r8, r15, r2, r11)     // Catch:{ all -> 0x0138 }
            r2 = 0
            r8 = r11[r2]     // Catch:{ all -> 0x0138 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0138 }
            java.lang.Class[] r2 = new java.lang.Class[r6]     // Catch:{ all -> 0x0138 }
            r11 = 2385(0x951, float:3.342E-42)
            byte r15 = r12[r11]     // Catch:{ all -> 0x0138 }
            int r11 = -r15
            byte r11 = (byte) r11     // Catch:{ all -> 0x0138 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x0138 }
            m11815as(r5, r11, r10, r15)     // Catch:{ all -> 0x0138 }
            r11 = 0
            r15 = r15[r11]     // Catch:{ all -> 0x0138 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0138 }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x0138 }
            r2[r11] = r15     // Catch:{ all -> 0x0138 }
            java.lang.reflect.Method r2 = r3.getMethod(r8, r2)     // Catch:{ all -> 0x0138 }
            r3 = 0
            java.lang.Object r2 = r2.invoke(r3, r14)     // Catch:{ all -> 0x0138 }
            r3 = 2385(0x951, float:3.342E-42)
            byte r8 = r12[r3]     // Catch:{ all -> 0x012e }
            int r3 = -r8
            byte r3 = (byte) r3     // Catch:{ all -> 0x012e }
            r8 = r13 | 6720(0x1a40, float:9.417E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012e }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x012e }
            m11815as(r9, r3, r8, r11)     // Catch:{ all -> 0x012e }
            r3 = 0
            r8 = r11[r3]     // Catch:{ all -> 0x012e }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x012e }
            java.lang.Class r3 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x012e }
            r8 = 1059(0x423, float:1.484E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012e }
            r9 = 1801(0x709, float:2.524E-42)
            byte r9 = r12[r9]     // Catch:{ all -> 0x012e }
            int r9 = r9 + r6
            byte r9 = (byte) r9     // Catch:{ all -> 0x012e }
            r11 = 1459(0x5b3, float:2.044E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x012e }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x012e }
            m11815as(r8, r9, r11, r12)     // Catch:{ all -> 0x012e }
            r8 = 0
            r9 = r12[r8]     // Catch:{ all -> 0x012e }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x012e }
            r8 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r9, r8)     // Catch:{ all -> 0x012e }
            java.lang.Object r2 = r3.invoke(r2, r8)     // Catch:{ all -> 0x012e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x012e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x012e }
            r4[r7] = r2
            int r7 = r7 + 1
            r2 = r16
            r11 = r17
            r3 = 0
            r8 = 2385(0x951, float:3.342E-42)
            goto L_0x0088
        L_0x012e:
            r0 = move-exception
            r1 = r0
            java.lang.Throwable r2 = r1.getCause()
            if (r2 == 0) goto L_0x0137
            throw r2
        L_0x0137:
            throw r1
        L_0x0138:
            r0 = move-exception
            r1 = r0
            java.lang.Throwable r2 = r1.getCause()
            if (r2 == 0) goto L_0x0141
            throw r2
        L_0x0141:
            throw r1
        L_0x0142:
            r17 = r11
            r2 = 0
        L_0x0145:
            int r3 = r2 + 1
            r9 = 12
            r11 = 2
            r2 = r4[r2]     // Catch:{ all -> 0x1098 }
            int r2 = r1.mo9125d(r2)     // Catch:{ all -> 0x1098 }
            r15 = 1045(0x415, float:1.464E-42)
            r8 = 16
            r13 = 84
            r12 = 125(0x7d, float:1.75E-43)
            r7 = 24
            r14 = 8
            switch(r2) {
                case -93: goto L_0x1084;
                case -92: goto L_0x1066;
                case -91: goto L_0x105d;
                case -90: goto L_0x1047;
                case -89: goto L_0x103e;
                case -88: goto L_0x1035;
                case -87: goto L_0x1022;
                case -86: goto L_0x101a;
                case -85: goto L_0x1010;
                case -84: goto L_0x0ffd;
                case -83: goto L_0x0fe6;
                case -82: goto L_0x0fda;
                case -81: goto L_0x0fd0;
                case -80: goto L_0x0fc6;
                case -79: goto L_0x0fb2;
                case -78: goto L_0x0f9b;
                case -77: goto L_0x0f8b;
                case -76: goto L_0x0f88;
                case -75: goto L_0x0f85;
                case -74: goto L_0x0f84;
                case -73: goto L_0x0f63;
                case -72: goto L_0x0f50;
                case -71: goto L_0x0f31;
                case -70: goto L_0x0f12;
                case -69: goto L_0x0f08;
                case -68: goto L_0x0efe;
                case -67: goto L_0x0eeb;
                case -66: goto L_0x0ed1;
                case -65: goto L_0x0e66;
                case -64: goto L_0x0e58;
                case -63: goto L_0x0e4e;
                case -62: goto L_0x0e44;
                case -61: goto L_0x0e31;
                case -60: goto L_0x0e27;
                case -59: goto L_0x0e09;
                case -58: goto L_0x0dfb;
                case -57: goto L_0x0df1;
                case -56: goto L_0x0dd8;
                case -55: goto L_0x0dad;
                case -54: goto L_0x0d28;
                case -53: goto L_0x0d0f;
                case -52: goto L_0x0cd2;
                case -51: goto L_0x0cc8;
                case -50: goto L_0x0cbe;
                case -49: goto L_0x0cab;
                case -48: goto L_0x0c8e;
                case -47: goto L_0x0c84;
                case -46: goto L_0x0c36;
                case -45: goto L_0x0ba5;
                case -44: goto L_0x0b31;
                case -43: goto L_0x0ab7;
                case -42: goto L_0x0a29;
                case -41: goto L_0x09b8;
                case -40: goto L_0x0941;
                case -39: goto L_0x089e;
                case -38: goto L_0x084f;
                case -37: goto L_0x07b9;
                case -36: goto L_0x07b1;
                case -35: goto L_0x076b;
                case -34: goto L_0x0763;
                case -33: goto L_0x075b;
                case -32: goto L_0x0744;
                case -31: goto L_0x06e7;
                case -30: goto L_0x06cf;
                case -29: goto L_0x061f;
                case -28: goto L_0x05eb;
                case -27: goto L_0x05c5;
                case -26: goto L_0x05ac;
                case -25: goto L_0x055b;
                case -24: goto L_0x0528;
                case -23: goto L_0x04ad;
                case -22: goto L_0x0464;
                case -21: goto L_0x045e;
                case -20: goto L_0x0415;
                case -19: goto L_0x03ff;
                case -18: goto L_0x03d5;
                case -17: goto L_0x035e;
                case -16: goto L_0x0358;
                case -15: goto L_0x0309;
                case -14: goto L_0x02e6;
                case -13: goto L_0x029d;
                case -12: goto L_0x024f;
                case -11: goto L_0x0209;
                case -10: goto L_0x0204;
                case -9: goto L_0x0200;
                case -8: goto L_0x01fc;
                case -7: goto L_0x01ee;
                case -6: goto L_0x01e9;
                case -5: goto L_0x01ac;
                case -4: goto L_0x01a4;
                case -3: goto L_0x016f;
                case -2: goto L_0x016b;
                case -1: goto L_0x0167;
                default: goto L_0x015f;
            }
        L_0x015f:
            r18 = r4
            r2 = r17
        L_0x0163:
            r9 = 1050(0x41a, float:1.471E-42)
            goto L_0x1090
        L_0x0167:
            r2 = 231(0xe7, float:3.24E-43)
            goto L_0x101e
        L_0x016b:
            r2 = 240(0xf0, float:3.36E-43)
            goto L_0x101e
        L_0x016f:
            r2 = 1041(0x411, float:1.459E-42)
            short r2 = (short) r2
            byte[] r8 = f9518c     // Catch:{ all -> 0x019a }
            r12 = 2385(0x951, float:3.342E-42)
            byte r8 = r8[r12]     // Catch:{ all -> 0x019a }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x019a }
            r12 = 4703(0x125f, float:6.59E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x019a }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x019a }
            m11815as(r2, r8, r12, r13)     // Catch:{ all -> 0x019a }
            r2 = 0
            r8 = r13[r2]     // Catch:{ all -> 0x019a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x019a }
            java.lang.Class r2 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x019a }
            r8 = 0
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r8)     // Catch:{ all -> 0x019a }
            java.lang.Object r2 = r2.newInstance(r8)     // Catch:{ all -> 0x019a }
            r1.f10022f = r2     // Catch:{ all -> 0x0552 }
        L_0x0196:
            r1.mo9125d(r7)     // Catch:{ all -> 0x0552 }
            goto L_0x015f
        L_0x019a:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r7 = r2.getCause()     // Catch:{ all -> 0x0552 }
            if (r7 == 0) goto L_0x01a3
            throw r7     // Catch:{ all -> 0x0552 }
        L_0x01a3:
            throw r2     // Catch:{ all -> 0x0552 }
        L_0x01a4:
            r1.mo9125d(r8)     // Catch:{ all -> 0x0552 }
            java.lang.Object r2 = r1.f10026j     // Catch:{ all -> 0x0552 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0552 }
            throw r2     // Catch:{ all -> 0x0552 }
        L_0x01ac:
            r2 = 0
            int r12 = android.graphics.Color.blue(r2)     // Catch:{ all -> 0x0552 }
            int r12 = r12 + 20121
            char r2 = (char) r12     // Catch:{ all -> 0x0552 }
            int r12 = android.view.ViewConfiguration.getFadingEdgeLength()     // Catch:{ all -> 0x0552 }
            int r12 = r12 >> r8
            int r12 = 242 - r12
            int r14 = android.view.ViewConfiguration.getFadingEdgeLength()     // Catch:{ all -> 0x0552 }
            int r8 = r14 >> 16
            int r8 = r8 + r7
            java.lang.Object r2 = com.facetec.sdk.C2854bp.m11559b(r2, r12, r8)     // Catch:{ all -> 0x0552 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x0552 }
            r7 = 0
            byte r8 = (byte) r7     // Catch:{ all -> 0x0552 }
            int r12 = r8 + 1
            byte r12 = (byte) r12     // Catch:{ all -> 0x0552 }
            int r14 = r12 + -1
            byte r14 = (byte) r14     // Catch:{ all -> 0x0552 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x0552 }
            m11817au(r8, r12, r14, r15)     // Catch:{ all -> 0x0552 }
            r8 = r15[r7]     // Catch:{ all -> 0x0552 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0552 }
            java.lang.reflect.Field r2 = r2.getField(r8)     // Catch:{ all -> 0x0552 }
            r7 = 0
            long r14 = r2.getLong(r7)     // Catch:{ all -> 0x0552 }
            r1.f10017a = r14     // Catch:{ all -> 0x0552 }
        L_0x01e4:
            r1.mo9125d(r13)     // Catch:{ all -> 0x0552 }
            goto L_0x015f
        L_0x01e9:
            r7 = -1
            r1.f10017a = r7     // Catch:{ all -> 0x0552 }
            goto L_0x01e4
        L_0x01ee:
            r1.mo9125d(r9)     // Catch:{ all -> 0x0552 }
            int r2 = r1.f10020d     // Catch:{ all -> 0x0552 }
            if (r2 != 0) goto L_0x01f9
            r2 = 11
            goto L_0x101e
        L_0x01f9:
            r2 = r3
            goto L_0x101e
        L_0x01fc:
            r2 = 257(0x101, float:3.6E-43)
            goto L_0x101e
        L_0x0200:
            r2 = 70
            goto L_0x101e
        L_0x0204:
            r7 = 2044(0x7fc, double:1.01E-320)
            r1.f10017a = r7     // Catch:{ all -> 0x0552 }
            goto L_0x01e4
        L_0x0209:
            r2 = 1037(0x40d, float:1.453E-42)
            short r2 = (short) r2
            int r7 = f9519d     // Catch:{ all -> 0x0245 }
            r7 = r7 & r12
            byte r7 = (byte) r7     // Catch:{ all -> 0x0245 }
            r8 = 4160(0x1040, float:5.83E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0245 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0245 }
            m11815as(r2, r7, r8, r12)     // Catch:{ all -> 0x0245 }
            r2 = 0
            r7 = r12[r2]     // Catch:{ all -> 0x0245 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0245 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0245 }
            short r8 = (short) r15     // Catch:{ all -> 0x0245 }
            byte[] r12 = f9518c     // Catch:{ all -> 0x0245 }
            byte r12 = r12[r2]     // Catch:{ all -> 0x0245 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0245 }
            r14 = 6214(0x1846, float:8.708E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0245 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x0245 }
            m11815as(r8, r12, r14, r15)     // Catch:{ all -> 0x0245 }
            r8 = r15[r2]     // Catch:{ all -> 0x0245 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0245 }
            r2 = 0
            java.lang.reflect.Method r7 = r7.getMethod(r8, r2)     // Catch:{ all -> 0x0245 }
            java.lang.Object r7 = r7.invoke(r2, r2)     // Catch:{ all -> 0x0245 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0245 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0245 }
            r1.f10017a = r7     // Catch:{ all -> 0x0552 }
            goto L_0x01e4
        L_0x0245:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r7 = r2.getCause()     // Catch:{ all -> 0x0552 }
            if (r7 == 0) goto L_0x024e
            throw r7     // Catch:{ all -> 0x0552 }
        L_0x024e:
            throw r2     // Catch:{ all -> 0x0552 }
        L_0x024f:
            int[] r2 = new int[r9]     // Catch:{ all -> 0x0552 }
            r8 = -681886879(0xffffffffd75b3b61, float:-2.41048077E14)
            r12 = 0
            r2[r12] = r8     // Catch:{ all -> 0x0552 }
            r8 = 2140825914(0x7f9a693a, float:NaN)
            r2[r6] = r8     // Catch:{ all -> 0x0552 }
            r8 = -2108119833(0xffffffff8258a4e7, float:-1.5916498E-37)
            r2[r11] = r8     // Catch:{ all -> 0x0552 }
            r8 = 915598901(0x3692ee35, float:4.37887E-6)
            r12 = 3
            r2[r12] = r8     // Catch:{ all -> 0x0552 }
            r8 = 1176581746(0x46213672, float:10317.611)
            r12 = 4
            r2[r12] = r8     // Catch:{ all -> 0x0552 }
            r8 = 5
            r12 = 1285049155(0x4c984b43, float:7.9845912E7)
            r2[r8] = r12     // Catch:{ all -> 0x0552 }
            r8 = 6
            r12 = -998993186(0xffffffffc47492de, float:-978.2948)
            r2[r8] = r12     // Catch:{ all -> 0x0552 }
            r8 = 7
            r12 = 85774633(0x51cd129, float:7.3735014E-36)
            r2[r8] = r12     // Catch:{ all -> 0x0552 }
            r8 = 1221389982(0x48ccee9e, float:419700.94)
            r2[r14] = r8     // Catch:{ all -> 0x0552 }
            r8 = 1490424852(0x58d61414, float:1.88305379E15)
            r12 = 9
            r2[r12] = r8     // Catch:{ all -> 0x0552 }
            r8 = 10
            r12 = -197080360(0xfffffffff440cad8, float:-6.1098337E31)
            r2[r8] = r12     // Catch:{ all -> 0x0552 }
            r8 = 11
            r12 = -215453808(0xfffffffff3286f90, float:-1.3344858E31)
            r2[r8] = r12     // Catch:{ all -> 0x0552 }
            r1.f10022f = r2     // Catch:{ all -> 0x0552 }
            goto L_0x0196
        L_0x029d:
            r2 = 1049(0x419, float:1.47E-42)
            short r2 = (short) r2
            int r7 = f9519d     // Catch:{ all -> 0x02dc }
            r7 = r7 & r12
            byte r7 = (byte) r7     // Catch:{ all -> 0x02dc }
            r8 = 6859(0x1acb, float:9.612E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x02dc }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x02dc }
            m11815as(r2, r7, r8, r12)     // Catch:{ all -> 0x02dc }
            r2 = 0
            r7 = r12[r2]     // Catch:{ all -> 0x02dc }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x02dc }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x02dc }
            r8 = 1050(0x41a, float:1.471E-42)
            short r12 = (short) r8     // Catch:{ all -> 0x02dc }
            byte[] r8 = f9518c     // Catch:{ all -> 0x02dc }
            byte r8 = r8[r2]     // Catch:{ all -> 0x02dc }
            byte r8 = (byte) r8     // Catch:{ all -> 0x02dc }
            r14 = 1875(0x753, float:2.627E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x02dc }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x02dc }
            m11815as(r12, r8, r14, r15)     // Catch:{ all -> 0x02dc }
            r8 = r15[r2]     // Catch:{ all -> 0x02dc }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x02dc }
            r2 = 0
            java.lang.reflect.Method r7 = r7.getMethod(r8, r2)     // Catch:{ all -> 0x02dc }
            java.lang.Object r7 = r7.invoke(r2, r2)     // Catch:{ all -> 0x02dc }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x02dc }
            long r7 = r7.longValue()     // Catch:{ all -> 0x02dc }
            r1.f10017a = r7     // Catch:{ all -> 0x0552 }
            goto L_0x01e4
        L_0x02dc:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r7 = r2.getCause()     // Catch:{ all -> 0x0552 }
            if (r7 == 0) goto L_0x02e5
            throw r7     // Catch:{ all -> 0x0552 }
        L_0x02e5:
            throw r2     // Catch:{ all -> 0x0552 }
        L_0x02e6:
            r1.f10018b = r11     // Catch:{ all -> 0x0552 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0552 }
            r2 = 27
            r1.mo9125d(r2)     // Catch:{ all -> 0x0552 }
            java.lang.Object r2 = r1.f10026j     // Catch:{ all -> 0x0552 }
            int[] r2 = (int[]) r2     // Catch:{ all -> 0x0552 }
            r8 = 9
            r1.mo9125d(r8)     // Catch:{ all -> 0x0552 }
            int r8 = r1.f10020d     // Catch:{ all -> 0x0552 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0552 }
            m11816at(r2, r8, r12)     // Catch:{ all -> 0x0552 }
            r2 = 0
            r8 = r12[r2]     // Catch:{ all -> 0x0552 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0552 }
            r1.f10022f = r8     // Catch:{ all -> 0x0552 }
            goto L_0x0196
        L_0x0309:
            r1.f10018b = r6     // Catch:{ all -> 0x0552 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0552 }
            r2 = 27
            r1.mo9125d(r2)     // Catch:{ all -> 0x0552 }
            java.lang.Object r2 = r1.f10026j     // Catch:{ all -> 0x0552 }
            byte[] r8 = f9518c     // Catch:{ all -> 0x034e }
            r12 = 2385(0x951, float:3.342E-42)
            byte r13 = r8[r12]     // Catch:{ all -> 0x034e }
            int r12 = -r13
            byte r12 = (byte) r12     // Catch:{ all -> 0x034e }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x034e }
            m11815as(r5, r12, r10, r13)     // Catch:{ all -> 0x034e }
            r12 = 0
            r13 = r13[r12]     // Catch:{ all -> 0x034e }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x034e }
            java.lang.Class r12 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x034e }
            r13 = 1061(0x425, float:1.487E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x034e }
            r14 = 1801(0x709, float:2.524E-42)
            byte r8 = r8[r14]     // Catch:{ all -> 0x034e }
            int r8 = r8 + r6
            byte r8 = (byte) r8     // Catch:{ all -> 0x034e }
            r14 = 5086(0x13de, float:7.127E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x034e }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x034e }
            m11815as(r13, r8, r14, r15)     // Catch:{ all -> 0x034e }
            r8 = 0
            r13 = r15[r8]     // Catch:{ all -> 0x034e }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x034e }
            r8 = 0
            java.lang.reflect.Method r12 = r12.getMethod(r13, r8)     // Catch:{ all -> 0x034e }
            java.lang.Object r2 = r12.invoke(r2, r8)     // Catch:{ all -> 0x034e }
            r1.f10022f = r2     // Catch:{ all -> 0x0552 }
            goto L_0x0196
        L_0x034e:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r7 = r2.getCause()     // Catch:{ all -> 0x0552 }
            if (r7 == 0) goto L_0x0357
            throw r7     // Catch:{ all -> 0x0552 }
        L_0x0357:
            throw r2     // Catch:{ all -> 0x0552 }
        L_0x0358:
            java.lang.String r2 = ""
            r1.f10022f = r2     // Catch:{ all -> 0x0552 }
            goto L_0x0196
        L_0x035e:
            r1.f10018b = r6     // Catch:{ all -> 0x0552 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0552 }
            r2 = 27
            r1.mo9125d(r2)     // Catch:{ all -> 0x0552 }
            java.lang.Object r2 = r1.f10026j     // Catch:{ all -> 0x0552 }
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x03cb }
            r8 = 0
            r7[r8] = r2     // Catch:{ all -> 0x03cb }
            r2 = 1043(0x413, float:1.462E-42)
            short r2 = (short) r2     // Catch:{ all -> 0x03cb }
            int r8 = f9519d     // Catch:{ all -> 0x03cb }
            r12 = r8 & 125(0x7d, float:1.75E-43)
            byte r12 = (byte) r12     // Catch:{ all -> 0x03cb }
            r13 = 1826(0x722, float:2.559E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x03cb }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x03cb }
            m11815as(r2, r12, r13, r14)     // Catch:{ all -> 0x03cb }
            r2 = 0
            r12 = r14[r2]     // Catch:{ all -> 0x03cb }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x03cb }
            java.lang.Class r2 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x03cb }
            r12 = 1053(0x41d, float:1.476E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x03cb }
            r8 = r8 & 125(0x7d, float:1.75E-43)
            byte r8 = (byte) r8     // Catch:{ all -> 0x03cb }
            r13 = r8 | 3080(0xc08, float:4.316E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x03cb }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x03cb }
            m11815as(r12, r8, r13, r14)     // Catch:{ all -> 0x03cb }
            r8 = 0
            r12 = r14[r8]     // Catch:{ all -> 0x03cb }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x03cb }
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ all -> 0x03cb }
            byte[] r13 = f9518c     // Catch:{ all -> 0x03cb }
            r14 = 2385(0x951, float:3.342E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x03cb }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x03cb }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x03cb }
            m11815as(r5, r13, r10, r14)     // Catch:{ all -> 0x03cb }
            r13 = 0
            r14 = r14[r13]     // Catch:{ all -> 0x03cb }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x03cb }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x03cb }
            r8[r13] = r14     // Catch:{ all -> 0x03cb }
            java.lang.reflect.Method r2 = r2.getMethod(r12, r8)     // Catch:{ all -> 0x03cb }
            r8 = 0
            java.lang.Object r2 = r2.invoke(r8, r7)     // Catch:{ all -> 0x03cb }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x03cb }
            int r2 = r2.intValue()     // Catch:{ all -> 0x03cb }
            r1.f10018b = r2     // Catch:{ all -> 0x0552 }
        L_0x03c6:
            r1.mo9125d(r6)     // Catch:{ all -> 0x0552 }
            goto L_0x015f
        L_0x03cb:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r7 = r2.getCause()     // Catch:{ all -> 0x0552 }
            if (r7 == 0) goto L_0x03d4
            throw r7     // Catch:{ all -> 0x0552 }
        L_0x03d4:
            throw r2     // Catch:{ all -> 0x0552 }
        L_0x03d5:
            r2 = 3
            r1.f10018b = r2     // Catch:{ all -> 0x0552 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0552 }
            r2 = 9
            r1.mo9125d(r2)     // Catch:{ all -> 0x0552 }
            int r8 = r1.f10020d     // Catch:{ all -> 0x0552 }
            r12 = 27
            r1.mo9125d(r12)     // Catch:{ all -> 0x0552 }
            java.lang.Object r12 = r1.f10026j     // Catch:{ all -> 0x0552 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0552 }
            r1.mo9125d(r2)     // Catch:{ all -> 0x0552 }
            int r2 = r1.f10020d     // Catch:{ all -> 0x0552 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x0552 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x0552 }
            m11818av(r8, r12, r2, r13)     // Catch:{ all -> 0x0552 }
            r2 = 0
            r8 = r13[r2]     // Catch:{ all -> 0x0552 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0552 }
            r1.f10022f = r8     // Catch:{ all -> 0x0552 }
            goto L_0x0196
        L_0x03ff:
            r1.f10018b = r6     // Catch:{ all -> 0x0552 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0552 }
            r2 = 27
            r1.mo9125d(r2)     // Catch:{ all -> 0x0552 }
            java.lang.Object r2 = r1.f10026j     // Catch:{ all -> 0x0552 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0552 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0552 }
            r1.f10022f = r2     // Catch:{ all -> 0x0552 }
            goto L_0x0196
        L_0x0415:
            r2 = 1037(0x40d, float:1.453E-42)
            short r2 = (short) r2
            int r7 = f9519d     // Catch:{ all -> 0x0454 }
            r7 = r7 & r12
            byte r7 = (byte) r7     // Catch:{ all -> 0x0454 }
            r8 = 4160(0x1040, float:5.83E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0454 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0454 }
            m11815as(r2, r7, r8, r12)     // Catch:{ all -> 0x0454 }
            r2 = 0
            r7 = r12[r2]     // Catch:{ all -> 0x0454 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0454 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0454 }
            r8 = 1050(0x41a, float:1.471E-42)
            short r12 = (short) r8     // Catch:{ all -> 0x0454 }
            byte[] r8 = f9518c     // Catch:{ all -> 0x0454 }
            byte r8 = r8[r2]     // Catch:{ all -> 0x0454 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0454 }
            r13 = 2348(0x92c, float:3.29E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0454 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0454 }
            m11815as(r12, r8, r13, r14)     // Catch:{ all -> 0x0454 }
            r8 = r14[r2]     // Catch:{ all -> 0x0454 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0454 }
            r2 = 0
            java.lang.reflect.Method r7 = r7.getMethod(r8, r2)     // Catch:{ all -> 0x0454 }
            java.lang.Object r7 = r7.invoke(r2, r2)     // Catch:{ all -> 0x0454 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0454 }
            int r2 = r7.intValue()     // Catch:{ all -> 0x0454 }
            r1.f10018b = r2     // Catch:{ all -> 0x0552 }
            goto L_0x03c6
        L_0x0454:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r7 = r2.getCause()     // Catch:{ all -> 0x0552 }
            if (r7 == 0) goto L_0x045d
            throw r7     // Catch:{ all -> 0x0552 }
        L_0x045d:
            throw r2     // Catch:{ all -> 0x0552 }
        L_0x045e:
            java.lang.String r2 = "\r0\u0005\f\u0003.\u0015\u0005\u00050\u001b\u0005\u0010'ϡ"
            r1.f10022f = r2     // Catch:{ all -> 0x0552 }
            goto L_0x0196
        L_0x0464:
            r2 = 1037(0x40d, float:1.453E-42)
            short r2 = (short) r2
            int r7 = f9519d     // Catch:{ all -> 0x04a3 }
            r7 = r7 & r12
            byte r7 = (byte) r7     // Catch:{ all -> 0x04a3 }
            r8 = 4160(0x1040, float:5.83E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x04a3 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x04a3 }
            m11815as(r2, r7, r8, r12)     // Catch:{ all -> 0x04a3 }
            r2 = 0
            r7 = r12[r2]     // Catch:{ all -> 0x04a3 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x04a3 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x04a3 }
            r8 = 1044(0x414, float:1.463E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x04a3 }
            byte[] r12 = f9518c     // Catch:{ all -> 0x04a3 }
            byte r12 = r12[r2]     // Catch:{ all -> 0x04a3 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x04a3 }
            r13 = 6478(0x194e, float:9.078E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x04a3 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x04a3 }
            m11815as(r8, r12, r13, r14)     // Catch:{ all -> 0x04a3 }
            r8 = r14[r2]     // Catch:{ all -> 0x04a3 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x04a3 }
            r2 = 0
            java.lang.reflect.Method r7 = r7.getMethod(r8, r2)     // Catch:{ all -> 0x04a3 }
            java.lang.Object r7 = r7.invoke(r2, r2)     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x04a3 }
            int r2 = r7.intValue()     // Catch:{ all -> 0x04a3 }
            r1.f10018b = r2     // Catch:{ all -> 0x0552 }
            goto L_0x03c6
        L_0x04a3:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r7 = r2.getCause()     // Catch:{ all -> 0x0552 }
            if (r7 == 0) goto L_0x04ac
            throw r7     // Catch:{ all -> 0x0552 }
        L_0x04ac:
            throw r2     // Catch:{ all -> 0x0552 }
        L_0x04ad:
            r1.f10018b = r11     // Catch:{ all -> 0x0552 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0552 }
            r2 = 103(0x67, float:1.44E-43)
            r1.mo9125d(r2)     // Catch:{ all -> 0x0552 }
            float r2 = r1.f10024h     // Catch:{ all -> 0x0552 }
            r7 = 103(0x67, float:1.44E-43)
            r1.mo9125d(r7)     // Catch:{ all -> 0x0552 }
            float r7 = r1.f10024h     // Catch:{ all -> 0x0552 }
            java.lang.Object[] r8 = new java.lang.Object[r11]     // Catch:{ all -> 0x051e }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ all -> 0x051e }
            r8[r6] = r7     // Catch:{ all -> 0x051e }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x051e }
            r7 = 0
            r8[r7] = r2     // Catch:{ all -> 0x051e }
            r2 = 1044(0x414, float:1.463E-42)
            short r2 = (short) r2     // Catch:{ all -> 0x051e }
            int r7 = f9519d     // Catch:{ all -> 0x051e }
            r7 = r7 & r12
            byte r7 = (byte) r7     // Catch:{ all -> 0x051e }
            r12 = 4307(0x10d3, float:6.035E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x051e }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x051e }
            m11815as(r2, r7, r12, r13)     // Catch:{ all -> 0x051e }
            r2 = 0
            r7 = r13[r2]     // Catch:{ all -> 0x051e }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x051e }
            java.lang.Class r2 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x051e }
            r7 = 1061(0x425, float:1.487E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x051e }
            byte[] r12 = f9518c     // Catch:{ all -> 0x051e }
            r13 = 609(0x261, float:8.53E-43)
            byte r12 = r12[r13]     // Catch:{ all -> 0x051e }
            byte r12 = (byte) r12     // Catch:{ all -> 0x051e }
            r13 = 1452(0x5ac, float:2.035E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x051e }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x051e }
            m11815as(r7, r12, r13, r14)     // Catch:{ all -> 0x051e }
            r7 = 0
            r12 = r14[r7]     // Catch:{ all -> 0x051e }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x051e }
            java.lang.Class[] r13 = new java.lang.Class[r11]     // Catch:{ all -> 0x051e }
            java.lang.Class r14 = java.lang.Float.TYPE     // Catch:{ all -> 0x051e }
            r13[r7] = r14     // Catch:{ all -> 0x051e }
            r13[r6] = r14     // Catch:{ all -> 0x051e }
            java.lang.reflect.Method r2 = r2.getMethod(r12, r13)     // Catch:{ all -> 0x051e }
            r7 = 0
            java.lang.Object r2 = r2.invoke(r7, r8)     // Catch:{ all -> 0x051e }
            java.lang.Float r2 = (java.lang.Float) r2     // Catch:{ all -> 0x051e }
            float r2 = r2.floatValue()     // Catch:{ all -> 0x051e }
            r1.f10021e = r2     // Catch:{ all -> 0x0552 }
            r2 = 104(0x68, float:1.46E-43)
            r1.mo9125d(r2)     // Catch:{ all -> 0x0552 }
            goto L_0x015f
        L_0x051e:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r7 = r2.getCause()     // Catch:{ all -> 0x0552 }
            if (r7 == 0) goto L_0x0527
            throw r7     // Catch:{ all -> 0x0552 }
        L_0x0527:
            throw r2     // Catch:{ all -> 0x0552 }
        L_0x0528:
            r2 = 3
            r1.f10018b = r2     // Catch:{ all -> 0x0552 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0552 }
            r2 = 27
            r1.mo9125d(r2)     // Catch:{ all -> 0x0552 }
            java.lang.Object r2 = r1.f10026j     // Catch:{ all -> 0x0552 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0552 }
            r8 = 9
            r1.mo9125d(r8)     // Catch:{ all -> 0x0552 }
            int r12 = r1.f10020d     // Catch:{ all -> 0x0552 }
            r1.mo9125d(r8)     // Catch:{ all -> 0x0552 }
            int r8 = r1.f10020d     // Catch:{ all -> 0x0552 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0552 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x0552 }
            m11820ax(r2, r12, r8, r13)     // Catch:{ all -> 0x0552 }
            r2 = 0
            r8 = r13[r2]     // Catch:{ all -> 0x0552 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0552 }
            r1.f10022f = r8     // Catch:{ all -> 0x0552 }
            goto L_0x0196
        L_0x0552:
            r0 = move-exception
            r7 = r0
            r18 = r4
            r4 = r11
            r2 = r17
            goto L_0x0b2b
        L_0x055b:
            r2 = 1049(0x419, float:1.47E-42)
            short r2 = (short) r2
            int r7 = f9519d     // Catch:{ all -> 0x05a0 }
            r7 = r7 & r12
            byte r7 = (byte) r7     // Catch:{ all -> 0x05a0 }
            r8 = 6859(0x1acb, float:9.612E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x05a0 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x05a0 }
            m11815as(r2, r7, r8, r12)     // Catch:{ all -> 0x05a0 }
            r2 = 0
            r7 = r12[r2]     // Catch:{ all -> 0x05a0 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x05a0 }
            java.lang.Class r2 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x05a0 }
            byte[] r7 = f9518c     // Catch:{ all -> 0x05a0 }
            r8 = 2124(0x84c, float:2.976E-42)
            byte r7 = r7[r8]     // Catch:{ all -> 0x05a0 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x05a0 }
            r8 = 4352(0x1100, float:6.098E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x05a0 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x05a0 }
            r15 = r17
            m11815as(r15, r7, r8, r12)     // Catch:{ all -> 0x059e }
            r7 = 0
            r8 = r12[r7]     // Catch:{ all -> 0x059e }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x059e }
            r7 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r8, r7)     // Catch:{ all -> 0x059e }
            java.lang.Object r2 = r2.invoke(r7, r7)     // Catch:{ all -> 0x059e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x059e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x059e }
            r1.f10018b = r2     // Catch:{ all -> 0x0619 }
            r1.mo9125d(r6)     // Catch:{ all -> 0x0619 }
            goto L_0x05c1
        L_0x059e:
            r0 = move-exception
            goto L_0x05a3
        L_0x05a0:
            r0 = move-exception
            r15 = r17
        L_0x05a3:
            r2 = r0
            java.lang.Throwable r7 = r2.getCause()     // Catch:{ all -> 0x0619 }
            if (r7 == 0) goto L_0x05ab
            throw r7     // Catch:{ all -> 0x0619 }
        L_0x05ab:
            throw r2     // Catch:{ all -> 0x0619 }
        L_0x05ac:
            r15 = r17
            r1.f10018b = r6     // Catch:{ all -> 0x0619 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0619 }
            r2 = 9
            r1.mo9125d(r2)     // Catch:{ all -> 0x0619 }
            int r2 = r1.f10020d     // Catch:{ all -> 0x0619 }
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ all -> 0x0619 }
            r1.f10022f = r2     // Catch:{ all -> 0x0619 }
        L_0x05be:
            r1.mo9125d(r7)     // Catch:{ all -> 0x0619 }
        L_0x05c1:
            r18 = r4
            goto L_0x06e4
        L_0x05c5:
            r15 = r17
            r2 = 3
            r1.f10018b = r2     // Catch:{ all -> 0x0619 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0619 }
            r2 = 27
            r1.mo9125d(r2)     // Catch:{ all -> 0x0619 }
            java.lang.Object r8 = r1.f10026j     // Catch:{ all -> 0x0619 }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x0619 }
            r1.mo9125d(r2)     // Catch:{ all -> 0x0619 }
            java.lang.Object r12 = r1.f10026j     // Catch:{ all -> 0x0619 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0619 }
            r1.mo9125d(r2)     // Catch:{ all -> 0x0619 }
            java.lang.Object r2 = r1.f10026j     // Catch:{ all -> 0x0619 }
            java.lang.Class[] r2 = (java.lang.Class[]) r2     // Catch:{ all -> 0x0619 }
            java.lang.reflect.Method r2 = r8.getDeclaredMethod(r12, r2)     // Catch:{ all -> 0x0619 }
            r1.f10022f = r2     // Catch:{ all -> 0x0619 }
            goto L_0x05be
        L_0x05eb:
            r15 = r17
            r1.f10018b = r6     // Catch:{ all -> 0x0619 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0619 }
            r2 = 9
            r1.mo9125d(r2)     // Catch:{ all -> 0x0619 }
            int r2 = r1.f10020d     // Catch:{ all -> 0x0619 }
            byte[] r8 = f9518c     // Catch:{ all -> 0x0619 }
            r12 = 2385(0x951, float:3.342E-42)
            byte r8 = r8[r12]     // Catch:{ all -> 0x0619 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0619 }
            r12 = 1246(0x4de, float:1.746E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0619 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x0619 }
            m11815as(r5, r8, r12, r13)     // Catch:{ all -> 0x0619 }
            r8 = 0
            r12 = r13[r8]     // Catch:{ all -> 0x0619 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0619 }
            java.lang.Class r8 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0619 }
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r8, r2)     // Catch:{ all -> 0x0619 }
            r1.f10022f = r2     // Catch:{ all -> 0x0619 }
            goto L_0x05be
        L_0x0619:
            r0 = move-exception
            r7 = r0
            r18 = r4
            goto L_0x06cc
        L_0x061f:
            r15 = r17
            r2 = 3
            r1.f10018b = r2     // Catch:{ all -> 0x06c8 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x06c8 }
            r2 = 27
            r1.mo9125d(r2)     // Catch:{ all -> 0x06c8 }
            java.lang.Object r8 = r1.f10026j     // Catch:{ all -> 0x06c8 }
            r1.mo9125d(r2)     // Catch:{ all -> 0x06c8 }
            java.lang.Object r12 = r1.f10026j     // Catch:{ all -> 0x06c8 }
            r1.mo9125d(r2)     // Catch:{ all -> 0x06c8 }
            java.lang.Object r2 = r1.f10026j     // Catch:{ all -> 0x06c8 }
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ all -> 0x06bc }
            r13[r6] = r2     // Catch:{ all -> 0x06bc }
            r2 = 0
            r13[r2] = r12     // Catch:{ all -> 0x06bc }
            r2 = 1043(0x413, float:1.462E-42)
            short r2 = (short) r2     // Catch:{ all -> 0x06bc }
            byte[] r12 = f9518c     // Catch:{ all -> 0x06bc }
            r14 = 2385(0x951, float:3.342E-42)
            byte r9 = r12[r14]     // Catch:{ all -> 0x06bc }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x06bc }
            r14 = 3166(0xc5e, float:4.437E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x06bc }
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x06bc }
            m11815as(r2, r9, r14, r7)     // Catch:{ all -> 0x06bc }
            r2 = 0
            r7 = r7[r2]     // Catch:{ all -> 0x06bc }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x06bc }
            java.lang.Class r2 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x06bc }
            r7 = 1061(0x425, float:1.487E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x06bc }
            r9 = 1801(0x709, float:2.524E-42)
            byte r9 = r12[r9]     // Catch:{ all -> 0x06bc }
            int r9 = r9 + r6
            byte r9 = (byte) r9     // Catch:{ all -> 0x06bc }
            r14 = 6908(0x1afc, float:9.68E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x06bc }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x06bc }
            m11815as(r7, r9, r14, r11)     // Catch:{ all -> 0x06bc }
            r7 = 0
            r9 = r11[r7]     // Catch:{ all -> 0x06bc }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x06bc }
            r7 = 2
            java.lang.Class[] r11 = new java.lang.Class[r7]     // Catch:{ all -> 0x06bc }
            r7 = 2385(0x951, float:3.342E-42)
            byte r14 = r12[r7]     // Catch:{ all -> 0x06bc }
            int r7 = -r14
            byte r7 = (byte) r7
            r14 = 1246(0x4de, float:1.746E-42)
            short r14 = (short) r14
            r18 = r4
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x06ba }
            m11815as(r5, r7, r14, r4)     // Catch:{ all -> 0x06ba }
            r7 = 0
            r4 = r4[r7]     // Catch:{ all -> 0x06ba }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x06ba }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x06ba }
            r11[r7] = r4     // Catch:{ all -> 0x06ba }
            r4 = 1048(0x418, float:1.469E-42)
            short r7 = (short) r4     // Catch:{ all -> 0x06ba }
            r4 = 3315(0xcf3, float:4.645E-42)
            byte r4 = r12[r4]     // Catch:{ all -> 0x06ba }
            byte r4 = (byte) r4     // Catch:{ all -> 0x06ba }
            r12 = 4637(0x121d, float:6.498E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x06ba }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x06ba }
            m11815as(r7, r4, r12, r14)     // Catch:{ all -> 0x06ba }
            r4 = 0
            r7 = r14[r4]     // Catch:{ all -> 0x06ba }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x06ba }
            java.lang.Class r4 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x06ba }
            r11[r6] = r4     // Catch:{ all -> 0x06ba }
            java.lang.reflect.Method r2 = r2.getMethod(r9, r11)     // Catch:{ all -> 0x06ba }
            java.lang.Object r2 = r2.invoke(r8, r13)     // Catch:{ all -> 0x06ba }
            r1.f10022f = r2     // Catch:{ all -> 0x0899 }
            r2 = 24
        L_0x06b6:
            r1.mo9125d(r2)     // Catch:{ all -> 0x0899 }
            goto L_0x06e4
        L_0x06ba:
            r0 = move-exception
            goto L_0x06bf
        L_0x06bc:
            r0 = move-exception
            r18 = r4
        L_0x06bf:
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0899 }
            if (r4 == 0) goto L_0x06c7
            throw r4     // Catch:{ all -> 0x0899 }
        L_0x06c7:
            throw r2     // Catch:{ all -> 0x0899 }
        L_0x06c8:
            r0 = move-exception
            r18 = r4
            r7 = r0
        L_0x06cc:
            r4 = r11
            goto L_0x084c
        L_0x06cf:
            r18 = r4
            r15 = r17
            r1.f10018b = r6     // Catch:{ all -> 0x0899 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0899 }
            r2 = 27
            r1.mo9125d(r2)     // Catch:{ all -> 0x0899 }
            java.lang.Object r2 = r1.f10026j     // Catch:{ all -> 0x0899 }
            r1.f10022f = r2     // Catch:{ all -> 0x0899 }
            r2 = 24
            goto L_0x06b6
        L_0x06e4:
            r2 = r15
            goto L_0x0163
        L_0x06e7:
            r18 = r4
            r15 = r17
            r1.f10018b = r6     // Catch:{ all -> 0x0899 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0899 }
            r2 = 27
            r1.mo9125d(r2)     // Catch:{ all -> 0x0899 }
            java.lang.Object r2 = r1.f10026j     // Catch:{ all -> 0x0899 }
            byte[] r4 = f9518c     // Catch:{ all -> 0x073a }
            r7 = 2385(0x951, float:3.342E-42)
            byte r8 = r4[r7]     // Catch:{ all -> 0x073a }
            int r7 = -r8
            byte r7 = (byte) r7     // Catch:{ all -> 0x073a }
            r8 = 5275(0x149b, float:7.392E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x073a }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x073a }
            m11815as(r5, r7, r8, r9)     // Catch:{ all -> 0x073a }
            r7 = 0
            r8 = r9[r7]     // Catch:{ all -> 0x073a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x073a }
            java.lang.Class r7 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x073a }
            r8 = 1058(0x422, float:1.483E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x073a }
            r9 = 609(0x261, float:8.53E-43)
            byte r4 = r4[r9]     // Catch:{ all -> 0x073a }
            byte r4 = (byte) r4     // Catch:{ all -> 0x073a }
            r9 = 5690(0x163a, float:7.973E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x073a }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x073a }
            m11815as(r8, r4, r9, r11)     // Catch:{ all -> 0x073a }
            r4 = 0
            r8 = r11[r4]     // Catch:{ all -> 0x073a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x073a }
            r4 = 0
            java.lang.reflect.Method r7 = r7.getMethod(r8, r4)     // Catch:{ all -> 0x073a }
            java.lang.Object r2 = r7.invoke(r2, r4)     // Catch:{ all -> 0x073a }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x073a }
            long r7 = r2.longValue()     // Catch:{ all -> 0x073a }
            r1.f10017a = r7     // Catch:{ all -> 0x0899 }
            r1.mo9125d(r13)     // Catch:{ all -> 0x0899 }
            goto L_0x06e4
        L_0x073a:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0899 }
            if (r4 == 0) goto L_0x0743
            throw r4     // Catch:{ all -> 0x0899 }
        L_0x0743:
            throw r2     // Catch:{ all -> 0x0899 }
        L_0x0744:
            r18 = r4
            r15 = r17
            r2 = 111(0x6f, float:1.56E-43)
            r1.mo9125d(r2)     // Catch:{ all -> 0x0899 }
            int r2 = r1.f10020d     // Catch:{ all -> 0x0899 }
            if (r2 != 0) goto L_0x0754
            r2 = 66
            goto L_0x0755
        L_0x0754:
            r2 = r3
        L_0x0755:
            r17 = r15
            r4 = r18
            goto L_0x101e
        L_0x075b:
            r18 = r4
            r15 = r17
            r2 = 283(0x11b, float:3.97E-43)
            goto L_0x101e
        L_0x0763:
            r18 = r4
            r15 = r17
            r2 = 281(0x119, float:3.94E-43)
            goto L_0x101e
        L_0x076b:
            r18 = r4
            r15 = r17
            int r2 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()     // Catch:{ all -> 0x0899 }
            r4 = 24
            int r2 = r2 >> r4
            int r2 = 20121 - r2
            char r2 = (char) r2     // Catch:{ all -> 0x0899 }
            float r4 = android.media.AudioTrack.getMaxVolume()     // Catch:{ all -> 0x0899 }
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            int r4 = r4 + 241
            int r7 = android.os.Process.myTid()     // Catch:{ all -> 0x0899 }
            int r7 = r7 >> 22
            r8 = 24
            int r7 = r7 + r8
            java.lang.Object r2 = com.facetec.sdk.C2854bp.m11559b(r2, r4, r7)     // Catch:{ all -> 0x0899 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x0899 }
            r4 = 0
            byte r7 = (byte) r4     // Catch:{ all -> 0x0899 }
            int r8 = r7 + 2
            byte r8 = (byte) r8     // Catch:{ all -> 0x0899 }
            int r9 = r8 + -2
            byte r9 = (byte) r9     // Catch:{ all -> 0x0899 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0899 }
            m11817au(r7, r8, r9, r11)     // Catch:{ all -> 0x0899 }
            r7 = r11[r4]     // Catch:{ all -> 0x0899 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0899 }
            java.lang.reflect.Field r2 = r2.getField(r7)     // Catch:{ all -> 0x0899 }
            r4 = 0
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x0899 }
            r1.f10022f = r2     // Catch:{ all -> 0x0899 }
            r2 = 24
            goto L_0x06b6
        L_0x07b1:
            r18 = r4
            r15 = r17
            r2 = 133(0x85, float:1.86E-43)
            goto L_0x101e
        L_0x07b9:
            r18 = r4
            r2 = r11
            r15 = r17
            r1.f10018b = r2     // Catch:{ all -> 0x0849 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0899 }
            r2 = 9
            r1.mo9125d(r2)     // Catch:{ all -> 0x0899 }
            int r4 = r1.f10020d     // Catch:{ all -> 0x0899 }
            r1.mo9125d(r2)     // Catch:{ all -> 0x0899 }
            int r2 = r1.f10020d     // Catch:{ all -> 0x0899 }
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x083f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x083f }
            r8[r6] = r2     // Catch:{ all -> 0x083f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x083f }
            r4 = 0
            r8[r4] = r2     // Catch:{ all -> 0x083f }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x083f }
            r7 = 140061824(0x8592c80, float:6.535337E-34)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x083f }
            java.lang.Object r7 = r2.get(r7)     // Catch:{ all -> 0x083f }
            if (r7 == 0) goto L_0x07ef
            goto L_0x0832
        L_0x07ef:
            int r7 = android.view.View.combineMeasuredStates(r4, r4)     // Catch:{ all -> 0x083f }
            int r7 = r7 + 20121
            char r7 = (char) r7     // Catch:{ all -> 0x083f }
            float r9 = android.util.TypedValue.complexToFloat(r4)     // Catch:{ all -> 0x083f }
            r4 = 0
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            int r4 = r4 + 242
            r11 = 0
            int r9 = android.widget.ExpandableListView.getPackedPositionGroup(r11)     // Catch:{ all -> 0x083f }
            r11 = 24
            int r9 = r9 + r11
            java.lang.Object r4 = com.facetec.sdk.C2854bp.m11559b(r7, r4, r9)     // Catch:{ all -> 0x083f }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x083f }
            r7 = 0
            byte r9 = (byte) r7     // Catch:{ all -> 0x083f }
            byte r11 = (byte) r9     // Catch:{ all -> 0x083f }
            byte r12 = (byte) r11     // Catch:{ all -> 0x083f }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x083f }
            m11817au(r9, r11, r12, r13)     // Catch:{ all -> 0x083f }
            r9 = r13[r7]     // Catch:{ all -> 0x083f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x083f }
            r11 = 2
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch:{ all -> 0x083f }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ all -> 0x083f }
            r12[r7] = r11     // Catch:{ all -> 0x083f }
            r12[r6] = r11     // Catch:{ all -> 0x083f }
            java.lang.reflect.Method r7 = r4.getMethod(r9, r12)     // Catch:{ all -> 0x083f }
            r4 = 140061824(0x8592c80, float:6.535337E-34)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x083f }
            r2.put(r4, r7)     // Catch:{ all -> 0x083f }
        L_0x0832:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch:{ all -> 0x083f }
            r2 = 0
            java.lang.Object r4 = r7.invoke(r2, r8)     // Catch:{ all -> 0x083f }
            r1.f10022f = r4     // Catch:{ all -> 0x0899 }
            r2 = 24
            goto L_0x06b6
        L_0x083f:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0899 }
            if (r4 == 0) goto L_0x0848
            throw r4     // Catch:{ all -> 0x0899 }
        L_0x0848:
            throw r2     // Catch:{ all -> 0x0899 }
        L_0x0849:
            r0 = move-exception
            r7 = r0
            r4 = r2
        L_0x084c:
            r2 = r15
            goto L_0x0b2b
        L_0x084f:
            r18 = r4
            r15 = r17
            r1.f10018b = r6     // Catch:{ all -> 0x0899 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0899 }
            r2 = 27
            r1.mo9125d(r2)     // Catch:{ all -> 0x0899 }
            java.lang.Object r2 = r1.f10026j     // Catch:{ all -> 0x0899 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x0899 }
            r4 = 0
            int r7 = android.graphics.Color.alpha(r4)     // Catch:{ all -> 0x0899 }
            int r7 = 20121 - r7
            char r7 = (char) r7     // Catch:{ all -> 0x0899 }
            int r9 = android.graphics.Color.green(r4)     // Catch:{ all -> 0x0899 }
            int r9 = 242 - r9
            int r11 = android.view.ViewConfiguration.getScrollBarFadeDuration()     // Catch:{ all -> 0x0899 }
            int r8 = r11 >> 16
            r11 = 24
            int r8 = 24 - r8
            java.lang.Object r7 = com.facetec.sdk.C2854bp.m11559b(r7, r9, r8)     // Catch:{ all -> 0x0899 }
            java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ all -> 0x0899 }
            byte r8 = (byte) r4     // Catch:{ all -> 0x0899 }
            int r9 = r8 + 2
            byte r9 = (byte) r9     // Catch:{ all -> 0x0899 }
            int r11 = r9 + -2
            byte r11 = (byte) r11     // Catch:{ all -> 0x0899 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0899 }
            m11817au(r8, r9, r11, r12)     // Catch:{ all -> 0x0899 }
            r8 = r12[r4]     // Catch:{ all -> 0x0899 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0899 }
            java.lang.reflect.Field r4 = r7.getField(r8)     // Catch:{ all -> 0x0899 }
            r7 = 0
            r4.set(r7, r2)     // Catch:{ all -> 0x0899 }
            goto L_0x06e4
        L_0x0899:
            r0 = move-exception
            r7 = r0
            r2 = r15
            goto L_0x0b2a
        L_0x089e:
            r18 = r4
            r2 = r17
            r4 = 3
            r1.f10018b = r4     // Catch:{ all -> 0x0b28 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0b28 }
            r4 = 27
            r1.mo9125d(r4)     // Catch:{ all -> 0x0b28 }
            java.lang.Object r4 = r1.f10026j     // Catch:{ all -> 0x0b28 }
            r7 = 9
            r1.mo9125d(r7)     // Catch:{ all -> 0x0b28 }
            int r8 = r1.f10020d     // Catch:{ all -> 0x0b28 }
            char r8 = (char) r8     // Catch:{ all -> 0x0b28 }
            r1.mo9125d(r7)     // Catch:{ all -> 0x0b28 }
            int r7 = r1.f10020d     // Catch:{ all -> 0x0b28 }
            r9 = 3
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ all -> 0x0937 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0937 }
            r9 = 2
            r11[r9] = r7     // Catch:{ all -> 0x0937 }
            java.lang.Character r7 = java.lang.Character.valueOf(r8)     // Catch:{ all -> 0x0937 }
            r11[r6] = r7     // Catch:{ all -> 0x0937 }
            r7 = 0
            r11[r7] = r4     // Catch:{ all -> 0x0937 }
            short r4 = (short) r15     // Catch:{ all -> 0x0937 }
            int r7 = f9519d     // Catch:{ all -> 0x0937 }
            r7 = r7 & r12
            byte r7 = (byte) r7     // Catch:{ all -> 0x0937 }
            r8 = 4724(0x1274, float:6.62E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0937 }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x0937 }
            m11815as(r4, r7, r8, r9)     // Catch:{ all -> 0x0937 }
            r7 = 0
            r8 = r9[r7]     // Catch:{ all -> 0x0937 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0937 }
            java.lang.Class r7 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0937 }
            r8 = 1056(0x420, float:1.48E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0937 }
            byte[] r9 = f9518c     // Catch:{ all -> 0x0937 }
            r12 = 609(0x261, float:8.53E-43)
            byte r12 = r9[r12]     // Catch:{ all -> 0x0937 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0937 }
            r13 = r12 | 1192(0x4a8, float:1.67E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0937 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0937 }
            m11815as(r8, r12, r13, r14)     // Catch:{ all -> 0x0937 }
            r8 = 0
            r12 = r14[r8]     // Catch:{ all -> 0x0937 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0937 }
            r8 = 3
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch:{ all -> 0x0937 }
            r13 = 2385(0x951, float:3.342E-42)
            byte r9 = r9[r13]     // Catch:{ all -> 0x0937 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0937 }
            r13 = 6235(0x185b, float:8.737E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0937 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0937 }
            m11815as(r4, r9, r13, r14)     // Catch:{ all -> 0x0937 }
            r4 = 0
            r9 = r14[r4]     // Catch:{ all -> 0x0937 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0937 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0937 }
            r8[r4] = r9     // Catch:{ all -> 0x0937 }
            java.lang.Class r4 = java.lang.Character.TYPE     // Catch:{ all -> 0x0937 }
            r8[r6] = r4     // Catch:{ all -> 0x0937 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0937 }
            r9 = 2
            r8[r9] = r4     // Catch:{ all -> 0x0937 }
            java.lang.reflect.Method r4 = r7.getMethod(r12, r8)     // Catch:{ all -> 0x0937 }
            r7 = 0
            java.lang.Object r4 = r4.invoke(r7, r11)     // Catch:{ all -> 0x0937 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0937 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0937 }
            r1.f10018b = r4     // Catch:{ all -> 0x0b28 }
        L_0x0932:
            r1.mo9125d(r6)     // Catch:{ all -> 0x0b28 }
            goto L_0x0163
        L_0x0937:
            r0 = move-exception
            r4 = r0
            java.lang.Throwable r7 = r4.getCause()     // Catch:{ all -> 0x0b28 }
            if (r7 == 0) goto L_0x0940
            throw r7     // Catch:{ all -> 0x0b28 }
        L_0x0940:
            throw r4     // Catch:{ all -> 0x0b28 }
        L_0x0941:
            r18 = r4
            r4 = r11
            r2 = r17
            r1.f10018b = r4     // Catch:{ all -> 0x0ab4 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0b28 }
            r4 = 9
            r1.mo9125d(r4)     // Catch:{ all -> 0x0b28 }
            int r7 = r1.f10020d     // Catch:{ all -> 0x0b28 }
            r1.mo9125d(r4)     // Catch:{ all -> 0x0b28 }
            int r4 = r1.f10020d     // Catch:{ all -> 0x0b28 }
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x09ae }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x09ae }
            r9[r6] = r4     // Catch:{ all -> 0x09ae }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x09ae }
            r7 = 0
            r9[r7] = r4     // Catch:{ all -> 0x09ae }
            r4 = 1046(0x416, float:1.466E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x09ae }
            int r7 = f9519d     // Catch:{ all -> 0x09ae }
            r7 = r7 & r12
            byte r7 = (byte) r7     // Catch:{ all -> 0x09ae }
            r8 = 1895(0x767, float:2.655E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x09ae }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x09ae }
            m11815as(r4, r7, r8, r11)     // Catch:{ all -> 0x09ae }
            r4 = 0
            r7 = r11[r4]     // Catch:{ all -> 0x09ae }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x09ae }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x09ae }
            r8 = 1056(0x420, float:1.48E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x09ae }
            byte[] r11 = f9518c     // Catch:{ all -> 0x09ae }
            byte r11 = r11[r4]     // Catch:{ all -> 0x09ae }
            byte r11 = (byte) r11     // Catch:{ all -> 0x09ae }
            r12 = 3182(0xc6e, float:4.459E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x09ae }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x09ae }
            m11815as(r8, r11, r12, r13)     // Catch:{ all -> 0x09ae }
            r8 = r13[r4]     // Catch:{ all -> 0x09ae }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x09ae }
            r11 = 2
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch:{ all -> 0x09ae }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ all -> 0x09ae }
            r12[r4] = r11     // Catch:{ all -> 0x09ae }
            r12[r6] = r11     // Catch:{ all -> 0x09ae }
            java.lang.reflect.Method r4 = r7.getMethod(r8, r12)     // Catch:{ all -> 0x09ae }
            r7 = 0
            java.lang.Object r4 = r4.invoke(r7, r9)     // Catch:{ all -> 0x09ae }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x09ae }
            int r4 = r4.intValue()     // Catch:{ all -> 0x09ae }
            r1.f10018b = r4     // Catch:{ all -> 0x0b28 }
            goto L_0x0932
        L_0x09ae:
            r0 = move-exception
            r4 = r0
            java.lang.Throwable r7 = r4.getCause()     // Catch:{ all -> 0x0b28 }
            if (r7 == 0) goto L_0x09b7
            throw r7     // Catch:{ all -> 0x0b28 }
        L_0x09b7:
            throw r4     // Catch:{ all -> 0x0b28 }
        L_0x09b8:
            r18 = r4
            r2 = r17
            r1.f10018b = r6     // Catch:{ all -> 0x0b28 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0b28 }
            r4 = 9
            r1.mo9125d(r4)     // Catch:{ all -> 0x0b28 }
            int r4 = r1.f10020d     // Catch:{ all -> 0x0b28 }
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0a1f }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0a1f }
            r8 = 0
            r7[r8] = r4     // Catch:{ all -> 0x0a1f }
            r4 = 1044(0x414, float:1.463E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x0a1f }
            int r8 = f9519d     // Catch:{ all -> 0x0a1f }
            r8 = r8 & r12
            byte r8 = (byte) r8     // Catch:{ all -> 0x0a1f }
            r9 = 4619(0x120b, float:6.473E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0a1f }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0a1f }
            m11815as(r4, r8, r9, r11)     // Catch:{ all -> 0x0a1f }
            r4 = 0
            r8 = r11[r4]     // Catch:{ all -> 0x0a1f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0a1f }
            java.lang.Class r4 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0a1f }
            r8 = 1053(0x41d, float:1.476E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0a1f }
            byte[] r9 = f9518c     // Catch:{ all -> 0x0a1f }
            r11 = 2130(0x852, float:2.985E-42)
            byte r9 = r9[r11]     // Catch:{ all -> 0x0a1f }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0a1f }
            r11 = 7455(0x1d1f, float:1.0447E-41)
            short r11 = (short) r11     // Catch:{ all -> 0x0a1f }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0a1f }
            m11815as(r8, r9, r11, r12)     // Catch:{ all -> 0x0a1f }
            r8 = 0
            r9 = r12[r8]     // Catch:{ all -> 0x0a1f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0a1f }
            java.lang.Class[] r11 = new java.lang.Class[r6]     // Catch:{ all -> 0x0a1f }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0a1f }
            r11[r8] = r12     // Catch:{ all -> 0x0a1f }
            java.lang.reflect.Method r4 = r4.getMethod(r9, r11)     // Catch:{ all -> 0x0a1f }
            r8 = 0
            java.lang.Object r4 = r4.invoke(r8, r7)     // Catch:{ all -> 0x0a1f }
            java.lang.Float r4 = (java.lang.Float) r4     // Catch:{ all -> 0x0a1f }
            float r4 = r4.floatValue()     // Catch:{ all -> 0x0a1f }
            r1.f10021e = r4     // Catch:{ all -> 0x0b28 }
            r4 = 104(0x68, float:1.46E-43)
            r1.mo9125d(r4)     // Catch:{ all -> 0x0b28 }
            goto L_0x0163
        L_0x0a1f:
            r0 = move-exception
            r4 = r0
            java.lang.Throwable r7 = r4.getCause()     // Catch:{ all -> 0x0b28 }
            if (r7 == 0) goto L_0x0a28
            throw r7     // Catch:{ all -> 0x0b28 }
        L_0x0a28:
            throw r4     // Catch:{ all -> 0x0b28 }
        L_0x0a29:
            r18 = r4
            r4 = r11
            r2 = r17
            r1.f10018b = r4     // Catch:{ all -> 0x0ab4 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0b28 }
            r4 = 27
            r1.mo9125d(r4)     // Catch:{ all -> 0x0b28 }
            java.lang.Object r4 = r1.f10026j     // Catch:{ all -> 0x0b28 }
            r7 = 9
            r1.mo9125d(r7)     // Catch:{ all -> 0x0b28 }
            int r7 = r1.f10020d     // Catch:{ all -> 0x0b28 }
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0aaa }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0aaa }
            r9[r6] = r7     // Catch:{ all -> 0x0aaa }
            r7 = 0
            r9[r7] = r4     // Catch:{ all -> 0x0aaa }
            short r4 = (short) r15     // Catch:{ all -> 0x0aaa }
            int r7 = f9519d     // Catch:{ all -> 0x0aaa }
            r7 = r7 & r12
            byte r7 = (byte) r7     // Catch:{ all -> 0x0aaa }
            r8 = 4724(0x1274, float:6.62E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0aaa }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0aaa }
            m11815as(r4, r7, r8, r11)     // Catch:{ all -> 0x0aaa }
            r7 = 0
            r8 = r11[r7]     // Catch:{ all -> 0x0aaa }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0aaa }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0aaa }
            r11 = 1053(0x41d, float:1.476E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0aaa }
            byte[] r12 = f9518c     // Catch:{ all -> 0x0aaa }
            byte r13 = r12[r7]     // Catch:{ all -> 0x0aaa }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0aaa }
            r14 = 1269(0x4f5, float:1.778E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0aaa }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x0aaa }
            m11815as(r11, r13, r14, r15)     // Catch:{ all -> 0x0aaa }
            r11 = r15[r7]     // Catch:{ all -> 0x0aaa }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0aaa }
            r7 = 2
            java.lang.Class[] r13 = new java.lang.Class[r7]     // Catch:{ all -> 0x0aaa }
            r7 = 2385(0x951, float:3.342E-42)
            byte r12 = r12[r7]     // Catch:{ all -> 0x0aaa }
            int r7 = -r12
            byte r7 = (byte) r7     // Catch:{ all -> 0x0aaa }
            r12 = 6235(0x185b, float:8.737E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0aaa }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0aaa }
            m11815as(r4, r7, r12, r14)     // Catch:{ all -> 0x0aaa }
            r4 = 0
            r7 = r14[r4]     // Catch:{ all -> 0x0aaa }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0aaa }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0aaa }
            r13[r4] = r7     // Catch:{ all -> 0x0aaa }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0aaa }
            r13[r6] = r4     // Catch:{ all -> 0x0aaa }
            java.lang.reflect.Method r4 = r8.getMethod(r11, r13)     // Catch:{ all -> 0x0aaa }
            r7 = 0
            java.lang.Object r4 = r4.invoke(r7, r9)     // Catch:{ all -> 0x0aaa }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0aaa }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0aaa }
            r1.f10018b = r4     // Catch:{ all -> 0x0b28 }
            goto L_0x0932
        L_0x0aaa:
            r0 = move-exception
            r4 = r0
            java.lang.Throwable r7 = r4.getCause()     // Catch:{ all -> 0x0b28 }
            if (r7 == 0) goto L_0x0ab3
            throw r7     // Catch:{ all -> 0x0b28 }
        L_0x0ab3:
            throw r4     // Catch:{ all -> 0x0b28 }
        L_0x0ab4:
            r0 = move-exception
            r7 = r0
            goto L_0x0b2b
        L_0x0ab7:
            r18 = r4
            r2 = r17
            r1.f10018b = r6     // Catch:{ all -> 0x0b28 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0b28 }
            r4 = 9
            r1.mo9125d(r4)     // Catch:{ all -> 0x0b28 }
            int r4 = r1.f10020d     // Catch:{ all -> 0x0b28 }
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b1e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0b1e }
            r8 = 0
            r7[r8] = r4     // Catch:{ all -> 0x0b1e }
            r4 = 1028(0x404, float:1.44E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x0b1e }
            int r8 = f9519d     // Catch:{ all -> 0x0b1e }
            r8 = r8 & r12
            byte r8 = (byte) r8     // Catch:{ all -> 0x0b1e }
            r9 = 4348(0x10fc, float:6.093E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0b1e }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b1e }
            m11815as(r4, r8, r9, r11)     // Catch:{ all -> 0x0b1e }
            r4 = 0
            r8 = r11[r4]     // Catch:{ all -> 0x0b1e }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0b1e }
            java.lang.Class r4 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0b1e }
            r8 = 1040(0x410, float:1.457E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0b1e }
            byte[] r9 = f9518c     // Catch:{ all -> 0x0b1e }
            r11 = 2130(0x852, float:2.985E-42)
            byte r9 = r9[r11]     // Catch:{ all -> 0x0b1e }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0b1e }
            r11 = 4678(0x1246, float:6.555E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0b1e }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b1e }
            m11815as(r8, r9, r11, r12)     // Catch:{ all -> 0x0b1e }
            r8 = 0
            r9 = r12[r8]     // Catch:{ all -> 0x0b1e }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0b1e }
            java.lang.Class[] r11 = new java.lang.Class[r6]     // Catch:{ all -> 0x0b1e }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0b1e }
            r11[r8] = r12     // Catch:{ all -> 0x0b1e }
            java.lang.reflect.Method r4 = r4.getMethod(r9, r11)     // Catch:{ all -> 0x0b1e }
            r8 = 0
            java.lang.Object r4 = r4.invoke(r8, r7)     // Catch:{ all -> 0x0b1e }
            java.lang.Double r4 = (java.lang.Double) r4     // Catch:{ all -> 0x0b1e }
            double r7 = r4.doubleValue()     // Catch:{ all -> 0x0b1e }
            r1.f10023g = r7     // Catch:{ all -> 0x0b28 }
            r4 = 118(0x76, float:1.65E-43)
            r1.mo9125d(r4)     // Catch:{ all -> 0x0b28 }
            goto L_0x0163
        L_0x0b1e:
            r0 = move-exception
            r4 = r0
            java.lang.Throwable r7 = r4.getCause()     // Catch:{ all -> 0x0b28 }
            if (r7 == 0) goto L_0x0b27
            throw r7     // Catch:{ all -> 0x0b28 }
        L_0x0b27:
            throw r4     // Catch:{ all -> 0x0b28 }
        L_0x0b28:
            r0 = move-exception
            r7 = r0
        L_0x0b2a:
            r4 = 2
        L_0x0b2b:
            r8 = 1048(0x418, float:1.469E-42)
            r9 = 1050(0x41a, float:1.471E-42)
            goto L_0x10a2
        L_0x0b31:
            r18 = r4
            r2 = r17
            r1.f10018b = r6     // Catch:{ all -> 0x0ba0 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0ba0 }
            r4 = 9
            r1.mo9125d(r4)     // Catch:{ all -> 0x0ba0 }
            int r4 = r1.f10020d     // Catch:{ all -> 0x0ba0 }
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b94 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0b94 }
            r8 = 0
            r7[r8] = r4     // Catch:{ all -> 0x0b94 }
            r4 = 1049(0x419, float:1.47E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x0b94 }
            int r8 = f9519d     // Catch:{ all -> 0x0b94 }
            r8 = r8 & r12
            byte r8 = (byte) r8     // Catch:{ all -> 0x0b94 }
            r9 = 6859(0x1acb, float:9.612E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0b94 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b94 }
            m11815as(r4, r8, r9, r11)     // Catch:{ all -> 0x0b94 }
            r4 = 0
            r8 = r11[r4]     // Catch:{ all -> 0x0b94 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0b94 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0b94 }
            r9 = 1050(0x41a, float:1.471E-42)
            short r11 = (short) r9
            byte[] r12 = f9518c     // Catch:{ all -> 0x0b92 }
            byte r12 = r12[r4]     // Catch:{ all -> 0x0b92 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0b92 }
            r13 = 5256(0x1488, float:7.365E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0b92 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b92 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x0b92 }
            r11 = r14[r4]     // Catch:{ all -> 0x0b92 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0b92 }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x0b92 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0b92 }
            r12[r4] = r13     // Catch:{ all -> 0x0b92 }
            java.lang.reflect.Method r4 = r8.getMethod(r11, r12)     // Catch:{ all -> 0x0b92 }
            r8 = 0
            java.lang.Object r4 = r4.invoke(r8, r7)     // Catch:{ all -> 0x0b92 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0b92 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0b92 }
            r1.f10018b = r4     // Catch:{ all -> 0x0f5e }
        L_0x0b8d:
            r1.mo9125d(r6)     // Catch:{ all -> 0x0f5e }
            goto L_0x1090
        L_0x0b92:
            r0 = move-exception
            goto L_0x0b97
        L_0x0b94:
            r0 = move-exception
            r9 = 1050(0x41a, float:1.471E-42)
        L_0x0b97:
            r4 = r0
            java.lang.Throwable r7 = r4.getCause()     // Catch:{ all -> 0x0f5e }
            if (r7 == 0) goto L_0x0b9f
            throw r7     // Catch:{ all -> 0x0f5e }
        L_0x0b9f:
            throw r4     // Catch:{ all -> 0x0f5e }
        L_0x0ba0:
            r0 = move-exception
            r9 = 1050(0x41a, float:1.471E-42)
            goto L_0x0f5f
        L_0x0ba5:
            r18 = r4
            r4 = r11
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r1.f10018b = r4     // Catch:{ all -> 0x1082 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0f5e }
            r4 = 27
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            java.lang.Object r4 = r1.f10026j     // Catch:{ all -> 0x0f5e }
            r7 = 9
            r1.mo9125d(r7)     // Catch:{ all -> 0x0f5e }
            int r7 = r1.f10020d     // Catch:{ all -> 0x0f5e }
            char r7 = (char) r7
            r8 = 2
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ all -> 0x0c2c }
            java.lang.Character r7 = java.lang.Character.valueOf(r7)     // Catch:{ all -> 0x0c2c }
            r11[r6] = r7     // Catch:{ all -> 0x0c2c }
            r7 = 0
            r11[r7] = r4     // Catch:{ all -> 0x0c2c }
            short r4 = (short) r15     // Catch:{ all -> 0x0c2c }
            int r7 = f9519d     // Catch:{ all -> 0x0c2c }
            r7 = r7 & r12
            byte r7 = (byte) r7     // Catch:{ all -> 0x0c2c }
            r8 = 4724(0x1274, float:6.62E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0c2c }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0c2c }
            m11815as(r4, r7, r8, r12)     // Catch:{ all -> 0x0c2c }
            r7 = 0
            r8 = r12[r7]     // Catch:{ all -> 0x0c2c }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0c2c }
            java.lang.Class r7 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0c2c }
            r8 = 1056(0x420, float:1.48E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0c2c }
            byte[] r12 = f9518c     // Catch:{ all -> 0x0c2c }
            r13 = 609(0x261, float:8.53E-43)
            byte r13 = r12[r13]     // Catch:{ all -> 0x0c2c }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0c2c }
            r14 = r13 | 1192(0x4a8, float:1.67E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0c2c }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x0c2c }
            m11815as(r8, r13, r14, r15)     // Catch:{ all -> 0x0c2c }
            r8 = 0
            r13 = r15[r8]     // Catch:{ all -> 0x0c2c }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0c2c }
            r8 = 2
            java.lang.Class[] r14 = new java.lang.Class[r8]     // Catch:{ all -> 0x0c2c }
            r8 = 2385(0x951, float:3.342E-42)
            byte r12 = r12[r8]     // Catch:{ all -> 0x0c2c }
            int r8 = -r12
            byte r8 = (byte) r8     // Catch:{ all -> 0x0c2c }
            r12 = 6235(0x185b, float:8.737E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0c2c }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x0c2c }
            m11815as(r4, r8, r12, r15)     // Catch:{ all -> 0x0c2c }
            r4 = 0
            r8 = r15[r4]     // Catch:{ all -> 0x0c2c }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0c2c }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0c2c }
            r14[r4] = r8     // Catch:{ all -> 0x0c2c }
            java.lang.Class r4 = java.lang.Character.TYPE     // Catch:{ all -> 0x0c2c }
            r14[r6] = r4     // Catch:{ all -> 0x0c2c }
            java.lang.reflect.Method r4 = r7.getMethod(r13, r14)     // Catch:{ all -> 0x0c2c }
            r7 = 0
            java.lang.Object r4 = r4.invoke(r7, r11)     // Catch:{ all -> 0x0c2c }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0c2c }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0c2c }
            r1.f10018b = r4     // Catch:{ all -> 0x0f5e }
            goto L_0x0b8d
        L_0x0c2c:
            r0 = move-exception
            r4 = r0
            java.lang.Throwable r7 = r4.getCause()     // Catch:{ all -> 0x0f5e }
            if (r7 == 0) goto L_0x0c35
            throw r7     // Catch:{ all -> 0x0f5e }
        L_0x0c35:
            throw r4     // Catch:{ all -> 0x0f5e }
        L_0x0c36:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r1.f10018b = r6     // Catch:{ all -> 0x0f5e }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0f5e }
            r1.mo9125d(r12)     // Catch:{ all -> 0x0f5e }
            long r7 = r1.f10019c     // Catch:{ all -> 0x0f5e }
            java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0f5e }
            r7 = 0
            long r11 = android.widget.ExpandableListView.getPackedPositionForGroup(r7)     // Catch:{ all -> 0x0f5e }
            r13 = 0
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            int r8 = r8 + 20121
            char r8 = (char) r8     // Catch:{ all -> 0x0f5e }
            int r11 = android.view.View.MeasureSpec.getSize(r7)     // Catch:{ all -> 0x0f5e }
            int r11 = r11 + 242
            int r12 = android.view.View.MeasureSpec.getSize(r7)     // Catch:{ all -> 0x0f5e }
            r13 = 24
            int r12 = 24 - r12
            java.lang.Object r8 = com.facetec.sdk.C2854bp.m11559b(r8, r11, r12)     // Catch:{ all -> 0x0f5e }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x0f5e }
            byte r11 = (byte) r7     // Catch:{ all -> 0x0f5e }
            int r12 = r11 + 1
            byte r12 = (byte) r12     // Catch:{ all -> 0x0f5e }
            int r13 = r12 + -1
            byte r13 = (byte) r13     // Catch:{ all -> 0x0f5e }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0f5e }
            m11817au(r11, r12, r13, r14)     // Catch:{ all -> 0x0f5e }
            r11 = r14[r7]     // Catch:{ all -> 0x0f5e }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0f5e }
            java.lang.reflect.Field r7 = r8.getField(r11)     // Catch:{ all -> 0x0f5e }
            r8 = 0
            r7.set(r8, r4)     // Catch:{ all -> 0x0f5e }
            goto L_0x1090
        L_0x0c84:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 243(0xf3, float:3.4E-43)
            goto L_0x108c
        L_0x0c8e:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r1.f10018b = r6     // Catch:{ all -> 0x0f5e }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0f5e }
            r4 = 27
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            java.lang.Object r4 = r1.f10026j     // Catch:{ all -> 0x0f5e }
            int[] r4 = (int[]) r4     // Catch:{ all -> 0x0f5e }
            r1.f10022f = r4     // Catch:{ all -> 0x0f5e }
            r4 = 24
        L_0x0ca6:
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            goto L_0x1090
        L_0x0cab:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r4 = 131(0x83, float:1.84E-43)
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            int r4 = r1.f10020d     // Catch:{ all -> 0x0f5e }
            if (r4 != 0) goto L_0x1090
            r3 = 147(0x93, float:2.06E-43)
            goto L_0x1090
        L_0x0cbe:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 148(0x94, float:2.07E-43)
            goto L_0x108c
        L_0x0cc8:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 199(0xc7, float:2.79E-43)
            goto L_0x108c
        L_0x0cd2:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r4 = 1048(0x418, float:1.469E-42)
            short r7 = (short) r4
            byte[] r4 = f9518c     // Catch:{ all -> 0x0d04 }
            r8 = 2385(0x951, float:3.342E-42)
            byte r4 = r4[r8]     // Catch:{ all -> 0x0d04 }
            int r4 = -r4
            byte r4 = (byte) r4     // Catch:{ all -> 0x0d04 }
            r8 = 5682(0x1632, float:7.962E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0d04 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0d04 }
            m11815as(r7, r4, r8, r11)     // Catch:{ all -> 0x0d04 }
            r4 = 0
            r7 = r11[r4]     // Catch:{ all -> 0x0d04 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0d04 }
            java.lang.Class r4 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0d04 }
            r7 = 0
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r7)     // Catch:{ all -> 0x0d02 }
            java.lang.Object r4 = r4.newInstance(r7)     // Catch:{ all -> 0x0d02 }
            r1.f10022f = r4     // Catch:{ all -> 0x0f5e }
            r4 = 24
            goto L_0x0ca6
        L_0x0d02:
            r0 = move-exception
            goto L_0x0d06
        L_0x0d04:
            r0 = move-exception
            r7 = 0
        L_0x0d06:
            r4 = r0
            java.lang.Throwable r8 = r4.getCause()     // Catch:{ all -> 0x0f5e }
            if (r8 == 0) goto L_0x0d0e
            throw r8     // Catch:{ all -> 0x0f5e }
        L_0x0d0e:
            throw r4     // Catch:{ all -> 0x0f5e }
        L_0x0d0f:
            r18 = r4
            r2 = r17
            r7 = 0
            r9 = 1050(0x41a, float:1.471E-42)
            r1.f10018b = r6     // Catch:{ all -> 0x0f5e }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0f5e }
            r4 = 27
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            java.lang.Object r4 = r1.f10026j     // Catch:{ all -> 0x0f5e }
            r1.f10022f = r4     // Catch:{ all -> 0x0f5e }
            r4 = 24
            goto L_0x0ca6
        L_0x0d28:
            r18 = r4
            r4 = r11
            r2 = r17
            r7 = 0
            r9 = 1050(0x41a, float:1.471E-42)
            r1.f10018b = r4     // Catch:{ all -> 0x1082 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0f5e }
            r4 = 27
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            java.lang.Object r8 = r1.f10026j     // Catch:{ all -> 0x0f5e }
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            java.lang.Object r4 = r1.f10026j     // Catch:{ all -> 0x0f5e }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0da3 }
            r13 = 0
            r11[r13] = r4     // Catch:{ all -> 0x0da3 }
            r4 = 1053(0x41d, float:1.476E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x0da3 }
            byte[] r13 = f9518c     // Catch:{ all -> 0x0da3 }
            r14 = 2385(0x951, float:3.342E-42)
            byte r15 = r13[r14]     // Catch:{ all -> 0x0da3 }
            int r14 = -r15
            byte r14 = (byte) r14     // Catch:{ all -> 0x0da3 }
            r15 = 2060(0x80c, float:2.887E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x0da3 }
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0da3 }
            m11815as(r4, r14, r15, r7)     // Catch:{ all -> 0x0da3 }
            r4 = 0
            r7 = r7[r4]     // Catch:{ all -> 0x0da3 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0da3 }
            java.lang.Class r4 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0da3 }
            r7 = 1064(0x428, float:1.491E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0da3 }
            int r14 = f9519d     // Catch:{ all -> 0x0da3 }
            r12 = r12 & r14
            byte r12 = (byte) r12     // Catch:{ all -> 0x0da3 }
            r14 = 3143(0xc47, float:4.404E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0da3 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x0da3 }
            m11815as(r7, r12, r14, r15)     // Catch:{ all -> 0x0da3 }
            r7 = 0
            r12 = r15[r7]     // Catch:{ all -> 0x0da3 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0da3 }
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ all -> 0x0da3 }
            r14 = 2385(0x951, float:3.342E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x0da3 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0da3 }
            r14 = 1246(0x4de, float:1.746E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0da3 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x0da3 }
            m11815as(r5, r13, r14, r15)     // Catch:{ all -> 0x0da3 }
            r13 = 0
            r14 = r15[r13]     // Catch:{ all -> 0x0da3 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0da3 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0da3 }
            r7[r13] = r14     // Catch:{ all -> 0x0da3 }
            java.lang.reflect.Method r4 = r4.getMethod(r12, r7)     // Catch:{ all -> 0x0da3 }
            java.lang.Object r4 = r4.invoke(r8, r11)     // Catch:{ all -> 0x0da3 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0da3 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0da3 }
            r1.f10018b = r4     // Catch:{ all -> 0x0f5e }
            goto L_0x0b8d
        L_0x0da3:
            r0 = move-exception
            r4 = r0
            java.lang.Throwable r7 = r4.getCause()     // Catch:{ all -> 0x0f5e }
            if (r7 == 0) goto L_0x0dac
            throw r7     // Catch:{ all -> 0x0f5e }
        L_0x0dac:
            throw r4     // Catch:{ all -> 0x0f5e }
        L_0x0dad:
            r18 = r4
            r2 = r17
            r4 = 3
            r9 = 1050(0x41a, float:1.471E-42)
            r1.f10018b = r4     // Catch:{ all -> 0x0f5e }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0f5e }
            r4 = 27
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            java.lang.Object r4 = r1.f10026j     // Catch:{ all -> 0x0f5e }
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ all -> 0x0f5e }
            r7 = 9
            r1.mo9125d(r7)     // Catch:{ all -> 0x0f5e }
            int r8 = r1.f10020d     // Catch:{ all -> 0x0f5e }
            r1.mo9125d(r7)     // Catch:{ all -> 0x0f5e }
            int r7 = r1.f10020d     // Catch:{ all -> 0x0f5e }
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r8, r7)     // Catch:{ all -> 0x0f5e }
            r1.f10022f = r4     // Catch:{ all -> 0x0f5e }
            r4 = 24
            goto L_0x0ca6
        L_0x0dd8:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r1.f10018b = r6     // Catch:{ all -> 0x0f5e }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0f5e }
            r4 = 27
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            java.lang.Object r4 = r1.f10026j     // Catch:{ all -> 0x0f5e }
            android.widget.Toast r4 = (android.widget.Toast) r4     // Catch:{ all -> 0x0f5e }
            r4.show()     // Catch:{ all -> 0x0f5e }
            goto L_0x1090
        L_0x0df1:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 268(0x10c, float:3.76E-43)
            goto L_0x108c
        L_0x0dfb:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            java.lang.Class<com.facetec.sdk.cd> r4 = com.facetec.sdk.C2885cd.class
            r1.f10022f = r4     // Catch:{ all -> 0x0f5e }
            r4 = 24
            goto L_0x0ca6
        L_0x0e09:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r1.f10018b = r6     // Catch:{ all -> 0x0f5e }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0f5e }
            r4 = 27
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            java.lang.Object r4 = r1.f10026j     // Catch:{ all -> 0x0f5e }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x0f5e }
            java.lang.reflect.Method[] r4 = r4.getDeclaredMethods()     // Catch:{ all -> 0x0f5e }
            r1.f10022f = r4     // Catch:{ all -> 0x0f5e }
            r4 = 24
            goto L_0x0ca6
        L_0x0e27:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 206(0xce, float:2.89E-43)
            goto L_0x108c
        L_0x0e31:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r4 = 153(0x99, float:2.14E-43)
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            int r4 = r1.f10020d     // Catch:{ all -> 0x0f5e }
            if (r4 != 0) goto L_0x1090
            r3 = 209(0xd1, float:2.93E-43)
            goto L_0x1090
        L_0x0e44:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 210(0xd2, float:2.94E-43)
            goto L_0x108c
        L_0x0e4e:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 227(0xe3, float:3.18E-43)
            goto L_0x108c
        L_0x0e58:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            java.lang.Class<com.facetec.sdk.JNI$c> r4 = com.facetec.sdk.JNI.C2746c.class
            r1.f10022f = r4     // Catch:{ all -> 0x0f5e }
            r4 = 24
            goto L_0x0ca6
        L_0x0e66:
            r18 = r4
            r4 = r11
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r1.f10018b = r4     // Catch:{ all -> 0x1082 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0f5e }
            r4 = 27
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            java.lang.Object r7 = r1.f10026j     // Catch:{ all -> 0x0f5e }
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            java.lang.Object r4 = r1.f10026j     // Catch:{ all -> 0x0f5e }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x0f5e }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x0ec7 }
            r11 = 0
            r8[r11] = r4     // Catch:{ all -> 0x0ec7 }
            r4 = 1043(0x413, float:1.462E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x0ec7 }
            byte[] r11 = f9518c     // Catch:{ all -> 0x0ec7 }
            r12 = 2385(0x951, float:3.342E-42)
            byte r13 = r11[r12]     // Catch:{ all -> 0x0ec7 }
            int r12 = -r13
            byte r12 = (byte) r12     // Catch:{ all -> 0x0ec7 }
            r13 = 3166(0xc5e, float:4.437E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0ec7 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0ec7 }
            m11815as(r4, r12, r13, r14)     // Catch:{ all -> 0x0ec7 }
            r4 = 0
            r12 = r14[r4]     // Catch:{ all -> 0x0ec7 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0ec7 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0ec7 }
            r13 = 1054(0x41e, float:1.477E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0ec7 }
            byte r11 = r11[r4]     // Catch:{ all -> 0x0ec7 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0ec7 }
            r14 = 1967(0x7af, float:2.756E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0ec7 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x0ec7 }
            m11815as(r13, r11, r14, r15)     // Catch:{ all -> 0x0ec7 }
            r11 = r15[r4]     // Catch:{ all -> 0x0ec7 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0ec7 }
            java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch:{ all -> 0x0ec7 }
            java.lang.Class<java.lang.Class> r14 = java.lang.Class.class
            r13[r4] = r14     // Catch:{ all -> 0x0ec7 }
            java.lang.reflect.Method r4 = r12.getMethod(r11, r13)     // Catch:{ all -> 0x0ec7 }
            java.lang.Object r4 = r4.invoke(r7, r8)     // Catch:{ all -> 0x0ec7 }
            r1.f10022f = r4     // Catch:{ all -> 0x0f5e }
            r4 = 24
            goto L_0x0ca6
        L_0x0ec7:
            r0 = move-exception
            r4 = r0
            java.lang.Throwable r7 = r4.getCause()     // Catch:{ all -> 0x0f5e }
            if (r7 == 0) goto L_0x0ed0
            throw r7     // Catch:{ all -> 0x0f5e }
        L_0x0ed0:
            throw r4     // Catch:{ all -> 0x0f5e }
        L_0x0ed1:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r1.f10018b = r6     // Catch:{ all -> 0x0f5e }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0f5e }
            r4 = 27
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            java.lang.Object r4 = r1.f10026j     // Catch:{ all -> 0x0f5e }
            com.facetec.sdk.JNI$c r4 = (com.facetec.sdk.JNI.C2746c) r4     // Catch:{ all -> 0x0f5e }
            r1.f10022f = r4     // Catch:{ all -> 0x0f5e }
            r4 = 24
            goto L_0x0ca6
        L_0x0eeb:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r4 = 156(0x9c, float:2.19E-43)
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            int r4 = r1.f10020d     // Catch:{ all -> 0x0f5e }
            if (r4 != 0) goto L_0x1090
            r3 = 219(0xdb, float:3.07E-43)
            goto L_0x1090
        L_0x0efe:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 220(0xdc, float:3.08E-43)
            goto L_0x108c
        L_0x0f08:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 225(0xe1, float:3.15E-43)
            goto L_0x108c
        L_0x0f12:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r1.f10018b = r6     // Catch:{ all -> 0x0f5e }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0f5e }
            r4 = 27
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            java.lang.Object r4 = r1.f10026j     // Catch:{ all -> 0x0f5e }
            com.facetec.sdk.JNI$c r4 = (com.facetec.sdk.JNI.C2746c) r4     // Catch:{ all -> 0x0f5e }
            long r7 = r4.mo8795e()     // Catch:{ all -> 0x0f5e }
            r1.f10017a = r7     // Catch:{ all -> 0x0f5e }
            r1.mo9125d(r13)     // Catch:{ all -> 0x0f5e }
            goto L_0x1090
        L_0x0f31:
            r18 = r4
            r4 = r11
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r1.f10018b = r4     // Catch:{ all -> 0x1082 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0f5e }
            r1.mo9125d(r12)     // Catch:{ all -> 0x0f5e }
            long r7 = r1.f10019c     // Catch:{ all -> 0x0f5e }
            r4 = 27
            r1.mo9125d(r4)     // Catch:{ all -> 0x0f5e }
            java.lang.Object r4 = r1.f10026j     // Catch:{ all -> 0x0f5e }
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch:{ all -> 0x0f5e }
            com.facetec.sdk.JNI.m10676d(r7, r4)     // Catch:{ all -> 0x0f5e }
            goto L_0x1090
        L_0x0f50:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            java.lang.Class<com.facetec.sdk.dn> r4 = com.facetec.sdk.C2954dn.class
            r1.f10022f = r4     // Catch:{ all -> 0x0f5e }
            r4 = 24
            goto L_0x0ca6
        L_0x0f5e:
            r0 = move-exception
        L_0x0f5f:
            r7 = r0
            r4 = 2
            goto L_0x10a0
        L_0x0f63:
            r18 = r4
            r4 = r11
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r1.f10018b = r4     // Catch:{ all -> 0x1082 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x1082 }
            r7 = 27
            r1.mo9125d(r7)     // Catch:{ all -> 0x1082 }
            java.lang.Object r8 = r1.f10026j     // Catch:{ all -> 0x1082 }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x1082 }
            r1.mo9125d(r7)     // Catch:{ all -> 0x1082 }
            java.lang.Object r7 = r1.f10026j     // Catch:{ all -> 0x1082 }
            java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ all -> 0x1082 }
            com.facetec.sdk.JNI.m10674c(r8, r7)     // Catch:{ all -> 0x1082 }
            goto L_0x1090
        L_0x0f84:
            return
        L_0x0f85:
            r2 = r6
            goto L_0x101e
        L_0x0f88:
            r2 = 4
            goto L_0x101e
        L_0x0f8b:
            r18 = r4
            r4 = r11
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            int r7 = f9526m     // Catch:{ all -> 0x1082 }
            r1.f10018b = r7     // Catch:{ all -> 0x1082 }
        L_0x0f96:
            r1.mo9125d(r6)     // Catch:{ all -> 0x1082 }
            goto L_0x1090
        L_0x0f9b:
            r18 = r4
            r4 = r11
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r1.f10018b = r6     // Catch:{ all -> 0x1082 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x1082 }
            r7 = 9
            r1.mo9125d(r7)     // Catch:{ all -> 0x1082 }
            int r7 = r1.f10020d     // Catch:{ all -> 0x1082 }
            f9527n = r7     // Catch:{ all -> 0x1082 }
            goto L_0x1090
        L_0x0fb2:
            r18 = r4
            r4 = r11
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r7 = 15
            r1.mo9125d(r7)     // Catch:{ all -> 0x1082 }
            int r4 = r1.f10020d     // Catch:{ all -> 0x1082 }
            if (r4 != 0) goto L_0x1090
            r3 = 252(0xfc, float:3.53E-43)
            goto L_0x1090
        L_0x0fc6:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 288(0x120, float:4.04E-43)
            goto L_0x108c
        L_0x0fd0:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 286(0x11e, float:4.01E-43)
            goto L_0x108c
        L_0x0fda:
            r18 = r4
            r4 = r11
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            int r7 = f9527n     // Catch:{ all -> 0x1082 }
            r1.f10018b = r7     // Catch:{ all -> 0x1082 }
            goto L_0x0f96
        L_0x0fe6:
            r18 = r4
            r4 = r11
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r1.f10018b = r6     // Catch:{ all -> 0x1082 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x1082 }
            r7 = 9
            r1.mo9125d(r7)     // Catch:{ all -> 0x1082 }
            int r7 = r1.f10020d     // Catch:{ all -> 0x1082 }
            f9526m = r7     // Catch:{ all -> 0x1082 }
            goto L_0x1090
        L_0x0ffd:
            r18 = r4
            r7 = r9
            r4 = r11
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r1.mo9125d(r7)     // Catch:{ all -> 0x1082 }
            int r4 = r1.f10020d     // Catch:{ all -> 0x1082 }
            if (r4 != 0) goto L_0x1090
            r3 = 266(0x10a, float:3.73E-43)
            goto L_0x1090
        L_0x1010:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 267(0x10b, float:3.74E-43)
            goto L_0x108c
        L_0x101a:
            r2 = r17
            r2 = 12
        L_0x101e:
            r12 = 1050(0x41a, float:1.471E-42)
            goto L_0x0145
        L_0x1022:
            r18 = r4
            r7 = r9
            r4 = r11
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r1.mo9125d(r7)     // Catch:{ all -> 0x1082 }
            int r4 = r1.f10020d     // Catch:{ all -> 0x1082 }
            if (r4 != 0) goto L_0x1090
            r3 = 278(0x116, float:3.9E-43)
            goto L_0x1090
        L_0x1035:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 279(0x117, float:3.91E-43)
            goto L_0x108c
        L_0x103e:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 234(0xea, float:3.28E-43)
            goto L_0x108c
        L_0x1047:
            r18 = r4
            r4 = r11
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r7 = 20
            r1.mo9125d(r7)     // Catch:{ all -> 0x1082 }
            int r3 = r1.f10020d     // Catch:{ all -> 0x1082 }
            if (r3 == 0) goto L_0x105a
            r3 = 70
            goto L_0x1090
        L_0x105a:
            r3 = 67
            goto L_0x1090
        L_0x105d:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 280(0x118, float:3.92E-43)
            goto L_0x108c
        L_0x1066:
            r18 = r4
            r4 = r11
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r7 = 20
            r1.mo9125d(r7)     // Catch:{ all -> 0x1082 }
            int r3 = r1.f10020d     // Catch:{ all -> 0x1082 }
            r4 = 7
            if (r3 == r4) goto L_0x107f
            r4 = 17
            if (r3 == r4) goto L_0x107c
            goto L_0x107f
        L_0x107c:
            r3 = 253(0xfd, float:3.55E-43)
            goto L_0x1090
        L_0x107f:
            r3 = 237(0xed, float:3.32E-43)
            goto L_0x1090
        L_0x1082:
            r0 = move-exception
            goto L_0x109f
        L_0x1084:
            r18 = r4
            r2 = r17
            r9 = 1050(0x41a, float:1.471E-42)
            r3 = 285(0x11d, float:4.0E-43)
        L_0x108c:
            r2 = r3
            r12 = r9
            goto L_0x0145
        L_0x1090:
            r17 = r2
            r2 = r3
            r12 = r9
            r4 = r18
            goto L_0x0145
        L_0x1098:
            r0 = move-exception
            r18 = r4
            r4 = r11
            r9 = r12
            r2 = r17
        L_0x109f:
            r7 = r0
        L_0x10a0:
            r8 = 1048(0x418, float:1.469E-42)
        L_0x10a2:
            short r8 = (short) r8
            byte[] r11 = f9518c
            r12 = 2385(0x951, float:3.342E-42)
            byte r13 = r11[r12]
            int r12 = -r13
            byte r12 = (byte) r12
            r13 = 6193(0x1831, float:8.678E-42)
            short r13 = (short) r13
            java.lang.Object[] r14 = new java.lang.Object[r6]
            m11815as(r8, r12, r13, r14)
            r12 = 0
            r14 = r14[r12]
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Class r12 = java.lang.Class.forName(r14)
            boolean r12 = r12.isInstance(r7)
            if (r12 == 0) goto L_0x10ce
            r12 = 4
            if (r3 < r12) goto L_0x10ce
            r12 = 12
            if (r3 > r12) goto L_0x10ce
        L_0x10c9:
            r3 = r4
            r4 = 2385(0x951, float:3.342E-42)
            r8 = 0
            goto L_0x1115
        L_0x10ce:
            r12 = 2385(0x951, float:3.342E-42)
            byte r14 = r11[r12]
            int r12 = -r14
            byte r12 = (byte) r12
            java.lang.Object[] r14 = new java.lang.Object[r6]
            m11815as(r8, r12, r13, r14)
            r12 = 0
            r14 = r14[r12]
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Class r12 = java.lang.Class.forName(r14)
            boolean r12 = r12.isInstance(r7)
            if (r12 == 0) goto L_0x10f1
            r12 = 12
            if (r3 < r12) goto L_0x10f1
            r12 = 63
            if (r3 > r12) goto L_0x10f1
            goto L_0x10c9
        L_0x10f1:
            r4 = 2385(0x951, float:3.342E-42)
            byte r11 = r11[r4]
            int r11 = -r11
            byte r11 = (byte) r11
            java.lang.Object[] r12 = new java.lang.Object[r6]
            m11815as(r8, r11, r13, r12)
            r8 = 0
            r11 = r12[r8]
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Class r11 = java.lang.Class.forName(r11)
            boolean r11 = r11.isInstance(r7)
            if (r11 == 0) goto L_0x111e
            r11 = 75
            if (r3 < r11) goto L_0x111e
            r11 = 129(0x81, float:1.81E-43)
            if (r3 > r11) goto L_0x111e
            r3 = 131(0x83, float:1.84E-43)
        L_0x1115:
            r1.f10022f = r7
            r7 = 23
            r1.mo9125d(r7)
            goto L_0x1090
        L_0x111e:
            throw r7
        L_0x111f:
            r0 = move-exception
            r1 = r0
            java.lang.Throwable r2 = r1.getCause()
            if (r2 == 0) goto L_0x1128
            throw r2
        L_0x1128:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11767E():void");
    }

    @JNI.C2746c(mo8795e = 845177302)
    /* renamed from: E */
    static native void m11768E(String str, String str2);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: type inference failed for: r13v19 */
    /* JADX WARNING: type inference failed for: r13v23 */
    /* JADX WARNING: type inference failed for: r13v45 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0334, code lost:
        r11 = 1060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x037e, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03d0, code lost:
        r1.mo9125d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03d3, code lost:
        r9 = r12;
        r8 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x043a, code lost:
        r11 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x045f, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01dc, code lost:
        r1.mo9125d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02aa, code lost:
        r9 = r12;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0320 A[Catch:{ all -> 0x0305, all -> 0x03fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0321 A[Catch:{ all -> 0x0305, all -> 0x03fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0279 A[Catch:{ all -> 0x026e, all -> 0x02b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x027a A[Catch:{ all -> 0x026e, all -> 0x02b5 }] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m11769F() {
        /*
            com.facetec.sdk.do r1 = new com.facetec.sdk.do
            r1.<init>()
            r0 = 873(0x369, float:1.223E-42)
            short r0 = (short) r0
            byte[] r2 = f9518c
            r3 = 21
            byte r3 = r2[r3]
            byte r3 = (byte) r3
            r4 = 6438(0x1926, float:9.022E-42)
            short r4 = (short) r4
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            m11815as(r0, r3, r4, r6)
            r3 = 0
            r0 = r6[r3]
            java.lang.String r0 = (java.lang.String) r0
            r4 = 1066(0x42a, float:1.494E-42)
            short r4 = (short) r4
            r6 = 18
            byte r7 = r2[r6]
            byte r7 = (byte) r7
            r8 = r7 | 6193(0x1831, float:8.678E-42)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r5]
            m11815as(r4, r7, r8, r9)
            r4 = r9[r3]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x047e }
            r7[r3] = r4     // Catch:{ all -> 0x047e }
            r4 = 1051(0x41b, float:1.473E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x047e }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r2[r8]     // Catch:{ all -> 0x047e }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x047e }
            r10 = 5290(0x14aa, float:7.413E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x047e }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x047e }
            m11815as(r4, r9, r10, r11)     // Catch:{ all -> 0x047e }
            r9 = r11[r3]     // Catch:{ all -> 0x047e }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x047e }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x047e }
            r11 = 1062(0x426, float:1.488E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x047e }
            r12 = 3127(0xc37, float:4.382E-42)
            byte r12 = r2[r12]     // Catch:{ all -> 0x047e }
            int r12 = r12 + r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x047e }
            r13 = 4131(0x1023, float:5.789E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x047e }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x047e }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x047e }
            r11 = r14[r3]     // Catch:{ all -> 0x047e }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x047e }
            java.lang.Class[] r12 = new java.lang.Class[r5]     // Catch:{ all -> 0x047e }
            byte r2 = r2[r8]     // Catch:{ all -> 0x047e }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x047e }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x047e }
            m11815as(r4, r2, r10, r13)     // Catch:{ all -> 0x047e }
            r2 = r13[r3]     // Catch:{ all -> 0x047e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x047e }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x047e }
            r12[r3] = r2     // Catch:{ all -> 0x047e }
            java.lang.reflect.Method r2 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x047e }
            java.lang.Object r0 = r2.invoke(r0, r7)     // Catch:{ all -> 0x047e }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x047e }
            int r2 = r0.length
            int[] r2 = new int[r2]
            r7 = r3
        L_0x0086:
            int r9 = r0.length
            r11 = 1060(0x424, float:1.485E-42)
            if (r7 >= r9) goto L_0x0137
            r9 = r0[r7]
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x012e }
            r14[r3] = r9     // Catch:{ all -> 0x012e }
            r9 = 1050(0x41a, float:1.471E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x012e }
            byte[] r15 = f9518c     // Catch:{ all -> 0x012e }
            byte r6 = r15[r8]     // Catch:{ all -> 0x012e }
            int r6 = -r6
            byte r6 = (byte) r6     // Catch:{ all -> 0x012e }
            int r12 = f9519d     // Catch:{ all -> 0x012e }
            r13 = r12 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x012e }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x012e }
            m11815as(r9, r6, r13, r8)     // Catch:{ all -> 0x012e }
            r6 = r8[r3]     // Catch:{ all -> 0x012e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x012e }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x012e }
            short r8 = (short) r11     // Catch:{ all -> 0x012e }
            r11 = 74
            byte r11 = (byte) r11     // Catch:{ all -> 0x012e }
            r13 = 1465(0x5b9, float:2.053E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x012e }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x012e }
            m11815as(r8, r11, r13, r3)     // Catch:{ all -> 0x012e }
            r8 = 0
            r3 = r3[r8]     // Catch:{ all -> 0x012e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x012e }
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x012e }
            r11 = 2385(0x951, float:3.342E-42)
            byte r13 = r15[r11]     // Catch:{ all -> 0x012e }
            int r11 = -r13
            byte r11 = (byte) r11     // Catch:{ all -> 0x012e }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x012e }
            m11815as(r4, r11, r10, r13)     // Catch:{ all -> 0x012e }
            r11 = 0
            r13 = r13[r11]     // Catch:{ all -> 0x012e }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x012e }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x012e }
            r8[r11] = r13     // Catch:{ all -> 0x012e }
            java.lang.reflect.Method r3 = r6.getMethod(r3, r8)     // Catch:{ all -> 0x012e }
            r6 = 0
            java.lang.Object r3 = r3.invoke(r6, r14)     // Catch:{ all -> 0x012e }
            r6 = 2385(0x951, float:3.342E-42)
            byte r8 = r15[r6]     // Catch:{ all -> 0x0125 }
            int r6 = -r8
            byte r6 = (byte) r6     // Catch:{ all -> 0x0125 }
            r8 = r12 | 6720(0x1a40, float:9.417E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0125 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0125 }
            m11815as(r9, r6, r8, r11)     // Catch:{ all -> 0x0125 }
            r6 = 0
            r8 = r11[r6]     // Catch:{ all -> 0x0125 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0125 }
            java.lang.Class r6 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0125 }
            r8 = 1059(0x423, float:1.484E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0125 }
            r9 = 1801(0x709, float:2.524E-42)
            byte r9 = r15[r9]     // Catch:{ all -> 0x0125 }
            int r9 = r9 + r5
            byte r9 = (byte) r9     // Catch:{ all -> 0x0125 }
            r11 = 1459(0x5b3, float:2.044E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0125 }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x0125 }
            m11815as(r8, r9, r11, r12)     // Catch:{ all -> 0x0125 }
            r8 = 0
            r9 = r12[r8]     // Catch:{ all -> 0x0125 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0125 }
            r8 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r9, r8)     // Catch:{ all -> 0x0125 }
            java.lang.Object r3 = r6.invoke(r3, r8)     // Catch:{ all -> 0x0125 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0125 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0125 }
            r2[r7] = r3
            int r7 = r7 + 1
            r3 = 0
            r6 = 18
            r8 = 2385(0x951, float:3.342E-42)
            goto L_0x0086
        L_0x0125:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x012d
            throw r1
        L_0x012d:
            throw r0
        L_0x012e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0136
            throw r1
        L_0x0136:
            throw r0
        L_0x0137:
            r0 = 0
        L_0x0138:
            int r3 = r0 + 1
            r0 = r2[r0]     // Catch:{ all -> 0x0463 }
            int r0 = r1.mo9125d(r0)     // Catch:{ all -> 0x0463 }
            r7 = 10
            r8 = 15
            r9 = 12
            r12 = 14
            r13 = 20
            r15 = 16
            r11 = 9
            r6 = 2
            r14 = 8
            switch(r0) {
                case -25: goto L_0x0454;
                case -24: goto L_0x043d;
                case -23: goto L_0x0430;
                case -22: goto L_0x0419;
                case -21: goto L_0x040e;
                case -20: goto L_0x0403;
                case -19: goto L_0x03ec;
                case -18: goto L_0x03d7;
                case -17: goto L_0x03c4;
                case -16: goto L_0x03a9;
                case -15: goto L_0x0399;
                case -14: goto L_0x038d;
                case -13: goto L_0x0381;
                case -12: goto L_0x036b;
                case -11: goto L_0x0356;
                case -10: goto L_0x0348;
                case -9: goto L_0x0338;
                case -8: goto L_0x0330;
                case -7: goto L_0x032c;
                case -6: goto L_0x02b9;
                case -5: goto L_0x0284;
                case -4: goto L_0x01ea;
                case -3: goto L_0x01e1;
                case -2: goto L_0x0161;
                case -1: goto L_0x015e;
                default: goto L_0x0154;
            }
        L_0x0154:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r8 = 0
            r9 = 1060(0x424, float:1.485E-42)
        L_0x015a:
            r16 = 1801(0x709, float:2.524E-42)
            goto L_0x045f
        L_0x015e:
            r0 = r7
            goto L_0x0334
        L_0x0161:
            int[] r0 = new int[r13]     // Catch:{ all -> 0x027b }
            r13 = 1958952484(0x74c33e24, float:1.2374979E32)
            r17 = 0
            r0[r17] = r13     // Catch:{ all -> 0x027b }
            r13 = -564702117(0xffffffffde57545b, float:-3.87903167E18)
            r0[r5] = r13     // Catch:{ all -> 0x027b }
            r13 = -1420837882(0xffffffffab4fbc06, float:-7.380211E-13)
            r0[r6] = r13     // Catch:{ all -> 0x027b }
            r6 = 3
            r13 = -1670443146(0xffffffff9c6f0f76, float:-7.909845E-22)
            r0[r6] = r13     // Catch:{ all -> 0x027b }
            r6 = 4
            r13 = -965921621(0xffffffffc66d34ab, float:-15181.167)
            r0[r6] = r13     // Catch:{ all -> 0x027b }
            r6 = 5
            r13 = -1042648200(0xffffffffc1da7378, float:-27.306381)
            r0[r6] = r13     // Catch:{ all -> 0x027b }
            r6 = 6
            r13 = 722721669(0x2b13db85, float:5.2529536E-13)
            r0[r6] = r13     // Catch:{ all -> 0x027b }
            r6 = 7
            r13 = 532256691(0x1fb997b3, float:7.860151E-20)
            r0[r6] = r13     // Catch:{ all -> 0x027b }
            r6 = 1164065073(0x45623931, float:3619.5745)
            r0[r14] = r6     // Catch:{ all -> 0x027b }
            r6 = -1515513075(0xffffffffa5ab1b0d, float:-2.9682102E-16)
            r0[r11] = r6     // Catch:{ all -> 0x027b }
            r6 = 1834631688(0x6d5a4208, float:4.2217224E27)
            r0[r7] = r6     // Catch:{ all -> 0x027b }
            r6 = 11
            r7 = 748318900(0x2c9a70b4, float:4.389456E-12)
            r0[r6] = r7     // Catch:{ all -> 0x027b }
            r6 = 1740536775(0x67be7bc7, float:1.7990658E24)
            r0[r9] = r6     // Catch:{ all -> 0x027b }
            r6 = 13
            r7 = -902142563(0xffffffffca3a659d, float:-3053927.2)
            r0[r6] = r7     // Catch:{ all -> 0x027b }
            r6 = 1871666722(0x6f8f5e22, float:8.874031E28)
            r0[r12] = r6     // Catch:{ all -> 0x027b }
            r6 = -1173909673(0xffffffffba078f57, float:-5.1712006E-4)
            r0[r8] = r6     // Catch:{ all -> 0x027b }
            r6 = -668304993(0xffffffffd82a799f, float:-7.4975734E14)
            r0[r15] = r6     // Catch:{ all -> 0x027b }
            r6 = 17
            r7 = 39191024(0x25601f0, float:1.5722793E-37)
            r0[r6] = r7     // Catch:{ all -> 0x027b }
            r6 = 1176022538(0x4618ae0a, float:9771.51)
            r7 = 18
            r0[r7] = r6     // Catch:{ all -> 0x027b }
            r6 = 19
            r8 = 1673339499(0x63bd226b, float:6.9778294E21)
            r0[r6] = r8     // Catch:{ all -> 0x027b }
            r1.f10022f = r0     // Catch:{ all -> 0x027b }
            r0 = 24
        L_0x01dc:
            r1.mo9125d(r0)     // Catch:{ all -> 0x027b }
            goto L_0x0154
        L_0x01e1:
            r7 = 18
            java.lang.String r0 = ""
            r1.f10022f = r0     // Catch:{ all -> 0x027b }
            r0 = 24
            goto L_0x01dc
        L_0x01ea:
            r7 = 18
            r1.f10018b = r6     // Catch:{ all -> 0x027b }
            r1.mo9125d(r14)     // Catch:{ all -> 0x027b }
            r0 = 27
            r1.mo9125d(r0)     // Catch:{ all -> 0x027b }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x027b }
            r1.mo9125d(r11)     // Catch:{ all -> 0x027b }
            int r8 = r1.f10020d     // Catch:{ all -> 0x027b }
            char r8 = (char) r8
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x0270 }
            java.lang.Character r8 = java.lang.Character.valueOf(r8)     // Catch:{ all -> 0x0270 }
            r9[r5] = r8     // Catch:{ all -> 0x0270 }
            r8 = 0
            r9[r8] = r0     // Catch:{ all -> 0x0270 }
            r0 = 1045(0x415, float:1.464E-42)
            short r0 = (short) r0     // Catch:{ all -> 0x0270 }
            int r8 = f9519d     // Catch:{ all -> 0x0270 }
            r8 = r8 & 125(0x7d, float:1.75E-43)
            byte r8 = (byte) r8     // Catch:{ all -> 0x0270 }
            r11 = 4724(0x1274, float:6.62E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0270 }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x0270 }
            m11815as(r0, r8, r11, r12)     // Catch:{ all -> 0x0270 }
            r8 = 0
            r11 = r12[r8]     // Catch:{ all -> 0x0270 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0270 }
            java.lang.Class r8 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0270 }
            r12 = 1060(0x424, float:1.485E-42)
            short r11 = (short) r12
            byte[] r13 = f9518c     // Catch:{ all -> 0x026e }
            r14 = 1801(0x709, float:2.524E-42)
            byte r15 = r13[r14]     // Catch:{ all -> 0x026e }
            int r15 = r15 + r5
            byte r14 = (byte) r15     // Catch:{ all -> 0x026e }
            r15 = 3172(0xc64, float:4.445E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x026e }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x026e }
            m11815as(r11, r14, r15, r7)     // Catch:{ all -> 0x026e }
            r11 = 0
            r7 = r7[r11]     // Catch:{ all -> 0x026e }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x026e }
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ all -> 0x026e }
            r11 = 2385(0x951, float:3.342E-42)
            byte r13 = r13[r11]     // Catch:{ all -> 0x026e }
            int r11 = -r13
            byte r11 = (byte) r11     // Catch:{ all -> 0x026e }
            r13 = 6235(0x185b, float:8.737E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x026e }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x026e }
            m11815as(r0, r11, r13, r14)     // Catch:{ all -> 0x026e }
            r11 = 0
            r0 = r14[r11]     // Catch:{ all -> 0x026e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x026e }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x026e }
            r6[r11] = r0     // Catch:{ all -> 0x026e }
            java.lang.Class r0 = java.lang.Character.TYPE     // Catch:{ all -> 0x026e }
            r6[r5] = r0     // Catch:{ all -> 0x026e }
            java.lang.reflect.Method r0 = r8.getMethod(r7, r6)     // Catch:{ all -> 0x026e }
            r6 = 0
            java.lang.Object r0 = r0.invoke(r6, r9)     // Catch:{ all -> 0x026e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x026e }
            int r0 = r0.intValue()     // Catch:{ all -> 0x026e }
            r1.f10018b = r0     // Catch:{ all -> 0x02b5 }
            r1.mo9125d(r5)     // Catch:{ all -> 0x02b5 }
            goto L_0x02aa
        L_0x026e:
            r0 = move-exception
            goto L_0x0273
        L_0x0270:
            r0 = move-exception
            r12 = 1060(0x424, float:1.485E-42)
        L_0x0273:
            java.lang.Throwable r6 = r0.getCause()     // Catch:{ all -> 0x02b5 }
            if (r6 == 0) goto L_0x027a
            throw r6     // Catch:{ all -> 0x02b5 }
        L_0x027a:
            throw r0     // Catch:{ all -> 0x02b5 }
        L_0x027b:
            r0 = move-exception
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r8 = 0
            r9 = 1060(0x424, float:1.485E-42)
            goto L_0x0469
        L_0x0284:
            r12 = 1060(0x424, float:1.485E-42)
            r1.f10018b = r6     // Catch:{ all -> 0x02b5 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x02b5 }
            r0 = 27
            r1.mo9125d(r0)     // Catch:{ all -> 0x02b5 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x02b5 }
            int[] r0 = (int[]) r0     // Catch:{ all -> 0x02b5 }
            r1.mo9125d(r11)     // Catch:{ all -> 0x02b5 }
            int r6 = r1.f10020d     // Catch:{ all -> 0x02b5 }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x02b5 }
            m11816at(r0, r6, r7)     // Catch:{ all -> 0x02b5 }
            r6 = 0
            r0 = r7[r6]     // Catch:{ all -> 0x02b1 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x02b5 }
            r1.f10022f = r0     // Catch:{ all -> 0x02b5 }
            r0 = 24
            r1.mo9125d(r0)     // Catch:{ all -> 0x02b5 }
        L_0x02aa:
            r9 = r12
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r8 = 0
            goto L_0x015a
        L_0x02b1:
            r0 = move-exception
            r9 = r12
            goto L_0x0466
        L_0x02b5:
            r0 = move-exception
            r9 = r12
            goto L_0x0465
        L_0x02b9:
            r12 = 1060(0x424, float:1.485E-42)
            r1.f10018b = r5     // Catch:{ all -> 0x0322 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0322 }
            r0 = 27
            r1.mo9125d(r0)     // Catch:{ all -> 0x0322 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x0322 }
            byte[] r6 = f9518c     // Catch:{ all -> 0x0313 }
            r7 = 2385(0x951, float:3.342E-42)
            byte r8 = r6[r7]     // Catch:{ all -> 0x0310 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0310 }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x0310 }
            m11815as(r4, r8, r10, r9)     // Catch:{ all -> 0x0310 }
            r8 = 0
            r9 = r9[r8]     // Catch:{ all -> 0x030d }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0310 }
            java.lang.Class r8 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0310 }
            r9 = 1061(0x425, float:1.487E-42)
            short r9 = (short) r9
            r16 = 1801(0x709, float:2.524E-42)
            byte r6 = r6[r16]     // Catch:{ all -> 0x0309 }
            int r6 = r6 + r5
            byte r6 = (byte) r6     // Catch:{ all -> 0x0309 }
            r11 = 5086(0x13de, float:7.127E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0309 }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x0309 }
            m11815as(r9, r6, r11, r13)     // Catch:{ all -> 0x0309 }
            r6 = 0
            r9 = r13[r6]     // Catch:{ all -> 0x0307 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0307 }
            r13 = 0
            java.lang.reflect.Method r8 = r8.getMethod(r9, r13)     // Catch:{ all -> 0x0305 }
            java.lang.Object r0 = r8.invoke(r0, r13)     // Catch:{ all -> 0x0305 }
            r1.f10022f = r0     // Catch:{ all -> 0x03fe }
            r0 = 24
            r1.mo9125d(r0)     // Catch:{ all -> 0x03fe }
            goto L_0x03d3
        L_0x0305:
            r0 = move-exception
            goto L_0x031a
        L_0x0307:
            r0 = move-exception
            goto L_0x030b
        L_0x0309:
            r0 = move-exception
            r6 = 0
        L_0x030b:
            r13 = 0
            goto L_0x031a
        L_0x030d:
            r0 = move-exception
            r6 = r8
            goto L_0x0317
        L_0x0310:
            r0 = move-exception
            r6 = 0
            goto L_0x0317
        L_0x0313:
            r0 = move-exception
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
        L_0x0317:
            r13 = 0
            r16 = 1801(0x709, float:2.524E-42)
        L_0x031a:
            java.lang.Throwable r8 = r0.getCause()     // Catch:{ all -> 0x03fe }
            if (r8 == 0) goto L_0x0321
            throw r8     // Catch:{ all -> 0x03fe }
        L_0x0321:
            throw r0     // Catch:{ all -> 0x03fe }
        L_0x0322:
            r0 = move-exception
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r16 = 1801(0x709, float:2.524E-42)
            r9 = r12
            r8 = 0
            goto L_0x046b
        L_0x032c:
            r16 = 1801(0x709, float:2.524E-42)
            r0 = r15
            goto L_0x0334
        L_0x0330:
            r16 = 1801(0x709, float:2.524E-42)
            r0 = 32
        L_0x0334:
            r11 = 1060(0x424, float:1.485E-42)
            goto L_0x0138
        L_0x0338:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r13 = 0
            r16 = 1801(0x709, float:2.524E-42)
            r1.mo9125d(r15)     // Catch:{ all -> 0x03fe }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x03fe }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03fe }
            return r0
        L_0x0348:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r13 = 0
            r16 = 1801(0x709, float:2.524E-42)
            int r0 = f9526m     // Catch:{ all -> 0x03fe }
            r1.f10018b = r0     // Catch:{ all -> 0x03fe }
            goto L_0x03d0
        L_0x0356:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r13 = 0
            r16 = 1801(0x709, float:2.524E-42)
            r1.f10018b = r5     // Catch:{ all -> 0x03fe }
            r1.mo9125d(r14)     // Catch:{ all -> 0x03fe }
            r1.mo9125d(r11)     // Catch:{ all -> 0x03fe }
            int r0 = r1.f10020d     // Catch:{ all -> 0x03fe }
            f9527n = r0     // Catch:{ all -> 0x03fe }
            goto L_0x03d3
        L_0x036b:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r13 = 0
            r16 = 1801(0x709, float:2.524E-42)
            r1.mo9125d(r8)     // Catch:{ all -> 0x03fe }
            int r0 = r1.f10020d     // Catch:{ all -> 0x03fe }
            if (r0 != 0) goto L_0x037e
            r0 = 25
            goto L_0x043a
        L_0x037e:
            r0 = r3
            goto L_0x043a
        L_0x0381:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r13 = 0
            r16 = 1801(0x709, float:2.524E-42)
            r0 = 58
            goto L_0x043a
        L_0x038d:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r13 = 0
            r16 = 1801(0x709, float:2.524E-42)
            r0 = 56
            goto L_0x043a
        L_0x0399:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r13 = 0
            r16 = 1801(0x709, float:2.524E-42)
            r1.mo9125d(r15)     // Catch:{ all -> 0x03fe }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x03fe }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x03fe }
            throw r0     // Catch:{ all -> 0x03fe }
        L_0x03a9:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r13 = 0
            r16 = 1801(0x709, float:2.524E-42)
            r1.f10018b = r5     // Catch:{ all -> 0x03fe }
            r1.mo9125d(r14)     // Catch:{ all -> 0x03fe }
            r0 = 27
            r1.mo9125d(r0)     // Catch:{ all -> 0x03fe }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x03fe }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x03fe }
            r1.f10018b = r0     // Catch:{ all -> 0x03fe }
            goto L_0x03d0
        L_0x03c4:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r13 = 0
            r16 = 1801(0x709, float:2.524E-42)
            int r0 = f9527n     // Catch:{ all -> 0x03fe }
            r1.f10018b = r0     // Catch:{ all -> 0x03fe }
        L_0x03d0:
            r1.mo9125d(r5)     // Catch:{ all -> 0x03fe }
        L_0x03d3:
            r9 = r12
            r8 = r13
            goto L_0x045f
        L_0x03d7:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r13 = 0
            r16 = 1801(0x709, float:2.524E-42)
            r1.f10018b = r5     // Catch:{ all -> 0x03fe }
            r1.mo9125d(r14)     // Catch:{ all -> 0x03fe }
            r1.mo9125d(r11)     // Catch:{ all -> 0x03fe }
            int r0 = r1.f10020d     // Catch:{ all -> 0x03fe }
            f9526m = r0     // Catch:{ all -> 0x03fe }
            goto L_0x03d3
        L_0x03ec:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r13 = 0
            r16 = 1801(0x709, float:2.524E-42)
            r1.mo9125d(r9)     // Catch:{ all -> 0x03fe }
            int r0 = r1.f10020d     // Catch:{ all -> 0x03fe }
            if (r0 != 0) goto L_0x037e
            r0 = 40
            goto L_0x043a
        L_0x03fe:
            r0 = move-exception
            r9 = r12
            r8 = r13
            goto L_0x046b
        L_0x0403:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r13 = 0
            r16 = 1801(0x709, float:2.524E-42)
            r0 = 53
            goto L_0x043a
        L_0x040e:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r13 = 0
            r16 = 1801(0x709, float:2.524E-42)
            r0 = 51
            goto L_0x043a
        L_0x0419:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r8 = 0
            r12 = 1060(0x424, float:1.485E-42)
            r16 = 1801(0x709, float:2.524E-42)
            r1.mo9125d(r13)     // Catch:{ all -> 0x042d }
            int r0 = r1.f10020d     // Catch:{ all -> 0x042d }
            if (r0 == 0) goto L_0x042a
            r0 = r5
            goto L_0x043a
        L_0x042a:
            r0 = 41
            goto L_0x043a
        L_0x042d:
            r0 = move-exception
            r9 = r12
            goto L_0x046b
        L_0x0430:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r8 = 0
            r12 = 1060(0x424, float:1.485E-42)
            r16 = 1801(0x709, float:2.524E-42)
            r0 = 50
        L_0x043a:
            r11 = r12
            goto L_0x0138
        L_0x043d:
            r0 = 27
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r8 = 0
            r9 = 1060(0x424, float:1.485E-42)
            r16 = 1801(0x709, float:2.524E-42)
            r1.mo9125d(r13)     // Catch:{ all -> 0x0452 }
            int r3 = r1.f10020d     // Catch:{ all -> 0x0452 }
            r11 = 44
            if (r3 == r11) goto L_0x0460
            r0 = r12
            goto L_0x0460
        L_0x0452:
            r0 = move-exception
            goto L_0x046b
        L_0x0454:
            r6 = 0
            r7 = 2385(0x951, float:3.342E-42)
            r8 = 0
            r9 = 1060(0x424, float:1.485E-42)
            r16 = 1801(0x709, float:2.524E-42)
            r0 = 55
            goto L_0x0460
        L_0x045f:
            r0 = r3
        L_0x0460:
            r11 = r9
            goto L_0x0138
        L_0x0463:
            r0 = move-exception
            r9 = r11
        L_0x0465:
            r6 = 0
        L_0x0466:
            r7 = 2385(0x951, float:3.342E-42)
            r8 = 0
        L_0x0469:
            r16 = 1801(0x709, float:2.524E-42)
        L_0x046b:
            r11 = 28
            if (r3 < r11) goto L_0x047d
            r11 = 32
            if (r3 > r11) goto L_0x047d
            r1.f10022f = r0
            r0 = 23
            r1.mo9125d(r0)
            r0 = 26
            goto L_0x0460
        L_0x047d:
            throw r0
        L_0x047e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0486
            throw r1
        L_0x0486:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11769F():java.lang.String");
    }

    @JNI.C2746c(mo8795e = 470111729)
    /* renamed from: F */
    static native void m11770F(String str);

    @JNI.C2746c(mo8795e = 718243112)
    /* renamed from: G */
    static native void m11771G(String str, int i);

    /* JADX WARNING: type inference failed for: r0v17, types: [int, boolean] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized boolean m11772G() {
        /*
            java.lang.Class<com.facetec.sdk.cd> r1 = com.facetec.sdk.C2885cd.class
            monitor-enter(r1)
            com.facetec.sdk.do r2 = new com.facetec.sdk.do     // Catch:{ all -> 0x01eb }
            r2.<init>()     // Catch:{ all -> 0x01eb }
            r0 = 943(0x3af, float:1.321E-42)
            short r0 = (short) r0     // Catch:{ all -> 0x01eb }
            byte[] r3 = f9518c     // Catch:{ all -> 0x01eb }
            r4 = 21
            byte r4 = r3[r4]     // Catch:{ all -> 0x01eb }
            byte r4 = (byte) r4     // Catch:{ all -> 0x01eb }
            r5 = 7442(0x1d12, float:1.0428E-41)
            short r5 = (short) r5     // Catch:{ all -> 0x01eb }
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x01eb }
            m11815as(r0, r4, r5, r7)     // Catch:{ all -> 0x01eb }
            r0 = 0
            r4 = r7[r0]     // Catch:{ all -> 0x01eb }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x01eb }
            r5 = 1066(0x42a, float:1.494E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x01eb }
            r7 = 18
            byte r8 = r3[r7]     // Catch:{ all -> 0x01eb }
            byte r8 = (byte) r8     // Catch:{ all -> 0x01eb }
            r9 = r8 | 6193(0x1831, float:8.678E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x01eb }
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x01eb }
            m11815as(r5, r8, r9, r10)     // Catch:{ all -> 0x01eb }
            r5 = r10[r0]     // Catch:{ all -> 0x01eb }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x01eb }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x01e2 }
            r8[r0] = r5     // Catch:{ all -> 0x01e2 }
            r5 = 1051(0x41b, float:1.473E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x01e2 }
            r9 = 2385(0x951, float:3.342E-42)
            byte r10 = r3[r9]     // Catch:{ all -> 0x01e2 }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x01e2 }
            r11 = 5290(0x14aa, float:7.413E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x01e2 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x01e2 }
            m11815as(r5, r10, r11, r12)     // Catch:{ all -> 0x01e2 }
            r10 = r12[r0]     // Catch:{ all -> 0x01e2 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01e2 }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x01e2 }
            r12 = 1062(0x426, float:1.488E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x01e2 }
            r13 = 3127(0xc37, float:4.382E-42)
            byte r13 = r3[r13]     // Catch:{ all -> 0x01e2 }
            int r13 = r13 + r6
            byte r13 = (byte) r13     // Catch:{ all -> 0x01e2 }
            r14 = 4131(0x1023, float:5.789E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x01e2 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x01e2 }
            m11815as(r12, r13, r14, r15)     // Catch:{ all -> 0x01e2 }
            r12 = r15[r0]     // Catch:{ all -> 0x01e2 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x01e2 }
            java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch:{ all -> 0x01e2 }
            byte r3 = r3[r9]     // Catch:{ all -> 0x01e2 }
            int r3 = -r3
            byte r3 = (byte) r3     // Catch:{ all -> 0x01e2 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x01e2 }
            m11815as(r5, r3, r11, r14)     // Catch:{ all -> 0x01e2 }
            r3 = r14[r0]     // Catch:{ all -> 0x01e2 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01e2 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x01e2 }
            r13[r0] = r3     // Catch:{ all -> 0x01e2 }
            java.lang.reflect.Method r3 = r10.getMethod(r12, r13)     // Catch:{ all -> 0x01e2 }
            java.lang.Object r3 = r3.invoke(r4, r8)     // Catch:{ all -> 0x01e2 }
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch:{ all -> 0x01e2 }
            int r4 = r3.length     // Catch:{ all -> 0x01eb }
            int[] r4 = new int[r4]     // Catch:{ all -> 0x01eb }
            r8 = r0
        L_0x0089:
            int r10 = r3.length     // Catch:{ all -> 0x01eb }
            if (r8 >= r10) goto L_0x013c
            r10 = r3[r8]     // Catch:{ all -> 0x01eb }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0133 }
            r12[r0] = r10     // Catch:{ all -> 0x0133 }
            r10 = 1050(0x41a, float:1.471E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0133 }
            byte[] r13 = f9518c     // Catch:{ all -> 0x0133 }
            byte r14 = r13[r9]     // Catch:{ all -> 0x0133 }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x0133 }
            int r15 = f9519d     // Catch:{ all -> 0x0133 }
            r7 = r15 | 6720(0x1a40, float:9.417E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0133 }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x0133 }
            m11815as(r10, r14, r7, r9)     // Catch:{ all -> 0x0133 }
            r7 = r9[r0]     // Catch:{ all -> 0x0133 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0133 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0133 }
            r9 = 1060(0x424, float:1.485E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0133 }
            r14 = 74
            byte r14 = (byte) r14     // Catch:{ all -> 0x0133 }
            r0 = 1465(0x5b9, float:2.053E-42)
            short r0 = (short) r0     // Catch:{ all -> 0x0133 }
            r16 = r3
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0133 }
            m11815as(r9, r14, r0, r3)     // Catch:{ all -> 0x0133 }
            r0 = 0
            r3 = r3[r0]     // Catch:{ all -> 0x0133 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0133 }
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ all -> 0x0133 }
            r9 = 2385(0x951, float:3.342E-42)
            byte r14 = r13[r9]     // Catch:{ all -> 0x0133 }
            int r9 = -r14
            byte r9 = (byte) r9     // Catch:{ all -> 0x0133 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0133 }
            m11815as(r5, r9, r11, r14)     // Catch:{ all -> 0x0133 }
            r9 = 0
            r14 = r14[r9]     // Catch:{ all -> 0x0133 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0133 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0133 }
            r0[r9] = r14     // Catch:{ all -> 0x0133 }
            java.lang.reflect.Method r0 = r7.getMethod(r3, r0)     // Catch:{ all -> 0x0133 }
            r3 = 0
            java.lang.Object r0 = r0.invoke(r3, r12)     // Catch:{ all -> 0x0133 }
            r7 = 2385(0x951, float:3.342E-42)
            byte r9 = r13[r7]     // Catch:{ all -> 0x012a }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x012a }
            r12 = r15 | 6720(0x1a40, float:9.417E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x012a }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x012a }
            m11815as(r10, r9, r12, r14)     // Catch:{ all -> 0x012a }
            r9 = 0
            r10 = r14[r9]     // Catch:{ all -> 0x012a }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x012a }
            java.lang.Class r9 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x012a }
            r10 = 1059(0x423, float:1.484E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x012a }
            r12 = 1801(0x709, float:2.524E-42)
            byte r12 = r13[r12]     // Catch:{ all -> 0x012a }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x012a }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x012a }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x012a }
            m11815as(r10, r12, r13, r14)     // Catch:{ all -> 0x012a }
            r10 = 0
            r12 = r14[r10]     // Catch:{ all -> 0x012a }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x012a }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r3)     // Catch:{ all -> 0x012a }
            java.lang.Object r0 = r9.invoke(r0, r3)     // Catch:{ all -> 0x012a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x012a }
            int r0 = r0.intValue()     // Catch:{ all -> 0x012a }
            r4[r8] = r0     // Catch:{ all -> 0x01eb }
            int r8 = r8 + 1
            r9 = r7
            r0 = r10
            r3 = r16
            r7 = 18
            goto L_0x0089
        L_0x012a:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x01eb }
            if (r2 == 0) goto L_0x0132
            throw r2     // Catch:{ all -> 0x01eb }
        L_0x0132:
            throw r0     // Catch:{ all -> 0x01eb }
        L_0x0133:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x01eb }
            if (r2 == 0) goto L_0x013b
            throw r2     // Catch:{ all -> 0x01eb }
        L_0x013b:
            throw r0     // Catch:{ all -> 0x01eb }
        L_0x013c:
            r10 = r0
        L_0x013d:
            int r3 = r0 + 1
            r5 = 35
            r0 = r4[r0]     // Catch:{ all -> 0x01cf }
            int r0 = r2.mo9125d(r0)     // Catch:{ all -> 0x01cf }
            r7 = 9
            r8 = 8
            switch(r0) {
                case -18: goto L_0x01c9;
                case -17: goto L_0x01b9;
                case -16: goto L_0x01af;
                case -15: goto L_0x01ac;
                case -14: goto L_0x01a9;
                case -13: goto L_0x019d;
                case -12: goto L_0x0190;
                case -11: goto L_0x018b;
                case -10: goto L_0x0189;
                case -9: goto L_0x0186;
                case -8: goto L_0x017a;
                case -7: goto L_0x016d;
                case -6: goto L_0x0168;
                case -5: goto L_0x0160;
                case -4: goto L_0x015e;
                case -3: goto L_0x015b;
                case -2: goto L_0x0152;
                case -1: goto L_0x0150;
                default: goto L_0x014e;
            }     // Catch:{ all -> 0x01cf }
        L_0x014e:
            goto L_0x01cc
        L_0x0150:
            r0 = 3
            goto L_0x013d
        L_0x0152:
            boolean r0 = f9520e     // Catch:{ all -> 0x01cf }
            r2.f10018b = r0     // Catch:{ all -> 0x01cf }
        L_0x0156:
            r2.mo9125d(r6)     // Catch:{ all -> 0x01cf }
            goto L_0x01cc
        L_0x015b:
            r0 = 19
            goto L_0x013d
        L_0x015e:
            r0 = r8
            goto L_0x013d
        L_0x0160:
            r0 = 4
            r2.mo9125d(r0)     // Catch:{ all -> 0x01cf }
            int r0 = r2.f10020d     // Catch:{ all -> 0x01cf }
            monitor-exit(r1)
            return r0
        L_0x0168:
            int r0 = f9527n     // Catch:{ all -> 0x01cf }
            r2.f10018b = r0     // Catch:{ all -> 0x01cf }
            goto L_0x0156
        L_0x016d:
            r2.f10018b = r6     // Catch:{ all -> 0x01cf }
            r2.mo9125d(r8)     // Catch:{ all -> 0x01cf }
            r2.mo9125d(r7)     // Catch:{ all -> 0x01cf }
            int r0 = r2.f10020d     // Catch:{ all -> 0x01cf }
            f9526m = r0     // Catch:{ all -> 0x01cf }
            goto L_0x01cc
        L_0x017a:
            r0 = 12
            r2.mo9125d(r0)     // Catch:{ all -> 0x01cf }
            int r0 = r2.f10020d     // Catch:{ all -> 0x01cf }
            if (r0 != 0) goto L_0x01cc
            r0 = 17
            goto L_0x013d
        L_0x0186:
            r0 = 18
            goto L_0x013d
        L_0x0189:
            r0 = r6
            goto L_0x013d
        L_0x018b:
            int r0 = f9526m     // Catch:{ all -> 0x01cf }
            r2.f10018b = r0     // Catch:{ all -> 0x01cf }
            goto L_0x0156
        L_0x0190:
            r2.f10018b = r6     // Catch:{ all -> 0x01cf }
            r2.mo9125d(r8)     // Catch:{ all -> 0x01cf }
            r2.mo9125d(r7)     // Catch:{ all -> 0x01cf }
            int r0 = r2.f10020d     // Catch:{ all -> 0x01cf }
            f9527n = r0     // Catch:{ all -> 0x01cf }
            goto L_0x01cc
        L_0x019d:
            r0 = 15
            r2.mo9125d(r0)     // Catch:{ all -> 0x01cf }
            int r0 = r2.f10020d     // Catch:{ all -> 0x01cf }
            if (r0 != 0) goto L_0x01cc
            r0 = 28
            goto L_0x013d
        L_0x01a9:
            r0 = 38
            goto L_0x013d
        L_0x01ac:
            r0 = 36
            goto L_0x013d
        L_0x01af:
            r0 = 16
            r2.mo9125d(r0)     // Catch:{ all -> 0x01cf }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x01cf }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01cf }
            throw r0     // Catch:{ all -> 0x01cf }
        L_0x01b9:
            r0 = 20
            r2.mo9125d(r0)     // Catch:{ all -> 0x01cf }
            int r0 = r2.f10020d     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x01c5
            r0 = 6
            goto L_0x013d
        L_0x01c5:
            r0 = 30
            goto L_0x013d
        L_0x01c9:
            r0 = r5
            goto L_0x013d
        L_0x01cc:
            r0 = r3
            goto L_0x013d
        L_0x01cf:
            r0 = move-exception
            r7 = 31
            if (r3 < r7) goto L_0x01e1
            if (r3 > r5) goto L_0x01e1
            r2.f10022f = r0     // Catch:{ all -> 0x01eb }
            r0 = 23
            r2.mo9125d(r0)     // Catch:{ all -> 0x01eb }
            r0 = 29
            goto L_0x013d
        L_0x01e1:
            throw r0     // Catch:{ all -> 0x01eb }
        L_0x01e2:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x01eb }
            if (r2 == 0) goto L_0x01ea
            throw r2     // Catch:{ all -> 0x01eb }
        L_0x01ea:
            throw r0     // Catch:{ all -> 0x01eb }
        L_0x01eb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11772G():boolean");
    }

    /* renamed from: H */
    static void m11773H() {
        byte[] bArr = new byte[7571];
        System.arraycopy(";trRïýøÿ\u0002è\u001fà$Õø\tè÷\u0000úö\u0001úõ\u0002õ\u0001ô\u0002úô\u0003ò\u0004úó\u0004úò\u0005ñ\u0005ð\u0006öüÿúñ\u0006öû\u0000öüÿúð\u0007úï\bú÷üÿú÷üÿú÷û\u0000öù\u0002öø\u0003öüÿú÷ú\u0001öû\u0000öüÿú÷ù\u0002ú÷ø\u0003ú÷÷\u0004ú÷ö\u0005ò\u0004öõ\u0006öô\u0007öó\búó\u0004ú÷õ\u0006õü\u0000ú÷ô\u0007õû\u0001ú÷ô÷\u0000úö\u0001úõ\u0002úô\u0003úó\u0004õü\u0000úò\u0005ñþ\u0002úñ\u0006úð\u0007úï\bú÷üÿú÷û\u0000ú÷ú\u0001ñþ\u0002ú÷ù\u0002ú÷û\u0000ú÷ø\u0003õü\u0000ú÷÷\u0004ú÷ö\u0005ú÷õ\u0006ú÷ô\u0007ú÷ó\búöýÿúöü\u0000ñý\u0003úöû\u0001ñü\u0004úöú\u0002õõ\u0007úöù\u0003úöø\u0004úö÷\u0005úöýÿúöö\u0006úöõ\u0007úöô\bñû\u0005õ÷\u0005úõþÿòÿ\u0000úöù\u0003úöø\u0004úö÷\u0005úöö\u0006úö\u0001úõý\u0000õ\u0001öüÿöó\búõü\u0001öû\u0000öû\u0000ô\u0002úöö\u0006ò\u0004úõý\u0000úõû\u0002ñú\u0006òÿ\u0000òû\u0004ôý\u0000úõú\u0003öû\u0000öüÿúõù\u0004úõø\u0005úõ÷\u0006úõ÷\u0006úõû\u0002ñù\u0007òû\u0004ôú\u0003öüÿúõú\u0003öû\u0000öüÿúõö\u0007úõõ\búôÿÿúôÿÿúôþ\u0000õû\u0001úôý\u0001õü\u0000úôý÷\u0000úö\u0001ñø\búõ\u0002õûü\u0000úô\u0003ð\u0000\u0001öó\búó\u0004ò\u0004úò\u0005úñ\u0006õûû\u0001òþ\u0001úð\u0007ôù\u0004úï\bú÷üÿú÷û\u0000ú÷ú\u0001úö\u0001ñø\búõ\u0002ð\u0001\u0000öú÷\u0005öúù\u0003ò÷\bñ\u0001ÿúô\u0003ú÷ù\u0002õû\u0001ú÷ø\u0003õü\u0000ú÷øöó\u0002ÿ\u0001\u0004æ\u0010.½\u0006î\u00024àÖõ\nùýîî\u0005íþ\u0001\u00001³\bÿéDÓèÿéNÒãÿéùþ\b\rÞ\u0006ýî\u0005íþ\u0001\u00001º÷@ÙÙþ\u0007ùíû÷\u0000ñþ\u0002úö\u0001úõ\u0002úô\u0003úó\u0004úò\u0005ñþ\u0002úñ\u0006úð\u0007úï\bú÷üÿñþ\u0002ú÷û\u0000öûù\u0002öô\u0002\u0000ú÷ú\u0001ú÷ù\u0002ú÷ø\u0003öôú\böó\u0004ÿöó\u0003\u0000ú÷÷\u0004öó\u0002\u0001ú÷ö\u0005ú÷õ\u0006ú÷ô\u0007öõû\u0006öó\u0001\u0002öú÷\u0005ú÷ó\böó\u0000\u0003úöýÿñþ\u0002úöü\u0000öó\búöû\u0001öû\u0000óþ\u0000úöú\u0002ò\u0004úöù\u0003õ\u0001ô\u0002ú÷÷\u0004ò\u0004úöù\u0003úöø\u0004ô÷\u0006òÿ\u0000öø\u0003öüÿúö÷\u0005ôù\u0004úöö\u0006úöõ\u0007úöô\búöô\búõþÿöóÿ\u0004òû\u0004ôú\u0003öüÿúõý\u0000ôù\u0004úõü\u0001úõû\u0002úõú\u0003úõú\u0003úöø\u0004öóþ\u0005òÿ\u0000òû\u0004ôý\u0000úö÷\u0005öû\u0000öüÿúõù\u0004úõø\u0005úõ÷\u0006úõ÷\u0006úõö\u0007õü\u0000úõõ\bõû\u0001úõõ\búôÿÿöóý\u0006úôþ\u0000öüó\u0007úôþ\u0000úôý\u0001öóü\u0007úôü\u0002öóû\búôüî\u0005íþ\u0001\u00001º÷@ÝØûú\u0006îýì\u001fêè\u0007ýì\"ßö\u0000÷ó\u0003\"Õþö\u0002\fìôø\u0007õðö\u0000\u0004ð\nýì-Ôðü\u001eæî\u001dâì\u000eô÷\u0000úö\u0001õø\u0004úõ\u0002õ÷\u0005úô\u0003õõ\u0007úó\u0004úò\u0005úñ\u0006öû\u0000öû\u0000ô\u0002úð\u0007ò\u0004úï\bú÷üÿõô\bôþÿôý\u0000ú÷û\u0000öû\u0000öüÿú÷ú\u0001ú÷ù\u0002ú÷ø\u0003ú÷÷\u0004ò\u0004ôü\u0001ú÷ö\u0005öó\búï\bú÷õ\u0006ôû\u0002ôú\u0003öüÿú÷ô\u0007ôù\u0004ú÷ó\búöýÿúöü\u0000úö\u0001ôø\u0005úõ\u0002ô÷\u0006úô\u0003ôö\u0007úó\u0004úò\u0005úñ\u0006úöû\u0001õü\u0000úöú\u0002õû\u0001úöú\u0002úöù\u0003ôõ\búöø\u0004óÿÿúöøýì,Ýùöþ\u001cÖò\u0004æ\u0010.½\u0006î\u00024æÖ\u0002ê\u001aéï÷\u000bò\u0006ùýì\u0015æûý%Ïüõýþþô\u001aæ÷\u0003ñõü\u0004æ\u0010.½\u0006î\u00024äÈ\u0010ùð÷\u0006õüý\u0002öòú\u0004æ\u0010.½\u0006î\u00024ÖÚý\u0004ö\u0002 È\u0007ø\u0003úî÷\u0000úö\u0001úõ\u0002úô\u0003úó\u0004úò\u0005õü\u0000ñø\búñ\u0006ð\u0002ÿñø\búð\u0007ð\u0001\u0000úï\bú÷üÿð\u0000\u0001öó\bú÷û\u0000öû\u0000öû\u0000öüÿöó\búð\u0007ú÷ú\u0001ðÿ\u0002ôý\u0000ú÷ù\u0002ôù\u0004ú÷ø\u0003ú÷÷\u0004ú÷ö\u0005ú÷õ\u0006úö\u0001úõ\u0002ðþ\u0003öó\bú÷ô\u0007ú÷ó\búöýÿú÷ú\u0001ðý\u0004òÿ\u0000òû\u0004ôú\u0003öüÿú÷ù\u0002ôù\u0004úöü\u0000úöû\u0001úöú\u0002ðü\u0005ðû\u0006úð\u0007úöù\u0003óü\u0002úöø\u0004ðú\u0007úöø\u0004úö÷\u0005õü\u0000úöö\u0006õû\u0001úöö\u0006úöõ\u0007ðý\u0004úöô\bðù\búöô\u0004æ\u0010.½\u0006î\u00024Õçñþó\u0011úñ\u0002÷\u0000úö\u0001úõ\u0002úô\u0003úó\u0004úò\u0005úñ\u0006õû\u0001úð\u0007úï\bð\u0000\u0001öó\bú÷üÿöû\u0000öû\u0000öüÿöó\bú÷û\u0000ú÷ú\u0001ï\u0003ÿôý\u0000ú÷ù\u0002ôù\u0004ú÷ø\u0003ú÷÷\u0004ú÷ö\u0005ú÷õ\u0006úö\u0001ôü\u0001ï\u0002\u0000ú÷ô\u0007ú÷ó\bú÷û\u0000úöýÿï\u0001\u0001ð\u0006öüÿúöü\u0000ôù\u0004úöû\u0001úöú\u0002úöù\u0003úöù\u0003úöø\u0004õû\u0001úö÷\u0005õü\u0000úö÷\u0005úöö\u0006õû\u0001úöõ\u0007õü\u0000úöõ\bíÿþñ\f\råê\u0010\u001fÎ\u0005\fÚ\u000eè\n\u0001ç1Ï\u0006ú\u001aÏþý\u0015Úý\u0004ö\u0002øü\u0002\fððò\u000b\u0004æ\u0010.´ü\u0006ø9èÊû\fã(Þñú\u0004æ\u0010.Àõ<çÈ\nûüî\bü\u0010Õüÿöü\u001cÚý\bÿï÷\u0000úö\u0001úõ\u0002úô\u0003úó\u0004úò\u0005úñ\u0006úð\u0007õü\u0000úï\bú÷üÿï\u0000\u0002ú÷û\u0000ú÷ú\u0001ïþ\u0004ú÷ù\u0002ïý\u0005ïü\u0006ú÷ø\u0003ú÷÷\u0004ú÷ö\u0005ñþ\u0002ú÷õ\u0006ú÷ö\u0005ú÷ô\u0007ú÷ó\bñþ\u0002úöýÿúöü\u0000úöû\u0001öû\u0000öû\u0000ô\u0002úöú\u0002ò\u0004úöû\u0001úöù\u0003ïû\u0007òû\u0004ôú\u0003öüÿúöø\u0004ôù\u0004úö÷\u0005úöö\u0006úöõ\u0007úò\u0005úñ\u0006úð\u0007õü\u0000úï\bú÷üÿúöù\u0003ïú\bòþ\u0001úöø\u0004öû\u0000öüÿúöô\búõþÿúõý\u0000úõý\u0000úõü\u0001õü\u0000úõû\u0002õû\u0001úõû\u0002úõú\u0003õü\u0000úõù\u0004õû\u0001úõùýì\"çä\n÷ó\u0003\"Õþö\u0002\fìôø\u0007õðöýì.Ìûÿþ\u0001ýè\u0006õü&Ïüõ\nèÿî\u0005íþ\u0001\u00001Æïüõ\nòõA·\bí@èÉû\tì\"çî\bõýîî\u0005íþ\u0001\u00001µ\nèÿAèÎ\u0005íþ\u0001\u0000\u001cÖ\u0002ê\fùê\nî\u0004æ\u0010.½\u0006î\u00024ÖÚý\u0004ö\u0002\u0004æ\u0010.½\u0006î\u00024ÛÔ\u0003\u0006øîòø÷\týì\u001bçñ\bÿø\u000fÙ\u0004õø\u0004ðöýì.Éû\tìü÷\u0000úö\u0001ñø\búõ\u0002ð\u0001\u0000öú÷\u0005úô\u0003õ\u0001öüÿöó\búó\u0004ò\u0004úò\u0005úñ\u0006õû÷\u0005ôú\u0003öüÿúð\u0007öû\u0000öüÿúï\bú÷üÿú÷û\u0000ú÷ú\u0001ò\u0004ôü\u0001ú÷ù\u0002öó\búò\u0005úñ\u0006ïû\u0007òû\u0004ôú\u0003öüÿúð\u0007öû\u0000öüÿú÷ø\u0003ú÷÷\u0004ú÷ö\u0005ú÷ö\u0005ú÷õ\u0006õû\u0001ú÷ô\u0007õü\u0000ú÷ôöõ\nîÿî\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@à×\u0007õý\u001aÒø\u0000\u0007èýì\"ãíû\rõý\u0004æ\u0010.Àõ<ãØø\u0002\u0011Õüÿöü\u001cÚý\bÿï÷\u0000úö\u0001îþ\u0005úõ\u0002úô\u0003õúû\u0002õû\u0001õû\u0001úó\u0004òÿ\u0000öüô\u0006úò\u0005úñ\u0006úð\u0007úï\bú÷üÿõúú\u0003ú÷û\u0000öüûÿöüú\u0000òÿ\u0000ööü\u0004ú÷ú\u0001õúù\u0004öüú\u0000òÿ\u0000öüô\u0006úò\u0005úñ\u0006ñþ\u0002ú÷ù\u0002úï\bú÷ø\u0003õúø\u0005ú÷÷\u0004õú÷\u0006ú÷ö\u0005úñ\u0006ú÷õ\u0006úï\bú÷ô\u0007ï\u0001\u0001ú÷û\u0000õú÷\u0006ú÷ö\u0005úñ\u0006ú÷ó\búï\búöýÿöû\u0000öû\u0000öüÿöó\búöü\u0000ò\u0004úöû\u0001úöú\u0002ïû\u0007òû\u0004ôú\u0003öüÿúöù\u0003ôù\u0004úöø\u0004úö÷\u0005úöö\u0006úöõ\u0007ò\u0004ôü\u0001ï\u0002\u0000úöû\u0001úöú\u0002ðÿ\u0002ôú\u0003öüÿúöù\u0003ôù\u0004úöô\búõþÿúõý\u0000úõý\u0000úõü\u0001õ÷\u0005úõû\u0002õúö\u0007úõûî\u0005íþ\u0001\u00001µ\nèÿAÕêèÿ\u001aÜ\u0006øô\u0004æ\u0010.½\u0006î\u00024×Ø\u0002õ\u0006÷\u0003\u001bÈ\u0010ùð÷\u0006õüïüó\fîù\u001e×\u000fêù\u001céý\nà&Úý\u001aÚùð\bûíù\u0006úô\u0004æ\u0010.Àõ<ãØø\u0002\nÝ\u0004æ\u0010.½\u0006î\u00024Úèó\u0000ýê4î\u0005íþ\u0001\u00001´ü\u0006ø9ÕÖ\u0004\u0006ü\tððò\u000b÷\u0000úö\u0001ñø\búõ\u0002ð\u0001\u0000öú÷\u0005úô\u0003ð\u0000\u0001öó\búó\u0004ò\u0004úò\u0005úñ\u0006õûö\u0006ð\u0006öüÿúð\u0007ôù\u0004úï\bú÷üÿú÷û\u0000ú÷û\u0000úñ\u0006õø\u0004ð\u0006öüÿúð\u0007ôù\u0004ú÷ú\u0001ú÷ù\u0002ú÷ø\u0003ú÷÷\u0004ò\u0004óù\u0005öô\u0007öó\búò\u0005ú÷ö\u0005õü\u0000ú÷õ\u0006õû\u0001ú÷õè\nñúü÷\u0000úö\u0001ñø\búõ\u0002õûü\u0000úô\u0003õ\u0001ô\u0002úó\u0004ò\u0004úò\u0005úñ\u0006ï\u0003ÿôú\u0003öüÿúð\u0007öû\u0000öüÿúï\bú÷üÿú÷û\u0000ú÷ú\u0001úö\u0001ñø\búõ\u0002õûü\u0000õ÷\u0005ò÷\bñ\u0001ÿúô\u0003ú÷ù\u0002õü\u0000ú÷ø\u0003õû\u0001ú÷øï æ\u0000î\u0005íþ\u0001\u00001µ\nô\u0002ð\u0003ôüðFÆúò\u0007.æÚò\u0007\u0019Ùôû\u001bØ\u0007ýè\u0006õüú\u0006òî\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@ÙÜ\u0001öõ)÷\u0000úö\u0001ñø\búõ\u0002ð\u0001\u0000öú÷\u0005úô\u0003öû\u0000öû\u0000öüÿöó\búó\u0004ò\u0004úò\u0005úñ\u0006õûõ\u0007ð\u0006öüÿúð\u0007ôù\u0004úï\bú÷üÿú÷û\u0000ú÷û\u0000úñ\u0006õûô\bôý\u0000úð\u0007ôù\u0004ú÷ú\u0001ú÷ù\u0002ú÷ø\u0003ú÷øïý\u0006ôö\u0004\u0013ãÿéùþ\bü\fÚ\u000eè\níî\u0005íþ\u0001\u00001³\bÿéDÓèÿé/Ïü\u0003øýíþ\fè\u0006õüþÿþðî\u0005íþ\u0001\u00001³\bÿéDÓèÿé÷\u0000úö\u0001úõ\u0002úô\u0003úó\u0004úò\u0005õü\u0000úñ\u0006õû\u0001úð\u0007öõ\u0000\u0001úï\bú÷üÿú÷û\u0000ú÷ú\u0001öõÿ\u0002ú÷ù\u0002ú÷ø\u0003ú÷÷\u0004úï\bú÷ö\u0005ú÷õ\u0006ú÷ô\u0007ú÷ó\búöýÿôü\u0001úöü\u0000ú÷÷\u0004úï\búöû\u0001úöú\u0002úöù\u0003úöø\u0004ñþ\u0002úö÷\u0005úöö\u0006úöõ\u0007úöô\bõü\u0000õû\u0001õû\u0001õû\u0001úõþÿöõþ\u0003úõý\u0000õ÷\u0005úõü\u0001òÿ\u0000öüô\u0006úõû\u0002úõú\u0003úöõ\u0007úõù\u0004öõý\u0004õû\u0001úõø\u0005òÿ\u0000úõ÷\u0006úõú\u0003úöõ\u0007úõö\u0007öõü\u0005ú÷ö\u0005úõõ\böó\búöø\u0004öõû\u0006úöõ\u0007úöô\bõü\u0000úõý\u0000õû\u0001úôÿÿöõú\u0007úôþ\u0000öõù\böûõ\u0006úõû\u0002úõú\u0003úöõ\u0007úôý\u0001ööú\u0006úõý\u0000õ÷\u0005öûú\u0001úôü\u0002òÿ\u0000úõ÷\u0006úõú\u0003úöõ\u0007úõö\u0007ú÷ö\u0005öûù\u0002öùû\u0002úôû\u0003ñþ\u0002úôú\u0004úôý\u0001ï\u0001\u0001úõý\u0000õ÷\u0005úõü\u0001õõ\u0007úõ÷\u0006úõú\u0003öô\u0003ÿúôù\u0005úôø\u0006öõû\u0006úöü\u0000úô÷\u0007úôö\böô\u0002\u0000úó\u0000ÿöô\u0001\u0001öüö\u0004úóÿ\u0000öüõ\u0005òÿ\u0000úõ÷\u0006úõú\u0003öõû\u0006úóþ\u0001úóý\u0002ð\u0000\u0001öó\búóü\u0003ò\u0004úóû\u0004öû\u0000öû\u0000ô\u0002úöù\u0003öû\u0000óþ\u0000úð\u0007úóú\u0005öô\u0000\u0002òû\u0004ôú\u0003öüÿúóù\u0006ôù\u0004úóø\u0007úó÷\búò\u0001ÿöôÿ\u0003öó\búöù\u0003úóú\u0005öôþ\u0004öø\u0003öüÿúóù\u0006ôù\u0004úò\u0000\u0000úòÿ\u0001úòþ\u0002úòþ\u0002úòý\u0003öôý\u0005ôú\u0003öüÿúòü\u0004ôù\u0004úòû\u0005úòú\u0006úòù\u0007úòù\u0007úòý\u0003öôü\u0006òû\u0004ôý\u0000úòü\u0004öû\u0000öüÿúòø\búñ\u0002ÿúñ\u0001\u0000úñ\u0001\u0000úñ\u0000\u0001õü\u0000úñÿ\u0002õû\u0001úñÿ\u0002úñþ\u0003öôû\u0007úñý\u0004ðý\u0004úñýýì\"Ù\u0006ú÷\u0000úö\u0001úõ\u0002úô\u0003úó\u0004úò\u0005úñ\u0006úó\u0004úð\u0007öû\u0000óþ\u0000úï\bò\u0004ú÷üÿú÷û\u0000òü\u0003òû\u0004ôý\u0000ú÷ú\u0001öû\u0000öüÿú÷ù\u0002ú÷ø\u0003ú÷÷\u0004ú÷÷\u0004ú÷ö\u0005òú\u0005òÿ\u0000òþ\u0001ú÷õ\u0006ôù\u0004ú÷ô\u0007ú÷ó\búöýÿúöü\u0000ò\u0004ôü\u0001úöû\u0001öó\bú÷üÿú÷û\u0000òù\u0006ôú\u0003öüÿú÷ú\u0001ôù\u0004úöú\u0002úöù\u0003úöø\u0004úöü\u0000úö\u0001òø\u0007ò÷\bñ\u0001ÿúö÷\u0005úöö\u0006úöõ\u0007úöô\bõü\u0000úõþÿõû\u0001úõþÿúõý\u0000ñ\u0000\u0000úõü\u0001ñÿ\u0001úõüýì+Úÿø\u001cÖ\u0002êö\u0005úè$ä\u0004æ\u0010.½\u0006î\u00024·\búõ\u0002ýêAÜãì\u0007ô\u0006øûýì\"ßòûþøä\nñ(Ïþý\u0015Úý\u0004ö\u0002\bÿø÷\u0000úö\u0001úõ\u0002úô\u0003úó\u0004úò\u0005ó÷\u0007úñ\u0006óö\búð\u0007õ\u0001ô\u0002úï\bò\u0004ú÷üÿò\u0004ú÷üÿú÷û\u0000ò\u0000ÿòÿ\u0000òþ\u0001ú÷ú\u0001ôù\u0004ú÷ù\u0002ú÷ø\u0003ú÷÷\u0004ú÷ö\u0005ò\u0004ôü\u0001ú÷õ\u0006öó\bú÷üÿú÷û\u0000òý\u0002öø\u0003öüÿú÷ú\u0001öû\u0000öüÿú÷ô\u0007ú÷ó\búöýÿúöýÿúöü\u0000ôõ\búöû\u0001ôø\u0005úöû\u0001úöú\u0002õû\u0001úöù\u0003õü\u0000úöù÷\u0000õýûÿñþ\u0002õýú\u0000úö\u0001õýù\u0001úõ\u0002öó\búõ\u0002ö÷÷\búô\u0003úó\u0004úò\u0005ôü\u0001õýø\u0002öô\u0003ÿúñ\u0006úð\u0007õýø\u0002úï\bõý÷\u0003õýö\u0004ú÷üÿö÷÷\bõýõ\u0005ú÷û\u0000õýó\u0007ú÷ú\u0001ú÷ù\u0002ú÷ø\u0003õýò\bõüüÿú÷÷\u0004ú÷üÿö÷ø\u0007ú÷ö\u0005ö÷÷\bú÷õ\u0006ú÷ô\u0007õýö\u0004ö÷ø\u0007ú÷ó\búöýÿúöü\u0000ö÷ø\u0007ú÷ö\u0005úöü\u0000ö÷÷\bú÷õ\u0006õýõ\u0005úöû\u0001ñþ\u0002öõû\u0006úöú\u0002õüû\u0000úöù\u0003úöø\u0004öó\bö÷ø\u0007öûù\u0002õüú\u0001õüù\u0002öó\u0003\u0000úö÷\u0005õüø\u0003úöö\u0006úöõ\u0007úöô\bõü÷\u0004õüö\u0005õüõ\u0006úõþÿöõû\u0006úõý\u0000úõü\u0001õü\u0000úõû\u0002úõû\u0002õû\u0001õû\u0001úõú\u0003öõþ\u0003õû\u0001úõù\u0004öûõ\u0006úõø\u0005úõ÷\u0006úõý\u0000ö÷ø\u0007úõý\u0000úõö\u0007úõþÿöô\u0003ÿúõý\u0000úõü\u0001õü\u0000õû\u0001úõõ\bõõ\u0007õ÷\u0005úõû\u0002úõû\u0002öûú\u0001úõú\u0003öûõ\u0006úõø\u0005úõ÷\u0006úõý\u0000ö÷ø\u0007úõý\u0000úõö\u0007úôÿÿöó\u0000\u0003úôþ\u0000úôý\u0001õ\u0001öüÿöó\búôü\u0002ò\u0004ú÷ô\u0007öû\u0000öû\u0000ô\u0002úôþ\u0000úôû\u0003õüô\u0007òþ\u0001úôú\u0004öû\u0000öüÿúôù\u0005úôø\u0006úô÷\u0007úöû\u0001ò\u0004ðþ\u0003öó\bú÷ô\u0007úôû\u0003õüó\bòû\u0004ôý\u0000úôú\u0004öû\u0000öüÿúôö\búó\u0000ÿúóÿ\u0000úóÿ\u0000úóþ\u0001õûýÿúóý\u0002ööú\u0006úóý\u0002úóü\u0003õü\u0000úóû\u0004õû\u0001úóûþñúýì$áç\"èð\u0006ÿè+Úô\u0006ã÷\u0000úö\u0001úõ\u0002úô\u0003úó\u0004úò\u0005ñþ\u0002úñ\u0006úð\u0007úï\böó\bú÷üÿöû\u0000ôù\u0004öó\bú÷û\u0000ò\u0004ú÷ú\u0001ò\u0004ú÷ú\u0001ú÷ù\u0002ööú\u0006òÿ\u0000òþ\u0001ú÷ø\u0003ôù\u0004ú÷÷\u0004ú÷ö\u0005ú÷õ\u0006ú÷ô\u0007úö\u0001ööù\u0007ò÷\bñ\u0001ÿú÷ó\búô\u0003úó\u0004ú÷ù\u0002ööø\bôý\u0000ú÷ø\u0003öû\u0000öüÿúöýÿúöü\u0000úöû\u0001úöû\u0001úöú\u0002öõ\u0002ÿòÿ\u0000òþ\u0001úöù\u0003öû\u0000öüÿúöø\u0004úö÷\u0005úöö\u0006úöö\u0006úöõ\u0007õü\u0000úöô\bõû\u0001úöô\u0004æ\u0010.Àõ<ãØø\u0002\u0012Úö)Òõ\u0002\u0005\u001aÈ\u0010ùð÷\u0006õüýì\u001fÙ\bíû\tü\fÚ\u000eè\n\u001cÊþ\fè\u0006õüï(Øûú\u0006î\u0004æ\u0010.´ü\u0006ø9ÝÞñú÷\u0000úö\u0001öû\u0000óþ\u0000úõ\u0002ò\u0004úô\u0003úó\u0004óý\u0001ð\u0006öüÿúò\u0005öû\u0000öüÿúñ\u0006úð\u0007úï\bú÷üÿò\u0004óü\u0002óû\u0003úô\u0003ú÷û\u0000óú\u0004ú÷ú\u0001óù\u0005ú÷úýì.Îûúö\u000eè\u0006õüýì\u001cëìþþû%Üê\u001aåê\u0010ýì\u001fêùó\u0005õý\u0012èï\u0003ñ*Öò\býê\u0000øôî\u0005íþ\u0001\u00001Æïüõ\nòõAæÏüõ\nèÿî\u0005íþ\u0001\u00001³\bÿéDÞáç/Ê\fòõýì*Ô\u0006ìø\tü\u001cÎö\u001cæ÷\u0003ýì äûî\tì-Øúòø\b\u0007ñ\u0001\u0013ãÿéùþ\b\rÞ\u0006ýúô\u0002ì\nî\u0005íþ\u0001\u00001³\bÿéDÜÙö\u0006õü$Ê\fòõ÷\u0000úö\u0001ñø\búõ\u0002ð\u0001\u0000öú÷\u0005úô\u0003ð\u0000\u0001öó\búó\u0004ò\u0004úò\u0005úñ\u0006ôõ\bð\u0006öüÿúð\u0007ôù\u0004úï\bú÷üÿú÷û\u0000ú÷û\u0000ú÷ú\u0001ööú\u0006ð\u0006öüÿú÷ù\u0002öû\u0000öüÿú÷ø\u0003ú÷÷\u0004ú÷ö\u0005ú÷öî\u0005íþ\u0001\u00001º÷@çÈ\u0007ø\u0003ýì\"çóö\u001dØûú\u0006îþñú)Øø\u0002í÷\u0000úö\u0001ñø\búõ\u0002õûü\u0000úô\u0003öû\u0000ôù\u0004öó\búó\u0004ò\u0004úò\u0005úñ\u0006õûù\u0003òû\u0004ôý\u0000úð\u0007ôù\u0004úï\bú÷üÿú÷û\u0000ú÷ú\u0001ò\u0004óú\u0004ò÷\bñ\u0001ÿúò\u0005ú÷ù\u0002õûø\u0004òÿ\u0000öø\u0003öüÿú÷ø\u0003ôù\u0004ú÷÷\u0004ú÷ö\u0005ú÷õ\u0006ú÷õ\u0006ú÷ô\u0007õü\u0000ú÷ó\bõû\u0001ú÷óýì\"çä\n÷ó\u0003$Í\få\tö\u0002\u001fÝùöþ\råê\u0010\u0004æ\u0010.Àõ<ÚÕüÿöü\u001cÚý\bÿïýì.Úêÿþòü\n\u0010êè\u0007\u0010ðò\u000b\u0011äöõ\u0019ððò\u000b\u0002ò\u0002î\u0007÷\u0000úö\u0001úõ\u0002úô\u0003úó\u0004ð\u0001\u0000úò\u0005õü\u0000úñ\u0006õû\u0001úð\u0007öû\u0000ôù\u0004öó\búï\bò\u0004úñ\u0006ú÷üÿõúü\u0001öø\u0003öüÿú÷û\u0000öû\u0000öüÿú÷ú\u0001ú÷ù\u0002ú÷ø\u0003ú÷ø\u0003ú÷üÿîþ\u0005òÿ\u0000òû\u0004ôú\u0003öüÿú÷û\u0000öû\u0000öüÿú÷÷\u0004ú÷ö\u0005ú÷õ\u0006ð\u0001\u0000úò\u0005õû\u0001úñ\u0006ú÷ô\u0007ñÿ\u0001ú÷ó\bõûýÿú÷ó\búöýÿõü\u0000úöü\u0000õû\u0001úöüýì äûî\tì.Öí\nî\u0006éú&Ö\u0005úè$ä\u0004æ\u0010.½\u0006î\u00024Úèó\u0000ýê÷\u0000úö\u0001úõ\u0002úô\u0003úó\u0004î\u0004ÿî\u0003\u0000úò\u0005î\u0002\u0001úñ\u0006úð\u0007úï\bî\u0001\u0002ú÷üÿî\u0000\u0003ú÷û\u0000îÿ\u0004ú÷ú\u0001îþ\u0005ú÷ù\u0002ïý\u0005ïü\u0006ú÷ø\u0003ú÷÷\u0004îý\u0006ú÷ö\u0005ú÷õ\u0006îü\u0007ú÷ô\u0007ú÷ó\bîû\búöýÿöüûÿöüú\u0000òÿ\u0000úöü\u0000îû\búöû\u0001öüûÿöüú\u0000òÿ\u0000öüù\u0001öüö\u0004úöú\u0002öüõ\u0005õõ\u0007öüô\u0006úöù\u0003ú÷÷\u0004öüó\u0007úöø\u0004öüò\böüú\u0000îü\u0007ú÷ô\u0007õû\u0001úö÷\u0005úöö\u0006öûüÿúöõ\u0007úöô\búõþÿúõý\u0000î\u0002\u0001úõü\u0001úõû\u0002úõú\u0003úõù\u0004ï\u0000\u0002úõø\u0005öûú\u0001úõ÷\u0006öûù\u0002ï\u0000\u0002úõö\u0007îþ\u0005ú÷ö\u0005õ÷\u0005õû\u0001úõõ\bõõ\u0007ú÷ú\u0001öûø\u0003úôÿÿòÿ\u0000ú÷ø\u0003ú÷÷\u0004öû÷\u0004õû\u0001úôþ\u0000öüö\u0004öûö\u0005öûõ\u0006ú÷ô\u0007ú÷ó\bîû\bú÷ö\u0005õû\u0001úôý\u0001õõ\u0007úöü\u0000öûó\búôü\u0002öúýÿöúü\u0000õõ\u0007ôø\u0005õû\u0001úôû\u0003öúû\u0001öúú\u0002öüô\u0006úöù\u0003ú÷÷\u0004öúù\u0003ú÷ö\u0005õ÷\u0005úôú\u0004îü\u0007ú÷ô\u0007õû\u0001úö÷\u0005úöö\u0006ôü\u0001õû\u0001úöõ\u0007úöô\búõþÿúõý\u0000úôù\u0005úôø\u0006úõ\u0002úô\u0003ñþ\u0002õü\u0000öú÷\u0005úô÷\u0007öúö\u0006öúõ\u0007ñþ\u0002öúô\búô÷\u0007õû\u0001öùþÿöùü\u0001úôö\búó\u0000ÿúóÿ\u0000úóþ\u0001öûù\u0002öùû\u0002ñþ\u0002öùú\u0003úóý\u0002úóü\u0003öùù\u0004öùø\u0005úóý\u0002úóü\u0003öó\böù÷\u0006öú÷\u0005úóý\u0002úóü\u0003öùù\u0004öùö\u0007öú÷\u0005úóý\u0002úóü\u0003öó\böùõ\böú÷\u0005úóý\u0002úóü\u0003öøÿÿöøþ\u0000úóý\u0002úóü\u0003öùù\u0004öøý\u0001öú÷\u0005úóý\u0002úóü\u0003öó\böøü\u0002öûù\u0002öøû\u0003õõ\u0007õü\u0000öøú\u0004ñþ\u0002öøù\u0005öøø\u0006öø÷\u0007õõ\u0007öøö\búóû\u0004úóú\u0005úóù\u0006úóø\u0007úó÷\böûù\u0002ï\u0000\u0002ö÷\u0000ÿö÷ÿ\u0000úò\u0001ÿö÷þ\u0001úò\u0000\u0000úòÿ\u0001úòþ\u0002ñþ\u0002ö÷ü\u0003ö÷û\u0004úòý\u0003úòü\u0004úòû\u0005ö÷ù\u0006úòú\u0006úòù\u0007úòø\bö÷ø\u0007úñ\u0002ÿö÷÷\búñ\u0001\u0000úòø\böö\u0001ÿúò\u0001ÿúóø\u0007úñ\u0000\u0001úñÿ\u0002úñþ\u0003ð\u0000\u0001öó\búñý\u0004ð\u0000\u0001öó\búóÿ\u0000ð\u0000\u0001öó\búõø\u0005õ\u0001ô\u0002úñü\u0005úñû\u0006öö\u0000\u0000ôþÿôú\u0003öüÿúñú\u0007ôù\u0004úñù\búð\u0003ÿúð\u0002\u0000õ\u0001ööÿ\u0001öó\búõø\u0005úð\u0001\u0001ööþ\u0002òÿ\u0000òû\u0004ôý\u0000úð\u0000\u0002ôù\u0004úðÿ\u0003úðþ\u0004úðý\u0005úðý\u0005úð\u0001\u0001ôõ\bòÿ\u0000òû\u0004ôý\u0000úð\u0000\u0002öû\u0000öüÿúðü\u0006úðû\u0007úðú\búðú\búï\u0004ÿõü\u0000úï\u0003\u0000õû\u0001úï\u0003\u0000úï\u0002\u0001ööý\u0003úï\u0001\u0002ööü\u0004úï\u0001÷\u0000úö\u0001ñø\búõ\u0002õûü\u0000úô\u0003öû\u0000öû\u0000ô\u0002úó\u0004ò\u0004úò\u0005úñ\u0006õûú\u0002òû\u0004ôý\u0000úð\u0007öû\u0000öüÿúï\bú÷üÿú÷û\u0000ú÷û\u0000ú÷ú\u0001öù\u0002öø\u0003öüÿú÷ù\u0002öû\u0000öüÿú÷ø\u0003ú÷÷\u0004ú÷ö\u0005ú÷õ\u0006ò\u0004ôü\u0001ú÷ô\u0007öó\búò\u0005ú÷ó\bõû\u0001úöýÿõü\u0000úöýìû\u0006ò\u0005\u0004æ\u0010.Àõ<àÖùöü\u001cÚý\bÿï÷\u0000úö\u0001ñø\búõ\u0002õûü\u0000úô\u0003öû\u0000öû\u0000ô\u0002úó\u0004ò\u0004úò\u0005úñ\u0006õúþÿôþÿôý\u0000úð\u0007ôù\u0004úï\bú÷üÿú÷û\u0000ú÷ú\u0001úö\u0001ñø\búõ\u0002õûü\u0000ôü\u0001ú÷ù\u0002öó\búô\u0003ú÷ø\u0003õúý\u0000ú÷÷\u0004ðú\u0007ú÷÷".getBytes("ISO-8859-1"), 0, bArr, 0, 7571);
        f9518c = bArr;
        f9519d = 183;
    }

    @JNI.C2746c(mo8795e = 602210355)
    /* renamed from: H */
    static native void m11774H(String str, double d);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0154, code lost:
        r1.mo9125d(24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0181, code lost:
        r1.mo9125d(1);
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m11775I() {
        /*
            com.facetec.sdk.do r1 = new com.facetec.sdk.do
            r1.<init>()
            r0 = 892(0x37c, float:1.25E-42)
            short r0 = (short) r0
            byte[] r2 = f9518c
            r3 = 21
            byte r3 = r2[r3]
            byte r3 = (byte) r3
            r4 = r3 | 3116(0xc2c, float:4.366E-42)
            short r4 = (short) r4
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            m11815as(r0, r3, r4, r6)
            r0 = 0
            r3 = r6[r0]
            java.lang.String r3 = (java.lang.String) r3
            r4 = 1066(0x42a, float:1.494E-42)
            short r4 = (short) r4
            r6 = 18
            byte r6 = r2[r6]
            byte r6 = (byte) r6
            r7 = r6 | 6193(0x1831, float:8.678E-42)
            short r7 = (short) r7
            java.lang.Object[] r8 = new java.lang.Object[r5]
            m11815as(r4, r6, r7, r8)
            r4 = r8[r0]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            r6[r0] = r4     // Catch:{ all -> 0x0212 }
            r4 = 1051(0x41b, float:1.473E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x0212 }
            r7 = 2385(0x951, float:3.342E-42)
            byte r8 = r2[r7]     // Catch:{ all -> 0x0212 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0212 }
            r9 = 5290(0x14aa, float:7.413E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0212 }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            m11815as(r4, r8, r9, r10)     // Catch:{ all -> 0x0212 }
            r8 = r10[r0]     // Catch:{ all -> 0x0212 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0212 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0212 }
            r10 = 1062(0x426, float:1.488E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0212 }
            r11 = 3127(0xc37, float:4.382E-42)
            byte r11 = r2[r11]     // Catch:{ all -> 0x0212 }
            int r11 = r11 + r5
            byte r11 = (byte) r11     // Catch:{ all -> 0x0212 }
            r12 = 4131(0x1023, float:5.789E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0212 }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            m11815as(r10, r11, r12, r13)     // Catch:{ all -> 0x0212 }
            r10 = r13[r0]     // Catch:{ all -> 0x0212 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0212 }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x0212 }
            byte r2 = r2[r7]     // Catch:{ all -> 0x0212 }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x0212 }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x0212 }
            m11815as(r4, r2, r9, r12)     // Catch:{ all -> 0x0212 }
            r2 = r12[r0]     // Catch:{ all -> 0x0212 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0212 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0212 }
            r11[r0] = r2     // Catch:{ all -> 0x0212 }
            java.lang.reflect.Method r2 = r8.getMethod(r10, r11)     // Catch:{ all -> 0x0212 }
            java.lang.Object r2 = r2.invoke(r3, r6)     // Catch:{ all -> 0x0212 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x0212 }
            int r3 = r2.length
            int[] r3 = new int[r3]
            r6 = r0
        L_0x0086:
            int r8 = r2.length
            if (r6 >= r8) goto L_0x0133
            r8 = r2[r6]
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            r10[r0] = r8     // Catch:{ all -> 0x012a }
            r8 = 1050(0x41a, float:1.471E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012a }
            byte[] r11 = f9518c     // Catch:{ all -> 0x012a }
            byte r12 = r11[r7]     // Catch:{ all -> 0x012a }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x012a }
            int r13 = f9519d     // Catch:{ all -> 0x012a }
            r14 = r13 | 6720(0x1a40, float:9.417E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x012a }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            m11815as(r8, r12, r14, r15)     // Catch:{ all -> 0x012a }
            r12 = r15[r0]     // Catch:{ all -> 0x012a }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x012a }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x012a }
            r14 = 1060(0x424, float:1.485E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x012a }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x012a }
            r7 = 1465(0x5b9, float:2.053E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x012a }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            m11815as(r14, r15, r7, r0)     // Catch:{ all -> 0x012a }
            r7 = 0
            r0 = r0[r7]     // Catch:{ all -> 0x012a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x012a }
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x012a }
            r14 = 2385(0x951, float:3.342E-42)
            byte r15 = r11[r14]     // Catch:{ all -> 0x012a }
            int r14 = -r15
            byte r14 = (byte) r14     // Catch:{ all -> 0x012a }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            m11815as(r4, r14, r9, r15)     // Catch:{ all -> 0x012a }
            r14 = 0
            r15 = r15[r14]     // Catch:{ all -> 0x012a }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x012a }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x012a }
            r7[r14] = r15     // Catch:{ all -> 0x012a }
            java.lang.reflect.Method r0 = r12.getMethod(r0, r7)     // Catch:{ all -> 0x012a }
            r7 = 0
            java.lang.Object r0 = r0.invoke(r7, r10)     // Catch:{ all -> 0x012a }
            r10 = 2385(0x951, float:3.342E-42)
            byte r12 = r11[r10]     // Catch:{ all -> 0x0121 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x0121 }
            r13 = r13 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0121 }
            m11815as(r8, r12, r13, r14)     // Catch:{ all -> 0x0121 }
            r8 = 0
            r12 = r14[r8]     // Catch:{ all -> 0x0121 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0121 }
            java.lang.Class r8 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0121 }
            r12 = 1059(0x423, float:1.484E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0121 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r11 = r11[r13]     // Catch:{ all -> 0x0121 }
            int r11 = r11 + r5
            byte r11 = (byte) r11     // Catch:{ all -> 0x0121 }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0121 }
            m11815as(r12, r11, r13, r14)     // Catch:{ all -> 0x0121 }
            r11 = 0
            r12 = r14[r11]     // Catch:{ all -> 0x0121 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0121 }
            java.lang.reflect.Method r8 = r8.getMethod(r12, r7)     // Catch:{ all -> 0x0121 }
            java.lang.Object r0 = r8.invoke(r0, r7)     // Catch:{ all -> 0x0121 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0121 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0121 }
            r3[r6] = r0
            int r6 = r6 + 1
            r7 = r10
            r0 = r11
            goto L_0x0086
        L_0x0121:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0129
            throw r1
        L_0x0129:
            throw r0
        L_0x012a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0132
            throw r1
        L_0x0132:
            throw r0
        L_0x0133:
            r11 = r0
        L_0x0134:
            int r2 = r0 + 1
            r4 = 32
            r0 = r3[r0]     // Catch:{ all -> 0x01ff }
            int r0 = r1.mo9125d(r0)     // Catch:{ all -> 0x01ff }
            r6 = 24
            r7 = 27
            r8 = 20
            r9 = 8
            r10 = 15
            switch(r0) {
                case -24: goto L_0x01f8;
                case -23: goto L_0x01e9;
                case -22: goto L_0x01e5;
                case -21: goto L_0x01d3;
                case -20: goto L_0x01d0;
                case -19: goto L_0x01cc;
                case -18: goto L_0x01c1;
                case -17: goto L_0x01b0;
                case -16: goto L_0x01a6;
                case -15: goto L_0x01a3;
                case -14: goto L_0x01a0;
                case -13: goto L_0x0196;
                case -12: goto L_0x0186;
                case -11: goto L_0x017d;
                case -10: goto L_0x0176;
                case -9: goto L_0x0174;
                case -8: goto L_0x0172;
                case -7: goto L_0x016f;
                case -6: goto L_0x016c;
                case -5: goto L_0x0169;
                case -4: goto L_0x015e;
                case -3: goto L_0x0159;
                case -2: goto L_0x0150;
                case -1: goto L_0x014d;
                default: goto L_0x014b;
            }     // Catch:{ all -> 0x01ff }
        L_0x014b:
            goto L_0x01fc
        L_0x014d:
            r0 = 10
            goto L_0x0134
        L_0x0150:
            com.facetec.sdk.FaceTecAuditTrailType r0 = com.facetec.sdk.C2840bg.f9204e     // Catch:{ all -> 0x01ff }
            r1.f10022f = r0     // Catch:{ all -> 0x01ff }
        L_0x0154:
            r1.mo9125d(r6)     // Catch:{ all -> 0x01ff }
            goto L_0x01fc
        L_0x0159:
            com.facetec.sdk.FaceTecAuditTrailType r0 = com.facetec.sdk.FaceTecAuditTrailType.FULL_RESOLUTION     // Catch:{ all -> 0x01ff }
            r1.f10022f = r0     // Catch:{ all -> 0x01ff }
            goto L_0x0154
        L_0x015e:
            r0 = 47
            r1.mo9125d(r0)     // Catch:{ all -> 0x01ff }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x01fc
            r0 = 5
            goto L_0x0134
        L_0x0169:
            r0 = 46
            goto L_0x0134
        L_0x016c:
            r0 = 44
            goto L_0x0134
        L_0x016f:
            r0 = 17
            goto L_0x0134
        L_0x0172:
            r0 = r10
            goto L_0x0134
        L_0x0174:
            r0 = r4
            goto L_0x0134
        L_0x0176:
            r0 = 4
            r1.mo9125d(r0)     // Catch:{ all -> 0x01ff }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01ff }
            return r0
        L_0x017d:
            int r0 = f9526m     // Catch:{ all -> 0x01ff }
            r1.f10018b = r0     // Catch:{ all -> 0x01ff }
        L_0x0181:
            r1.mo9125d(r5)     // Catch:{ all -> 0x01ff }
            goto L_0x01fc
        L_0x0186:
            r1.f10018b = r5     // Catch:{ all -> 0x01ff }
            r1.mo9125d(r9)     // Catch:{ all -> 0x01ff }
            r0 = 9
            r1.mo9125d(r0)     // Catch:{ all -> 0x01ff }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01ff }
            f9527n = r0     // Catch:{ all -> 0x01ff }
            goto L_0x01fc
        L_0x0196:
            r1.mo9125d(r10)     // Catch:{ all -> 0x01ff }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x01fc
            r0 = 25
            goto L_0x0134
        L_0x01a0:
            r0 = 51
            goto L_0x0134
        L_0x01a3:
            r0 = 49
            goto L_0x0134
        L_0x01a6:
            r0 = 16
            r1.mo9125d(r0)     // Catch:{ all -> 0x01ff }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01ff }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01ff }
            throw r0     // Catch:{ all -> 0x01ff }
        L_0x01b0:
            r1.f10018b = r5     // Catch:{ all -> 0x01ff }
            r1.mo9125d(r9)     // Catch:{ all -> 0x01ff }
            r1.mo9125d(r7)     // Catch:{ all -> 0x01ff }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01ff }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x01ff }
            r1.f10018b = r0     // Catch:{ all -> 0x01ff }
            goto L_0x0181
        L_0x01c1:
            r1.mo9125d(r10)     // Catch:{ all -> 0x01ff }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x01fc
            r0 = 41
            goto L_0x0134
        L_0x01cc:
            r0 = 42
            goto L_0x0134
        L_0x01d0:
            r0 = r5
            goto L_0x0134
        L_0x01d3:
            r1.mo9125d(r8)     // Catch:{ all -> 0x01ff }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01ff }
            r2 = 56
            r4 = 6
            if (r0 == r2) goto L_0x0174
            r2 = 91
            if (r0 == r2) goto L_0x01e2
            goto L_0x0174
        L_0x01e2:
            r0 = r9
            goto L_0x0134
        L_0x01e5:
            r0 = 43
            goto L_0x0134
        L_0x01e9:
            r1.mo9125d(r8)     // Catch:{ all -> 0x01ff }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01ff }
            r2 = 13
            if (r0 == 0) goto L_0x01fc
            if (r0 == r5) goto L_0x01f5
            goto L_0x01fc
        L_0x01f5:
            r0 = r7
            goto L_0x0134
        L_0x01f8:
            r0 = 48
            goto L_0x0134
        L_0x01fc:
            r0 = r2
            goto L_0x0134
        L_0x01ff:
            r0 = move-exception
            r6 = 28
            if (r2 < r6) goto L_0x0211
            if (r2 > r4) goto L_0x0211
            r1.f10022f = r0
            r0 = 23
            r1.mo9125d(r0)
            r0 = 26
            goto L_0x0134
        L_0x0211:
            throw r0
        L_0x0212:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x021a
            throw r1
        L_0x021a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11775I():int");
    }

    @JNI.C2746c(mo8795e = 542860974)
    /* renamed from: I */
    static native void m11776I(String str, int i);

    @JNI.C2746c(mo8795e = 195978237)
    /* renamed from: J */
    static native void m11777J(String str, boolean z);

    @JNI.C2746c(mo8795e = 916841651)
    /* renamed from: K */
    static native void m11778K(String str, String str2);

    @JNI.C2746c(mo8795e = 392938234)
    /* renamed from: L */
    static native void m11779L(String str, String str2);

    @JNI.C2746c(mo8795e = 579690330)
    /* renamed from: M */
    static native void m11780M(String str, int i);

    @JNI.C2746c(mo8795e = 980875271)
    /* renamed from: N */
    static native void m11781N(String str);

    @JNI.C2746c(mo8795e = 435246041)
    /* renamed from: O */
    static native void m11782O(String str);

    @JNI.C2746c(mo8795e = 957213713)
    /* renamed from: P */
    static native void m11783P(String str);

    @JNI.C2746c(mo8795e = 136507427)
    /* renamed from: Q */
    static native void m11784Q(String str);

    @JNI.C2746c(mo8795e = 774884799)
    /* renamed from: R */
    static native void m11785R(String str);

    @JNI.C2746c(mo8795e = 426837000)
    /* renamed from: S */
    static native void m11786S(String str);

    @JNI.C2746c(mo8795e = 534730124)
    /* renamed from: T */
    static native void m11787T(String str);

    @JNI.C2746c(mo8795e = 185267964)
    /* renamed from: U */
    static native void m11788U(String str);

    @JNI.C2746c(mo8795e = 759765299)
    /* renamed from: V */
    static native void m11789V(String str);

    @JNI.C2746c(mo8795e = 802163113)
    /* renamed from: W */
    static native void m11790W(int i);

    @JNI.C2746c(mo8795e = 218119279)
    /* renamed from: X */
    static native void m11791X(String str);

    @JNI.C2746c(mo8795e = 251547157)
    /* renamed from: Y */
    static native String m11792Y(String str, boolean z);

    @JNI.C2746c(mo8795e = 695266568)
    /* renamed from: Z */
    static native void m11793Z();

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x015e, code lost:
        r1.mo9125d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x016c, code lost:
        r0 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x016e, code lost:
        r0 = 8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m11794a() {
        /*
            com.facetec.sdk.do r1 = new com.facetec.sdk.do
            r1.<init>()
            r0 = 839(0x347, float:1.176E-42)
            short r0 = (short) r0
            byte[] r2 = f9518c
            r3 = 21
            byte r3 = r2[r3]
            byte r3 = (byte) r3
            r4 = r3 | 3408(0xd50, float:4.776E-42)
            short r4 = (short) r4
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            m11815as(r0, r3, r4, r6)
            r0 = 0
            r3 = r6[r0]
            java.lang.String r3 = (java.lang.String) r3
            r4 = 1066(0x42a, float:1.494E-42)
            short r4 = (short) r4
            r6 = 18
            byte r6 = r2[r6]
            byte r6 = (byte) r6
            r7 = r6 | 6193(0x1831, float:8.678E-42)
            short r7 = (short) r7
            java.lang.Object[] r8 = new java.lang.Object[r5]
            m11815as(r4, r6, r7, r8)
            r4 = r8[r0]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0252 }
            r6[r0] = r4     // Catch:{ all -> 0x0252 }
            r4 = 1051(0x41b, float:1.473E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x0252 }
            r7 = 2385(0x951, float:3.342E-42)
            byte r8 = r2[r7]     // Catch:{ all -> 0x0252 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0252 }
            r9 = 5290(0x14aa, float:7.413E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0252 }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x0252 }
            m11815as(r4, r8, r9, r10)     // Catch:{ all -> 0x0252 }
            r8 = r10[r0]     // Catch:{ all -> 0x0252 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0252 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0252 }
            r10 = 1062(0x426, float:1.488E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0252 }
            r11 = 3127(0xc37, float:4.382E-42)
            byte r11 = r2[r11]     // Catch:{ all -> 0x0252 }
            int r11 = r11 + r5
            byte r11 = (byte) r11     // Catch:{ all -> 0x0252 }
            r12 = 4131(0x1023, float:5.789E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0252 }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x0252 }
            m11815as(r10, r11, r12, r13)     // Catch:{ all -> 0x0252 }
            r10 = r13[r0]     // Catch:{ all -> 0x0252 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0252 }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x0252 }
            byte r2 = r2[r7]     // Catch:{ all -> 0x0252 }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x0252 }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x0252 }
            m11815as(r4, r2, r9, r12)     // Catch:{ all -> 0x0252 }
            r2 = r12[r0]     // Catch:{ all -> 0x0252 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0252 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0252 }
            r11[r0] = r2     // Catch:{ all -> 0x0252 }
            java.lang.reflect.Method r2 = r8.getMethod(r10, r11)     // Catch:{ all -> 0x0252 }
            java.lang.Object r2 = r2.invoke(r3, r6)     // Catch:{ all -> 0x0252 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x0252 }
            int r3 = r2.length
            int[] r3 = new int[r3]
            r6 = r0
        L_0x0086:
            int r8 = r2.length
            if (r6 >= r8) goto L_0x0133
            r8 = r2[r6]
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            r10[r0] = r8     // Catch:{ all -> 0x012a }
            r8 = 1050(0x41a, float:1.471E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012a }
            byte[] r11 = f9518c     // Catch:{ all -> 0x012a }
            byte r12 = r11[r7]     // Catch:{ all -> 0x012a }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x012a }
            int r13 = f9519d     // Catch:{ all -> 0x012a }
            r14 = r13 | 6720(0x1a40, float:9.417E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x012a }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            m11815as(r8, r12, r14, r15)     // Catch:{ all -> 0x012a }
            r12 = r15[r0]     // Catch:{ all -> 0x012a }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x012a }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x012a }
            r14 = 1060(0x424, float:1.485E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x012a }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x012a }
            r7 = 1465(0x5b9, float:2.053E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x012a }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            m11815as(r14, r15, r7, r0)     // Catch:{ all -> 0x012a }
            r7 = 0
            r0 = r0[r7]     // Catch:{ all -> 0x012a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x012a }
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x012a }
            r14 = 2385(0x951, float:3.342E-42)
            byte r15 = r11[r14]     // Catch:{ all -> 0x012a }
            int r14 = -r15
            byte r14 = (byte) r14     // Catch:{ all -> 0x012a }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            m11815as(r4, r14, r9, r15)     // Catch:{ all -> 0x012a }
            r14 = 0
            r15 = r15[r14]     // Catch:{ all -> 0x012a }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x012a }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x012a }
            r7[r14] = r15     // Catch:{ all -> 0x012a }
            java.lang.reflect.Method r0 = r12.getMethod(r0, r7)     // Catch:{ all -> 0x012a }
            r7 = 0
            java.lang.Object r0 = r0.invoke(r7, r10)     // Catch:{ all -> 0x012a }
            r10 = 2385(0x951, float:3.342E-42)
            byte r12 = r11[r10]     // Catch:{ all -> 0x0121 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x0121 }
            r13 = r13 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0121 }
            m11815as(r8, r12, r13, r14)     // Catch:{ all -> 0x0121 }
            r8 = 0
            r12 = r14[r8]     // Catch:{ all -> 0x0121 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0121 }
            java.lang.Class r8 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0121 }
            r12 = 1059(0x423, float:1.484E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0121 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r11 = r11[r13]     // Catch:{ all -> 0x0121 }
            int r11 = r11 + r5
            byte r11 = (byte) r11     // Catch:{ all -> 0x0121 }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0121 }
            m11815as(r12, r11, r13, r14)     // Catch:{ all -> 0x0121 }
            r11 = 0
            r12 = r14[r11]     // Catch:{ all -> 0x0121 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0121 }
            java.lang.reflect.Method r8 = r8.getMethod(r12, r7)     // Catch:{ all -> 0x0121 }
            java.lang.Object r0 = r8.invoke(r0, r7)     // Catch:{ all -> 0x0121 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0121 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0121 }
            r3[r6] = r0
            int r6 = r6 + 1
            r7 = r10
            r0 = r11
            goto L_0x0086
        L_0x0121:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0129
            throw r1
        L_0x0129:
            throw r0
        L_0x012a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0132
            throw r1
        L_0x0132:
            throw r0
        L_0x0133:
            r11 = r0
        L_0x0134:
            int r2 = r0 + 1
            r4 = 23
            r6 = 34
            r7 = 57
            r8 = 40
            r0 = r3[r0]     // Catch:{ all -> 0x023a }
            int r0 = r1.mo9125d(r0)     // Catch:{ all -> 0x023a }
            r9 = 5
            r10 = 15
            r11 = 20
            r12 = 14
            r13 = 9
            r14 = 12
            r15 = 8
            switch(r0) {
                case -32: goto L_0x0233;
                case -31: goto L_0x0224;
                case -30: goto L_0x0221;
                case -29: goto L_0x0216;
                case -28: goto L_0x0212;
                case -27: goto L_0x020e;
                case -26: goto L_0x0203;
                case -25: goto L_0x01ff;
                case -24: goto L_0x01fb;
                case -23: goto L_0x01f0;
                case -22: goto L_0x01dc;
                case -21: goto L_0x01d2;
                case -20: goto L_0x01cf;
                case -19: goto L_0x01cb;
                case -18: goto L_0x01c0;
                case -17: goto L_0x01b2;
                case -16: goto L_0x01ad;
                case -15: goto L_0x01ab;
                case -14: goto L_0x01a8;
                case -13: goto L_0x019f;
                case -12: goto L_0x0191;
                case -11: goto L_0x018c;
                case -10: goto L_0x018b;
                case -9: goto L_0x0189;
                case -8: goto L_0x0186;
                case -7: goto L_0x0177;
                case -6: goto L_0x0170;
                case -5: goto L_0x016e;
                case -4: goto L_0x016c;
                case -3: goto L_0x0163;
                case -2: goto L_0x0158;
                case -1: goto L_0x0156;
                default: goto L_0x0154;
            }     // Catch:{ all -> 0x023a }
        L_0x0154:
            goto L_0x0237
        L_0x0156:
            r0 = r13
            goto L_0x0134
        L_0x0158:
            boolean r0 = m11772G()     // Catch:{ all -> 0x023a }
            r1.f10018b = r0     // Catch:{ all -> 0x023a }
        L_0x015e:
            r1.mo9125d(r5)     // Catch:{ all -> 0x023a }
            goto L_0x0237
        L_0x0163:
            r1.mo9125d(r14)     // Catch:{ all -> 0x023a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x023a }
            if (r0 != 0) goto L_0x0237
            r0 = 4
            goto L_0x0134
        L_0x016c:
            r0 = r12
            goto L_0x0134
        L_0x016e:
            r0 = r15
            goto L_0x0134
        L_0x0170:
            int r0 = m11775I()     // Catch:{ all -> 0x023a }
            r1.f10018b = r0     // Catch:{ all -> 0x023a }
            goto L_0x015e
        L_0x0177:
            r1.f10018b = r5     // Catch:{ all -> 0x023a }
            r1.mo9125d(r15)     // Catch:{ all -> 0x023a }
            r1.mo9125d(r13)     // Catch:{ all -> 0x023a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x023a }
            m11812ap(r0)     // Catch:{ all -> 0x023a }
            goto L_0x0237
        L_0x0186:
            r0 = 25
            goto L_0x0134
        L_0x0189:
            r0 = r8
            goto L_0x0134
        L_0x018b:
            return
        L_0x018c:
            int r0 = f9526m     // Catch:{ all -> 0x023a }
            r1.f10018b = r0     // Catch:{ all -> 0x023a }
            goto L_0x015e
        L_0x0191:
            r1.f10018b = r5     // Catch:{ all -> 0x023a }
            r1.mo9125d(r15)     // Catch:{ all -> 0x023a }
            r1.mo9125d(r13)     // Catch:{ all -> 0x023a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x023a }
            f9527n = r0     // Catch:{ all -> 0x023a }
            goto L_0x0237
        L_0x019f:
            r1.mo9125d(r10)     // Catch:{ all -> 0x023a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x023a }
            if (r0 != 0) goto L_0x0237
            r0 = r4
            goto L_0x0134
        L_0x01a8:
            r0 = 24
            goto L_0x0134
        L_0x01ab:
            r0 = r9
            goto L_0x0134
        L_0x01ad:
            int r0 = f9527n     // Catch:{ all -> 0x023a }
            r1.f10018b = r0     // Catch:{ all -> 0x023a }
            goto L_0x015e
        L_0x01b2:
            r1.f10018b = r5     // Catch:{ all -> 0x023a }
            r1.mo9125d(r15)     // Catch:{ all -> 0x023a }
            r1.mo9125d(r13)     // Catch:{ all -> 0x023a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x023a }
            f9526m = r0     // Catch:{ all -> 0x023a }
            goto L_0x0237
        L_0x01c0:
            r1.mo9125d(r14)     // Catch:{ all -> 0x023a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x023a }
            if (r0 != 0) goto L_0x0237
            r0 = 33
            goto L_0x0134
        L_0x01cb:
            r0 = 35
            goto L_0x0134
        L_0x01cf:
            r0 = r14
            goto L_0x0134
        L_0x01d2:
            r0 = 16
            r1.mo9125d(r0)     // Catch:{ all -> 0x023a }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x023a }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x023a }
            throw r0     // Catch:{ all -> 0x023a }
        L_0x01dc:
            r1.f10018b = r5     // Catch:{ all -> 0x023a }
            r1.mo9125d(r15)     // Catch:{ all -> 0x023a }
            r0 = 27
            r1.mo9125d(r0)     // Catch:{ all -> 0x023a }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x023a }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x023a }
            r1.f10018b = r0     // Catch:{ all -> 0x023a }
            goto L_0x015e
        L_0x01f0:
            r1.mo9125d(r10)     // Catch:{ all -> 0x023a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x023a }
            if (r0 != 0) goto L_0x0237
            r0 = 48
            goto L_0x0134
        L_0x01fb:
            r0 = 65
            goto L_0x0134
        L_0x01ff:
            r0 = 63
            goto L_0x0134
        L_0x0203:
            r1.mo9125d(r14)     // Catch:{ all -> 0x023a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x023a }
            if (r0 != 0) goto L_0x0237
            r0 = 56
            goto L_0x0134
        L_0x020e:
            r0 = 60
            goto L_0x0134
        L_0x0212:
            r0 = 58
            goto L_0x0134
        L_0x0216:
            r1.mo9125d(r11)     // Catch:{ all -> 0x023a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x016c
            if (r0 == r5) goto L_0x016e
            goto L_0x016c
        L_0x0221:
            r0 = r7
            goto L_0x0134
        L_0x0224:
            r1.mo9125d(r11)     // Catch:{ all -> 0x023a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x023a }
            r2 = 50
            if (r0 == r9) goto L_0x0237
            if (r0 == r6) goto L_0x0230
            goto L_0x0237
        L_0x0230:
            r0 = r5
            goto L_0x0134
        L_0x0233:
            r0 = 62
            goto L_0x0134
        L_0x0237:
            r0 = r2
            goto L_0x0134
        L_0x023a:
            r0 = move-exception
            r9 = 36
            if (r2 < r9) goto L_0x0243
            if (r2 > r8) goto L_0x0243
            r2 = r6
            goto L_0x024b
        L_0x0243:
            r6 = 51
            if (r2 < r6) goto L_0x0251
            if (r2 > r7) goto L_0x0251
            r2 = 49
        L_0x024b:
            r1.f10022f = r0
            r1.mo9125d(r4)
            goto L_0x0237
        L_0x0251:
            throw r0
        L_0x0252:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x025a
            throw r1
        L_0x025a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11794a():void");
    }

    @JNI.C2746c(mo8795e = 465999614)
    /* renamed from: a */
    static native void m11796a(boolean z);

    @JNI.C2746c(mo8795e = 854339086)
    /* renamed from: aa */
    static native boolean m11797aa();

    @JNI.C2746c(mo8795e = 801550182)
    /* renamed from: ab */
    static native void m11798ab();

    @JNI.C2746c(mo8795e = 953865493)
    /* renamed from: ac */
    static native void m11799ac(boolean z);

    @JNI.C2746c(mo8795e = 559139395)
    /* renamed from: ad */
    private static native void m11800ad();

    @JNI.C2746c(mo8795e = 417661065)
    /* renamed from: ae */
    private static native int m11801ae();

    @JNI.C2746c(mo8795e = 828862140)
    /* renamed from: af */
    private static native int m11802af();

    @JNI.C2746c(mo8795e = 331891646)
    /* renamed from: ag */
    private static native void m11803ag(String str, String str2, int i);

    @JNI.C2746c(mo8795e = 146230439)
    /* renamed from: ah */
    static native byte[][] m11804ah(boolean z, int i, int i2);

    @JNI.C2746c(mo8795e = 236851259)
    /* renamed from: ai */
    private static native int m11805ai();

    @JNI.C2746c(mo8795e = 233296901)
    /* renamed from: aj */
    private static native int m11806aj();

    @JNI.C2746c(mo8795e = 942861196)
    /* renamed from: ak */
    private static native int m11807ak();

    @JNI.C2746c(mo8795e = 241053919)
    /* renamed from: al */
    private static native int m11808al();

    @JNI.C2746c(mo8795e = 492857316)
    /* renamed from: am */
    private static native int m11809am();

    @JNI.C2746c(mo8795e = 184271543)
    /* renamed from: an */
    private static native int m11810an();

    @JNI.C2746c(mo8795e = 856185933)
    /* renamed from: ao */
    private static native void m11811ao(int i);

    @JNI.C2746c(mo8795e = 276274731)
    /* renamed from: ap */
    private static native void m11812ap(int i);

    @JNI.C2746c(mo8795e = 507506694)
    /* renamed from: aq */
    private static native void m11813aq(String str, String str2);

    @JNI.C2746c(mo8795e = 476130761)
    /* renamed from: ar */
    private static native int m11814ar();

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: as */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11815as(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 1067 - r6
            int r8 = 7458 - r8
            byte[] r0 = f9518c
            int r7 = r7 + 44
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0015
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L_0x0034
        L_0x0015:
            r3 = r2
        L_0x0016:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r6) goto L_0x0028
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x0028:
            int r3 = r3 + 1
            byte r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L_0x0034:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + -5
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11815as(int, short, short, java.lang.Object[]):void");
    }

    /* renamed from: at */
    private static void m11816at(int[] iArr, int i, Object[] objArr) {
        int i2;
        Class<Object> cls;
        int i3;
        int i4;
        int[] iArr2 = iArr;
        C3168gj gjVar = new C3168gj();
        char[] cArr = new char[4];
        char[] cArr2 = new char[(iArr2.length * 2)];
        int[] iArr3 = f9524i;
        int i5 = -1747701087;
        int i6 = 16;
        int i7 = 1;
        char c = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i8 = 0;
            while (true) {
                if ((i8 < length ? i7 : 0) == 0) {
                    break;
                }
                try {
                    Object[] objArr2 = new Object[i7];
                    objArr2[0] = Integer.valueOf(iArr3[i8]);
                    Map<Integer, Object> map = C2854bp.f9335p;
                    Object obj = map.get(Integer.valueOf(i5));
                    if (obj == null) {
                        obj = ((Class) C2854bp.m11559b((char) (ViewConfiguration.getTapTimeout() >> i6), 1717 - View.MeasureSpec.getMode(0), TextUtils.getOffsetAfter("", 0) + 24)).getMethod("f", new Class[]{Integer.TYPE});
                        map.put(-1747701087, obj);
                    }
                    iArr4[i8] = ((Integer) ((Method) obj).invoke((Object) null, objArr2)).intValue();
                    i8++;
                    i5 = -1747701087;
                    i6 = 16;
                    i7 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = f9524i;
        char c2 = 17;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i9 = $10 + 17;
            $11 = i9 % 128;
            int i12 = i9 % 2;
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $11 + 11;
                $10 = i14 % 128;
                if ((i14 % 2 != 0 ? 24 : c2) != c2) {
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[c] = Integer.valueOf(iArr6[i13]);
                        Map<Integer, Object> map2 = C2854bp.f9335p;
                        Object obj2 = map2.get(-1747701087);
                        if (obj2 != null) {
                            i4 = length3;
                        } else {
                            i4 = length3;
                            obj2 = ((Class) C2854bp.m11559b((char) Color.blue(0), KeyEvent.getDeadChar(0, 0) + 1717, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24)).getMethod("f", new Class[]{Integer.TYPE});
                            map2.put(-1747701087, obj2);
                        }
                        iArr7[i13] = ((Integer) ((Method) obj2).invoke((Object) null, objArr3)).intValue();
                        i13 += 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } else {
                    i4 = length3;
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr6[i13])};
                        Map<Integer, Object> map3 = C2854bp.f9335p;
                        Object obj3 = map3.get(-1747701087);
                        if (obj3 == null) {
                            obj3 = ((Class) C2854bp.m11559b((char) TextUtils.indexOf("", "", 0, 0), Color.green(0) + 1717, MotionEvent.axisFromString("") + 25)).getMethod("f", new Class[]{Integer.TYPE});
                            map3.put(-1747701087, obj3);
                        }
                        iArr7[i13] = ((Integer) ((Method) obj3).invoke((Object) null, objArr4)).intValue();
                        i13++;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                }
                int i15 = $10 + 61;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                length3 = i4;
                c2 = 17;
                c = 0;
            }
            iArr6 = iArr7;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length2);
        gjVar.f10459e = i2;
        while (true) {
            int i17 = gjVar.f10459e;
            if (i17 < iArr2.length) {
                int i18 = iArr2[i17];
                char c3 = (char) (i18 >> 16);
                cArr[i2] = c3;
                char c4 = (char) i18;
                cArr[1] = c4;
                int i19 = 16;
                char c5 = (char) (iArr2[i17 + 1] >> 16);
                cArr[2] = c5;
                char c6 = (char) iArr2[i17 + 1];
                int i22 = 3;
                cArr[3] = c6;
                gjVar.f10458d = (c3 << 16) + c4;
                gjVar.f10457a = (c5 << 16) + c6;
                C3168gj.m12972b(iArr5);
                int i23 = 0;
                while (true) {
                    cls = Object.class;
                    if ((i23 < i19 ? (char) 19 : 26) != 19) {
                        break;
                    }
                    int i24 = gjVar.f10458d ^ iArr5[i23];
                    gjVar.f10458d = i24;
                    int b = C3168gj.m12971b(i24);
                    try {
                        Object[] objArr5 = new Object[4];
                        objArr5[i22] = gjVar;
                        objArr5[2] = gjVar;
                        objArr5[1] = Integer.valueOf(b);
                        objArr5[0] = gjVar;
                        Map<Integer, Object> map4 = C2854bp.f9335p;
                        Object obj4 = map4.get(-43003330);
                        if (obj4 != null) {
                            i3 = i22;
                        } else {
                            byte b2 = (byte) 0;
                            Object[] objArr6 = new Object[1];
                            m11821ay(b2, (byte) b2, (byte) $$d.length, objArr6);
                            i3 = 3;
                            obj4 = ((Class) C2854bp.m11559b((char) (43789 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 481, TextUtils.lastIndexOf("", '0', 0, 0) + 33)).getMethod((String) objArr6[0], new Class[]{cls, Integer.TYPE, cls, cls});
                            map4.put(-43003330, obj4);
                        }
                        int intValue = ((Integer) ((Method) obj4).invoke((Object) null, objArr5)).intValue();
                        gjVar.f10458d = gjVar.f10457a;
                        gjVar.f10457a = intValue;
                        i23++;
                        i22 = i3;
                        i19 = 16;
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 != null) {
                            throw cause4;
                        }
                        throw th4;
                    }
                }
                int i25 = gjVar.f10458d;
                int i26 = gjVar.f10457a;
                int i27 = i25 ^ iArr5[i19];
                gjVar.f10457a = i27;
                int i28 = i26 ^ iArr5[17];
                gjVar.f10458d = i28;
                cArr[0] = (char) (i28 >>> 16);
                cArr[1] = (char) i28;
                cArr[2] = (char) (i27 >>> 16);
                cArr[i22] = (char) i27;
                C3168gj.m12972b(iArr5);
                int i29 = gjVar.f10459e;
                cArr2[i29 * 2] = cArr[0];
                cArr2[(i29 * 2) + 1] = cArr[1];
                cArr2[(i29 * 2) + 2] = cArr[2];
                cArr2[(i29 * 2) + i22] = cArr[i22];
                try {
                    Object[] objArr7 = new Object[2];
                    objArr7[1] = gjVar;
                    objArr7[0] = gjVar;
                    Map<Integer, Object> map5 = C2854bp.f9335p;
                    Object obj5 = map5.get(-259238060);
                    if (obj5 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) b3;
                        Object[] objArr8 = new Object[1];
                        m11821ay(b3, b4, (byte) (b4 + 3), objArr8);
                        obj5 = ((Class) C2854bp.m11559b((char) ((SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) - 1), 663 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.red(0) + 24)).getMethod((String) objArr8[0], new Class[]{cls, cls});
                        map5.put(-259238060, obj5);
                    }
                    ((Method) obj5).invoke((Object) null, objArr7);
                    i2 = 0;
                } catch (Throwable th5) {
                    Throwable cause5 = th5.getCause();
                    if (cause5 != null) {
                        throw cause5;
                    }
                    throw th5;
                }
            } else {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: au */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11817au(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = $$a
            int r7 = 100 - r7
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L_0x0038
        L_0x001b:
            r3 = r2
        L_0x001c:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L_0x0029
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x0029:
            int r3 = r3 + 1
            int r6 = r6 + 1
            byte r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L_0x0038:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11817au(int, byte, byte, java.lang.Object[]):void");
    }

    /* renamed from: av */
    private static void m11818av(int i, String str, byte b, Object[] objArr) {
        Object obj;
        char c;
        char c2;
        int i2;
        boolean z;
        char c3;
        int i3;
        Throwable cause;
        boolean z2;
        boolean z3;
        int i4 = i;
        int i5 = $11 + 47;
        int i6 = i5 % 128;
        $10 = i6;
        int i7 = 2;
        int i8 = i5 % 2;
        if (str != null) {
            int i9 = i6 + 95;
            $11 = i9 % 128;
            if (i9 % 2 != 0) {
                obj = str.toCharArray();
            } else {
                str.toCharArray();
                throw null;
            }
        } else {
            obj = str;
        }
        char[] cArr = (char[]) obj;
        C3166gh ghVar = new C3166gh();
        char[] cArr2 = f9525j;
        if (cArr2 != null) {
            c = 'Q';
        } else {
            c = 'D';
        }
        int i12 = -563486590;
        if (c == 'Q') {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                int i14 = $11 + 115;
                $10 = i14 % 128;
                if (i14 % i7 != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                        Map<Integer, Object> map = C2854bp.f9335p;
                        Object obj2 = map.get(Integer.valueOf(i12));
                        if (obj2 == null) {
                            obj2 = ((Class) C2854bp.m11559b((char) (6874 - (Process.myTid() >> 22)), 1860 - TextUtils.getCapsMode("", 0, 0), 24 - View.MeasureSpec.getSize(0))).getMethod("d", new Class[]{Integer.TYPE});
                            map.put(-563486590, obj2);
                        }
                        cArr3[i13] = ((Character) ((Method) obj2).invoke((Object) null, objArr2)).charValue();
                        i13--;
                    } catch (Throwable th) {
                        Throwable cause2 = th.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i13])};
                        Map<Integer, Object> map2 = C2854bp.f9335p;
                        Object obj3 = map2.get(-563486590);
                        if (obj3 == null) {
                            obj3 = ((Class) C2854bp.m11559b((char) (6873 - TextUtils.indexOf("", '0', 0)), 1860 - TextUtils.getCapsMode("", 0, 0), View.resolveSizeAndState(0, 0, 0) + 24)).getMethod("d", new Class[]{Integer.TYPE});
                            map2.put(-563486590, obj3);
                        }
                        cArr3[i13] = ((Character) ((Method) obj3).invoke((Object) null, objArr3)).charValue();
                        i13++;
                    } catch (Throwable th2) {
                        Throwable cause3 = th2.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th2;
                    }
                }
                i7 = 2;
                i12 = -563486590;
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(f9522g)};
            Map<Integer, Object> map3 = C2854bp.f9335p;
            Object obj4 = map3.get(-563486590);
            char c4 = 8;
            if (obj4 == null) {
                obj4 = ((Class) C2854bp.m11559b((char) (6874 - (ViewConfiguration.getTouchSlop() >> 8)), ExpandableListView.getPackedPositionGroup(0) + 1860, 23 - ImageFormat.getBitsPerPixel(0))).getMethod("d", new Class[]{Integer.TYPE});
                map3.put(-563486590, obj4);
            }
            char charValue = ((Character) ((Method) obj4).invoke((Object) null, objArr4)).charValue();
            char[] cArr4 = new char[i4];
            if (i4 % 2 != 0) {
                c2 = 'b';
            } else {
                c2 = 'N';
            }
            if (c2 != 'N') {
                i2 = i4 - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i4;
            }
            int i15 = 3;
            if (i2 > 1) {
                z = true;
            } else {
                z = true;
            }
            if (!z) {
                int i16 = $11 + 113;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                ghVar.f10448c = 0;
                while (true) {
                    int i18 = ghVar.f10448c;
                    if (i18 >= i2) {
                        break;
                    }
                    char c5 = cArr[i18];
                    ghVar.f10449d = c5;
                    char c6 = cArr[i18 + 1];
                    ghVar.f10447b = c6;
                    if (c5 == c6) {
                        int i19 = $11 + i15;
                        $10 = i19 % 128;
                        int i22 = i19 % 2;
                        cArr4[i18] = (char) (c5 - b);
                        cArr4[i18 + 1] = (char) (c6 - b);
                        c3 = c4;
                        i3 = i15;
                    } else {
                        try {
                            Object[] objArr5 = new Object[13];
                            objArr5[12] = ghVar;
                            objArr5[11] = Integer.valueOf(charValue);
                            objArr5[10] = ghVar;
                            objArr5[9] = ghVar;
                            objArr5[c4] = Integer.valueOf(charValue);
                            objArr5[7] = ghVar;
                            objArr5[6] = ghVar;
                            objArr5[5] = Integer.valueOf(charValue);
                            objArr5[4] = ghVar;
                            objArr5[i15] = ghVar;
                            objArr5[2] = Integer.valueOf(charValue);
                            objArr5[1] = ghVar;
                            objArr5[0] = ghVar;
                            Map<Integer, Object> map4 = C2854bp.f9335p;
                            Object obj5 = map4.get(-1127895707);
                            Class<Object> cls = Object.class;
                            if (obj5 == null) {
                                Class[] clsArr = new Class[13];
                                clsArr[0] = cls;
                                clsArr[1] = cls;
                                Class cls2 = Integer.TYPE;
                                clsArr[2] = cls2;
                                clsArr[i15] = cls;
                                clsArr[4] = cls;
                                clsArr[5] = cls2;
                                clsArr[6] = cls;
                                clsArr[7] = cls;
                                clsArr[8] = cls2;
                                clsArr[9] = cls;
                                clsArr[10] = cls;
                                clsArr[11] = cls2;
                                clsArr[12] = cls;
                                obj5 = ((Class) C2854bp.m11559b((char) (27868 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 123, 24 - TextUtils.getTrimmedLength(""))).getMethod("c", clsArr);
                                map4.put(-1127895707, obj5);
                            }
                            int intValue = ((Integer) ((Method) obj5).invoke((Object) null, objArr5)).intValue();
                            int i23 = ghVar.f10451f;
                            if (intValue == i23) {
                                try {
                                    Object[] objArr6 = new Object[11];
                                    objArr6[10] = ghVar;
                                    objArr6[9] = Integer.valueOf(charValue);
                                    objArr6[8] = ghVar;
                                    objArr6[7] = Integer.valueOf(charValue);
                                    objArr6[6] = Integer.valueOf(charValue);
                                    objArr6[5] = ghVar;
                                    objArr6[4] = ghVar;
                                    objArr6[i15] = Integer.valueOf(charValue);
                                    objArr6[2] = Integer.valueOf(charValue);
                                    objArr6[1] = ghVar;
                                    objArr6[0] = ghVar;
                                    Object obj6 = map4.get(-190269654);
                                    if (obj6 != null) {
                                        i3 = i15;
                                        c3 = 8;
                                    } else {
                                        byte b2 = (byte) 0;
                                        byte b3 = (byte) b2;
                                        Object[] objArr7 = new Object[1];
                                        m11821ay(b2, b3, (byte) b3, objArr7);
                                        Class cls3 = Integer.TYPE;
                                        i3 = 3;
                                        c3 = 8;
                                        obj6 = ((Class) C2854bp.m11559b((char) (34365 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 640 - View.resolveSizeAndState(0, 0, 0), View.combineMeasuredStates(0, 0) + 23)).getMethod((String) objArr7[0], new Class[]{cls, cls, cls3, cls3, cls, cls, cls3, cls3, cls, cls3, cls});
                                        map4.put(-190269654, obj6);
                                    }
                                    int intValue2 = ((Integer) ((Method) obj6).invoke((Object) null, objArr6)).intValue();
                                    int i24 = (ghVar.f10450e * charValue) + ghVar.f10451f;
                                    int i25 = ghVar.f10448c;
                                    cArr4[i25] = cArr2[intValue2];
                                    cArr4[i25 + 1] = cArr2[i24];
                                } catch (Throwable th3) {
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th3;
                                }
                            } else {
                                i3 = i15;
                                c3 = 8;
                                int i26 = ghVar.f10446a;
                                int i27 = ghVar.f10450e;
                                if (i26 == i27) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    int i28 = (i26 * charValue) + i23;
                                    int i29 = (i27 * charValue) + ghVar.f10452i;
                                    int i32 = ghVar.f10448c;
                                    cArr4[i32] = cArr2[i28];
                                    cArr4[i32 + 1] = cArr2[i29];
                                } else {
                                    int i33 = ((ghVar.f10452i + charValue) - 1) % charValue;
                                    ghVar.f10452i = i33;
                                    int i34 = ((i23 + charValue) - 1) % charValue;
                                    ghVar.f10451f = i34;
                                    int i35 = (i27 * charValue) + i34;
                                    int i36 = ghVar.f10448c;
                                    cArr4[i36] = cArr2[(i26 * charValue) + i33];
                                    cArr4[i36 + 1] = cArr2[i35];
                                }
                            }
                        } finally {
                            cause = th3.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                        }
                    }
                    ghVar.f10448c += 2;
                    i15 = i3;
                    c4 = c3;
                }
            }
            for (int i37 = 0; i37 < i4; i37++) {
                cArr4[i37] = (char) (cArr4[i37] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } finally {
            Throwable cause4 = th.getCause();
            if (cause4 != null) {
                throw cause4;
            }
        }
    }

    @JNI.C2746c(mo8795e = 536412578)
    /* renamed from: aw */
    private static native void m11819aw(int i);

    /* renamed from: ax */
    private static void m11820ax(String str, int i, byte b, Object[] objArr) {
        char c;
        Object obj;
        int i2;
        boolean z;
        char c2;
        Object obj2;
        Throwable cause;
        int i3 = i;
        if (str != null) {
            c = 'Q';
        } else {
            c = 'W';
        }
        if (c != 'W') {
            int i4 = $11 + 29;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            obj = str.toCharArray();
            int i6 = $11 + 71;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            obj = str;
        }
        char[] cArr = (char[]) obj;
        C3166gh ghVar = new C3166gh();
        char[] cArr2 = f9521f;
        if (cArr2 != null) {
            int i8 = $10 + 71;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i12 = 0;
            while (i12 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i12])};
                    Map<Integer, Object> map = C2854bp.f9335p;
                    Object obj3 = map.get(-563486590);
                    if (obj3 == null) {
                        obj3 = ((Class) C2854bp.m11559b((char) (Color.red(0) + 6874), 1859 - TextUtils.lastIndexOf("", '0'), 24 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > Utils.DOUBLE_EPSILON ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == Utils.DOUBLE_EPSILON ? 0 : -1)))).getMethod("d", new Class[]{Integer.TYPE});
                        map.put(-563486590, obj3);
                    }
                    cArr3[i12] = ((Character) ((Method) obj3).invoke((Object) null, objArr2)).charValue();
                    i12++;
                } catch (Throwable th) {
                    Throwable cause2 = th.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(f9523h)};
            Map<Integer, Object> map2 = C2854bp.f9335p;
            Object obj4 = map2.get(-563486590);
            long j = 0;
            if (obj4 == null) {
                obj4 = ((Class) C2854bp.m11559b((char) (View.combineMeasuredStates(0, 0) + 6874), 1860 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 25 - (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)))).getMethod("d", new Class[]{Integer.TYPE});
                map2.put(-563486590, obj4);
            }
            char charValue = ((Character) ((Method) obj4).invoke((Object) null, objArr3)).charValue();
            char[] cArr4 = new char[i3];
            char c3 = 9;
            if (i3 % 2 != 0) {
                int i13 = $11 + 9;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                i2 = i3 - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i3;
            }
            if (i2 > 1) {
                ghVar.f10448c = 0;
                while (true) {
                    int i15 = ghVar.f10448c;
                    if (i15 < i2) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                    char c4 = cArr[i15];
                    ghVar.f10449d = c4;
                    char c5 = cArr[i15 + 1];
                    ghVar.f10447b = c5;
                    if (c4 == c5) {
                        cArr4[i15] = (char) (c4 - b);
                        cArr4[i15 + 1] = (char) (c5 - b);
                        c2 = c3;
                        obj2 = null;
                    } else {
                        try {
                            Object[] objArr4 = new Object[13];
                            objArr4[12] = ghVar;
                            objArr4[11] = Integer.valueOf(charValue);
                            objArr4[10] = ghVar;
                            objArr4[c3] = ghVar;
                            objArr4[8] = Integer.valueOf(charValue);
                            objArr4[7] = ghVar;
                            objArr4[6] = ghVar;
                            objArr4[5] = Integer.valueOf(charValue);
                            objArr4[4] = ghVar;
                            objArr4[3] = ghVar;
                            objArr4[2] = Integer.valueOf(charValue);
                            objArr4[1] = ghVar;
                            objArr4[0] = ghVar;
                            Map<Integer, Object> map3 = C2854bp.f9335p;
                            Object obj5 = map3.get(-1127895707);
                            Class<Object> cls = Object.class;
                            if (obj5 == null) {
                                Class[] clsArr = new Class[13];
                                clsArr[0] = cls;
                                clsArr[1] = cls;
                                Class cls2 = Integer.TYPE;
                                clsArr[2] = cls2;
                                clsArr[3] = cls;
                                clsArr[4] = cls;
                                clsArr[5] = cls2;
                                clsArr[6] = cls;
                                clsArr[7] = cls;
                                clsArr[8] = cls2;
                                clsArr[c3] = cls;
                                clsArr[10] = cls;
                                clsArr[11] = cls2;
                                clsArr[12] = cls;
                                obj5 = ((Class) C2854bp.m11559b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 27868), 123 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), 24 - Drawable.resolveOpacity(0, 0))).getMethod("c", clsArr);
                                map3.put(-1127895707, obj5);
                            }
                            int intValue = ((Integer) ((Method) obj5).invoke((Object) null, objArr4)).intValue();
                            int i16 = ghVar.f10451f;
                            if (intValue == i16) {
                                try {
                                    Object[] objArr5 = new Object[11];
                                    objArr5[10] = ghVar;
                                    objArr5[c3] = Integer.valueOf(charValue);
                                    objArr5[8] = ghVar;
                                    objArr5[7] = Integer.valueOf(charValue);
                                    objArr5[6] = Integer.valueOf(charValue);
                                    objArr5[5] = ghVar;
                                    objArr5[4] = ghVar;
                                    objArr5[3] = Integer.valueOf(charValue);
                                    objArr5[2] = Integer.valueOf(charValue);
                                    objArr5[1] = ghVar;
                                    objArr5[0] = ghVar;
                                    Object obj6 = map3.get(-190269654);
                                    if (obj6 != null) {
                                        c2 = c3;
                                    } else {
                                        byte b2 = (byte) 0;
                                        byte b3 = (byte) b2;
                                        Object[] objArr6 = new Object[1];
                                        m11821ay(b2, b3, (byte) b3, objArr6);
                                        Class cls3 = Integer.TYPE;
                                        c2 = 9;
                                        obj6 = ((Class) C2854bp.m11559b((char) (34365 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 640 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 22 - TextUtils.lastIndexOf("", '0', 0))).getMethod((String) objArr6[0], new Class[]{cls, cls, cls3, cls3, cls, cls, cls3, cls3, cls, cls3, cls});
                                        map3.put(-190269654, obj6);
                                    }
                                    obj2 = null;
                                    int intValue2 = ((Integer) ((Method) obj6).invoke((Object) null, objArr5)).intValue();
                                    int i17 = (ghVar.f10450e * charValue) + ghVar.f10451f;
                                    int i18 = ghVar.f10448c;
                                    cArr4[i18] = cArr2[intValue2];
                                    cArr4[i18 + 1] = cArr2[i17];
                                } catch (Throwable th2) {
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th2;
                                }
                            } else {
                                c2 = c3;
                                obj2 = null;
                                int i19 = ghVar.f10446a;
                                int i22 = ghVar.f10450e;
                                if (i19 == i22) {
                                    int i23 = $11 + 27;
                                    $10 = i23 % 128;
                                    int i24 = i23 % 2;
                                    int i25 = ((ghVar.f10452i + charValue) - 1) % charValue;
                                    ghVar.f10452i = i25;
                                    int i26 = ((i16 + charValue) - 1) % charValue;
                                    ghVar.f10451f = i26;
                                    int i27 = (i22 * charValue) + i26;
                                    int i28 = ghVar.f10448c;
                                    cArr4[i28] = cArr2[(i19 * charValue) + i25];
                                    cArr4[i28 + 1] = cArr2[i27];
                                } else {
                                    int i29 = (i19 * charValue) + i16;
                                    int i32 = (i22 * charValue) + ghVar.f10452i;
                                    int i33 = ghVar.f10448c;
                                    cArr4[i33] = cArr2[i29];
                                    cArr4[i33 + 1] = cArr2[i32];
                                }
                            }
                        } finally {
                            cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                        }
                    }
                    ghVar.f10448c += 2;
                    Object obj7 = obj2;
                    c3 = c2;
                    j = 0;
                }
            }
            for (int i34 = 0; i34 < i3; i34++) {
                cArr4[i34] = (char) (cArr4[i34] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } finally {
            Throwable cause3 = th.getCause();
            if (cause3 != null) {
                throw cause3;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: ay */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11821ay(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r9 = r9 * 2
            int r9 = r9 + 98
            byte[] r0 = $$d
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r8
            r8 = r7
            goto L_0x0038
        L_0x001a:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L_0x001f:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r9 = r9 + 1
            r1[r3] = r5
            if (r4 != r8) goto L_0x0030
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L_0x0030:
            byte r3 = r0[r9]
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L_0x0038:
            int r9 = -r9
            int r7 = r7 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11821ay(int, byte, short, java.lang.Object[]):void");
    }

    @JNI.C2746c(mo8795e = 280142536)
    /* renamed from: b */
    static native void m11822b();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x015d, code lost:
        r1.mo9125d(24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0170, code lost:
        r0 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0172, code lost:
        r0 = 9;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m11826c() {
        /*
            com.facetec.sdk.do r1 = new com.facetec.sdk.do
            r1.<init>()
            r0 = 839(0x347, float:1.176E-42)
            short r0 = (short) r0
            byte[] r2 = f9518c
            r3 = 21
            byte r3 = r2[r3]
            byte r3 = (byte) r3
            r4 = 6148(0x1804, float:8.615E-42)
            short r4 = (short) r4
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            m11815as(r0, r3, r4, r6)
            r0 = 0
            r3 = r6[r0]
            java.lang.String r3 = (java.lang.String) r3
            r4 = 1066(0x42a, float:1.494E-42)
            short r4 = (short) r4
            r6 = 18
            byte r7 = r2[r6]
            byte r7 = (byte) r7
            r8 = r7 | 6193(0x1831, float:8.678E-42)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r5]
            m11815as(r4, r7, r8, r9)
            r4 = r9[r0]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x022c }
            r7[r0] = r4     // Catch:{ all -> 0x022c }
            r4 = 1051(0x41b, float:1.473E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x022c }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r2[r8]     // Catch:{ all -> 0x022c }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x022c }
            r10 = 5290(0x14aa, float:7.413E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x022c }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x022c }
            m11815as(r4, r9, r10, r11)     // Catch:{ all -> 0x022c }
            r9 = r11[r0]     // Catch:{ all -> 0x022c }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x022c }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x022c }
            r11 = 1062(0x426, float:1.488E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x022c }
            r12 = 3127(0xc37, float:4.382E-42)
            byte r12 = r2[r12]     // Catch:{ all -> 0x022c }
            int r12 = r12 + r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x022c }
            r13 = 4131(0x1023, float:5.789E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x022c }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x022c }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x022c }
            r11 = r14[r0]     // Catch:{ all -> 0x022c }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x022c }
            java.lang.Class[] r12 = new java.lang.Class[r5]     // Catch:{ all -> 0x022c }
            byte r2 = r2[r8]     // Catch:{ all -> 0x022c }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x022c }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x022c }
            m11815as(r4, r2, r10, r13)     // Catch:{ all -> 0x022c }
            r2 = r13[r0]     // Catch:{ all -> 0x022c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x022c }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x022c }
            r12[r0] = r2     // Catch:{ all -> 0x022c }
            java.lang.reflect.Method r2 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x022c }
            java.lang.Object r2 = r2.invoke(r3, r7)     // Catch:{ all -> 0x022c }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x022c }
            int r3 = r2.length
            int[] r3 = new int[r3]
            r7 = r0
        L_0x0086:
            int r9 = r2.length
            if (r7 >= r9) goto L_0x0134
            r9 = r2[r7]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x012b }
            r11[r0] = r9     // Catch:{ all -> 0x012b }
            r9 = 1050(0x41a, float:1.471E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x012b }
            byte[] r12 = f9518c     // Catch:{ all -> 0x012b }
            byte r13 = r12[r8]     // Catch:{ all -> 0x012b }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            int r14 = f9519d     // Catch:{ all -> 0x012b }
            r15 = r14 | 6720(0x1a40, float:9.417E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x012b }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x012b }
            m11815as(r9, r13, r15, r6)     // Catch:{ all -> 0x012b }
            r6 = r6[r0]     // Catch:{ all -> 0x012b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x012b }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x012b }
            r13 = 1060(0x424, float:1.485E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x012b }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x012b }
            r8 = 1465(0x5b9, float:2.053E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012b }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x012b }
            m11815as(r13, r15, r8, r0)     // Catch:{ all -> 0x012b }
            r8 = 0
            r0 = r0[r8]     // Catch:{ all -> 0x012b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x012b }
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x012b }
            r13 = 2385(0x951, float:3.342E-42)
            byte r15 = r12[r13]     // Catch:{ all -> 0x012b }
            int r13 = -r15
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x012b }
            m11815as(r4, r13, r10, r15)     // Catch:{ all -> 0x012b }
            r13 = 0
            r15 = r15[r13]     // Catch:{ all -> 0x012b }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x012b }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x012b }
            r8[r13] = r15     // Catch:{ all -> 0x012b }
            java.lang.reflect.Method r0 = r6.getMethod(r0, r8)     // Catch:{ all -> 0x012b }
            r6 = 0
            java.lang.Object r0 = r0.invoke(r6, r11)     // Catch:{ all -> 0x012b }
            r8 = 2385(0x951, float:3.342E-42)
            byte r11 = r12[r8]     // Catch:{ all -> 0x0122 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0122 }
            r13 = r14 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0122 }
            m11815as(r9, r11, r13, r14)     // Catch:{ all -> 0x0122 }
            r9 = 0
            r11 = r14[r9]     // Catch:{ all -> 0x0122 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0122 }
            java.lang.Class r9 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0122 }
            r11 = 1059(0x423, float:1.484E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0122 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0122 }
            int r12 = r12 + r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x0122 }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0122 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x0122 }
            r11 = 0
            r12 = r14[r11]     // Catch:{ all -> 0x0122 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0122 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r6)     // Catch:{ all -> 0x0122 }
            java.lang.Object r0 = r9.invoke(r0, r6)     // Catch:{ all -> 0x0122 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0122 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0122 }
            r3[r7] = r0
            int r7 = r7 + 1
            r0 = r11
            r6 = 18
            goto L_0x0086
        L_0x0122:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x012a
            throw r1
        L_0x012a:
            throw r0
        L_0x012b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0133
            throw r1
        L_0x0133:
            throw r0
        L_0x0134:
            r11 = r0
        L_0x0135:
            int r2 = r0 + 1
            r4 = 23
            r6 = 39
            r0 = r3[r0]     // Catch:{ all -> 0x021b }
            int r0 = r1.mo9125d(r0)     // Catch:{ all -> 0x021b }
            r7 = 24
            r8 = 50
            r9 = 8
            r10 = 6
            r11 = 61
            r12 = 47
            r13 = 15
            r14 = 20
            r15 = 9
            switch(r0) {
                case -29: goto L_0x0214;
                case -28: goto L_0x0205;
                case -27: goto L_0x0201;
                case -26: goto L_0x01f8;
                case -25: goto L_0x01f4;
                case -24: goto L_0x01e1;
                case -23: goto L_0x01dd;
                case -22: goto L_0x01d9;
                case -21: goto L_0x01ce;
                case -20: goto L_0x01ca;
                case -19: goto L_0x01c7;
                case -18: goto L_0x01bc;
                case -17: goto L_0x01b2;
                case -16: goto L_0x01af;
                case -15: goto L_0x01ac;
                case -14: goto L_0x01a2;
                case -13: goto L_0x0194;
                case -12: goto L_0x018b;
                case -11: goto L_0x0189;
                case -10: goto L_0x0188;
                case -9: goto L_0x0179;
                case -8: goto L_0x0176;
                case -7: goto L_0x0174;
                case -6: goto L_0x0172;
                case -5: goto L_0x0170;
                case -4: goto L_0x0167;
                case -3: goto L_0x0162;
                case -2: goto L_0x0159;
                case -1: goto L_0x0157;
                default: goto L_0x0155;
            }     // Catch:{ all -> 0x021b }
        L_0x0155:
            goto L_0x0218
        L_0x0157:
            r0 = r13
            goto L_0x0135
        L_0x0159:
            com.facetec.sdk.FaceTecAuditTrailImagesToReturn r0 = com.facetec.sdk.C2840bg.f9203d     // Catch:{ all -> 0x021b }
            r1.f10022f = r0     // Catch:{ all -> 0x021b }
        L_0x015d:
            r1.mo9125d(r7)     // Catch:{ all -> 0x021b }
            goto L_0x0218
        L_0x0162:
            com.facetec.sdk.FaceTecAuditTrailImagesToReturn r0 = com.facetec.sdk.FaceTecAuditTrailImagesToReturn.ONE     // Catch:{ all -> 0x021b }
            r1.f10022f = r0     // Catch:{ all -> 0x021b }
            goto L_0x015d
        L_0x0167:
            r1.mo9125d(r12)     // Catch:{ all -> 0x021b }
            int r0 = r1.f10020d     // Catch:{ all -> 0x021b }
            if (r0 != 0) goto L_0x0218
            r0 = 5
            goto L_0x0135
        L_0x0170:
            r0 = r10
            goto L_0x0135
        L_0x0172:
            r0 = r15
            goto L_0x0135
        L_0x0174:
            r0 = r6
            goto L_0x0135
        L_0x0176:
            r0 = 12
            goto L_0x0135
        L_0x0179:
            r1.f10018b = r5     // Catch:{ all -> 0x021b }
            r1.mo9125d(r9)     // Catch:{ all -> 0x021b }
            r1.mo9125d(r15)     // Catch:{ all -> 0x021b }
            int r0 = r1.f10020d     // Catch:{ all -> 0x021b }
            m11811ao(r0)     // Catch:{ all -> 0x021b }
            goto L_0x0218
        L_0x0188:
            return
        L_0x0189:
            r0 = r4
            goto L_0x0135
        L_0x018b:
            int r0 = f9526m     // Catch:{ all -> 0x021b }
            r1.f10018b = r0     // Catch:{ all -> 0x021b }
            r1.mo9125d(r5)     // Catch:{ all -> 0x021b }
            goto L_0x0218
        L_0x0194:
            r1.f10018b = r5     // Catch:{ all -> 0x021b }
            r1.mo9125d(r9)     // Catch:{ all -> 0x021b }
            r1.mo9125d(r15)     // Catch:{ all -> 0x021b }
            int r0 = r1.f10020d     // Catch:{ all -> 0x021b }
            f9527n = r0     // Catch:{ all -> 0x021b }
            goto L_0x0218
        L_0x01a2:
            r1.mo9125d(r13)     // Catch:{ all -> 0x021b }
            int r0 = r1.f10020d     // Catch:{ all -> 0x021b }
            if (r0 != 0) goto L_0x0218
            r0 = 30
            goto L_0x0135
        L_0x01ac:
            r0 = 66
            goto L_0x0135
        L_0x01af:
            r0 = 64
            goto L_0x0135
        L_0x01b2:
            r0 = 16
            r1.mo9125d(r0)     // Catch:{ all -> 0x021b }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x021b }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x021b }
            throw r0     // Catch:{ all -> 0x021b }
        L_0x01bc:
            r1.mo9125d(r12)     // Catch:{ all -> 0x021b }
            int r0 = r1.f10020d     // Catch:{ all -> 0x021b }
            if (r0 != 0) goto L_0x0218
            r0 = 38
            goto L_0x0135
        L_0x01c7:
            r0 = r11
            goto L_0x0135
        L_0x01ca:
            r0 = 59
            goto L_0x0135
        L_0x01ce:
            r1.mo9125d(r13)     // Catch:{ all -> 0x021b }
            int r0 = r1.f10020d     // Catch:{ all -> 0x021b }
            if (r0 != 0) goto L_0x0218
            r0 = 49
            goto L_0x0135
        L_0x01d9:
            r0 = 56
            goto L_0x0135
        L_0x01dd:
            r0 = 54
            goto L_0x0135
        L_0x01e1:
            r1.mo9125d(r14)     // Catch:{ all -> 0x021b }
            int r0 = r1.f10020d     // Catch:{ all -> 0x021b }
            if (r0 == r12) goto L_0x01f0
            r2 = 85
            if (r0 == r2) goto L_0x01ed
            goto L_0x01f0
        L_0x01ed:
            r0 = r8
            goto L_0x0135
        L_0x01f0:
            r0 = 18
            goto L_0x0135
        L_0x01f4:
            r0 = 53
            goto L_0x0135
        L_0x01f8:
            r1.mo9125d(r14)     // Catch:{ all -> 0x021b }
            int r0 = r1.f10020d     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x0170
            goto L_0x0172
        L_0x0201:
            r0 = 58
            goto L_0x0135
        L_0x0205:
            r1.mo9125d(r14)     // Catch:{ all -> 0x021b }
            int r0 = r1.f10020d     // Catch:{ all -> 0x021b }
            r2 = 32
            if (r0 == r8) goto L_0x0218
            if (r0 == r11) goto L_0x0211
            goto L_0x0218
        L_0x0211:
            r0 = r5
            goto L_0x0135
        L_0x0214:
            r0 = 63
            goto L_0x0135
        L_0x0218:
            r0 = r2
            goto L_0x0135
        L_0x021b:
            r0 = move-exception
            r7 = 34
            if (r2 < r7) goto L_0x022b
            if (r2 > r6) goto L_0x022b
            r1.f10022f = r0
            r1.mo9125d(r4)
            r0 = 31
            goto L_0x0135
        L_0x022b:
            throw r0
        L_0x022c:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0234
            throw r1
        L_0x0234:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11826c():void");
    }

    @JNI.C2746c(mo8795e = 123942655)
    /* renamed from: c */
    static native boolean m11828c(boolean z);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: boolean} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x015f, code lost:
        r2.mo9125d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0215, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m11829d() {
        /*
            java.lang.Class<com.facetec.sdk.cd> r1 = com.facetec.sdk.C2885cd.class
            monitor-enter(r1)
            com.facetec.sdk.do r2 = new com.facetec.sdk.do     // Catch:{ all -> 0x0234 }
            r2.<init>()     // Catch:{ all -> 0x0234 }
            r0 = 887(0x377, float:1.243E-42)
            short r0 = (short) r0     // Catch:{ all -> 0x0234 }
            byte[] r3 = f9518c     // Catch:{ all -> 0x0234 }
            r4 = 21
            byte r4 = r3[r4]     // Catch:{ all -> 0x0234 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x0234 }
            r5 = r4 | 5902(0x170e, float:8.27E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x0234 }
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0234 }
            m11815as(r0, r4, r5, r7)     // Catch:{ all -> 0x0234 }
            r4 = 0
            r0 = r7[r4]     // Catch:{ all -> 0x0234 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0234 }
            r5 = 1066(0x42a, float:1.494E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x0234 }
            r7 = 18
            byte r8 = r3[r7]     // Catch:{ all -> 0x0234 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0234 }
            r9 = r8 | 6193(0x1831, float:8.678E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0234 }
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x0234 }
            m11815as(r5, r8, r9, r10)     // Catch:{ all -> 0x0234 }
            r5 = r10[r4]     // Catch:{ all -> 0x0234 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0234 }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x022b }
            r8[r4] = r5     // Catch:{ all -> 0x022b }
            r5 = 1051(0x41b, float:1.473E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x022b }
            r9 = 2385(0x951, float:3.342E-42)
            byte r10 = r3[r9]     // Catch:{ all -> 0x022b }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x022b }
            r11 = 5290(0x14aa, float:7.413E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x022b }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x022b }
            m11815as(r5, r10, r11, r12)     // Catch:{ all -> 0x022b }
            r10 = r12[r4]     // Catch:{ all -> 0x022b }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x022b }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x022b }
            r12 = 1062(0x426, float:1.488E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x022b }
            r13 = 3127(0xc37, float:4.382E-42)
            byte r13 = r3[r13]     // Catch:{ all -> 0x022b }
            int r13 = r13 + r6
            byte r13 = (byte) r13     // Catch:{ all -> 0x022b }
            r14 = 4131(0x1023, float:5.789E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x022b }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x022b }
            m11815as(r12, r13, r14, r15)     // Catch:{ all -> 0x022b }
            r12 = r15[r4]     // Catch:{ all -> 0x022b }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x022b }
            java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch:{ all -> 0x022b }
            byte r3 = r3[r9]     // Catch:{ all -> 0x022b }
            int r3 = -r3
            byte r3 = (byte) r3     // Catch:{ all -> 0x022b }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x022b }
            m11815as(r5, r3, r11, r14)     // Catch:{ all -> 0x022b }
            r3 = r14[r4]     // Catch:{ all -> 0x022b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x022b }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x022b }
            r13[r4] = r3     // Catch:{ all -> 0x022b }
            java.lang.reflect.Method r3 = r10.getMethod(r12, r13)     // Catch:{ all -> 0x022b }
            java.lang.Object r0 = r3.invoke(r0, r8)     // Catch:{ all -> 0x022b }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x022b }
            int r3 = r0.length     // Catch:{ all -> 0x0234 }
            int[] r3 = new int[r3]     // Catch:{ all -> 0x0234 }
            r8 = r4
        L_0x0089:
            int r10 = r0.length     // Catch:{ all -> 0x0234 }
            if (r8 >= r10) goto L_0x013c
            r10 = r0[r8]     // Catch:{ all -> 0x0234 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0133 }
            r12[r4] = r10     // Catch:{ all -> 0x0133 }
            r10 = 1050(0x41a, float:1.471E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0133 }
            byte[] r13 = f9518c     // Catch:{ all -> 0x0133 }
            byte r14 = r13[r9]     // Catch:{ all -> 0x0133 }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x0133 }
            int r15 = f9519d     // Catch:{ all -> 0x0133 }
            r7 = r15 | 6720(0x1a40, float:9.417E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0133 }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x0133 }
            m11815as(r10, r14, r7, r9)     // Catch:{ all -> 0x0133 }
            r7 = r9[r4]     // Catch:{ all -> 0x0133 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0133 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0133 }
            r9 = 1060(0x424, float:1.485E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0133 }
            r14 = 74
            byte r14 = (byte) r14     // Catch:{ all -> 0x0133 }
            r4 = 1465(0x5b9, float:2.053E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x0133 }
            r16 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0133 }
            m11815as(r9, r14, r4, r0)     // Catch:{ all -> 0x0133 }
            r4 = 0
            r0 = r0[r4]     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0133 }
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ all -> 0x0133 }
            r9 = 2385(0x951, float:3.342E-42)
            byte r14 = r13[r9]     // Catch:{ all -> 0x0133 }
            int r9 = -r14
            byte r9 = (byte) r9     // Catch:{ all -> 0x0133 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0133 }
            m11815as(r5, r9, r11, r14)     // Catch:{ all -> 0x0133 }
            r9 = 0
            r14 = r14[r9]     // Catch:{ all -> 0x0133 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0133 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0133 }
            r4[r9] = r14     // Catch:{ all -> 0x0133 }
            java.lang.reflect.Method r0 = r7.getMethod(r0, r4)     // Catch:{ all -> 0x0133 }
            r4 = 0
            java.lang.Object r0 = r0.invoke(r4, r12)     // Catch:{ all -> 0x0133 }
            r7 = 2385(0x951, float:3.342E-42)
            byte r9 = r13[r7]     // Catch:{ all -> 0x012a }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x012a }
            r12 = r15 | 6720(0x1a40, float:9.417E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x012a }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x012a }
            m11815as(r10, r9, r12, r14)     // Catch:{ all -> 0x012a }
            r9 = 0
            r10 = r14[r9]     // Catch:{ all -> 0x012a }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x012a }
            java.lang.Class r9 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x012a }
            r10 = 1059(0x423, float:1.484E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x012a }
            r12 = 1801(0x709, float:2.524E-42)
            byte r12 = r13[r12]     // Catch:{ all -> 0x012a }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x012a }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x012a }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x012a }
            m11815as(r10, r12, r13, r14)     // Catch:{ all -> 0x012a }
            r10 = 0
            r12 = r14[r10]     // Catch:{ all -> 0x012a }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x012a }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r4)     // Catch:{ all -> 0x012a }
            java.lang.Object r0 = r9.invoke(r0, r4)     // Catch:{ all -> 0x012a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x012a }
            int r0 = r0.intValue()     // Catch:{ all -> 0x012a }
            r3[r8] = r0     // Catch:{ all -> 0x0234 }
            int r8 = r8 + 1
            r9 = r7
            r4 = r10
            r0 = r16
            r7 = 18
            goto L_0x0089
        L_0x012a:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x0234 }
            if (r2 == 0) goto L_0x0132
            throw r2     // Catch:{ all -> 0x0234 }
        L_0x0132:
            throw r0     // Catch:{ all -> 0x0234 }
        L_0x0133:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x0234 }
            if (r2 == 0) goto L_0x013b
            throw r2     // Catch:{ all -> 0x0234 }
        L_0x013b:
            throw r0     // Catch:{ all -> 0x0234 }
        L_0x013c:
            r10 = r4
        L_0x013d:
            int r5 = r4 + 1
            r7 = 33
            r0 = r3[r4]     // Catch:{ all -> 0x0218 }
            int r0 = r2.mo9125d(r0)     // Catch:{ all -> 0x0218 }
            r4 = 5
            r8 = 20
            r9 = 9
            r11 = 8
            r12 = 7
            r13 = 12
            switch(r0) {
                case -28: goto L_0x0211;
                case -27: goto L_0x0207;
                case -26: goto L_0x0203;
                case -25: goto L_0x01f2;
                case -24: goto L_0x01ee;
                case -23: goto L_0x01ea;
                case -22: goto L_0x01e0;
                case -21: goto L_0x01d3;
                case -20: goto L_0x01ce;
                case -19: goto L_0x013d;
                case -18: goto L_0x01c4;
                case -17: goto L_0x01ba;
                case -16: goto L_0x01b7;
                case -15: goto L_0x01b4;
                case -14: goto L_0x01a8;
                case -13: goto L_0x019a;
                case -12: goto L_0x0195;
                case -11: goto L_0x0193;
                case -10: goto L_0x0190;
                case -9: goto L_0x018e;
                case -8: goto L_0x017b;
                case -7: goto L_0x0179;
                case -6: goto L_0x0174;
                case -5: goto L_0x0171;
                case -4: goto L_0x016e;
                case -3: goto L_0x0164;
                case -2: goto L_0x0159;
                case -1: goto L_0x0156;
                default: goto L_0x0154;
            }     // Catch:{ all -> 0x0218 }
        L_0x0154:
            goto L_0x0215
        L_0x0156:
            r4 = 10
            goto L_0x013d
        L_0x0159:
            boolean r0 = m11772G()     // Catch:{ all -> 0x0218 }
            r2.f10018b = r0     // Catch:{ all -> 0x0218 }
        L_0x015f:
            r2.mo9125d(r6)     // Catch:{ all -> 0x0218 }
            goto L_0x0215
        L_0x0164:
            r2.mo9125d(r13)     // Catch:{ all -> 0x0218 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x0215
            r0 = 4
        L_0x016c:
            r4 = r0
            goto L_0x013d
        L_0x016e:
            r4 = 51
            goto L_0x013d
        L_0x0171:
            r4 = 49
            goto L_0x013d
        L_0x0174:
            m11800ad()     // Catch:{ all -> 0x0218 }
            goto L_0x0215
        L_0x0179:
            r4 = r7
            goto L_0x013d
        L_0x017b:
            r2.f10018b = r6     // Catch:{ all -> 0x0218 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x0218 }
            r2.mo9125d(r9)     // Catch:{ all -> 0x0218 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x0189
            r4 = r6
            goto L_0x018a
        L_0x0189:
            r4 = r10
        L_0x018a:
            f9516a = r4     // Catch:{ all -> 0x0218 }
            goto L_0x0215
        L_0x018e:
            monitor-exit(r1)
            return
        L_0x0190:
            r4 = 18
            goto L_0x013d
        L_0x0193:
            r4 = r12
            goto L_0x013d
        L_0x0195:
            int r0 = f9526m     // Catch:{ all -> 0x0218 }
            r2.f10018b = r0     // Catch:{ all -> 0x0218 }
            goto L_0x015f
        L_0x019a:
            r2.f10018b = r6     // Catch:{ all -> 0x0218 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x0218 }
            r2.mo9125d(r9)     // Catch:{ all -> 0x0218 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0218 }
            f9527n = r0     // Catch:{ all -> 0x0218 }
            goto L_0x0215
        L_0x01a8:
            r0 = 15
            r2.mo9125d(r0)     // Catch:{ all -> 0x0218 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x0215
            r0 = 25
            goto L_0x016c
        L_0x01b4:
            r4 = 46
            goto L_0x013d
        L_0x01b7:
            r4 = 44
            goto L_0x013d
        L_0x01ba:
            r0 = 16
            r2.mo9125d(r0)     // Catch:{ all -> 0x0218 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x0218 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0218 }
            throw r0     // Catch:{ all -> 0x0218 }
        L_0x01c4:
            r2.mo9125d(r13)     // Catch:{ all -> 0x0218 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x0215
            r0 = 32
            goto L_0x016c
        L_0x01ce:
            int r0 = f9527n     // Catch:{ all -> 0x0218 }
            r2.f10018b = r0     // Catch:{ all -> 0x0218 }
            goto L_0x015f
        L_0x01d3:
            r2.f10018b = r6     // Catch:{ all -> 0x0218 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x0218 }
            r2.mo9125d(r9)     // Catch:{ all -> 0x0218 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0218 }
            f9526m = r0     // Catch:{ all -> 0x0218 }
            goto L_0x0215
        L_0x01e0:
            r2.mo9125d(r13)     // Catch:{ all -> 0x0218 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x0215
            r0 = 41
            goto L_0x016c
        L_0x01ea:
            r4 = 42
            goto L_0x013d
        L_0x01ee:
            r4 = 13
            goto L_0x013d
        L_0x01f2:
            r2.mo9125d(r8)     // Catch:{ all -> 0x0218 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x0200
            if (r0 == r6) goto L_0x01fc
            goto L_0x0200
        L_0x01fc:
            r0 = 27
            goto L_0x016c
        L_0x0200:
            r4 = r6
            goto L_0x013d
        L_0x0203:
            r4 = 43
            goto L_0x013d
        L_0x0207:
            r2.mo9125d(r8)     // Catch:{ all -> 0x0218 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x0193
            if (r0 == r6) goto L_0x013d
            goto L_0x0193
        L_0x0211:
            r4 = 48
            goto L_0x013d
        L_0x0215:
            r4 = r5
            goto L_0x013d
        L_0x0218:
            r0 = move-exception
            r4 = 28
            if (r5 < r4) goto L_0x022a
            if (r5 > r7) goto L_0x022a
            r2.f10022f = r0     // Catch:{ all -> 0x0234 }
            r0 = 23
            r2.mo9125d(r0)     // Catch:{ all -> 0x0234 }
            r4 = 26
            goto L_0x013d
        L_0x022a:
            throw r0     // Catch:{ all -> 0x0234 }
        L_0x022b:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x0234 }
            if (r2 == 0) goto L_0x0233
            throw r2     // Catch:{ all -> 0x0234 }
        L_0x0233:
            throw r0     // Catch:{ all -> 0x0234 }
        L_0x0234:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11829d():void");
    }

    @JNI.C2746c(mo8795e = 946822600)
    /* renamed from: d */
    static native boolean m11831d(String str);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m11832e() {
        /*
            com.facetec.sdk.do r1 = new com.facetec.sdk.do
            r1.<init>()
            r0 = 986(0x3da, float:1.382E-42)
            short r0 = (short) r0
            byte[] r2 = f9518c
            r3 = 21
            byte r3 = r2[r3]
            byte r3 = (byte) r3
            r4 = r3 | 2046(0x7fe, float:2.867E-42)
            short r4 = (short) r4
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            m11815as(r0, r3, r4, r6)
            r0 = 0
            r3 = r6[r0]
            java.lang.String r3 = (java.lang.String) r3
            r4 = 1066(0x42a, float:1.494E-42)
            short r4 = (short) r4
            r6 = 18
            byte r7 = r2[r6]
            byte r7 = (byte) r7
            r8 = r7 | 6193(0x1831, float:8.678E-42)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r5]
            m11815as(r4, r7, r8, r9)
            r4 = r9[r0]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x01a7 }
            r7[r0] = r4     // Catch:{ all -> 0x01a7 }
            r4 = 1051(0x41b, float:1.473E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x01a7 }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r2[r8]     // Catch:{ all -> 0x01a7 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x01a7 }
            r10 = 5290(0x14aa, float:7.413E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x01a7 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x01a7 }
            m11815as(r4, r9, r10, r11)     // Catch:{ all -> 0x01a7 }
            r9 = r11[r0]     // Catch:{ all -> 0x01a7 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01a7 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x01a7 }
            r11 = 1062(0x426, float:1.488E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x01a7 }
            r12 = 3127(0xc37, float:4.382E-42)
            byte r12 = r2[r12]     // Catch:{ all -> 0x01a7 }
            int r12 = r12 + r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x01a7 }
            r13 = 4131(0x1023, float:5.789E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x01a7 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x01a7 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x01a7 }
            r11 = r14[r0]     // Catch:{ all -> 0x01a7 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x01a7 }
            java.lang.Class[] r12 = new java.lang.Class[r5]     // Catch:{ all -> 0x01a7 }
            byte r2 = r2[r8]     // Catch:{ all -> 0x01a7 }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x01a7 }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x01a7 }
            m11815as(r4, r2, r10, r13)     // Catch:{ all -> 0x01a7 }
            r2 = r13[r0]     // Catch:{ all -> 0x01a7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01a7 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x01a7 }
            r12[r0] = r2     // Catch:{ all -> 0x01a7 }
            java.lang.reflect.Method r2 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x01a7 }
            java.lang.Object r2 = r2.invoke(r3, r7)     // Catch:{ all -> 0x01a7 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x01a7 }
            int r3 = r2.length
            int[] r3 = new int[r3]
            r7 = r0
        L_0x0086:
            int r9 = r2.length
            if (r7 >= r9) goto L_0x0134
            r9 = r2[r7]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x012b }
            r11[r0] = r9     // Catch:{ all -> 0x012b }
            r9 = 1050(0x41a, float:1.471E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x012b }
            byte[] r12 = f9518c     // Catch:{ all -> 0x012b }
            byte r13 = r12[r8]     // Catch:{ all -> 0x012b }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            int r14 = f9519d     // Catch:{ all -> 0x012b }
            r15 = r14 | 6720(0x1a40, float:9.417E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x012b }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x012b }
            m11815as(r9, r13, r15, r6)     // Catch:{ all -> 0x012b }
            r6 = r6[r0]     // Catch:{ all -> 0x012b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x012b }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x012b }
            r13 = 1060(0x424, float:1.485E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x012b }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x012b }
            r8 = 1465(0x5b9, float:2.053E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012b }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x012b }
            m11815as(r13, r15, r8, r0)     // Catch:{ all -> 0x012b }
            r8 = 0
            r0 = r0[r8]     // Catch:{ all -> 0x012b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x012b }
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x012b }
            r13 = 2385(0x951, float:3.342E-42)
            byte r15 = r12[r13]     // Catch:{ all -> 0x012b }
            int r13 = -r15
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x012b }
            m11815as(r4, r13, r10, r15)     // Catch:{ all -> 0x012b }
            r13 = 0
            r15 = r15[r13]     // Catch:{ all -> 0x012b }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x012b }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x012b }
            r8[r13] = r15     // Catch:{ all -> 0x012b }
            java.lang.reflect.Method r0 = r6.getMethod(r0, r8)     // Catch:{ all -> 0x012b }
            r6 = 0
            java.lang.Object r0 = r0.invoke(r6, r11)     // Catch:{ all -> 0x012b }
            r8 = 2385(0x951, float:3.342E-42)
            byte r11 = r12[r8]     // Catch:{ all -> 0x0122 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0122 }
            r13 = r14 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0122 }
            m11815as(r9, r11, r13, r14)     // Catch:{ all -> 0x0122 }
            r9 = 0
            r11 = r14[r9]     // Catch:{ all -> 0x0122 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0122 }
            java.lang.Class r9 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0122 }
            r11 = 1059(0x423, float:1.484E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0122 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0122 }
            int r12 = r12 + r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x0122 }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0122 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x0122 }
            r11 = 0
            r12 = r14[r11]     // Catch:{ all -> 0x0122 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0122 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r6)     // Catch:{ all -> 0x0122 }
            java.lang.Object r0 = r9.invoke(r0, r6)     // Catch:{ all -> 0x0122 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0122 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0122 }
            r3[r7] = r0
            int r7 = r7 + 1
            r0 = r11
            r6 = 18
            goto L_0x0086
        L_0x0122:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x012a
            throw r1
        L_0x012a:
            throw r0
        L_0x012b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0133
            throw r1
        L_0x0133:
            throw r0
        L_0x0134:
            r11 = r0
        L_0x0135:
            int r2 = r0 + 1
            r4 = 23
            r6 = 22
            r0 = r3[r0]     // Catch:{ all -> 0x0197 }
            int r0 = r1.mo9125d(r0)     // Catch:{ all -> 0x0197 }
            r7 = 16
            switch(r0) {
                case -12: goto L_0x0193;
                case -11: goto L_0x017f;
                case -10: goto L_0x0177;
                case -9: goto L_0x0175;
                case -8: goto L_0x0172;
                case -7: goto L_0x0167;
                case -6: goto L_0x0156;
                case -5: goto L_0x014e;
                case -4: goto L_0x014d;
                case -3: goto L_0x014b;
                case -2: goto L_0x0149;
                case -1: goto L_0x0147;
                default: goto L_0x0146;
            }     // Catch:{ all -> 0x0197 }
        L_0x0146:
            goto L_0x0195
        L_0x0147:
            r0 = 2
            goto L_0x0135
        L_0x0149:
            r0 = 7
            goto L_0x0135
        L_0x014b:
            r0 = r5
            goto L_0x0135
        L_0x014d:
            return
        L_0x014e:
            int r0 = f9527n     // Catch:{ all -> 0x0197 }
            r1.f10018b = r0     // Catch:{ all -> 0x0197 }
            r1.mo9125d(r5)     // Catch:{ all -> 0x0197 }
            goto L_0x0195
        L_0x0156:
            r1.f10018b = r5     // Catch:{ all -> 0x0197 }
            r0 = 8
            r1.mo9125d(r0)     // Catch:{ all -> 0x0197 }
            r0 = 9
            r1.mo9125d(r0)     // Catch:{ all -> 0x0197 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x0197 }
            f9526m = r0     // Catch:{ all -> 0x0197 }
            goto L_0x0195
        L_0x0167:
            r0 = 12
            r1.mo9125d(r0)     // Catch:{ all -> 0x0197 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x0197 }
            if (r0 != 0) goto L_0x0195
            r0 = r7
            goto L_0x0135
        L_0x0172:
            r0 = 25
            goto L_0x0135
        L_0x0175:
            r0 = r4
            goto L_0x0135
        L_0x0177:
            r1.mo9125d(r7)     // Catch:{ all -> 0x0197 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x0197 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0197 }
            throw r0     // Catch:{ all -> 0x0197 }
        L_0x017f:
            r0 = 20
            r1.mo9125d(r0)     // Catch:{ all -> 0x0197 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x0197 }
            r2 = 24
            r4 = 5
            if (r0 == r2) goto L_0x0175
            r2 = 82
            if (r0 == r2) goto L_0x0190
            goto L_0x0175
        L_0x0190:
            r0 = 18
            goto L_0x0135
        L_0x0193:
            r0 = r6
            goto L_0x0135
        L_0x0195:
            r0 = r2
            goto L_0x0135
        L_0x0197:
            r0 = move-exception
            r7 = 19
            if (r2 < r7) goto L_0x01a6
            if (r2 > r6) goto L_0x01a6
            r1.f10022f = r0
            r1.mo9125d(r4)
            r0 = 17
            goto L_0x0135
        L_0x01a6:
            throw r0
        L_0x01a7:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01af
            throw r1
        L_0x01af:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11832e():void");
    }

    @JNI.C2746c(mo8795e = 410261680)
    /* renamed from: e */
    static native void m11835e(String str, String str2);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facetec.sdk.C2884cc m11836f() {
        /*
            com.facetec.sdk.do r1 = new com.facetec.sdk.do
            r1.<init>()
            r0 = 957(0x3bd, float:1.341E-42)
            short r0 = (short) r0
            byte[] r2 = f9518c
            r3 = 21
            byte r3 = r2[r3]
            byte r3 = (byte) r3
            r4 = r3 | 7016(0x1b68, float:9.832E-42)
            short r4 = (short) r4
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            m11815as(r0, r3, r4, r6)
            r0 = 0
            r3 = r6[r0]
            java.lang.String r3 = (java.lang.String) r3
            r4 = 1066(0x42a, float:1.494E-42)
            short r4 = (short) r4
            r6 = 18
            byte r7 = r2[r6]
            byte r7 = (byte) r7
            r8 = r7 | 6193(0x1831, float:8.678E-42)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r5]
            m11815as(r4, r7, r8, r9)
            r4 = r9[r0]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x01be }
            r7[r0] = r4     // Catch:{ all -> 0x01be }
            r4 = 1051(0x41b, float:1.473E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x01be }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r2[r8]     // Catch:{ all -> 0x01be }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x01be }
            r10 = 5290(0x14aa, float:7.413E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x01be }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x01be }
            m11815as(r4, r9, r10, r11)     // Catch:{ all -> 0x01be }
            r9 = r11[r0]     // Catch:{ all -> 0x01be }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01be }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x01be }
            r11 = 1062(0x426, float:1.488E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x01be }
            r12 = 3127(0xc37, float:4.382E-42)
            byte r12 = r2[r12]     // Catch:{ all -> 0x01be }
            int r12 = r12 + r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x01be }
            r13 = 4131(0x1023, float:5.789E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x01be }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x01be }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x01be }
            r11 = r14[r0]     // Catch:{ all -> 0x01be }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x01be }
            java.lang.Class[] r12 = new java.lang.Class[r5]     // Catch:{ all -> 0x01be }
            byte r2 = r2[r8]     // Catch:{ all -> 0x01be }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x01be }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x01be }
            m11815as(r4, r2, r10, r13)     // Catch:{ all -> 0x01be }
            r2 = r13[r0]     // Catch:{ all -> 0x01be }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01be }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x01be }
            r12[r0] = r2     // Catch:{ all -> 0x01be }
            java.lang.reflect.Method r2 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.invoke(r3, r7)     // Catch:{ all -> 0x01be }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x01be }
            int r3 = r2.length
            int[] r3 = new int[r3]
            r7 = r0
        L_0x0086:
            int r9 = r2.length
            if (r7 >= r9) goto L_0x0134
            r9 = r2[r7]
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x012b }
            r11[r0] = r9     // Catch:{ all -> 0x012b }
            r9 = 1050(0x41a, float:1.471E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x012b }
            byte[] r12 = f9518c     // Catch:{ all -> 0x012b }
            byte r13 = r12[r8]     // Catch:{ all -> 0x012b }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            int r14 = f9519d     // Catch:{ all -> 0x012b }
            r15 = r14 | 6720(0x1a40, float:9.417E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x012b }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x012b }
            m11815as(r9, r13, r15, r6)     // Catch:{ all -> 0x012b }
            r6 = r6[r0]     // Catch:{ all -> 0x012b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x012b }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x012b }
            r13 = 1060(0x424, float:1.485E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x012b }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x012b }
            r8 = 1465(0x5b9, float:2.053E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012b }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x012b }
            m11815as(r13, r15, r8, r0)     // Catch:{ all -> 0x012b }
            r8 = 0
            r0 = r0[r8]     // Catch:{ all -> 0x012b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x012b }
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x012b }
            r13 = 2385(0x951, float:3.342E-42)
            byte r15 = r12[r13]     // Catch:{ all -> 0x012b }
            int r13 = -r15
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x012b }
            m11815as(r4, r13, r10, r15)     // Catch:{ all -> 0x012b }
            r13 = 0
            r15 = r15[r13]     // Catch:{ all -> 0x012b }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x012b }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x012b }
            r8[r13] = r15     // Catch:{ all -> 0x012b }
            java.lang.reflect.Method r0 = r6.getMethod(r0, r8)     // Catch:{ all -> 0x012b }
            r6 = 0
            java.lang.Object r0 = r0.invoke(r6, r11)     // Catch:{ all -> 0x012b }
            r8 = 2385(0x951, float:3.342E-42)
            byte r11 = r12[r8]     // Catch:{ all -> 0x0122 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0122 }
            r13 = r14 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0122 }
            m11815as(r9, r11, r13, r14)     // Catch:{ all -> 0x0122 }
            r9 = 0
            r11 = r14[r9]     // Catch:{ all -> 0x0122 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0122 }
            java.lang.Class r9 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0122 }
            r11 = 1059(0x423, float:1.484E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0122 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0122 }
            int r12 = r12 + r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x0122 }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0122 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x0122 }
            r11 = 0
            r12 = r14[r11]     // Catch:{ all -> 0x0122 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0122 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r6)     // Catch:{ all -> 0x0122 }
            java.lang.Object r0 = r9.invoke(r0, r6)     // Catch:{ all -> 0x0122 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0122 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0122 }
            r3[r7] = r0
            int r7 = r7 + 1
            r0 = r11
            r6 = 18
            goto L_0x0086
        L_0x0122:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x012a
            throw r1
        L_0x012a:
            throw r0
        L_0x012b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0133
            throw r1
        L_0x0133:
            throw r0
        L_0x0134:
            r11 = r0
        L_0x0135:
            int r2 = r0 + 1
            r4 = 29
            r0 = r3[r0]     // Catch:{ all -> 0x01ab }
            int r0 = r1.mo9125d(r0)     // Catch:{ all -> 0x01ab }
            r6 = 9
            r7 = 16
            switch(r0) {
                case -14: goto L_0x01a7;
                case -13: goto L_0x019b;
                case -12: goto L_0x0193;
                case -11: goto L_0x0190;
                case -10: goto L_0x018d;
                case -9: goto L_0x0181;
                case -8: goto L_0x0172;
                case -7: goto L_0x016d;
                case -6: goto L_0x0165;
                case -5: goto L_0x0162;
                case -4: goto L_0x0160;
                case -3: goto L_0x0154;
                case -2: goto L_0x014a;
                case -1: goto L_0x0148;
                default: goto L_0x0146;
            }     // Catch:{ all -> 0x01ab }
        L_0x0146:
            goto L_0x01a9
        L_0x0148:
            r0 = 6
            goto L_0x0135
        L_0x014a:
            int r0 = m11801ae()     // Catch:{ all -> 0x01ab }
            r1.f10018b = r0     // Catch:{ all -> 0x01ab }
        L_0x0150:
            r1.mo9125d(r5)     // Catch:{ all -> 0x01ab }
            goto L_0x01a9
        L_0x0154:
            com.facetec.sdk.cc[] r0 = com.facetec.sdk.C2884cc.values()     // Catch:{ all -> 0x01ab }
            r1.f10022f = r0     // Catch:{ all -> 0x01ab }
            r0 = 24
            r1.mo9125d(r0)     // Catch:{ all -> 0x01ab }
            goto L_0x01a9
        L_0x0160:
            r0 = r6
            goto L_0x0135
        L_0x0162:
            r0 = 11
            goto L_0x0135
        L_0x0165:
            r1.mo9125d(r7)     // Catch:{ all -> 0x01ab }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01ab }
            com.facetec.sdk.cc r0 = (com.facetec.sdk.C2884cc) r0     // Catch:{ all -> 0x01ab }
            return r0
        L_0x016d:
            int r0 = f9526m     // Catch:{ all -> 0x01ab }
            r1.f10018b = r0     // Catch:{ all -> 0x01ab }
            goto L_0x0150
        L_0x0172:
            r1.f10018b = r5     // Catch:{ all -> 0x01ab }
            r0 = 8
            r1.mo9125d(r0)     // Catch:{ all -> 0x01ab }
            r1.mo9125d(r6)     // Catch:{ all -> 0x01ab }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01ab }
            f9527n = r0     // Catch:{ all -> 0x01ab }
            goto L_0x01a9
        L_0x0181:
            r0 = 15
            r1.mo9125d(r0)     // Catch:{ all -> 0x01ab }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01ab }
            if (r0 != 0) goto L_0x01a9
            r0 = 18
            goto L_0x0135
        L_0x018d:
            r0 = 32
            goto L_0x0135
        L_0x0190:
            r0 = 30
            goto L_0x0135
        L_0x0193:
            r1.mo9125d(r7)     // Catch:{ all -> 0x01ab }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01ab }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01ab }
            throw r0     // Catch:{ all -> 0x01ab }
        L_0x019b:
            r0 = 20
            r1.mo9125d(r0)     // Catch:{ all -> 0x01ab }
            int r2 = r1.f10020d     // Catch:{ all -> 0x01ab }
            if (r2 == 0) goto L_0x01a5
            goto L_0x0135
        L_0x01a5:
            r0 = r5
            goto L_0x0135
        L_0x01a7:
            r0 = r4
            goto L_0x0135
        L_0x01a9:
            r0 = r2
            goto L_0x0135
        L_0x01ab:
            r0 = move-exception
            r6 = 25
            if (r2 < r6) goto L_0x01bd
            if (r2 > r4) goto L_0x01bd
            r1.f10022f = r0
            r0 = 23
            r1.mo9125d(r0)
            r0 = 19
            goto L_0x0135
        L_0x01bd:
            throw r0
        L_0x01be:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01c6
            throw r1
        L_0x01c6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11836f():com.facetec.sdk.cc");
    }

    @JNI.C2746c(mo8795e = 663820916)
    /* renamed from: f */
    static native boolean m11837f(boolean z, String str);

    @JNI.C2746c(mo8795e = 792521938)
    /* renamed from: g */
    static native boolean m11838g();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facetec.sdk.C2899cl m11839h() {
        /*
            com.facetec.sdk.do r1 = new com.facetec.sdk.do
            r1.<init>()
            r0 = 926(0x39e, float:1.298E-42)
            short r0 = (short) r0
            byte[] r2 = f9518c
            r3 = 21
            byte r4 = r2[r3]
            byte r4 = (byte) r4
            r5 = r4 | 1662(0x67e, float:2.329E-42)
            short r5 = (short) r5
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            m11815as(r0, r4, r5, r7)
            r0 = 0
            r4 = r7[r0]
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1066(0x42a, float:1.494E-42)
            short r5 = (short) r5
            r7 = 18
            byte r7 = r2[r7]
            byte r7 = (byte) r7
            r8 = r7 | 6193(0x1831, float:8.678E-42)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r6]
            m11815as(r5, r7, r8, r9)
            r5 = r9[r0]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x01eb }
            r7[r0] = r5     // Catch:{ all -> 0x01eb }
            r5 = 1051(0x41b, float:1.473E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x01eb }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r2[r8]     // Catch:{ all -> 0x01eb }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x01eb }
            r10 = 5290(0x14aa, float:7.413E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x01eb }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x01eb }
            m11815as(r5, r9, r10, r11)     // Catch:{ all -> 0x01eb }
            r9 = r11[r0]     // Catch:{ all -> 0x01eb }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01eb }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x01eb }
            r11 = 1062(0x426, float:1.488E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x01eb }
            r12 = 3127(0xc37, float:4.382E-42)
            byte r12 = r2[r12]     // Catch:{ all -> 0x01eb }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x01eb }
            r13 = 4131(0x1023, float:5.789E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x01eb }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x01eb }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x01eb }
            r11 = r14[r0]     // Catch:{ all -> 0x01eb }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x01eb }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x01eb }
            byte r2 = r2[r8]     // Catch:{ all -> 0x01eb }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x01eb }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x01eb }
            m11815as(r5, r2, r10, r13)     // Catch:{ all -> 0x01eb }
            r2 = r13[r0]     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01eb }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x01eb }
            r12[r0] = r2     // Catch:{ all -> 0x01eb }
            java.lang.reflect.Method r2 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x01eb }
            java.lang.Object r2 = r2.invoke(r4, r7)     // Catch:{ all -> 0x01eb }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x01eb }
            int r4 = r2.length
            int[] r4 = new int[r4]
            r7 = r0
        L_0x0086:
            int r9 = r2.length
            if (r7 >= r9) goto L_0x0134
            r9 = r2[r7]
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            r11[r0] = r9     // Catch:{ all -> 0x012b }
            r9 = 1050(0x41a, float:1.471E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x012b }
            byte[] r12 = f9518c     // Catch:{ all -> 0x012b }
            byte r13 = r12[r8]     // Catch:{ all -> 0x012b }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            int r14 = f9519d     // Catch:{ all -> 0x012b }
            r15 = r14 | 6720(0x1a40, float:9.417E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x012b }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11815as(r9, r13, r15, r3)     // Catch:{ all -> 0x012b }
            r3 = r3[r0]     // Catch:{ all -> 0x012b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x012b }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x012b }
            r13 = 1060(0x424, float:1.485E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x012b }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x012b }
            r8 = 1465(0x5b9, float:2.053E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012b }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11815as(r13, r15, r8, r0)     // Catch:{ all -> 0x012b }
            r8 = 0
            r0 = r0[r8]     // Catch:{ all -> 0x012b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x012b }
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ all -> 0x012b }
            r13 = 2385(0x951, float:3.342E-42)
            byte r15 = r12[r13]     // Catch:{ all -> 0x012b }
            int r13 = -r15
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11815as(r5, r13, r10, r15)     // Catch:{ all -> 0x012b }
            r13 = 0
            r15 = r15[r13]     // Catch:{ all -> 0x012b }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x012b }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x012b }
            r8[r13] = r15     // Catch:{ all -> 0x012b }
            java.lang.reflect.Method r0 = r3.getMethod(r0, r8)     // Catch:{ all -> 0x012b }
            r3 = 0
            java.lang.Object r0 = r0.invoke(r3, r11)     // Catch:{ all -> 0x012b }
            r8 = 2385(0x951, float:3.342E-42)
            byte r11 = r12[r8]     // Catch:{ all -> 0x0122 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0122 }
            r13 = r14 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0122 }
            m11815as(r9, r11, r13, r14)     // Catch:{ all -> 0x0122 }
            r9 = 0
            r11 = r14[r9]     // Catch:{ all -> 0x0122 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0122 }
            java.lang.Class r9 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0122 }
            r11 = 1059(0x423, float:1.484E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0122 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0122 }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x0122 }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0122 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x0122 }
            r11 = 0
            r12 = r14[r11]     // Catch:{ all -> 0x0122 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0122 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r3)     // Catch:{ all -> 0x0122 }
            java.lang.Object r0 = r9.invoke(r0, r3)     // Catch:{ all -> 0x0122 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0122 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0122 }
            r4[r7] = r0
            int r7 = r7 + 1
            r0 = r11
            r3 = 21
            goto L_0x0086
        L_0x0122:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x012a
            throw r1
        L_0x012a:
            throw r0
        L_0x012b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0133
            throw r1
        L_0x0133:
            throw r0
        L_0x0134:
            r11 = r0
        L_0x0135:
            int r2 = r0 + 1
            r3 = 27
            r0 = r4[r0]     // Catch:{ all -> 0x01da }
            int r0 = r1.mo9125d(r0)     // Catch:{ all -> 0x01da }
            r5 = 9
            r7 = 8
            r8 = 16
            r9 = 12
            r10 = 20
            switch(r0) {
                case -19: goto L_0x01d3;
                case -18: goto L_0x01c3;
                case -17: goto L_0x01c0;
                case -16: goto L_0x01bc;
                case -15: goto L_0x01b1;
                case -14: goto L_0x01a4;
                case -13: goto L_0x019f;
                case -12: goto L_0x0197;
                case -11: goto L_0x0194;
                case -10: goto L_0x0191;
                case -9: goto L_0x0186;
                case -8: goto L_0x0179;
                case -7: goto L_0x0174;
                case -6: goto L_0x016c;
                case -5: goto L_0x016a;
                case -4: goto L_0x0168;
                case -3: goto L_0x015b;
                case -2: goto L_0x0150;
                case -1: goto L_0x014e;
                default: goto L_0x014c;
            }     // Catch:{ all -> 0x01da }
        L_0x014c:
            goto L_0x01d7
        L_0x014e:
            r0 = 6
            goto L_0x0135
        L_0x0150:
            int r0 = m11805ai()     // Catch:{ all -> 0x01da }
            r1.f10018b = r0     // Catch:{ all -> 0x01da }
        L_0x0156:
            r1.mo9125d(r6)     // Catch:{ all -> 0x01da }
            goto L_0x01d7
        L_0x015b:
            com.facetec.sdk.cl[] r0 = com.facetec.sdk.C2899cl.values()     // Catch:{ all -> 0x01da }
            r1.f10022f = r0     // Catch:{ all -> 0x01da }
            r0 = 24
            r1.mo9125d(r0)     // Catch:{ all -> 0x01da }
            goto L_0x01d7
        L_0x0168:
            r0 = r9
            goto L_0x0135
        L_0x016a:
            r0 = r3
            goto L_0x0135
        L_0x016c:
            r1.mo9125d(r8)     // Catch:{ all -> 0x01da }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01da }
            com.facetec.sdk.cl r0 = (com.facetec.sdk.C2899cl) r0     // Catch:{ all -> 0x01da }
            return r0
        L_0x0174:
            int r0 = f9526m     // Catch:{ all -> 0x01da }
            r1.f10018b = r0     // Catch:{ all -> 0x01da }
            goto L_0x0156
        L_0x0179:
            r1.f10018b = r6     // Catch:{ all -> 0x01da }
            r1.mo9125d(r7)     // Catch:{ all -> 0x01da }
            r1.mo9125d(r5)     // Catch:{ all -> 0x01da }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01da }
            f9527n = r0     // Catch:{ all -> 0x01da }
            goto L_0x01d7
        L_0x0186:
            r0 = 15
            r1.mo9125d(r0)     // Catch:{ all -> 0x01da }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x01d7
            r0 = r10
            goto L_0x0135
        L_0x0191:
            r0 = 41
            goto L_0x0135
        L_0x0194:
            r0 = 39
            goto L_0x0135
        L_0x0197:
            r1.mo9125d(r8)     // Catch:{ all -> 0x01da }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01da }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01da }
            throw r0     // Catch:{ all -> 0x01da }
        L_0x019f:
            int r0 = f9527n     // Catch:{ all -> 0x01da }
            r1.f10018b = r0     // Catch:{ all -> 0x01da }
            goto L_0x0156
        L_0x01a4:
            r1.f10018b = r6     // Catch:{ all -> 0x01da }
            r1.mo9125d(r7)     // Catch:{ all -> 0x01da }
            r1.mo9125d(r5)     // Catch:{ all -> 0x01da }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01da }
            f9526m = r0     // Catch:{ all -> 0x01da }
            goto L_0x01d7
        L_0x01b1:
            r1.mo9125d(r9)     // Catch:{ all -> 0x01da }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x01d7
            r0 = 36
            goto L_0x0135
        L_0x01bc:
            r0 = 37
            goto L_0x0135
        L_0x01c0:
            r0 = r6
            goto L_0x0135
        L_0x01c3:
            r1.mo9125d(r10)     // Catch:{ all -> 0x01da }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01da }
            r2 = 22
            if (r0 == 0) goto L_0x01d7
            if (r0 == r6) goto L_0x01cf
            goto L_0x01d7
        L_0x01cf:
            r0 = 10
            goto L_0x0135
        L_0x01d3:
            r0 = 38
            goto L_0x0135
        L_0x01d7:
            r0 = r2
            goto L_0x0135
        L_0x01da:
            r0 = move-exception
            r5 = 23
            if (r2 < r5) goto L_0x01ea
            if (r2 > r3) goto L_0x01ea
            r1.f10022f = r0
            r1.mo9125d(r5)
            r0 = 21
            goto L_0x0135
        L_0x01ea:
            throw r0
        L_0x01eb:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01f3
            throw r1
        L_0x01f3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11839h():com.facetec.sdk.cl");
    }

    @JNI.C2746c(mo8795e = 759707868)
    /* renamed from: h */
    static native void m11840h(boolean z);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03be, code lost:
        r2.mo9125d(24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x017c, code lost:
        r2.mo9125d(24);
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03cd A[Catch:{ all -> 0x03c3, all -> 0x0481 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03ce A[Catch:{ all -> 0x03c3, all -> 0x0481 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x04b3 A[Catch:{ all -> 0x04e9, all -> 0x0133, all -> 0x012a }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04bb A[Catch:{ all -> 0x04e9, all -> 0x0133, all -> 0x012a }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x028f A[Catch:{ all -> 0x036c, all -> 0x02f7, all -> 0x01d0, all -> 0x0375 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0290 A[Catch:{ all -> 0x036c, all -> 0x02f7, all -> 0x01d0, all -> 0x0375 }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m11841i() {
        /*
            java.lang.Class<com.facetec.sdk.cd> r1 = com.facetec.sdk.C2885cd.class
            monitor-enter(r1)
            com.facetec.sdk.do r2 = new com.facetec.sdk.do     // Catch:{ all -> 0x04f2 }
            r2.<init>()     // Catch:{ all -> 0x04f2 }
            r0 = 820(0x334, float:1.149E-42)
            short r0 = (short) r0     // Catch:{ all -> 0x04f2 }
            byte[] r3 = f9518c     // Catch:{ all -> 0x04f2 }
            r4 = 21
            byte r4 = r3[r4]     // Catch:{ all -> 0x04f2 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x04f2 }
            r5 = r4 | 5636(0x1604, float:7.898E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x04f2 }
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x04f2 }
            m11815as(r0, r4, r5, r7)     // Catch:{ all -> 0x04f2 }
            r4 = 0
            r0 = r7[r4]     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x04f2 }
            r5 = 1066(0x42a, float:1.494E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x04f2 }
            r7 = 18
            byte r7 = r3[r7]     // Catch:{ all -> 0x04f2 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x04f2 }
            r8 = r7 | 6193(0x1831, float:8.678E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x04f2 }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x04f2 }
            m11815as(r5, r7, r8, r9)     // Catch:{ all -> 0x04f2 }
            r5 = r9[r4]     // Catch:{ all -> 0x04f2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x04f2 }
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x04e9 }
            r7[r4] = r5     // Catch:{ all -> 0x04e9 }
            r5 = 1051(0x41b, float:1.473E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x04e9 }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r3[r8]     // Catch:{ all -> 0x04e9 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x04e9 }
            r10 = 5290(0x14aa, float:7.413E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x04e9 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x04e9 }
            m11815as(r5, r9, r10, r11)     // Catch:{ all -> 0x04e9 }
            r9 = r11[r4]     // Catch:{ all -> 0x04e9 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x04e9 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x04e9 }
            r11 = 1062(0x426, float:1.488E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x04e9 }
            r12 = 3127(0xc37, float:4.382E-42)
            byte r12 = r3[r12]     // Catch:{ all -> 0x04e9 }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x04e9 }
            r13 = 4131(0x1023, float:5.789E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x04e9 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x04e9 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x04e9 }
            r11 = r14[r4]     // Catch:{ all -> 0x04e9 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x04e9 }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x04e9 }
            byte r3 = r3[r8]     // Catch:{ all -> 0x04e9 }
            int r3 = -r3
            byte r3 = (byte) r3     // Catch:{ all -> 0x04e9 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x04e9 }
            m11815as(r5, r3, r10, r13)     // Catch:{ all -> 0x04e9 }
            r3 = r13[r4]     // Catch:{ all -> 0x04e9 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04e9 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x04e9 }
            r12[r4] = r3     // Catch:{ all -> 0x04e9 }
            java.lang.reflect.Method r3 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x04e9 }
            java.lang.Object r0 = r3.invoke(r0, r7)     // Catch:{ all -> 0x04e9 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x04e9 }
            int r3 = r0.length     // Catch:{ all -> 0x04f2 }
            int[] r3 = new int[r3]     // Catch:{ all -> 0x04f2 }
            r7 = r4
        L_0x0089:
            int r9 = r0.length     // Catch:{ all -> 0x04f2 }
            r11 = 1050(0x41a, float:1.471E-42)
            if (r7 >= r9) goto L_0x013c
            r9 = r0[r7]     // Catch:{ all -> 0x04f2 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x0133 }
            r13[r4] = r9     // Catch:{ all -> 0x0133 }
            short r9 = (short) r11     // Catch:{ all -> 0x0133 }
            byte[] r11 = f9518c     // Catch:{ all -> 0x0133 }
            byte r14 = r11[r8]     // Catch:{ all -> 0x0133 }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x0133 }
            int r15 = f9519d     // Catch:{ all -> 0x0133 }
            r12 = r15 | 6720(0x1a40, float:9.417E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0133 }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x0133 }
            m11815as(r9, r14, r12, r8)     // Catch:{ all -> 0x0133 }
            r8 = r8[r4]     // Catch:{ all -> 0x0133 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0133 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0133 }
            r12 = 1060(0x424, float:1.485E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0133 }
            r14 = 74
            byte r14 = (byte) r14     // Catch:{ all -> 0x0133 }
            r4 = 1465(0x5b9, float:2.053E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x0133 }
            r16 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0133 }
            m11815as(r12, r14, r4, r0)     // Catch:{ all -> 0x0133 }
            r4 = 0
            r0 = r0[r4]     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0133 }
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ all -> 0x0133 }
            r12 = 2385(0x951, float:3.342E-42)
            byte r14 = r11[r12]     // Catch:{ all -> 0x0133 }
            int r12 = -r14
            byte r12 = (byte) r12     // Catch:{ all -> 0x0133 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0133 }
            m11815as(r5, r12, r10, r14)     // Catch:{ all -> 0x0133 }
            r12 = 0
            r14 = r14[r12]     // Catch:{ all -> 0x0133 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0133 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0133 }
            r4[r12] = r14     // Catch:{ all -> 0x0133 }
            java.lang.reflect.Method r0 = r8.getMethod(r0, r4)     // Catch:{ all -> 0x0133 }
            r4 = 0
            java.lang.Object r0 = r0.invoke(r4, r13)     // Catch:{ all -> 0x0133 }
            r4 = 2385(0x951, float:3.342E-42)
            byte r8 = r11[r4]     // Catch:{ all -> 0x012a }
            int r4 = -r8
            byte r4 = (byte) r4     // Catch:{ all -> 0x012a }
            r8 = r15 | 6720(0x1a40, float:9.417E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012a }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x012a }
            m11815as(r9, r4, r8, r12)     // Catch:{ all -> 0x012a }
            r4 = 0
            r8 = r12[r4]     // Catch:{ all -> 0x012a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x012a }
            java.lang.Class r4 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x012a }
            r8 = 1059(0x423, float:1.484E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012a }
            r9 = 1801(0x709, float:2.524E-42)
            byte r9 = r11[r9]     // Catch:{ all -> 0x012a }
            int r9 = r9 + r6
            byte r9 = (byte) r9     // Catch:{ all -> 0x012a }
            r11 = 1459(0x5b3, float:2.044E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x012a }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x012a }
            m11815as(r8, r9, r11, r12)     // Catch:{ all -> 0x012a }
            r8 = 0
            r9 = r12[r8]     // Catch:{ all -> 0x012a }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x012a }
            r8 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r9, r8)     // Catch:{ all -> 0x012a }
            java.lang.Object r0 = r4.invoke(r0, r8)     // Catch:{ all -> 0x012a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x012a }
            int r0 = r0.intValue()     // Catch:{ all -> 0x012a }
            r3[r7] = r0     // Catch:{ all -> 0x04f2 }
            int r7 = r7 + 1
            r0 = r16
            r4 = 0
            r8 = 2385(0x951, float:3.342E-42)
            goto L_0x0089
        L_0x012a:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x04f2 }
            if (r2 == 0) goto L_0x0132
            throw r2     // Catch:{ all -> 0x04f2 }
        L_0x0132:
            throw r0     // Catch:{ all -> 0x04f2 }
        L_0x0133:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x04f2 }
            if (r2 == 0) goto L_0x013b
            throw r2     // Catch:{ all -> 0x04f2 }
        L_0x013b:
            throw r0     // Catch:{ all -> 0x04f2 }
        L_0x013c:
            r0 = 0
        L_0x013d:
            int r4 = r0 + 1
            r0 = r3[r0]     // Catch:{ all -> 0x048c }
            int r0 = r2.mo9125d(r0)     // Catch:{ all -> 0x048c }
            r15 = 1044(0x414, float:1.463E-42)
            r8 = 15
            r14 = 16
            r7 = 2
            r11 = 9
            r9 = 24
            r12 = 27
            r13 = 8
            switch(r0) {
                case -35: goto L_0x0483;
                case -34: goto L_0x046f;
                case -33: goto L_0x046b;
                case -32: goto L_0x0458;
                case -31: goto L_0x0456;
                case -30: goto L_0x0452;
                case -29: goto L_0x0445;
                case -28: goto L_0x0441;
                case -27: goto L_0x043d;
                case -26: goto L_0x0430;
                case -25: goto L_0x0421;
                case -24: goto L_0x0417;
                case -23: goto L_0x0413;
                case -22: goto L_0x0411;
                case -21: goto L_0x0408;
                case -20: goto L_0x03f3;
                case -19: goto L_0x03e1;
                case -18: goto L_0x03cf;
                case -17: goto L_0x037b;
                case -16: goto L_0x0300;
                case -15: goto L_0x02b2;
                case -14: goto L_0x0291;
                case -13: goto L_0x023f;
                case -12: goto L_0x01d9;
                case -11: goto L_0x01aa;
                case -10: goto L_0x01a6;
                case -9: goto L_0x0194;
                case -8: goto L_0x0190;
                case -7: goto L_0x0180;
                case -6: goto L_0x0178;
                case -5: goto L_0x0174;
                case -4: goto L_0x0170;
                case -3: goto L_0x0166;
                case -2: goto L_0x015e;
                case -1: goto L_0x015a;
                default: goto L_0x0157;
            }
        L_0x0157:
            r8 = 0
            goto L_0x0487
        L_0x015a:
            r0 = 30
            goto L_0x0488
        L_0x015e:
            boolean r0 = f9520e     // Catch:{ all -> 0x0375 }
            r2.f10018b = r0     // Catch:{ all -> 0x0375 }
            r2.mo9125d(r6)     // Catch:{ all -> 0x0375 }
            goto L_0x0157
        L_0x0166:
            r2.mo9125d(r8)     // Catch:{ all -> 0x0375 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0375 }
            if (r0 != 0) goto L_0x0487
            r0 = 4
            goto L_0x0488
        L_0x0170:
            r0 = 65
            goto L_0x0488
        L_0x0174:
            r0 = 63
            goto L_0x0488
        L_0x0178:
            java.lang.String r0 = "PhoenixAndroid"
            r2.f10022f = r0     // Catch:{ all -> 0x0375 }
        L_0x017c:
            r2.mo9125d(r9)     // Catch:{ all -> 0x0375 }
            goto L_0x0157
        L_0x0180:
            r2.f10018b = r6     // Catch:{ all -> 0x0375 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x0375 }
            r2.mo9125d(r12)     // Catch:{ all -> 0x0375 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x0375 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0375 }
            java.lang.System.loadLibrary(r0)     // Catch:{ all -> 0x0375 }
            goto L_0x0157
        L_0x0190:
            m11767E()     // Catch:{ all -> 0x0375 }
            goto L_0x0157
        L_0x0194:
            r2.f10018b = r6     // Catch:{ all -> 0x0375 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x0375 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x0375 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0375 }
            if (r0 == 0) goto L_0x01a2
            r0 = r6
            goto L_0x01a3
        L_0x01a2:
            r0 = 0
        L_0x01a3:
            f9520e = r0     // Catch:{ all -> 0x0375 }
            goto L_0x0157
        L_0x01a6:
            r0 = 34
            goto L_0x0488
        L_0x01aa:
            short r0 = (short) r15
            byte[] r7 = f9518c     // Catch:{ all -> 0x01d0 }
            r8 = 2385(0x951, float:3.342E-42)
            byte r7 = r7[r8]     // Catch:{ all -> 0x01d0 }
            int r7 = -r7
            byte r7 = (byte) r7     // Catch:{ all -> 0x01d0 }
            r8 = 6170(0x181a, float:8.646E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x01d0 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x01d0 }
            m11815as(r0, r7, r8, r11)     // Catch:{ all -> 0x01d0 }
            r7 = 0
            r0 = r11[r7]     // Catch:{ all -> 0x01d0 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01d0 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x01d0 }
            r7 = 0
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r7)     // Catch:{ all -> 0x01d0 }
            java.lang.Object r0 = r0.newInstance(r7)     // Catch:{ all -> 0x01d0 }
            r2.f10022f = r0     // Catch:{ all -> 0x0375 }
            goto L_0x017c
        L_0x01d0:
            r0 = move-exception
            java.lang.Throwable r7 = r0.getCause()     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x01d8
            throw r7     // Catch:{ all -> 0x0375 }
        L_0x01d8:
            throw r0     // Catch:{ all -> 0x0375 }
        L_0x01d9:
            int[] r0 = new int[r14]     // Catch:{ all -> 0x0375 }
            r12 = 534374606(0x1fd9e8ce, float:9.228822E-20)
            r14 = 0
            r0[r14] = r12     // Catch:{ all -> 0x0375 }
            r12 = -60092034(0xfffffffffc6b117e, float:-4.8821782E36)
            r0[r6] = r12     // Catch:{ all -> 0x0375 }
            r12 = -1203682529(0xffffffffb841431f, float:-4.6077297E-5)
            r0[r7] = r12     // Catch:{ all -> 0x0375 }
            r7 = 3
            r12 = 1171814189(0x45d8772d, float:6926.897)
            r0[r7] = r12     // Catch:{ all -> 0x0375 }
            r7 = 4
            r12 = 1381063729(0x52515c31, float:2.2479872E11)
            r0[r7] = r12     // Catch:{ all -> 0x0375 }
            r7 = -306845876(0xffffffffedb5e74c, float:-7.037051E27)
            r12 = 5
            r0[r12] = r7     // Catch:{ all -> 0x0375 }
            r7 = 6
            r12 = 789356749(0x2f0ca0cd, float:1.2790054E-10)
            r0[r7] = r12     // Catch:{ all -> 0x0375 }
            r7 = 7
            r12 = -704749796(0xffffffffd5fe5f1c, float:-3.49605556E13)
            r0[r7] = r12     // Catch:{ all -> 0x0375 }
            r7 = -95187658(0xfffffffffa538d36, float:-2.7460968E35)
            r0[r13] = r7     // Catch:{ all -> 0x0375 }
            r7 = -1466086650(0xffffffffa89d4b06, float:-1.7463038E-14)
            r0[r11] = r7     // Catch:{ all -> 0x0375 }
            r7 = 10
            r11 = 1493711804(0x59083bbc, float:2.39664222E15)
            r0[r7] = r11     // Catch:{ all -> 0x0375 }
            r7 = -649420398(0xffffffffd94aa192, float:-3.56472461E15)
            r11 = 11
            r0[r11] = r7     // Catch:{ all -> 0x0375 }
            r7 = -2083842598(0xffffffff83cb15da, float:-1.19362845E-36)
            r11 = 12
            r0[r11] = r7     // Catch:{ all -> 0x0375 }
            r7 = 13
            r11 = -332705770(0xffffffffec2b5016, float:-8.2841804E26)
            r0[r7] = r11     // Catch:{ all -> 0x0375 }
            r7 = 14
            r11 = -1277325880(0xffffffffb3dd8dc8, float:-1.0316904E-7)
            r0[r7] = r11     // Catch:{ all -> 0x0375 }
            r7 = -2100403526(0xffffffff82ce62ba, float:-3.0325646E-37)
            r0[r8] = r7     // Catch:{ all -> 0x0375 }
            r2.f10022f = r0     // Catch:{ all -> 0x0375 }
            goto L_0x017c
        L_0x023f:
            r0 = 1049(0x419, float:1.47E-42)
            short r0 = (short) r0
            int r7 = f9519d     // Catch:{ all -> 0x0286 }
            r7 = r7 & 125(0x7d, float:1.75E-43)
            byte r7 = (byte) r7     // Catch:{ all -> 0x0286 }
            r8 = 6859(0x1acb, float:9.612E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0286 }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x0286 }
            m11815as(r0, r7, r8, r9)     // Catch:{ all -> 0x0286 }
            r7 = 0
            r0 = r9[r7]     // Catch:{ all -> 0x0286 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0286 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0286 }
            r8 = 1050(0x41a, float:1.471E-42)
            short r9 = (short) r8
            byte[] r11 = f9518c     // Catch:{ all -> 0x0284 }
            byte r11 = r11[r7]     // Catch:{ all -> 0x0284 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0284 }
            r12 = 1875(0x753, float:2.627E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0284 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x0284 }
            m11815as(r9, r11, r12, r13)     // Catch:{ all -> 0x0284 }
            r9 = r13[r7]     // Catch:{ all -> 0x0284 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0284 }
            r7 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r9, r7)     // Catch:{ all -> 0x0284 }
            java.lang.Object r0 = r0.invoke(r7, r7)     // Catch:{ all -> 0x0284 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0284 }
            long r11 = r0.longValue()     // Catch:{ all -> 0x0284 }
            r2.f10017a = r11     // Catch:{ all -> 0x0375 }
            r0 = 84
            r2.mo9125d(r0)     // Catch:{ all -> 0x0375 }
            goto L_0x0157
        L_0x0284:
            r0 = move-exception
            goto L_0x0289
        L_0x0286:
            r0 = move-exception
            r8 = 1050(0x41a, float:1.471E-42)
        L_0x0289:
            java.lang.Throwable r7 = r0.getCause()     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x0290
            throw r7     // Catch:{ all -> 0x0375 }
        L_0x0290:
            throw r0     // Catch:{ all -> 0x0375 }
        L_0x0291:
            r8 = 1050(0x41a, float:1.471E-42)
            r2.f10018b = r7     // Catch:{ all -> 0x0375 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x0375 }
            r2.mo9125d(r12)     // Catch:{ all -> 0x0375 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x0375 }
            int[] r0 = (int[]) r0     // Catch:{ all -> 0x0375 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x0375 }
            int r7 = r2.f10020d     // Catch:{ all -> 0x0375 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0375 }
            m11816at(r0, r7, r11)     // Catch:{ all -> 0x0375 }
            r7 = 0
            r0 = r11[r7]     // Catch:{ all -> 0x0375 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0375 }
            r2.f10022f = r0     // Catch:{ all -> 0x0375 }
            goto L_0x017c
        L_0x02b2:
            r8 = 1050(0x41a, float:1.471E-42)
            r2.f10018b = r6     // Catch:{ all -> 0x0375 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x0375 }
            r2.mo9125d(r12)     // Catch:{ all -> 0x0375 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x0375 }
            byte[] r7 = f9518c     // Catch:{ all -> 0x02f7 }
            r11 = 2385(0x951, float:3.342E-42)
            byte r12 = r7[r11]     // Catch:{ all -> 0x02f7 }
            int r11 = -r12
            byte r11 = (byte) r11     // Catch:{ all -> 0x02f7 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x02f7 }
            m11815as(r5, r11, r10, r12)     // Catch:{ all -> 0x02f7 }
            r11 = 0
            r12 = r12[r11]     // Catch:{ all -> 0x02f7 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x02f7 }
            java.lang.Class r11 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x02f7 }
            r12 = 1061(0x425, float:1.487E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x02f7 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r7 = r7[r13]     // Catch:{ all -> 0x02f7 }
            int r7 = r7 + r6
            byte r7 = (byte) r7     // Catch:{ all -> 0x02f7 }
            r13 = 5086(0x13de, float:7.127E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x02f7 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x02f7 }
            m11815as(r12, r7, r13, r14)     // Catch:{ all -> 0x02f7 }
            r7 = 0
            r12 = r14[r7]     // Catch:{ all -> 0x02f7 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x02f7 }
            r7 = 0
            java.lang.reflect.Method r11 = r11.getMethod(r12, r7)     // Catch:{ all -> 0x02f7 }
            java.lang.Object r0 = r11.invoke(r0, r7)     // Catch:{ all -> 0x02f7 }
            r2.f10022f = r0     // Catch:{ all -> 0x0375 }
            goto L_0x017c
        L_0x02f7:
            r0 = move-exception
            java.lang.Throwable r7 = r0.getCause()     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x02ff
            throw r7     // Catch:{ all -> 0x0375 }
        L_0x02ff:
            throw r0     // Catch:{ all -> 0x0375 }
        L_0x0300:
            r8 = 1050(0x41a, float:1.471E-42)
            r2.f10018b = r7     // Catch:{ all -> 0x0375 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x0375 }
            r2.mo9125d(r12)     // Catch:{ all -> 0x0375 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x0375 }
            r2.mo9125d(r12)     // Catch:{ all -> 0x0375 }
            java.lang.Object r7 = r2.f10026j     // Catch:{ all -> 0x0375 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x036c }
            r12 = 0
            r11[r12] = r7     // Catch:{ all -> 0x036c }
            short r7 = (short) r15     // Catch:{ all -> 0x036c }
            byte[] r12 = f9518c     // Catch:{ all -> 0x036c }
            r13 = 2385(0x951, float:3.342E-42)
            byte r14 = r12[r13]     // Catch:{ all -> 0x036c }
            int r13 = -r14
            byte r13 = (byte) r13     // Catch:{ all -> 0x036c }
            r14 = 6170(0x181a, float:8.646E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x036c }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x036c }
            m11815as(r7, r13, r14, r15)     // Catch:{ all -> 0x036c }
            r7 = 0
            r13 = r15[r7]     // Catch:{ all -> 0x036c }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x036c }
            java.lang.Class r7 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x036c }
            r13 = 1061(0x425, float:1.487E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x036c }
            int r14 = f9519d     // Catch:{ all -> 0x036c }
            r14 = r14 & 125(0x7d, float:1.75E-43)
            byte r14 = (byte) r14     // Catch:{ all -> 0x036c }
            r15 = 582(0x246, float:8.16E-43)
            byte r15 = r12[r15]     // Catch:{ all -> 0x036c }
            int r15 = -r15
            short r15 = (short) r15     // Catch:{ all -> 0x036c }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x036c }
            m11815as(r13, r14, r15, r8)     // Catch:{ all -> 0x036c }
            r13 = 0
            r8 = r8[r13]     // Catch:{ all -> 0x036c }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x036c }
            java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch:{ all -> 0x036c }
            r14 = 2385(0x951, float:3.342E-42)
            byte r12 = r12[r14]     // Catch:{ all -> 0x036c }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x036c }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x036c }
            m11815as(r5, r12, r10, r14)     // Catch:{ all -> 0x036c }
            r12 = 0
            r14 = r14[r12]     // Catch:{ all -> 0x036c }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x036c }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x036c }
            r13[r12] = r14     // Catch:{ all -> 0x036c }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r13)     // Catch:{ all -> 0x036c }
            java.lang.Object r0 = r7.invoke(r0, r11)     // Catch:{ all -> 0x036c }
            r2.f10022f = r0     // Catch:{ all -> 0x0375 }
            goto L_0x017c
        L_0x036c:
            r0 = move-exception
            java.lang.Throwable r7 = r0.getCause()     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x0374
            throw r7     // Catch:{ all -> 0x0375 }
        L_0x0374:
            throw r0     // Catch:{ all -> 0x0375 }
        L_0x0375:
            r0 = move-exception
            r7 = 1048(0x418, float:1.469E-42)
            r8 = 0
            goto L_0x0490
        L_0x037b:
            r2.f10018b = r6     // Catch:{ all -> 0x048c }
            r2.mo9125d(r13)     // Catch:{ all -> 0x048c }
            r2.mo9125d(r12)     // Catch:{ all -> 0x048c }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x048c }
            r7 = 1048(0x418, float:1.469E-42)
            short r8 = (short) r7
            byte[] r7 = f9518c     // Catch:{ all -> 0x03c5 }
            r11 = 2385(0x951, float:3.342E-42)
            byte r12 = r7[r11]     // Catch:{ all -> 0x03c5 }
            int r11 = -r12
            byte r11 = (byte) r11     // Catch:{ all -> 0x03c5 }
            r12 = 5921(0x1721, float:8.297E-42)
            short r13 = (short) r12     // Catch:{ all -> 0x03c5 }
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x03c5 }
            m11815as(r8, r11, r13, r12)     // Catch:{ all -> 0x03c5 }
            r8 = 0
            r11 = r12[r8]     // Catch:{ all -> 0x03c5 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x03c5 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x03c5 }
            r12 = 1057(0x421, float:1.481E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x03c5 }
            byte r7 = r7[r8]     // Catch:{ all -> 0x03c5 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x03c5 }
            r13 = 5054(0x13be, float:7.082E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x03c5 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x03c5 }
            m11815as(r12, r7, r13, r14)     // Catch:{ all -> 0x03c5 }
            r7 = r14[r8]     // Catch:{ all -> 0x03c5 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x03c5 }
            r8 = 0
            java.lang.reflect.Method r7 = r11.getMethod(r7, r8)     // Catch:{ all -> 0x03c3 }
            java.lang.Object r0 = r7.invoke(r0, r8)     // Catch:{ all -> 0x03c3 }
            r2.f10022f = r0     // Catch:{ all -> 0x0481 }
        L_0x03be:
            r2.mo9125d(r9)     // Catch:{ all -> 0x0481 }
            goto L_0x0487
        L_0x03c3:
            r0 = move-exception
            goto L_0x03c7
        L_0x03c5:
            r0 = move-exception
            r8 = 0
        L_0x03c7:
            java.lang.Throwable r7 = r0.getCause()     // Catch:{ all -> 0x0481 }
            if (r7 == 0) goto L_0x03ce
            throw r7     // Catch:{ all -> 0x0481 }
        L_0x03ce:
            throw r0     // Catch:{ all -> 0x0481 }
        L_0x03cf:
            r8 = 0
            r2.f10018b = r6     // Catch:{ all -> 0x0481 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x0481 }
            r2.mo9125d(r12)     // Catch:{ all -> 0x0481 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x0481 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0481 }
            r2.f10022f = r0     // Catch:{ all -> 0x0481 }
            goto L_0x03be
        L_0x03e1:
            r8 = 0
            r2.f10018b = r6     // Catch:{ all -> 0x0481 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x0481 }
            r2.mo9125d(r12)     // Catch:{ all -> 0x0481 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x0481 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0481 }
            com.facetec.sdk.C2797ar.m10878a(r0)     // Catch:{ all -> 0x0481 }
            goto L_0x0487
        L_0x03f3:
            r8 = 0
            com.facetec.sdk.as r0 = new com.facetec.sdk.as     // Catch:{ all -> 0x0481 }
            r2.f10018b = r6     // Catch:{ all -> 0x0481 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x0481 }
            r2.mo9125d(r12)     // Catch:{ all -> 0x0481 }
            java.lang.Object r7 = r2.f10026j     // Catch:{ all -> 0x0481 }
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ all -> 0x0481 }
            r0.<init>((java.lang.Throwable) r7)     // Catch:{ all -> 0x0481 }
            r2.f10022f = r0     // Catch:{ all -> 0x0481 }
            goto L_0x03be
        L_0x0408:
            r8 = 0
            r2.mo9125d(r14)     // Catch:{ all -> 0x0481 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x0481 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0481 }
            throw r0     // Catch:{ all -> 0x0481 }
        L_0x0411:
            monitor-exit(r1)
            return
        L_0x0413:
            r0 = 52
            goto L_0x0488
        L_0x0417:
            r8 = 0
            int r0 = f9527n     // Catch:{ all -> 0x0481 }
            r2.f10018b = r0     // Catch:{ all -> 0x0481 }
            r2.mo9125d(r6)     // Catch:{ all -> 0x0481 }
            goto L_0x0487
        L_0x0421:
            r8 = 0
            r2.f10018b = r6     // Catch:{ all -> 0x0481 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x0481 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x0481 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0481 }
            f9526m = r0     // Catch:{ all -> 0x0481 }
            goto L_0x0487
        L_0x0430:
            r0 = 12
            r8 = 0
            r2.mo9125d(r0)     // Catch:{ all -> 0x0481 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0481 }
            if (r0 != 0) goto L_0x0487
            r0 = 45
            goto L_0x0488
        L_0x043d:
            r8 = 0
            r0 = 70
            goto L_0x0488
        L_0x0441:
            r8 = 0
            r0 = 68
            goto L_0x0488
        L_0x0445:
            r0 = 12
            r8 = 0
            r2.mo9125d(r0)     // Catch:{ all -> 0x0481 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0481 }
            if (r0 != 0) goto L_0x0487
            r0 = 60
            goto L_0x0488
        L_0x0452:
            r8 = 0
            r0 = 61
            goto L_0x0488
        L_0x0456:
            r0 = r6
            goto L_0x0488
        L_0x0458:
            r0 = 20
            r8 = 0
            r2.mo9125d(r0)     // Catch:{ all -> 0x0481 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0481 }
            if (r0 == 0) goto L_0x0468
            if (r0 == r6) goto L_0x0465
            goto L_0x0468
        L_0x0465:
            r0 = 29
            goto L_0x0488
        L_0x0468:
            r0 = 36
            goto L_0x0488
        L_0x046b:
            r8 = 0
            r0 = 62
            goto L_0x0488
        L_0x046f:
            r0 = 20
            r8 = 0
            r2.mo9125d(r0)     // Catch:{ all -> 0x0481 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0481 }
            if (r0 == 0) goto L_0x047e
            if (r0 == r6) goto L_0x047c
            goto L_0x047e
        L_0x047c:
            r0 = 5
            goto L_0x0488
        L_0x047e:
            r0 = 46
            goto L_0x0488
        L_0x0481:
            r0 = move-exception
            goto L_0x048e
        L_0x0483:
            r8 = 0
            r0 = 67
            goto L_0x0488
        L_0x0487:
            r0 = r4
        L_0x0488:
            r11 = 1050(0x41a, float:1.471E-42)
            goto L_0x013d
        L_0x048c:
            r0 = move-exception
            r8 = 0
        L_0x048e:
            r7 = 1048(0x418, float:1.469E-42)
        L_0x0490:
            short r7 = (short) r7
            byte[] r9 = f9518c     // Catch:{ all -> 0x04f2 }
            r11 = 2385(0x951, float:3.342E-42)
            byte r12 = r9[r11]     // Catch:{ all -> 0x04f2 }
            int r11 = -r12
            byte r11 = (byte) r11     // Catch:{ all -> 0x04f2 }
            r12 = 5921(0x1721, float:8.297E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x04f2 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x04f2 }
            m11815as(r7, r11, r12, r13)     // Catch:{ all -> 0x04f2 }
            r11 = 0
            r13 = r13[r11]     // Catch:{ all -> 0x04f2 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x04f2 }
            java.lang.Class r11 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x04f2 }
            boolean r11 = r11.isInstance(r0)     // Catch:{ all -> 0x04f2 }
            if (r11 == 0) goto L_0x04bb
            r11 = 5
            if (r4 < r11) goto L_0x04bb
            r11 = 11
            if (r4 > r11) goto L_0x04bd
            r7 = 0
            r13 = 2385(0x951, float:3.342E-42)
            goto L_0x04df
        L_0x04bb:
            r11 = 11
        L_0x04bd:
            r13 = 2385(0x951, float:3.342E-42)
            byte r9 = r9[r13]     // Catch:{ all -> 0x04f2 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x04f2 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x04f2 }
            m11815as(r7, r9, r12, r14)     // Catch:{ all -> 0x04f2 }
            r7 = 0
            r9 = r14[r7]     // Catch:{ all -> 0x04f2 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x04f2 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x04f2 }
            boolean r9 = r9.isInstance(r0)     // Catch:{ all -> 0x04f2 }
            if (r9 == 0) goto L_0x04e8
            r9 = 46
            if (r4 < r9) goto L_0x04e8
            r9 = 52
            if (r4 > r9) goto L_0x04e8
        L_0x04df:
            r2.f10022f = r0     // Catch:{ all -> 0x04f2 }
            r0 = 23
            r2.mo9125d(r0)     // Catch:{ all -> 0x04f2 }
            r0 = r11
            goto L_0x0488
        L_0x04e8:
            throw r0     // Catch:{ all -> 0x04f2 }
        L_0x04e9:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x04f2 }
            if (r2 == 0) goto L_0x04f1
            throw r2     // Catch:{ all -> 0x04f2 }
        L_0x04f1:
            throw r0     // Catch:{ all -> 0x04f2 }
        L_0x04f2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11841i():void");
    }

    @JNI.C2746c(mo8795e = 986922517)
    /* renamed from: i */
    static native void m11842i(boolean z, byte[] bArr, long j, boolean z2, int i, int i2, int i3, boolean z3);

    static void init$0() {
        $$a = new byte[]{110, -99, 109, -51};
        $$b = 78;
    }

    static void init$1() {
        $$d = new byte[]{114, 6, 6, -123};
        $$e = 53;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facetec.sdk.C2896ci m11843j() {
        /*
            com.facetec.sdk.do r1 = new com.facetec.sdk.do
            r1.<init>()
            r0 = 924(0x39c, float:1.295E-42)
            short r0 = (short) r0
            byte[] r2 = f9518c
            r3 = 21
            byte r4 = r2[r3]
            byte r4 = (byte) r4
            r5 = r4 | 164(0xa4, float:2.3E-43)
            short r5 = (short) r5
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            m11815as(r0, r4, r5, r7)
            r0 = 0
            r4 = r7[r0]
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1066(0x42a, float:1.494E-42)
            short r5 = (short) r5
            r7 = 18
            byte r7 = r2[r7]
            byte r7 = (byte) r7
            r8 = r7 | 6193(0x1831, float:8.678E-42)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r6]
            m11815as(r5, r7, r8, r9)
            r5 = r9[r0]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0201 }
            r7[r0] = r5     // Catch:{ all -> 0x0201 }
            r5 = 1051(0x41b, float:1.473E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x0201 }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r2[r8]     // Catch:{ all -> 0x0201 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0201 }
            r10 = 5290(0x14aa, float:7.413E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0201 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0201 }
            m11815as(r5, r9, r10, r11)     // Catch:{ all -> 0x0201 }
            r9 = r11[r0]     // Catch:{ all -> 0x0201 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0201 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0201 }
            r11 = 1062(0x426, float:1.488E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0201 }
            r12 = 3127(0xc37, float:4.382E-42)
            byte r12 = r2[r12]     // Catch:{ all -> 0x0201 }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x0201 }
            r13 = 4131(0x1023, float:5.789E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0201 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0201 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x0201 }
            r11 = r14[r0]     // Catch:{ all -> 0x0201 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0201 }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x0201 }
            byte r2 = r2[r8]     // Catch:{ all -> 0x0201 }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x0201 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x0201 }
            m11815as(r5, r2, r10, r13)     // Catch:{ all -> 0x0201 }
            r2 = r13[r0]     // Catch:{ all -> 0x0201 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0201 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0201 }
            r12[r0] = r2     // Catch:{ all -> 0x0201 }
            java.lang.reflect.Method r2 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x0201 }
            java.lang.Object r2 = r2.invoke(r4, r7)     // Catch:{ all -> 0x0201 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x0201 }
            int r4 = r2.length
            int[] r4 = new int[r4]
            r7 = r0
        L_0x0086:
            int r9 = r2.length
            if (r7 >= r9) goto L_0x0134
            r9 = r2[r7]
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            r11[r0] = r9     // Catch:{ all -> 0x012b }
            r9 = 1050(0x41a, float:1.471E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x012b }
            byte[] r12 = f9518c     // Catch:{ all -> 0x012b }
            byte r13 = r12[r8]     // Catch:{ all -> 0x012b }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            int r14 = f9519d     // Catch:{ all -> 0x012b }
            r15 = r14 | 6720(0x1a40, float:9.417E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x012b }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11815as(r9, r13, r15, r3)     // Catch:{ all -> 0x012b }
            r3 = r3[r0]     // Catch:{ all -> 0x012b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x012b }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x012b }
            r13 = 1060(0x424, float:1.485E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x012b }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x012b }
            r8 = 1465(0x5b9, float:2.053E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012b }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11815as(r13, r15, r8, r0)     // Catch:{ all -> 0x012b }
            r8 = 0
            r0 = r0[r8]     // Catch:{ all -> 0x012b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x012b }
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ all -> 0x012b }
            r13 = 2385(0x951, float:3.342E-42)
            byte r15 = r12[r13]     // Catch:{ all -> 0x012b }
            int r13 = -r15
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11815as(r5, r13, r10, r15)     // Catch:{ all -> 0x012b }
            r13 = 0
            r15 = r15[r13]     // Catch:{ all -> 0x012b }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x012b }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x012b }
            r8[r13] = r15     // Catch:{ all -> 0x012b }
            java.lang.reflect.Method r0 = r3.getMethod(r0, r8)     // Catch:{ all -> 0x012b }
            r3 = 0
            java.lang.Object r0 = r0.invoke(r3, r11)     // Catch:{ all -> 0x012b }
            r8 = 2385(0x951, float:3.342E-42)
            byte r11 = r12[r8]     // Catch:{ all -> 0x0122 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0122 }
            r13 = r14 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0122 }
            m11815as(r9, r11, r13, r14)     // Catch:{ all -> 0x0122 }
            r9 = 0
            r11 = r14[r9]     // Catch:{ all -> 0x0122 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0122 }
            java.lang.Class r9 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0122 }
            r11 = 1059(0x423, float:1.484E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0122 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0122 }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x0122 }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0122 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x0122 }
            r11 = 0
            r12 = r14[r11]     // Catch:{ all -> 0x0122 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0122 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r3)     // Catch:{ all -> 0x0122 }
            java.lang.Object r0 = r9.invoke(r0, r3)     // Catch:{ all -> 0x0122 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0122 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0122 }
            r4[r7] = r0
            int r7 = r7 + 1
            r0 = r11
            r3 = 21
            goto L_0x0086
        L_0x0122:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x012a
            throw r1
        L_0x012a:
            throw r0
        L_0x012b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0133
            throw r1
        L_0x0133:
            throw r0
        L_0x0134:
            r11 = r0
        L_0x0135:
            int r2 = r0 + 1
            r3 = 23
            r5 = 39
            r0 = r4[r0]     // Catch:{ all -> 0x01f0 }
            int r0 = r1.mo9125d(r0)     // Catch:{ all -> 0x01f0 }
            r7 = 9
            r8 = 12
            r9 = 16
            r10 = 8
            switch(r0) {
                case -20: goto L_0x01ea;
                case -19: goto L_0x01d8;
                case -18: goto L_0x01c4;
                case -17: goto L_0x01bc;
                case -16: goto L_0x01b8;
                case -15: goto L_0x01b4;
                case -14: goto L_0x01aa;
                case -13: goto L_0x019d;
                case -12: goto L_0x0198;
                case -11: goto L_0x0196;
                case -10: goto L_0x0193;
                case -9: goto L_0x0187;
                case -8: goto L_0x0179;
                case -7: goto L_0x0174;
                case -6: goto L_0x016c;
                case -5: goto L_0x016a;
                case -4: goto L_0x0168;
                case -3: goto L_0x015b;
                case -2: goto L_0x0150;
                case -1: goto L_0x014e;
                default: goto L_0x014c;
            }     // Catch:{ all -> 0x01f0 }
        L_0x014c:
            goto L_0x01ed
        L_0x014e:
            r0 = 6
            goto L_0x0135
        L_0x0150:
            int r0 = m11802af()     // Catch:{ all -> 0x01f0 }
            r1.f10018b = r0     // Catch:{ all -> 0x01f0 }
        L_0x0156:
            r1.mo9125d(r6)     // Catch:{ all -> 0x01f0 }
            goto L_0x01ed
        L_0x015b:
            com.facetec.sdk.ci[] r0 = com.facetec.sdk.C2896ci.values()     // Catch:{ all -> 0x01f0 }
            r1.f10022f = r0     // Catch:{ all -> 0x01f0 }
            r0 = 24
            r1.mo9125d(r0)     // Catch:{ all -> 0x01f0 }
            goto L_0x01ed
        L_0x0168:
            r0 = r3
            goto L_0x0135
        L_0x016a:
            r0 = r8
            goto L_0x0135
        L_0x016c:
            r1.mo9125d(r9)     // Catch:{ all -> 0x01f0 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01f0 }
            com.facetec.sdk.ci r0 = (com.facetec.sdk.C2896ci) r0     // Catch:{ all -> 0x01f0 }
            return r0
        L_0x0174:
            int r0 = f9526m     // Catch:{ all -> 0x01f0 }
            r1.f10018b = r0     // Catch:{ all -> 0x01f0 }
            goto L_0x0156
        L_0x0179:
            r1.f10018b = r6     // Catch:{ all -> 0x01f0 }
            r1.mo9125d(r10)     // Catch:{ all -> 0x01f0 }
            r1.mo9125d(r7)     // Catch:{ all -> 0x01f0 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01f0 }
            f9527n = r0     // Catch:{ all -> 0x01f0 }
            goto L_0x01ed
        L_0x0187:
            r0 = 15
            r1.mo9125d(r0)     // Catch:{ all -> 0x01f0 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01f0 }
            if (r0 != 0) goto L_0x01ed
            r0 = 21
            goto L_0x0135
        L_0x0193:
            r0 = 22
            goto L_0x0135
        L_0x0196:
            r0 = r6
            goto L_0x0135
        L_0x0198:
            int r0 = f9527n     // Catch:{ all -> 0x01f0 }
            r1.f10018b = r0     // Catch:{ all -> 0x01f0 }
            goto L_0x0156
        L_0x019d:
            r1.f10018b = r6     // Catch:{ all -> 0x01f0 }
            r1.mo9125d(r10)     // Catch:{ all -> 0x01f0 }
            r1.mo9125d(r7)     // Catch:{ all -> 0x01f0 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01f0 }
            f9526m = r0     // Catch:{ all -> 0x01f0 }
            goto L_0x01ed
        L_0x01aa:
            r1.mo9125d(r8)     // Catch:{ all -> 0x01f0 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01f0 }
            if (r0 != 0) goto L_0x01ed
            r0 = 32
            goto L_0x0135
        L_0x01b4:
            r0 = 42
            goto L_0x0135
        L_0x01b8:
            r0 = 40
            goto L_0x0135
        L_0x01bc:
            r1.mo9125d(r9)     // Catch:{ all -> 0x01f0 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01f0 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01f0 }
            throw r0     // Catch:{ all -> 0x01f0 }
        L_0x01c4:
            r1.f10018b = r6     // Catch:{ all -> 0x01f0 }
            r1.mo9125d(r10)     // Catch:{ all -> 0x01f0 }
            r0 = 27
            r1.mo9125d(r0)     // Catch:{ all -> 0x01f0 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01f0 }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x01f0 }
            r1.f10018b = r0     // Catch:{ all -> 0x01f0 }
            goto L_0x0156
        L_0x01d8:
            r0 = 20
            r1.mo9125d(r0)     // Catch:{ all -> 0x01f0 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01f0 }
            r2 = 10
            if (r0 == 0) goto L_0x01ed
            if (r0 == r6) goto L_0x01e6
            goto L_0x01ed
        L_0x01e6:
            r0 = 34
            goto L_0x0135
        L_0x01ea:
            r0 = r5
            goto L_0x0135
        L_0x01ed:
            r0 = r2
            goto L_0x0135
        L_0x01f0:
            r0 = move-exception
            r7 = 35
            if (r2 < r7) goto L_0x0200
            if (r2 > r5) goto L_0x0200
            r1.f10022f = r0
            r1.mo9125d(r3)
            r0 = 33
            goto L_0x0135
        L_0x0200:
            throw r0
        L_0x0201:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0209
            throw r1
        L_0x0209:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11843j():com.facetec.sdk.ci");
    }

    @JNI.C2746c(mo8795e = 363975514)
    /* renamed from: j */
    static native void m11844j(boolean z);

    @JNI.C2746c(mo8795e = 785930769)
    /* renamed from: k */
    static native void m11845k();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facetec.sdk.C2895ch m11846l() {
        /*
            com.facetec.sdk.do r1 = new com.facetec.sdk.do
            r1.<init>()
            r0 = 920(0x398, float:1.289E-42)
            short r0 = (short) r0
            byte[] r2 = f9518c
            r3 = 21
            byte r3 = r2[r3]
            byte r3 = (byte) r3
            r4 = 5232(0x1470, float:7.332E-42)
            short r4 = (short) r4
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            m11815as(r0, r3, r4, r6)
            r0 = 0
            r3 = r6[r0]
            java.lang.String r3 = (java.lang.String) r3
            r4 = 1066(0x42a, float:1.494E-42)
            short r4 = (short) r4
            r6 = 18
            byte r6 = r2[r6]
            byte r6 = (byte) r6
            r7 = r6 | 6193(0x1831, float:8.678E-42)
            short r7 = (short) r7
            java.lang.Object[] r8 = new java.lang.Object[r5]
            m11815as(r4, r6, r7, r8)
            r4 = r8[r0]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x01e9 }
            r6[r0] = r4     // Catch:{ all -> 0x01e9 }
            r4 = 1051(0x41b, float:1.473E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x01e9 }
            r7 = 2385(0x951, float:3.342E-42)
            byte r8 = r2[r7]     // Catch:{ all -> 0x01e9 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x01e9 }
            r9 = 5290(0x14aa, float:7.413E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x01e9 }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x01e9 }
            m11815as(r4, r8, r9, r10)     // Catch:{ all -> 0x01e9 }
            r8 = r10[r0]     // Catch:{ all -> 0x01e9 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01e9 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x01e9 }
            r10 = 1062(0x426, float:1.488E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x01e9 }
            r11 = 3127(0xc37, float:4.382E-42)
            byte r11 = r2[r11]     // Catch:{ all -> 0x01e9 }
            int r11 = r11 + r5
            byte r11 = (byte) r11     // Catch:{ all -> 0x01e9 }
            r12 = 4131(0x1023, float:5.789E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x01e9 }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x01e9 }
            m11815as(r10, r11, r12, r13)     // Catch:{ all -> 0x01e9 }
            r10 = r13[r0]     // Catch:{ all -> 0x01e9 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01e9 }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x01e9 }
            byte r2 = r2[r7]     // Catch:{ all -> 0x01e9 }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x01e9 }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x01e9 }
            m11815as(r4, r2, r9, r12)     // Catch:{ all -> 0x01e9 }
            r2 = r12[r0]     // Catch:{ all -> 0x01e9 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01e9 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x01e9 }
            r11[r0] = r2     // Catch:{ all -> 0x01e9 }
            java.lang.reflect.Method r2 = r8.getMethod(r10, r11)     // Catch:{ all -> 0x01e9 }
            java.lang.Object r2 = r2.invoke(r3, r6)     // Catch:{ all -> 0x01e9 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x01e9 }
            int r3 = r2.length
            int[] r3 = new int[r3]
            r6 = r0
        L_0x0086:
            int r8 = r2.length
            if (r6 >= r8) goto L_0x0133
            r8 = r2[r6]
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            r10[r0] = r8     // Catch:{ all -> 0x012a }
            r8 = 1050(0x41a, float:1.471E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012a }
            byte[] r11 = f9518c     // Catch:{ all -> 0x012a }
            byte r12 = r11[r7]     // Catch:{ all -> 0x012a }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x012a }
            int r13 = f9519d     // Catch:{ all -> 0x012a }
            r14 = r13 | 6720(0x1a40, float:9.417E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x012a }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            m11815as(r8, r12, r14, r15)     // Catch:{ all -> 0x012a }
            r12 = r15[r0]     // Catch:{ all -> 0x012a }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x012a }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x012a }
            r14 = 1060(0x424, float:1.485E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x012a }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x012a }
            r7 = 1465(0x5b9, float:2.053E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x012a }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            m11815as(r14, r15, r7, r0)     // Catch:{ all -> 0x012a }
            r7 = 0
            r0 = r0[r7]     // Catch:{ all -> 0x012a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x012a }
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x012a }
            r14 = 2385(0x951, float:3.342E-42)
            byte r15 = r11[r14]     // Catch:{ all -> 0x012a }
            int r14 = -r15
            byte r14 = (byte) r14     // Catch:{ all -> 0x012a }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            m11815as(r4, r14, r9, r15)     // Catch:{ all -> 0x012a }
            r14 = 0
            r15 = r15[r14]     // Catch:{ all -> 0x012a }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x012a }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x012a }
            r7[r14] = r15     // Catch:{ all -> 0x012a }
            java.lang.reflect.Method r0 = r12.getMethod(r0, r7)     // Catch:{ all -> 0x012a }
            r7 = 0
            java.lang.Object r0 = r0.invoke(r7, r10)     // Catch:{ all -> 0x012a }
            r10 = 2385(0x951, float:3.342E-42)
            byte r12 = r11[r10]     // Catch:{ all -> 0x0121 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x0121 }
            r13 = r13 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0121 }
            m11815as(r8, r12, r13, r14)     // Catch:{ all -> 0x0121 }
            r8 = 0
            r12 = r14[r8]     // Catch:{ all -> 0x0121 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0121 }
            java.lang.Class r8 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0121 }
            r12 = 1059(0x423, float:1.484E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0121 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r11 = r11[r13]     // Catch:{ all -> 0x0121 }
            int r11 = r11 + r5
            byte r11 = (byte) r11     // Catch:{ all -> 0x0121 }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0121 }
            m11815as(r12, r11, r13, r14)     // Catch:{ all -> 0x0121 }
            r11 = 0
            r12 = r14[r11]     // Catch:{ all -> 0x0121 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0121 }
            java.lang.reflect.Method r8 = r8.getMethod(r12, r7)     // Catch:{ all -> 0x0121 }
            java.lang.Object r0 = r8.invoke(r0, r7)     // Catch:{ all -> 0x0121 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0121 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0121 }
            r3[r6] = r0
            int r6 = r6 + 1
            r7 = r10
            r0 = r11
            goto L_0x0086
        L_0x0121:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0129
            throw r1
        L_0x0129:
            throw r0
        L_0x012a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0132
            throw r1
        L_0x0132:
            throw r0
        L_0x0133:
            r11 = r0
        L_0x0134:
            int r2 = r0 + 1
            r4 = 29
            r0 = r3[r0]     // Catch:{ all -> 0x01d8 }
            int r0 = r1.mo9125d(r0)     // Catch:{ all -> 0x01d8 }
            r6 = 8
            r7 = 16
            r8 = 12
            r9 = 24
            switch(r0) {
                case -18: goto L_0x01d1;
                case -17: goto L_0x01c1;
                case -16: goto L_0x01be;
                case -15: goto L_0x01ba;
                case -14: goto L_0x01af;
                case -13: goto L_0x019c;
                case -12: goto L_0x0194;
                case -11: goto L_0x0191;
                case -10: goto L_0x018e;
                case -9: goto L_0x0184;
                case -8: goto L_0x0175;
                case -7: goto L_0x0170;
                case -6: goto L_0x0168;
                case -5: goto L_0x0166;
                case -4: goto L_0x0163;
                case -3: goto L_0x0158;
                case -2: goto L_0x014d;
                case -1: goto L_0x014b;
                default: goto L_0x0149;
            }     // Catch:{ all -> 0x01d8 }
        L_0x0149:
            goto L_0x01d5
        L_0x014b:
            r0 = 7
            goto L_0x0134
        L_0x014d:
            int r0 = m11807ak()     // Catch:{ all -> 0x01d8 }
            r1.f10018b = r0     // Catch:{ all -> 0x01d8 }
        L_0x0153:
            r1.mo9125d(r5)     // Catch:{ all -> 0x01d8 }
            goto L_0x01d5
        L_0x0158:
            com.facetec.sdk.ch[] r0 = com.facetec.sdk.C2895ch.values()     // Catch:{ all -> 0x01d8 }
            r1.f10022f = r0     // Catch:{ all -> 0x01d8 }
            r1.mo9125d(r9)     // Catch:{ all -> 0x01d8 }
            goto L_0x01d5
        L_0x0163:
            r0 = 13
            goto L_0x0134
        L_0x0166:
            r0 = r4
            goto L_0x0134
        L_0x0168:
            r1.mo9125d(r7)     // Catch:{ all -> 0x01d8 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01d8 }
            com.facetec.sdk.ch r0 = (com.facetec.sdk.C2895ch) r0     // Catch:{ all -> 0x01d8 }
            return r0
        L_0x0170:
            int r0 = f9527n     // Catch:{ all -> 0x01d8 }
            r1.f10018b = r0     // Catch:{ all -> 0x01d8 }
            goto L_0x0153
        L_0x0175:
            r1.f10018b = r5     // Catch:{ all -> 0x01d8 }
            r1.mo9125d(r6)     // Catch:{ all -> 0x01d8 }
            r0 = 9
            r1.mo9125d(r0)     // Catch:{ all -> 0x01d8 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01d8 }
            f9526m = r0     // Catch:{ all -> 0x01d8 }
            goto L_0x01d5
        L_0x0184:
            r1.mo9125d(r8)     // Catch:{ all -> 0x01d8 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01d8 }
            if (r0 != 0) goto L_0x01d5
            r0 = 22
            goto L_0x0134
        L_0x018e:
            r0 = 44
            goto L_0x0134
        L_0x0191:
            r0 = 42
            goto L_0x0134
        L_0x0194:
            r1.mo9125d(r7)     // Catch:{ all -> 0x01d8 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01d8 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01d8 }
            throw r0     // Catch:{ all -> 0x01d8 }
        L_0x019c:
            r1.f10018b = r5     // Catch:{ all -> 0x01d8 }
            r1.mo9125d(r6)     // Catch:{ all -> 0x01d8 }
            r0 = 27
            r1.mo9125d(r0)     // Catch:{ all -> 0x01d8 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01d8 }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x01d8 }
            r1.f10018b = r0     // Catch:{ all -> 0x01d8 }
            goto L_0x0153
        L_0x01af:
            r1.mo9125d(r8)     // Catch:{ all -> 0x01d8 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01d8 }
            if (r0 != 0) goto L_0x01d5
            r0 = 39
            goto L_0x0134
        L_0x01ba:
            r0 = 40
            goto L_0x0134
        L_0x01be:
            r0 = r5
            goto L_0x0134
        L_0x01c1:
            r0 = 20
            r1.mo9125d(r0)     // Catch:{ all -> 0x01d8 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01d8 }
            if (r0 == 0) goto L_0x01cd
            r0 = r9
            goto L_0x0134
        L_0x01cd:
            r0 = 11
            goto L_0x0134
        L_0x01d1:
            r0 = 41
            goto L_0x0134
        L_0x01d5:
            r0 = r2
            goto L_0x0134
        L_0x01d8:
            r0 = move-exception
            r6 = 25
            if (r2 < r6) goto L_0x01e8
            if (r2 > r4) goto L_0x01e8
            r1.f10022f = r0
            r0 = 23
            r1.mo9125d(r0)
            goto L_0x0134
        L_0x01e8:
            throw r0
        L_0x01e9:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01f1
            throw r1
        L_0x01f1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11846l():com.facetec.sdk.ch");
    }

    @JNI.C2746c(mo8795e = 779218783)
    /* renamed from: l */
    static native void m11847l(boolean z);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facetec.sdk.C2909cq m11848m() {
        /*
            com.facetec.sdk.do r1 = new com.facetec.sdk.do
            r1.<init>()
            r0 = 934(0x3a6, float:1.309E-42)
            short r0 = (short) r0
            byte[] r2 = f9518c
            r3 = 21
            byte r4 = r2[r3]
            byte r4 = (byte) r4
            r5 = r4 | 4596(0x11f4, float:6.44E-42)
            short r5 = (short) r5
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            m11815as(r0, r4, r5, r7)
            r0 = 0
            r4 = r7[r0]
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1066(0x42a, float:1.494E-42)
            short r5 = (short) r5
            r7 = 18
            byte r7 = r2[r7]
            byte r7 = (byte) r7
            r8 = r7 | 6193(0x1831, float:8.678E-42)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r6]
            m11815as(r5, r7, r8, r9)
            r5 = r9[r0]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x01d7 }
            r7[r0] = r5     // Catch:{ all -> 0x01d7 }
            r5 = 1051(0x41b, float:1.473E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x01d7 }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r2[r8]     // Catch:{ all -> 0x01d7 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x01d7 }
            r10 = 5290(0x14aa, float:7.413E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x01d7 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x01d7 }
            m11815as(r5, r9, r10, r11)     // Catch:{ all -> 0x01d7 }
            r9 = r11[r0]     // Catch:{ all -> 0x01d7 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01d7 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x01d7 }
            r11 = 1062(0x426, float:1.488E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x01d7 }
            r12 = 3127(0xc37, float:4.382E-42)
            byte r12 = r2[r12]     // Catch:{ all -> 0x01d7 }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x01d7 }
            r13 = 4131(0x1023, float:5.789E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x01d7 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x01d7 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x01d7 }
            r11 = r14[r0]     // Catch:{ all -> 0x01d7 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x01d7 }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x01d7 }
            byte r2 = r2[r8]     // Catch:{ all -> 0x01d7 }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x01d7 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x01d7 }
            m11815as(r5, r2, r10, r13)     // Catch:{ all -> 0x01d7 }
            r2 = r13[r0]     // Catch:{ all -> 0x01d7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01d7 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x01d7 }
            r12[r0] = r2     // Catch:{ all -> 0x01d7 }
            java.lang.reflect.Method r2 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x01d7 }
            java.lang.Object r2 = r2.invoke(r4, r7)     // Catch:{ all -> 0x01d7 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x01d7 }
            int r4 = r2.length
            int[] r4 = new int[r4]
            r7 = r0
        L_0x0086:
            int r9 = r2.length
            if (r7 >= r9) goto L_0x0134
            r9 = r2[r7]
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            r11[r0] = r9     // Catch:{ all -> 0x012b }
            r9 = 1050(0x41a, float:1.471E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x012b }
            byte[] r12 = f9518c     // Catch:{ all -> 0x012b }
            byte r13 = r12[r8]     // Catch:{ all -> 0x012b }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            int r14 = f9519d     // Catch:{ all -> 0x012b }
            r15 = r14 | 6720(0x1a40, float:9.417E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x012b }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11815as(r9, r13, r15, r3)     // Catch:{ all -> 0x012b }
            r3 = r3[r0]     // Catch:{ all -> 0x012b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x012b }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x012b }
            r13 = 1060(0x424, float:1.485E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x012b }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x012b }
            r8 = 1465(0x5b9, float:2.053E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012b }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11815as(r13, r15, r8, r0)     // Catch:{ all -> 0x012b }
            r8 = 0
            r0 = r0[r8]     // Catch:{ all -> 0x012b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x012b }
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ all -> 0x012b }
            r13 = 2385(0x951, float:3.342E-42)
            byte r15 = r12[r13]     // Catch:{ all -> 0x012b }
            int r13 = -r15
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11815as(r5, r13, r10, r15)     // Catch:{ all -> 0x012b }
            r13 = 0
            r15 = r15[r13]     // Catch:{ all -> 0x012b }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x012b }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x012b }
            r8[r13] = r15     // Catch:{ all -> 0x012b }
            java.lang.reflect.Method r0 = r3.getMethod(r0, r8)     // Catch:{ all -> 0x012b }
            r3 = 0
            java.lang.Object r0 = r0.invoke(r3, r11)     // Catch:{ all -> 0x012b }
            r8 = 2385(0x951, float:3.342E-42)
            byte r11 = r12[r8]     // Catch:{ all -> 0x0122 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0122 }
            r13 = r14 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0122 }
            m11815as(r9, r11, r13, r14)     // Catch:{ all -> 0x0122 }
            r9 = 0
            r11 = r14[r9]     // Catch:{ all -> 0x0122 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0122 }
            java.lang.Class r9 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0122 }
            r11 = 1059(0x423, float:1.484E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0122 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0122 }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x0122 }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0122 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x0122 }
            r11 = 0
            r12 = r14[r11]     // Catch:{ all -> 0x0122 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0122 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r3)     // Catch:{ all -> 0x0122 }
            java.lang.Object r0 = r9.invoke(r0, r3)     // Catch:{ all -> 0x0122 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0122 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0122 }
            r4[r7] = r0
            int r7 = r7 + 1
            r0 = r11
            r3 = 21
            goto L_0x0086
        L_0x0122:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x012a
            throw r1
        L_0x012a:
            throw r0
        L_0x012b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0133
            throw r1
        L_0x0133:
            throw r0
        L_0x0134:
            r11 = r0
        L_0x0135:
            int r2 = r0 + 1
            r3 = 37
            r0 = r4[r0]     // Catch:{ all -> 0x01c4 }
            int r0 = r1.mo9125d(r0)     // Catch:{ all -> 0x01c4 }
            r5 = 15
            r7 = 16
            r8 = 20
            switch(r0) {
                case -17: goto L_0x01be;
                case -16: goto L_0x01ae;
                case -15: goto L_0x01a6;
                case -14: goto L_0x01a3;
                case -13: goto L_0x01a0;
                case -12: goto L_0x0196;
                case -11: goto L_0x0194;
                case -10: goto L_0x0191;
                case -9: goto L_0x0188;
                case -8: goto L_0x0177;
                case -7: goto L_0x0172;
                case -6: goto L_0x016a;
                case -5: goto L_0x0167;
                case -4: goto L_0x0164;
                case -3: goto L_0x0157;
                case -2: goto L_0x014c;
                case -1: goto L_0x014a;
                default: goto L_0x0148;
            }     // Catch:{ all -> 0x01c4 }
        L_0x0148:
            goto L_0x01c1
        L_0x014a:
            r0 = 7
            goto L_0x0135
        L_0x014c:
            int r0 = m11810an()     // Catch:{ all -> 0x01c4 }
            r1.f10018b = r0     // Catch:{ all -> 0x01c4 }
        L_0x0152:
            r1.mo9125d(r6)     // Catch:{ all -> 0x01c4 }
            goto L_0x01c1
        L_0x0157:
            com.facetec.sdk.cq[] r0 = com.facetec.sdk.C2909cq.values()     // Catch:{ all -> 0x01c4 }
            r1.f10022f = r0     // Catch:{ all -> 0x01c4 }
            r0 = 24
            r1.mo9125d(r0)     // Catch:{ all -> 0x01c4 }
            goto L_0x01c1
        L_0x0164:
            r0 = 22
            goto L_0x0135
        L_0x0167:
            r0 = 12
            goto L_0x0135
        L_0x016a:
            r1.mo9125d(r7)     // Catch:{ all -> 0x01c4 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01c4 }
            com.facetec.sdk.cq r0 = (com.facetec.sdk.C2909cq) r0     // Catch:{ all -> 0x01c4 }
            return r0
        L_0x0172:
            int r0 = f9526m     // Catch:{ all -> 0x01c4 }
            r1.f10018b = r0     // Catch:{ all -> 0x01c4 }
            goto L_0x0152
        L_0x0177:
            r1.f10018b = r6     // Catch:{ all -> 0x01c4 }
            r0 = 8
            r1.mo9125d(r0)     // Catch:{ all -> 0x01c4 }
            r0 = 9
            r1.mo9125d(r0)     // Catch:{ all -> 0x01c4 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01c4 }
            f9527n = r0     // Catch:{ all -> 0x01c4 }
            goto L_0x01c1
        L_0x0188:
            r1.mo9125d(r5)     // Catch:{ all -> 0x01c4 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01c4 }
            if (r0 != 0) goto L_0x01c1
            r0 = r8
            goto L_0x0135
        L_0x0191:
            r0 = 21
            goto L_0x0135
        L_0x0194:
            r0 = r6
            goto L_0x0135
        L_0x0196:
            r1.mo9125d(r5)     // Catch:{ all -> 0x01c4 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01c4 }
            if (r0 != 0) goto L_0x01c1
            r0 = 30
            goto L_0x0135
        L_0x01a0:
            r0 = 40
            goto L_0x0135
        L_0x01a3:
            r0 = 38
            goto L_0x0135
        L_0x01a6:
            r1.mo9125d(r7)     // Catch:{ all -> 0x01c4 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01c4 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01c4 }
            throw r0     // Catch:{ all -> 0x01c4 }
        L_0x01ae:
            r1.mo9125d(r8)     // Catch:{ all -> 0x01c4 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01c4 }
            r2 = 32
            if (r0 == 0) goto L_0x01c1
            if (r0 == r6) goto L_0x01ba
            goto L_0x01c1
        L_0x01ba:
            r0 = 10
            goto L_0x0135
        L_0x01be:
            r0 = r3
            goto L_0x0135
        L_0x01c1:
            r0 = r2
            goto L_0x0135
        L_0x01c4:
            r0 = move-exception
            r5 = 33
            if (r2 < r5) goto L_0x01d6
            if (r2 > r3) goto L_0x01d6
            r1.f10022f = r0
            r0 = 23
            r1.mo9125d(r0)
            r0 = 31
            goto L_0x0135
        L_0x01d6:
            throw r0
        L_0x01d7:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01df
            throw r1
        L_0x01df:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11848m():com.facetec.sdk.cq");
    }

    @JNI.C2746c(mo8795e = 444410178)
    /* renamed from: m */
    static native void m11849m(boolean z, boolean z2);

    @JNI.C2746c(mo8795e = 313884573)
    /* renamed from: n */
    static native boolean m11850n();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facetec.sdk.C2897cj m11851o() {
        /*
            com.facetec.sdk.do r0 = new com.facetec.sdk.do
            r0.<init>()
            r1 = 961(0x3c1, float:1.347E-42)
            short r1 = (short) r1
            byte[] r2 = f9518c
            r3 = 21
            byte r4 = r2[r3]
            byte r4 = (byte) r4
            r5 = r4 | 1802(0x70a, float:2.525E-42)
            short r5 = (short) r5
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            m11815as(r1, r4, r5, r7)
            r1 = 0
            r4 = r7[r1]
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1066(0x42a, float:1.494E-42)
            short r5 = (short) r5
            r7 = 18
            byte r7 = r2[r7]
            byte r7 = (byte) r7
            r8 = r7 | 6193(0x1831, float:8.678E-42)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r6]
            m11815as(r5, r7, r8, r9)
            r5 = r9[r1]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x01b2 }
            r7[r1] = r5     // Catch:{ all -> 0x01b2 }
            r5 = 1051(0x41b, float:1.473E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x01b2 }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r2[r8]     // Catch:{ all -> 0x01b2 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x01b2 }
            r10 = 5290(0x14aa, float:7.413E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x01b2 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x01b2 }
            m11815as(r5, r9, r10, r11)     // Catch:{ all -> 0x01b2 }
            r9 = r11[r1]     // Catch:{ all -> 0x01b2 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01b2 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x01b2 }
            r11 = 1062(0x426, float:1.488E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x01b2 }
            r12 = 3127(0xc37, float:4.382E-42)
            byte r12 = r2[r12]     // Catch:{ all -> 0x01b2 }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x01b2 }
            r13 = 4131(0x1023, float:5.789E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x01b2 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x01b2 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x01b2 }
            r11 = r14[r1]     // Catch:{ all -> 0x01b2 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x01b2 }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x01b2 }
            byte r2 = r2[r8]     // Catch:{ all -> 0x01b2 }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x01b2 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x01b2 }
            m11815as(r5, r2, r10, r13)     // Catch:{ all -> 0x01b2 }
            r2 = r13[r1]     // Catch:{ all -> 0x01b2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01b2 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x01b2 }
            r12[r1] = r2     // Catch:{ all -> 0x01b2 }
            java.lang.reflect.Method r2 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x01b2 }
            java.lang.Object r2 = r2.invoke(r4, r7)     // Catch:{ all -> 0x01b2 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x01b2 }
            int r4 = r2.length
            int[] r4 = new int[r4]
            r7 = r1
        L_0x0086:
            int r9 = r2.length
            if (r7 >= r9) goto L_0x0134
            r9 = r2[r7]
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            r11[r1] = r9     // Catch:{ all -> 0x012b }
            r9 = 1050(0x41a, float:1.471E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x012b }
            byte[] r12 = f9518c     // Catch:{ all -> 0x012b }
            byte r13 = r12[r8]     // Catch:{ all -> 0x012b }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            int r14 = f9519d     // Catch:{ all -> 0x012b }
            r15 = r14 | 6720(0x1a40, float:9.417E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x012b }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11815as(r9, r13, r15, r3)     // Catch:{ all -> 0x012b }
            r3 = r3[r1]     // Catch:{ all -> 0x012b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x012b }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x012b }
            r13 = 1060(0x424, float:1.485E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x012b }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x012b }
            r8 = 1465(0x5b9, float:2.053E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012b }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11815as(r13, r15, r8, r1)     // Catch:{ all -> 0x012b }
            r8 = 0
            r1 = r1[r8]     // Catch:{ all -> 0x012b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x012b }
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ all -> 0x012b }
            r13 = 2385(0x951, float:3.342E-42)
            byte r15 = r12[r13]     // Catch:{ all -> 0x012b }
            int r13 = -r15
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11815as(r5, r13, r10, r15)     // Catch:{ all -> 0x012b }
            r13 = 0
            r15 = r15[r13]     // Catch:{ all -> 0x012b }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x012b }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x012b }
            r8[r13] = r15     // Catch:{ all -> 0x012b }
            java.lang.reflect.Method r1 = r3.getMethod(r1, r8)     // Catch:{ all -> 0x012b }
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r11)     // Catch:{ all -> 0x012b }
            r8 = 2385(0x951, float:3.342E-42)
            byte r11 = r12[r8]     // Catch:{ all -> 0x0122 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0122 }
            r13 = r14 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0122 }
            m11815as(r9, r11, r13, r14)     // Catch:{ all -> 0x0122 }
            r9 = 0
            r11 = r14[r9]     // Catch:{ all -> 0x0122 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0122 }
            java.lang.Class r9 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0122 }
            r11 = 1059(0x423, float:1.484E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0122 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0122 }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x0122 }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0122 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x0122 }
            r11 = 0
            r12 = r14[r11]     // Catch:{ all -> 0x0122 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0122 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r3)     // Catch:{ all -> 0x0122 }
            java.lang.Object r1 = r9.invoke(r1, r3)     // Catch:{ all -> 0x0122 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0122 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0122 }
            r4[r7] = r1
            int r7 = r7 + 1
            r1 = r11
            r3 = 21
            goto L_0x0086
        L_0x0122:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x012a
            throw r1
        L_0x012a:
            throw r0
        L_0x012b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0133
            throw r1
        L_0x0133:
            throw r0
        L_0x0134:
            r11 = r1
        L_0x0135:
            int r2 = r1 + 1
            r1 = r4[r1]
            int r1 = r0.mo9125d(r1)
            r3 = 9
            r5 = 8
            r7 = 12
            switch(r1) {
                case -16: goto L_0x01ae;
                case -15: goto L_0x01ab;
                case -14: goto L_0x01a1;
                case -13: goto L_0x0194;
                case -12: goto L_0x018c;
                case -11: goto L_0x0189;
                case -10: goto L_0x0186;
                case -9: goto L_0x017a;
                case -8: goto L_0x016d;
                case -7: goto L_0x016a;
                case -6: goto L_0x0160;
                case -5: goto L_0x015d;
                case -4: goto L_0x015b;
                case -3: goto L_0x014f;
                case -2: goto L_0x014a;
                case -1: goto L_0x0148;
                default: goto L_0x0146;
            }
        L_0x0146:
            goto L_0x01b0
        L_0x0148:
            r1 = 7
            goto L_0x0135
        L_0x014a:
            int r1 = m11809am()
            goto L_0x018e
        L_0x014f:
            com.facetec.sdk.cj[] r1 = com.facetec.sdk.C2897cj.values()
            r0.f10022f = r1
            r1 = 24
            r0.mo9125d(r1)
            goto L_0x01b0
        L_0x015b:
            r1 = r7
            goto L_0x0135
        L_0x015d:
            r1 = 22
            goto L_0x0135
        L_0x0160:
            r1 = 16
            r0.mo9125d(r1)
            java.lang.Object r0 = r0.f10026j
            com.facetec.sdk.cj r0 = (com.facetec.sdk.C2897cj) r0
            return r0
        L_0x016a:
            int r1 = f9526m
            goto L_0x018e
        L_0x016d:
            r0.f10018b = r6
            r0.mo9125d(r5)
            r0.mo9125d(r3)
            int r1 = r0.f10020d
            f9527n = r1
            goto L_0x01b0
        L_0x017a:
            r1 = 15
            r0.mo9125d(r1)
            int r1 = r0.f10020d
            if (r1 != 0) goto L_0x01b0
            r1 = 20
            goto L_0x0135
        L_0x0186:
            r1 = 21
            goto L_0x0135
        L_0x0189:
            r1 = 10
            goto L_0x0135
        L_0x018c:
            int r1 = f9527n
        L_0x018e:
            r0.f10018b = r1
            r0.mo9125d(r6)
            goto L_0x01b0
        L_0x0194:
            r0.f10018b = r6
            r0.mo9125d(r5)
            r0.mo9125d(r3)
            int r1 = r0.f10020d
            f9526m = r1
            goto L_0x01b0
        L_0x01a1:
            r0.mo9125d(r7)
            int r1 = r0.f10020d
            if (r1 != 0) goto L_0x01b0
            r1 = 31
            goto L_0x0135
        L_0x01ab:
            r1 = 32
            goto L_0x0135
        L_0x01ae:
            r1 = r6
            goto L_0x0135
        L_0x01b0:
            r1 = r2
            goto L_0x0135
        L_0x01b2:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01ba
            throw r1
        L_0x01ba:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11851o():com.facetec.sdk.cj");
    }

    @JNI.C2746c(mo8795e = 936399077)
    /* renamed from: o */
    static native void m11852o(byte[] bArr, boolean z, int i, int i2, int i3);

    @JNI.C2746c(mo8795e = 250327475)
    /* renamed from: p */
    static native byte[][] m11853p();

    @JNI.C2746c(mo8795e = 975342367)
    /* renamed from: q */
    static native byte[][] m11854q();

    @JNI.C2746c(mo8795e = 853861522)
    /* renamed from: r */
    static native byte[] m11855r();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facetec.sdk.C2887cf m11856s() {
        /*
            com.facetec.sdk.do r1 = new com.facetec.sdk.do
            r1.<init>()
            r0 = 954(0x3ba, float:1.337E-42)
            short r0 = (short) r0
            byte[] r2 = f9518c
            r3 = 21
            byte r4 = r2[r3]
            byte r4 = (byte) r4
            r5 = 18
            byte r6 = r2[r5]
            short r6 = (short) r6
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            m11815as(r0, r4, r6, r8)
            r0 = 0
            r4 = r8[r0]
            java.lang.String r4 = (java.lang.String) r4
            r6 = 1066(0x42a, float:1.494E-42)
            short r6 = (short) r6
            byte r5 = r2[r5]
            byte r5 = (byte) r5
            r8 = r5 | 6193(0x1831, float:8.678E-42)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r7]
            m11815as(r6, r5, r8, r9)
            r5 = r9[r0]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ all -> 0x01e0 }
            r6[r0] = r5     // Catch:{ all -> 0x01e0 }
            r5 = 1051(0x41b, float:1.473E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x01e0 }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r2[r8]     // Catch:{ all -> 0x01e0 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x01e0 }
            r10 = 5290(0x14aa, float:7.413E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x01e0 }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x01e0 }
            m11815as(r5, r9, r10, r11)     // Catch:{ all -> 0x01e0 }
            r9 = r11[r0]     // Catch:{ all -> 0x01e0 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01e0 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x01e0 }
            r11 = 1062(0x426, float:1.488E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x01e0 }
            r12 = 3127(0xc37, float:4.382E-42)
            byte r12 = r2[r12]     // Catch:{ all -> 0x01e0 }
            int r12 = r12 + r7
            byte r12 = (byte) r12     // Catch:{ all -> 0x01e0 }
            r13 = 4131(0x1023, float:5.789E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x01e0 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x01e0 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x01e0 }
            r11 = r14[r0]     // Catch:{ all -> 0x01e0 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x01e0 }
            java.lang.Class[] r12 = new java.lang.Class[r7]     // Catch:{ all -> 0x01e0 }
            byte r2 = r2[r8]     // Catch:{ all -> 0x01e0 }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x01e0 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x01e0 }
            m11815as(r5, r2, r10, r13)     // Catch:{ all -> 0x01e0 }
            r2 = r13[r0]     // Catch:{ all -> 0x01e0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01e0 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x01e0 }
            r12[r0] = r2     // Catch:{ all -> 0x01e0 }
            java.lang.reflect.Method r2 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x01e0 }
            java.lang.Object r2 = r2.invoke(r4, r6)     // Catch:{ all -> 0x01e0 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x01e0 }
            int r4 = r2.length
            int[] r4 = new int[r4]
            r6 = r0
        L_0x0086:
            int r9 = r2.length
            if (r6 >= r9) goto L_0x0134
            r9 = r2[r6]
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x012b }
            r11[r0] = r9     // Catch:{ all -> 0x012b }
            r9 = 1050(0x41a, float:1.471E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x012b }
            byte[] r12 = f9518c     // Catch:{ all -> 0x012b }
            byte r13 = r12[r8]     // Catch:{ all -> 0x012b }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            int r14 = f9519d     // Catch:{ all -> 0x012b }
            r15 = r14 | 6720(0x1a40, float:9.417E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x012b }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x012b }
            m11815as(r9, r13, r15, r3)     // Catch:{ all -> 0x012b }
            r3 = r3[r0]     // Catch:{ all -> 0x012b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x012b }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x012b }
            r13 = 1060(0x424, float:1.485E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x012b }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x012b }
            r8 = 1465(0x5b9, float:2.053E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012b }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ all -> 0x012b }
            m11815as(r13, r15, r8, r0)     // Catch:{ all -> 0x012b }
            r8 = 0
            r0 = r0[r8]     // Catch:{ all -> 0x012b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x012b }
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ all -> 0x012b }
            r13 = 2385(0x951, float:3.342E-42)
            byte r15 = r12[r13]     // Catch:{ all -> 0x012b }
            int r13 = -r15
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x012b }
            m11815as(r5, r13, r10, r15)     // Catch:{ all -> 0x012b }
            r13 = 0
            r15 = r15[r13]     // Catch:{ all -> 0x012b }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x012b }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x012b }
            r8[r13] = r15     // Catch:{ all -> 0x012b }
            java.lang.reflect.Method r0 = r3.getMethod(r0, r8)     // Catch:{ all -> 0x012b }
            r3 = 0
            java.lang.Object r0 = r0.invoke(r3, r11)     // Catch:{ all -> 0x012b }
            r8 = 2385(0x951, float:3.342E-42)
            byte r11 = r12[r8]     // Catch:{ all -> 0x0122 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0122 }
            r13 = r14 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0122 }
            m11815as(r9, r11, r13, r14)     // Catch:{ all -> 0x0122 }
            r9 = 0
            r11 = r14[r9]     // Catch:{ all -> 0x0122 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0122 }
            java.lang.Class r9 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0122 }
            r11 = 1059(0x423, float:1.484E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0122 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0122 }
            int r12 = r12 + r7
            byte r12 = (byte) r12     // Catch:{ all -> 0x0122 }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0122 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x0122 }
            r11 = 0
            r12 = r14[r11]     // Catch:{ all -> 0x0122 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0122 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r3)     // Catch:{ all -> 0x0122 }
            java.lang.Object r0 = r9.invoke(r0, r3)     // Catch:{ all -> 0x0122 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0122 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0122 }
            r4[r6] = r0
            int r6 = r6 + 1
            r0 = r11
            r3 = 21
            goto L_0x0086
        L_0x0122:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x012a
            throw r1
        L_0x012a:
            throw r0
        L_0x012b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0133
            throw r1
        L_0x0133:
            throw r0
        L_0x0134:
            r11 = r0
        L_0x0135:
            int r2 = r0 + 1
            r3 = 30
            r0 = r4[r0]     // Catch:{ all -> 0x01cd }
            int r0 = r1.mo9125d(r0)     // Catch:{ all -> 0x01cd }
            r5 = 8
            r6 = 16
            r8 = 20
            switch(r0) {
                case -15: goto L_0x01c7;
                case -14: goto L_0x01b2;
                case -13: goto L_0x019f;
                case -12: goto L_0x0197;
                case -11: goto L_0x0194;
                case -10: goto L_0x0191;
                case -9: goto L_0x0186;
                case -8: goto L_0x0177;
                case -7: goto L_0x0172;
                case -6: goto L_0x016a;
                case -5: goto L_0x0167;
                case -4: goto L_0x0164;
                case -3: goto L_0x0157;
                case -2: goto L_0x014c;
                case -1: goto L_0x014a;
                default: goto L_0x0148;
            }     // Catch:{ all -> 0x01cd }
        L_0x0148:
            goto L_0x01ca
        L_0x014a:
            r0 = 6
            goto L_0x0135
        L_0x014c:
            int r0 = m11806aj()     // Catch:{ all -> 0x01cd }
            r1.f10018b = r0     // Catch:{ all -> 0x01cd }
        L_0x0152:
            r1.mo9125d(r7)     // Catch:{ all -> 0x01cd }
            goto L_0x01ca
        L_0x0157:
            com.facetec.sdk.cf[] r0 = com.facetec.sdk.C2887cf.values()     // Catch:{ all -> 0x01cd }
            r1.f10022f = r0     // Catch:{ all -> 0x01cd }
            r0 = 24
            r1.mo9125d(r0)     // Catch:{ all -> 0x01cd }
            goto L_0x01ca
        L_0x0164:
            r0 = 10
            goto L_0x0135
        L_0x0167:
            r0 = 12
            goto L_0x0135
        L_0x016a:
            r1.mo9125d(r6)     // Catch:{ all -> 0x01cd }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01cd }
            com.facetec.sdk.cf r0 = (com.facetec.sdk.C2887cf) r0     // Catch:{ all -> 0x01cd }
            return r0
        L_0x0172:
            int r0 = f9526m     // Catch:{ all -> 0x01cd }
            r1.f10018b = r0     // Catch:{ all -> 0x01cd }
            goto L_0x0152
        L_0x0177:
            r1.f10018b = r7     // Catch:{ all -> 0x01cd }
            r1.mo9125d(r5)     // Catch:{ all -> 0x01cd }
            r0 = 9
            r1.mo9125d(r0)     // Catch:{ all -> 0x01cd }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01cd }
            f9527n = r0     // Catch:{ all -> 0x01cd }
            goto L_0x01ca
        L_0x0186:
            r0 = 15
            r1.mo9125d(r0)     // Catch:{ all -> 0x01cd }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01cd }
            if (r0 != 0) goto L_0x01ca
            r0 = r8
            goto L_0x0135
        L_0x0191:
            r0 = 33
            goto L_0x0135
        L_0x0194:
            r0 = 31
            goto L_0x0135
        L_0x0197:
            r1.mo9125d(r6)     // Catch:{ all -> 0x01cd }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01cd }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01cd }
            throw r0     // Catch:{ all -> 0x01cd }
        L_0x019f:
            r1.f10018b = r7     // Catch:{ all -> 0x01cd }
            r1.mo9125d(r5)     // Catch:{ all -> 0x01cd }
            r0 = 27
            r1.mo9125d(r0)     // Catch:{ all -> 0x01cd }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01cd }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x01cd }
            r1.f10018b = r0     // Catch:{ all -> 0x01cd }
            goto L_0x0152
        L_0x01b2:
            r1.mo9125d(r8)     // Catch:{ all -> 0x01cd }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01cd }
            r2 = 60
            if (r0 == r2) goto L_0x01c4
            r2 = 85
            if (r0 == r2) goto L_0x01c0
            goto L_0x01c4
        L_0x01c0:
            r0 = 22
            goto L_0x0135
        L_0x01c4:
            r0 = r7
            goto L_0x0135
        L_0x01c7:
            r0 = r3
            goto L_0x0135
        L_0x01ca:
            r0 = r2
            goto L_0x0135
        L_0x01cd:
            r0 = move-exception
            r5 = 26
            if (r2 < r5) goto L_0x01df
            if (r2 > r3) goto L_0x01df
            r1.f10022f = r0
            r0 = 23
            r1.mo9125d(r0)
            r0 = 21
            goto L_0x0135
        L_0x01df:
            throw r0
        L_0x01e0:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01e8
            throw r1
        L_0x01e8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11856s():com.facetec.sdk.cf");
    }

    @JNI.C2746c(mo8795e = 108889513)
    /* renamed from: s */
    static native byte[] m11857s(String str, String str2, boolean z, boolean z2);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facetec.sdk.C2865by m11858t() {
        /*
            com.facetec.sdk.do r0 = new com.facetec.sdk.do
            r0.<init>()
            r1 = 961(0x3c1, float:1.347E-42)
            short r1 = (short) r1
            byte[] r2 = f9518c
            r3 = 21
            byte r3 = r2[r3]
            byte r3 = (byte) r3
            r4 = r3 | 4284(0x10bc, float:6.003E-42)
            short r4 = (short) r4
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            m11815as(r1, r3, r4, r6)
            r1 = 0
            r3 = r6[r1]
            java.lang.String r3 = (java.lang.String) r3
            r4 = 1066(0x42a, float:1.494E-42)
            short r4 = (short) r4
            r6 = 18
            byte r6 = r2[r6]
            byte r6 = (byte) r6
            r7 = r6 | 6193(0x1831, float:8.678E-42)
            short r7 = (short) r7
            java.lang.Object[] r8 = new java.lang.Object[r5]
            m11815as(r4, r6, r7, r8)
            r4 = r8[r1]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x019e }
            r6[r1] = r4     // Catch:{ all -> 0x019e }
            r4 = 1051(0x41b, float:1.473E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x019e }
            r7 = 2385(0x951, float:3.342E-42)
            byte r8 = r2[r7]     // Catch:{ all -> 0x019e }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x019e }
            r9 = 5290(0x14aa, float:7.413E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x019e }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x019e }
            m11815as(r4, r8, r9, r10)     // Catch:{ all -> 0x019e }
            r8 = r10[r1]     // Catch:{ all -> 0x019e }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x019e }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x019e }
            r10 = 1062(0x426, float:1.488E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x019e }
            r11 = 3127(0xc37, float:4.382E-42)
            byte r11 = r2[r11]     // Catch:{ all -> 0x019e }
            int r11 = r11 + r5
            byte r11 = (byte) r11     // Catch:{ all -> 0x019e }
            r12 = 4131(0x1023, float:5.789E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x019e }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x019e }
            m11815as(r10, r11, r12, r13)     // Catch:{ all -> 0x019e }
            r10 = r13[r1]     // Catch:{ all -> 0x019e }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x019e }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ all -> 0x019e }
            byte r2 = r2[r7]     // Catch:{ all -> 0x019e }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x019e }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x019e }
            m11815as(r4, r2, r9, r12)     // Catch:{ all -> 0x019e }
            r2 = r12[r1]     // Catch:{ all -> 0x019e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x019e }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x019e }
            r11[r1] = r2     // Catch:{ all -> 0x019e }
            java.lang.reflect.Method r2 = r8.getMethod(r10, r11)     // Catch:{ all -> 0x019e }
            java.lang.Object r2 = r2.invoke(r3, r6)     // Catch:{ all -> 0x019e }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x019e }
            int r3 = r2.length
            int[] r3 = new int[r3]
            r6 = r1
        L_0x0086:
            int r8 = r2.length
            if (r6 >= r8) goto L_0x0133
            r8 = r2[r6]
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            r10[r1] = r8     // Catch:{ all -> 0x012a }
            r8 = 1050(0x41a, float:1.471E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012a }
            byte[] r11 = f9518c     // Catch:{ all -> 0x012a }
            byte r12 = r11[r7]     // Catch:{ all -> 0x012a }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x012a }
            int r13 = f9519d     // Catch:{ all -> 0x012a }
            r14 = r13 | 6720(0x1a40, float:9.417E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x012a }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            m11815as(r8, r12, r14, r15)     // Catch:{ all -> 0x012a }
            r12 = r15[r1]     // Catch:{ all -> 0x012a }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x012a }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x012a }
            r14 = 1060(0x424, float:1.485E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x012a }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x012a }
            r7 = 1465(0x5b9, float:2.053E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x012a }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            m11815as(r14, r15, r7, r1)     // Catch:{ all -> 0x012a }
            r7 = 0
            r1 = r1[r7]     // Catch:{ all -> 0x012a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x012a }
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x012a }
            r14 = 2385(0x951, float:3.342E-42)
            byte r15 = r11[r14]     // Catch:{ all -> 0x012a }
            int r14 = -r15
            byte r14 = (byte) r14     // Catch:{ all -> 0x012a }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x012a }
            m11815as(r4, r14, r9, r15)     // Catch:{ all -> 0x012a }
            r14 = 0
            r15 = r15[r14]     // Catch:{ all -> 0x012a }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x012a }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x012a }
            r7[r14] = r15     // Catch:{ all -> 0x012a }
            java.lang.reflect.Method r1 = r12.getMethod(r1, r7)     // Catch:{ all -> 0x012a }
            r7 = 0
            java.lang.Object r1 = r1.invoke(r7, r10)     // Catch:{ all -> 0x012a }
            r10 = 2385(0x951, float:3.342E-42)
            byte r12 = r11[r10]     // Catch:{ all -> 0x0121 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x0121 }
            r13 = r13 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0121 }
            m11815as(r8, r12, r13, r14)     // Catch:{ all -> 0x0121 }
            r8 = 0
            r12 = r14[r8]     // Catch:{ all -> 0x0121 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0121 }
            java.lang.Class r8 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0121 }
            r12 = 1059(0x423, float:1.484E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0121 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r11 = r11[r13]     // Catch:{ all -> 0x0121 }
            int r11 = r11 + r5
            byte r11 = (byte) r11     // Catch:{ all -> 0x0121 }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0121 }
            m11815as(r12, r11, r13, r14)     // Catch:{ all -> 0x0121 }
            r11 = 0
            r12 = r14[r11]     // Catch:{ all -> 0x0121 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0121 }
            java.lang.reflect.Method r8 = r8.getMethod(r12, r7)     // Catch:{ all -> 0x0121 }
            java.lang.Object r1 = r8.invoke(r1, r7)     // Catch:{ all -> 0x0121 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0121 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0121 }
            r3[r6] = r1
            int r6 = r6 + 1
            r7 = r10
            r1 = r11
            goto L_0x0086
        L_0x0121:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0129
            throw r1
        L_0x0129:
            throw r0
        L_0x012a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0132
            throw r1
        L_0x0132:
            throw r0
        L_0x0133:
            r11 = r1
        L_0x0134:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r1 = r0.mo9125d(r1)
            r4 = 24
            r6 = 15
            switch(r1) {
                case -14: goto L_0x0199;
                case -13: goto L_0x0196;
                case -12: goto L_0x018c;
                case -11: goto L_0x018a;
                case -10: goto L_0x0187;
                case -9: goto L_0x017d;
                case -8: goto L_0x016c;
                case -7: goto L_0x0164;
                case -6: goto L_0x015a;
                case -5: goto L_0x0157;
                case -4: goto L_0x0155;
                case -3: goto L_0x014b;
                case -2: goto L_0x0146;
                case -1: goto L_0x0144;
                default: goto L_0x0143;
            }
        L_0x0143:
            goto L_0x019c
        L_0x0144:
            r1 = 7
            goto L_0x0134
        L_0x0146:
            int r1 = m11808al()
            goto L_0x0166
        L_0x014b:
            com.facetec.sdk.by[] r1 = com.facetec.sdk.C2865by.values()
            r0.f10022f = r1
            r0.mo9125d(r4)
            goto L_0x019c
        L_0x0155:
            r1 = r4
            goto L_0x0134
        L_0x0157:
            r1 = 14
            goto L_0x0134
        L_0x015a:
            r1 = 16
            r0.mo9125d(r1)
            java.lang.Object r0 = r0.f10026j
            com.facetec.sdk.by r0 = (com.facetec.sdk.C2865by) r0
            return r0
        L_0x0164:
            int r1 = f9526m
        L_0x0166:
            r0.f10018b = r1
            r0.mo9125d(r5)
            goto L_0x019c
        L_0x016c:
            r0.f10018b = r5
            r1 = 8
            r0.mo9125d(r1)
            r1 = 9
            r0.mo9125d(r1)
            int r1 = r0.f10020d
            f9527n = r1
            goto L_0x019c
        L_0x017d:
            r0.mo9125d(r6)
            int r1 = r0.f10020d
            if (r1 != 0) goto L_0x019c
            r1 = 22
            goto L_0x0134
        L_0x0187:
            r1 = 23
            goto L_0x0134
        L_0x018a:
            r1 = r5
            goto L_0x0134
        L_0x018c:
            r0.mo9125d(r6)
            int r1 = r0.f10020d
            if (r1 != 0) goto L_0x019c
            r1 = 31
            goto L_0x0134
        L_0x0196:
            r1 = 32
            goto L_0x0134
        L_0x0199:
            r1 = 12
            goto L_0x0134
        L_0x019c:
            r1 = r2
            goto L_0x0134
        L_0x019e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01a6
            throw r1
        L_0x01a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11858t():com.facetec.sdk.by");
    }

    @JNI.C2746c(mo8795e = 634933143)
    /* renamed from: t */
    static native byte[] m11859t(String str, String str2, String str3);

    @JNI.C2746c(mo8795e = 340304317)
    /* renamed from: u */
    static native byte[][] m11860u();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facetec.sdk.C2886ce m11861v() {
        /*
            com.facetec.sdk.do r1 = new com.facetec.sdk.do
            r1.<init>()
            r0 = 958(0x3be, float:1.342E-42)
            short r0 = (short) r0
            byte[] r2 = f9518c
            r3 = 21
            byte r4 = r2[r3]
            byte r4 = (byte) r4
            r5 = 4460(0x116c, float:6.25E-42)
            short r5 = (short) r5
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            m11815as(r0, r4, r5, r7)
            r0 = 0
            r4 = r7[r0]
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1066(0x42a, float:1.494E-42)
            short r5 = (short) r5
            r7 = 18
            byte r7 = r2[r7]
            byte r7 = (byte) r7
            r8 = r7 | 6193(0x1831, float:8.678E-42)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r6]
            m11815as(r5, r7, r8, r9)
            r5 = r9[r0]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x01bf }
            r7[r0] = r5     // Catch:{ all -> 0x01bf }
            r5 = 1051(0x41b, float:1.473E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x01bf }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r2[r8]     // Catch:{ all -> 0x01bf }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x01bf }
            r10 = 5290(0x14aa, float:7.413E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x01bf }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x01bf }
            m11815as(r5, r9, r10, r11)     // Catch:{ all -> 0x01bf }
            r9 = r11[r0]     // Catch:{ all -> 0x01bf }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01bf }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x01bf }
            r11 = 1062(0x426, float:1.488E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x01bf }
            r12 = 3127(0xc37, float:4.382E-42)
            byte r12 = r2[r12]     // Catch:{ all -> 0x01bf }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x01bf }
            r13 = 4131(0x1023, float:5.789E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x01bf }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x01bf }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x01bf }
            r11 = r14[r0]     // Catch:{ all -> 0x01bf }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x01bf }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x01bf }
            byte r2 = r2[r8]     // Catch:{ all -> 0x01bf }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x01bf }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x01bf }
            m11815as(r5, r2, r10, r13)     // Catch:{ all -> 0x01bf }
            r2 = r13[r0]     // Catch:{ all -> 0x01bf }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01bf }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x01bf }
            r12[r0] = r2     // Catch:{ all -> 0x01bf }
            java.lang.reflect.Method r2 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x01bf }
            java.lang.Object r2 = r2.invoke(r4, r7)     // Catch:{ all -> 0x01bf }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x01bf }
            int r4 = r2.length
            int[] r4 = new int[r4]
            r7 = r0
        L_0x0086:
            int r9 = r2.length
            if (r7 >= r9) goto L_0x0134
            r9 = r2[r7]
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            r11[r0] = r9     // Catch:{ all -> 0x012b }
            r9 = 1050(0x41a, float:1.471E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x012b }
            byte[] r12 = f9518c     // Catch:{ all -> 0x012b }
            byte r13 = r12[r8]     // Catch:{ all -> 0x012b }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            int r14 = f9519d     // Catch:{ all -> 0x012b }
            r15 = r14 | 6720(0x1a40, float:9.417E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x012b }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11815as(r9, r13, r15, r3)     // Catch:{ all -> 0x012b }
            r3 = r3[r0]     // Catch:{ all -> 0x012b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x012b }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x012b }
            r13 = 1060(0x424, float:1.485E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x012b }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x012b }
            r8 = 1465(0x5b9, float:2.053E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012b }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11815as(r13, r15, r8, r0)     // Catch:{ all -> 0x012b }
            r8 = 0
            r0 = r0[r8]     // Catch:{ all -> 0x012b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x012b }
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ all -> 0x012b }
            r13 = 2385(0x951, float:3.342E-42)
            byte r15 = r12[r13]     // Catch:{ all -> 0x012b }
            int r13 = -r15
            byte r13 = (byte) r13     // Catch:{ all -> 0x012b }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x012b }
            m11815as(r5, r13, r10, r15)     // Catch:{ all -> 0x012b }
            r13 = 0
            r15 = r15[r13]     // Catch:{ all -> 0x012b }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x012b }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x012b }
            r8[r13] = r15     // Catch:{ all -> 0x012b }
            java.lang.reflect.Method r0 = r3.getMethod(r0, r8)     // Catch:{ all -> 0x012b }
            r3 = 0
            java.lang.Object r0 = r0.invoke(r3, r11)     // Catch:{ all -> 0x012b }
            r8 = 2385(0x951, float:3.342E-42)
            byte r11 = r12[r8]     // Catch:{ all -> 0x0122 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0122 }
            r13 = r14 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0122 }
            m11815as(r9, r11, r13, r14)     // Catch:{ all -> 0x0122 }
            r9 = 0
            r11 = r14[r9]     // Catch:{ all -> 0x0122 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0122 }
            java.lang.Class r9 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0122 }
            r11 = 1059(0x423, float:1.484E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0122 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0122 }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x0122 }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0122 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0122 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x0122 }
            r11 = 0
            r12 = r14[r11]     // Catch:{ all -> 0x0122 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0122 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r3)     // Catch:{ all -> 0x0122 }
            java.lang.Object r0 = r9.invoke(r0, r3)     // Catch:{ all -> 0x0122 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0122 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0122 }
            r4[r7] = r0
            int r7 = r7 + 1
            r0 = r11
            r3 = 21
            goto L_0x0086
        L_0x0122:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x012a
            throw r1
        L_0x012a:
            throw r0
        L_0x012b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0133
            throw r1
        L_0x0133:
            throw r0
        L_0x0134:
            r11 = r0
        L_0x0135:
            int r2 = r0 + 1
            r3 = 30
            r0 = r4[r0]     // Catch:{ all -> 0x01ac }
            int r0 = r1.mo9125d(r0)     // Catch:{ all -> 0x01ac }
            r5 = 9
            r7 = 16
            r8 = 20
            switch(r0) {
                case -14: goto L_0x01a8;
                case -13: goto L_0x019c;
                case -12: goto L_0x0194;
                case -11: goto L_0x0191;
                case -10: goto L_0x018e;
                case -9: goto L_0x0183;
                case -8: goto L_0x0174;
                case -7: goto L_0x016f;
                case -6: goto L_0x0167;
                case -5: goto L_0x0164;
                case -4: goto L_0x0162;
                case -3: goto L_0x0156;
                case -2: goto L_0x014c;
                case -1: goto L_0x014a;
                default: goto L_0x0148;
            }     // Catch:{ all -> 0x01ac }
        L_0x0148:
            goto L_0x01aa
        L_0x014a:
            r0 = 6
            goto L_0x0135
        L_0x014c:
            int r0 = m11814ar()     // Catch:{ all -> 0x01ac }
            r1.f10018b = r0     // Catch:{ all -> 0x01ac }
        L_0x0152:
            r1.mo9125d(r6)     // Catch:{ all -> 0x01ac }
            goto L_0x01aa
        L_0x0156:
            com.facetec.sdk.ce[] r0 = com.facetec.sdk.C2886ce.values()     // Catch:{ all -> 0x01ac }
            r1.f10022f = r0     // Catch:{ all -> 0x01ac }
            r0 = 24
            r1.mo9125d(r0)     // Catch:{ all -> 0x01ac }
            goto L_0x01aa
        L_0x0162:
            r0 = r5
            goto L_0x0135
        L_0x0164:
            r0 = 11
            goto L_0x0135
        L_0x0167:
            r1.mo9125d(r7)     // Catch:{ all -> 0x01ac }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01ac }
            com.facetec.sdk.ce r0 = (com.facetec.sdk.C2886ce) r0     // Catch:{ all -> 0x01ac }
            return r0
        L_0x016f:
            int r0 = f9526m     // Catch:{ all -> 0x01ac }
            r1.f10018b = r0     // Catch:{ all -> 0x01ac }
            goto L_0x0152
        L_0x0174:
            r1.f10018b = r6     // Catch:{ all -> 0x01ac }
            r0 = 8
            r1.mo9125d(r0)     // Catch:{ all -> 0x01ac }
            r1.mo9125d(r5)     // Catch:{ all -> 0x01ac }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01ac }
            f9527n = r0     // Catch:{ all -> 0x01ac }
            goto L_0x01aa
        L_0x0183:
            r0 = 15
            r1.mo9125d(r0)     // Catch:{ all -> 0x01ac }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01ac }
            if (r0 != 0) goto L_0x01aa
            r0 = r8
            goto L_0x0135
        L_0x018e:
            r0 = 33
            goto L_0x0135
        L_0x0191:
            r0 = 31
            goto L_0x0135
        L_0x0194:
            r1.mo9125d(r7)     // Catch:{ all -> 0x01ac }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x01ac }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01ac }
            throw r0     // Catch:{ all -> 0x01ac }
        L_0x019c:
            r1.mo9125d(r8)     // Catch:{ all -> 0x01ac }
            int r0 = r1.f10020d     // Catch:{ all -> 0x01ac }
            if (r0 == 0) goto L_0x01a5
            r0 = r6
            goto L_0x0135
        L_0x01a5:
            r0 = 22
            goto L_0x0135
        L_0x01a8:
            r0 = r3
            goto L_0x0135
        L_0x01aa:
            r0 = r2
            goto L_0x0135
        L_0x01ac:
            r0 = move-exception
            r5 = 26
            if (r2 < r5) goto L_0x01be
            if (r2 > r3) goto L_0x01be
            r1.f10022f = r0
            r0 = 23
            r1.mo9125d(r0)
            r0 = 21
            goto L_0x0135
        L_0x01be:
            throw r0
        L_0x01bf:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01c7
            throw r1
        L_0x01c7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11861v():com.facetec.sdk.ce");
    }

    @JNI.C2746c(mo8795e = 336136627)
    /* renamed from: v */
    static native String m11862v(int i);

    @JNI.C2746c(mo8795e = 532200877)
    /* renamed from: w */
    static native byte[][] m11863w();

    @JNI.C2746c(mo8795e = 895617849)
    /* renamed from: x */
    static native byte[][] m11864x();

    @JNI.C2746c(mo8795e = 845714052)
    /* renamed from: y */
    static native byte[][] m11865y();

    /* renamed from: z */
    static void m11866z() {
        int i = f9526m + 41;
        f9527n = i % 128;
        char c = i % 2 == 0 ? '\"' : 0;
        f9522g = 9121;
        if (c == 0) {
            f9525j = new char[]{5723, 5757, 5719, 5706, 5727, 5648, 5712, 5725, 5543, 5709, 5713, 5741, 5717, 5740, 5540, 5710, 5714, 5722, 5536, 5708, 5537, 5703, 5541, 5715, 5542};
        } else {
            f9525j = new char[]{5723, 5757, 5719, 5706, 5727, 5648, 5712, 5725, 5543, 5709, 5713, 5741, 5717, 5740, 5540, 5710, 5714, 5722, 5536, 5708, 5537, 5703, 5541, 5715, 5542};
            throw null;
        }
    }

    @JNI.C2746c(mo8795e = 764687447)
    /* renamed from: z */
    static native void m11867z(boolean z);

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0160, code lost:
        r1.mo9125d(24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01d0, code lost:
        r1.mo9125d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02d2, code lost:
        r1.mo9125d(24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0336, code lost:
        r1.mo9125d(1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0616  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02c3 A[Catch:{ all -> 0x0483, all -> 0x03cf, all -> 0x0380, all -> 0x033b, all -> 0x02b8, all -> 0x0558 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02c4 A[Catch:{ all -> 0x0483, all -> 0x03cf, all -> 0x0380, all -> 0x033b, all -> 0x02b8, all -> 0x0558 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m11795a(android.content.Context r18) {
        /*
            com.facetec.sdk.do r1 = new com.facetec.sdk.do
            r0 = r18
            r1.<init>((java.lang.Object) r0)
            r0 = 768(0x300, float:1.076E-42)
            short r0 = (short) r0
            byte[] r2 = f9518c
            r3 = 21
            byte r3 = r2[r3]
            byte r3 = (byte) r3
            r4 = 5022(0x139e, float:7.037E-42)
            short r4 = (short) r4
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            m11815as(r0, r3, r4, r6)
            r3 = 0
            r0 = r6[r3]
            java.lang.String r0 = (java.lang.String) r0
            r4 = 1066(0x42a, float:1.494E-42)
            short r4 = (short) r4
            r6 = 18
            byte r6 = r2[r6]
            byte r6 = (byte) r6
            r7 = r6 | 6193(0x1831, float:8.678E-42)
            short r7 = (short) r7
            java.lang.Object[] r8 = new java.lang.Object[r5]
            m11815as(r4, r6, r7, r8)
            r4 = r8[r3]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0617 }
            r6[r3] = r4     // Catch:{ all -> 0x0617 }
            r4 = 1051(0x41b, float:1.473E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x0617 }
            r7 = 2385(0x951, float:3.342E-42)
            byte r8 = r2[r7]     // Catch:{ all -> 0x0617 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0617 }
            r9 = 5290(0x14aa, float:7.413E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0617 }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x0617 }
            m11815as(r4, r8, r9, r10)     // Catch:{ all -> 0x0617 }
            r8 = r10[r3]     // Catch:{ all -> 0x0617 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0617 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0617 }
            r10 = 1062(0x426, float:1.488E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0617 }
            r11 = 3127(0xc37, float:4.382E-42)
            byte r11 = r2[r11]     // Catch:{ all -> 0x0617 }
            int r11 = r11 + r5
            byte r11 = (byte) r11     // Catch:{ all -> 0x0617 }
            r12 = 4131(0x1023, float:5.789E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0617 }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x0617 }
            m11815as(r10, r11, r12, r13)     // Catch:{ all -> 0x0617 }
            r11 = r13[r3]     // Catch:{ all -> 0x0617 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0617 }
            java.lang.Class[] r12 = new java.lang.Class[r5]     // Catch:{ all -> 0x0617 }
            byte r2 = r2[r7]     // Catch:{ all -> 0x0617 }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x0617 }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x0617 }
            m11815as(r4, r2, r9, r13)     // Catch:{ all -> 0x0617 }
            r2 = r13[r3]     // Catch:{ all -> 0x0617 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0617 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0617 }
            r12[r3] = r2     // Catch:{ all -> 0x0617 }
            java.lang.reflect.Method r2 = r8.getMethod(r11, r12)     // Catch:{ all -> 0x0617 }
            java.lang.Object r0 = r2.invoke(r0, r6)     // Catch:{ all -> 0x0617 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0617 }
            int r2 = r0.length
            int[] r2 = new int[r2]
            r6 = r3
        L_0x0088:
            int r8 = r0.length
            r11 = 1050(0x41a, float:1.471E-42)
            if (r6 >= r8) goto L_0x013b
            r8 = r0[r6]
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x0132 }
            r13[r3] = r8     // Catch:{ all -> 0x0132 }
            short r8 = (short) r11     // Catch:{ all -> 0x0132 }
            byte[] r11 = f9518c     // Catch:{ all -> 0x0132 }
            byte r14 = r11[r7]     // Catch:{ all -> 0x0132 }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x0132 }
            int r15 = f9519d     // Catch:{ all -> 0x0132 }
            r12 = r15 | 6720(0x1a40, float:9.417E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0132 }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0132 }
            m11815as(r8, r14, r12, r7)     // Catch:{ all -> 0x0132 }
            r7 = r7[r3]     // Catch:{ all -> 0x0132 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0132 }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0132 }
            r12 = 1060(0x424, float:1.485E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0132 }
            r14 = 74
            byte r14 = (byte) r14     // Catch:{ all -> 0x0132 }
            r3 = 1465(0x5b9, float:2.053E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x0132 }
            r17 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0132 }
            m11815as(r12, r14, r3, r0)     // Catch:{ all -> 0x0132 }
            r3 = 0
            r0 = r0[r3]     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0132 }
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch:{ all -> 0x0132 }
            r12 = 2385(0x951, float:3.342E-42)
            byte r14 = r11[r12]     // Catch:{ all -> 0x0132 }
            int r12 = -r14
            byte r12 = (byte) r12     // Catch:{ all -> 0x0132 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0132 }
            m11815as(r4, r12, r9, r14)     // Catch:{ all -> 0x0132 }
            r12 = 0
            r14 = r14[r12]     // Catch:{ all -> 0x0132 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0132 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0132 }
            r3[r12] = r14     // Catch:{ all -> 0x0132 }
            java.lang.reflect.Method r0 = r7.getMethod(r0, r3)     // Catch:{ all -> 0x0132 }
            r3 = 0
            java.lang.Object r0 = r0.invoke(r3, r13)     // Catch:{ all -> 0x0132 }
            r3 = 2385(0x951, float:3.342E-42)
            byte r7 = r11[r3]     // Catch:{ all -> 0x0129 }
            int r3 = -r7
            byte r3 = (byte) r3     // Catch:{ all -> 0x0129 }
            r7 = r15 | 6720(0x1a40, float:9.417E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0129 }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x0129 }
            m11815as(r8, r3, r7, r12)     // Catch:{ all -> 0x0129 }
            r3 = 0
            r7 = r12[r3]     // Catch:{ all -> 0x0129 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0129 }
            java.lang.Class r3 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0129 }
            r7 = 1059(0x423, float:1.484E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0129 }
            r8 = 1801(0x709, float:2.524E-42)
            byte r8 = r11[r8]     // Catch:{ all -> 0x0129 }
            int r8 = r8 + r5
            byte r8 = (byte) r8     // Catch:{ all -> 0x0129 }
            r11 = 1459(0x5b3, float:2.044E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0129 }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x0129 }
            m11815as(r7, r8, r11, r12)     // Catch:{ all -> 0x0129 }
            r7 = 0
            r8 = r12[r7]     // Catch:{ all -> 0x0129 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0129 }
            r7 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r8, r7)     // Catch:{ all -> 0x0129 }
            java.lang.Object r0 = r3.invoke(r0, r7)     // Catch:{ all -> 0x0129 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0129 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0129 }
            r2[r6] = r0
            int r6 = r6 + 1
            r0 = r17
            r3 = 0
            r7 = 2385(0x951, float:3.342E-42)
            goto L_0x0088
        L_0x0129:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0131
            throw r1
        L_0x0131:
            throw r0
        L_0x0132:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x013a
            throw r1
        L_0x013a:
            throw r0
        L_0x013b:
            r0 = 0
        L_0x013c:
            int r3 = r0 + 1
            r0 = r2[r0]     // Catch:{ all -> 0x05fe }
            int r0 = r1.mo9125d(r0)     // Catch:{ all -> 0x05fe }
            r6 = 1037(0x40d, float:1.453E-42)
            r12 = 3
            r7 = 27
            r8 = 2
            r13 = 9
            r14 = 8
            r15 = 24
            switch(r0) {
                case -33: goto L_0x05f3;
                case -32: goto L_0x05d8;
                case -31: goto L_0x05d3;
                case -30: goto L_0x05cb;
                case -29: goto L_0x05ba;
                case -28: goto L_0x05ac;
                case -27: goto L_0x05a4;
                case -26: goto L_0x059c;
                case -25: goto L_0x058b;
                case -24: goto L_0x0579;
                case -23: goto L_0x056c;
                case -22: goto L_0x056b;
                case -21: goto L_0x0565;
                case -20: goto L_0x055d;
                case -19: goto L_0x0519;
                case -18: goto L_0x04b9;
                case -17: goto L_0x04ad;
                case -16: goto L_0x048c;
                case -15: goto L_0x0443;
                case -14: goto L_0x03d8;
                case -13: goto L_0x0389;
                case -12: goto L_0x0344;
                case -11: goto L_0x02f8;
                case -10: goto L_0x02f1;
                case -9: goto L_0x02d7;
                case -8: goto L_0x02ca;
                case -7: goto L_0x0276;
                case -6: goto L_0x024e;
                case -5: goto L_0x01de;
                case -4: goto L_0x0169;
                case -3: goto L_0x0164;
                case -2: goto L_0x015c;
                case -1: goto L_0x0159;
                default: goto L_0x0153;
            }     // Catch:{ all -> 0x05fe }
        L_0x0153:
            r6 = 0
            r7 = 0
            r16 = 2385(0x951, float:3.342E-42)
            goto L_0x05fb
        L_0x0159:
            r0 = 49
            goto L_0x013c
        L_0x015c:
            java.lang.String r0 = "#\u001f\u0005\u000f*-\u000e$%\u0000\u0007+\t/\b\f\u0001\n($㘎"
            r1.f10022f = r0     // Catch:{ all -> 0x05fe }
        L_0x0160:
            r1.mo9125d(r15)     // Catch:{ all -> 0x05fe }
            goto L_0x0153
        L_0x0164:
            java.lang.String r0 = ""
            r1.f10022f = r0     // Catch:{ all -> 0x05fe }
            goto L_0x0160
        L_0x0169:
            r1.f10018b = r5     // Catch:{ all -> 0x05fe }
            r1.mo9125d(r14)     // Catch:{ all -> 0x05fe }
            r1.mo9125d(r7)     // Catch:{ all -> 0x05fe }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x05fe }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x01d5 }
            r7 = 0
            r6[r7] = r0     // Catch:{ all -> 0x01d5 }
            r0 = 1046(0x416, float:1.466E-42)
            short r0 = (short) r0     // Catch:{ all -> 0x01d5 }
            int r7 = f9519d     // Catch:{ all -> 0x01d5 }
            r7 = r7 & 125(0x7d, float:1.75E-43)
            byte r7 = (byte) r7     // Catch:{ all -> 0x01d5 }
            r8 = 1895(0x767, float:2.655E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x01d5 }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x01d5 }
            m11815as(r0, r7, r8, r12)     // Catch:{ all -> 0x01d5 }
            r7 = 0
            r0 = r12[r7]     // Catch:{ all -> 0x01d5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01d5 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x01d5 }
            short r7 = (short) r11     // Catch:{ all -> 0x01d5 }
            byte[] r8 = f9518c     // Catch:{ all -> 0x01d5 }
            r12 = 609(0x261, float:8.53E-43)
            byte r12 = r8[r12]     // Catch:{ all -> 0x01d5 }
            int r12 = r12 - r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x01d5 }
            r13 = 5706(0x164a, float:7.996E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x01d5 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x01d5 }
            m11815as(r7, r12, r13, r14)     // Catch:{ all -> 0x01d5 }
            r7 = 0
            r12 = r14[r7]     // Catch:{ all -> 0x01d5 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x01d5 }
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x01d5 }
            r13 = 2385(0x951, float:3.342E-42)
            byte r8 = r8[r13]     // Catch:{ all -> 0x01d5 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x01d5 }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x01d5 }
            m11815as(r4, r8, r9, r13)     // Catch:{ all -> 0x01d5 }
            r8 = 0
            r13 = r13[r8]     // Catch:{ all -> 0x01d5 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x01d5 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x01d5 }
            r7[r8] = r13     // Catch:{ all -> 0x01d5 }
            java.lang.reflect.Method r0 = r0.getMethod(r12, r7)     // Catch:{ all -> 0x01d5 }
            r7 = 0
            java.lang.Object r0 = r0.invoke(r7, r6)     // Catch:{ all -> 0x01d5 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01d5 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x01d5 }
            r1.f10018b = r0     // Catch:{ all -> 0x05fe }
        L_0x01d0:
            r1.mo9125d(r5)     // Catch:{ all -> 0x05fe }
            goto L_0x0153
        L_0x01d5:
            r0 = move-exception
            java.lang.Throwable r6 = r0.getCause()     // Catch:{ all -> 0x05fe }
            if (r6 == 0) goto L_0x01dd
            throw r6     // Catch:{ all -> 0x05fe }
        L_0x01dd:
            throw r0     // Catch:{ all -> 0x05fe }
        L_0x01de:
            r1.f10018b = r8     // Catch:{ all -> 0x05fe }
            r1.mo9125d(r14)     // Catch:{ all -> 0x05fe }
            r1.mo9125d(r13)     // Catch:{ all -> 0x05fe }
            int r0 = r1.f10020d     // Catch:{ all -> 0x05fe }
            r1.mo9125d(r13)     // Catch:{ all -> 0x05fe }
            int r6 = r1.f10020d     // Catch:{ all -> 0x05fe }
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ all -> 0x0245 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0245 }
            r7[r5] = r6     // Catch:{ all -> 0x0245 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0245 }
            r6 = 0
            r7[r6] = r0     // Catch:{ all -> 0x0245 }
            short r0 = (short) r11     // Catch:{ all -> 0x0245 }
            int r6 = f9519d     // Catch:{ all -> 0x0245 }
            r6 = r6 & 125(0x7d, float:1.75E-43)
            byte r6 = (byte) r6     // Catch:{ all -> 0x0245 }
            r12 = 4127(0x101f, float:5.783E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0245 }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x0245 }
            m11815as(r0, r6, r12, r13)     // Catch:{ all -> 0x0245 }
            r6 = 0
            r0 = r13[r6]     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0245 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0245 }
            r6 = 1046(0x416, float:1.466E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0245 }
            byte[] r12 = f9518c     // Catch:{ all -> 0x0245 }
            r13 = 2130(0x852, float:2.985E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0245 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x0245 }
            r13 = 4180(0x1054, float:5.857E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0245 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0245 }
            m11815as(r6, r12, r13, r14)     // Catch:{ all -> 0x0245 }
            r6 = 0
            r12 = r14[r6]     // Catch:{ all -> 0x0245 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0245 }
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch:{ all -> 0x0245 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0245 }
            r8[r6] = r13     // Catch:{ all -> 0x0245 }
            r8[r5] = r13     // Catch:{ all -> 0x0245 }
            java.lang.reflect.Method r0 = r0.getMethod(r12, r8)     // Catch:{ all -> 0x0245 }
            r6 = 0
            java.lang.Object r0 = r0.invoke(r6, r7)     // Catch:{ all -> 0x0245 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0245 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0245 }
            r1.f10018b = r0     // Catch:{ all -> 0x05fe }
            goto L_0x01d0
        L_0x0245:
            r0 = move-exception
            java.lang.Throwable r6 = r0.getCause()     // Catch:{ all -> 0x05fe }
            if (r6 == 0) goto L_0x024d
            throw r6     // Catch:{ all -> 0x05fe }
        L_0x024d:
            throw r0     // Catch:{ all -> 0x05fe }
        L_0x024e:
            r1.f10018b = r12     // Catch:{ all -> 0x05fe }
            r1.mo9125d(r14)     // Catch:{ all -> 0x05fe }
            r1.mo9125d(r7)     // Catch:{ all -> 0x05fe }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x05fe }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x05fe }
            r1.mo9125d(r13)     // Catch:{ all -> 0x05fe }
            int r6 = r1.f10020d     // Catch:{ all -> 0x05fe }
            r1.mo9125d(r13)     // Catch:{ all -> 0x05fe }
            int r7 = r1.f10020d     // Catch:{ all -> 0x05fe }
            byte r7 = (byte) r7     // Catch:{ all -> 0x05fe }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x05fe }
            m11820ax(r0, r6, r7, r8)     // Catch:{ all -> 0x05fe }
            r6 = 0
            r0 = r8[r6]     // Catch:{ all -> 0x0273 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x05fe }
            r1.f10022f = r0     // Catch:{ all -> 0x05fe }
            goto L_0x0160
        L_0x0273:
            r0 = move-exception
            goto L_0x0600
        L_0x0276:
            r1.f10018b = r5     // Catch:{ all -> 0x02c5 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x02c5 }
            r1.mo9125d(r7)     // Catch:{ all -> 0x02c5 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x02c5 }
            byte[] r6 = f9518c     // Catch:{ all -> 0x02ba }
            r16 = 2385(0x951, float:3.342E-42)
            byte r7 = r6[r16]     // Catch:{ all -> 0x02b8 }
            int r7 = -r7
            byte r7 = (byte) r7     // Catch:{ all -> 0x02b8 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x02b8 }
            m11815as(r4, r7, r9, r8)     // Catch:{ all -> 0x02b8 }
            r7 = 0
            r8 = r8[r7]     // Catch:{ all -> 0x02b8 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x02b8 }
            java.lang.Class r7 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x02b8 }
            r8 = 1061(0x425, float:1.487E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x02b8 }
            r12 = 1801(0x709, float:2.524E-42)
            byte r6 = r6[r12]     // Catch:{ all -> 0x02b8 }
            int r6 = r6 + r5
            byte r6 = (byte) r6     // Catch:{ all -> 0x02b8 }
            r12 = 5086(0x13de, float:7.127E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x02b8 }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x02b8 }
            m11815as(r8, r6, r12, r13)     // Catch:{ all -> 0x02b8 }
            r6 = 0
            r8 = r13[r6]     // Catch:{ all -> 0x02b8 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x02b8 }
            r6 = 0
            java.lang.reflect.Method r7 = r7.getMethod(r8, r6)     // Catch:{ all -> 0x02b8 }
            java.lang.Object r0 = r7.invoke(r0, r6)     // Catch:{ all -> 0x02b8 }
            r1.f10022f = r0     // Catch:{ all -> 0x0558 }
            goto L_0x02d2
        L_0x02b8:
            r0 = move-exception
            goto L_0x02bd
        L_0x02ba:
            r0 = move-exception
            r16 = 2385(0x951, float:3.342E-42)
        L_0x02bd:
            java.lang.Throwable r6 = r0.getCause()     // Catch:{ all -> 0x0558 }
            if (r6 == 0) goto L_0x02c4
            throw r6     // Catch:{ all -> 0x0558 }
        L_0x02c4:
            throw r0     // Catch:{ all -> 0x0558 }
        L_0x02c5:
            r0 = move-exception
            r16 = 2385(0x951, float:3.342E-42)
            goto L_0x0559
        L_0x02ca:
            r16 = 2385(0x951, float:3.342E-42)
            java.lang.String r0 = com.facetec.sdk.FaceTecSDK.version()     // Catch:{ all -> 0x0558 }
            r1.f10022f = r0     // Catch:{ all -> 0x0558 }
        L_0x02d2:
            r1.mo9125d(r15)     // Catch:{ all -> 0x0558 }
            goto L_0x04b5
        L_0x02d7:
            r16 = 2385(0x951, float:3.342E-42)
            r1.f10018b = r8     // Catch:{ all -> 0x0558 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0558 }
            r1.mo9125d(r7)     // Catch:{ all -> 0x0558 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x0558 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0558 }
            r1.mo9125d(r7)     // Catch:{ all -> 0x0558 }
            java.lang.Object r6 = r1.f10026j     // Catch:{ all -> 0x0558 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0558 }
            m11813aq(r0, r6)     // Catch:{ all -> 0x0558 }
            goto L_0x04b5
        L_0x02f1:
            r16 = 2385(0x951, float:3.342E-42)
            java.lang.String r0 = "#\u001f\u0005\u000f*-\u000e$%\u0000\u0007+\t/\"\u0018.\u0012\u0010\n-\t\u0018 \u000b\u001a\u0004\u0012"
            r1.f10022f = r0     // Catch:{ all -> 0x0558 }
            goto L_0x02d2
        L_0x02f8:
            r16 = 2385(0x951, float:3.342E-42)
            short r0 = (short) r6
            int r6 = f9519d     // Catch:{ all -> 0x033b }
            r6 = r6 & 125(0x7d, float:1.75E-43)
            byte r6 = (byte) r6     // Catch:{ all -> 0x033b }
            r7 = 4160(0x1040, float:5.83E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x033b }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x033b }
            m11815as(r0, r6, r7, r8)     // Catch:{ all -> 0x033b }
            r6 = 0
            r0 = r8[r6]     // Catch:{ all -> 0x033b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x033b }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x033b }
            r7 = 1044(0x414, float:1.463E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x033b }
            byte[] r8 = f9518c     // Catch:{ all -> 0x033b }
            byte r8 = r8[r6]     // Catch:{ all -> 0x033b }
            byte r8 = (byte) r8     // Catch:{ all -> 0x033b }
            r12 = 2089(0x829, float:2.927E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x033b }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x033b }
            m11815as(r7, r8, r12, r13)     // Catch:{ all -> 0x033b }
            r7 = r13[r6]     // Catch:{ all -> 0x033b }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x033b }
            r6 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r7, r6)     // Catch:{ all -> 0x033b }
            java.lang.Object r0 = r0.invoke(r6, r6)     // Catch:{ all -> 0x033b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x033b }
            int r0 = r0.intValue()     // Catch:{ all -> 0x033b }
            r1.f10018b = r0     // Catch:{ all -> 0x0558 }
        L_0x0336:
            r1.mo9125d(r5)     // Catch:{ all -> 0x0558 }
            goto L_0x04b5
        L_0x033b:
            r0 = move-exception
            java.lang.Throwable r6 = r0.getCause()     // Catch:{ all -> 0x0558 }
            if (r6 == 0) goto L_0x0343
            throw r6     // Catch:{ all -> 0x0558 }
        L_0x0343:
            throw r0     // Catch:{ all -> 0x0558 }
        L_0x0344:
            r16 = 2385(0x951, float:3.342E-42)
            short r0 = (short) r6
            int r6 = f9519d     // Catch:{ all -> 0x0380 }
            r6 = r6 & 125(0x7d, float:1.75E-43)
            byte r6 = (byte) r6     // Catch:{ all -> 0x0380 }
            r7 = 4160(0x1040, float:5.83E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0380 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0380 }
            m11815as(r0, r6, r7, r8)     // Catch:{ all -> 0x0380 }
            r6 = 0
            r0 = r8[r6]     // Catch:{ all -> 0x0380 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0380 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0380 }
            byte[] r7 = f9518c     // Catch:{ all -> 0x0380 }
            byte r7 = r7[r6]     // Catch:{ all -> 0x0380 }
            byte r7 = (byte) r7     // Catch:{ all -> 0x0380 }
            r8 = 1955(0x7a3, float:2.74E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0380 }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x0380 }
            m11815as(r4, r7, r8, r12)     // Catch:{ all -> 0x0380 }
            r7 = r12[r6]     // Catch:{ all -> 0x0380 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0380 }
            r6 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r7, r6)     // Catch:{ all -> 0x0380 }
            java.lang.Object r0 = r0.invoke(r6, r6)     // Catch:{ all -> 0x0380 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0380 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0380 }
            r1.f10018b = r0     // Catch:{ all -> 0x0558 }
            goto L_0x0336
        L_0x0380:
            r0 = move-exception
            java.lang.Throwable r6 = r0.getCause()     // Catch:{ all -> 0x0558 }
            if (r6 == 0) goto L_0x0388
            throw r6     // Catch:{ all -> 0x0558 }
        L_0x0388:
            throw r0     // Catch:{ all -> 0x0558 }
        L_0x0389:
            r16 = 2385(0x951, float:3.342E-42)
            r1.f10018b = r5     // Catch:{ all -> 0x0558 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0558 }
            r1.mo9125d(r7)     // Catch:{ all -> 0x0558 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x0558 }
            r6 = 1044(0x414, float:1.463E-42)
            short r6 = (short) r6
            int r7 = f9519d     // Catch:{ all -> 0x03cf }
            r7 = r7 & 125(0x7d, float:1.75E-43)
            byte r7 = (byte) r7     // Catch:{ all -> 0x03cf }
            r8 = r7 | 1864(0x748, float:2.612E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x03cf }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x03cf }
            m11815as(r6, r7, r8, r12)     // Catch:{ all -> 0x03cf }
            r6 = 0
            r7 = r12[r6]     // Catch:{ all -> 0x03cf }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x03cf }
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x03cf }
            r8 = 1053(0x41d, float:1.476E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x03cf }
            byte[] r12 = f9518c     // Catch:{ all -> 0x03cf }
            byte r12 = r12[r6]     // Catch:{ all -> 0x03cf }
            byte r12 = (byte) r12     // Catch:{ all -> 0x03cf }
            r13 = 1940(0x794, float:2.719E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x03cf }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x03cf }
            m11815as(r8, r12, r13, r14)     // Catch:{ all -> 0x03cf }
            r8 = r14[r6]     // Catch:{ all -> 0x03cf }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x03cf }
            r6 = 0
            java.lang.reflect.Method r7 = r7.getMethod(r8, r6)     // Catch:{ all -> 0x03cf }
            java.lang.Object r0 = r7.invoke(r0, r6)     // Catch:{ all -> 0x03cf }
            r1.f10022f = r0     // Catch:{ all -> 0x0558 }
            goto L_0x02d2
        L_0x03cf:
            r0 = move-exception
            java.lang.Throwable r6 = r0.getCause()     // Catch:{ all -> 0x0558 }
            if (r6 == 0) goto L_0x03d7
            throw r6     // Catch:{ all -> 0x0558 }
        L_0x03d7:
            throw r0     // Catch:{ all -> 0x0558 }
        L_0x03d8:
            r0 = 16
            r16 = 2385(0x951, float:3.342E-42)
            int[] r0 = new int[r0]     // Catch:{ all -> 0x0558 }
            r6 = 1867566238(0x6f50cc9e, float:6.462025E28)
            r7 = 0
            r0[r7] = r6     // Catch:{ all -> 0x0516 }
            r6 = -2027706675(0xffffffff8723a6cd, float:-1.2311775E-34)
            r0[r5] = r6     // Catch:{ all -> 0x0558 }
            r6 = -1054239693(0xffffffffc1299433, float:-10.598681)
            r0[r8] = r6     // Catch:{ all -> 0x0558 }
            r6 = -1843122093(0xffffffff92243053, float:-5.180884E-28)
            r0[r12] = r6     // Catch:{ all -> 0x0558 }
            r6 = 4
            r7 = 1657335110(0x62c8ed46, float:1.8532231E21)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r6 = 5
            r7 = -202459832(0xfffffffff3eeb548, float:-3.7824813E31)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r6 = 6
            r7 = -291284660(0xffffffffeea3594c, float:-2.5277005E28)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r6 = 7
            r7 = -1959660603(0xffffffff8b31f3c5, float:-3.4272352E-32)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r6 = -1620405042(0xffffffff9f6a94ce, float:-4.9674516E-20)
            r0[r14] = r6     // Catch:{ all -> 0x0558 }
            r6 = -1390623714(0xffffffffad1cc41e, float:-8.91112E-12)
            r0[r13] = r6     // Catch:{ all -> 0x0558 }
            r6 = 10
            r7 = -1249058841(0xffffffffb58cdfe7, float:-1.0495977E-6)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r6 = 11
            r7 = -345199246(0xffffffffeb6cad72, float:-2.8612557E26)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r6 = 12
            r7 = -4111939(0xffffffffffc141bd, float:NaN)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r6 = 13
            r7 = -1297963638(0xffffffffb2a2a58a, float:-1.893456E-8)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r6 = -922725710(0xffffffffc90052b2, float:-525611.1)
            r7 = 14
            r0[r7] = r6     // Catch:{ all -> 0x0558 }
            r6 = 1532366094(0x5b560d0e, float:6.0249999E16)
            r7 = 15
            r0[r7] = r6     // Catch:{ all -> 0x0558 }
            r1.f10022f = r0     // Catch:{ all -> 0x0558 }
            goto L_0x02d2
        L_0x0443:
            r16 = 2385(0x951, float:3.342E-42)
            short r0 = (short) r6
            int r6 = f9519d     // Catch:{ all -> 0x0483 }
            r6 = r6 & 125(0x7d, float:1.75E-43)
            byte r6 = (byte) r6     // Catch:{ all -> 0x0483 }
            r7 = 4160(0x1040, float:5.83E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0483 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0483 }
            m11815as(r0, r6, r7, r8)     // Catch:{ all -> 0x0483 }
            r6 = 0
            r0 = r8[r6]     // Catch:{ all -> 0x0483 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0483 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0483 }
            r7 = 1044(0x414, float:1.463E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0483 }
            byte[] r8 = f9518c     // Catch:{ all -> 0x0483 }
            byte r8 = r8[r6]     // Catch:{ all -> 0x0483 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0483 }
            r12 = 5391(0x150f, float:7.554E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0483 }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x0483 }
            m11815as(r7, r8, r12, r13)     // Catch:{ all -> 0x0483 }
            r7 = r13[r6]     // Catch:{ all -> 0x0483 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0483 }
            r6 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r7, r6)     // Catch:{ all -> 0x0483 }
            java.lang.Object r0 = r0.invoke(r6, r6)     // Catch:{ all -> 0x0483 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0483 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0483 }
            r1.f10018b = r0     // Catch:{ all -> 0x0558 }
            goto L_0x0336
        L_0x0483:
            r0 = move-exception
            java.lang.Throwable r6 = r0.getCause()     // Catch:{ all -> 0x0558 }
            if (r6 == 0) goto L_0x048b
            throw r6     // Catch:{ all -> 0x0558 }
        L_0x048b:
            throw r0     // Catch:{ all -> 0x0558 }
        L_0x048c:
            r16 = 2385(0x951, float:3.342E-42)
            r1.f10018b = r8     // Catch:{ all -> 0x0558 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x0558 }
            r1.mo9125d(r7)     // Catch:{ all -> 0x0558 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x0558 }
            int[] r0 = (int[]) r0     // Catch:{ all -> 0x0558 }
            r1.mo9125d(r13)     // Catch:{ all -> 0x0558 }
            int r6 = r1.f10020d     // Catch:{ all -> 0x0558 }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0558 }
            m11816at(r0, r6, r7)     // Catch:{ all -> 0x0558 }
            r6 = 0
            r0 = r7[r6]     // Catch:{ all -> 0x0556 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0558 }
            r1.f10022f = r0     // Catch:{ all -> 0x0558 }
            goto L_0x02d2
        L_0x04ad:
            r16 = 2385(0x951, float:3.342E-42)
            java.lang.String r0 = com.facetec.sdk.C2840bg.f9201b     // Catch:{ all -> 0x0558 }
            r1.f10022f = r0     // Catch:{ all -> 0x0558 }
            goto L_0x02d2
        L_0x04b5:
            r6 = 0
            r7 = 0
            goto L_0x05fb
        L_0x04b9:
            r0 = 14
            r16 = 2385(0x951, float:3.342E-42)
            int[] r0 = new int[r0]     // Catch:{ all -> 0x0558 }
            r6 = 1867566238(0x6f50cc9e, float:6.462025E28)
            r7 = 0
            r0[r7] = r6     // Catch:{ all -> 0x0516 }
            r6 = -2027706675(0xffffffff8723a6cd, float:-1.2311775E-34)
            r0[r5] = r6     // Catch:{ all -> 0x0558 }
            r6 = -1054239693(0xffffffffc1299433, float:-10.598681)
            r0[r8] = r6     // Catch:{ all -> 0x0558 }
            r6 = -1843122093(0xffffffff92243053, float:-5.180884E-28)
            r0[r12] = r6     // Catch:{ all -> 0x0558 }
            r6 = 4
            r7 = 1657335110(0x62c8ed46, float:1.8532231E21)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r6 = 5
            r7 = -202459832(0xfffffffff3eeb548, float:-3.7824813E31)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r6 = 6
            r7 = -894106255(0xffffffffcab50571, float:-5931704.5)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r6 = 7
            r7 = 584180752(0x22d1e410, float:5.6891034E-18)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r6 = 2075106953(0x7baf9e89, float:1.8237349E36)
            r0[r14] = r6     // Catch:{ all -> 0x0558 }
            r6 = -1659966278(0xffffffff9d0eecba, float:-1.8915928E-21)
            r0[r13] = r6     // Catch:{ all -> 0x0558 }
            r6 = 10
            r7 = -1021532971(0xffffffffc31ca4d5, float:-156.64388)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r6 = 11
            r7 = -1767775288(0xffffffff96a1e3c8, float:-2.6154703E-25)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r6 = 12
            r7 = -2105082219(0xffffffff8286fe95, float:-1.9835653E-37)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r6 = 13
            r7 = -547013456(0xffffffffdf653cb0, float:-1.6518271E19)
            r0[r6] = r7     // Catch:{ all -> 0x0558 }
            r1.f10022f = r0     // Catch:{ all -> 0x0558 }
            goto L_0x02d2
        L_0x0516:
            r0 = move-exception
            r6 = r7
            goto L_0x055a
        L_0x0519:
            r16 = 2385(0x951, float:3.342E-42)
            int r0 = f9519d     // Catch:{ all -> 0x0558 }
            r0 = r0 & 125(0x7d, float:1.75E-43)
            byte r0 = (byte) r0     // Catch:{ all -> 0x0558 }
            r6 = 1698(0x6a2, float:2.38E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0558 }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0558 }
            m11815as(r4, r0, r6, r7)     // Catch:{ all -> 0x0558 }
            r6 = 0
            r0 = r7[r6]     // Catch:{ all -> 0x0556 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0558 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0558 }
            byte[] r6 = f9518c     // Catch:{ all -> 0x0558 }
            r7 = 984(0x3d8, float:1.379E-42)
            byte r6 = r6[r7]     // Catch:{ all -> 0x0558 }
            int r6 = -r6
            byte r6 = (byte) r6     // Catch:{ all -> 0x0558 }
            r7 = 4652(0x122c, float:6.519E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0558 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0558 }
            m11815as(r10, r6, r7, r8)     // Catch:{ all -> 0x0558 }
            r6 = 0
            r7 = r8[r6]     // Catch:{ all -> 0x0556 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0556 }
            java.lang.reflect.Field r0 = r0.getField(r7)     // Catch:{ all -> 0x0556 }
            r7 = 0
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x05f1 }
            r1.f10022f = r0     // Catch:{ all -> 0x05f1 }
            r1.mo9125d(r15)     // Catch:{ all -> 0x05f1 }
            goto L_0x05fb
        L_0x0556:
            r0 = move-exception
            goto L_0x055a
        L_0x0558:
            r0 = move-exception
        L_0x0559:
            r6 = 0
        L_0x055a:
            r7 = 0
            goto L_0x0603
        L_0x055d:
            r6 = 0
            r7 = 0
            r16 = 2385(0x951, float:3.342E-42)
            r0 = 56
            goto L_0x013c
        L_0x0565:
            r16 = 2385(0x951, float:3.342E-42)
            r0 = 71
            goto L_0x013c
        L_0x056b:
            return
        L_0x056c:
            r6 = 0
            r7 = 0
            r16 = 2385(0x951, float:3.342E-42)
            int r0 = f9526m     // Catch:{ all -> 0x05f1 }
            r1.f10018b = r0     // Catch:{ all -> 0x05f1 }
            r1.mo9125d(r5)     // Catch:{ all -> 0x05f1 }
            goto L_0x05fb
        L_0x0579:
            r6 = 0
            r7 = 0
            r16 = 2385(0x951, float:3.342E-42)
            r1.f10018b = r5     // Catch:{ all -> 0x05f1 }
            r1.mo9125d(r14)     // Catch:{ all -> 0x05f1 }
            r1.mo9125d(r13)     // Catch:{ all -> 0x05f1 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x05f1 }
            f9527n = r0     // Catch:{ all -> 0x05f1 }
            goto L_0x05fb
        L_0x058b:
            r0 = 15
            r6 = 0
            r7 = 0
            r16 = 2385(0x951, float:3.342E-42)
            r1.mo9125d(r0)     // Catch:{ all -> 0x05f1 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x05f1 }
            if (r0 != 0) goto L_0x05fb
            r0 = 65
            goto L_0x013c
        L_0x059c:
            r6 = 0
            r7 = 0
            r16 = 2385(0x951, float:3.342E-42)
            r0 = 84
            goto L_0x013c
        L_0x05a4:
            r6 = 0
            r7 = 0
            r16 = 2385(0x951, float:3.342E-42)
            r0 = 82
            goto L_0x013c
        L_0x05ac:
            r0 = 16
            r6 = 0
            r7 = 0
            r16 = 2385(0x951, float:3.342E-42)
            r1.mo9125d(r0)     // Catch:{ all -> 0x05f1 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x05f1 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x05f1 }
            throw r0     // Catch:{ all -> 0x05f1 }
        L_0x05ba:
            r0 = 15
            r6 = 0
            r7 = 0
            r16 = 2385(0x951, float:3.342E-42)
            r1.mo9125d(r0)     // Catch:{ all -> 0x05f1 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x05f1 }
            if (r0 != 0) goto L_0x05fb
            r0 = 79
            goto L_0x013c
        L_0x05cb:
            r6 = 0
            r7 = 0
            r16 = 2385(0x951, float:3.342E-42)
            r0 = 80
            goto L_0x013c
        L_0x05d3:
            r16 = 2385(0x951, float:3.342E-42)
            r0 = r5
            goto L_0x013c
        L_0x05d8:
            r6 = 0
            r7 = 0
            r16 = 2385(0x951, float:3.342E-42)
            r0 = 20
            r1.mo9125d(r0)     // Catch:{ all -> 0x05f1 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x05f1 }
            r3 = 48
            if (r0 == r3) goto L_0x05ed
            r3 = 59
            r0 = 67
            goto L_0x013c
        L_0x05ed:
            r0 = 54
            goto L_0x013c
        L_0x05f1:
            r0 = move-exception
            goto L_0x0603
        L_0x05f3:
            r6 = 0
            r7 = 0
            r16 = 2385(0x951, float:3.342E-42)
            r0 = 81
            goto L_0x013c
        L_0x05fb:
            r0 = r3
            goto L_0x013c
        L_0x05fe:
            r0 = move-exception
            r6 = 0
        L_0x0600:
            r7 = 0
            r16 = 2385(0x951, float:3.342E-42)
        L_0x0603:
            r8 = 68
            if (r3 < r8) goto L_0x0616
            r8 = 71
            if (r3 > r8) goto L_0x0616
            r1.f10022f = r0
            r0 = 23
            r1.mo9125d(r0)
            r0 = 66
            goto L_0x013c
        L_0x0616:
            throw r0
        L_0x0617:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x061f
            throw r1
        L_0x061f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11795a(android.content.Context):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03fd, code lost:
        if (r1 == 1) goto L_0x0400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0400, code lost:
        r1 = 33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0390, code lost:
        r0.f10018b = r1;
        r0.mo9125d(1);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11824b(java.io.File r16) {
        /*
            com.facetec.sdk.do r0 = new com.facetec.sdk.do
            r1 = r16
            r0.<init>((java.lang.Object) r1)
            r1 = 724(0x2d4, float:1.015E-42)
            short r1 = (short) r1
            byte[] r2 = f9518c
            r3 = 21
            byte r3 = r2[r3]
            byte r3 = (byte) r3
            r4 = 6842(0x1aba, float:9.588E-42)
            short r4 = (short) r4
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            m11815as(r1, r3, r4, r6)
            r1 = 0
            r3 = r6[r1]
            java.lang.String r3 = (java.lang.String) r3
            r4 = 1066(0x42a, float:1.494E-42)
            short r4 = (short) r4
            r6 = 18
            byte r7 = r2[r6]
            byte r7 = (byte) r7
            r8 = r7 | 6193(0x1831, float:8.678E-42)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r5]
            m11815as(r4, r7, r8, r9)
            r4 = r9[r1]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x044f }
            r7[r1] = r4     // Catch:{ all -> 0x044f }
            r4 = 1051(0x41b, float:1.473E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x044f }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r2[r8]     // Catch:{ all -> 0x044f }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x044f }
            r10 = 5290(0x14aa, float:7.413E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x044f }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x044f }
            m11815as(r4, r9, r10, r11)     // Catch:{ all -> 0x044f }
            r9 = r11[r1]     // Catch:{ all -> 0x044f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x044f }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x044f }
            r11 = 1062(0x426, float:1.488E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x044f }
            r12 = 3127(0xc37, float:4.382E-42)
            byte r12 = r2[r12]     // Catch:{ all -> 0x044f }
            int r12 = r12 + r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x044f }
            r13 = 4131(0x1023, float:5.789E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x044f }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x044f }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x044f }
            r11 = r14[r1]     // Catch:{ all -> 0x044f }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x044f }
            java.lang.Class[] r12 = new java.lang.Class[r5]     // Catch:{ all -> 0x044f }
            byte r2 = r2[r8]     // Catch:{ all -> 0x044f }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x044f }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x044f }
            m11815as(r4, r2, r10, r13)     // Catch:{ all -> 0x044f }
            r2 = r13[r1]     // Catch:{ all -> 0x044f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x044f }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x044f }
            r12[r1] = r2     // Catch:{ all -> 0x044f }
            java.lang.reflect.Method r2 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x044f }
            java.lang.Object r2 = r2.invoke(r3, r7)     // Catch:{ all -> 0x044f }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x044f }
            int r3 = r2.length
            int[] r3 = new int[r3]
            r7 = r1
        L_0x0088:
            int r9 = r2.length
            if (r7 >= r9) goto L_0x0139
            r9 = r2[r7]
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x0130 }
            r13[r1] = r9     // Catch:{ all -> 0x0130 }
            r9 = 1050(0x41a, float:1.471E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0130 }
            byte[] r14 = f9518c     // Catch:{ all -> 0x0130 }
            byte r15 = r14[r8]     // Catch:{ all -> 0x0130 }
            int r15 = -r15
            byte r15 = (byte) r15     // Catch:{ all -> 0x0130 }
            int r6 = f9519d     // Catch:{ all -> 0x0130 }
            r11 = r6 | 6720(0x1a40, float:9.417E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0130 }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x0130 }
            m11815as(r9, r15, r11, r12)     // Catch:{ all -> 0x0130 }
            r11 = r12[r1]     // Catch:{ all -> 0x0130 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0130 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0130 }
            r12 = 1060(0x424, float:1.485E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0130 }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x0130 }
            r8 = 1465(0x5b9, float:2.053E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0130 }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x0130 }
            m11815as(r12, r15, r8, r1)     // Catch:{ all -> 0x0130 }
            r8 = 0
            r1 = r1[r8]     // Catch:{ all -> 0x0130 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0130 }
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x0130 }
            r12 = 2385(0x951, float:3.342E-42)
            byte r15 = r14[r12]     // Catch:{ all -> 0x0130 }
            int r12 = -r15
            byte r12 = (byte) r12     // Catch:{ all -> 0x0130 }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x0130 }
            m11815as(r4, r12, r10, r15)     // Catch:{ all -> 0x0130 }
            r12 = 0
            r15 = r15[r12]     // Catch:{ all -> 0x0130 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0130 }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x0130 }
            r8[r12] = r15     // Catch:{ all -> 0x0130 }
            java.lang.reflect.Method r1 = r11.getMethod(r1, r8)     // Catch:{ all -> 0x0130 }
            r8 = 0
            java.lang.Object r1 = r1.invoke(r8, r13)     // Catch:{ all -> 0x0130 }
            r8 = 2385(0x951, float:3.342E-42)
            byte r11 = r14[r8]     // Catch:{ all -> 0x0127 }
            int r8 = -r11
            byte r8 = (byte) r8     // Catch:{ all -> 0x0127 }
            r6 = r6 | 6720(0x1a40, float:9.417E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0127 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0127 }
            m11815as(r9, r8, r6, r11)     // Catch:{ all -> 0x0127 }
            r6 = 0
            r8 = r11[r6]     // Catch:{ all -> 0x0127 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0127 }
            java.lang.Class r6 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0127 }
            r8 = 1059(0x423, float:1.484E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0127 }
            r9 = 1801(0x709, float:2.524E-42)
            byte r9 = r14[r9]     // Catch:{ all -> 0x0127 }
            int r9 = r9 + r5
            byte r9 = (byte) r9     // Catch:{ all -> 0x0127 }
            r11 = 1459(0x5b3, float:2.044E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0127 }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x0127 }
            m11815as(r8, r9, r11, r12)     // Catch:{ all -> 0x0127 }
            r8 = 0
            r9 = r12[r8]     // Catch:{ all -> 0x0127 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0127 }
            r8 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r9, r8)     // Catch:{ all -> 0x0127 }
            java.lang.Object r1 = r6.invoke(r1, r8)     // Catch:{ all -> 0x0127 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0127 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0127 }
            r3[r7] = r1
            int r7 = r7 + 1
            r1 = 0
            r6 = 18
            r8 = 2385(0x951, float:3.342E-42)
            goto L_0x0088
        L_0x0127:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x012f
            throw r1
        L_0x012f:
            throw r0
        L_0x0130:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0138
            throw r1
        L_0x0138:
            throw r0
        L_0x0139:
            r1 = 0
        L_0x013a:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r1 = r0.mo9125d(r1)
            r4 = 1061(0x425, float:1.487E-42)
            r6 = 9
            r7 = 12
            r8 = 15
            r9 = 20
            r10 = 4648(0x1228, float:6.513E-42)
            r11 = 1055(0x41f, float:1.478E-42)
            r12 = 33
            r13 = 27
            r14 = 8
            switch(r1) {
                case -43: goto L_0x0442;
                case -42: goto L_0x042b;
                case -41: goto L_0x0421;
                case -40: goto L_0x040d;
                case -39: goto L_0x0403;
                case -38: goto L_0x03ee;
                case -37: goto L_0x03e4;
                case -36: goto L_0x03da;
                case -35: goto L_0x03c9;
                case -34: goto L_0x03c6;
                case -33: goto L_0x03bc;
                case -32: goto L_0x03ab;
                case -31: goto L_0x0397;
                case -30: goto L_0x0388;
                case -29: goto L_0x037e;
                case -28: goto L_0x0374;
                case -27: goto L_0x0363;
                case -26: goto L_0x034f;
                case -25: goto L_0x0346;
                case -24: goto L_0x0345;
                case -23: goto L_0x0342;
                case -22: goto L_0x0338;
                case -21: goto L_0x02e7;
                case -20: goto L_0x02e1;
                case -19: goto L_0x02ca;
                case -18: goto L_0x02c4;
                case -17: goto L_0x02be;
                case -16: goto L_0x02af;
                case -15: goto L_0x02a9;
                case -14: goto L_0x02a3;
                case -13: goto L_0x029d;
                case -12: goto L_0x028e;
                case -11: goto L_0x023b;
                case -10: goto L_0x0235;
                case -9: goto L_0x022f;
                case -8: goto L_0x0222;
                case -7: goto L_0x01cb;
                case -6: goto L_0x01c7;
                case -5: goto L_0x01c4;
                case -4: goto L_0x01c1;
                case -3: goto L_0x01b7;
                case -2: goto L_0x0164;
                case -1: goto L_0x0161;
                default: goto L_0x0159;
            }
        L_0x0159:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            goto L_0x044c
        L_0x0161:
            r1 = 37
            goto L_0x013a
        L_0x0164:
            r0.f10018b = r5
            r0.mo9125d(r14)
            r0.mo9125d(r13)
            java.lang.Object r1 = r0.f10026j
            short r6 = (short) r11
            byte[] r7 = f9518c     // Catch:{ all -> 0x01ae }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r7[r8]     // Catch:{ all -> 0x01ae }
            int r8 = -r9
            byte r8 = (byte) r8     // Catch:{ all -> 0x01ae }
            short r9 = (short) r10     // Catch:{ all -> 0x01ae }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x01ae }
            m11815as(r6, r8, r9, r10)     // Catch:{ all -> 0x01ae }
            r6 = 0
            r8 = r10[r6]     // Catch:{ all -> 0x01ae }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01ae }
            java.lang.Class r6 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x01ae }
            short r4 = (short) r4     // Catch:{ all -> 0x01ae }
            r8 = 1785(0x6f9, float:2.501E-42)
            byte r7 = r7[r8]     // Catch:{ all -> 0x01ae }
            byte r7 = (byte) r7     // Catch:{ all -> 0x01ae }
            r8 = 4465(0x1171, float:6.257E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x01ae }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x01ae }
            m11815as(r4, r7, r8, r9)     // Catch:{ all -> 0x01ae }
            r4 = 0
            r7 = r9[r4]     // Catch:{ all -> 0x01ae }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01ae }
            r4 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r7, r4)     // Catch:{ all -> 0x01ae }
            java.lang.Object r1 = r6.invoke(r1, r4)     // Catch:{ all -> 0x01ae }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x01ae }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x01ae }
            r0.f10018b = r1
            r0.mo9125d(r5)
            goto L_0x0159
        L_0x01ae:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01b6
            throw r1
        L_0x01b6:
            throw r0
        L_0x01b7:
            r0.mo9125d(r8)
            int r1 = r0.f10020d
            if (r1 != 0) goto L_0x044c
            r1 = 5
            goto L_0x013a
        L_0x01c1:
            r1 = 6
            goto L_0x013a
        L_0x01c4:
            r1 = 7
            goto L_0x013a
        L_0x01c7:
            r1 = 40
            goto L_0x013a
        L_0x01cb:
            r0.f10018b = r5
            r0.mo9125d(r14)
            r0.mo9125d(r13)
            java.lang.Object r1 = r0.f10026j
            short r4 = (short) r11
            byte[] r6 = f9518c     // Catch:{ all -> 0x0219 }
            r7 = 2385(0x951, float:3.342E-42)
            byte r8 = r6[r7]     // Catch:{ all -> 0x0219 }
            int r7 = -r8
            byte r7 = (byte) r7     // Catch:{ all -> 0x0219 }
            short r8 = (short) r10     // Catch:{ all -> 0x0219 }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x0219 }
            m11815as(r4, r7, r8, r9)     // Catch:{ all -> 0x0219 }
            r4 = 0
            r7 = r9[r4]     // Catch:{ all -> 0x0219 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0219 }
            java.lang.Class r4 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0219 }
            r7 = 1056(0x420, float:1.48E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0219 }
            r15 = 1801(0x709, float:2.524E-42)
            byte r6 = r6[r15]     // Catch:{ all -> 0x0219 }
            int r6 = r6 + r5
            byte r6 = (byte) r6     // Catch:{ all -> 0x0219 }
            r8 = 1927(0x787, float:2.7E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0219 }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x0219 }
            m11815as(r7, r6, r8, r9)     // Catch:{ all -> 0x0219 }
            r6 = 0
            r7 = r9[r6]     // Catch:{ all -> 0x0219 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0219 }
            r6 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r7, r6)     // Catch:{ all -> 0x0219 }
            java.lang.Object r1 = r4.invoke(r1, r6)     // Catch:{ all -> 0x0219 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0219 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0219 }
            r0.f10018b = r1
            r0.mo9125d(r5)
            goto L_0x02db
        L_0x0219:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0221
            throw r1
        L_0x0221:
            throw r0
        L_0x0222:
            r15 = 1801(0x709, float:2.524E-42)
            r0.mo9125d(r7)
            int r1 = r0.f10020d
            if (r1 != 0) goto L_0x044c
            r1 = 11
            goto L_0x013a
        L_0x022f:
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 94
            goto L_0x013a
        L_0x0235:
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 92
            goto L_0x013a
        L_0x023b:
            r15 = 1801(0x709, float:2.524E-42)
            r0.f10018b = r5
            r0.mo9125d(r14)
            r0.mo9125d(r13)
            java.lang.Object r1 = r0.f10026j
            short r4 = (short) r11
            byte[] r6 = f9518c     // Catch:{ all -> 0x0285 }
            r7 = 2385(0x951, float:3.342E-42)
            byte r8 = r6[r7]     // Catch:{ all -> 0x0285 }
            int r7 = -r8
            byte r7 = (byte) r7     // Catch:{ all -> 0x0285 }
            short r8 = (short) r10     // Catch:{ all -> 0x0285 }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x0285 }
            m11815as(r4, r7, r8, r9)     // Catch:{ all -> 0x0285 }
            r4 = 0
            r7 = r9[r4]     // Catch:{ all -> 0x0285 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0285 }
            java.lang.Class r4 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0285 }
            r7 = 1058(0x422, float:1.483E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x0285 }
            r8 = 609(0x261, float:8.53E-43)
            byte r6 = r6[r8]     // Catch:{ all -> 0x0285 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x0285 }
            r8 = 1671(0x687, float:2.342E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0285 }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x0285 }
            m11815as(r7, r6, r8, r9)     // Catch:{ all -> 0x0285 }
            r6 = 0
            r7 = r9[r6]     // Catch:{ all -> 0x0285 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0285 }
            r6 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r7, r6)     // Catch:{ all -> 0x0285 }
            java.lang.Object r1 = r4.invoke(r1, r6)     // Catch:{ all -> 0x0285 }
            r0.f10022f = r1
            r1 = 24
            r0.mo9125d(r1)
            goto L_0x02db
        L_0x0285:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x028d
            throw r1
        L_0x028d:
            throw r0
        L_0x028e:
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 156(0x9c, float:2.19E-43)
            r0.mo9125d(r1)
            int r1 = r0.f10020d
            if (r1 != 0) goto L_0x044c
            r1 = 18
            goto L_0x013a
        L_0x029d:
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 89
            goto L_0x013a
        L_0x02a3:
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 87
            goto L_0x013a
        L_0x02a9:
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 23
            goto L_0x013a
        L_0x02af:
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 153(0x99, float:2.14E-43)
            r0.mo9125d(r1)
            int r1 = r0.f10020d
            if (r1 != 0) goto L_0x044c
            r1 = 26
            goto L_0x013a
        L_0x02be:
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 84
            goto L_0x013a
        L_0x02c4:
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 82
            goto L_0x013a
        L_0x02ca:
            r15 = 1801(0x709, float:2.524E-42)
            r0.f10018b = r5
            r0.mo9125d(r14)
            r0.mo9125d(r13)
            java.lang.Object r1 = r0.f10026j
            java.io.File r1 = (java.io.File) r1
            m11824b((java.io.File) r1)
        L_0x02db:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            goto L_0x044c
        L_0x02e1:
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 42
            goto L_0x013a
        L_0x02e7:
            r15 = 1801(0x709, float:2.524E-42)
            r0.f10018b = r5
            r0.mo9125d(r14)
            r0.mo9125d(r13)
            java.lang.Object r1 = r0.f10026j
            short r6 = (short) r11
            byte[] r7 = f9518c     // Catch:{ all -> 0x032f }
            r11 = 2385(0x951, float:3.342E-42)
            byte r8 = r7[r11]     // Catch:{ all -> 0x032f }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x032f }
            short r9 = (short) r10     // Catch:{ all -> 0x032f }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x032f }
            m11815as(r6, r8, r9, r10)     // Catch:{ all -> 0x032f }
            r6 = 0
            r8 = r10[r6]     // Catch:{ all -> 0x032f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x032f }
            java.lang.Class r6 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x032f }
            short r4 = (short) r4     // Catch:{ all -> 0x032f }
            r8 = 1276(0x4fc, float:1.788E-42)
            byte r7 = r7[r8]     // Catch:{ all -> 0x032f }
            int r7 = -r7
            byte r7 = (byte) r7     // Catch:{ all -> 0x032f }
            r8 = 1831(0x727, float:2.566E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x032f }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x032f }
            m11815as(r4, r7, r8, r9)     // Catch:{ all -> 0x032f }
            r4 = 0
            r7 = r9[r4]     // Catch:{ all -> 0x032f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x032f }
            r10 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r7, r10)     // Catch:{ all -> 0x032f }
            java.lang.Object r1 = r6.invoke(r1, r10)     // Catch:{ all -> 0x032f }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x032f }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x032f }
            goto L_0x0390
        L_0x032f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0337
            throw r1
        L_0x0337:
            throw r0
        L_0x0338:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 69
            goto L_0x013a
        L_0x0342:
            r1 = r5
            goto L_0x013a
        L_0x0345:
            return
        L_0x0346:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            int r1 = f9526m
            goto L_0x0390
        L_0x034f:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r0.f10018b = r5
            r0.mo9125d(r14)
            r0.mo9125d(r6)
            int r1 = r0.f10020d
            f9527n = r1
            goto L_0x044c
        L_0x0363:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r0.mo9125d(r8)
            int r1 = r0.f10020d
            if (r1 != 0) goto L_0x044c
            r1 = 56
            goto L_0x013a
        L_0x0374:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 57
            goto L_0x013a
        L_0x037e:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 19
            goto L_0x013a
        L_0x0388:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            int r1 = f9527n
        L_0x0390:
            r0.f10018b = r1
            r0.mo9125d(r5)
            goto L_0x044c
        L_0x0397:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r0.f10018b = r5
            r0.mo9125d(r14)
            r0.mo9125d(r6)
            int r1 = r0.f10020d
            f9526m = r1
            goto L_0x044c
        L_0x03ab:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r0.mo9125d(r7)
            int r1 = r0.f10020d
            if (r1 != 0) goto L_0x044c
            r1 = 67
            goto L_0x013a
        L_0x03bc:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 68
            goto L_0x013a
        L_0x03c6:
            r1 = r13
            goto L_0x013a
        L_0x03c9:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r0.mo9125d(r8)
            int r1 = r0.f10020d
            if (r1 != 0) goto L_0x044c
            r1 = 79
            goto L_0x013a
        L_0x03da:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 80
            goto L_0x013a
        L_0x03e4:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 45
            goto L_0x013a
        L_0x03ee:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r0.mo9125d(r9)
            int r1 = r0.f10020d
            r2 = 58
            if (r1 == 0) goto L_0x044c
            if (r1 == r5) goto L_0x0400
            goto L_0x044c
        L_0x0400:
            r1 = r12
            goto L_0x013a
        L_0x0403:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 81
            goto L_0x013a
        L_0x040d:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r0.mo9125d(r9)
            int r1 = r0.f10020d
            r2 = 52
            if (r1 == r2) goto L_0x041d
        L_0x041c:
            goto L_0x0400
        L_0x041d:
            r1 = 47
            goto L_0x013a
        L_0x0421:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 86
            goto L_0x013a
        L_0x042b:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r0.mo9125d(r9)
            int r1 = r0.f10020d
            r2 = 65
            if (r1 == r2) goto L_0x0400
            r2 = 96
            if (r1 == r2) goto L_0x043f
            goto L_0x041c
        L_0x043f:
            r1 = r7
            goto L_0x013a
        L_0x0442:
            r4 = 0
            r10 = 0
            r11 = 2385(0x951, float:3.342E-42)
            r15 = 1801(0x709, float:2.524E-42)
            r1 = 91
            goto L_0x013a
        L_0x044c:
            r1 = r2
            goto L_0x013a
        L_0x044f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0457
            throw r1
        L_0x0457:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11824b(java.io.File):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b7, code lost:
        r1.mo9125d(24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0203, code lost:
        r1.mo9125d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02a2, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c9 A[Catch:{ all -> 0x01bc, all -> 0x029a }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ca A[Catch:{ all -> 0x01bc, all -> 0x029a }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11827c(android.content.Context r16) {
        /*
            com.facetec.sdk.do r1 = new com.facetec.sdk.do
            r0 = r16
            r1.<init>((java.lang.Object) r0)
            r0 = 851(0x353, float:1.193E-42)
            short r0 = (short) r0
            byte[] r2 = f9518c
            r3 = 21
            byte r3 = r2[r3]
            byte r3 = (byte) r3
            r4 = 2332(0x91c, float:3.268E-42)
            short r4 = (short) r4
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            m11815as(r0, r3, r4, r6)
            r3 = 0
            r0 = r6[r3]
            java.lang.String r0 = (java.lang.String) r0
            r4 = 1066(0x42a, float:1.494E-42)
            short r4 = (short) r4
            r6 = 18
            byte r7 = r2[r6]
            byte r7 = (byte) r7
            r8 = r7 | 6193(0x1831, float:8.678E-42)
            short r8 = (short) r8
            java.lang.Object[] r9 = new java.lang.Object[r5]
            m11815as(r4, r7, r8, r9)
            r4 = r9[r3]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x02ba }
            r7[r3] = r4     // Catch:{ all -> 0x02ba }
            r4 = 1051(0x41b, float:1.473E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x02ba }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r2[r8]     // Catch:{ all -> 0x02ba }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x02ba }
            r10 = 5290(0x14aa, float:7.413E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x02ba }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x02ba }
            m11815as(r4, r9, r10, r11)     // Catch:{ all -> 0x02ba }
            r9 = r11[r3]     // Catch:{ all -> 0x02ba }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x02ba }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x02ba }
            r11 = 1062(0x426, float:1.488E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x02ba }
            r12 = 3127(0xc37, float:4.382E-42)
            byte r12 = r2[r12]     // Catch:{ all -> 0x02ba }
            int r12 = r12 + r5
            byte r12 = (byte) r12     // Catch:{ all -> 0x02ba }
            r13 = 4131(0x1023, float:5.789E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x02ba }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x02ba }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x02ba }
            r11 = r14[r3]     // Catch:{ all -> 0x02ba }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x02ba }
            java.lang.Class[] r12 = new java.lang.Class[r5]     // Catch:{ all -> 0x02ba }
            byte r2 = r2[r8]     // Catch:{ all -> 0x02ba }
            int r2 = -r2
            byte r2 = (byte) r2     // Catch:{ all -> 0x02ba }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x02ba }
            m11815as(r4, r2, r10, r13)     // Catch:{ all -> 0x02ba }
            r2 = r13[r3]     // Catch:{ all -> 0x02ba }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x02ba }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x02ba }
            r12[r3] = r2     // Catch:{ all -> 0x02ba }
            java.lang.reflect.Method r2 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x02ba }
            java.lang.Object r0 = r2.invoke(r0, r7)     // Catch:{ all -> 0x02ba }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x02ba }
            int r2 = r0.length
            int[] r2 = new int[r2]
            r7 = r3
        L_0x0088:
            int r9 = r0.length
            if (r7 >= r9) goto L_0x0138
            r9 = r0[r7]
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x012f }
            r12[r3] = r9     // Catch:{ all -> 0x012f }
            r9 = 1050(0x41a, float:1.471E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x012f }
            byte[] r13 = f9518c     // Catch:{ all -> 0x012f }
            byte r14 = r13[r8]     // Catch:{ all -> 0x012f }
            int r14 = -r14
            byte r14 = (byte) r14     // Catch:{ all -> 0x012f }
            int r15 = f9519d     // Catch:{ all -> 0x012f }
            r6 = r15 | 6720(0x1a40, float:9.417E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x012f }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x012f }
            m11815as(r9, r14, r6, r11)     // Catch:{ all -> 0x012f }
            r6 = r11[r3]     // Catch:{ all -> 0x012f }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x012f }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x012f }
            r11 = 1060(0x424, float:1.485E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x012f }
            r14 = 74
            byte r14 = (byte) r14     // Catch:{ all -> 0x012f }
            r8 = 1465(0x5b9, float:2.053E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012f }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x012f }
            m11815as(r11, r14, r8, r3)     // Catch:{ all -> 0x012f }
            r8 = 0
            r3 = r3[r8]     // Catch:{ all -> 0x012f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x012f }
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x012f }
            r11 = 2385(0x951, float:3.342E-42)
            byte r14 = r13[r11]     // Catch:{ all -> 0x012f }
            int r11 = -r14
            byte r11 = (byte) r11     // Catch:{ all -> 0x012f }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x012f }
            m11815as(r4, r11, r10, r14)     // Catch:{ all -> 0x012f }
            r11 = 0
            r14 = r14[r11]     // Catch:{ all -> 0x012f }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x012f }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x012f }
            r8[r11] = r14     // Catch:{ all -> 0x012f }
            java.lang.reflect.Method r3 = r6.getMethod(r3, r8)     // Catch:{ all -> 0x012f }
            r6 = 0
            java.lang.Object r3 = r3.invoke(r6, r12)     // Catch:{ all -> 0x012f }
            r6 = 2385(0x951, float:3.342E-42)
            byte r8 = r13[r6]     // Catch:{ all -> 0x0126 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0126 }
            r11 = r15 | 6720(0x1a40, float:9.417E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0126 }
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x0126 }
            m11815as(r9, r8, r11, r12)     // Catch:{ all -> 0x0126 }
            r8 = 0
            r9 = r12[r8]     // Catch:{ all -> 0x0126 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0126 }
            java.lang.Class r8 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0126 }
            r9 = 1059(0x423, float:1.484E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0126 }
            r11 = 1801(0x709, float:2.524E-42)
            byte r11 = r13[r11]     // Catch:{ all -> 0x0126 }
            int r11 = r11 + r5
            byte r11 = (byte) r11     // Catch:{ all -> 0x0126 }
            r12 = 1459(0x5b3, float:2.044E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0126 }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x0126 }
            m11815as(r9, r11, r12, r13)     // Catch:{ all -> 0x0126 }
            r9 = 0
            r11 = r13[r9]     // Catch:{ all -> 0x0126 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0126 }
            r9 = 0
            java.lang.reflect.Method r8 = r8.getMethod(r11, r9)     // Catch:{ all -> 0x0126 }
            java.lang.Object r3 = r8.invoke(r3, r9)     // Catch:{ all -> 0x0126 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0126 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0126 }
            r2[r7] = r3
            int r7 = r7 + 1
            r8 = r6
            r3 = 0
            r6 = 18
            goto L_0x0088
        L_0x0126:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x012e
            throw r1
        L_0x012e:
            throw r0
        L_0x012f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0137
            throw r1
        L_0x0137:
            throw r0
        L_0x0138:
            r8 = 0
        L_0x0139:
            int r3 = r8 + 1
            r4 = 37
            r0 = r2[r8]     // Catch:{ all -> 0x02a5 }
            int r0 = r1.mo9125d(r0)     // Catch:{ all -> 0x02a5 }
            r6 = 9
            r7 = 166(0xa6, float:2.33E-43)
            r8 = 16
            r9 = 20
            r10 = 27
            r11 = 12
            r12 = 24
            r13 = 8
            switch(r0) {
                case -29: goto L_0x029c;
                case -28: goto L_0x028a;
                case -27: goto L_0x0139;
                case -26: goto L_0x0284;
                case -25: goto L_0x0275;
                case -24: goto L_0x0266;
                case -23: goto L_0x025f;
                case -22: goto L_0x025b;
                case -21: goto L_0x0255;
                case -20: goto L_0x0248;
                case -19: goto L_0x023b;
                case -18: goto L_0x0231;
                case -17: goto L_0x022b;
                case -16: goto L_0x0225;
                case -15: goto L_0x0218;
                case -14: goto L_0x0208;
                case -13: goto L_0x01fd;
                case -12: goto L_0x01fc;
                case -11: goto L_0x01f9;
                case -10: goto L_0x01f6;
                case -9: goto L_0x01e1;
                case -8: goto L_0x01cb;
                case -7: goto L_0x0175;
                case -6: goto L_0x0172;
                case -5: goto L_0x0170;
                case -4: goto L_0x016e;
                case -3: goto L_0x0164;
                case -2: goto L_0x015c;
                case -1: goto L_0x015a;
                default: goto L_0x0156;
            }     // Catch:{ all -> 0x02a5 }
        L_0x0156:
            r14 = 0
            r15 = 0
            goto L_0x02a2
        L_0x015a:
            r8 = r11
            goto L_0x0139
        L_0x015c:
            java.lang.String r0 = com.facetec.sdk.C2840bg.f9201b     // Catch:{ all -> 0x02a5 }
            r1.f10022f = r0     // Catch:{ all -> 0x02a5 }
            r1.mo9125d(r12)     // Catch:{ all -> 0x02a5 }
            goto L_0x0156
        L_0x0164:
            r1.mo9125d(r7)     // Catch:{ all -> 0x02a5 }
            int r0 = r1.f10020d     // Catch:{ all -> 0x02a5 }
            if (r0 != 0) goto L_0x02a2
            r0 = 4
        L_0x016c:
            r8 = r0
            goto L_0x0139
        L_0x016e:
            r8 = 5
            goto L_0x0139
        L_0x0170:
            r8 = 6
            goto L_0x0139
        L_0x0172:
            r8 = 47
            goto L_0x0139
        L_0x0175:
            r1.f10018b = r5     // Catch:{ all -> 0x02a5 }
            r1.mo9125d(r13)     // Catch:{ all -> 0x02a5 }
            r1.mo9125d(r10)     // Catch:{ all -> 0x02a5 }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x02a5 }
            r6 = 1044(0x414, float:1.463E-42)
            short r6 = (short) r6
            int r7 = f9519d     // Catch:{ all -> 0x01c0 }
            r7 = r7 & 125(0x7d, float:1.75E-43)
            byte r7 = (byte) r7     // Catch:{ all -> 0x01c0 }
            r8 = r7 | 1864(0x748, float:2.612E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x01c0 }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x01c0 }
            m11815as(r6, r7, r8, r9)     // Catch:{ all -> 0x01c0 }
            r14 = 0
            r6 = r9[r14]     // Catch:{ all -> 0x01be }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x01be }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x01be }
            r7 = 1046(0x416, float:1.466E-42)
            short r7 = (short) r7     // Catch:{ all -> 0x01be }
            byte[] r8 = f9518c     // Catch:{ all -> 0x01be }
            byte r8 = r8[r14]     // Catch:{ all -> 0x01be }
            byte r8 = (byte) r8     // Catch:{ all -> 0x01be }
            r9 = 5369(0x14f9, float:7.524E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x01be }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x01be }
            m11815as(r7, r8, r9, r10)     // Catch:{ all -> 0x01be }
            r7 = r10[r14]     // Catch:{ all -> 0x01be }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01be }
            r15 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r7, r15)     // Catch:{ all -> 0x01bc }
            java.lang.Object r0 = r6.invoke(r0, r15)     // Catch:{ all -> 0x01bc }
            r1.f10022f = r0     // Catch:{ all -> 0x029a }
        L_0x01b7:
            r1.mo9125d(r12)     // Catch:{ all -> 0x029a }
            goto L_0x02a2
        L_0x01bc:
            r0 = move-exception
            goto L_0x01c3
        L_0x01be:
            r0 = move-exception
            goto L_0x01c2
        L_0x01c0:
            r0 = move-exception
            r14 = 0
        L_0x01c2:
            r15 = 0
        L_0x01c3:
            java.lang.Throwable r6 = r0.getCause()     // Catch:{ all -> 0x029a }
            if (r6 == 0) goto L_0x01ca
            throw r6     // Catch:{ all -> 0x029a }
        L_0x01ca:
            throw r0     // Catch:{ all -> 0x029a }
        L_0x01cb:
            r14 = 0
            r15 = 0
            r1.f10018b = r5     // Catch:{ all -> 0x029a }
            r1.mo9125d(r13)     // Catch:{ all -> 0x029a }
            r1.mo9125d(r10)     // Catch:{ all -> 0x029a }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x029a }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x029a }
            com.facetec.sdk.ya r6 = new com.facetec.sdk.ya     // Catch:{ all -> 0x029a }
            r6.<init>(r0)     // Catch:{ all -> 0x029a }
            r1.f10022f = r6     // Catch:{ all -> 0x029a }
            goto L_0x01b7
        L_0x01e1:
            r14 = 0
            r15 = 0
            r1.f10018b = r5     // Catch:{ all -> 0x029a }
            r1.mo9125d(r13)     // Catch:{ all -> 0x029a }
            r1.mo9125d(r10)     // Catch:{ all -> 0x029a }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x029a }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x029a }
            com.facetec.sdk.cv r0 = com.facetec.sdk.C2920cv.m12196e(r0)     // Catch:{ all -> 0x029a }
            r1.f10022f = r0     // Catch:{ all -> 0x029a }
            goto L_0x01b7
        L_0x01f6:
            r8 = r4
            goto L_0x0139
        L_0x01f9:
            r8 = r9
            goto L_0x0139
        L_0x01fc:
            return
        L_0x01fd:
            r14 = 0
            r15 = 0
            int r0 = f9527n     // Catch:{ all -> 0x029a }
            r1.f10018b = r0     // Catch:{ all -> 0x029a }
        L_0x0203:
            r1.mo9125d(r5)     // Catch:{ all -> 0x029a }
            goto L_0x02a2
        L_0x0208:
            r14 = 0
            r15 = 0
            r1.f10018b = r5     // Catch:{ all -> 0x029a }
            r1.mo9125d(r13)     // Catch:{ all -> 0x029a }
            r1.mo9125d(r6)     // Catch:{ all -> 0x029a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x029a }
            f9526m = r0     // Catch:{ all -> 0x029a }
            goto L_0x02a2
        L_0x0218:
            r14 = 0
            r15 = 0
            r1.mo9125d(r11)     // Catch:{ all -> 0x029a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x029a }
            if (r0 != 0) goto L_0x02a2
            r0 = 28
            goto L_0x016c
        L_0x0225:
            r14 = 0
            r15 = 0
            r8 = 61
            goto L_0x0139
        L_0x022b:
            r14 = 0
            r15 = 0
            r8 = 59
            goto L_0x0139
        L_0x0231:
            r14 = 0
            r15 = 0
            r1.mo9125d(r8)     // Catch:{ all -> 0x029a }
            java.lang.Object r0 = r1.f10026j     // Catch:{ all -> 0x029a }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x029a }
            throw r0     // Catch:{ all -> 0x029a }
        L_0x023b:
            r14 = 0
            r15 = 0
            r1.mo9125d(r7)     // Catch:{ all -> 0x029a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x029a }
            if (r0 != 0) goto L_0x02a2
            r0 = 36
            goto L_0x016c
        L_0x0248:
            r14 = 0
            r15 = 0
            r1.mo9125d(r11)     // Catch:{ all -> 0x029a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x029a }
            if (r0 != 0) goto L_0x02a2
            r0 = 45
            goto L_0x016c
        L_0x0255:
            r14 = 0
            r15 = 0
            r8 = 46
            goto L_0x0139
        L_0x025b:
            r8 = 18
            goto L_0x0139
        L_0x025f:
            r14 = 0
            r15 = 0
            int r0 = f9526m     // Catch:{ all -> 0x029a }
            r1.f10018b = r0     // Catch:{ all -> 0x029a }
            goto L_0x0203
        L_0x0266:
            r14 = 0
            r15 = 0
            r1.f10018b = r5     // Catch:{ all -> 0x029a }
            r1.mo9125d(r13)     // Catch:{ all -> 0x029a }
            r1.mo9125d(r6)     // Catch:{ all -> 0x029a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x029a }
            f9527n = r0     // Catch:{ all -> 0x029a }
            goto L_0x02a2
        L_0x0275:
            r14 = 0
            r15 = 0
            r0 = 15
            r1.mo9125d(r0)     // Catch:{ all -> 0x029a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x029a }
            if (r0 != 0) goto L_0x02a2
            r0 = 56
            goto L_0x016c
        L_0x0284:
            r14 = 0
            r15 = 0
            r8 = 57
            goto L_0x0139
        L_0x028a:
            r14 = 0
            r15 = 0
            r1.mo9125d(r9)     // Catch:{ all -> 0x029a }
            int r0 = r1.f10020d     // Catch:{ all -> 0x029a }
            if (r0 == 0) goto L_0x0296
            r8 = r5
            goto L_0x0139
        L_0x0296:
            r0 = 30
            goto L_0x016c
        L_0x029a:
            r0 = move-exception
            goto L_0x02a8
        L_0x029c:
            r14 = 0
            r15 = 0
            r8 = 58
            goto L_0x0139
        L_0x02a2:
            r8 = r3
            goto L_0x0139
        L_0x02a5:
            r0 = move-exception
            r14 = 0
            r15 = 0
        L_0x02a8:
            r6 = 31
            if (r3 < r6) goto L_0x02b9
            if (r3 > r4) goto L_0x02b9
            r1.f10022f = r0
            r0 = 23
            r1.mo9125d(r0)
            r8 = 29
            goto L_0x0139
        L_0x02b9:
            throw r0
        L_0x02ba:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02c2
            throw r1
        L_0x02c2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11827c(android.content.Context):void");
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [int, boolean] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0530, code lost:
        r2.mo9125d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0167, code lost:
        r2.mo9125d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0197, code lost:
        r2.mo9125d(24);
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0411 A[Catch:{ all -> 0x0406, all -> 0x04d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0412 A[Catch:{ all -> 0x0406, all -> 0x04d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x053f A[Catch:{ all -> 0x0535, all -> 0x05c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0540 A[Catch:{ all -> 0x0535, all -> 0x05c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x05e6 A[Catch:{ all -> 0x0622, all -> 0x0137, all -> 0x012e }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x05ee A[Catch:{ all -> 0x0622, all -> 0x0137, all -> 0x012e }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized boolean m11830d(android.content.Context r20) {
        /*
            java.lang.Class<com.facetec.sdk.cd> r1 = com.facetec.sdk.C2885cd.class
            monitor-enter(r1)
            com.facetec.sdk.do r2 = new com.facetec.sdk.do     // Catch:{ all -> 0x062b }
            r0 = r20
            r2.<init>((java.lang.Object) r0)     // Catch:{ all -> 0x062b }
            r0 = 764(0x2fc, float:1.07E-42)
            short r0 = (short) r0     // Catch:{ all -> 0x062b }
            byte[] r3 = f9518c     // Catch:{ all -> 0x062b }
            r4 = 21
            byte r5 = r3[r4]     // Catch:{ all -> 0x062b }
            byte r5 = (byte) r5     // Catch:{ all -> 0x062b }
            r6 = r5 | 7318(0x1c96, float:1.0255E-41)
            short r6 = (short) r6     // Catch:{ all -> 0x062b }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x062b }
            m11815as(r0, r5, r6, r8)     // Catch:{ all -> 0x062b }
            r5 = 0
            r0 = r8[r5]     // Catch:{ all -> 0x062b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x062b }
            r6 = 1066(0x42a, float:1.494E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x062b }
            r8 = 18
            byte r9 = r3[r8]     // Catch:{ all -> 0x062b }
            byte r9 = (byte) r9     // Catch:{ all -> 0x062b }
            r10 = r9 | 6193(0x1831, float:8.678E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x062b }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x062b }
            m11815as(r6, r9, r10, r11)     // Catch:{ all -> 0x062b }
            r6 = r11[r5]     // Catch:{ all -> 0x062b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x062b }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x0622 }
            r9[r5] = r6     // Catch:{ all -> 0x0622 }
            r6 = 1051(0x41b, float:1.473E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0622 }
            r10 = 2385(0x951, float:3.342E-42)
            byte r11 = r3[r10]     // Catch:{ all -> 0x0622 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0622 }
            r12 = 5290(0x14aa, float:7.413E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0622 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0622 }
            m11815as(r6, r11, r12, r13)     // Catch:{ all -> 0x0622 }
            r11 = r13[r5]     // Catch:{ all -> 0x0622 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0622 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0622 }
            r13 = 1062(0x426, float:1.488E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0622 }
            r14 = 3127(0xc37, float:4.382E-42)
            byte r14 = r3[r14]     // Catch:{ all -> 0x0622 }
            int r14 = r14 + r7
            byte r14 = (byte) r14     // Catch:{ all -> 0x0622 }
            r15 = 4131(0x1023, float:5.789E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x0622 }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ all -> 0x0622 }
            m11815as(r13, r14, r15, r4)     // Catch:{ all -> 0x0622 }
            r4 = r4[r5]     // Catch:{ all -> 0x0622 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0622 }
            java.lang.Class[] r13 = new java.lang.Class[r7]     // Catch:{ all -> 0x0622 }
            byte r3 = r3[r10]     // Catch:{ all -> 0x0622 }
            int r3 = -r3
            byte r3 = (byte) r3     // Catch:{ all -> 0x0622 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0622 }
            m11815as(r6, r3, r12, r14)     // Catch:{ all -> 0x0622 }
            r3 = r14[r5]     // Catch:{ all -> 0x0622 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0622 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0622 }
            r13[r5] = r3     // Catch:{ all -> 0x0622 }
            java.lang.reflect.Method r3 = r11.getMethod(r4, r13)     // Catch:{ all -> 0x0622 }
            java.lang.Object r0 = r3.invoke(r0, r9)     // Catch:{ all -> 0x0622 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x0622 }
            int r3 = r0.length     // Catch:{ all -> 0x062b }
            int[] r3 = new int[r3]     // Catch:{ all -> 0x062b }
            r4 = r5
        L_0x008b:
            int r9 = r0.length     // Catch:{ all -> 0x062b }
            if (r4 >= r9) goto L_0x0140
            r9 = r0[r4]     // Catch:{ all -> 0x062b }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0137 }
            r14[r5] = r9     // Catch:{ all -> 0x0137 }
            r9 = 1050(0x41a, float:1.471E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0137 }
            byte[] r15 = f9518c     // Catch:{ all -> 0x0137 }
            byte r8 = r15[r10]     // Catch:{ all -> 0x0137 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0137 }
            int r11 = f9519d     // Catch:{ all -> 0x0137 }
            r13 = r11 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0137 }
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x0137 }
            m11815as(r9, r8, r13, r10)     // Catch:{ all -> 0x0137 }
            r8 = r10[r5]     // Catch:{ all -> 0x0137 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0137 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0137 }
            r10 = 1060(0x424, float:1.485E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0137 }
            r13 = 74
            byte r13 = (byte) r13     // Catch:{ all -> 0x0137 }
            r5 = 1465(0x5b9, float:2.053E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x0137 }
            r18 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ all -> 0x0137 }
            m11815as(r10, r13, r5, r0)     // Catch:{ all -> 0x0137 }
            r5 = 0
            r0 = r0[r5]     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0137 }
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch:{ all -> 0x0137 }
            r10 = 2385(0x951, float:3.342E-42)
            byte r13 = r15[r10]     // Catch:{ all -> 0x0137 }
            int r10 = -r13
            byte r10 = (byte) r10     // Catch:{ all -> 0x0137 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0137 }
            m11815as(r6, r10, r12, r13)     // Catch:{ all -> 0x0137 }
            r10 = 0
            r13 = r13[r10]     // Catch:{ all -> 0x0137 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0137 }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0137 }
            r5[r10] = r13     // Catch:{ all -> 0x0137 }
            java.lang.reflect.Method r0 = r8.getMethod(r0, r5)     // Catch:{ all -> 0x0137 }
            r5 = 0
            java.lang.Object r0 = r0.invoke(r5, r14)     // Catch:{ all -> 0x0137 }
            r5 = 2385(0x951, float:3.342E-42)
            byte r8 = r15[r5]     // Catch:{ all -> 0x012e }
            int r5 = -r8
            byte r5 = (byte) r5     // Catch:{ all -> 0x012e }
            r8 = r11 | 6720(0x1a40, float:9.417E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012e }
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x012e }
            m11815as(r9, r5, r8, r10)     // Catch:{ all -> 0x012e }
            r5 = 0
            r8 = r10[r5]     // Catch:{ all -> 0x012e }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x012e }
            java.lang.Class r5 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x012e }
            r8 = 1059(0x423, float:1.484E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x012e }
            r9 = 1801(0x709, float:2.524E-42)
            byte r9 = r15[r9]     // Catch:{ all -> 0x012e }
            int r9 = r9 + r7
            byte r9 = (byte) r9     // Catch:{ all -> 0x012e }
            r10 = 1459(0x5b3, float:2.044E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x012e }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x012e }
            m11815as(r8, r9, r10, r11)     // Catch:{ all -> 0x012e }
            r8 = 0
            r9 = r11[r8]     // Catch:{ all -> 0x012e }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x012e }
            r8 = 0
            java.lang.reflect.Method r5 = r5.getMethod(r9, r8)     // Catch:{ all -> 0x012e }
            java.lang.Object r0 = r5.invoke(r0, r8)     // Catch:{ all -> 0x012e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x012e }
            int r0 = r0.intValue()     // Catch:{ all -> 0x012e }
            r3[r4] = r0     // Catch:{ all -> 0x062b }
            int r4 = r4 + 1
            r0 = r18
            r5 = 0
            r8 = 18
            r10 = 2385(0x951, float:3.342E-42)
            goto L_0x008b
        L_0x012e:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x062b }
            if (r2 == 0) goto L_0x0136
            throw r2     // Catch:{ all -> 0x062b }
        L_0x0136:
            throw r0     // Catch:{ all -> 0x062b }
        L_0x0137:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x062b }
            if (r2 == 0) goto L_0x013f
            throw r2     // Catch:{ all -> 0x062b }
        L_0x013f:
            throw r0     // Catch:{ all -> 0x062b }
        L_0x0140:
            r0 = 0
        L_0x0141:
            int r4 = r0 + 1
            r0 = r3[r0]     // Catch:{ all -> 0x05d5 }
            int r0 = r2.mo9125d(r0)     // Catch:{ all -> 0x05d5 }
            r14 = 4
            r15 = 2
            r10 = 3
            r5 = 12
            r13 = 24
            r8 = 9
            r9 = 27
            r11 = 8
            switch(r0) {
                case -42: goto L_0x05c9;
                case -41: goto L_0x05af;
                case -40: goto L_0x05a6;
                case -39: goto L_0x059d;
                case -38: goto L_0x058d;
                case -37: goto L_0x0589;
                case -36: goto L_0x0580;
                case -35: goto L_0x0570;
                case -34: goto L_0x055e;
                case -33: goto L_0x0554;
                case -32: goto L_0x0551;
                case -31: goto L_0x0545;
                case -30: goto L_0x04d4;
                case -29: goto L_0x0446;
                case -28: goto L_0x0430;
                case -27: goto L_0x042a;
                case -26: goto L_0x0418;
                case -25: goto L_0x03c1;
                case -24: goto L_0x03a1;
                case -23: goto L_0x030a;
                case -22: goto L_0x0304;
                case -21: goto L_0x021f;
                case -20: goto L_0x021b;
                case -19: goto L_0x0217;
                case -18: goto L_0x020d;
                case -17: goto L_0x01f9;
                case -16: goto L_0x01f5;
                case -15: goto L_0x01e2;
                case -14: goto L_0x01d3;
                case -13: goto L_0x01c3;
                case -12: goto L_0x01a7;
                case -11: goto L_0x01a0;
                case -10: goto L_0x019b;
                case -9: goto L_0x0191;
                case -8: goto L_0x018d;
                case -7: goto L_0x017d;
                case -6: goto L_0x017a;
                case -5: goto L_0x0177;
                case -4: goto L_0x0174;
                case -3: goto L_0x016b;
                case -2: goto L_0x0163;
                case -1: goto L_0x0160;
                default: goto L_0x0159;
            }     // Catch:{ all -> 0x05d5 }
        L_0x0159:
            r9 = 18
            r13 = 0
            r15 = 1801(0x709, float:2.524E-42)
            goto L_0x05d2
        L_0x0160:
            r0 = 48
            goto L_0x0141
        L_0x0163:
            boolean r0 = f9516a     // Catch:{ all -> 0x05d5 }
            r2.f10018b = r0     // Catch:{ all -> 0x05d5 }
        L_0x0167:
            r2.mo9125d(r7)     // Catch:{ all -> 0x05d5 }
            goto L_0x0159
        L_0x016b:
            r2.mo9125d(r5)     // Catch:{ all -> 0x05d5 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x05d5 }
            if (r0 != 0) goto L_0x05d2
            r0 = r14
            goto L_0x0141
        L_0x0174:
            r0 = 85
            goto L_0x0141
        L_0x0177:
            r0 = 83
            goto L_0x0141
        L_0x017a:
            r0 = 56
            goto L_0x0141
        L_0x017d:
            r2.f10018b = r7     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r9)     // Catch:{ all -> 0x05d5 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x05d5 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x05d5 }
            m11833e(r0)     // Catch:{ all -> 0x05d5 }
            goto L_0x0159
        L_0x018d:
            m11841i()     // Catch:{ all -> 0x05d5 }
            goto L_0x0159
        L_0x0191:
            java.lang.String r0 = m11769F()     // Catch:{ all -> 0x05d5 }
            r2.f10022f = r0     // Catch:{ all -> 0x05d5 }
        L_0x0197:
            r2.mo9125d(r13)     // Catch:{ all -> 0x05d5 }
            goto L_0x0159
        L_0x019b:
            java.lang.String r0 = f9517b     // Catch:{ all -> 0x05d5 }
            r2.f10022f = r0     // Catch:{ all -> 0x05d5 }
            goto L_0x0197
        L_0x01a0:
            int r0 = m11775I()     // Catch:{ all -> 0x05d5 }
            r2.f10018b = r0     // Catch:{ all -> 0x05d5 }
            goto L_0x0167
        L_0x01a7:
            r2.f10018b = r10     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r9)     // Catch:{ all -> 0x05d5 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x05d5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r9)     // Catch:{ all -> 0x05d5 }
            java.lang.Object r5 = r2.f10026j     // Catch:{ all -> 0x05d5 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r8)     // Catch:{ all -> 0x05d5 }
            int r8 = r2.f10020d     // Catch:{ all -> 0x05d5 }
            m11803ag(r0, r5, r8)     // Catch:{ all -> 0x05d5 }
            goto L_0x0159
        L_0x01c3:
            r2.f10018b = r7     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r9)     // Catch:{ all -> 0x05d5 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x05d5 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x05d5 }
            m11827c((android.content.Context) r0)     // Catch:{ all -> 0x05d5 }
            goto L_0x0159
        L_0x01d3:
            r2.f10018b = r7     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r8)     // Catch:{ all -> 0x05d5 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x05d5 }
            m11812ap(r0)     // Catch:{ all -> 0x05d5 }
            goto L_0x0159
        L_0x01e2:
            r2.f10018b = r7     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r8)     // Catch:{ all -> 0x05d5 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x05d5 }
            if (r0 == 0) goto L_0x01f0
            r0 = r7
            goto L_0x01f1
        L_0x01f0:
            r0 = 0
        L_0x01f1:
            f9516a = r0     // Catch:{ all -> 0x05d5 }
            goto L_0x0159
        L_0x01f5:
            r0 = 70
            goto L_0x0141
        L_0x01f9:
            r2.f10018b = r7     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r9)     // Catch:{ all -> 0x05d5 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x05d5 }
            com.facetec.sdk.as r0 = (com.facetec.sdk.C2798as) r0     // Catch:{ all -> 0x05d5 }
            boolean r0 = r0.mo8848e()     // Catch:{ all -> 0x05d5 }
            r2.f10018b = r0     // Catch:{ all -> 0x05d5 }
            goto L_0x0167
        L_0x020d:
            r2.mo9125d(r5)     // Catch:{ all -> 0x05d5 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x05d5 }
            if (r0 != 0) goto L_0x05d2
            r0 = r13
            goto L_0x0141
        L_0x0217:
            r0 = 25
            goto L_0x0141
        L_0x021b:
            r0 = 35
            goto L_0x0141
        L_0x021f:
            r0 = 34
            int[] r0 = new int[r0]     // Catch:{ all -> 0x05d5 }
            r19 = 2043856359(0x79d2c5e7, float:1.3679953E35)
            r17 = 0
            r0[r17] = r19     // Catch:{ all -> 0x05d5 }
            r19 = -1886529820(0xffffffff8f8dd6e4, float:-1.3986446E-29)
            r0[r7] = r19     // Catch:{ all -> 0x05d5 }
            r19 = -259497028(0xfffffffff08863bc, float:-3.3768426E29)
            r0[r15] = r19     // Catch:{ all -> 0x05d5 }
            r15 = -325026875(0xffffffffeca07bc5, float:-1.552101E27)
            r0[r10] = r15     // Catch:{ all -> 0x05d5 }
            r10 = -1454188964(0xffffffffa952d65c, float:-4.6815294E-14)
            r0[r14] = r10     // Catch:{ all -> 0x05d5 }
            r10 = -556353089(0xffffffffded6b9bf, float:-7.736304E18)
            r14 = 5
            r0[r14] = r10     // Catch:{ all -> 0x05d5 }
            r10 = -494923781(0xffffffffe2800ffb, float:-1.1811674E21)
            r14 = 6
            r0[r14] = r10     // Catch:{ all -> 0x05d5 }
            r10 = 2130457195(0x7efc326b, float:1.6761362E38)
            r14 = 7
            r0[r14] = r10     // Catch:{ all -> 0x05d5 }
            r10 = 1733816581(0x6757f105, float:1.0197548E24)
            r0[r11] = r10     // Catch:{ all -> 0x05d5 }
            r10 = -788055105(0xffffffffd1073bbf, float:-3.6301435E10)
            r0[r8] = r10     // Catch:{ all -> 0x05d5 }
            r8 = 10
            r10 = 1380836493(0x524de48d, float:2.21075685E11)
            r0[r8] = r10     // Catch:{ all -> 0x05d5 }
            r8 = 11
            r10 = 277162113(0x10852881, float:5.2521656E-29)
            r0[r8] = r10     // Catch:{ all -> 0x05d5 }
            r8 = -20436194(0xfffffffffec82b1e, float:-1.3303474E38)
            r0[r5] = r8     // Catch:{ all -> 0x05d5 }
            r5 = 13
            r8 = 1099275871(0x41859e5f, float:16.70233)
            r0[r5] = r8     // Catch:{ all -> 0x05d5 }
            r5 = 14
            r8 = -2057865512(0xffffffff855776d8, float:-1.01310796E-35)
            r0[r5] = r8     // Catch:{ all -> 0x05d5 }
            r5 = 15
            r8 = 1720357574(0x668a92c6, float:3.2719703E23)
            r0[r5] = r8     // Catch:{ all -> 0x05d5 }
            r5 = 16
            r8 = -840428750(0xffffffffcde81332, float:-4.86696512E8)
            r0[r5] = r8     // Catch:{ all -> 0x05d5 }
            r5 = 17
            r8 = 442817821(0x1a64dd1d, float:4.732791E-23)
            r0[r5] = r8     // Catch:{ all -> 0x05d5 }
            r5 = -1060245650(0xffffffffc0cdef6e, float:-6.4354773)
            r8 = 18
            r0[r8] = r5     // Catch:{ all -> 0x0300 }
            r5 = 19
            r8 = -889877030(0xffffffffcaf58dda, float:-8046317.0)
            r0[r5] = r8     // Catch:{ all -> 0x05d5 }
            r5 = -1702996494(0xffffffff9a7e55f2, float:-5.2595395E-23)
            r8 = 20
            r0[r8] = r5     // Catch:{ all -> 0x05d5 }
            r5 = -1168445880(0xffffffffba5aee48, float:-8.351547E-4)
            r8 = 21
            r0[r8] = r5     // Catch:{ all -> 0x05d5 }
            r5 = 22
            r8 = -1693425834(0xffffffff9b105f56, float:-1.1942206E-22)
            r0[r5] = r8     // Catch:{ all -> 0x05d5 }
            r5 = 1418828490(0x54919aca, float:5.0029375E12)
            r8 = 23
            r0[r8] = r5     // Catch:{ all -> 0x05d5 }
            r5 = -1931917481(0xffffffff8cd94757, float:-3.347708E-31)
            r0[r13] = r5     // Catch:{ all -> 0x05d5 }
            r5 = 1245214987(0x4a38790b, float:3022402.8)
            r8 = 25
            r0[r8] = r5     // Catch:{ all -> 0x05d5 }
            r5 = 26
            r8 = 288306906(0x112f36da, float:1.3821968E-28)
            r0[r5] = r8     // Catch:{ all -> 0x05d5 }
            r5 = 745831455(0x2c747c1f, float:3.4743387E-12)
            r0[r9] = r5     // Catch:{ all -> 0x05d5 }
            r5 = 28
            r8 = 1069409061(0x3fbde325, float:1.4834944)
            r0[r5] = r8     // Catch:{ all -> 0x05d5 }
            r5 = 29
            r8 = 577578490(0x226d25fa, float:3.2139594E-18)
            r0[r5] = r8     // Catch:{ all -> 0x05d5 }
            r5 = 30
            r8 = 1671537607(0x63a1a3c7, float:5.9634544E21)
            r0[r5] = r8     // Catch:{ all -> 0x05d5 }
            r5 = 31
            r8 = 125671554(0x77d9882, float:1.9078423E-34)
            r0[r5] = r8     // Catch:{ all -> 0x05d5 }
            r5 = 32
            r8 = 1599754696(0x5f5a51c8, float:1.5731575E19)
            r0[r5] = r8     // Catch:{ all -> 0x05d5 }
            r5 = 33
            r8 = -1745875970(0xffffffff97f00bfe, float:-1.5512664E-24)
            r0[r5] = r8     // Catch:{ all -> 0x05d5 }
            r2.f10022f = r0     // Catch:{ all -> 0x05d5 }
            goto L_0x0197
        L_0x0300:
            r0 = move-exception
            r9 = r8
            goto L_0x05d8
        L_0x0304:
            java.lang.String r0 = ""
            r2.f10022f = r0     // Catch:{ all -> 0x05d5 }
            goto L_0x0197
        L_0x030a:
            r2.f10018b = r10     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r9)     // Catch:{ all -> 0x05d5 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r8)     // Catch:{ all -> 0x05d5 }
            int r5 = r2.f10020d     // Catch:{ all -> 0x05d5 }
            char r5 = (char) r5     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r8)     // Catch:{ all -> 0x05d5 }
            int r8 = r2.f10020d     // Catch:{ all -> 0x05d5 }
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ all -> 0x0398 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0398 }
            r9[r15] = r8     // Catch:{ all -> 0x0398 }
            java.lang.Character r5 = java.lang.Character.valueOf(r5)     // Catch:{ all -> 0x0398 }
            r9[r7] = r5     // Catch:{ all -> 0x0398 }
            r5 = 0
            r9[r5] = r0     // Catch:{ all -> 0x0398 }
            r0 = 1045(0x415, float:1.464E-42)
            short r0 = (short) r0     // Catch:{ all -> 0x0398 }
            int r5 = f9519d     // Catch:{ all -> 0x0398 }
            r5 = r5 & 125(0x7d, float:1.75E-43)
            byte r5 = (byte) r5     // Catch:{ all -> 0x0398 }
            r8 = 4724(0x1274, float:6.62E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0398 }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x0398 }
            m11815as(r0, r5, r8, r11)     // Catch:{ all -> 0x0398 }
            r5 = 0
            r8 = r11[r5]     // Catch:{ all -> 0x0398 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0398 }
            java.lang.Class r5 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0398 }
            r8 = 1060(0x424, float:1.485E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0398 }
            byte[] r11 = f9518c     // Catch:{ all -> 0x0398 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r14 = r11[r13]     // Catch:{ all -> 0x0398 }
            int r14 = r14 + r7
            byte r13 = (byte) r14     // Catch:{ all -> 0x0398 }
            r14 = 3172(0xc64, float:4.445E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0398 }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x0398 }
            m11815as(r8, r13, r14, r15)     // Catch:{ all -> 0x0398 }
            r8 = 0
            r13 = r15[r8]     // Catch:{ all -> 0x0398 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0398 }
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch:{ all -> 0x0398 }
            r10 = 2385(0x951, float:3.342E-42)
            byte r11 = r11[r10]     // Catch:{ all -> 0x0398 }
            int r10 = -r11
            byte r10 = (byte) r10     // Catch:{ all -> 0x0398 }
            r11 = 6235(0x185b, float:8.737E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0398 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0398 }
            m11815as(r0, r10, r11, r14)     // Catch:{ all -> 0x0398 }
            r10 = 0
            r0 = r14[r10]     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0398 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0398 }
            r8[r10] = r0     // Catch:{ all -> 0x0398 }
            java.lang.Class r0 = java.lang.Character.TYPE     // Catch:{ all -> 0x0398 }
            r8[r7] = r0     // Catch:{ all -> 0x0398 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0398 }
            r10 = 2
            r8[r10] = r0     // Catch:{ all -> 0x0398 }
            java.lang.reflect.Method r0 = r5.getMethod(r13, r8)     // Catch:{ all -> 0x0398 }
            r5 = 0
            java.lang.Object r0 = r0.invoke(r5, r9)     // Catch:{ all -> 0x0398 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0398 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0398 }
            r2.f10018b = r0     // Catch:{ all -> 0x05d5 }
            goto L_0x0167
        L_0x0398:
            r0 = move-exception
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x05d5 }
            if (r5 == 0) goto L_0x03a0
            throw r5     // Catch:{ all -> 0x05d5 }
        L_0x03a0:
            throw r0     // Catch:{ all -> 0x05d5 }
        L_0x03a1:
            r0 = r15
            r2.f10018b = r0     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r9)     // Catch:{ all -> 0x05d5 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x05d5 }
            int[] r0 = (int[]) r0     // Catch:{ all -> 0x05d5 }
            r2.mo9125d(r8)     // Catch:{ all -> 0x05d5 }
            int r5 = r2.f10020d     // Catch:{ all -> 0x05d5 }
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x05d5 }
            m11816at(r0, r5, r8)     // Catch:{ all -> 0x05d5 }
            r5 = 0
            r0 = r8[r5]     // Catch:{ all -> 0x05d5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x05d5 }
            r2.f10022f = r0     // Catch:{ all -> 0x05d5 }
            goto L_0x0197
        L_0x03c1:
            r2.f10018b = r7     // Catch:{ all -> 0x0413 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x0413 }
            r2.mo9125d(r9)     // Catch:{ all -> 0x0413 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x0413 }
            byte[] r5 = f9518c     // Catch:{ all -> 0x0408 }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r5[r8]     // Catch:{ all -> 0x0408 }
            int r8 = -r9
            byte r8 = (byte) r8     // Catch:{ all -> 0x0408 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x0408 }
            m11815as(r6, r8, r12, r9)     // Catch:{ all -> 0x0408 }
            r8 = 0
            r9 = r9[r8]     // Catch:{ all -> 0x0408 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0408 }
            java.lang.Class r8 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0408 }
            r9 = 1061(0x425, float:1.487E-42)
            short r9 = (short) r9
            r15 = 1801(0x709, float:2.524E-42)
            byte r5 = r5[r15]     // Catch:{ all -> 0x0406 }
            int r5 = r5 + r7
            byte r5 = (byte) r5     // Catch:{ all -> 0x0406 }
            r10 = 5086(0x13de, float:7.127E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0406 }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x0406 }
            m11815as(r9, r5, r10, r11)     // Catch:{ all -> 0x0406 }
            r5 = 0
            r9 = r11[r5]     // Catch:{ all -> 0x0406 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0406 }
            r5 = 0
            java.lang.reflect.Method r8 = r8.getMethod(r9, r5)     // Catch:{ all -> 0x0406 }
            java.lang.Object r0 = r8.invoke(r0, r5)     // Catch:{ all -> 0x0406 }
            r2.f10022f = r0     // Catch:{ all -> 0x04d0 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x04d0 }
            goto L_0x0441
        L_0x0406:
            r0 = move-exception
            goto L_0x040b
        L_0x0408:
            r0 = move-exception
            r15 = 1801(0x709, float:2.524E-42)
        L_0x040b:
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x04d0 }
            if (r5 == 0) goto L_0x0412
            throw r5     // Catch:{ all -> 0x04d0 }
        L_0x0412:
            throw r0     // Catch:{ all -> 0x04d0 }
        L_0x0413:
            r0 = move-exception
            r15 = 1801(0x709, float:2.524E-42)
            goto L_0x04d1
        L_0x0418:
            r15 = 1801(0x709, float:2.524E-42)
            r2.f10018b = r7     // Catch:{ all -> 0x04d0 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x04d0 }
            r2.mo9125d(r9)     // Catch:{ all -> 0x04d0 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x04d0 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x04d0 }
            com.facetec.sdk.C2797ar.m10878a(r0)     // Catch:{ all -> 0x04d0 }
            goto L_0x0441
        L_0x042a:
            r15 = 1801(0x709, float:2.524E-42)
            r0 = 46
            goto L_0x0141
        L_0x0430:
            r15 = 1801(0x709, float:2.524E-42)
            r2.f10018b = r7     // Catch:{ all -> 0x04d0 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x04d0 }
            r2.mo9125d(r9)     // Catch:{ all -> 0x04d0 }
            java.lang.Object r0 = r2.f10026j     // Catch:{ all -> 0x04d0 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x04d0 }
            com.facetec.sdk.C3330l.m13346d(r0)     // Catch:{ all -> 0x04d0 }
        L_0x0441:
            r9 = 18
        L_0x0443:
            r13 = 0
            goto L_0x05d2
        L_0x0446:
            r0 = 20
            r15 = 1801(0x709, float:2.524E-42)
            int[] r0 = new int[r0]     // Catch:{ all -> 0x04d0 }
            r9 = 114204077(0x6ce9dad, float:7.772027E-35)
            r16 = 0
            r0[r16] = r9     // Catch:{ all -> 0x04d0 }
            r9 = -927273507(0xffffffffc8baeddd, float:-382830.9)
            r0[r7] = r9     // Catch:{ all -> 0x04d0 }
            r9 = -1100864297(0xffffffffbe6224d7, float:-0.22084366)
            r16 = 2
            r0[r16] = r9     // Catch:{ all -> 0x04d0 }
            r9 = -1375504012(0xffffffffae037974, float:-2.9893824E-11)
            r0[r10] = r9     // Catch:{ all -> 0x04d0 }
            r9 = 771631866(0x2dfe2afa, float:2.8895542E-11)
            r0[r14] = r9     // Catch:{ all -> 0x04d0 }
            r9 = -440696447(0xffffffffe5bb8181, float:-1.1068393E23)
            r10 = 5
            r0[r10] = r9     // Catch:{ all -> 0x04d0 }
            r9 = 1212750218(0x4849198a, float:205926.16)
            r10 = 6
            r0[r10] = r9     // Catch:{ all -> 0x04d0 }
            r9 = -2094710888(0xffffffff83253f98, float:-4.8562144E-37)
            r10 = 7
            r0[r10] = r9     // Catch:{ all -> 0x04d0 }
            r9 = 455358135(0x1b2436b7, float:1.3583441E-22)
            r0[r11] = r9     // Catch:{ all -> 0x04d0 }
            r9 = -2140649413(0xffffffff8068483b, float:-9.576803E-39)
            r0[r8] = r9     // Catch:{ all -> 0x04d0 }
            r8 = 10
            r9 = -387415486(0xffffffffe8e88242, float:-8.783935E24)
            r0[r8] = r9     // Catch:{ all -> 0x04d0 }
            r8 = 11
            r9 = -1034733307(0xffffffffc2533905, float:-52.805683)
            r0[r8] = r9     // Catch:{ all -> 0x04d0 }
            r8 = -1537769903(0xffffffffa4577e51, float:-4.6727688E-17)
            r0[r5] = r8     // Catch:{ all -> 0x04d0 }
            r5 = 13
            r8 = -2063315159(0xffffffff85044f29, float:-6.2211496E-36)
            r0[r5] = r8     // Catch:{ all -> 0x04d0 }
            r5 = 14
            r8 = 35805180(0x22257fc, float:1.1927131E-37)
            r0[r5] = r8     // Catch:{ all -> 0x04d0 }
            r5 = 15
            r8 = 601976404(0x23e16e54, float:2.4441275E-17)
            r0[r5] = r8     // Catch:{ all -> 0x04d0 }
            r5 = 16
            r8 = 850202941(0x32ad113d, float:2.014769E-8)
            r0[r5] = r8     // Catch:{ all -> 0x04d0 }
            r5 = 17
            r8 = -1038574628(0xffffffffc2189bdc, float:-38.152206)
            r0[r5] = r8     // Catch:{ all -> 0x04d0 }
            r5 = -1996313083(0xffffffff8902ae05, float:-1.5730004E-33)
            r9 = 18
            r0[r9] = r5     // Catch:{ all -> 0x0541 }
            r5 = 19
            r8 = -62202994(0xfffffffffc4adb8e, float:-4.2131883E36)
            r0[r5] = r8     // Catch:{ all -> 0x0541 }
            r2.f10022f = r0     // Catch:{ all -> 0x0541 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x0541 }
            goto L_0x0443
        L_0x04d0:
            r0 = move-exception
        L_0x04d1:
            r9 = 18
            goto L_0x0542
        L_0x04d4:
            r9 = 18
            r15 = 1801(0x709, float:2.524E-42)
            r2.f10018b = r7     // Catch:{ all -> 0x0541 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x0541 }
            r2.mo9125d(r8)     // Catch:{ all -> 0x0541 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x0541 }
            char r0 = (char) r0
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ all -> 0x0537 }
            java.lang.Character r0 = java.lang.Character.valueOf(r0)     // Catch:{ all -> 0x0537 }
            r8 = 0
            r5[r8] = r0     // Catch:{ all -> 0x0537 }
            r0 = 1038(0x40e, float:1.455E-42)
            short r0 = (short) r0     // Catch:{ all -> 0x0537 }
            int r8 = f9519d     // Catch:{ all -> 0x0537 }
            r8 = r8 & 125(0x7d, float:1.75E-43)
            byte r8 = (byte) r8     // Catch:{ all -> 0x0537 }
            r10 = 5318(0x14c6, float:7.452E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0537 }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x0537 }
            m11815as(r0, r8, r10, r11)     // Catch:{ all -> 0x0537 }
            r8 = 0
            r0 = r11[r8]     // Catch:{ all -> 0x0537 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0537 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0537 }
            r10 = 1058(0x422, float:1.483E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0537 }
            byte[] r11 = f9518c     // Catch:{ all -> 0x0537 }
            byte r11 = r11[r8]     // Catch:{ all -> 0x0537 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0537 }
            r13 = 3141(0xc45, float:4.401E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0537 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0537 }
            m11815as(r10, r11, r13, r14)     // Catch:{ all -> 0x0537 }
            r10 = r14[r8]     // Catch:{ all -> 0x0537 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0537 }
            java.lang.Class[] r11 = new java.lang.Class[r7]     // Catch:{ all -> 0x0537 }
            java.lang.Class r13 = java.lang.Character.TYPE     // Catch:{ all -> 0x0537 }
            r11[r8] = r13     // Catch:{ all -> 0x0537 }
            java.lang.reflect.Method r0 = r0.getMethod(r10, r11)     // Catch:{ all -> 0x0537 }
            r13 = 0
            java.lang.Object r0 = r0.invoke(r13, r5)     // Catch:{ all -> 0x0535 }
            java.lang.Character r0 = (java.lang.Character) r0     // Catch:{ all -> 0x0535 }
            char r0 = r0.charValue()     // Catch:{ all -> 0x0535 }
            r2.f10018b = r0     // Catch:{ all -> 0x05c7 }
        L_0x0530:
            r2.mo9125d(r7)     // Catch:{ all -> 0x05c7 }
            goto L_0x05d2
        L_0x0535:
            r0 = move-exception
            goto L_0x0539
        L_0x0537:
            r0 = move-exception
            r13 = 0
        L_0x0539:
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x05c7 }
            if (r5 == 0) goto L_0x0540
            throw r5     // Catch:{ all -> 0x05c7 }
        L_0x0540:
            throw r0     // Catch:{ all -> 0x05c7 }
        L_0x0541:
            r0 = move-exception
        L_0x0542:
            r13 = 0
            goto L_0x05db
        L_0x0545:
            r9 = 18
            r13 = 0
            r15 = 1801(0x709, float:2.524E-42)
            r2.mo9125d(r14)     // Catch:{ all -> 0x05c7 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x05c7 }
            monitor-exit(r1)
            return r0
        L_0x0551:
            r0 = r7
            goto L_0x0141
        L_0x0554:
            r9 = 18
            r13 = 0
            r15 = 1801(0x709, float:2.524E-42)
            int r0 = f9527n     // Catch:{ all -> 0x05c7 }
            r2.f10018b = r0     // Catch:{ all -> 0x05c7 }
            goto L_0x0530
        L_0x055e:
            r9 = 18
            r13 = 0
            r15 = 1801(0x709, float:2.524E-42)
            r2.f10018b = r7     // Catch:{ all -> 0x05c7 }
            r2.mo9125d(r11)     // Catch:{ all -> 0x05c7 }
            r2.mo9125d(r8)     // Catch:{ all -> 0x05c7 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x05c7 }
            f9526m = r0     // Catch:{ all -> 0x05c7 }
            goto L_0x05d2
        L_0x0570:
            r9 = 18
            r13 = 0
            r15 = 1801(0x709, float:2.524E-42)
            r2.mo9125d(r5)     // Catch:{ all -> 0x05c7 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x05c7 }
            if (r0 != 0) goto L_0x05d2
            r0 = 68
            goto L_0x0141
        L_0x0580:
            r9 = 18
            r13 = 0
            r15 = 1801(0x709, float:2.524E-42)
            r0 = 69
            goto L_0x0141
        L_0x0589:
            r10 = 5
            r0 = r10
            goto L_0x0141
        L_0x058d:
            r9 = 18
            r13 = 0
            r15 = 1801(0x709, float:2.524E-42)
            r2.mo9125d(r5)     // Catch:{ all -> 0x05c7 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x05c7 }
            if (r0 != 0) goto L_0x05d2
            r0 = 80
            goto L_0x0141
        L_0x059d:
            r9 = 18
            r13 = 0
            r15 = 1801(0x709, float:2.524E-42)
            r0 = 81
            goto L_0x0141
        L_0x05a6:
            r9 = 18
            r13 = 0
            r15 = 1801(0x709, float:2.524E-42)
            r0 = 52
            goto L_0x0141
        L_0x05af:
            r0 = 20
            r9 = 18
            r13 = 0
            r15 = 1801(0x709, float:2.524E-42)
            r2.mo9125d(r0)     // Catch:{ all -> 0x05c7 }
            int r0 = r2.f10020d     // Catch:{ all -> 0x05c7 }
            if (r0 == 0) goto L_0x05c4
            if (r0 == r7) goto L_0x05c0
            goto L_0x05c4
        L_0x05c0:
            r0 = 58
            goto L_0x0141
        L_0x05c4:
            r0 = 7
            goto L_0x0141
        L_0x05c7:
            r0 = move-exception
            goto L_0x05db
        L_0x05c9:
            r9 = 18
            r13 = 0
            r15 = 1801(0x709, float:2.524E-42)
            r0 = 82
            goto L_0x0141
        L_0x05d2:
            r0 = r4
            goto L_0x0141
        L_0x05d5:
            r0 = move-exception
            r9 = 18
        L_0x05d8:
            r13 = 0
            r15 = 1801(0x709, float:2.524E-42)
        L_0x05db:
            boolean r5 = r0 instanceof com.facetec.sdk.C2798as     // Catch:{ all -> 0x062b }
            if (r5 == 0) goto L_0x05ee
            r5 = 7
            if (r4 < r5) goto L_0x05ee
            r5 = 21
            if (r4 > r5) goto L_0x05ee
            r4 = 21
            r5 = 0
            r8 = 21
            r10 = 2385(0x951, float:3.342E-42)
            goto L_0x0619
        L_0x05ee:
            r5 = 1048(0x418, float:1.469E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x062b }
            byte[] r8 = f9518c     // Catch:{ all -> 0x062b }
            r10 = 2385(0x951, float:3.342E-42)
            byte r8 = r8[r10]     // Catch:{ all -> 0x062b }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x062b }
            r11 = 5921(0x1721, float:8.297E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x062b }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x062b }
            m11815as(r5, r8, r11, r14)     // Catch:{ all -> 0x062b }
            r5 = 0
            r8 = r14[r5]     // Catch:{ all -> 0x062b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x062b }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x062b }
            boolean r8 = r8.isInstance(r0)     // Catch:{ all -> 0x062b }
            if (r8 == 0) goto L_0x0621
            r8 = 7
            if (r4 < r8) goto L_0x0621
            r8 = 21
            if (r4 > r8) goto L_0x0621
            r4 = 36
        L_0x0619:
            r2.f10022f = r0     // Catch:{ all -> 0x062b }
            r11 = 23
            r2.mo9125d(r11)     // Catch:{ all -> 0x062b }
            goto L_0x05d2
        L_0x0621:
            throw r0     // Catch:{ all -> 0x062b }
        L_0x0622:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x062b }
            if (r2 == 0) goto L_0x062a
            throw r2     // Catch:{ all -> 0x062b }
        L_0x062a:
            throw r0     // Catch:{ all -> 0x062b }
        L_0x062b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11830d(android.content.Context):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0460, code lost:
        r10.mo9125d(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0b66, code lost:
        r10.mo9125d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0bd2, code lost:
        r17 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0bf3, code lost:
        r2 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01a1, code lost:
        r10.mo9125d(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01fc, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02df, code lost:
        r10.mo9125d(1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04ff A[Catch:{ all -> 0x09cf, all -> 0x0982, all -> 0x0921, all -> 0x0815, all -> 0x07cb, all -> 0x0742, all -> 0x06b6, all -> 0x0607, all -> 0x058e, all -> 0x0465, all -> 0x03e9, all -> 0x039e, all -> 0x0350, all -> 0x02e4, all -> 0x028d, all -> 0x01e6, all -> 0x01a5, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0500 A[Catch:{ all -> 0x09cf, all -> 0x0982, all -> 0x0921, all -> 0x0815, all -> 0x07cb, all -> 0x0742, all -> 0x06b6, all -> 0x0607, all -> 0x058e, all -> 0x0465, all -> 0x03e9, all -> 0x039e, all -> 0x0350, all -> 0x02e4, all -> 0x028d, all -> 0x01e6, all -> 0x01a5, all -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0b2a A[Catch:{ all -> 0x0b1f, all -> 0x0c11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0b2b A[Catch:{ all -> 0x0b1f, all -> 0x0c11 }] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0c76 A[Catch:{ all -> 0x0d0f, all -> 0x013b, all -> 0x0131, all -> 0x0d19 }] */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0c77 A[Catch:{ all -> 0x0d0f, all -> 0x013b, all -> 0x0131, all -> 0x0d19 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static synchronized void m11833e(android.content.Context r18) {
        /*
            java.lang.Class<com.facetec.sdk.cd> r1 = com.facetec.sdk.C2885cd.class
            monitor-enter(r1)
            com.facetec.sdk.do r2 = new com.facetec.sdk.do     // Catch:{ all -> 0x0d19 }
            r3 = r18
            r2.<init>((java.lang.Object) r3)     // Catch:{ all -> 0x0d19 }
            r3 = 370(0x172, float:5.18E-43)
            short r3 = (short) r3     // Catch:{ all -> 0x0d19 }
            byte[] r4 = f9518c     // Catch:{ all -> 0x0d19 }
            r5 = 21
            byte r5 = r4[r5]     // Catch:{ all -> 0x0d19 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x0d19 }
            r6 = r5 | 4110(0x100e, float:5.76E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0d19 }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0d19 }
            m11815as(r3, r5, r6, r8)     // Catch:{ all -> 0x0d19 }
            r3 = 0
            r5 = r8[r3]     // Catch:{ all -> 0x0d19 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0d19 }
            r6 = 1066(0x42a, float:1.494E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0d19 }
            r8 = 18
            byte r8 = r4[r8]     // Catch:{ all -> 0x0d19 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0d19 }
            r9 = r8 | 6193(0x1831, float:8.678E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0d19 }
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x0d19 }
            m11815as(r6, r8, r9, r10)     // Catch:{ all -> 0x0d19 }
            r6 = r10[r3]     // Catch:{ all -> 0x0d19 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0d19 }
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0d0f }
            r8[r3] = r6     // Catch:{ all -> 0x0d0f }
            r6 = 1051(0x41b, float:1.473E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0d0f }
            r9 = 2385(0x951, float:3.342E-42)
            byte r10 = r4[r9]     // Catch:{ all -> 0x0d0f }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x0d0f }
            r11 = 5290(0x14aa, float:7.413E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0d0f }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x0d0f }
            m11815as(r6, r10, r11, r12)     // Catch:{ all -> 0x0d0f }
            r10 = r12[r3]     // Catch:{ all -> 0x0d0f }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0d0f }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0d0f }
            r12 = 1062(0x426, float:1.488E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0d0f }
            r13 = 3127(0xc37, float:4.382E-42)
            byte r13 = r4[r13]     // Catch:{ all -> 0x0d0f }
            int r13 = r13 + r7
            byte r13 = (byte) r13     // Catch:{ all -> 0x0d0f }
            r14 = 4131(0x1023, float:5.789E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0d0f }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x0d0f }
            m11815as(r12, r13, r14, r15)     // Catch:{ all -> 0x0d0f }
            r12 = r15[r3]     // Catch:{ all -> 0x0d0f }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0d0f }
            java.lang.Class[] r13 = new java.lang.Class[r7]     // Catch:{ all -> 0x0d0f }
            byte r4 = r4[r9]     // Catch:{ all -> 0x0d0f }
            int r4 = -r4
            byte r4 = (byte) r4     // Catch:{ all -> 0x0d0f }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0d0f }
            m11815as(r6, r4, r11, r14)     // Catch:{ all -> 0x0d0f }
            r4 = r14[r3]     // Catch:{ all -> 0x0d0f }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0d0f }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0d0f }
            r13[r3] = r4     // Catch:{ all -> 0x0d0f }
            java.lang.reflect.Method r4 = r10.getMethod(r12, r13)     // Catch:{ all -> 0x0d0f }
            java.lang.Object r4 = r4.invoke(r5, r8)     // Catch:{ all -> 0x0d0f }
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch:{ all -> 0x0d0f }
            int r5 = r4.length     // Catch:{ all -> 0x0d19 }
            int[] r5 = new int[r5]     // Catch:{ all -> 0x0d19 }
            r8 = r3
        L_0x008b:
            int r10 = r4.length     // Catch:{ all -> 0x0d19 }
            r12 = 1050(0x41a, float:1.471E-42)
            if (r8 >= r10) goto L_0x0145
            r10 = r4[r8]     // Catch:{ all -> 0x0d19 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x013b }
            r14[r3] = r10     // Catch:{ all -> 0x013b }
            short r10 = (short) r12     // Catch:{ all -> 0x013b }
            byte[] r12 = f9518c     // Catch:{ all -> 0x013b }
            byte r15 = r12[r9]     // Catch:{ all -> 0x013b }
            int r15 = -r15
            byte r15 = (byte) r15     // Catch:{ all -> 0x013b }
            int r13 = f9519d     // Catch:{ all -> 0x013b }
            r9 = r13 | 6720(0x1a40, float:9.417E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x013b }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x013b }
            m11815as(r10, r15, r9, r3)     // Catch:{ all -> 0x013b }
            r9 = 0
            r3 = r3[r9]     // Catch:{ all -> 0x013b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x013b }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x013b }
            r9 = 1060(0x424, float:1.485E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x013b }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x013b }
            r16 = r4
            r4 = 1465(0x5b9, float:2.053E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x013b }
            r17 = r2
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ all -> 0x013b }
            m11815as(r9, r15, r4, r2)     // Catch:{ all -> 0x013b }
            r4 = 0
            r2 = r2[r4]     // Catch:{ all -> 0x013b }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x013b }
            java.lang.Class[] r4 = new java.lang.Class[r7]     // Catch:{ all -> 0x013b }
            r9 = 2385(0x951, float:3.342E-42)
            byte r15 = r12[r9]     // Catch:{ all -> 0x013b }
            int r9 = -r15
            byte r9 = (byte) r9     // Catch:{ all -> 0x013b }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x013b }
            m11815as(r6, r9, r11, r15)     // Catch:{ all -> 0x013b }
            r9 = 0
            r15 = r15[r9]     // Catch:{ all -> 0x013b }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x013b }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x013b }
            r4[r9] = r15     // Catch:{ all -> 0x013b }
            java.lang.reflect.Method r2 = r3.getMethod(r2, r4)     // Catch:{ all -> 0x013b }
            r3 = 0
            java.lang.Object r2 = r2.invoke(r3, r14)     // Catch:{ all -> 0x013b }
            r3 = 2385(0x951, float:3.342E-42)
            byte r4 = r12[r3]     // Catch:{ all -> 0x0131 }
            int r3 = -r4
            byte r3 = (byte) r3     // Catch:{ all -> 0x0131 }
            r4 = r13 | 6720(0x1a40, float:9.417E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x0131 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x0131 }
            m11815as(r10, r3, r4, r9)     // Catch:{ all -> 0x0131 }
            r3 = 0
            r4 = r9[r3]     // Catch:{ all -> 0x0131 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0131 }
            java.lang.Class r3 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0131 }
            r4 = 1059(0x423, float:1.484E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x0131 }
            r9 = 1801(0x709, float:2.524E-42)
            byte r9 = r12[r9]     // Catch:{ all -> 0x0131 }
            int r9 = r9 + r7
            byte r9 = (byte) r9     // Catch:{ all -> 0x0131 }
            r10 = 1459(0x5b3, float:2.044E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0131 }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x0131 }
            m11815as(r4, r9, r10, r12)     // Catch:{ all -> 0x0131 }
            r4 = 0
            r9 = r12[r4]     // Catch:{ all -> 0x0131 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0131 }
            r4 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r9, r4)     // Catch:{ all -> 0x0131 }
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch:{ all -> 0x0131 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0131 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0131 }
            r5[r8] = r2     // Catch:{ all -> 0x0d19 }
            int r8 = r8 + 1
            r4 = r16
            r2 = r17
            r3 = 0
            r9 = 2385(0x951, float:3.342E-42)
            goto L_0x008b
        L_0x0131:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x0d19 }
            if (r3 == 0) goto L_0x013a
            throw r3     // Catch:{ all -> 0x0d19 }
        L_0x013a:
            throw r2     // Catch:{ all -> 0x0d19 }
        L_0x013b:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x0d19 }
            if (r3 == 0) goto L_0x0144
            throw r3     // Catch:{ all -> 0x0d19 }
        L_0x0144:
            throw r2     // Catch:{ all -> 0x0d19 }
        L_0x0145:
            r17 = r2
            r2 = 0
        L_0x0148:
            int r3 = r2 + 1
            r2 = r5[r2]     // Catch:{ all -> 0x0c20 }
            r10 = r17
            int r2 = r10.mo9125d(r2)     // Catch:{ all -> 0x0c1e }
            r15 = 4648(0x1228, float:6.513E-42)
            r8 = 1055(0x41f, float:1.478E-42)
            r13 = 12
            r4 = 24
            r9 = 27
            r14 = 8
            switch(r2) {
                case -75: goto L_0x0c13;
                case -74: goto L_0x0bfd;
                case -73: goto L_0x0bf9;
                case -72: goto L_0x0be9;
                case -71: goto L_0x0be5;
                case -70: goto L_0x0be1;
                case -69: goto L_0x0bd6;
                case -68: goto L_0x0bd1;
                case -67: goto L_0x0bcd;
                case -66: goto L_0x0bc2;
                case -65: goto L_0x0bb2;
                case -64: goto L_0x0bac;
                case -63: goto L_0x0ba7;
                case -62: goto L_0x0ba2;
                case -61: goto L_0x0b94;
                case -60: goto L_0x0b8f;
                case -59: goto L_0x0b8a;
                case -58: goto L_0x0b7c;
                case -57: goto L_0x0b6b;
                case -56: goto L_0x0b61;
                case -55: goto L_0x0b5f;
                case -54: goto L_0x0b5a;
                case -53: goto L_0x0b4f;
                case -52: goto L_0x0b2c;
                case -51: goto L_0x0aaa;
                case -50: goto L_0x0a01;
                case -49: goto L_0x09fd;
                case -48: goto L_0x09f9;
                case -47: goto L_0x09d9;
                case -46: goto L_0x098c;
                case -45: goto L_0x093c;
                case -44: goto L_0x092b;
                case -43: goto L_0x087e;
                case -42: goto L_0x081f;
                case -41: goto L_0x07d5;
                case -40: goto L_0x074c;
                case -39: goto L_0x06f8;
                case -38: goto L_0x06e4;
                case -37: goto L_0x06c0;
                case -36: goto L_0x0648;
                case -35: goto L_0x0611;
                case -34: goto L_0x05c2;
                case -33: goto L_0x0598;
                case -32: goto L_0x050a;
                case -31: goto L_0x0501;
                case -30: goto L_0x0476;
                case -29: goto L_0x046f;
                case -28: goto L_0x03f3;
                case -27: goto L_0x03a8;
                case -26: goto L_0x035a;
                case -25: goto L_0x0327;
                case -24: goto L_0x0323;
                case -23: goto L_0x031f;
                case -22: goto L_0x0312;
                case -21: goto L_0x0302;
                case -20: goto L_0x02fe;
                case -19: goto L_0x02fa;
                case -18: goto L_0x02ee;
                case -17: goto L_0x0297;
                case -16: goto L_0x0242;
                case -15: goto L_0x023c;
                case -14: goto L_0x0236;
                case -13: goto L_0x022b;
                case -12: goto L_0x0227;
                case -11: goto L_0x0223;
                case -10: goto L_0x0216;
                case -9: goto L_0x0211;
                case -8: goto L_0x020d;
                case -7: goto L_0x0209;
                case -6: goto L_0x0204;
                case -5: goto L_0x01ff;
                case -4: goto L_0x01f0;
                case -3: goto L_0x01af;
                case -2: goto L_0x0168;
                case -1: goto L_0x0164;
                default: goto L_0x0161;
            }
        L_0x0161:
            r4 = 0
            goto L_0x0c17
        L_0x0164:
            r2 = 124(0x7c, float:1.74E-43)
            goto L_0x0bd2
        L_0x0168:
            short r2 = (short) r12
            int r8 = f9519d     // Catch:{ all -> 0x01a5 }
            r8 = r8 & 125(0x7d, float:1.75E-43)
            byte r8 = (byte) r8     // Catch:{ all -> 0x01a5 }
            r9 = 6500(0x1964, float:9.108E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x01a5 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x01a5 }
            m11815as(r2, r8, r9, r13)     // Catch:{ all -> 0x01a5 }
            r2 = 0
            r8 = r13[r2]     // Catch:{ all -> 0x01a5 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01a5 }
            java.lang.Class r2 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x01a5 }
            r8 = 1059(0x423, float:1.484E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x01a5 }
            byte[] r9 = f9518c     // Catch:{ all -> 0x01a5 }
            r13 = 2124(0x84c, float:2.976E-42)
            byte r9 = r9[r13]     // Catch:{ all -> 0x01a5 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x01a5 }
            r13 = 2067(0x813, float:2.896E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x01a5 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x01a5 }
            m11815as(r8, r9, r13, r14)     // Catch:{ all -> 0x01a5 }
            r8 = 0
            r9 = r14[r8]     // Catch:{ all -> 0x01a5 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01a5 }
            r8 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r9, r8)     // Catch:{ all -> 0x01a5 }
            java.lang.Object r2 = r2.invoke(r8, r8)     // Catch:{ all -> 0x01a5 }
            r10.f10022f = r2     // Catch:{ all -> 0x0aa5 }
        L_0x01a1:
            r10.mo9125d(r4)     // Catch:{ all -> 0x0aa5 }
            goto L_0x0161
        L_0x01a5:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x01ae
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x01ae:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x01af:
            short r2 = (short) r12
            int r8 = f9519d     // Catch:{ all -> 0x01e6 }
            r8 = r8 & 125(0x7d, float:1.75E-43)
            byte r8 = (byte) r8     // Catch:{ all -> 0x01e6 }
            r9 = 6500(0x1964, float:9.108E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x01e6 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x01e6 }
            m11815as(r2, r8, r9, r13)     // Catch:{ all -> 0x01e6 }
            r2 = 0
            r8 = r13[r2]     // Catch:{ all -> 0x01e6 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01e6 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x01e6 }
            r9 = 1054(0x41e, float:1.477E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x01e6 }
            byte[] r13 = f9518c     // Catch:{ all -> 0x01e6 }
            byte r13 = r13[r2]     // Catch:{ all -> 0x01e6 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x01e6 }
            r14 = 1683(0x693, float:2.358E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x01e6 }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x01e6 }
            m11815as(r9, r13, r14, r15)     // Catch:{ all -> 0x01e6 }
            r9 = r15[r2]     // Catch:{ all -> 0x01e6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01e6 }
            r2 = 0
            java.lang.reflect.Method r8 = r8.getMethod(r9, r2)     // Catch:{ all -> 0x01e6 }
            java.lang.Object r8 = r8.invoke(r2, r2)     // Catch:{ all -> 0x01e6 }
            r10.f10022f = r8     // Catch:{ all -> 0x0aa5 }
            goto L_0x01a1
        L_0x01e6:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x01ef
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x01ef:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x01f0:
            r2 = 171(0xab, float:2.4E-43)
            r10.mo9125d(r2)     // Catch:{ all -> 0x0aa5 }
            int r2 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            if (r2 != 0) goto L_0x01fc
            r2 = 5
            goto L_0x0bd2
        L_0x01fc:
            r2 = r3
            goto L_0x0bd2
        L_0x01ff:
            r17 = r10
            r2 = 6
            goto L_0x0148
        L_0x0204:
            r17 = r10
            r2 = r14
            goto L_0x0148
        L_0x0209:
            r2 = 169(0xa9, float:2.37E-43)
            goto L_0x0bd2
        L_0x020d:
            r2 = 10
            goto L_0x0bd2
        L_0x0211:
            java.lang.String r2 = f9517b     // Catch:{ all -> 0x0aa5 }
            r10.f10022f = r2     // Catch:{ all -> 0x0aa5 }
            goto L_0x01a1
        L_0x0216:
            r2 = 156(0x9c, float:2.19E-43)
            r10.mo9125d(r2)     // Catch:{ all -> 0x0aa5 }
            int r2 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            if (r2 != 0) goto L_0x01fc
            r2 = 14
            goto L_0x0bd2
        L_0x0223:
            r2 = 183(0xb7, float:2.56E-43)
            goto L_0x0bd2
        L_0x0227:
            r2 = 181(0xb5, float:2.54E-43)
            goto L_0x0bd2
        L_0x022b:
            r10.mo9125d(r13)     // Catch:{ all -> 0x0aa5 }
            int r2 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            if (r2 != 0) goto L_0x01fc
            r2 = 18
            goto L_0x0bd2
        L_0x0236:
            r17 = r10
            r2 = 19
            goto L_0x0148
        L_0x023c:
            r17 = r10
            r2 = 28
            goto L_0x0148
        L_0x0242:
            r10.f10018b = r7     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x028d }
            r13 = 0
            r9[r13] = r2     // Catch:{ all -> 0x028d }
            short r2 = (short) r8     // Catch:{ all -> 0x028d }
            byte[] r8 = f9518c     // Catch:{ all -> 0x028d }
            r13 = 2385(0x951, float:3.342E-42)
            byte r14 = r8[r13]     // Catch:{ all -> 0x028d }
            int r13 = -r14
            byte r13 = (byte) r13     // Catch:{ all -> 0x028d }
            short r14 = (short) r15     // Catch:{ all -> 0x028d }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x028d }
            m11815as(r2, r13, r14, r15)     // Catch:{ all -> 0x028d }
            r2 = 0
            r13 = r15[r2]     // Catch:{ all -> 0x028d }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x028d }
            java.lang.Class r2 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x028d }
            java.lang.Class[] r13 = new java.lang.Class[r7]     // Catch:{ all -> 0x028d }
            r14 = 2385(0x951, float:3.342E-42)
            byte r8 = r8[r14]     // Catch:{ all -> 0x028d }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x028d }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x028d }
            m11815as(r6, r8, r11, r14)     // Catch:{ all -> 0x028d }
            r8 = 0
            r14 = r14[r8]     // Catch:{ all -> 0x028d }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x028d }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x028d }
            r13[r8] = r14     // Catch:{ all -> 0x028d }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r13)     // Catch:{ all -> 0x028d }
            java.lang.Object r2 = r2.newInstance(r9)     // Catch:{ all -> 0x028d }
            r10.f10022f = r2     // Catch:{ all -> 0x0aa5 }
            goto L_0x01a1
        L_0x028d:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x0296
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x0296:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x0297:
            r10.f10018b = r7     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            short r4 = (short) r8
            byte[] r8 = f9518c     // Catch:{ all -> 0x02e4 }
            r9 = 2385(0x951, float:3.342E-42)
            byte r13 = r8[r9]     // Catch:{ all -> 0x02e4 }
            int r9 = -r13
            byte r9 = (byte) r9     // Catch:{ all -> 0x02e4 }
            short r13 = (short) r15     // Catch:{ all -> 0x02e4 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x02e4 }
            m11815as(r4, r9, r13, r14)     // Catch:{ all -> 0x02e4 }
            r4 = 0
            r9 = r14[r4]     // Catch:{ all -> 0x02e4 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x02e4 }
            java.lang.Class r4 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x02e4 }
            r9 = 1061(0x425, float:1.487E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x02e4 }
            r13 = 1785(0x6f9, float:2.501E-42)
            byte r8 = r8[r13]     // Catch:{ all -> 0x02e4 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x02e4 }
            r13 = 4465(0x1171, float:6.257E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x02e4 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x02e4 }
            m11815as(r9, r8, r13, r14)     // Catch:{ all -> 0x02e4 }
            r8 = 0
            r9 = r14[r8]     // Catch:{ all -> 0x02e4 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x02e4 }
            r8 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r9, r8)     // Catch:{ all -> 0x02e4 }
            java.lang.Object r2 = r4.invoke(r2, r8)     // Catch:{ all -> 0x02e4 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x02e4 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x02e4 }
            r10.f10018b = r2     // Catch:{ all -> 0x0aa5 }
        L_0x02df:
            r10.mo9125d(r7)     // Catch:{ all -> 0x0aa5 }
            goto L_0x0161
        L_0x02e4:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x02ed
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x02ed:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x02ee:
            r2 = 15
            r10.mo9125d(r2)     // Catch:{ all -> 0x0aa5 }
            int r2 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            if (r2 != 0) goto L_0x01fc
            r2 = r4
            goto L_0x0bd2
        L_0x02fa:
            r2 = 188(0xbc, float:2.63E-43)
            goto L_0x0bd2
        L_0x02fe:
            r2 = 186(0xba, float:2.6E-43)
            goto L_0x0bd2
        L_0x0302:
            r10.f10018b = r7     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0aa5 }
            f9517b = r2     // Catch:{ all -> 0x0aa5 }
            goto L_0x0161
        L_0x0312:
            r2 = 166(0xa6, float:2.33E-43)
            r10.mo9125d(r2)     // Catch:{ all -> 0x0aa5 }
            int r2 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            if (r2 != 0) goto L_0x01fc
            r2 = 31
            goto L_0x0bd2
        L_0x031f:
            r2 = 32
            goto L_0x0bd2
        L_0x0323:
            r2 = 111(0x6f, float:1.56E-43)
            goto L_0x0bd2
        L_0x0327:
            r2 = 1044(0x414, float:1.463E-42)
            short r2 = (short) r2
            byte[] r8 = f9518c     // Catch:{ all -> 0x0350 }
            r9 = 2385(0x951, float:3.342E-42)
            byte r8 = r8[r9]     // Catch:{ all -> 0x0350 }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0350 }
            r9 = 6170(0x181a, float:8.646E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0350 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0350 }
            m11815as(r2, r8, r9, r13)     // Catch:{ all -> 0x0350 }
            r2 = 0
            r8 = r13[r2]     // Catch:{ all -> 0x0350 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0350 }
            java.lang.Class r2 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0350 }
            r8 = 0
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r8)     // Catch:{ all -> 0x0350 }
            java.lang.Object r2 = r2.newInstance(r8)     // Catch:{ all -> 0x0350 }
            r10.f10022f = r2     // Catch:{ all -> 0x0aa5 }
            goto L_0x01a1
        L_0x0350:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x0359
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x0359:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x035a:
            r10.f10018b = r7     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            r8 = 1044(0x414, float:1.463E-42)
            short r8 = (short) r8
            int r9 = f9519d     // Catch:{ all -> 0x039e }
            r9 = r9 & 125(0x7d, float:1.75E-43)
            byte r9 = (byte) r9     // Catch:{ all -> 0x039e }
            r13 = r9 | 1864(0x748, float:2.612E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x039e }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x039e }
            m11815as(r8, r9, r13, r14)     // Catch:{ all -> 0x039e }
            r8 = 0
            r9 = r14[r8]     // Catch:{ all -> 0x039e }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x039e }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x039e }
            r13 = 1056(0x420, float:1.48E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x039e }
            byte[] r14 = f9518c     // Catch:{ all -> 0x039e }
            byte r14 = r14[r8]     // Catch:{ all -> 0x039e }
            byte r14 = (byte) r14     // Catch:{ all -> 0x039e }
            r15 = 6245(0x1865, float:8.751E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x039e }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x039e }
            m11815as(r13, r14, r15, r12)     // Catch:{ all -> 0x039e }
            r12 = r12[r8]     // Catch:{ all -> 0x039e }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x039e }
            r8 = 0
            java.lang.reflect.Method r9 = r9.getMethod(r12, r8)     // Catch:{ all -> 0x039e }
            java.lang.Object r2 = r9.invoke(r2, r8)     // Catch:{ all -> 0x039e }
            r10.f10022f = r2     // Catch:{ all -> 0x0aa5 }
            goto L_0x01a1
        L_0x039e:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x03a7
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x03a7:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x03a8:
            r10.f10018b = r7     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            short r8 = (short) r8
            byte[] r9 = f9518c     // Catch:{ all -> 0x03e9 }
            r12 = 2385(0x951, float:3.342E-42)
            byte r13 = r9[r12]     // Catch:{ all -> 0x03e9 }
            int r12 = -r13
            byte r12 = (byte) r12     // Catch:{ all -> 0x03e9 }
            short r13 = (short) r15     // Catch:{ all -> 0x03e9 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x03e9 }
            m11815as(r8, r12, r13, r14)     // Catch:{ all -> 0x03e9 }
            r8 = 0
            r12 = r14[r8]     // Catch:{ all -> 0x03e9 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x03e9 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x03e9 }
            r13 = 1060(0x424, float:1.485E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x03e9 }
            byte r9 = r9[r8]     // Catch:{ all -> 0x03e9 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x03e9 }
            r14 = 6484(0x1954, float:9.086E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x03e9 }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x03e9 }
            m11815as(r13, r9, r14, r15)     // Catch:{ all -> 0x03e9 }
            r9 = r15[r8]     // Catch:{ all -> 0x03e9 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x03e9 }
            r8 = 0
            java.lang.reflect.Method r9 = r12.getMethod(r9, r8)     // Catch:{ all -> 0x03e9 }
            java.lang.Object r2 = r9.invoke(r2, r8)     // Catch:{ all -> 0x03e9 }
            r10.f10022f = r2     // Catch:{ all -> 0x0aa5 }
            goto L_0x01a1
        L_0x03e9:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x03f2
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x03f2:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x03f3:
            r2 = 2
            r10.f10018b = r2     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r8 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x0465 }
            r12 = 0
            r9[r12] = r8     // Catch:{ all -> 0x0465 }
            r8 = 1044(0x414, float:1.463E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0465 }
            byte[] r12 = f9518c     // Catch:{ all -> 0x0465 }
            r13 = 2385(0x951, float:3.342E-42)
            byte r14 = r12[r13]     // Catch:{ all -> 0x0465 }
            int r13 = -r14
            byte r13 = (byte) r13     // Catch:{ all -> 0x0465 }
            r14 = 6170(0x181a, float:8.646E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0465 }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x0465 }
            m11815as(r8, r13, r14, r15)     // Catch:{ all -> 0x0465 }
            r8 = 0
            r13 = r15[r8]     // Catch:{ all -> 0x0465 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0465 }
            java.lang.Class r8 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x0465 }
            r13 = 1061(0x425, float:1.487E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0465 }
            int r14 = f9519d     // Catch:{ all -> 0x0465 }
            r14 = r14 & 125(0x7d, float:1.75E-43)
            byte r14 = (byte) r14     // Catch:{ all -> 0x0465 }
            r15 = 582(0x246, float:8.16E-43)
            byte r15 = r12[r15]     // Catch:{ all -> 0x0465 }
            int r15 = -r15
            short r15 = (short) r15     // Catch:{ all -> 0x0465 }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ all -> 0x0465 }
            m11815as(r13, r14, r15, r4)     // Catch:{ all -> 0x0465 }
            r13 = 0
            r4 = r4[r13]     // Catch:{ all -> 0x0465 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0465 }
            java.lang.Class[] r13 = new java.lang.Class[r7]     // Catch:{ all -> 0x0465 }
            r14 = 2385(0x951, float:3.342E-42)
            byte r12 = r12[r14]     // Catch:{ all -> 0x0465 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x0465 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0465 }
            m11815as(r6, r12, r11, r14)     // Catch:{ all -> 0x0465 }
            r12 = 0
            r14 = r14[r12]     // Catch:{ all -> 0x0465 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0465 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0465 }
            r13[r12] = r14     // Catch:{ all -> 0x0465 }
            java.lang.reflect.Method r4 = r8.getMethod(r4, r13)     // Catch:{ all -> 0x0465 }
            java.lang.Object r2 = r4.invoke(r2, r9)     // Catch:{ all -> 0x0465 }
            r10.f10022f = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 24
        L_0x0460:
            r10.mo9125d(r2)     // Catch:{ all -> 0x0aa5 }
            goto L_0x0161
        L_0x0465:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x046e
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x046e:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x046f:
            java.lang.String r2 = "㗥"
            r10.f10022f = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 24
            goto L_0x0460
        L_0x0476:
            r2 = 3
            r10.f10018b = r2     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r2 = 9
            r10.mo9125d(r2)     // Catch:{ all -> 0x0aa5 }
            int r4 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r2)     // Catch:{ all -> 0x0aa5 }
            int r8 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r2)     // Catch:{ all -> 0x0aa5 }
            int r2 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            r9 = 3
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ all -> 0x04f5 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x04f5 }
            r9 = 2
            r12[r9] = r2     // Catch:{ all -> 0x04f5 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x04f5 }
            r12[r7] = r2     // Catch:{ all -> 0x04f5 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x04f5 }
            r4 = 0
            r12[r4] = r2     // Catch:{ all -> 0x04f5 }
            r2 = 1050(0x41a, float:1.471E-42)
            short r4 = (short) r2
            int r8 = f9519d     // Catch:{ all -> 0x04f3 }
            r8 = r8 & 125(0x7d, float:1.75E-43)
            byte r8 = (byte) r8     // Catch:{ all -> 0x04f3 }
            r9 = 4127(0x101f, float:5.783E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x04f3 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x04f3 }
            m11815as(r4, r8, r9, r13)     // Catch:{ all -> 0x04f3 }
            r4 = 0
            r8 = r13[r4]     // Catch:{ all -> 0x04f3 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x04f3 }
            java.lang.Class r4 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x04f3 }
            r8 = 1048(0x418, float:1.469E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x04f3 }
            byte[] r9 = f9518c     // Catch:{ all -> 0x04f3 }
            r13 = 3127(0xc37, float:4.382E-42)
            byte r9 = r9[r13]     // Catch:{ all -> 0x04f3 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x04f3 }
            r13 = 5724(0x165c, float:8.021E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x04f3 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x04f3 }
            m11815as(r8, r9, r13, r14)     // Catch:{ all -> 0x04f3 }
            r8 = 0
            r9 = r14[r8]     // Catch:{ all -> 0x04f3 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x04f3 }
            r13 = 3
            java.lang.Class[] r13 = new java.lang.Class[r13]     // Catch:{ all -> 0x04f3 }
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ all -> 0x04f3 }
            r13[r8] = r14     // Catch:{ all -> 0x04f3 }
            r13[r7] = r14     // Catch:{ all -> 0x04f3 }
            r8 = 2
            r13[r8] = r14     // Catch:{ all -> 0x04f3 }
            java.lang.reflect.Method r4 = r4.getMethod(r9, r13)     // Catch:{ all -> 0x04f3 }
            r8 = 0
            java.lang.Object r4 = r4.invoke(r8, r12)     // Catch:{ all -> 0x04f3 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x04f3 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x04f3 }
            r10.f10018b = r4     // Catch:{ all -> 0x0aa5 }
            goto L_0x02df
        L_0x04f3:
            r0 = move-exception
            goto L_0x04f8
        L_0x04f5:
            r0 = move-exception
            r2 = 1050(0x41a, float:1.471E-42)
        L_0x04f8:
            r4 = r0
            java.lang.Throwable r8 = r4.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r8 == 0) goto L_0x0500
            throw r8     // Catch:{ all -> 0x0aa5 }
        L_0x0500:
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x0501:
            r2 = r12
            java.lang.String r4 = ""
            r10.f10022f = r4     // Catch:{ all -> 0x0aa5 }
            r4 = 24
            goto L_0x01a1
        L_0x050a:
            r2 = r12
            r4 = 2
            r10.f10018b = r4     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r4 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            r8 = 9
            r10.mo9125d(r8)     // Catch:{ all -> 0x0aa5 }
            int r8 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            char r8 = (char) r8
            r9 = 2
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ all -> 0x058e }
            java.lang.Character r8 = java.lang.Character.valueOf(r8)     // Catch:{ all -> 0x058e }
            r12[r7] = r8     // Catch:{ all -> 0x058e }
            r8 = 0
            r12[r8] = r4     // Catch:{ all -> 0x058e }
            r4 = 1045(0x415, float:1.464E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x058e }
            int r8 = f9519d     // Catch:{ all -> 0x058e }
            r8 = r8 & 125(0x7d, float:1.75E-43)
            byte r8 = (byte) r8     // Catch:{ all -> 0x058e }
            r9 = 4724(0x1274, float:6.62E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x058e }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x058e }
            m11815as(r4, r8, r9, r13)     // Catch:{ all -> 0x058e }
            r8 = 0
            r9 = r13[r8]     // Catch:{ all -> 0x058e }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x058e }
            java.lang.Class r8 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x058e }
            r9 = 1060(0x424, float:1.485E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x058e }
            byte[] r13 = f9518c     // Catch:{ all -> 0x058e }
            r14 = 1801(0x709, float:2.524E-42)
            byte r14 = r13[r14]     // Catch:{ all -> 0x058e }
            int r14 = r14 + r7
            byte r14 = (byte) r14     // Catch:{ all -> 0x058e }
            r15 = 3172(0xc64, float:4.445E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x058e }
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ all -> 0x058e }
            m11815as(r9, r14, r15, r2)     // Catch:{ all -> 0x058e }
            r9 = 0
            r2 = r2[r9]     // Catch:{ all -> 0x058e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x058e }
            r9 = 2
            java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch:{ all -> 0x058e }
            r14 = 2385(0x951, float:3.342E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x058e }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x058e }
            r14 = 6235(0x185b, float:8.737E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x058e }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x058e }
            m11815as(r4, r13, r14, r15)     // Catch:{ all -> 0x058e }
            r4 = 0
            r13 = r15[r4]     // Catch:{ all -> 0x058e }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x058e }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x058e }
            r9[r4] = r13     // Catch:{ all -> 0x058e }
            java.lang.Class r4 = java.lang.Character.TYPE     // Catch:{ all -> 0x058e }
            r9[r7] = r4     // Catch:{ all -> 0x058e }
            java.lang.reflect.Method r2 = r8.getMethod(r2, r9)     // Catch:{ all -> 0x058e }
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r12)     // Catch:{ all -> 0x058e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x058e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x058e }
            r10.f10018b = r2     // Catch:{ all -> 0x0aa5 }
            goto L_0x02df
        L_0x058e:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x0597
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x0597:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x0598:
            r2 = 3
            r10.f10018b = r2     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0aa5 }
            r4 = 9
            r10.mo9125d(r4)     // Catch:{ all -> 0x0aa5 }
            int r8 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r4)     // Catch:{ all -> 0x0aa5 }
            int r4 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x0aa5 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x0aa5 }
            m11820ax(r2, r8, r4, r9)     // Catch:{ all -> 0x0aa5 }
            r2 = 0
            r4 = r9[r2]     // Catch:{ all -> 0x0aa5 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0aa5 }
            r10.f10022f = r4     // Catch:{ all -> 0x0aa5 }
            r2 = 24
            goto L_0x0460
        L_0x05c2:
            r10.f10018b = r7     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            byte[] r4 = f9518c     // Catch:{ all -> 0x0607 }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r4[r8]     // Catch:{ all -> 0x0607 }
            int r8 = -r9
            byte r8 = (byte) r8     // Catch:{ all -> 0x0607 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x0607 }
            m11815as(r6, r8, r11, r9)     // Catch:{ all -> 0x0607 }
            r8 = 0
            r9 = r9[r8]     // Catch:{ all -> 0x0607 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0607 }
            java.lang.Class r8 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0607 }
            r9 = 1061(0x425, float:1.487E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0607 }
            r12 = 1801(0x709, float:2.524E-42)
            byte r4 = r4[r12]     // Catch:{ all -> 0x0607 }
            int r4 = r4 + r7
            byte r4 = (byte) r4     // Catch:{ all -> 0x0607 }
            r12 = 5086(0x13de, float:7.127E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0607 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0607 }
            m11815as(r9, r4, r12, r13)     // Catch:{ all -> 0x0607 }
            r4 = 0
            r9 = r13[r4]     // Catch:{ all -> 0x0607 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0607 }
            r4 = 0
            java.lang.reflect.Method r8 = r8.getMethod(r9, r4)     // Catch:{ all -> 0x0607 }
            java.lang.Object r2 = r8.invoke(r2, r4)     // Catch:{ all -> 0x0607 }
            r10.f10022f = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 24
            goto L_0x0460
        L_0x0607:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x0610
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x0610:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x0611:
            int[] r2 = new int[r14]     // Catch:{ all -> 0x0aa5 }
            r4 = 1011702910(0x3c4d5c7e, float:0.012534259)
            r8 = 0
            r2[r8] = r4     // Catch:{ all -> 0x0aa5 }
            r4 = 1307955179(0x4df5cfeb, float:5.15505504E8)
            r2[r7] = r4     // Catch:{ all -> 0x0aa5 }
            r4 = -2096521(0xffffffffffe00277, float:NaN)
            r8 = 2
            r2[r8] = r4     // Catch:{ all -> 0x0aa5 }
            r4 = -609028293(0xffffffffdbb2f73b, float:-1.00748757E17)
            r8 = 3
            r2[r8] = r4     // Catch:{ all -> 0x0aa5 }
            r4 = 826563140(0x31445a44, float:2.8573064E-9)
            r8 = 4
            r2[r8] = r4     // Catch:{ all -> 0x0aa5 }
            r4 = 5
            r8 = 1439809240(0x55d1bed8, float:2.88271997E13)
            r2[r4] = r8     // Catch:{ all -> 0x0aa5 }
            r4 = 245602607(0xea3992f, float:4.0330113E-30)
            r8 = 6
            r2[r8] = r4     // Catch:{ all -> 0x0aa5 }
            r4 = 7
            r8 = -1685207935(0xffffffff9b8dc481, float:-2.345348E-22)
            r2[r4] = r8     // Catch:{ all -> 0x0aa5 }
            r10.f10022f = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 24
            goto L_0x0460
        L_0x0648:
            r2 = 2
            r10.f10018b = r2     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r2 = 9
            r10.mo9125d(r2)     // Catch:{ all -> 0x0aa5 }
            int r4 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r2)     // Catch:{ all -> 0x0aa5 }
            int r2 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x06b6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x06b6 }
            r9[r7] = r2     // Catch:{ all -> 0x06b6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x06b6 }
            r4 = 0
            r9[r4] = r2     // Catch:{ all -> 0x06b6 }
            r2 = 1038(0x40e, float:1.455E-42)
            short r2 = (short) r2     // Catch:{ all -> 0x06b6 }
            int r4 = f9519d     // Catch:{ all -> 0x06b6 }
            r4 = r4 & 125(0x7d, float:1.75E-43)
            byte r4 = (byte) r4     // Catch:{ all -> 0x06b6 }
            r8 = 6887(0x1ae7, float:9.651E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x06b6 }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x06b6 }
            m11815as(r2, r4, r8, r12)     // Catch:{ all -> 0x06b6 }
            r2 = 0
            r4 = r12[r2]     // Catch:{ all -> 0x06b6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x06b6 }
            java.lang.Class r2 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x06b6 }
            r4 = 1052(0x41c, float:1.474E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x06b6 }
            byte[] r8 = f9518c     // Catch:{ all -> 0x06b6 }
            r12 = 2124(0x84c, float:2.976E-42)
            byte r8 = r8[r12]     // Catch:{ all -> 0x06b6 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x06b6 }
            r12 = 1845(0x735, float:2.585E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x06b6 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x06b6 }
            m11815as(r4, r8, r12, r13)     // Catch:{ all -> 0x06b6 }
            r4 = 0
            r8 = r13[r4]     // Catch:{ all -> 0x06b6 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x06b6 }
            r12 = 2
            java.lang.Class[] r12 = new java.lang.Class[r12]     // Catch:{ all -> 0x06b6 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x06b6 }
            r12[r4] = r13     // Catch:{ all -> 0x06b6 }
            r12[r7] = r13     // Catch:{ all -> 0x06b6 }
            java.lang.reflect.Method r2 = r2.getMethod(r8, r12)     // Catch:{ all -> 0x06b6 }
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r9)     // Catch:{ all -> 0x06b6 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x06b6 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x06b6 }
            r10.f10018b = r2     // Catch:{ all -> 0x0aa5 }
            goto L_0x02df
        L_0x06b6:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x06bf
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x06bf:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x06c0:
            r2 = 2
            r10.f10018b = r2     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            int[] r2 = (int[]) r2     // Catch:{ all -> 0x0aa5 }
            r4 = 9
            r10.mo9125d(r4)     // Catch:{ all -> 0x0aa5 }
            int r4 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0aa5 }
            m11816at(r2, r4, r8)     // Catch:{ all -> 0x0aa5 }
            r2 = 0
            r4 = r8[r2]     // Catch:{ all -> 0x0aa5 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0aa5 }
            r10.f10022f = r4     // Catch:{ all -> 0x0aa5 }
            r2 = 24
            goto L_0x0460
        L_0x06e4:
            r10.f10018b = r7     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0aa5 }
            r10.f10022f = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 24
            goto L_0x0460
        L_0x06f8:
            r10.f10018b = r7     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            short r4 = (short) r8
            byte[] r8 = f9518c     // Catch:{ all -> 0x0742 }
            r9 = 2385(0x951, float:3.342E-42)
            byte r12 = r8[r9]     // Catch:{ all -> 0x0742 }
            int r9 = -r12
            byte r9 = (byte) r9     // Catch:{ all -> 0x0742 }
            short r12 = (short) r15     // Catch:{ all -> 0x0742 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0742 }
            m11815as(r4, r9, r12, r13)     // Catch:{ all -> 0x0742 }
            r4 = 0
            r9 = r13[r4]     // Catch:{ all -> 0x0742 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0742 }
            java.lang.Class r4 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0742 }
            r9 = 1061(0x425, float:1.487E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0742 }
            r12 = 2124(0x84c, float:2.976E-42)
            byte r8 = r8[r12]     // Catch:{ all -> 0x0742 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0742 }
            r12 = 6175(0x181f, float:8.653E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0742 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0742 }
            m11815as(r9, r8, r12, r13)     // Catch:{ all -> 0x0742 }
            r8 = 0
            r9 = r13[r8]     // Catch:{ all -> 0x0742 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0742 }
            r8 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r9, r8)     // Catch:{ all -> 0x0742 }
            java.lang.Object r2 = r4.invoke(r2, r8)     // Catch:{ all -> 0x0742 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0742 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0742 }
            r10.f10018b = r2     // Catch:{ all -> 0x0aa5 }
            goto L_0x02df
        L_0x0742:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x074b
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x074b:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x074c:
            r2 = 2
            r10.f10018b = r2     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            r4 = 9
            r10.mo9125d(r4)     // Catch:{ all -> 0x0aa5 }
            int r4 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x07cb }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x07cb }
            r9[r7] = r4     // Catch:{ all -> 0x07cb }
            r4 = 0
            r9[r4] = r2     // Catch:{ all -> 0x07cb }
            r2 = 1045(0x415, float:1.464E-42)
            short r2 = (short) r2     // Catch:{ all -> 0x07cb }
            int r4 = f9519d     // Catch:{ all -> 0x07cb }
            r4 = r4 & 125(0x7d, float:1.75E-43)
            byte r4 = (byte) r4     // Catch:{ all -> 0x07cb }
            r8 = 4724(0x1274, float:6.62E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x07cb }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x07cb }
            m11815as(r2, r4, r8, r12)     // Catch:{ all -> 0x07cb }
            r4 = 0
            r8 = r12[r4]     // Catch:{ all -> 0x07cb }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x07cb }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x07cb }
            r12 = 1052(0x41c, float:1.474E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x07cb }
            byte[] r13 = f9518c     // Catch:{ all -> 0x07cb }
            byte r14 = r13[r4]     // Catch:{ all -> 0x07cb }
            byte r14 = (byte) r14     // Catch:{ all -> 0x07cb }
            r15 = 1859(0x743, float:2.605E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x07cb }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ all -> 0x07cb }
            m11815as(r12, r14, r15, r4)     // Catch:{ all -> 0x07cb }
            r12 = 0
            r4 = r4[r12]     // Catch:{ all -> 0x07cb }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x07cb }
            r12 = 2
            java.lang.Class[] r12 = new java.lang.Class[r12]     // Catch:{ all -> 0x07cb }
            r14 = 2385(0x951, float:3.342E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x07cb }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x07cb }
            r14 = 6235(0x185b, float:8.737E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x07cb }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x07cb }
            m11815as(r2, r13, r14, r15)     // Catch:{ all -> 0x07cb }
            r2 = 0
            r13 = r15[r2]     // Catch:{ all -> 0x07cb }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x07cb }
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ all -> 0x07cb }
            r12[r2] = r13     // Catch:{ all -> 0x07cb }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x07cb }
            r12[r7] = r2     // Catch:{ all -> 0x07cb }
            java.lang.reflect.Method r2 = r8.getMethod(r4, r12)     // Catch:{ all -> 0x07cb }
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r9)     // Catch:{ all -> 0x07cb }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x07cb }
            int r2 = r2.intValue()     // Catch:{ all -> 0x07cb }
            r10.f10018b = r2     // Catch:{ all -> 0x0aa5 }
            goto L_0x02df
        L_0x07cb:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x07d4
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x07d4:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x07d5:
            r2 = 1037(0x40d, float:1.453E-42)
            short r2 = (short) r2
            int r4 = f9519d     // Catch:{ all -> 0x0815 }
            r4 = r4 & 125(0x7d, float:1.75E-43)
            byte r4 = (byte) r4     // Catch:{ all -> 0x0815 }
            r8 = 4160(0x1040, float:5.83E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0815 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x0815 }
            m11815as(r2, r4, r8, r9)     // Catch:{ all -> 0x0815 }
            r2 = 0
            r4 = r9[r2]     // Catch:{ all -> 0x0815 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0815 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0815 }
            r8 = 1041(0x411, float:1.459E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0815 }
            byte[] r9 = f9518c     // Catch:{ all -> 0x0815 }
            byte r9 = r9[r2]     // Catch:{ all -> 0x0815 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x0815 }
            r12 = 1523(0x5f3, float:2.134E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0815 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0815 }
            m11815as(r8, r9, r12, r13)     // Catch:{ all -> 0x0815 }
            r8 = r13[r2]     // Catch:{ all -> 0x0815 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0815 }
            r2 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r8, r2)     // Catch:{ all -> 0x0815 }
            java.lang.Object r4 = r4.invoke(r2, r2)     // Catch:{ all -> 0x0815 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0815 }
            int r2 = r4.intValue()     // Catch:{ all -> 0x0815 }
            r10.f10018b = r2     // Catch:{ all -> 0x0aa5 }
            goto L_0x02df
        L_0x0815:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x081e
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x081e:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x081f:
            r2 = 14
            int[] r2 = new int[r2]     // Catch:{ all -> 0x0aa5 }
            r4 = 74758280(0x474b888, float:2.8766795E-36)
            r8 = 0
            r2[r8] = r4     // Catch:{ all -> 0x0aa5 }
            r4 = 900975559(0x35b3cbc7, float:1.3395846E-6)
            r2[r7] = r4     // Catch:{ all -> 0x0aa5 }
            r4 = -444301890(0xffffffffe5847dbe, float:-7.820899E22)
            r8 = 2
            r2[r8] = r4     // Catch:{ all -> 0x0aa5 }
            r4 = 185848042(0xb13d0ea, float:2.846834E-32)
            r8 = 3
            r2[r8] = r4     // Catch:{ all -> 0x0aa5 }
            r4 = 937990267(0x37e8987b, float:2.772756E-5)
            r8 = 4
            r2[r8] = r4     // Catch:{ all -> 0x0aa5 }
            r4 = 5
            r8 = 352822847(0x1507a63f, float:2.7394178E-26)
            r2[r4] = r8     // Catch:{ all -> 0x0aa5 }
            r4 = -269930796(0xffffffffefe92ed4, float:-1.4433324E29)
            r8 = 6
            r2[r8] = r4     // Catch:{ all -> 0x0aa5 }
            r4 = 7
            r8 = -1944714107(0xffffffff8c160485, float:-1.155694E-31)
            r2[r4] = r8     // Catch:{ all -> 0x0aa5 }
            r4 = -123229425(0xfffffffff8a7ab0f, float:-2.720572E34)
            r2[r14] = r4     // Catch:{ all -> 0x0aa5 }
            r4 = -913121347(0xffffffffc992dfbd, float:-1203191.6)
            r8 = 9
            r2[r8] = r4     // Catch:{ all -> 0x0aa5 }
            r4 = 10
            r8 = -2045626582(0xffffffff8612372a, float:-2.7500076E-35)
            r2[r4] = r8     // Catch:{ all -> 0x0aa5 }
            r4 = 11
            r8 = 2013890241(0x780986c1, float:1.1157466E34)
            r2[r4] = r8     // Catch:{ all -> 0x0aa5 }
            r4 = -624926934(0xffffffffdac05f2a, float:-2.70739148E16)
            r2[r13] = r4     // Catch:{ all -> 0x0aa5 }
            r4 = 13
            r8 = -242126181(0xfffffffff191729b, float:-1.440444E30)
            r2[r4] = r8     // Catch:{ all -> 0x0aa5 }
            r10.f10022f = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 24
            goto L_0x0460
        L_0x087e:
            r2 = 4
            r10.f10018b = r2     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            r4 = 9
            r10.mo9125d(r4)     // Catch:{ all -> 0x0aa5 }
            int r8 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            char r8 = (char) r8     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r4)     // Catch:{ all -> 0x0aa5 }
            int r9 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r4)     // Catch:{ all -> 0x0aa5 }
            int r4 = r10.f10020d     // Catch:{ all -> 0x0aa5 }
            r12 = 4
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x0921 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0921 }
            r12 = 3
            r13[r12] = r4     // Catch:{ all -> 0x0921 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0921 }
            r9 = 2
            r13[r9] = r4     // Catch:{ all -> 0x0921 }
            java.lang.Character r4 = java.lang.Character.valueOf(r8)     // Catch:{ all -> 0x0921 }
            r13[r7] = r4     // Catch:{ all -> 0x0921 }
            r4 = 0
            r13[r4] = r2     // Catch:{ all -> 0x0921 }
            r2 = 1045(0x415, float:1.464E-42)
            short r2 = (short) r2     // Catch:{ all -> 0x0921 }
            int r4 = f9519d     // Catch:{ all -> 0x0921 }
            r4 = r4 & 125(0x7d, float:1.75E-43)
            byte r4 = (byte) r4     // Catch:{ all -> 0x0921 }
            r8 = 4724(0x1274, float:6.62E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0921 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x0921 }
            m11815as(r2, r4, r8, r9)     // Catch:{ all -> 0x0921 }
            r4 = 0
            r8 = r9[r4]     // Catch:{ all -> 0x0921 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0921 }
            java.lang.Class r4 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0921 }
            r8 = 1060(0x424, float:1.485E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0921 }
            byte[] r9 = f9518c     // Catch:{ all -> 0x0921 }
            r12 = 1801(0x709, float:2.524E-42)
            byte r12 = r9[r12]     // Catch:{ all -> 0x0921 }
            int r12 = r12 + r7
            byte r12 = (byte) r12     // Catch:{ all -> 0x0921 }
            r14 = 3172(0xc64, float:4.445E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0921 }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x0921 }
            m11815as(r8, r12, r14, r15)     // Catch:{ all -> 0x0921 }
            r8 = 0
            r12 = r15[r8]     // Catch:{ all -> 0x0921 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0921 }
            r8 = 4
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch:{ all -> 0x0921 }
            r14 = 2385(0x951, float:3.342E-42)
            byte r9 = r9[r14]     // Catch:{ all -> 0x0921 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0921 }
            r14 = 6235(0x185b, float:8.737E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0921 }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x0921 }
            m11815as(r2, r9, r14, r15)     // Catch:{ all -> 0x0921 }
            r2 = 0
            r9 = r15[r2]     // Catch:{ all -> 0x0921 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0921 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0921 }
            r8[r2] = r9     // Catch:{ all -> 0x0921 }
            java.lang.Class r2 = java.lang.Character.TYPE     // Catch:{ all -> 0x0921 }
            r8[r7] = r2     // Catch:{ all -> 0x0921 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0921 }
            r9 = 2
            r8[r9] = r2     // Catch:{ all -> 0x0921 }
            r9 = 3
            r8[r9] = r2     // Catch:{ all -> 0x0921 }
            java.lang.reflect.Method r2 = r4.getMethod(r12, r8)     // Catch:{ all -> 0x0921 }
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r13)     // Catch:{ all -> 0x0921 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0921 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0921 }
            r10.f10018b = r2     // Catch:{ all -> 0x0aa5 }
            goto L_0x02df
        L_0x0921:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x092a
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x092a:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x092b:
            r10.f10018b = r7     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0aa5 }
            m11824b((java.io.File) r2)     // Catch:{ all -> 0x0aa5 }
            goto L_0x0161
        L_0x093c:
            r10.f10018b = r7     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            r4 = 1044(0x414, float:1.463E-42)
            short r4 = (short) r4
            int r8 = f9519d     // Catch:{ all -> 0x0982 }
            r8 = r8 & 125(0x7d, float:1.75E-43)
            byte r8 = (byte) r8     // Catch:{ all -> 0x0982 }
            r9 = r8 | 1864(0x748, float:2.612E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0982 }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x0982 }
            m11815as(r4, r8, r9, r12)     // Catch:{ all -> 0x0982 }
            r4 = 0
            r8 = r12[r4]     // Catch:{ all -> 0x0982 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0982 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0982 }
            r9 = 1058(0x422, float:1.483E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0982 }
            byte[] r12 = f9518c     // Catch:{ all -> 0x0982 }
            byte r12 = r12[r4]     // Catch:{ all -> 0x0982 }
            byte r12 = (byte) r12     // Catch:{ all -> 0x0982 }
            r13 = 5240(0x1478, float:7.343E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0982 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0982 }
            m11815as(r9, r12, r13, r14)     // Catch:{ all -> 0x0982 }
            r9 = r14[r4]     // Catch:{ all -> 0x0982 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0982 }
            r4 = 0
            java.lang.reflect.Method r8 = r8.getMethod(r9, r4)     // Catch:{ all -> 0x0982 }
            java.lang.Object r2 = r8.invoke(r2, r4)     // Catch:{ all -> 0x0982 }
            r10.f10022f = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 24
            goto L_0x0460
        L_0x0982:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x098b
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x098b:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x098c:
            r10.f10018b = r7     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            short r4 = (short) r8
            byte[] r8 = f9518c     // Catch:{ all -> 0x09cf }
            r9 = 2385(0x951, float:3.342E-42)
            byte r12 = r8[r9]     // Catch:{ all -> 0x09cf }
            int r9 = -r12
            byte r9 = (byte) r9     // Catch:{ all -> 0x09cf }
            short r12 = (short) r15     // Catch:{ all -> 0x09cf }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x09cf }
            m11815as(r4, r9, r12, r13)     // Catch:{ all -> 0x09cf }
            r4 = 0
            r9 = r13[r4]     // Catch:{ all -> 0x09cf }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x09cf }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x09cf }
            r12 = 1052(0x41c, float:1.474E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x09cf }
            byte r8 = r8[r4]     // Catch:{ all -> 0x09cf }
            byte r8 = (byte) r8     // Catch:{ all -> 0x09cf }
            r13 = 1479(0x5c7, float:2.073E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x09cf }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x09cf }
            m11815as(r12, r8, r13, r14)     // Catch:{ all -> 0x09cf }
            r8 = r14[r4]     // Catch:{ all -> 0x09cf }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x09cf }
            r4 = 0
            java.lang.reflect.Method r8 = r9.getMethod(r8, r4)     // Catch:{ all -> 0x09cf }
            java.lang.Object r2 = r8.invoke(r2, r4)     // Catch:{ all -> 0x09cf }
            r10.f10022f = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 24
            goto L_0x0460
        L_0x09cf:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r4 = r2.getCause()     // Catch:{ all -> 0x0aa5 }
            if (r4 == 0) goto L_0x09d8
            throw r4     // Catch:{ all -> 0x0aa5 }
        L_0x09d8:
            throw r2     // Catch:{ all -> 0x0aa5 }
        L_0x09d9:
            r2 = 3
            r10.f10018b = r2     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            android.content.res.AssetManager r2 = (android.content.res.AssetManager) r2     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r4 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0aa5 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0aa5 }
            java.lang.Object r8 = r10.f10026j     // Catch:{ all -> 0x0aa5 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0aa5 }
            m11834e(r2, r4, r8)     // Catch:{ all -> 0x0aa5 }
            goto L_0x0161
        L_0x09f9:
            r2 = 136(0x88, float:1.9E-43)
            goto L_0x0c18
        L_0x09fd:
            r2 = 127(0x7f, float:1.78E-43)
            goto L_0x0c18
        L_0x0a01:
            r2 = r4
            int[] r4 = new int[r2]     // Catch:{ all -> 0x0aa5 }
            r2 = -269155993(0xffffffffeff50167, float:-1.5165105E29)
            r8 = 0
            r4[r8] = r2     // Catch:{ all -> 0x0aa5 }
            r2 = -169517844(0xfffffffff5e55cec, float:-5.8150423E32)
            r4[r7] = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 455358135(0x1b2436b7, float:1.3583441E-22)
            r8 = 2
            r4[r8] = r2     // Catch:{ all -> 0x0aa5 }
            r2 = -2140649413(0xffffffff8068483b, float:-9.576803E-39)
            r8 = 3
            r4[r8] = r2     // Catch:{ all -> 0x0aa5 }
            r2 = -2028663589(0xffffffff87150cdb, float:-1.1213292E-34)
            r8 = 4
            r4[r8] = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 5
            r8 = 1922698048(0x729a0b40, float:6.1023094E30)
            r4[r2] = r8     // Catch:{ all -> 0x0aa5 }
            r2 = -1726350047(0xffffffff9919fd21, float:-7.9610336E-24)
            r8 = 6
            r4[r8] = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 7
            r8 = 857051134(0x33158ffe, float:3.4822726E-8)
            r4[r2] = r8     // Catch:{ all -> 0x0aa5 }
            r2 = -532224225(0xffffffffe046e71f, float:-5.7329834E19)
            r4[r14] = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 594967810(0x23767d02, float:1.3362158E-17)
            r8 = 9
            r4[r8] = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 10
            r8 = -111920672(0xfffffffff95439e0, float:-6.88713E34)
            r4[r2] = r8     // Catch:{ all -> 0x0aa5 }
            r2 = 11
            r8 = 143135375(0x888128f, float:8.189565E-34)
            r4[r2] = r8     // Catch:{ all -> 0x0aa5 }
            r2 = -1595685266(0xffffffffa0e3c66e, float:-3.8586606E-19)
            r4[r13] = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 13
            r8 = -1741852255(0xffffffff982d71a1, float:-2.2417094E-24)
            r4[r2] = r8     // Catch:{ all -> 0x0aa5 }
            r2 = 14
            r8 = 1263700288(0x4b528940, float:1.3797696E7)
            r4[r2] = r8     // Catch:{ all -> 0x0aa5 }
            r2 = -1668420854(0xffffffff9c8deb0a, float:-9.391353E-22)
            r8 = 15
            r4[r8] = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 16
            r8 = 1110068899(0x422a4ea3, float:42.576794)
            r4[r2] = r8     // Catch:{ all -> 0x0aa5 }
            r2 = 17
            r8 = 1903170074(0x7170121a, float:1.1887726E30)
            r4[r2] = r8     // Catch:{ all -> 0x0aa5 }
            r2 = 18
            r8 = -2133911764(0xffffffff80cf172c, float:-1.901826E-38)
            r4[r2] = r8     // Catch:{ all -> 0x0aa5 }
            r2 = 2093366224(0x7cc63bd0, float:8.2343034E36)
            r8 = 19
            r4[r8] = r2     // Catch:{ all -> 0x0aa5 }
            r2 = 20
            r8 = 1233649069(0x4987fdad, float:1114037.6)
            r4[r2] = r8     // Catch:{ all -> 0x0aa5 }
            r2 = 21
            r8 = 1949586783(0x7434555f, float:5.714996E31)
            r4[r2] = r8     // Catch:{ all -> 0x0aa5 }
            r2 = 22
            r8 = 1521149190(0x5aaae506, float:2.405128E16)
            r4[r2] = r8     // Catch:{ all -> 0x0aa5 }
            r2 = 23
            r8 = 90375708(0x563061c, float:1.0674611E-35)
            r4[r2] = r8     // Catch:{ all -> 0x0aa5 }
            r10.f10022f = r4     // Catch:{ all -> 0x0aa5 }
            r2 = 24
            goto L_0x0460
        L_0x0aa5:
            r0 = move-exception
            r2 = r0
            r4 = 0
            goto L_0x0c25
        L_0x0aaa:
            r2 = 2
            r10.f10018b = r2     // Catch:{ all -> 0x0c1e }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0c1e }
            r2 = 103(0x67, float:1.44E-43)
            r10.mo9125d(r2)     // Catch:{ all -> 0x0c1e }
            float r2 = r10.f10024h     // Catch:{ all -> 0x0c1e }
            r4 = 103(0x67, float:1.44E-43)
            r10.mo9125d(r4)     // Catch:{ all -> 0x0c1e }
            float r4 = r10.f10024h     // Catch:{ all -> 0x0c1e }
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0b21 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ all -> 0x0b21 }
            r9[r7] = r4     // Catch:{ all -> 0x0b21 }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0b21 }
            r4 = 0
            r9[r4] = r2     // Catch:{ all -> 0x0b21 }
            r2 = 1044(0x414, float:1.463E-42)
            short r2 = (short) r2     // Catch:{ all -> 0x0b21 }
            int r4 = f9519d     // Catch:{ all -> 0x0b21 }
            r4 = r4 & 125(0x7d, float:1.75E-43)
            byte r4 = (byte) r4     // Catch:{ all -> 0x0b21 }
            r8 = 4307(0x10d3, float:6.035E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0b21 }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x0b21 }
            m11815as(r2, r4, r8, r12)     // Catch:{ all -> 0x0b21 }
            r2 = 0
            r4 = r12[r2]     // Catch:{ all -> 0x0b21 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0b21 }
            java.lang.Class r2 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0b21 }
            r4 = 1061(0x425, float:1.487E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x0b21 }
            byte[] r8 = f9518c     // Catch:{ all -> 0x0b21 }
            r12 = 609(0x261, float:8.53E-43)
            byte r8 = r8[r12]     // Catch:{ all -> 0x0b21 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0b21 }
            r12 = 1452(0x5ac, float:2.035E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0b21 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0b21 }
            m11815as(r4, r8, r12, r13)     // Catch:{ all -> 0x0b21 }
            r4 = 0
            r8 = r13[r4]     // Catch:{ all -> 0x0b21 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0b21 }
            r12 = 2
            java.lang.Class[] r12 = new java.lang.Class[r12]     // Catch:{ all -> 0x0b21 }
            java.lang.Class r13 = java.lang.Float.TYPE     // Catch:{ all -> 0x0b21 }
            r12[r4] = r13     // Catch:{ all -> 0x0b21 }
            r12[r7] = r13     // Catch:{ all -> 0x0b21 }
            java.lang.reflect.Method r2 = r2.getMethod(r8, r12)     // Catch:{ all -> 0x0b21 }
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r9)     // Catch:{ all -> 0x0b1f }
            java.lang.Float r2 = (java.lang.Float) r2     // Catch:{ all -> 0x0b1f }
            float r2 = r2.floatValue()     // Catch:{ all -> 0x0b1f }
            r10.f10021e = r2     // Catch:{ all -> 0x0c11 }
            r2 = 104(0x68, float:1.46E-43)
            r10.mo9125d(r2)     // Catch:{ all -> 0x0c11 }
            goto L_0x0c17
        L_0x0b1f:
            r0 = move-exception
            goto L_0x0b23
        L_0x0b21:
            r0 = move-exception
            r4 = 0
        L_0x0b23:
            r2 = r0
            java.lang.Throwable r8 = r2.getCause()     // Catch:{ all -> 0x0c11 }
            if (r8 == 0) goto L_0x0b2b
            throw r8     // Catch:{ all -> 0x0c11 }
        L_0x0b2b:
            throw r2     // Catch:{ all -> 0x0c11 }
        L_0x0b2c:
            r4 = 0
            com.facetec.sdk.as r2 = new com.facetec.sdk.as     // Catch:{ all -> 0x0c11 }
            r8 = 2
            r10.f10018b = r8     // Catch:{ all -> 0x0c11 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0c11 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0c11 }
            java.lang.Object r8 = r10.f10026j     // Catch:{ all -> 0x0c11 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0c11 }
            r10.mo9125d(r9)     // Catch:{ all -> 0x0c11 }
            java.lang.Object r9 = r10.f10026j     // Catch:{ all -> 0x0c11 }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ all -> 0x0c11 }
            r2.<init>(r8, r9)     // Catch:{ all -> 0x0c11 }
            r10.f10022f = r2     // Catch:{ all -> 0x0c11 }
            r2 = 24
            r10.mo9125d(r2)     // Catch:{ all -> 0x0c11 }
            goto L_0x0c17
        L_0x0b4f:
            r4 = 0
            r2 = 16
            r10.mo9125d(r2)     // Catch:{ all -> 0x0c11 }
            java.lang.Object r2 = r10.f10026j     // Catch:{ all -> 0x0c11 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0c11 }
            throw r2     // Catch:{ all -> 0x0c11 }
        L_0x0b5a:
            r4 = 0
            r2 = 159(0x9f, float:2.23E-43)
            goto L_0x0c18
        L_0x0b5f:
            monitor-exit(r1)
            return
        L_0x0b61:
            r4 = 0
            int r2 = f9526m     // Catch:{ all -> 0x0c11 }
            r10.f10018b = r2     // Catch:{ all -> 0x0c11 }
        L_0x0b66:
            r10.mo9125d(r7)     // Catch:{ all -> 0x0c11 }
            goto L_0x0c17
        L_0x0b6b:
            r4 = 0
            r10.f10018b = r7     // Catch:{ all -> 0x0c11 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0c11 }
            r2 = 9
            r10.mo9125d(r2)     // Catch:{ all -> 0x0c11 }
            int r2 = r10.f10020d     // Catch:{ all -> 0x0c11 }
            f9527n = r2     // Catch:{ all -> 0x0c11 }
            goto L_0x0c17
        L_0x0b7c:
            r2 = 15
            r4 = 0
            r10.mo9125d(r2)     // Catch:{ all -> 0x0c11 }
            int r2 = r10.f10020d     // Catch:{ all -> 0x0c11 }
            if (r2 != 0) goto L_0x0c17
            r2 = 145(0x91, float:2.03E-43)
            goto L_0x0c18
        L_0x0b8a:
            r4 = 0
            r2 = 146(0x92, float:2.05E-43)
            goto L_0x0c18
        L_0x0b8f:
            r4 = 0
            r2 = 129(0x81, float:1.81E-43)
            goto L_0x0c18
        L_0x0b94:
            r2 = 15
            r4 = 0
            r10.mo9125d(r2)     // Catch:{ all -> 0x0c11 }
            int r2 = r10.f10020d     // Catch:{ all -> 0x0c11 }
            if (r2 != 0) goto L_0x0c17
            r2 = 157(0x9d, float:2.2E-43)
            goto L_0x0c18
        L_0x0ba2:
            r4 = 0
            r2 = 158(0x9e, float:2.21E-43)
            goto L_0x0c18
        L_0x0ba7:
            r4 = 0
            r2 = 25
            goto L_0x0c18
        L_0x0bac:
            r4 = 0
            int r2 = f9527n     // Catch:{ all -> 0x0c11 }
            r10.f10018b = r2     // Catch:{ all -> 0x0c11 }
            goto L_0x0b66
        L_0x0bb2:
            r4 = 0
            r10.f10018b = r7     // Catch:{ all -> 0x0c11 }
            r10.mo9125d(r14)     // Catch:{ all -> 0x0c11 }
            r2 = 9
            r10.mo9125d(r2)     // Catch:{ all -> 0x0c11 }
            int r2 = r10.f10020d     // Catch:{ all -> 0x0c11 }
            f9526m = r2     // Catch:{ all -> 0x0c11 }
            goto L_0x0c17
        L_0x0bc2:
            r4 = 0
            r10.mo9125d(r13)     // Catch:{ all -> 0x0c11 }
            int r2 = r10.f10020d     // Catch:{ all -> 0x0c11 }
            if (r2 != 0) goto L_0x0c17
            r2 = 167(0xa7, float:2.34E-43)
            goto L_0x0c18
        L_0x0bcd:
            r4 = 0
            r2 = 168(0xa8, float:2.35E-43)
            goto L_0x0c18
        L_0x0bd1:
            r2 = r7
        L_0x0bd2:
            r17 = r10
            goto L_0x0148
        L_0x0bd6:
            r4 = 0
            r10.mo9125d(r13)     // Catch:{ all -> 0x0c11 }
            int r2 = r10.f10020d     // Catch:{ all -> 0x0c11 }
            if (r2 != 0) goto L_0x0c17
            r2 = 178(0xb2, float:2.5E-43)
            goto L_0x0c18
        L_0x0be1:
            r4 = 0
            r2 = 179(0xb3, float:2.51E-43)
            goto L_0x0c18
        L_0x0be5:
            r4 = 0
            r2 = 133(0x85, float:1.86E-43)
            goto L_0x0c18
        L_0x0be9:
            r4 = 0
            r2 = 20
            r10.mo9125d(r2)     // Catch:{ all -> 0x0c11 }
            int r2 = r10.f10020d     // Catch:{ all -> 0x0c11 }
            if (r2 == 0) goto L_0x0bf6
        L_0x0bf3:
            r2 = 28
            goto L_0x0c18
        L_0x0bf6:
            r2 = 15
            goto L_0x0c18
        L_0x0bf9:
            r4 = 0
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x0c18
        L_0x0bfd:
            r4 = 0
            r2 = 20
            r10.mo9125d(r2)     // Catch:{ all -> 0x0c11 }
            int r2 = r10.f10020d     // Catch:{ all -> 0x0c11 }
            r3 = 40
            if (r2 == r3) goto L_0x0bf3
            r3 = 61
            if (r2 == r3) goto L_0x0c0e
            goto L_0x0bf3
        L_0x0c0e:
            r2 = 149(0x95, float:2.09E-43)
            goto L_0x0c18
        L_0x0c11:
            r0 = move-exception
            goto L_0x0c24
        L_0x0c13:
            r4 = 0
            r2 = 185(0xb9, float:2.59E-43)
            goto L_0x0c18
        L_0x0c17:
            r2 = r3
        L_0x0c18:
            r17 = r10
            r12 = 1050(0x41a, float:1.471E-42)
            goto L_0x0148
        L_0x0c1e:
            r0 = move-exception
            goto L_0x0c23
        L_0x0c20:
            r0 = move-exception
            r10 = r17
        L_0x0c23:
            r4 = 0
        L_0x0c24:
            r2 = r0
        L_0x0c25:
            r8 = 1048(0x418, float:1.469E-42)
            short r8 = (short) r8
            byte[] r9 = f9518c     // Catch:{ all -> 0x0d19 }
            r12 = 2385(0x951, float:3.342E-42)
            byte r13 = r9[r12]     // Catch:{ all -> 0x0d19 }
            int r12 = -r13
            byte r12 = (byte) r12     // Catch:{ all -> 0x0d19 }
            r13 = 5921(0x1721, float:8.297E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0d19 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0d19 }
            m11815as(r8, r12, r13, r14)     // Catch:{ all -> 0x0d19 }
            r12 = 0
            r14 = r14[r12]     // Catch:{ all -> 0x0d19 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0d19 }
            java.lang.Class r12 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0d19 }
            boolean r12 = r12.isInstance(r2)     // Catch:{ all -> 0x0d19 }
            if (r12 == 0) goto L_0x0c54
            r12 = 11
            if (r3 < r12) goto L_0x0c54
            r12 = 15
            if (r3 > r12) goto L_0x0c54
        L_0x0c4f:
            r8 = 0
            r12 = 2385(0x951, float:3.342E-42)
            goto L_0x0d03
        L_0x0c54:
            r12 = 2385(0x951, float:3.342E-42)
            byte r14 = r9[r12]     // Catch:{ all -> 0x0d19 }
            int r12 = -r14
            byte r12 = (byte) r12     // Catch:{ all -> 0x0d19 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0d19 }
            m11815as(r8, r12, r13, r14)     // Catch:{ all -> 0x0d19 }
            r12 = 0
            r14 = r14[r12]     // Catch:{ all -> 0x0d19 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0d19 }
            java.lang.Class r12 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0d19 }
            boolean r12 = r12.isInstance(r2)     // Catch:{ all -> 0x0d19 }
            if (r12 == 0) goto L_0x0c77
            r12 = 15
            if (r3 < r12) goto L_0x0c77
            r12 = 19
            if (r3 > r12) goto L_0x0c77
            goto L_0x0c4f
        L_0x0c77:
            r12 = 2385(0x951, float:3.342E-42)
            byte r14 = r9[r12]     // Catch:{ all -> 0x0d19 }
            int r12 = -r14
            byte r12 = (byte) r12     // Catch:{ all -> 0x0d19 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0d19 }
            m11815as(r8, r12, r13, r14)     // Catch:{ all -> 0x0d19 }
            r12 = 0
            r14 = r14[r12]     // Catch:{ all -> 0x0d19 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0d19 }
            java.lang.Class r12 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0d19 }
            boolean r12 = r12.isInstance(r2)     // Catch:{ all -> 0x0d19 }
            if (r12 == 0) goto L_0x0c9a
            r12 = 19
            if (r3 < r12) goto L_0x0c9a
            r12 = 25
            if (r3 > r12) goto L_0x0c9a
            goto L_0x0c4f
        L_0x0c9a:
            r12 = 2385(0x951, float:3.342E-42)
            byte r14 = r9[r12]     // Catch:{ all -> 0x0d19 }
            int r12 = -r14
            byte r12 = (byte) r12     // Catch:{ all -> 0x0d19 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0d19 }
            m11815as(r8, r12, r13, r14)     // Catch:{ all -> 0x0d19 }
            r12 = 0
            r14 = r14[r12]     // Catch:{ all -> 0x0d19 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0d19 }
            java.lang.Class r12 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0d19 }
            boolean r12 = r12.isInstance(r2)     // Catch:{ all -> 0x0d19 }
            if (r12 == 0) goto L_0x0cbd
            r12 = 25
            if (r3 < r12) goto L_0x0cbd
            r12 = 28
            if (r3 > r12) goto L_0x0cbd
            goto L_0x0c4f
        L_0x0cbd:
            r12 = 2385(0x951, float:3.342E-42)
            byte r14 = r9[r12]     // Catch:{ all -> 0x0d19 }
            int r12 = -r14
            byte r12 = (byte) r12     // Catch:{ all -> 0x0d19 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0d19 }
            m11815as(r8, r12, r13, r14)     // Catch:{ all -> 0x0d19 }
            r12 = 0
            r14 = r14[r12]     // Catch:{ all -> 0x0d19 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0d19 }
            java.lang.Class r12 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0d19 }
            boolean r12 = r12.isInstance(r2)     // Catch:{ all -> 0x0d19 }
            if (r12 == 0) goto L_0x0ce1
            r12 = 28
            if (r3 < r12) goto L_0x0ce1
            r12 = 32
            if (r3 > r12) goto L_0x0ce1
            goto L_0x0c4f
        L_0x0ce1:
            r12 = 2385(0x951, float:3.342E-42)
            byte r9 = r9[r12]     // Catch:{ all -> 0x0d19 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0d19 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0d19 }
            m11815as(r8, r9, r13, r14)     // Catch:{ all -> 0x0d19 }
            r8 = 0
            r9 = r14[r8]     // Catch:{ all -> 0x0d19 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0d19 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0d19 }
            boolean r9 = r9.isInstance(r2)     // Catch:{ all -> 0x0d19 }
            if (r9 == 0) goto L_0x0d0e
            r9 = 32
            if (r3 < r9) goto L_0x0d0e
            r9 = 111(0x6f, float:1.56E-43)
            if (r3 > r9) goto L_0x0d0e
        L_0x0d03:
            r10.f10022f = r2     // Catch:{ all -> 0x0d19 }
            r2 = 23
            r10.mo9125d(r2)     // Catch:{ all -> 0x0d19 }
            r2 = 112(0x70, float:1.57E-43)
            goto L_0x0c18
        L_0x0d0e:
            throw r2     // Catch:{ all -> 0x0d19 }
        L_0x0d0f:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x0d19 }
            if (r3 == 0) goto L_0x0d18
            throw r3     // Catch:{ all -> 0x0d19 }
        L_0x0d18:
            throw r2     // Catch:{ all -> 0x0d19 }
        L_0x0d19:
            r0 = move-exception
            r2 = r0
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11833e(android.content.Context):void");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [int, boolean] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized boolean m11825b(int r17) {
        /*
            java.lang.Class<com.facetec.sdk.cd> r1 = com.facetec.sdk.C2885cd.class
            monitor-enter(r1)
            com.facetec.sdk.do r0 = new com.facetec.sdk.do     // Catch:{ all -> 0x01ef }
            r2 = r17
            r0.<init>((int) r2)     // Catch:{ all -> 0x01ef }
            r2 = 888(0x378, float:1.244E-42)
            short r2 = (short) r2     // Catch:{ all -> 0x01ef }
            byte[] r3 = f9518c     // Catch:{ all -> 0x01ef }
            r4 = 21
            byte r4 = r3[r4]     // Catch:{ all -> 0x01ef }
            byte r4 = (byte) r4     // Catch:{ all -> 0x01ef }
            r5 = r4 | 1446(0x5a6, float:2.026E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x01ef }
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x01ef }
            m11815as(r2, r4, r5, r7)     // Catch:{ all -> 0x01ef }
            r2 = 0
            r4 = r7[r2]     // Catch:{ all -> 0x01ef }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x01ef }
            r5 = 1066(0x42a, float:1.494E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x01ef }
            r7 = 18
            byte r7 = r3[r7]     // Catch:{ all -> 0x01ef }
            byte r7 = (byte) r7     // Catch:{ all -> 0x01ef }
            r8 = r7 | 6193(0x1831, float:8.678E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x01ef }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x01ef }
            m11815as(r5, r7, r8, r9)     // Catch:{ all -> 0x01ef }
            r5 = r9[r2]     // Catch:{ all -> 0x01ef }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x01ef }
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x01e6 }
            r7[r2] = r5     // Catch:{ all -> 0x01e6 }
            r5 = 1051(0x41b, float:1.473E-42)
            short r5 = (short) r5     // Catch:{ all -> 0x01e6 }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r3[r8]     // Catch:{ all -> 0x01e6 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x01e6 }
            r10 = 5290(0x14aa, float:7.413E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x01e6 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x01e6 }
            m11815as(r5, r9, r10, r11)     // Catch:{ all -> 0x01e6 }
            r9 = r11[r2]     // Catch:{ all -> 0x01e6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01e6 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x01e6 }
            r11 = 1062(0x426, float:1.488E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x01e6 }
            r12 = 3127(0xc37, float:4.382E-42)
            byte r12 = r3[r12]     // Catch:{ all -> 0x01e6 }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x01e6 }
            r13 = 4131(0x1023, float:5.789E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x01e6 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x01e6 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x01e6 }
            r11 = r14[r2]     // Catch:{ all -> 0x01e6 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x01e6 }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x01e6 }
            byte r3 = r3[r8]     // Catch:{ all -> 0x01e6 }
            int r3 = -r3
            byte r3 = (byte) r3     // Catch:{ all -> 0x01e6 }
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ all -> 0x01e6 }
            m11815as(r5, r3, r10, r13)     // Catch:{ all -> 0x01e6 }
            r3 = r13[r2]     // Catch:{ all -> 0x01e6 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01e6 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x01e6 }
            r12[r2] = r3     // Catch:{ all -> 0x01e6 }
            java.lang.reflect.Method r3 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x01e6 }
            java.lang.Object r3 = r3.invoke(r4, r7)     // Catch:{ all -> 0x01e6 }
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch:{ all -> 0x01e6 }
            int r4 = r3.length     // Catch:{ all -> 0x01ef }
            int[] r4 = new int[r4]     // Catch:{ all -> 0x01ef }
            r7 = r2
        L_0x008b:
            int r9 = r3.length     // Catch:{ all -> 0x01ef }
            if (r7 >= r9) goto L_0x013b
            r9 = r3[r7]     // Catch:{ all -> 0x01ef }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0132 }
            r11[r2] = r9     // Catch:{ all -> 0x0132 }
            r9 = 1050(0x41a, float:1.471E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0132 }
            byte[] r12 = f9518c     // Catch:{ all -> 0x0132 }
            byte r13 = r12[r8]     // Catch:{ all -> 0x0132 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0132 }
            int r14 = f9519d     // Catch:{ all -> 0x0132 }
            r15 = r14 | 6720(0x1a40, float:9.417E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x0132 }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x0132 }
            m11815as(r9, r13, r15, r8)     // Catch:{ all -> 0x0132 }
            r8 = r8[r2]     // Catch:{ all -> 0x0132 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0132 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0132 }
            r13 = 1060(0x424, float:1.485E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0132 }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x0132 }
            r2 = 1465(0x5b9, float:2.053E-42)
            short r2 = (short) r2     // Catch:{ all -> 0x0132 }
            r16 = r3
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0132 }
            m11815as(r13, r15, r2, r3)     // Catch:{ all -> 0x0132 }
            r2 = 0
            r3 = r3[r2]     // Catch:{ all -> 0x0132 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0132 }
            java.lang.Class[] r2 = new java.lang.Class[r6]     // Catch:{ all -> 0x0132 }
            r13 = 2385(0x951, float:3.342E-42)
            byte r15 = r12[r13]     // Catch:{ all -> 0x0132 }
            int r13 = -r15
            byte r13 = (byte) r13     // Catch:{ all -> 0x0132 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x0132 }
            m11815as(r5, r13, r10, r15)     // Catch:{ all -> 0x0132 }
            r13 = 0
            r15 = r15[r13]     // Catch:{ all -> 0x0132 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0132 }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x0132 }
            r2[r13] = r15     // Catch:{ all -> 0x0132 }
            java.lang.reflect.Method r2 = r8.getMethod(r3, r2)     // Catch:{ all -> 0x0132 }
            r3 = 0
            java.lang.Object r2 = r2.invoke(r3, r11)     // Catch:{ all -> 0x0132 }
            r8 = 2385(0x951, float:3.342E-42)
            byte r11 = r12[r8]     // Catch:{ all -> 0x0129 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0129 }
            r13 = r14 | 6720(0x1a40, float:9.417E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0129 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0129 }
            m11815as(r9, r11, r13, r14)     // Catch:{ all -> 0x0129 }
            r9 = 0
            r11 = r14[r9]     // Catch:{ all -> 0x0129 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0129 }
            java.lang.Class r9 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0129 }
            r11 = 1059(0x423, float:1.484E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0129 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r12 = r12[r13]     // Catch:{ all -> 0x0129 }
            int r12 = r12 + r6
            byte r12 = (byte) r12     // Catch:{ all -> 0x0129 }
            r13 = 1459(0x5b3, float:2.044E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0129 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0129 }
            m11815as(r11, r12, r13, r14)     // Catch:{ all -> 0x0129 }
            r11 = 0
            r12 = r14[r11]     // Catch:{ all -> 0x0129 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0129 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r3)     // Catch:{ all -> 0x0129 }
            java.lang.Object r2 = r9.invoke(r2, r3)     // Catch:{ all -> 0x0129 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0129 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0129 }
            r4[r7] = r2     // Catch:{ all -> 0x01ef }
            int r7 = r7 + 1
            r2 = r11
            r3 = r16
            goto L_0x008b
        L_0x0129:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x01ef }
            if (r2 == 0) goto L_0x0131
            throw r2     // Catch:{ all -> 0x01ef }
        L_0x0131:
            throw r0     // Catch:{ all -> 0x01ef }
        L_0x0132:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x01ef }
            if (r2 == 0) goto L_0x013a
            throw r2     // Catch:{ all -> 0x01ef }
        L_0x013a:
            throw r0     // Catch:{ all -> 0x01ef }
        L_0x013b:
            r11 = r2
            r2 = r11
        L_0x013d:
            int r3 = r2 + 1
            r2 = r4[r2]     // Catch:{ all -> 0x01ef }
            int r2 = r0.mo9125d(r2)     // Catch:{ all -> 0x01ef }
            r5 = 8
            r7 = 4
            r8 = 20
            r9 = 9
            r10 = 5
            r11 = 12
            switch(r2) {
                case -21: goto L_0x01df;
                case -20: goto L_0x01d1;
                case -19: goto L_0x01cd;
                case -18: goto L_0x01bf;
                case -17: goto L_0x01bb;
                case -16: goto L_0x01b8;
                case -15: goto L_0x01ae;
                case -14: goto L_0x01ac;
                case -13: goto L_0x01a9;
                case -12: goto L_0x019f;
                case -11: goto L_0x0192;
                case -10: goto L_0x018d;
                case -9: goto L_0x018a;
                case -8: goto L_0x0187;
                case -7: goto L_0x0180;
                case -6: goto L_0x0171;
                case -5: goto L_0x016e;
                case -4: goto L_0x016b;
                case -3: goto L_0x0162;
                case -2: goto L_0x0157;
                case -1: goto L_0x0154;
                default: goto L_0x0152;
            }     // Catch:{ all -> 0x01ef }
        L_0x0152:
            goto L_0x01e3
        L_0x0154:
            r2 = 11
            goto L_0x013d
        L_0x0157:
            boolean r2 = m11772G()     // Catch:{ all -> 0x01ef }
            r0.f10018b = r2     // Catch:{ all -> 0x01ef }
        L_0x015d:
            r0.mo9125d(r6)     // Catch:{ all -> 0x01ef }
            goto L_0x01e3
        L_0x0162:
            r0.mo9125d(r11)     // Catch:{ all -> 0x01ef }
            int r2 = r0.f10020d     // Catch:{ all -> 0x01ef }
            if (r2 != 0) goto L_0x01e3
            r2 = r7
            goto L_0x013d
        L_0x016b:
            r2 = 47
            goto L_0x013d
        L_0x016e:
            r2 = 45
            goto L_0x013d
        L_0x0171:
            r0.f10018b = r6     // Catch:{ all -> 0x01ef }
            r0.mo9125d(r5)     // Catch:{ all -> 0x01ef }
            r0.mo9125d(r9)     // Catch:{ all -> 0x01ef }
            int r2 = r0.f10020d     // Catch:{ all -> 0x01ef }
            m11819aw(r2)     // Catch:{ all -> 0x01ef }
            goto L_0x01e3
        L_0x0180:
            r0.mo9125d(r7)     // Catch:{ all -> 0x01ef }
            int r0 = r0.f10020d     // Catch:{ all -> 0x01ef }
            monitor-exit(r1)
            return r0
        L_0x0187:
            r2 = 15
            goto L_0x013d
        L_0x018a:
            r2 = 17
            goto L_0x013d
        L_0x018d:
            int r2 = f9527n     // Catch:{ all -> 0x01ef }
            r0.f10018b = r2     // Catch:{ all -> 0x01ef }
            goto L_0x015d
        L_0x0192:
            r0.f10018b = r6     // Catch:{ all -> 0x01ef }
            r0.mo9125d(r5)     // Catch:{ all -> 0x01ef }
            r0.mo9125d(r9)     // Catch:{ all -> 0x01ef }
            int r2 = r0.f10020d     // Catch:{ all -> 0x01ef }
            f9526m = r2     // Catch:{ all -> 0x01ef }
            goto L_0x01e3
        L_0x019f:
            r0.mo9125d(r11)     // Catch:{ all -> 0x01ef }
            int r2 = r0.f10020d     // Catch:{ all -> 0x01ef }
            if (r2 != 0) goto L_0x01e3
            r2 = 26
            goto L_0x013d
        L_0x01a9:
            r2 = 27
            goto L_0x013d
        L_0x01ac:
            r2 = r6
            goto L_0x013d
        L_0x01ae:
            r0.mo9125d(r11)     // Catch:{ all -> 0x01ef }
            int r2 = r0.f10020d     // Catch:{ all -> 0x01ef }
            if (r2 != 0) goto L_0x01e3
            r2 = 39
            goto L_0x013d
        L_0x01b8:
            r2 = 52
            goto L_0x013d
        L_0x01bb:
            r2 = 50
            goto L_0x013d
        L_0x01bf:
            r0.mo9125d(r8)     // Catch:{ all -> 0x01ef }
            int r2 = r0.f10020d     // Catch:{ all -> 0x01ef }
            if (r2 == r10) goto L_0x01ca
            r2 = 28
            goto L_0x013d
        L_0x01ca:
            r2 = r9
            goto L_0x013d
        L_0x01cd:
            r2 = 44
            goto L_0x013d
        L_0x01d1:
            r0.mo9125d(r8)     // Catch:{ all -> 0x01ef }
            int r2 = r0.f10020d     // Catch:{ all -> 0x01ef }
            if (r2 == 0) goto L_0x01db
            r2 = r10
            goto L_0x013d
        L_0x01db:
            r2 = 40
            goto L_0x013d
        L_0x01df:
            r2 = 49
            goto L_0x013d
        L_0x01e3:
            r2 = r3
            goto L_0x013d
        L_0x01e6:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ all -> 0x01ef }
            if (r2 == 0) goto L_0x01ee
            throw r2     // Catch:{ all -> 0x01ef }
        L_0x01ee:
            throw r0     // Catch:{ all -> 0x01ef }
        L_0x01ef:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11825b(int):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0427, code lost:
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0770, code lost:
        r2.mo9125d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x088e, code lost:
        r2.mo9125d(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x08f6, code lost:
        r2.mo9125d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01e8, code lost:
        r2.mo9125d(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02cc, code lost:
        r2.mo9125d(1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03da A[Catch:{ all -> 0x03dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x03db A[Catch:{ all -> 0x03dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x052d A[Catch:{ all -> 0x06a4, all -> 0x062b, all -> 0x05dd, all -> 0x0585, all -> 0x0336, all -> 0x02be, all -> 0x025d, all -> 0x01ed, all -> 0x06be }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x052e A[Catch:{ all -> 0x06a4, all -> 0x062b, all -> 0x05dd, all -> 0x0585, all -> 0x0336, all -> 0x02be, all -> 0x025d, all -> 0x01ed, all -> 0x06be }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0781 A[Catch:{ all -> 0x07e2, all -> 0x0775, all -> 0x0819 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0782 A[Catch:{ all -> 0x07e2, all -> 0x0775, all -> 0x0819 }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0872 A[Catch:{ all -> 0x0866, all -> 0x0894 }] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0873 A[Catch:{ all -> 0x0866, all -> 0x0894 }] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x090b A[Catch:{ all -> 0x08fb, all -> 0x09f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x090c A[Catch:{ all -> 0x08fb, all -> 0x09f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0a35 A[Catch:{ all -> 0x0a6a, all -> 0x013f, all -> 0x0135, all -> 0x0a74 }] */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0a38 A[Catch:{ all -> 0x0a6a, all -> 0x013f, all -> 0x0135, all -> 0x0a74 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m11834e(android.content.res.AssetManager r21, java.lang.String r22, java.lang.String r23) {
        /*
            java.lang.Class<com.facetec.sdk.cd> r1 = com.facetec.sdk.C2885cd.class
            monitor-enter(r1)
            com.facetec.sdk.do r2 = new com.facetec.sdk.do     // Catch:{ all -> 0x0a74 }
            r3 = r21
            r4 = r22
            r5 = r23
            r2.<init>(r3, r4, r5)     // Catch:{ all -> 0x0a74 }
            r3 = 474(0x1da, float:6.64E-43)
            short r3 = (short) r3     // Catch:{ all -> 0x0a74 }
            byte[] r4 = f9518c     // Catch:{ all -> 0x0a74 }
            r5 = 21
            byte r5 = r4[r5]     // Catch:{ all -> 0x0a74 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x0a74 }
            r6 = r5 | 2942(0xb7e, float:4.123E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0a74 }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0a74 }
            m11815as(r3, r5, r6, r8)     // Catch:{ all -> 0x0a74 }
            r3 = 0
            r5 = r8[r3]     // Catch:{ all -> 0x0a74 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0a74 }
            r6 = 1066(0x42a, float:1.494E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0a74 }
            r8 = 18
            byte r8 = r4[r8]     // Catch:{ all -> 0x0a74 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0a74 }
            r9 = r8 | 6193(0x1831, float:8.678E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0a74 }
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x0a74 }
            m11815as(r6, r8, r9, r10)     // Catch:{ all -> 0x0a74 }
            r6 = r10[r3]     // Catch:{ all -> 0x0a74 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0a74 }
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0a6a }
            r8[r3] = r6     // Catch:{ all -> 0x0a6a }
            r6 = 1051(0x41b, float:1.473E-42)
            short r6 = (short) r6     // Catch:{ all -> 0x0a6a }
            r9 = 2385(0x951, float:3.342E-42)
            byte r10 = r4[r9]     // Catch:{ all -> 0x0a6a }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x0a6a }
            r11 = 5290(0x14aa, float:7.413E-42)
            short r11 = (short) r11     // Catch:{ all -> 0x0a6a }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x0a6a }
            m11815as(r6, r10, r11, r12)     // Catch:{ all -> 0x0a6a }
            r10 = r12[r3]     // Catch:{ all -> 0x0a6a }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0a6a }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0a6a }
            r12 = 1062(0x426, float:1.488E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0a6a }
            r13 = 3127(0xc37, float:4.382E-42)
            byte r13 = r4[r13]     // Catch:{ all -> 0x0a6a }
            int r13 = r13 + r7
            byte r13 = (byte) r13     // Catch:{ all -> 0x0a6a }
            r14 = 4131(0x1023, float:5.789E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0a6a }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x0a6a }
            m11815as(r12, r13, r14, r15)     // Catch:{ all -> 0x0a6a }
            r13 = r15[r3]     // Catch:{ all -> 0x0a6a }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0a6a }
            java.lang.Class[] r14 = new java.lang.Class[r7]     // Catch:{ all -> 0x0a6a }
            byte r4 = r4[r9]     // Catch:{ all -> 0x0a6a }
            int r4 = -r4
            byte r4 = (byte) r4     // Catch:{ all -> 0x0a6a }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x0a6a }
            m11815as(r6, r4, r11, r15)     // Catch:{ all -> 0x0a6a }
            r4 = r15[r3]     // Catch:{ all -> 0x0a6a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0a6a }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0a6a }
            r14[r3] = r4     // Catch:{ all -> 0x0a6a }
            java.lang.reflect.Method r4 = r10.getMethod(r13, r14)     // Catch:{ all -> 0x0a6a }
            java.lang.Object r4 = r4.invoke(r5, r8)     // Catch:{ all -> 0x0a6a }
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch:{ all -> 0x0a6a }
            int r5 = r4.length     // Catch:{ all -> 0x0a74 }
            int[] r5 = new int[r5]     // Catch:{ all -> 0x0a74 }
            r8 = r3
        L_0x008f:
            int r10 = r4.length     // Catch:{ all -> 0x0a74 }
            if (r8 >= r10) goto L_0x0149
            r10 = r4[r8]     // Catch:{ all -> 0x0a74 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x013f }
            r13[r3] = r10     // Catch:{ all -> 0x013f }
            r10 = 1050(0x41a, float:1.471E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x013f }
            byte[] r16 = f9518c     // Catch:{ all -> 0x013f }
            byte r15 = r16[r9]     // Catch:{ all -> 0x013f }
            int r15 = -r15
            byte r15 = (byte) r15     // Catch:{ all -> 0x013f }
            int r9 = f9519d     // Catch:{ all -> 0x013f }
            r14 = r9 | 6720(0x1a40, float:9.417E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x013f }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x013f }
            m11815as(r10, r15, r14, r3)     // Catch:{ all -> 0x013f }
            r14 = 0
            r3 = r3[r14]     // Catch:{ all -> 0x013f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x013f }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x013f }
            r14 = 1060(0x424, float:1.485E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x013f }
            r15 = 74
            byte r15 = (byte) r15     // Catch:{ all -> 0x013f }
            r17 = r4
            r4 = 1465(0x5b9, float:2.053E-42)
            short r4 = (short) r4     // Catch:{ all -> 0x013f }
            r18 = r12
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x013f }
            m11815as(r14, r15, r4, r12)     // Catch:{ all -> 0x013f }
            r4 = 0
            r12 = r12[r4]     // Catch:{ all -> 0x013f }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x013f }
            java.lang.Class[] r4 = new java.lang.Class[r7]     // Catch:{ all -> 0x013f }
            r14 = 2385(0x951, float:3.342E-42)
            byte r15 = r16[r14]     // Catch:{ all -> 0x013f }
            int r14 = -r15
            byte r14 = (byte) r14     // Catch:{ all -> 0x013f }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x013f }
            m11815as(r6, r14, r11, r15)     // Catch:{ all -> 0x013f }
            r14 = 0
            r15 = r15[r14]     // Catch:{ all -> 0x013f }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x013f }
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch:{ all -> 0x013f }
            r4[r14] = r15     // Catch:{ all -> 0x013f }
            java.lang.reflect.Method r3 = r3.getMethod(r12, r4)     // Catch:{ all -> 0x013f }
            r4 = 0
            java.lang.Object r3 = r3.invoke(r4, r13)     // Catch:{ all -> 0x013f }
            r4 = 2385(0x951, float:3.342E-42)
            byte r12 = r16[r4]     // Catch:{ all -> 0x0135 }
            int r4 = -r12
            byte r4 = (byte) r4     // Catch:{ all -> 0x0135 }
            r9 = r9 | 6720(0x1a40, float:9.417E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0135 }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x0135 }
            m11815as(r10, r4, r9, r12)     // Catch:{ all -> 0x0135 }
            r4 = 0
            r9 = r12[r4]     // Catch:{ all -> 0x0135 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0135 }
            java.lang.Class r4 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0135 }
            r9 = 1059(0x423, float:1.484E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0135 }
            r10 = 1801(0x709, float:2.524E-42)
            byte r10 = r16[r10]     // Catch:{ all -> 0x0135 }
            int r10 = r10 + r7
            byte r10 = (byte) r10     // Catch:{ all -> 0x0135 }
            r12 = 1459(0x5b3, float:2.044E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0135 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0135 }
            m11815as(r9, r10, r12, r13)     // Catch:{ all -> 0x0135 }
            r9 = 0
            r10 = r13[r9]     // Catch:{ all -> 0x0135 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0135 }
            r9 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r10, r9)     // Catch:{ all -> 0x0135 }
            java.lang.Object r3 = r4.invoke(r3, r9)     // Catch:{ all -> 0x0135 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0135 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0135 }
            r5[r8] = r3     // Catch:{ all -> 0x0a74 }
            int r8 = r8 + 1
            r4 = r17
            r12 = r18
            r3 = 0
            r9 = 2385(0x951, float:3.342E-42)
            goto L_0x008f
        L_0x0135:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x0a74 }
            if (r3 == 0) goto L_0x013e
            throw r3     // Catch:{ all -> 0x0a74 }
        L_0x013e:
            throw r2     // Catch:{ all -> 0x0a74 }
        L_0x013f:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x0a74 }
            if (r3 == 0) goto L_0x0148
            throw r3     // Catch:{ all -> 0x0a74 }
        L_0x0148:
            throw r2     // Catch:{ all -> 0x0a74 }
        L_0x0149:
            r18 = r12
            r3 = 0
        L_0x014c:
            int r4 = r3 + 1
            r12 = 2
            r3 = r5[r3]     // Catch:{ all -> 0x0a04 }
            int r3 = r2.mo9125d(r3)     // Catch:{ all -> 0x0a04 }
            r9 = 156(0x9c, float:2.19E-43)
            r8 = 3
            r19 = 125(0x7d, float:1.75E-43)
            r13 = 9
            r14 = 8
            r15 = 27
            switch(r3) {
                case -55: goto L_0x09f4;
                case -54: goto L_0x09dc;
                case -53: goto L_0x09d1;
                case -52: goto L_0x09b6;
                case -51: goto L_0x09ab;
                case -50: goto L_0x09a0;
                case -49: goto L_0x098d;
                case -48: goto L_0x098a;
                case -47: goto L_0x097f;
                case -46: goto L_0x096b;
                case -45: goto L_0x0956;
                case -44: goto L_0x094a;
                case -43: goto L_0x0947;
                case -42: goto L_0x0943;
                case -41: goto L_0x0938;
                case -40: goto L_0x0911;
                case -39: goto L_0x089b;
                case -38: goto L_0x0878;
                case -37: goto L_0x0820;
                case -36: goto L_0x07ec;
                case -35: goto L_0x0788;
                case -34: goto L_0x06c4;
                case -33: goto L_0x06b6;
                case -32: goto L_0x06ae;
                case -31: goto L_0x0635;
                case -30: goto L_0x0600;
                case -29: goto L_0x05fc;
                case -28: goto L_0x05f8;
                case -27: goto L_0x05eb;
                case -26: goto L_0x05e7;
                case -25: goto L_0x058f;
                case -24: goto L_0x0534;
                case -23: goto L_0x04b2;
                case -22: goto L_0x04a1;
                case -21: goto L_0x049a;
                case -20: goto L_0x0495;
                case -19: goto L_0x0487;
                case -18: goto L_0x0485;
                case -17: goto L_0x0435;
                case -16: goto L_0x03e4;
                case -15: goto L_0x0355;
                case -14: goto L_0x0351;
                case -13: goto L_0x034d;
                case -12: goto L_0x0340;
                case -11: goto L_0x02d5;
                case -10: goto L_0x02d1;
                case -9: goto L_0x02c8;
                case -8: goto L_0x0267;
                case -7: goto L_0x020d;
                case -6: goto L_0x0209;
                case -5: goto L_0x0205;
                case -4: goto L_0x01fa;
                case -3: goto L_0x01f7;
                case -2: goto L_0x016f;
                case -1: goto L_0x016c;
                default: goto L_0x0163;
            }
        L_0x0163:
            r20 = r5
        L_0x0165:
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
        L_0x0168:
            r12 = 1060(0x424, float:1.485E-42)
            goto L_0x09ff
        L_0x016c:
            r3 = 115(0x73, float:1.61E-43)
            goto L_0x014c
        L_0x016f:
            r2.f10018b = r8     // Catch:{ all -> 0x06be }
            r2.mo9125d(r14)     // Catch:{ all -> 0x06be }
            r2.mo9125d(r15)     // Catch:{ all -> 0x06be }
            java.lang.Object r3 = r2.f10026j     // Catch:{ all -> 0x06be }
            r2.mo9125d(r15)     // Catch:{ all -> 0x06be }
            java.lang.Object r8 = r2.f10026j     // Catch:{ all -> 0x06be }
            r2.mo9125d(r13)     // Catch:{ all -> 0x06be }
            int r9 = r2.f10020d     // Catch:{ all -> 0x06be }
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x01ed }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01ed }
            r13[r7] = r9     // Catch:{ all -> 0x01ed }
            r9 = 0
            r13[r9] = r8     // Catch:{ all -> 0x01ed }
            r8 = 1035(0x40b, float:1.45E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x01ed }
            int r9 = f9519d     // Catch:{ all -> 0x01ed }
            r9 = r9 & 125(0x7d, float:1.75E-43)
            byte r9 = (byte) r9     // Catch:{ all -> 0x01ed }
            r14 = 5349(0x14e5, float:7.496E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x01ed }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x01ed }
            m11815as(r8, r9, r14, r15)     // Catch:{ all -> 0x01ed }
            r8 = 0
            r9 = r15[r8]     // Catch:{ all -> 0x01ed }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x01ed }
            java.lang.Class r8 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x01ed }
            r9 = 1063(0x427, float:1.49E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x01ed }
            byte[] r14 = f9518c     // Catch:{ all -> 0x01ed }
            r15 = 560(0x230, float:7.85E-43)
            byte r15 = r14[r15]     // Catch:{ all -> 0x01ed }
            int r15 = -r15
            byte r15 = (byte) r15     // Catch:{ all -> 0x01ed }
            r10 = 4310(0x10d6, float:6.04E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x01ed }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x01ed }
            m11815as(r9, r15, r10, r12)     // Catch:{ all -> 0x01ed }
            r9 = 0
            r10 = r12[r9]     // Catch:{ all -> 0x01ed }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01ed }
            r9 = 2
            java.lang.Class[] r12 = new java.lang.Class[r9]     // Catch:{ all -> 0x01ed }
            r9 = 2385(0x951, float:3.342E-42)
            byte r14 = r14[r9]     // Catch:{ all -> 0x01ed }
            int r9 = -r14
            byte r9 = (byte) r9     // Catch:{ all -> 0x01ed }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x01ed }
            m11815as(r6, r9, r11, r14)     // Catch:{ all -> 0x01ed }
            r9 = 0
            r14 = r14[r9]     // Catch:{ all -> 0x01ed }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x01ed }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x01ed }
            r12[r9] = r14     // Catch:{ all -> 0x01ed }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01ed }
            r12[r7] = r9     // Catch:{ all -> 0x01ed }
            java.lang.reflect.Method r8 = r8.getMethod(r10, r12)     // Catch:{ all -> 0x01ed }
            java.lang.Object r3 = r8.invoke(r3, r13)     // Catch:{ all -> 0x01ed }
            r2.f10022f = r3     // Catch:{ all -> 0x06be }
            r3 = 24
        L_0x01e8:
            r2.mo9125d(r3)     // Catch:{ all -> 0x06be }
            goto L_0x0163
        L_0x01ed:
            r0 = move-exception
            r3 = r0
            java.lang.Throwable r8 = r3.getCause()     // Catch:{ all -> 0x06be }
            if (r8 == 0) goto L_0x01f6
            throw r8     // Catch:{ all -> 0x06be }
        L_0x01f6:
            throw r3     // Catch:{ all -> 0x06be }
        L_0x01f7:
            r3 = r13
            goto L_0x014c
        L_0x01fa:
            r2.mo9125d(r9)     // Catch:{ all -> 0x06be }
            int r3 = r2.f10020d     // Catch:{ all -> 0x06be }
            if (r3 != 0) goto L_0x049e
            r3 = 12
            goto L_0x014c
        L_0x0205:
            r3 = 13
            goto L_0x014c
        L_0x0209:
            r3 = 51
            goto L_0x014c
        L_0x020d:
            r2.f10018b = r7     // Catch:{ all -> 0x06be }
            r2.mo9125d(r14)     // Catch:{ all -> 0x06be }
            r2.mo9125d(r15)     // Catch:{ all -> 0x06be }
            java.lang.Object r3 = r2.f10026j     // Catch:{ all -> 0x06be }
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x025d }
            r9 = 0
            r8[r9] = r3     // Catch:{ all -> 0x025d }
            r3 = 1043(0x413, float:1.462E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x025d }
            byte[] r9 = f9518c     // Catch:{ all -> 0x025d }
            r10 = 2385(0x951, float:3.342E-42)
            byte r12 = r9[r10]     // Catch:{ all -> 0x025d }
            int r10 = -r12
            byte r10 = (byte) r10     // Catch:{ all -> 0x025d }
            r12 = 5045(0x13b5, float:7.07E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x025d }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x025d }
            m11815as(r3, r10, r12, r13)     // Catch:{ all -> 0x025d }
            r3 = 0
            r10 = r13[r3]     // Catch:{ all -> 0x025d }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x025d }
            java.lang.Class r3 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x025d }
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch:{ all -> 0x025d }
            r12 = 2385(0x951, float:3.342E-42)
            byte r9 = r9[r12]     // Catch:{ all -> 0x025d }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x025d }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x025d }
            m11815as(r6, r9, r11, r12)     // Catch:{ all -> 0x025d }
            r9 = 0
            r12 = r12[r9]     // Catch:{ all -> 0x025d }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x025d }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x025d }
            r10[r9] = r12     // Catch:{ all -> 0x025d }
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r10)     // Catch:{ all -> 0x025d }
            java.lang.Object r3 = r3.newInstance(r8)     // Catch:{ all -> 0x025d }
            r2.f10022f = r3     // Catch:{ all -> 0x06be }
            r3 = 24
            goto L_0x01e8
        L_0x025d:
            r0 = move-exception
            r3 = r0
            java.lang.Throwable r8 = r3.getCause()     // Catch:{ all -> 0x06be }
            if (r8 == 0) goto L_0x0266
            throw r8     // Catch:{ all -> 0x06be }
        L_0x0266:
            throw r3     // Catch:{ all -> 0x06be }
        L_0x0267:
            r2.f10018b = r7     // Catch:{ all -> 0x06be }
            r2.mo9125d(r14)     // Catch:{ all -> 0x06be }
            r2.mo9125d(r15)     // Catch:{ all -> 0x06be }
            java.lang.Object r3 = r2.f10026j     // Catch:{ all -> 0x06be }
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x02be }
            r9 = 0
            r8[r9] = r3     // Catch:{ all -> 0x02be }
            r3 = 1039(0x40f, float:1.456E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x02be }
            byte[] r9 = f9518c     // Catch:{ all -> 0x02be }
            r10 = 2385(0x951, float:3.342E-42)
            byte r12 = r9[r10]     // Catch:{ all -> 0x02be }
            int r10 = -r12
            byte r10 = (byte) r10     // Catch:{ all -> 0x02be }
            r12 = 5664(0x1620, float:7.937E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x02be }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x02be }
            m11815as(r3, r10, r12, r13)     // Catch:{ all -> 0x02be }
            r3 = 0
            r10 = r13[r3]     // Catch:{ all -> 0x02be }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x02be }
            java.lang.Class r3 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x02be }
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch:{ all -> 0x02be }
            r12 = 1047(0x417, float:1.467E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x02be }
            r13 = 2385(0x951, float:3.342E-42)
            byte r9 = r9[r13]     // Catch:{ all -> 0x02be }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x02be }
            r13 = 1498(0x5da, float:2.099E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x02be }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x02be }
            m11815as(r12, r9, r13, r14)     // Catch:{ all -> 0x02be }
            r9 = 0
            r12 = r14[r9]     // Catch:{ all -> 0x02be }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x02be }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x02be }
            r10[r9] = r12     // Catch:{ all -> 0x02be }
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r10)     // Catch:{ all -> 0x02be }
            java.lang.Object r3 = r3.newInstance(r8)     // Catch:{ all -> 0x02be }
            r2.f10022f = r3     // Catch:{ all -> 0x06be }
            r3 = 24
            goto L_0x01e8
        L_0x02be:
            r0 = move-exception
            r3 = r0
            java.lang.Throwable r8 = r3.getCause()     // Catch:{ all -> 0x06be }
            if (r8 == 0) goto L_0x02c7
            throw r8     // Catch:{ all -> 0x06be }
        L_0x02c7:
            throw r3     // Catch:{ all -> 0x06be }
        L_0x02c8:
            r3 = 2097152(0x200000, float:2.938736E-39)
            r2.f10018b = r3     // Catch:{ all -> 0x06be }
        L_0x02cc:
            r2.mo9125d(r7)     // Catch:{ all -> 0x06be }
            goto L_0x0163
        L_0x02d1:
            r3 = 23
            goto L_0x014c
        L_0x02d5:
            r3 = r12
            r2.f10018b = r3     // Catch:{ all -> 0x06be }
            r2.mo9125d(r14)     // Catch:{ all -> 0x06be }
            r2.mo9125d(r15)     // Catch:{ all -> 0x06be }
            java.lang.Object r3 = r2.f10026j     // Catch:{ all -> 0x06be }
            r2.mo9125d(r15)     // Catch:{ all -> 0x06be }
            java.lang.Object r8 = r2.f10026j     // Catch:{ all -> 0x06be }
            byte[] r8 = (byte[]) r8     // Catch:{ all -> 0x06be }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x0336 }
            r10 = 0
            r9[r10] = r8     // Catch:{ all -> 0x0336 }
            r8 = 1048(0x418, float:1.469E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x0336 }
            byte[] r10 = f9518c     // Catch:{ all -> 0x0336 }
            r12 = 2385(0x951, float:3.342E-42)
            byte r13 = r10[r12]     // Catch:{ all -> 0x0336 }
            int r12 = -r13
            byte r12 = (byte) r12     // Catch:{ all -> 0x0336 }
            r13 = 5353(0x14e9, float:7.501E-42)
            byte r13 = r10[r13]     // Catch:{ all -> 0x0336 }
            short r13 = (short) r13     // Catch:{ all -> 0x0336 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0336 }
            m11815as(r8, r12, r13, r14)     // Catch:{ all -> 0x0336 }
            r8 = 0
            r12 = r14[r8]     // Catch:{ all -> 0x0336 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0336 }
            java.lang.Class r8 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0336 }
            r12 = 1063(0x427, float:1.49E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0336 }
            r13 = 3127(0xc37, float:4.382E-42)
            byte r10 = r10[r13]     // Catch:{ all -> 0x0336 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x0336 }
            r13 = 3120(0xc30, float:4.372E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0336 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0336 }
            m11815as(r12, r10, r13, r14)     // Catch:{ all -> 0x0336 }
            r10 = 0
            r12 = r14[r10]     // Catch:{ all -> 0x0336 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0336 }
            java.lang.Class[] r13 = new java.lang.Class[r7]     // Catch:{ all -> 0x0336 }
            java.lang.Class<byte[]> r14 = byte[].class
            r13[r10] = r14     // Catch:{ all -> 0x0336 }
            java.lang.reflect.Method r8 = r8.getMethod(r12, r13)     // Catch:{ all -> 0x0336 }
            java.lang.Object r3 = r8.invoke(r3, r9)     // Catch:{ all -> 0x0336 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0336 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0336 }
            r2.f10018b = r3     // Catch:{ all -> 0x06be }
            goto L_0x02cc
        L_0x0336:
            r0 = move-exception
            r3 = r0
            java.lang.Throwable r8 = r3.getCause()     // Catch:{ all -> 0x06be }
            if (r8 == 0) goto L_0x033f
            throw r8     // Catch:{ all -> 0x06be }
        L_0x033f:
            throw r3     // Catch:{ all -> 0x06be }
        L_0x0340:
            r3 = 207(0xcf, float:2.9E-43)
            r2.mo9125d(r3)     // Catch:{ all -> 0x06be }
            int r3 = r2.f10020d     // Catch:{ all -> 0x06be }
            if (r3 != 0) goto L_0x049e
            r3 = 29
            goto L_0x014c
        L_0x034d:
            r3 = 153(0x99, float:2.14E-43)
            goto L_0x014c
        L_0x0351:
            r3 = 151(0x97, float:2.12E-43)
            goto L_0x014c
        L_0x0355:
            r3 = 4
            r2.f10018b = r3     // Catch:{ all -> 0x06be }
            r2.mo9125d(r14)     // Catch:{ all -> 0x06be }
            r2.mo9125d(r15)     // Catch:{ all -> 0x06be }
            java.lang.Object r3 = r2.f10026j     // Catch:{ all -> 0x06be }
            r2.mo9125d(r15)     // Catch:{ all -> 0x06be }
            java.lang.Object r9 = r2.f10026j     // Catch:{ all -> 0x06be }
            byte[] r9 = (byte[]) r9     // Catch:{ all -> 0x06be }
            r2.mo9125d(r13)     // Catch:{ all -> 0x06be }
            int r10 = r2.f10020d     // Catch:{ all -> 0x06be }
            r2.mo9125d(r13)     // Catch:{ all -> 0x06be }
            int r12 = r2.f10020d     // Catch:{ all -> 0x06be }
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ all -> 0x03d0 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x03d0 }
            r14 = 2
            r13[r14] = r12     // Catch:{ all -> 0x03d0 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x03d0 }
            r13[r7] = r10     // Catch:{ all -> 0x03d0 }
            r10 = 0
            r13[r10] = r9     // Catch:{ all -> 0x03d0 }
            r9 = 1047(0x417, float:1.467E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x03d0 }
            byte[] r10 = f9518c     // Catch:{ all -> 0x03d0 }
            r12 = 2385(0x951, float:3.342E-42)
            byte r14 = r10[r12]     // Catch:{ all -> 0x03d0 }
            int r12 = -r14
            byte r12 = (byte) r12     // Catch:{ all -> 0x03d0 }
            r14 = 1498(0x5da, float:2.099E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x03d0 }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x03d0 }
            m11815as(r9, r12, r14, r15)     // Catch:{ all -> 0x03d0 }
            r9 = 0
            r12 = r15[r9]     // Catch:{ all -> 0x03d0 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x03d0 }
            java.lang.Class r9 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x03d0 }
            r12 = 2148(0x864, float:3.01E-42)
            byte r10 = r10[r12]     // Catch:{ all -> 0x03d0 }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x03d0 }
            r12 = 6456(0x1938, float:9.047E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x03d0 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x03d0 }
            r15 = r18
            m11815as(r15, r10, r12, r14)     // Catch:{ all -> 0x03ce }
            r10 = 0
            r12 = r14[r10]     // Catch:{ all -> 0x03ce }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x03ce }
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch:{ all -> 0x03ce }
            java.lang.Class<byte[]> r14 = byte[].class
            r8[r10] = r14     // Catch:{ all -> 0x03ce }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x03ce }
            r8[r7] = r10     // Catch:{ all -> 0x03ce }
            r14 = 2
            r8[r14] = r10     // Catch:{ all -> 0x03ce }
            java.lang.reflect.Method r8 = r9.getMethod(r12, r8)     // Catch:{ all -> 0x03ce }
            r8.invoke(r3, r13)     // Catch:{ all -> 0x03ce }
            r20 = r5
            r18 = r15
            goto L_0x0165
        L_0x03ce:
            r0 = move-exception
            goto L_0x03d3
        L_0x03d0:
            r0 = move-exception
            r15 = r18
        L_0x03d3:
            r3 = r0
            java.lang.Throwable r8 = r3.getCause()     // Catch:{ all -> 0x03dc }
            if (r8 == 0) goto L_0x03db
            throw r8     // Catch:{ all -> 0x03dc }
        L_0x03db:
            throw r3     // Catch:{ all -> 0x03dc }
        L_0x03dc:
            r0 = move-exception
            r3 = r0
            r20 = r5
            r18 = r15
            goto L_0x081b
        L_0x03e4:
            r3 = r18
            r2.f10018b = r7     // Catch:{ all -> 0x04ad }
            r2.mo9125d(r14)     // Catch:{ all -> 0x04ad }
            r2.mo9125d(r15)     // Catch:{ all -> 0x04ad }
            java.lang.Object r8 = r2.f10026j     // Catch:{ all -> 0x04ad }
            r9 = 1047(0x417, float:1.467E-42)
            short r9 = (short) r9
            byte[] r10 = f9518c     // Catch:{ all -> 0x042b }
            r12 = 2385(0x951, float:3.342E-42)
            byte r13 = r10[r12]     // Catch:{ all -> 0x042b }
            int r12 = -r13
            byte r12 = (byte) r12     // Catch:{ all -> 0x042b }
            r13 = 1498(0x5da, float:2.099E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x042b }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x042b }
            m11815as(r9, r12, r13, r14)     // Catch:{ all -> 0x042b }
            r9 = 0
            r12 = r14[r9]     // Catch:{ all -> 0x042b }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x042b }
            java.lang.Class r9 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x042b }
            r12 = 2130(0x852, float:2.985E-42)
            byte r10 = r10[r12]     // Catch:{ all -> 0x042b }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x042b }
            r12 = 5260(0x148c, float:7.371E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x042b }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x042b }
            m11815as(r3, r10, r12, r13)     // Catch:{ all -> 0x042b }
            r10 = 0
            r12 = r13[r10]     // Catch:{ all -> 0x042b }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x042b }
            r10 = 0
            java.lang.reflect.Method r9 = r9.getMethod(r12, r10)     // Catch:{ all -> 0x042b }
            r9.invoke(r8, r10)     // Catch:{ all -> 0x042b }
        L_0x0427:
            r18 = r3
            goto L_0x0163
        L_0x042b:
            r0 = move-exception
            r8 = r0
            java.lang.Throwable r9 = r8.getCause()     // Catch:{ all -> 0x04ad }
            if (r9 == 0) goto L_0x0434
            throw r9     // Catch:{ all -> 0x04ad }
        L_0x0434:
            throw r8     // Catch:{ all -> 0x04ad }
        L_0x0435:
            r3 = r18
            r2.f10018b = r7     // Catch:{ all -> 0x04ad }
            r2.mo9125d(r14)     // Catch:{ all -> 0x04ad }
            r2.mo9125d(r15)     // Catch:{ all -> 0x04ad }
            java.lang.Object r8 = r2.f10026j     // Catch:{ all -> 0x04ad }
            r9 = 1048(0x418, float:1.469E-42)
            short r9 = (short) r9
            byte[] r10 = f9518c     // Catch:{ all -> 0x047b }
            r12 = 2385(0x951, float:3.342E-42)
            byte r13 = r10[r12]     // Catch:{ all -> 0x047b }
            int r12 = -r13
            byte r12 = (byte) r12     // Catch:{ all -> 0x047b }
            r13 = 5353(0x14e9, float:7.501E-42)
            byte r13 = r10[r13]     // Catch:{ all -> 0x047b }
            short r13 = (short) r13     // Catch:{ all -> 0x047b }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x047b }
            m11815as(r9, r12, r13, r14)     // Catch:{ all -> 0x047b }
            r9 = 0
            r12 = r14[r9]     // Catch:{ all -> 0x047b }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x047b }
            java.lang.Class r9 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x047b }
            r12 = 2130(0x852, float:2.985E-42)
            byte r10 = r10[r12]     // Catch:{ all -> 0x047b }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x047b }
            r12 = 5260(0x148c, float:7.371E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x047b }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x047b }
            m11815as(r3, r10, r12, r13)     // Catch:{ all -> 0x047b }
            r10 = 0
            r12 = r13[r10]     // Catch:{ all -> 0x047b }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x047b }
            r10 = 0
            java.lang.reflect.Method r9 = r9.getMethod(r12, r10)     // Catch:{ all -> 0x047b }
            r9.invoke(r8, r10)     // Catch:{ all -> 0x047b }
            goto L_0x0427
        L_0x047b:
            r0 = move-exception
            r8 = r0
            java.lang.Throwable r9 = r8.getCause()     // Catch:{ all -> 0x04ad }
            if (r9 == 0) goto L_0x0484
            throw r9     // Catch:{ all -> 0x04ad }
        L_0x0484:
            throw r8     // Catch:{ all -> 0x04ad }
        L_0x0485:
            monitor-exit(r1)
            return
        L_0x0487:
            r3 = r18
            r2.mo9125d(r9)     // Catch:{ all -> 0x04ad }
            int r8 = r2.f10020d     // Catch:{ all -> 0x04ad }
            if (r8 != 0) goto L_0x0492
            r4 = 43
        L_0x0492:
            r18 = r3
            goto L_0x049e
        L_0x0495:
            r3 = r18
            r4 = 44
            goto L_0x049e
        L_0x049a:
            r3 = r18
            r4 = 47
        L_0x049e:
            r3 = r4
            goto L_0x014c
        L_0x04a1:
            r3 = r18
            r8 = 16
            r2.mo9125d(r8)     // Catch:{ all -> 0x04ad }
            java.lang.Object r8 = r2.f10026j     // Catch:{ all -> 0x04ad }
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch:{ all -> 0x04ad }
            throw r8     // Catch:{ all -> 0x04ad }
        L_0x04ad:
            r0 = move-exception
            r18 = r3
            goto L_0x0a05
        L_0x04b2:
            r8 = r12
            r3 = r18
            r2.f10018b = r8     // Catch:{ all -> 0x052f }
            r2.mo9125d(r14)     // Catch:{ all -> 0x052f }
            r2.mo9125d(r15)     // Catch:{ all -> 0x052f }
            java.lang.Object r8 = r2.f10026j     // Catch:{ all -> 0x052f }
            r2.mo9125d(r15)     // Catch:{ all -> 0x052f }
            java.lang.Object r9 = r2.f10026j     // Catch:{ all -> 0x052f }
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x0523 }
            r12 = 0
            r10[r12] = r9     // Catch:{ all -> 0x0523 }
            r9 = 1035(0x40b, float:1.45E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0523 }
            int r12 = f9519d     // Catch:{ all -> 0x0523 }
            r12 = r12 & 125(0x7d, float:1.75E-43)
            byte r12 = (byte) r12     // Catch:{ all -> 0x0523 }
            r13 = 5349(0x14e5, float:7.496E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x0523 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0523 }
            m11815as(r9, r12, r13, r14)     // Catch:{ all -> 0x0523 }
            r9 = 0
            r12 = r14[r9]     // Catch:{ all -> 0x0523 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0523 }
            java.lang.Class r9 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0523 }
            r12 = 1063(0x427, float:1.49E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0523 }
            byte[] r13 = f9518c     // Catch:{ all -> 0x0523 }
            r14 = 609(0x261, float:8.53E-43)
            byte r14 = r13[r14]     // Catch:{ all -> 0x0523 }
            byte r14 = (byte) r14
            r15 = 2351(0x92f, float:3.294E-42)
            short r15 = (short) r15
            r18 = r3
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0521 }
            m11815as(r12, r14, r15, r3)     // Catch:{ all -> 0x0521 }
            r12 = 0
            r3 = r3[r12]     // Catch:{ all -> 0x0521 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0521 }
            java.lang.Class[] r12 = new java.lang.Class[r7]     // Catch:{ all -> 0x0521 }
            r14 = 2385(0x951, float:3.342E-42)
            byte r13 = r13[r14]     // Catch:{ all -> 0x0521 }
            int r13 = -r13
            byte r13 = (byte) r13     // Catch:{ all -> 0x0521 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0521 }
            m11815as(r6, r13, r11, r14)     // Catch:{ all -> 0x0521 }
            r13 = 0
            r14 = r14[r13]     // Catch:{ all -> 0x0521 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0521 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x0521 }
            r12[r13] = r14     // Catch:{ all -> 0x0521 }
            java.lang.reflect.Method r3 = r9.getMethod(r3, r12)     // Catch:{ all -> 0x0521 }
            java.lang.Object r3 = r3.invoke(r8, r10)     // Catch:{ all -> 0x0521 }
            r2.f10022f = r3     // Catch:{ all -> 0x06be }
            r3 = 24
            goto L_0x01e8
        L_0x0521:
            r0 = move-exception
            goto L_0x0526
        L_0x0523:
            r0 = move-exception
            r18 = r3
        L_0x0526:
            r3 = r0
            java.lang.Throwable r8 = r3.getCause()     // Catch:{ all -> 0x06be }
            if (r8 == 0) goto L_0x052e
            throw r8     // Catch:{ all -> 0x06be }
        L_0x052e:
            throw r3     // Catch:{ all -> 0x06be }
        L_0x052f:
            r0 = move-exception
            r18 = r3
            goto L_0x06bf
        L_0x0534:
            r2.f10018b = r7     // Catch:{ all -> 0x06be }
            r2.mo9125d(r14)     // Catch:{ all -> 0x06be }
            r2.mo9125d(r15)     // Catch:{ all -> 0x06be }
            java.lang.Object r3 = r2.f10026j     // Catch:{ all -> 0x06be }
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0585 }
            r9 = 0
            r8[r9] = r3     // Catch:{ all -> 0x0585 }
            r3 = 1055(0x41f, float:1.478E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x0585 }
            byte[] r9 = f9518c     // Catch:{ all -> 0x0585 }
            r10 = 2385(0x951, float:3.342E-42)
            byte r12 = r9[r10]     // Catch:{ all -> 0x0585 }
            int r10 = -r12
            byte r10 = (byte) r10     // Catch:{ all -> 0x0585 }
            r12 = 4648(0x1228, float:6.513E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0585 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0585 }
            m11815as(r3, r10, r12, r13)     // Catch:{ all -> 0x0585 }
            r3 = 0
            r10 = r13[r3]     // Catch:{ all -> 0x0585 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0585 }
            java.lang.Class r3 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0585 }
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch:{ all -> 0x0585 }
            r12 = 2385(0x951, float:3.342E-42)
            byte r9 = r9[r12]     // Catch:{ all -> 0x0585 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0585 }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x0585 }
            m11815as(r6, r9, r11, r12)     // Catch:{ all -> 0x0585 }
            r9 = 0
            r12 = r12[r9]     // Catch:{ all -> 0x0585 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0585 }
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x0585 }
            r10[r9] = r12     // Catch:{ all -> 0x0585 }
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r10)     // Catch:{ all -> 0x0585 }
            java.lang.Object r3 = r3.newInstance(r8)     // Catch:{ all -> 0x0585 }
            r2.f10022f = r3     // Catch:{ all -> 0x06be }
            r3 = 24
            goto L_0x01e8
        L_0x0585:
            r0 = move-exception
            r3 = r0
            java.lang.Throwable r8 = r3.getCause()     // Catch:{ all -> 0x06be }
            if (r8 == 0) goto L_0x058e
            throw r8     // Catch:{ all -> 0x06be }
        L_0x058e:
            throw r3     // Catch:{ all -> 0x06be }
        L_0x058f:
            r2.f10018b = r7     // Catch:{ all -> 0x06be }
            r2.mo9125d(r14)     // Catch:{ all -> 0x06be }
            r2.mo9125d(r15)     // Catch:{ all -> 0x06be }
            java.lang.Object r3 = r2.f10026j     // Catch:{ all -> 0x06be }
            r8 = 1055(0x41f, float:1.478E-42)
            short r8 = (short) r8
            byte[] r9 = f9518c     // Catch:{ all -> 0x05dd }
            r10 = 2385(0x951, float:3.342E-42)
            byte r12 = r9[r10]     // Catch:{ all -> 0x05dd }
            int r10 = -r12
            byte r10 = (byte) r10     // Catch:{ all -> 0x05dd }
            r12 = 4648(0x1228, float:6.513E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x05dd }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x05dd }
            m11815as(r8, r10, r12, r13)     // Catch:{ all -> 0x05dd }
            r8 = 0
            r10 = r13[r8]     // Catch:{ all -> 0x05dd }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x05dd }
            java.lang.Class r8 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x05dd }
            r10 = 1061(0x425, float:1.487E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x05dd }
            r12 = 2124(0x84c, float:2.976E-42)
            byte r9 = r9[r12]     // Catch:{ all -> 0x05dd }
            byte r9 = (byte) r9     // Catch:{ all -> 0x05dd }
            r12 = 6175(0x181f, float:8.653E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x05dd }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x05dd }
            m11815as(r10, r9, r12, r13)     // Catch:{ all -> 0x05dd }
            r9 = 0
            r10 = r13[r9]     // Catch:{ all -> 0x05dd }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x05dd }
            r9 = 0
            java.lang.reflect.Method r8 = r8.getMethod(r10, r9)     // Catch:{ all -> 0x05dd }
            java.lang.Object r3 = r8.invoke(r3, r9)     // Catch:{ all -> 0x05dd }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x05dd }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x05dd }
            r2.f10018b = r3     // Catch:{ all -> 0x06be }
            goto L_0x02cc
        L_0x05dd:
            r0 = move-exception
            r3 = r0
            java.lang.Throwable r8 = r3.getCause()     // Catch:{ all -> 0x06be }
            if (r8 == 0) goto L_0x05e6
            throw r8     // Catch:{ all -> 0x06be }
        L_0x05e6:
            throw r3     // Catch:{ all -> 0x06be }
        L_0x05e7:
            r3 = 139(0x8b, float:1.95E-43)
            goto L_0x014c
        L_0x05eb:
            r3 = 153(0x99, float:2.14E-43)
            r2.mo9125d(r3)     // Catch:{ all -> 0x06be }
            int r3 = r2.f10020d     // Catch:{ all -> 0x06be }
            if (r3 != 0) goto L_0x049e
            r3 = 67
            goto L_0x014c
        L_0x05f8:
            r3 = 68
            goto L_0x014c
        L_0x05fc:
            r3 = 114(0x72, float:1.6E-43)
            goto L_0x014c
        L_0x0600:
            r3 = 1044(0x414, float:1.463E-42)
            short r3 = (short) r3
            byte[] r8 = f9518c     // Catch:{ all -> 0x062b }
            r9 = 2385(0x951, float:3.342E-42)
            byte r8 = r8[r9]     // Catch:{ all -> 0x062b }
            int r8 = -r8
            byte r8 = (byte) r8     // Catch:{ all -> 0x062b }
            r9 = 6170(0x181a, float:8.646E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x062b }
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x062b }
            m11815as(r3, r8, r9, r10)     // Catch:{ all -> 0x062b }
            r3 = 0
            r8 = r10[r3]     // Catch:{ all -> 0x062b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x062b }
            java.lang.Class r3 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x062b }
            r8 = 0
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r8)     // Catch:{ all -> 0x062b }
            java.lang.Object r3 = r3.newInstance(r8)     // Catch:{ all -> 0x062b }
            r2.f10022f = r3     // Catch:{ all -> 0x06be }
            r3 = 24
            goto L_0x01e8
        L_0x062b:
            r0 = move-exception
            r3 = r0
            java.lang.Throwable r8 = r3.getCause()     // Catch:{ all -> 0x06be }
            if (r8 == 0) goto L_0x0634
            throw r8     // Catch:{ all -> 0x06be }
        L_0x0634:
            throw r3     // Catch:{ all -> 0x06be }
        L_0x0635:
            r3 = r12
            r2.f10018b = r3     // Catch:{ all -> 0x06be }
            r2.mo9125d(r14)     // Catch:{ all -> 0x06be }
            r2.mo9125d(r15)     // Catch:{ all -> 0x06be }
            java.lang.Object r3 = r2.f10026j     // Catch:{ all -> 0x06be }
            r2.mo9125d(r15)     // Catch:{ all -> 0x06be }
            java.lang.Object r8 = r2.f10026j     // Catch:{ all -> 0x06be }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x06a4 }
            r10 = 0
            r9[r10] = r8     // Catch:{ all -> 0x06a4 }
            r8 = 1044(0x414, float:1.463E-42)
            short r8 = (short) r8     // Catch:{ all -> 0x06a4 }
            byte[] r10 = f9518c     // Catch:{ all -> 0x06a4 }
            r12 = 2385(0x951, float:3.342E-42)
            byte r13 = r10[r12]     // Catch:{ all -> 0x06a4 }
            int r12 = -r13
            byte r12 = (byte) r12     // Catch:{ all -> 0x06a4 }
            r13 = 6170(0x181a, float:8.646E-42)
            short r13 = (short) r13     // Catch:{ all -> 0x06a4 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x06a4 }
            m11815as(r8, r12, r13, r14)     // Catch:{ all -> 0x06a4 }
            r8 = 0
            r12 = r14[r8]     // Catch:{ all -> 0x06a4 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x06a4 }
            java.lang.Class r8 = java.lang.Class.forName(r12)     // Catch:{ all -> 0x06a4 }
            r12 = 1061(0x425, float:1.487E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x06a4 }
            int r13 = f9519d     // Catch:{ all -> 0x06a4 }
            r13 = r13 & 125(0x7d, float:1.75E-43)
            byte r13 = (byte) r13     // Catch:{ all -> 0x06a4 }
            r14 = 582(0x246, float:8.16E-43)
            byte r14 = r10[r14]     // Catch:{ all -> 0x06a4 }
            int r14 = -r14
            short r14 = (short) r14     // Catch:{ all -> 0x06a4 }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x06a4 }
            m11815as(r12, r13, r14, r15)     // Catch:{ all -> 0x06a4 }
            r12 = 0
            r13 = r15[r12]     // Catch:{ all -> 0x06a4 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x06a4 }
            java.lang.Class[] r12 = new java.lang.Class[r7]     // Catch:{ all -> 0x06a4 }
            r14 = 2385(0x951, float:3.342E-42)
            byte r10 = r10[r14]     // Catch:{ all -> 0x06a4 }
            int r10 = -r10
            byte r10 = (byte) r10     // Catch:{ all -> 0x06a4 }
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x06a4 }
            m11815as(r6, r10, r11, r14)     // Catch:{ all -> 0x06a4 }
            r10 = 0
            r14 = r14[r10]     // Catch:{ all -> 0x06a4 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x06a4 }
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ all -> 0x06a4 }
            r12[r10] = r14     // Catch:{ all -> 0x06a4 }
            java.lang.reflect.Method r8 = r8.getMethod(r13, r12)     // Catch:{ all -> 0x06a4 }
            java.lang.Object r3 = r8.invoke(r3, r9)     // Catch:{ all -> 0x06a4 }
            r2.f10022f = r3     // Catch:{ all -> 0x06be }
            r3 = 24
            goto L_0x01e8
        L_0x06a4:
            r0 = move-exception
            r3 = r0
            java.lang.Throwable r8 = r3.getCause()     // Catch:{ all -> 0x06be }
            if (r8 == 0) goto L_0x06ad
            throw r8     // Catch:{ all -> 0x06be }
        L_0x06ad:
            throw r3     // Catch:{ all -> 0x06be }
        L_0x06ae:
            java.lang.String r3 = "㗥"
            r2.f10022f = r3     // Catch:{ all -> 0x06be }
            r3 = 24
            goto L_0x01e8
        L_0x06b6:
            java.lang.String r3 = ""
            r2.f10022f = r3     // Catch:{ all -> 0x06be }
            r3 = 24
            goto L_0x01e8
        L_0x06be:
            r0 = move-exception
        L_0x06bf:
            r3 = r0
            r20 = r5
            goto L_0x081b
        L_0x06c4:
            r3 = 4
            r2.f10018b = r3     // Catch:{ all -> 0x0783 }
            r2.mo9125d(r14)     // Catch:{ all -> 0x0783 }
            r2.mo9125d(r15)     // Catch:{ all -> 0x0783 }
            java.lang.Object r3 = r2.f10026j     // Catch:{ all -> 0x0783 }
            r2.mo9125d(r15)     // Catch:{ all -> 0x0783 }
            java.lang.Object r9 = r2.f10026j     // Catch:{ all -> 0x0783 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x0783 }
            int r10 = r2.f10020d     // Catch:{ all -> 0x0783 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x0783 }
            int r12 = r2.f10020d     // Catch:{ all -> 0x0783 }
            r13 = 4
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ all -> 0x0777 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0777 }
            r14[r8] = r12     // Catch:{ all -> 0x0777 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0777 }
            r12 = 2
            r14[r12] = r10     // Catch:{ all -> 0x0777 }
            r14[r7] = r9     // Catch:{ all -> 0x0777 }
            r9 = 0
            r14[r9] = r3     // Catch:{ all -> 0x0777 }
            r3 = 1045(0x415, float:1.464E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x0777 }
            int r9 = f9519d     // Catch:{ all -> 0x0777 }
            r9 = r9 & 125(0x7d, float:1.75E-43)
            byte r9 = (byte) r9     // Catch:{ all -> 0x0777 }
            r10 = 4724(0x1274, float:6.62E-42)
            short r10 = (short) r10     // Catch:{ all -> 0x0777 }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x0777 }
            m11815as(r3, r9, r10, r12)     // Catch:{ all -> 0x0777 }
            r9 = 0
            r10 = r12[r9]     // Catch:{ all -> 0x0777 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0777 }
            java.lang.Class r9 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x0777 }
            r10 = 1060(0x424, float:1.485E-42)
            short r12 = (short) r10     // Catch:{ all -> 0x0777 }
            byte[] r10 = f9518c     // Catch:{ all -> 0x0777 }
            r13 = 1801(0x709, float:2.524E-42)
            byte r15 = r10[r13]     // Catch:{ all -> 0x0777 }
            int r15 = r15 + r7
            byte r13 = (byte) r15     // Catch:{ all -> 0x0777 }
            r15 = 3172(0xc64, float:4.445E-42)
            short r15 = (short) r15     // Catch:{ all -> 0x0777 }
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0777 }
            m11815as(r12, r13, r15, r8)     // Catch:{ all -> 0x0777 }
            r12 = 0
            r8 = r8[r12]     // Catch:{ all -> 0x0777 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0777 }
            r12 = 4
            java.lang.Class[] r12 = new java.lang.Class[r12]     // Catch:{ all -> 0x0777 }
            r13 = 2385(0x951, float:3.342E-42)
            byte r15 = r10[r13]     // Catch:{ all -> 0x0777 }
            int r13 = -r15
            byte r13 = (byte) r13
            r15 = 6235(0x185b, float:8.737E-42)
            short r15 = (short) r15
            r20 = r5
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ all -> 0x0775 }
            m11815as(r3, r13, r15, r5)     // Catch:{ all -> 0x0775 }
            r13 = 0
            r5 = r5[r13]     // Catch:{ all -> 0x0775 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0775 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0775 }
            r12[r13] = r5     // Catch:{ all -> 0x0775 }
            r5 = 2385(0x951, float:3.342E-42)
            byte r10 = r10[r5]     // Catch:{ all -> 0x0775 }
            int r5 = -r10
            byte r5 = (byte) r5     // Catch:{ all -> 0x0775 }
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x0775 }
            m11815as(r3, r5, r15, r10)     // Catch:{ all -> 0x0775 }
            r3 = r10[r13]     // Catch:{ all -> 0x0775 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0775 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0775 }
            r12[r7] = r3     // Catch:{ all -> 0x0775 }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0775 }
            r5 = 2
            r12[r5] = r3     // Catch:{ all -> 0x0775 }
            r5 = 3
            r12[r5] = r3     // Catch:{ all -> 0x0775 }
            java.lang.reflect.Method r3 = r9.getMethod(r8, r12)     // Catch:{ all -> 0x0775 }
            r5 = 0
            java.lang.Object r3 = r3.invoke(r5, r14)     // Catch:{ all -> 0x0775 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0775 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0775 }
            r2.f10018b = r3     // Catch:{ all -> 0x0819 }
        L_0x0770:
            r2.mo9125d(r7)     // Catch:{ all -> 0x0819 }
            goto L_0x0165
        L_0x0775:
            r0 = move-exception
            goto L_0x077a
        L_0x0777:
            r0 = move-exception
            r20 = r5
        L_0x077a:
            r3 = r0
            java.lang.Throwable r5 = r3.getCause()     // Catch:{ all -> 0x0819 }
            if (r5 == 0) goto L_0x0782
            throw r5     // Catch:{ all -> 0x0819 }
        L_0x0782:
            throw r3     // Catch:{ all -> 0x0819 }
        L_0x0783:
            r0 = move-exception
            r20 = r5
            goto L_0x081a
        L_0x0788:
            r20 = r5
            r2.f10018b = r7     // Catch:{ all -> 0x0819 }
            r2.mo9125d(r14)     // Catch:{ all -> 0x0819 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x0819 }
            int r3 = r2.f10020d     // Catch:{ all -> 0x0819 }
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ all -> 0x07e2 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x07e2 }
            r8 = 0
            r5[r8] = r3     // Catch:{ all -> 0x07e2 }
            r3 = 1039(0x40f, float:1.456E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x07e2 }
            int r8 = f9519d     // Catch:{ all -> 0x07e2 }
            r8 = r8 & 125(0x7d, float:1.75E-43)
            byte r8 = (byte) r8     // Catch:{ all -> 0x07e2 }
            r9 = 5081(0x13d9, float:7.12E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x07e2 }
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x07e2 }
            m11815as(r3, r8, r9, r10)     // Catch:{ all -> 0x07e2 }
            r3 = 0
            r8 = r10[r3]     // Catch:{ all -> 0x07e2 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x07e2 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x07e2 }
            r9 = 1052(0x41c, float:1.474E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x07e2 }
            byte[] r10 = f9518c     // Catch:{ all -> 0x07e2 }
            byte r10 = r10[r3]     // Catch:{ all -> 0x07e2 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x07e2 }
            r12 = 6452(0x1934, float:9.041E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x07e2 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x07e2 }
            m11815as(r9, r10, r12, r13)     // Catch:{ all -> 0x07e2 }
            r9 = r13[r3]     // Catch:{ all -> 0x07e2 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x07e2 }
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch:{ all -> 0x07e2 }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x07e2 }
            r10[r3] = r12     // Catch:{ all -> 0x07e2 }
            java.lang.reflect.Method r3 = r8.getMethod(r9, r10)     // Catch:{ all -> 0x07e2 }
            r8 = 0
            java.lang.Object r3 = r3.invoke(r8, r5)     // Catch:{ all -> 0x07e2 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x07e2 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x07e2 }
            r2.f10018b = r3     // Catch:{ all -> 0x0819 }
            goto L_0x0770
        L_0x07e2:
            r0 = move-exception
            r3 = r0
            java.lang.Throwable r5 = r3.getCause()     // Catch:{ all -> 0x0819 }
            if (r5 == 0) goto L_0x07eb
            throw r5     // Catch:{ all -> 0x0819 }
        L_0x07eb:
            throw r3     // Catch:{ all -> 0x0819 }
        L_0x07ec:
            r20 = r5
            r3 = r8
            r2.f10018b = r3     // Catch:{ all -> 0x0819 }
            r2.mo9125d(r14)     // Catch:{ all -> 0x0819 }
            r2.mo9125d(r15)     // Catch:{ all -> 0x0819 }
            java.lang.Object r3 = r2.f10026j     // Catch:{ all -> 0x0819 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0819 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x0819 }
            int r5 = r2.f10020d     // Catch:{ all -> 0x0819 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x0819 }
            int r8 = r2.f10020d     // Catch:{ all -> 0x0819 }
            byte r8 = (byte) r8     // Catch:{ all -> 0x0819 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x0819 }
            m11820ax(r3, r5, r8, r9)     // Catch:{ all -> 0x0819 }
            r3 = 0
            r5 = r9[r3]     // Catch:{ all -> 0x0819 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0819 }
            r2.f10022f = r5     // Catch:{ all -> 0x0819 }
            r3 = 24
            r2.mo9125d(r3)     // Catch:{ all -> 0x0819 }
            goto L_0x0165
        L_0x0819:
            r0 = move-exception
        L_0x081a:
            r3 = r0
        L_0x081b:
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
            goto L_0x0897
        L_0x0820:
            r20 = r5
            r2.f10018b = r7     // Catch:{ all -> 0x0874 }
            r2.mo9125d(r14)     // Catch:{ all -> 0x0874 }
            r2.mo9125d(r15)     // Catch:{ all -> 0x0874 }
            java.lang.Object r3 = r2.f10026j     // Catch:{ all -> 0x0874 }
            byte[] r5 = f9518c     // Catch:{ all -> 0x0868 }
            r8 = 2385(0x951, float:3.342E-42)
            byte r9 = r5[r8]     // Catch:{ all -> 0x0868 }
            int r8 = -r9
            byte r8 = (byte) r8     // Catch:{ all -> 0x0868 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x0868 }
            m11815as(r6, r8, r11, r9)     // Catch:{ all -> 0x0868 }
            r8 = 0
            r9 = r9[r8]     // Catch:{ all -> 0x0868 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0868 }
            java.lang.Class r8 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0868 }
            r9 = 1061(0x425, float:1.487E-42)
            short r9 = (short) r9
            r10 = 1801(0x709, float:2.524E-42)
            byte r5 = r5[r10]     // Catch:{ all -> 0x0866 }
            int r5 = r5 + r7
            byte r5 = (byte) r5     // Catch:{ all -> 0x0866 }
            r12 = 5086(0x13de, float:7.127E-42)
            short r12 = (short) r12     // Catch:{ all -> 0x0866 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0866 }
            m11815as(r9, r5, r12, r13)     // Catch:{ all -> 0x0866 }
            r5 = 0
            r9 = r13[r5]     // Catch:{ all -> 0x0866 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0866 }
            r5 = 0
            java.lang.reflect.Method r8 = r8.getMethod(r9, r5)     // Catch:{ all -> 0x0866 }
            java.lang.Object r3 = r8.invoke(r3, r5)     // Catch:{ all -> 0x0866 }
            r2.f10022f = r3     // Catch:{ all -> 0x0894 }
            r3 = 24
            goto L_0x088e
        L_0x0866:
            r0 = move-exception
            goto L_0x086b
        L_0x0868:
            r0 = move-exception
            r10 = 1801(0x709, float:2.524E-42)
        L_0x086b:
            r3 = r0
            java.lang.Throwable r5 = r3.getCause()     // Catch:{ all -> 0x0894 }
            if (r5 == 0) goto L_0x0873
            throw r5     // Catch:{ all -> 0x0894 }
        L_0x0873:
            throw r3     // Catch:{ all -> 0x0894 }
        L_0x0874:
            r0 = move-exception
            r10 = 1801(0x709, float:2.524E-42)
            goto L_0x0895
        L_0x0878:
            r20 = r5
            r10 = 1801(0x709, float:2.524E-42)
            r2.f10018b = r7     // Catch:{ all -> 0x0894 }
            r2.mo9125d(r14)     // Catch:{ all -> 0x0894 }
            r2.mo9125d(r15)     // Catch:{ all -> 0x0894 }
            java.lang.Object r3 = r2.f10026j     // Catch:{ all -> 0x0894 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0894 }
            r2.f10022f = r3     // Catch:{ all -> 0x0894 }
            r3 = 24
        L_0x088e:
            r2.mo9125d(r3)     // Catch:{ all -> 0x0894 }
            r8 = 0
            goto L_0x0168
        L_0x0894:
            r0 = move-exception
        L_0x0895:
            r3 = r0
            r8 = 0
        L_0x0897:
            r12 = 1060(0x424, float:1.485E-42)
            goto L_0x0a0d
        L_0x089b:
            r20 = r5
            r10 = 1801(0x709, float:2.524E-42)
            r2.f10018b = r7     // Catch:{ all -> 0x090d }
            r2.mo9125d(r14)     // Catch:{ all -> 0x090d }
            r2.mo9125d(r13)     // Catch:{ all -> 0x090d }
            int r3 = r2.f10020d     // Catch:{ all -> 0x090d }
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ all -> 0x0900 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0900 }
            r8 = 0
            r5[r8] = r3     // Catch:{ all -> 0x0900 }
            r3 = 1038(0x40e, float:1.455E-42)
            short r3 = (short) r3     // Catch:{ all -> 0x0900 }
            int r8 = f9519d     // Catch:{ all -> 0x0900 }
            r8 = r8 & 125(0x7d, float:1.75E-43)
            byte r8 = (byte) r8     // Catch:{ all -> 0x0900 }
            r9 = 6887(0x1ae7, float:9.651E-42)
            short r9 = (short) r9     // Catch:{ all -> 0x0900 }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x0900 }
            m11815as(r3, r8, r9, r12)     // Catch:{ all -> 0x0900 }
            r3 = 0
            r8 = r12[r3]     // Catch:{ all -> 0x0900 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0900 }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ all -> 0x0900 }
            r12 = 1060(0x424, float:1.485E-42)
            short r9 = (short) r12
            byte[] r13 = f9518c     // Catch:{ all -> 0x08fd }
            byte r13 = r13[r3]     // Catch:{ all -> 0x08fd }
            byte r13 = (byte) r13     // Catch:{ all -> 0x08fd }
            r14 = 3415(0xd57, float:4.785E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x08fd }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x08fd }
            m11815as(r9, r13, r14, r15)     // Catch:{ all -> 0x08fd }
            r9 = r15[r3]     // Catch:{ all -> 0x08fd }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x08fd }
            java.lang.Class[] r13 = new java.lang.Class[r7]     // Catch:{ all -> 0x08fd }
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ all -> 0x08fd }
            r13[r3] = r14     // Catch:{ all -> 0x08fd }
            java.lang.reflect.Method r3 = r8.getMethod(r9, r13)     // Catch:{ all -> 0x08fd }
            r8 = 0
            java.lang.Object r3 = r3.invoke(r8, r5)     // Catch:{ all -> 0x08fb }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x08fb }
            int r3 = r3.intValue()     // Catch:{ all -> 0x08fb }
            r2.f10018b = r3     // Catch:{ all -> 0x09f2 }
        L_0x08f6:
            r2.mo9125d(r7)     // Catch:{ all -> 0x09f2 }
            goto L_0x09ff
        L_0x08fb:
            r0 = move-exception
            goto L_0x0904
        L_0x08fd:
            r0 = move-exception
            r8 = 0
            goto L_0x0904
        L_0x0900:
            r0 = move-exception
            r8 = 0
            r12 = 1060(0x424, float:1.485E-42)
        L_0x0904:
            r3 = r0
            java.lang.Throwable r5 = r3.getCause()     // Catch:{ all -> 0x09f2 }
            if (r5 == 0) goto L_0x090c
            throw r5     // Catch:{ all -> 0x09f2 }
        L_0x090c:
            throw r3     // Catch:{ all -> 0x09f2 }
        L_0x090d:
            r0 = move-exception
            r8 = 0
            goto L_0x0a0a
        L_0x0911:
            r20 = r5
            r3 = r8
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r2.f10018b = r3     // Catch:{ all -> 0x09f2 }
            r2.mo9125d(r14)     // Catch:{ all -> 0x09f2 }
            r2.mo9125d(r15)     // Catch:{ all -> 0x09f2 }
            java.lang.Object r3 = r2.f10026j     // Catch:{ all -> 0x09f2 }
            android.content.res.AssetManager r3 = (android.content.res.AssetManager) r3     // Catch:{ all -> 0x09f2 }
            r2.mo9125d(r15)     // Catch:{ all -> 0x09f2 }
            java.lang.Object r5 = r2.f10026j     // Catch:{ all -> 0x09f2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x09f2 }
            r2.mo9125d(r15)     // Catch:{ all -> 0x09f2 }
            java.lang.Object r9 = r2.f10026j     // Catch:{ all -> 0x09f2 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x09f2 }
            m11834e(r3, r5, r9)     // Catch:{ all -> 0x09f2 }
            goto L_0x09ff
        L_0x0938:
            r20 = r5
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r3 = 64
            goto L_0x014c
        L_0x0943:
            r3 = r19
            goto L_0x014c
        L_0x0947:
            r3 = r7
            goto L_0x014c
        L_0x094a:
            r20 = r5
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
            r12 = 1060(0x424, float:1.485E-42)
            int r3 = f9526m     // Catch:{ all -> 0x09f2 }
            r2.f10018b = r3     // Catch:{ all -> 0x09f2 }
            goto L_0x08f6
        L_0x0956:
            r20 = r5
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r2.f10018b = r7     // Catch:{ all -> 0x09f2 }
            r2.mo9125d(r14)     // Catch:{ all -> 0x09f2 }
            r2.mo9125d(r13)     // Catch:{ all -> 0x09f2 }
            int r3 = r2.f10020d     // Catch:{ all -> 0x09f2 }
            f9527n = r3     // Catch:{ all -> 0x09f2 }
            goto L_0x09ff
        L_0x096b:
            r20 = r5
            r3 = 15
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r2.mo9125d(r3)     // Catch:{ all -> 0x09f2 }
            int r3 = r2.f10020d     // Catch:{ all -> 0x09f2 }
            if (r3 != 0) goto L_0x09ff
            r3 = 133(0x85, float:1.86E-43)
            goto L_0x0a00
        L_0x097f:
            r20 = r5
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r3 = 158(0x9e, float:2.21E-43)
            goto L_0x014c
        L_0x098a:
            r3 = r9
            goto L_0x014c
        L_0x098d:
            r20 = r5
            r3 = 15
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r2.mo9125d(r3)     // Catch:{ all -> 0x09f2 }
            int r3 = r2.f10020d     // Catch:{ all -> 0x09f2 }
            if (r3 != 0) goto L_0x09ff
            r3 = 148(0x94, float:2.07E-43)
            goto L_0x0a00
        L_0x09a0:
            r20 = r5
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r3 = 149(0x95, float:2.09E-43)
            goto L_0x014c
        L_0x09ab:
            r20 = r5
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r3 = 121(0x79, float:1.7E-43)
            goto L_0x014c
        L_0x09b6:
            r20 = r5
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r3 = 20
            r2.mo9125d(r3)     // Catch:{ all -> 0x09f2 }
            int r3 = r2.f10020d     // Catch:{ all -> 0x09f2 }
            if (r3 == r15) goto L_0x09ce
            r4 = 31
            if (r3 == r4) goto L_0x09cb
            goto L_0x09ce
        L_0x09cb:
            r3 = 34
            goto L_0x0a00
        L_0x09ce:
            r3 = 30
            goto L_0x0a00
        L_0x09d1:
            r20 = r5
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r3 = 150(0x96, float:2.1E-43)
            goto L_0x014c
        L_0x09dc:
            r20 = r5
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r3 = 20
            r2.mo9125d(r3)     // Catch:{ all -> 0x09f2 }
            int r3 = r2.f10020d     // Catch:{ all -> 0x09f2 }
            if (r3 == 0) goto L_0x09ef
            r3 = 119(0x77, float:1.67E-43)
            goto L_0x0a00
        L_0x09ef:
            r3 = 135(0x87, float:1.89E-43)
            goto L_0x0a00
        L_0x09f2:
            r0 = move-exception
            goto L_0x0a0c
        L_0x09f4:
            r20 = r5
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
            r12 = 1060(0x424, float:1.485E-42)
            r3 = 155(0x9b, float:2.17E-43)
            goto L_0x014c
        L_0x09ff:
            r3 = r4
        L_0x0a00:
            r5 = r20
            goto L_0x014c
        L_0x0a04:
            r0 = move-exception
        L_0x0a05:
            r20 = r5
            r8 = 0
            r10 = 1801(0x709, float:2.524E-42)
        L_0x0a0a:
            r12 = 1060(0x424, float:1.485E-42)
        L_0x0a0c:
            r3 = r0
        L_0x0a0d:
            r5 = 1038(0x40e, float:1.455E-42)
            short r5 = (short) r5
            byte[] r9 = f9518c     // Catch:{ all -> 0x0a74 }
            r13 = 2385(0x951, float:3.342E-42)
            byte r9 = r9[r13]     // Catch:{ all -> 0x0a74 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0a74 }
            r14 = 2117(0x845, float:2.967E-42)
            short r14 = (short) r14     // Catch:{ all -> 0x0a74 }
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x0a74 }
            m11815as(r5, r9, r14, r15)     // Catch:{ all -> 0x0a74 }
            r5 = 0
            r9 = r15[r5]     // Catch:{ all -> 0x0a74 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0a74 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0a74 }
            boolean r9 = r9.isInstance(r3)     // Catch:{ all -> 0x0a74 }
            if (r9 == 0) goto L_0x0a38
            r9 = 2
            if (r4 < r9) goto L_0x0a38
            r9 = 7
            if (r4 > r9) goto L_0x0a38
            r4 = 7
        L_0x0a36:
            r9 = r4
            goto L_0x0a60
        L_0x0a38:
            r9 = 39
            r14 = 15
            if (r4 < r14) goto L_0x0a43
            r14 = 23
            if (r4 > r14) goto L_0x0a45
            goto L_0x0a60
        L_0x0a43:
            r14 = 23
        L_0x0a45:
            if (r4 < r14) goto L_0x0a4c
            r14 = 30
            if (r4 > r14) goto L_0x0a4e
            goto L_0x0a60
        L_0x0a4c:
            r14 = 30
        L_0x0a4e:
            if (r4 < r14) goto L_0x0a55
            r14 = 34
            if (r4 > r14) goto L_0x0a55
            goto L_0x0a60
        L_0x0a55:
            r9 = 136(0x88, float:1.9E-43)
            if (r4 < r9) goto L_0x0a69
            r9 = 139(0x8b, float:1.95E-43)
            if (r4 > r9) goto L_0x0a69
            r4 = 134(0x86, float:1.88E-43)
            goto L_0x0a36
        L_0x0a60:
            r2.f10022f = r3     // Catch:{ all -> 0x0a74 }
            r3 = 23
            r2.mo9125d(r3)     // Catch:{ all -> 0x0a74 }
            r3 = r9
            goto L_0x0a00
        L_0x0a69:
            throw r3     // Catch:{ all -> 0x0a74 }
        L_0x0a6a:
            r0 = move-exception
            r2 = r0
            java.lang.Throwable r3 = r2.getCause()     // Catch:{ all -> 0x0a74 }
            if (r3 == 0) goto L_0x0a73
            throw r3     // Catch:{ all -> 0x0a74 }
        L_0x0a73:
            throw r2     // Catch:{ all -> 0x0a74 }
        L_0x0a74:
            r0 = move-exception
            r2 = r0
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2885cd.m11834e(android.content.res.AssetManager, java.lang.String, java.lang.String):void");
    }
}
