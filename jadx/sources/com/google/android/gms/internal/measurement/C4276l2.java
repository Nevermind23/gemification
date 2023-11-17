package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import p182n6.C7264i;
import p299w6.C8862d;

/* renamed from: com.google.android.gms.internal.measurement.l2 */
final class C4276l2 extends C4242j2 {

    /* renamed from: h */
    final /* synthetic */ Bundle f13448h;

    /* renamed from: i */
    final /* synthetic */ Activity f13449i;

    /* renamed from: j */
    final /* synthetic */ C4412t2 f13450j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4276l2(C4412t2 t2Var, Bundle bundle, Activity activity) {
        super(t2Var.f13683d, true);
        this.f13450j = t2Var;
        this.f13448h = bundle;
        this.f13449i = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12836a() {
        Bundle bundle;
        if (this.f13448h != null) {
            bundle = new Bundle();
            if (this.f13448h.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f13448h.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((C4173f1) C7264i.m27902k(this.f13450j.f13683d.f13726i)).onActivityCreated(C8862d.m32984T1(this.f13449i), bundle, this.f13362e);
    }
}
