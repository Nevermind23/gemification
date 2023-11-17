package p035c4;

import p035c4.C2251e;

/* renamed from: c4.k */
public class C2260k implements C2251e, C2250d {

    /* renamed from: a */
    private final C2251e f7069a;

    /* renamed from: b */
    private final Object f7070b;

    /* renamed from: c */
    private volatile C2250d f7071c;

    /* renamed from: d */
    private volatile C2250d f7072d;

    /* renamed from: e */
    private C2251e.C2252a f7073e;

    /* renamed from: f */
    private C2251e.C2252a f7074f;

    /* renamed from: g */
    private boolean f7075g;

    public C2260k(Object obj, C2251e eVar) {
        C2251e.C2252a aVar = C2251e.C2252a.CLEARED;
        this.f7073e = aVar;
        this.f7074f = aVar;
        this.f7070b = obj;
        this.f7069a = eVar;
    }

    /* renamed from: m */
    private boolean m8709m() {
        C2251e eVar = this.f7069a;
        return eVar == null || eVar.mo7267h(this);
    }

    /* renamed from: n */
    private boolean m8710n() {
        C2251e eVar = this.f7069a;
        return eVar == null || eVar.mo7263d(this);
    }

    /* renamed from: o */
    private boolean m8711o() {
        C2251e eVar = this.f7069a;
        return eVar == null || eVar.mo7270j(this);
    }

    /* renamed from: a */
    public boolean mo7259a() {
        boolean z;
        synchronized (this.f7070b) {
            if (!this.f7072d.mo7259a()) {
                if (!this.f7071c.mo7259a()) {
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
        synchronized (this.f7070b) {
            C2251e eVar2 = this.f7069a;
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
        synchronized (this.f7070b) {
            if (!this.f7074f.mo7274a()) {
                this.f7074f = C2251e.C2252a.PAUSED;
                this.f7072d.mo7261c();
            }
            if (!this.f7073e.mo7274a()) {
                this.f7073e = C2251e.C2252a.PAUSED;
                this.f7071c.mo7261c();
            }
        }
    }

    public void clear() {
        synchronized (this.f7070b) {
            this.f7075g = false;
            C2251e.C2252a aVar = C2251e.C2252a.CLEARED;
            this.f7073e = aVar;
            this.f7074f = aVar;
            this.f7072d.clear();
            this.f7071c.clear();
        }
    }

    /* renamed from: d */
    public boolean mo7263d(C2250d dVar) {
        boolean z;
        synchronized (this.f7070b) {
            if (!m8710n() || !dVar.equals(this.f7071c) || mo7259a()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7264e(p035c4.C2250d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f7070b
            monitor-enter(r0)
            c4.d r1 = r2.f7071c     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0011
            c4.e$a r3 = p035c4.C2251e.C2252a.FAILED     // Catch:{ all -> 0x001e }
            r2.f7074f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0011:
            c4.e$a r3 = p035c4.C2251e.C2252a.FAILED     // Catch:{ all -> 0x001e }
            r2.f7073e = r3     // Catch:{ all -> 0x001e }
            c4.e r3 = r2.f7069a     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001c
            r3.mo7264e(r2)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p035c4.C2260k.mo7264e(c4.d):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7265f(p035c4.C2250d r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof p035c4.C2260k
            r1 = 0
            if (r0 == 0) goto L_0x002e
            c4.k r4 = (p035c4.C2260k) r4
            c4.d r0 = r3.f7071c
            if (r0 != 0) goto L_0x0010
            c4.d r0 = r4.f7071c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            c4.d r0 = r3.f7071c
            c4.d r2 = r4.f7071c
            boolean r0 = r0.mo7265f(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            c4.d r0 = r3.f7072d
            if (r0 != 0) goto L_0x0023
            c4.d r4 = r4.f7072d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            c4.d r0 = r3.f7072d
            c4.d r4 = r4.f7072d
            boolean r4 = r0.mo7265f(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p035c4.C2260k.mo7265f(c4.d):boolean");
    }

    /* renamed from: g */
    public boolean mo7266g() {
        boolean z;
        synchronized (this.f7070b) {
            if (this.f7073e == C2251e.C2252a.CLEARED) {
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
        synchronized (this.f7070b) {
            if (!m8709m() || !dVar.equals(this.f7071c) || this.f7073e == C2251e.C2252a.PAUSED) {
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
        synchronized (this.f7070b) {
            if (this.f7073e == C2251e.C2252a.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f7070b) {
            if (this.f7073e == C2251e.C2252a.RUNNING) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo7270j(C2250d dVar) {
        boolean z;
        synchronized (this.f7070b) {
            if (!m8711o() || (!dVar.equals(this.f7071c) && this.f7073e == C2251e.C2252a.SUCCESS)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7271k(p035c4.C2250d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f7070b
            monitor-enter(r0)
            c4.d r1 = r2.f7072d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0011
            c4.e$a r3 = p035c4.C2251e.C2252a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f7074f = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            c4.e$a r3 = p035c4.C2251e.C2252a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f7073e = r3     // Catch:{ all -> 0x002b }
            c4.e r3 = r2.f7069a     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x001c
            r3.mo7271k(r2)     // Catch:{ all -> 0x002b }
        L_0x001c:
            c4.e$a r3 = r2.f7074f     // Catch:{ all -> 0x002b }
            boolean r3 = r3.mo7274a()     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0029
            c4.d r3 = r2.f7072d     // Catch:{ all -> 0x002b }
            r3.clear()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p035c4.C2260k.mo7271k(c4.d):void");
    }

    /* renamed from: l */
    public void mo7272l() {
        C2251e.C2252a aVar;
        C2251e.C2252a aVar2;
        synchronized (this.f7070b) {
            this.f7075g = true;
            try {
                if (!(this.f7073e == C2251e.C2252a.SUCCESS || this.f7074f == (aVar2 = C2251e.C2252a.RUNNING))) {
                    this.f7074f = aVar2;
                    this.f7072d.mo7272l();
                }
                if (this.f7075g && this.f7073e != (aVar = C2251e.C2252a.RUNNING)) {
                    this.f7073e = aVar;
                    this.f7071c.mo7272l();
                }
            } finally {
                this.f7075g = false;
            }
        }
    }

    /* renamed from: p */
    public void mo7301p(C2250d dVar, C2250d dVar2) {
        this.f7071c = dVar;
        this.f7072d = dVar2;
    }
}
