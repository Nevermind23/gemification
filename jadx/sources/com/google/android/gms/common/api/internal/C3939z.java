package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3860c;
import p156l6.C6960p;
import p182n6.C7249c;
import p182n6.C7264i;
import p274u7.C8645e;

/* renamed from: com.google.android.gms.common.api.internal.z */
final class C3939z implements C3860c.C3862b, C3860c.C3863c {

    /* renamed from: b */
    final /* synthetic */ C3872b0 f12552b;

    /* synthetic */ C3939z(C3872b0 b0Var, C6960p pVar) {
        this.f12552b = b0Var;
    }

    /* renamed from: k */
    public final void mo12102k(Bundle bundle) {
        C7249c cVar = (C7249c) C7264i.m27902k(this.f12552b.f12343r);
        ((C8645e) C7264i.m27902k(this.f12552b.f12336k)).mo14998j(new C3937y(this.f12552b));
    }

    /* renamed from: x */
    public final void mo12107x(int i) {
    }

    /* renamed from: y */
    public final void mo12084y(ConnectionResult connectionResult) {
        this.f12552b.f12327b.lock();
        try {
            if (this.f12552b.m14620p(connectionResult)) {
                this.f12552b.m14612h();
                this.f12552b.m14617m();
            } else {
                this.f12552b.m14615k(connectionResult);
            }
        } finally {
            this.f12552b.f12327b.unlock();
        }
    }
}
