package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.medallia.digital.mobilesdk.Broadcasts;

/* renamed from: com.medallia.digital.mobilesdk.c4 */
class C10759c4 extends C10845h0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public MDCustomInterceptListener f30818a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BroadcastReceiver f30819b = new C10760a();

    /* renamed from: com.medallia.digital.mobilesdk.c4$a */
    class C10760a extends BroadcastReceiver {
        C10760a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && C10759c4.this.mo28074a().equals(intent.getAction())) {
                try {
                    Broadcasts.C10684b.C10685a aVar = (Broadcasts.C10684b.C10685a) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_custom_intercept_command");
                    long longExtra = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_form_preload_timestamp", 0);
                    long longExtra2 = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_target_evaluation_timestamp", 0);
                    String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_engagement_id");
                    MDEngagementType mDEngagementType = (MDEngagementType) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_engagement_type");
                    MDCustomInterceptPayload mDCustomInterceptPayload = (MDCustomInterceptPayload) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_payload");
                    if (C10759c4.this.f30819b != null && Broadcasts.C10684b.C10685a.TargetEvaluationSuccess == aVar) {
                        C10759c4.this.f30818a.onTargetEvaluationSuccess(new MDCustomInterceptListenerData(longExtra, longExtra2, stringExtra, mDEngagementType, mDCustomInterceptPayload));
                        C10735b4.m39113e("MDCustomInterceptListener - onTargetEvaluationSuccess was fired");
                    }
                    C10759c4.this.m39253a(stringExtra, mDEngagementType);
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.c4$b */
    class C10761b extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ String f30821a;

        /* renamed from: b */
        final /* synthetic */ MDEngagementType f30822b;

        C10761b(String str, MDEngagementType mDEngagementType) {
            this.f30821a = str;
            this.f30822b = mDEngagementType;
        }

        /* renamed from: a */
        public void mo27617a() {
            if (C10759c4.this.f30818a != null) {
                AnalyticsBridge.getInstance().reportSetCustomInterceptCallbackEvent(this.f30821a, this.f30822b.toString());
            }
        }
    }

    C10759c4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public BroadcastReceiver mo28077c() {
        return this.f30819b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28074a() {
        return "com.medallia.digital.mobilesdk.custom_intercept_action";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo28076b() {
        return this.f30818a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28075a(Object obj) {
        if (this.f30818a != null && obj == null) {
            mo28388e();
        }
        if (obj instanceof MDCustomInterceptListener) {
            this.f30818a = (MDCustomInterceptListener) obj;
        }
        mo28387d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39253a(String str, MDEngagementType mDEngagementType) {
        C11004m7.m40304b().mo28763a().execute(new C10761b(str, mDEngagementType));
    }
}
