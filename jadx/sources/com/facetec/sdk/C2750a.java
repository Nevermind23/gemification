package com.facetec.sdk;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.github.mikephil.charting.utils.Utils;
import com.guardsquare.dexguard.annotation.EncryptStrings;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

@EncryptStrings
/* renamed from: com.facetec.sdk.a */
final class C2750a {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: a */
    private static C2750a f8697a = null;

    /* renamed from: d */
    private static byte[] f8698d = null;

    /* renamed from: e */
    public static final int f8699e = 0;

    /* renamed from: f */
    private static char[] f8700f;

    /* renamed from: h */
    private static byte[] f8701h;

    /* renamed from: i */
    private static Object f8702i = new Object();

    /* renamed from: j */
    private static /* synthetic */ boolean f8703j;

    /* renamed from: k */
    private static char[] f8704k;

    /* renamed from: l */
    private static int f8705l;

    /* renamed from: m */
    private static boolean f8706m;

    /* renamed from: n */
    private static boolean f8707n;

    /* renamed from: o */
    private static char f8708o;

    /* renamed from: p */
    private static int f8709p;

    /* renamed from: t */
    private static int f8710t;

    /* renamed from: b */
    private boolean f8711b = true;

    /* renamed from: c */
    private C2752e f8712c = new C2752e();

    /* renamed from: g */
    private C2764aa f8713g;

    /* renamed from: com.facetec.sdk.a$1 */
    static /* synthetic */ class C27511 {

        /* renamed from: c */
        static final /* synthetic */ int[] f8714c;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facetec.sdk.a$e$e[] r0 = com.facetec.sdk.C2750a.C2752e.C2753e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8714c = r0
                com.facetec.sdk.a$e$e r1 = com.facetec.sdk.C2750a.C2752e.C2753e.ID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8714c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.a$e$e r1 = com.facetec.sdk.C2750a.C2752e.C2753e.APP_SEND_DIAGNOSTICS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8714c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.a$e$e r1 = com.facetec.sdk.C2750a.C2752e.C2753e.DIAGNOSTICS_SIZE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8714c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.a$e$e r1 = com.facetec.sdk.C2750a.C2752e.C2753e.CACHE_KEY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8714c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.a$e$e r1 = com.facetec.sdk.C2750a.C2752e.C2753e.IS_VERSION_DEPRECATED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8714c     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facetec.sdk.a$e$e r1 = com.facetec.sdk.C2750a.C2752e.C2753e.RECENT_FAILURES     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8714c     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facetec.sdk.a$e$e r1 = com.facetec.sdk.C2750a.C2752e.C2753e.APPLICATION_ID     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8714c     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facetec.sdk.a$e$e r1 = com.facetec.sdk.C2750a.C2752e.C2753e.IS_LATEST_VERSION     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2750a.C27511.<clinit>():void");
        }
    }

    /* renamed from: com.facetec.sdk.a$e */
    static class C2752e {

        /* renamed from: a */
        Integer f8715a = 10;

        /* renamed from: b */
        String f8716b;

        /* renamed from: c */
        Boolean f8717c;

        /* renamed from: d */
        Boolean f8718d;

        /* renamed from: e */
        String f8719e;

        /* renamed from: g */
        Integer f8720g;

        /* renamed from: i */
        private Boolean f8721i;

        /* renamed from: j */
        Integer f8722j;

        /* renamed from: com.facetec.sdk.a$e$e */
        enum C2753e {
            ID("id"),
            APP_SEND_DIAGNOSTICS("sd"),
            DIAGNOSTICS_SIZE("ds"),
            CACHE_KEY("ck"),
            IS_VERSION_DEPRECATED("vd"),
            RECENT_FAILURES("rf"),
            APPLICATION_ID("ai"),
            IS_LATEST_VERSION("lv");
            

            /* renamed from: h */
            final String f8732h;

            private C2753e(String str) {
                this.f8732h = str;
            }
        }

        C2752e() {
            Boolean bool = Boolean.FALSE;
            this.f8718d = bool;
            this.f8717c = bool;
            this.f8721i = Boolean.TRUE;
        }

        /* renamed from: b */
        static C2752e m10698b(JSONObject jSONObject) {
            C2752e eVar = new C2752e();
            for (C2753e eVar2 : C2753e.values()) {
                switch (C27511.f8714c[eVar2.ordinal()]) {
                    case 1:
                        eVar.f8716b = jSONObject.getString(eVar2.f8732h);
                        break;
                    case 2:
                        eVar.f8718d = Boolean.valueOf(jSONObject.getBoolean(eVar2.f8732h));
                        break;
                    case 3:
                        eVar.f8715a = Integer.valueOf(jSONObject.getInt(eVar2.f8732h));
                        break;
                    case 4:
                        eVar.f8719e = jSONObject.getString(eVar2.f8732h);
                        break;
                    case 5:
                        eVar.f8717c = Boolean.valueOf(jSONObject.getBoolean(eVar2.f8732h));
                        break;
                    case 6:
                        eVar.f8720g = Integer.valueOf(jSONObject.getInt(eVar2.f8732h));
                        break;
                    case 7:
                        eVar.f8722j = Integer.valueOf(jSONObject.getInt(eVar2.f8732h));
                        break;
                    case 8:
                        eVar.f8721i = Boolean.valueOf(jSONObject.getBoolean(eVar2.f8732h));
                        break;
                }
            }
            return eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final String mo8796d() {
            JSONObject jSONObject = new JSONObject();
            try {
                for (C2753e eVar : C2753e.values()) {
                    switch (C27511.f8714c[eVar.ordinal()]) {
                        case 1:
                            jSONObject.put(eVar.f8732h, this.f8716b);
                            break;
                        case 2:
                            jSONObject.put(eVar.f8732h, this.f8718d);
                            break;
                        case 3:
                            jSONObject.put(eVar.f8732h, this.f8715a);
                            break;
                        case 4:
                            jSONObject.put(eVar.f8732h, this.f8719e);
                            break;
                        case 5:
                            jSONObject.put(eVar.f8732h, this.f8717c);
                            break;
                        case 6:
                            jSONObject.put(eVar.f8732h, this.f8720g);
                            break;
                        case 7:
                            jSONObject.put(eVar.f8732h, this.f8722j);
                            break;
                        case 8:
                            jSONObject.put(eVar.f8732h, this.f8721i);
                            break;
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject.toString();
        }
    }

    static {
        char c;
        init$0();
        boolean z = false;
        f8710t = 0;
        f8709p = 1;
        m10687d();
        m10681b();
        int i = f8709p + 19;
        int i2 = i % 128;
        f8710t = i2;
        if (i % 2 != 0) {
            c = '1';
        } else {
            c = '3';
        }
        if (c == '3') {
            z = true;
        }
        f8703j = z;
        int i3 = i2 + 31;
        f8709p = i3 % 128;
        int i4 = i3 % 2;
    }

    private C2750a(Context context) {
        this.f8713g = new C2764aa(context);
        try {
            byte[] a = C2843bh.m11407a(context, m10692i(context), m10691g(context));
            JSONObject jSONObject = new JSONObject(new String(a, 0, a.length, StandardCharsets.UTF_8));
            Object[] objArr = new Object[1];
            m10694q("\t\u000e\f\t\u000f\u0018\f\u0017㙝", (ViewConfiguration.getPressedStateDuration() >> 16) + 9, (byte) (94 - TextUtils.indexOf("", "", 0)), objArr);
            this.f8711b = jSONObject.optBoolean(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            m10695r((String) null, (int[]) null, View.MeasureSpec.getSize(0) + C11051p3.f31760d, "", objArr2);
            String optString = jSONObject.optString(((String) objArr2[0]).intern(), "");
            Object[] objArr3 = new Object[1];
            m10695r((String) null, (int[]) null, View.resolveSize(0, 0) + C11051p3.f31760d, "", objArr3);
            JSONObject optJSONObject = jSONObject.optJSONObject(((String) objArr3[0]).intern());
            if (!optString.isEmpty()) {
                this.f8712c = C2752e.m10698b(new JSONObject(optString));
            }
            if (optJSONObject != null) {
                this.f8713g = C2764aa.m10702a(context, optJSONObject.toString());
            }
        } catch (Exception e) {
            C3330l.m13346d(e);
        }
    }

    /* renamed from: a */
    private static synchronized C2750a m10680a(Context context) {
        C2750a aVar;
        synchronized (C2750a.class) {
            int i = f8709p + 1;
            f8710t = i % 128;
            int i2 = i % 2;
            if (f8697a == null) {
                f8697a = new C2750a(context);
                int i3 = f8710t + 3;
                f8709p = i3 % 128;
                int i4 = i3 % 2;
            }
            aVar = f8697a;
        }
        return aVar;
    }

    /* renamed from: b */
    static void m10681b() {
        int i = f8709p;
        int i2 = i + 119;
        f8710t = i2 % 128;
        int i3 = i2 % 2;
        f8701h = new byte[]{126, -117, 50, 27, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
        f8699e = 156;
        int i4 = i + 85;
        f8710t = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.facetec.sdk.aa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.content.Context} */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1 = new com.facetec.sdk.C2764aa(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        return r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001f */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized com.facetec.sdk.C2764aa m10684c(android.content.Context r3) {
        /*
            java.lang.Class<com.facetec.sdk.a> r0 = com.facetec.sdk.C2750a.class
            monitor-enter(r0)
            int r1 = f8710t     // Catch:{ all -> 0x0026 }
            int r1 = r1 + 23
            int r2 = r1 % 128
            f8709p = r2     // Catch:{ all -> 0x0026 }
            int r1 = r1 % 2
            com.facetec.sdk.a r1 = m10680a(r3)     // Catch:{ Exception -> 0x001f }
            com.facetec.sdk.aa r3 = r1.f8713g     // Catch:{ Exception -> 0x001f }
            int r1 = f8710t     // Catch:{ all -> 0x0026 }
            int r1 = r1 + 71
            int r2 = r1 % 128
            f8709p = r2     // Catch:{ all -> 0x0026 }
            int r1 = r1 % 2
            monitor-exit(r0)
            return r3
        L_0x001f:
            com.facetec.sdk.aa r1 = new com.facetec.sdk.aa     // Catch:{ all -> 0x0026 }
            r1.<init>(r3)     // Catch:{ all -> 0x0026 }
            monitor-exit(r0)
            return r1
        L_0x0026:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2750a.m10684c(android.content.Context):com.facetec.sdk.aa");
    }

    /* renamed from: d */
    static void m10687d() {
        f8708o = 9121;
        f8700f = new char[]{5727, 5706, 5541, 5721, 5719, 5715, 5708, 5723, 5644, 5709, 5741, 5712, 5720, 5713, 5754, 5729, 5736, 5662, 5732, 5704, 5747, 5759, 5722, 5710, 5540};
        f8706m = true;
        f8705l = -2032437663;
        f8704k = new char[]{30700, 30682, 30701, 30678, 30675, 30680, 30683, 30685, 30703, 30686, 30672, 30674, 30673, 30656, 30681, 30663, 30270, 30269, 30260, 30694};
        f8707n = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        if (f8697a != null) goto L_0x002a;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized com.facetec.sdk.C2750a.C2752e m10689e() {
        /*
            java.lang.Class<com.facetec.sdk.a> r0 = com.facetec.sdk.C2750a.class
            monitor-enter(r0)
            int r1 = f8710t     // Catch:{ all -> 0x006f }
            int r2 = r1 + 67
            int r3 = r2 % 128
            f8709p = r3     // Catch:{ all -> 0x006f }
            int r2 = r2 % 2
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0013
            r2 = r3
            goto L_0x0014
        L_0x0013:
            r2 = r4
        L_0x0014:
            if (r2 == r3) goto L_0x0023
            com.facetec.sdk.a r2 = f8697a     // Catch:{ all -> 0x006f }
            r5 = 54
            if (r2 == 0) goto L_0x001f
            r2 = 36
            goto L_0x0020
        L_0x001f:
            r2 = r5
        L_0x0020:
            if (r2 == r5) goto L_0x003e
            goto L_0x002a
        L_0x0023:
            com.facetec.sdk.a r2 = f8697a     // Catch:{ all -> 0x006f }
            r5 = 73
            int r5 = r5 / r4
            if (r2 == 0) goto L_0x003e
        L_0x002a:
            com.facetec.sdk.a r2 = f8697a     // Catch:{ all -> 0x006f }
            com.facetec.sdk.a$e r2 = r2.f8712c     // Catch:{ all -> 0x006f }
            int r1 = r1 + 103
            int r3 = r1 % 128
            f8709p = r3     // Catch:{ all -> 0x006f }
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x003a
            monitor-exit(r0)
            return r2
        L_0x003a:
            r1 = 0
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006f }
        L_0x003e:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "\f\u0005㙝㙝\u0001\u000e\u0004\b\u000f\u0007\t\u000e\u000e\t\r\u0001"
            int r5 = android.view.ViewConfiguration.getJumpTapTimeout()     // Catch:{ Exception -> 0x0062 }
            int r5 = r5 >> 16
            int r5 = 16 - r5
            int r6 = android.view.View.MeasureSpec.getMode(r4)     // Catch:{ Exception -> 0x0062 }
            int r6 = r6 + 111
            byte r6 = (byte) r6     // Catch:{ Exception -> 0x0062 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0062 }
            m10694q(r2, r5, r6, r3)     // Catch:{ Exception -> 0x0062 }
            r2 = r3[r4]     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = r2.intern()     // Catch:{ Exception -> 0x0062 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0062 }
            throw r1     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            r1 = move-exception
            com.facetec.sdk.C3330l.m13346d(r1)     // Catch:{ all -> 0x006f }
            com.facetec.sdk.a$e r1 = new com.facetec.sdk.a$e     // Catch:{ all -> 0x006f }
            r1.<init>()     // Catch:{ all -> 0x006f }
            monitor-exit(r0)
            return r1
        L_0x006d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006f }
        L_0x006f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2750a.m10689e():com.facetec.sdk.a$e");
    }

    /* renamed from: g */
    private static byte[] m10691g(Context context) {
        int i = f8709p + 111;
        f8710t = i % 128;
        int i2 = i % 2;
        byte[] e = m10690e(context);
        Object[] objArr = new Object[1];
        m10695r((String) null, (int[]) null, 128 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)), "", objArr);
        byte[] e2 = C2844bi.m11422e(e, ((String) objArr[0]).intern());
        int i3 = f8710t + 115;
        f8709p = i3 % 128;
        int i4 = i3 % 2;
        return e2;
    }

    /* renamed from: i */
    private static String m10692i(Context context) {
        boolean z;
        int i = f8709p + 9;
        f8710t = i % 128;
        if (i % 2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            byte[] e = m10690e(context);
            Object[] objArr = new Object[1];
            m10694q("\u0017\u0012\n\b\u0016\u0018\u0018\r\u0001\u0002\u0001\u000f㘗", Color.alpha(0) + 13, (byte) (112 - (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1))), objArr);
            return C2844bi.m11416b(e, ((String) objArr[0]).intern());
        }
        byte[] e2 = m10690e(context);
        Object[] objArr2 = new Object[1];
        m10694q("\u0017\u0012\n\b\u0016\u0018\u0018\r\u0001\u0002\u0001\u000f㘗", 125 >>> Color.alpha(0), (byte) (68 - (SystemClock.uptimeMillis() > 1 ? 1 : (SystemClock.uptimeMillis() == 1 ? 0 : -1))), objArr2);
        return C2844bi.m11416b(e2, ((String) objArr2[0]).intern());
    }

    static void init$0() {
        $$a = new byte[]{93, -62, 7, -11};
        $$b = 161;
    }

    /* renamed from: j */
    private static byte[] m10693j(Context context) {
        byte[] bArr;
        boolean z;
        ContentResolver contentResolver = context.getContentResolver();
        boolean z2 = false;
        Object[] objArr = new Object[1];
        m10694q("\u0001\n\u0015\u0007\u000e\u0003\u0014\u0011\u0002\u0018", (ViewConfiguration.getScrollBarSize() >> 8) + 10, (byte) (TextUtils.indexOf("", '0', 0) + 5), objArr);
        String string = Settings.Secure.getString(contentResolver, ((String) objArr[0]).intern());
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(string);
        Object[] objArr2 = new Object[1];
        m10695r((String) null, (int[]) null, Color.green(0) + C11051p3.f31760d, "", objArr2);
        sb.append(((String) objArr2[0]).intern());
        String d = C2844bi.m11419d(sb.toString());
        try {
            bArr = C2843bh.m11414e(context, d);
            int i = f8710t + 7;
            f8709p = i % 128;
            int i2 = i % 2;
        } catch (FileNotFoundException unused) {
            bArr = null;
        }
        if (bArr == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getPackageName());
            Object[] objArr3 = new Object[1];
            m10694q("\u0001\n\u0015\u0007\u000e\u0003\u0014\u0011\u0002\u0018", Drawable.resolveOpacity(0, 0) + 10, (byte) (3 - TextUtils.indexOf("", '0', 0, 0)), objArr3);
            sb2.append(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            m10695r((String) null, (int[]) null, 127 - (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) > Utils.FLOAT_EPSILON ? 1 : (PointF.length(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON) == Utils.FLOAT_EPSILON ? 0 : -1)), "", objArr4);
            sb2.append(((String) objArr4[0]).intern());
            try {
                bArr = C2843bh.m11414e(context, C2844bi.m11419d(sb2.toString()));
                C2843bh.m11413e(context, d, bArr);
                int i3 = f8710t + 51;
                f8709p = i3 % 128;
                int i4 = i3 % 2;
            } catch (FileNotFoundException unused2) {
            }
        }
        if (bArr == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int i5 = f8710t + 125;
            f8709p = i5 % 128;
            if (i5 % 2 != 0) {
                z2 = true;
            }
            if (!z2) {
                bArr = C2810ax.m10993b(26, 16009);
                C2843bh.m11413e(context, d, bArr);
            } else {
                bArr = C2810ax.m10993b(32, 128);
                C2843bh.m11413e(context, d, bArr);
            }
        }
        int i6 = f8709p + 99;
        f8710t = i6 % 128;
        int i7 = i6 % 2;
        return bArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: char[]} */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10694q(java.lang.String r29, int r30, byte r31, java.lang.Object[] r32) {
        /*
            r0 = r30
            r1 = 1
            r2 = 0
            if (r29 == 0) goto L_0x0008
            r3 = r2
            goto L_0x0009
        L_0x0008:
            r3 = r1
        L_0x0009:
            if (r3 == 0) goto L_0x000e
            r3 = r29
            goto L_0x0012
        L_0x000e:
            char[] r3 = r29.toCharArray()
        L_0x0012:
            char[] r3 = (char[]) r3
            com.facetec.sdk.gh r4 = new com.facetec.sdk.gh
            r4.<init>()
            char[] r5 = f8700f
            r6 = 48
            java.lang.String r7 = "d"
            java.lang.String r8 = ""
            r10 = -563486590(0xffffffffde69e082, float:-4.21315319E18)
            r11 = 0
            if (r5 == 0) goto L_0x009d
            int r12 = r5.length
            char[] r13 = new char[r12]
            r14 = r2
        L_0x002b:
            if (r14 >= r12) goto L_0x002f
            r15 = r2
            goto L_0x0030
        L_0x002f:
            r15 = r1
        L_0x0030:
            if (r15 == r1) goto L_0x009c
            char r15 = r5[r14]
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ all -> 0x0093 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0093 }
            r9[r2] = r15     // Catch:{ all -> 0x0093 }
            java.util.Map<java.lang.Integer, java.lang.Object> r15 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0093 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0093 }
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x0093 }
            if (r1 == 0) goto L_0x0049
            goto L_0x007b
        L_0x0049:
            float r1 = android.util.TypedValue.complexToFraction(r2, r11, r11)     // Catch:{ all -> 0x0093 }
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            int r1 = r1 + 6874
            char r1 = (char) r1     // Catch:{ all -> 0x0093 }
            int r10 = android.text.TextUtils.lastIndexOf(r8, r6)     // Catch:{ all -> 0x0093 }
            int r10 = r10 + 1861
            float r18 = android.media.AudioTrack.getMaxVolume()     // Catch:{ all -> 0x0093 }
            int r18 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            int r6 = r18 + 23
            java.lang.Object r1 = com.facetec.sdk.C2854bp.m11559b(r1, r10, r6)     // Catch:{ all -> 0x0093 }
            java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ all -> 0x0093 }
            r6 = 1
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ all -> 0x0093 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0093 }
            r10[r2] = r6     // Catch:{ all -> 0x0093 }
            java.lang.reflect.Method r1 = r1.getMethod(r7, r10)     // Catch:{ all -> 0x0093 }
            r6 = -563486590(0xffffffffde69e082, float:-4.21315319E18)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0093 }
            r15.put(r10, r1)     // Catch:{ all -> 0x0093 }
        L_0x007b:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch:{ all -> 0x0093 }
            r6 = 0
            java.lang.Object r1 = r1.invoke(r6, r9)     // Catch:{ all -> 0x0093 }
            java.lang.Character r1 = (java.lang.Character) r1     // Catch:{ all -> 0x0093 }
            char r1 = r1.charValue()     // Catch:{ all -> 0x0093 }
            r13[r14] = r1
            int r14 = r14 + 1
            r1 = 1
            r6 = 48
            r10 = -563486590(0xffffffffde69e082, float:-4.21315319E18)
            goto L_0x002b
        L_0x0093:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x009b
            throw r1
        L_0x009b:
            throw r0
        L_0x009c:
            r5 = r13
        L_0x009d:
            char r1 = f8708o
            r6 = 1
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x0349 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0349 }
            r9[r2] = r1     // Catch:{ all -> 0x0349 }
            java.util.Map<java.lang.Integer, java.lang.Object> r1 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0349 }
            r6 = -563486590(0xffffffffde69e082, float:-4.21315319E18)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0349 }
            java.lang.Object r6 = r1.get(r10)     // Catch:{ all -> 0x0349 }
            if (r6 == 0) goto L_0x00b8
            goto L_0x00e8
        L_0x00b8:
            int r6 = android.view.ViewConfiguration.getKeyRepeatDelay()     // Catch:{ all -> 0x0349 }
            int r6 = r6 >> 16
            int r6 = 6874 - r6
            char r6 = (char) r6     // Catch:{ all -> 0x0349 }
            int r10 = android.view.View.resolveSize(r2, r2)     // Catch:{ all -> 0x0349 }
            int r10 = r10 + 1860
            int r8 = android.text.TextUtils.getCapsMode(r8, r2, r2)     // Catch:{ all -> 0x0349 }
            int r8 = r8 + 24
            java.lang.Object r6 = com.facetec.sdk.C2854bp.m11559b(r6, r10, r8)     // Catch:{ all -> 0x0349 }
            java.lang.Class r6 = (java.lang.Class) r6     // Catch:{ all -> 0x0349 }
            r8 = 1
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x0349 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0349 }
            r10[r2] = r8     // Catch:{ all -> 0x0349 }
            java.lang.reflect.Method r6 = r6.getMethod(r7, r10)     // Catch:{ all -> 0x0349 }
            r7 = -563486590(0xffffffffde69e082, float:-4.21315319E18)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0349 }
            r1.put(r7, r6)     // Catch:{ all -> 0x0349 }
        L_0x00e8:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch:{ all -> 0x0349 }
            r1 = 0
            java.lang.Object r6 = r6.invoke(r1, r9)     // Catch:{ all -> 0x0349 }
            java.lang.Character r6 = (java.lang.Character) r6     // Catch:{ all -> 0x0349 }
            char r1 = r6.charValue()     // Catch:{ all -> 0x0349 }
            char[] r6 = new char[r0]
            int r7 = r0 % 2
            r8 = 2
            if (r7 == 0) goto L_0x010f
            int r7 = r0 + -1
            char r9 = r3[r7]
            int r9 = r9 - r31
            char r9 = (char) r9
            r6[r7] = r9
            int r9 = $11
            int r9 = r9 + 53
            int r10 = r9 % 128
            $10 = r10
            int r9 = r9 % r8
            goto L_0x0110
        L_0x010f:
            r7 = r0
        L_0x0110:
            r9 = 1
            if (r7 <= r9) goto L_0x0116
            r9 = 70
            goto L_0x0118
        L_0x0116:
            r9 = 17
        L_0x0118:
            r10 = 70
            if (r9 == r10) goto L_0x011e
            goto L_0x0334
        L_0x011e:
            int r9 = $11
            int r9 = r9 + 109
            int r10 = r9 % 128
            $10 = r10
            int r9 = r9 % r8
            r4.f10448c = r2
        L_0x0129:
            int r9 = r4.f10448c
            if (r9 >= r7) goto L_0x0334
            char r10 = r3[r9]
            r4.f10449d = r10
            int r12 = r9 + 1
            char r12 = r3[r12]
            r4.f10447b = r12
            if (r10 != r12) goto L_0x014b
            int r10 = r10 - r31
            char r10 = (char) r10
            r6[r9] = r10
            int r9 = r9 + 1
            int r12 = r12 - r31
            char r10 = (char) r12
            r6[r9] = r10
            r8 = 0
            r9 = 1
            r19 = 48
            goto L_0x0318
        L_0x014b:
            r9 = 13
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x032b }
            r10 = 12
            r9[r10] = r4     // Catch:{ all -> 0x032b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x032b }
            r12 = 11
            r9[r12] = r10     // Catch:{ all -> 0x032b }
            r10 = 10
            r9[r10] = r4     // Catch:{ all -> 0x032b }
            r13 = 9
            r9[r13] = r4     // Catch:{ all -> 0x032b }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x032b }
            r15 = 8
            r9[r15] = r14     // Catch:{ all -> 0x032b }
            r14 = 7
            r9[r14] = r4     // Catch:{ all -> 0x032b }
            r17 = 6
            r9[r17] = r4     // Catch:{ all -> 0x032b }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x032b }
            r20 = 5
            r9[r20] = r18     // Catch:{ all -> 0x032b }
            r18 = 4
            r9[r18] = r4     // Catch:{ all -> 0x032b }
            r21 = 3
            r9[r21] = r4     // Catch:{ all -> 0x032b }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x032b }
            r9[r8] = r22     // Catch:{ all -> 0x032b }
            r16 = 1
            r9[r16] = r4     // Catch:{ all -> 0x032b }
            r9[r2] = r4     // Catch:{ all -> 0x032b }
            java.util.Map<java.lang.Integer, java.lang.Object> r12 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x032b }
            r23 = -1127895707(0xffffffffbcc5ad65, float:-0.024130533)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x032b }
            java.lang.Object r10 = r12.get(r10)     // Catch:{ all -> 0x032b }
            java.lang.Class<java.lang.Object> r23 = java.lang.Object.class
            if (r10 == 0) goto L_0x01a2
            r19 = 48
            goto L_0x01fd
        L_0x01a2:
            long r25 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch:{ all -> 0x032b }
            r27 = 0
            int r10 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            int r10 = 27869 - r10
            char r10 = (char) r10     // Catch:{ all -> 0x032b }
            float r25 = android.util.TypedValue.complexToFloat(r2)     // Catch:{ all -> 0x032b }
            int r25 = (r25 > r11 ? 1 : (r25 == r11 ? 0 : -1))
            int r11 = 123 - r25
            r19 = 48
            char r25 = android.text.AndroidCharacter.getMirror(r19)     // Catch:{ all -> 0x032b }
            int r13 = r25 + -24
            java.lang.Object r10 = com.facetec.sdk.C2854bp.m11559b(r10, r11, r13)     // Catch:{ all -> 0x032b }
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x032b }
            java.lang.String r11 = "c"
            r13 = 13
            java.lang.Class[] r13 = new java.lang.Class[r13]     // Catch:{ all -> 0x032b }
            r13[r2] = r23     // Catch:{ all -> 0x032b }
            r16 = 1
            r13[r16] = r23     // Catch:{ all -> 0x032b }
            java.lang.Class r25 = java.lang.Integer.TYPE     // Catch:{ all -> 0x032b }
            r13[r8] = r25     // Catch:{ all -> 0x032b }
            r13[r21] = r23     // Catch:{ all -> 0x032b }
            r13[r18] = r23     // Catch:{ all -> 0x032b }
            r13[r20] = r25     // Catch:{ all -> 0x032b }
            r13[r17] = r23     // Catch:{ all -> 0x032b }
            r13[r14] = r23     // Catch:{ all -> 0x032b }
            r13[r15] = r25     // Catch:{ all -> 0x032b }
            r27 = 9
            r13[r27] = r23     // Catch:{ all -> 0x032b }
            r24 = 10
            r13[r24] = r23     // Catch:{ all -> 0x032b }
            r22 = 11
            r13[r22] = r25     // Catch:{ all -> 0x032b }
            r25 = 12
            r13[r25] = r23     // Catch:{ all -> 0x032b }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r13)     // Catch:{ all -> 0x032b }
            r11 = -1127895707(0xffffffffbcc5ad65, float:-0.024130533)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x032b }
            r12.put(r11, r10)     // Catch:{ all -> 0x032b }
        L_0x01fd:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch:{ all -> 0x032b }
            r11 = 0
            java.lang.Object r9 = r10.invoke(r11, r9)     // Catch:{ all -> 0x032b }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x032b }
            int r9 = r9.intValue()     // Catch:{ all -> 0x032b }
            int r10 = r4.f10451f
            if (r9 != r10) goto L_0x02e1
            int r9 = $10
            int r9 = r9 + 43
            int r10 = r9 % 128
            $11 = r10
            int r9 = r9 % r8
            r9 = 11
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x02d8 }
            r9 = 10
            r10[r9] = r4     // Catch:{ all -> 0x02d8 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x02d8 }
            r11 = 9
            r10[r11] = r9     // Catch:{ all -> 0x02d8 }
            r10[r15] = r4     // Catch:{ all -> 0x02d8 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x02d8 }
            r10[r14] = r9     // Catch:{ all -> 0x02d8 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x02d8 }
            r10[r17] = r9     // Catch:{ all -> 0x02d8 }
            r10[r20] = r4     // Catch:{ all -> 0x02d8 }
            r10[r18] = r4     // Catch:{ all -> 0x02d8 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x02d8 }
            r10[r21] = r9     // Catch:{ all -> 0x02d8 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x02d8 }
            r10[r8] = r9     // Catch:{ all -> 0x02d8 }
            r9 = 1
            r10[r9] = r4     // Catch:{ all -> 0x02d8 }
            r10[r2] = r4     // Catch:{ all -> 0x02d8 }
            r9 = -190269654(0xfffffffff4a8b72a, float:-1.0693614E32)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x02d8 }
            java.lang.Object r9 = r12.get(r9)     // Catch:{ all -> 0x02d8 }
            if (r9 == 0) goto L_0x0258
            goto L_0x02b8
        L_0x0258:
            int r9 = android.view.View.resolveSize(r2, r2)     // Catch:{ all -> 0x02d8 }
            r11 = 34365(0x863d, float:4.8156E-41)
            int r11 = r11 - r9
            char r9 = (char) r11     // Catch:{ all -> 0x02d8 }
            int r11 = android.graphics.drawable.Drawable.resolveOpacity(r2, r2)     // Catch:{ all -> 0x02d8 }
            int r11 = r11 + 640
            r13 = 0
            float r25 = android.graphics.PointF.length(r13, r13)     // Catch:{ all -> 0x02d8 }
            int r25 = (r25 > r13 ? 1 : (r25 == r13 ? 0 : -1))
            int r13 = r25 + 23
            java.lang.Object r9 = com.facetec.sdk.C2854bp.m11559b(r9, r11, r13)     // Catch:{ all -> 0x02d8 }
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ all -> 0x02d8 }
            byte r11 = (byte) r2     // Catch:{ all -> 0x02d8 }
            byte r13 = (byte) r11     // Catch:{ all -> 0x02d8 }
            int r15 = r13 + 1
            byte r15 = (byte) r15     // Catch:{ all -> 0x02d8 }
            r14 = 1
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x02d8 }
            m10697u(r11, r13, r15, r8)     // Catch:{ all -> 0x02d8 }
            r8 = r8[r2]     // Catch:{ all -> 0x02d8 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x02d8 }
            r11 = 11
            java.lang.Class[] r11 = new java.lang.Class[r11]     // Catch:{ all -> 0x02d8 }
            r11[r2] = r23     // Catch:{ all -> 0x02d8 }
            r13 = 1
            r11[r13] = r23     // Catch:{ all -> 0x02d8 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x02d8 }
            r14 = 2
            r11[r14] = r13     // Catch:{ all -> 0x02d8 }
            r11[r21] = r13     // Catch:{ all -> 0x02d8 }
            r11[r18] = r23     // Catch:{ all -> 0x02d8 }
            r11[r20] = r23     // Catch:{ all -> 0x02d8 }
            r11[r17] = r13     // Catch:{ all -> 0x02d8 }
            r14 = 7
            r11[r14] = r13     // Catch:{ all -> 0x02d8 }
            r14 = 8
            r11[r14] = r23     // Catch:{ all -> 0x02d8 }
            r14 = 9
            r11[r14] = r13     // Catch:{ all -> 0x02d8 }
            r13 = 10
            r11[r13] = r23     // Catch:{ all -> 0x02d8 }
            java.lang.reflect.Method r9 = r9.getMethod(r8, r11)     // Catch:{ all -> 0x02d8 }
            r8 = -190269654(0xfffffffff4a8b72a, float:-1.0693614E32)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x02d8 }
            r12.put(r8, r9)     // Catch:{ all -> 0x02d8 }
        L_0x02b8:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch:{ all -> 0x02d8 }
            r8 = 0
            java.lang.Object r9 = r9.invoke(r8, r10)     // Catch:{ all -> 0x02d8 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x02d8 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x02d8 }
            int r10 = r4.f10450e
            int r10 = r10 * r1
            int r11 = r4.f10451f
            int r10 = r10 + r11
            int r11 = r4.f10448c
            char r9 = r5[r9]
            r6[r11] = r9
            r9 = 1
            int r11 = r11 + r9
            char r9 = r5[r10]
            r6[r11] = r9
            goto L_0x0304
        L_0x02d8:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02e0
            throw r1
        L_0x02e0:
            throw r0
        L_0x02e1:
            r8 = 0
            int r9 = r4.f10446a
            int r11 = r4.f10450e
            if (r9 != r11) goto L_0x0306
            int r12 = r4.f10452i
            int r12 = r12 + r1
            r13 = 1
            int r12 = r12 - r13
            int r12 = r12 % r1
            r4.f10452i = r12
            int r10 = r10 + r1
            int r10 = r10 - r13
            int r10 = r10 % r1
            r4.f10451f = r10
            int r9 = r9 * r1
            int r9 = r9 + r12
            int r11 = r11 * r1
            int r11 = r11 + r10
            int r10 = r4.f10448c
            char r9 = r5[r9]
            r6[r10] = r9
            int r10 = r10 + r13
            char r9 = r5[r11]
            r6[r10] = r9
        L_0x0304:
            r9 = 1
            goto L_0x0318
        L_0x0306:
            int r9 = r9 * r1
            int r9 = r9 + r10
            int r11 = r11 * r1
            int r10 = r4.f10452i
            int r11 = r11 + r10
            int r10 = r4.f10448c
            char r9 = r5[r9]
            r6[r10] = r9
            r9 = 1
            int r10 = r10 + r9
            char r11 = r5[r11]
            r6[r10] = r11
        L_0x0318:
            int r10 = r4.f10448c
            r11 = 2
            int r10 = r10 + r11
            r4.f10448c = r10
            int r10 = $10
            int r10 = r10 + 85
            int r12 = r10 % 128
            $11 = r12
            int r10 = r10 % r11
            r8 = r11
            r11 = 0
            goto L_0x0129
        L_0x032b:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0333
            throw r1
        L_0x0333:
            throw r0
        L_0x0334:
            r1 = r2
        L_0x0335:
            if (r1 >= r0) goto L_0x0341
            char r3 = r6[r1]
            r3 = r3 ^ 13722(0x359a, float:1.9229E-41)
            char r3 = (char) r3
            r6[r1] = r3
            int r1 = r1 + 1
            goto L_0x0335
        L_0x0341:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6)
            r32[r2] = r0
            return
        L_0x0349:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0351
            throw r1
        L_0x0351:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2750a.m10694q(java.lang.String, int, byte, java.lang.Object[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10695r(java.lang.String r21, int[] r22, int r23, java.lang.String r24, java.lang.Object[] r25) {
        /*
            r0 = r22
            r1 = r24
            r2 = 54
            if (r1 == 0) goto L_0x000a
            r3 = r2
            goto L_0x000c
        L_0x000a:
            r3 = 89
        L_0x000c:
            r4 = 2
            if (r3 == r2) goto L_0x0010
            goto L_0x0028
        L_0x0010:
            int r2 = $10
            int r2 = r2 + 63
            int r3 = r2 % 128
            $11 = r3
            int r2 = r2 % r4
            java.lang.String r2 = "ISO-8859-1"
            byte[] r1 = r1.getBytes(r2)
            int r2 = $10
            int r2 = r2 + 119
            int r3 = r2 % 128
            $11 = r3
            int r2 = r2 % r4
        L_0x0028:
            byte[] r1 = (byte[]) r1
            if (r21 == 0) goto L_0x0031
            char[] r2 = r21.toCharArray()
            goto L_0x0033
        L_0x0031:
            r2 = r21
        L_0x0033:
            char[] r2 = (char[]) r2
            com.facetec.sdk.gg r3 = new com.facetec.sdk.gg
            r3.<init>()
            char[] r5 = f8704k
            r6 = 48
            java.lang.String r8 = ""
            r9 = 1
            r10 = 0
            if (r5 == 0) goto L_0x00c8
            int r11 = r5.length
            char[] r12 = new char[r11]
            r13 = r10
        L_0x0048:
            if (r13 >= r11) goto L_0x00c6
            char r14 = r5[r13]
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ all -> 0x00bd }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00bd }
            r15[r10] = r14     // Catch:{ all -> 0x00bd }
            java.util.Map<java.lang.Integer, java.lang.Object> r14 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x00bd }
            r16 = -1321001135(0xffffffffb1431f51, float:-2.8394036E-9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x00bd }
            java.lang.Object r4 = r14.get(r4)     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0066
            r18 = r5
            goto L_0x00a5
        L_0x0066:
            int r4 = android.graphics.Color.rgb(r10, r10, r10)     // Catch:{ all -> 0x00bd }
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r4 = r17 - r4
            char r4 = (char) r4     // Catch:{ all -> 0x00bd }
            int r7 = android.text.TextUtils.lastIndexOf(r8, r6)     // Catch:{ all -> 0x00bd }
            int r7 = r7 + 887
            long r17 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ all -> 0x00bd }
            r19 = -1
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            int r6 = r17 + 22
            java.lang.Object r4 = com.facetec.sdk.C2854bp.m11559b(r4, r7, r6)     // Catch:{ all -> 0x00bd }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x00bd }
            byte r6 = (byte) r10     // Catch:{ all -> 0x00bd }
            byte r7 = (byte) r6     // Catch:{ all -> 0x00bd }
            byte r10 = (byte) r7     // Catch:{ all -> 0x00bd }
            r18 = r5
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ all -> 0x00bd }
            m10697u(r6, r7, r10, r5)     // Catch:{ all -> 0x00bd }
            r6 = 0
            r5 = r5[r6]     // Catch:{ all -> 0x00bd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00bd }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00bd }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00bd }
            r7[r6] = r10     // Catch:{ all -> 0x00bd }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r7)     // Catch:{ all -> 0x00bd }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x00bd }
            r14.put(r5, r4)     // Catch:{ all -> 0x00bd }
        L_0x00a5:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch:{ all -> 0x00bd }
            r5 = 0
            java.lang.Object r4 = r4.invoke(r5, r15)     // Catch:{ all -> 0x00bd }
            java.lang.Character r4 = (java.lang.Character) r4     // Catch:{ all -> 0x00bd }
            char r4 = r4.charValue()     // Catch:{ all -> 0x00bd }
            r12[r13] = r4
            int r13 = r13 + 1
            r5 = r18
            r4 = 2
            r6 = 48
            r10 = 0
            goto L_0x0048
        L_0x00bd:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x00c5
            throw r1
        L_0x00c5:
            throw r0
        L_0x00c6:
            r5 = r12
            goto L_0x00ca
        L_0x00c8:
            r18 = r5
        L_0x00ca:
            int r4 = f8705l
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ all -> 0x0315 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0315 }
            r7 = 0
            r6[r7] = r4     // Catch:{ all -> 0x0315 }
            java.util.Map<java.lang.Integer, java.lang.Object> r4 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0315 }
            r7 = 2101371298(0x7d4061a2, float:1.598242E37)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0315 }
            java.lang.Object r10 = r4.get(r10)     // Catch:{ all -> 0x0315 }
            if (r10 == 0) goto L_0x00e5
            goto L_0x0120
        L_0x00e5:
            int r10 = android.view.MotionEvent.axisFromString(r8)     // Catch:{ all -> 0x0315 }
            int r10 = r10 + 20122
            char r10 = (char) r10     // Catch:{ all -> 0x0315 }
            int r11 = android.view.ViewConfiguration.getMinimumFlingVelocity()     // Catch:{ all -> 0x0315 }
            int r11 = r11 >> 16
            int r11 = r11 + 242
            int r12 = android.view.KeyEvent.keyCodeFromString(r8)     // Catch:{ all -> 0x0315 }
            int r12 = r12 + 24
            java.lang.Object r10 = com.facetec.sdk.C2854bp.m11559b(r10, r11, r12)     // Catch:{ all -> 0x0315 }
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x0315 }
            r11 = 0
            byte r12 = (byte) r11     // Catch:{ all -> 0x0315 }
            byte r13 = (byte) r12     // Catch:{ all -> 0x0315 }
            r14 = r13 | 6
            byte r14 = (byte) r14     // Catch:{ all -> 0x0315 }
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ all -> 0x0315 }
            m10697u(r12, r13, r14, r15)     // Catch:{ all -> 0x0315 }
            r12 = r15[r11]     // Catch:{ all -> 0x0315 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0315 }
            java.lang.Class[] r13 = new java.lang.Class[r9]     // Catch:{ all -> 0x0315 }
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0315 }
            r13[r11] = r14     // Catch:{ all -> 0x0315 }
            java.lang.reflect.Method r10 = r10.getMethod(r12, r13)     // Catch:{ all -> 0x0315 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0315 }
            r4.put(r7, r10)     // Catch:{ all -> 0x0315 }
        L_0x0120:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch:{ all -> 0x0315 }
            r4 = 0
            java.lang.Object r6 = r10.invoke(r4, r6)     // Catch:{ all -> 0x0315 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0315 }
            int r4 = r6.intValue()     // Catch:{ all -> 0x0315 }
            boolean r6 = f8706m
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r10 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            if (r6 == 0) goto L_0x023f
            int r0 = r1.length
            r3.f10445d = r0
            char[] r0 = new char[r0]
            r2 = 0
            r3.f10444a = r2
        L_0x013e:
            int r2 = r3.f10444a
            int r6 = r3.f10445d
            if (r2 >= r6) goto L_0x0236
            int r11 = $11
            int r11 = r11 + r9
            int r12 = r11 % 128
            $10 = r12
            r12 = 2
            int r11 = r11 % r12
            if (r11 == 0) goto L_0x01c0
            int r6 = r6 >>> 0
            int r6 = r6 >>> r2
            byte r6 = r1[r6]
            int r6 = r6 >> r23
            char r6 = r5[r6]
            int r6 = r6 / r4
            char r6 = (char) r6
            r0[r2] = r6
            r2 = 2
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x01b7 }
            r6[r9] = r3     // Catch:{ all -> 0x01b7 }
            r2 = 0
            r6[r2] = r3     // Catch:{ all -> 0x01b7 }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x01b7 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01b7 }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x01b7 }
            if (r11 == 0) goto L_0x0171
            goto L_0x01b0
        L_0x0171:
            int r11 = android.os.Process.myPid()     // Catch:{ all -> 0x01b7 }
            int r11 = r11 >> 22
            char r11 = (char) r11     // Catch:{ all -> 0x01b7 }
            int r12 = android.view.ViewConfiguration.getScrollBarFadeDuration()     // Catch:{ all -> 0x01b7 }
            int r12 = r12 >> 16
            int r12 = 782 - r12
            r13 = 0
            int r14 = android.graphics.Color.green(r13)     // Catch:{ all -> 0x01b7 }
            int r14 = r14 + 24
            java.lang.Object r11 = com.facetec.sdk.C2854bp.m11559b(r11, r12, r14)     // Catch:{ all -> 0x01b7 }
            java.lang.Class r11 = (java.lang.Class) r11     // Catch:{ all -> 0x01b7 }
            byte r12 = (byte) r13     // Catch:{ all -> 0x01b7 }
            byte r14 = (byte) r12     // Catch:{ all -> 0x01b7 }
            r15 = r14 | 8
            byte r15 = (byte) r15     // Catch:{ all -> 0x01b7 }
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x01b7 }
            m10697u(r12, r14, r15, r10)     // Catch:{ all -> 0x01b7 }
            r10 = r10[r13]     // Catch:{ all -> 0x01b7 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01b7 }
            r12 = 2
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x01b7 }
            r14[r13] = r7     // Catch:{ all -> 0x01b7 }
            r14[r9] = r7     // Catch:{ all -> 0x01b7 }
            java.lang.reflect.Method r11 = r11.getMethod(r10, r14)     // Catch:{ all -> 0x01b7 }
            r10 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01b7 }
            r2.put(r12, r11)     // Catch:{ all -> 0x01b7 }
        L_0x01b0:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11     // Catch:{ all -> 0x01b7 }
            r2 = 0
            r11.invoke(r2, r6)     // Catch:{ all -> 0x01b7 }
            goto L_0x0228
        L_0x01b7:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01bf
            throw r1
        L_0x01bf:
            throw r0
        L_0x01c0:
            int r6 = r6 + -1
            int r6 = r6 - r2
            byte r6 = r1[r6]
            int r6 = r6 + r23
            char r6 = r5[r6]
            int r6 = r6 - r4
            char r6 = (char) r6
            r0[r2] = r6
            r2 = 2
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x022d }
            r6[r9] = r3     // Catch:{ all -> 0x022d }
            r2 = 0
            r6[r2] = r3     // Catch:{ all -> 0x022d }
            java.util.Map<java.lang.Integer, java.lang.Object> r10 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x022d }
            r11 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x022d }
            java.lang.Object r11 = r10.get(r12)     // Catch:{ all -> 0x022d }
            if (r11 == 0) goto L_0x01e5
            goto L_0x0222
        L_0x01e5:
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)     // Catch:{ all -> 0x022d }
            char r2 = (char) r11     // Catch:{ all -> 0x022d }
            int r11 = android.os.Process.getGidForName(r8)     // Catch:{ all -> 0x022d }
            int r11 = r11 + 783
            int r12 = android.view.ViewConfiguration.getWindowTouchSlop()     // Catch:{ all -> 0x022d }
            int r12 = r12 >> 8
            int r12 = r12 + 24
            java.lang.Object r2 = com.facetec.sdk.C2854bp.m11559b(r2, r11, r12)     // Catch:{ all -> 0x022d }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x022d }
            r11 = 0
            byte r12 = (byte) r11     // Catch:{ all -> 0x022d }
            byte r13 = (byte) r12     // Catch:{ all -> 0x022d }
            r14 = r13 | 8
            byte r14 = (byte) r14     // Catch:{ all -> 0x022d }
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ all -> 0x022d }
            m10697u(r12, r13, r14, r15)     // Catch:{ all -> 0x022d }
            r12 = r15[r11]     // Catch:{ all -> 0x022d }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x022d }
            r13 = 2
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x022d }
            r14[r11] = r7     // Catch:{ all -> 0x022d }
            r14[r9] = r7     // Catch:{ all -> 0x022d }
            java.lang.reflect.Method r11 = r2.getMethod(r12, r14)     // Catch:{ all -> 0x022d }
            r2 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x022d }
            r10.put(r12, r11)     // Catch:{ all -> 0x022d }
        L_0x0222:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11     // Catch:{ all -> 0x022d }
            r2 = 0
            r11.invoke(r2, r6)     // Catch:{ all -> 0x022d }
        L_0x0228:
            r10 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            goto L_0x013e
        L_0x022d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0235
            throw r1
        L_0x0235:
            throw r0
        L_0x0236:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r6 = 0
            r25[r6] = r1
            return
        L_0x023f:
            r6 = 0
            boolean r1 = f8707n
            if (r1 == 0) goto L_0x02e4
            int r0 = r2.length
            r3.f10445d = r0
            char[] r0 = new char[r0]
            r3.f10444a = r6
        L_0x024b:
            int r1 = r3.f10444a
            int r6 = r3.f10445d
            r10 = 39
            if (r1 >= r6) goto L_0x0256
            r11 = 31
            goto L_0x0257
        L_0x0256:
            r11 = r10
        L_0x0257:
            if (r11 == r10) goto L_0x02db
            int r10 = $11
            int r10 = r10 + 35
            int r11 = r10 % 128
            $10 = r11
            r11 = 2
            int r10 = r10 % r11
            int r6 = r6 + -1
            int r6 = r6 - r1
            char r6 = r2[r6]
            int r6 = r6 - r23
            char r6 = r5[r6]
            int r6 = r6 - r4
            char r6 = (char) r6
            r0[r1] = r6
            r1 = 2
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x02d2 }
            r6[r9] = r3     // Catch:{ all -> 0x02d2 }
            r1 = 0
            r6[r1] = r3     // Catch:{ all -> 0x02d2 }
            java.util.Map<java.lang.Integer, java.lang.Object> r1 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x02d2 }
            r10 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x02d2 }
            java.lang.Object r10 = r1.get(r11)     // Catch:{ all -> 0x02d2 }
            if (r10 == 0) goto L_0x028b
            r11 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            goto L_0x02ca
        L_0x028b:
            int r10 = android.view.KeyEvent.keyCodeFromString(r8)     // Catch:{ all -> 0x02d2 }
            char r10 = (char) r10     // Catch:{ all -> 0x02d2 }
            int r11 = android.view.ViewConfiguration.getKeyRepeatTimeout()     // Catch:{ all -> 0x02d2 }
            int r11 = r11 >> 16
            int r11 = r11 + 782
            r12 = 48
            int r13 = android.text.TextUtils.indexOf(r8, r12)     // Catch:{ all -> 0x02d2 }
            int r13 = 23 - r13
            java.lang.Object r10 = com.facetec.sdk.C2854bp.m11559b(r10, r11, r13)     // Catch:{ all -> 0x02d2 }
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x02d2 }
            r11 = 0
            byte r13 = (byte) r11     // Catch:{ all -> 0x02d2 }
            byte r14 = (byte) r13     // Catch:{ all -> 0x02d2 }
            r15 = r14 | 8
            byte r15 = (byte) r15     // Catch:{ all -> 0x02d2 }
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ all -> 0x02d2 }
            m10697u(r13, r14, r15, r12)     // Catch:{ all -> 0x02d2 }
            r12 = r12[r11]     // Catch:{ all -> 0x02d2 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x02d2 }
            r13 = 2
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ all -> 0x02d2 }
            r14[r11] = r7     // Catch:{ all -> 0x02d2 }
            r14[r9] = r7     // Catch:{ all -> 0x02d2 }
            java.lang.reflect.Method r10 = r10.getMethod(r12, r14)     // Catch:{ all -> 0x02d2 }
            r11 = -1517498542(0xffffffffa58ccf52, float:-2.4426614E-16)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x02d2 }
            r1.put(r12, r10)     // Catch:{ all -> 0x02d2 }
        L_0x02ca:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch:{ all -> 0x02d2 }
            r1 = 0
            r10.invoke(r1, r6)     // Catch:{ all -> 0x02d2 }
            goto L_0x024b
        L_0x02d2:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02da
            throw r1
        L_0x02da:
            throw r0
        L_0x02db:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r2 = 0
            r25[r2] = r1
            return
        L_0x02e4:
            r2 = r6
            int r1 = r0.length
            r3.f10445d = r1
            char[] r1 = new char[r1]
        L_0x02ea:
            r3.f10444a = r2
            int r2 = r3.f10444a
            int r6 = r3.f10445d
            if (r2 >= r6) goto L_0x0302
            int r6 = r6 + -1
            int r6 = r6 - r2
            r6 = r0[r6]
            int r6 = r6 - r23
            char r6 = r5[r6]
            int r6 = r6 - r4
            char r6 = (char) r6
            r1[r2] = r6
            int r2 = r2 + 1
            goto L_0x02ea
        L_0x0302:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            int r1 = $10
            int r1 = r1 + 41
            int r2 = r1 % 128
            $11 = r2
            r2 = 2
            int r1 = r1 % r2
            r1 = 0
            r25[r1] = r0
            return
        L_0x0315:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x031d
            throw r1
        L_0x031d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2750a.m10695r(java.lang.String, int[], int, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if ((r0 == null) != true) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if ((r0 == null) != true) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r7 = r2;
        r0 = r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10696s(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = f8710t
            int r0 = r0 + 95
            int r1 = r0 % 128
            f8709p = r1
            int r0 = r0 % 2
            r1 = 28
            if (r0 != 0) goto L_0x0011
            r0 = 63
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            r2 = 13
            r3 = 0
            r4 = -1
            r5 = 1
            if (r0 == r1) goto L_0x0032
            byte[] r0 = f8701h
            r1 = 4
            int r1 = r1 / r7
            int r1 = r1 + 97
            int r8 = r8 % 112
            int r8 = r8 + 9
            int r6 = r6 * 30
            int r2 = r2 / r6
            byte[] r6 = new byte[r1]
            int r1 = r1 + 94
            if (r0 != 0) goto L_0x002e
            r7 = r5
            goto L_0x002f
        L_0x002e:
            r7 = r3
        L_0x002f:
            if (r7 == r5) goto L_0x004c
            goto L_0x004a
        L_0x0032:
            byte[] r0 = f8701h
            int r7 = r7 * 3
            int r7 = r7 + r2
            int r8 = r8 * 7
            int r8 = 106 - r8
            int r6 = r6 * 12
            int r2 = 16 - r6
            byte[] r6 = new byte[r7]
            int r1 = r7 + -1
            if (r0 != 0) goto L_0x0047
            r7 = r5
            goto L_0x0048
        L_0x0047:
            r7 = r3
        L_0x0048:
            if (r7 == r5) goto L_0x004c
        L_0x004a:
            r7 = r2
            goto L_0x0053
        L_0x004c:
            r7 = r2
        L_0x004d:
            int r8 = r8 + r2
            int r2 = r7 + 1
            int r8 = r8 + 2
            goto L_0x004a
        L_0x0053:
            int r4 = r4 + r5
            byte r2 = (byte) r8
            r6[r4] = r2
            if (r4 != r1) goto L_0x006b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6, r3)
            int r6 = f8709p
            int r6 = r6 + 91
            int r8 = r6 % 128
            f8710t = r8
            int r6 = r6 % 2
            r9[r3] = r7
            return
        L_0x006b:
            byte r2 = r0[r7]
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2750a.m10696s(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10697u(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = $$a
            int r8 = r8 + 97
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r8 = r7
            r3 = r1
            r4 = r2
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L_0x0037
        L_0x001b:
            r3 = r2
        L_0x001c:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L_0x002b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x002b:
            int r3 = r3 + 1
            byte r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L_0x0037:
            int r8 = r8 + r6
            r6 = r7
            r7 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2750a.m10697u(int, byte, int, java.lang.Object[]):void");
    }

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: b */
    static synchronized void m10682b(Context context, boolean z, C2752e eVar) {
        synchronized (C2750a.class) {
            int i = f8709p + 119;
            f8710t = i % 128;
            if ((i % 2 != 0 ? '\'' : 7) != 7) {
                try {
                    C2750a a = m10680a(context);
                    a.f8711b = z;
                    a.f8712c = eVar;
                    a.m10688d(context);
                    int i2 = 75 / 0;
                } catch (Exception e) {
                    C3330l.m13346d(e);
                    return;
                }
            } else {
                C2750a a2 = m10680a(context);
                a2.f8711b = z;
                a2.f8712c = eVar;
                a2.m10688d(context);
            }
            int i3 = f8710t + 79;
            f8709p = i3 % 128;
            if ((i3 % 2 == 0 ? '8' : 11) != 11) {
                throw null;
            }
        }
    }

    /* renamed from: d */
    private void m10688d(Context context) {
        boolean z = false;
        if (!f8703j) {
            int i = f8710t + 55;
            f8709p = i % 128;
            int i2 = i % 2;
            try {
                byte b = f8701h[15];
                byte b2 = (byte) b;
                Object[] objArr = new Object[1];
                m10696s((byte) (b - 1), b2, (byte) (b2 - 1), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                byte b3 = f8701h[15];
                byte b4 = (byte) b3;
                Object[] objArr2 = new Object[1];
                m10696s(b4, (byte) (b4 - 1), (byte) b3, objArr2);
                if (cls.getMethod((String) objArr2[0], (Class[]) null).invoke((Object) null, (Object[]) null).equals(Looper.getMainLooper().getThread())) {
                    throw new AssertionError();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        f8697a = this;
        JSONObject jSONObject = new JSONObject();
        Object[] objArr3 = new Object[1];
        m10694q("\t\u000e\f\t\u000f\u0018\f\u0017㙝", 9 - Color.blue(0), (byte) (95 - (ViewConfiguration.getScrollFriction() > Utils.FLOAT_EPSILON ? 1 : (ViewConfiguration.getScrollFriction() == Utils.FLOAT_EPSILON ? 0 : -1))), objArr3);
        jSONObject.put(((String) objArr3[0]).intern(), this.f8711b);
        String d = this.f8712c.mo8796d();
        Object[] objArr4 = new Object[1];
        m10695r((String) null, (int[]) null, (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 126, "", objArr4);
        jSONObject.put(((String) objArr4[0]).intern(), d);
        Object[] objArr5 = new Object[1];
        m10695r((String) null, (int[]) null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), "", objArr5);
        jSONObject.put(((String) objArr5[0]).intern(), this.f8713g.mo8807e());
        Object[] objArr6 = new Object[1];
        m10695r((String) null, (int[]) null, 127 - KeyEvent.getDeadChar(0, 0), "", objArr6);
        jSONObject.put(((String) objArr6[0]).intern(), C2810ax.m11000e(16, 32));
        C2843bh.m11409b(context, m10692i(context), m10691g(context), jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        int i3 = f8709p + 7;
        f8710t = i3 % 128;
        if (i3 % 2 != 0) {
            z = true;
        }
        if (z) {
            throw null;
        }
    }

    /* renamed from: c */
    static synchronized void m10685c(Context context, C2764aa aaVar) {
        synchronized (C2750a.class) {
            int i = f8710t + 21;
            f8709p = i % 128;
            if (!(i % 2 == 0)) {
                try {
                    C2750a a = m10680a(context);
                    a.f8713g = aaVar;
                    a.m10688d(context);
                } catch (Exception e) {
                    C3330l.m13346d(e);
                }
            } else {
                C2750a a2 = m10680a(context);
                a2.f8713g = aaVar;
                a2.m10688d(context);
                throw null;
            }
        }
    }

    /* renamed from: a */
    static int m10679a() {
        int i = f8710t + 93;
        f8709p = i % 128;
        if ((i % 2 == 0 ? 0 : 'U') != 0) {
            int intValue = m10689e().f8715a.intValue();
            int i2 = f8710t + 13;
            f8709p = i2 % 128;
            if ((i2 % 2 == 0 ? 4 : '!') != '!') {
                int i3 = 81 / 0;
            }
            return intValue;
        }
        m10689e().f8715a.intValue();
        throw null;
    }

    /* renamed from: e */
    static byte[] m10690e(Context context) {
        synchronized (f8702i) {
            if (f8698d == null) {
                f8698d = m10693j(context);
            }
        }
        return C2844bi.m11418b(f8698d);
    }

    /* renamed from: b */
    static boolean m10683b(Context context) {
        int i = f8709p + 57;
        f8710t = i % 128;
        int i2 = i % 2;
        try {
            boolean z = m10680a(context).f8711b;
            int i3 = f8710t + 83;
            f8709p = i3 % 128;
            int i4 = i3 % 2;
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    static boolean m10686c() {
        int i = f8709p + 109;
        f8710t = i % 128;
        int i2 = i % 2;
        boolean booleanValue = m10689e().f8718d.booleanValue();
        int i3 = f8709p + 93;
        f8710t = i3 % 128;
        int i4 = i3 % 2;
        return booleanValue;
    }
}
