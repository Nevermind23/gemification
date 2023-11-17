package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.support.p013v4.media.session.C0125b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Set;
import p156l6.C6964r;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.common.api.internal.q */
public final class C3920q implements C6964r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3900j0 f12511a;

    /* renamed from: b */
    private boolean f12512b = false;

    public C3920q(C3900j0 j0Var) {
        this.f12511a = j0Var;
    }

    /* renamed from: a */
    public final void mo12013a(Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo12014b() {
    }

    /* renamed from: c */
    public final void mo12015c() {
        if (this.f12512b) {
            this.f12512b = false;
            this.f12511a.mo12105n(new C3917p(this, this));
        }
    }

    /* renamed from: d */
    public final void mo12016d(ConnectionResult connectionResult, C3847a aVar, boolean z) {
    }

    /* renamed from: e */
    public final void mo12017e(int i) {
        this.f12511a.mo12104m((ConnectionResult) null);
        this.f12511a.f12469p.mo12069b(i, this.f12512b);
    }

    /* renamed from: f */
    public final boolean mo12018f() {
        if (this.f12512b) {
            return false;
        }
        Set set = this.f12511a.f12468o.f12422w;
        if (set == null || set.isEmpty()) {
            this.f12511a.mo12104m((ConnectionResult) null);
            return true;
        }
        this.f12512b = true;
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return false;
        }
        C0125b.m366a(it.next());
        throw null;
    }

    /* renamed from: g */
    public final C3871b mo12019g(C3871b bVar) {
        try {
            this.f12511a.f12468o.f12423x.mo12020a(bVar);
            C3890g0 g0Var = this.f12511a.f12468o;
            C3847a.C3855f fVar = (C3847a.C3855f) g0Var.f12414o.get(bVar.mo12009r());
            C7264i.m27903l(fVar, "Appropriate Api was not requested.");
            if (fVar.mo11919c() || !this.f12511a.f12461h.containsKey(bVar.mo12009r())) {
                bVar.mo12011t(fVar);
            } else {
                bVar.mo12012v(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f12511a.mo12105n(new C3914o(this, this));
        }
        return bVar;
    }
}
