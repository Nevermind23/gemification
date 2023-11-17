package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.C4088a1;

/* renamed from: com.google.android.gms.measurement.internal.v8 */
public final class C4817v8 extends C4801u3 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f14975c;

    /* renamed from: d */
    protected final C4806u8 f14976d = new C4806u8(this);

    /* renamed from: e */
    protected final C4795t8 f14977e = new C4795t8(this);

    /* renamed from: f */
    protected final C4773r8 f14978f = new C4773r8(this);

    C4817v8(C4791t4 t4Var) {
        super(t4Var);
    }

    /* renamed from: q */
    static /* bridge */ /* synthetic */ void m18403q(C4817v8 v8Var, long j) {
        v8Var.mo14554h();
        v8Var.m18405s();
        v8Var.f14613a.mo14551d().mo14679v().mo14616b("Activity paused, time", Long.valueOf(j));
        v8Var.f14978f.mo14778a(j);
        if (v8Var.f14613a.mo14876z().mo14400D()) {
            v8Var.f14977e.mo14918b(j);
        }
    }

    /* renamed from: r */
    static /* bridge */ /* synthetic */ void m18404r(C4817v8 v8Var, long j) {
        v8Var.mo14554h();
        v8Var.m18405s();
        v8Var.f14613a.mo14551d().mo14679v().mo14616b("Activity resumed, time", Long.valueOf(j));
        if (v8Var.f14613a.mo14876z().mo14400D() || v8Var.f14613a.mo14849F().f14274r.mo14963b()) {
            v8Var.f14977e.mo14919c(j);
        }
        v8Var.f14978f.mo14779b();
        C4806u8 u8Var = v8Var.f14976d;
        u8Var.f14953a.mo14554h();
        if (u8Var.f14953a.f14613a.mo14869o()) {
            u8Var.mo14931b(u8Var.f14953a.f14613a.mo14548a().mo23594a(), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final void m18405s() {
        mo14554h();
        if (this.f14975c == null) {
            this.f14975c = new C4088a1(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo14367n() {
        return false;
    }
}
