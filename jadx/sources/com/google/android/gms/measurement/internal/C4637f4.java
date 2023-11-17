package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.C4393s0;
import com.google.android.gms.internal.measurement.C4410t0;

/* renamed from: com.google.android.gms.measurement.internal.f4 */
public final class C4637f4 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f14412a;

    /* renamed from: b */
    final /* synthetic */ C4648g4 f14413b;

    C4637f4(C4648g4 g4Var, String str) {
        this.f14413b = g4Var;
        this.f14412a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                C4410t0 x = C4393s0.m16613x(iBinder);
                if (x == null) {
                    this.f14413b.f14446a.mo14551d().mo14680w().mo14615a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f14413b.f14446a.mo14551d().mo14679v().mo14615a("Install Referrer Service connected");
                this.f14413b.f14446a.mo14552f().mo14776z(new C4626e4(this, x, this));
            } catch (RuntimeException e) {
                this.f14413b.f14446a.mo14551d().mo14680w().mo14616b("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            this.f14413b.f14446a.mo14551d().mo14680w().mo14615a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f14413b.f14446a.mo14551d().mo14679v().mo14615a("Install Referrer Service disconnected");
    }
}
