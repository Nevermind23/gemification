package com.facetec.sdk;

/* renamed from: com.facetec.sdk.kk */
public final class C3309kk implements C3272jw {

    /* renamed from: a */
    private C3317kq f10879a;

    public C3309kk(C3317kq kqVar) {
        this.f10879a = kqVar;
    }

    /* renamed from: a */
    private static boolean m13282a(String str) {
        if ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static C3295kc m13283b(C3295kc kcVar) {
        if (kcVar == null || kcVar.mo9607c() == null) {
            return kcVar;
        }
        return kcVar.mo9612f().mo9625d((C3291ka) null).mo9621a();
    }

    /* renamed from: c */
    private static boolean m13284c(String str) {
        if ("Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [com.facetec.sdk.kb, com.facetec.sdk.kc] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x021a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a7  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facetec.sdk.C3295kc mo9536e(com.facetec.sdk.C3272jw.C3273a r19) {
        /*
            r18 = this;
            r1 = r18
            com.facetec.sdk.kq r0 = r1.f10879a
            r2 = 0
            if (r0 == 0) goto L_0x0010
            r19.mo9537a()
            com.facetec.sdk.kc r0 = r0.mo9652c()
            r3 = r0
            goto L_0x0011
        L_0x0010:
            r3 = r2
        L_0x0011:
            long r4 = java.lang.System.currentTimeMillis()
            com.facetec.sdk.km$a r0 = new com.facetec.sdk.km$a
            com.facetec.sdk.kb r6 = r19.mo9537a()
            r0.<init>(r4, r6, r3)
            com.facetec.sdk.kc r4 = r0.f10889c
            java.lang.String r5 = "Warning"
            if (r4 != 0) goto L_0x002f
            com.facetec.sdk.km r4 = new com.facetec.sdk.km
            com.facetec.sdk.kb r6 = r0.f10891e
            r4.<init>(r6, r2)
        L_0x002b:
            r15 = r3
            r3 = r2
            goto L_0x01f4
        L_0x002f:
            com.facetec.sdk.kb r4 = r0.f10891e
            boolean r4 = r4.mo9595j()
            if (r4 == 0) goto L_0x0045
            com.facetec.sdk.kc r4 = r0.f10889c
            com.facetec.sdk.jq r4 = r4.f10796a
            if (r4 != 0) goto L_0x0045
            com.facetec.sdk.km r4 = new com.facetec.sdk.km
            com.facetec.sdk.kb r6 = r0.f10891e
            r4.<init>(r6, r2)
            goto L_0x002b
        L_0x0045:
            com.facetec.sdk.kc r4 = r0.f10889c
            com.facetec.sdk.kb r6 = r0.f10891e
            boolean r4 = com.facetec.sdk.C3312km.m13289d(r4, r6)
            if (r4 != 0) goto L_0x0057
            com.facetec.sdk.km r4 = new com.facetec.sdk.km
            com.facetec.sdk.kb r6 = r0.f10891e
            r4.<init>(r6, r2)
            goto L_0x002b
        L_0x0057:
            com.facetec.sdk.kb r4 = r0.f10891e
            com.facetec.sdk.jf r4 = r4.mo9594h()
            boolean r6 = r4.mo9441b()
            if (r6 != 0) goto L_0x01eb
            com.facetec.sdk.kb r6 = r0.f10891e
            boolean r6 = com.facetec.sdk.C3312km.C3313a.m13290a(r6)
            if (r6 == 0) goto L_0x006d
            goto L_0x01eb
        L_0x006d:
            com.facetec.sdk.kc r6 = r0.f10889c
            com.facetec.sdk.jf r6 = r6.mo9616j()
            java.util.Date r7 = r0.f10890d
            r8 = 0
            if (r7 == 0) goto L_0x0085
            long r10 = r0.f10892f
            long r12 = r7.getTime()
            long r10 = r10 - r12
            long r10 = java.lang.Math.max(r8, r10)
            goto L_0x0086
        L_0x0085:
            r10 = r8
        L_0x0086:
            int r7 = r0.f10898m
            r12 = -1
            if (r7 == r12) goto L_0x0096
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            long r14 = (long) r7
            long r13 = r13.toMillis(r14)
            long r10 = java.lang.Math.max(r10, r13)
        L_0x0096:
            long r13 = r0.f10892f
            r15 = r3
            long r2 = r0.f10896j
            long r2 = r13 - r2
            long r7 = r0.f10887a
            long r7 = r7 - r13
            long r10 = r10 + r2
            long r10 = r10 + r7
            com.facetec.sdk.kc r2 = r0.f10889c
            com.facetec.sdk.jf r2 = r2.mo9616j()
            int r3 = r2.mo9443d()
            if (r3 == r12) goto L_0x00bc
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            int r2 = r2.mo9443d()
            long r7 = (long) r2
            long r2 = r3.toMillis(r7)
        L_0x00b9:
            r7 = 0
            goto L_0x0120
        L_0x00bc:
            java.util.Date r2 = r0.f10893g
            if (r2 == 0) goto L_0x00dd
            java.util.Date r2 = r0.f10890d
            if (r2 == 0) goto L_0x00c9
            long r2 = r2.getTime()
            goto L_0x00cb
        L_0x00c9:
            long r2 = r0.f10892f
        L_0x00cb:
            java.util.Date r7 = r0.f10893g
            long r7 = r7.getTime()
            long r2 = r7 - r2
            r7 = 0
            int r13 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r13 <= 0) goto L_0x00da
            goto L_0x00b9
        L_0x00da:
            r2 = 0
            goto L_0x00b9
        L_0x00dd:
            java.util.Date r2 = r0.f10894h
            if (r2 == 0) goto L_0x011d
            com.facetec.sdk.kc r2 = r0.f10889c
            com.facetec.sdk.kb r2 = r2.mo9609d()
            com.facetec.sdk.jx r2 = r2.mo9588a()
            java.util.List<java.lang.String> r3 = r2.f10733c
            if (r3 != 0) goto L_0x00f1
            r7 = 0
            goto L_0x00ff
        L_0x00f1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.List<java.lang.String> r2 = r2.f10733c
            com.facetec.sdk.C3274jx.m13117d(r3, r2)
            java.lang.String r7 = r3.toString()
        L_0x00ff:
            if (r7 != 0) goto L_0x011d
            java.util.Date r2 = r0.f10890d
            if (r2 == 0) goto L_0x010a
            long r2 = r2.getTime()
            goto L_0x010c
        L_0x010a:
            long r2 = r0.f10896j
        L_0x010c:
            java.util.Date r7 = r0.f10894h
            long r7 = r7.getTime()
            long r2 = r2 - r7
            r7 = 0
            int r13 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r13 <= 0) goto L_0x011f
            r13 = 10
            long r2 = r2 / r13
            goto L_0x0120
        L_0x011d:
            r7 = 0
        L_0x011f:
            r2 = r7
        L_0x0120:
            int r13 = r4.mo9443d()
            if (r13 == r12) goto L_0x0135
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            int r14 = r4.mo9443d()
            long r7 = (long) r14
            long r7 = r13.toMillis(r7)
            long r2 = java.lang.Math.min(r2, r7)
        L_0x0135:
            int r7 = r4.mo9446h()
            if (r7 == r12) goto L_0x0147
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            int r8 = r4.mo9446h()
            long r13 = (long) r8
            long r7 = r7.toMillis(r13)
            goto L_0x0149
        L_0x0147:
            r7 = 0
        L_0x0149:
            boolean r13 = r6.mo9447i()
            if (r13 != 0) goto L_0x0163
            int r13 = r4.mo9445g()
            if (r13 == r12) goto L_0x0163
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            int r4 = r4.mo9445g()
            long r13 = (long) r4
            long r12 = r12.toMillis(r13)
            r16 = r12
            goto L_0x0165
        L_0x0163:
            r16 = 0
        L_0x0165:
            boolean r4 = r6.mo9441b()
            if (r4 != 0) goto L_0x01a0
            long r7 = r7 + r10
            long r16 = r2 + r16
            int r4 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r4 >= 0) goto L_0x01a0
            com.facetec.sdk.kc r4 = r0.f10889c
            com.facetec.sdk.kc$d r4 = r4.mo9612f()
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0181
            java.lang.String r2 = "110 HttpURLConnection \"Response is stale\""
            r4.mo9620a(r5, r2)
        L_0x0181:
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0193
            boolean r2 = r0.mo9646d()
            if (r2 == 0) goto L_0x0193
            java.lang.String r2 = "113 HttpURLConnection \"Heuristic expiration\""
            r4.mo9620a(r5, r2)
        L_0x0193:
            com.facetec.sdk.km r2 = new com.facetec.sdk.km
            com.facetec.sdk.kc r3 = r4.mo9621a()
            r4 = 0
            r2.<init>(r4, r3)
            r3 = r4
            r4 = r2
            goto L_0x01f4
        L_0x01a0:
            java.lang.String r2 = r0.f10897k
            if (r2 == 0) goto L_0x01a7
            java.lang.String r3 = "If-None-Match"
            goto L_0x01b6
        L_0x01a7:
            java.util.Date r2 = r0.f10894h
            java.lang.String r3 = "If-Modified-Since"
            if (r2 == 0) goto L_0x01b0
            java.lang.String r2 = r0.f10895i
            goto L_0x01b6
        L_0x01b0:
            java.util.Date r2 = r0.f10890d
            if (r2 == 0) goto L_0x01e2
            java.lang.String r2 = r0.f10888b
        L_0x01b6:
            com.facetec.sdk.kb r4 = r0.f10891e
            com.facetec.sdk.jr r4 = r4.mo9590c()
            com.facetec.sdk.jr$d r4 = r4.mo9491e()
            com.facetec.sdk.kf r6 = com.facetec.sdk.C3300kf.f10832d
            r6.mo9533e(r4, r3, r2)
            com.facetec.sdk.kb r2 = r0.f10891e
            com.facetec.sdk.kb$e r2 = r2.mo9593e()
            com.facetec.sdk.jr r3 = r4.mo9498c()
            com.facetec.sdk.jr$d r3 = r3.mo9491e()
            r2.f10794d = r3
            com.facetec.sdk.kb r2 = r2.mo9599b()
            com.facetec.sdk.km r4 = new com.facetec.sdk.km
            com.facetec.sdk.kc r3 = r0.f10889c
            r4.<init>(r2, r3)
            r3 = 0
            goto L_0x01f4
        L_0x01e2:
            com.facetec.sdk.km r4 = new com.facetec.sdk.km
            com.facetec.sdk.kb r2 = r0.f10891e
            r3 = 0
            r4.<init>(r2, r3)
            goto L_0x01f4
        L_0x01eb:
            r15 = r3
            r3 = r2
            com.facetec.sdk.km r4 = new com.facetec.sdk.km
            com.facetec.sdk.kb r2 = r0.f10891e
            r4.<init>(r2, r3)
        L_0x01f4:
            com.facetec.sdk.kb r2 = r4.f10885a
            if (r2 == 0) goto L_0x0209
            com.facetec.sdk.kb r0 = r0.f10891e
            com.facetec.sdk.jf r0 = r0.mo9594h()
            boolean r0 = r0.mo9448j()
            if (r0 == 0) goto L_0x0209
            com.facetec.sdk.km r4 = new com.facetec.sdk.km
            r4.<init>(r3, r3)
        L_0x0209:
            com.facetec.sdk.kb r0 = r4.f10885a
            com.facetec.sdk.kc r2 = r4.f10886e
            if (r15 == 0) goto L_0x0218
            if (r2 != 0) goto L_0x0218
            com.facetec.sdk.ka r3 = r15.mo9607c()
            com.facetec.sdk.C3303ki.m13255b((java.io.Closeable) r3)
        L_0x0218:
            if (r0 != 0) goto L_0x0254
            if (r2 != 0) goto L_0x0254
            com.facetec.sdk.kc$d r0 = new com.facetec.sdk.kc$d
            r0.<init>()
            com.facetec.sdk.kb r2 = r19.mo9537a()
            com.facetec.sdk.kc$d r0 = r0.mo9619a((com.facetec.sdk.C3293kb) r2)
            com.facetec.sdk.jv r2 = com.facetec.sdk.C3271jv.HTTP_1_1
            com.facetec.sdk.kc$d r0 = r0.mo9624d((com.facetec.sdk.C3271jv) r2)
            r2 = 504(0x1f8, float:7.06E-43)
            com.facetec.sdk.kc$d r0 = r0.mo9627e((int) r2)
            java.lang.String r2 = "Unsatisfiable Request (only-if-cached)"
            com.facetec.sdk.kc$d r0 = r0.mo9630e((java.lang.String) r2)
            com.facetec.sdk.ka r2 = com.facetec.sdk.C3303ki.f10842d
            com.facetec.sdk.kc$d r0 = r0.mo9625d((com.facetec.sdk.C3291ka) r2)
            r2 = -1
            com.facetec.sdk.kc$d r0 = r0.mo9618a((long) r2)
            long r2 = java.lang.System.currentTimeMillis()
            com.facetec.sdk.kc$d r0 = r0.mo9628e((long) r2)
            com.facetec.sdk.kc r0 = r0.mo9621a()
            return r0
        L_0x0254:
            if (r0 != 0) goto L_0x0267
            com.facetec.sdk.kc$d r0 = r2.mo9612f()
            com.facetec.sdk.kc r2 = m13283b(r2)
            com.facetec.sdk.kc$d r0 = r0.mo9623b((com.facetec.sdk.C3295kc) r2)
            com.facetec.sdk.kc r0 = r0.mo9621a()
            return r0
        L_0x0267:
            r3 = r19
            com.facetec.sdk.kc r3 = r3.mo9541e(r0)     // Catch:{ all -> 0x039d }
            if (r3 != 0) goto L_0x0278
            if (r15 == 0) goto L_0x0278
            com.facetec.sdk.ka r4 = r15.mo9607c()
            com.facetec.sdk.C3303ki.m13255b((java.io.Closeable) r4)
        L_0x0278:
            if (r2 == 0) goto L_0x0328
            int r4 = r3.mo9606b()
            r6 = 304(0x130, float:4.26E-43)
            if (r4 != r6) goto L_0x0321
            com.facetec.sdk.kc$d r0 = r2.mo9612f()
            com.facetec.sdk.jr r4 = r2.mo9610e()
            com.facetec.sdk.jr r6 = r3.mo9610e()
            com.facetec.sdk.jr$d r7 = new com.facetec.sdk.jr$d
            r7.<init>()
            int r8 = r4.mo9487a()
            r9 = 0
            r10 = r9
        L_0x0299:
            if (r10 >= r8) goto L_0x02cb
            java.lang.String r11 = r4.mo9489b(r10)
            java.lang.String r12 = r4.mo9490c(r10)
            boolean r13 = r5.equalsIgnoreCase(r11)
            if (r13 == 0) goto L_0x02b1
            java.lang.String r13 = "1"
            boolean r13 = r12.startsWith(r13)
            if (r13 != 0) goto L_0x02c8
        L_0x02b1:
            boolean r13 = m13284c(r11)
            if (r13 != 0) goto L_0x02c3
            boolean r13 = m13282a(r11)
            if (r13 == 0) goto L_0x02c3
            java.lang.String r13 = r6.mo9488a(r11)
            if (r13 != 0) goto L_0x02c8
        L_0x02c3:
            com.facetec.sdk.kf r13 = com.facetec.sdk.C3300kf.f10832d
            r13.mo9533e(r7, r11, r12)
        L_0x02c8:
            int r10 = r10 + 1
            goto L_0x0299
        L_0x02cb:
            int r4 = r6.mo9487a()
        L_0x02cf:
            if (r9 >= r4) goto L_0x02ed
            java.lang.String r5 = r6.mo9489b(r9)
            boolean r8 = m13284c(r5)
            if (r8 != 0) goto L_0x02ea
            boolean r8 = m13282a(r5)
            if (r8 == 0) goto L_0x02ea
            com.facetec.sdk.kf r8 = com.facetec.sdk.C3300kf.f10832d
            java.lang.String r10 = r6.mo9490c(r9)
            r8.mo9533e(r7, r5, r10)
        L_0x02ea:
            int r9 = r9 + 1
            goto L_0x02cf
        L_0x02ed:
            com.facetec.sdk.jr r4 = r7.mo9498c()
            com.facetec.sdk.kc$d r0 = r0.mo9622b((com.facetec.sdk.C3260jr) r4)
            long r4 = r3.mo9613g()
            com.facetec.sdk.kc$d r0 = r0.mo9618a((long) r4)
            long r4 = r3.mo9615i()
            com.facetec.sdk.kc$d r0 = r0.mo9628e((long) r4)
            com.facetec.sdk.kc r2 = m13283b(r2)
            com.facetec.sdk.kc$d r0 = r0.mo9623b((com.facetec.sdk.C3295kc) r2)
            com.facetec.sdk.kc r2 = m13283b(r3)
            com.facetec.sdk.kc$d r0 = r0.mo9626d((com.facetec.sdk.C3295kc) r2)
            com.facetec.sdk.kc r0 = r0.mo9621a()
            com.facetec.sdk.ka r2 = r3.mo9607c()
            r2.close()
            return r0
        L_0x0321:
            com.facetec.sdk.ka r4 = r2.mo9607c()
            com.facetec.sdk.C3303ki.m13255b((java.io.Closeable) r4)
        L_0x0328:
            com.facetec.sdk.kc$d r4 = r3.mo9612f()
            com.facetec.sdk.kc r2 = m13283b(r2)
            com.facetec.sdk.kc$d r2 = r4.mo9623b((com.facetec.sdk.C3295kc) r2)
            com.facetec.sdk.kc r3 = m13283b(r3)
            com.facetec.sdk.kc$d r2 = r2.mo9626d((com.facetec.sdk.C3295kc) r3)
            com.facetec.sdk.kc r2 = r2.mo9621a()
            com.facetec.sdk.kq r3 = r1.f10879a
            if (r3 == 0) goto L_0x039c
            boolean r3 = com.facetec.sdk.C3328ky.m13339e(r2)
            if (r3 == 0) goto L_0x0395
            boolean r3 = com.facetec.sdk.C3312km.m13289d(r2, r0)
            if (r3 == 0) goto L_0x0395
            com.facetec.sdk.kq r0 = r1.f10879a
            com.facetec.sdk.kn r0 = r0.mo9651a()
            if (r0 != 0) goto L_0x0359
            return r2
        L_0x0359:
            com.facetec.sdk.nc r3 = r0.mo9647b()
            if (r3 != 0) goto L_0x0360
            return r2
        L_0x0360:
            com.facetec.sdk.ka r4 = r2.mo9607c()
            com.facetec.sdk.mn r4 = r4.mo9584c()
            com.facetec.sdk.mp r3 = com.facetec.sdk.C3442mx.m13809d((com.facetec.sdk.C3461nc) r3)
            com.facetec.sdk.kk$3 r5 = new com.facetec.sdk.kk$3
            r5.<init>(r4, r0, r3)
            java.lang.String r0 = "Content-Type"
            java.lang.String r0 = r2.mo9611e(r0)
            com.facetec.sdk.ka r3 = r2.mo9607c()
            long r3 = r3.mo9586d()
            com.facetec.sdk.kc$d r2 = r2.mo9612f()
            com.facetec.sdk.ld r6 = new com.facetec.sdk.ld
            com.facetec.sdk.mn r5 = com.facetec.sdk.C3442mx.m13804a((com.facetec.sdk.C3465nf) r5)
            r6.<init>(r0, r3, r5)
            com.facetec.sdk.kc$d r0 = r2.mo9625d((com.facetec.sdk.C3291ka) r6)
            com.facetec.sdk.kc r0 = r0.mo9621a()
            return r0
        L_0x0395:
            java.lang.String r0 = r0.mo9589b()
            com.facetec.sdk.C3329kz.m13344e(r0)
        L_0x039c:
            return r2
        L_0x039d:
            r0 = move-exception
            r2 = r0
            if (r15 == 0) goto L_0x03a8
            com.facetec.sdk.ka r0 = r15.mo9607c()
            com.facetec.sdk.C3303ki.m13255b((java.io.Closeable) r0)
        L_0x03a8:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3309kk.mo9536e(com.facetec.sdk.jw$a):com.facetec.sdk.kc");
    }
}
