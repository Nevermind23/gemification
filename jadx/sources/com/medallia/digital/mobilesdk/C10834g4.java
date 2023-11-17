package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.medallia.digital.mobilesdk.g4 */
class C10834g4 extends C10845h0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C10893i8 f31017a;

    /* renamed from: b */
    private final BroadcastReceiver f31018b = new C10835a();

    /* renamed from: com.medallia.digital.mobilesdk.g4$a */
    class C10835a extends BroadcastReceiver {

        /* renamed from: com.medallia.digital.mobilesdk.g4$a$a */
        class C10836a extends C11033o4 {

            /* renamed from: a */
            final /* synthetic */ Intent f31020a;

            C10836a(Intent intent) {
                this.f31020a = intent;
            }

            /* renamed from: a */
            public void mo27617a() {
                Intent intent = this.f31020a;
                if (intent != null && "com.medallia.digital.mobilesdk.sync_userjourney_action".equals(intent.getAction()) && C10834g4.this.f31017a != null) {
                    C10834g4.this.f31017a.mo28498a();
                }
            }
        }

        C10835a() {
        }

        public void onReceive(Context context, Intent intent) {
            C11004m7.m40304b().mo28763a().execute(new C10836a(intent));
        }
    }

    C10834g4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo28076b() {
        return this.f31017a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public BroadcastReceiver mo28077c() {
        return this.f31018b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28074a() {
        return "com.medallia.digital.mobilesdk.sync_userjourney_action";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28075a(Object obj) {
        if (this.f31017a != null && obj == null) {
            mo28388e();
        }
        if (obj instanceof C10893i8) {
            this.f31017a = (C10893i8) obj;
        }
        mo28387d();
    }
}
