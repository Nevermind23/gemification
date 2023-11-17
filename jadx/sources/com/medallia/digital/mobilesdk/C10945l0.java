package com.medallia.digital.mobilesdk;

import android.os.Handler;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.C10880i3;
import com.medallia.digital.mobilesdk.C11013n2;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.medallia.digital.mobilesdk.l0 */
class C10945l0 {

    /* renamed from: g */
    private static final long f31443g = 7000;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public MDResultCallback f31444a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10952g f31445b;

    /* renamed from: c */
    private Handler f31446c;

    /* renamed from: d */
    private C11033o4 f31447d;

    /* renamed from: e */
    private boolean f31448e;

    /* renamed from: f */
    private boolean f31449f;

    /* renamed from: com.medallia.digital.mobilesdk.l0$a */
    class C10946a implements C10954l2 {

        /* renamed from: a */
        final /* synthetic */ ConfigurationContract f31450a;

        C10946a(ConfigurationContract configurationContract) {
            this.f31450a = configurationContract;
        }

        /* renamed from: a */
        public void mo28347a() {
            C10945l0.this.m40046a();
            C10945l0.this.m40047a(new MDExternalError(MDExternalError.ExternalError.FORM_NOT_EXISTS_OR_NOT_PUBLISH), C10945l0.this.f31444a);
        }

        public void onSuccess() {
            if (C10945l0.this.m40058b(this.f31450a)) {
                C10945l0.this.m40046a();
                C10945l0.this.m40059c();
                return;
            }
            C10945l0 l0Var = C10945l0.this;
            l0Var.m40054a(true, l0Var.f31445b.f31464a, C10945l0.this.f31445b.f31465b, C10945l0.this.f31444a);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l0$b */
    class C10947b implements C10954l2 {

        /* renamed from: a */
        final /* synthetic */ C11013n2 f31452a;

        C10947b(C11013n2 n2Var) {
            this.f31452a = n2Var;
        }

        /* renamed from: a */
        public void mo28347a() {
            C10735b4.m39111c("Preload form failed on promoting = " + this.f31452a.getFormId());
        }

        public void onSuccess() {
            C11013n2 c = C11138v2.m40821f().mo29070c(this.f31452a.getFormId());
            StringBuilder sb = new StringBuilder();
            sb.append("Preload form SUCCESS = ");
            sb.append(c != null ? c.mo28796c() : "null");
            C10735b4.m39109b(sb.toString());
            if (c != null && c.mo28796c() == C11013n2.C11014a.AVAILABLE) {
                C11138v2.m40821f().mo29065b(this.f31452a);
                C11007m8.m40311b().mo28772a(this.f31452a, (MedalliaWebView.C10704e) null, MedalliaWebView.C10705f.preload);
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l0$c */
    class C10948c implements MDResultCallback {

        /* renamed from: a */
        final /* synthetic */ C11013n2 f31454a;

        /* renamed from: b */
        final /* synthetic */ FormDisplayType f31455b;

        /* renamed from: c */
        final /* synthetic */ String f31456c;

        C10948c(C11013n2 n2Var, FormDisplayType formDisplayType, String str) {
            this.f31454a = n2Var;
            this.f31455b = formDisplayType;
            this.f31456c = str;
        }

        public void onError(MDExternalError mDExternalError) {
            if (this.f31455b == FormDisplayType.NOTIFICATION) {
                AnalyticsBridge instance = AnalyticsBridge.getInstance();
                String str = this.f31456c;
                C11013n2 n2Var = this.f31454a;
                instance.reportHandleNotificationEvent(str, n2Var != null ? n2Var.getFormViewType() : FormViewType.none, C10945l0.this.f31445b != null, AnalyticsBridge.C10665c.failure, mDExternalError);
            }
            C10952g unused = C10945l0.this.f31445b = null;
            C10945l0.this.m40046a();
            C10945l0 l0Var = C10945l0.this;
            l0Var.m40047a(mDExternalError, l0Var.f31444a);
        }

        public void onSuccess() {
            if (this.f31454a != null) {
                FormDisplayType formDisplayType = this.f31455b;
                if (formDisplayType == FormDisplayType.CODE) {
                    AnalyticsBridge.getInstance().reportShowFormEvent(this.f31456c, this.f31454a.getFormViewType(), this.f31454a.mo28824l());
                } else if (formDisplayType == FormDisplayType.NOTIFICATION) {
                    AnalyticsBridge.getInstance().reportHandleNotificationEvent(this.f31456c, this.f31454a.getFormViewType(), C10945l0.this.f31445b != null, AnalyticsBridge.C10665c.success, (MDExternalError) null);
                }
            }
            C10952g unused = C10945l0.this.f31445b = null;
            C10945l0.this.m40046a();
            C10945l0 l0Var = C10945l0.this;
            l0Var.m40048a(l0Var.f31444a);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l0$d */
    class C10949d extends C11033o4 {
        C10949d() {
        }

        /* renamed from: a */
        public void mo27617a() {
            if (C10945l0.this.f31444a != null) {
                C10945l0.this.m40059c();
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l0$e */
    class C10950e extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ MDResultCallback f31459a;

        /* renamed from: b */
        final /* synthetic */ MDExternalError f31460b;

        C10950e(MDResultCallback mDResultCallback, MDExternalError mDExternalError) {
            this.f31459a = mDResultCallback;
            this.f31460b = mDExternalError;
        }

        /* renamed from: a */
        public void mo27617a() {
            this.f31459a.onError(this.f31460b);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l0$f */
    class C10951f extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ MDResultCallback f31462a;

        C10951f(MDResultCallback mDResultCallback) {
            this.f31462a = mDResultCallback;
        }

        /* renamed from: a */
        public void mo27617a() {
            this.f31462a.onSuccess();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l0$g */
    private static final class C10952g {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final FormDisplayType f31464a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f31465b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Long f31466c;

        private C10952g(FormDisplayType formDisplayType, String str, Long l) {
            this.f31464a = formDisplayType;
            this.f31465b = str;
            this.f31466c = l;
        }

        /* synthetic */ C10952g(FormDisplayType formDisplayType, String str, Long l, C10946a aVar) {
            this(formDisplayType, str, l);
        }
    }

    C10945l0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m40059c() {
        this.f31445b = null;
        if (this.f31444a != null) {
            m40047a((this.f31449f || this.f31448e) ? new MDExternalError(MDExternalError.ExternalError.FORM_DISPLAY_TIMEOUT) : new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED), this.f31444a);
        }
        C10735b4.m39111c("Form Display Timeout");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40046a() {
        try {
            this.f31446c.removeCallbacks(this.f31447d);
            this.f31446c.removeCallbacksAndMessages((Object) null);
            this.f31446c = null;
            this.f31447d = null;
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: b */
    private void m40057b() {
        if (this.f31446c != null) {
            m40046a();
        }
        this.f31446c = new Handler();
        C10949d dVar = new C10949d();
        this.f31447d = dVar;
        this.f31446c.postDelayed(dVar, f31443g);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r6 = r6.getSdkConfiguration().getMedalliaDigitalBrain().getFormDisplayTimeout();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m40058b(com.medallia.digital.mobilesdk.ConfigurationContract r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0042
            com.medallia.digital.mobilesdk.l0$g r1 = r5.f31445b
            if (r1 == 0) goto L_0x0042
            com.medallia.digital.mobilesdk.SDKConfigurationContract r1 = r6.getSdkConfiguration()
            if (r1 == 0) goto L_0x0042
            com.medallia.digital.mobilesdk.SDKConfigurationContract r1 = r6.getSdkConfiguration()
            com.medallia.digital.mobilesdk.MedalliaDigitalBrainConfigurationContract r1 = r1.getMedalliaDigitalBrain()
            if (r1 == 0) goto L_0x0042
            com.medallia.digital.mobilesdk.SDKConfigurationContract r6 = r6.getSdkConfiguration()
            com.medallia.digital.mobilesdk.MedalliaDigitalBrainConfigurationContract r6 = r6.getMedalliaDigitalBrain()
            java.lang.Long r6 = r6.getFormDisplayTimeout()
            if (r6 == 0) goto L_0x0042
            long r1 = r6.longValue()
            r3 = 7000(0x1b58, double:3.4585E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0042
            long r1 = r6.longValue()
            com.medallia.digital.mobilesdk.l0$g r6 = r5.f31445b
            java.lang.Long r6 = r6.f31466c
            long r3 = r6.longValue()
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x0042
            r0 = 1
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10945l0.m40058b(com.medallia.digital.mobilesdk.ConfigurationContract):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28647a(ConfigurationContract configurationContract) {
        if (this.f31445b == null) {
            return;
        }
        if (m40058b(configurationContract)) {
            m40046a();
            m40059c();
            return;
        }
        C11138v2.m40821f().mo29059a(this.f31445b.f31465b, (C10954l2) new C10946a(configurationContract));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28648a(FormDisplayType formDisplayType, String str, MDResultCallback mDResultCallback) {
        C10827g3.m39512d().mo28342a(formDisplayType == FormDisplayType.CODE ? C10880i3.C10882b.showForm : C10880i3.C10882b.handleNotification);
        C10887i7.m39741e().mo28493h();
        m40054a(false, formDisplayType, str, mDResultCallback);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40047a(MDExternalError mDExternalError, MDResultCallback mDResultCallback) {
        if (mDResultCallback != null) {
            C11004m7.m40304b().mo28764c().execute(new C10950e(mDResultCallback, mDExternalError));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40048a(MDResultCallback mDResultCallback) {
        if (mDResultCallback != null) {
            C11004m7.m40304b().mo28764c().execute(new C10951f(mDResultCallback));
        }
    }

    /* renamed from: a */
    private void m40053a(C11013n2 n2Var) {
        if (n2Var != null) {
            C11138v2.m40821f().mo29059a(n2Var.getFormId(), (C10954l2) new C10947b(n2Var));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28649a(ArrayList<C11013n2> arrayList) {
        if (arrayList != null) {
            Iterator<C11013n2> it = arrayList.iterator();
            while (it.hasNext()) {
                C11013n2 next = it.next();
                if (next.mo28824l()) {
                    C10735b4.m39113e("Preload form loaded = " + next.getFormId());
                    m40053a(next);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40054a(boolean z, FormDisplayType formDisplayType, String str, MDResultCallback mDResultCallback) {
        try {
            this.f31444a = mDResultCallback;
            if (mDResultCallback == null) {
                C10735b4.m39114f("Missing listener, however, method will run regardless");
            }
            if (!z) {
                m40057b();
            }
            C11013n2 c = C11138v2.m40821f().mo29070c(str);
            if (this.f31448e) {
                if (C11138v2.m40821f().mo29081j()) {
                    if (C11164w3.m40939b().mo29121f()) {
                        MDExternalError mDExternalError = new MDExternalError(MDExternalError.ExternalError.APP_IS_IN_BG);
                        if (formDisplayType == FormDisplayType.NOTIFICATION) {
                            AnalyticsBridge.getInstance().reportHandleNotificationEvent(str, c != null ? c.getFormViewType() : FormViewType.none, this.f31445b != null, AnalyticsBridge.C10665c.failure, mDExternalError);
                        }
                        m40047a(mDExternalError, mDResultCallback);
                        return;
                    } else if (c == null || C11138v2.m40821f().mo29061a(c) || formDisplayType != FormDisplayType.NOTIFICATION) {
                        C11138v2.m40821f().mo29058a(str, (MDResultCallback) new C10948c(c, formDisplayType, str));
                        return;
                    } else {
                        this.f31445b = null;
                        m40046a();
                        m40047a(new MDExternalError(MDExternalError.ExternalError.FORM_INCORRECT_INVITATION_TYPE), this.f31444a);
                        return;
                    }
                }
            }
            this.f31445b = new C10952g(formDisplayType, str, Long.valueOf(System.currentTimeMillis()), (C10946a) null);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28650a(boolean z, boolean z2) {
        this.f31448e = z;
        this.f31449f = z2;
    }
}
