package p227r;

import p214q.C7803d;
import p214q.C7806e;

/* renamed from: r.p */
public abstract class C8026p implements C8010d {

    /* renamed from: a */
    public int f23151a;

    /* renamed from: b */
    C7806e f23152b;

    /* renamed from: c */
    C8021m f23153c;

    /* renamed from: d */
    protected C7806e.C7808b f23154d;

    /* renamed from: e */
    C8014g f23155e = new C8014g(this);

    /* renamed from: f */
    public int f23156f = 0;

    /* renamed from: g */
    boolean f23157g = false;

    /* renamed from: h */
    public C8012f f23158h = new C8012f(this);

    /* renamed from: i */
    public C8012f f23159i = new C8012f(this);

    /* renamed from: j */
    protected C8028b f23160j = C8028b.NONE;

    /* renamed from: r.p$a */
    static /* synthetic */ class C8027a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23161a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                q.d$b[] r0 = p214q.C7803d.C7805b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23161a = r0
                q.d$b r1 = p214q.C7803d.C7805b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23161a     // Catch:{ NoSuchFieldError -> 0x001d }
                q.d$b r1 = p214q.C7803d.C7805b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23161a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q.d$b r1 = p214q.C7803d.C7805b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23161a     // Catch:{ NoSuchFieldError -> 0x0033 }
                q.d$b r1 = p214q.C7803d.C7805b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23161a     // Catch:{ NoSuchFieldError -> 0x003e }
                q.d$b r1 = p214q.C7803d.C7805b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p227r.C8026p.C8027a.<clinit>():void");
        }
    }

    /* renamed from: r.p$b */
    enum C8028b {
        NONE,
        START,
        END,
        CENTER
    }

    public C8026p(C7806e eVar) {
        this.f23152b = eVar;
    }

    /* renamed from: l */
    private void m30491l(int i, int i2) {
        C8026p pVar;
        float f;
        int i3;
        int i4 = this.f23151a;
        if (i4 == 0) {
            this.f23155e.mo23177d(mo23196g(i2, i));
        } else if (i4 == 1) {
            this.f23155e.mo23177d(Math.min(mo23196g(this.f23155e.f23119m, i), i2));
        } else if (i4 == 2) {
            C7806e I = this.f23152b.mo22605I();
            if (I != null) {
                if (i == 0) {
                    pVar = I.f22620e;
                } else {
                    pVar = I.f22622f;
                }
                C8014g gVar = pVar.f23155e;
                if (gVar.f23107j) {
                    C7806e eVar = this.f23152b;
                    if (i == 0) {
                        f = eVar.f22578B;
                    } else {
                        f = eVar.f22584E;
                    }
                    this.f23155e.mo23177d(mo23196g((int) ((((float) gVar.f23104g) * f) + 0.5f), i));
                }
            }
        } else if (i4 == 3) {
            C7806e eVar2 = this.f23152b;
            C8026p pVar2 = eVar2.f22620e;
            C7806e.C7808b bVar = pVar2.f23154d;
            C7806e.C7808b bVar2 = C7806e.C7808b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && pVar2.f23151a == 3) {
                C8022n nVar = eVar2.f22622f;
                if (nVar.f23154d == bVar2 && nVar.f23151a == 3) {
                    return;
                }
            }
            if (i == 0) {
                pVar2 = eVar2.f22622f;
            }
            if (pVar2.f23155e.f23107j) {
                float t = eVar2.mo22680t();
                if (i == 1) {
                    i3 = (int) ((((float) pVar2.f23155e.f23104g) / t) + 0.5f);
                } else {
                    i3 = (int) ((t * ((float) pVar2.f23155e.f23104g)) + 0.5f);
                }
                this.f23155e.mo23177d(i3);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo23159a(C8010d dVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23194b(C8012f fVar, C8012f fVar2, int i) {
        fVar.f23109l.add(fVar2);
        fVar.f23103f = i;
        fVar2.f23108k.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo23195c(C8012f fVar, C8012f fVar2, int i, C8014g gVar) {
        fVar.f23109l.add(fVar2);
        fVar.f23109l.add(this.f23155e);
        fVar.f23105h = i;
        fVar.f23106i = gVar;
        fVar2.f23108k.add(fVar);
        gVar.f23108k.add(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo23160d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo23161e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo23162f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo23196g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            C7806e eVar = this.f23152b;
            int i4 = eVar.f22576A;
            i3 = Math.max(eVar.f22662z, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            C7806e eVar2 = this.f23152b;
            int i5 = eVar2.f22582D;
            int max = Math.max(eVar2.f22580C, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C8012f mo23197h(C7803d dVar) {
        C7803d dVar2 = dVar.f22560f;
        if (dVar2 == null) {
            return null;
        }
        C7806e eVar = dVar2.f22558d;
        int i = C8027a.f23161a[dVar2.f22559e.ordinal()];
        if (i == 1) {
            return eVar.f22620e.f23158h;
        }
        if (i == 2) {
            return eVar.f22620e.f23159i;
        }
        if (i == 3) {
            return eVar.f22622f.f23158h;
        }
        if (i == 4) {
            return eVar.f22622f.f23133k;
        }
        if (i != 5) {
            return null;
        }
        return eVar.f22622f.f23159i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C8012f mo23198i(C7803d dVar, int i) {
        C8026p pVar;
        C7803d dVar2 = dVar.f22560f;
        if (dVar2 == null) {
            return null;
        }
        C7806e eVar = dVar2.f22558d;
        if (i == 0) {
            pVar = eVar.f22620e;
        } else {
            pVar = eVar.f22622f;
        }
        int i2 = C8027a.f23161a[dVar2.f22559e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f23159i;
        }
        return pVar.f23158h;
    }

    /* renamed from: j */
    public long mo23163j() {
        C8014g gVar = this.f23155e;
        if (gVar.f23107j) {
            return (long) gVar.f23104g;
        }
        return 0;
    }

    /* renamed from: k */
    public boolean mo23199k() {
        return this.f23157g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract boolean mo23164m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo23200n(C8010d dVar, C7803d dVar2, C7803d dVar3, int i) {
        float f;
        C8012f h = mo23197h(dVar2);
        C8012f h2 = mo23197h(dVar3);
        if (h.f23107j && h2.f23107j) {
            int e = h.f23104g + dVar2.mo22573e();
            int e2 = h2.f23104g - dVar3.mo22573e();
            int i2 = e2 - e;
            if (!this.f23155e.f23107j && this.f23154d == C7806e.C7808b.MATCH_CONSTRAINT) {
                m30491l(i, i2);
            }
            C8014g gVar = this.f23155e;
            if (gVar.f23107j) {
                if (gVar.f23104g == i2) {
                    this.f23158h.mo23177d(e);
                    this.f23159i.mo23177d(e2);
                    return;
                }
                C7806e eVar = this.f23152b;
                if (i == 0) {
                    f = eVar.mo22684w();
                } else {
                    f = eVar.mo22617P();
                }
                if (h == h2) {
                    e = h.f23104g;
                    e2 = h2.f23104g;
                    f = 0.5f;
                }
                this.f23158h.mo23177d((int) (((float) e) + 0.5f + (((float) ((e2 - e) - this.f23155e.f23104g)) * f)));
                this.f23159i.mo23177d(this.f23158h.f23104g + this.f23155e.f23104g);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo23201o(C8010d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo23202p(C8010d dVar) {
    }
}
