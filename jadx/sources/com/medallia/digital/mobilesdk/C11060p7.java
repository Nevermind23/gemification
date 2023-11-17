package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11164w3;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.p7 */
class C11060p7 extends C10717a2<Long> implements C11164w3.C11172h, C11164w3.C11171g {

    /* renamed from: g */
    private Long f31807g = Long.valueOf(System.currentTimeMillis());

    protected C11060p7(C11083s0 s0Var) {
        super(s0Var);
    }

    /* renamed from: p */
    private Long m40562p() {
        if (this.f31807g != null) {
            return Long.valueOf(System.currentTimeMillis() - this.f31807g.longValue());
        }
        return null;
    }

    /* renamed from: a */
    public void mo28658a(long j) {
        this.f31807g = Long.valueOf(this.f31807g.longValue() + j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32178M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo28067l() {
        super.mo28067l();
        try {
            C11164w3.m40939b().mo29112a((C11164w3.C11171g) this);
            C11164w3.m40939b().mo29113a((C11164w3.C11172h) this);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo28068m() {
        super.mo28068m();
        try {
            C11164w3.m40939b().mo29116b((C11164w3.C11171g) this);
            C11164w3.m40939b().mo29117b((C11164w3.C11172h) this);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Long mo28065j() {
        return mo28863f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C10802f0 mo28917o() {
        return new C10802f0(mo28863f().toString(), GroupType.collector, mo28950d(), mo28329g(), mo28951e());
    }

    public void onBackground() {
        mo28117a(mo28863f());
    }

    public void onForeground() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public Long mo28863f() {
        Long p = m40562p();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > Time in foreground: %d", new Object[]{p}));
        return p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo28919r() {
        this.f31807g = Long.valueOf(System.currentTimeMillis());
    }
}
