package p227r;

import p214q.C7800a;
import p214q.C7806e;
import p227r.C8012f;

/* renamed from: r.k */
class C8018k extends C8026p {
    public C8018k(C7806e eVar) {
        super(eVar);
    }

    /* renamed from: q */
    private void m30458q(C8012f fVar) {
        this.f23158h.f23108k.add(fVar);
        fVar.f23109l.add(this.f23158h);
    }

    /* renamed from: a */
    public void mo23159a(C8010d dVar) {
        C7800a aVar = (C7800a) this.f23152b;
        int r1 = aVar.mo22560r1();
        int i = 0;
        int i2 = -1;
        for (C8012f fVar : this.f23158h.f23109l) {
            int i3 = fVar.f23104g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (r1 == 0 || r1 == 2) {
            this.f23158h.mo23177d(i2 + aVar.mo22561s1());
        } else {
            this.f23158h.mo23177d(i + aVar.mo22561s1());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo23160d() {
        C7806e eVar = this.f23152b;
        if (eVar instanceof C7800a) {
            this.f23158h.f23099b = true;
            C7800a aVar = (C7800a) eVar;
            int r1 = aVar.mo22560r1();
            boolean q1 = aVar.mo22559q1();
            int i = 0;
            if (r1 == 0) {
                this.f23158h.f23102e = C8012f.C8013a.LEFT;
                while (i < aVar.f22711M0) {
                    C7806e eVar2 = aVar.f22710L0[i];
                    if (q1 || eVar2.mo22625T() != 8) {
                        C8012f fVar = eVar2.f22620e.f23158h;
                        fVar.f23108k.add(this.f23158h);
                        this.f23158h.f23109l.add(fVar);
                    }
                    i++;
                }
                m30458q(this.f23152b.f22620e.f23158h);
                m30458q(this.f23152b.f22620e.f23159i);
            } else if (r1 == 1) {
                this.f23158h.f23102e = C8012f.C8013a.RIGHT;
                while (i < aVar.f22711M0) {
                    C7806e eVar3 = aVar.f22710L0[i];
                    if (q1 || eVar3.mo22625T() != 8) {
                        C8012f fVar2 = eVar3.f22620e.f23159i;
                        fVar2.f23108k.add(this.f23158h);
                        this.f23158h.f23109l.add(fVar2);
                    }
                    i++;
                }
                m30458q(this.f23152b.f22620e.f23158h);
                m30458q(this.f23152b.f22620e.f23159i);
            } else if (r1 == 2) {
                this.f23158h.f23102e = C8012f.C8013a.TOP;
                while (i < aVar.f22711M0) {
                    C7806e eVar4 = aVar.f22710L0[i];
                    if (q1 || eVar4.mo22625T() != 8) {
                        C8012f fVar3 = eVar4.f22622f.f23158h;
                        fVar3.f23108k.add(this.f23158h);
                        this.f23158h.f23109l.add(fVar3);
                    }
                    i++;
                }
                m30458q(this.f23152b.f22622f.f23158h);
                m30458q(this.f23152b.f22622f.f23159i);
            } else if (r1 == 3) {
                this.f23158h.f23102e = C8012f.C8013a.BOTTOM;
                while (i < aVar.f22711M0) {
                    C7806e eVar5 = aVar.f22710L0[i];
                    if (q1 || eVar5.mo22625T() != 8) {
                        C8012f fVar4 = eVar5.f22622f.f23159i;
                        fVar4.f23108k.add(this.f23158h);
                        this.f23158h.f23109l.add(fVar4);
                    }
                    i++;
                }
                m30458q(this.f23152b.f22622f.f23158h);
                m30458q(this.f23152b.f22622f.f23159i);
            }
        }
    }

    /* renamed from: e */
    public void mo23161e() {
        C7806e eVar = this.f23152b;
        if (eVar instanceof C7800a) {
            int r1 = ((C7800a) eVar).mo22560r1();
            if (r1 == 0 || r1 == 1) {
                this.f23152b.mo22657i1(this.f23158h.f23104g);
            } else {
                this.f23152b.mo22660j1(this.f23158h.f23104g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo23162f() {
        this.f23153c = null;
        this.f23158h.mo23176c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo23164m() {
        return false;
    }
}
