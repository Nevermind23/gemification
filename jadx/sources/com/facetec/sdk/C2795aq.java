package com.facetec.sdk;

import android.content.Context;
import android.graphics.Color;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.github.mikephil.charting.utils.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facetec.sdk.aq */
final class C2795aq {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: a */
    private static String f8953a = "";

    /* renamed from: b */
    private static boolean f8954b = false;

    /* renamed from: c */
    private static String f8955c = "";

    /* renamed from: d */
    private static HashMap<String, Integer> f8956d;

    /* renamed from: e */
    private static char[] f8957e;

    /* renamed from: f */
    private static char f8958f;

    /* renamed from: h */
    private static int f8959h = 1;

    /* renamed from: i */
    private static int f8960i;

    /* renamed from: com.facetec.sdk.aq$1 */
    static /* synthetic */ class C27961 {

        /* renamed from: a */
        static final /* synthetic */ int[] f8961a;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facetec.sdk.FaceTecSessionStatus[] r0 = com.facetec.sdk.FaceTecSessionStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8961a = r0
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.NON_PRODUCTION_MODE_KEY_INVALID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8961a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.NON_PRODUCTION_MODE_NETWORK_REQUIRED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8961a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8961a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED_VIA_HARDWARE_BUTTON     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8961a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8961a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.SESSION_UNSUCCESSFUL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8961a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.CAMERA_PERMISSION_DENIED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8961a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.ENCRYPTION_KEY_INVALID     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8961a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.TIMEOUT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f8961a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.CONTEXT_SWITCH     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f8961a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f8961a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f8961a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f8961a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.REVERSE_PORTRAIT_NOT_ALLOWED     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f8961a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.LOCKED_OUT     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f8961a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.facetec.sdk.FaceTecSessionStatus r1 = com.facetec.sdk.FaceTecSessionStatus.MISSING_GUIDANCE_IMAGES     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2795aq.C27961.<clinit>():void");
        }
    }

    static {
        init$0();
        f8960i = 0;
        m10868d();
        int i = f8959h + 21;
        f8960i = i % 128;
        int i2 = i % 2;
    }

    C2795aq() {
    }

    /* renamed from: a */
    static int m10861a(Context context) {
        boolean z;
        int i = f8960i + 95;
        f8959h = i % 128;
        int i2 = i % 2;
        if (!f8956d.containsKey("FC")) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            m10869d(context);
            int i3 = f8960i + 37;
            f8959h = i3 % 128;
            int i4 = i3 % 2;
        }
        return f8956d.get("FC").intValue();
    }

    /* renamed from: b */
    static void m10864b(FaceTecSessionStatus faceTecSessionStatus, Context context) {
        int i = f8959h + 111;
        f8960i = i % 128;
        int i2 = i % 2;
        if (f8954b) {
            String b = m10862b(faceTecSessionStatus);
            if ((f8956d.get(b) == null ? '%' : 18) != 18) {
                int i3 = f8960i + 123;
                f8959h = i3 % 128;
                int i4 = i3 % 2;
                f8956d.put(b, 0);
            } else {
                HashMap<String, Integer> hashMap = f8956d;
                hashMap.put(b, Integer.valueOf(hashMap.get(b).intValue() + 1));
            }
            m10863b(context);
        }
    }

    /* renamed from: c */
    static void m10867c(Context context) {
        int i = f8960i;
        int i2 = i + 1;
        f8959h = i2 % 128;
        if (!(i2 % 2 != 0)) {
            throw null;
        } else if (f8954b) {
            int i3 = i + 113;
            f8959h = i3 % 128;
            int i4 = i3 % 2;
        } else {
            f8956d = new HashMap<>();
            FaceTecSessionStatus[] values = FaceTecSessionStatus.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if ((i5 < length ? '&' : '6') != '6') {
                    f8956d.put(m10862b(values[i5]), 0);
                    i5++;
                } else {
                    f8956d.put("FC", 1);
                    f8955c = context.getPackageName();
                    f8953a = Settings.Secure.getString(context.getContentResolver(), "android_id");
                    m10871e(context);
                    f8954b = true;
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    static void m10868d() {
        f8958f = 9125;
        f8957e = new char[]{5708};
    }

    /* renamed from: e */
    private static void m10871e(Context context) {
        int i = f8960i + 109;
        f8959h = i % 128;
        int i2 = i % 2;
        try {
            m10875h(context);
            int i3 = f8960i + 13;
            f8959h = i3 % 128;
            if ((i3 % 2 == 0 ? 26 : '/') != '/') {
                int i4 = 15 / 0;
            }
        } catch (FileNotFoundException unused) {
        } catch (Exception e) {
            C2810ax.m10991b(e.getMessage());
            e.getStackTrace();
        }
    }

    /* renamed from: g */
    private static void m10874g(String str, int i, byte b, Object[] objArr) {
        Object obj;
        int i2;
        char c;
        boolean z;
        int i3;
        Throwable cause;
        boolean z2;
        int i4 = i;
        if (str != null) {
            int i5 = $10 + 35;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            obj = str.toCharArray();
        } else {
            obj = str;
        }
        char[] cArr = (char[]) obj;
        C3166gh ghVar = new C3166gh();
        char[] cArr2 = f8957e;
        float f = Utils.FLOAT_EPSILON;
        int i7 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = $10 + 51;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i12 = 0;
            while (i12 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i12])};
                    Map<Integer, Object> map = C2854bp.f9335p;
                    Object obj2 = map.get(-563486590);
                    if (obj2 == null) {
                        obj2 = ((Class) C2854bp.m11559b((char) ((TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 6874), KeyEvent.getDeadChar(0, 0) + 1860, 24 - TextUtils.indexOf("", "", 0, 0))).getMethod("d", new Class[]{Integer.TYPE});
                        map.put(-563486590, obj2);
                    }
                    cArr3[i12] = ((Character) ((Method) obj2).invoke((Object) null, objArr2)).charValue();
                    i12++;
                    f = Utils.FLOAT_EPSILON;
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
            Object[] objArr3 = {Integer.valueOf(f8958f)};
            Map<Integer, Object> map2 = C2854bp.f9335p;
            Object obj3 = map2.get(-563486590);
            if (obj3 == null) {
                obj3 = ((Class) C2854bp.m11559b((char) (6874 - Gravity.getAbsoluteGravity(0, 0)), TextUtils.indexOf("", "", 0) + 1860, 24 - TextUtils.indexOf("", ""))).getMethod("d", new Class[]{Integer.TYPE});
                map2.put(-563486590, obj3);
            }
            char charValue = ((Character) ((Method) obj3).invoke((Object) null, objArr3)).charValue();
            char[] cArr4 = new char[i4];
            if (i4 % 2 != 0) {
                i2 = i4 - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
                int i13 = $10 + 35;
                $11 = i13 % 128;
                int i14 = i13 % 2;
            } else {
                i2 = i4;
            }
            if (i2 > 1) {
                c = '&';
            } else {
                c = 'a';
            }
            if (c != 'a') {
                int i15 = $11 + 79;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                ghVar.f10448c = 0;
                while (true) {
                    int i17 = ghVar.f10448c;
                    if (i17 < i2) {
                        i3 = i7;
                    } else {
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        break;
                    }
                    char c2 = cArr[i17];
                    ghVar.f10449d = c2;
                    char c3 = cArr[i17 + 1];
                    ghVar.f10447b = c3;
                    if (c2 == c3) {
                        cArr4[i17] = (char) (c2 - b);
                        cArr4[i17 + 1] = (char) (c3 - b);
                    } else {
                        try {
                            Object[] objArr4 = new Object[13];
                            objArr4[12] = ghVar;
                            objArr4[11] = Integer.valueOf(charValue);
                            objArr4[10] = ghVar;
                            objArr4[9] = ghVar;
                            objArr4[8] = Integer.valueOf(charValue);
                            objArr4[7] = ghVar;
                            objArr4[6] = ghVar;
                            objArr4[5] = Integer.valueOf(charValue);
                            objArr4[4] = ghVar;
                            objArr4[3] = ghVar;
                            objArr4[2] = Integer.valueOf(charValue);
                            objArr4[1] = ghVar;
                            objArr4[i7] = ghVar;
                            Map<Integer, Object> map3 = C2854bp.f9335p;
                            Object obj4 = map3.get(-1127895707);
                            Class<Object> cls = Object.class;
                            if (obj4 == null) {
                                Class[] clsArr = new Class[13];
                                clsArr[i7] = cls;
                                clsArr[1] = cls;
                                Class cls2 = Integer.TYPE;
                                clsArr[2] = cls2;
                                clsArr[3] = cls;
                                clsArr[4] = cls;
                                clsArr[5] = cls2;
                                clsArr[6] = cls;
                                clsArr[7] = cls;
                                clsArr[8] = cls2;
                                clsArr[9] = cls;
                                clsArr[10] = cls;
                                clsArr[11] = cls2;
                                clsArr[12] = cls;
                                obj4 = ((Class) C2854bp.m11559b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 27868), TextUtils.getTrimmedLength("") + 123, (ViewConfiguration.getScrollFriction() > Utils.FLOAT_EPSILON ? 1 : (ViewConfiguration.getScrollFriction() == Utils.FLOAT_EPSILON ? 0 : -1)) + 23)).getMethod("c", clsArr);
                                map3.put(-1127895707, obj4);
                            }
                            int intValue = ((Integer) ((Method) obj4).invoke((Object) null, objArr4)).intValue();
                            int i18 = ghVar.f10451f;
                            if (intValue == i18) {
                                int i19 = $11 + 101;
                                $10 = i19 % 128;
                                int i22 = i19 % 2;
                                try {
                                    Object[] objArr5 = new Object[11];
                                    objArr5[10] = ghVar;
                                    objArr5[9] = Integer.valueOf(charValue);
                                    objArr5[8] = ghVar;
                                    objArr5[7] = Integer.valueOf(charValue);
                                    objArr5[6] = Integer.valueOf(charValue);
                                    objArr5[5] = ghVar;
                                    objArr5[4] = ghVar;
                                    objArr5[3] = Integer.valueOf(charValue);
                                    objArr5[2] = Integer.valueOf(charValue);
                                    objArr5[1] = ghVar;
                                    objArr5[i7] = ghVar;
                                    Object obj5 = map3.get(-190269654);
                                    if (obj5 == null) {
                                        byte b2 = (byte) i7;
                                        byte b3 = (byte) b2;
                                        Object[] objArr6 = new Object[1];
                                        m10877k(b2, b3, (byte) b3, objArr6);
                                        Class cls3 = Integer.TYPE;
                                        obj5 = ((Class) C2854bp.m11559b((char) (34365 - (ViewConfiguration.getTouchSlop() >> 8)), 640 - (TypedValue.complexToFraction(i7, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFraction(i7, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)), 23 - Color.red(i7))).getMethod((String) objArr6[0], new Class[]{cls, cls, cls3, cls3, cls, cls, cls3, cls3, cls, cls3, cls});
                                        map3.put(-190269654, obj5);
                                    }
                                    int intValue2 = ((Integer) ((Method) obj5).invoke((Object) null, objArr5)).intValue();
                                    int i23 = (ghVar.f10450e * charValue) + ghVar.f10451f;
                                    int i24 = ghVar.f10448c;
                                    cArr4[i24] = cArr2[intValue2];
                                    cArr4[i24 + 1] = cArr2[i23];
                                } catch (Throwable th2) {
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th2;
                                }
                            } else {
                                int i25 = ghVar.f10446a;
                                int i26 = ghVar.f10450e;
                                if (i25 == i26) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    int i27 = (i25 * charValue) + i18;
                                    int i28 = (i26 * charValue) + ghVar.f10452i;
                                    int i29 = ghVar.f10448c;
                                    cArr4[i29] = cArr2[i27];
                                    cArr4[i29 + 1] = cArr2[i28];
                                } else {
                                    int i32 = $11 + 39;
                                    $10 = i32 % 128;
                                    int i33 = i32 % 2;
                                    int i34 = ((ghVar.f10452i + charValue) - 1) % charValue;
                                    ghVar.f10452i = i34;
                                    int i35 = ((i18 + charValue) - 1) % charValue;
                                    ghVar.f10451f = i35;
                                    int i36 = (i26 * charValue) + i35;
                                    int i37 = ghVar.f10448c;
                                    cArr4[i37] = cArr2[(i25 * charValue) + i34];
                                    cArr4[i37 + 1] = cArr2[i36];
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
                    i7 = 0;
                }
            }
            int i38 = 0;
            while (true) {
                if (i38 < i4) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    objArr[0] = new String(cArr4);
                    return;
                } else {
                    cArr4[i38] = (char) (cArr4[i38] ^ 13722);
                    i38++;
                }
            }
        } finally {
            Throwable cause3 = th.getCause();
            if (cause3 != null) {
                throw cause3;
            }
        }
    }

    /* renamed from: h */
    private static void m10875h(Context context) {
        char c;
        boolean z;
        byte[] d = C2843bh.m11412d(new File(context.getCacheDir(), m10870e()), m10865b());
        JSONObject jSONObject = new JSONObject(new String(d, 0, d.length, StandardCharsets.UTF_8));
        f8956d.clear();
        JSONObject optJSONObject = jSONObject.optJSONObject("history");
        if (optJSONObject != null) {
            c = 19;
        } else {
            c = '[';
        }
        if (c != '[') {
            int i = f8960i + 87;
            f8959h = i % 128;
            if (i % 2 != 0) {
                Iterator<String> keys = optJSONObject.keys();
                while (true) {
                    if (keys.hasNext()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i2 = f8959h + 67;
                        f8960i = i2 % 128;
                        int i3 = i2 % 2;
                        String next = keys.next();
                        f8956d.put(next, Integer.valueOf(optJSONObject.optInt(next)));
                    } else {
                        return;
                    }
                }
            } else {
                optJSONObject.keys();
                throw null;
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{54, 86, 54, -63};
        $$b = 205;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m10876j(Context context) {
        char c;
        int i = f8960i + 35;
        f8959h = i % 128;
        int i2 = i % 2;
        try {
            m10872e(context.getCacheDir());
            int i3 = f8959h + 89;
            f8960i = i3 % 128;
            if (i3 % 2 != 0) {
                c = '9';
            } else {
                c = 31;
            }
            if (c == '9') {
                int i4 = 5 / 0;
            }
        } catch (Exception e) {
            C2810ax.m10991b(e.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10877k(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = $$a
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = r8 * 2
            int r8 = r8 + 98
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0019
            r3 = r8
            r4 = r2
            r8 = r7
            goto L_0x002e
        L_0x0019:
            r3 = r2
        L_0x001a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L_0x0029
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x0029:
            byte r3 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x002e:
            int r3 = -r3
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2795aq.m10877k(byte, byte, int, java.lang.Object[]):void");
    }

    /* renamed from: d */
    static void m10869d(Context context) {
        if (f8954b) {
            if (f8956d.get("FC") != null) {
                HashMap<String, Integer> hashMap = f8956d;
                hashMap.put("FC", Integer.valueOf(hashMap.get("FC").intValue() + 1));
                int i = f8959h + 39;
                f8960i = i % 128;
                int i2 = i % 2;
            } else {
                int i3 = f8960i + 55;
                f8959h = i3 % 128;
                if (i3 % 2 != 0) {
                }
                f8956d.put("FC", 1);
            }
            m10863b(context);
        }
    }

    /* renamed from: e */
    private static void m10872e(File file) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("history", new JSONObject(f8956d));
        boolean z = false;
        Object[] objArr = new Object[1];
        m10874g("㘘", View.getDefaultSize(0, 0) + 1, (byte) (47 - TextUtils.indexOf("", '0')), objArr);
        jSONObject.put(((String) objArr[0]).intern(), C2810ax.m11000e(16, 128));
        C2843bh.m11406a(new File(file, m10870e()), m10865b(), jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        int i = f8959h + 49;
        f8960i = i % 128;
        if (i % 2 != 0) {
            z = true;
        }
        if (z) {
            throw null;
        }
    }

    /* renamed from: b */
    private static void m10863b(Context context) {
        int i = f8959h + 1;
        int i2 = i % 128;
        f8960i = i2;
        int i3 = i % 2;
        if (context == null) {
            int i4 = i2 + 53;
            f8959h = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        C2920cv.m12196e(new C2818b1(context));
    }

    /* renamed from: b */
    private static byte[] m10865b() {
        StringBuilder sb = new StringBuilder();
        sb.append(f8955c);
        sb.append(f8953a);
        sb.append("history_key");
        byte[] b = C2844bi.m11417b(sb.toString());
        int i = f8960i + 63;
        f8959h = i % 128;
        if ((i % 2 == 0 ? 'C' : 21) != 'C') {
            return b;
        }
        throw null;
    }

    /* renamed from: b */
    private static String m10862b(FaceTecSessionStatus faceTecSessionStatus) {
        switch (C27961.f8961a[faceTecSessionStatus.ordinal()]) {
            case 1:
                return "LI";
            case 2:
                return "DM";
            case 3:
                return "UC";
            case 4:
                return "CH";
            case 5:
                return "PS";
            case 6:
                return "NP";
            case 7:
                int i = f8959h + 69;
                f8960i = i % 128;
                int i2 = i % 2;
                return "CD";
            case 8:
                return "EI";
            case 9:
                return "TO";
            case 10:
                int i3 = f8959h + 117;
                f8960i = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 9 / 0;
                }
                return "CS";
            case 11:
                return "CE";
            case 12:
                return "IE";
            case 13:
                return "LA";
            case 14:
                return "RP";
            case 15:
                return "UL";
            case 16:
                return "GI";
            default:
                return "NA";
        }
    }

    /* renamed from: e */
    private static String m10870e() {
        StringBuilder sb = new StringBuilder();
        sb.append(f8955c);
        sb.append(f8953a);
        sb.append("history_file_internal");
        String d = C2844bi.m11419d(sb.toString());
        int i = f8960i + 1;
        f8959h = i % 128;
        int i2 = i % 2;
        return d;
    }

    /* renamed from: c */
    static String m10866c() {
        int i = f8959h + 21;
        f8960i = i % 128;
        if (i % 2 != 0 ? false : true) {
            return f8956d.toString();
        }
        f8956d.toString();
        throw null;
    }
}
