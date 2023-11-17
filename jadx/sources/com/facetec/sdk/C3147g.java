package com.facetec.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facetec.sdk.C3293kb;
import com.github.mikephil.charting.utils.Utils;
import com.guardsquare.dexguard.annotation.EncryptStrings;
import java.lang.reflect.Method;
import java.util.Map;

@EncryptStrings
/* renamed from: com.facetec.sdk.g */
final class C3147g {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: a */
    private static int f10399a = 1;

    /* renamed from: b */
    private static int f10400b;

    /* renamed from: c */
    private static char[] f10401c;

    /* renamed from: d */
    private static final C3276jy f10402d;

    /* renamed from: e */
    private static int[] f10403e;

    /* renamed from: com.facetec.sdk.g$e */
    static class C3148e extends Exception {
        C3148e(String str) {
            super(str);
        }
    }

    static {
        char c;
        init$0();
        f10400b = 0;
        m12934c();
        Object[] objArr = new Object[1];
        m12935f(new int[]{946752655, -808142339, 21787692, -1912864429, -340537703, -1235683922, -8400183, 1698099678, -1797862962, -406594479, -1127699222, 704642336, -1186721216, -1700666308, -2144298893, -689227031}, 31 - ExpandableListView.getPackedPositionType(0), objArr);
        f10402d = C3276jy.m13148c(((String) objArr[0]).intern());
        int i = f10399a + 103;
        f10400b = i % 128;
        if (i % 2 != 0) {
            c = 5;
        } else {
            c = 'G';
        }
        if (c == 5) {
            int i2 = 57 / 0;
        }
    }

    C3147g() {
    }

    /* renamed from: b */
    static C3293kb m12933b(Context context, String str, Object obj) {
        C3293kb b = m12931b(context, str).mo9604e(C3297kd.m13213c(f10402d, new C2981dy().mo9141b().mo9142c().mo9135c(obj))).mo9599b();
        int i = f10400b + 85;
        f10399a = i % 128;
        int i2 = i % 2;
        return b;
    }

    /* renamed from: c */
    static void m12934c() {
        f10403e = new int[]{234913980, 2103082912, -992309031, 1604055957, -1845037510, 547465041, 1493153799, 735903721, -265596796, -2137958537, 571285762, 552600375, 132860119, 144769274, -1569842011, 912170623, -1008699342, -249572390};
        f10401c = new char[]{10697, 10728, 10635, 10681, 10678, 10670, 10683, 10683, 10675, 10676, 10675, 10673, 10667, 10656, 10662, 10671, 10668, 10656, 10591, 10643, 10727, 10624, 10638, 10671, 10656, 10609, 10607, 10545, 10609, 10548, 10498, 10506, 10595, 10517, 10605, 10520, 10551, 10622, 10523, 10497, 10513, 10497, 10502, 10507, 10623, 10516, 10514, 10554, 10593, 10519, 10519, 10556, 10498, 10607, 10526, 10609, 10608, 10582, 10452, 10459, 10453, 10447, 10545, 10548, 10457, 10453, 10544, 10552, 10460, 10452, 10452, 10460, 10462, 10461, 10750, 10630, 10669, 10671, 10679, 10678, 10645, 10642, 10645, 10654, 10678, 10673, 10673, 10669, 10667, 10675, 10653, 10655, 10679, 10671, 10647, 10645, 10670, 10674, 10679, 10678};
    }

    /* renamed from: f */
    private static void m12935f(int[] iArr, int i, Object[] objArr) {
        int i2;
        Class<Object> cls;
        Method method;
        int i3;
        int[] iArr2;
        int i4;
        String str;
        int i5;
        int[] iArr3 = iArr;
        String str2 = "";
        C3168gj gjVar = new C3168gj();
        char[] cArr = new char[4];
        char[] cArr2 = new char[(iArr3.length * 2)];
        int[] iArr4 = f10403e;
        int i6 = -1747701087;
        int i7 = 1;
        char c = 0;
        if (iArr4 != null) {
            int length = iArr4.length;
            int[] iArr5 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[i7];
                    objArr2[0] = Integer.valueOf(iArr4[i8]);
                    Map<Integer, Object> map = C2854bp.f9335p;
                    Object obj = map.get(Integer.valueOf(i6));
                    if (obj == null) {
                        obj = ((Class) C2854bp.m11559b((char) ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 1716, 24 - Color.red(0))).getMethod("f", new Class[]{Integer.TYPE});
                        map.put(-1747701087, obj);
                    }
                    iArr5[i8] = ((Integer) ((Method) obj).invoke((Object) null, objArr2)).intValue();
                    i8++;
                    i6 = -1747701087;
                    i7 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            iArr4 = iArr5;
        }
        int length2 = iArr4.length;
        int[] iArr6 = new int[length2];
        int[] iArr7 = f10403e;
        if (!(iArr7 == null)) {
            int i9 = $11 + 15;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                i4 = iArr7.length;
                iArr2 = new int[i4];
                i3 = 1;
            } else {
                i4 = iArr7.length;
                iArr2 = new int[i4];
                i3 = 0;
            }
            while (i3 < i4) {
                int i12 = $11 + 15;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[c] = Integer.valueOf(iArr7[i3]);
                        Map<Integer, Object> map2 = C2854bp.f9335p;
                        Object obj2 = map2.get(-1747701087);
                        if (obj2 != null) {
                            str = str2;
                        } else {
                            str = str2;
                            obj2 = ((Class) C2854bp.m11559b((char) KeyEvent.keyCodeFromString(str2), 1717 - KeyEvent.keyCodeFromString(str2), 24 - TextUtils.indexOf(str2, str2))).getMethod("f", new Class[]{Integer.TYPE});
                            map2.put(-1747701087, obj2);
                        }
                        iArr2[i3] = ((Integer) ((Method) obj2).invoke((Object) null, objArr3)).intValue();
                        i5 = i3 * 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } else {
                    str = str2;
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr7[i3])};
                        Map<Integer, Object> map3 = C2854bp.f9335p;
                        Object obj3 = map3.get(-1747701087);
                        if (obj3 == null) {
                            obj3 = ((Class) C2854bp.m11559b((char) (-1 - ImageFormat.getBitsPerPixel(0)), (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 1716, 24 - Gravity.getAbsoluteGravity(0, 0))).getMethod("f", new Class[]{Integer.TYPE});
                            map3.put(-1747701087, obj3);
                        }
                        iArr2[i3] = ((Integer) ((Method) obj3).invoke((Object) null, objArr4)).intValue();
                        i5 = i3 + 1;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                }
                str2 = str;
                c = 0;
            }
            iArr7 = iArr2;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr7, i2, iArr6, i2, length2);
        gjVar.f10459e = i2;
        while (true) {
            int i13 = gjVar.f10459e;
            if ((i13 < iArr3.length ? (char) 10 : 26) != 10) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i14 = i;
            int i15 = $11 + 121;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            int i17 = iArr3[i13];
            char c2 = (char) (i17 >> 16);
            cArr[0] = c2;
            char c3 = (char) i17;
            cArr[1] = c3;
            int i18 = 16;
            char c4 = (char) (iArr3[i13 + 1] >> 16);
            cArr[2] = c4;
            char c5 = (char) iArr3[i13 + 1];
            char c6 = 3;
            cArr[3] = c5;
            gjVar.f10458d = (c2 << 16) + c3;
            gjVar.f10457a = (c4 << 16) + c5;
            C3168gj.m12972b(iArr6);
            int i19 = 0;
            while (true) {
                cls = Object.class;
                if (i19 >= i18) {
                    break;
                }
                int i22 = $10 + 41;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = gjVar.f10458d ^ iArr6[i19];
                    gjVar.f10458d = i23;
                    int b = C3168gj.m12971b(i23);
                    try {
                        Object[] objArr5 = new Object[4];
                        objArr5[c6] = gjVar;
                        objArr5[2] = gjVar;
                        objArr5[1] = Integer.valueOf(b);
                        objArr5[0] = gjVar;
                        Map<Integer, Object> map4 = C2854bp.f9335p;
                        Object obj4 = map4.get(-43003330);
                        if (obj4 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) b2;
                            Object[] objArr6 = new Object[1];
                            m12937h(b2, b3, (byte) (b3 + 5), objArr6);
                            obj4 = ((Class) C2854bp.m11559b((char) ((ViewConfiguration.getScrollDefaultDelay() >> i18) + 43789), 481 - KeyEvent.normalizeMetaState(0), 32 - (ViewConfiguration.getScrollBarFadeDuration() >> i18))).getMethod((String) objArr6[0], new Class[]{cls, Integer.TYPE, cls, cls});
                            map4.put(-43003330, obj4);
                        }
                        int intValue = ((Integer) ((Method) obj4).invoke((Object) null, objArr5)).intValue();
                        gjVar.f10458d = gjVar.f10457a;
                        gjVar.f10457a = intValue;
                        i19 += 8;
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 != null) {
                            throw cause4;
                        }
                        throw th4;
                    }
                } else {
                    int i24 = gjVar.f10458d ^ iArr6[i19];
                    gjVar.f10458d = i24;
                    int b4 = C3168gj.m12971b(i24);
                    try {
                        Object[] objArr7 = new Object[4];
                        objArr7[3] = gjVar;
                        objArr7[2] = gjVar;
                        objArr7[1] = Integer.valueOf(b4);
                        objArr7[0] = gjVar;
                        Map<Integer, Object> map5 = C2854bp.f9335p;
                        Object obj5 = map5.get(-43003330);
                        if (obj5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) b5;
                            Object[] objArr8 = new Object[1];
                            m12937h(b5, b6, (byte) (b6 + 5), objArr8);
                            obj5 = ((Class) C2854bp.m11559b((char) (43789 - KeyEvent.normalizeMetaState(0)), 482 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)), (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 31)).getMethod((String) objArr8[0], new Class[]{cls, Integer.TYPE, cls, cls});
                            map5.put(-43003330, obj5);
                        }
                        int intValue2 = ((Integer) ((Method) obj5).invoke((Object) null, objArr7)).intValue();
                        gjVar.f10458d = gjVar.f10457a;
                        gjVar.f10457a = intValue2;
                        i19++;
                    } catch (Throwable th5) {
                        Throwable cause5 = th5.getCause();
                        if (cause5 != null) {
                            throw cause5;
                        }
                        throw th5;
                    }
                }
                i18 = 16;
                c6 = 3;
            }
            int i25 = gjVar.f10458d;
            int i26 = gjVar.f10457a;
            int i27 = i25 ^ iArr6[16];
            gjVar.f10457a = i27;
            int i28 = i26 ^ iArr6[17];
            gjVar.f10458d = i28;
            cArr[0] = (char) (i28 >>> 16);
            cArr[1] = (char) i28;
            cArr[2] = (char) (i27 >>> 16);
            cArr[3] = (char) i27;
            C3168gj.m12972b(iArr6);
            int i29 = gjVar.f10459e;
            cArr2[i29 * 2] = cArr[0];
            cArr2[(i29 * 2) + 1] = cArr[1];
            cArr2[(i29 * 2) + 2] = cArr[2];
            cArr2[(i29 * 2) + 3] = cArr[3];
            try {
                Object[] objArr9 = new Object[2];
                objArr9[1] = gjVar;
                objArr9[0] = gjVar;
                Map<Integer, Object> map6 = C2854bp.f9335p;
                Object obj6 = map6.get(-259238060);
                if (obj6 != null) {
                    method = obj6;
                } else {
                    byte b7 = (byte) 0;
                    Object[] objArr10 = new Object[1];
                    m12937h(b7, (byte) b7, (byte) (-$$a[1]), objArr10);
                    method = ((Class) C2854bp.m11559b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > Utils.DOUBLE_EPSILON ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == Utils.DOUBLE_EPSILON ? 0 : -1)), 663 - Gravity.getAbsoluteGravity(0, 0), 24 - (ViewConfiguration.getPressedStateDuration() >> 16))).getMethod((String) objArr10[0], new Class[]{cls, cls});
                    map6.put(-259238060, method);
                }
                method.invoke((Object) null, objArr9);
            } catch (Throwable th6) {
                Throwable cause6 = th6.getCause();
                if (cause6 != null) {
                    throw cause6;
                }
                throw th6;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0107, code lost:
        if (r0[r7] == 1) goto L_0x0109;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0239 A[Catch:{ all -> 0x028b }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x023a A[Catch:{ all -> 0x028b }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m12936g(int[] r23, java.lang.String r24, boolean r25, java.lang.Object[] r26) {
        /*
            r0 = r24
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L_0x0026
            int r4 = $11
            int r4 = r4 + 101
            int r5 = r4 % 128
            $10 = r5
            int r4 = r4 % r3
            r5 = 88
            if (r4 == 0) goto L_0x0018
            r4 = 75
            goto L_0x0019
        L_0x0018:
            r4 = r5
        L_0x0019:
            java.lang.String r6 = "ISO-8859-1"
            if (r4 != r5) goto L_0x0022
            byte[] r0 = r0.getBytes(r6)
            goto L_0x0026
        L_0x0022:
            r0.getBytes(r6)
            throw r2
        L_0x0026:
            byte[] r0 = (byte[]) r0
            com.facetec.sdk.gm r4 = new com.facetec.sdk.gm
            r4.<init>()
            r5 = 0
            r6 = r23[r5]
            r7 = 1
            r8 = r23[r7]
            r9 = r23[r3]
            r10 = 3
            r11 = r23[r10]
            char[] r12 = f10401c
            if (r12 == 0) goto L_0x003e
            r13 = r5
            goto L_0x0040
        L_0x003e:
            r13 = 93
        L_0x0040:
            if (r13 == 0) goto L_0x0046
            r21 = r9
            goto L_0x00dd
        L_0x0046:
            int r13 = r12.length
            char[] r14 = new char[r13]
            r15 = r5
        L_0x004a:
            if (r15 >= r13) goto L_0x00da
            char r16 = r12[r15]
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x00d1 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x00d1 }
            r10[r5] = r16     // Catch:{ all -> 0x00d1 }
            java.util.Map<java.lang.Integer, java.lang.Object> r3 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x00d1 }
            r17 = 1019307753(0x3cc166e9, float:0.023608642)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x00d1 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x00d1 }
            if (r2 == 0) goto L_0x006c
            r21 = r9
            r18 = r12
            r20 = r13
            goto L_0x00b3
        L_0x006c:
            int r2 = android.view.ViewConfiguration.getEdgeSlop()     // Catch:{ all -> 0x00d1 }
            int r2 = r2 >> 16
            char r2 = (char) r2     // Catch:{ all -> 0x00d1 }
            long r18 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()     // Catch:{ all -> 0x00d1 }
            r20 = 0
            int r7 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            int r7 = 910 - r7
            int r18 = android.view.ViewConfiguration.getPressedStateDuration()     // Catch:{ all -> 0x00d1 }
            int r18 = r18 >> 16
            int r5 = r18 + 24
            java.lang.Object r2 = com.facetec.sdk.C2854bp.m11559b(r2, r7, r5)     // Catch:{ all -> 0x00d1 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x00d1 }
            r5 = 0
            byte r7 = (byte) r5     // Catch:{ all -> 0x00d1 }
            byte r5 = (byte) r7     // Catch:{ all -> 0x00d1 }
            r18 = r12
            int r12 = r5 + 3
            byte r12 = (byte) r12     // Catch:{ all -> 0x00d1 }
            r21 = r9
            r20 = r13
            r13 = 1
            java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ all -> 0x00d1 }
            m12937h(r7, r5, r12, r9)     // Catch:{ all -> 0x00d1 }
            r5 = 0
            r7 = r9[r5]     // Catch:{ all -> 0x00d1 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x00d1 }
            java.lang.Class[] r9 = new java.lang.Class[r13]     // Catch:{ all -> 0x00d1 }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00d1 }
            r9[r5] = r12     // Catch:{ all -> 0x00d1 }
            java.lang.reflect.Method r2 = r2.getMethod(r7, r9)     // Catch:{ all -> 0x00d1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x00d1 }
            r3.put(r5, r2)     // Catch:{ all -> 0x00d1 }
        L_0x00b3:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ all -> 0x00d1 }
            r3 = 0
            java.lang.Object r2 = r2.invoke(r3, r10)     // Catch:{ all -> 0x00d1 }
            java.lang.Character r2 = (java.lang.Character) r2     // Catch:{ all -> 0x00d1 }
            char r2 = r2.charValue()     // Catch:{ all -> 0x00d1 }
            r14[r15] = r2
            int r15 = r15 + 1
            r12 = r18
            r13 = r20
            r9 = r21
            r2 = 0
            r3 = 2
            r5 = 0
            r7 = 1
            r10 = 3
            goto L_0x004a
        L_0x00d1:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x00d9
            throw r1
        L_0x00d9:
            throw r0
        L_0x00da:
            r21 = r9
            r12 = r14
        L_0x00dd:
            char[] r2 = new char[r8]
            r3 = 0
            java.lang.System.arraycopy(r12, r6, r2, r3, r8)
            if (r0 == 0) goto L_0x02a8
            char[] r6 = new char[r8]
            r4.f10463e = r3
            r3 = 0
        L_0x00ea:
            int r7 = r4.f10463e
            if (r7 >= r8) goto L_0x029d
            int r9 = $11
            r10 = 1
            int r9 = r9 + r10
            int r10 = r9 % 128
            $10 = r10
            r10 = 2
            int r9 = r9 % r10
            r10 = 48
            java.lang.String r12 = ""
            if (r9 == 0) goto L_0x0104
            byte r9 = r0[r7]
            if (r9 != 0) goto L_0x0194
            r13 = 1
            goto L_0x0109
        L_0x0104:
            byte r9 = r0[r7]
            r13 = 1
            if (r9 != r13) goto L_0x0194
        L_0x0109:
            char r9 = r2[r7]
            r14 = 2
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x018b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x018b }
            r15[r13] = r3     // Catch:{ all -> 0x018b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x018b }
            r9 = 0
            r15[r9] = r3     // Catch:{ all -> 0x018b }
            java.util.Map<java.lang.Integer, java.lang.Object> r3 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x018b }
            r9 = 1898160495(0x7123a16f, float:8.102595E29)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x018b }
            java.lang.Object r13 = r3.get(r13)     // Catch:{ all -> 0x018b }
            if (r13 == 0) goto L_0x012f
            r22 = r0
            r20 = 3
            goto L_0x0179
        L_0x012f:
            int r13 = android.text.TextUtils.lastIndexOf(r12, r10)     // Catch:{ all -> 0x018b }
            r14 = 55625(0xd949, float:7.7947E-41)
            int r13 = r13 + r14
            char r13 = (char) r13     // Catch:{ all -> 0x018b }
            int r14 = android.os.Process.getGidForName(r12)     // Catch:{ all -> 0x018b }
            int r14 = r14 + 291
            int r17 = android.view.MotionEvent.axisFromString(r12)     // Catch:{ all -> 0x018b }
            int r5 = r17 + 32
            java.lang.Object r5 = com.facetec.sdk.C2854bp.m11559b(r13, r14, r5)     // Catch:{ all -> 0x018b }
            java.lang.Class r5 = (java.lang.Class) r5     // Catch:{ all -> 0x018b }
            r13 = 0
            byte r14 = (byte) r13     // Catch:{ all -> 0x018b }
            byte r10 = (byte) r14     // Catch:{ all -> 0x018b }
            byte[] r19 = $$a     // Catch:{ all -> 0x018b }
            r20 = 3
            byte r9 = r19[r20]     // Catch:{ all -> 0x018b }
            byte r9 = (byte) r9     // Catch:{ all -> 0x018b }
            r22 = r0
            r13 = 1
            java.lang.Object[] r0 = new java.lang.Object[r13]     // Catch:{ all -> 0x018b }
            m12937h(r14, r10, r9, r0)     // Catch:{ all -> 0x018b }
            r9 = 0
            r0 = r0[r9]     // Catch:{ all -> 0x018b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x018b }
            r10 = 2
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ all -> 0x018b }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x018b }
            r13[r9] = r10     // Catch:{ all -> 0x018b }
            r9 = 1
            r13[r9] = r10     // Catch:{ all -> 0x018b }
            java.lang.reflect.Method r13 = r5.getMethod(r0, r13)     // Catch:{ all -> 0x018b }
            r0 = 1898160495(0x7123a16f, float:8.102595E29)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x018b }
            r3.put(r0, r13)     // Catch:{ all -> 0x018b }
        L_0x0179:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13     // Catch:{ all -> 0x018b }
            r0 = 0
            java.lang.Object r3 = r13.invoke(r0, r15)     // Catch:{ all -> 0x018b }
            java.lang.Character r3 = (java.lang.Character) r3     // Catch:{ all -> 0x018b }
            char r0 = r3.charValue()     // Catch:{ all -> 0x018b }
            r6[r7] = r0
            r3 = 2
            goto L_0x021e
        L_0x018b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0193
            throw r1
        L_0x0193:
            throw r0
        L_0x0194:
            r22 = r0
            r20 = 3
            char r0 = r2[r7]
            r5 = 2
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x0294 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0294 }
            r5 = 1
            r9[r5] = r3     // Catch:{ all -> 0x0294 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0294 }
            r3 = 0
            r9[r3] = r0     // Catch:{ all -> 0x0294 }
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0294 }
            r3 = 766175324(0x2daae85c, float:1.942995E-11)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0294 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0294 }
            if (r5 == 0) goto L_0x01bb
            goto L_0x0205
        L_0x01bb:
            int r5 = android.view.ViewConfiguration.getEdgeSlop()     // Catch:{ all -> 0x0294 }
            int r5 = r5 >> 16
            r10 = 43789(0xab0d, float:6.1361E-41)
            int r10 = r10 - r5
            char r5 = (char) r10     // Catch:{ all -> 0x0294 }
            int r10 = android.view.ViewConfiguration.getDoubleTapTimeout()     // Catch:{ all -> 0x0294 }
            int r10 = r10 >> 16
            int r10 = r10 + 481
            r13 = 48
            int r14 = android.text.TextUtils.indexOf(r12, r13)     // Catch:{ all -> 0x0294 }
            r13 = 31
            int r14 = 31 - r14
            java.lang.Object r5 = com.facetec.sdk.C2854bp.m11559b(r5, r10, r14)     // Catch:{ all -> 0x0294 }
            java.lang.Class r5 = (java.lang.Class) r5     // Catch:{ all -> 0x0294 }
            r10 = 0
            byte r14 = (byte) r10     // Catch:{ all -> 0x0294 }
            byte r15 = (byte) r14     // Catch:{ all -> 0x0294 }
            byte r13 = (byte) r15     // Catch:{ all -> 0x0294 }
            r3 = 1
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x0294 }
            m12937h(r14, r15, r13, r10)     // Catch:{ all -> 0x0294 }
            r3 = 0
            r10 = r10[r3]     // Catch:{ all -> 0x0294 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0294 }
            r13 = 2
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x0294 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0294 }
            r14[r3] = r13     // Catch:{ all -> 0x0294 }
            r3 = 1
            r14[r3] = r13     // Catch:{ all -> 0x0294 }
            java.lang.reflect.Method r5 = r5.getMethod(r10, r14)     // Catch:{ all -> 0x0294 }
            r3 = 766175324(0x2daae85c, float:1.942995E-11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0294 }
            r0.put(r3, r5)     // Catch:{ all -> 0x0294 }
        L_0x0205:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch:{ all -> 0x0294 }
            r0 = 0
            java.lang.Object r3 = r5.invoke(r0, r9)     // Catch:{ all -> 0x0294 }
            java.lang.Character r3 = (java.lang.Character) r3     // Catch:{ all -> 0x0294 }
            char r0 = r3.charValue()     // Catch:{ all -> 0x0294 }
            r6[r7] = r0
            int r0 = $10
            int r0 = r0 + 69
            int r3 = r0 % 128
            $11 = r3
            r3 = 2
            int r0 = r0 % r3
        L_0x021e:
            int r0 = r4.f10463e
            char r0 = r6[r0]
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x028b }
            r3 = 1
            r5[r3] = r4     // Catch:{ all -> 0x028b }
            r3 = 0
            r5[r3] = r4     // Catch:{ all -> 0x028b }
            java.util.Map<java.lang.Integer, java.lang.Object> r3 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x028b }
            r7 = -1824695553(0xffffffff933d5aff, float:-2.3900018E-27)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x028b }
            java.lang.Object r9 = r3.get(r9)     // Catch:{ all -> 0x028b }
            if (r9 == 0) goto L_0x023a
            goto L_0x0280
        L_0x023a:
            int r9 = android.text.TextUtils.getTrimmedLength(r12)     // Catch:{ all -> 0x028b }
            r10 = 61925(0xf1e5, float:8.6775E-41)
            int r9 = r9 + r10
            char r9 = (char) r9     // Catch:{ all -> 0x028b }
            r10 = 48
            r13 = 0
            int r10 = android.text.TextUtils.indexOf(r12, r10, r13, r13)     // Catch:{ all -> 0x028b }
            int r10 = 757 - r10
            int r12 = android.view.ViewConfiguration.getScrollDefaultDelay()     // Catch:{ all -> 0x028b }
            int r12 = r12 >> 16
            int r12 = r12 + 24
            java.lang.Object r9 = com.facetec.sdk.C2854bp.m11559b(r9, r10, r12)     // Catch:{ all -> 0x028b }
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ all -> 0x028b }
            r10 = 0
            byte r12 = (byte) r10     // Catch:{ all -> 0x028b }
            byte r13 = (byte) r12     // Catch:{ all -> 0x028b }
            int r14 = r13 + 1
            byte r14 = (byte) r14     // Catch:{ all -> 0x028b }
            r15 = 1
            java.lang.Object[] r7 = new java.lang.Object[r15]     // Catch:{ all -> 0x028b }
            m12937h(r12, r13, r14, r7)     // Catch:{ all -> 0x028b }
            r7 = r7[r10]     // Catch:{ all -> 0x028b }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x028b }
            r12 = 2
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ all -> 0x028b }
            r13[r10] = r1     // Catch:{ all -> 0x028b }
            r10 = 1
            r13[r10] = r1     // Catch:{ all -> 0x028b }
            java.lang.reflect.Method r9 = r9.getMethod(r7, r13)     // Catch:{ all -> 0x028b }
            r7 = -1824695553(0xffffffff933d5aff, float:-2.3900018E-27)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x028b }
            r3.put(r7, r9)     // Catch:{ all -> 0x028b }
        L_0x0280:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch:{ all -> 0x028b }
            r3 = 0
            r9.invoke(r3, r5)     // Catch:{ all -> 0x028b }
            r3 = r0
            r0 = r22
            goto L_0x00ea
        L_0x028b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0293
            throw r1
        L_0x0293:
            throw r0
        L_0x0294:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x029c
            throw r1
        L_0x029c:
            throw r0
        L_0x029d:
            int r0 = $10
            int r0 = r0 + 11
            int r1 = r0 % 128
            $11 = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = r6
        L_0x02a8:
            r0 = 35
            if (r11 <= 0) goto L_0x02af
            r5 = 31
            goto L_0x02b0
        L_0x02af:
            r5 = r0
        L_0x02b0:
            if (r5 == r0) goto L_0x02c0
            char[] r0 = new char[r8]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r8)
            int r3 = r8 - r11
            java.lang.System.arraycopy(r0, r1, r2, r3, r11)
            java.lang.System.arraycopy(r0, r11, r2, r1, r3)
        L_0x02c0:
            if (r25 == 0) goto L_0x0304
            int r0 = $10
            int r0 = r0 + 45
            int r1 = r0 % 128
            $11 = r1
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x02d2
            char[] r0 = new char[r8]
            r1 = 1
            goto L_0x02d5
        L_0x02d2:
            char[] r0 = new char[r8]
            r1 = 0
        L_0x02d5:
            r4.f10463e = r1
            int r1 = r4.f10463e
            if (r1 >= r8) goto L_0x02dd
            r3 = 0
            goto L_0x02de
        L_0x02dd:
            r3 = 1
        L_0x02de:
            r5 = 1
            if (r3 == r5) goto L_0x0303
            int r3 = $10
            int r3 = r3 + 7
            int r5 = r3 % 128
            $11 = r5
            r5 = 2
            int r3 = r3 % r5
            if (r3 != 0) goto L_0x02f8
            int r3 = r8 >>> r1
            r5 = 0
            int r3 = r3 - r5
            char r3 = r2[r3]
            r0[r1] = r3
            int r1 = r1 >>> 1
            goto L_0x02d5
        L_0x02f8:
            int r3 = r8 - r1
            r5 = 1
            int r3 = r3 - r5
            char r3 = r2[r3]
            r0[r1] = r3
            int r1 = r1 + 1
            goto L_0x02d5
        L_0x0303:
            r2 = r0
        L_0x0304:
            if (r21 <= 0) goto L_0x0308
            r0 = 0
            goto L_0x0309
        L_0x0308:
            r0 = 1
        L_0x0309:
            r1 = 1
            if (r0 == r1) goto L_0x0329
            int r0 = $11
            int r0 = r0 + 123
            int r1 = r0 % 128
            $10 = r1
            r1 = 2
            int r0 = r0 % r1
            r0 = 0
        L_0x0317:
            r4.f10463e = r0
            int r0 = r4.f10463e
            if (r0 >= r8) goto L_0x0329
            char r1 = r2[r0]
            r3 = 2
            r5 = r23[r3]
            int r1 = r1 - r5
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0317
        L_0x0329:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            r1 = 0
            r26[r1] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3147g.m12936g(int[], java.lang.String, boolean, java.lang.Object[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m12937h(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = r5 + 1
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r7 = 111 - r7
            byte[] r0 = $$a
            byte[] r1 = new byte[r5]
            r2 = -1
            int r5 = r5 + r2
            if (r0 != 0) goto L_0x001a
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            goto L_0x0035
        L_0x001a:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r1[r2] = r3
            if (r2 != r5) goto L_0x002a
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L_0x002a:
            byte r3 = r0[r6]
            r4 = r6
            r6 = r5
            r5 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r8
            r8 = r7
            r7 = r4
        L_0x0035:
            int r5 = -r5
            int r5 = r5 + r8
            int r7 = r7 + 1
            r8 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3147g.m12937h(byte, short, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{60, -7, -13, 2};
        $$b = 227;
    }

    /* renamed from: b */
    static C3293kb.C3294e m12931b(Context context, String str) {
        int i = f10400b + 69;
        f10399a = i % 128;
        if (!(i % 2 == 0)) {
            return m12932b(context, str, Boolean.TRUE);
        }
        C3293kb.C3294e b = m12932b(context, str, Boolean.TRUE);
        int i2 = 34 / 0;
        return b;
    }

    /* renamed from: b */
    static C3293kb.C3294e m12932b(Context context, String str, Boolean bool) {
        C3293kb.C3294e a = new C3293kb.C3294e().mo9597a(str);
        Object[] objArr = new Object[1];
        m12935f(new int[]{653273549, -1601611353, 1905782127, 95282588, 1222636016, 1157790614}, 11 - Color.red(0), objArr);
        C3293kb.C3294e d = a.mo9602d(((String) objArr[0]).intern(), C2840bg.f9201b);
        Object[] objArr2 = new Object[1];
        m12936g(new int[]{0, 10, 0, 6}, "\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001", false, objArr2);
        C3293kb.C3294e d2 = d.mo9602d(((String) objArr2[0]).intern(), C2802au.m10955b(C2840bg.f9201b));
        Object[] objArr3 = new Object[1];
        m12935f(new int[]{291460210, 303413784, 1204673860, -789060370, -192413853, -121613985}, 11 - Process.getGidForName(""), objArr3);
        C3293kb.C3294e d3 = d2.mo9602d(((String) objArr3[0]).intern(), C2802au.m10955b(C2840bg.f9201b));
        Object[] objArr4 = new Object[1];
        m12936g(new int[]{10, 15, 11, 13}, (String) null, true, objArr4);
        String intern = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        m12936g(new int[]{25, 32, 123, 13}, (String) null, true, objArr5);
        C3293kb.C3294e d4 = d3.mo9602d(intern, ((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        m12936g(new int[]{57, 17, 159, 0}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", true, objArr6);
        SharedPreferences sharedPreferences = context.getSharedPreferences(((String) objArr6[0]).intern(), 0);
        Object[] objArr7 = new Object[1];
        m12935f(new int[]{-1414618306, 1542923364, -1902598974, 841877449, -361700174, 1117489265, -863517511, 1491554817, 23716908, -1961922268, -876100373, -2079265533, -1528717833, -1606410825, -1344636198, 1861690071}, Color.red(0) + 30, objArr7);
        String string = sharedPreferences.getString(((String) objArr7[0]).intern(), "");
        if (!string.equals("")) {
            int i = f10399a + 19;
            f10400b = i % 128;
            int i2 = i % 2;
            Object[] objArr8 = new Object[1];
            m12935f(new int[]{291460210, 303413784, 2101875598, 688795782, 1694045588, 253189950}, (Process.myPid() >> 22) + 12, objArr8);
            d4.mo9602d(((String) objArr8[0]).intern(), string);
            int i3 = f10400b + 75;
            f10399a = i3 % 128;
            int i4 = i3 % 2;
        }
        if (!(!bool.booleanValue())) {
            if (C2802au.f9001e != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr9 = new Object[1];
                    m12936g(new int[]{25, 32, 123, 13}, (String) null, true, objArr9);
                    sb.append(((String) objArr9[0]).intern());
                    sb.append(C2802au.f9001e);
                    String lowerCase = C2844bi.m11419d(sb.toString()).toLowerCase();
                    Object[] objArr10 = new Object[1];
                    m12935f(new int[]{538330825, 854632685, 1330571798, 641661582, -953845136, -1997613573, 454369910, 589765236}, MotionEvent.axisFromString("") + 14, objArr10);
                    d4.mo9602d(((String) objArr10[0]).intern(), lowerCase);
                } catch (Exception unused) {
                    Object[] objArr11 = new Object[1];
                    m12936g(new int[]{74, 26, 0, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001", false, objArr11);
                    throw new C3148e(((String) objArr11[0]).intern());
                }
            } else {
                Object[] objArr12 = new Object[1];
                m12935f(new int[]{-2007984484, 66370742, 328534282, 1776826055, 1953658330, -707560026, -437735560, -453661761, 1510438252, 330557199, 836600556, 1989119318}, TextUtils.indexOf("", "", 0) + 22, objArr12);
                throw new C3148e(((String) objArr12[0]).intern());
            }
        }
        return d4;
    }
}
