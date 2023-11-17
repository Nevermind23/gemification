package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.C3857b;
import com.google.android.gms.common.api.internal.C3877d;
import com.google.android.gms.common.api.internal.C3882e;
import com.google.android.gms.common.api.internal.C3888g;
import com.google.android.gms.common.api.internal.C3892h;
import com.google.android.gms.internal.location.zzbf;
import p183n7.C7308g;
import p183n7.C7310h;
import p183n7.C7318l;
import p183n7.C7320m;
import p183n7.C7322n;
import p337z7.Task;

/* renamed from: com.google.android.gms.location.a */
public class C4527a extends C3857b {
    public C4527a(Context context) {
        super(context, C7310h.f21507a, (C3847a.C3851d) C3847a.C3851d.f12268T2, C3857b.C3858a.f12279c);
    }

    /* renamed from: E */
    private final Task m17382E(zzbf zzbf, C3877d dVar) {
        C4531e eVar = new C4531e(this, dVar);
        return mo11937m(C3888g.m14719a().mo12064b(new C4530d(this, eVar, dVar, zzbf)).mo12066d(eVar).mo12067e(dVar).mo12065c(2436).mo12063a());
    }

    /* renamed from: A */
    public Task mo13979A() {
        return mo11936l(C3892h.m14753a().mo12078b(new C7322n(this)).mo12081e(2414).mo12077a());
    }

    /* renamed from: B */
    public Task mo13980B(C7308g gVar) {
        return mo11939o(C3882e.m14700b(gVar, C7308g.class.getSimpleName()), 2418).mo24865j(C7320m.f21515d, C7318l.f21514a);
    }

    /* renamed from: C */
    public Task mo13981C(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return mo11941q(C3892h.m14753a().mo12078b(new C4528b(zzbf.m15462v((String) null, locationRequest), pendingIntent)).mo12081e(2417).mo12077a());
    }

    /* renamed from: D */
    public Task mo13982D(LocationRequest locationRequest, C7308g gVar, Looper looper) {
        zzbf v = zzbf.m15462v((String) null, locationRequest);
        if (looper != null || (looper = Looper.myLooper()) != null) {
            return m17382E(v, C3882e.m14699a(gVar, looper, C7308g.class.getSimpleName()));
        }
        throw new IllegalStateException();
    }
}
