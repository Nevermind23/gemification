package com.facetec.sdk;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facetec.sdk.aa */
final class C2764aa {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: f */
    private static long f8741f = -7943705867924536800L;

    /* renamed from: i */
    private static int f8742i = 0;

    /* renamed from: o */
    private static int f8743o = 1;

    /* renamed from: a */
    List<C3625v> f8744a = new ArrayList();

    /* renamed from: b */
    private Context f8745b;

    /* renamed from: c */
    private int f8746c = 0;

    /* renamed from: d */
    private int f8747d = 0;

    /* renamed from: e */
    private int f8748e = 1;

    /* renamed from: g */
    private boolean f8749g = false;

    /* renamed from: h */
    private boolean f8750h = false;

    /* renamed from: j */
    private int f8751j = 0;

    /* renamed from: com.facetec.sdk.aa$2 */
    static /* synthetic */ class C27652 {

        /* renamed from: e */
        static final /* synthetic */ int[] f8752e;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facetec.sdk.aa$c[] r0 = com.facetec.sdk.C2764aa.C2766c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8752e = r0
                com.facetec.sdk.aa$c r1 = com.facetec.sdk.C2764aa.C2766c.HASH_SET_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8752e     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.aa$c r1 = com.facetec.sdk.C2764aa.C2766c.VERSION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8752e     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.aa$c r1 = com.facetec.sdk.C2764aa.C2766c.REVISION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8752e     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.aa$c r1 = com.facetec.sdk.C2764aa.C2766c.SIZE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8752e     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.aa$c r1 = com.facetec.sdk.C2764aa.C2766c.SESSION_COUNT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8752e     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facetec.sdk.aa$c r1 = com.facetec.sdk.C2764aa.C2766c.TAMPERING_DETECTED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2764aa.C27652.<clinit>():void");
        }
    }

    /* renamed from: com.facetec.sdk.aa$c */
    enum C2766c {
        HASH_SET_ARRAY("haia"),
        VERSION("v"),
        REVISION(((String) r6[0]).intern()),
        SIZE("s"),
        SESSION_COUNT("sc"),
        TAMPERING_DETECTED("td");
        
        public static final byte[] $$a = null;
        public static final int $$b = 0;
        private static int $10;
        private static int $11;

        /* renamed from: g */
        private static char f8758g;

        /* renamed from: h */
        private static char f8759h;

        /* renamed from: k */
        private static int f8762k;

        /* renamed from: m */
        private static char f8763m;

        /* renamed from: n */
        private static char f8764n;

        /* renamed from: o */
        private static int f8765o;

        /* renamed from: f */
        final String f8766f;

        static {
            int i = f8762k + 55;
            f8765o = i % 128;
            int i2 = i % 2;
        }

        private C2766c(String str) {
            this.f8766f = str;
        }

        /* renamed from: c */
        static void m10710c() {
            f8759h = 46171;
            f8758g = 48148;
            f8764n = 24051;
            f8763m = 12830;
        }

        static void init$0() {
            $$a = new byte[]{30, 49, 46, 44};
            $$b = 57;
        }

        /* renamed from: l */
        private static void m10711l(String str, int i, Object[] objArr) {
            Object obj;
            char c;
            int i2;
            Throwable cause;
            char c2;
            Class<Object> cls = Object.class;
            int i3 = 2;
            if (str != null) {
                int i4 = $10 + 27;
                $11 = i4 % 128;
                if (i4 % 2 != 0) {
                    obj = str.toCharArray();
                } else {
                    str.toCharArray();
                    throw null;
                }
            } else {
                obj = str;
            }
            char[] cArr = (char[]) obj;
            C3163ge geVar = new C3163ge();
            char[] cArr2 = new char[cArr.length];
            int i5 = 0;
            geVar.f10441b = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i6 = geVar.f10441b;
                char c3 = 3;
                if (i6 < cArr.length) {
                    c = 3;
                } else {
                    c = '\"';
                }
                if (c != 3) {
                    objArr[i5] = new String(cArr2, i5, i);
                    return;
                }
                int i7 = i;
                cArr3[i5] = cArr[i6];
                char c4 = 1;
                cArr3[1] = cArr[i6 + 1];
                int i8 = $10 + 65;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                int i12 = 58224;
                int i13 = i5;
                while (i13 < 16) {
                    char c5 = cArr3[c4];
                    char c6 = cArr3[i5];
                    String str2 = "";
                    int i14 = (c6 + i12) ^ ((c6 << 4) + ((char) ((int) (((long) f8764n) ^ 595417797124296349L))));
                    int i15 = c6 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[c3] = Integer.valueOf(f8763m);
                        objArr2[i3] = Integer.valueOf(i15);
                        objArr2[1] = Integer.valueOf(i14);
                        objArr2[0] = Integer.valueOf(c5);
                        Map<Integer, Object> map = C2854bp.f9335p;
                        Object obj2 = map.get(1276772069);
                        if (obj2 == null) {
                            byte b = (byte) ($$b & 7);
                            byte b2 = (byte) (b - 1);
                            Object[] objArr3 = new Object[1];
                            m10712p(b, b2, (byte) b2, objArr3);
                            Class cls2 = Integer.TYPE;
                            obj2 = ((Class) C2854bp.m11559b((char) (8636 - (ViewConfiguration.getTapTimeout() >> 16)), 1312 - View.resolveSize(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 24)).getMethod((String) objArr3[0], new Class[]{cls2, cls2, cls2, cls2});
                            map.put(1276772069, obj2);
                        }
                        char charValue = ((Character) ((Method) obj2).invoke((Object) null, objArr2)).charValue();
                        cArr3[1] = charValue;
                        char c7 = cArr3[0];
                        int i16 = (charValue + i12) ^ ((charValue << 4) + ((char) ((int) (((long) f8759h) ^ 595417797124296349L))));
                        int i17 = charValue >>> 5;
                        try {
                            Object[] objArr4 = new Object[4];
                            objArr4[3] = Integer.valueOf(f8758g);
                            objArr4[2] = Integer.valueOf(i17);
                            objArr4[1] = Integer.valueOf(i16);
                            objArr4[0] = Integer.valueOf(c7);
                            Object obj3 = map.get(1276772069);
                            if (obj3 != null) {
                                c2 = 3;
                            } else {
                                byte b3 = (byte) ($$b & 7);
                                byte b4 = (byte) (b3 - 1);
                                Object[] objArr5 = new Object[1];
                                m10712p(b3, b4, (byte) b4, objArr5);
                                Class cls3 = Integer.TYPE;
                                c2 = 3;
                                obj3 = ((Class) C2854bp.m11559b((char) (8636 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1))), MotionEvent.axisFromString(str2) + 1313, TextUtils.getOffsetBefore(str2, 0) + 23)).getMethod((String) objArr5[0], new Class[]{cls3, cls3, cls3, cls3});
                                map.put(1276772069, obj3);
                            }
                            cArr3[0] = ((Character) ((Method) obj3).invoke((Object) null, objArr4)).charValue();
                            i12 -= 40503;
                            i13++;
                            c3 = c2;
                            i3 = 2;
                            i5 = 0;
                            c4 = 1;
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
                }
                CharSequence charSequence = "";
                int i18 = geVar.f10441b;
                cArr2[i18] = cArr3[0];
                cArr2[i18 + 1] = cArr3[1];
                try {
                    Object[] objArr6 = new Object[2];
                    objArr6[1] = geVar;
                    objArr6[0] = geVar;
                    Map<Integer, Object> map2 = C2854bp.f9335p;
                    Object obj4 = map2.get(-417016338);
                    if (obj4 != null) {
                        i2 = 2;
                    } else {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) b5;
                        Object[] objArr7 = new Object[1];
                        m10712p(b5, b6, (byte) b6, objArr7);
                        i2 = 2;
                        obj4 = ((Class) C2854bp.m11559b((char) (KeyEvent.normalizeMetaState(0) + 28387), 838 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf(charSequence, charSequence, 0, 0) + 24)).getMethod((String) objArr7[0], new Class[]{cls, cls});
                        map2.put(-417016338, obj4);
                    }
                    ((Method) obj4).invoke((Object) null, objArr6);
                    i5 = 0;
                    i3 = i2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void m10712p(int r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 2
                int r6 = r6 + 118
                int r7 = r7 * 3
                int r7 = 1 - r7
                int r8 = r8 * 2
                int r8 = r8 + 4
                byte[] r0 = $$a
                byte[] r1 = new byte[r7]
                int r7 = r7 + -1
                r2 = 0
                if (r0 != 0) goto L_0x001c
                r3 = r1
                r4 = r2
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                goto L_0x0037
            L_0x001c:
                r3 = r2
            L_0x001d:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L_0x002a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L_0x002a:
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
            L_0x0037:
                int r9 = r9 + 1
                int r6 = -r6
                int r6 = r6 + r7
                r7 = r8
                r8 = r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L_0x001d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2764aa.C2766c.m10712p(int, short, short, java.lang.Object[]):void");
        }
    }

    /* renamed from: com.facetec.sdk.aa$e */
    static class C2767e {

        /* renamed from: a */
        int f8767a;

        /* renamed from: c */
        int f8768c;

        C2767e(int i, int i2) {
            this.f8767a = i;
            this.f8768c = i2;
        }
    }

    static {
        init$0();
    }

    C2764aa(Context context) {
        this.f8745b = context;
    }

    /* renamed from: b */
    private List<C2767e> m10704b() {
        boolean z;
        int size;
        ArrayList arrayList = new ArrayList();
        int i = f8743o + 39;
        f8742i = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        while (i3 < this.f8744a.size()) {
            C2767e eVar = new C2767e(i3, i3);
            C3648w wVar = this.f8744a.get(i3).f11608b;
            C3648w wVar2 = C3648w.DETECTED;
            if (wVar == wVar2) {
                int i4 = f8743o + 87;
                f8742i = i4 % 128;
                if (i4 % 2 != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    size = eVar.f8768c << this.f8744a.size();
                } else {
                    size = eVar.f8768c - this.f8744a.size();
                }
                eVar.f8768c = size;
            }
            if (this.f8744a.get(i3).f11607a == wVar2) {
                int i5 = f8743o + 89;
                f8742i = i5 % 128;
                int i6 = i5 % 2;
                eVar.f8768c -= this.f8744a.size();
            }
            if (this.f8744a.get(i3).f11612h == wVar2) {
                int i7 = f8743o + 25;
                f8742i = i7 % 128;
                int i8 = i7 % 2;
                eVar.f8768c -= this.f8744a.size();
            }
            arrayList.add(eVar);
            i3++;
            int i9 = f8742i + 105;
            f8743o = i9 % 128;
            int i12 = i9 % 2;
        }
        Arrays.sort((C2767e[]) arrayList.toArray(), new C3224j0());
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ int m10705d(C2767e eVar, C2767e eVar2) {
        int i = f8743o + 57;
        int i2 = i % 128;
        f8742i = i2;
        int i3 = i % 2;
        int i4 = eVar.f8768c - eVar2.f8768c;
        int i5 = i2 + 89;
        f8743o = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    static void init$0() {
        $$a = new byte[]{67, -87, 59, -101};
        $$b = 37;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r7 != '4') goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r20 != null) goto L_0x0026;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10706k(java.lang.String r20, int r21, java.lang.Object[] r22) {
        /*
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            int r1 = $10
            int r1 = r1 + 111
            int r2 = r1 % 128
            $11 = r2
            r3 = 2
            int r1 = r1 % r3
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x0012
            r1 = r4
            goto L_0x0013
        L_0x0012:
            r1 = r5
        L_0x0013:
            r6 = 0
            if (r1 == 0) goto L_0x001c
            r1 = 22
            int r1 = r1 / r5
            if (r20 == 0) goto L_0x0040
            goto L_0x0026
        L_0x001c:
            r1 = 52
            if (r20 == 0) goto L_0x0023
            r7 = 68
            goto L_0x0024
        L_0x0023:
            r7 = r1
        L_0x0024:
            if (r7 == r1) goto L_0x0040
        L_0x0026:
            int r2 = r2 + 33
            int r1 = r2 % 128
            $10 = r1
            int r2 = r2 % r3
            r1 = 72
            if (r2 == 0) goto L_0x0034
            r2 = 95
            goto L_0x0035
        L_0x0034:
            r2 = r1
        L_0x0035:
            if (r2 != r1) goto L_0x003c
            char[] r1 = r20.toCharArray()
            goto L_0x0042
        L_0x003c:
            r20.toCharArray()
            throw r6
        L_0x0040:
            r1 = r20
        L_0x0042:
            char[] r1 = (char[]) r1
            com.facetec.sdk.gk r2 = new com.facetec.sdk.gk
            r2.<init>()
            long r7 = f8741f
            r9 = 1486537209939166088(0x14a13db767d30388, double:2.622149711642582E-209)
            long r7 = r7 ^ r9
            r9 = r21
            char[] r1 = com.facetec.sdk.C3169gk.m12973b(r7, r1, r9)
            r7 = 4
            r2.f10460a = r7
        L_0x005a:
            int r8 = r2.f10460a
            int r9 = r1.length
            if (r8 >= r9) goto L_0x015f
            int r9 = r8 + -4
            r2.f10461b = r9
            char r10 = r1[r8]
            int r11 = r8 % 4
            char r11 = r1[r11]
            r10 = r10 ^ r11
            long r10 = (long) r10
            long r12 = (long) r9
            long r14 = f8741f
            r9 = 3
            java.lang.Object[] r7 = new java.lang.Object[r9]     // Catch:{ all -> 0x0156 }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0156 }
            r7[r3] = r14     // Catch:{ all -> 0x0156 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0156 }
            r7[r4] = r12     // Catch:{ all -> 0x0156 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0156 }
            r7[r5] = r10     // Catch:{ all -> 0x0156 }
            java.util.Map<java.lang.Integer, java.lang.Object> r10 = com.facetec.sdk.C2854bp.f9335p     // Catch:{ all -> 0x0156 }
            r11 = -1479914154(0xffffffffa7ca4d56, float:-5.615011E-15)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0156 }
            java.lang.Object r12 = r10.get(r12)     // Catch:{ all -> 0x0156 }
            r13 = -1
            r14 = 48
            java.lang.String r15 = ""
            if (r12 == 0) goto L_0x0098
            goto L_0x00dc
        L_0x0098:
            r12 = 0
            float r16 = android.graphics.PointF.length(r12, r12)     // Catch:{ all -> 0x0156 }
            int r12 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            char r12 = (char) r12     // Catch:{ all -> 0x0156 }
            long r16 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch:{ all -> 0x0156 }
            r18 = 0
            int r6 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            int r6 = r6 + 1263
            int r16 = android.text.TextUtils.lastIndexOf(r15, r14, r5, r5)     // Catch:{ all -> 0x0156 }
            int r14 = 23 - r16
            java.lang.Object r6 = com.facetec.sdk.C2854bp.m11559b(r12, r6, r14)     // Catch:{ all -> 0x0156 }
            java.lang.Class r6 = (java.lang.Class) r6     // Catch:{ all -> 0x0156 }
            byte r12 = (byte) r13     // Catch:{ all -> 0x0156 }
            int r14 = r12 + 1
            byte r14 = (byte) r14     // Catch:{ all -> 0x0156 }
            byte r13 = (byte) r14     // Catch:{ all -> 0x0156 }
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x0156 }
            m10707l(r12, r14, r13, r11)     // Catch:{ all -> 0x0156 }
            r11 = r11[r5]     // Catch:{ all -> 0x0156 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0156 }
            java.lang.Class[] r12 = new java.lang.Class[r9]     // Catch:{ all -> 0x0156 }
            java.lang.Class r13 = java.lang.Long.TYPE     // Catch:{ all -> 0x0156 }
            r12[r5] = r13     // Catch:{ all -> 0x0156 }
            r12[r4] = r13     // Catch:{ all -> 0x0156 }
            r12[r3] = r13     // Catch:{ all -> 0x0156 }
            java.lang.reflect.Method r12 = r6.getMethod(r11, r12)     // Catch:{ all -> 0x0156 }
            r6 = -1479914154(0xffffffffa7ca4d56, float:-5.615011E-15)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0156 }
            r10.put(r6, r12)     // Catch:{ all -> 0x0156 }
        L_0x00dc:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch:{ all -> 0x0156 }
            r6 = 0
            java.lang.Object r7 = r12.invoke(r6, r7)     // Catch:{ all -> 0x0156 }
            java.lang.Character r7 = (java.lang.Character) r7     // Catch:{ all -> 0x0156 }
            char r6 = r7.charValue()     // Catch:{ all -> 0x0156 }
            r1[r8] = r6
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x014d }
            r6[r4] = r2     // Catch:{ all -> 0x014d }
            r6[r5] = r2     // Catch:{ all -> 0x014d }
            r7 = -369845900(0xffffffffe9f49974, float:-3.696282E25)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x014d }
            java.lang.Object r8 = r10.get(r8)     // Catch:{ all -> 0x014d }
            if (r8 == 0) goto L_0x00ff
            goto L_0x013b
        L_0x00ff:
            int r8 = android.view.View.combineMeasuredStates(r5, r5)     // Catch:{ all -> 0x014d }
            int r8 = 15364 - r8
            char r8 = (char) r8     // Catch:{ all -> 0x014d }
            int r11 = android.view.View.MeasureSpec.getSize(r5)     // Catch:{ all -> 0x014d }
            int r11 = 1430 - r11
            r12 = 48
            int r12 = android.text.TextUtils.lastIndexOf(r15, r12, r5)     // Catch:{ all -> 0x014d }
            int r12 = r12 + 25
            java.lang.Object r8 = com.facetec.sdk.C2854bp.m11559b(r8, r11, r12)     // Catch:{ all -> 0x014d }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x014d }
            r11 = -1
            byte r11 = (byte) r11     // Catch:{ all -> 0x014d }
            int r12 = -r11
            byte r12 = (byte) r12     // Catch:{ all -> 0x014d }
            int r13 = r12 + -1
            byte r13 = (byte) r13     // Catch:{ all -> 0x014d }
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch:{ all -> 0x014d }
            m10707l(r11, r12, r13, r14)     // Catch:{ all -> 0x014d }
            r11 = r14[r5]     // Catch:{ all -> 0x014d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x014d }
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch:{ all -> 0x014d }
            r12[r5] = r0     // Catch:{ all -> 0x014d }
            r12[r4] = r0     // Catch:{ all -> 0x014d }
            java.lang.reflect.Method r8 = r8.getMethod(r11, r12)     // Catch:{ all -> 0x014d }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x014d }
            r10.put(r7, r8)     // Catch:{ all -> 0x014d }
        L_0x013b:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch:{ all -> 0x014d }
            r7 = 0
            r8.invoke(r7, r6)     // Catch:{ all -> 0x014d }
            int r6 = $10
            int r6 = r6 + r9
            int r8 = r6 % 128
            $11 = r8
            int r6 = r6 % r3
            r6 = r7
            r7 = 4
            goto L_0x005a
        L_0x014d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0155
            throw r1
        L_0x0155:
            throw r0
        L_0x0156:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x015e
            throw r1
        L_0x015e:
            throw r0
        L_0x015f:
            java.lang.String r0 = new java.lang.String
            int r2 = r1.length
            r3 = 4
            int r2 = r2 - r3
            r0.<init>(r1, r3, r2)
            r22[r5] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2764aa.m10706k(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10707l(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = 121 - r7
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = $$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L_0x0017
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L_0x0033
        L_0x0017:
            r3 = r2
        L_0x0018:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r8) goto L_0x0029
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x0029:
            byte r4 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L_0x0033:
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2764aa.m10707l(short, byte, byte, java.lang.Object[]):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo8806c() {
        char c;
        int c2 = C3711z.m13950c(mo8807e().toString());
        this.f8747d = c2;
        if (c2 > 4500) {
            List<C3625v> list = this.f8744a;
            list.remove(list.size() - 1);
            this.f8747d = C3711z.m13950c(mo8807e().toString());
            List<C2767e> b = m10704b();
            int size = b.size() - 1;
            int i = f8743o + 107;
            f8742i = i % 128;
            int i2 = i % 2;
            while (true) {
                if (size >= 0) {
                    c = 17;
                } else {
                    c = 'K';
                }
                if (c == 17) {
                    int i3 = f8743o + 39;
                    f8742i = i3 % 128;
                    int i4 = i3 % 2;
                    if (this.f8747d > 4500) {
                        this.f8744a.remove(b.get(size).f8767a);
                        this.f8747d = C3711z.m13950c(mo8807e().toString());
                        size--;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final JSONObject mo8807e() {
        boolean z;
        boolean z2;
        int i;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<C3625v> it = this.f8744a.iterator();
        while (true) {
            if (it.hasNext()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                jSONArray.put(it.next().mo10089e());
            } else {
                try {
                    break;
                } catch (JSONException e) {
                    Context context = this.f8745b;
                    C2867c cVar = C2867c.F2F_ERROR;
                    StringBuilder sb = new StringBuilder("Error 4470: ");
                    sb.append(e.getMessage());
                    C3555s.m13898c(context, cVar, sb.toString());
                }
            }
        }
        C2766c[] values = C2766c.values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = f8743o + 115;
            f8742i = i3 % 128;
            if (i3 % 2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                C2766c cVar2 = values[i2];
                switch (C27652.f8752e[cVar2.ordinal()]) {
                    case 1:
                        jSONObject.put(cVar2.f8766f, jSONArray);
                        continue;
                    case 2:
                        jSONObject.put(cVar2.f8766f, this.f8748e);
                        continue;
                    case 3:
                        jSONObject.put(cVar2.f8766f, this.f8746c);
                        continue;
                    case 4:
                        jSONObject.put(cVar2.f8766f, this.f8747d);
                        i = f8743o + 61;
                        break;
                    case 5:
                        jSONObject.put(cVar2.f8766f, this.f8751j);
                        i = f8743o + 107;
                        break;
                    case 6:
                        jSONObject.put(cVar2.f8766f, this.f8749g);
                        continue;
                    default:
                        continue;
                }
                f8742i = i % 128;
                int i4 = i % 2;
                i2++;
            } else {
                int i5 = C27652.f8752e[values[i2].ordinal()];
                throw null;
            }
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r12.isEmpty() != false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if ((r12.isEmpty() ? '&' : 15) != 15) goto L_0x0121;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facetec.sdk.C2764aa m10702a(android.content.Context r11, java.lang.String r12) {
        /*
            com.facetec.sdk.aa r0 = new com.facetec.sdk.aa
            r0.<init>(r11)
            if (r12 == 0) goto L_0x0121
            int r1 = f8742i
            int r1 = r1 + 5
            int r2 = r1 % 128
            f8743o = r2
            int r1 = r1 % 2
            r2 = 15
            r3 = 0
            if (r1 != 0) goto L_0x0027
            boolean r1 = r12.isEmpty()
            r4 = 29
            int r4 = r4 / r3
            if (r1 == 0) goto L_0x0022
            r1 = 38
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            if (r1 == r2) goto L_0x002f
            goto L_0x0121
        L_0x0027:
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x002f
            goto L_0x0121
        L_0x002f:
            r1 = 1
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0107 }
            r4.<init>(r12)     // Catch:{ Exception -> 0x0107 }
            com.facetec.sdk.aa$c r12 = com.facetec.sdk.C2764aa.C2766c.HASH_SET_ARRAY     // Catch:{ Exception -> 0x0107 }
            java.lang.String r12 = r12.f8766f     // Catch:{ Exception -> 0x0107 }
            org.json.JSONArray r12 = r4.getJSONArray(r12)     // Catch:{ Exception -> 0x0107 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0107 }
            r5.<init>()     // Catch:{ Exception -> 0x0107 }
            r6 = r3
        L_0x0043:
            int r7 = r12.length()     // Catch:{ Exception -> 0x0107 }
            if (r6 >= r7) goto L_0x00a8
            int r7 = f8742i
            int r7 = r7 + 87
            int r8 = r7 % 128
            f8743o = r8
            int r7 = r7 % 2
            java.lang.String r8 = "慱ん愙콵ㅚ"
            if (r7 != 0) goto L_0x007f
            org.json.JSONObject r7 = r12.getJSONObject(r6)     // Catch:{ Exception -> 0x0107 }
            int r9 = android.view.ViewConfiguration.getEdgeSlop()     // Catch:{ Exception -> 0x0107 }
            int r9 = r9 >> r2
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0107 }
            m10706k(r8, r9, r10)     // Catch:{ Exception -> 0x0107 }
            r8 = r10[r3]     // Catch:{ Exception -> 0x0107 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0107 }
            java.lang.String r8 = r8.intern()     // Catch:{ Exception -> 0x0107 }
            org.json.JSONArray r7 = r7.getJSONArray(r8)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0107 }
            com.facetec.sdk.v r7 = com.facetec.sdk.C3625v.m13937a(r7)     // Catch:{ Exception -> 0x0107 }
            r5.add(r7)     // Catch:{ Exception -> 0x0107 }
            int r6 = r6 + 69
            goto L_0x0043
        L_0x007f:
            org.json.JSONObject r7 = r12.getJSONObject(r6)     // Catch:{ Exception -> 0x0107 }
            int r9 = android.view.ViewConfiguration.getEdgeSlop()     // Catch:{ Exception -> 0x0107 }
            int r9 = r9 >> 16
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0107 }
            m10706k(r8, r9, r10)     // Catch:{ Exception -> 0x0107 }
            r8 = r10[r3]     // Catch:{ Exception -> 0x0107 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0107 }
            java.lang.String r8 = r8.intern()     // Catch:{ Exception -> 0x0107 }
            org.json.JSONArray r7 = r7.getJSONArray(r8)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0107 }
            com.facetec.sdk.v r7 = com.facetec.sdk.C3625v.m13937a(r7)     // Catch:{ Exception -> 0x0107 }
            r5.add(r7)     // Catch:{ Exception -> 0x0107 }
            int r6 = r6 + 1
            goto L_0x0043
        L_0x00a8:
            com.facetec.sdk.aa$c[] r12 = com.facetec.sdk.C2764aa.C2766c.values()     // Catch:{ Exception -> 0x0107 }
            int r2 = r12.length     // Catch:{ Exception -> 0x0107 }
            r6 = r3
        L_0x00ae:
            if (r6 >= r2) goto L_0x00b2
            r7 = r3
            goto L_0x00b3
        L_0x00b2:
            r7 = r1
        L_0x00b3:
            if (r7 == 0) goto L_0x00bd
            r0.f8750h = r1     // Catch:{ Exception -> 0x0107 }
            int r12 = r0.f8746c     // Catch:{ Exception -> 0x0107 }
            int r12 = r12 + r1
            r0.f8746c = r12     // Catch:{ Exception -> 0x0107 }
            goto L_0x0121
        L_0x00bd:
            r7 = r12[r6]     // Catch:{ Exception -> 0x0107 }
            int[] r8 = com.facetec.sdk.C2764aa.C27652.f8752e     // Catch:{ Exception -> 0x0107 }
            int r9 = r7.ordinal()     // Catch:{ Exception -> 0x0107 }
            r8 = r8[r9]     // Catch:{ Exception -> 0x0107 }
            switch(r8) {
                case 1: goto L_0x0102;
                case 2: goto L_0x00ef;
                case 3: goto L_0x00e6;
                case 4: goto L_0x00dd;
                case 5: goto L_0x00d4;
                case 6: goto L_0x00cb;
                default: goto L_0x00ca;
            }     // Catch:{ Exception -> 0x0107 }
        L_0x00ca:
            goto L_0x0104
        L_0x00cb:
            java.lang.String r7 = r7.f8766f     // Catch:{ Exception -> 0x0107 }
            boolean r7 = r4.getBoolean(r7)     // Catch:{ Exception -> 0x0107 }
            r0.f8749g = r7     // Catch:{ Exception -> 0x0107 }
            goto L_0x0104
        L_0x00d4:
            java.lang.String r7 = r7.f8766f     // Catch:{ Exception -> 0x0107 }
            int r7 = r4.getInt(r7)     // Catch:{ Exception -> 0x0107 }
            r0.f8751j = r7     // Catch:{ Exception -> 0x0107 }
            goto L_0x0104
        L_0x00dd:
            java.lang.String r7 = r7.f8766f     // Catch:{ Exception -> 0x0107 }
            int r7 = r4.getInt(r7)     // Catch:{ Exception -> 0x0107 }
            r0.f8747d = r7     // Catch:{ Exception -> 0x0107 }
            goto L_0x0104
        L_0x00e6:
            java.lang.String r7 = r7.f8766f     // Catch:{ Exception -> 0x0107 }
            int r7 = r4.getInt(r7)     // Catch:{ Exception -> 0x0107 }
            r0.f8746c = r7     // Catch:{ Exception -> 0x0107 }
            goto L_0x0104
        L_0x00ef:
            java.lang.String r7 = r7.f8766f     // Catch:{ Exception -> 0x0107 }
            int r7 = r4.getInt(r7)     // Catch:{ Exception -> 0x0107 }
            r0.f8748e = r7     // Catch:{ Exception -> 0x0107 }
            int r7 = f8743o
            int r7 = r7 + 55
            int r8 = r7 % 128
            f8742i = r8
            int r7 = r7 % 2
            goto L_0x0104
        L_0x0102:
            r0.f8744a = r5     // Catch:{ Exception -> 0x0107 }
        L_0x0104:
            int r6 = r6 + 1
            goto L_0x00ae
        L_0x0107:
            r12 = move-exception
            r0.f8749g = r1
            com.facetec.sdk.c r1 = com.facetec.sdk.C2867c.F2F_ERROR
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error 4471: "
            r2.<init>(r3)
            java.lang.String r12 = r12.getMessage()
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            com.facetec.sdk.C3555s.m13898c((android.content.Context) r11, (com.facetec.sdk.C2867c) r1, (java.lang.String) r12)
        L_0x0121:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2764aa.m10702a(android.content.Context, java.lang.String):com.facetec.sdk.aa");
    }

    /* renamed from: a */
    static C2764aa m10703a(Context context, List<C3534r> list) {
        C2764aa aaVar = new C2764aa(context);
        ArrayList arrayList = new ArrayList();
        Iterator<C3534r> it = list.iterator();
        int i = f8743o + 25;
        f8742i = i % 128;
        while (true) {
            int i2 = i % 2;
            if (it.hasNext()) {
                C3534r next = it.next();
                C3625v vVar = new C3625v();
                List<List<Integer>> list2 = next.f11432d;
                vVar.f11610d = list2;
                vVar.f11609c = list2.size();
                vVar.f11608b = next.f11434f;
                vVar.f11607a = next.f11438j;
                vVar.f11612h = next.f11436h;
                vVar.f11611e = C3711z.m13950c(vVar.mo10089e().toString());
                arrayList.add(vVar);
                i = f8742i + 103;
                f8743o = i % 128;
            } else {
                aaVar.f8744a = arrayList;
                aaVar.f8751j = list.size();
                aaVar.f8747d = C3711z.m13950c(aaVar.mo8807e().toString());
                return aaVar;
            }
        }
    }
}
