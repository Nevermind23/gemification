package p227r;

import com.github.mikephil.charting.utils.Utils;
import p214q.C7803d;
import p214q.C7806e;
import p214q.C7812h;
import p227r.C8012f;
import p227r.C8026p;

/* renamed from: r.n */
public class C8022n extends C8026p {

    /* renamed from: k */
    public C8012f f23133k;

    /* renamed from: l */
    C8014g f23134l = null;

    /* renamed from: r.n$a */
    static /* synthetic */ class C8023a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23135a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                r.p$b[] r0 = p227r.C8026p.C8028b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23135a = r0
                r.p$b r1 = p227r.C8026p.C8028b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23135a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.p$b r1 = p227r.C8026p.C8028b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23135a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.p$b r1 = p227r.C8026p.C8028b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p227r.C8022n.C8023a.<clinit>():void");
        }
    }

    public C8022n(C7806e eVar) {
        super(eVar);
        C8012f fVar = new C8012f(this);
        this.f23133k = fVar;
        this.f23158h.f23102e = C8012f.C8013a.TOP;
        this.f23159i.f23102e = C8012f.C8013a.BOTTOM;
        fVar.f23102e = C8012f.C8013a.BASELINE;
        this.f23156f = 1;
    }

    /* renamed from: a */
    public void mo23159a(C8010d dVar) {
        int i;
        float f;
        float f2;
        float f3;
        int i2 = C8023a.f23135a[this.f23160j.ordinal()];
        if (i2 == 1) {
            mo23202p(dVar);
        } else if (i2 == 2) {
            mo23201o(dVar);
        } else if (i2 == 3) {
            C7806e eVar = this.f23152b;
            mo23200n(dVar, eVar.f22601P, eVar.f22603R, 1);
            return;
        }
        C8014g gVar = this.f23155e;
        if (gVar.f23100c && !gVar.f23107j && this.f23154d == C7806e.C7808b.MATCH_CONSTRAINT) {
            C7806e eVar2 = this.f23152b;
            int i3 = eVar2.f22658x;
            if (i3 == 2) {
                C7806e I = eVar2.mo22605I();
                if (I != null) {
                    C8014g gVar2 = I.f22622f.f23155e;
                    if (gVar2.f23107j) {
                        this.f23155e.mo23177d((int) ((((float) gVar2.f23104g) * this.f23152b.f22584E) + 0.5f));
                    }
                }
            } else if (i3 == 3 && eVar2.f22620e.f23155e.f23107j) {
                int u = eVar2.mo22682u();
                if (u == -1) {
                    C7806e eVar3 = this.f23152b;
                    f3 = (float) eVar3.f22620e.f23155e.f23104g;
                    f2 = eVar3.mo22680t();
                } else if (u == 0) {
                    C7806e eVar4 = this.f23152b;
                    f = ((float) eVar4.f22620e.f23155e.f23104g) * eVar4.mo22680t();
                    i = (int) (f + 0.5f);
                    this.f23155e.mo23177d(i);
                } else if (u != 1) {
                    i = 0;
                    this.f23155e.mo23177d(i);
                } else {
                    C7806e eVar5 = this.f23152b;
                    f3 = (float) eVar5.f22620e.f23155e.f23104g;
                    f2 = eVar5.mo22680t();
                }
                f = f3 / f2;
                i = (int) (f + 0.5f);
                this.f23155e.mo23177d(i);
            }
        }
        C8012f fVar = this.f23158h;
        if (fVar.f23100c) {
            C8012f fVar2 = this.f23159i;
            if (fVar2.f23100c) {
                if (!fVar.f23107j || !fVar2.f23107j || !this.f23155e.f23107j) {
                    if (!this.f23155e.f23107j && this.f23154d == C7806e.C7808b.MATCH_CONSTRAINT) {
                        C7806e eVar6 = this.f23152b;
                        if (eVar6.f22656w == 0 && !eVar6.mo22656i0()) {
                            int i4 = ((C8012f) this.f23158h.f23109l.get(0)).f23104g;
                            C8012f fVar3 = this.f23158h;
                            int i5 = i4 + fVar3.f23103f;
                            int i6 = ((C8012f) this.f23159i.f23109l.get(0)).f23104g + this.f23159i.f23103f;
                            fVar3.mo23177d(i5);
                            this.f23159i.mo23177d(i6);
                            this.f23155e.mo23177d(i6 - i5);
                            return;
                        }
                    }
                    if (!this.f23155e.f23107j && this.f23154d == C7806e.C7808b.MATCH_CONSTRAINT && this.f23151a == 1 && this.f23158h.f23109l.size() > 0 && this.f23159i.f23109l.size() > 0) {
                        int i7 = (((C8012f) this.f23159i.f23109l.get(0)).f23104g + this.f23159i.f23103f) - (((C8012f) this.f23158h.f23109l.get(0)).f23104g + this.f23158h.f23103f);
                        C8014g gVar3 = this.f23155e;
                        int i8 = gVar3.f23119m;
                        if (i7 < i8) {
                            gVar3.mo23177d(i7);
                        } else {
                            gVar3.mo23177d(i8);
                        }
                    }
                    if (this.f23155e.f23107j && this.f23158h.f23109l.size() > 0 && this.f23159i.f23109l.size() > 0) {
                        C8012f fVar4 = (C8012f) this.f23158h.f23109l.get(0);
                        C8012f fVar5 = (C8012f) this.f23159i.f23109l.get(0);
                        int i9 = fVar4.f23104g + this.f23158h.f23103f;
                        int i12 = fVar5.f23104g + this.f23159i.f23103f;
                        float P = this.f23152b.mo22617P();
                        if (fVar4 == fVar5) {
                            i9 = fVar4.f23104g;
                            i12 = fVar5.f23104g;
                            P = 0.5f;
                        }
                        this.f23158h.mo23177d((int) (((float) i9) + 0.5f + (((float) ((i12 - i9) - this.f23155e.f23104g)) * P)));
                        this.f23159i.mo23177d(this.f23158h.f23104g + this.f23155e.f23104g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo23160d() {
        C7806e I;
        C7806e I2;
        C7806e eVar = this.f23152b;
        if (eVar.f22612a) {
            this.f23155e.mo23177d(eVar.mo22683v());
        }
        if (!this.f23155e.f23107j) {
            this.f23154d = this.f23152b.mo22621R();
            if (this.f23152b.mo22633X()) {
                this.f23134l = new C8005a(this);
            }
            C7806e.C7808b bVar = this.f23154d;
            if (bVar != C7806e.C7808b.MATCH_CONSTRAINT) {
                if (bVar == C7806e.C7808b.MATCH_PARENT && (I2 = this.f23152b.mo22605I()) != null && I2.mo22621R() == C7806e.C7808b.FIXED) {
                    int v = (I2.mo22683v() - this.f23152b.f22601P.mo22573e()) - this.f23152b.f22603R.mo22573e();
                    mo23194b(this.f23158h, I2.f22622f.f23158h, this.f23152b.f22601P.mo22573e());
                    mo23194b(this.f23159i, I2.f22622f.f23159i, -this.f23152b.f22603R.mo22573e());
                    this.f23155e.mo23177d(v);
                    return;
                } else if (this.f23154d == C7806e.C7808b.FIXED) {
                    this.f23155e.mo23177d(this.f23152b.mo22683v());
                }
            }
        } else if (this.f23154d == C7806e.C7808b.MATCH_PARENT && (I = this.f23152b.mo22605I()) != null && I.mo22621R() == C7806e.C7808b.FIXED) {
            mo23194b(this.f23158h, I.f22622f.f23158h, this.f23152b.f22601P.mo22573e());
            mo23194b(this.f23159i, I.f22622f.f23159i, -this.f23152b.f22603R.mo22573e());
            return;
        }
        C8014g gVar = this.f23155e;
        boolean z = gVar.f23107j;
        if (z) {
            C7806e eVar2 = this.f23152b;
            if (eVar2.f22612a) {
                C7803d[] dVarArr = eVar2.f22608W;
                C7803d dVar = dVarArr[2];
                C7803d dVar2 = dVar.f22560f;
                if (dVar2 != null && dVarArr[3].f22560f != null) {
                    if (eVar2.mo22656i0()) {
                        this.f23158h.f23103f = this.f23152b.f22608W[2].mo22573e();
                        this.f23159i.f23103f = -this.f23152b.f22608W[3].mo22573e();
                    } else {
                        C8012f h = mo23197h(this.f23152b.f22608W[2]);
                        if (h != null) {
                            mo23194b(this.f23158h, h, this.f23152b.f22608W[2].mo22573e());
                        }
                        C8012f h2 = mo23197h(this.f23152b.f22608W[3]);
                        if (h2 != null) {
                            mo23194b(this.f23159i, h2, -this.f23152b.f22608W[3].mo22573e());
                        }
                        this.f23158h.f23099b = true;
                        this.f23159i.f23099b = true;
                    }
                    if (this.f23152b.mo22633X()) {
                        mo23194b(this.f23133k, this.f23158h, this.f23152b.mo22668n());
                        return;
                    }
                    return;
                } else if (dVar2 != null) {
                    C8012f h3 = mo23197h(dVar);
                    if (h3 != null) {
                        mo23194b(this.f23158h, h3, this.f23152b.f22608W[2].mo22573e());
                        mo23194b(this.f23159i, this.f23158h, this.f23155e.f23104g);
                        if (this.f23152b.mo22633X()) {
                            mo23194b(this.f23133k, this.f23158h, this.f23152b.mo22668n());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    C7803d dVar3 = dVarArr[3];
                    if (dVar3.f22560f != null) {
                        C8012f h4 = mo23197h(dVar3);
                        if (h4 != null) {
                            mo23194b(this.f23159i, h4, -this.f23152b.f22608W[3].mo22573e());
                            mo23194b(this.f23158h, this.f23159i, -this.f23155e.f23104g);
                        }
                        if (this.f23152b.mo22633X()) {
                            mo23194b(this.f23133k, this.f23158h, this.f23152b.mo22668n());
                            return;
                        }
                        return;
                    }
                    C7803d dVar4 = dVarArr[4];
                    if (dVar4.f22560f != null) {
                        C8012f h5 = mo23197h(dVar4);
                        if (h5 != null) {
                            mo23194b(this.f23133k, h5, 0);
                            mo23194b(this.f23158h, this.f23133k, -this.f23152b.mo22668n());
                            mo23194b(this.f23159i, this.f23158h, this.f23155e.f23104g);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof C7812h) && eVar2.mo22605I() != null && this.f23152b.mo22666m(C7803d.C7805b.CENTER).f22560f == null) {
                        mo23194b(this.f23158h, this.f23152b.mo22605I().f22622f.f23158h, this.f23152b.mo22631W());
                        mo23194b(this.f23159i, this.f23158h, this.f23155e.f23104g);
                        if (this.f23152b.mo22633X()) {
                            mo23194b(this.f23133k, this.f23158h, this.f23152b.mo22668n());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (z || this.f23154d != C7806e.C7808b.MATCH_CONSTRAINT) {
            gVar.mo23175b(this);
        } else {
            C7806e eVar3 = this.f23152b;
            int i = eVar3.f22658x;
            if (i == 2) {
                C7806e I3 = eVar3.mo22605I();
                if (I3 != null) {
                    C8014g gVar2 = I3.f22622f.f23155e;
                    this.f23155e.f23109l.add(gVar2);
                    gVar2.f23108k.add(this.f23155e);
                    C8014g gVar3 = this.f23155e;
                    gVar3.f23099b = true;
                    gVar3.f23108k.add(this.f23158h);
                    this.f23155e.f23108k.add(this.f23159i);
                }
            } else if (i == 3 && !eVar3.mo22656i0()) {
                C7806e eVar4 = this.f23152b;
                if (eVar4.f22656w != 3) {
                    C8014g gVar4 = eVar4.f22620e.f23155e;
                    this.f23155e.f23109l.add(gVar4);
                    gVar4.f23108k.add(this.f23155e);
                    C8014g gVar5 = this.f23155e;
                    gVar5.f23099b = true;
                    gVar5.f23108k.add(this.f23158h);
                    this.f23155e.f23108k.add(this.f23159i);
                }
            }
        }
        C7806e eVar5 = this.f23152b;
        C7803d[] dVarArr2 = eVar5.f22608W;
        C7803d dVar5 = dVarArr2[2];
        C7803d dVar6 = dVar5.f22560f;
        if (dVar6 != null && dVarArr2[3].f22560f != null) {
            if (eVar5.mo22656i0()) {
                this.f23158h.f23103f = this.f23152b.f22608W[2].mo22573e();
                this.f23159i.f23103f = -this.f23152b.f22608W[3].mo22573e();
            } else {
                C8012f h6 = mo23197h(this.f23152b.f22608W[2]);
                C8012f h7 = mo23197h(this.f23152b.f22608W[3]);
                if (h6 != null) {
                    h6.mo23175b(this);
                }
                if (h7 != null) {
                    h7.mo23175b(this);
                }
                this.f23160j = C8026p.C8028b.CENTER;
            }
            if (this.f23152b.mo22633X()) {
                mo23195c(this.f23133k, this.f23158h, 1, this.f23134l);
            }
        } else if (dVar6 != null) {
            C8012f h8 = mo23197h(dVar5);
            if (h8 != null) {
                mo23194b(this.f23158h, h8, this.f23152b.f22608W[2].mo22573e());
                mo23195c(this.f23159i, this.f23158h, 1, this.f23155e);
                if (this.f23152b.mo22633X()) {
                    mo23195c(this.f23133k, this.f23158h, 1, this.f23134l);
                }
                C7806e.C7808b bVar2 = this.f23154d;
                C7806e.C7808b bVar3 = C7806e.C7808b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f23152b.mo22680t() > Utils.FLOAT_EPSILON) {
                    C8019l lVar = this.f23152b.f22620e;
                    if (lVar.f23154d == bVar3) {
                        lVar.f23155e.f23108k.add(this.f23155e);
                        this.f23155e.f23109l.add(this.f23152b.f22620e.f23155e);
                        this.f23155e.f23098a = this;
                    }
                }
            }
        } else {
            C7803d dVar7 = dVarArr2[3];
            if (dVar7.f22560f != null) {
                C8012f h9 = mo23197h(dVar7);
                if (h9 != null) {
                    mo23194b(this.f23159i, h9, -this.f23152b.f22608W[3].mo22573e());
                    mo23195c(this.f23158h, this.f23159i, -1, this.f23155e);
                    if (this.f23152b.mo22633X()) {
                        mo23195c(this.f23133k, this.f23158h, 1, this.f23134l);
                    }
                }
            } else {
                C7803d dVar8 = dVarArr2[4];
                if (dVar8.f22560f != null) {
                    C8012f h12 = mo23197h(dVar8);
                    if (h12 != null) {
                        mo23194b(this.f23133k, h12, 0);
                        mo23195c(this.f23158h, this.f23133k, -1, this.f23134l);
                        mo23195c(this.f23159i, this.f23158h, 1, this.f23155e);
                    }
                } else if (!(eVar5 instanceof C7812h) && eVar5.mo22605I() != null) {
                    mo23194b(this.f23158h, this.f23152b.mo22605I().f22622f.f23158h, this.f23152b.mo22631W());
                    mo23195c(this.f23159i, this.f23158h, 1, this.f23155e);
                    if (this.f23152b.mo22633X()) {
                        mo23195c(this.f23133k, this.f23158h, 1, this.f23134l);
                    }
                    C7806e.C7808b bVar4 = this.f23154d;
                    C7806e.C7808b bVar5 = C7806e.C7808b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f23152b.mo22680t() > Utils.FLOAT_EPSILON) {
                        C8019l lVar2 = this.f23152b.f22620e;
                        if (lVar2.f23154d == bVar5) {
                            lVar2.f23155e.f23108k.add(this.f23155e);
                            this.f23155e.f23109l.add(this.f23152b.f22620e.f23155e);
                            this.f23155e.f23098a = this;
                        }
                    }
                }
            }
        }
        if (this.f23155e.f23109l.size() == 0) {
            this.f23155e.f23100c = true;
        }
    }

    /* renamed from: e */
    public void mo23161e() {
        C8012f fVar = this.f23158h;
        if (fVar.f23107j) {
            this.f23152b.mo22660j1(fVar.f23104g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo23162f() {
        this.f23153c = null;
        this.f23158h.mo23176c();
        this.f23159i.mo23176c();
        this.f23133k.mo23176c();
        this.f23155e.mo23176c();
        this.f23157g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo23164m() {
        if (this.f23154d != C7806e.C7808b.MATCH_CONSTRAINT || this.f23152b.f22658x == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo23183q() {
        this.f23157g = false;
        this.f23158h.mo23176c();
        this.f23158h.f23107j = false;
        this.f23159i.mo23176c();
        this.f23159i.f23107j = false;
        this.f23133k.mo23176c();
        this.f23133k.f23107j = false;
        this.f23155e.f23107j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f23152b.mo22676r();
    }
}
