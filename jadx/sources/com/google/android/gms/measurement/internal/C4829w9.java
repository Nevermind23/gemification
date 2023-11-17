package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C4275l1;
import p248s7.C8267u;

/* renamed from: com.google.android.gms.measurement.internal.w9 */
final class C4829w9 implements C8267u {

    /* renamed from: a */
    public final C4275l1 f14998a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f14999b;

    C4829w9(AppMeasurementDynamiteService appMeasurementDynamiteService, C4275l1 l1Var) {
        this.f14999b = appMeasurementDynamiteService;
        this.f14998a = l1Var;
    }

    /* renamed from: a */
    public final void mo14950a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f14998a.mo13274C(str, str2, bundle, j);
        } catch (RemoteException e) {
            C4791t4 t4Var = this.f14999b.f14177b;
            if (t4Var != null) {
                t4Var.mo14551d().mo14680w().mo14616b("Event listener threw exception", e);
            }
        }
    }
}
