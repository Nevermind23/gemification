package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.common.api.Status;
import p143k6.C6823e;
import p156l6.C6933c;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.common.api.internal.b */
public abstract class C3871b extends BasePendingResult implements C6933c {

    /* renamed from: n */
    private final C3847a.C3850c f12324n;

    /* renamed from: o */
    private final C3847a f12325o;

    protected C3871b(C3847a aVar, C3860c cVar) {
        super((C3860c) C7264i.m27903l(cVar, "GoogleApiClient must not be null"));
        C7264i.m27903l(aVar, "Api must not be null");
        this.f12324n = aVar.mo11914b();
        this.f12325o = aVar;
    }

    /* renamed from: u */
    private void m14596u(RemoteException remoteException) {
        mo12012v(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo12007p(C3847a.C3849b bVar);

    /* renamed from: q */
    public final C3847a mo12008q() {
        return this.f12325o;
    }

    /* renamed from: r */
    public final C3847a.C3850c mo12009r() {
        return this.f12324n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo12010s(C6823e eVar) {
    }

    /* renamed from: t */
    public final void mo12011t(C3847a.C3849b bVar) {
        try {
            mo12007p(bVar);
        } catch (DeadObjectException e) {
            m14596u(e);
            throw e;
        } catch (RemoteException e2) {
            m14596u(e2);
        }
    }

    /* renamed from: v */
    public final void mo12012v(Status status) {
        C7264i.m27893b(!status.mo11905q0(), "Failed result must not be success");
        C6823e e = mo11973e(status);
        mo11977i(e);
        mo12010s(e);
    }
}
