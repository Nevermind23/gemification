package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.medallia.digital.mobilesdk.Broadcasts;
import java.util.concurrent.Executor;

/* renamed from: com.medallia.digital.mobilesdk.e4 */
class C10791e4 extends C10845h0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public MDFormListener f30896a;

    /* renamed from: b */
    private final BroadcastReceiver f30897b = new C10792a();

    /* renamed from: com.medallia.digital.mobilesdk.e4$a */
    class C10792a extends BroadcastReceiver {
        C10792a() {
        }

        public void onReceive(Context context, Intent intent) {
            String str;
            FormTriggerType formTriggerType;
            long j;
            Broadcasts.C10688d.C10689a aVar;
            MDFormListenerData mDFormListenerData;
            MDFormListener mDFormListener;
            Intent intent2 = intent;
            if (intent2 != null && "com.medallia.digital.mobilesdk.form_action".equals(intent.getAction())) {
                try {
                    long longExtra = intent2.getLongExtra("com.medallia.digital.mobilesdk.extra_timestamp", 0);
                    String stringExtra = intent2.getStringExtra("com.medallia.digital.mobilesdk.extra_form_id");
                    FormViewType formViewType = (FormViewType) intent2.getSerializableExtra("com.medallia.digital.mobilesdk.extra_form_view_type");
                    if (formViewType == null) {
                        formViewType = FormViewType.none;
                    }
                    FormViewType formViewType2 = formViewType;
                    FormTriggerType formTriggerType2 = (FormTriggerType) intent2.getSerializableExtra("com.medallia.digital.mobilesdk.extra_form_trigger_type");
                    long longExtra2 = intent2.getLongExtra("com.medallia.digital.mobilesdk.extra_form_time_to_display", 0);
                    Broadcasts.C10688d.C10689a aVar2 = (Broadcasts.C10688d.C10689a) intent2.getSerializableExtra("com.medallia.digital.mobilesdk.extra_option");
                    String stringExtra2 = intent2.getStringExtra("com.medallia.digital.mobilesdk.extra_form_url");
                    String stringExtra3 = intent2.getStringExtra("com.medallia.digital.mobilesdk.extra_form_locale_set");
                    String stringExtra4 = intent2.getStringExtra("com.medallia.digital.mobilesdk.extra_form_locale_display");
                    boolean booleanExtra = intent2.getBooleanExtra("com.medallia.digital.mobilesdk.extra_thank_you_prompt_button_display", false);
                    boolean booleanExtra2 = intent2.getBooleanExtra("com.medallia.digital.mobilesdk.extra_thank_you_prompt_image_display", false);
                    MDAppearanceMode mDAppearanceMode = (MDAppearanceMode) intent2.getSerializableExtra("com.medallia.digital.mobilesdk.extra_form_header_appearance_set");
                    MDAppearanceMode mDAppearanceMode2 = (MDAppearanceMode) intent2.getSerializableExtra("com.medallia.digital.mobilesdk.extra_form_header_appearance_display");
                    if (C10791e4.this.f30896a != null) {
                        if (aVar2 == Broadcasts.C10688d.C10689a.formSubmitted) {
                            C10791e4.this.f30896a.onFormSubmitted(new MDFormListenerData(longExtra, stringExtra, formTriggerType2));
                        } else if (aVar2 == Broadcasts.C10688d.C10689a.formDismissed) {
                            C10791e4.this.f30896a.onFormDismissed(new MDFormListenerData(longExtra, stringExtra, formTriggerType2));
                        } else if (aVar2 == Broadcasts.C10688d.C10689a.formClosed) {
                            C10791e4.this.f30896a.onFormClosed(new MDFormListenerData(longExtra, stringExtra, formTriggerType2));
                        } else {
                            if (aVar2 == Broadcasts.C10688d.C10689a.formDisplayed) {
                                j = longExtra2;
                                MDFormListenerData mDFormListenerData2 = r5;
                                MDFormListener a = C10791e4.this.f30896a;
                                str = stringExtra;
                                aVar = aVar2;
                                formTriggerType = formTriggerType2;
                                MDFormListenerData mDFormListenerData3 = new MDFormListenerData(longExtra, stringExtra, formTriggerType2, stringExtra3, stringExtra4, mDAppearanceMode, mDAppearanceMode2);
                                a.onFormDisplayed(mDFormListenerData2);
                            } else {
                                str = stringExtra;
                                j = longExtra2;
                                aVar = aVar2;
                                formTriggerType = formTriggerType2;
                                if (aVar == Broadcasts.C10688d.C10689a.formBlockedUrl) {
                                    mDFormListener = C10791e4.this.f30896a;
                                    mDFormListenerData = new MDFormListenerData(longExtra, str, formTriggerType, stringExtra2, true);
                                } else if (aVar == Broadcasts.C10688d.C10689a.formLinkSelected) {
                                    mDFormListener = C10791e4.this.f30896a;
                                    mDFormListenerData = new MDFormListenerData(longExtra, str, formTriggerType, stringExtra2, false);
                                } else if (aVar == Broadcasts.C10688d.C10689a.formThankYouPrompt) {
                                    C10791e4.this.f30896a.onFormThankYouPrompt(new MDFormListenerData(longExtra, str, formTriggerType, mDAppearanceMode, mDAppearanceMode2));
                                }
                                mDFormListener.onFormLinkSelected(mDFormListenerData);
                            }
                            C10791e4.this.m39350a(aVar, str, formTriggerType, formViewType2, longExtra, j, stringExtra3, stringExtra4, booleanExtra, booleanExtra2, mDAppearanceMode);
                        }
                    }
                    str = stringExtra;
                    j = longExtra2;
                    aVar = aVar2;
                    formTriggerType = formTriggerType2;
                    C10791e4.this.m39350a(aVar, str, formTriggerType, formViewType2, longExtra, j, stringExtra3, stringExtra4, booleanExtra, booleanExtra2, mDAppearanceMode);
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.e4$b */
    class C10793b extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ Broadcasts.C10688d.C10689a f30899a;

        /* renamed from: b */
        final /* synthetic */ String f30900b;

        /* renamed from: c */
        final /* synthetic */ FormTriggerType f30901c;

        /* renamed from: d */
        final /* synthetic */ long f30902d;

        /* renamed from: e */
        final /* synthetic */ FormViewType f30903e;

        /* renamed from: f */
        final /* synthetic */ long f30904f;

        /* renamed from: g */
        final /* synthetic */ String f30905g;

        /* renamed from: h */
        final /* synthetic */ String f30906h;

        /* renamed from: i */
        final /* synthetic */ MDAppearanceMode f30907i;

        /* renamed from: j */
        final /* synthetic */ boolean f30908j;

        /* renamed from: k */
        final /* synthetic */ boolean f30909k;

        C10793b(Broadcasts.C10688d.C10689a aVar, String str, FormTriggerType formTriggerType, long j, FormViewType formViewType, long j2, String str2, String str3, MDAppearanceMode mDAppearanceMode, boolean z, boolean z2) {
            this.f30899a = aVar;
            this.f30900b = str;
            this.f30901c = formTriggerType;
            this.f30902d = j;
            this.f30903e = formViewType;
            this.f30904f = j2;
            this.f30905g = str2;
            this.f30906h = str3;
            this.f30907i = mDAppearanceMode;
            this.f30908j = z;
            this.f30909k = z2;
        }

        /* renamed from: a */
        public void mo27617a() {
            Broadcasts.C10688d.C10689a aVar = this.f30899a;
            if (aVar == Broadcasts.C10688d.C10689a.formSubmitted) {
                AnalyticsBridge.getInstance().reportFormSubmittedEvent(this.f30900b, this.f30901c, this.f30902d, this.f30903e);
            } else if (aVar == Broadcasts.C10688d.C10689a.formDismissed) {
                AnalyticsBridge.getInstance().reportFormDismissedEvent(this.f30900b, this.f30901c, this.f30903e);
            } else if (aVar == Broadcasts.C10688d.C10689a.formClosed) {
                AnalyticsBridge.getInstance().reportFormClosedEvent(this.f30900b, this.f30901c, this.f30903e);
            } else if (aVar == Broadcasts.C10688d.C10689a.formDisplayed) {
                AnalyticsBridge.getInstance().reportFormDisplayedEvent(this.f30900b, this.f30901c, this.f30903e, this.f30904f, this.f30905g, this.f30906h, this.f30907i);
            } else if (aVar == Broadcasts.C10688d.C10689a.formThankYouPrompt) {
                AnalyticsBridge.getInstance().reportFormThankYouPromptEvent(this.f30900b, this.f30901c, this.f30903e, this.f30908j, this.f30909k, this.f30907i);
            }
            if (C10791e4.this.f30896a != null) {
                AnalyticsBridge.getInstance().reportSetFormCallbackEvent(this.f30899a.name(), this.f30900b, this.f30901c);
            }
        }
    }

    C10791e4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo28076b() {
        return this.f30896a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public BroadcastReceiver mo28077c() {
        return this.f30897b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28074a() {
        return "com.medallia.digital.mobilesdk.form_action";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39350a(Broadcasts.C10688d.C10689a aVar, String str, FormTriggerType formTriggerType, FormViewType formViewType, long j, long j2, String str2, String str3, boolean z, boolean z2, MDAppearanceMode mDAppearanceMode) {
        Executor a = C11004m7.m40304b().mo28763a();
        C10793b bVar = r1;
        C10793b bVar2 = new C10793b(aVar, str, formTriggerType, j, formViewType, j2, str2, str3, mDAppearanceMode, z, z2);
        a.execute(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28075a(Object obj) {
        if (this.f30896a != null && obj == null) {
            mo28388e();
        }
        if (obj instanceof MDFormListener) {
            this.f30896a = (MDFormListener) obj;
        }
        mo28387d();
    }
}
