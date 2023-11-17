package com.facetec.sdk;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.github.mikephil.charting.utils.Utils;
import com.guardsquare.dexguard.annotation.ObfuscateCodeLow;
import com.guardsquare.dexguard.annotation.ObfuscateCodeMedium;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@ObfuscateCodeLow
/* renamed from: com.facetec.sdk.bw */
public final class C2863bw {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: a */
    public static boolean f9376a = false;

    /* renamed from: b */
    private static String f9377b = "";

    /* renamed from: c */
    private static String f9378c = "";

    /* renamed from: d */
    private static boolean f9379d = false;

    /* renamed from: e */
    private static boolean f9380e = false;

    /* renamed from: f */
    private static long f9381f;

    /* renamed from: g */
    private static long f9382g;

    /* renamed from: h */
    private static char[] f9383h;

    /* renamed from: i */
    private static LinkedList<Long> f9384i;

    /* renamed from: j */
    private static boolean f9385j;

    /* renamed from: k */
    private static int f9386k = 1;

    /* renamed from: m */
    private static int f9387m;

    static {
        init$0();
        f9387m = 0;
        m11675b();
        int i = f9386k + 113;
        f9387m = i % 128;
        int i2 = i % 2;
    }

    C2863bw() {
    }

    /* renamed from: a */
    static void m11673a(Context context) {
        int i = f9386k + 95;
        f9387m = i % 128;
        if ((i % 2 != 0 ? '4' : 'T') == '4') {
            throw null;
        } else if (f9380e) {
            if ((!f9384i.isEmpty() ? '-' : 'c') != 'c') {
                int i2 = f9387m + 33;
                f9386k = i2 % 128;
                int i3 = i2 % 2;
                f9384i.removeLast();
            }
            m11682e(context);
        }
    }

    /* renamed from: b */
    static void m11675b() {
        f9383h = new char[]{8253, 49568, 8247, 49592, 24829, 33127, 8233, 33443, 25399, 16770, 9825, 1276, 58697, 52017, 43441, 36369, 27881, 19781, 13271, 4484, 62989, 54499, 46434, 39898, 31162, 24127, 15515, 7535, 9050, 49870, 57467, 34712, 42245, 17584, 27336, 2120, 12261, 52508, 60585};
        f9381f = 7758026719366595020L;
    }

    /* renamed from: c */
    static void m11678c(Context context) {
        char c;
        boolean z;
        if (!f9380e) {
            int i = f9387m + 45;
            f9386k = i % 128;
            if (i % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                throw null;
            }
            return;
        }
        if (!f9384i.isEmpty()) {
            c = 7;
        } else {
            c = '/';
        }
        if (c != '/') {
            int i2 = f9386k + 43;
            f9387m = i2 % 128;
            int i3 = i2 % 2;
            f9384i.removeLast();
            m11683f(context);
        }
    }

    /* renamed from: d */
    static void m11679d(Context context) {
        int i = f9386k + 43;
        f9387m = i % 128;
        int i2 = i % 2;
        boolean z = true;
        if ((!f9385j ? 9 : '0') == 9) {
            f9385j = true;
            while (f9384i.size() > 3) {
                f9384i.removeFirst();
                int i3 = f9387m + 51;
                f9386k = i3 % 128;
                int i4 = i3 % 2;
            }
            m11683f(context);
        }
        int i5 = f9386k + 95;
        f9387m = i5 % 128;
        if (i5 % 2 != 0) {
            z = false;
        }
        if (!z) {
            throw null;
        }
    }

    /* renamed from: e */
    static void m11682e(Context context) {
        int i = f9387m + 33;
        int i2 = i % 128;
        f9386k = i2;
        int i3 = i % 2;
        if (!f9380e) {
            int i4 = i2 + 15;
            f9387m = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        f9384i.add(Long.valueOf(new Date().getTime()));
        m11683f(context);
    }

    /* renamed from: f */
    private static void m11683f(Context context) {
        int i = f9387m + 45;
        int i2 = i % 128;
        f9386k = i2;
        int i3 = i % 2;
        if (context == null) {
            int i4 = i2 + 33;
            f9387m = i4 % 128;
            if (!(i4 % 2 == 0)) {
                int i5 = 71 / 0;
                return;
            }
            return;
        }
        C2920cv.m12196e(new C3340l9(context));
    }

    /* renamed from: g */
    private static void m11684g(Context context) {
        long j;
        boolean z;
        long j2;
        int i = f9386k + 25;
        f9387m = i % 128;
        int i2 = i % 2;
        if (!f9384i.isEmpty()) {
            long size = (long) f9384i.size();
            long longValue = f9384i.peekLast().longValue();
            if (f9376a) {
                j = 600000;
            } else {
                j = 300000;
            }
            long j3 = longValue - j;
            while (!f9384i.isEmpty()) {
                int i3 = f9386k + 87;
                f9387m = i3 % 128;
                if (i3 % 2 == 0) {
                    if (f9384i.peekFirst().longValue() >= j3) {
                        break;
                    }
                    f9384i.removeFirst();
                } else {
                    f9384i.peekFirst().longValue();
                    throw null;
                }
            }
            boolean z2 = false;
            if (f9376a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                j2 = 10;
            } else {
                int i4 = f9386k + 115;
                int i5 = i4 % 128;
                f9387m = i5;
                if (i4 % 2 != 0) {
                    int i6 = 68 / 0;
                }
                int i7 = i5 + 123;
                f9386k = i7 % 128;
                int i8 = i7 % 2;
                j2 = 12;
            }
            if (((long) f9384i.size()) >= j2) {
                f9382g = longValue;
                f9384i.clear();
                int i9 = f9387m + 49;
                f9386k = i9 % 128;
                int i12 = i9 % 2;
            }
            if (((long) f9384i.size()) != size) {
                int i13 = f9386k + 81;
                f9387m = i13 % 128;
                if (i13 % 2 != 0) {
                    z2 = true;
                }
                m11683f(context);
                if (z2) {
                    throw null;
                }
            }
        }
    }

    @ObfuscateCodeMedium
    /* renamed from: h */
    static boolean m11685h(Context context) {
        boolean z;
        int i = f9386k + 59;
        f9387m = i % 128;
        int i2 = i % 2;
        long i3 = m11686i(context);
        if (i3 > 0) {
            if (new Date().getTime() < i3) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                int i4 = f9386k + 23;
                f9387m = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = f9387m + 105;
            f9386k = i6 % 128;
            int i7 = i6 % 2;
        }
        return false;
    }

    /* renamed from: i */
    static long m11686i(Context context) {
        char c;
        int i = f9387m + 93;
        f9386k = i % 128;
        int i2 = i % 2;
        m11684g(context);
        long j = f9382g;
        if (j != 0) {
            c = '2';
        } else {
            c = '=';
        }
        if (c != '2') {
            int i3 = f9386k + 77;
            f9387m = i3 % 128;
            int i4 = i3 % 2;
            return 0;
        }
        int i5 = f9387m + 39;
        f9386k = i5 % 128;
        int i6 = i5 % 2;
        return j + 300000;
    }

    static void init$0() {
        $$a = new byte[]{110, -99, 109, -51};
        $$b = 112;
    }

    /* renamed from: j */
    private static boolean m11687j(Context context) {
        boolean z;
        int i = f9387m + 79;
        f9386k = i % 128;
        int i2 = i % 2;
        try {
            m11692o(context);
            z = true;
        } catch (FileNotFoundException unused) {
            z = false;
            int i3 = f9387m + 121;
            f9386k = i3 % 128;
            int i4 = i3 % 2;
            return z;
        } catch (Exception e) {
            C2810ax.m10991b(e.getMessage());
            e.getStackTrace();
            z = false;
            int i32 = f9387m + 121;
            f9386k = i32 % 128;
            int i42 = i32 % 2;
            return z;
        }
        int i322 = f9387m + 121;
        f9386k = i322 % 128;
        int i422 = i322 % 2;
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m11688k(Context context) {
        boolean z;
        int i = f9387m + 69;
        f9386k = i % 128;
        if (i % 2 == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            try {
                m11680d(context.getCacheDir());
            } catch (Exception e) {
                C2810ax.m10991b(e.getMessage());
            }
        } else {
            m11680d(context.getCacheDir());
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11691n(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 1
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = 116 - r8
            byte[] r0 = $$a
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r4 = r8
            r3 = r2
            r8 = r7
            r7 = r6
            goto L_0x0030
        L_0x0018:
            r3 = r2
        L_0x0019:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L_0x0026
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x0026:
            int r7 = r7 + 1
            int r3 = r3 + 1
            byte r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x0030:
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2863bw.m11691n(byte, byte, int, java.lang.Object[]):void");
    }

    /* renamed from: o */
    private static void m11692o(Context context) {
        char c;
        char c2;
        byte[] d = C2843bh.m11412d(new File(context.getCacheDir(), m11681e()), m11674a());
        JSONObject jSONObject = new JSONObject(new String(d, 0, d.length, StandardCharsets.UTF_8));
        f9384i.clear();
        Object[] objArr = new Object[1];
        m11689l(View.MeasureSpec.getMode(0), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 3 - (ViewConfiguration.getScrollFriction() > Utils.FLOAT_EPSILON ? 1 : (ViewConfiguration.getScrollFriction() == Utils.FLOAT_EPSILON ? 0 : -1)), objArr);
        JSONArray optJSONArray = jSONObject.optJSONArray(((String) objArr[0]).intern());
        if (optJSONArray != null) {
            c = '1';
        } else {
            c = '/';
        }
        if (c == '1') {
            int i = f9386k + 45;
            f9387m = i % 128;
            int i2 = i % 2;
            int i3 = 0;
            while (true) {
                if (i3 < optJSONArray.length()) {
                    c2 = 'M';
                } else {
                    c2 = 'G';
                }
                if (c2 != 'M') {
                    break;
                }
                f9384i.add(Long.valueOf(optJSONArray.getLong(i3)));
                i3++;
            }
            Collections.sort(f9384i);
        }
        Object[] objArr2 = new Object[1];
        m11689l(Color.rgb(0, 0, 0) + 16777218, (char) ExpandableListView.getPackedPositionType(0), (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 1, objArr2);
        f9382g = jSONObject.optLong(((String) objArr2[0]).intern(), 0);
        Object[] objArr3 = new Object[1];
        m11689l(4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 16589), 2 - View.combineMeasuredStates(0, 0), objArr3);
        f9385j = jSONObject.optBoolean(((String) objArr3[0]).intern(), false);
        int i4 = f9387m + 75;
        f9386k = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: b */
    static void m11676b(Context context) {
        int i = f9387m + 23;
        f9386k = i % 128;
        if (i % 2 == 0) {
            throw null;
        } else if (!f9380e) {
            f9384i = new LinkedList<>();
            f9382g = 0;
            f9385j = false;
            f9377b = context.getPackageName();
            f9378c = Settings.Secure.getString(context.getContentResolver(), "android_id");
            f9379d = m11687j(context);
            f9380e = true;
            int i2 = f9387m + 21;
            f9386k = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    /* renamed from: l */
    private static void m11689l(int i, char c, int i2, Object[] objArr) {
        Class<Object> cls;
        Throwable cause;
        int i3 = i2;
        C3170gl glVar = new C3170gl();
        long[] jArr = new long[i3];
        glVar.f10462e = 0;
        int i4 = $10 + 17;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            int i6 = glVar.f10462e;
            cls = Object.class;
            if (!(i6 < i3)) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(f9383h[i + i6])};
                Map<Integer, Object> map = C2854bp.f9335p;
                Object obj = map.get(-862652166);
                if (obj == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) b;
                    Object[] objArr3 = new Object[1];
                    m11691n(b, b2, (byte) (b2 | 9), objArr3);
                    obj = ((Class) C2854bp.m11559b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 25755), (ViewConfiguration.getPressedStateDuration() >> 16) + 806, 32 - (TypedValue.complexToFloat(0) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFloat(0) == Utils.FLOAT_EPSILON ? 0 : -1)))).getMethod((String) objArr3[0], new Class[]{Integer.TYPE});
                    map.put(-862652166, obj);
                }
                long longValue = ((Long) ((Method) obj).invoke((Object) null, objArr2)).longValue();
                long j = (long) glVar.f10462e;
                long j2 = f9381f;
                try {
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(c);
                    objArr4[2] = Long.valueOf(j2);
                    objArr4[1] = Long.valueOf(j);
                    objArr4[0] = Long.valueOf(longValue);
                    Object obj2 = map.get(636543849);
                    if (obj2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) b3;
                        Object[] objArr5 = new Object[1];
                        m11691n(b3, b4, (byte) (b4 + 2), objArr5);
                        Class cls2 = Long.TYPE;
                        obj2 = ((Class) C2854bp.m11559b((char) (TextUtils.indexOf("", '0', 0, 0) + 63564), 1193 - (ViewConfiguration.getLongPressTimeout() >> 16), 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod((String) objArr5[0], new Class[]{cls2, cls2, cls2, Integer.TYPE});
                        map.put(636543849, obj2);
                    }
                    jArr[i6] = ((Long) ((Method) obj2).invoke((Object) null, objArr4)).longValue();
                    try {
                        Object[] objArr6 = new Object[2];
                        objArr6[1] = glVar;
                        objArr6[0] = glVar;
                        Object obj3 = map.get(1311658762);
                        if (obj3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) b5;
                            Object[] objArr7 = new Object[1];
                            m11691n(b5, b6, (byte) b6, objArr7);
                            obj3 = ((Class) C2854bp.m11559b((char) (View.MeasureSpec.getMode(0) + 2499), (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 1112, (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 25)).getMethod((String) objArr7[0], new Class[]{cls, cls});
                            map.put(1311658762, obj3);
                        }
                        ((Method) obj3).invoke((Object) null, objArr6);
                        int i7 = $11 + 73;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                    } catch (Throwable th) {
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } finally {
                    cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                }
            } finally {
                Throwable cause2 = th.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
            }
        }
        char[] cArr = new char[i3];
        glVar.f10462e = 0;
        while (true) {
            int i9 = glVar.f10462e;
            if (!(i9 < i3)) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i9] = (char) ((int) jArr[i9]);
            try {
                Object[] objArr8 = new Object[2];
                objArr8[1] = glVar;
                objArr8[0] = glVar;
                Map<Integer, Object> map2 = C2854bp.f9335p;
                Object obj4 = map2.get(1311658762);
                if (obj4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) b7;
                    Object[] objArr9 = new Object[1];
                    m11691n(b7, b8, (byte) b8, objArr9);
                    obj4 = ((Class) C2854bp.m11559b((char) ((SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) + 2498), 1113 - View.getDefaultSize(0, 0), TextUtils.indexOf("", '0', 0, 0) + 25)).getMethod((String) objArr9[0], new Class[]{cls, cls});
                    map2.put(1311658762, obj4);
                }
                ((Method) obj4).invoke((Object) null, objArr8);
            } catch (Throwable th2) {
                Throwable cause3 = th2.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th2;
            }
        }
    }

    /* renamed from: e */
    private static String m11681e() {
        StringBuilder sb = new StringBuilder();
        sb.append(f9377b);
        sb.append(f9378c);
        Object[] objArr = new Object[1];
        m11689l((ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 7, (char) ((SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 41619), 22 - (ViewConfiguration.getScrollFriction() > Utils.FLOAT_EPSILON ? 1 : (ViewConfiguration.getScrollFriction() == Utils.FLOAT_EPSILON ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        String d = C2844bi.m11419d(sb.toString());
        int i = f9386k + 31;
        f9387m = i % 128;
        int i2 = i % 2;
        return d;
    }

    /* renamed from: d */
    private static void m11680d(File file) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<Long> it = f9384i.iterator();
        int i = f9387m + 7;
        f9386k = i % 128;
        int i2 = i % 2;
        while (true) {
            if (!(!it.hasNext())) {
                int i3 = f9386k + 45;
                f9387m = i3 % 128;
                int i4 = i3 % 2;
                jSONArray.put(it.next().longValue());
            } else {
                Object[] objArr = new Object[1];
                m11689l(1 - (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2, objArr);
                jSONObject.put(((String) objArr[0]).intern(), jSONArray);
                Object[] objArr2 = new Object[1];
                m11689l(2 - View.combineMeasuredStates(0, 0), (char) (TextUtils.indexOf("", '0') + 1), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2, objArr2);
                jSONObject.put(((String) objArr2[0]).intern(), f9382g);
                Object[] objArr3 = new Object[1];
                m11689l((CdmaCellLocation.convertQuartSecToDecDegrees(0) > Utils.DOUBLE_EPSILON ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == Utils.DOUBLE_EPSILON ? 0 : -1)) + 4, (char) ((SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 16589), 2 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
                jSONObject.put(((String) objArr3[0]).intern(), f9385j);
                Object[] objArr4 = new Object[1];
                m11689l(6 - (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), 1 - ExpandableListView.getPackedPositionType(0), objArr4);
                jSONObject.put(((String) objArr4[0]).intern(), C2810ax.m11000e(16, 128));
                C2843bh.m11406a(new File(file, m11681e()), m11674a(), jSONObject.toString().getBytes(StandardCharsets.UTF_8));
                return;
            }
        }
    }

    /* renamed from: a */
    private static byte[] m11674a() {
        StringBuilder sb = new StringBuilder();
        sb.append(f9377b);
        sb.append(f9378c);
        boolean z = false;
        Object[] objArr = new Object[1];
        m11689l(28 - (TypedValue.complexToFloat(0) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFloat(0) == Utils.FLOAT_EPSILON ? 0 : -1)), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 877), (Process.myPid() >> 22) + 11, objArr);
        sb.append(((String) objArr[0]).intern());
        byte[] b = C2844bi.m11417b(sb.toString());
        int i = f9387m + 19;
        f9386k = i % 128;
        if (i % 2 == 0) {
            z = true;
        }
        if (!z) {
            return b;
        }
        throw null;
    }

    /* renamed from: b */
    static void m11677b(Context context, int i) {
        int i2 = f9386k + 109;
        f9387m = i2 % 128;
        if ((i2 % 2 != 0 ? '\'' : ',') != '\'') {
            if ((!f9379d ? 31 : '?') == 31 && i > 0) {
                long time = new Date().getTime();
                int i3 = 0;
                while (i3 < i) {
                    int i4 = f9386k + 69;
                    f9387m = i4 % 128;
                    if (i4 % 2 != 0) {
                        f9384i.add(Long.valueOf(time));
                        i3 += 32;
                    } else {
                        f9384i.add(Long.valueOf(time));
                        i3++;
                    }
                }
                m11683f(context);
                int i5 = f9387m + 45;
                f9386k = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            return;
        }
        throw null;
    }
}
