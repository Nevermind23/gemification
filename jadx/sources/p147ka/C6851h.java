package p147ka;

import com.google.firebase.perf.application.C5374a;
import com.google.firebase.perf.application.C5377b;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p134ja.C6763a;
import p173ma.C7152f;
import p186na.C7353a;
import p199oa.C7506k;
import p212pa.C7797n;
import p225qa.C7969h;
import p225qa.C7983k;

/* renamed from: ka.h */
public final class C6851h extends C5377b implements C7353a {

    /* renamed from: l */
    private static final C6763a f20509l = C6763a.m26371e();

    /* renamed from: d */
    private final List f20510d;

    /* renamed from: e */
    private final GaugeManager f20511e;

    /* renamed from: f */
    private final C7506k f20512f;

    /* renamed from: g */
    private final C7969h.C7971b f20513g;

    /* renamed from: h */
    private final WeakReference f20514h;

    /* renamed from: i */
    private String f20515i;

    /* renamed from: j */
    private boolean f20516j;

    /* renamed from: k */
    private boolean f20517k;

    private C6851h(C7506k kVar) {
        this(kVar, C5374a.m21231b(), GaugeManager.getInstance());
    }

    /* renamed from: d */
    public static C6851h m26596d(C7506k kVar) {
        return new C6851h(kVar);
    }

    /* renamed from: h */
    private boolean m26597h() {
        return this.f20513g.mo23083C();
    }

    /* renamed from: i */
    private boolean m26598i() {
        return this.f20513g.mo23085E();
    }

    /* renamed from: j */
    private static boolean m26599j(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo17789a(PerfSession perfSession) {
        if (perfSession == null) {
            f20509l.mo20812j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (m26597h() && !m26598i()) {
            this.f20510d.add(perfSession);
        }
    }

    /* renamed from: b */
    public C7969h mo20906b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f20514h);
        unregisterForAppState();
        C7983k[] b = PerfSession.m21522b(mo20907e());
        if (b != null) {
            this.f20513g.mo23097z(Arrays.asList(b));
        }
        C7969h hVar = (C7969h) this.f20513g.mo18768o();
        if (!C7152f.m27526c(this.f20515i)) {
            f20509l.mo20804a("Dropping network request from a 'User-Agent' that is not allowed");
            return hVar;
        } else if (!this.f20516j) {
            this.f20512f.mo21945B(hVar, getAppState());
            this.f20516j = true;
            return hVar;
        } else {
            if (this.f20517k) {
                f20509l.mo20804a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return hVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public List mo20907e() {
        List unmodifiableList;
        synchronized (this.f20510d) {
            ArrayList arrayList = new ArrayList();
            for (PerfSession perfSession : this.f20510d) {
                if (perfSession != null) {
                    arrayList.add(perfSession);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    /* renamed from: f */
    public long mo20908f() {
        return this.f20513g.mo23082B();
    }

    /* renamed from: g */
    public boolean mo20909g() {
        return this.f20513g.mo23084D();
    }

    /* renamed from: k */
    public C6851h mo20910k(String str) {
        C7969h.C7973d dVar;
        if (str != null) {
            C7969h.C7973d dVar2 = C7969h.C7973d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals(Request.PUT)) {
                        c = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    dVar = C7969h.C7973d.OPTIONS;
                    break;
                case 1:
                    dVar = C7969h.C7973d.GET;
                    break;
                case 2:
                    dVar = C7969h.C7973d.PUT;
                    break;
                case 3:
                    dVar = C7969h.C7973d.HEAD;
                    break;
                case 4:
                    dVar = C7969h.C7973d.POST;
                    break;
                case 5:
                    dVar = C7969h.C7973d.PATCH;
                    break;
                case 6:
                    dVar = C7969h.C7973d.TRACE;
                    break;
                case 7:
                    dVar = C7969h.C7973d.CONNECT;
                    break;
                case 8:
                    dVar = C7969h.C7973d.DELETE;
                    break;
                default:
                    dVar = C7969h.C7973d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f20513g.mo23087G(dVar);
        }
        return this;
    }

    /* renamed from: l */
    public C6851h mo20911l(int i) {
        this.f20513g.mo23088H(i);
        return this;
    }

    /* renamed from: m */
    public C6851h mo20912m() {
        this.f20513g.mo23089I(C7969h.C7976e.GENERIC_CLIENT_ERROR);
        return this;
    }

    /* renamed from: p */
    public C6851h mo20913p(long j) {
        this.f20513g.mo23090J(j);
        return this;
    }

    /* renamed from: q */
    public C6851h mo20914q(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f20514h);
        this.f20513g.mo23086F(j);
        mo17789a(perfSession);
        if (perfSession.mo18001g()) {
            this.f20511e.collectGaugeMetricOnce(perfSession.mo17999e());
        }
        return this;
    }

    /* renamed from: r */
    public C6851h mo20915r(String str) {
        if (str == null) {
            this.f20513g.mo23081A();
            return this;
        }
        if (m26599j(str)) {
            this.f20513g.mo23091K(str);
        } else {
            C6763a aVar = f20509l;
            aVar.mo20812j("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    /* renamed from: s */
    public C6851h mo20916s(long j) {
        this.f20513g.mo23092L(j);
        return this;
    }

    /* renamed from: t */
    public C6851h mo20917t(long j) {
        this.f20513g.mo23093M(j);
        return this;
    }

    /* renamed from: u */
    public C6851h mo20918u(long j) {
        this.f20513g.mo23094N(j);
        if (SessionManager.getInstance().perfSession().mo18001g()) {
            this.f20511e.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().mo17999e());
        }
        return this;
    }

    /* renamed from: v */
    public C6851h mo20919v(long j) {
        this.f20513g.mo23095O(j);
        return this;
    }

    /* renamed from: w */
    public C6851h mo20920w(String str) {
        if (str != null) {
            this.f20513g.mo23096P(C7797n.m29506e(C7797n.m29505d(str), 2000));
        }
        return this;
    }

    /* renamed from: x */
    public C6851h mo20921x(String str) {
        this.f20515i = str;
        return this;
    }

    public C6851h(C7506k kVar, C5374a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f20513g = C7969h.m30203E0();
        this.f20514h = new WeakReference(this);
        this.f20512f = kVar;
        this.f20511e = gaugeManager;
        this.f20510d = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
