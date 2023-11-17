package com.facetec.sdk;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.Gravity;
import com.github.mikephil.charting.utils.Utils;
import com.guardsquare.dexguard.annotation.EncryptStrings;
import java.lang.reflect.Method;

@EncryptStrings
/* renamed from: com.facetec.sdk.l */
final class C3330l {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: a */
    private static int f10950a = 1;

    /* renamed from: b */
    private static char f10951b = 9121;

    /* renamed from: c */
    private static char[] f10952c = {5727, 5712, 5725, 5714, 5710, 5540, 5755, 5541, 5721, 5719, 5709, 5757, 5542, 5702, 5713, 5543, 5720, 5718, 5722, 5648, 5703, 5723, 5708, 5706, 5715};

    /* renamed from: e */
    private static int f10953e = 0;

    static {
        init$0();
    }

    C3330l() {
    }

    /* renamed from: c */
    private static Method m13345c() {
        int i = f10950a + 89;
        f10953e = i % 128;
        int i2 = i % 2;
        boolean z = false;
        try {
            Object[] objArr = new Object[1];
            m13347f("\u0004\f\u0004\u0018\u0007\u0002\u0005\u000f\u0012\u0002\u0015\u0018\u0007\u0004\u000e\u000f\u0001\u0002\u0011\u0017\u0013\u000e\u0013\u000f\f\u0015\u0005\u000f\u0012\u0002\u0015\u0018\u0007\u0004㙧", Gravity.getAbsoluteGravity(0, 0) + 35, (byte) (126 - (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1))), objArr);
            Class<?> cls = Class.forName(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            m13347f("\u0004\r\t\u0007\f\u0003\u0018\u0001\u0018\b\u000b\u0004", Drawable.resolveOpacity(0, 0) + 12, (byte) (79 - (TypedValue.complexToFloat(0) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFloat(0) == Utils.FLOAT_EPSILON ? 0 : -1))), objArr2);
            Method method = cls.getMethod(((String) objArr2[0]).intern(), new Class[]{Throwable.class});
            int i3 = f10950a + 23;
            f10953e = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
            if (!z) {
                return method;
            }
            throw null;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m13346d(java.lang.Throwable r8) {
        /*
            r0 = 0
            java.lang.String r1 = com.facetec.sdk.C2840bg.m11382j(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x004f
            int r4 = f10950a
            int r4 = r4 + 91
            int r5 = r4 % 128
            f10953e = r5
            int r4 = r4 % 2
            r4 = 0
            int r6 = android.widget.ExpandableListView.getPackedPositionGroup(r4)
            int r6 = r6 + 12
            int r4 = android.widget.ExpandableListView.getPackedPositionChild(r4)
            int r4 = r4 + 8
            byte r4 = (byte) r4
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r7 = "\u0004\f\u0004\u0018\u000f\u0001\u0001\u0016\u0018\u0016\u0004\u0011"
            m13347f(r7, r6, r4, r5)
            r4 = r5[r3]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            boolean r1 = r1.startsWith(r4)
            r4 = 14
            if (r1 == 0) goto L_0x003b
            r1 = r4
            goto L_0x003d
        L_0x003b:
            r1 = 74
        L_0x003d:
            if (r1 == r4) goto L_0x0040
            goto L_0x004f
        L_0x0040:
            int r1 = f10950a
            int r1 = r1 + 101
            int r4 = r1 % 128
            f10953e = r4
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r1 = r2
            goto L_0x0050
        L_0x004f:
            r1 = r3
        L_0x0050:
            if (r1 == 0) goto L_0x006e
            java.lang.reflect.Method r1 = m13345c()
            if (r1 == 0) goto L_0x005a
            r4 = r3
            goto L_0x005b
        L_0x005a:
            r4 = r2
        L_0x005b:
            if (r4 == r2) goto L_0x006e
            int r4 = f10953e
            int r4 = r4 + 21
            int r5 = r4 % 128
            f10950a = r5
            int r4 = r4 % 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x006e }
            r2[r3] = r8     // Catch:{ Exception -> 0x006e }
            r1.invoke(r0, r2)     // Catch:{ Exception -> 0x006e }
        L_0x006e:
            android.util.Log.getStackTraceString(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3330l.m13346d(java.lang.Throwable):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: char[]} */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13347f(java.lang.String r30, int r31, byte r32, java.lang.Object[] r33) {
        /*
            r0 = r31
            java.lang.String r1 = ""
            r2 = 26
            if (r30 == 0) goto L_0x000a
            r3 = r2
            goto L_0x000c
        L_0x000a:
            r3 = 30
        L_0x000c:
            if (r3 == r2) goto L_0x0011
            r2 = r30
            goto L_0x0015
        L_0x0011:
            char[] r2 = r30.toCharArray()
        L_0x0015:
            char[] r2 = (char[]) r2
            com.facetec.sdk.gh r3 = new com.facetec.sdk.gh
            r3.<init>()
            char[] r4 = f10952c
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0024
            r7 = r5
            goto L_0x0025
        L_0x0024:
            r7 = r6
        L_0x0025:
            r11 = -563486590(0xffffffffde69e082, float:-4.21315319E18)
            r12 = 0
            r14 = 2
            if (r7 == r5) goto L_0x002e
            goto L_0x00b7
        L_0x002e:
            int r7 = r4.length
            char[] r15 = new char[r7]
            r13 = r6
        L_0x0032:
            r10 = 29
            if (r13 >= r7) goto L_0x0038
            r8 = 3
            goto L_0x0039
        L_0x0038:
            r8 = r10
        L_0x0039:
            if (r8 == r10) goto L_0x00ac
            int r8 = $10
            int r8 = r8 + 59
            int r9 = r8 % 128
            $11 = r9
            int r8 = r8 % r14
            char r8 = r4[r13]
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x00a3 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00a3 }
            r9[r6] = r8     // Catch:{ all -> 0x00a3 }
            java.util.Map<java.lang.Integer, java.lang.Object> r8 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x00a3 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r10 = r8.get(r10)     // Catch:{ all -> 0x00a3 }
            if (r10 == 0) goto L_0x005b
            goto L_0x008f
        L_0x005b:
            float r10 = android.view.ViewConfiguration.getScrollFriction()     // Catch:{ all -> 0x00a3 }
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            int r10 = 6875 - r10
            char r10 = (char) r10     // Catch:{ all -> 0x00a3 }
            long r18 = android.os.Process.getElapsedCpuTime()     // Catch:{ all -> 0x00a3 }
            r16 = 0
            int r14 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            int r14 = 1861 - r14
            float r18 = android.graphics.PointF.length(r12, r12)     // Catch:{ all -> 0x00a3 }
            int r18 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            int r12 = 24 - r18
            java.lang.Object r10 = com.facetec.sdk.C2854bp.m11559b(r10, r14, r12)     // Catch:{ all -> 0x00a3 }
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x00a3 }
            java.lang.String r12 = "d"
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x00a3 }
            java.lang.Class r18 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00a3 }
            r14[r6] = r18     // Catch:{ all -> 0x00a3 }
            java.lang.reflect.Method r10 = r10.getMethod(r12, r14)     // Catch:{ all -> 0x00a3 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00a3 }
            r8.put(r12, r10)     // Catch:{ all -> 0x00a3 }
        L_0x008f:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch:{ all -> 0x00a3 }
            r8 = 0
            java.lang.Object r9 = r10.invoke(r8, r9)     // Catch:{ all -> 0x00a3 }
            java.lang.Character r9 = (java.lang.Character) r9     // Catch:{ all -> 0x00a3 }
            char r8 = r9.charValue()     // Catch:{ all -> 0x00a3 }
            r15[r13] = r8
            int r13 = r13 + 1
            r12 = 0
            r14 = 2
            goto L_0x0032
        L_0x00a3:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x00ab
            throw r1
        L_0x00ab:
            throw r0
        L_0x00ac:
            int r4 = $11
            int r4 = r4 + 107
            int r7 = r4 % 128
            $10 = r7
            r7 = 2
            int r4 = r4 % r7
            r4 = r15
        L_0x00b7:
            char r7 = f10951b
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x036f }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x036f }
            r8[r6] = r7     // Catch:{ all -> 0x036f }
            java.util.Map<java.lang.Integer, java.lang.Object> r7 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x036f }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x036f }
            java.lang.Object r9 = r7.get(r9)     // Catch:{ all -> 0x036f }
            if (r9 == 0) goto L_0x00ce
            goto L_0x00fa
        L_0x00ce:
            int r9 = android.text.TextUtils.getCapsMode(r1, r6, r6)     // Catch:{ all -> 0x036f }
            int r9 = r9 + 6874
            char r9 = (char) r9     // Catch:{ all -> 0x036f }
            int r1 = android.text.TextUtils.getOffsetAfter(r1, r6)     // Catch:{ all -> 0x036f }
            int r1 = 1860 - r1
            int r10 = android.view.KeyEvent.normalizeMetaState(r6)     // Catch:{ all -> 0x036f }
            int r10 = r10 + 24
            java.lang.Object r1 = com.facetec.sdk.C2854bp.m11559b(r9, r1, r10)     // Catch:{ all -> 0x036f }
            java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ all -> 0x036f }
            java.lang.String r9 = "d"
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ all -> 0x036f }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x036f }
            r10[r6] = r12     // Catch:{ all -> 0x036f }
            java.lang.reflect.Method r9 = r1.getMethod(r9, r10)     // Catch:{ all -> 0x036f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x036f }
            r7.put(r1, r9)     // Catch:{ all -> 0x036f }
        L_0x00fa:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch:{ all -> 0x036f }
            r1 = 0
            java.lang.Object r7 = r9.invoke(r1, r8)     // Catch:{ all -> 0x036f }
            java.lang.Character r7 = (java.lang.Character) r7     // Catch:{ all -> 0x036f }
            char r1 = r7.charValue()     // Catch:{ all -> 0x036f }
            char[] r7 = new char[r0]
            int r8 = r0 % 2
            if (r8 == 0) goto L_0x0121
            int r8 = $11
            int r8 = r8 + 123
            int r9 = r8 % 128
            $10 = r9
            r9 = 2
            int r8 = r8 % r9
            int r8 = r0 + -1
            char r9 = r2[r8]
            int r9 = r9 - r32
            char r9 = (char) r9
            r7[r8] = r9
            goto L_0x0122
        L_0x0121:
            r8 = r0
        L_0x0122:
            if (r8 <= r5) goto L_0x0127
            r9 = 52
            goto L_0x0129
        L_0x0127:
            r9 = 51
        L_0x0129:
            r10 = 51
            if (r9 == r10) goto L_0x035a
            r3.f10448c = r6
        L_0x012f:
            int r9 = r3.f10448c
            if (r9 >= r8) goto L_0x035a
            char r10 = r2[r9]
            r3.f10449d = r10
            int r11 = r9 + 1
            char r11 = r2[r11]
            r3.f10447b = r11
            if (r10 != r11) goto L_0x0153
            int r10 = r10 - r32
            char r10 = (char) r10
            r7[r9] = r10
            int r9 = r9 + 1
            int r11 = r11 - r32
            char r10 = (char) r11
            r7[r9] = r10
            r11 = 0
            r15 = 3
            r16 = 0
            r19 = 0
            goto L_0x0349
        L_0x0153:
            r9 = 13
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0351 }
            r10 = 12
            r9[r10] = r3     // Catch:{ all -> 0x0351 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0351 }
            r11 = 11
            r9[r11] = r10     // Catch:{ all -> 0x0351 }
            r10 = 10
            r9[r10] = r3     // Catch:{ all -> 0x0351 }
            r12 = 9
            r9[r12] = r3     // Catch:{ all -> 0x0351 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0351 }
            r14 = 8
            r9[r14] = r13     // Catch:{ all -> 0x0351 }
            r13 = 7
            r9[r13] = r3     // Catch:{ all -> 0x0351 }
            r15 = 6
            r9[r15] = r3     // Catch:{ all -> 0x0351 }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0351 }
            r21 = 5
            r9[r21] = r18     // Catch:{ all -> 0x0351 }
            r18 = 4
            r9[r18] = r3     // Catch:{ all -> 0x0351 }
            r22 = 3
            r9[r22] = r3     // Catch:{ all -> 0x0351 }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0351 }
            r20 = 2
            r9[r20] = r22     // Catch:{ all -> 0x0351 }
            r9[r5] = r3     // Catch:{ all -> 0x0351 }
            r9[r6] = r3     // Catch:{ all -> 0x0351 }
            java.util.Map<java.lang.Integer, java.lang.Object> r11 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0351 }
            r23 = -1127895707(0xffffffffbcc5ad65, float:-0.024130533)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x0351 }
            java.lang.Object r10 = r11.get(r10)     // Catch:{ all -> 0x0351 }
            java.lang.Class<java.lang.Object> r23 = java.lang.Object.class
            if (r10 == 0) goto L_0x01a7
            goto L_0x0202
        L_0x01a7:
            int r10 = android.view.KeyEvent.normalizeMetaState(r6)     // Catch:{ all -> 0x0351 }
            int r10 = r10 + 27868
            char r10 = (char) r10     // Catch:{ all -> 0x0351 }
            int r25 = android.view.View.resolveSizeAndState(r6, r6, r6)     // Catch:{ all -> 0x0351 }
            int r12 = r25 + 123
            long r27 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch:{ all -> 0x0351 }
            r16 = 0
            int r25 = (r27 > r16 ? 1 : (r27 == r16 ? 0 : -1))
            int r14 = r25 + 23
            java.lang.Object r10 = com.facetec.sdk.C2854bp.m11559b(r10, r12, r14)     // Catch:{ all -> 0x0351 }
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x0351 }
            java.lang.String r12 = "c"
            r14 = 13
            java.lang.Class[] r14 = new java.lang.Class[r14]     // Catch:{ all -> 0x0351 }
            r14[r6] = r23     // Catch:{ all -> 0x0351 }
            r14[r5] = r23     // Catch:{ all -> 0x0351 }
            java.lang.Class r25 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0351 }
            r20 = 2
            r14[r20] = r25     // Catch:{ all -> 0x0351 }
            r28 = 3
            r14[r28] = r23     // Catch:{ all -> 0x0351 }
            r14[r18] = r23     // Catch:{ all -> 0x0351 }
            r14[r21] = r25     // Catch:{ all -> 0x0351 }
            r14[r15] = r23     // Catch:{ all -> 0x0351 }
            r14[r13] = r23     // Catch:{ all -> 0x0351 }
            r27 = 8
            r14[r27] = r25     // Catch:{ all -> 0x0351 }
            r26 = 9
            r14[r26] = r23     // Catch:{ all -> 0x0351 }
            r24 = 10
            r14[r24] = r23     // Catch:{ all -> 0x0351 }
            r22 = 11
            r14[r22] = r25     // Catch:{ all -> 0x0351 }
            r25 = 12
            r14[r25] = r23     // Catch:{ all -> 0x0351 }
            java.lang.reflect.Method r10 = r10.getMethod(r12, r14)     // Catch:{ all -> 0x0351 }
            r12 = -1127895707(0xffffffffbcc5ad65, float:-0.024130533)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0351 }
            r11.put(r12, r10)     // Catch:{ all -> 0x0351 }
        L_0x0202:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch:{ all -> 0x0351 }
            r12 = 0
            java.lang.Object r9 = r10.invoke(r12, r9)     // Catch:{ all -> 0x0351 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0351 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0351 }
            int r10 = r3.f10451f
            if (r9 != r10) goto L_0x02fd
            int r9 = $10
            int r9 = r9 + 101
            int r10 = r9 % 128
            $11 = r10
            r10 = 2
            int r9 = r9 % r10
            r9 = 11
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x02f4 }
            r9 = 10
            r10[r9] = r3     // Catch:{ all -> 0x02f4 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x02f4 }
            r12 = 9
            r10[r12] = r9     // Catch:{ all -> 0x02f4 }
            r9 = 8
            r10[r9] = r3     // Catch:{ all -> 0x02f4 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x02f4 }
            r10[r13] = r9     // Catch:{ all -> 0x02f4 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x02f4 }
            r10[r15] = r9     // Catch:{ all -> 0x02f4 }
            r10[r21] = r3     // Catch:{ all -> 0x02f4 }
            r10[r18] = r3     // Catch:{ all -> 0x02f4 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x02f4 }
            r12 = 3
            r10[r12] = r9     // Catch:{ all -> 0x02f4 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x02f4 }
            r12 = 2
            r10[r12] = r9     // Catch:{ all -> 0x02f4 }
            r10[r5] = r3     // Catch:{ all -> 0x02f4 }
            r10[r6] = r3     // Catch:{ all -> 0x02f4 }
            r9 = -190269654(0xfffffffff4a8b72a, float:-1.0693614E32)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x02f4 }
            java.lang.Object r9 = r11.get(r9)     // Catch:{ all -> 0x02f4 }
            if (r9 == 0) goto L_0x0266
            r15 = 3
            r16 = 0
            r19 = 0
            goto L_0x02cb
        L_0x0266:
            r16 = 0
            int r9 = android.widget.ExpandableListView.getPackedPositionGroup(r16)     // Catch:{ all -> 0x02f4 }
            r12 = 34365(0x863d, float:4.8156E-41)
            int r12 = r12 - r9
            char r9 = (char) r12     // Catch:{ all -> 0x02f4 }
            long r28 = android.os.Process.getElapsedCpuTime()     // Catch:{ all -> 0x02f4 }
            int r12 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            int r12 = r12 + 639
            float r14 = android.media.AudioTrack.getMinVolume()     // Catch:{ all -> 0x02f4 }
            r19 = 0
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            int r14 = r14 + 23
            java.lang.Object r9 = com.facetec.sdk.C2854bp.m11559b(r9, r12, r14)     // Catch:{ all -> 0x02f4 }
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ all -> 0x02f4 }
            byte r12 = (byte) r6     // Catch:{ all -> 0x02f4 }
            byte r14 = (byte) r12     // Catch:{ all -> 0x02f4 }
            byte r13 = (byte) r14     // Catch:{ all -> 0x02f4 }
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x02f4 }
            m13348g(r12, r14, r13, r15)     // Catch:{ all -> 0x02f4 }
            r12 = r15[r6]     // Catch:{ all -> 0x02f4 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x02f4 }
            r13 = 11
            java.lang.Class[] r13 = new java.lang.Class[r13]     // Catch:{ all -> 0x02f4 }
            r13[r6] = r23     // Catch:{ all -> 0x02f4 }
            r13[r5] = r23     // Catch:{ all -> 0x02f4 }
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ all -> 0x02f4 }
            r15 = 2
            r13[r15] = r14     // Catch:{ all -> 0x02f4 }
            r15 = 3
            r13[r15] = r14     // Catch:{ all -> 0x02f4 }
            r13[r18] = r23     // Catch:{ all -> 0x02f4 }
            r13[r21] = r23     // Catch:{ all -> 0x02f4 }
            r18 = 6
            r13[r18] = r14     // Catch:{ all -> 0x02f4 }
            r18 = 7
            r13[r18] = r14     // Catch:{ all -> 0x02f4 }
            r18 = 8
            r13[r18] = r23     // Catch:{ all -> 0x02f4 }
            r18 = 9
            r13[r18] = r14     // Catch:{ all -> 0x02f4 }
            r14 = 10
            r13[r14] = r23     // Catch:{ all -> 0x02f4 }
            java.lang.reflect.Method r9 = r9.getMethod(r12, r13)     // Catch:{ all -> 0x02f4 }
            r12 = -190269654(0xfffffffff4a8b72a, float:-1.0693614E32)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x02f4 }
            r11.put(r12, r9)     // Catch:{ all -> 0x02f4 }
        L_0x02cb:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch:{ all -> 0x02f4 }
            r11 = 0
            java.lang.Object r9 = r9.invoke(r11, r10)     // Catch:{ all -> 0x02f4 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x02f4 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x02f4 }
            int r10 = r3.f10450e
            int r10 = r10 * r1
            int r12 = r3.f10451f
            int r10 = r10 + r12
            int r12 = r3.f10448c
            char r9 = r4[r9]
            r7[r12] = r9
            int r12 = r12 + r5
            char r9 = r4[r10]
            r7[r12] = r9
            int r9 = $10
            int r9 = r9 + 47
            int r10 = r9 % 128
            $11 = r10
            r10 = 2
            int r9 = r9 % r10
            goto L_0x0349
        L_0x02f4:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02fc
            throw r1
        L_0x02fc:
            throw r0
        L_0x02fd:
            r11 = 0
            r15 = 3
            r16 = 0
            r19 = 0
            int r9 = r3.f10446a
            int r12 = r3.f10450e
            if (r9 != r12) goto L_0x030c
            r13 = 73
            goto L_0x030e
        L_0x030c:
            r13 = 69
        L_0x030e:
            r14 = 73
            if (r13 == r14) goto L_0x0324
            int r9 = r9 * r1
            int r9 = r9 + r10
            int r12 = r12 * r1
            int r10 = r3.f10452i
            int r12 = r12 + r10
            int r10 = r3.f10448c
            char r9 = r4[r9]
            r7[r10] = r9
            int r10 = r10 + r5
            char r9 = r4[r12]
            r7[r10] = r9
            goto L_0x0349
        L_0x0324:
            int r13 = $11
            int r13 = r13 + 85
            int r14 = r13 % 128
            $10 = r14
            r14 = 2
            int r13 = r13 % r14
            int r13 = r3.f10452i
            int r13 = r13 + r1
            int r13 = r13 - r5
            int r13 = r13 % r1
            r3.f10452i = r13
            int r10 = r10 + r1
            int r10 = r10 - r5
            int r10 = r10 % r1
            r3.f10451f = r10
            int r9 = r9 * r1
            int r9 = r9 + r13
            int r12 = r12 * r1
            int r12 = r12 + r10
            int r10 = r3.f10448c
            char r9 = r4[r9]
            r7[r10] = r9
            int r10 = r10 + r5
            char r9 = r4[r12]
            r7[r10] = r9
        L_0x0349:
            int r9 = r3.f10448c
            r10 = 2
            int r9 = r9 + r10
            r3.f10448c = r9
            goto L_0x012f
        L_0x0351:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0359
            throw r1
        L_0x0359:
            throw r0
        L_0x035a:
            r1 = r6
        L_0x035b:
            if (r1 >= r0) goto L_0x0367
            char r2 = r7[r1]
            r2 = r2 ^ 13722(0x359a, float:1.9229E-41)
            char r2 = (char) r2
            r7[r1] = r2
            int r1 = r1 + 1
            goto L_0x035b
        L_0x0367:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7)
            r33[r6] = r0
            return
        L_0x036f:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0377
            throw r1
        L_0x0377:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3330l.m13347f(java.lang.String, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13348g(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 98
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = $$a
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L_0x0035
        L_0x001b:
            r3 = r2
        L_0x001c:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L_0x0029
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x0029:
            byte r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L_0x0035:
            int r7 = r7 + 1
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3330l.m13348g(short, int, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{114, 6, 6, -123};
        $$b = 241;
    }
}
