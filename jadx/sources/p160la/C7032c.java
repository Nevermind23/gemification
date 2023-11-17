package p160la;

import android.content.Context;
import java.net.URI;
import p134ja.C6763a;
import p212pa.C7795l;
import p225qa.C7969h;

/* renamed from: la.c */
final class C7032c extends C7034e {

    /* renamed from: c */
    private static final C6763a f20940c = C6763a.m26371e();

    /* renamed from: a */
    private final C7969h f20941a;

    /* renamed from: b */
    private final Context f20942b;

    C7032c(C7969h hVar, Context context) {
        this.f20942b = context;
        this.f20941a = hVar;
    }

    /* renamed from: g */
    private URI m27212g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            f20940c.mo20813k("getResultUrl throws exception %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: h */
    private boolean m27213h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return C7795l.m29500a(uri, context);
    }

    /* renamed from: i */
    private boolean m27214i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    /* renamed from: j */
    private boolean m27215j(String str) {
        return m27214i(str);
    }

    /* renamed from: k */
    private boolean m27216k(String str) {
        return str != null && !m27214i(str) && str.length() <= 255;
    }

    /* renamed from: m */
    private boolean m27217m(int i) {
        return i > 0;
    }

    /* renamed from: n */
    private boolean m27218n(long j) {
        return j >= 0;
    }

    /* renamed from: o */
    private boolean m27219o(int i) {
        return i == -1 || i > 0;
    }

    /* renamed from: p */
    private boolean m27220p(String str) {
        if (str == null) {
            return false;
        }
        if ("http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private boolean m27221q(long j) {
        return j >= 0;
    }

    /* renamed from: r */
    private boolean m27222r(String str) {
        return str == null;
    }

    /* renamed from: c */
    public boolean mo21243c() {
        C7969h.C7973d dVar;
        if (m27215j(this.f20941a.mo23076v0())) {
            C6763a aVar = f20940c;
            aVar.mo20812j("URL is missing:" + this.f20941a.mo23076v0());
            return false;
        }
        URI g = m27212g(this.f20941a.mo23076v0());
        if (g == null) {
            f20940c.mo20812j("URL cannot be parsed");
            return false;
        } else if (!m27213h(g, this.f20942b)) {
            C6763a aVar2 = f20940c;
            aVar2.mo20812j("URL fails allowlist rule: " + g);
            return false;
        } else if (!m27216k(g.getHost())) {
            f20940c.mo20812j("URL host is null or invalid");
            return false;
        } else if (!m27220p(g.getScheme())) {
            f20940c.mo20812j("URL scheme is null or invalid");
            return false;
        } else if (!m27222r(g.getUserInfo())) {
            f20940c.mo20812j("URL user info is null");
            return false;
        } else if (!m27219o(g.getPort())) {
            f20940c.mo20812j("URL port is less than or equal to 0");
            return false;
        } else {
            if (this.f20941a.mo23078x0()) {
                dVar = this.f20941a.mo23067l0();
            } else {
                dVar = null;
            }
            if (!mo21244l(dVar)) {
                C6763a aVar3 = f20940c;
                aVar3.mo20812j("HTTP Method is null or invalid: " + this.f20941a.mo23067l0());
                return false;
            } else if (this.f20941a.mo23079y0() && !m27217m(this.f20941a.mo23068m0())) {
                C6763a aVar4 = f20940c;
                aVar4.mo20812j("HTTP ResponseCode is a negative value:" + this.f20941a.mo23068m0());
                return false;
            } else if (this.f20941a.mo23080z0() && !m27218n(this.f20941a.mo23070o0())) {
                C6763a aVar5 = f20940c;
                aVar5.mo20812j("Request Payload is a negative value:" + this.f20941a.mo23070o0());
                return false;
            } else if (this.f20941a.mo23062A0() && !m27218n(this.f20941a.mo23072r0())) {
                C6763a aVar6 = f20940c;
                aVar6.mo20812j("Response Payload is a negative value:" + this.f20941a.mo23072r0());
                return false;
            } else if (!this.f20941a.mo23077w0() || this.f20941a.mo23066j0() <= 0) {
                C6763a aVar7 = f20940c;
                aVar7.mo20812j("Start time of the request is null, or zero, or a negative value:" + this.f20941a.mo23066j0());
                return false;
            } else if (this.f20941a.mo23063B0() && !m27221q(this.f20941a.mo23073s0())) {
                C6763a aVar8 = f20940c;
                aVar8.mo20812j("Time to complete the request is a negative value:" + this.f20941a.mo23073s0());
                return false;
            } else if (this.f20941a.mo23065D0() && !m27221q(this.f20941a.mo23075u0())) {
                C6763a aVar9 = f20940c;
                aVar9.mo20812j("Time from the start of the request to the start of the response is null or a negative value:" + this.f20941a.mo23075u0());
                return false;
            } else if (!this.f20941a.mo23064C0() || this.f20941a.mo23074t0() <= 0) {
                C6763a aVar10 = f20940c;
                aVar10.mo20812j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f20941a.mo23074t0());
                return false;
            } else if (this.f20941a.mo23079y0()) {
                return true;
            } else {
                f20940c.mo20812j("Did not receive a HTTP Response Code");
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo21244l(C7969h.C7973d dVar) {
        return (dVar == null || dVar == C7969h.C7973d.HTTP_METHOD_UNKNOWN) ? false : true;
    }
}
