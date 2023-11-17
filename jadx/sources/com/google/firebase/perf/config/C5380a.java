package com.google.firebase.perf.config;

import android.content.Context;
import com.github.mikephil.charting.utils.Utils;
import p095ga.C6397a;
import p134ja.C6763a;
import p212pa.C7783f;
import p212pa.C7784g;
import p212pa.C7797n;

/* renamed from: com.google.firebase.perf.config.a */
public class C5380a {

    /* renamed from: d */
    private static final C6763a f17180d = C6763a.m26371e();

    /* renamed from: e */
    private static volatile C5380a f17181e;

    /* renamed from: a */
    private final RemoteConfigManager f17182a;

    /* renamed from: b */
    private C7783f f17183b;

    /* renamed from: c */
    private C5404x f17184c;

    public C5380a(RemoteConfigManager remoteConfigManager, C7783f fVar, C5404x xVar) {
        this.f17182a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f17183b = fVar == null ? new C7783f() : fVar;
        this.f17184c = xVar == null ? C5404x.m21397e() : xVar;
    }

    /* renamed from: H */
    private boolean m21262H(long j) {
        return j >= 0;
    }

    /* renamed from: I */
    private boolean m21263I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String trim : str.split(";")) {
            if (trim.trim().equals(C6397a.f19635b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    private boolean m21264J(long j) {
        return j >= 0;
    }

    /* renamed from: L */
    private boolean m21265L(double d) {
        return Utils.DOUBLE_EPSILON <= d && d <= 1.0d;
    }

    /* renamed from: M */
    private boolean m21266M(long j) {
        return j > 0;
    }

    /* renamed from: N */
    private boolean m21267N(long j) {
        return j > 0;
    }

    /* renamed from: b */
    private C7784g m21268b(C5402v vVar) {
        return this.f17184c.mo17756b(vVar.mo17735a());
    }

    /* renamed from: c */
    private C7784g m21269c(C5402v vVar) {
        return this.f17184c.mo17757c(vVar.mo17735a());
    }

    /* renamed from: d */
    private C7784g m21270d(C5402v vVar) {
        return this.f17184c.mo17758f(vVar.mo17735a());
    }

    /* renamed from: e */
    private C7784g m21271e(C5402v vVar) {
        return this.f17184c.mo17759g(vVar.mo17735a());
    }

    /* renamed from: g */
    public static synchronized C5380a m21272g() {
        C5380a aVar;
        synchronized (C5380a.class) {
            if (f17181e == null) {
                f17181e = new C5380a((RemoteConfigManager) null, (C7783f) null, (C5404x) null);
            }
            aVar = f17181e;
        }
        return aVar;
    }

    /* renamed from: k */
    private boolean m21273k() {
        C5392l e = C5392l.m21346e();
        C7784g u = m21278u(e);
        if (!u.mo22547d()) {
            C7784g b = m21268b(e);
            if (b.mo22547d()) {
                return ((Boolean) b.mo22546c()).booleanValue();
            }
            return e.mo17745d().booleanValue();
        } else if (this.f17182a.isLastFetchFailed()) {
            return false;
        } else {
            this.f17184c.mo17764m(e.mo17735a(), ((Boolean) u.mo22546c()).booleanValue());
            return ((Boolean) u.mo22546c()).booleanValue();
        }
    }

    /* renamed from: l */
    private boolean m21274l() {
        C5391k e = C5391k.m21342e();
        C7784g x = m21281x(e);
        if (x.mo22547d()) {
            this.f17184c.mo17763l(e.mo17735a(), (String) x.mo22546c());
            return m21263I((String) x.mo22546c());
        }
        C7784g e2 = m21271e(e);
        if (e2.mo22547d()) {
            return m21263I((String) e2.mo22546c());
        }
        return m21263I(e.mo17744d());
    }

    /* renamed from: n */
    private C7784g m21275n(C5402v vVar) {
        return this.f17183b.mo22543b(vVar.mo17733b());
    }

    /* renamed from: o */
    private C7784g m21276o(C5402v vVar) {
        return this.f17183b.mo22544c(vVar.mo17733b());
    }

    /* renamed from: p */
    private C7784g m21277p(C5402v vVar) {
        return this.f17183b.mo22545e(vVar.mo17733b());
    }

    /* renamed from: u */
    private C7784g m21278u(C5402v vVar) {
        return this.f17182a.getBoolean(vVar.mo17736c());
    }

    /* renamed from: v */
    private C7784g m21279v(C5402v vVar) {
        return this.f17182a.getDouble(vVar.mo17736c());
    }

    /* renamed from: w */
    private C7784g m21280w(C5402v vVar) {
        return this.f17182a.getLong(vVar.mo17736c());
    }

    /* renamed from: x */
    private C7784g m21281x(C5402v vVar) {
        return this.f17182a.getString(vVar.mo17736c());
    }

    /* renamed from: A */
    public long mo17711A() {
        C5395o e = C5395o.m21360e();
        C7784g p = m21277p(e);
        if (p.mo22547d() && m21266M(((Long) p.mo22546c()).longValue())) {
            return ((Long) p.mo22546c()).longValue();
        }
        C7784g w = m21280w(e);
        if (!w.mo22547d() || !m21266M(((Long) w.mo22546c()).longValue())) {
            C7784g d = m21270d(e);
            if (!d.mo22547d() || !m21266M(((Long) d.mo22546c()).longValue())) {
                return e.mo17748d().longValue();
            }
            return ((Long) d.mo22546c()).longValue();
        }
        this.f17184c.mo17762k(e.mo17735a(), ((Long) w.mo22546c()).longValue());
        return ((Long) w.mo22546c()).longValue();
    }

    /* renamed from: B */
    public long mo17712B() {
        C5396p e = C5396p.m21365e();
        C7784g p = m21277p(e);
        if (p.mo22547d() && m21264J(((Long) p.mo22546c()).longValue())) {
            return ((Long) p.mo22546c()).longValue();
        }
        C7784g w = m21280w(e);
        if (!w.mo22547d() || !m21264J(((Long) w.mo22546c()).longValue())) {
            C7784g d = m21270d(e);
            if (!d.mo22547d() || !m21264J(((Long) d.mo22546c()).longValue())) {
                return e.mo17749d().longValue();
            }
            return ((Long) d.mo22546c()).longValue();
        }
        this.f17184c.mo17762k(e.mo17735a(), ((Long) w.mo22546c()).longValue());
        return ((Long) w.mo22546c()).longValue();
    }

    /* renamed from: C */
    public long mo17713C() {
        C5397q e = C5397q.m21370e();
        C7784g p = m21277p(e);
        if (p.mo22547d() && m21264J(((Long) p.mo22546c()).longValue())) {
            return ((Long) p.mo22546c()).longValue();
        }
        C7784g w = m21280w(e);
        if (!w.mo22547d() || !m21264J(((Long) w.mo22546c()).longValue())) {
            C7784g d = m21270d(e);
            if (!d.mo22547d() || !m21264J(((Long) d.mo22546c()).longValue())) {
                return e.mo17750d().longValue();
            }
            return ((Long) d.mo22546c()).longValue();
        }
        this.f17184c.mo17762k(e.mo17735a(), ((Long) w.mo22546c()).longValue());
        return ((Long) w.mo22546c()).longValue();
    }

    /* renamed from: D */
    public double mo17714D() {
        C5398r e = C5398r.m21375e();
        C7784g o = m21276o(e);
        if (o.mo22547d()) {
            double doubleValue = ((Double) o.mo22546c()).doubleValue() / 100.0d;
            if (m21265L(doubleValue)) {
                return doubleValue;
            }
        }
        C7784g v = m21279v(e);
        if (!v.mo22547d() || !m21265L(((Double) v.mo22546c()).doubleValue())) {
            C7784g c = m21269c(e);
            if (!c.mo22547d() || !m21265L(((Double) c.mo22546c()).doubleValue())) {
                return e.mo17751d().doubleValue();
            }
            return ((Double) c.mo22546c()).doubleValue();
        }
        this.f17184c.mo17761j(e.mo17735a(), ((Double) v.mo22546c()).doubleValue());
        return ((Double) v.mo22546c()).doubleValue();
    }

    /* renamed from: E */
    public long mo17715E() {
        C5399s e = C5399s.m21380e();
        C7784g w = m21280w(e);
        if (!w.mo22547d() || !m21262H(((Long) w.mo22546c()).longValue())) {
            C7784g d = m21270d(e);
            if (!d.mo22547d() || !m21262H(((Long) d.mo22546c()).longValue())) {
                return e.mo17752d().longValue();
            }
            return ((Long) d.mo22546c()).longValue();
        }
        this.f17184c.mo17762k(e.mo17735a(), ((Long) w.mo22546c()).longValue());
        return ((Long) w.mo22546c()).longValue();
    }

    /* renamed from: F */
    public long mo17716F() {
        C5400t e = C5400t.m21384e();
        C7784g w = m21280w(e);
        if (!w.mo22547d() || !m21262H(((Long) w.mo22546c()).longValue())) {
            C7784g d = m21270d(e);
            if (!d.mo22547d() || !m21262H(((Long) d.mo22546c()).longValue())) {
                return e.mo17753d().longValue();
            }
            return ((Long) d.mo22546c()).longValue();
        }
        this.f17184c.mo17762k(e.mo17735a(), ((Long) w.mo22546c()).longValue());
        return ((Long) w.mo22546c()).longValue();
    }

    /* renamed from: G */
    public double mo17717G() {
        C5401u e = C5401u.m21388e();
        C7784g v = m21279v(e);
        if (!v.mo22547d() || !m21265L(((Double) v.mo22546c()).doubleValue())) {
            C7784g c = m21269c(e);
            if (!c.mo22547d() || !m21265L(((Double) c.mo22546c()).doubleValue())) {
                return e.mo17754d().doubleValue();
            }
            return ((Double) c.mo22546c()).doubleValue();
        }
        this.f17184c.mo17761j(e.mo17735a(), ((Double) v.mo22546c()).doubleValue());
        return ((Double) v.mo22546c()).doubleValue();
    }

    /* renamed from: K */
    public boolean mo17718K() {
        Boolean j = mo17725j();
        if ((j == null || j.booleanValue()) && mo17726m()) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public void mo17719O(Context context) {
        f17180d.mo20811i(C7797n.m29503b(context));
        this.f17184c.mo17760i(context);
    }

    /* renamed from: P */
    public void mo17720P(C7783f fVar) {
        this.f17183b = fVar;
    }

    /* renamed from: a */
    public String mo17721a() {
        String f;
        C5385f e = C5385f.m21320e();
        if (C6397a.f19634a.booleanValue()) {
            return e.mo17739d();
        }
        String c = e.mo17736c();
        long j = -1;
        if (c != null) {
            j = ((Long) this.f17182a.getRemoteConfigValueOrDefault(c, -1L)).longValue();
        }
        String a = e.mo17735a();
        if (!C5385f.m21322g(j) || (f = C5385f.m21321f(j)) == null) {
            C7784g e2 = m21271e(e);
            if (e2.mo22547d()) {
                return (String) e2.mo22546c();
            }
            return e.mo17739d();
        }
        this.f17184c.mo17763l(a, f);
        return f;
    }

    /* renamed from: f */
    public double mo17722f() {
        C5384e e = C5384e.m21315e();
        C7784g o = m21276o(e);
        if (o.mo22547d()) {
            double doubleValue = ((Double) o.mo22546c()).doubleValue() / 100.0d;
            if (m21265L(doubleValue)) {
                return doubleValue;
            }
        }
        C7784g v = m21279v(e);
        if (!v.mo22547d() || !m21265L(((Double) v.mo22546c()).doubleValue())) {
            C7784g c = m21269c(e);
            if (!c.mo22547d() || !m21265L(((Double) c.mo22546c()).doubleValue())) {
                return e.mo17738d().doubleValue();
            }
            return ((Double) c.mo22546c()).doubleValue();
        }
        this.f17184c.mo17761j(e.mo17735a(), ((Double) v.mo22546c()).doubleValue());
        return ((Double) v.mo22546c()).doubleValue();
    }

    /* renamed from: h */
    public boolean mo17723h() {
        C5383d e = C5383d.m21310e();
        C7784g n = m21275n(e);
        if (n.mo22547d()) {
            return ((Boolean) n.mo22546c()).booleanValue();
        }
        C7784g u = m21278u(e);
        if (u.mo22547d()) {
            this.f17184c.mo17764m(e.mo17735a(), ((Boolean) u.mo22546c()).booleanValue());
            return ((Boolean) u.mo22546c()).booleanValue();
        }
        C7784g b = m21268b(e);
        if (b.mo22547d()) {
            return ((Boolean) b.mo22546c()).booleanValue();
        }
        return e.mo17737d().booleanValue();
    }

    /* renamed from: i */
    public Boolean mo17724i() {
        C5381b e = C5381b.m21304e();
        C7784g n = m21275n(e);
        if (n.mo22547d()) {
            return (Boolean) n.mo22546c();
        }
        return e.mo17734d();
    }

    /* renamed from: j */
    public Boolean mo17725j() {
        if (mo17724i().booleanValue()) {
            return Boolean.FALSE;
        }
        C5382c d = C5382c.m21307d();
        C7784g b = m21268b(d);
        if (b.mo22547d()) {
            return (Boolean) b.mo22546c();
        }
        C7784g n = m21275n(d);
        if (n.mo22547d()) {
            return (Boolean) n.mo22546c();
        }
        return null;
    }

    /* renamed from: m */
    public boolean mo17726m() {
        return m21273k() && !m21274l();
    }

    /* renamed from: q */
    public long mo17727q() {
        C5387g e = C5387g.m21326e();
        C7784g w = m21280w(e);
        if (!w.mo22547d() || !m21262H(((Long) w.mo22546c()).longValue())) {
            C7784g d = m21270d(e);
            if (!d.mo22547d() || !m21262H(((Long) d.mo22546c()).longValue())) {
                return e.mo17740d().longValue();
            }
            return ((Long) d.mo22546c()).longValue();
        }
        this.f17184c.mo17762k(e.mo17735a(), ((Long) w.mo22546c()).longValue());
        return ((Long) w.mo22546c()).longValue();
    }

    /* renamed from: r */
    public long mo17728r() {
        C5388h e = C5388h.m21330e();
        C7784g w = m21280w(e);
        if (!w.mo22547d() || !m21262H(((Long) w.mo22546c()).longValue())) {
            C7784g d = m21270d(e);
            if (!d.mo22547d() || !m21262H(((Long) d.mo22546c()).longValue())) {
                return e.mo17741d().longValue();
            }
            return ((Long) d.mo22546c()).longValue();
        }
        this.f17184c.mo17762k(e.mo17735a(), ((Long) w.mo22546c()).longValue());
        return ((Long) w.mo22546c()).longValue();
    }

    /* renamed from: s */
    public double mo17729s() {
        C5389i e = C5389i.m21334e();
        C7784g v = m21279v(e);
        if (!v.mo22547d() || !m21265L(((Double) v.mo22546c()).doubleValue())) {
            C7784g c = m21269c(e);
            if (!c.mo22547d() || !m21265L(((Double) c.mo22546c()).doubleValue())) {
                return e.mo17742d().doubleValue();
            }
            return ((Double) c.mo22546c()).doubleValue();
        }
        this.f17184c.mo17761j(e.mo17735a(), ((Double) v.mo22546c()).doubleValue());
        return ((Double) v.mo22546c()).doubleValue();
    }

    /* renamed from: t */
    public long mo17730t() {
        C5390j e = C5390j.m21338e();
        C7784g w = m21280w(e);
        if (!w.mo22547d() || !m21267N(((Long) w.mo22546c()).longValue())) {
            C7784g d = m21270d(e);
            if (!d.mo22547d() || !m21267N(((Long) d.mo22546c()).longValue())) {
                return e.mo17743d().longValue();
            }
            return ((Long) d.mo22546c()).longValue();
        }
        this.f17184c.mo17762k(e.mo17735a(), ((Long) w.mo22546c()).longValue());
        return ((Long) w.mo22546c()).longValue();
    }

    /* renamed from: y */
    public long mo17731y() {
        C5393m e = C5393m.m21350e();
        C7784g p = m21277p(e);
        if (p.mo22547d() && m21264J(((Long) p.mo22546c()).longValue())) {
            return ((Long) p.mo22546c()).longValue();
        }
        C7784g w = m21280w(e);
        if (!w.mo22547d() || !m21264J(((Long) w.mo22546c()).longValue())) {
            C7784g d = m21270d(e);
            if (!d.mo22547d() || !m21264J(((Long) d.mo22546c()).longValue())) {
                return e.mo17746d().longValue();
            }
            return ((Long) d.mo22546c()).longValue();
        }
        this.f17184c.mo17762k(e.mo17735a(), ((Long) w.mo22546c()).longValue());
        return ((Long) w.mo22546c()).longValue();
    }

    /* renamed from: z */
    public long mo17732z() {
        C5394n e = C5394n.m21355e();
        C7784g p = m21277p(e);
        if (p.mo22547d() && m21264J(((Long) p.mo22546c()).longValue())) {
            return ((Long) p.mo22546c()).longValue();
        }
        C7784g w = m21280w(e);
        if (!w.mo22547d() || !m21264J(((Long) w.mo22546c()).longValue())) {
            C7784g d = m21270d(e);
            if (!d.mo22547d() || !m21264J(((Long) d.mo22546c()).longValue())) {
                return e.mo17747d().longValue();
            }
            return ((Long) d.mo22546c()).longValue();
        }
        this.f17184c.mo17762k(e.mo17735a(), ((Long) w.mo22546c()).longValue());
        return ((Long) w.mo22546c()).longValue();
    }
}
