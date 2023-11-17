package com.facetec.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facetec.sdk.C2750a;
import com.facetec.sdk.C3147g;
import com.facetec.sdk.C3262js;
import com.facetec.sdk.C3268ju;
import com.github.mikephil.charting.utils.Utils;
import com.guardsquare.dexguard.annotation.EncryptStrings;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.json.JSONObject;

@EncryptStrings
/* renamed from: com.facetec.sdk.au */
final class C2802au {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: a */
    private static String f8997a;

    /* renamed from: b */
    static int f8998b = 0;

    /* renamed from: c */
    private static String f8999c;

    /* renamed from: d */
    private static C2802au f9000d;

    /* renamed from: e */
    static String f9001e;

    /* renamed from: g */
    private static String f9002g;

    /* renamed from: h */
    private static char f9003h;

    /* renamed from: i */
    private static char[] f9004i;

    /* renamed from: k */
    private static char f9005k;

    /* renamed from: l */
    private static char f9006l;

    /* renamed from: m */
    private static char f9007m;

    /* renamed from: n */
    private static char f9008n;

    /* renamed from: o */
    private static int f9009o = 0;

    /* renamed from: t */
    private static int f9010t;

    /* renamed from: f */
    private TelephonyManager f9011f;

    /* renamed from: j */
    private final C3268ju f9012j = m10962d();

    /* renamed from: com.facetec.sdk.au$a */
    static class C2805a {

        /* renamed from: d */
        boolean f9019d;

        /* renamed from: e */
        boolean f9020e;

        C2805a(boolean z, boolean z2) {
            this.f9019d = z;
            this.f9020e = z2;
        }
    }

    /* renamed from: com.facetec.sdk.au$c */
    static abstract class C2806c {
        C2806c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo8865d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo8866e(boolean z) {
        }
    }

    @FunctionalInterface
    /* renamed from: com.facetec.sdk.au$e */
    interface C2807e {
        void onCompletion(C2805a aVar);
    }

    static {
        char c;
        init$0();
        f9010t = 1;
        m10958c();
        TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getGlobalActionKeyTimeout();
        View.MeasureSpec.getSize(0);
        ViewConfiguration.getKeyRepeatTimeout();
        ExpandableListView.getPackedPositionType(0);
        AudioTrack.getMaxVolume();
        ViewConfiguration.getTapTimeout();
        View.MeasureSpec.getSize(0);
        ExpandableListView.getPackedPositionChild(0);
        int i = f9009o + 101;
        f9010t = i % 128;
        if (i % 2 == 0) {
            c = 2;
        } else {
            c = '#';
        }
        if (c == 2) {
            int i2 = 58 / 0;
        }
    }

    private C2802au(Context context) {
        Object[] objArr = new Object[1];
        m10965p("\u0018\u0002\u0015\u0017㙩", Color.blue(0) + 5, (byte) (TextUtils.indexOf("", "", 0) + 106), objArr);
        this.f9011f = (TelephonyManager) context.getSystemService(((String) objArr[0]).intern());
        if (f9002g == null) {
            f9002g = C2840bg.m11351b(context);
        }
        if (f8999c == null) {
            f8999c = context.getPackageName();
        }
        if (f8997a == null) {
            f8997a = C2810ax.m10996d(context);
        }
    }

    /* renamed from: b */
    static String m10955b(String str) {
        Object[] objArr = new Object[1];
        m10966q("᫉흐", (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr);
        String intern = ((String) objArr[0]).intern();
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        m10965p("(+\u0011(-)\u001a!\u0003\u0018!\u0017+\u001a\u0010-\"\u0014\u0013\u0018", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 20, (byte) (71 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(f8999c);
        sb.append(intern);
        sb.append(str);
        sb.append(intern);
        sb.append(f9002g);
        sb.append(intern);
        sb.append(Build.MODEL);
        sb.append(intern);
        sb.append(FaceTecSDK.version());
        sb.append(intern);
        sb.append(locale.toString());
        sb.append(intern);
        sb.append(locale.getLanguage());
        sb.append(intern);
        sb.append(C2888cg.f9550b);
        String obj = sb.toString();
        int i = f9009o + 43;
        f9010t = i % 128;
        int i2 = i % 2;
        return obj;
    }

    /* renamed from: c */
    static void m10958c() {
        f9003h = 9123;
        f9004i = new char[]{5751, 5700, 5704, 5718, 5746, 5740, 5636, 5647, 5724, 5715, 5645, 5642, 5738, 5719, 5703, 5757, 5721, 5722, 5707, 5725, 5758, 5651, 5712, 5710, 5754, 5649, 5698, 5713, 5702, 5741, 5717, 5648, 5644, 5759, 5714, 5755, 5720, 5752, 5723, 5747, 5701, 5744, 5756, 5753, 5708, 5709, 5745, 5727, 5706};
        f9008n = 35866;
        f9005k = 56383;
        f9006l = 63144;
        f9007m = 23645;
    }

    /* renamed from: d */
    static /* synthetic */ void m10964d(C2807e eVar, C2805a aVar) {
        int i = f9010t + 19;
        f9009o = i % 128;
        int i2 = i % 2;
        m10960c(eVar, aVar);
        int i3 = f9009o + 53;
        f9010t = i3 % 128;
        if ((i3 % 2 == 0 ? 'E' : 'a') != 'a') {
            throw null;
        }
    }

    static void init$0() {
        $$a = new byte[]{44, 126, -32, 27};
        $$b = 123;
    }

    /* renamed from: p */
    private static void m10965p(String str, int i, byte b, Object[] objArr) {
        Object obj;
        char c;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        Throwable cause;
        char c2;
        int i3 = i;
        int i4 = $10 + 81;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        if (str != null) {
            obj = str.toCharArray();
        } else {
            obj = str;
        }
        char[] cArr = (char[]) obj;
        C3166gh ghVar = new C3166gh();
        char[] cArr2 = f9004i;
        if (cArr2 != null) {
            c = '3';
        } else {
            c = 'Z';
        }
        int i6 = 6;
        long j = 0;
        int i7 = 1;
        if (c != 'Z') {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[i7];
                    objArr2[0] = Integer.valueOf(cArr2[i8]);
                    Map<Integer, Object> map = C2854bp.f9335p;
                    Object obj2 = map.get(-563486590);
                    if (obj2 == null) {
                        obj2 = ((Class) C2854bp.m11559b((char) (((Process.getThreadPriority(0) + 20) >> i6) + 6874), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 1859, 24 - KeyEvent.keyCodeFromString(""))).getMethod("d", new Class[]{Integer.TYPE});
                        map.put(-563486590, obj2);
                    }
                    cArr3[i8] = ((Character) ((Method) obj2).invoke((Object) null, objArr2)).charValue();
                    i8++;
                    i6 = 6;
                    j = 0;
                    i7 = 1;
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
            Object[] objArr3 = {Integer.valueOf(f9003h)};
            Map<Integer, Object> map2 = C2854bp.f9335p;
            Object obj3 = map2.get(-563486590);
            if (obj3 == null) {
                obj3 = ((Class) C2854bp.m11559b((char) (6874 - TextUtils.getTrimmedLength("")), (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 1859, TextUtils.indexOf("", '0') + 25)).getMethod("d", new Class[]{Integer.TYPE});
                map2.put(-563486590, obj3);
            }
            char charValue = ((Character) ((Method) obj3).invoke((Object) null, objArr3)).charValue();
            char[] cArr4 = new char[i3];
            if (i3 % 2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i2 = i3;
            } else {
                i2 = i3 - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
            if (i2 > 1) {
                ghVar.f10448c = 0;
                while (true) {
                    int i9 = ghVar.f10448c;
                    if (i9 >= i2) {
                        break;
                    }
                    char c3 = cArr[i9];
                    ghVar.f10449d = c3;
                    char c4 = cArr[i9 + 1];
                    ghVar.f10447b = c4;
                    if (c3 == c4) {
                        int i12 = $11 + 3;
                        $10 = i12 % 128;
                        if (i12 % 2 != 0) {
                            c2 = 24;
                        } else {
                            c2 = 'A';
                        }
                        if (c2 != 'A') {
                            cArr4[i9] = (char) (c3 * b);
                            cArr4[i9 + 1] = (char) (c4 >> b);
                        } else {
                            cArr4[i9] = (char) (c3 - b);
                            cArr4[i9 + 1] = (char) (c4 - b);
                        }
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
                            objArr4[0] = ghVar;
                            Map<Integer, Object> map3 = C2854bp.f9335p;
                            Object obj4 = map3.get(-1127895707);
                            Class<Object> cls = Object.class;
                            if (obj4 == null) {
                                Class cls2 = Integer.TYPE;
                                obj4 = ((Class) C2854bp.m11559b((char) (KeyEvent.normalizeMetaState(0) + 27868), 123 - Drawable.resolveOpacity(0, 0), ExpandableListView.getPackedPositionGroup(0) + 24)).getMethod("c", new Class[]{cls, cls, cls2, cls, cls, cls2, cls, cls, cls2, cls, cls, cls2, cls});
                                map3.put(-1127895707, obj4);
                            }
                            int intValue = ((Integer) ((Method) obj4).invoke((Object) null, objArr4)).intValue();
                            int i13 = ghVar.f10451f;
                            if (intValue == i13) {
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
                                    objArr5[0] = ghVar;
                                    Object obj5 = map3.get(-190269654);
                                    if (obj5 == null) {
                                        byte b2 = (byte) 0;
                                        byte b3 = (byte) b2;
                                        Object[] objArr6 = new Object[1];
                                        m10967r(b2, b3, (byte) b3, objArr6);
                                        Class cls3 = Integer.TYPE;
                                        obj5 = ((Class) C2854bp.m11559b((char) (ExpandableListView.getPackedPositionChild(0) + 34366), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 640, 24 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)))).getMethod((String) objArr6[0], new Class[]{cls, cls, cls3, cls3, cls, cls, cls3, cls3, cls, cls3, cls});
                                        map3.put(-190269654, obj5);
                                    }
                                    int intValue2 = ((Integer) ((Method) obj5).invoke((Object) null, objArr5)).intValue();
                                    int i14 = (ghVar.f10450e * charValue) + ghVar.f10451f;
                                    int i15 = ghVar.f10448c;
                                    cArr4[i15] = cArr2[intValue2];
                                    cArr4[i15 + 1] = cArr2[i14];
                                } catch (Throwable th2) {
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th2;
                                }
                            } else {
                                int i16 = ghVar.f10446a;
                                int i17 = ghVar.f10450e;
                                if (i16 == i17) {
                                    int i18 = ((ghVar.f10452i + charValue) - 1) % charValue;
                                    ghVar.f10452i = i18;
                                    int i19 = ((i13 + charValue) - 1) % charValue;
                                    ghVar.f10451f = i19;
                                    int i22 = (i17 * charValue) + i19;
                                    int i23 = ghVar.f10448c;
                                    cArr4[i23] = cArr2[(i16 * charValue) + i18];
                                    cArr4[i23 + 1] = cArr2[i22];
                                } else {
                                    int i24 = (i16 * charValue) + i13;
                                    int i25 = (i17 * charValue) + ghVar.f10452i;
                                    int i26 = ghVar.f10448c;
                                    cArr4[i26] = cArr2[i24];
                                    cArr4[i26 + 1] = cArr2[i25];
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
                }
            }
            int i27 = 0;
            while (true) {
                if (i27 < i3) {
                    z3 = true;
                    z2 = true;
                } else {
                    z2 = false;
                    z3 = true;
                }
                if (z2 != z3) {
                    objArr[0] = new String(cArr4);
                    return;
                } else {
                    cArr4[i27] = (char) (cArr4[i27] ^ 13722);
                    i27++;
                }
            }
        } finally {
            Throwable cause3 = th.getCause();
            if (cause3 != null) {
                throw cause3;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: char[]} */
    /* JADX WARNING: type inference failed for: r3v40 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10966q(java.lang.String r20, int r21, java.lang.Object[] r22) {
        /*
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r1 = 1
            r2 = 0
            if (r20 == 0) goto L_0x0008
            r3 = r2
            goto L_0x0009
        L_0x0008:
            r3 = r1
        L_0x0009:
            if (r3 == 0) goto L_0x000e
            r3 = r20
            goto L_0x0012
        L_0x000e:
            char[] r3 = r20.toCharArray()
        L_0x0012:
            char[] r3 = (char[]) r3
            com.facetec.sdk.ge r4 = new com.facetec.sdk.ge
            r4.<init>()
            int r5 = r3.length
            char[] r5 = new char[r5]
            r4.f10441b = r2
            r6 = 2
            char[] r7 = new char[r6]
            int r8 = $10
            int r8 = r8 + 91
            int r9 = r8 % 128
            $11 = r9
            int r8 = r8 % r6
        L_0x002a:
            int r8 = r4.f10441b
            int r9 = r3.length
            if (r8 >= r9) goto L_0x0236
            char r9 = r3[r8]
            r7[r2] = r9
            int r8 = r8 + 1
            char r8 = r3[r8]
            r7[r1] = r8
            int r8 = $10
            int r8 = r8 + 11
            int r9 = r8 % 128
            $11 = r9
            int r8 = r8 % r6
            r8 = 58224(0xe370, float:8.1589E-41)
            r9 = r2
        L_0x0046:
            r10 = 16
            if (r9 >= r10) goto L_0x004c
            r11 = r2
            goto L_0x004d
        L_0x004c:
            r11 = r1
        L_0x004d:
            java.lang.String r12 = ""
            if (r11 == r1) goto L_0x01bb
            int r11 = $11
            int r11 = r11 + 93
            int r14 = r11 % 128
            $10 = r14
            int r11 = r11 % r6
            char r11 = r7[r1]
            char r14 = r7[r2]
            int r15 = r14 + r8
            int r16 = r14 << 4
            char r13 = f9006l
            r17 = r3
            long r2 = (long) r13
            r18 = 595417797124296349(0x8435954f28a0e9d, double:7.325062556735202E-269)
            long r2 = r2 ^ r18
            int r2 = (int) r2
            char r2 = (char) r2
            int r16 = r16 + r2
            r2 = r15 ^ r16
            int r3 = r14 >>> 5
            char r13 = f9007m
            r14 = 4
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x01b2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x01b2 }
            r16 = 3
            r15[r16] = r13     // Catch:{ all -> 0x01b2 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01b2 }
            r15[r6] = r3     // Catch:{ all -> 0x01b2 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01b2 }
            r15[r1] = r2     // Catch:{ all -> 0x01b2 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01b2 }
            r3 = 0
            r15[r3] = r2     // Catch:{ all -> 0x01b2 }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x01b2 }
            r3 = 1276772069(0x4c19fee5, float:4.0369044E7)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01b2 }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x01b2 }
            if (r11 == 0) goto L_0x00a6
            goto L_0x00ec
        L_0x00a6:
            r11 = 0
            int r13 = android.graphics.drawable.Drawable.resolveOpacity(r11, r11)     // Catch:{ all -> 0x01b2 }
            int r13 = 8636 - r13
            char r13 = (char) r13     // Catch:{ all -> 0x01b2 }
            int r3 = android.view.KeyEvent.getDeadChar(r11, r11)     // Catch:{ all -> 0x01b2 }
            int r3 = r3 + 1312
            int r11 = android.view.ViewConfiguration.getLongPressTimeout()     // Catch:{ all -> 0x01b2 }
            int r11 = r11 >> r10
            int r11 = 23 - r11
            java.lang.Object r3 = com.facetec.sdk.C2854bp.m11559b(r13, r3, r11)     // Catch:{ all -> 0x01b2 }
            java.lang.Class r3 = (java.lang.Class) r3     // Catch:{ all -> 0x01b2 }
            r11 = 0
            byte r13 = (byte) r11     // Catch:{ all -> 0x01b2 }
            byte r10 = (byte) r13     // Catch:{ all -> 0x01b2 }
            r6 = r10 | 11
            byte r6 = (byte) r6     // Catch:{ all -> 0x01b2 }
            java.lang.Object[] r14 = new java.lang.Object[r1]     // Catch:{ all -> 0x01b2 }
            m10967r(r13, r10, r6, r14)     // Catch:{ all -> 0x01b2 }
            r6 = r14[r11]     // Catch:{ all -> 0x01b2 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x01b2 }
            r10 = 4
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ all -> 0x01b2 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01b2 }
            r13[r11] = r10     // Catch:{ all -> 0x01b2 }
            r13[r1] = r10     // Catch:{ all -> 0x01b2 }
            r11 = 2
            r13[r11] = r10     // Catch:{ all -> 0x01b2 }
            r13[r16] = r10     // Catch:{ all -> 0x01b2 }
            java.lang.reflect.Method r11 = r3.getMethod(r6, r13)     // Catch:{ all -> 0x01b2 }
            r3 = 1276772069(0x4c19fee5, float:4.0369044E7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01b2 }
            r2.put(r6, r11)     // Catch:{ all -> 0x01b2 }
        L_0x00ec:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11     // Catch:{ all -> 0x01b2 }
            r3 = 0
            java.lang.Object r6 = r11.invoke(r3, r15)     // Catch:{ all -> 0x01b2 }
            java.lang.Character r6 = (java.lang.Character) r6     // Catch:{ all -> 0x01b2 }
            char r3 = r6.charValue()     // Catch:{ all -> 0x01b2 }
            r7[r1] = r3
            r6 = 0
            char r10 = r7[r6]
            int r6 = r3 + r8
            int r11 = r3 << 4
            char r13 = f9008n
            long r13 = (long) r13
            long r13 = r13 ^ r18
            int r13 = (int) r13
            char r13 = (char) r13
            int r11 = r11 + r13
            r6 = r6 ^ r11
            int r3 = r3 >>> 5
            char r11 = f9005k
            r13 = 4
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ all -> 0x01a9 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01a9 }
            r14[r16] = r11     // Catch:{ all -> 0x01a9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01a9 }
            r11 = 2
            r14[r11] = r3     // Catch:{ all -> 0x01a9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01a9 }
            r14[r1] = r3     // Catch:{ all -> 0x01a9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01a9 }
            r6 = 0
            r14[r6] = r3     // Catch:{ all -> 0x01a9 }
            r3 = 1276772069(0x4c19fee5, float:4.0369044E7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01a9 }
            java.lang.Object r3 = r2.get(r6)     // Catch:{ all -> 0x01a9 }
            if (r3 == 0) goto L_0x013a
            goto L_0x0183
        L_0x013a:
            int r3 = android.view.ViewConfiguration.getMaximumFlingVelocity()     // Catch:{ all -> 0x01a9 }
            r6 = 16
            int r3 = r3 >> r6
            int r3 = 8636 - r3
            char r3 = (char) r3     // Catch:{ all -> 0x01a9 }
            r10 = 0
            int r6 = android.widget.ExpandableListView.getPackedPositionChild(r10)     // Catch:{ all -> 0x01a9 }
            int r6 = r6 + 1313
            int r10 = android.view.KeyEvent.keyCodeFromString(r12)     // Catch:{ all -> 0x01a9 }
            int r10 = 23 - r10
            java.lang.Object r3 = com.facetec.sdk.C2854bp.m11559b(r3, r6, r10)     // Catch:{ all -> 0x01a9 }
            java.lang.Class r3 = (java.lang.Class) r3     // Catch:{ all -> 0x01a9 }
            r6 = 0
            byte r10 = (byte) r6     // Catch:{ all -> 0x01a9 }
            byte r11 = (byte) r10     // Catch:{ all -> 0x01a9 }
            r12 = r11 | 11
            byte r12 = (byte) r12     // Catch:{ all -> 0x01a9 }
            java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ all -> 0x01a9 }
            m10967r(r10, r11, r12, r13)     // Catch:{ all -> 0x01a9 }
            r10 = r13[r6]     // Catch:{ all -> 0x01a9 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01a9 }
            r11 = 4
            java.lang.Class[] r11 = new java.lang.Class[r11]     // Catch:{ all -> 0x01a9 }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01a9 }
            r11[r6] = r12     // Catch:{ all -> 0x01a9 }
            r11[r1] = r12     // Catch:{ all -> 0x01a9 }
            r6 = 2
            r11[r6] = r12     // Catch:{ all -> 0x01a9 }
            r11[r16] = r12     // Catch:{ all -> 0x01a9 }
            java.lang.reflect.Method r3 = r3.getMethod(r10, r11)     // Catch:{ all -> 0x01a9 }
            r6 = 1276772069(0x4c19fee5, float:4.0369044E7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01a9 }
            r2.put(r6, r3)     // Catch:{ all -> 0x01a9 }
        L_0x0183:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch:{ all -> 0x01a9 }
            r2 = 0
            java.lang.Object r2 = r3.invoke(r2, r14)     // Catch:{ all -> 0x01a9 }
            java.lang.Character r2 = (java.lang.Character) r2     // Catch:{ all -> 0x01a9 }
            char r2 = r2.charValue()     // Catch:{ all -> 0x01a9 }
            r3 = 0
            r7[r3] = r2
            r2 = 40503(0x9e37, float:5.6757E-41)
            int r8 = r8 - r2
            int r9 = r9 + 1
            int r2 = $10
            int r2 = r2 + 103
            int r3 = r2 % 128
            $11 = r3
            r3 = 2
            int r2 = r2 % r3
            r3 = r17
            r2 = 0
            r6 = 2
            goto L_0x0046
        L_0x01a9:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01b1
            throw r1
        L_0x01b1:
            throw r0
        L_0x01b2:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01ba
            throw r1
        L_0x01ba:
            throw r0
        L_0x01bb:
            r17 = r3
            int r2 = r4.f10441b
            r3 = 0
            char r6 = r7[r3]
            r5[r2] = r6
            int r2 = r2 + r1
            char r6 = r7[r1]
            r5[r2] = r6
            r2 = 2
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x022d }
            r6[r1] = r4     // Catch:{ all -> 0x022d }
            r6[r3] = r4     // Catch:{ all -> 0x022d }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x022d }
            r3 = -417016338(0xffffffffe724d5ee, float:-7.784144E23)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x022d }
            java.lang.Object r8 = r2.get(r8)     // Catch:{ all -> 0x022d }
            if (r8 == 0) goto L_0x01e1
            r11 = 2
            goto L_0x0221
        L_0x01e1:
            r8 = 48
            r9 = 0
            int r10 = android.text.TextUtils.lastIndexOf(r12, r8, r9, r9)     // Catch:{ all -> 0x022d }
            int r10 = r10 + 28388
            char r9 = (char) r10     // Catch:{ all -> 0x022d }
            float r10 = android.view.ViewConfiguration.getScrollFriction()     // Catch:{ all -> 0x022d }
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            int r10 = r10 + 837
            char r8 = android.text.AndroidCharacter.getMirror(r8)     // Catch:{ all -> 0x022d }
            int r8 = r8 + -24
            java.lang.Object r8 = com.facetec.sdk.C2854bp.m11559b(r9, r10, r8)     // Catch:{ all -> 0x022d }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x022d }
            r9 = 0
            byte r10 = (byte) r9     // Catch:{ all -> 0x022d }
            byte r11 = (byte) r10     // Catch:{ all -> 0x022d }
            r12 = r11 | 10
            byte r12 = (byte) r12     // Catch:{ all -> 0x022d }
            java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ all -> 0x022d }
            m10967r(r10, r11, r12, r13)     // Catch:{ all -> 0x022d }
            r10 = r13[r9]     // Catch:{ all -> 0x022d }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x022d }
            r11 = 2
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch:{ all -> 0x022d }
            r12[r9] = r0     // Catch:{ all -> 0x022d }
            r12[r1] = r0     // Catch:{ all -> 0x022d }
            java.lang.reflect.Method r8 = r8.getMethod(r10, r12)     // Catch:{ all -> 0x022d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x022d }
            r2.put(r3, r8)     // Catch:{ all -> 0x022d }
        L_0x0221:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch:{ all -> 0x022d }
            r2 = 0
            r8.invoke(r2, r6)     // Catch:{ all -> 0x022d }
            r6 = r11
            r3 = r17
            r2 = 0
            goto L_0x002a
        L_0x022d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0235
            throw r1
        L_0x0235:
            throw r0
        L_0x0236:
            java.lang.String r0 = new java.lang.String
            r1 = r21
            r2 = 0
            r0.<init>(r5, r2, r1)
            r22[r2] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2802au.m10966q(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10967r(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = $$a
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r8 = r8 * 2
            int r8 = r8 + 98
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r8 = r7
            r3 = r1
            r4 = r2
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L_0x0039
        L_0x001b:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x001f:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L_0x002e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x002e:
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
        L_0x0039:
            int r6 = r6 + r8
            int r7 = r7 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2802au.m10967r(int, short, int, java.lang.Object[]):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m10953a(Context context, String str, C2807e eVar) {
        int i = f9010t + 83;
        f9009o = i % 128;
        int i2 = i % 2;
        m10959c(context, str, eVar);
        int i3 = f9010t + 17;
        f9009o = i3 % 128;
        int i4 = i3 % 2;
    }

    /* renamed from: c */
    static C3268ju m10957c(Context context) {
        int i = f9010t + 19;
        f9009o = i % 128;
        int i2 = i % 2;
        C3268ju juVar = m10961d(context).f9012j;
        int i3 = f9009o + 113;
        f9010t = i3 % 128;
        int i4 = i3 % 2;
        return juVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (f9000d == null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        if (f9000d == null) goto L_0x0026;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized com.facetec.sdk.C2802au m10961d(android.content.Context r3) {
        /*
            java.lang.Class<com.facetec.sdk.au> r0 = com.facetec.sdk.C2802au.class
            monitor-enter(r0)
            int r1 = f9009o     // Catch:{ all -> 0x0045 }
            int r1 = r1 + 79
            int r2 = r1 % 128
            f9010t = r2     // Catch:{ all -> 0x0045 }
            int r1 = r1 % 2
            r2 = 45
            if (r1 != 0) goto L_0x0014
            r1 = 10
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            if (r1 == r2) goto L_0x0022
            com.facetec.sdk.au r1 = f9000d     // Catch:{ all -> 0x0045 }
            r2 = 26
            int r2 = r2 / 0
            if (r1 != 0) goto L_0x0037
            goto L_0x0026
        L_0x0020:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0045 }
        L_0x0022:
            com.facetec.sdk.au r1 = f9000d     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x0037
        L_0x0026:
            com.facetec.sdk.au r1 = new com.facetec.sdk.au     // Catch:{ all -> 0x0045 }
            r1.<init>(r3)     // Catch:{ all -> 0x0045 }
            f9000d = r1     // Catch:{ all -> 0x0045 }
            int r3 = f9010t     // Catch:{ all -> 0x0045 }
            int r3 = r3 + 63
            int r1 = r3 % 128
            f9009o = r1     // Catch:{ all -> 0x0045 }
            int r3 = r3 % 2
        L_0x0037:
            com.facetec.sdk.au r3 = f9000d     // Catch:{ all -> 0x0045 }
            int r1 = f9009o     // Catch:{ all -> 0x0045 }
            int r1 = r1 + 27
            int r2 = r1 % 128
            f9010t = r2     // Catch:{ all -> 0x0045 }
            int r1 = r1 % 2
            monitor-exit(r0)
            return r3
        L_0x0045:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2802au.m10961d(android.content.Context):com.facetec.sdk.au");
    }

    /* renamed from: a */
    static synchronized void m10951a() {
        synchronized (C2802au.class) {
            int i = f9009o + 109;
            int i2 = i % 128;
            f9010t = i2;
            int i3 = i % 2;
            f9000d = null;
            int i4 = i2 + 17;
            f9009o = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* renamed from: c */
    private static void m10959c(Context context, String str, C2807e eVar) {
        C2805a aVar;
        boolean z;
        C2750a.C2752e b;
        boolean z2 = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object[] objArr = new Object[1];
            m10965p("\n%*0", 4 - (ViewConfiguration.getTapTimeout() >> 16), (byte) (66 - ExpandableListView.getPackedPositionChild(0)), objArr);
            JSONObject jSONObject2 = jSONObject.getJSONObject(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            m10965p("\u0017\"", 2 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > Utils.DOUBLE_EPSILON ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == Utils.DOUBLE_EPSILON ? 0 : -1)), (byte) (55 - TextUtils.getOffsetAfter("", 0)), objArr2);
            if ((jSONObject2.getBoolean(((String) objArr2[0]).intern()) ? 4 : 'O') != 4) {
                z = false;
            } else {
                int i = f9010t + 59;
                f9009o = i % 128;
                int i2 = i % 2;
                try {
                    Object[] objArr3 = new Object[1];
                    m10966q("昞鋮䦼慻", ExpandableListView.getPackedPositionChild(0) + 5, objArr3);
                    b = C2750a.C2752e.m10698b(jSONObject.getJSONObject(((String) objArr3[0]).intern()));
                    C2750a.m10682b(context, C2750a.m10683b(context), b);
                    C2840bg.f9200a = b.f8716b;
                    f9001e = b.f8719e;
                    z = b.f8717c.booleanValue();
                } catch (Throwable th) {
                    th = th;
                    z = false;
                    z2 = true;
                    try {
                        ExpandableListView.getPackedPositionChild(0);
                        C2810ax.m10991b(th.getMessage());
                        aVar = new C2805a(z2, z);
                    } catch (Throwable th2) {
                        m10960c(eVar, new C2805a(z2, z));
                        throw th2;
                    }
                    m10960c(eVar, aVar);
                    C3555s.m13896c(context);
                    C2785al.m10839d(context);
                }
                try {
                    C2840bg.f9202c = b.f8722j.intValue();
                    int intValue = b.f8720g.intValue();
                    if (!(intValue <= 0)) {
                        int i3 = f9009o + 125;
                        f9010t = i3 % 128;
                        if (i3 % 2 == 0) {
                            C2863bw.m11677b(context, intValue);
                            int i4 = 3 / 0;
                        } else {
                            C2863bw.m11677b(context, intValue);
                        }
                    }
                    z2 = true;
                } catch (Throwable th3) {
                    th = th3;
                    z2 = true;
                    ExpandableListView.getPackedPositionChild(0);
                    C2810ax.m10991b(th.getMessage());
                    aVar = new C2805a(z2, z);
                    m10960c(eVar, aVar);
                    C3555s.m13896c(context);
                    C2785al.m10839d(context);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            z = false;
            ExpandableListView.getPackedPositionChild(0);
            C2810ax.m10991b(th.getMessage());
            aVar = new C2805a(z2, z);
            m10960c(eVar, aVar);
            C3555s.m13896c(context);
            C2785al.m10839d(context);
        }
        aVar = new C2805a(z2, z);
        m10960c(eVar, aVar);
        C3555s.m13896c(context);
        C2785al.m10839d(context);
    }

    /* renamed from: a */
    static void m10952a(Context context, C2807e eVar) {
        int i = f9009o + 65;
        f9010t = i % 128;
        if (!(i % 2 == 0)) {
            m10961d(context).m10963d(context, eVar);
        } else {
            m10961d(context).m10963d(context, eVar);
            int i2 = 17 / 0;
        }
        int i3 = f9010t + 27;
        f9009o = i3 % 128;
        if ((i3 % 2 != 0 ? 'P' : 'a') == 'P') {
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m10956b(C2807e eVar, C2805a aVar) {
        int i = f9009o + 53;
        f9010t = i % 128;
        boolean z = i % 2 == 0;
        eVar.onCompletion(aVar);
        if (!z) {
            int i2 = f9010t + 119;
            f9009o = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        throw null;
    }

    /* renamed from: d */
    private static synchronized C3268ju m10962d() {
        C3268ju c;
        synchronized (C2802au.class) {
            try {
                X509TrustManager c2 = C2898ck.m11976c();
                Object[] objArr = new Object[1];
                m10965p("\u000b\u0005㘏", 3 - (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)), (byte) (71 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1))), objArr);
                SSLContext instance = SSLContext.getInstance(((String) objArr[0]).intern());
                instance.init((KeyManager[]) null, new TrustManager[]{c2}, (SecureRandom) null);
                C2943df dfVar = new C2943df(instance.getSocketFactory());
                C3268ju.C3270e eVar = new C3268ju.C3270e();
                eVar.f10706k = dfVar;
                eVar.f10708m = C3430ml.m13652b(c2);
                c = eVar.mo9534c();
                c.mo9518l().mo9480b();
                int i = f9010t + 83;
                f9009o = i % 128;
                int i2 = i % 2;
            } catch (GeneralSecurityException e) {
                e.printStackTrace();
                throw new RuntimeException();
            }
        }
        return c;
    }

    /* renamed from: d */
    private synchronized void m10963d(Context context, final C2807e eVar) {
        final Context applicationContext = context.getApplicationContext();
        try {
            Object[] objArr = new Object[1];
            m10965p("\u0006-,\u001b0\u0003㘫㘫,\u001a\n\"\u0006\u0016\u0017\r.\u0013-\u0006!\u0011\u0017\r\u001a.\u001b\t\u0017\u0004\u000b\u0015\u0006\u0016\u0017\r\u0018.-\u00030\n\u0015\u0017", View.resolveSizeAndState(0, 0, 0) + 44, (byte) (Color.blue(0) + 118), objArr);
            this.f9012j.mo9507b(C3147g.m12932b(context, ((String) objArr[0]).intern(), Boolean.FALSE).mo9604e((C3297kd) new C3262js.C3263a().mo9504c()).mo9599b()).mo9460b(new C3248jj() {
                /* renamed from: a */
                public final void mo8841a(C3295kc kcVar) {
                    String str;
                    if (kcVar.mo9605a()) {
                        C3291ka c = kcVar.mo9607c();
                        Context context = applicationContext;
                        if (c != null) {
                            str = c.mo9587e();
                        } else {
                            str = "";
                        }
                        C2802au.m10953a(context, str, eVar);
                    } else if (kcVar.mo9606b() == 401) {
                        C2802au.m10964d(eVar, new C2805a(false, false));
                    } else {
                        C2802au.m10964d(eVar, (C2805a) null);
                    }
                }

                /* renamed from: b */
                public final void mo8842b() {
                    C2802au.m10964d(eVar, (C2805a) null);
                }
            });
            int i = f9010t + 57;
            f9009o = i % 128;
            int i2 = i % 2;
        } catch (C3147g.C3148e unused) {
            m10960c(eVar, (C2805a) null);
        }
    }

    /* renamed from: c */
    private static void m10960c(C2807e eVar, C2805a aVar) {
        int i = f9010t + 25;
        int i2 = i % 128;
        f9009o = i2;
        int i3 = i % 2;
        if (!(eVar == null)) {
            int i4 = i2 + 59;
            f9010t = i4 % 128;
            int i5 = i4 % 2;
            AsyncTask.execute(new C3671x1(eVar, aVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8864d(Context context, C3471o oVar, boolean z, C2806c cVar) {
        String str;
        Object obj;
        Context context2 = context;
        C3471o oVar2 = oVar;
        final boolean z2 = z;
        C2972dv c = new C2981dy().mo9141b().mo9142c();
        C2999ed edVar = new C2999ed();
        if ((oVar2.f11326a == C3583t.f11531e ? 15 : 'Q') != 'Q') {
            Object[] objArr = new Object[1];
            m10966q("ﳐ珽Ꜳ采퀑ﲦ䆝鶓材퀨轑羧", (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, objArr);
            edVar.mo9175e(((String) objArr[0]).intern(), oVar2.f11328c);
            if (C2750a.m10683b(context)) {
                int i = f9009o + 111;
                f9010t = i % 128;
                int i2 = i % 2;
                Object[] objArr2 = new Object[1];
                m10965p("\u0010\u0018", (ViewConfiguration.getTapTimeout() >> 16) + 2, (byte) (View.combineMeasuredStates(0, 0) + 113), objArr2);
                edVar.mo9175e(((String) objArr2[0]).intern(), C3280k.f10765a);
            }
            C3000ee b = c.mo9132b((Object) oVar2.f11330e);
            Object[] objArr3 = new Object[1];
            m10965p("\"\u0006", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2, (byte) (105 - View.resolveSizeAndState(0, 0, 0)), objArr3);
            edVar.mo9173c(((String) objArr3[0]).intern(), b);
            if (z2) {
                C2982dz dzVar = new C2982dz();
                Object[] objArr4 = new Object[1];
                m10966q("ḵὰ軙⏭㌫녧覈ᦞ㨋忮⑑㍃", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 13, objArr4);
                dzVar.mo9145b(((String) objArr4[0]).intern());
                Object[] objArr5 = new Object[1];
                m10966q("䦼慻Ꞟ⯚", 4 - TextUtils.indexOf("", ""), objArr5);
                edVar.mo9173c(((String) objArr5[0]).intern(), (C3000ee) dzVar);
            }
            Object[] objArr6 = new Object[1];
            m10966q("⏖צּ樭녁ۄ㾚鯬숈⳱桭Ꜳ采퀑ﲦ뫩劚⑑㍃", 19 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > Utils.DOUBLE_EPSILON ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == Utils.DOUBLE_EPSILON ? 0 : -1)), objArr6);
            edVar.mo9175e(((String) objArr6[0]).intern(), oVar2.f11329d);
            Object[] objArr7 = new Object[1];
            m10966q("?鬥滀蜋槟锣䠿㍆虐桭Ꜳ采퀑ﲦ뫩劚⑑㍃", ExpandableListView.getPackedPositionType(0) + 19, objArr7);
            edVar.mo9175e(((String) objArr7[0]).intern(), oVar2.f11333i);
            Object[] objArr8 = new Object[1];
            m10965p("\u0014\n,\u0013\u0017\u0015.*\f\u0014\u0003\u000e", 12 - (ViewConfiguration.getScrollBarSize() >> 8), (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 75), objArr8);
            edVar.mo9175e(((String) objArr8[0]).intern(), oVar2.f11334j);
            Object[] objArr9 = new Object[1];
            m10966q("눶㫮꺅?夣꿃ᛗꆀ", 7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), objArr9);
            edVar.mo9175e(((String) objArr9[0]).intern(), f9002g);
            Object[] objArr10 = new Object[1];
            m10965p("\u0018-\u0006\t\u0011((0\n%", 10 - (KeyEvent.getMaxKeyCode() >> 16), (byte) (109 - TextUtils.indexOf("", "", 0)), objArr10);
            edVar.mo9175e(((String) objArr10[0]).intern(), Build.MANUFACTURER);
            Object[] objArr11 = new Object[1];
            m10965p("\u0018-\u0006\t\u0011()\u0019\u0018-㘶", (AudioTrack.getMaxVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMaxVolume() == Utils.FLOAT_EPSILON ? 0 : -1)) + 10, (byte) (63 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr11);
            edVar.mo9175e(((String) objArr11[0]).intern(), Build.MODEL);
            Object[] objArr12 = new Object[1];
            m10966q("눶㫮꺅?夣꿃톌曻玛觬卦㎾퀑ﲦ哘珬", 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr12);
            edVar.mo9175e(((String) objArr12[0]).intern(), Build.VERSION.RELEASE);
            Object[] objArr13 = new Object[1];
            m10966q("눶㫮꺅?夣꿃톌曻뻵躊獍", 12 - Color.green(0), objArr13);
            String intern = ((String) objArr13[0]).intern();
            Object[] objArr14 = new Object[1];
            m10965p("\u001d\u001a\u0010-\"\u0014㘇", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7, (byte) (9 - (AudioTrack.getMinVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMinVolume() == Utils.FLOAT_EPSILON ? 0 : -1))), objArr14);
            edVar.mo9175e(intern, ((String) objArr14[0]).intern());
            Object[] objArr15 = new Object[1];
            m10965p("\u0018-\u0006\t\u0011(+-+\u001a㙫", 11 - (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)), (byte) (108 - TextUtils.indexOf("", '0', 0)), objArr15);
            edVar.mo9175e(((String) objArr15[0]).intern(), Build.BRAND);
            Object[] objArr16 = new Object[1];
            m10966q("눶㫮꺅?夣꿃䲇녊톨뜥轑羧瘠䗃", 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr16);
            edVar.mo9175e(((String) objArr16[0]).intern(), Build.BOOTLOADER);
            Object[] objArr17 = new Object[1];
            m10966q("눶㫮꺅?夣꿃ḇ鐰浽睉瘠䗃鮄淍軙⏭堆", 17 - Color.green(0), objArr17);
            edVar.mo9175e(((String) objArr17[0]).intern(), Build.FINGERPRINT);
            Object[] objArr18 = new Object[1];
            m10966q("눶㫮꺅?夣꿃歠瘉藒ㅘ瘠䗃姟逼褊䱏", 16 - (KeyEvent.getMaxKeyCode() >> 16), objArr18);
            edVar.mo9174c(((String) objArr18[0]).intern(), (Number) Integer.valueOf(Build.VERSION.SDK_INT));
            Object[] objArr19 = new Object[1];
            m10966q("乎⽳혾寀숈⳱䖘唥⑗ρ滀蜋ℊ践", 14 - (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), objArr19);
            edVar.mo9175e(((String) objArr19[0]).intern(), f8999c);
            Object[] objArr20 = new Object[1];
            m10966q("鶩瞌읕㟴玛觬卦㎾퀑ﲦ哘珬", 11 - (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (TypedValue.complexToFraction(0, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)), objArr20);
            edVar.mo9175e(((String) objArr20[0]).intern(), FaceTecSDK.version());
            Object[] objArr21 = new Object[1];
            m10966q("愝䙃覈ᦞ㍆虐芝⎦퀑ﲦ뫩劚⑑㍃", 13 - ExpandableListView.getPackedPositionType(0), objArr21);
            edVar.mo9174c(((String) objArr21[0]).intern(), (Number) Integer.valueOf(C2840bg.f9202c));
            Object[] objArr22 = new Object[1];
            m10965p("\u0006\n\u0011\u0002-\u0003/\"\u0005,\u0014)+\f\u001f)\u0013+\n%-0\u0003(0\u0018 \u0014\u0006\u0014\u0015\u0017", View.resolveSize(0, 0) + 32, (byte) (123 - TextUtils.getOffsetAfter("", 0)), objArr22);
            edVar.mo9175e(((String) objArr22[0]).intern(), C2780ai.f8827d);
            Object[] objArr23 = new Object[1];
            m10966q("눶㫮꺅?夣꿃謞ຬ瓠ɳ䫓㻉畄栞꽸晫䐕", -16777197 - Color.rgb(0, 0, 0), objArr23);
            edVar.mo9175e(((String) objArr23[0]).intern(), Arrays.toString(Build.SUPPORTED_ABIS));
            int i3 = f9010t + 67;
            f9009o = i3 % 128;
            int i4 = i3 % 2;
        } else {
            Object[] objArr24 = new Object[1];
            m10966q("෡믛㙮૧뇫", (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 5, objArr24);
            edVar.mo9174c(((String) objArr24[0]).intern(), (Number) 1);
            if ((oVar2.f11326a == C3583t.f11529b ? (char) 22 : 3) != 3) {
                int i5 = f9010t + 111;
                f9009o = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr25 = new Object[1];
                m10965p("\n\u0014/\u0011+\u001a\u0015\u0017\u001c\u0014", 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (105 - View.MeasureSpec.getMode(0)), objArr25);
                edVar.mo9174c(((String) objArr25[0]).intern(), (Number) 1);
                C2888cg.f9550b = oVar2.f11332g;
                oVar2.f11330e.add(C2862bv.m11670a(C2790am.f8909f));
                C3000ee b2 = c.mo9132b((Object) oVar2.f11330e);
                Object[] objArr26 = new Object[1];
                m10965p("\"\u0006", TextUtils.getOffsetAfter("", 0) + 2, (byte) (104 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr26);
                edVar.mo9173c(((String) objArr26[0]).intern(), b2);
            } else {
                C2982dz dzVar2 = new C2982dz();
                dzVar2.mo9145b(C2862bv.m11670a(C2790am.f8909f));
                Object[] objArr27 = new Object[1];
                m10965p("\"\u0006", ExpandableListView.getPackedPositionType(0) + 2, (byte) (105 - Color.red(0)), objArr27);
                edVar.mo9173c(((String) objArr27[0]).intern(), (C3000ee) dzVar2);
            }
            Object[] objArr28 = new Object[1];
            m10966q("滠帲ဦ", 4 - (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)), objArr28);
            edVar.mo9174c(((String) objArr28[0]).intern(), (Number) 1);
            Object[] objArr29 = new Object[1];
            m10966q("?鬥솶옻", 4 - (KeyEvent.getMaxKeyCode() >> 16), objArr29);
            edVar.mo9175e(((String) objArr29[0]).intern(), C2888cg.f9550b);
            Object[] objArr30 = new Object[1];
            m10965p("\u0014\n\n\u0014㘦", (ViewConfiguration.getLongPressTimeout() >> 16) + 5, (byte) (KeyEvent.normalizeMetaState(0) + 61), objArr30);
            edVar.mo9175e(((String) objArr30[0]).intern(), oVar2.f11332g);
            Object[] objArr31 = new Object[1];
            m10965p("-\u0005", 3 - (AudioTrack.getMaxVolume() > Utils.FLOAT_EPSILON ? 1 : (AudioTrack.getMaxVolume() == Utils.FLOAT_EPSILON ? 0 : -1)), (byte) (71 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr31);
            edVar.mo9175e(((String) objArr31[0]).intern(), C2840bg.f9201b);
            Object[] objArr32 = new Object[1];
            m10965p(",\u0013", Color.rgb(0, 0, 0) + 16777218, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 112), objArr32);
            edVar.mo9175e(((String) objArr32[0]).intern(), f8999c);
            Object[] objArr33 = new Object[1];
            m10966q("又枽", 2 - Color.alpha(0), objArr33);
            edVar.mo9175e(((String) objArr33[0]).intern(), Build.MODEL);
            Object[] objArr34 = new Object[1];
            m10966q("씜픐", 3 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)), objArr34);
            edVar.mo9175e(((String) objArr34[0]).intern(), FaceTecSDK.version());
            Object[] objArr35 = new Object[1];
            m10965p("\u0014\n\n\u0014", 4 - TextUtils.getOffsetBefore("", 0), (byte) (113 - View.combineMeasuredStates(0, 0)), objArr35);
            edVar.mo9175e(((String) objArr35[0]).intern(), UUID.randomUUID().toString());
            Object[] objArr36 = new Object[1];
            m10965p("\n%*0\u0013-*0", 7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 102), objArr36);
            edVar.mo9175e(((String) objArr36[0]).intern(), "");
            Object[] objArr37 = new Object[1];
            m10965p("\u0014\n", Drawable.resolveOpacity(0, 0) + 2, (byte) (41 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr37);
            edVar.mo9175e(((String) objArr37[0]).intern(), f9002g);
        }
        Object[] objArr38 = new Object[1];
        m10965p("(+\u0011(-)\u0011!\u0003\u0018\u001f \u001e\u0002'%㙀", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > Utils.DOUBLE_EPSILON ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == Utils.DOUBLE_EPSILON ? 0 : -1)) + 17, (byte) (87 - KeyEvent.getDeadChar(0, 0)), objArr38);
        SharedPreferences sharedPreferences = context2.getSharedPreferences(((String) objArr38[0]).intern(), 0);
        Object[] objArr39 = new Object[1];
        m10965p("(+\u0011(-)\u0011!\u0003\u0018\u001f \u001e\u0002'%\u0003&#\u001c\u0011.%-\u0018#\f,\u0014)", 30 - (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)), (byte) (24 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr39);
        String string = sharedPreferences.getString(((String) objArr39[0]).intern(), (String) null);
        if (!(string != null)) {
            Object[] objArr40 = new Object[1];
            m10966q("芵┧⓺ဦ", 4 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), objArr40);
            edVar.mo9175e(((String) objArr40[0]).intern(), "");
        } else {
            int i7 = f9010t + 61;
            f9009o = i7 % 128;
            if ((i7 % 2 != 0 ? 0 : '\"') != '\"') {
                Object[] objArr41 = new Object[1];
                m10966q("芵┧⓺ဦ", 2 % Color.argb(1, 1, 1, 1), objArr41);
                obj = objArr41[0];
            } else {
                Object[] objArr42 = new Object[1];
                m10966q("芵┧⓺ဦ", Color.argb(0, 0, 0, 0) + 5, objArr42);
                obj = objArr42[0];
            }
            edVar.mo9175e(((String) obj).intern(), string);
        }
        String str2 = oVar2.f11327b;
        if (str2 != null) {
            int i8 = f9010t + 49;
            f9009o = i8 % 128;
            int i9 = i8 % 2;
            if ((!str2.isEmpty() ? '^' : '[') != '[') {
                Object[] objArr43 = new Object[1];
                m10966q("瘠䗃צּ樭ﰳקּצּ樭씞誁쳂㍆虐ℊ践", 15 - (ViewConfiguration.getTouchSlop() >> 8), objArr43);
                edVar.mo9175e(((String) objArr43[0]).intern(), str2);
                Object[] objArr44 = new Object[1];
                m10965p("\u0006-,\u001b0\u0003㗌㗌\u001a\u0005\u0011\u0005-&\u0006\u0016\u0017\r.\u0013-\u0006!\u0011\u0017\r\u0004\r\u000b\u001f\u000b\u0015\u0006\u0016\u0017\r\u0018\u0012\f0\u000f\u0017\u00180\u0006\u0014\u0011/%*0\u0017㗿", 53 - Color.blue(0), (byte) (-16777193 - Color.rgb(0, 0, 0)), objArr44);
                str = ((String) objArr44[0]).intern();
                final C2806c cVar2 = cVar;
                this.f9012j.mo9507b(C3147g.m12933b(context2, str, (Object) edVar)).mo9460b(new C3248jj() {
                    /* renamed from: a */
                    public final void mo8841a(C3295kc kcVar) {
                        if (kcVar.mo9605a()) {
                            C2802au.f8998b++;
                            cVar2.mo8865d();
                            return;
                        }
                        cVar2.mo8866e(z2);
                    }

                    /* renamed from: b */
                    public final void mo8842b() {
                        cVar2.mo8866e(z2);
                    }
                });
            }
        }
        Object[] objArr45 = new Object[1];
        m10965p("\u0006-,\u001b0\u0003㘯㘯,\u001a\n\"\u0006\u0016\u0017\r.\u0013-\u0006!\u0011\u0017\r\u001a.\u001b\t\u0017\u0004\n\u001c\u000b\u0015\u0006\u0016\u0017\r\u0018.-\u00030\n\u0015\u0017", ((byte) KeyEvent.getModifierMetaStateMask()) + 47, (byte) (Color.red(0) + 122), objArr45);
        str = ((String) objArr45[0]).intern();
        try {
            final C2806c cVar22 = cVar;
            this.f9012j.mo9507b(C3147g.m12933b(context2, str, (Object) edVar)).mo9460b(new C3248jj() {
                /* renamed from: a */
                public final void mo8841a(C3295kc kcVar) {
                    if (kcVar.mo9605a()) {
                        C2802au.f8998b++;
                        cVar22.mo8865d();
                        return;
                    }
                    cVar22.mo8866e(z2);
                }

                /* renamed from: b */
                public final void mo8842b() {
                    cVar22.mo8866e(z2);
                }
            });
        } catch (C3147g.C3148e e) {
            e.printStackTrace();
        }
    }
}
