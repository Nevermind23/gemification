package p138k1;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1950b;
import androidx.work.C2073m;
import androidx.work.C2093w;
import androidx.work.impl.C2006e;
import androidx.work.impl.C2007e0;
import androidx.work.impl.C2045t;
import androidx.work.impl.C2060v;
import androidx.work.impl.C2061w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p151l1.C6863c;
import p151l1.C6864d;
import p151l1.C6865e;
import p177n1.C7215o;
import p190o1.C7386m;
import p190o1.C7399v;
import p190o1.C7417y;
import p203p1.C7656t;

/* renamed from: k1.b */
public class C6773b implements C2045t, C6863c, C2006e {

    /* renamed from: m */
    private static final String f20349m = C2073m.m8073i("GreedyScheduler");

    /* renamed from: d */
    private final Context f20350d;

    /* renamed from: e */
    private final C2007e0 f20351e;

    /* renamed from: f */
    private final C6864d f20352f;

    /* renamed from: g */
    private final Set f20353g = new HashSet();

    /* renamed from: h */
    private C6771a f20354h;

    /* renamed from: i */
    private boolean f20355i;

    /* renamed from: j */
    private final Object f20356j;

    /* renamed from: k */
    private final C2061w f20357k = new C2061w();

    /* renamed from: l */
    Boolean f20358l;

    public C6773b(Context context, C1950b bVar, C7215o oVar, C2007e0 e0Var) {
        this.f20350d = context;
        this.f20351e = e0Var;
        this.f20352f = new C6865e(oVar, (C6863c) this);
        this.f20354h = new C6771a(this, bVar.mo6701k());
        this.f20356j = new Object();
    }

    /* renamed from: g */
    private void m26405g() {
        this.f20358l = Boolean.valueOf(C7656t.m29102b(this.f20350d, this.f20351e.mo6823l()));
    }

    /* renamed from: h */
    private void m26406h() {
        if (!this.f20355i) {
            this.f20351e.mo6825p().mo6869g(this);
            this.f20355i = true;
        }
    }

    /* renamed from: i */
    private void m26407i(C7386m mVar) {
        synchronized (this.f20356j) {
            Iterator it = this.f20353g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7399v vVar = (C7399v) it.next();
                if (C7417y.m28225a(vVar).equals(mVar)) {
                    C2073m e = C2073m.m8071e();
                    String str = f20349m;
                    e.mo6959a(str, "Stopping tracking for " + mVar);
                    this.f20353g.remove(vVar);
                    this.f20352f.mo20942b(this.f20353g);
                    break;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6803a(C7399v... vVarArr) {
        if (this.f20358l == null) {
            m26405g();
        }
        if (!this.f20358l.booleanValue()) {
            C2073m.m8071e().mo6963f(f20349m, "Ignoring schedule request in a secondary process");
            return;
        }
        m26406h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C7399v vVar : vVarArr) {
            if (!this.f20357k.mo6912a(C7417y.m28225a(vVar))) {
                long c = vVar.mo21785c();
                long currentTimeMillis = System.currentTimeMillis();
                if (vVar.f21631b == C2093w.ENQUEUED) {
                    if (currentTimeMillis < c) {
                        C6771a aVar = this.f20354h;
                        if (aVar != null) {
                            aVar.mo20819a(vVar);
                        }
                    } else if (vVar.mo21790h()) {
                        int i = Build.VERSION.SDK_INT;
                        if (vVar.f21639j.mo6717h()) {
                            C2073m.m8071e().mo6959a(f20349m, "Ignoring " + vVar + ". Requires device idle.");
                        } else if (i < 24 || !vVar.f21639j.mo6713e()) {
                            hashSet.add(vVar);
                            hashSet2.add(vVar.f21630a);
                        } else {
                            C2073m.m8071e().mo6959a(f20349m, "Ignoring " + vVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f20357k.mo6912a(C7417y.m28225a(vVar))) {
                        C2073m.m8071e().mo6959a(f20349m, "Starting work for " + vVar.f21630a);
                        this.f20351e.mo6833y(this.f20357k.mo6916e(vVar));
                    }
                }
            }
        }
        synchronized (this.f20356j) {
            if (!hashSet.isEmpty()) {
                String join = TextUtils.join(",", hashSet2);
                C2073m.m8071e().mo6959a(f20349m, "Starting tracking for " + join);
                this.f20353g.addAll(hashSet);
                this.f20352f.mo20942b(this.f20353g);
            }
        }
    }

    /* renamed from: b */
    public void mo6783b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7386m a = C7417y.m28225a((C7399v) it.next());
            C2073m e = C2073m.m8071e();
            String str = f20349m;
            e.mo6959a(str, "Constraints not met: Cancelling work ID " + a);
            C2060v b = this.f20357k.mo6913b(a);
            if (b != null) {
                this.f20351e.mo6814B(b);
            }
        }
    }

    /* renamed from: c */
    public void mo6804c(String str) {
        if (this.f20358l == null) {
            m26405g();
        }
        if (!this.f20358l.booleanValue()) {
            C2073m.m8071e().mo6963f(f20349m, "Ignoring schedule request in non-main process");
            return;
        }
        m26406h();
        C2073m e = C2073m.m8071e();
        String str2 = f20349m;
        e.mo6959a(str2, "Cancelling work ID " + str);
        C6771a aVar = this.f20354h;
        if (aVar != null) {
            aVar.mo20820b(str);
        }
        for (C2060v B : this.f20357k.mo6914c(str)) {
            this.f20351e.mo6814B(B);
        }
    }

    /* renamed from: d */
    public void mo6776d(C7386m mVar, boolean z) {
        this.f20357k.mo6913b(mVar);
        m26407i(mVar);
    }

    /* renamed from: e */
    public boolean mo6805e() {
        return false;
    }

    /* renamed from: f */
    public void mo6784f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7386m a = C7417y.m28225a((C7399v) it.next());
            if (!this.f20357k.mo6912a(a)) {
                C2073m e = C2073m.m8071e();
                String str = f20349m;
                e.mo6959a(str, "Constraints met: Scheduling work ID " + a);
                this.f20351e.mo6833y(this.f20357k.mo6915d(a));
            }
        }
    }
}
