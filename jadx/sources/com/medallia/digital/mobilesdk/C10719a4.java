package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.medallia.digital.mobilesdk.a4 */
class C10719a4 extends C10845h0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public MDCallback f30627a;

    /* renamed from: b */
    private final BroadcastReceiver f30628b = new C10720a();

    /* renamed from: com.medallia.digital.mobilesdk.a4$a */
    class C10720a extends BroadcastReceiver {
        C10720a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "com.medallia.digital.mobilesdk.localization_action".equals(intent.getAction()) && C10719a4.this.f30627a != null) {
                MDExternalError mDExternalError = (MDExternalError) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_error");
                String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_success");
                if (mDExternalError != null) {
                    C10719a4.this.f30627a.onError(mDExternalError);
                } else {
                    C10719a4.this.f30627a.onSuccess(stringExtra);
                }
            }
        }
    }

    C10719a4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo28076b() {
        return this.f30627a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public BroadcastReceiver mo28077c() {
        return this.f30628b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28074a() {
        return "com.medallia.digital.mobilesdk.localization_action";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28075a(Object obj) {
        if (this.f30627a != null && obj == null) {
            mo28388e();
        }
        if (obj instanceof MDCallback) {
            this.f30627a = (MDCallback) obj;
        }
    }
}
