package of1;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: of1.d */
public final class C41877d {

    /* renamed from: n */
    public static final C41879b f98285n = new C41879b((DefaultConstructorMarker) null);

    /* renamed from: o */
    public static final C41877d f98286o = new C41878a().mo96733d().mo96731a();

    /* renamed from: p */
    public static final C41877d f98287p = new C41878a().mo96734e().mo96732c(Integer.MAX_VALUE, TimeUnit.SECONDS).mo96731a();

    /* renamed from: a */
    private final boolean f98288a;

    /* renamed from: b */
    private final boolean f98289b;

    /* renamed from: c */
    private final int f98290c;

    /* renamed from: d */
    private final int f98291d;

    /* renamed from: e */
    private final boolean f98292e;

    /* renamed from: f */
    private final boolean f98293f;

    /* renamed from: g */
    private final boolean f98294g;

    /* renamed from: h */
    private final int f98295h;

    /* renamed from: i */
    private final int f98296i;

    /* renamed from: j */
    private final boolean f98297j;

    /* renamed from: k */
    private final boolean f98298k;

    /* renamed from: l */
    private final boolean f98299l;

    /* renamed from: m */
    private String f98300m;

    /* renamed from: of1.d$a */
    public static final class C41878a {

        /* renamed from: a */
        private boolean f98301a;

        /* renamed from: b */
        private boolean f98302b;

        /* renamed from: c */
        private int f98303c = -1;

        /* renamed from: d */
        private int f98304d = -1;

        /* renamed from: e */
        private int f98305e = -1;

        /* renamed from: f */
        private boolean f98306f;

        /* renamed from: g */
        private boolean f98307g;

        /* renamed from: h */
        private boolean f98308h;

        /* renamed from: b */
        private final int m121372b(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        /* renamed from: a */
        public final C41877d mo96731a() {
            return new C41877d(this.f98301a, this.f98302b, this.f98303c, -1, false, false, false, this.f98304d, this.f98305e, this.f98306f, this.f98307g, this.f98308h, (String) null, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public final C41878a mo96732c(int i, TimeUnit timeUnit) {
            boolean z;
            C41536l.m120489i(timeUnit, "timeUnit");
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f98304d = m121372b(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(C41536l.m120497q("maxStale < 0: ", Integer.valueOf(i)).toString());
        }

        /* renamed from: d */
        public final C41878a mo96733d() {
            this.f98301a = true;
            return this;
        }

        /* renamed from: e */
        public final C41878a mo96734e() {
            this.f98306f = true;
            return this;
        }
    }

    /* renamed from: of1.d$b */
    public static final class C41879b {
        private C41879b() {
        }

        public /* synthetic */ C41879b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final int m121377a(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                int i2 = i + 1;
                if (C40440x.m117137L(str2, str.charAt(i), false, 2, (Object) null)) {
                    return i;
                }
                i = i2;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final of1.C41877d mo96735b(of1.C41928u r31) {
            /*
                r30 = this;
                r0 = r30
                r1 = r31
                java.lang.String r2 = "headers"
                kotlin.jvm.internal.C41536l.m120489i(r1, r2)
                int r2 = r31.size()
                r5 = 1
                r8 = r5
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x0188
                int r22 = r7 + 1
                java.lang.String r3 = r1.mo96926c(r7)
                java.lang.String r7 = r1.mo96932n(r7)
                java.lang.String r6 = "Cache-Control"
                boolean r6 = cf1.C40439w.m117115s(r3, r6, r5)
                if (r6 == 0) goto L_0x003c
                if (r9 == 0) goto L_0x003a
                goto L_0x0044
            L_0x003a:
                r9 = r7
                goto L_0x0045
            L_0x003c:
                java.lang.String r6 = "Pragma"
                boolean r3 = cf1.C40439w.m117115s(r3, r6, r5)
                if (r3 == 0) goto L_0x0181
            L_0x0044:
                r8 = 0
            L_0x0045:
                r3 = 0
            L_0x0046:
                int r6 = r7.length()
                if (r3 >= r6) goto L_0x0181
                java.lang.String r6 = "=,;"
                int r6 = r0.m121377a(r7, r6, r3)
                java.lang.String r3 = r7.substring(r3, r6)
                java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C41536l.m120488h(r3, r4)
                java.lang.CharSequence r3 = cf1.C40440x.m117146P0(r3)
                java.lang.String r3 = r3.toString()
                int r5 = r7.length()
                if (r6 == r5) goto L_0x00c0
                char r5 = r7.charAt(r6)
                r1 = 44
                if (r5 == r1) goto L_0x00c0
                char r1 = r7.charAt(r6)
                r5 = 59
                if (r1 != r5) goto L_0x007a
                goto L_0x00c0
            L_0x007a:
                int r6 = r6 + 1
                int r1 = pf1.C42197d.m122510D(r7, r6)
                int r5 = r7.length()
                if (r1 >= r5) goto L_0x00aa
                char r5 = r7.charAt(r1)
                r6 = 34
                if (r5 != r6) goto L_0x00aa
                int r1 = r1 + 1
                r25 = 34
                r27 = 0
                r28 = 4
                r29 = 0
                r24 = r7
                r26 = r1
                int r5 = cf1.C40440x.m117155W(r24, r25, r26, r27, r28, r29)
                java.lang.String r1 = r7.substring(r1, r5)
                kotlin.jvm.internal.C41536l.m120488h(r1, r4)
                r4 = 1
                int r5 = r5 + r4
                goto L_0x00c4
            L_0x00aa:
                java.lang.String r5 = ",;"
                int r5 = r0.m121377a(r7, r5, r1)
                java.lang.String r1 = r7.substring(r1, r5)
                kotlin.jvm.internal.C41536l.m120488h(r1, r4)
                java.lang.CharSequence r1 = cf1.C40440x.m117146P0(r1)
                java.lang.String r1 = r1.toString()
                goto L_0x00c4
            L_0x00c0:
                int r6 = r6 + 1
                r5 = r6
                r1 = 0
            L_0x00c4:
                java.lang.String r4 = "no-cache"
                r6 = 1
                boolean r4 = cf1.C40439w.m117115s(r4, r3, r6)
                if (r4 == 0) goto L_0x00d4
                r1 = r31
                r3 = r5
                r5 = r6
                r10 = r5
                goto L_0x0046
            L_0x00d4:
                java.lang.String r4 = "no-store"
                boolean r4 = cf1.C40439w.m117115s(r4, r3, r6)
                if (r4 == 0) goto L_0x00e3
                r1 = r31
                r3 = r5
                r5 = r6
                r11 = r5
                goto L_0x0046
            L_0x00e3:
                java.lang.String r4 = "max-age"
                boolean r4 = cf1.C40439w.m117115s(r4, r3, r6)
                if (r4 == 0) goto L_0x00f6
                r4 = -1
                int r12 = pf1.C42197d.m122530X(r1, r4)
            L_0x00f0:
                r1 = r31
                r3 = r5
                r5 = r6
                goto L_0x0046
            L_0x00f6:
                java.lang.String r4 = "s-maxage"
                boolean r4 = cf1.C40439w.m117115s(r4, r3, r6)
                if (r4 == 0) goto L_0x0104
                r4 = -1
                int r13 = pf1.C42197d.m122530X(r1, r4)
                goto L_0x00f0
            L_0x0104:
                java.lang.String r4 = "private"
                boolean r4 = cf1.C40439w.m117115s(r4, r3, r6)
                if (r4 == 0) goto L_0x0113
                r1 = r31
                r3 = r5
                r5 = r6
                r14 = r5
                goto L_0x0046
            L_0x0113:
                java.lang.String r4 = "public"
                boolean r4 = cf1.C40439w.m117115s(r4, r3, r6)
                if (r4 == 0) goto L_0x0122
                r1 = r31
                r3 = r5
                r5 = r6
                r15 = r5
                goto L_0x0046
            L_0x0122:
                java.lang.String r4 = "must-revalidate"
                boolean r4 = cf1.C40439w.m117115s(r4, r3, r6)
                if (r4 == 0) goto L_0x0132
                r1 = r31
                r3 = r5
                r5 = r6
                r16 = r5
                goto L_0x0046
            L_0x0132:
                java.lang.String r4 = "max-stale"
                boolean r4 = cf1.C40439w.m117115s(r4, r3, r6)
                if (r4 == 0) goto L_0x0142
                r3 = 2147483647(0x7fffffff, float:NaN)
                int r17 = pf1.C42197d.m122530X(r1, r3)
                goto L_0x00f0
            L_0x0142:
                java.lang.String r4 = "min-fresh"
                boolean r4 = cf1.C40439w.m117115s(r4, r3, r6)
                if (r4 == 0) goto L_0x0150
                r4 = -1
                int r18 = pf1.C42197d.m122530X(r1, r4)
                goto L_0x00f0
            L_0x0150:
                r4 = -1
                java.lang.String r1 = "only-if-cached"
                boolean r1 = cf1.C40439w.m117115s(r1, r3, r6)
                if (r1 == 0) goto L_0x0161
                r1 = r31
                r3 = r5
                r5 = r6
                r19 = r5
                goto L_0x0046
            L_0x0161:
                java.lang.String r1 = "no-transform"
                boolean r1 = cf1.C40439w.m117115s(r1, r3, r6)
                if (r1 == 0) goto L_0x0171
                r1 = r31
                r3 = r5
                r5 = r6
                r20 = r5
                goto L_0x0046
            L_0x0171:
                java.lang.String r1 = "immutable"
                boolean r1 = cf1.C40439w.m117115s(r1, r3, r6)
                if (r1 == 0) goto L_0x00f0
                r1 = r31
                r3 = r5
                r5 = r6
                r21 = r5
                goto L_0x0046
            L_0x0181:
                r4 = -1
                r1 = r31
                r7 = r22
                goto L_0x0023
            L_0x0188:
                if (r8 != 0) goto L_0x018d
                r22 = 0
                goto L_0x018f
            L_0x018d:
                r22 = r9
            L_0x018f:
                of1.d r1 = new of1.d
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: of1.C41877d.C41879b.mo96735b(of1.u):of1.d");
        }
    }

    public /* synthetic */ C41877d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    /* renamed from: a */
    public final boolean mo96718a() {
        return this.f98299l;
    }

    /* renamed from: b */
    public final boolean mo96719b() {
        return this.f98292e;
    }

    /* renamed from: c */
    public final boolean mo96720c() {
        return this.f98293f;
    }

    /* renamed from: d */
    public final int mo96721d() {
        return this.f98290c;
    }

    /* renamed from: e */
    public final int mo96722e() {
        return this.f98295h;
    }

    /* renamed from: f */
    public final int mo96723f() {
        return this.f98296i;
    }

    /* renamed from: g */
    public final boolean mo96724g() {
        return this.f98294g;
    }

    /* renamed from: h */
    public final boolean mo96725h() {
        return this.f98288a;
    }

    /* renamed from: i */
    public final boolean mo96726i() {
        return this.f98289b;
    }

    /* renamed from: j */
    public final boolean mo96727j() {
        return this.f98298k;
    }

    /* renamed from: k */
    public final boolean mo96728k() {
        return this.f98297j;
    }

    /* renamed from: l */
    public final int mo96729l() {
        return this.f98291d;
    }

    public String toString() {
        boolean z;
        String str = this.f98300m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (mo96725h()) {
            sb.append("no-cache, ");
        }
        if (mo96726i()) {
            sb.append("no-store, ");
        }
        if (mo96721d() != -1) {
            sb.append("max-age=");
            sb.append(mo96721d());
            sb.append(", ");
        }
        if (mo96729l() != -1) {
            sb.append("s-maxage=");
            sb.append(mo96729l());
            sb.append(", ");
        }
        if (mo96719b()) {
            sb.append("private, ");
        }
        if (mo96720c()) {
            sb.append("public, ");
        }
        if (mo96724g()) {
            sb.append("must-revalidate, ");
        }
        if (mo96722e() != -1) {
            sb.append("max-stale=");
            sb.append(mo96722e());
            sb.append(", ");
        }
        if (mo96723f() != -1) {
            sb.append("min-fresh=");
            sb.append(mo96723f());
            sb.append(", ");
        }
        if (mo96728k()) {
            sb.append("only-if-cached, ");
        }
        if (mo96727j()) {
            sb.append("no-transform, ");
        }
        if (mo96718a()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f98300m = sb2;
        return sb2;
    }

    private C41877d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f98288a = z;
        this.f98289b = z2;
        this.f98290c = i;
        this.f98291d = i2;
        this.f98292e = z3;
        this.f98293f = z4;
        this.f98294g = z5;
        this.f98295h = i3;
        this.f98296i = i4;
        this.f98297j = z6;
        this.f98298k = z7;
        this.f98299l = z8;
        this.f98300m = str;
    }
}
