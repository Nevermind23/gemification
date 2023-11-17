package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.x3 */
final class C4834x3 extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4719m9 f15006a;

    /* renamed from: b */
    private boolean f15007b;

    /* renamed from: c */
    private boolean f15008c;

    C4834x3(C4719m9 m9Var) {
        C7264i.m27902k(m9Var);
        this.f15006a = m9Var;
    }

    /* renamed from: b */
    public final void mo14954b() {
        this.f15006a.mo14586g();
        this.f15006a.mo14552f().mo14554h();
        if (!this.f15007b) {
            this.f15006a.mo14550c().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f15008c = this.f15006a.mo14579Y().mo14935m();
            this.f15006a.mo14551d().mo14679v().mo14616b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f15008c));
            this.f15007b = true;
        }
    }

    /* renamed from: c */
    public final void mo14955c() {
        this.f15006a.mo14586g();
        this.f15006a.mo14552f().mo14554h();
        this.f15006a.mo14552f().mo14554h();
        if (this.f15007b) {
            this.f15006a.mo14551d().mo14679v().mo14615a("Unregistering connectivity change receiver");
            this.f15007b = false;
            this.f15008c = false;
            try {
                this.f15006a.mo14550c().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f15006a.mo14551d().mo14675r().mo14616b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f15006a.mo14586g();
        String action = intent.getAction();
        this.f15006a.mo14551d().mo14679v().mo14616b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean m = this.f15006a.mo14579Y().mo14935m();
            if (this.f15008c != m) {
                this.f15008c = m;
                this.f15006a.mo14552f().mo14776z(new C4823w3(this, m));
                return;
            }
            return;
        }
        this.f15006a.mo14551d().mo14680w().mo14616b("NetworkBroadcastReceiver received unknown action", action);
    }
}
