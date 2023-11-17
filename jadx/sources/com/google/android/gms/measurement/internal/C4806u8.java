package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C4337oc;
import com.google.android.gms.internal.measurement.C4356pe;
import com.salesforce.marketingcloud.notifications.NotificationMessage;

/* renamed from: com.google.android.gms.measurement.internal.u8 */
final class C4806u8 {

    /* renamed from: a */
    final /* synthetic */ C4817v8 f14953a;

    C4806u8(C4817v8 v8Var) {
        this.f14953a = v8Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14930a() {
        this.f14953a.mo14554h();
        if (this.f14953a.f14613a.mo14849F().mo14337v(this.f14953a.f14613a.mo14548a().mo23594a())) {
            this.f14953a.f14613a.mo14849F().f14268l.mo14962a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f14953a.f14613a.mo14551d().mo14679v().mo14615a("Detected application was in foreground");
                mo14932c(this.f14953a.f14613a.mo14548a().mo23594a(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14931b(long j, boolean z) {
        this.f14953a.mo14554h();
        this.f14953a.m18405s();
        if (this.f14953a.f14613a.mo14849F().mo14337v(j)) {
            this.f14953a.f14613a.mo14849F().f14268l.mo14962a(true);
            C4356pe.m16469c();
            if (this.f14953a.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14391p0)) {
                this.f14953a.f14613a.mo14845B().mo14449v();
            }
        }
        this.f14953a.f14613a.mo14849F().f14271o.mo14296b(j);
        if (this.f14953a.f14613a.mo14849F().f14268l.mo14963b()) {
            mo14932c(j, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo14932c(long j, boolean z) {
        this.f14953a.mo14554h();
        if (this.f14953a.f14613a.mo14869o()) {
            this.f14953a.f14613a.mo14849F().f14271o.mo14296b(j);
            this.f14953a.f14613a.mo14551d().mo14679v().mo14616b("Session started, time", Long.valueOf(this.f14953a.f14613a.mo14548a().mo23596c()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f14953a.f14613a.mo14851I().mo14890M("auto", NotificationMessage.NOTIF_KEY_SID, valueOf, j);
            this.f14953a.f14613a.mo14849F().f14272p.mo14296b(valueOf.longValue());
            this.f14953a.f14613a.mo14849F().f14268l.mo14962a(false);
            Bundle bundle = new Bundle();
            bundle.putLong(NotificationMessage.NOTIF_KEY_SID, valueOf.longValue());
            if (this.f14953a.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14367d0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f14953a.f14613a.mo14851I().mo14911v("auto", "_s", j, bundle);
            C4337oc.m16389c();
            if (this.f14953a.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14373g0)) {
                String a = this.f14953a.f14613a.mo14849F().f14277u.mo14319a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f14953a.f14613a.mo14851I().mo14911v("auto", "_ssr", j, bundle2);
                }
            }
        }
    }
}
