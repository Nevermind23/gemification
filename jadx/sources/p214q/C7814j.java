package p214q;

import p175n.C7174d;
import p214q.C7806e;

/* renamed from: q.j */
public abstract class C7814j {

    /* renamed from: a */
    static boolean[] f22712a = new boolean[3];

    /* renamed from: a */
    static void m29726a(C7809f fVar, C7174d dVar, C7806e eVar) {
        eVar.f22650t = -1;
        eVar.f22652u = -1;
        C7806e.C7808b bVar = fVar.f22611Z[0];
        C7806e.C7808b bVar2 = C7806e.C7808b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f22611Z[0] == C7806e.C7808b.MATCH_PARENT) {
            int i = eVar.f22600O.f22561g;
            int U = fVar.mo22627U() - eVar.f22602Q.f22561g;
            C7803d dVar2 = eVar.f22600O;
            dVar2.f22563i = dVar.mo21489q(dVar2);
            C7803d dVar3 = eVar.f22602Q;
            dVar3.f22563i = dVar.mo21489q(dVar3);
            dVar.mo21480f(eVar.f22600O.f22563i, i);
            dVar.mo21480f(eVar.f22602Q.f22563i, U);
            eVar.f22650t = 2;
            eVar.mo22612L0(i, U);
        }
        if (fVar.f22611Z[1] != bVar2 && eVar.f22611Z[1] == C7806e.C7808b.MATCH_PARENT) {
            int i2 = eVar.f22601P.f22561g;
            int v = fVar.mo22683v() - eVar.f22603R.f22561g;
            C7803d dVar4 = eVar.f22601P;
            dVar4.f22563i = dVar.mo21489q(dVar4);
            C7803d dVar5 = eVar.f22603R;
            dVar5.f22563i = dVar.mo21489q(dVar5);
            dVar.mo21480f(eVar.f22601P.f22563i, i2);
            dVar.mo21480f(eVar.f22603R.f22563i, v);
            if (eVar.f22635l0 > 0 || eVar.mo22625T() == 8) {
                C7803d dVar6 = eVar.f22604S;
                dVar6.f22563i = dVar.mo21489q(dVar6);
                dVar.mo21480f(eVar.f22604S.f22563i, eVar.f22635l0 + i2);
            }
            eVar.f22652u = 2;
            eVar.mo22642b1(i2, v);
        }
    }

    /* renamed from: b */
    public static final boolean m29727b(int i, int i2) {
        return (i & i2) == i2;
    }
}
