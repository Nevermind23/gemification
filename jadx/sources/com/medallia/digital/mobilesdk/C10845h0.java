package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: com.medallia.digital.mobilesdk.h0 */
abstract class C10845h0 {
    C10845h0() {
    }

    /* renamed from: a */
    private void m39575a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        mo28388e();
        C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28627a(broadcastReceiver, intentFilter);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo28074a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28075a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo28076b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract BroadcastReceiver mo28077c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo28387d() {
        if (C10884i4.m39721c().mo28483b() != null) {
            m39575a(mo28077c(), new IntentFilter(mo28074a()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo28388e() {
        try {
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28626a(mo28077c());
        } catch (Exception e) {
            C10735b4.m39114f(e.getMessage());
        }
    }
}
