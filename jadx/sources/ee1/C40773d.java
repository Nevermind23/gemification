package ee1;

import ed1.C40756v;
import hd1.C41205b;
import yd1.C43355a;
import yd1.C43367k;

/* renamed from: ee1.d */
final class C40773d extends C40776f implements C43355a.C43356a {

    /* renamed from: d */
    final C40776f f96499d;

    /* renamed from: e */
    boolean f96500e;

    /* renamed from: f */
    C43355a f96501f;

    /* renamed from: g */
    volatile boolean f96502g;

    C40773d(C40776f fVar) {
        this.f96499d = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f96499d.mo95016c(vVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void mo95121g1() {
        C43355a aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f96501f;
                if (aVar == null) {
                    this.f96500e = false;
                    return;
                }
                this.f96501f = null;
            }
            aVar.mo102032d(this);
        }
        while (true) {
        }
    }

    public void onComplete() {
        if (!this.f96502g) {
            synchronized (this) {
                if (!this.f96502g) {
                    this.f96502g = true;
                    if (this.f96500e) {
                        C43355a aVar = this.f96501f;
                        if (aVar == null) {
                            aVar = new C43355a(4);
                            this.f96501f = aVar;
                        }
                        aVar.mo102031c(C43367k.m124422e());
                        return;
                    }
                    this.f96500e = true;
                    this.f96499d.onComplete();
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
        r2.f96499d.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f96502g
            if (r0 == 0) goto L_0x0008
            ae1.C40293a.m116722s(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f96502g     // Catch:{ all -> 0x003a }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x002d
        L_0x000f:
            r2.f96502g = r1     // Catch:{ all -> 0x003a }
            boolean r0 = r2.f96500e     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x002a
            yd1.a r0 = r2.f96501f     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0021
            yd1.a r0 = new yd1.a     // Catch:{ all -> 0x003a }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003a }
            r2.f96501f = r0     // Catch:{ all -> 0x003a }
        L_0x0021:
            java.lang.Object r3 = yd1.C43367k.m124424g(r3)     // Catch:{ all -> 0x003a }
            r0.mo102033e(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            return
        L_0x002a:
            r2.f96500e = r1     // Catch:{ all -> 0x003a }
            r1 = 0
        L_0x002d:
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0034
            ae1.C40293a.m116722s(r3)
            return
        L_0x0034:
            ee1.f r0 = r2.f96499d
            r0.onError(r3)
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ee1.C40773d.onError(java.lang.Throwable):void");
    }

    public void onNext(Object obj) {
        if (!this.f96502g) {
            synchronized (this) {
                if (!this.f96502g) {
                    if (this.f96500e) {
                        C43355a aVar = this.f96501f;
                        if (aVar == null) {
                            aVar = new C43355a(4);
                            this.f96501f = aVar;
                        }
                        aVar.mo102031c(C43367k.m124429q(obj));
                        return;
                    }
                    this.f96500e = true;
                    this.f96499d.onNext(obj);
                    mo95121g1();
                }
            }
        }
    }

    public void onSubscribe(C41205b bVar) {
        boolean z = true;
        if (!this.f96502g) {
            synchronized (this) {
                if (!this.f96502g) {
                    if (this.f96500e) {
                        C43355a aVar = this.f96501f;
                        if (aVar == null) {
                            aVar = new C43355a(4);
                            this.f96501f = aVar;
                        }
                        aVar.mo102031c(C43367k.m124423f(bVar));
                        return;
                    }
                    this.f96500e = true;
                    z = false;
                }
            }
        }
        if (z) {
            bVar.dispose();
            return;
        }
        this.f96499d.onSubscribe(bVar);
        mo95121g1();
    }

    public boolean test(Object obj) {
        return C43367k.m124420b(obj, this.f96499d);
    }
}
