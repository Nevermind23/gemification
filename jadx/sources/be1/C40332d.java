package be1;

import uh1.C43107b;
import uh1.C43108c;
import yd1.C43355a;
import yd1.C43367k;

/* renamed from: be1.d */
final class C40332d extends C40329b {

    /* renamed from: e */
    final C40329b f95818e;

    /* renamed from: f */
    boolean f95819f;

    /* renamed from: g */
    C43355a f95820g;

    /* renamed from: h */
    volatile boolean f95821h;

    C40332d(C40329b bVar) {
        this.f95818e = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        this.f95818e.mo26347a(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo94366L() {
        C43355a aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f95820g;
                if (aVar == null) {
                    this.f95819f = false;
                    return;
                }
                this.f95820g = null;
            }
            aVar.mo102030b(this.f95818e);
        }
        while (true) {
        }
    }

    /* renamed from: b */
    public void mo27070b(C43108c cVar) {
        boolean z = true;
        if (!this.f95821h) {
            synchronized (this) {
                if (!this.f95821h) {
                    if (this.f95819f) {
                        C43355a aVar = this.f95820g;
                        if (aVar == null) {
                            aVar = new C43355a(4);
                            this.f95820g = aVar;
                        }
                        aVar.mo102031c(C43367k.m124430r(cVar));
                        return;
                    }
                    this.f95819f = true;
                    z = false;
                }
            }
        }
        if (z) {
            cVar.cancel();
            return;
        }
        this.f95818e.mo27070b(cVar);
        mo94366L();
    }

    public void onComplete() {
        if (!this.f95821h) {
            synchronized (this) {
                if (!this.f95821h) {
                    this.f95821h = true;
                    if (this.f95819f) {
                        C43355a aVar = this.f95820g;
                        if (aVar == null) {
                            aVar = new C43355a(4);
                            this.f95820g = aVar;
                        }
                        aVar.mo102031c(C43367k.m124422e());
                        return;
                    }
                    this.f95819f = true;
                    this.f95818e.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r1 == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        ae1.C40293a.m116722s(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        r2.f95818e.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f95821h
            if (r0 == 0) goto L_0x0008
            ae1.C40293a.m116722s(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f95821h     // Catch:{ all -> 0x003a }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x002d
        L_0x000f:
            r2.f95821h = r1     // Catch:{ all -> 0x003a }
            boolean r0 = r2.f95819f     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x002a
            yd1.a r0 = r2.f95820g     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0021
            yd1.a r0 = new yd1.a     // Catch:{ all -> 0x003a }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003a }
            r2.f95820g = r0     // Catch:{ all -> 0x003a }
        L_0x0021:
            java.lang.Object r3 = yd1.C43367k.m124424g(r3)     // Catch:{ all -> 0x003a }
            r0.mo102033e(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            return
        L_0x002a:
            r2.f95819f = r1     // Catch:{ all -> 0x003a }
            r1 = 0
        L_0x002d:
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0034
            ae1.C40293a.m116722s(r3)
            return
        L_0x0034:
            be1.b r0 = r2.f95818e
            r0.onError(r3)
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: be1.C40332d.onError(java.lang.Throwable):void");
    }

    public void onNext(Object obj) {
        if (!this.f95821h) {
            synchronized (this) {
                if (!this.f95821h) {
                    if (this.f95819f) {
                        C43355a aVar = this.f95820g;
                        if (aVar == null) {
                            aVar = new C43355a(4);
                            this.f95820g = aVar;
                        }
                        aVar.mo102031c(C43367k.m124429q(obj));
                        return;
                    }
                    this.f95819f = true;
                    this.f95818e.onNext(obj);
                    mo94366L();
                }
            }
        }
    }
}
