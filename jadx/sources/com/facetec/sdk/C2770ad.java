package com.facetec.sdk;

import android.os.Process;
import android.view.ViewConfiguration;
import com.guardsquare.dexguard.annotation.EncryptStrings;
import com.guardsquare.dexguard.annotation.ObfuscateCodeLow;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@EncryptStrings
@ObfuscateCodeLow
/* renamed from: com.facetec.sdk.ad */
final class C2770ad extends C2791an {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: a */
    private static int f8778a;

    /* renamed from: c */
    private static char[] f8779c;

    /* renamed from: d */
    private static boolean f8780d;

    /* renamed from: e */
    private static boolean f8781e;

    /* renamed from: f */
    private static int f8782f;

    /* renamed from: g */
    private static int f8783g = 1;

    /* renamed from: b */
    private final SecretKeySpec f8784b;

    static {
        init$0();
        f8782f = 0;
        m10714a();
        ViewConfiguration.getKeyRepeatTimeout();
        int i = f8783g + 105;
        f8782f = i % 128;
        if (i % 2 != 0) {
            int i2 = 4 / 0;
        }
    }

    public C2770ad(byte[] bArr) {
        Object[] objArr = new Object[1];
        m10715h((String) null, (int[]) null, (ViewConfiguration.getFadingEdgeLength() >> 16) + C11051p3.f31760d, "", objArr);
        this.f8784b = new SecretKeySpec(bArr, ((String) objArr[0]).intern());
    }

    /* renamed from: a */
    static void m10714a() {
        f8781e = true;
        f8778a = -2032437617;
        f8779c = new char[]{30284, 30280, 30298, 30398, 30282, 30285, 30303, 30274, 30392, 30316, 30315, 30308, 30305, 30310};
        f8780d = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02ca, code lost:
        if (r0 == 8) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02cc, code lost:
        r0 = r2.length;
        r5.f10445d = r0;
        r0 = new char[r0];
        r5.f10444a = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02d4, code lost:
        r0 = r2.length;
        r5.f10445d = r0;
        r0 = new char[r0];
        r5.f10444a = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02dc, code lost:
        r1 = r5.f10444a;
        r4 = r5.f10445d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02e0, code lost:
        if (r1 >= r4) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02e2, code lost:
        r0[r1] = (char) (r6[r2[(r4 - 1) - r1] - r19] - r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r4 = new java.lang.Object[2];
        r4[1] = r5;
        r4[0] = r5;
        r1 = com.facetec.sdk.C2854bp.f9335p;
        r7 = r1.get(-1517498542);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0304, code lost:
        if (r7 == null) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r2 = (char[]) r2;
        r5 = new com.facetec.sdk.C3165gg();
        r6 = f8779c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x030b, code lost:
        r12 = (byte) 0;
        r13 = (byte) r12;
        r15 = new java.lang.Object[1];
        m10716i(r12, r13, (byte) r13, r15);
        r7 = ((java.lang.Class) com.facetec.sdk.C2854bp.m11559b((char) ((android.view.ViewConfiguration.getScrollFriction() > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON ? 1 : (android.view.ViewConfiguration.getScrollFriction() == com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON ? 0 : -1)) - 1), 782 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 24 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod((java.lang.String) r15[0], new java.lang.Class[]{r8, r8});
        r1.put(-1517498542, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x034b, code lost:
        ((java.lang.reflect.Method) r7).invoke((java.lang.Object) null, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0352, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0353, code lost:
        r1 = r0.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0357, code lost:
        if (r1 != null) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0359, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x035a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x035b, code lost:
        r1 = new java.lang.String(r0);
        r0 = $11 + 35;
        $10 = r0 % 128;
        r0 = r0 % 2;
        r21[0] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x036d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x036e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r6 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x036f, code lost:
        r1 = r0.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0373, code lost:
        if (r1 != null) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0375, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0376, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r8 = 'Q';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        r8 = '8';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r10 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r8 == 'Q') goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        r7 = r6.length;
        r8 = new char[r7];
        r12 = $10 + 105;
        $11 = r12 % 128;
        r12 = r12 % 2;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r12 >= r7) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        r13 = $11 + 103;
        $10 = r13 % 128;
        r13 = r13 % r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r14 = new java.lang.Object[1];
        r14[r4] = java.lang.Integer.valueOf(r6[r12]);
        r13 = com.facetec.sdk.C2854bp.f9335p;
        r3 = r13.get(-1321001135);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r3 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        r10 = (byte) $$a.length;
        r4 = new java.lang.Object[1];
        m10716i((byte) r4, r10, (byte) (r10 - 4), r4);
        r3 = ((java.lang.Class) com.facetec.sdk.C2854bp.m11559b((char) (android.util.TypedValue.complexToFraction(r4, r10, r10) > r10 ? 1 : (android.util.TypedValue.complexToFraction(r4, r10, r10) == r10 ? 0 : -1)), (android.graphics.PointF.length(r10, r10) > r10 ? 1 : (android.graphics.PointF.length(r10, r10) == r10 ? 0 : -1)) + 886, 24 - (android.media.AudioTrack.getMaxVolume() > r10 ? 1 : (android.media.AudioTrack.getMaxVolume() == r10 ? 0 : -1)))).getMethod((java.lang.String) r4[0], new java.lang.Class[]{java.lang.Integer.TYPE});
        r13.put(-1321001135, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c3, code lost:
        r8[r12] = ((java.lang.Character) ((java.lang.reflect.Method) r3).invoke((java.lang.Object) null, r14)).charValue();
        r12 = r12 + 1;
        r3 = 2;
        r4 = 0;
        r10 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cc, code lost:
        r1 = r0.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d0, code lost:
        if (r1 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d2, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d4, code lost:
        r6 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r4 = new java.lang.Object[]{java.lang.Integer.valueOf(f8778a)};
        r3 = com.facetec.sdk.C2854bp.f9335p;
        r8 = r3.get(2101371298);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ef, code lost:
        if (r8 == null) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r12 = (byte) 0;
        r13 = (byte) (r12 + 1);
        r15 = new java.lang.Object[1];
        m10716i(r12, r13, (byte) (r13 - 1), r15);
        r8 = ((java.lang.Class) com.facetec.sdk.C2854bp.m11559b((char) (20120 - android.view.MotionEvent.axisFromString("")), (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 241, (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 23)).getMethod((java.lang.String) r15[0], new java.lang.Class[]{java.lang.Integer.TYPE});
        r3.put(2101371298, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0133, code lost:
        r3 = ((java.lang.Integer) ((java.lang.reflect.Method) r8).invoke((java.lang.Object) null, r4)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r1 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0144, code lost:
        if (f8781e == false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0146, code lost:
        r4 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0149, code lost:
        r4 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014a, code lost:
        r8 = java.lang.Object.class;
        r10 = -1517498542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014f, code lost:
        if (r4 == 11) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0151, code lost:
        r0 = $11 + 49;
        $10 = r0 % 128;
        r0 = r0 % 2;
        r0 = r1.length;
        r5.f10445d = r0;
        r0 = new char[r0];
        r5.f10444a = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0163, code lost:
        r2 = r5.f10444a;
        r4 = r5.f10445d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0167, code lost:
        if (r2 >= r4) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0169, code lost:
        r7 = $10 + 15;
        $11 = r7 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0173, code lost:
        if ((r7 % 2) != 0) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0175, code lost:
        r0[r2] = (char) (r6[r1[(r4 + 0) >> r2] - r19] / r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r4 = new java.lang.Object[2];
        r4[1] = r5;
        r4[0] = r5;
        r2 = com.facetec.sdk.C2854bp.f9335p;
        r7 = r2.get(java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0194, code lost:
        if (r7 == null) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0197, code lost:
        r13 = (byte) 0;
        r14 = (byte) r13;
        r10 = new java.lang.Object[1];
        m10716i(r13, r14, (byte) r14, r10);
        r7 = ((java.lang.Class) com.facetec.sdk.C2854bp.m11559b((char) android.text.TextUtils.indexOf("", ""), 782 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.os.Process.myTid() >> 22) + 24)).getMethod((java.lang.String) r10[0], new java.lang.Class[]{r8, r8});
        r2.put(-1517498542, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d4, code lost:
        ((java.lang.reflect.Method) r7).invoke((java.lang.Object) null, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01db, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r1 = r1.getBytes("ISO-8859-1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01e2, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01e3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01e4, code lost:
        r0[r2] = (char) (r6[r1[(r4 - 1) - r2] + r19] - r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r4 = new java.lang.Object[2];
        r4[1] = r5;
        r4[0] = r5;
        r7 = com.facetec.sdk.C2854bp.f9335p;
        r10 = r7.get(-1517498542);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0206, code lost:
        if (r10 == null) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0209, code lost:
        r12 = (byte) 0;
        r13 = (byte) r12;
        r15 = new java.lang.Object[1];
        m10716i(r12, r13, (byte) r13, r15);
        r10 = ((java.lang.Class) com.facetec.sdk.C2854bp.m11559b((char) (android.util.TypedValue.complexToFraction(0, com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON, com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON ? 1 : (android.util.TypedValue.complexToFraction(0, com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON, com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) == com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON ? 0 : -1)), android.text.TextUtils.indexOf("", '0', 0, 0) + 783, android.view.View.resolveSizeAndState(0, 0, 0) + 24)).getMethod((java.lang.String) r15[0], new java.lang.Class[]{r8, r8});
        r7.put(-1517498542, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0246, code lost:
        ((java.lang.reflect.Method) r10).invoke((java.lang.Object) null, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r1 = (byte[]) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x024c, code lost:
        r10 = -1517498542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0251, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0252, code lost:
        r1 = r0.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0256, code lost:
        if (r1 != null) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0258, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0259, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x025a, code lost:
        r21[0] = new java.lang.String(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0262, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0267, code lost:
        if (f8780d == false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r17 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0269, code lost:
        r1 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x026b, code lost:
        r1 = 'M';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x026d, code lost:
        if (r1 == 12) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x026f, code lost:
        r1 = r0.length;
        r5.f10445d = r1;
        r1 = new char[r1];
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0275, code lost:
        r5.f10444a = r2;
        r2 = r5.f10444a;
        r4 = r5.f10445d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x027d, code lost:
        if (r2 >= r4) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x027f, code lost:
        r8 = 'R';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0282, code lost:
        r8 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0283, code lost:
        if (r8 == 17) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0285, code lost:
        r7 = $11 + 21;
        $10 = r7 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r2 = r17.toCharArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x028f, code lost:
        if ((r7 % 2) == 0) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0291, code lost:
        r1[r2] = (char) (r6[r0[(r4 + 1) >>> r2] << r19] >> r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x029f, code lost:
        r1[r2] = (char) (r6[r0[(r4 - 1) - r2] - r19] - r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ac, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02af, code lost:
        r21[0] = new java.lang.String(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02b8, code lost:
        r0 = $11 + 91;
        $10 = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02c4, code lost:
        if ((r0 % 2) == 0) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c6, code lost:
        r0 = '\"';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02c9, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r2 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10715h(java.lang.String r17, int[] r18, int r19, java.lang.String r20, java.lang.Object[] r21) {
        /*
            r0 = r18
            r1 = r20
            int r2 = $11
            int r2 = r2 + 67
            int r3 = r2 % 128
            $10 = r3
            r3 = 2
            int r2 = r2 % r3
            r4 = 0
            if (r2 == 0) goto L_0x0017
            r2 = 11
            int r2 = r2 / r4
            if (r1 == 0) goto L_0x001f
            goto L_0x0019
        L_0x0017:
            if (r1 == 0) goto L_0x001f
        L_0x0019:
            java.lang.String r2 = "ISO-8859-1"
            byte[] r1 = r1.getBytes(r2)
        L_0x001f:
            byte[] r1 = (byte[]) r1
            if (r17 == 0) goto L_0x0028
            char[] r2 = r17.toCharArray()
            goto L_0x002a
        L_0x0028:
            r2 = r17
        L_0x002a:
            char[] r2 = (char[]) r2
            com.facetec.sdk.gg r5 = new com.facetec.sdk.gg
            r5.<init>()
            char[] r6 = f8779c
            r7 = 81
            if (r6 == 0) goto L_0x0039
            r8 = r7
            goto L_0x003b
        L_0x0039:
            r8 = 56
        L_0x003b:
            r10 = 0
            r11 = 1
            if (r8 == r7) goto L_0x0041
            goto L_0x00d5
        L_0x0041:
            int r7 = r6.length
            char[] r8 = new char[r7]
            int r12 = $10
            int r12 = r12 + 105
            int r13 = r12 % 128
            $11 = r13
            int r12 = r12 % r3
            r12 = r4
        L_0x004e:
            if (r12 >= r7) goto L_0x00d4
            int r13 = $11
            int r13 = r13 + 103
            int r14 = r13 % 128
            $10 = r14
            int r13 = r13 % r3
            char r13 = r6[r12]
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ all -> 0x00cb }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00cb }
            r14[r4] = r13     // Catch:{ all -> 0x00cb }
            java.util.Map<java.lang.Integer, java.lang.Object> r13 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x00cb }
            r15 = -1321001135(0xffffffffb1431f51, float:-2.8394036E-9)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x00cb }
            java.lang.Object r3 = r13.get(r3)     // Catch:{ all -> 0x00cb }
            if (r3 == 0) goto L_0x0073
            goto L_0x00b6
        L_0x0073:
            float r3 = android.util.TypedValue.complexToFraction(r4, r10, r10)     // Catch:{ all -> 0x00cb }
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            char r3 = (char) r3     // Catch:{ all -> 0x00cb }
            float r16 = android.graphics.PointF.length(r10, r10)     // Catch:{ all -> 0x00cb }
            int r9 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            int r9 = r9 + 886
            float r16 = android.media.AudioTrack.getMaxVolume()     // Catch:{ all -> 0x00cb }
            int r16 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            int r10 = 24 - r16
            java.lang.Object r3 = com.facetec.sdk.C2854bp.m11559b(r3, r9, r10)     // Catch:{ all -> 0x00cb }
            java.lang.Class r3 = (java.lang.Class) r3     // Catch:{ all -> 0x00cb }
            byte r9 = (byte) r4     // Catch:{ all -> 0x00cb }
            byte[] r10 = $$a     // Catch:{ all -> 0x00cb }
            int r10 = r10.length     // Catch:{ all -> 0x00cb }
            byte r10 = (byte) r10     // Catch:{ all -> 0x00cb }
            int r15 = r10 + -4
            byte r15 = (byte) r15     // Catch:{ all -> 0x00cb }
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ all -> 0x00cb }
            m10716i(r9, r10, r15, r4)     // Catch:{ all -> 0x00cb }
            r9 = 0
            r4 = r4[r9]     // Catch:{ all -> 0x00cb }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00cb }
            java.lang.Class[] r10 = new java.lang.Class[r11]     // Catch:{ all -> 0x00cb }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00cb }
            r10[r9] = r15     // Catch:{ all -> 0x00cb }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r10)     // Catch:{ all -> 0x00cb }
            r4 = -1321001135(0xffffffffb1431f51, float:-2.8394036E-9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00cb }
            r13.put(r4, r3)     // Catch:{ all -> 0x00cb }
        L_0x00b6:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch:{ all -> 0x00cb }
            r4 = 0
            java.lang.Object r3 = r3.invoke(r4, r14)     // Catch:{ all -> 0x00cb }
            java.lang.Character r3 = (java.lang.Character) r3     // Catch:{ all -> 0x00cb }
            char r3 = r3.charValue()     // Catch:{ all -> 0x00cb }
            r8[r12] = r3
            int r12 = r12 + 1
            r3 = 2
            r4 = 0
            r10 = 0
            goto L_0x004e
        L_0x00cb:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x00d3
            throw r1
        L_0x00d3:
            throw r0
        L_0x00d4:
            r6 = r8
        L_0x00d5:
            int r3 = f8778a
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ all -> 0x036e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x036e }
            r7 = 0
            r4[r7] = r3     // Catch:{ all -> 0x036e }
            java.util.Map<java.lang.Integer, java.lang.Object> r3 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x036e }
            r7 = 2101371298(0x7d4061a2, float:1.598242E37)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x036e }
            java.lang.Object r8 = r3.get(r8)     // Catch:{ all -> 0x036e }
            java.lang.String r9 = ""
            if (r8 == 0) goto L_0x00f2
            goto L_0x0133
        L_0x00f2:
            int r8 = android.view.MotionEvent.axisFromString(r9)     // Catch:{ all -> 0x036e }
            int r8 = 20120 - r8
            char r8 = (char) r8     // Catch:{ all -> 0x036e }
            long r12 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x036e }
            r14 = 0
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            int r10 = r10 + 241
            long r12 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x036e }
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            int r12 = r12 + 23
            java.lang.Object r8 = com.facetec.sdk.C2854bp.m11559b(r8, r10, r12)     // Catch:{ all -> 0x036e }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x036e }
            r10 = 0
            byte r12 = (byte) r10     // Catch:{ all -> 0x036e }
            int r13 = r12 + 1
            byte r13 = (byte) r13     // Catch:{ all -> 0x036e }
            int r14 = r13 + -1
            byte r14 = (byte) r14     // Catch:{ all -> 0x036e }
            java.lang.Object[] r15 = new java.lang.Object[r11]     // Catch:{ all -> 0x036e }
            m10716i(r12, r13, r14, r15)     // Catch:{ all -> 0x036e }
            r12 = r15[r10]     // Catch:{ all -> 0x036e }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x036e }
            java.lang.Class[] r13 = new java.lang.Class[r11]     // Catch:{ all -> 0x036e }
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ all -> 0x036e }
            r13[r10] = r14     // Catch:{ all -> 0x036e }
            java.lang.reflect.Method r8 = r8.getMethod(r12, r13)     // Catch:{ all -> 0x036e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x036e }
            r3.put(r7, r8)     // Catch:{ all -> 0x036e }
        L_0x0133:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch:{ all -> 0x036e }
            r3 = 0
            java.lang.Object r4 = r8.invoke(r3, r4)     // Catch:{ all -> 0x036e }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x036e }
            int r3 = r4.intValue()     // Catch:{ all -> 0x036e }
            boolean r4 = f8781e
            r7 = 11
            if (r4 == 0) goto L_0x0149
            r4 = 13
            goto L_0x014a
        L_0x0149:
            r4 = r7
        L_0x014a:
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r10 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            if (r4 == r7) goto L_0x0263
            int r0 = $11
            int r0 = r0 + 49
            int r2 = r0 % 128
            $10 = r2
            r2 = 2
            int r0 = r0 % r2
            int r0 = r1.length
            r5.f10445d = r0
            char[] r0 = new char[r0]
            r2 = 0
            r5.f10444a = r2
        L_0x0163:
            int r2 = r5.f10444a
            int r4 = r5.f10445d
            if (r2 >= r4) goto L_0x025a
            int r7 = $10
            int r7 = r7 + 15
            int r12 = r7 % 128
            $11 = r12
            r12 = 2
            int r7 = r7 % r12
            if (r7 != 0) goto L_0x01e4
            int r4 = r4 + 0
            int r4 = r4 >> r2
            byte r4 = r1[r4]
            int r4 = r4 - r19
            char r4 = r6[r4]
            int r4 = r4 / r3
            char r4 = (char) r4
            r0[r2] = r4
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x01db }
            r4[r11] = r5     // Catch:{ all -> 0x01db }
            r2 = 0
            r4[r2] = r5     // Catch:{ all -> 0x01db }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x01db }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01db }
            java.lang.Object r7 = r2.get(r7)     // Catch:{ all -> 0x01db }
            if (r7 == 0) goto L_0x0197
            goto L_0x01d4
        L_0x0197:
            int r7 = android.text.TextUtils.indexOf(r9, r9)     // Catch:{ all -> 0x01db }
            char r7 = (char) r7     // Catch:{ all -> 0x01db }
            int r12 = android.view.ViewConfiguration.getJumpTapTimeout()     // Catch:{ all -> 0x01db }
            int r12 = r12 >> 16
            int r12 = 782 - r12
            int r13 = android.os.Process.myTid()     // Catch:{ all -> 0x01db }
            int r13 = r13 >> 22
            int r13 = r13 + 24
            java.lang.Object r7 = com.facetec.sdk.C2854bp.m11559b(r7, r12, r13)     // Catch:{ all -> 0x01db }
            java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ all -> 0x01db }
            r12 = 0
            byte r13 = (byte) r12     // Catch:{ all -> 0x01db }
            byte r14 = (byte) r13     // Catch:{ all -> 0x01db }
            byte r15 = (byte) r14     // Catch:{ all -> 0x01db }
            java.lang.Object[] r10 = new java.lang.Object[r11]     // Catch:{ all -> 0x01db }
            m10716i(r13, r14, r15, r10)     // Catch:{ all -> 0x01db }
            r10 = r10[r12]     // Catch:{ all -> 0x01db }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01db }
            r13 = 2
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x01db }
            r14[r12] = r8     // Catch:{ all -> 0x01db }
            r14[r11] = r8     // Catch:{ all -> 0x01db }
            java.lang.reflect.Method r7 = r7.getMethod(r10, r14)     // Catch:{ all -> 0x01db }
            r10 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01db }
            r2.put(r12, r7)     // Catch:{ all -> 0x01db }
        L_0x01d4:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch:{ all -> 0x01db }
            r2 = 0
            r7.invoke(r2, r4)     // Catch:{ all -> 0x01db }
            goto L_0x024c
        L_0x01db:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01e3
            throw r1
        L_0x01e3:
            throw r0
        L_0x01e4:
            int r4 = r4 + -1
            int r4 = r4 - r2
            byte r4 = r1[r4]
            int r4 = r4 + r19
            char r4 = r6[r4]
            int r4 = r4 - r3
            char r4 = (char) r4
            r0[r2] = r4
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0251 }
            r4[r11] = r5     // Catch:{ all -> 0x0251 }
            r2 = 0
            r4[r2] = r5     // Catch:{ all -> 0x0251 }
            java.util.Map<java.lang.Integer, java.lang.Object> r7 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0251 }
            r10 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0251 }
            java.lang.Object r10 = r7.get(r12)     // Catch:{ all -> 0x0251 }
            if (r10 == 0) goto L_0x0209
            goto L_0x0246
        L_0x0209:
            r10 = 0
            float r12 = android.util.TypedValue.complexToFraction(r2, r10, r10)     // Catch:{ all -> 0x0251 }
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            char r10 = (char) r12     // Catch:{ all -> 0x0251 }
            r12 = 48
            int r12 = android.text.TextUtils.indexOf(r9, r12, r2, r2)     // Catch:{ all -> 0x0251 }
            int r12 = r12 + 783
            int r13 = android.view.View.resolveSizeAndState(r2, r2, r2)     // Catch:{ all -> 0x0251 }
            int r13 = r13 + 24
            java.lang.Object r10 = com.facetec.sdk.C2854bp.m11559b(r10, r12, r13)     // Catch:{ all -> 0x0251 }
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x0251 }
            byte r12 = (byte) r2     // Catch:{ all -> 0x0251 }
            byte r13 = (byte) r12     // Catch:{ all -> 0x0251 }
            byte r14 = (byte) r13     // Catch:{ all -> 0x0251 }
            java.lang.Object[] r15 = new java.lang.Object[r11]     // Catch:{ all -> 0x0251 }
            m10716i(r12, r13, r14, r15)     // Catch:{ all -> 0x0251 }
            r12 = r15[r2]     // Catch:{ all -> 0x0251 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0251 }
            r13 = 2
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x0251 }
            r14[r2] = r8     // Catch:{ all -> 0x0251 }
            r14[r11] = r8     // Catch:{ all -> 0x0251 }
            java.lang.reflect.Method r10 = r10.getMethod(r12, r14)     // Catch:{ all -> 0x0251 }
            r2 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0251 }
            r7.put(r12, r10)     // Catch:{ all -> 0x0251 }
        L_0x0246:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch:{ all -> 0x0251 }
            r2 = 0
            r10.invoke(r2, r4)     // Catch:{ all -> 0x0251 }
        L_0x024c:
            r10 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            goto L_0x0163
        L_0x0251:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0259
            throw r1
        L_0x0259:
            throw r0
        L_0x025a:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = 0
            r21[r0] = r1
            return
        L_0x0263:
            boolean r1 = f8780d
            r4 = 12
            if (r1 == 0) goto L_0x026b
            r1 = r4
            goto L_0x026d
        L_0x026b:
            r1 = 77
        L_0x026d:
            if (r1 == r4) goto L_0x02b8
            int r1 = r0.length
            r5.f10445d = r1
            char[] r1 = new char[r1]
            r2 = 0
        L_0x0275:
            r5.f10444a = r2
            int r2 = r5.f10444a
            int r4 = r5.f10445d
            r7 = 17
            if (r2 >= r4) goto L_0x0282
            r8 = 82
            goto L_0x0283
        L_0x0282:
            r8 = r7
        L_0x0283:
            if (r8 == r7) goto L_0x02af
            int r7 = $11
            int r7 = r7 + 21
            int r8 = r7 % 128
            $10 = r8
            r8 = 2
            int r7 = r7 % r8
            if (r7 == 0) goto L_0x029f
            int r4 = r4 + 1
            int r4 = r4 >>> r2
            r4 = r0[r4]
            int r4 = r4 << r19
            char r4 = r6[r4]
            int r4 = r4 >> r3
            char r4 = (char) r4
            r1[r2] = r4
            goto L_0x02ac
        L_0x029f:
            int r4 = r4 + -1
            int r4 = r4 - r2
            r4 = r0[r4]
            int r4 = r4 - r19
            char r4 = r6[r4]
            int r4 = r4 - r3
            char r4 = (char) r4
            r1[r2] = r4
        L_0x02ac:
            int r2 = r2 + 1
            goto L_0x0275
        L_0x02af:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            r1 = 0
            r21[r1] = r0
            return
        L_0x02b8:
            int r0 = $11
            int r0 = r0 + 91
            int r1 = r0 % 128
            $10 = r1
            r1 = 2
            int r0 = r0 % r1
            r1 = 8
            if (r0 == 0) goto L_0x02c9
            r0 = 34
            goto L_0x02ca
        L_0x02c9:
            r0 = r1
        L_0x02ca:
            if (r0 == r1) goto L_0x02d4
            int r0 = r2.length
            r5.f10445d = r0
            char[] r0 = new char[r0]
            r5.f10444a = r11
            goto L_0x02dc
        L_0x02d4:
            int r0 = r2.length
            r5.f10445d = r0
            char[] r0 = new char[r0]
            r1 = 0
            r5.f10444a = r1
        L_0x02dc:
            int r1 = r5.f10444a
            int r4 = r5.f10445d
            if (r1 >= r4) goto L_0x035b
            int r4 = r4 + -1
            int r4 = r4 - r1
            char r4 = r2[r4]
            int r4 = r4 - r19
            char r4 = r6[r4]
            int r4 = r4 - r3
            char r4 = (char) r4
            r0[r1] = r4
            r1 = 2
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0352 }
            r4[r11] = r5     // Catch:{ all -> 0x0352 }
            r1 = 0
            r4[r1] = r5     // Catch:{ all -> 0x0352 }
            java.util.Map<java.lang.Integer, java.lang.Object> r1 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0352 }
            r7 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0352 }
            java.lang.Object r7 = r1.get(r9)     // Catch:{ all -> 0x0352 }
            if (r7 == 0) goto L_0x030b
            r9 = 0
            r10 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            goto L_0x034b
        L_0x030b:
            float r7 = android.view.ViewConfiguration.getScrollFriction()     // Catch:{ all -> 0x0352 }
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            int r7 = r7 + -1
            char r7 = (char) r7     // Catch:{ all -> 0x0352 }
            r10 = 0
            int r12 = android.graphics.drawable.Drawable.resolveOpacity(r10, r10)     // Catch:{ all -> 0x0352 }
            int r12 = 782 - r12
            int r13 = android.view.ViewConfiguration.getMaximumFlingVelocity()     // Catch:{ all -> 0x0352 }
            int r13 = r13 >> 16
            int r13 = 24 - r13
            java.lang.Object r7 = com.facetec.sdk.C2854bp.m11559b(r7, r12, r13)     // Catch:{ all -> 0x0352 }
            java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ all -> 0x0352 }
            byte r12 = (byte) r10     // Catch:{ all -> 0x0352 }
            byte r13 = (byte) r12     // Catch:{ all -> 0x0352 }
            byte r14 = (byte) r13     // Catch:{ all -> 0x0352 }
            java.lang.Object[] r15 = new java.lang.Object[r11]     // Catch:{ all -> 0x0352 }
            m10716i(r12, r13, r14, r15)     // Catch:{ all -> 0x0352 }
            r12 = r15[r10]     // Catch:{ all -> 0x0352 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0352 }
            r13 = 2
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x0352 }
            r14[r10] = r8     // Catch:{ all -> 0x0352 }
            r14[r11] = r8     // Catch:{ all -> 0x0352 }
            java.lang.reflect.Method r7 = r7.getMethod(r12, r14)     // Catch:{ all -> 0x0352 }
            r10 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0352 }
            r1.put(r12, r7)     // Catch:{ all -> 0x0352 }
        L_0x034b:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch:{ all -> 0x0352 }
            r1 = 0
            r7.invoke(r1, r4)     // Catch:{ all -> 0x0352 }
            goto L_0x02dc
        L_0x0352:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x035a
            throw r1
        L_0x035a:
            throw r0
        L_0x035b:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            int r0 = $11
            int r0 = r0 + 35
            int r2 = r0 % 128
            $10 = r2
            r2 = 2
            int r0 = r0 % r2
            r0 = 0
            r21[r0] = r1
            return
        L_0x036e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0376
            throw r1
        L_0x0376:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2770ad.m10715h(java.lang.String, int[], int, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10716i(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = $$a
            int r6 = r6 * 3
            int r6 = r6 + 1
            int r7 = r7 * 2
            int r7 = 105 - r7
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001d
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L_0x0038
        L_0x001d:
            r3 = r2
        L_0x001e:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L_0x002b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x002b:
            int r3 = r3 + 1
            byte r4 = r0[r8]
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
            int r9 = r9 + 1
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2770ad.m10716i(byte, int, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{66, 20, 2, -40};
        $$b = 158;
    }

    /* renamed from: d */
    public final byte[] mo8809d(byte[] bArr) {
        try {
            byte[] d = C2791an.m10852d();
            IvParameterSpec ivParameterSpec = new IvParameterSpec(d);
            boolean z = false;
            Object[] objArr = new Object[1];
            m10715h((String) null, (int[]) null, ((Process.getThreadPriority(0) + 20) >> 6) + C11051p3.f31760d, "", objArr);
            Cipher instance = Cipher.getInstance(((String) objArr[0]).intern());
            instance.init(1, this.f8784b, ivParameterSpec);
            byte[] e = C2791an.m10853e(instance, bArr);
            byte[] bArr2 = new byte[(e.length + d.length)];
            System.arraycopy(d, 0, bArr2, 0, d.length);
            System.arraycopy(e, 0, bArr2, d.length, e.length);
            int i = f8782f + 49;
            f8783g = i % 128;
            if (i % 2 == 0) {
                z = true;
            }
            if (!z) {
                return bArr2;
            }
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final byte[] mo8810e(byte[] bArr) {
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(copyOfRange);
        Object[] objArr = new Object[1];
        m10715h((String) null, (int[]) null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), "", objArr);
        Cipher instance = Cipher.getInstance(((String) objArr[0]).intern());
        instance.init(2, this.f8784b, ivParameterSpec);
        byte[] a = C2791an.m10851a(instance, copyOfRange2);
        int i = f8783g + 67;
        f8782f = i % 128;
        int i2 = i % 2;
        return a;
    }
}
