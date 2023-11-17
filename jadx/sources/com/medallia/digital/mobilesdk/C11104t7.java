package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.medallia.digital.mobilesdk.t7 */
class C11104t7 extends C10845h0 {

    /* renamed from: a */
    private C11104t7 f31940a;

    /* renamed from: b */
    private final BroadcastReceiver f31941b = new C11105a();

    /* renamed from: com.medallia.digital.mobilesdk.t7$a */
    class C11105a extends BroadcastReceiver {
        C11105a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && C11104t7.this.mo28074a().equals(intent.getAction())) {
                try {
                    C11104t7.this.m40728a(intent.getStringExtra("com.medallia.digital.mobilesdk.extra_data"));
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
        }
    }

    C11104t7() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28074a() {
        return "com.medallia.digital.mobilesdk.tre_action";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo28076b() {
        return this.f31940a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public BroadcastReceiver mo28077c() {
        return this.f31941b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28075a(Object obj) {
        if (this.f31940a != null && obj == null) {
            mo28388e();
        }
        if (obj instanceof C11104t7) {
            this.f31940a = (C11104t7) obj;
        }
        mo28387d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40728a(String str) {
        AnalyticsBridge.getInstance().reportExtraDataEvent((String) null, (String) null, (String) null, str);
    }
}
