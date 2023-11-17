package androidx.work.impl;

import android.content.Context;
import androidx.work.C1950b;
import androidx.work.C1959e;
import androidx.work.C2065j;
import androidx.work.C2068l;
import androidx.work.C2073m;
import androidx.work.C2093w;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.C2016a;
import androidx.work.impl.utils.futures.C2059c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p190o1.C7364b;
import p190o1.C7386m;
import p190o1.C7399v;
import p190o1.C7402w;
import p190o1.C7417y;
import p203p1.C7627b0;
import p203p1.C7633c0;
import p203p1.C7636d0;
import p203p1.C7654r;
import p203p1.C7661x;
import p216q1.C7819c;
import p262t8.C8421a;

/* renamed from: androidx.work.impl.k0 */
public class C2032k0 implements Runnable {

    /* renamed from: v */
    static final String f6097v = C2073m.m8073i("WorkerWrapper");

    /* renamed from: d */
    Context f6098d;

    /* renamed from: e */
    private final String f6099e;

    /* renamed from: f */
    private List f6100f;

    /* renamed from: g */
    private WorkerParameters.C1948a f6101g;

    /* renamed from: h */
    C7399v f6102h;

    /* renamed from: i */
    C2068l f6103i;

    /* renamed from: j */
    C7819c f6104j;

    /* renamed from: k */
    C2068l.C2069a f6105k = C2068l.C2069a.m8065a();

    /* renamed from: l */
    private C1950b f6106l;

    /* renamed from: m */
    private C2016a f6107m;

    /* renamed from: n */
    private WorkDatabase f6108n;

    /* renamed from: o */
    private C7402w f6109o;

    /* renamed from: p */
    private C7364b f6110p;

    /* renamed from: q */
    private List f6111q;

    /* renamed from: r */
    private String f6112r;

    /* renamed from: s */
    C2059c f6113s = C2059c.m8028t();

    /* renamed from: t */
    final C2059c f6114t = C2059c.m8028t();

    /* renamed from: u */
    private volatile boolean f6115u;

    /* renamed from: androidx.work.impl.k0$a */
    class C2033a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C8421a f6116d;

        C2033a(C8421a aVar) {
            this.f6116d = aVar;
        }

        public void run() {
            if (!C2032k0.this.f6114t.isCancelled()) {
                try {
                    this.f6116d.get();
                    C2073m e = C2073m.m8071e();
                    String str = C2032k0.f6097v;
                    e.mo6959a(str, "Starting work for " + C2032k0.this.f6102h.f21632c);
                    C2032k0 k0Var = C2032k0.this;
                    k0Var.f6114t.mo6898r(k0Var.f6103i.startWork());
                } catch (Throwable th) {
                    C2032k0.this.f6114t.mo6897q(th);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.k0$b */
    class C2034b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ String f6118d;

        C2034b(String str) {
            this.f6118d = str;
        }

        public void run() {
            try {
                C2068l.C2069a aVar = (C2068l.C2069a) C2032k0.this.f6114t.get();
                if (aVar == null) {
                    C2073m e = C2073m.m8071e();
                    String str = C2032k0.f6097v;
                    e.mo6961c(str, C2032k0.this.f6102h.f21632c + " returned a null result. Treating it as a failure.");
                } else {
                    C2073m e2 = C2073m.m8071e();
                    String str2 = C2032k0.f6097v;
                    e2.mo6959a(str2, C2032k0.this.f6102h.f21632c + " returned a " + aVar + ".");
                    C2032k0.this.f6105k = aVar;
                }
            } catch (CancellationException e3) {
                C2073m e4 = C2073m.m8071e();
                String str3 = C2032k0.f6097v;
                e4.mo6964g(str3, this.f6118d + " was cancelled", e3);
            } catch (InterruptedException | ExecutionException e5) {
                C2073m e6 = C2073m.m8071e();
                String str4 = C2032k0.f6097v;
                e6.mo6962d(str4, this.f6118d + " failed because it threw an exception/error", e5);
            } catch (Throwable th) {
                C2032k0.this.mo6858j();
                throw th;
            }
            C2032k0.this.mo6858j();
        }
    }

    /* renamed from: androidx.work.impl.k0$c */
    public static class C2035c {

        /* renamed from: a */
        Context f6120a;

        /* renamed from: b */
        C2068l f6121b;

        /* renamed from: c */
        C2016a f6122c;

        /* renamed from: d */
        C7819c f6123d;

        /* renamed from: e */
        C1950b f6124e;

        /* renamed from: f */
        WorkDatabase f6125f;

        /* renamed from: g */
        C7399v f6126g;

        /* renamed from: h */
        List f6127h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final List f6128i;

        /* renamed from: j */
        WorkerParameters.C1948a f6129j = new WorkerParameters.C1948a();

        public C2035c(Context context, C1950b bVar, C7819c cVar, C2016a aVar, WorkDatabase workDatabase, C7399v vVar, List list) {
            this.f6120a = context.getApplicationContext();
            this.f6123d = cVar;
            this.f6122c = aVar;
            this.f6124e = bVar;
            this.f6125f = workDatabase;
            this.f6126g = vVar;
            this.f6128i = list;
        }

        /* renamed from: b */
        public C2032k0 mo6863b() {
            return new C2032k0(this);
        }

        /* renamed from: c */
        public C2035c mo6864c(WorkerParameters.C1948a aVar) {
            if (aVar != null) {
                this.f6129j = aVar;
            }
            return this;
        }

        /* renamed from: d */
        public C2035c mo6865d(List list) {
            this.f6127h = list;
            return this;
        }
    }

    C2032k0(C2035c cVar) {
        this.f6098d = cVar.f6120a;
        this.f6104j = cVar.f6123d;
        this.f6107m = cVar.f6122c;
        C7399v vVar = cVar.f6126g;
        this.f6102h = vVar;
        this.f6099e = vVar.f21630a;
        this.f6100f = cVar.f6127h;
        this.f6101g = cVar.f6129j;
        this.f6103i = cVar.f6121b;
        this.f6106l = cVar.f6124e;
        WorkDatabase workDatabase = cVar.f6125f;
        this.f6108n = workDatabase;
        this.f6109o = workDatabase.mo6751N();
        this.f6110p = this.f6108n.mo6746I();
        this.f6111q = cVar.f6128i;
    }

    /* renamed from: b */
    private String m7929b(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f6099e);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    /* renamed from: f */
    private void m7930f(C2068l.C2069a aVar) {
        if (aVar instanceof C2068l.C2069a.C2072c) {
            C2073m e = C2073m.m8071e();
            String str = f6097v;
            e.mo6963f(str, "Worker result SUCCESS for " + this.f6112r);
            if (this.f6102h.mo21793j()) {
                m7934l();
            } else {
                m7938q();
            }
        } else if (aVar instanceof C2068l.C2069a.C2071b) {
            C2073m e2 = C2073m.m8071e();
            String str2 = f6097v;
            e2.mo6963f(str2, "Worker result RETRY for " + this.f6112r);
            m7933k();
        } else {
            C2073m e3 = C2073m.m8071e();
            String str3 = f6097v;
            e3.mo6963f(str3, "Worker result FAILURE for " + this.f6112r);
            if (this.f6102h.mo21793j()) {
                m7934l();
            } else {
                mo6859p();
            }
        }
    }

    /* renamed from: h */
    private void m7931h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f6109o.mo21807h(str2) != C2093w.CANCELLED) {
                this.f6109o.mo21817r(C2093w.FAILED, str2);
            }
            linkedList.addAll(this.f6110p.mo21741a(str2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m7932i(C8421a aVar) {
        if (this.f6114t.isCancelled()) {
            aVar.cancel(true);
        }
    }

    /* renamed from: k */
    private void m7933k() {
        this.f6108n.mo23807e();
        try {
            this.f6109o.mo21817r(C2093w.ENQUEUED, this.f6099e);
            this.f6109o.mo21809j(this.f6099e, System.currentTimeMillis());
            this.f6109o.mo21814o(this.f6099e, -1);
            this.f6108n.mo23804F();
        } finally {
            this.f6108n.mo23809i();
            m7935m(true);
        }
    }

    /* renamed from: l */
    private void m7934l() {
        this.f6108n.mo23807e();
        try {
            this.f6109o.mo21809j(this.f6099e, System.currentTimeMillis());
            this.f6109o.mo21817r(C2093w.ENQUEUED, this.f6099e);
            this.f6109o.mo21821v(this.f6099e);
            this.f6109o.mo21801b(this.f6099e);
            this.f6109o.mo21814o(this.f6099e, -1);
            this.f6108n.mo23804F();
        } finally {
            this.f6108n.mo23809i();
            m7935m(false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m */
    private void m7935m(boolean z) {
        this.f6108n.mo23807e();
        try {
            if (!this.f6108n.mo6751N().mo21820u()) {
                C7654r.m29095a(this.f6098d, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f6109o.mo21817r(C2093w.ENQUEUED, this.f6099e);
                this.f6109o.mo21814o(this.f6099e, -1);
            }
            if (!(this.f6102h == null || this.f6103i == null || !this.f6107m.mo6843b(this.f6099e))) {
                this.f6107m.mo6842a(this.f6099e);
            }
            this.f6108n.mo23804F();
            this.f6108n.mo23809i();
            this.f6113s.mo6896p(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f6108n.mo23809i();
            throw th;
        }
    }

    /* renamed from: n */
    private void m7936n() {
        C2093w h = this.f6109o.mo21807h(this.f6099e);
        if (h == C2093w.RUNNING) {
            C2073m e = C2073m.m8071e();
            String str = f6097v;
            e.mo6959a(str, "Status for " + this.f6099e + " is RUNNING; not doing any work and rescheduling for later execution");
            m7935m(true);
            return;
        }
        C2073m e2 = C2073m.m8071e();
        String str2 = f6097v;
        e2.mo6959a(str2, "Status for " + this.f6099e + " is " + h + " ; not doing any work");
        m7935m(false);
    }

    /* renamed from: o */
    private void m7937o() {
        C1959e b;
        if (!m7939r()) {
            this.f6108n.mo23807e();
            try {
                C7399v vVar = this.f6102h;
                if (vVar.f21631b != C2093w.ENQUEUED) {
                    m7936n();
                    this.f6108n.mo23804F();
                    C2073m e = C2073m.m8071e();
                    String str = f6097v;
                    e.mo6959a(str, this.f6102h.f21632c + " is not in ENQUEUED state. Nothing more to do");
                } else if ((vVar.mo21793j() || this.f6102h.mo21792i()) && System.currentTimeMillis() < this.f6102h.mo21785c()) {
                    C2073m.m8071e().mo6959a(f6097v, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f6102h.f21632c}));
                    m7935m(true);
                    this.f6108n.mo23804F();
                    this.f6108n.mo23809i();
                } else {
                    this.f6108n.mo23804F();
                    this.f6108n.mo23809i();
                    if (this.f6102h.mo21793j()) {
                        b = this.f6102h.f21634e;
                    } else {
                        C2065j b2 = this.f6106l.mo6696f().mo6930b(this.f6102h.f21633d);
                        if (b2 == null) {
                            C2073m e2 = C2073m.m8071e();
                            String str2 = f6097v;
                            e2.mo6961c(str2, "Could not create Input Merger " + this.f6102h.f21633d);
                            mo6859p();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f6102h.f21634e);
                        arrayList.addAll(this.f6109o.mo21811l(this.f6099e));
                        b = b2.mo6673b(arrayList);
                    }
                    C1959e eVar = b;
                    UUID fromString = UUID.fromString(this.f6099e);
                    List list = this.f6111q;
                    WorkerParameters.C1948a aVar = this.f6101g;
                    C7399v vVar2 = this.f6102h;
                    WorkerParameters workerParameters = new WorkerParameters(fromString, eVar, list, aVar, vVar2.f21640k, vVar2.mo21788f(), this.f6106l.mo6694d(), this.f6104j, this.f6106l.mo6704n(), new C7636d0(this.f6108n, this.f6104j), new C7633c0(this.f6108n, this.f6107m, this.f6104j));
                    if (this.f6103i == null) {
                        this.f6103i = this.f6106l.mo6704n().mo6996b(this.f6098d, this.f6102h.f21632c, workerParameters);
                    }
                    C2068l lVar = this.f6103i;
                    if (lVar == null) {
                        C2073m e3 = C2073m.m8071e();
                        String str3 = f6097v;
                        e3.mo6961c(str3, "Could not create Worker " + this.f6102h.f21632c);
                        mo6859p();
                    } else if (lVar.isUsed()) {
                        C2073m e4 = C2073m.m8071e();
                        String str4 = f6097v;
                        e4.mo6961c(str4, "Received an already-used Worker " + this.f6102h.f21632c + "; Worker Factory should return new instances");
                        mo6859p();
                    } else {
                        this.f6103i.setUsed();
                        if (!m7940s()) {
                            m7936n();
                        } else if (!m7939r()) {
                            C7627b0 b0Var = new C7627b0(this.f6098d, this.f6102h, this.f6103i, workerParameters.mo6682b(), this.f6104j);
                            this.f6104j.mo22737a().execute(b0Var);
                            C8421a b3 = b0Var.mo22333b();
                            this.f6114t.mo2810c(new C2030j0(this, b3), new C7661x());
                            b3.mo2810c(new C2033a(b3), this.f6104j.mo22737a());
                            this.f6114t.mo2810c(new C2034b(this.f6112r), this.f6104j.mo22738b());
                        }
                    }
                }
            } finally {
                this.f6108n.mo23809i();
            }
        }
    }

    /* renamed from: q */
    private void m7938q() {
        this.f6108n.mo23807e();
        try {
            this.f6109o.mo21817r(C2093w.SUCCEEDED, this.f6099e);
            this.f6109o.mo21818s(this.f6099e, ((C2068l.C2069a.C2072c) this.f6105k).mo6955e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f6110p.mo21741a(this.f6099e)) {
                if (this.f6109o.mo21807h(str) == C2093w.BLOCKED && this.f6110p.mo21742b(str)) {
                    C2073m e = C2073m.m8071e();
                    String str2 = f6097v;
                    e.mo6963f(str2, "Setting status to enqueued for " + str);
                    this.f6109o.mo21817r(C2093w.ENQUEUED, str);
                    this.f6109o.mo21809j(str, currentTimeMillis);
                }
            }
            this.f6108n.mo23804F();
        } finally {
            this.f6108n.mo23809i();
            m7935m(false);
        }
    }

    /* renamed from: r */
    private boolean m7939r() {
        if (!this.f6115u) {
            return false;
        }
        C2073m e = C2073m.m8071e();
        String str = f6097v;
        e.mo6959a(str, "Work interrupted for " + this.f6112r);
        C2093w h = this.f6109o.mo21807h(this.f6099e);
        if (h == null) {
            m7935m(false);
        } else {
            m7935m(!h.mo6980b());
        }
        return true;
    }

    /* renamed from: s */
    private boolean m7940s() {
        boolean z;
        this.f6108n.mo23807e();
        try {
            if (this.f6109o.mo21807h(this.f6099e) == C2093w.ENQUEUED) {
                this.f6109o.mo21817r(C2093w.RUNNING, this.f6099e);
                this.f6109o.mo21822w(this.f6099e);
                z = true;
            } else {
                z = false;
            }
            this.f6108n.mo23804F();
            return z;
        } finally {
            this.f6108n.mo23809i();
        }
    }

    /* renamed from: c */
    public C8421a mo6854c() {
        return this.f6113s;
    }

    /* renamed from: d */
    public C7386m mo6855d() {
        return C7417y.m28225a(this.f6102h);
    }

    /* renamed from: e */
    public C7399v mo6856e() {
        return this.f6102h;
    }

    /* renamed from: g */
    public void mo6857g() {
        this.f6115u = true;
        m7939r();
        this.f6114t.cancel(true);
        if (this.f6103i == null || !this.f6114t.isCancelled()) {
            C2073m.m8071e().mo6959a(f6097v, "WorkSpec " + this.f6102h + " is already done. Not interrupting.");
            return;
        }
        this.f6103i.stop();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo6858j() {
        if (!m7939r()) {
            this.f6108n.mo23807e();
            try {
                C2093w h = this.f6109o.mo21807h(this.f6099e);
                this.f6108n.mo6750M().mo21781a(this.f6099e);
                if (h == null) {
                    m7935m(false);
                } else if (h == C2093w.RUNNING) {
                    m7930f(this.f6105k);
                } else if (!h.mo6980b()) {
                    m7933k();
                }
                this.f6108n.mo23804F();
            } finally {
                this.f6108n.mo23809i();
            }
        }
        List<C2045t> list = this.f6100f;
        if (list != null) {
            for (C2045t c : list) {
                c.mo6804c(this.f6099e);
            }
            C2046u.m7981b(this.f6106l, this.f6108n, this.f6100f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo6859p() {
        this.f6108n.mo23807e();
        try {
            m7931h(this.f6099e);
            this.f6109o.mo21818s(this.f6099e, ((C2068l.C2069a.C2070a) this.f6105k).mo6948e());
            this.f6108n.mo23804F();
        } finally {
            this.f6108n.mo23809i();
            m7935m(false);
        }
    }

    public void run() {
        this.f6112r = m7929b(this.f6111q);
        m7937o();
    }
}
