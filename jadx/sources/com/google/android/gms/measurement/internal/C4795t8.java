package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4117bd;
import com.medallia.digital.mobilesdk.C10749b8;

/* renamed from: com.google.android.gms.measurement.internal.t8 */
final class C4795t8 {

    /* renamed from: a */
    protected long f14925a;

    /* renamed from: b */
    protected long f14926b;

    /* renamed from: c */
    private final C4720n f14927c;

    /* renamed from: d */
    final /* synthetic */ C4817v8 f14928d;

    public C4795t8(C4817v8 v8Var) {
        this.f14928d = v8Var;
        this.f14927c = new C4784s8(this, v8Var.f14613a);
        long c = v8Var.f14613a.mo14548a().mo23596c();
        this.f14925a = c;
        this.f14926b = c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14917a() {
        this.f14927c.mo14611b();
        this.f14925a = 0;
        this.f14926b = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14918b(long j) {
        this.f14927c.mo14611b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo14919c(long j) {
        this.f14928d.mo14554h();
        this.f14927c.mo14611b();
        this.f14925a = j;
        this.f14926b = j;
    }

    /* renamed from: d */
    public final boolean mo14920d(boolean z, boolean z2, long j) {
        this.f14928d.mo14554h();
        this.f14928d.mo14922i();
        C4117bd.m15605c();
        if (!this.f14928d.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14375h0)) {
            this.f14928d.f14613a.mo14849F().f14271o.mo14296b(this.f14928d.f14613a.mo14548a().mo23594a());
        } else if (this.f14928d.f14613a.mo14869o()) {
            this.f14928d.f14613a.mo14849F().f14271o.mo14296b(this.f14928d.f14613a.mo14548a().mo23594a());
        }
        long j2 = j - this.f14925a;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.f14926b;
                this.f14926b = j;
            }
            this.f14928d.f14613a.mo14551d().mo14679v().mo14616b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C4785s9.m18233y(this.f14928d.f14613a.mo14853K().mo14369s(!this.f14928d.f14613a.mo14876z().mo14400D()), bundle, true);
            if (!z2) {
                this.f14928d.f14613a.mo14851I().mo14910u("auto", "_e", bundle);
            }
            this.f14925a = j;
            this.f14927c.mo14611b();
            this.f14927c.mo14613d(C10749b8.C10751b.f30744c);
            return true;
        }
        this.f14928d.f14613a.mo14551d().mo14679v().mo14616b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }
}
