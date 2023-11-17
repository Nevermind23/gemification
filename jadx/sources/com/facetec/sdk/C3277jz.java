package com.facetec.sdk;

import com.facetec.sdk.C3274jx;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facetec.sdk.jz */
final class C3277jz implements C3247ji {

    /* renamed from: a */
    final C3293kb f10754a;

    /* renamed from: b */
    final C3426mk f10755b;

    /* renamed from: c */
    final C3348lg f10756c;
    /* access modifiers changed from: package-private */

    /* renamed from: d */
    public C3264jt f10757d;

    /* renamed from: e */
    final C3268ju f10758e;

    /* renamed from: g */
    final boolean f10759g;

    /* renamed from: i */
    private boolean f10760i;

    /* renamed from: com.facetec.sdk.jz$b */
    final class C3279b extends C3301kg {

        /* renamed from: c */
        static final /* synthetic */ boolean f10762c = true;

        /* renamed from: d */
        final C3248jj f10764d;

        C3279b(C3248jj jjVar) {
            super("OkHttp %s", C3277jz.this.mo9567c());
            this.f10764d = jjVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00af A[Catch:{ all -> 0x00a4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00f7 A[Catch:{ all -> 0x00a4 }] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo9571b() {
            /*
                r15 = this;
                com.facetec.sdk.jz r0 = com.facetec.sdk.C3277jz.this
                com.facetec.sdk.mk r0 = r0.f10755b
                r0.mo9828b()
                r0 = 0
                com.facetec.sdk.jz r13 = com.facetec.sdk.C3277jz.this     // Catch:{ IOException -> 0x00a6 }
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x00a6 }
                r2.<init>()     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.ju r1 = r13.f10758e     // Catch:{ IOException -> 0x00a6 }
                java.util.List<com.facetec.sdk.jw> r1 = r1.f10670a     // Catch:{ IOException -> 0x00a6 }
                r2.addAll(r1)     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.lg r1 = r13.f10756c     // Catch:{ IOException -> 0x00a6 }
                r2.add(r1)     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.kx r1 = new com.facetec.sdk.kx     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.ju r3 = r13.f10758e     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.jo r3 = r3.mo9506a()     // Catch:{ IOException -> 0x00a6 }
                r1.<init>(r3)     // Catch:{ IOException -> 0x00a6 }
                r2.add(r1)     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.kk r1 = new com.facetec.sdk.kk     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.ju r3 = r13.f10758e     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.jb r4 = r3.f10674g     // Catch:{ IOException -> 0x00a6 }
                if (r4 == 0) goto L_0x0034
                com.facetec.sdk.kq r3 = r4.f10541c     // Catch:{ IOException -> 0x00a6 }
                goto L_0x0036
            L_0x0034:
                com.facetec.sdk.kq r3 = r3.f10673f     // Catch:{ IOException -> 0x00a6 }
            L_0x0036:
                r1.<init>(r3)     // Catch:{ IOException -> 0x00a6 }
                r2.add(r1)     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.ko r1 = new com.facetec.sdk.ko     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.ju r3 = r13.f10758e     // Catch:{ IOException -> 0x00a6 }
                r1.<init>(r3)     // Catch:{ IOException -> 0x00a6 }
                r2.add(r1)     // Catch:{ IOException -> 0x00a6 }
                boolean r1 = r13.f10759g     // Catch:{ IOException -> 0x00a6 }
                if (r1 != 0) goto L_0x0051
                com.facetec.sdk.ju r1 = r13.f10758e     // Catch:{ IOException -> 0x00a6 }
                java.util.List<com.facetec.sdk.jw> r1 = r1.f10671c     // Catch:{ IOException -> 0x00a6 }
                r2.addAll(r1)     // Catch:{ IOException -> 0x00a6 }
            L_0x0051:
                com.facetec.sdk.kv r1 = new com.facetec.sdk.kv     // Catch:{ IOException -> 0x00a6 }
                boolean r3 = r13.f10759g     // Catch:{ IOException -> 0x00a6 }
                r1.<init>(r3)     // Catch:{ IOException -> 0x00a6 }
                r2.add(r1)     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.la r14 = new com.facetec.sdk.la     // Catch:{ IOException -> 0x00a6 }
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                com.facetec.sdk.kb r7 = r13.f10754a     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.jt r9 = r13.f10757d     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.ju r1 = r13.f10758e     // Catch:{ IOException -> 0x00a6 }
                int r10 = r1.f10676i     // Catch:{ IOException -> 0x00a6 }
                int r11 = r1.f10681n     // Catch:{ IOException -> 0x00a6 }
                int r12 = r1.f10679l     // Catch:{ IOException -> 0x00a6 }
                r1 = r14
                r8 = r13
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.kb r1 = r13.f10754a     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.kc r1 = r14.mo9541e(r1)     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.jz r2 = com.facetec.sdk.C3277jz.this     // Catch:{ IOException -> 0x00a6 }
                com.facetec.sdk.lg r2 = r2.f10756c     // Catch:{ IOException -> 0x00a6 }
                boolean r0 = r2.mo9703d()     // Catch:{ IOException -> 0x00a6 }
                r2 = 1
                if (r0 == 0) goto L_0x0090
                com.facetec.sdk.jj r0 = r15.f10764d     // Catch:{ IOException -> 0x00a1 }
                java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x00a1 }
                java.lang.String r3 = "Canceled"
                r1.<init>(r3)     // Catch:{ IOException -> 0x00a1 }
                r0.mo8842b()     // Catch:{ IOException -> 0x00a1 }
                goto L_0x0095
            L_0x0090:
                com.facetec.sdk.jj r0 = r15.f10764d     // Catch:{ IOException -> 0x00a1 }
                r0.mo8841a(r1)     // Catch:{ IOException -> 0x00a1 }
            L_0x0095:
                com.facetec.sdk.jz r0 = com.facetec.sdk.C3277jz.this
                com.facetec.sdk.ju r0 = r0.f10758e
                com.facetec.sdk.jn r0 = r0.mo9518l()
                r0.mo9481d(r15)
                return
            L_0x00a1:
                r1 = move-exception
                r0 = r2
                goto L_0x00a7
            L_0x00a4:
                r0 = move-exception
                goto L_0x0102
            L_0x00a6:
                r1 = move-exception
            L_0x00a7:
                com.facetec.sdk.jz r2 = com.facetec.sdk.C3277jz.this     // Catch:{ all -> 0x00a4 }
                java.io.IOException r1 = r2.mo9566c(r1)     // Catch:{ all -> 0x00a4 }
                if (r0 == 0) goto L_0x00f7
                com.facetec.sdk.mg r0 = com.facetec.sdk.C3422mg.m13612c()     // Catch:{ all -> 0x00a4 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a4 }
                java.lang.String r3 = "Callback failure for "
                r2.<init>(r3)     // Catch:{ all -> 0x00a4 }
                com.facetec.sdk.jz r3 = com.facetec.sdk.C3277jz.this     // Catch:{ all -> 0x00a4 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a4 }
                r4.<init>()     // Catch:{ all -> 0x00a4 }
                boolean r5 = r3.mo9569e()     // Catch:{ all -> 0x00a4 }
                if (r5 == 0) goto L_0x00ca
                java.lang.String r5 = "canceled "
                goto L_0x00cc
            L_0x00ca:
                java.lang.String r5 = ""
            L_0x00cc:
                r4.append(r5)     // Catch:{ all -> 0x00a4 }
                boolean r5 = r3.f10759g     // Catch:{ all -> 0x00a4 }
                if (r5 == 0) goto L_0x00d6
                java.lang.String r5 = "web socket"
                goto L_0x00d8
            L_0x00d6:
                java.lang.String r5 = "call"
            L_0x00d8:
                r4.append(r5)     // Catch:{ all -> 0x00a4 }
                java.lang.String r5 = " to "
                r4.append(r5)     // Catch:{ all -> 0x00a4 }
                java.lang.String r3 = r3.mo9567c()     // Catch:{ all -> 0x00a4 }
                r4.append(r3)     // Catch:{ all -> 0x00a4 }
                java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x00a4 }
                r2.append(r3)     // Catch:{ all -> 0x00a4 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00a4 }
                r3 = 4
                r0.mo9804d((int) r3, (java.lang.String) r2, (java.lang.Throwable) r1)     // Catch:{ all -> 0x00a4 }
                goto L_0x0095
            L_0x00f7:
                com.facetec.sdk.jz r0 = com.facetec.sdk.C3277jz.this     // Catch:{ all -> 0x00a4 }
                com.facetec.sdk.C3264jt unused = r0.f10757d     // Catch:{ all -> 0x00a4 }
                com.facetec.sdk.jj r0 = r15.f10764d     // Catch:{ all -> 0x00a4 }
                r0.mo8842b()     // Catch:{ all -> 0x00a4 }
                goto L_0x0095
            L_0x0102:
                com.facetec.sdk.jz r1 = com.facetec.sdk.C3277jz.this
                com.facetec.sdk.ju r1 = r1.f10758e
                com.facetec.sdk.jn r1 = r1.mo9518l()
                r1.mo9481d(r15)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3277jz.C3279b.mo9571b():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final String mo9572d() {
            return C3277jz.this.f10754a.mo9588a().mo9551h();
        }
    }

    private C3277jz(C3268ju juVar, C3293kb kbVar, boolean z) {
        this.f10758e = juVar;
        this.f10754a = kbVar;
        this.f10759g = z;
        this.f10756c = new C3348lg(juVar, z);
        C32782 r4 = new C3426mk() {
            /* renamed from: c */
            public final void mo9570c() {
                C3344lc lcVar;
                C3319ks ksVar;
                C3348lg lgVar = C3277jz.this.f10756c;
                lgVar.f10991d = true;
                C3325kw kwVar = lgVar.f10990c;
                if (kwVar != null) {
                    synchronized (kwVar.f10935b) {
                        kwVar.f10940g = true;
                        lcVar = kwVar.f10942i;
                        ksVar = kwVar.f10936c;
                    }
                    if (lcVar != null) {
                        lcVar.mo9698b();
                    } else if (ksVar != null) {
                        ksVar.mo9657b();
                    }
                }
            }
        };
        this.f10755b = r4;
        r4.mo9913b((long) juVar.f10675h, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    static C3277jz m13151a(C3268ju juVar, C3293kb kbVar, boolean z) {
        C3277jz jzVar = new C3277jz(juVar, kbVar, z);
        jzVar.f10757d = juVar.f10672d.mo9505b();
        return jzVar;
    }

    /* renamed from: b */
    public final void mo9460b(C3248jj jjVar) {
        synchronized (this) {
            if (!this.f10760i) {
                this.f10760i = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f10756c.f10992e = C3422mg.m13612c().mo9798a("response.body().close()");
        C3254jn l = this.f10758e.mo9518l();
        C3279b bVar = new C3279b(jjVar);
        synchronized (l) {
            l.f10641a.add(bVar);
        }
        l.mo9479a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final IOException mo9566c(IOException iOException) {
        if (!this.f10755b.mo9830d()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final /* synthetic */ Object clone() {
        return m13151a(this.f10758e, this.f10754a, this.f10759g);
    }

    /* renamed from: e */
    public final boolean mo9569e() {
        return this.f10756c.mo9703d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo9567c() {
        C3274jx.C3275c d = this.f10754a.mo9588a().mo9545d("/...");
        d.f10743d = C3274jx.m13120e("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        d.f10742c = C3274jx.m13120e("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return d.mo9556a().toString();
    }
}
