package com.facetec.sdk;

import java.util.concurrent.TimeUnit;

/* renamed from: com.facetec.sdk.jf */
public final class C3240jf {

    /* renamed from: a */
    private final boolean f10556a;

    /* renamed from: b */
    private final int f10557b;

    /* renamed from: c */
    private final boolean f10558c;

    /* renamed from: d */
    private final int f10559d;

    /* renamed from: e */
    private final boolean f10560e;

    /* renamed from: f */
    private final int f10561f;

    /* renamed from: g */
    private final boolean f10562g;

    /* renamed from: h */
    private final boolean f10563h;

    /* renamed from: i */
    private final boolean f10564i;

    /* renamed from: j */
    private final int f10565j;

    /* renamed from: m */
    private final boolean f10566m;

    /* renamed from: n */
    private final boolean f10567n;

    /* renamed from: o */
    private String f10568o;

    /* renamed from: com.facetec.sdk.jf$b */
    public static final class C3241b {

        /* renamed from: a */
        boolean f10569a;

        /* renamed from: b */
        int f10570b = -1;

        /* renamed from: c */
        boolean f10571c;

        /* renamed from: d */
        int f10572d = -1;

        /* renamed from: e */
        int f10573e = -1;

        /* renamed from: f */
        boolean f10574f;

        /* renamed from: h */
        boolean f10575h;

        /* renamed from: i */
        boolean f10576i;

        /* renamed from: b */
        public final C3240jf mo9450b() {
            return new C3240jf(this);
        }
    }

    static {
        int i;
        C3241b bVar = new C3241b();
        bVar.f10569a = true;
        bVar.mo9450b();
        C3241b bVar2 = new C3241b();
        bVar2.f10574f = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        if (seconds > 2147483647L) {
            i = Integer.MAX_VALUE;
        } else {
            i = (int) seconds;
        }
        bVar2.f10570b = i;
        bVar2.mo9450b();
    }

    private C3240jf(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f10556a = z;
        this.f10560e = z2;
        this.f10559d = i;
        this.f10557b = i2;
        this.f10558c = z3;
        this.f10562g = z4;
        this.f10564i = z5;
        this.f10561f = i3;
        this.f10565j = i4;
        this.f10563h = z6;
        this.f10566m = z7;
        this.f10567n = z8;
        this.f10568o = str;
    }

    /* renamed from: a */
    public final boolean mo9440a() {
        return this.f10558c;
    }

    /* renamed from: b */
    public final boolean mo9441b() {
        return this.f10556a;
    }

    /* renamed from: c */
    public final boolean mo9442c() {
        return this.f10560e;
    }

    /* renamed from: d */
    public final int mo9443d() {
        return this.f10559d;
    }

    /* renamed from: e */
    public final boolean mo9444e() {
        return this.f10562g;
    }

    /* renamed from: g */
    public final int mo9445g() {
        return this.f10561f;
    }

    /* renamed from: h */
    public final int mo9446h() {
        return this.f10565j;
    }

    /* renamed from: i */
    public final boolean mo9447i() {
        return this.f10564i;
    }

    /* renamed from: j */
    public final boolean mo9448j() {
        return this.f10563h;
    }

    public final String toString() {
        String str;
        String str2 = this.f10568o;
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f10556a) {
            sb.append("no-cache, ");
        }
        if (this.f10560e) {
            sb.append("no-store, ");
        }
        if (this.f10559d != -1) {
            sb.append("max-age=");
            sb.append(this.f10559d);
            sb.append(", ");
        }
        if (this.f10557b != -1) {
            sb.append("s-maxage=");
            sb.append(this.f10557b);
            sb.append(", ");
        }
        if (this.f10558c) {
            sb.append("private, ");
        }
        if (this.f10562g) {
            sb.append("public, ");
        }
        if (this.f10564i) {
            sb.append("must-revalidate, ");
        }
        if (this.f10561f != -1) {
            sb.append("max-stale=");
            sb.append(this.f10561f);
            sb.append(", ");
        }
        if (this.f10565j != -1) {
            sb.append("min-fresh=");
            sb.append(this.f10565j);
            sb.append(", ");
        }
        if (this.f10563h) {
            sb.append("only-if-cached, ");
        }
        if (this.f10566m) {
            sb.append("no-transform, ");
        }
        if (this.f10567n) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            str = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            str = sb.toString();
        }
        this.f10568o = str;
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facetec.sdk.C3240jf m13002e(com.facetec.sdk.C3260jr r22) {
        /*
            r0 = r22
            int r1 = r22.mo9487a()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x0136
            java.lang.String r2 = r0.mo9489b(r6)
            java.lang.String r5 = r0.mo9490c(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r8 = r5
            goto L_0x003a
        L_0x0031:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x012f
        L_0x0039:
            r7 = 0
        L_0x003a:
            r2 = 0
        L_0x003b:
            int r3 = r5.length()
            if (r2 >= r3) goto L_0x012f
            java.lang.String r3 = "=,;"
            int r3 = com.facetec.sdk.C3328ky.m13336d(r5, r2, r3)
            java.lang.String r2 = r5.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r4 = r5.length()
            if (r3 == r4) goto L_0x0099
            char r4 = r5.charAt(r3)
            r0 = 44
            if (r4 == r0) goto L_0x0099
            char r0 = r5.charAt(r3)
            r4 = 59
            if (r0 != r4) goto L_0x0066
            goto L_0x0099
        L_0x0066:
            int r3 = r3 + 1
            int r0 = com.facetec.sdk.C3328ky.m13334c(r5, r3)
            int r3 = r5.length()
            if (r0 >= r3) goto L_0x0089
            char r3 = r5.charAt(r0)
            r4 = 34
            if (r3 != r4) goto L_0x0089
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = com.facetec.sdk.C3328ky.m13336d(r5, r0, r3)
            java.lang.String r0 = r5.substring(r0, r3)
            r4 = 1
            int r3 = r3 + r4
            goto L_0x009d
        L_0x0089:
            r4 = 1
            java.lang.String r3 = ",;"
            int r3 = com.facetec.sdk.C3328ky.m13336d(r5, r0, r3)
            java.lang.String r0 = r5.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009d
        L_0x0099:
            r4 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009d:
            java.lang.String r4 = "no-cache"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00aa
            r9 = 1
        L_0x00a6:
            r0 = r22
            r2 = r3
            goto L_0x003b
        L_0x00aa:
            java.lang.String r4 = "no-store"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00b4
            r10 = 1
            goto L_0x00a6
        L_0x00b4:
            java.lang.String r4 = "max-age"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00c2
            r4 = -1
            int r11 = com.facetec.sdk.C3328ky.m13337e(r0, r4)
            goto L_0x00a6
        L_0x00c2:
            java.lang.String r4 = "s-maxage"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00d0
            r4 = -1
            int r12 = com.facetec.sdk.C3328ky.m13337e(r0, r4)
            goto L_0x00a6
        L_0x00d0:
            java.lang.String r4 = "private"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00da
            r13 = 1
            goto L_0x00a6
        L_0x00da:
            java.lang.String r4 = "public"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00e4
            r14 = 1
            goto L_0x00a6
        L_0x00e4:
            java.lang.String r4 = "must-revalidate"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00ee
            r15 = 1
            goto L_0x00a6
        L_0x00ee:
            java.lang.String r4 = "max-stale"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00fe
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = com.facetec.sdk.C3328ky.m13337e(r0, r2)
            goto L_0x00a6
        L_0x00fe:
            java.lang.String r4 = "min-fresh"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x010c
            r4 = -1
            int r17 = com.facetec.sdk.C3328ky.m13337e(r0, r4)
            goto L_0x00a6
        L_0x010c:
            r4 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0118
            r18 = 1
            goto L_0x00a6
        L_0x0118:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0123
            r19 = 1
            goto L_0x00a6
        L_0x0123:
            java.lang.String r0 = "immutable"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x00a6
            r20 = 1
            goto L_0x00a6
        L_0x012f:
            r4 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x0136:
            if (r7 != 0) goto L_0x013b
            r21 = 0
            goto L_0x013d
        L_0x013b:
            r21 = r8
        L_0x013d:
            com.facetec.sdk.jf r0 = new com.facetec.sdk.jf
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3240jf.m13002e(com.facetec.sdk.jr):com.facetec.sdk.jf");
    }

    C3240jf(C3241b bVar) {
        this.f10556a = bVar.f10569a;
        this.f10560e = bVar.f10571c;
        this.f10559d = bVar.f10572d;
        this.f10557b = -1;
        this.f10558c = false;
        this.f10562g = false;
        this.f10564i = false;
        this.f10561f = bVar.f10570b;
        this.f10565j = bVar.f10573e;
        this.f10563h = bVar.f10574f;
        this.f10566m = bVar.f10576i;
        this.f10567n = bVar.f10575h;
    }
}
