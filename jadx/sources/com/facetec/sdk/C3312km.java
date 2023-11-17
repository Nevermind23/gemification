package com.facetec.sdk;

import java.util.Date;

/* renamed from: com.facetec.sdk.km */
public final class C3312km {

    /* renamed from: a */
    public final C3293kb f10885a;

    /* renamed from: e */
    public final C3295kc f10886e;

    /* renamed from: com.facetec.sdk.km$a */
    public static class C3313a {

        /* renamed from: a */
        final long f10887a;

        /* renamed from: b */
        String f10888b;

        /* renamed from: c */
        final C3295kc f10889c;

        /* renamed from: d */
        Date f10890d;

        /* renamed from: e */
        final C3293kb f10891e;

        /* renamed from: f */
        long f10892f;

        /* renamed from: g */
        Date f10893g;

        /* renamed from: h */
        Date f10894h;

        /* renamed from: i */
        String f10895i;

        /* renamed from: j */
        long f10896j;

        /* renamed from: k */
        String f10897k;

        /* renamed from: m */
        int f10898m = -1;

        public C3313a(long j, C3293kb kbVar, C3295kc kcVar) {
            this.f10887a = j;
            this.f10891e = kbVar;
            this.f10889c = kcVar;
            if (kcVar != null) {
                this.f10896j = kcVar.mo9613g();
                this.f10892f = kcVar.mo9615i();
                C3260jr e = kcVar.mo9610e();
                int a = e.mo9487a();
                for (int i = 0; i < a; i++) {
                    String b = e.mo9489b(i);
                    String c = e.mo9490c(i);
                    if ("Date".equalsIgnoreCase(b)) {
                        this.f10890d = C3342lb.m13359d(c);
                        this.f10888b = c;
                    } else if ("Expires".equalsIgnoreCase(b)) {
                        this.f10893g = C3342lb.m13359d(c);
                    } else if ("Last-Modified".equalsIgnoreCase(b)) {
                        this.f10894h = C3342lb.m13359d(c);
                        this.f10895i = c;
                    } else if ("ETag".equalsIgnoreCase(b)) {
                        this.f10897k = c;
                    } else if ("Age".equalsIgnoreCase(b)) {
                        this.f10898m = C3328ky.m13337e(c, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        static boolean m13290a(C3293kb kbVar) {
            if (kbVar.mo9591c("If-Modified-Since") == null && kbVar.mo9591c("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final boolean mo9646d() {
            return this.f10889c.mo9616j().mo9443d() == -1 && this.f10893g == null;
        }
    }

    C3312km(C3293kb kbVar, C3295kc kcVar) {
        this.f10885a = kbVar;
        this.f10886e = kcVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.mo9616j().mo9440a() == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13289d(com.facetec.sdk.C3295kc r3, com.facetec.sdk.C3293kb r4) {
        /*
            int r0 = r3.mo9606b()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x0059
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x0059
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x0059
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x0059
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x0059
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x0059
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x0059
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x0059
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x0059
            switch(r0) {
                case 300: goto L_0x0059;
                case 301: goto L_0x0059;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0058
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.mo9611e(r0)
            if (r0 != 0) goto L_0x0059
            com.facetec.sdk.jf r0 = r3.mo9616j()
            int r0 = r0.mo9443d()
            r1 = -1
            if (r0 != r1) goto L_0x0059
            com.facetec.sdk.jf r0 = r3.mo9616j()
            boolean r0 = r0.mo9444e()
            if (r0 != 0) goto L_0x0059
            com.facetec.sdk.jf r0 = r3.mo9616j()
            boolean r0 = r0.mo9440a()
            if (r0 != 0) goto L_0x0059
        L_0x0058:
            return r2
        L_0x0059:
            com.facetec.sdk.jf r3 = r3.mo9616j()
            boolean r3 = r3.mo9442c()
            if (r3 != 0) goto L_0x006f
            com.facetec.sdk.jf r3 = r4.mo9594h()
            boolean r3 = r3.mo9442c()
            if (r3 != 0) goto L_0x006f
            r3 = 1
            return r3
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3312km.m13289d(com.facetec.sdk.kc, com.facetec.sdk.kb):boolean");
    }
}
