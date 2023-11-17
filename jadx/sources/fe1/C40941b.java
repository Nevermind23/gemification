package fe1;

import ed1.C40742i;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43259d;
import yd1.C43355a;
import yd1.C43367k;

/* renamed from: fe1.b */
public final class C40941b implements C40742i, C43108c {

    /* renamed from: d */
    final C43107b f96707d;

    /* renamed from: e */
    final boolean f96708e;

    /* renamed from: f */
    C43108c f96709f;

    /* renamed from: g */
    boolean f96710g;

    /* renamed from: h */
    C43355a f96711h;

    /* renamed from: i */
    volatile boolean f96712i;

    public C40941b(C43107b bVar) {
        this(bVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo95332a() {
        C43355a aVar;
        do {
            synchronized (this) {
                aVar = this.f96711h;
                if (aVar == null) {
                    this.f96710g = false;
                    return;
                }
                this.f96711h = null;
            }
        } while (!aVar.mo102030b(this.f96707d));
    }

    /* renamed from: b */
    public void mo27070b(C43108c cVar) {
        if (C43259d.m124224h(this.f96709f, cVar)) {
            this.f96709f = cVar;
            this.f96707d.mo27070b(this);
        }
    }

    public void cancel() {
        this.f96709f.cancel();
    }

    /* renamed from: l */
    public void mo94357l(long j) {
        this.f96709f.mo94357l(j);
    }

    public void onComplete() {
        if (!this.f96712i) {
            synchronized (this) {
                if (!this.f96712i) {
                    if (this.f96710g) {
                        C43355a aVar = this.f96711h;
                        if (aVar == null) {
                            aVar = new C43355a(4);
                            this.f96711h = aVar;
                        }
                        aVar.mo102031c(C43367k.m124422e());
                        return;
                    }
                    this.f96712i = true;
                    this.f96710g = true;
                    this.f96707d.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        ae1.C40293a.m116722s(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2.f96707d.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f96712i
            if (r0 == 0) goto L_0x0008
            ae1.C40293a.m116722s(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f96712i     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f96710g     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f96712i = r1     // Catch:{ all -> 0x0044 }
            yd1.a r0 = r2.f96711h     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            yd1.a r0 = new yd1.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f96711h = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = yd1.C43367k.m124424g(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f96708e     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo102031c(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo102033e(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f96712i = r1     // Catch:{ all -> 0x0044 }
            r2.f96710g = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            ae1.C40293a.m116722s(r3)
            return
        L_0x003e:
            uh1.b r0 = r2.f96707d
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fe1.C40941b.onError(java.lang.Throwable):void");
    }

    public void onNext(Object obj) {
        if (!this.f96712i) {
            if (obj == null) {
                this.f96709f.cancel();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f96712i) {
                    if (this.f96710g) {
                        C43355a aVar = this.f96711h;
                        if (aVar == null) {
                            aVar = new C43355a(4);
                            this.f96711h = aVar;
                        }
                        aVar.mo102031c(C43367k.m124429q(obj));
                        return;
                    }
                    this.f96710g = true;
                    this.f96707d.onNext(obj);
                    mo95332a();
                }
            }
        }
    }

    public C40941b(C43107b bVar, boolean z) {
        this.f96707d = bVar;
        this.f96708e = z;
    }
}
