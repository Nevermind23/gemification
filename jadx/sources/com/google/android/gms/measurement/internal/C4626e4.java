package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4410t0;
import com.google.android.gms.internal.measurement.C4458ve;
import p247s6.C8242b;

/* renamed from: com.google.android.gms.measurement.internal.e4 */
final class C4626e4 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C4410t0 f14307d;

    /* renamed from: e */
    final /* synthetic */ ServiceConnection f14308e;

    /* renamed from: f */
    final /* synthetic */ C4637f4 f14309f;

    C4626e4(C4637f4 f4Var, C4410t0 t0Var, ServiceConnection serviceConnection) {
        this.f14309f = f4Var;
        this.f14307d = t0Var;
        this.f14308e = serviceConnection;
    }

    public final void run() {
        Bundle bundle;
        C4637f4 f4Var = this.f14309f;
        C4648g4 g4Var = f4Var.f14413b;
        String a = f4Var.f14412a;
        C4410t0 t0Var = this.f14307d;
        ServiceConnection serviceConnection = this.f14308e;
        g4Var.f14446a.mo14552f().mo14554h();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", a);
        try {
            bundle = t0Var.mo13514P1(bundle2);
            if (bundle == null) {
                g4Var.f14446a.mo14551d().mo14675r().mo14615a("Install Referrer Service returned a null response");
                bundle = null;
            }
        } catch (Exception e) {
            g4Var.f14446a.mo14551d().mo14675r().mo14616b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        g4Var.f14446a.mo14552f().mo14554h();
        C4791t4.m18290t();
        if (bundle != null) {
            long j = bundle.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                g4Var.f14446a.mo14551d().mo14680w().mo14615a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    g4Var.f14446a.mo14551d().mo14675r().mo14615a("No referrer defined in Install Referrer response");
                } else {
                    g4Var.f14446a.mo14551d().mo14679v().mo14616b("InstallReferrer API result", string);
                    C4785s9 N = g4Var.f14446a.mo14856N();
                    Uri parse = Uri.parse("?".concat(string));
                    C4458ve.m17074c();
                    Bundle v0 = N.mo14834v0(parse, g4Var.f14446a.mo14876z().mo14398B((String) null, C4636f3.f14409y0));
                    if (v0 == null) {
                        g4Var.f14446a.mo14551d().mo14675r().mo14615a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = v0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                g4Var.f14446a.mo14551d().mo14675r().mo14615a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                v0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == g4Var.f14446a.mo14849F().f14262f.mo14295a()) {
                            g4Var.f14446a.mo14551d().mo14679v().mo14615a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (g4Var.f14446a.mo14869o()) {
                            g4Var.f14446a.mo14849F().f14262f.mo14296b(j);
                            g4Var.f14446a.mo14551d().mo14679v().mo14616b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            v0.putString("_cis", "referrer API v2");
                            g4Var.f14446a.mo14851I().mo14909t("auto", "_cmp", v0, a);
                        }
                    }
                }
            }
        }
        C8242b.m31044b().mo23426c(g4Var.f14446a.mo14550c(), serviceConnection);
    }
}
