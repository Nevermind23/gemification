package com.facetec.sdk;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import com.facetec.sdk.C3147g;
import com.facetec.sdk.C3262js;
import com.github.mikephil.charting.utils.Utils;
import com.guardsquare.dexguard.annotation.EncryptStrings;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

@EncryptStrings
/* renamed from: com.facetec.sdk.al */
class C2785al {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: a */
    private static final Semaphore f8863a = new Semaphore(1);

    /* renamed from: b */
    private static /* synthetic */ boolean f8864b = true;

    /* renamed from: c */
    private static char f8865c;

    /* renamed from: d */
    private static volatile boolean f8866d = false;

    /* renamed from: e */
    private static char[] f8867e;

    /* renamed from: f */
    private static int f8868f = 0;

    /* renamed from: g */
    private static char[] f8869g;

    /* renamed from: h */
    private static long f8870h;

    /* renamed from: i */
    private static int f8871i;

    /* renamed from: com.facetec.sdk.al$4 */
    static /* synthetic */ class C27874 {

        /* renamed from: b */
        static final /* synthetic */ int[] f8879b;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facetec.sdk.ap[] r0 = com.facetec.sdk.C2794ap.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8879b = r0
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_ENROLL_SESSION_START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_MID_ENROLL_SESSION_GLASSES_SUCCESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_ENROLL_SESSION_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_ENROLL_SESSION_FAIL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_ENROLL_SESSION_CANCEL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_VERIFY_SESSION_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_VERIFY_SESSION_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_VERIFY_SESSION_FAIL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_VERIFY_SESSION_CANCEL     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_AUTH_SESSION_START     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_AUTH_SESSION_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_AUTH_SESSION_FAIL     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_AUTH_SESSION_CANCEL     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_DIAGNOSTIC_UPLOAD_FAIL     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_FACESCAN_SESSION_SUCCESS     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_PHOENIX_SESSION_FAIL     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f8879b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.facetec.sdk.ap r1 = com.facetec.sdk.C2794ap.FT_EVENT_FACESCAN_SESSION_FAIL     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2785al.C27874.<clinit>():void");
        }
    }

    /* renamed from: com.facetec.sdk.al$a */
    static class C2789a {
        @C3011em(mo9197c = "diagnosticSessionId")

        /* renamed from: a */
        private String f8880a;
        @C3011em(mo9197c = "time")

        /* renamed from: b */
        private long f8881b;
        @C3011em(mo9197c = "event")

        /* renamed from: d */
        private String f8882d;
        @C3011em(mo9197c = "diagnosticId")

        /* renamed from: e */
        private String f8883e;

        C2789a(String str, long j, String str2, String str3) {
            this.f8882d = str;
            this.f8881b = j;
            this.f8880a = str2;
            this.f8883e = str3;
        }
    }

    static {
        init$0();
        f8871i = 1;
        m10831b();
        int i = f8868f + 111;
        f8871i = i % 128;
        int i2 = i % 2;
    }

    C2785al() {
    }

    /* renamed from: b */
    static void m10831b() {
        f8865c = 9122;
        f8867e = new char[]{5641, 5710, 5724, 5717, 5752, 5747, 5723, 5648, 5713, 5662, 5708, 5727, 5646, 5712, 5647, 5706, 5707, 5711, 5722, 5709, 5714, 5638, 5719, 5704, 5725, 5720, 5744, 5700, 5636, 5716, 5757, 5649, 5718, 5756, 5715, 5729};
        f8869g = new char[]{8222, 31795, 38914, 13423, 20567, 60653, 2188, 42216, 49352, 7485, 47378, 54577, 28992, 36280, 10652, 17899, 57822, 15825, 8244, 8232, 8250, 8249, 11898, 25573, 59229, 8225, 8245, 31780, 8255, 31788, 38918, 13414, 20557, 60578, 2204, 42237, 49346, 7478, 47396, 54644, 28992, 36270, 10646, 17910, 57813, 15852, 23075, 40081, 49282, 9384, 35016, 60643, 20492, 46130, 6227, 31852, 41368, 1424, 27099};
        f8870h = 452453556945124421L;
    }

    /* renamed from: c */
    static /* synthetic */ boolean m10838c() {
        int i = f8868f + 29;
        f8871i = i % 128;
        if ((i % 2 == 0 ? 27 : '<') != 27) {
            boolean z = f8866d;
            int i2 = f8871i + 75;
            f8868f = i2 % 128;
            int i3 = i2 % 2;
            return z;
        }
        throw null;
    }

    /* renamed from: d */
    static /* synthetic */ void m10840d(Context context, String str, long j, String str2, String str3) {
        int i = f8868f + 61;
        f8871i = i % 128;
        boolean z = i % 2 != 0;
        m10828a(context, str, j, str2, str3);
        if (!z) {
            int i2 = 39 / 0;
        }
        int i3 = f8868f + 111;
        f8871i = i3 % 128;
        int i4 = i3 % 2;
    }

    static void init$0() {
        $$a = new byte[]{15, -107, -115, -61};
        $$b = 40;
    }

    /* renamed from: j */
    private static void m10844j(String str, int i, byte b, Object[] objArr) {
        Object obj;
        int i2;
        char c;
        char c2;
        int i3;
        char c3;
        Throwable cause;
        char c4;
        int i4;
        int i5 = i;
        if (str != null) {
            obj = str.toCharArray();
        } else {
            obj = str;
        }
        char[] cArr = (char[]) obj;
        C3166gh ghVar = new C3166gh();
        char[] cArr2 = f8867e;
        int i6 = 13;
        int i7 = -563486590;
        int i8 = 2;
        int i9 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i12 = $10 + 97;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 0;
            while (i14 < length) {
                int i15 = $10 + i6;
                $11 = i15 % 128;
                if (i15 % i8 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i14])};
                        Map<Integer, Object> map = C2854bp.f9335p;
                        Object obj2 = map.get(Integer.valueOf(i7));
                        if (obj2 == null) {
                            obj2 = ((Class) C2854bp.m11559b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 6874), (ViewConfiguration.getTouchSlop() >> 8) + 1860, (ViewConfiguration.getPressedStateDuration() >> 16) + 24)).getMethod("d", new Class[]{Integer.TYPE});
                            map.put(-563486590, obj2);
                        }
                        cArr3[i14] = ((Character) ((Method) obj2).invoke((Object) null, objArr2)).charValue();
                        i14 /= 1;
                    } catch (Throwable th) {
                        Throwable cause2 = th.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i14])};
                        Map<Integer, Object> map2 = C2854bp.f9335p;
                        Object obj3 = map2.get(-563486590);
                        if (obj3 == null) {
                            obj3 = ((Class) C2854bp.m11559b((char) (Color.argb(0, 0, 0, 0) + 6874), 1859 - TextUtils.lastIndexOf("", '0', 0), TextUtils.lastIndexOf("", '0') + 25)).getMethod("d", new Class[]{Integer.TYPE});
                            map2.put(-563486590, obj3);
                        }
                        cArr3[i14] = ((Character) ((Method) obj3).invoke((Object) null, objArr3)).charValue();
                        i14++;
                    } catch (Throwable th2) {
                        Throwable cause3 = th2.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th2;
                    }
                }
                i6 = 13;
                i7 = -563486590;
                i8 = 2;
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(f8865c)};
            Map<Integer, Object> map3 = C2854bp.f9335p;
            Object obj4 = map3.get(-563486590);
            char c5 = 6;
            if (obj4 == null) {
                obj4 = ((Class) C2854bp.m11559b((char) (6873 - TextUtils.lastIndexOf("", '0', 0, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 1860, TextUtils.indexOf("", '0', 0, 0) + 25)).getMethod("d", new Class[]{Integer.TYPE});
                map3.put(-563486590, obj4);
            }
            char charValue = ((Character) ((Method) obj4).invoke((Object) null, objArr4)).charValue();
            char[] cArr4 = new char[i5];
            if (i5 % 2 != 0) {
                i2 = i5 - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i5;
            }
            if (i2 > 1) {
                c = 'V';
            } else {
                c = '8';
            }
            if (c == 'V') {
                ghVar.f10448c = 0;
                while (true) {
                    int i16 = ghVar.f10448c;
                    if (i16 >= i2) {
                        break;
                    }
                    char c6 = cArr[i16];
                    ghVar.f10449d = c6;
                    char c7 = cArr[i16 + 1];
                    ghVar.f10447b = c7;
                    if (c6 == c7) {
                        i3 = 1;
                    } else {
                        i3 = i9;
                    }
                    if (i3 != 1) {
                        try {
                            Object[] objArr5 = new Object[13];
                            objArr5[12] = ghVar;
                            objArr5[11] = Integer.valueOf(charValue);
                            objArr5[10] = ghVar;
                            objArr5[9] = ghVar;
                            objArr5[8] = Integer.valueOf(charValue);
                            objArr5[7] = ghVar;
                            objArr5[c5] = ghVar;
                            objArr5[5] = Integer.valueOf(charValue);
                            objArr5[4] = ghVar;
                            objArr5[3] = ghVar;
                            objArr5[2] = Integer.valueOf(charValue);
                            objArr5[1] = ghVar;
                            objArr5[i9] = ghVar;
                            Map<Integer, Object> map4 = C2854bp.f9335p;
                            Object obj5 = map4.get(-1127895707);
                            Class<Object> cls = Object.class;
                            if (obj5 == null) {
                                Class[] clsArr = new Class[13];
                                clsArr[i9] = cls;
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
                                obj5 = ((Class) C2854bp.m11559b((char) (27867 - ImageFormat.getBitsPerPixel(i9)), KeyEvent.getDeadChar(i9, i9) + 123, Drawable.resolveOpacity(i9, i9) + 24)).getMethod("c", clsArr);
                                map4.put(-1127895707, obj5);
                            }
                            int intValue = ((Integer) ((Method) obj5).invoke((Object) null, objArr5)).intValue();
                            int i17 = ghVar.f10451f;
                            if (intValue == i17) {
                                c4 = 'V';
                            } else {
                                c4 = ',';
                            }
                            if (c4 != 'V') {
                                int i18 = ghVar.f10446a;
                                int i19 = ghVar.f10450e;
                                if (i18 == i19) {
                                    i4 = 1;
                                } else {
                                    i4 = i9;
                                }
                                if (i4 != 0) {
                                    int i22 = ((ghVar.f10452i + charValue) - 1) % charValue;
                                    ghVar.f10452i = i22;
                                    int i23 = ((i17 + charValue) - 1) % charValue;
                                    ghVar.f10451f = i23;
                                    int i24 = (i19 * charValue) + i23;
                                    int i25 = ghVar.f10448c;
                                    cArr4[i25] = cArr2[(i18 * charValue) + i22];
                                    cArr4[i25 + 1] = cArr2[i24];
                                } else {
                                    int i26 = (i18 * charValue) + i17;
                                    int i27 = (i19 * charValue) + ghVar.f10452i;
                                    int i28 = ghVar.f10448c;
                                    cArr4[i28] = cArr2[i26];
                                    cArr4[i28 + 1] = cArr2[i27];
                                }
                                c3 = 6;
                            } else {
                                try {
                                    Object[] objArr6 = new Object[11];
                                    objArr6[10] = ghVar;
                                    objArr6[9] = Integer.valueOf(charValue);
                                    objArr6[8] = ghVar;
                                    objArr6[7] = Integer.valueOf(charValue);
                                    objArr6[6] = Integer.valueOf(charValue);
                                    objArr6[5] = ghVar;
                                    objArr6[4] = ghVar;
                                    objArr6[3] = Integer.valueOf(charValue);
                                    objArr6[2] = Integer.valueOf(charValue);
                                    objArr6[1] = ghVar;
                                    objArr6[i9] = ghVar;
                                    Object obj6 = map4.get(-190269654);
                                    if (obj6 != null) {
                                        c3 = 6;
                                    } else {
                                        byte b2 = (byte) i9;
                                        byte b3 = (byte) b2;
                                        Object[] objArr7 = new Object[1];
                                        m10846l(b2, b3, (byte) (b3 | 18), objArr7);
                                        Class cls3 = Integer.TYPE;
                                        c3 = 6;
                                        obj6 = ((Class) C2854bp.m11559b((char) (TextUtils.lastIndexOf("", '0', i9, i9) + 34366), -16776576 - Color.rgb(i9, i9, i9), 'G' - AndroidCharacter.getMirror('0'))).getMethod((String) objArr7[0], new Class[]{cls, cls, cls3, cls3, cls, cls, cls3, cls3, cls, cls3, cls});
                                        map4.put(-190269654, obj6);
                                    }
                                    int intValue2 = ((Integer) ((Method) obj6).invoke((Object) null, objArr6)).intValue();
                                    int i29 = (ghVar.f10450e * charValue) + ghVar.f10451f;
                                    int i32 = ghVar.f10448c;
                                    cArr4[i32] = cArr2[intValue2];
                                    cArr4[i32 + 1] = cArr2[i29];
                                } catch (Throwable th3) {
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th3;
                                }
                            }
                        } finally {
                            cause = th3.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                        }
                    } else {
                        c3 = c5;
                        int i33 = $11 + 73;
                        $10 = i33 % 128;
                        int i34 = i33 % 2;
                        cArr4[i16] = (char) (c6 - b);
                        cArr4[i16 + 1] = (char) (c7 - b);
                    }
                    ghVar.f10448c += 2;
                    c5 = c3;
                    i9 = 0;
                }
            }
            int i35 = 0;
            while (true) {
                if (i35 < i5) {
                    c2 = 'G';
                } else {
                    c2 = 'N';
                }
                if (c2 != 'G') {
                    break;
                }
                cArr4[i35] = (char) (cArr4[i35] ^ 13722);
                i35++;
            }
            String str2 = new String(cArr4);
            int i36 = $11 + 25;
            $10 = i36 % 128;
            if (i36 % 2 == 0) {
                objArr[0] = str2;
                return;
            }
            throw null;
        } finally {
            Throwable cause4 = th.getCause();
            if (cause4 != null) {
                throw cause4;
            }
        }
    }

    /* renamed from: k */
    private static void m10845k(int i, char c, int i2, Object[] objArr) {
        char c2;
        Class<Object> cls;
        Throwable cause;
        int i3 = i2;
        C3170gl glVar = new C3170gl();
        long[] jArr = new long[i3];
        glVar.f10462e = 0;
        while (true) {
            int i4 = glVar.f10462e;
            if (i4 < i3) {
                c2 = ':';
            } else {
                c2 = '#';
            }
            cls = Object.class;
            if (c2 == '#') {
                break;
            }
            int i5 = $10 + 53;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {Integer.valueOf(f8869g[i + i4])};
                Map<Integer, Object> map = C2854bp.f9335p;
                Object obj = map.get(-862652166);
                if (obj == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) b;
                    Object[] objArr3 = new Object[1];
                    m10846l(b, b2, (byte) (b2 | 9), objArr3);
                    obj = ((Class) C2854bp.m11559b((char) (Color.blue(0) + 25755), 806 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 33 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)))).getMethod((String) objArr3[0], new Class[]{Integer.TYPE});
                    map.put(-862652166, obj);
                }
                long longValue = ((Long) ((Method) obj).invoke((Object) null, objArr2)).longValue();
                long j = (long) glVar.f10462e;
                long j2 = f8870h;
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
                        m10846l(b3, b4, (byte) (b4 + 2), objArr5);
                        Class cls2 = Long.TYPE;
                        obj2 = ((Class) C2854bp.m11559b((char) (Color.green(0) + 63563), TextUtils.getOffsetBefore("", 0) + 1193, (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 22)).getMethod((String) objArr5[0], new Class[]{cls2, cls2, cls2, Integer.TYPE});
                        map.put(636543849, obj2);
                    }
                    jArr[i4] = ((Long) ((Method) obj2).invoke((Object) null, objArr4)).longValue();
                    try {
                        Object[] objArr6 = new Object[2];
                        objArr6[1] = glVar;
                        objArr6[0] = glVar;
                        Object obj3 = map.get(1311658762);
                        if (obj3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) b5;
                            Object[] objArr7 = new Object[1];
                            m10846l(b5, b6, (byte) b6, objArr7);
                            obj3 = ((Class) C2854bp.m11559b((char) (2500 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1))), Color.argb(0, 0, 0, 0) + 1113, TextUtils.getTrimmedLength("") + 24)).getMethod((String) objArr7[0], new Class[]{cls, cls});
                            map.put(1311658762, obj3);
                        }
                        ((Method) obj3).invoke((Object) null, objArr6);
                        int i7 = $11 + 65;
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
            if (i9 < i3) {
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
                        m10846l(b7, b8, (byte) b8, objArr9);
                        obj4 = ((Class) C2854bp.m11559b((char) (2499 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), -16776103 - Color.rgb(0, 0, 0), 24 - (TypedValue.complexToFloat(0) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFloat(0) == Utils.FLOAT_EPSILON ? 0 : -1)))).getMethod((String) objArr9[0], new Class[]{cls, cls});
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
            } else {
                objArr[0] = new String(cArr);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10846l(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 1 - r6
            int r8 = 116 - r8
            byte[] r0 = $$a
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            r3 = r8
            r4 = r2
            r8 = r7
            goto L_0x002e
        L_0x0017:
            r3 = r2
        L_0x0018:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L_0x0029
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x0029:
            byte r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x002e:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2785al.m10846l(int, short, byte, java.lang.Object[]):void");
    }

    /* renamed from: a */
    private static void m10828a(Context context, String str, long j, String str2, String str3) {
        m10833b(context, (List<C2789a>) Collections.singletonList(new C2789a(str, j, str2, str3)));
        int i = f8868f + 29;
        f8871i = i % 128;
        if ((i % 2 == 0 ? (char) 15 : 10) == 15) {
            int i2 = 39 / 0;
        }
    }

    /* renamed from: b */
    static void m10832b(Context context, C2794ap apVar, Runnable runnable) {
        String str;
        if (C2840bg.m11368d()) {
            String e = C2862bv.m11672e(m10827a(apVar));
            long time = new Date().getTime();
            if ((apVar.mo8847e() ? 10 : 'I') != 10) {
                str = null;
            } else {
                int i = f8868f + 47;
                f8871i = i % 128;
                if ((i % 2 == 0 ? ',' : 'Y') != ',') {
                    str = C2888cg.f9550b;
                } else {
                    byte[] bArr = C2888cg.f9552d;
                    throw null;
                }
            }
            String str2 = C2888cg.f9551c;
            if (C2840bg.f9200a == null) {
                int i2 = f8868f + 83;
                f8871i = i2 % 128;
                int i3 = i2 % 2;
                m10828a(context, e, time, str2, str);
            }
            C2920cv.m12196e(new C3712z0(context, e, str2, str, true, time, runnable));
            int i4 = f8868f + 29;
            f8871i = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m10836c(Context context, String str, String str2, String str3, boolean z, long j, Runnable runnable) {
        String str4 = str3;
        C3268ju c = C2802au.m10957c(context);
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        m10844j("!\u000e\r\u0003\u0016\u0019㗨㗨\u0007\u0005\u0013\n\u001a\t\n \n\u0011\u000e!\u0006\u0019\n #\u0007\u0004\u0013#\u0013\r \u001a\t\n \u0001\u0019\u0007\u0012\u0014\u0017\u0007\u000e㗨", 45 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) (51 - (Process.myTid() >> 22)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(C2840bg.f9200a);
        String obj = sb.toString();
        C3262js.C3263a aVar = new C3262js.C3263a();
        Object[] objArr2 = new Object[1];
        m10844j("㘧", 1 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 40), objArr2);
        C3262js.C3263a b = aVar.mo9503b(((String) objArr2[0]).intern(), str);
        Object[] objArr3 = new Object[1];
        m10845k(View.getDefaultSize(0, 0) + 28, (char) TextUtils.indexOf("", ""), 20 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)), objArr3);
        b.mo9503b(((String) objArr3[0]).intern(), str2);
        if ((str4 != null ? 'N' : 2) != 2) {
            int i = f8868f + 45;
            f8871i = i % 128;
            int i2 = i % 2;
            Object[] objArr4 = new Object[1];
            m10845k((SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) + 46, (char) (TextUtils.getCapsMode("", 0, 0) + 48302), 11 - ExpandableListView.getPackedPositionChild(0), objArr4);
            b.mo9503b(((String) objArr4[0]).intern(), str4);
        }
        try {
            C3247ji b2 = c.mo9507b(C3147g.m12931b(context, obj).mo9604e((C3297kd) b.mo9504c()).mo9599b());
            final boolean z2 = z;
            final Context context2 = context;
            final String str5 = str;
            final long j2 = j;
            final String str6 = str2;
            final String str7 = str3;
            final Runnable runnable2 = runnable;
            b2.mo9460b(new C3248jj() {
                /* renamed from: a */
                public final void mo8841a(C3295kc kcVar) {
                    if (C2785al.m10838c()) {
                        C2785al.m10839d(context2);
                    }
                }

                /* renamed from: b */
                public final void mo8842b() {
                    if (z2) {
                        C2785al.m10840d(context2, str5, j2, str6, str7);
                    }
                    Runnable runnable = runnable2;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            });
            int i3 = f8868f + 27;
            f8871i = i3 % 128;
            int i4 = i3 % 2;
        } catch (C3147g.C3148e unused) {
            m10828a(context, str, j, str2, str3);
        }
    }

    /* renamed from: d */
    static void m10839d(Context context) {
        int i = f8868f + 11;
        f8871i = i % 128;
        int i2 = i % 2;
        C2920cv.m12196e(new C2755a1(context.getApplicationContext()));
        int i3 = f8871i + 99;
        f8868f = i3 % 128;
        if ((i3 % 2 != 0 ? 31 : 'G') == 31) {
            int i4 = 31 / 0;
        }
    }

    /* renamed from: e */
    static void m10842e(Context context, C2794ap apVar) {
        int i = f8871i + 105;
        f8868f = i % 128;
        int i2 = i % 2;
        m10832b(context, apVar, (Runnable) null);
        int i3 = f8868f + 41;
        f8871i = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 4 : 11) == 4) {
            throw null;
        }
    }

    /* renamed from: a */
    private static String m10826a() {
        int i = f8868f + 119;
        f8871i = i % 128;
        int i2 = i % 2;
        boolean z = false;
        Object[] objArr = new Object[1];
        m10844j("\u001a\t\n  \u0005\r\u001a\u0010\u0000\u0003\u001d\u0019\u001b\u0003\u001b\u0002\u0018\u000f\u0004㘓", 20 - ImageFormat.getBitsPerPixel(0), (byte) ((PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)) + 27), objArr);
        String intern = ((String) objArr[0]).intern();
        int i3 = f8871i + 41;
        f8868f = i3 % 128;
        if (i3 % 2 != 0) {
            z = true;
        }
        if (!z) {
            return intern;
        }
        throw null;
    }

    /* renamed from: e */
    private static void m10843e(Context context, List<C2789a> list) {
        String c = new C2972dv().mo9135c((Object) list);
        C2843bh.m11406a(new File(context.getCacheDir(), m10826a()), m10834b(context), c.getBytes(StandardCharsets.UTF_8));
        int i = f8871i + 1;
        f8868f = i % 128;
        int i2 = i % 2;
    }

    /* renamed from: a */
    private static String m10827a(C2794ap apVar) {
        int i = f8868f + 43;
        f8871i = i % 128;
        if (!(i % 2 == 0)) {
            switch (C27874.f8879b[apVar.ordinal()]) {
                case 1:
                    Object[] objArr = new Object[1];
                    m10844j("㘜", (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)), (byte) (45 - (AudioTrack.getMaxVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMaxVolume() == Utils.FLOAT_EPSILON ? 0 : -1))), objArr);
                    String intern = ((String) objArr[0]).intern();
                    int i2 = f8871i + 11;
                    f8868f = i2 % 128;
                    if ((i2 % 2 != 0 ? '<' : '[') != '<') {
                        return intern;
                    }
                    throw null;
                case 2:
                    Object[] objArr2 = new Object[1];
                    m10844j("㙟", 1 - Color.green(0), (byte) (View.MeasureSpec.getMode(0) + 104), objArr2);
                    return ((String) objArr2[0]).intern();
                case 3:
                    Object[] objArr3 = new Object[1];
                    m10844j("㙇", TextUtils.indexOf("", "", 0) + 1, (byte) (TextUtils.indexOf("", '0', 0) + 84), objArr3);
                    return ((String) objArr3[0]).intern();
                case 4:
                    Object[] objArr4 = new Object[1];
                    m10845k(Color.alpha(0) + 18, (char) ExpandableListView.getPackedPositionGroup(0), -ExpandableListView.getPackedPositionChild(0), objArr4);
                    return ((String) objArr4[0]).intern();
                case 5:
                    Object[] objArr5 = new Object[1];
                    m10844j("㘏", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, (byte) (37 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr5);
                    return ((String) objArr5[0]).intern();
                case 6:
                    Object[] objArr6 = new Object[1];
                    m10845k(Color.argb(0, 0, 0, 0) + 19, (char) TextUtils.getOffsetBefore("", 0), 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr6);
                    return ((String) objArr6[0]).intern();
                case 7:
                    Object[] objArr7 = new Object[1];
                    m10844j("㘫", Color.alpha(0) + 1, (byte) (60 - TextUtils.lastIndexOf("", '0', 0)), objArr7);
                    return ((String) objArr7[0]).intern();
                case 8:
                    Object[] objArr8 = new Object[1];
                    m10844j("㘶", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, (byte) (71 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr8);
                    String intern2 = ((String) objArr8[0]).intern();
                    int i3 = f8871i + 63;
                    f8868f = i3 % 128;
                    int i4 = i3 % 2;
                    return intern2;
                case 9:
                    Object[] objArr9 = new Object[1];
                    m10844j("㘠", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 51), objArr9);
                    return ((String) objArr9[0]).intern();
                case 10:
                    Object[] objArr10 = new Object[1];
                    m10845k(Color.green(0) + 20, (char) (ViewConfiguration.getTapTimeout() >> 16), -(ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), objArr10);
                    return ((String) objArr10[0]).intern();
                case 11:
                    Object[] objArr11 = new Object[1];
                    m10845k(21 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr11);
                    return ((String) objArr11[0]).intern();
                case 12:
                    Object[] objArr12 = new Object[1];
                    m10844j("㘕", (ViewConfiguration.getScrollFriction() > Utils.FLOAT_EPSILON ? 1 : (ViewConfiguration.getScrollFriction() == Utils.FLOAT_EPSILON ? 0 : -1)), (byte) (28 - View.MeasureSpec.getMode(0)), objArr12);
                    return ((String) objArr12[0]).intern();
                case 13:
                    Object[] objArr13 = new Object[1];
                    m10845k((PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)) + 22, (char) (TextUtils.indexOf("", '0') + 3654), -TextUtils.lastIndexOf("", '0', 0), objArr13);
                    return ((String) objArr13[0]).intern();
                case 14:
                    Object[] objArr14 = new Object[1];
                    m10845k(24 - (AudioTrack.getMaxVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMaxVolume() == Utils.FLOAT_EPSILON ? 0 : -1)), (char) (17351 - ((Process.getThreadPriority(0) + 20) >> 6)), 1 - (AudioTrack.getMinVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMinVolume() == Utils.FLOAT_EPSILON ? 0 : -1)), objArr14);
                    return ((String) objArr14[0]).intern();
                case 15:
                    Object[] objArr15 = new Object[1];
                    m10845k(23 - TextUtils.indexOf("", '0'), (char) (TextUtils.getOffsetAfter("", 0) + 51070), -MotionEvent.axisFromString(""), objArr15);
                    return ((String) objArr15[0]).intern();
                case 16:
                    Object[] objArr16 = new Object[1];
                    m10844j("㘯", Color.alpha(0) + 1, (byte) (71 - Drawable.resolveOpacity(0, 0)), objArr16);
                    return ((String) objArr16[0]).intern();
                case 17:
                    Object[] objArr17 = new Object[1];
                    m10845k(25 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (-1 - MotionEvent.axisFromString("")), '1' - AndroidCharacter.getMirror('0'), objArr17);
                    return ((String) objArr17[0]).intern();
                default:
                    if (f8864b) {
                        Object[] objArr18 = new Object[1];
                        m10845k((ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 26, (char) (TypedValue.complexToFloat(0) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFloat(0) == Utils.FLOAT_EPSILON ? 0 : -1)), Color.argb(0, 0, 0, 0) + 2, objArr18);
                        return ((String) objArr18[0]).intern();
                    }
                    throw new AssertionError();
            }
        } else {
            int i5 = C27874.f8879b[apVar.ordinal()];
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m10835c(Context context) {
        List<C2789a> list;
        try {
            Semaphore semaphore = f8863a;
            semaphore.acquire();
            list = m10830b(context, Boolean.TRUE);
            semaphore.release();
        } catch (Exception e) {
            e.printStackTrace();
            f8863a.release();
            list = null;
        } catch (Throwable th) {
            f8863a.release();
            throw th;
        }
        boolean z = true;
        if (!(list == null)) {
            if (!list.isEmpty()) {
                z = true;
            }
            if (z) {
                int i = f8871i + 67;
                f8868f = i % 128;
                int i2 = i % 2;
                m10837c(context, list);
            }
        }
        int i3 = f8871i + 47;
        f8868f = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 12 / 0;
        }
    }

    /* renamed from: b */
    private static void m10833b(Context context, List<C2789a> list) {
        int i = f8868f + 1;
        f8871i = i % 128;
        int i2 = i % 2;
        try {
            Semaphore semaphore = f8863a;
            semaphore.acquire();
            List<C2789a> b = m10830b(context, Boolean.FALSE);
            b.addAll(list);
            m10843e(context, b);
            f8866d = true;
            semaphore.release();
            int i3 = f8868f + 31;
            f8871i = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            e.printStackTrace();
            f8863a.release();
        } catch (Throwable th) {
            f8863a.release();
            throw th;
        }
    }

    /* renamed from: c */
    private static void m10837c(Context context, List<C2789a> list) {
        Object[] objArr = new Object[1];
        m10844j("!\u000e\r\u0003\u0016\u0019㘢㘢\u0007\u0005\u0013\n\u001a\t\n \n\u0011\u000e!\u0006\u0019\n #\u0007\u0004\u0013#\u0013\r \u001a\t\n \u0001\u0019\u0007\u0012\u0014\u0017\u0007\u000e \u0007㙩㙩\u0015\u0017\f\u0007", 51 - TextUtils.indexOf("", '0', 0, 0), (byte) (TextUtils.indexOf("", "") + 109), objArr);
        try {
            C2802au.m10957c(context).mo9507b(C3147g.m12933b(context, ((String) objArr[0]).intern(), (Object) list)).mo9460b(new C3248jj() {
                /* renamed from: a */
                public final void mo8841a(C3295kc kcVar) {
                }

                /* renamed from: b */
                public final void mo8842b() {
                }
            });
            int i = f8868f + 3;
            f8871i = i % 128;
            int i2 = i % 2;
        } catch (C3147g.C3148e e) {
            TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            TextUtils.indexOf("", "", 0, 0);
            e.getMessage();
        }
    }

    /* renamed from: b */
    private static List<C2789a> m10830b(Context context, Boolean bool) {
        File file = new File(context.getCacheDir(), m10826a());
        boolean z = true;
        boolean z2 = false;
        if (file.exists()) {
            C2789a[] aVarArr = (C2789a[]) new C2972dv().mo9137e(new String(C2843bh.m11412d(file, m10834b(context)), StandardCharsets.UTF_8), C2789a[].class);
            if (!bool.booleanValue()) {
                z = false;
            }
            if (z) {
                int i = f8868f + 21;
                f8871i = i % 128;
                int i2 = i % 2;
                file.delete();
                f8866d = false;
            }
            return new ArrayList(Arrays.asList(aVarArr));
        }
        ArrayList arrayList = new ArrayList();
        int i3 = f8871i + 113;
        f8868f = i3 % 128;
        if (i3 % 2 != 0) {
            z2 = true;
        }
        if (!z2) {
            return arrayList;
        }
        throw null;
    }

    /* renamed from: b */
    private static byte[] m10834b(Context context) {
        int i = f8868f + 23;
        f8871i = i % 128;
        int i2 = i % 2;
        byte[] e = C2750a.m10690e(context);
        Object[] objArr = new Object[1];
        m10845k(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (ViewConfiguration.getEdgeSlop() >> 16), (Process.myPid() >> 22) + 18, objArr);
        byte[] e2 = C2844bi.m11422e(e, ((String) objArr[0]).intern());
        int i3 = f8871i + 113;
        f8868f = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return e2;
        }
        int i4 = 8 / 0;
        return e2;
    }
}
