package p227r;

import p214q.C7806e;
import p214q.C7810g;

/* renamed from: r.j */
class C8017j extends C8026p {
    public C8017j(C7806e eVar) {
        super(eVar);
        eVar.f22620e.mo23162f();
        eVar.f22622f.mo23162f();
        this.f23156f = ((C7810g) eVar).mo22719o1();
    }

    /* renamed from: q */
    private void m30452q(C8012f fVar) {
        this.f23158h.f23108k.add(fVar);
        fVar.f23109l.add(this.f23158h);
    }

    /* renamed from: a */
    public void mo23159a(C8010d dVar) {
        C8012f fVar = this.f23158h;
        if (fVar.f23100c && !fVar.f23107j) {
            this.f23158h.mo23177d((int) ((((float) ((C8012f) fVar.f23109l.get(0)).f23104g) * ((C7810g) this.f23152b).mo22722r1()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo23160d() {
        C7810g gVar = (C7810g) this.f23152b;
        int p1 = gVar.mo22720p1();
        int q1 = gVar.mo22721q1();
        gVar.mo22722r1();
        if (gVar.mo22719o1() == 1) {
            if (p1 != -1) {
                this.f23158h.f23109l.add(this.f23152b.f22613a0.f22620e.f23158h);
                this.f23152b.f22613a0.f22620e.f23158h.f23108k.add(this.f23158h);
                this.f23158h.f23103f = p1;
            } else if (q1 != -1) {
                this.f23158h.f23109l.add(this.f23152b.f22613a0.f22620e.f23159i);
                this.f23152b.f22613a0.f22620e.f23159i.f23108k.add(this.f23158h);
                this.f23158h.f23103f = -q1;
            } else {
                C8012f fVar = this.f23158h;
                fVar.f23099b = true;
                fVar.f23109l.add(this.f23152b.f22613a0.f22620e.f23159i);
                this.f23152b.f22613a0.f22620e.f23159i.f23108k.add(this.f23158h);
            }
            m30452q(this.f23152b.f22620e.f23158h);
            m30452q(this.f23152b.f22620e.f23159i);
            return;
        }
        if (p1 != -1) {
            this.f23158h.f23109l.add(this.f23152b.f22613a0.f22622f.f23158h);
            this.f23152b.f22613a0.f22622f.f23158h.f23108k.add(this.f23158h);
            this.f23158h.f23103f = p1;
        } else if (q1 != -1) {
            this.f23158h.f23109l.add(this.f23152b.f22613a0.f22622f.f23159i);
            this.f23152b.f22613a0.f22622f.f23159i.f23108k.add(this.f23158h);
            this.f23158h.f23103f = -q1;
        } else {
            C8012f fVar2 = this.f23158h;
            fVar2.f23099b = true;
            fVar2.f23109l.add(this.f23152b.f22613a0.f22622f.f23159i);
            this.f23152b.f22613a0.f22622f.f23159i.f23108k.add(this.f23158h);
        }
        m30452q(this.f23152b.f22622f.f23158h);
        m30452q(this.f23152b.f22622f.f23159i);
    }

    /* renamed from: e */
    public void mo23161e() {
        if (((C7810g) this.f23152b).mo22719o1() == 1) {
            this.f23152b.mo22657i1(this.f23158h.f23104g);
        } else {
            this.f23152b.mo22660j1(this.f23158h.f23104g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo23162f() {
        this.f23158h.mo23176c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo23164m() {
        return false;
    }
}
