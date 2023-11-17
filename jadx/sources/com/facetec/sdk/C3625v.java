package com.facetec.sdk;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facetec.sdk.v */
final class C3625v {

    /* renamed from: a */
    C3648w f11607a;

    /* renamed from: b */
    C3648w f11608b;

    /* renamed from: c */
    int f11609c = 0;

    /* renamed from: d */
    List<List<Integer>> f11610d = new ArrayList();

    /* renamed from: e */
    int f11611e = 0;

    /* renamed from: h */
    C3648w f11612h;

    /* renamed from: com.facetec.sdk.v$4 */
    static /* synthetic */ class C36264 {

        /* renamed from: c */
        static final /* synthetic */ int[] f11613c;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facetec.sdk.v$d[] r0 = com.facetec.sdk.C3625v.C3627d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11613c = r0
                com.facetec.sdk.v$d r1 = com.facetec.sdk.C3625v.C3627d.HASH_SET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11613c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.v$d r1 = com.facetec.sdk.C3625v.C3627d.SIZE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11613c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.v$d r1 = com.facetec.sdk.C3625v.C3627d.SESSION_COUNT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11613c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.v$d r1 = com.facetec.sdk.C3625v.C3627d.INTRA_SESSION_LOOP_DETECTION_LEVEL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11613c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.v$d r1 = com.facetec.sdk.C3625v.C3627d.INTRA_FACETEC_SESSION_LOOP_DETECTION_LEVEL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f11613c     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facetec.sdk.v$d r1 = com.facetec.sdk.C3625v.C3627d.INTER_FACETEC_SESSION_LOOP_DETECTION_LEVEL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3625v.C36264.<clinit>():void");
        }
    }

    /* renamed from: com.facetec.sdk.v$d */
    enum C3627d {
        HASH_SET(((String) r4[0]).intern()),
        SIZE("s"),
        SESSION_COUNT("sc"),
        INTRA_SESSION_LOOP_DETECTION_LEVEL("l1"),
        INTRA_FACETEC_SESSION_LOOP_DETECTION_LEVEL("l2"),
        INTER_FACETEC_SESSION_LOOP_DETECTION_LEVEL("l3");
        
        public static final byte[] $$a = null;
        public static final int $$b = 0;
        private static int $10;
        private static int $11;

        /* renamed from: h */
        private static int f11620h;

        /* renamed from: i */
        private static long f11621i;

        /* renamed from: k */
        private static int f11623k;

        /* renamed from: f */
        final String f11624f;

        static {
            char c;
            int i = f11620h + 87;
            f11623k = i % 128;
            if (i % 2 == 0) {
                c = 'E';
            } else {
                c = 'A';
            }
            if (c == 'E') {
                throw null;
            }
        }

        private C3627d(String str) {
            this.f11624f = str;
        }

        /* renamed from: b */
        static void m13939b() {
            f11621i = 8649291411773863391L;
        }

        static void init$0() {
            $$a = new byte[]{97, 41, 56, -48};
            $$b = 120;
        }

        /* renamed from: l */
        private static void m13940l(String str, int i, Object[] objArr) {
            char c;
            Object obj;
            boolean z;
            Throwable cause;
            Class<Object> cls = Object.class;
            int i2 = $10 + 117;
            int i3 = i2 % 128;
            $11 = i3;
            if (i2 % 2 == 0) {
                c = 'H';
            } else {
                c = '`';
            }
            if (c != 'H') {
                if (str != null) {
                    int i4 = i3 + 79;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    obj = str.toCharArray();
                } else {
                    obj = str;
                }
                C3169gk gkVar = new C3169gk();
                char[] b = C3169gk.m12973b(f11621i ^ 1486537209939166088L, (char[]) obj, i);
                int i6 = 4;
                gkVar.f10460a = 4;
                while (true) {
                    int i7 = gkVar.f10460a;
                    if (i7 < b.length) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        objArr[0] = new String(b, i6, b.length - i6);
                        return;
                    }
                    int i8 = i7 - 4;
                    gkVar.f10461b = i8;
                    long j = (long) (b[i7] ^ b[i7 % 4]);
                    long j2 = (long) i8;
                    try {
                        Object[] objArr2 = new Object[3];
                        objArr2[2] = Long.valueOf(f11621i);
                        objArr2[1] = Long.valueOf(j2);
                        objArr2[0] = Long.valueOf(j);
                        Map<Integer, Object> map = C2854bp.f9335p;
                        Object obj2 = map.get(-1479914154);
                        if (obj2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) b2;
                            Object[] objArr3 = new Object[1];
                            m13941m(b2, b3, (byte) (b3 - 1), objArr3);
                            Class cls2 = Long.TYPE;
                            obj2 = ((Class) C2854bp.m11559b((char) Gravity.getAbsoluteGravity(0, 0), 1264 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.lastIndexOf("", '0') + 25)).getMethod((String) objArr3[0], new Class[]{cls2, cls2, cls2});
                            map.put(-1479914154, obj2);
                        }
                        b[i7] = ((Character) ((Method) obj2).invoke((Object) null, objArr2)).charValue();
                        try {
                            Object[] objArr4 = new Object[2];
                            objArr4[1] = gkVar;
                            objArr4[0] = gkVar;
                            Object obj3 = map.get(-369845900);
                            if (obj3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = (byte) (b4 + 1);
                                Object[] objArr5 = new Object[1];
                                m13941m(b4, b5, (byte) (-b5), objArr5);
                                obj3 = ((Class) C2854bp.m11559b((char) (15364 - Drawable.resolveOpacity(0, 0)), View.MeasureSpec.getSize(0) + 1430, (ViewConfiguration.getTouchSlop() >> 8) + 24)).getMethod((String) objArr5[0], new Class[]{cls, cls});
                                map.put(-369845900, obj3);
                            }
                            ((Method) obj3).invoke((Object) null, objArr4);
                            i6 = 4;
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
            } else {
                throw null;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void m13941m(byte r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 4
                int r7 = 121 - r7
                byte[] r0 = $$a
                int r8 = r8 + 4
                int r6 = r6 * 2
                int r6 = r6 + 1
                byte[] r1 = new byte[r6]
                int r6 = r6 + -1
                r2 = 0
                if (r0 != 0) goto L_0x0019
                r3 = r1
                r4 = r2
                r1 = r0
                r0 = r9
                r9 = r8
                goto L_0x0034
            L_0x0019:
                r3 = r2
            L_0x001a:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L_0x0027
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L_0x0027:
                int r8 = r8 + 1
                byte r4 = r0[r8]
                int r3 = r3 + 1
                r5 = r9
                r9 = r8
                r8 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r5
            L_0x0034:
                int r8 = -r8
                int r7 = r7 + r8
                r8 = r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3625v.C3627d.m13941m(byte, short, int, java.lang.Object[]):void");
        }
    }

    C3625v() {
        C3648w wVar = C3648w.NOT_RAN;
        this.f11608b = wVar;
        this.f11607a = wVar;
        this.f11612h = wVar;
    }

    /* renamed from: a */
    static C3625v m13937a(String str) {
        C3625v vVar = new C3625v();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray(C3627d.HASH_SET.f11624f);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList2.add(Integer.valueOf(jSONArray2.getInt(i2)));
                }
                arrayList.add(arrayList2);
            }
            for (C3627d dVar : C3627d.values()) {
                switch (C36264.f11613c[dVar.ordinal()]) {
                    case 1:
                        vVar.f11610d = arrayList;
                        break;
                    case 2:
                        vVar.f11611e = jSONObject.getInt(dVar.f11624f);
                        break;
                    case 3:
                        vVar.f11609c = jSONObject.getInt(dVar.f11624f);
                        break;
                    case 4:
                        vVar.f11608b = C3648w.m13942b(jSONObject.getInt(dVar.f11624f));
                        break;
                    case 5:
                        vVar.f11607a = C3648w.m13942b(jSONObject.getInt(dVar.f11624f));
                        break;
                    case 6:
                        vVar.f11612h = C3648w.m13942b(jSONObject.getInt(dVar.f11624f));
                        break;
                }
            }
        } catch (Exception unused) {
        }
        return vVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final JSONObject mo10089e() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (C3627d dVar : C3627d.values()) {
                switch (C36264.f11613c[dVar.ordinal()]) {
                    case 1:
                        jSONObject.put(dVar.f11624f, new JSONArray(this.f11610d));
                        break;
                    case 2:
                        jSONObject.put(dVar.f11624f, this.f11611e);
                        break;
                    case 3:
                        jSONObject.put(dVar.f11624f, this.f11609c);
                        break;
                    case 4:
                        jSONObject.put(dVar.f11624f, this.f11608b.f11663b);
                        break;
                    case 5:
                        jSONObject.put(dVar.f11624f, this.f11607a.f11663b);
                        break;
                    case 6:
                        jSONObject.put(dVar.f11624f, this.f11612h.f11663b);
                        break;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
