package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzaa;
import p118i7.C6592d;
import p182n6.C7245a;
import p337z7.C9227g;

/* renamed from: com.google.android.gms.location.f */
final class C4532f extends C6592d {

    /* renamed from: b */
    final /* synthetic */ C9227g f13969b;

    C4532f(C4527a aVar, C9227g gVar) {
        this.f13969b = gVar;
    }

    /* renamed from: s */
    public final void mo13984s() {
    }

    /* renamed from: w2 */
    public final void mo13985w2(zzaa zzaa) {
        Status status = zzaa.getStatus();
        if (status == null) {
            this.f13969b.mo24886d(new ApiException(new Status(8, "Got null status from location service")));
        } else if (status.mo11911x() == 0) {
            this.f13969b.mo24885c(Boolean.TRUE);
        } else {
            this.f13969b.mo24886d(C7245a.m27851a(status));
        }
    }
}
