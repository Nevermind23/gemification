package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.ArraySet;
import com.google.android.gms.common.C3846a;
import com.google.android.gms.common.ConnectionResult;
import p156l6.C6931b;
import p156l6.C6942g;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.common.api.internal.n */
public final class C3911n extends C3910m1 {

    /* renamed from: i */
    private final ArraySet f12490i = new ArraySet();

    /* renamed from: j */
    private final C3874c f12491j;

    C3911n(C6942g gVar, C3874c cVar, C3846a aVar) {
        super(gVar, aVar);
        this.f12491j = cVar;
        this.f12316d.mo21087i("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: u */
    public static void m14847u(Activity activity, C3874c cVar, C6931b bVar) {
        C6942g c = LifecycleCallback.m14577c(activity);
        C3911n nVar = (C3911n) c.mo21086H("ConnectionlessLifecycleHelper", C3911n.class);
        if (nVar == null) {
            nVar = new C3911n(c, cVar, C3846a.m14468q());
        }
        C7264i.m27903l(bVar, "ApiKey cannot be null");
        nVar.f12490i.add(bVar);
        cVar.mo12030d(nVar);
    }

    /* renamed from: v */
    private final void m14848v() {
        if (!this.f12490i.isEmpty()) {
            this.f12491j.mo12030d(this);
        }
    }

    /* renamed from: h */
    public final void mo11987h() {
        super.mo11987h();
        m14848v();
    }

    /* renamed from: j */
    public final void mo11989j() {
        super.mo11989j();
        m14848v();
    }

    /* renamed from: k */
    public final void mo11990k() {
        super.mo11990k();
        this.f12491j.mo12031e(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo12088m(ConnectionResult connectionResult, int i) {
        this.f12491j.mo12027J(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo12089n() {
        this.f12491j.mo12028b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final ArraySet mo12122t() {
        return this.f12490i;
    }
}
