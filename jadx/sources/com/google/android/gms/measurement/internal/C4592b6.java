package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.b6 */
final class C4592b6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ Bundle f14225d;

    /* renamed from: e */
    final /* synthetic */ C4793t6 f14226e;

    C4592b6(C4793t6 t6Var, Bundle bundle) {
        this.f14226e = t6Var;
        this.f14225d = bundle;
    }

    public final void run() {
        C4793t6 t6Var = this.f14226e;
        Bundle bundle = this.f14225d;
        t6Var.mo14554h();
        t6Var.mo14922i();
        C7264i.m27902k(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C7264i.m27898g(string);
        C7264i.m27898g(string2);
        C7264i.m27902k(bundle.get(C11755a.C11756a.f34100b));
        if (!t6Var.f14613a.mo14869o()) {
            t6Var.f14613a.mo14551d().mo14679v().mo14615a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzlj zzlj = new zzlj(string, bundle.getLong("triggered_timestamp"), bundle.get(C11755a.C11756a.f34100b), string2);
        try {
            zzaw y0 = t6Var.f14613a.mo14856N().mo14839y0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, true);
            zzaw y02 = t6Var.f14613a.mo14856N().mo14839y0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, true);
            zzaw y03 = t6Var.f14613a.mo14856N().mo14839y0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, true);
            t6Var.f14613a.mo14854L().mo14389s(new zzac(bundle.getString("app_id"), string2, zzlj, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), y02, bundle.getLong("trigger_timeout"), y0, bundle.getLong("time_to_live"), y03));
        } catch (IllegalArgumentException unused) {
        }
    }
}
