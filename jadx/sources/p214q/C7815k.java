package p214q;

import java.util.ArrayList;
import p175n.C7173c;

/* renamed from: q.k */
public abstract class C7815k extends C7806e {

    /* renamed from: L0 */
    public ArrayList f22713L0 = new ArrayList();

    /* renamed from: a */
    public void mo22733a(C7806e eVar) {
        this.f22713L0.add(eVar);
        if (eVar.mo22605I() != null) {
            ((C7815k) eVar.mo22605I()).mo22735p1(eVar);
        }
        eVar.mo22636Y0(this);
    }

    /* renamed from: n1 */
    public ArrayList mo22734n1() {
        return this.f22713L0;
    }

    /* renamed from: o1 */
    public abstract void mo22712o1();

    /* renamed from: p1 */
    public void mo22735p1(C7806e eVar) {
        this.f22713L0.remove(eVar);
        eVar.mo22677r0();
    }

    /* renamed from: q1 */
    public void mo22736q1() {
        this.f22713L0.clear();
    }

    /* renamed from: r0 */
    public void mo22677r0() {
        this.f22713L0.clear();
        super.mo22677r0();
    }

    /* renamed from: t0 */
    public void mo22681t0(C7173c cVar) {
        super.mo22681t0(cVar);
        int size = this.f22713L0.size();
        for (int i = 0; i < size; i++) {
            ((C7806e) this.f22713L0.get(i)).mo22681t0(cVar);
        }
    }
}
