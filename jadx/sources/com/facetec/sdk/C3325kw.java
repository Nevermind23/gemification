package com.facetec.sdk;

import com.facetec.sdk.C3272jw;
import com.facetec.sdk.C3321ku;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facetec.sdk.kw */
public final class C3325kw {

    /* renamed from: j */
    public static final /* synthetic */ boolean f10933j = true;

    /* renamed from: a */
    public final C3264jt f10934a;

    /* renamed from: b */
    public final C3249jk f10935b;

    /* renamed from: c */
    public C3319ks f10936c;

    /* renamed from: d */
    public final C3247ji f10937d;

    /* renamed from: e */
    public C3302kh f10938e;

    /* renamed from: f */
    private C3237jd f10939f;

    /* renamed from: g */
    public boolean f10940g;

    /* renamed from: h */
    private C3321ku.C3322c f10941h;

    /* renamed from: i */
    public C3344lc f10942i;

    /* renamed from: k */
    private boolean f10943k;

    /* renamed from: l */
    private final C3321ku f10944l;

    /* renamed from: m */
    private boolean f10945m;

    /* renamed from: n */
    private final Object f10946n;

    /* renamed from: o */
    private int f10947o;

    /* renamed from: com.facetec.sdk.kw$c */
    public static final class C3326c extends WeakReference<C3325kw> {

        /* renamed from: b */
        public final Object f10948b;

        C3326c(C3325kw kwVar, Object obj) {
            super(kwVar);
            this.f10948b = obj;
        }
    }

    public C3325kw(C3249jk jkVar, C3237jd jdVar, C3247ji jiVar, C3264jt jtVar, Object obj) {
        this.f10935b = jkVar;
        this.f10939f = jdVar;
        this.f10937d = jiVar;
        this.f10934a = jtVar;
        this.f10944l = new C3321ku(jdVar, m13321i(), jiVar, jtVar);
        this.f10946n = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.mo9661c(r9) != false) goto L_0x0018;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facetec.sdk.C3319ks m13320d(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
            r3 = this;
        L_0x0000:
            com.facetec.sdk.ks r0 = r3.m13319c(r4, r5, r6, r7, r8)
            com.facetec.sdk.jk r1 = r3.f10935b
            monitor-enter(r1)
            int r2 = r0.f10917n     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)
            boolean r1 = r0.mo9661c((boolean) r9)
            if (r1 != 0) goto L_0x0018
            r3.mo9679e()
            goto L_0x0000
        L_0x0018:
            return r0
        L_0x0019:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3325kw.m13320d(int, int, int, int, boolean, boolean):com.facetec.sdk.ks");
    }

    /* renamed from: i */
    private C3316kp m13321i() {
        return C3300kf.f10832d.mo9523b(this.f10935b);
    }

    /* renamed from: a */
    public final C3344lc mo9672a() {
        C3344lc lcVar;
        synchronized (this.f10935b) {
            lcVar = this.f10942i;
        }
        return lcVar;
    }

    /* renamed from: b */
    public final void mo9673b() {
        C3319ks ksVar;
        Socket d;
        synchronized (this.f10935b) {
            ksVar = this.f10936c;
            d = mo9678d(false, true, false);
            if (this.f10936c != null) {
                ksVar = null;
            }
        }
        C3303ki.m13267d(d);
        if (ksVar != null) {
            C3300kf.f10832d.mo9524b(this.f10937d, (IOException) null);
        }
    }

    /* renamed from: c */
    public final C3344lc mo9674c(C3268ju juVar, C3272jw.C3273a aVar, boolean z) {
        C3344lc lcVar;
        try {
            C3319ks d = m13320d(aVar.mo9539d(), aVar.mo9540e(), aVar.mo9538b(), juVar.f10680m, juVar.mo9521o(), z);
            if (d.f10913i != null) {
                lcVar = new C3379lo(juVar, aVar, this, d.f10913i);
            } else {
                d.f10905a.setSoTimeout(aVar.mo9540e());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                d.f10912h.mo9644c().mo9913b((long) aVar.mo9540e(), timeUnit);
                d.f10911g.mo9707c().mo9913b((long) aVar.mo9538b(), timeUnit);
                lcVar = new C3351lj(juVar, this, d.f10912h, d.f10911g);
            }
            synchronized (this.f10935b) {
                this.f10942i = lcVar;
            }
            return lcVar;
        } catch (IOException e) {
            throw new C3320kt(e);
        }
    }

    /* renamed from: e */
    public final void mo9679e() {
        Socket d;
        synchronized (this.f10935b) {
            d = mo9678d(true, false, false);
        }
        C3303ki.m13267d(d);
    }

    public final String toString() {
        C3319ks d = mo9677d();
        if (d != null) {
            return d.toString();
        }
        return this.f10939f.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9681e(java.io.IOException r10) {
        /*
            r9 = this;
            com.facetec.sdk.jk r0 = r9.f10935b
            monitor-enter(r0)
            boolean r1 = r10 instanceof com.facetec.sdk.C3395lw     // Catch:{ all -> 0x0086 }
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0024
            com.facetec.sdk.lw r10 = (com.facetec.sdk.C3395lw) r10     // Catch:{ all -> 0x0086 }
            com.facetec.sdk.ll r10 = r10.f11195e     // Catch:{ all -> 0x0086 }
            com.facetec.sdk.ll r1 = com.facetec.sdk.C3361ll.REFUSED_STREAM     // Catch:{ all -> 0x0086 }
            if (r10 != r1) goto L_0x001a
            int r10 = r9.f10947o     // Catch:{ all -> 0x0086 }
            int r10 = r10 + r3
            r9.f10947o = r10     // Catch:{ all -> 0x0086 }
            if (r10 <= r3) goto L_0x0022
            goto L_0x0074
        L_0x001a:
            com.facetec.sdk.ll r1 = com.facetec.sdk.C3361ll.CANCEL     // Catch:{ all -> 0x0086 }
            if (r10 == r1) goto L_0x0022
            r9.f10938e = r2     // Catch:{ all -> 0x0086 }
        L_0x0020:
            r10 = r3
            goto L_0x0077
        L_0x0022:
            r10 = r4
            goto L_0x0077
        L_0x0024:
            com.facetec.sdk.ks r1 = r9.f10936c     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0022
            boolean r1 = r1.mo9662d()     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0032
            boolean r1 = r10 instanceof com.facetec.sdk.C3350li     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0022
        L_0x0032:
            com.facetec.sdk.ks r1 = r9.f10936c     // Catch:{ all -> 0x0086 }
            int r1 = r1.f10917n     // Catch:{ all -> 0x0086 }
            if (r1 != 0) goto L_0x0020
            com.facetec.sdk.kh r1 = r9.f10938e     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0074
            if (r10 == 0) goto L_0x0074
            com.facetec.sdk.ku r5 = r9.f10944l     // Catch:{ all -> 0x0086 }
            java.net.Proxy r6 = r1.mo9634d()     // Catch:{ all -> 0x0086 }
            java.net.Proxy$Type r6 = r6.type()     // Catch:{ all -> 0x0086 }
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT     // Catch:{ all -> 0x0086 }
            if (r6 == r7) goto L_0x006f
            com.facetec.sdk.jd r6 = r5.f10925e     // Catch:{ all -> 0x0086 }
            java.net.ProxySelector r6 = r6.mo9430c()     // Catch:{ all -> 0x0086 }
            if (r6 == 0) goto L_0x006f
            com.facetec.sdk.jd r6 = r5.f10925e     // Catch:{ all -> 0x0086 }
            java.net.ProxySelector r6 = r6.mo9430c()     // Catch:{ all -> 0x0086 }
            com.facetec.sdk.jd r7 = r5.f10925e     // Catch:{ all -> 0x0086 }
            com.facetec.sdk.jx r7 = r7.mo9431d()     // Catch:{ all -> 0x0086 }
            java.net.URI r7 = r7.mo9546d()     // Catch:{ all -> 0x0086 }
            java.net.Proxy r8 = r1.mo9634d()     // Catch:{ all -> 0x0086 }
            java.net.SocketAddress r8 = r8.address()     // Catch:{ all -> 0x0086 }
            r6.connectFailed(r7, r8, r10)     // Catch:{ all -> 0x0086 }
        L_0x006f:
            com.facetec.sdk.kp r10 = r5.f10924d     // Catch:{ all -> 0x0086 }
            r10.mo9648c(r1)     // Catch:{ all -> 0x0086 }
        L_0x0074:
            r9.f10938e = r2     // Catch:{ all -> 0x0086 }
            goto L_0x0020
        L_0x0077:
            java.net.Socket r10 = r9.mo9678d(r10, r4, r3)     // Catch:{ all -> 0x0086 }
            com.facetec.sdk.ks r1 = r9.f10936c     // Catch:{ all -> 0x0086 }
            if (r1 != 0) goto L_0x0081
            boolean r1 = r9.f10945m     // Catch:{ all -> 0x0086 }
        L_0x0081:
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            com.facetec.sdk.C3303ki.m13267d((java.net.Socket) r10)
            return
        L_0x0086:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3325kw.mo9681e(java.io.IOException):void");
    }

    /* renamed from: b */
    private void m13318b(C3319ks ksVar) {
        int size = ksVar.f10918o.size();
        for (int i = 0; i < size; i++) {
            if (ksVar.f10918o.get(i).get() == this) {
                ksVar.f10918o.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public final synchronized C3319ks mo9677d() {
        return this.f10936c;
    }

    /* renamed from: d */
    public final Socket mo9678d(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (f10933j || Thread.holdsLock(this.f10935b)) {
            if (z3) {
                this.f10942i = null;
            }
            if (z2) {
                this.f10943k = true;
            }
            C3319ks ksVar = this.f10936c;
            if (ksVar == null) {
                return null;
            }
            if (z) {
                ksVar.f10914j = true;
            }
            if (this.f10942i != null) {
                return null;
            }
            if (!this.f10943k && !ksVar.f10914j) {
                return null;
            }
            m13318b(ksVar);
            if (this.f10936c.f10918o.isEmpty()) {
                this.f10936c.f10915k = System.nanoTime();
                if (C3300kf.f10832d.mo9527c(this.f10935b, this.f10936c)) {
                    socket = this.f10936c.mo9655a();
                    this.f10936c = null;
                    return socket;
                }
            }
            socket = null;
            this.f10936c = null;
            return socket;
        }
        throw new AssertionError();
    }

    /* JADX WARNING: type inference failed for: r7v9, types: [java.net.Socket] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02ee A[Catch:{ IOException -> 0x0694 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0450 A[Catch:{ IOException -> 0x0692 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0488 A[Catch:{ IOException -> 0x0692 }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x067b A[Catch:{ all -> 0x0682 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0681 A[Catch:{ all -> 0x0682 }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0685 A[SYNTHETIC, Splitter:B:294:0x0685] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x06be  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x06c4  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0461 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x068c A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facetec.sdk.C3319ks m13319c(int r21, int r22, int r23, int r24, boolean r25) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r24
            com.facetec.sdk.jk r5 = r1.f10935b
            monitor-enter(r5)
            boolean r0 = r1.f10943k     // Catch:{ all -> 0x070e }
            if (r0 != 0) goto L_0x0706
            com.facetec.sdk.lc r0 = r1.f10942i     // Catch:{ all -> 0x070e }
            if (r0 != 0) goto L_0x06fe
            boolean r0 = r1.f10940g     // Catch:{ all -> 0x070e }
            if (r0 != 0) goto L_0x06f6
            boolean r0 = f10933j     // Catch:{ all -> 0x070e }
            if (r0 != 0) goto L_0x002a
            com.facetec.sdk.jk r0 = r1.f10935b     // Catch:{ all -> 0x070e }
            boolean r0 = java.lang.Thread.holdsLock(r0)     // Catch:{ all -> 0x070e }
            if (r0 == 0) goto L_0x0024
            goto L_0x002a
        L_0x0024:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x070e }
            r0.<init>()     // Catch:{ all -> 0x070e }
            throw r0     // Catch:{ all -> 0x070e }
        L_0x002a:
            com.facetec.sdk.ks r0 = r1.f10936c     // Catch:{ all -> 0x070e }
            r6 = 1
            r7 = 0
            r8 = 0
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0.f10914j     // Catch:{ all -> 0x070e }
            if (r0 == 0) goto L_0x003a
            java.net.Socket r0 = r1.mo9678d(r7, r7, r6)     // Catch:{ all -> 0x070e }
            goto L_0x003b
        L_0x003a:
            r0 = r8
        L_0x003b:
            com.facetec.sdk.ks r9 = r1.f10936c     // Catch:{ all -> 0x070e }
            if (r9 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r9 = r8
        L_0x0041:
            if (r9 != 0) goto L_0x0057
            com.facetec.sdk.kf r10 = com.facetec.sdk.C3300kf.f10832d     // Catch:{ all -> 0x070e }
            com.facetec.sdk.jk r11 = r1.f10935b     // Catch:{ all -> 0x070e }
            com.facetec.sdk.jd r12 = r1.f10939f     // Catch:{ all -> 0x070e }
            r10.mo9530e(r11, r12, r1, r8)     // Catch:{ all -> 0x070e }
            com.facetec.sdk.ks r10 = r1.f10936c     // Catch:{ all -> 0x070e }
            if (r10 == 0) goto L_0x0053
            r11 = r6
            r9 = r10
            goto L_0x0058
        L_0x0053:
            com.facetec.sdk.kh r10 = r1.f10938e     // Catch:{ all -> 0x070e }
            r11 = r7
            goto L_0x0059
        L_0x0057:
            r11 = r7
        L_0x0058:
            r10 = r8
        L_0x0059:
            monitor-exit(r5)     // Catch:{ all -> 0x070e }
            com.facetec.sdk.C3303ki.m13267d((java.net.Socket) r0)
            if (r9 == 0) goto L_0x0060
            return r9
        L_0x0060:
            if (r10 != 0) goto L_0x0200
            com.facetec.sdk.ku$c r0 = r1.f10941h
            if (r0 == 0) goto L_0x006c
            boolean r0 = r0.mo9670e()
            if (r0 != 0) goto L_0x0200
        L_0x006c:
            com.facetec.sdk.ku r0 = r1.f10944l
            boolean r5 = r0.mo9668c()
            if (r5 == 0) goto L_0x01fa
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0079:
            boolean r12 = r0.mo9669d()
            if (r12 == 0) goto L_0x01e1
            boolean r12 = r0.mo9669d()
            if (r12 == 0) goto L_0x01b9
            java.util.List<java.net.Proxy> r12 = r0.f10921a
            int r13 = r0.f10928i
            int r14 = r13 + 1
            r0.f10928i = r14
            java.lang.Object r12 = r12.get(r13)
            java.net.Proxy r12 = (java.net.Proxy) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r0.f10926f = r13
            java.net.Proxy$Type r13 = r12.type()
            java.net.Proxy$Type r14 = java.net.Proxy.Type.DIRECT
            if (r13 == r14) goto L_0x00e1
            java.net.Proxy$Type r13 = r12.type()
            java.net.Proxy$Type r14 = java.net.Proxy.Type.SOCKS
            if (r13 != r14) goto L_0x00ab
            goto L_0x00e1
        L_0x00ab:
            java.net.SocketAddress r13 = r12.address()
            boolean r14 = r13 instanceof java.net.InetSocketAddress
            if (r14 == 0) goto L_0x00c9
            java.net.InetSocketAddress r13 = (java.net.InetSocketAddress) r13
            java.net.InetAddress r14 = r13.getAddress()
            if (r14 != 0) goto L_0x00c0
            java.lang.String r14 = r13.getHostName()
            goto L_0x00c4
        L_0x00c0:
            java.lang.String r14 = r14.getHostAddress()
        L_0x00c4:
            int r13 = r13.getPort()
            goto L_0x00f5
        L_0x00c9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Proxy.address() is not an InetSocketAddress: "
            r2.<init>(r3)
            java.lang.Class r3 = r13.getClass()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x00e1:
            com.facetec.sdk.jd r13 = r0.f10925e
            com.facetec.sdk.jx r13 = r13.mo9431d()
            java.lang.String r14 = r13.mo9551h()
            com.facetec.sdk.jd r13 = r0.f10925e
            com.facetec.sdk.jx r13 = r13.mo9431d()
            int r13 = r13.mo9550g()
        L_0x00f5:
            if (r13 <= 0) goto L_0x0198
            r15 = 65535(0xffff, float:9.1834E-41)
            if (r13 > r15) goto L_0x0198
            java.net.Proxy$Type r15 = r12.type()
            java.net.Proxy$Type r6 = java.net.Proxy.Type.SOCKS
            if (r15 != r6) goto L_0x010e
            java.util.List<java.net.InetSocketAddress> r6 = r0.f10926f
            java.net.InetSocketAddress r13 = java.net.InetSocketAddress.createUnresolved(r14, r13)
            r6.add(r13)
            goto L_0x0140
        L_0x010e:
            com.facetec.sdk.jd r6 = r0.f10925e
            com.facetec.sdk.jp r6 = r6.mo9427a()
            java.util.List r6 = r6.mo9483a(r14)
            boolean r15 = r6.isEmpty()
            if (r15 != 0) goto L_0x0178
            int r14 = r6.size()
            r15 = r7
        L_0x0123:
            if (r15 >= r14) goto L_0x0140
            java.lang.Object r16 = r6.get(r15)
            r8 = r16
            java.net.InetAddress r8 = (java.net.InetAddress) r8
            java.util.List<java.net.InetSocketAddress> r7 = r0.f10926f
            r17 = r6
            java.net.InetSocketAddress r6 = new java.net.InetSocketAddress
            r6.<init>(r8, r13)
            r7.add(r6)
            int r15 = r15 + 1
            r6 = r17
            r7 = 0
            r8 = 0
            goto L_0x0123
        L_0x0140:
            java.util.List<java.net.InetSocketAddress> r6 = r0.f10926f
            int r6 = r6.size()
            r7 = 0
        L_0x0147:
            if (r7 >= r6) goto L_0x016c
            com.facetec.sdk.kh r8 = new com.facetec.sdk.kh
            com.facetec.sdk.jd r13 = r0.f10925e
            java.util.List<java.net.InetSocketAddress> r14 = r0.f10926f
            java.lang.Object r14 = r14.get(r7)
            java.net.InetSocketAddress r14 = (java.net.InetSocketAddress) r14
            r8.<init>(r13, r12, r14)
            com.facetec.sdk.kp r13 = r0.f10924d
            boolean r13 = r13.mo9650e(r8)
            if (r13 == 0) goto L_0x0166
            java.util.List<com.facetec.sdk.kh> r13 = r0.f10927h
            r13.add(r8)
            goto L_0x0169
        L_0x0166:
            r5.add(r8)
        L_0x0169:
            int r7 = r7 + 1
            goto L_0x0147
        L_0x016c:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x0173
            goto L_0x01e1
        L_0x0173:
            r6 = 1
            r7 = 0
            r8 = 0
            goto L_0x0079
        L_0x0178:
            java.net.UnknownHostException r2 = new java.net.UnknownHostException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.facetec.sdk.jd r0 = r0.f10925e
            com.facetec.sdk.jp r0 = r0.mo9427a()
            r3.append(r0)
            java.lang.String r0 = " returned no addresses for "
            r3.append(r0)
            r3.append(r14)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0198:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No route to "
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r3 = ":"
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x01b9:
            java.net.SocketException r2 = new java.net.SocketException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No route to "
            r3.<init>(r4)
            com.facetec.sdk.jd r4 = r0.f10925e
            com.facetec.sdk.jx r4 = r4.mo9431d()
            java.lang.String r4 = r4.mo9551h()
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List<java.net.Proxy> r0 = r0.f10921a
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01e1:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x01f1
            java.util.List<com.facetec.sdk.kh> r6 = r0.f10927h
            r5.addAll(r6)
            java.util.List<com.facetec.sdk.kh> r0 = r0.f10927h
            r0.clear()
        L_0x01f1:
            com.facetec.sdk.ku$c r0 = new com.facetec.sdk.ku$c
            r0.<init>(r5)
            r1.f10941h = r0
            r0 = 1
            goto L_0x0201
        L_0x01fa:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0200:
            r0 = 0
        L_0x0201:
            com.facetec.sdk.jk r5 = r1.f10935b
            monitor-enter(r5)
            boolean r6 = r1.f10940g     // Catch:{ all -> 0x06f3 }
            if (r6 != 0) goto L_0x06eb
            if (r0 == 0) goto L_0x0235
            com.facetec.sdk.ku$c r0 = r1.f10941h     // Catch:{ all -> 0x06f3 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x06f3 }
            java.util.List<com.facetec.sdk.kh> r0 = r0.f10929b     // Catch:{ all -> 0x06f3 }
            r6.<init>(r0)     // Catch:{ all -> 0x06f3 }
            int r0 = r6.size()     // Catch:{ all -> 0x06f3 }
            r7 = 0
        L_0x0218:
            if (r7 >= r0) goto L_0x0235
            java.lang.Object r8 = r6.get(r7)     // Catch:{ all -> 0x06f3 }
            com.facetec.sdk.kh r8 = (com.facetec.sdk.C3302kh) r8     // Catch:{ all -> 0x06f3 }
            com.facetec.sdk.kf r12 = com.facetec.sdk.C3300kf.f10832d     // Catch:{ all -> 0x06f3 }
            com.facetec.sdk.jk r13 = r1.f10935b     // Catch:{ all -> 0x06f3 }
            com.facetec.sdk.jd r14 = r1.f10939f     // Catch:{ all -> 0x06f3 }
            r12.mo9530e(r13, r14, r1, r8)     // Catch:{ all -> 0x06f3 }
            com.facetec.sdk.ks r12 = r1.f10936c     // Catch:{ all -> 0x06f3 }
            if (r12 == 0) goto L_0x0232
            r1.f10938e = r8     // Catch:{ all -> 0x06f3 }
            r9 = r12
            r11 = 1
            goto L_0x0235
        L_0x0232:
            int r7 = r7 + 1
            goto L_0x0218
        L_0x0235:
            if (r11 != 0) goto L_0x0266
            if (r10 != 0) goto L_0x0257
            com.facetec.sdk.ku$c r0 = r1.f10941h     // Catch:{ all -> 0x06f3 }
            boolean r6 = r0.mo9670e()     // Catch:{ all -> 0x06f3 }
            if (r6 == 0) goto L_0x0251
            java.util.List<com.facetec.sdk.kh> r6 = r0.f10929b     // Catch:{ all -> 0x06f3 }
            int r7 = r0.f10930e     // Catch:{ all -> 0x06f3 }
            int r8 = r7 + 1
            r0.f10930e = r8     // Catch:{ all -> 0x06f3 }
            java.lang.Object r0 = r6.get(r7)     // Catch:{ all -> 0x06f3 }
            r10 = r0
            com.facetec.sdk.kh r10 = (com.facetec.sdk.C3302kh) r10     // Catch:{ all -> 0x06f3 }
            goto L_0x0257
        L_0x0251:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x06f3 }
            r0.<init>()     // Catch:{ all -> 0x06f3 }
            throw r0     // Catch:{ all -> 0x06f3 }
        L_0x0257:
            r1.f10938e = r10     // Catch:{ all -> 0x06f3 }
            r6 = 0
            r1.f10947o = r6     // Catch:{ all -> 0x06f3 }
            com.facetec.sdk.ks r9 = new com.facetec.sdk.ks     // Catch:{ all -> 0x06f3 }
            com.facetec.sdk.jk r0 = r1.f10935b     // Catch:{ all -> 0x06f3 }
            r9.<init>(r0, r10)     // Catch:{ all -> 0x06f3 }
            r1.mo9680e(r9, r6)     // Catch:{ all -> 0x06f3 }
        L_0x0266:
            monitor-exit(r5)     // Catch:{ all -> 0x06f3 }
            if (r11 == 0) goto L_0x026a
            return r9
        L_0x026a:
            com.facetec.sdk.jv r0 = r9.f10910f
            if (r0 != 0) goto L_0x06e3
            com.facetec.sdk.kh r0 = r9.f10906b
            com.facetec.sdk.jd r0 = r0.mo9632a()
            java.util.List<com.facetec.sdk.jm> r0 = r0.f10545b
            com.facetec.sdk.kr r5 = new com.facetec.sdk.kr
            r5.<init>(r0)
            com.facetec.sdk.kh r6 = r9.f10906b
            com.facetec.sdk.jd r6 = r6.mo9632a()
            javax.net.ssl.SSLSocketFactory r6 = r6.mo9437i()
            if (r6 != 0) goto L_0x02d3
            com.facetec.sdk.jm r6 = com.facetec.sdk.C3252jm.f10628a
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x02c6
            com.facetec.sdk.kh r0 = r9.f10906b
            com.facetec.sdk.jd r0 = r0.mo9632a()
            com.facetec.sdk.jx r0 = r0.mo9431d()
            java.lang.String r0 = r0.mo9551h()
            com.facetec.sdk.mg r6 = com.facetec.sdk.C3422mg.m13612c()
            boolean r6 = r6.mo9802b((java.lang.String) r0)
            if (r6 == 0) goto L_0x02a8
            goto L_0x02e5
        L_0x02a8:
            com.facetec.sdk.kt r2 = new com.facetec.sdk.kt
            java.net.UnknownServiceException r3 = new java.net.UnknownServiceException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "CLEARTEXT communication to "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            r2.<init>(r3)
            throw r2
        L_0x02c6:
            com.facetec.sdk.kt r0 = new com.facetec.sdk.kt
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication not enabled for client"
            r2.<init>(r3)
            r0.<init>(r2)
            throw r0
        L_0x02d3:
            com.facetec.sdk.kh r0 = r9.f10906b
            com.facetec.sdk.jd r0 = r0.mo9632a()
            java.util.List r0 = r0.mo9428b()
            com.facetec.sdk.jv r6 = com.facetec.sdk.C3271jv.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x06d6
        L_0x02e5:
            r6 = 0
        L_0x02e6:
            com.facetec.sdk.kh r0 = r9.f10906b     // Catch:{ IOException -> 0x0694 }
            boolean r0 = r0.mo9633c()     // Catch:{ IOException -> 0x0694 }
            if (r0 == 0) goto L_0x0450
            com.facetec.sdk.kb$e r0 = new com.facetec.sdk.kb$e     // Catch:{ IOException -> 0x0694 }
            r0.<init>()     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.kh r7 = r9.f10906b     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.jd r7 = r7.mo9632a()     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.jx r7 = r7.mo9431d()     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.kb$e r0 = r0.mo9603e((com.facetec.sdk.C3274jx) r7)     // Catch:{ IOException -> 0x0694 }
            java.lang.String r7 = "CONNECT"
            r8 = 0
            com.facetec.sdk.kb$e r0 = r0.mo9601c(r7, r8)     // Catch:{ IOException -> 0x0694 }
            java.lang.String r7 = "Host"
            com.facetec.sdk.kh r8 = r9.f10906b     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.jd r8 = r8.mo9632a()     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.jx r8 = r8.mo9431d()     // Catch:{ IOException -> 0x0694 }
            r10 = 1
            java.lang.String r8 = com.facetec.sdk.C3303ki.m13251b((com.facetec.sdk.C3274jx) r8, (boolean) r10)     // Catch:{ IOException -> 0x044a }
            com.facetec.sdk.kb$e r0 = r0.mo9598a(r7, r8)     // Catch:{ IOException -> 0x0694 }
            java.lang.String r7 = "Proxy-Connection"
            java.lang.String r8 = "Keep-Alive"
            com.facetec.sdk.kb$e r0 = r0.mo9598a(r7, r8)     // Catch:{ IOException -> 0x0694 }
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = com.facetec.sdk.C3311kl.m13288b()     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.kb$e r0 = r0.mo9598a(r7, r8)     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.kb r0 = r0.mo9599b()     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.kc$d r7 = new com.facetec.sdk.kc$d     // Catch:{ IOException -> 0x0694 }
            r7.<init>()     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.kc$d r7 = r7.mo9619a((com.facetec.sdk.C3293kb) r0)     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.jv r8 = com.facetec.sdk.C3271jv.HTTP_1_1     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.kc$d r7 = r7.mo9624d((com.facetec.sdk.C3271jv) r8)     // Catch:{ IOException -> 0x0694 }
            r8 = 407(0x197, float:5.7E-43)
            com.facetec.sdk.kc$d r7 = r7.mo9627e((int) r8)     // Catch:{ IOException -> 0x0694 }
            java.lang.String r10 = "Preemptive Authenticate"
            com.facetec.sdk.kc$d r7 = r7.mo9630e((java.lang.String) r10)     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.ka r10 = com.facetec.sdk.C3303ki.f10842d     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.kc$d r7 = r7.mo9625d((com.facetec.sdk.C3291ka) r10)     // Catch:{ IOException -> 0x0694 }
            r10 = -1
            com.facetec.sdk.kc$d r7 = r7.mo9618a((long) r10)     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.kc$d r7 = r7.mo9628e((long) r10)     // Catch:{ IOException -> 0x0694 }
            java.lang.String r12 = "Proxy-Authenticate"
            java.lang.String r13 = "OkHttp-Preemptive"
            com.facetec.sdk.jr$d r14 = r7.f10815g     // Catch:{ IOException -> 0x0694 }
            r14.mo9499d(r12, r13)     // Catch:{ IOException -> 0x0694 }
            r7.mo9621a()     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.kh r7 = r9.f10906b     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.jd r7 = r7.mo9632a()     // Catch:{ IOException -> 0x0694 }
            r7.mo9432e()     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.jx r7 = r0.mo9588a()     // Catch:{ IOException -> 0x0694 }
            r9.mo9659c(r2, r3)     // Catch:{ IOException -> 0x0694 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0694 }
            java.lang.String r13 = "CONNECT "
            r12.<init>(r13)     // Catch:{ IOException -> 0x0694 }
            r13 = 1
            java.lang.String r7 = com.facetec.sdk.C3303ki.m13251b((com.facetec.sdk.C3274jx) r7, (boolean) r13)     // Catch:{ IOException -> 0x0444 }
            r12.append(r7)     // Catch:{ IOException -> 0x0694 }
            java.lang.String r7 = " HTTP/1.1"
            r12.append(r7)     // Catch:{ IOException -> 0x0694 }
            java.lang.String r7 = r12.toString()     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.lj r12 = new com.facetec.sdk.lj     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.mn r13 = r9.f10912h     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.mp r14 = r9.f10911g     // Catch:{ IOException -> 0x0694 }
            r15 = 0
            r12.<init>(r15, r15, r13, r14)     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.mn r13 = r9.f10912h     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.ne r13 = r13.mo9644c()     // Catch:{ IOException -> 0x0694 }
            long r14 = (long) r3     // Catch:{ IOException -> 0x0694 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x0694 }
            r13.mo9913b(r14, r8)     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.mp r13 = r9.f10911g     // Catch:{ IOException -> 0x0694 }
            com.facetec.sdk.ne r13 = r13.mo9707c()     // Catch:{ IOException -> 0x0694 }
            r14 = r23
            long r10 = (long) r14
            r13.mo9913b(r10, r8)     // Catch:{ IOException -> 0x0692 }
            com.facetec.sdk.jr r10 = r0.mo9590c()     // Catch:{ IOException -> 0x0692 }
            r12.mo9705d(r10, r7)     // Catch:{ IOException -> 0x0692 }
            r12.mo9700e()     // Catch:{ IOException -> 0x0692 }
            r7 = 0
            com.facetec.sdk.kc$d r10 = r12.mo9696b(r7)     // Catch:{ IOException -> 0x043f }
            com.facetec.sdk.kc$d r0 = r10.mo9619a((com.facetec.sdk.C3293kb) r0)     // Catch:{ IOException -> 0x0692 }
            com.facetec.sdk.kc r0 = r0.mo9621a()     // Catch:{ IOException -> 0x0692 }
            long r10 = com.facetec.sdk.C3328ky.m13335c(r0)     // Catch:{ IOException -> 0x0692 }
            r18 = -1
            int r7 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r7 != 0) goto L_0x03d7
            r10 = 0
        L_0x03d7:
            com.facetec.sdk.nf r7 = r12.mo9706e((long) r10)     // Catch:{ IOException -> 0x0692 }
            r10 = 2147483647(0x7fffffff, float:NaN)
            com.facetec.sdk.C3303ki.m13243a((com.facetec.sdk.C3465nf) r7, (int) r10, (java.util.concurrent.TimeUnit) r8)     // Catch:{ IOException -> 0x0692 }
            r7.close()     // Catch:{ IOException -> 0x0692 }
            int r7 = r0.mo9606b()     // Catch:{ IOException -> 0x0692 }
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 == r8) goto L_0x0419
            r8 = 407(0x197, float:5.7E-43)
            if (r7 == r8) goto L_0x0408
            java.io.IOException r7 = new java.io.IOException     // Catch:{ IOException -> 0x0692 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0692 }
            java.lang.String r10 = "Unexpected response code for CONNECT: "
            r8.<init>(r10)     // Catch:{ IOException -> 0x0692 }
            int r0 = r0.mo9606b()     // Catch:{ IOException -> 0x0692 }
            r8.append(r0)     // Catch:{ IOException -> 0x0692 }
            java.lang.String r0 = r8.toString()     // Catch:{ IOException -> 0x0692 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x0692 }
            throw r7     // Catch:{ IOException -> 0x0692 }
        L_0x0408:
            com.facetec.sdk.kh r0 = r9.f10906b     // Catch:{ IOException -> 0x0692 }
            com.facetec.sdk.jd r0 = r0.mo9632a()     // Catch:{ IOException -> 0x0692 }
            r0.mo9432e()     // Catch:{ IOException -> 0x0692 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0692 }
            java.lang.String r7 = "Failed to authenticate with proxy"
            r0.<init>(r7)     // Catch:{ IOException -> 0x0692 }
            throw r0     // Catch:{ IOException -> 0x0692 }
        L_0x0419:
            com.facetec.sdk.mn r0 = r9.f10912h     // Catch:{ IOException -> 0x0692 }
            com.facetec.sdk.mm r0 = r0.mo9851d()     // Catch:{ IOException -> 0x0692 }
            boolean r0 = r0.mo9864e()     // Catch:{ IOException -> 0x0692 }
            if (r0 == 0) goto L_0x0437
            com.facetec.sdk.mp r0 = r9.f10911g     // Catch:{ IOException -> 0x0692 }
            com.facetec.sdk.mm r0 = r0.mo9851d()     // Catch:{ IOException -> 0x0692 }
            boolean r0 = r0.mo9864e()     // Catch:{ IOException -> 0x0692 }
            if (r0 == 0) goto L_0x0437
            java.net.Socket r0 = r9.f10909e     // Catch:{ IOException -> 0x0692 }
            if (r0 != 0) goto L_0x0455
            goto L_0x0574
        L_0x0437:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0692 }
            java.lang.String r7 = "TLS tunnel buffered too many bytes!"
            r0.<init>(r7)     // Catch:{ IOException -> 0x0692 }
            throw r0     // Catch:{ IOException -> 0x0692 }
        L_0x043f:
            r0 = move-exception
            r11 = r7
            r7 = 1
            goto L_0x0699
        L_0x0444:
            r0 = move-exception
            r14 = r23
            r7 = r13
            goto L_0x0698
        L_0x044a:
            r0 = move-exception
            r14 = r23
            r7 = r10
            goto L_0x0698
        L_0x0450:
            r14 = r23
            r9.mo9659c(r2, r3)     // Catch:{ IOException -> 0x0692 }
        L_0x0455:
            com.facetec.sdk.kh r0 = r9.f10906b     // Catch:{ IOException -> 0x0692 }
            com.facetec.sdk.jd r0 = r0.mo9632a()     // Catch:{ IOException -> 0x0692 }
            javax.net.ssl.SSLSocketFactory r0 = r0.mo9437i()     // Catch:{ IOException -> 0x0692 }
            if (r0 != 0) goto L_0x0488
            com.facetec.sdk.kh r0 = r9.f10906b     // Catch:{ IOException -> 0x0692 }
            com.facetec.sdk.jd r0 = r0.mo9632a()     // Catch:{ IOException -> 0x0692 }
            java.util.List r0 = r0.mo9428b()     // Catch:{ IOException -> 0x0692 }
            com.facetec.sdk.jv r7 = com.facetec.sdk.C3271jv.H2_PRIOR_KNOWLEDGE     // Catch:{ IOException -> 0x0692 }
            boolean r0 = r0.contains(r7)     // Catch:{ IOException -> 0x0692 }
            if (r0 == 0) goto L_0x047e
            java.net.Socket r0 = r9.f10909e     // Catch:{ IOException -> 0x0692 }
            r9.f10905a = r0     // Catch:{ IOException -> 0x0692 }
            r9.f10910f = r7     // Catch:{ IOException -> 0x0692 }
            r9.mo9664e((int) r4)     // Catch:{ IOException -> 0x0692 }
            goto L_0x056a
        L_0x047e:
            java.net.Socket r0 = r9.f10909e     // Catch:{ IOException -> 0x0692 }
            r9.f10905a = r0     // Catch:{ IOException -> 0x0692 }
            com.facetec.sdk.jv r0 = com.facetec.sdk.C3271jv.HTTP_1_1     // Catch:{ IOException -> 0x0692 }
            r9.f10910f = r0     // Catch:{ IOException -> 0x0692 }
            goto L_0x056a
        L_0x0488:
            com.facetec.sdk.kh r0 = r9.f10906b     // Catch:{ IOException -> 0x0692 }
            com.facetec.sdk.jd r0 = r0.mo9632a()     // Catch:{ IOException -> 0x0692 }
            javax.net.ssl.SSLSocketFactory r7 = r0.mo9437i()     // Catch:{ IOException -> 0x0692 }
            java.net.Socket r8 = r9.f10909e     // Catch:{ AssertionError -> 0x0671, all -> 0x066c }
            com.facetec.sdk.jx r10 = r0.mo9431d()     // Catch:{ AssertionError -> 0x0671, all -> 0x066c }
            java.lang.String r10 = r10.mo9551h()     // Catch:{ AssertionError -> 0x0671, all -> 0x066c }
            com.facetec.sdk.jx r11 = r0.mo9431d()     // Catch:{ AssertionError -> 0x0671, all -> 0x066c }
            int r11 = r11.mo9550g()     // Catch:{ AssertionError -> 0x0671, all -> 0x066c }
            r12 = 1
            java.net.Socket r7 = r7.createSocket(r8, r10, r11, r12)     // Catch:{ AssertionError -> 0x0669, all -> 0x0666 }
            r8 = r7
            javax.net.ssl.SSLSocket r8 = (javax.net.ssl.SSLSocket) r8     // Catch:{ AssertionError -> 0x0671, all -> 0x066c }
            int r7 = r5.f10903c     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            java.util.List<com.facetec.sdk.jm> r10 = r5.f10902b     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            int r10 = r10.size()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
        L_0x04b4:
            if (r7 >= r10) goto L_0x04cc
            java.util.List<com.facetec.sdk.jm> r11 = r5.f10902b     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            java.lang.Object r11 = r11.get(r7)     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            com.facetec.sdk.jm r11 = (com.facetec.sdk.C3252jm) r11     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            boolean r12 = r11.mo9469c(r8)     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            if (r12 == 0) goto L_0x04c9
            int r7 = r7 + 1
            r5.f10903c = r7     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            goto L_0x04cd
        L_0x04c9:
            int r7 = r7 + 1
            goto L_0x04b4
        L_0x04cc:
            r11 = 0
        L_0x04cd:
            if (r11 == 0) goto L_0x062a
            boolean r7 = r5.mo9653d(r8)     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            r5.f10904e = r7     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            com.facetec.sdk.kf r7 = com.facetec.sdk.C3300kf.f10832d     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            boolean r10 = r5.f10901a     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            r7.mo9526c(r11, r8, r10)     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            boolean r7 = r11.mo9468c()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            if (r7 == 0) goto L_0x04f5
            com.facetec.sdk.mg r7 = com.facetec.sdk.C3422mg.m13612c()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            com.facetec.sdk.jx r10 = r0.mo9431d()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            java.lang.String r10 = r10.mo9551h()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            java.util.List r12 = r0.mo9428b()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            r7.mo9782d((javax.net.ssl.SSLSocket) r8, (java.lang.String) r10, (java.util.List<com.facetec.sdk.C3271jv>) r12)     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
        L_0x04f5:
            r8.startHandshake()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            javax.net.ssl.SSLSession r7 = r8.getSession()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            com.facetec.sdk.jq r10 = com.facetec.sdk.C3259jq.m13049b(r7)     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            javax.net.ssl.HostnameVerifier r12 = r0.mo9434f()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            com.facetec.sdk.jx r13 = r0.mo9431d()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            java.lang.String r13 = r13.mo9551h()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            boolean r7 = r12.verify(r13, r7)     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            if (r7 == 0) goto L_0x05d6
            com.facetec.sdk.jh r7 = r0.mo9435g()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            com.facetec.sdk.jx r0 = r0.mo9431d()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            java.lang.String r0 = r0.mo9551h()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            java.util.List r12 = r10.mo9484d()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            r7.mo9453c(r0, r12)     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            boolean r0 = r11.mo9468c()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            if (r0 == 0) goto L_0x0534
            com.facetec.sdk.mg r0 = com.facetec.sdk.C3422mg.m13612c()     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            java.lang.String r0 = r0.mo9781b((javax.net.ssl.SSLSocket) r8)     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            goto L_0x0535
        L_0x0534:
            r0 = 0
        L_0x0535:
            r9.f10905a = r8     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            com.facetec.sdk.nf r7 = com.facetec.sdk.C3442mx.m13810d((java.net.Socket) r8)     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            com.facetec.sdk.mn r7 = com.facetec.sdk.C3442mx.m13804a((com.facetec.sdk.C3465nf) r7)     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            r9.f10912h = r7     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            java.net.Socket r7 = r9.f10905a     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            com.facetec.sdk.nc r7 = com.facetec.sdk.C3442mx.m13806b(r7)     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            com.facetec.sdk.mp r7 = com.facetec.sdk.C3442mx.m13809d((com.facetec.sdk.C3461nc) r7)     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            r9.f10911g = r7     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            r9.f10907c = r10     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            if (r0 == 0) goto L_0x0556
            com.facetec.sdk.jv r0 = com.facetec.sdk.C3271jv.m13102a(r0)     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            goto L_0x0558
        L_0x0556:
            com.facetec.sdk.jv r0 = com.facetec.sdk.C3271jv.HTTP_1_1     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
        L_0x0558:
            r9.f10910f = r0     // Catch:{ AssertionError -> 0x0662, all -> 0x065e }
            com.facetec.sdk.mg r0 = com.facetec.sdk.C3422mg.m13612c()     // Catch:{ IOException -> 0x0692 }
            r0.mo9780a((javax.net.ssl.SSLSocket) r8)     // Catch:{ IOException -> 0x0692 }
            com.facetec.sdk.jv r0 = r9.f10910f     // Catch:{ IOException -> 0x0692 }
            com.facetec.sdk.jv r7 = com.facetec.sdk.C3271jv.HTTP_2     // Catch:{ IOException -> 0x0692 }
            if (r0 != r7) goto L_0x056a
            r9.mo9664e((int) r4)     // Catch:{ IOException -> 0x0692 }
        L_0x056a:
            com.facetec.sdk.kh r0 = r9.f10906b     // Catch:{ IOException -> 0x0692 }
            r0.mo9635e()     // Catch:{ IOException -> 0x0692 }
            com.facetec.sdk.kh r0 = r9.f10906b     // Catch:{ IOException -> 0x0692 }
            r0.mo9634d()     // Catch:{ IOException -> 0x0692 }
        L_0x0574:
            com.facetec.sdk.kh r0 = r9.f10906b
            boolean r0 = r0.mo9633c()
            if (r0 == 0) goto L_0x058e
            java.net.Socket r0 = r9.f10909e
            if (r0 == 0) goto L_0x0581
            goto L_0x058e
        L_0x0581:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r0.<init>(r2)
            com.facetec.sdk.kt r2 = new com.facetec.sdk.kt
            r2.<init>(r0)
            throw r2
        L_0x058e:
            com.facetec.sdk.ln r0 = r9.f10913i
            if (r0 == 0) goto L_0x05a2
            com.facetec.sdk.jk r2 = r9.f10908d
            monitor-enter(r2)
            com.facetec.sdk.ln r0 = r9.f10913i     // Catch:{ all -> 0x059f }
            int r0 = r0.mo9724b()     // Catch:{ all -> 0x059f }
            r9.f10916m = r0     // Catch:{ all -> 0x059f }
            monitor-exit(r2)     // Catch:{ all -> 0x059f }
            goto L_0x05a2
        L_0x059f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x05a2:
            com.facetec.sdk.kp r0 = r20.m13321i()
            com.facetec.sdk.kh r2 = r9.mo9663e()
            r0.mo9649d(r2)
            com.facetec.sdk.jk r2 = r1.f10935b
            monitor-enter(r2)
            r7 = 1
            r1.f10945m = r7     // Catch:{ all -> 0x05d3 }
            com.facetec.sdk.kf r0 = com.facetec.sdk.C3300kf.f10832d     // Catch:{ all -> 0x05d3 }
            com.facetec.sdk.jk r3 = r1.f10935b     // Catch:{ all -> 0x05d3 }
            r0.mo9531e((com.facetec.sdk.C3249jk) r3, (com.facetec.sdk.C3319ks) r9)     // Catch:{ all -> 0x05d3 }
            boolean r0 = r9.mo9662d()     // Catch:{ all -> 0x05d3 }
            if (r0 == 0) goto L_0x05cd
            com.facetec.sdk.kf r0 = com.facetec.sdk.C3300kf.f10832d     // Catch:{ all -> 0x05d3 }
            com.facetec.sdk.jk r3 = r1.f10935b     // Catch:{ all -> 0x05d3 }
            com.facetec.sdk.jd r4 = r1.f10939f     // Catch:{ all -> 0x05d3 }
            java.net.Socket r8 = r0.mo9525b(r3, r4, r1)     // Catch:{ all -> 0x05d3 }
            com.facetec.sdk.ks r9 = r1.f10936c     // Catch:{ all -> 0x05d3 }
            goto L_0x05ce
        L_0x05cd:
            r8 = 0
        L_0x05ce:
            monitor-exit(r2)     // Catch:{ all -> 0x05d3 }
            com.facetec.sdk.C3303ki.m13267d((java.net.Socket) r8)
            return r9
        L_0x05d3:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x05d6:
            r7 = 1
            java.util.List r10 = r10.mo9484d()     // Catch:{ AssertionError -> 0x0628, all -> 0x0626 }
            r11 = 0
            java.lang.Object r10 = r10.get(r11)     // Catch:{ AssertionError -> 0x065c }
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10     // Catch:{ AssertionError -> 0x065c }
            javax.net.ssl.SSLPeerUnverifiedException r12 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x065c }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x065c }
            java.lang.String r15 = "Hostname "
            r13.<init>(r15)     // Catch:{ AssertionError -> 0x065c }
            com.facetec.sdk.jx r0 = r0.mo9431d()     // Catch:{ AssertionError -> 0x065c }
            java.lang.String r0 = r0.mo9551h()     // Catch:{ AssertionError -> 0x065c }
            r13.append(r0)     // Catch:{ AssertionError -> 0x065c }
            java.lang.String r0 = " not verified:\n    certificate: "
            r13.append(r0)     // Catch:{ AssertionError -> 0x065c }
            java.lang.String r0 = com.facetec.sdk.C3244jh.m13017d(r10)     // Catch:{ AssertionError -> 0x065c }
            r13.append(r0)     // Catch:{ AssertionError -> 0x065c }
            java.lang.String r0 = "\n    DN: "
            r13.append(r0)     // Catch:{ AssertionError -> 0x065c }
            java.security.Principal r0 = r10.getSubjectDN()     // Catch:{ AssertionError -> 0x065c }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x065c }
            r13.append(r0)     // Catch:{ AssertionError -> 0x065c }
            java.lang.String r0 = "\n    subjectAltNames: "
            r13.append(r0)     // Catch:{ AssertionError -> 0x065c }
            java.util.List r0 = com.facetec.sdk.C3425mj.m13635d(r10)     // Catch:{ AssertionError -> 0x065c }
            r13.append(r0)     // Catch:{ AssertionError -> 0x065c }
            java.lang.String r0 = r13.toString()     // Catch:{ AssertionError -> 0x065c }
            r12.<init>(r0)     // Catch:{ AssertionError -> 0x065c }
            throw r12     // Catch:{ AssertionError -> 0x065c }
        L_0x0626:
            r0 = move-exception
            goto L_0x0660
        L_0x0628:
            r0 = move-exception
            goto L_0x0664
        L_0x062a:
            r7 = 1
            r11 = 0
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException     // Catch:{ AssertionError -> 0x065c }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x065c }
            java.lang.String r12 = "Unable to find acceptable protocols. isFallback="
            r10.<init>(r12)     // Catch:{ AssertionError -> 0x065c }
            boolean r12 = r5.f10901a     // Catch:{ AssertionError -> 0x065c }
            r10.append(r12)     // Catch:{ AssertionError -> 0x065c }
            java.lang.String r12 = ", modes="
            r10.append(r12)     // Catch:{ AssertionError -> 0x065c }
            java.util.List<com.facetec.sdk.jm> r12 = r5.f10902b     // Catch:{ AssertionError -> 0x065c }
            r10.append(r12)     // Catch:{ AssertionError -> 0x065c }
            java.lang.String r12 = ", supported protocols="
            r10.append(r12)     // Catch:{ AssertionError -> 0x065c }
            java.lang.String[] r12 = r8.getEnabledProtocols()     // Catch:{ AssertionError -> 0x065c }
            java.lang.String r12 = java.util.Arrays.toString(r12)     // Catch:{ AssertionError -> 0x065c }
            r10.append(r12)     // Catch:{ AssertionError -> 0x065c }
            java.lang.String r10 = r10.toString()     // Catch:{ AssertionError -> 0x065c }
            r0.<init>(r10)     // Catch:{ AssertionError -> 0x065c }
            throw r0     // Catch:{ AssertionError -> 0x065c }
        L_0x065c:
            r0 = move-exception
            goto L_0x0675
        L_0x065e:
            r0 = move-exception
            r7 = 1
        L_0x0660:
            r11 = 0
            goto L_0x0683
        L_0x0662:
            r0 = move-exception
            r7 = 1
        L_0x0664:
            r11 = 0
            goto L_0x0675
        L_0x0666:
            r0 = move-exception
            r7 = r12
            goto L_0x066e
        L_0x0669:
            r0 = move-exception
            r7 = r12
            goto L_0x0673
        L_0x066c:
            r0 = move-exception
            r7 = 1
        L_0x066e:
            r11 = 0
            r8 = 0
            goto L_0x0683
        L_0x0671:
            r0 = move-exception
            r7 = 1
        L_0x0673:
            r11 = 0
            r8 = 0
        L_0x0675:
            boolean r10 = com.facetec.sdk.C3303ki.m13260c((java.lang.AssertionError) r0)     // Catch:{ all -> 0x0682 }
            if (r10 == 0) goto L_0x0681
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x0682 }
            r10.<init>(r0)     // Catch:{ all -> 0x0682 }
            throw r10     // Catch:{ all -> 0x0682 }
        L_0x0681:
            throw r0     // Catch:{ all -> 0x0682 }
        L_0x0682:
            r0 = move-exception
        L_0x0683:
            if (r8 == 0) goto L_0x068c
            com.facetec.sdk.mg r10 = com.facetec.sdk.C3422mg.m13612c()     // Catch:{ IOException -> 0x0690 }
            r10.mo9780a((javax.net.ssl.SSLSocket) r8)     // Catch:{ IOException -> 0x0690 }
        L_0x068c:
            com.facetec.sdk.C3303ki.m13267d((java.net.Socket) r8)     // Catch:{ IOException -> 0x0690 }
            throw r0     // Catch:{ IOException -> 0x0690 }
        L_0x0690:
            r0 = move-exception
            goto L_0x0699
        L_0x0692:
            r0 = move-exception
            goto L_0x0697
        L_0x0694:
            r0 = move-exception
            r14 = r23
        L_0x0697:
            r7 = 1
        L_0x0698:
            r11 = 0
        L_0x0699:
            java.net.Socket r8 = r9.f10905a
            com.facetec.sdk.C3303ki.m13267d((java.net.Socket) r8)
            java.net.Socket r8 = r9.f10909e
            com.facetec.sdk.C3303ki.m13267d((java.net.Socket) r8)
            r8 = 0
            r9.f10905a = r8
            r9.f10909e = r8
            r9.f10912h = r8
            r9.f10911g = r8
            r9.f10907c = r8
            r9.f10910f = r8
            r9.f10913i = r8
            com.facetec.sdk.kh r10 = r9.f10906b
            r10.mo9635e()
            com.facetec.sdk.kh r10 = r9.f10906b
            r10.mo9634d()
            if (r6 != 0) goto L_0x06c4
            com.facetec.sdk.kt r6 = new com.facetec.sdk.kt
            r6.<init>(r0)
            goto L_0x06cb
        L_0x06c4:
            java.io.IOException r10 = r6.f10919d
            com.facetec.sdk.C3303ki.m13266d((java.lang.Throwable) r10, (java.lang.Throwable) r0)
            r6.f10920e = r0
        L_0x06cb:
            if (r25 == 0) goto L_0x06d5
            boolean r0 = r5.mo9654e(r0)
            if (r0 == 0) goto L_0x06d5
            goto L_0x02e6
        L_0x06d5:
            throw r6
        L_0x06d6:
            com.facetec.sdk.kt r0 = new com.facetec.sdk.kt
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r2.<init>(r3)
            r0.<init>(r2)
            throw r0
        L_0x06e3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "already connected"
            r0.<init>(r2)
            throw r0
        L_0x06eb:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x06f3 }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x06f3 }
            throw r0     // Catch:{ all -> 0x06f3 }
        L_0x06f3:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x06f6:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x070e }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x070e }
            throw r0     // Catch:{ all -> 0x070e }
        L_0x06fe:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x070e }
            java.lang.String r2 = "codec != null"
            r0.<init>(r2)     // Catch:{ all -> 0x070e }
            throw r0     // Catch:{ all -> 0x070e }
        L_0x0706:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x070e }
            java.lang.String r2 = "released"
            r0.<init>(r2)     // Catch:{ all -> 0x070e }
            throw r0     // Catch:{ all -> 0x070e }
        L_0x070e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3325kw.m13319c(int, int, int, int, boolean):com.facetec.sdk.ks");
    }

    /* renamed from: e */
    public final void mo9680e(C3319ks ksVar, boolean z) {
        if (!f10933j && !Thread.holdsLock(this.f10935b)) {
            throw new AssertionError();
        } else if (this.f10936c == null) {
            this.f10936c = ksVar;
            this.f10945m = z;
            ksVar.f10918o.add(new C3326c(this, this.f10946n));
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: c */
    public final void mo9675c(boolean z, C3344lc lcVar, IOException iOException) {
        Socket d;
        boolean z2;
        synchronized (this.f10935b) {
            if (lcVar != null) {
                if (lcVar == this.f10942i) {
                    if (!z) {
                        this.f10936c.f10917n++;
                    }
                    d = mo9678d(z, false, true);
                    z2 = this.f10943k;
                }
            }
            StringBuilder sb = new StringBuilder("expected ");
            sb.append(this.f10942i);
            sb.append(" but was ");
            sb.append(lcVar);
            throw new IllegalStateException(sb.toString());
        }
        C3303ki.m13267d(d);
        C3247ji jiVar = this.f10937d;
        if (iOException != null) {
            C3300kf.f10832d.mo9524b(jiVar, iOException);
        } else if (z2) {
            C3300kf.f10832d.mo9524b(jiVar, (IOException) null);
        }
    }

    /* renamed from: c */
    public final boolean mo9676c() {
        if (this.f10938e != null) {
            return true;
        }
        C3321ku.C3322c cVar = this.f10941h;
        return (cVar != null && cVar.mo9670e()) || this.f10944l.mo9668c();
    }
}
