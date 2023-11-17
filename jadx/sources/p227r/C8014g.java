package p227r;

import p227r.C8012f;

/* renamed from: r.g */
class C8014g extends C8012f {

    /* renamed from: m */
    public int f23119m;

    public C8014g(C8026p pVar) {
        super(pVar);
        if (pVar instanceof C8019l) {
            this.f23102e = C8012f.C8013a.HORIZONTAL_DIMENSION;
        } else {
            this.f23102e = C8012f.C8013a.VERTICAL_DIMENSION;
        }
    }

    /* renamed from: d */
    public void mo23177d(int i) {
        if (!this.f23107j) {
            this.f23107j = true;
            this.f23104g = i;
            for (C8010d dVar : this.f23108k) {
                dVar.mo23159a(dVar);
            }
        }
    }
}
