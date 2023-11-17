package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.medallia.digital.mobilesdk.Broadcasts;

/* renamed from: com.medallia.digital.mobilesdk.f4 */
class C10806f4 extends C10845h0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public MDInterceptListener f30943a;

    /* renamed from: b */
    private final BroadcastReceiver f30944b = new C10807a();

    /* renamed from: com.medallia.digital.mobilesdk.f4$a */
    class C10807a extends BroadcastReceiver {
        C10807a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && C10806f4.this.mo28074a().equals(intent.getAction())) {
                try {
                    String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_id");
                    long longExtra = intent.getLongExtra("com.medallia.digital.mobilesdk.extra_timestamp", 0);
                    C10880i3 i3Var = (C10880i3) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_reason");
                    String stringExtra2 = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_invite_type");
                    MDEngagementType mDEngagementType = (MDEngagementType) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_engagement_type");
                    MDAppearanceMode mDAppearanceMode = (MDAppearanceMode) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_intercept_appearance_set");
                    MDAppearanceMode mDAppearanceMode2 = (MDAppearanceMode) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_intercept_appearance_display");
                    Broadcasts.C10691e.C10692a aVar = (Broadcasts.C10691e.C10692a) intent.getSerializableExtra("com.medallia.digital.mobilesdk.extra_intercept_command");
                    if (C10806f4.this.f30943a != null) {
                        if (Broadcasts.C10691e.C10692a.interceptAccepted == aVar) {
                            C10806f4.this.f30943a.onInterceptAccepted(new MDInterceptListenerData(longExtra, stringExtra, mDEngagementType));
                        } else if (Broadcasts.C10691e.C10692a.interceptDeclined == aVar) {
                            C10806f4.this.f30943a.onInterceptDeclined(new MDInterceptListenerData(longExtra, stringExtra, mDEngagementType));
                        } else if (Broadcasts.C10691e.C10692a.interceptDeferred == aVar) {
                            C10806f4.this.f30943a.onInterceptDeferred(new MDInterceptListenerData(longExtra, stringExtra, i3Var != null ? i3Var.mo28476a() : null, mDEngagementType));
                        } else if (Broadcasts.C10691e.C10692a.interceptDisplayed == aVar) {
                            C10806f4.this.f30943a.onInterceptDisplayed(new MDInterceptListenerData(longExtra, stringExtra, mDEngagementType, mDAppearanceMode, mDAppearanceMode2));
                        } else if (Broadcasts.C10691e.C10692a.interceptClosed == aVar) {
                            C10806f4.this.f30943a.onInterceptClosed(new MDInterceptListenerData(longExtra, stringExtra, mDEngagementType));
                        } else if (Broadcasts.C10691e.C10692a.interceptTriggered == aVar) {
                            C10806f4.this.f30943a.onInterceptTriggerInAppReview(new MDInterceptListenerData(longExtra, stringExtra));
                        }
                    }
                    C10806f4.this.m39413a(aVar, stringExtra, stringExtra2, mDEngagementType, i3Var);
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.f4$b */
    class C10808b extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ Broadcasts.C10691e.C10692a f30946a;

        /* renamed from: b */
        final /* synthetic */ String f30947b;

        /* renamed from: c */
        final /* synthetic */ String f30948c;

        /* renamed from: d */
        final /* synthetic */ MDEngagementType f30949d;

        /* renamed from: e */
        final /* synthetic */ C10880i3 f30950e;

        C10808b(Broadcasts.C10691e.C10692a aVar, String str, String str2, MDEngagementType mDEngagementType, C10880i3 i3Var) {
            this.f30946a = aVar;
            this.f30947b = str;
            this.f30948c = str2;
            this.f30949d = mDEngagementType;
            this.f30950e = i3Var;
        }

        /* renamed from: a */
        public void mo27617a() {
            if (C10806f4.this.f30943a != null) {
                AnalyticsBridge instance = AnalyticsBridge.getInstance();
                String name = this.f30946a.name();
                String str = this.f30947b;
                String str2 = this.f30948c;
                MDEngagementType mDEngagementType = this.f30949d;
                instance.reportSetInterceptCallbackEvent(name, str, str2, mDEngagementType != null ? mDEngagementType.toString() : null, this.f30950e);
            }
        }
    }

    C10806f4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo28076b() {
        return this.f30943a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public BroadcastReceiver mo28077c() {
        return this.f30944b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28074a() {
        return "com.medallia.digital.mobilesdk.intercept_action";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39413a(Broadcasts.C10691e.C10692a aVar, String str, String str2, MDEngagementType mDEngagementType, C10880i3 i3Var) {
        C11004m7.m40304b().mo28763a().execute(new C10808b(aVar, str, str2, mDEngagementType, i3Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28075a(Object obj) {
        if (this.f30943a != null && obj == null) {
            mo28388e();
        }
        if (obj instanceof MDInterceptListener) {
            this.f30943a = (MDInterceptListener) obj;
        }
        mo28387d();
    }
}
