package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11164w3;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.o7 */
class C11039o7 extends C10717a2<Long> implements C11164w3.C11171g {
    protected C11039o7(C11083s0 s0Var) {
        super(s0Var);
    }

    /* renamed from: a */
    public void mo28658a(long j) {
        mo28117a(Long.valueOf(j));
        C10735b4.m39109b(String.format(Locale.US, "Collectors > Time in background was: %d", new Object[]{Long.valueOf(j)}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32177L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo28067l() {
        super.mo28067l();
        try {
            C11164w3.m40939b().mo29112a((C11164w3.C11171g) this);
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
    public Long mo28863f() {
        if (super.mo28863f() == null) {
            return 0L;
        }
        return (Long) super.mo28863f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo28866p() {
        mo28117a(0L);
    }
}
