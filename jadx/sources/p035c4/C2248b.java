package p035c4;

import p035c4.C2251e;

/* renamed from: c4.b */
public final class C2248b implements C2251e, C2250d {

    /* renamed from: a */
    private final Object f7005a;

    /* renamed from: b */
    private final C2251e f7006b;

    /* renamed from: c */
    private volatile C2250d f7007c;

    /* renamed from: d */
    private volatile C2250d f7008d;

    /* renamed from: e */
    private C2251e.C2252a f7009e;

    /* renamed from: f */
    private C2251e.C2252a f7010f;

    public C2248b(Object obj, C2251e eVar) {
        C2251e.C2252a aVar = C2251e.C2252a.CLEARED;
        this.f7009e = aVar;
        this.f7010f = aVar;
        this.f7005a = obj;
        this.f7006b = eVar;
    }

    /* renamed from: m */
    private boolean m8629m(C2250d dVar) {
        C2251e.C2252a aVar;
        C2251e.C2252a aVar2 = this.f7009e;
        C2251e.C2252a aVar3 = C2251e.C2252a.FAILED;
        if (aVar2 != aVar3) {
            return dVar.equals(this.f7007c);
        }
        if (!dVar.equals(this.f7008d) || ((aVar = this.f7010f) != C2251e.C2252a.SUCCESS && aVar != aVar3)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private boolean m8630n() {
        C2251e eVar = this.f7006b;
        return eVar == null || eVar.mo7267h(this);
    }

    /* renamed from: o */
    private boolean m8631o() {
        C2251e eVar = this.f7006b;
        return eVar == null || eVar.mo7263d(this);
    }

    /* renamed from: p */
    private boolean m8632p() {
        C2251e eVar = this.f7006b;
        return eVar == null || eVar.mo7270j(this);
    }

    /* renamed from: a */
    public boolean mo7259a() {
        boolean z;
        synchronized (this.f7005a) {
            if (!this.f7007c.mo7259a()) {
                if (!this.f7008d.mo7259a()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public C2251e mo7260b() {
        C2251e eVar;
        synchronized (this.f7005a) {
            C2251e eVar2 = this.f7006b;
            if (eVar2 != null) {
                eVar = eVar2.mo7260b();
            } else {
                eVar = this;
            }
        }
        return eVar;
    }

    /* renamed from: c */
    public void mo7261c() {
        synchronized (this.f7005a) {
            C2251e.C2252a aVar = this.f7009e;
            C2251e.C2252a aVar2 = C2251e.C2252a.RUNNING;
            if (aVar == aVar2) {
                this.f7009e = C2251e.C2252a.PAUSED;
                this.f7007c.mo7261c();
            }
            if (this.f7010f == aVar2) {
                this.f7010f = C2251e.C2252a.PAUSED;
                this.f7008d.mo7261c();
            }
        }
    }

    public void clear() {
        synchronized (this.f7005a) {
            C2251e.C2252a aVar = C2251e.C2252a.CLEARED;
            this.f7009e = aVar;
            this.f7007c.clear();
            if (this.f7010f != aVar) {
                this.f7010f = aVar;
                this.f7008d.clear();
            }
        }
    }

    /* renamed from: d */
    public boolean mo7263d(C2250d dVar) {
        boolean z;
        synchronized (this.f7005a) {
            if (!m8631o() || !m8629m(dVar)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7264e(p035c4.C2250d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f7005a
            monitor-enter(r0)
            c4.d r1 = r2.f7008d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x001e
            c4.e$a r3 = p035c4.C2251e.C2252a.FAILED     // Catch:{ all -> 0x002b }
            r2.f7009e = r3     // Catch:{ all -> 0x002b }
            c4.e$a r3 = r2.f7010f     // Catch:{ all -> 0x002b }
            c4.e$a r1 = p035c4.C2251e.C2252a.RUNNING     // Catch:{ all -> 0x002b }
            if (r3 == r1) goto L_0x001c
            r2.f7010f = r1     // Catch:{ all -> 0x002b }
            c4.d r3 = r2.f7008d     // Catch:{ all -> 0x002b }
            r3.mo7272l()     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x001e:
            c4.e$a r3 = p035c4.C2251e.C2252a.FAILED     // Catch:{ all -> 0x002b }
            r2.f7010f = r3     // Catch:{ all -> 0x002b }
            c4.e r3 = r2.f7006b     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0029
            r3.mo7264e(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p035c4.C2248b.mo7264e(c4.d):void");
    }

    /* renamed from: f */
    public boolean mo7265f(C2250d dVar) {
        if (!(dVar instanceof C2248b)) {
            return false;
        }
        C2248b bVar = (C2248b) dVar;
        if (!this.f7007c.mo7265f(bVar.f7007c) || !this.f7008d.mo7265f(bVar.f7008d)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo7266g() {
        boolean z;
        synchronized (this.f7005a) {
            C2251e.C2252a aVar = this.f7009e;
            C2251e.C2252a aVar2 = C2251e.C2252a.CLEARED;
            if (aVar == aVar2 && this.f7010f == aVar2) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: h */
    public boolean mo7267h(C2250d dVar) {
        boolean z;
        synchronized (this.f7005a) {
            if (!m8630n() || !dVar.equals(this.f7007c)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: i */
    public boolean mo7268i() {
        boolean z;
        synchronized (this.f7005a) {
            C2251e.C2252a aVar = this.f7009e;
            C2251e.C2252a aVar2 = C2251e.C2252a.SUCCESS;
            if (aVar != aVar2) {
                if (this.f7010f != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f7005a) {
            C2251e.C2252a aVar = this.f7009e;
            C2251e.C2252a aVar2 = C2251e.C2252a.RUNNING;
            if (aVar != aVar2) {
                if (this.f7010f != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo7270j(C2250d dVar) {
        boolean p;
        synchronized (this.f7005a) {
            p = m8632p();
        }
        return p;
    }

    /* renamed from: k */
    public void mo7271k(C2250d dVar) {
        synchronized (this.f7005a) {
            if (dVar.equals(this.f7007c)) {
                this.f7009e = C2251e.C2252a.SUCCESS;
            } else if (dVar.equals(this.f7008d)) {
                this.f7010f = C2251e.C2252a.SUCCESS;
            }
            C2251e eVar = this.f7006b;
            if (eVar != null) {
                eVar.mo7271k(this);
            }
        }
    }

    /* renamed from: l */
    public void mo7272l() {
        synchronized (this.f7005a) {
            C2251e.C2252a aVar = this.f7009e;
            C2251e.C2252a aVar2 = C2251e.C2252a.RUNNING;
            if (aVar != aVar2) {
                this.f7009e = aVar2;
                this.f7007c.mo7272l();
            }
        }
    }

    /* renamed from: q */
    public void mo7273q(C2250d dVar, C2250d dVar2) {
        this.f7007c = dVar;
        this.f7008d = dVar2;
    }
}
