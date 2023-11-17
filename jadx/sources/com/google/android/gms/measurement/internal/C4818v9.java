package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C4275l1;
import p248s7.C8266t;

/* renamed from: com.google.android.gms.measurement.internal.v9 */
final class C4818v9 implements C8266t {

    /* renamed from: a */
    public final C4275l1 f14979a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f14980b;

    C4818v9(AppMeasurementDynamiteService appMeasurementDynamiteService, C4275l1 l1Var) {
        this.f14980b = appMeasurementDynamiteService;
        this.f14979a = l1Var;
    }

    /* renamed from: a */
    public final void mo14941a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f14979a.mo13274C(str, str2, bundle, j);
        } catch (RemoteException e) {
            C4791t4 t4Var = this.f14980b.f14177b;
            if (t4Var != null) {
                t4Var.mo14551d().mo14680w().mo14616b("Event interceptor threw exception", e);
            }
        }
    }
}
