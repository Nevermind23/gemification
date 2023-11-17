package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C3877d;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p183n7.C7338y;

/* renamed from: com.google.android.gms.internal.location.f */
final class C4078f extends C7338y {

    /* renamed from: b */
    private final C3877d f13088b;

    C4078f(C3877d dVar) {
        this.f13088b = dVar;
    }

    /* renamed from: E0 */
    public final void mo12794E0(LocationAvailability locationAvailability) {
        this.f13088b.mo12043c(new C4077e(this, locationAvailability));
    }

    /* renamed from: X1 */
    public final void mo12795X1(LocationResult locationResult) {
        this.f13088b.mo12043c(new C4076d(this, locationResult));
    }

    /* renamed from: s */
    public final synchronized void mo12796s() {
        this.f13088b.mo12041a();
    }
}
