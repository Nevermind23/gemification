package p199oa;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.C5270e;
import com.google.firebase.perf.application.C5374a;
import com.google.firebase.perf.config.C5380a;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p095ga.C6397a;
import p095ga.C6401e;
import p134ja.C6763a;
import p134ja.C6764b;
import p160la.C7034e;
import p212pa.C7778b;
import p212pa.C7786i;
import p225qa.C7947a;
import p225qa.C7953c;
import p225qa.C7957d;
import p225qa.C7966g;
import p225qa.C7969h;
import p225qa.C7979i;
import p225qa.C7982j;
import p225qa.C7990m;
import p327y9.C9142b;
import p339z9.C9270e;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: oa.k */
public class C7506k implements C5374a.C5376b {

    /* renamed from: u */
    private static final C6763a f21852u = C6763a.m26371e();

    /* renamed from: v */
    private static final C7506k f21853v = new C7506k();

    /* renamed from: d */
    private final Map f21854d;

    /* renamed from: e */
    private final ConcurrentLinkedQueue f21855e = new ConcurrentLinkedQueue();

    /* renamed from: f */
    private final AtomicBoolean f21856f = new AtomicBoolean(false);

    /* renamed from: g */
    private C5270e f21857g;

    /* renamed from: h */
    private C6401e f21858h;

    /* renamed from: i */
    private C9270e f21859i;

    /* renamed from: j */
    private C9142b f21860j;

    /* renamed from: k */
    private C7496b f21861k;

    /* renamed from: l */
    private ExecutorService f21862l = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: m */
    private Context f21863m;

    /* renamed from: n */
    private C5380a f21864n;

    /* renamed from: o */
    private C7498d f21865o;

    /* renamed from: p */
    private C5374a f21866p;

    /* renamed from: q */
    private C7953c.C7955b f21867q;

    /* renamed from: r */
    private String f21868r;

    /* renamed from: s */
    private String f21869s;

    /* renamed from: t */
    private boolean f21870t = false;

    private C7506k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f21854d = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    /* renamed from: D */
    private C7979i m28483D(C7979i.C7981b bVar, C7957d dVar) {
        m28486G();
        C7953c.C7955b D = this.f21867q.mo23043D(dVar);
        if (bVar.mo23103h() || bVar.mo23101b()) {
            D = ((C7953c.C7955b) D.clone()).mo23040A(m28497j());
        }
        return (C7979i) bVar.mo23109z(D).mo18768o();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m28484E() {
        Context j = this.f21857g.mo17481j();
        this.f21863m = j;
        this.f21868r = j.getPackageName();
        this.f21864n = C5380a.m21272g();
        this.f21865o = new C7498d(this.f21863m, new C7786i(100, 1, TimeUnit.MINUTES), 500);
        this.f21866p = C5374a.m21231b();
        this.f21861k = new C7496b(this.f21860j, this.f21864n.mo17721a());
        m28495h();
    }

    /* renamed from: F */
    private void m28485F(C7979i.C7981b bVar, C7957d dVar) {
        if (mo21948u()) {
            C7979i D = m28483D(bVar, dVar);
            if (m28506t(D)) {
                m28494g(D);
                SessionManager.getInstance().updatePerfSessionIfExpired();
            }
        } else if (m28505s(bVar)) {
            f21852u.mo20805b("Transport is not initialized yet, %s will be queued for to be dispatched later", m28501n(bVar));
            this.f21855e.add(new C7497c(bVar, dVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28486G() {
        /*
            r6 = this;
            com.google.firebase.perf.config.a r0 = r6.f21864n
            boolean r0 = r0.mo17718K()
            if (r0 == 0) goto L_0x006f
            qa.c$b r0 = r6.f21867q
            boolean r0 = r0.mo23045z()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r6.f21870t
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            r0 = 0
            r1 = 1
            z9.e r2 = r6.f21859i     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x003a, TimeoutException -> 0x0029 }
            z7.Task r2 = r2.mo17504a()     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x003a, TimeoutException -> 0x0029 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x003a, TimeoutException -> 0x0029 }
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r2 = p337z7.C9231i.m34108b(r2, r4, r3)     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x003a, TimeoutException -> 0x0029 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x003a, TimeoutException -> 0x0029 }
            goto L_0x005c
        L_0x0029:
            r2 = move-exception
            ja.a r3 = f21852u
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is timed out: %s"
            r3.mo20807d(r0, r1)
            goto L_0x005b
        L_0x003a:
            r2 = move-exception
            ja.a r3 = f21852u
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is interrupted: %s"
            r3.mo20807d(r0, r1)
            goto L_0x005b
        L_0x004b:
            r2 = move-exception
            ja.a r3 = f21852u
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Unable to retrieve Installation Id: %s"
            r3.mo20807d(r0, r1)
        L_0x005b:
            r2 = 0
        L_0x005c:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0068
            qa.c$b r0 = r6.f21867q
            r0.mo23042C(r2)
            goto L_0x006f
        L_0x0068:
            ja.a r0 = f21852u
            java.lang.String r1 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.mo20812j(r1)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p199oa.C7506k.m28486G():void");
    }

    /* renamed from: H */
    private void m28487H() {
        if (this.f21858h == null && mo21948u()) {
            this.f21858h = C6401e.m25445c();
        }
    }

    /* renamed from: g */
    private void m28494g(C7979i iVar) {
        if (iVar.mo23103h()) {
            f21852u.mo20809g("Logging %s. In a minute, visit the Firebase console to view your data: %s", m28501n(iVar), m28496i(iVar.mo23104j()));
        } else {
            f21852u.mo20809g("Logging %s", m28501n(iVar));
        }
        this.f21861k.mo21930b(iVar);
    }

    /* renamed from: h */
    private void m28495h() {
        this.f21866p.mo17680k(new WeakReference(f21853v));
        C7953c.C7955b g0 = C7953c.m30135g0();
        this.f21867q = g0;
        g0.mo23044E(this.f21857g.mo17483n().mo17517c()).mo23041B(C7947a.m30107Z().mo23032z(this.f21868r).mo23030A(C6397a.f19635b).mo23031B(m28503p(this.f21863m)));
        this.f21856f.set(true);
        while (!this.f21855e.isEmpty()) {
            C7497c cVar = (C7497c) this.f21855e.poll();
            if (cVar != null) {
                this.f21862l.execute(new C7505j(this, cVar));
            }
        }
    }

    /* renamed from: i */
    private String m28496i(C7990m mVar) {
        String r0 = mVar.mo23119r0();
        if (r0.startsWith("_st_")) {
            return C6764b.m26384c(this.f21869s, this.f21868r, r0);
        }
        return C6764b.m26382a(this.f21869s, this.f21868r, r0);
    }

    /* renamed from: j */
    private Map m28497j() {
        m28487H();
        C6401e eVar = this.f21858h;
        if (eVar != null) {
            return eVar.mo20283b();
        }
        return Collections.emptyMap();
    }

    /* renamed from: k */
    public static C7506k m28498k() {
        return f21853v;
    }

    /* renamed from: l */
    private static String m28499l(C7966g gVar) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", new Object[]{Boolean.valueOf(gVar.mo23056f0()), Integer.valueOf(gVar.mo23054c0()), Integer.valueOf(gVar.mo23053b0())});
    }

    /* renamed from: m */
    private static String m28500m(C7969h hVar) {
        long j;
        String str;
        if (hVar.mo23064C0()) {
            j = hVar.mo23074t0();
        } else {
            j = 0;
        }
        if (hVar.mo23079y0()) {
            str = String.valueOf(hVar.mo23068m0());
        } else {
            str = "UNKNOWN";
        }
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", new Object[]{hVar.mo23076v0(), str, new DecimalFormat("#.####").format(((double) j) / 1000.0d)});
    }

    /* renamed from: n */
    private static String m28501n(C7982j jVar) {
        if (jVar.mo23103h()) {
            return m28502o(jVar.mo23104j());
        }
        if (jVar.mo23101b()) {
            return m28500m(jVar.mo23102c());
        }
        if (jVar.mo23100a()) {
            return m28499l(jVar.mo23105k());
        }
        return "log";
    }

    /* renamed from: o */
    private static String m28502o(C7990m mVar) {
        long n0 = mVar.mo23118n0();
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", new Object[]{mVar.mo23119r0(), new DecimalFormat("#.####").format(((double) n0) / 1000.0d)});
    }

    /* renamed from: p */
    private static String m28503p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str == null) {
                return "";
            }
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: q */
    private void m28504q(C7979i iVar) {
        if (iVar.mo23103h()) {
            this.f21866p.mo17674d(C7778b.TRACE_EVENT_RATE_LIMITED.toString(), 1);
        } else if (iVar.mo23101b()) {
            this.f21866p.mo17674d(C7778b.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1);
        }
    }

    /* renamed from: s */
    private boolean m28505s(C7982j jVar) {
        int intValue = ((Integer) this.f21854d.get("KEY_AVAILABLE_TRACES_FOR_CACHING")).intValue();
        int intValue2 = ((Integer) this.f21854d.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING")).intValue();
        int intValue3 = ((Integer) this.f21854d.get("KEY_AVAILABLE_GAUGES_FOR_CACHING")).intValue();
        if (jVar.mo23103h() && intValue > 0) {
            this.f21854d.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        } else if (jVar.mo23101b() && intValue2 > 0) {
            this.f21854d.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        } else if (!jVar.mo23100a() || intValue3 <= 0) {
            f21852u.mo20805b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", m28501n(jVar), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3));
            return false;
        } else {
            this.f21854d.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            return true;
        }
    }

    /* renamed from: t */
    private boolean m28506t(C7979i iVar) {
        if (!this.f21864n.mo17718K()) {
            f21852u.mo20809g("Performance collection is not enabled, dropping %s", m28501n(iVar));
            return false;
        } else if (!iVar.mo23098X().mo23037c0()) {
            f21852u.mo20813k("App Instance ID is null or empty, dropping %s", m28501n(iVar));
            return false;
        } else if (!C7034e.m27238b(iVar, this.f21863m)) {
            f21852u.mo20813k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", m28501n(iVar));
            return false;
        } else if (!this.f21865o.mo21933h(iVar)) {
            m28504q(iVar);
            f21852u.mo20809g("Event dropped due to device sampling - %s", m28501n(iVar));
            return false;
        } else if (!this.f21865o.mo21932g(iVar)) {
            return true;
        } else {
            m28504q(iVar);
            f21852u.mo20809g("Rate limited (per device) - %s", m28501n(iVar));
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m28507v(C7497c cVar) {
        m28485F(cVar.f21819a, cVar.f21820b);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m28508w(C7990m mVar, C7957d dVar) {
        m28485F(C7979i.m30280Z().mo23108C(mVar), dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m28509x(C7969h hVar, C7957d dVar) {
        m28485F(C7979i.m30280Z().mo23107B(hVar), dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m28510y(C7966g gVar, C7957d dVar) {
        m28485F(C7979i.m30280Z().mo23106A(gVar), dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m28511z() {
        this.f21865o.mo21931a(this.f21870t);
    }

    /* renamed from: A */
    public void mo21944A(C7966g gVar, C7957d dVar) {
        this.f21862l.execute(new C7504i(this, gVar, dVar));
    }

    /* renamed from: B */
    public void mo21945B(C7969h hVar, C7957d dVar) {
        this.f21862l.execute(new C7502g(this, hVar, dVar));
    }

    /* renamed from: C */
    public void mo21946C(C7990m mVar, C7957d dVar) {
        this.f21862l.execute(new C7500e(this, mVar, dVar));
    }

    public void onUpdateAppState(C7957d dVar) {
        boolean z;
        if (dVar == C7957d.FOREGROUND) {
            z = true;
        } else {
            z = false;
        }
        this.f21870t = z;
        if (mo21948u()) {
            this.f21862l.execute(new C7503h(this));
        }
    }

    /* renamed from: r */
    public void mo21947r(C5270e eVar, C9270e eVar2, C9142b bVar) {
        this.f21857g = eVar;
        this.f21869s = eVar.mo17483n().mo17519e();
        this.f21859i = eVar2;
        this.f21860j = bVar;
        this.f21862l.execute(new C7501f(this));
    }

    /* renamed from: u */
    public boolean mo21948u() {
        return this.f21856f.get();
    }
}
