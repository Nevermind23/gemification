package com.google.protobuf;

import com.google.protobuf.C5629a0;
import com.google.protobuf.C5689i1;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.h */
final class C5675h implements C5689i1 {

    /* renamed from: a */
    private final CodedOutputStream f17902a;

    /* renamed from: com.google.protobuf.h$a */
    static /* synthetic */ class C5676a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17903a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.h1$b[] r0 = com.google.protobuf.C5679h1.C5681b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17903a = r0
                com.google.protobuf.h1$b r1 = com.google.protobuf.C5679h1.C5681b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17903a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.h1$b r1 = com.google.protobuf.C5679h1.C5681b.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17903a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.h1$b r1 = com.google.protobuf.C5679h1.C5681b.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17903a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.h1$b r1 = com.google.protobuf.C5679h1.C5681b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17903a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.h1$b r1 = com.google.protobuf.C5679h1.C5681b.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f17903a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.h1$b r1 = com.google.protobuf.C5679h1.C5681b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f17903a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.h1$b r1 = com.google.protobuf.C5679h1.C5681b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f17903a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.h1$b r1 = com.google.protobuf.C5679h1.C5681b.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f17903a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.h1$b r1 = com.google.protobuf.C5679h1.C5681b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f17903a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.h1$b r1 = com.google.protobuf.C5679h1.C5681b.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f17903a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.h1$b r1 = com.google.protobuf.C5679h1.C5681b.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f17903a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.h1$b r1 = com.google.protobuf.C5679h1.C5681b.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5675h.C5676a.<clinit>():void");
        }
    }

    private C5675h(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C5716s.m22991b(codedOutputStream, "output");
        this.f17902a = codedOutputStream2;
        codedOutputStream2.f17819a = this;
    }

    /* renamed from: P */
    public static C5675h m22700P(CodedOutputStream codedOutputStream) {
        C5675h hVar = codedOutputStream.f17819a;
        if (hVar != null) {
            return hVar;
        }
        return new C5675h(codedOutputStream);
    }

    /* renamed from: Q */
    private void m22701Q(int i, boolean z, Object obj, C5629a0.C5630a aVar) {
        this.f17902a.mo18480N0(i, 2);
        this.f17902a.mo18482P0(C5629a0.m22438b(aVar, Boolean.valueOf(z), obj));
        C5629a0.m22440e(this.f17902a, aVar, Boolean.valueOf(z), obj);
    }

    /* renamed from: R */
    private void m22702R(int i, C5629a0.C5630a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i2] = intValue.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            Object obj = map.get(Integer.valueOf(i4));
            this.f17902a.mo18480N0(i, 2);
            this.f17902a.mo18482P0(C5629a0.m22438b(aVar, Integer.valueOf(i4), obj));
            C5629a0.m22440e(this.f17902a, aVar, Integer.valueOf(i4), obj);
        }
    }

    /* renamed from: S */
    private void m22703S(int i, C5629a0.C5630a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i2] = longValue.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            Object obj = map.get(Long.valueOf(j));
            this.f17902a.mo18480N0(i, 2);
            this.f17902a.mo18482P0(C5629a0.m22438b(aVar, Long.valueOf(j), obj));
            C5629a0.m22440e(this.f17902a, aVar, Long.valueOf(j), obj);
        }
    }

    /* renamed from: T */
    private void m22704T(int i, C5629a0.C5630a aVar, Map map) {
        switch (C5676a.f17903a[aVar.f17830a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    m22701Q(i, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    m22701Q(i, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m22702R(i, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m22703S(i, aVar, map);
                return;
            case 12:
                m22705U(i, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f17830a);
        }
    }

    /* renamed from: U */
    private void m22705U(int i, C5629a0.C5630a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        int i2 = 0;
        for (String str : map.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            Object obj = map.get(str2);
            this.f17902a.mo18480N0(i, 2);
            this.f17902a.mo18482P0(C5629a0.m22438b(aVar, str2, obj));
            C5629a0.m22440e(this.f17902a, aVar, str2, obj);
        }
    }

    /* renamed from: V */
    private void m22706V(int i, Object obj) {
        if (obj instanceof String) {
            this.f17902a.mo18478L0(i, (String) obj);
        } else {
            this.f17902a.mo18495f0(i, (C5648f) obj);
        }
    }

    /* renamed from: A */
    public void mo18663A(int i, boolean z) {
        this.f17902a.mo18490b0(i, z);
    }

    /* renamed from: B */
    public void mo18664B(int i, int i2) {
        this.f17902a.mo18470D0(i, i2);
    }

    /* renamed from: C */
    public void mo18665C(int i) {
        this.f17902a.mo18480N0(i, 3);
    }

    /* renamed from: D */
    public void mo18666D(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f17902a.mo18480N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m22341p(((Long) list.get(i4)).longValue());
            }
            this.f17902a.mo18482P0(i3);
            while (i2 < list.size()) {
                this.f17902a.mo18504o0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17902a.mo18503n0(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: E */
    public void mo18667E(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f17902a.mo18480N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m22310F(((Integer) list.get(i4)).intValue());
            }
            this.f17902a.mo18482P0(i3);
            while (i2 < list.size()) {
                this.f17902a.mo18471E0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17902a.mo18470D0(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: F */
    public void mo18668F(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f17902a.mo18480N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m22330e(((Boolean) list.get(i4)).booleanValue());
            }
            this.f17902a.mo18482P0(i3);
            while (i2 < list.size()) {
                this.f17902a.mo18492c0(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17902a.mo18490b0(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: G */
    public void mo18669G(int i, C5629a0.C5630a aVar, Map map) {
        if (this.f17902a.mo18486W()) {
            m22704T(i, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f17902a.mo18480N0(i, 2);
            this.f17902a.mo18482P0(C5629a0.m22438b(aVar, entry.getKey(), entry.getValue()));
            C5629a0.m22440e(this.f17902a, aVar, entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: H */
    public void mo18670H(int i, float f) {
        this.f17902a.mo18505p0(i, f);
    }

    /* renamed from: I */
    public void mo18671I(int i) {
        this.f17902a.mo18480N0(i, 4);
    }

    /* renamed from: J */
    public void mo18672J(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f17902a.mo18480N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m22314J(((Integer) list.get(i4)).intValue());
            }
            this.f17902a.mo18482P0(i3);
            while (i2 < list.size()) {
                this.f17902a.mo18475I0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17902a.mo18474H0(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: K */
    public void mo18673K(int i, int i2) {
        this.f17902a.mo18499j0(i, i2);
    }

    /* renamed from: L */
    public void mo18674L(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f17902a.mo18480N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m22350y(((Long) list.get(i4)).longValue());
            }
            this.f17902a.mo18482P0(i3);
            while (i2 < list.size()) {
                this.f17902a.mo18514y0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17902a.mo18513x0(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: M */
    public void mo18675M(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f17902a.mo18480N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m22335j(((Double) list.get(i4)).doubleValue());
            }
            this.f17902a.mo18482P0(i3);
            while (i2 < list.size()) {
                this.f17902a.mo18498i0(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17902a.mo18497h0(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    /* renamed from: N */
    public void mo18676N(int i, int i2) {
        this.f17902a.mo18474H0(i, i2);
    }

    /* renamed from: O */
    public void mo18677O(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f17902a.mo18495f0(i, (C5648f) list.get(i2));
        }
    }

    /* renamed from: a */
    public void mo18678a(int i, List list, C5728v0 v0Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo18700w(i, list.get(i2), v0Var);
        }
    }

    /* renamed from: b */
    public void mo18679b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f17902a.mo18480N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m22343r(((Float) list.get(i4)).floatValue());
            }
            this.f17902a.mo18482P0(i3);
            while (i2 < list.size()) {
                this.f17902a.mo18506q0(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17902a.mo18505p0(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo18680c(int i, Object obj) {
        if (obj instanceof C5648f) {
            this.f17902a.mo18469C0(i, (C5648f) obj);
        } else {
            this.f17902a.mo18468B0(i, (C5677h0) obj);
        }
    }

    /* renamed from: d */
    public void mo18681d(int i, int i2) {
        this.f17902a.mo18501l0(i, i2);
    }

    /* renamed from: e */
    public void mo18682e(int i, List list) {
        int i2 = 0;
        if (list instanceof C5731x) {
            C5731x xVar = (C5731x) list;
            while (i2 < list.size()) {
                m22706V(i, xVar.mo18586z1(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17902a.mo18478L0(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: f */
    public void mo18683f(int i, String str) {
        this.f17902a.mo18478L0(i, str);
    }

    /* renamed from: g */
    public void mo18684g(int i, long j) {
        this.f17902a.mo18483Q0(i, j);
    }

    /* renamed from: h */
    public void mo18685h(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f17902a.mo18480N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m22348w(((Integer) list.get(i4)).intValue());
            }
            this.f17902a.mo18482P0(i3);
            while (i2 < list.size()) {
                this.f17902a.mo18512w0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17902a.mo18511v0(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public void mo18686i(int i, Object obj, C5728v0 v0Var) {
        this.f17902a.mo18508s0(i, (C5677h0) obj, v0Var);
    }

    /* renamed from: j */
    public void mo18687j(int i, C5648f fVar) {
        this.f17902a.mo18495f0(i, fVar);
    }

    /* renamed from: k */
    public void mo18688k(int i, int i2) {
        this.f17902a.mo18511v0(i, i2);
    }

    /* renamed from: l */
    public void mo18689l(int i, long j) {
        this.f17902a.mo18472F0(i, j);
    }

    /* renamed from: m */
    public void mo18690m(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f17902a.mo18480N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m22339n(((Integer) list.get(i4)).intValue());
            }
            this.f17902a.mo18482P0(i3);
            while (i2 < list.size()) {
                this.f17902a.mo18502m0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17902a.mo18501l0(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public void mo18691n(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f17902a.mo18480N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m22321Q(((Integer) list.get(i4)).intValue());
            }
            this.f17902a.mo18482P0(i3);
            while (i2 < list.size()) {
                this.f17902a.mo18482P0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17902a.mo18481O0(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: o */
    public void mo18692o(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f17902a.mo18480N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m22316L(((Long) list.get(i4)).longValue());
            }
            this.f17902a.mo18482P0(i3);
            while (i2 < list.size()) {
                this.f17902a.mo18477K0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17902a.mo18476J0(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: p */
    public void mo18693p(int i, long j) {
        this.f17902a.mo18476J0(i, j);
    }

    /* renamed from: q */
    public void mo18694q(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f17902a.mo18480N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m22337l(((Integer) list.get(i4)).intValue());
            }
            this.f17902a.mo18482P0(i3);
            while (i2 < list.size()) {
                this.f17902a.mo18500k0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17902a.mo18499j0(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: r */
    public void mo18695r(int i, List list, C5728v0 v0Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo18686i(i, list.get(i2), v0Var);
        }
    }

    /* renamed from: s */
    public void mo18696s(int i, int i2) {
        this.f17902a.mo18481O0(i, i2);
    }

    /* renamed from: t */
    public void mo18697t(int i, double d) {
        this.f17902a.mo18497h0(i, d);
    }

    /* renamed from: u */
    public void mo18698u(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f17902a.mo18480N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m22312H(((Long) list.get(i4)).longValue());
            }
            this.f17902a.mo18482P0(i3);
            while (i2 < list.size()) {
                this.f17902a.mo18473G0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17902a.mo18472F0(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: v */
    public void mo18699v(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f17902a.mo18480N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m22323S(((Long) list.get(i4)).longValue());
            }
            this.f17902a.mo18482P0(i3);
            while (i2 < list.size()) {
                this.f17902a.mo18484R0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17902a.mo18483Q0(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: w */
    public void mo18700w(int i, Object obj, C5728v0 v0Var) {
        this.f17902a.mo18515z0(i, (C5677h0) obj, v0Var);
    }

    /* renamed from: x */
    public void mo18701x(int i, long j) {
        this.f17902a.mo18503n0(i, j);
    }

    /* renamed from: y */
    public C5689i1.C5690a mo18702y() {
        return C5689i1.C5690a.ASCENDING;
    }

    /* renamed from: z */
    public void mo18703z(int i, long j) {
        this.f17902a.mo18513x0(i, j);
    }
}
