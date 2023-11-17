package com.google.android.gms.measurement.internal;

import p286v6.C8707d;
import p286v6.C8708e;

/* renamed from: com.google.android.gms.measurement.internal.g4 */
public final class C4648g4 {

    /* renamed from: a */
    final C4791t4 f14446a;

    C4648g4(C4719m9 m9Var) {
        this.f14446a = m9Var.mo14582c0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo14436a() {
        try {
            C8707d a = C8708e.m32461a(this.f14446a.mo14550c());
            if (a == null) {
                this.f14446a.mo14551d().mo14679v().mo14615a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a.mo24091e("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.f14446a.mo14551d().mo14679v().mo14616b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
