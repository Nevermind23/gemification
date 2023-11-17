package androidx.work.impl;

import android.content.Context;
import androidx.work.C1950b;
import androidx.work.C2073m;
import androidx.work.impl.background.systemjob.C1998l;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import p190o1.C7399v;
import p190o1.C7402w;
import p203p1.C7654r;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: androidx.work.impl.u */
public abstract class C2046u {

    /* renamed from: a */
    private static final String f6158a = C2073m.m8073i("Schedulers");

    /* renamed from: a */
    static C2045t m7980a(Context context, C2007e0 e0Var) {
        C1998l lVar = new C1998l(context, e0Var);
        C7654r.m29095a(context, SystemJobService.class, true);
        C2073m.m8071e().mo6959a(f6158a, "Created SystemJobScheduler and enabled SystemJobService");
        return lVar;
    }

    /* renamed from: b */
    public static void m7981b(C1950b bVar, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            C7402w N = workDatabase.mo6751N();
            workDatabase.mo23807e();
            try {
                List<C7399v> q = N.mo21816q(bVar.mo6698h());
                List m = N.mo21812m(BogInputLayout.INPUT_NORMAL_STATE);
                if (q != null && q.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (C7399v vVar : q) {
                        N.mo21814o(vVar.f21630a, currentTimeMillis);
                    }
                }
                workDatabase.mo23804F();
                if (q != null && q.size() > 0) {
                    C7399v[] vVarArr = (C7399v[]) q.toArray(new C7399v[q.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C2045t tVar = (C2045t) it.next();
                        if (tVar.mo6805e()) {
                            tVar.mo6803a(vVarArr);
                        }
                    }
                }
                if (m != null && m.size() > 0) {
                    C7399v[] vVarArr2 = (C7399v[]) m.toArray(new C7399v[m.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C2045t tVar2 = (C2045t) it2.next();
                        if (!tVar2.mo6805e()) {
                            tVar2.mo6803a(vVarArr2);
                        }
                    }
                }
            } finally {
                workDatabase.mo23809i();
            }
        }
    }
}
