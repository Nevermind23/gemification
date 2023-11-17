package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p */
public final class C4341p extends C4239j {

    /* renamed from: f */
    protected final List f13569f;

    /* renamed from: g */
    protected final List f13570g;

    /* renamed from: h */
    protected C4363q4 f13571h;

    private C4341p(C4341p pVar) {
        super(pVar.f13359d);
        ArrayList arrayList = new ArrayList(pVar.f13569f.size());
        this.f13569f = arrayList;
        arrayList.addAll(pVar.f13569f);
        ArrayList arrayList2 = new ArrayList(pVar.f13570g.size());
        this.f13570g = arrayList2;
        arrayList2.addAll(pVar.f13570g);
        this.f13571h = pVar.f13571h;
    }

    /* renamed from: a */
    public final C4358q mo13126a(C4363q4 q4Var, List list) {
        C4363q4 a = this.f13571h.mo13483a();
        for (int i = 0; i < this.f13569f.size(); i++) {
            if (i < list.size()) {
                a.mo13487e((String) this.f13569f.get(i), q4Var.mo13484b((C4358q) list.get(i)));
            } else {
                a.mo13487e((String) this.f13569f.get(i), C4358q.f13593U2);
            }
        }
        for (C4358q qVar : this.f13570g) {
            C4358q b = a.mo13484b(qVar);
            if (b instanceof C4375r) {
                b = a.mo13484b(qVar);
            }
            if (b instanceof C4205h) {
                return ((C4205h) b).mo13199a();
            }
        }
        return C4358q.f13593U2;
    }

    /* renamed from: b */
    public final C4358q mo13077b() {
        return new C4341p(this);
    }

    public C4341p(String str, List list, List list2, C4363q4 q4Var) {
        super(str);
        this.f13569f = new ArrayList();
        this.f13571h = q4Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f13569f.add(((C4358q) it.next()).mo13078c());
            }
        }
        this.f13570g = new ArrayList(list2);
    }
}
