package p469io.reactivex.observers;

import ed1.C40756v;
import hd1.C41205b;
import kd1.C41498c;
import yd1.C43355a;
import yd1.C43367k;

/* renamed from: io.reactivex.observers.b */
public final class C41381b implements C40756v, C41205b {

    /* renamed from: d */
    final C40756v f97429d;

    /* renamed from: e */
    final boolean f97430e;

    /* renamed from: f */
    C41205b f97431f;

    /* renamed from: g */
    boolean f97432g;

    /* renamed from: h */
    C43355a f97433h;

    /* renamed from: i */
    volatile boolean f97434i;

    public C41381b(C40756v vVar) {
        this(vVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo96031a() {
        C43355a aVar;
        do {
            synchronized (this) {
                aVar = this.f97433h;
                if (aVar == null) {
                    this.f97432g = false;
                    return;
                }
                this.f97433h = null;
            }
        } while (!aVar.mo102029a(this.f97429d));
    }

    public void dispose() {
        this.f97431f.dispose();
    }

    public boolean isDisposed() {
        return this.f97431f.isDisposed();
    }

    public void onComplete() {
        if (!this.f97434i) {
            synchronized (this) {
                if (!this.f97434i) {
                    if (this.f97432g) {
                        C43355a aVar = this.f97433h;
                        if (aVar == null) {
                            aVar = new C43355a(4);
                            this.f97433h = aVar;
                        }
                        aVar.mo102031c(C43367k.m124422e());
                        return;
                    }
                    this.f97434i = true;
                    this.f97432g = true;
                    this.f97429d.onComplete();
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
        r2.f97429d.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f97434i
            if (r0 == 0) goto L_0x0008
            ae1.C40293a.m116722s(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f97434i     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f97432g     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f97434i = r1     // Catch:{ all -> 0x0044 }
            yd1.a r0 = r2.f97433h     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            yd1.a r0 = new yd1.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f97433h = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = yd1.C43367k.m124424g(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f97430e     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo102031c(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo102033e(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f97434i = r1     // Catch:{ all -> 0x0044 }
            r2.f97432g = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            ae1.C40293a.m116722s(r3)
            return
        L_0x003e:
            ed1.v r0 = r2.f97429d
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p469io.reactivex.observers.C41381b.onError(java.lang.Throwable):void");
    }

    public void onNext(Object obj) {
        if (!this.f97434i) {
            if (obj == null) {
                this.f97431f.dispose();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f97434i) {
                    if (this.f97432g) {
                        C43355a aVar = this.f97433h;
                        if (aVar == null) {
                            aVar = new C43355a(4);
                            this.f97433h = aVar;
                        }
                        aVar.mo102031c(C43367k.m124429q(obj));
                        return;
                    }
                    this.f97432g = true;
                    this.f97429d.onNext(obj);
                    mo96031a();
                }
            }
        }
    }

    public void onSubscribe(C41205b bVar) {
        if (C41498c.m120378l(this.f97431f, bVar)) {
            this.f97431f = bVar;
            this.f97429d.onSubscribe(this);
        }
    }

    public C41381b(C40756v vVar, boolean z) {
        this.f97429d = vVar;
        this.f97430e = z;
    }
}
