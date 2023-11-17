package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.common.api.internal.l1 */
final class C3907l1 implements Runnable {

    /* renamed from: d */
    private final C3901j1 f12480d;

    /* renamed from: e */
    final /* synthetic */ C3910m1 f12481e;

    C3907l1(C3910m1 m1Var, C3901j1 j1Var) {
        this.f12481e = m1Var;
        this.f12480d = j1Var;
    }

    public final void run() {
        if (this.f12481e.f12486e) {
            ConnectionResult b = this.f12480d.mo12109b();
            if (b.mo11853R()) {
                C3910m1 m1Var = this.f12481e;
                m1Var.f12316d.startActivityForResult(GoogleApiActivity.m14489a(m1Var.mo11983b(), (PendingIntent) C7264i.m27902k(b.mo11861x()), this.f12480d.mo12108a(), false), 1);
                return;
            }
            C3910m1 m1Var2 = this.f12481e;
            if (m1Var2.f12489h.mo11869d(m1Var2.mo11983b(), b.mo11858v(), (String) null) != null) {
                C3910m1 m1Var3 = this.f12481e;
                m1Var3.f12489h.mo11885z(m1Var3.mo11983b(), this.f12481e.f12316d, b.mo11858v(), 2, this.f12481e);
            } else if (b.mo11858v() == 18) {
                C3910m1 m1Var4 = this.f12481e;
                Dialog u = m1Var4.f12489h.mo11880u(m1Var4.mo11983b(), this.f12481e);
                C3910m1 m1Var5 = this.f12481e;
                m1Var5.f12489h.mo11881v(m1Var5.mo11983b().getApplicationContext(), new C3904k1(this, u));
            } else {
                this.f12481e.m14834l(b, this.f12480d.mo12108a());
            }
        }
    }
}
