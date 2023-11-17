package androidx.work.impl;

import androidx.work.C1949a;
import androidx.work.C1950b;
import androidx.work.C1954c;
import androidx.work.C1959e;
import androidx.work.C1962g;
import androidx.work.C2079p;
import androidx.work.C2085q;
import androidx.work.C2093w;
import androidx.work.C2094x;
import androidx.work.C2096y;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p190o1.C7362a0;
import p190o1.C7399v;
import p190o1.C7402w;
import p203p1.C7635d;
import p203p1.C7638e;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: androidx.work.impl.i0 */
public abstract class C2026i0 {

    /* renamed from: androidx.work.impl.i0$a */
    static final class C2027a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C2096y f6088d;

        /* renamed from: e */
        final /* synthetic */ C2007e0 f6089e;

        /* renamed from: f */
        final /* synthetic */ String f6090f;

        /* renamed from: g */
        final /* synthetic */ C2039o f6091g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2027a(C2096y yVar, C2007e0 e0Var, String str, C2039o oVar) {
            super(0);
            this.f6088d = yVar;
            this.f6089e = e0Var;
            this.f6090f = str;
            this.f6091g = oVar;
        }

        public final void invoke() {
            new C7635d(new C2062x(this.f6089e, this.f6090f, C1962g.KEEP, C41339p.m119900e(this.f6088d)), this.f6091g).run();
        }
    }

    /* renamed from: androidx.work.impl.i0$b */
    static final class C2028b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C2028b f6092d = new C2028b();

        C2028b() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(C7399v vVar) {
            C41536l.m120489i(vVar, "spec");
            if (vVar.mo21793j()) {
                return "Periodic";
            }
            return "OneTime";
        }
    }

    /* renamed from: c */
    public static final C2079p m7920c(C2007e0 e0Var, String str, C2096y yVar) {
        C41536l.m120489i(e0Var, "<this>");
        C41536l.m120489i(str, "name");
        C41536l.m120489i(yVar, "workRequest");
        C2039o oVar = new C2039o();
        e0Var.mo6829t().mo22738b().execute(new C2022g0(e0Var, str, oVar, new C2027a(yVar, e0Var, str, oVar), yVar));
        return oVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m7921d(C2007e0 e0Var, String str, C2039o oVar, C43064a aVar, C2096y yVar) {
        String str2 = str;
        C2039o oVar2 = oVar;
        C41536l.m120489i(e0Var, "$this_enqueueUniquelyNamedPeriodic");
        C41536l.m120489i(str2, "$name");
        C41536l.m120489i(oVar2, "$operation");
        C41536l.m120489i(aVar, "$enqueueNew");
        C41536l.m120489i(yVar, "$workRequest");
        C7402w N = e0Var.mo6828s().mo6751N();
        List p = N.mo21815p(str2);
        if (p.size() > 1) {
            m7922e(oVar2, "Can't apply UPDATE policy to the chains of work.");
            return;
        }
        C7399v.C7401b bVar = (C7399v.C7401b) C41358y.m120009Y(p);
        if (bVar == null) {
            aVar.invoke();
            return;
        }
        C7399v i = N.mo21808i(bVar.f21650a);
        if (i == null) {
            oVar2.mo6866a(new C2079p.C2081b.C2082a(new IllegalStateException("WorkSpec with " + bVar.f21650a + ", that matches a name \"" + str2 + "\", wasn't found")));
        } else if (!i.mo21793j()) {
            m7922e(oVar2, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
        } else if (bVar.f21651b == C2093w.CANCELLED) {
            N.mo21800a(bVar.f21650a);
            aVar.invoke();
        } else {
            C7399v e = C7399v.m28151e(yVar.mo6985d(), bVar.f21650a, (C2093w) null, (String) null, (String) null, (C1959e) null, (C1959e) null, 0, 0, 0, (C1954c) null, 0, (C1949a) null, 0, 0, 0, 0, false, (C2085q) null, 0, 0, 1048574, (Object) null);
            try {
                C2042r p2 = e0Var.mo6825p();
                C41536l.m120488h(p2, "processor");
                WorkDatabase s = e0Var.mo6828s();
                C41536l.m120488h(s, "workDatabase");
                C1950b l = e0Var.mo6823l();
                C41536l.m120488h(l, "configuration");
                List q = e0Var.mo6826q();
                C41536l.m120488h(q, "schedulers");
                m7923f(p2, s, l, q, e, yVar.mo6984c());
                oVar2.mo6866a(C2079p.f6230a);
            } catch (Throwable th) {
                oVar2.mo6866a(new C2079p.C2081b.C2082a(th));
            }
        }
    }

    /* renamed from: e */
    private static final void m7922e(C2039o oVar, String str) {
        oVar.mo6866a(new C2079p.C2081b.C2082a(new UnsupportedOperationException(str)));
    }

    /* renamed from: f */
    private static final C2094x.C2095a m7923f(C2042r rVar, WorkDatabase workDatabase, C1950b bVar, List list, C7399v vVar, Set set) {
        String str = vVar.f21630a;
        C7399v i = workDatabase.mo6751N().mo21808i(str);
        if (i == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        } else if (i.f21631b.mo6980b()) {
            return C2094x.C2095a.NOT_APPLIED;
        } else {
            if (!(i.mo21793j() ^ vVar.mo21793j())) {
                boolean k = rVar.mo6872k(str);
                if (!k) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2045t) it.next()).mo6804c(str);
                    }
                }
                workDatabase.mo23803E(new C2024h0(workDatabase, vVar, i, list, str, set, k));
                if (!k) {
                    C2046u.m7981b(bVar, workDatabase, list);
                }
                if (k) {
                    return C2094x.C2095a.APPLIED_FOR_NEXT_RUN;
                }
                return C2094x.C2095a.APPLIED_IMMEDIATELY;
            }
            C2028b bVar2 = C2028b.f6092d;
            throw new UnsupportedOperationException("Can't update " + ((String) bVar2.invoke(i)) + " Worker to " + ((String) bVar2.invoke(vVar)) + " Worker. Update operation must preserve worker's type.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m7924g(WorkDatabase workDatabase, C7399v vVar, C7399v vVar2, List list, String str, Set set, boolean z) {
        C7399v vVar3 = vVar2;
        List list2 = list;
        String str2 = str;
        Set set2 = set;
        C41536l.m120489i(workDatabase, "$workDatabase");
        C41536l.m120489i(vVar, "$newWorkSpec");
        C41536l.m120489i(vVar3, "$oldWorkSpec");
        C41536l.m120489i(list2, "$schedulers");
        C41536l.m120489i(str2, "$workSpecId");
        C41536l.m120489i(set2, "$tags");
        C7402w N = workDatabase.mo6751N();
        C7362a0 O = workDatabase.mo6752O();
        C7399v b = C7638e.m29070b(list2, C7399v.m28151e(vVar, (String) null, vVar3.f21631b, (String) null, (String) null, (C1959e) null, (C1959e) null, 0, 0, 0, (C1954c) null, vVar3.f21640k, (C1949a) null, 0, vVar3.f21643n, 0, 0, false, (C2085q) null, 0, vVar2.mo21788f() + 1, 515069, (Object) null));
        C7402w wVar = N;
        wVar.mo21803d(b);
        C7362a0 a0Var = O;
        a0Var.mo21739c(str2);
        a0Var.mo21740d(str2, set2);
        if (!z) {
            wVar.mo21814o(str2, -1);
            workDatabase.mo6750M().mo21781a(str2);
        }
    }
}
