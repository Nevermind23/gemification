package p342j$.util.stream;

import p342j$.util.C9371P;
import p342j$.util.function.C9431J;

/* renamed from: j$.util.stream.c */
abstract class C9634c extends C9735w0 implements C9664i {

    /* renamed from: h */
    private final C9634c f26349h;

    /* renamed from: i */
    private final C9634c f26350i;

    /* renamed from: j */
    protected final int f26351j;

    /* renamed from: k */
    private C9634c f26352k;

    /* renamed from: l */
    private int f26353l;

    /* renamed from: m */
    private int f26354m;

    /* renamed from: n */
    private C9371P f26355n;

    /* renamed from: o */
    private boolean f26356o;

    /* renamed from: p */
    private boolean f26357p;

    /* renamed from: q */
    private Runnable f26358q;

    /* renamed from: r */
    private boolean f26359r;

    static {
        Class<C9634c> cls = C9634c.class;
    }

    C9634c(C9371P p, int i, boolean z) {
        this.f26350i = null;
        this.f26355n = p;
        this.f26349h = this;
        int i2 = C9607V2.f26299g & i;
        this.f26351j = i2;
        this.f26354m = (~(i2 << 1)) & C9607V2.f26304l;
        this.f26353l = 0;
        this.f26359r = z;
    }

    C9634c(C9634c cVar, int i) {
        if (!cVar.f26356o) {
            cVar.f26356o = true;
            cVar.f26352k = this;
            this.f26350i = cVar;
            this.f26351j = C9607V2.f26300h & i;
            this.f26354m = C9607V2.m35302a(i, cVar.f26354m);
            C9634c cVar2 = cVar.f26349h;
            this.f26349h = cVar2;
            if (mo25676J1()) {
                cVar2.f26357p = true;
            }
            this.f26353l = cVar.f26353l + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* renamed from: L1 */
    private C9371P m35410L1(int i) {
        int i2;
        int i3;
        C9634c cVar = this.f26349h;
        C9371P p = cVar.f26355n;
        if (p != null) {
            cVar.f26355n = null;
            if (cVar.f26359r && cVar.f26357p) {
                C9634c cVar2 = cVar.f26352k;
                int i4 = 1;
                while (cVar != this) {
                    int i5 = cVar2.f26351j;
                    if (cVar2.mo25676J1()) {
                        if (C9607V2.SHORT_CIRCUIT.mo26013f(i5)) {
                            i5 &= ~C9607V2.f26313u;
                        }
                        p = cVar2.mo26029I1(cVar, p);
                        if (p.hasCharacteristics(64)) {
                            i3 = (~C9607V2.f26312t) & i5;
                            i2 = C9607V2.f26311s;
                        } else {
                            i3 = (~C9607V2.f26311s) & i5;
                            i2 = C9607V2.f26312t;
                        }
                        i5 = i2 | i3;
                        i4 = 0;
                    }
                    cVar2.f26353l = i4;
                    cVar2.f26354m = C9607V2.m35302a(i5, cVar.f26354m);
                    i4++;
                    C9634c cVar3 = cVar2;
                    cVar2 = cVar2.f26352k;
                    cVar = cVar3;
                }
            }
            if (i != 0) {
                this.f26354m = C9607V2.m35302a(i, this.f26354m);
            }
            return p;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A1 */
    public final C9539F0 mo26025A1(C9431J j) {
        if (!this.f26356o) {
            this.f26356o = true;
            if (!this.f26349h.f26359r || this.f26350i == null || !mo25676J1()) {
                return mo26039y1(m35410L1(0), true, j);
            }
            this.f26353l = 0;
            C9634c cVar = this.f26350i;
            return mo25684H1(cVar.m35410L1(0), j, cVar);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public abstract C9539F0 mo25705B1(C9735w0 w0Var, C9371P p, boolean z, C9431J j);

    /* access modifiers changed from: package-private */
    /* renamed from: C1 */
    public abstract void mo25707C1(C9371P p, C9657g2 g2Var);

    /* access modifiers changed from: package-private */
    /* renamed from: D1 */
    public abstract C9611W2 mo25708D1();

    /* access modifiers changed from: package-private */
    /* renamed from: E1 */
    public final C9611W2 mo26026E1() {
        C9634c cVar = this;
        while (cVar.f26353l > 0) {
            cVar = cVar.f26350i;
        }
        return cVar.mo25708D1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F1 */
    public final boolean mo26027F1() {
        return C9607V2.ORDERED.mo26013f(this.f26354m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G1 */
    public final /* synthetic */ C9371P mo26028G1() {
        return m35410L1(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H1 */
    public C9539F0 mo25684H1(C9371P p, C9431J j, C9634c cVar) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I1 */
    public C9371P mo26029I1(C9634c cVar, C9371P p) {
        return mo25684H1(p, new C9629b(0), cVar).spliterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J1 */
    public abstract boolean mo25676J1();

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public abstract C9657g2 mo25677K1(int i, C9657g2 g2Var);

    /* access modifiers changed from: package-private */
    /* renamed from: M1 */
    public final C9371P mo26030M1() {
        C9634c cVar = this.f26349h;
        if (this != cVar) {
            throw new IllegalStateException();
        } else if (!this.f26356o) {
            this.f26356o = true;
            C9371P p = cVar.f26355n;
            if (p != null) {
                cVar.f26355n = null;
                return p;
            }
            throw new IllegalStateException("source already consumed or closed");
        } else {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public abstract C9371P mo25712N1(C9735w0 w0Var, C9624a aVar, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public final C9371P mo26031O1(C9371P p) {
        return this.f26353l == 0 ? p : mo25712N1(this, new C9624a(p, 0), this.f26349h.f26359r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public final void mo26032V0(C9371P p, C9657g2 g2Var) {
        g2Var.getClass();
        if (!C9607V2.SHORT_CIRCUIT.mo26013f(this.f26354m)) {
            g2Var.mo25695p(p.getExactSizeIfKnown());
            p.mo25169a(g2Var);
            g2Var.mo25694o();
            return;
        }
        mo26033W0(p, g2Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public final void mo26033W0(C9371P p, C9657g2 g2Var) {
        C9634c cVar = this;
        while (cVar.f26353l > 0) {
            cVar = cVar.f26350i;
        }
        g2Var.mo25695p(p.getExactSizeIfKnown());
        cVar.mo25707C1(p, g2Var);
        g2Var.mo25694o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a1 */
    public final long mo26034a1(C9371P p) {
        if (C9607V2.SIZED.mo26013f(this.f26354m)) {
            return p.getExactSizeIfKnown();
        }
        return -1;
    }

    public final void close() {
        this.f26356o = true;
        this.f26355n = null;
        C9634c cVar = this.f26349h;
        Runnable runnable = cVar.f26358q;
        if (runnable != null) {
            cVar.f26358q = null;
            runnable.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public final int mo26036g1() {
        return this.f26354m;
    }

    public final boolean isParallel() {
        return this.f26349h.f26359r;
    }

    public final C9664i onClose(Runnable runnable) {
        C9634c cVar = this.f26349h;
        Runnable runnable2 = cVar.f26358q;
        if (runnable2 != null) {
            runnable = new C9532D3(runnable2, runnable);
        }
        cVar.f26358q = runnable;
        return this;
    }

    public final C9664i parallel() {
        this.f26349h.f26359r = true;
        return this;
    }

    public final C9664i sequential() {
        this.f26349h.f26359r = false;
        return this;
    }

    public C9371P spliterator() {
        if (!this.f26356o) {
            this.f26356o = true;
            C9634c cVar = this.f26349h;
            if (this != cVar) {
                return mo25712N1(this, new C9624a(this, 1), cVar.f26359r);
            }
            C9371P p = cVar.f26355n;
            if (p != null) {
                cVar.f26355n = null;
                return p;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w1 */
    public final C9657g2 mo26037w1(C9371P p, C9657g2 g2Var) {
        g2Var.getClass();
        mo26032V0(p, mo26038x1(g2Var));
        return g2Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public final C9657g2 mo26038x1(C9657g2 g2Var) {
        g2Var.getClass();
        for (C9634c cVar = this; cVar.f26353l > 0; cVar = cVar.f26350i) {
            g2Var = cVar.mo25677K1(cVar.f26350i.f26354m, g2Var);
        }
        return g2Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y1 */
    public final C9539F0 mo26039y1(C9371P p, boolean z, C9431J j) {
        if (this.f26349h.f26359r) {
            return mo25705B1(this, p, z, j);
        }
        C9514A0 r1 = mo25730r1(mo26034a1(p), j);
        mo26037w1(p, r1);
        return r1.mo25682b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z1 */
    public final Object mo26040z1(C9537E3 e3) {
        if (!this.f26356o) {
            this.f26356o = true;
            return this.f26349h.f26359r ? e3.mo25752X(this, m35410L1(e3.mo25754u())) : e3.mo25753n0(this, m35410L1(e3.mo25754u()));
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }
}
