package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.medallia.digital.mobilesdk.Broadcasts;

/* renamed from: com.medallia.digital.mobilesdk.d4 */
class C10775d4 extends C10845h0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public MDFeedbackListener f30863a;

    /* renamed from: b */
    private final BroadcastReceiver f30864b = new C10776a();

    /* renamed from: com.medallia.digital.mobilesdk.d4$a */
    class C10776a extends BroadcastReceiver {
        C10776a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "com.medallia.digital.mobilesdk.feedback_action".equals(intent.getAction())) {
                try {
                    long longExtra = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_timestamp", 0);
                    String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_form_id");
                    FormTriggerType formTriggerType = (FormTriggerType) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_form_trigger_type");
                    Broadcasts.C10688d.C10689a aVar = (Broadcasts.C10688d.C10689a) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_option");
                    String stringExtra2 = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_feedback_payload");
                    String stringExtra3 = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_feedback_id");
                    if (aVar == Broadcasts.C10688d.C10689a.feedbackPayload && C10775d4.this.f30863a != null) {
                        C10775d4.this.f30863a.onFeedbackSubmitted(new MDFeedbackListenerData(stringExtra3, longExtra, stringExtra2, stringExtra));
                    }
                    if (C10775d4.this.f30863a != null) {
                        AnalyticsBridge.getInstance().reportSetFeedbackCallbackEvent(aVar != null ? aVar.name() : null, stringExtra, formTriggerType, stringExtra3);
                    }
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
        }
    }

    C10775d4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo28076b() {
        return this.f30863a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public BroadcastReceiver mo28077c() {
        return this.f30864b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28074a() {
        return "com.medallia.digital.mobilesdk.feedback_action";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28075a(Object obj) {
        if (this.f30863a != null && obj == null) {
            mo28388e();
        }
        if (obj instanceof MDFeedbackListener) {
            this.f30863a = (MDFeedbackListener) obj;
        }
    }
}
