package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facetec.sdk.r */
final class C3534r {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: o */
    private static int f11418o = -863817467;

    /* renamed from: p */
    private static short[] f11419p;

    /* renamed from: q */
    private static char[] f11420q = {30603, 30606, 30604, 30707, 30598, 30620, 30659, 30705, 30656};

    /* renamed from: r */
    private static byte[] f11421r = {22, 25, 104, 102, 45, -45, 40, 41, 42, 111, 70, 77, -76, 37, 15, 4, -3, 0, -49, 41, -51, 79, -73, 120, Byte.MIN_VALUE, -7, -7, -7, -7, -7, -7, -7, -7};

    /* renamed from: s */
    private static int f11422s = -639988696;

    /* renamed from: t */
    private static int f11423t = 561501078;

    /* renamed from: u */
    private static int f11424u = 1;

    /* renamed from: v */
    private static boolean f11425v = true;

    /* renamed from: w */
    private static int f11426w = 0;

    /* renamed from: x */
    private static boolean f11427x = true;

    /* renamed from: y */
    private static int f11428y = -2032437742;

    /* renamed from: a */
    List<List<List<C2769ac>>> f11429a = new ArrayList();

    /* renamed from: b */
    List<C2769ac> f11430b = new ArrayList();

    /* renamed from: c */
    List<String> f11431c = new ArrayList();

    /* renamed from: d */
    List<List<Integer>> f11432d = new ArrayList();

    /* renamed from: e */
    List<List<List<C2769ac>>> f11433e = new ArrayList();

    /* renamed from: f */
    C3648w f11434f;

    /* renamed from: g */
    private List<List<C2769ac>> f11435g = new ArrayList();

    /* renamed from: h */
    C3648w f11436h;

    /* renamed from: i */
    List<List<List<C2769ac>>> f11437i = new ArrayList();

    /* renamed from: j */
    C3648w f11438j;

    /* renamed from: k */
    private C3492p f11439k;

    /* renamed from: l */
    private List<List<C2769ac>> f11440l = new ArrayList();

    /* renamed from: m */
    private C3648w f11441m;

    /* renamed from: n */
    private C3648w f11442n;

    static {
        init$0();
    }

    C3534r() {
        C3648w wVar = C3648w.NOT_RAN;
        this.f11441m = wVar;
        this.f11442n = wVar;
        this.f11434f = wVar;
        this.f11438j = wVar;
        this.f11436h = wVar;
        this.f11439k = new C3492p();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13879A(java.lang.String r18, int[] r19, int r20, java.lang.String r21, java.lang.Object[] r22) {
        /*
            r0 = r19
            r1 = r21
            if (r1 == 0) goto L_0x000c
            java.lang.String r2 = "ISO-8859-1"
            byte[] r1 = r1.getBytes(r2)
        L_0x000c:
            byte[] r1 = (byte[]) r1
            r2 = 69
            if (r18 == 0) goto L_0x0014
            r3 = r2
            goto L_0x0015
        L_0x0014:
            r3 = 5
        L_0x0015:
            r4 = 2
            r5 = 0
            if (r3 == r2) goto L_0x001c
            r2 = r18
            goto L_0x0033
        L_0x001c:
            int r2 = $10
            int r2 = r2 + 119
            int r3 = r2 % 128
            $11 = r3
            int r2 = r2 % r4
            if (r2 != 0) goto L_0x002f
            char[] r2 = r18.toCharArray()
            r3 = 8
            int r3 = r3 / r5
            goto L_0x0033
        L_0x002f:
            char[] r2 = r18.toCharArray()
        L_0x0033:
            char[] r2 = (char[]) r2
            com.facetec.sdk.gg r3 = new com.facetec.sdk.gg
            r3.<init>()
            char[] r6 = f11420q
            java.lang.String r7 = ""
            r9 = 1
            if (r6 == 0) goto L_0x00ce
            int r10 = r6.length
            char[] r11 = new char[r10]
            int r12 = $11
            int r12 = r12 + 101
            int r13 = r12 % 128
            $10 = r13
            int r12 = r12 % r4
            r12 = r5
        L_0x004e:
            if (r12 >= r10) goto L_0x0052
            r13 = r9
            goto L_0x0053
        L_0x0052:
            r13 = r5
        L_0x0053:
            if (r13 == 0) goto L_0x00cc
            char r13 = r6[r12]
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ all -> 0x00c3 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00c3 }
            r14[r5] = r13     // Catch:{ all -> 0x00c3 }
            java.util.Map<java.lang.Integer, java.lang.Object> r13 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x00c3 }
            r15 = -1321001135(0xffffffffb1431f51, float:-2.8394036E-9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x00c3 }
            java.lang.Object r4 = r13.get(r4)     // Catch:{ all -> 0x00c3 }
            if (r4 == 0) goto L_0x0071
            r17 = r6
            goto L_0x00ad
        L_0x0071:
            int r4 = android.graphics.Color.alpha(r5)     // Catch:{ all -> 0x00c3 }
            char r4 = (char) r4     // Catch:{ all -> 0x00c3 }
            int r8 = android.text.TextUtils.getTrimmedLength(r7)     // Catch:{ all -> 0x00c3 }
            int r8 = 886 - r8
            int r16 = android.view.View.MeasureSpec.getSize(r5)     // Catch:{ all -> 0x00c3 }
            int r15 = r16 + 23
            java.lang.Object r4 = com.facetec.sdk.C2854bp.m11559b(r4, r8, r15)     // Catch:{ all -> 0x00c3 }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x00c3 }
            byte r8 = (byte) r5     // Catch:{ all -> 0x00c3 }
            byte r15 = (byte) r8     // Catch:{ all -> 0x00c3 }
            r5 = r15 | 18
            byte r5 = (byte) r5     // Catch:{ all -> 0x00c3 }
            r17 = r6
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ all -> 0x00c3 }
            m13880B(r8, r15, r5, r6)     // Catch:{ all -> 0x00c3 }
            r5 = 0
            r6 = r6[r5]     // Catch:{ all -> 0x00c3 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00c3 }
            java.lang.Class[] r8 = new java.lang.Class[r9]     // Catch:{ all -> 0x00c3 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00c3 }
            r8[r5] = r15     // Catch:{ all -> 0x00c3 }
            java.lang.reflect.Method r4 = r4.getMethod(r6, r8)     // Catch:{ all -> 0x00c3 }
            r5 = -1321001135(0xffffffffb1431f51, float:-2.8394036E-9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00c3 }
            r13.put(r5, r4)     // Catch:{ all -> 0x00c3 }
        L_0x00ad:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch:{ all -> 0x00c3 }
            r5 = 0
            java.lang.Object r4 = r4.invoke(r5, r14)     // Catch:{ all -> 0x00c3 }
            java.lang.Character r4 = (java.lang.Character) r4     // Catch:{ all -> 0x00c3 }
            char r4 = r4.charValue()     // Catch:{ all -> 0x00c3 }
            r11[r12] = r4
            int r12 = r12 + 1
            r6 = r17
            r4 = 2
            r5 = 0
            goto L_0x004e
        L_0x00c3:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x00cb
            throw r1
        L_0x00cb:
            throw r0
        L_0x00cc:
            r6 = r11
            goto L_0x00d0
        L_0x00ce:
            r17 = r6
        L_0x00d0:
            int r4 = f11428y
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ all -> 0x02a3 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x02a3 }
            r8 = 0
            r5[r8] = r4     // Catch:{ all -> 0x02a3 }
            java.util.Map<java.lang.Integer, java.lang.Object> r4 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x02a3 }
            r8 = 2101371298(0x7d4061a2, float:1.598242E37)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x02a3 }
            java.lang.Object r10 = r4.get(r10)     // Catch:{ all -> 0x02a3 }
            r11 = 48
            if (r10 == 0) goto L_0x00ed
            goto L_0x012b
        L_0x00ed:
            int r10 = android.view.ViewConfiguration.getFadingEdgeLength()     // Catch:{ all -> 0x02a3 }
            int r10 = r10 >> 16
            int r10 = 20121 - r10
            char r10 = (char) r10     // Catch:{ all -> 0x02a3 }
            r12 = 0
            int r7 = android.text.TextUtils.lastIndexOf(r7, r11, r12, r12)     // Catch:{ all -> 0x02a3 }
            int r7 = r7 + 243
            int r12 = android.view.ViewConfiguration.getWindowTouchSlop()     // Catch:{ all -> 0x02a3 }
            int r12 = r12 >> 8
            int r12 = r12 + 24
            java.lang.Object r7 = com.facetec.sdk.C2854bp.m11559b(r10, r7, r12)     // Catch:{ all -> 0x02a3 }
            java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ all -> 0x02a3 }
            r10 = 0
            byte r12 = (byte) r10     // Catch:{ all -> 0x02a3 }
            byte r13 = (byte) r12     // Catch:{ all -> 0x02a3 }
            r14 = r13 | 12
            byte r14 = (byte) r14     // Catch:{ all -> 0x02a3 }
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ all -> 0x02a3 }
            m13880B(r12, r13, r14, r15)     // Catch:{ all -> 0x02a3 }
            r12 = r15[r10]     // Catch:{ all -> 0x02a3 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x02a3 }
            java.lang.Class[] r13 = new java.lang.Class[r9]     // Catch:{ all -> 0x02a3 }
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ all -> 0x02a3 }
            r13[r10] = r14     // Catch:{ all -> 0x02a3 }
            java.lang.reflect.Method r10 = r7.getMethod(r12, r13)     // Catch:{ all -> 0x02a3 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x02a3 }
            r4.put(r7, r10)     // Catch:{ all -> 0x02a3 }
        L_0x012b:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch:{ all -> 0x02a3 }
            r4 = 0
            java.lang.Object r5 = r10.invoke(r4, r5)     // Catch:{ all -> 0x02a3 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x02a3 }
            int r4 = r5.intValue()     // Catch:{ all -> 0x02a3 }
            boolean r5 = f11425v
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r8 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            if (r5 == 0) goto L_0x01e0
            int r0 = $11
            int r0 = r0 + 117
            int r2 = r0 % 128
            $10 = r2
            r2 = 2
            int r0 = r0 % r2
            if (r0 == 0) goto L_0x0154
            int r0 = r1.length
            r3.f10445d = r0
            char[] r0 = new char[r0]
            r2 = 0
            goto L_0x015a
        L_0x0154:
            r2 = 0
            int r0 = r1.length
            r3.f10445d = r0
            char[] r0 = new char[r0]
        L_0x015a:
            r3.f10444a = r2
        L_0x015c:
            int r2 = r3.f10444a
            int r5 = r3.f10445d
            r10 = 73
            if (r2 >= r5) goto L_0x0167
            r11 = 90
            goto L_0x0168
        L_0x0167:
            r11 = r10
        L_0x0168:
            if (r11 == r10) goto L_0x01d7
            int r5 = r5 + -1
            int r5 = r5 - r2
            byte r5 = r1[r5]
            int r5 = r5 + r20
            char r5 = r6[r5]
            int r5 = r5 - r4
            char r5 = (char) r5
            r0[r2] = r5
            r2 = 2
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x01ce }
            r5[r9] = r3     // Catch:{ all -> 0x01ce }
            r2 = 0
            r5[r2] = r3     // Catch:{ all -> 0x01ce }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x01ce }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x01ce }
            java.lang.Object r10 = r2.get(r10)     // Catch:{ all -> 0x01ce }
            if (r10 == 0) goto L_0x018c
            goto L_0x01c7
        L_0x018c:
            int r10 = android.view.ViewConfiguration.getWindowTouchSlop()     // Catch:{ all -> 0x01ce }
            int r10 = r10 >> 8
            char r10 = (char) r10     // Catch:{ all -> 0x01ce }
            r11 = 0
            int r12 = android.view.View.MeasureSpec.getMode(r11)     // Catch:{ all -> 0x01ce }
            int r12 = 782 - r12
            int r13 = android.view.KeyEvent.getModifierMetaStateMask()     // Catch:{ all -> 0x01ce }
            byte r13 = (byte) r13     // Catch:{ all -> 0x01ce }
            int r13 = 23 - r13
            java.lang.Object r10 = com.facetec.sdk.C2854bp.m11559b(r10, r12, r13)     // Catch:{ all -> 0x01ce }
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x01ce }
            byte r12 = (byte) r11     // Catch:{ all -> 0x01ce }
            byte r13 = (byte) r12     // Catch:{ all -> 0x01ce }
            r14 = r13 | 10
            byte r14 = (byte) r14     // Catch:{ all -> 0x01ce }
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ all -> 0x01ce }
            m13880B(r12, r13, r14, r15)     // Catch:{ all -> 0x01ce }
            r12 = r15[r11]     // Catch:{ all -> 0x01ce }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x01ce }
            r13 = 2
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x01ce }
            r14[r11] = r7     // Catch:{ all -> 0x01ce }
            r14[r9] = r7     // Catch:{ all -> 0x01ce }
            java.lang.reflect.Method r10 = r10.getMethod(r12, r14)     // Catch:{ all -> 0x01ce }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x01ce }
            r2.put(r11, r10)     // Catch:{ all -> 0x01ce }
        L_0x01c7:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch:{ all -> 0x01ce }
            r2 = 0
            r10.invoke(r2, r5)     // Catch:{ all -> 0x01ce }
            goto L_0x015c
        L_0x01ce:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01d6
            throw r1
        L_0x01d6:
            throw r0
        L_0x01d7:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = 0
            r22[r0] = r1
            return
        L_0x01e0:
            boolean r1 = f11427x
            r5 = 51
            if (r1 == 0) goto L_0x0275
            int r0 = $11
            int r0 = r0 + r5
            int r1 = r0 % 128
            $10 = r1
            r1 = 2
            int r0 = r0 % r1
            int r0 = r2.length
            r3.f10445d = r0
            char[] r0 = new char[r0]
            r1 = 0
            r3.f10444a = r1
        L_0x01f7:
            int r1 = r3.f10444a
            int r5 = r3.f10445d
            if (r1 >= r5) goto L_0x026c
            int r5 = r5 + -1
            int r5 = r5 - r1
            char r5 = r2[r5]
            int r5 = r5 - r20
            char r5 = r6[r5]
            int r5 = r5 - r4
            char r5 = (char) r5
            r0[r1] = r5
            r1 = 2
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0263 }
            r5[r9] = r3     // Catch:{ all -> 0x0263 }
            r1 = 0
            r5[r1] = r3     // Catch:{ all -> 0x0263 }
            java.util.Map<java.lang.Integer, java.lang.Object> r1 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0263 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0263 }
            java.lang.Object r10 = r1.get(r10)     // Catch:{ all -> 0x0263 }
            if (r10 == 0) goto L_0x0220
            r13 = 2
            goto L_0x025a
        L_0x0220:
            char r10 = android.text.AndroidCharacter.getMirror(r11)     // Catch:{ all -> 0x0263 }
            int r10 = 48 - r10
            char r10 = (char) r10     // Catch:{ all -> 0x0263 }
            r12 = 0
            int r13 = android.view.View.MeasureSpec.getSize(r12)     // Catch:{ all -> 0x0263 }
            int r13 = r13 + 782
            int r14 = android.graphics.ImageFormat.getBitsPerPixel(r12)     // Catch:{ all -> 0x0263 }
            int r14 = r14 + 25
            java.lang.Object r10 = com.facetec.sdk.C2854bp.m11559b(r10, r13, r14)     // Catch:{ all -> 0x0263 }
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x0263 }
            byte r13 = (byte) r12     // Catch:{ all -> 0x0263 }
            byte r14 = (byte) r13     // Catch:{ all -> 0x0263 }
            r15 = r14 | 10
            byte r15 = (byte) r15     // Catch:{ all -> 0x0263 }
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ all -> 0x0263 }
            m13880B(r13, r14, r15, r11)     // Catch:{ all -> 0x0263 }
            r11 = r11[r12]     // Catch:{ all -> 0x0263 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0263 }
            r13 = 2
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x0263 }
            r14[r12] = r7     // Catch:{ all -> 0x0263 }
            r14[r9] = r7     // Catch:{ all -> 0x0263 }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r14)     // Catch:{ all -> 0x0263 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0263 }
            r1.put(r11, r10)     // Catch:{ all -> 0x0263 }
        L_0x025a:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch:{ all -> 0x0263 }
            r1 = 0
            r10.invoke(r1, r5)     // Catch:{ all -> 0x0263 }
            r11 = 48
            goto L_0x01f7
        L_0x0263:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x026b
            throw r1
        L_0x026b:
            throw r0
        L_0x026c:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r2 = 0
            r22[r2] = r1
            return
        L_0x0275:
            r2 = 0
            int r1 = r0.length
            r3.f10445d = r1
            char[] r1 = new char[r1]
        L_0x027b:
            r3.f10444a = r2
            int r2 = r3.f10444a
            int r7 = r3.f10445d
            r8 = 29
            if (r2 >= r7) goto L_0x0287
            r9 = r5
            goto L_0x0288
        L_0x0287:
            r9 = r8
        L_0x0288:
            if (r9 == r8) goto L_0x029a
            int r7 = r7 + -1
            int r7 = r7 - r2
            r7 = r0[r7]
            int r7 = r7 - r20
            char r7 = r6[r7]
            int r7 = r7 - r4
            char r7 = (char) r7
            r1[r2] = r7
            int r2 = r2 + 1
            goto L_0x027b
        L_0x029a:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            r1 = 0
            r22[r1] = r0
            return
        L_0x02a3:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02ab
            throw r1
        L_0x02ab:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3534r.m13879A(java.lang.String, int[], int, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13880B(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = $$a
            int r8 = 115 - r8
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 * 4
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L_0x0036
        L_0x001b:
            r3 = r2
        L_0x001c:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L_0x0029
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x0029:
            int r3 = r3 + 1
            byte r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L_0x0036:
            int r8 = r8 + 1
            int r6 = r6 + r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3534r.m13880B(short, byte, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{19, -55, -63, -57};
        $$b = 116;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0201, code lost:
        if (r9 != false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0213, code lost:
        if (r9 != false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0217, code lost:
        r8 = 0;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13881z(int r22, int r23, byte r24, int r25, short r26, java.lang.Object[] r27) {
        /*
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            com.facetec.sdk.gi r1 = new com.facetec.sdk.gi
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = f11423t
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0368 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0368 }
            r6 = 1
            r5[r6] = r3     // Catch:{ all -> 0x0368 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0368 }
            r7 = 0
            r5[r7] = r3     // Catch:{ all -> 0x0368 }
            java.util.Map<java.lang.Integer, java.lang.Object> r3 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0368 }
            r8 = 2028566217(0x78e976c9, float:3.78817E34)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0368 }
            java.lang.Object r9 = r3.get(r9)     // Catch:{ all -> 0x0368 }
            r10 = 0
            r12 = 34365(0x863d, float:4.8156E-41)
            if (r9 == 0) goto L_0x0034
            goto L_0x0071
        L_0x0034:
            int r9 = android.view.ViewConfiguration.getTapTimeout()     // Catch:{ all -> 0x0368 }
            int r9 = r9 >> 16
            int r9 = r9 + r12
            char r9 = (char) r9     // Catch:{ all -> 0x0368 }
            int r13 = android.graphics.Color.blue(r7)     // Catch:{ all -> 0x0368 }
            int r13 = 640 - r13
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0368 }
            int r14 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            int r14 = r14 + 22
            java.lang.Object r9 = com.facetec.sdk.C2854bp.m11559b(r9, r13, r14)     // Catch:{ all -> 0x0368 }
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ all -> 0x0368 }
            byte r13 = (byte) r7     // Catch:{ all -> 0x0368 }
            byte r14 = (byte) r13     // Catch:{ all -> 0x0368 }
            int r15 = r14 + 3
            byte r15 = (byte) r15     // Catch:{ all -> 0x0368 }
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x0368 }
            m13880B(r13, r14, r15, r10)     // Catch:{ all -> 0x0368 }
            r10 = r10[r7]     // Catch:{ all -> 0x0368 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0368 }
            java.lang.Class[] r11 = new java.lang.Class[r4]     // Catch:{ all -> 0x0368 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0368 }
            r11[r7] = r13     // Catch:{ all -> 0x0368 }
            r11[r6] = r13     // Catch:{ all -> 0x0368 }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r11)     // Catch:{ all -> 0x0368 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0368 }
            r3.put(r10, r9)     // Catch:{ all -> 0x0368 }
        L_0x0071:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch:{ all -> 0x0368 }
            r3 = 0
            java.lang.Object r5 = r9.invoke(r3, r5)     // Catch:{ all -> 0x0368 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0368 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0368 }
            r9 = -1
            if (r5 != r9) goto L_0x0083
            r9 = r7
            goto L_0x0084
        L_0x0083:
            r9 = r6
        L_0x0084:
            if (r9 == r6) goto L_0x0088
            r9 = r6
            goto L_0x0089
        L_0x0088:
            r9 = r7
        L_0x0089:
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x01df
            byte[] r5 = f11421r
            if (r5 == 0) goto L_0x0093
            r11 = r6
            goto L_0x0094
        L_0x0093:
            r11 = r7
        L_0x0094:
            if (r11 == 0) goto L_0x0128
            int r11 = $10
            int r11 = r11 + 69
            int r15 = r11 % 128
            $11 = r15
            int r11 = r11 % r4
            int r11 = r5.length
            byte[] r15 = new byte[r11]
            r8 = r7
        L_0x00a3:
            if (r8 >= r11) goto L_0x0126
            byte r18 = r5[r8]
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x011d }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x011d }
            r4[r7] = r18     // Catch:{ all -> 0x011d }
            java.util.Map<java.lang.Integer, java.lang.Object> r13 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x011d }
            r14 = 1036018681(0x3dc063f9, float:0.09394068)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x011d }
            java.lang.Object r3 = r13.get(r3)     // Catch:{ all -> 0x011d }
            if (r3 == 0) goto L_0x00c3
            r21 = r5
            r16 = 0
            goto L_0x0103
        L_0x00c3:
            int r3 = android.text.TextUtils.getCapsMode(r10, r7, r7)     // Catch:{ all -> 0x011d }
            int r3 = r12 - r3
            char r3 = (char) r3     // Catch:{ all -> 0x011d }
            long r19 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x011d }
            r16 = 0
            int r12 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            int r12 = r12 + 639
            int r19 = android.widget.ExpandableListView.getPackedPositionType(r16)     // Catch:{ all -> 0x011d }
            int r14 = 23 - r19
            java.lang.Object r3 = com.facetec.sdk.C2854bp.m11559b(r3, r12, r14)     // Catch:{ all -> 0x011d }
            java.lang.Class r3 = (java.lang.Class) r3     // Catch:{ all -> 0x011d }
            byte r12 = (byte) r7     // Catch:{ all -> 0x011d }
            byte r14 = (byte) r12     // Catch:{ all -> 0x011d }
            byte r7 = (byte) r14     // Catch:{ all -> 0x011d }
            r21 = r5
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ all -> 0x011d }
            m13880B(r12, r14, r7, r5)     // Catch:{ all -> 0x011d }
            r7 = 0
            r5 = r5[r7]     // Catch:{ all -> 0x011d }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x011d }
            java.lang.Class[] r12 = new java.lang.Class[r6]     // Catch:{ all -> 0x011d }
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ all -> 0x011d }
            r12[r7] = r14     // Catch:{ all -> 0x011d }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r12)     // Catch:{ all -> 0x011d }
            r5 = 1036018681(0x3dc063f9, float:0.09394068)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x011d }
            r13.put(r5, r3)     // Catch:{ all -> 0x011d }
        L_0x0103:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch:{ all -> 0x011d }
            r5 = 0
            java.lang.Object r3 = r3.invoke(r5, r4)     // Catch:{ all -> 0x011d }
            java.lang.Byte r3 = (java.lang.Byte) r3     // Catch:{ all -> 0x011d }
            byte r3 = r3.byteValue()     // Catch:{ all -> 0x011d }
            r15[r8] = r3
            int r8 = r8 + 1
            r5 = r21
            r3 = 0
            r4 = 2
            r7 = 0
            r12 = 34365(0x863d, float:4.8156E-41)
            goto L_0x00a3
        L_0x011d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0125
            throw r1
        L_0x0125:
            throw r0
        L_0x0126:
            r5 = r15
            goto L_0x012a
        L_0x0128:
            r21 = r5
        L_0x012a:
            if (r5 == 0) goto L_0x012e
            r3 = r6
            goto L_0x012f
        L_0x012e:
            r3 = 0
        L_0x012f:
            if (r3 == r6) goto L_0x014e
            short[] r3 = f11419p
            int r4 = f11418o
            long r4 = (long) r4
            r7 = 5372657174759068665(0x4a8f833c2177d3f9, double:1.473784624269716E51)
            long r4 = r4 ^ r7
            int r4 = (int) r4
            int r4 = r23 + r4
            short r3 = r3[r4]
            long r3 = (long) r3
            long r3 = r3 ^ r7
            int r3 = (int) r3
            short r3 = (short) r3
            int r4 = f11423t
            long r4 = (long) r4
            long r4 = r4 ^ r7
            int r4 = (int) r4
            int r3 = r3 + r4
            short r5 = (short) r3
            goto L_0x01df
        L_0x014e:
            byte[] r3 = f11421r
            int r4 = f11418o
            r5 = 2
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x01d6 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01d6 }
            r7[r6] = r4     // Catch:{ all -> 0x01d6 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x01d6 }
            r5 = 0
            r7[r5] = r4     // Catch:{ all -> 0x01d6 }
            java.util.Map<java.lang.Integer, java.lang.Object> r4 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x01d6 }
            r5 = 2028566217(0x78e976c9, float:3.78817E34)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01d6 }
            java.lang.Object r5 = r4.get(r8)     // Catch:{ all -> 0x01d6 }
            if (r5 == 0) goto L_0x0172
            goto L_0x01b6
        L_0x0172:
            int r5 = android.os.Process.myPid()     // Catch:{ all -> 0x01d6 }
            int r5 = r5 >> 22
            r8 = 34365(0x863d, float:4.8156E-41)
            int r12 = r8 - r5
            char r5 = (char) r12     // Catch:{ all -> 0x01d6 }
            r8 = 0
            int r11 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01d6 }
            int r11 = r11 + 640
            int r12 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01d6 }
            int r12 = r12 + 23
            java.lang.Object r5 = com.facetec.sdk.C2854bp.m11559b(r5, r11, r12)     // Catch:{ all -> 0x01d6 }
            java.lang.Class r5 = (java.lang.Class) r5     // Catch:{ all -> 0x01d6 }
            byte r11 = (byte) r8     // Catch:{ all -> 0x01d6 }
            byte r12 = (byte) r11     // Catch:{ all -> 0x01d6 }
            int r13 = r12 + 3
            byte r13 = (byte) r13     // Catch:{ all -> 0x01d6 }
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x01d6 }
            m13880B(r11, r12, r13, r14)     // Catch:{ all -> 0x01d6 }
            r11 = r14[r8]     // Catch:{ all -> 0x01d6 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x01d6 }
            r12 = 2
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ all -> 0x01d6 }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01d6 }
            r13[r8] = r12     // Catch:{ all -> 0x01d6 }
            r13[r6] = r12     // Catch:{ all -> 0x01d6 }
            java.lang.reflect.Method r5 = r5.getMethod(r11, r13)     // Catch:{ all -> 0x01d6 }
            r8 = 2028566217(0x78e976c9, float:3.78817E34)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x01d6 }
            r4.put(r8, r5)     // Catch:{ all -> 0x01d6 }
        L_0x01b6:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch:{ all -> 0x01d6 }
            r4 = 0
            java.lang.Object r5 = r5.invoke(r4, r7)     // Catch:{ all -> 0x01d6 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x01d6 }
            int r4 = r5.intValue()     // Catch:{ all -> 0x01d6 }
            byte r3 = r3[r4]
            long r3 = (long) r3
            r7 = 5372657174759068665(0x4a8f833c2177d3f9, double:1.473784624269716E51)
            long r3 = r3 ^ r7
            int r3 = (int) r3
            byte r3 = (byte) r3
            int r4 = f11423t
            long r4 = (long) r4
            long r4 = r4 ^ r7
            int r4 = (int) r4
            int r3 = r3 + r4
            byte r5 = (byte) r3
            goto L_0x01df
        L_0x01d6:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01de
            throw r1
        L_0x01de:
            throw r0
        L_0x01df:
            if (r5 <= 0) goto L_0x01e3
            r3 = r6
            goto L_0x01e4
        L_0x01e3:
            r3 = 0
        L_0x01e4:
            if (r3 == 0) goto L_0x0360
            int r3 = $11
            r4 = 3
            int r3 = r3 + r4
            int r7 = r3 % 128
            $10 = r7
            r7 = 2
            int r3 = r3 % r7
            r7 = 4
            if (r3 == 0) goto L_0x0204
            int r3 = r23 + r5
            int r3 = r3 >>> r7
            int r8 = f11418o
            long r11 = (long) r8
            r13 = 5372657174759068665(0x4a8f833c2177d3f9, double:1.473784624269716E51)
            long r11 = r11 * r13
            int r8 = (int) r11
            int r3 = r3 << r8
            if (r9 == 0) goto L_0x0217
            goto L_0x0215
        L_0x0204:
            r13 = 5372657174759068665(0x4a8f833c2177d3f9, double:1.473784624269716E51)
            int r3 = r23 + r5
            r8 = 2
            int r3 = r3 - r8
            int r8 = f11418o
            long r11 = (long) r8
            long r11 = r11 ^ r13
            int r8 = (int) r11
            int r3 = r3 + r8
            if (r9 == 0) goto L_0x0217
        L_0x0215:
            r8 = r6
            goto L_0x0218
        L_0x0217:
            r8 = 0
        L_0x0218:
            int r3 = r3 + r8
            r1.f10456e = r3
            int r3 = f11422s
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0357 }
            r8[r4] = r2     // Catch:{ all -> 0x0357 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0357 }
            r9 = 2
            r8[r9] = r3     // Catch:{ all -> 0x0357 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x0357 }
            r8[r6] = r3     // Catch:{ all -> 0x0357 }
            r3 = 0
            r8[r3] = r1     // Catch:{ all -> 0x0357 }
            java.util.Map<java.lang.Integer, java.lang.Object> r3 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0357 }
            r9 = 1707185598(0x65c195be, float:1.1427237E23)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0357 }
            java.lang.Object r11 = r3.get(r11)     // Catch:{ all -> 0x0357 }
            if (r11 == 0) goto L_0x0241
            goto L_0x0287
        L_0x0241:
            int r11 = android.text.TextUtils.indexOf(r10, r10)     // Catch:{ all -> 0x0357 }
            r12 = 43789(0xab0d, float:6.1361E-41)
            int r12 = r12 - r11
            char r11 = (char) r12     // Catch:{ all -> 0x0357 }
            int r12 = android.view.ViewConfiguration.getPressedStateDuration()     // Catch:{ all -> 0x0357 }
            int r12 = r12 >> 16
            int r12 = 481 - r12
            r13 = 48
            int r10 = android.text.TextUtils.lastIndexOf(r10, r13)     // Catch:{ all -> 0x0357 }
            int r10 = r10 + 33
            java.lang.Object r10 = com.facetec.sdk.C2854bp.m11559b(r11, r12, r10)     // Catch:{ all -> 0x0357 }
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x0357 }
            r11 = 0
            byte r12 = (byte) r11     // Catch:{ all -> 0x0357 }
            byte r13 = (byte) r12     // Catch:{ all -> 0x0357 }
            int r14 = r13 + 2
            byte r14 = (byte) r14     // Catch:{ all -> 0x0357 }
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ all -> 0x0357 }
            m13880B(r12, r13, r14, r15)     // Catch:{ all -> 0x0357 }
            r12 = r15[r11]     // Catch:{ all -> 0x0357 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0357 }
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x0357 }
            r7[r11] = r0     // Catch:{ all -> 0x0357 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0357 }
            r7[r6] = r11     // Catch:{ all -> 0x0357 }
            r13 = 2
            r7[r13] = r11     // Catch:{ all -> 0x0357 }
            r7[r4] = r0     // Catch:{ all -> 0x0357 }
            java.lang.reflect.Method r11 = r10.getMethod(r12, r7)     // Catch:{ all -> 0x0357 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0357 }
            r3.put(r0, r11)     // Catch:{ all -> 0x0357 }
        L_0x0287:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11     // Catch:{ all -> 0x0357 }
            r0 = 0
            java.lang.Object r0 = r11.invoke(r0, r8)     // Catch:{ all -> 0x0357 }
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            char r3 = r1.f10454c
            r0.append(r3)
            char r0 = r1.f10454c
            r1.f10453b = r0
            byte[] r0 = f11421r
            if (r0 == 0) goto L_0x02be
            int r3 = $11
            int r3 = r3 + 115
            int r4 = r3 % 128
            $10 = r4
            r4 = 2
            int r3 = r3 % r4
            int r3 = r0.length
            byte[] r4 = new byte[r3]
            r7 = 0
        L_0x02ab:
            if (r7 >= r3) goto L_0x02bd
            byte r8 = r0[r7]
            long r8 = (long) r8
            r10 = 5372657174759068665(0x4a8f833c2177d3f9, double:1.473784624269716E51)
            long r8 = r8 ^ r10
            int r8 = (int) r8
            byte r8 = (byte) r8
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x02ab
        L_0x02bd:
            r0 = r4
        L_0x02be:
            if (r0 == 0) goto L_0x02c2
            r7 = r6
            goto L_0x02c3
        L_0x02c2:
            r7 = 0
        L_0x02c3:
            r1.f10455d = r6
        L_0x02c5:
            int r0 = r1.f10455d
            if (r0 >= r5) goto L_0x0360
            int r0 = $11
            int r0 = r0 + 81
            int r3 = r0 % 128
            $10 = r3
            r4 = 2
            int r0 = r0 % r4
            if (r7 == 0) goto L_0x031f
            int r3 = r3 + 59
            int r0 = r3 % 128
            $11 = r0
            r0 = 2
            int r3 = r3 % r0
            if (r3 != 0) goto L_0x02fb
            byte[] r0 = f11421r
            int r3 = r1.f10456e
            int r4 = r3 % 0
            r1.f10456e = r4
            byte r0 = r0[r3]
            long r3 = (long) r0
            r8 = 5372657174759068665(0x4a8f833c2177d3f9, double:1.473784624269716E51)
            long r3 = r3 ^ r8
            int r0 = (int) r3
            byte r0 = (byte) r0
            char r3 = r1.f10453b
            int r0 = r0 << r26
            byte r0 = (byte) r0
            r0 = r0 ^ r24
            int r3 = r3 - r0
            goto L_0x0316
        L_0x02fb:
            byte[] r0 = f11421r
            int r3 = r1.f10456e
            int r4 = r3 + -1
            r1.f10456e = r4
            byte r0 = r0[r3]
            long r3 = (long) r0
            r8 = 5372657174759068665(0x4a8f833c2177d3f9, double:1.473784624269716E51)
            long r3 = r3 ^ r8
            int r0 = (int) r3
            byte r0 = (byte) r0
            char r3 = r1.f10453b
            int r0 = r0 + r26
            byte r0 = (byte) r0
            r0 = r0 ^ r24
            int r3 = r3 + r0
        L_0x0316:
            char r0 = (char) r3
            r1.f10454c = r0
            r8 = 5372657174759068665(0x4a8f833c2177d3f9, double:1.473784624269716E51)
            goto L_0x033d
        L_0x031f:
            short[] r0 = f11419p
            int r3 = r1.f10456e
            int r4 = r3 + -1
            r1.f10456e = r4
            short r0 = r0[r3]
            long r3 = (long) r0
            r8 = 5372657174759068665(0x4a8f833c2177d3f9, double:1.473784624269716E51)
            long r3 = r3 ^ r8
            int r0 = (int) r3
            short r0 = (short) r0
            char r3 = r1.f10453b
            int r0 = r0 + r26
            short r0 = (short) r0
            r0 = r0 ^ r24
            int r3 = r3 + r0
            char r0 = (char) r3
            r1.f10454c = r0
        L_0x033d:
            char r0 = r1.f10454c
            r2.append(r0)
            char r0 = r1.f10454c
            r1.f10453b = r0
            int r0 = r1.f10455d
            int r0 = r0 + r6
            r1.f10455d = r0
            int r0 = $10
            int r0 = r0 + 63
            int r3 = r0 % 128
            $11 = r3
            r3 = 2
            int r0 = r0 % r3
            goto L_0x02c5
        L_0x0357:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x035f
            throw r1
        L_0x035f:
            throw r0
        L_0x0360:
            java.lang.String r0 = r2.toString()
            r1 = 0
            r27[r1] = r0
            return
        L_0x0368:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0370
            throw r1
        L_0x0370:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3534r.m13881z(int, int, byte, int, short, java.lang.Object[]):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final JSONObject mo10005c() {
        List<C2769ac> list = this.f11430b;
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= list.size()) {
                break;
            }
            int i2 = f11426w + 13;
            f11424u = i2 % 128;
            if (i2 % 2 != 0) {
                z = false;
            }
            if (z) {
                jSONArray.put(list.get(i).mo8808a());
                i += 99;
            } else {
                jSONArray.put(list.get(i).mo8808a());
                i++;
            }
            int i3 = f11424u + 107;
            f11426w = i3 % 128;
            int i4 = i3 % 2;
        }
        JSONArray e = C3711z.m13953e(this.f11435g);
        JSONArray e2 = C3711z.m13953e(this.f11440l);
        JSONArray a = C3711z.m13948a(this.f11433e);
        JSONArray a2 = C3711z.m13948a(this.f11429a);
        JSONArray a3 = C3711z.m13948a(this.f11437i);
        JSONObject jSONObject = new JSONObject();
        try {
            Object[] objArr = new Object[1];
            m13881z(TextUtils.lastIndexOf("", '0', 0, 0) - 107, 302718212 + TextUtils.getOffsetBefore("", 0), (byte) (18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), TextUtils.indexOf("", "", 0, 0) + 122855585, (short) TextUtils.indexOf("", "", 0), objArr);
            jSONObject.put(((String) objArr[0]).intern(), jSONArray.toString());
            Object[] objArr2 = new Object[1];
            m13881z(MotionEvent.axisFromString("") - 107, 302718214 + TextUtils.getOffsetBefore("", 0), (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 105), 122855586 - (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)), (short) ('0' - AndroidCharacter.getMirror('0')), objArr2);
            jSONObject.put(((String) objArr2[0]).intern(), this.f11431c.toString());
            Object[] objArr3 = new Object[1];
            m13881z(-109 - Color.red(0), ((Process.getThreadPriority(0) + 20) >> 6) + 302718216, (byte) (45 - (ViewConfiguration.getTapTimeout() >> 16)), 122855574 + (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)), (short) (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), objArr3);
            jSONObject.put(((String) objArr3[0]).intern(), this.f11432d.toString());
            Object[] objArr4 = new Object[1];
            m13879A((String) null, (int[]) null, 127 - (AudioTrack.getMinVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMinVolume() == Utils.FLOAT_EPSILON ? 0 : -1)), "", objArr4);
            jSONObject.put(((String) objArr4[0]).intern(), e.toString());
            Object[] objArr5 = new Object[1];
            m13881z(-106 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 302718216 - ImageFormat.getBitsPerPixel(0), (byte) (View.MeasureSpec.getMode(0) - 46), 122855569 - ExpandableListView.getPackedPositionChild(0), (short) View.resolveSizeAndState(0, 0, 0), objArr5);
            jSONObject.put(((String) objArr5[0]).intern(), e2.toString());
            Object[] objArr6 = new Object[1];
            m13879A((String) null, (int[]) null, ExpandableListView.getPackedPositionChild(0) + 128, "", objArr6);
            jSONObject.put(((String) objArr6[0]).intern(), a.toString());
            Object[] objArr7 = new Object[1];
            m13881z(-106 - View.MeasureSpec.makeMeasureSpec(0, 0), 302718221 - Color.argb(0, 0, 0, 0), (byte) ((Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 70), 122855578 - TextUtils.lastIndexOf("", '0'), (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr7);
            jSONObject.put(((String) objArr7[0]).intern(), a2.toString());
            Object[] objArr8 = new Object[1];
            m13881z(-106 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 302718226, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 14), TextUtils.getOffsetBefore("", 0) + 122855579, (short) TextUtils.indexOf("", ""), objArr8);
            jSONObject.put(((String) objArr8[0]).intern(), a3.toString());
            Object[] objArr9 = new Object[1];
            m13879A((String) null, (int[]) null, (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + C11051p3.f31760d, "", objArr9);
            jSONObject.put(((String) objArr9[0]).intern(), String.valueOf(this.f11441m.f11663b));
            Object[] objArr10 = new Object[1];
            m13879A((String) null, (int[]) null, 127 - (TypedValue.complexToFloat(0) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFloat(0) == Utils.FLOAT_EPSILON ? 0 : -1)), "", objArr10);
            jSONObject.put(((String) objArr10[0]).intern(), String.valueOf(this.f11442n.f11663b));
            Object[] objArr11 = new Object[1];
            m13879A((String) null, (int[]) null, View.resolveSizeAndState(0, 0, 0) + C11051p3.f31760d, "", objArr11);
            jSONObject.put(((String) objArr11[0]).intern(), String.valueOf(this.f11434f.f11663b));
            Object[] objArr12 = new Object[1];
            m13879A((String) null, (int[]) null, 127 - (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)), "", objArr12);
            jSONObject.put(((String) objArr12[0]).intern(), String.valueOf(this.f11438j.f11663b));
            Object[] objArr13 = new Object[1];
            m13881z(View.resolveSize(0, 0) - 106, 302718228 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 62), 122855578 - ImageFormat.getBitsPerPixel(0), (short) TextUtils.getOffsetBefore("", 0), objArr13);
            jSONObject.put(((String) objArr13[0]).intern(), String.valueOf(this.f11436h.f11663b));
            Object[] objArr14 = new Object[1];
            m13881z(ExpandableListView.getPackedPositionType(0) - 106, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 302718233, (byte) (-75 - View.resolveSize(0, 0)), 122855573 - KeyEvent.getDeadChar(0, 0), (short) ((ViewConfiguration.getScrollFriction() > Utils.FLOAT_EPSILON ? 1 : (ViewConfiguration.getScrollFriction() == Utils.FLOAT_EPSILON ? 0 : -1)) - 1), objArr14);
            jSONObject.put(((String) objArr14[0]).intern(), new JSONObject().toString());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
