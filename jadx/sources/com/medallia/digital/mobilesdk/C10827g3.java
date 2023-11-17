package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.C10880i3;
import com.medallia.digital.mobilesdk.C11089s6;
import com.medallia.digital.mobilesdk.C11164w3;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import com.salesforce.marketingcloud.C11398b;

/* renamed from: com.medallia.digital.mobilesdk.g3 */
final class C10827g3 implements C11164w3.C11170f {

    /* renamed from: g */
    private static C10827g3 f30999g;

    /* renamed from: a */
    private final C10904j3 f31000a = new C10904j3();

    /* renamed from: b */
    private long f31001b;

    /* renamed from: c */
    private long f31002c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f31003d;

    /* renamed from: e */
    private boolean f31004e = false;

    /* renamed from: f */
    private boolean f31005f = false;

    /* renamed from: com.medallia.digital.mobilesdk.g3$a */
    class C10828a implements C10954l2 {

        /* renamed from: a */
        final /* synthetic */ String f31006a;

        /* renamed from: b */
        final /* synthetic */ MDEngagementType f31007b;

        C10828a(String str, MDEngagementType mDEngagementType) {
            this.f31006a = str;
            this.f31007b = mDEngagementType;
        }

        /* renamed from: a */
        public void mo28347a() {
            C10827g3.this.m39509a(this.f31006a, Reason.formStatusNotAvailable);
        }

        public void onSuccess() {
            if (C10827g3.this.m39511a(this.f31006a)) {
                C10827g3.this.m39507a(this.f31006a, this.f31007b);
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.g3$b */
    class C10829b implements MedalliaWebView.C10704e {

        /* renamed from: a */
        final /* synthetic */ String f31009a;

        /* renamed from: b */
        final /* synthetic */ MDEngagementType f31010b;

        C10829b(String str, MDEngagementType mDEngagementType) {
            this.f31009a = str;
            this.f31010b = mDEngagementType;
        }

        /* renamed from: a */
        public void mo27922a() {
            long unused = C10827g3.this.f31003d = System.currentTimeMillis();
            C10827g3 g3Var = C10827g3.this;
            g3Var.m39508a(this.f31009a, this.f31010b, g3Var.f31003d);
        }

        /* renamed from: b */
        public void mo27923b() {
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.g3$c */
    class C10830c extends C11033o4 {

        /* renamed from: com.medallia.digital.mobilesdk.g3$c$a */
        class C10831a implements View.OnSystemUiVisibilityChangeListener {

            /* renamed from: com.medallia.digital.mobilesdk.g3$c$a$a */
            class C10832a extends C11033o4 {

                /* renamed from: a */
                final /* synthetic */ int f31014a;

                C10832a(int i) {
                    this.f31014a = i;
                }

                /* renamed from: a */
                public void mo27617a() {
                    C10735b4.m39109b("activity onSystemUiVisibilityChange");
                    try {
                        C10827g3.this.m39502a(this.f31014a);
                    } catch (Exception e) {
                        C10735b4.m39111c(e.getMessage());
                    }
                }
            }

            C10831a() {
            }

            public void onSystemUiVisibilityChange(int i) {
                C11004m7.m40304b().mo28763a().execute(new C10832a(i));
            }
        }

        C10830c() {
        }

        /* renamed from: a */
        public void mo27617a() {
            if (C10884i4.m39721c().mo28484d().getBaseContext() instanceof Activity) {
                ((Activity) C10884i4.m39721c().mo28484d().getBaseContext()).getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new C10831a());
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.g3$d */
    static /* synthetic */ class C10833d {

        /* renamed from: a */
        static final /* synthetic */ int[] f31016a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.medallia.digital.mobilesdk.MDEngagementType[] r0 = com.medallia.digital.mobilesdk.MDEngagementType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31016a = r0
                com.medallia.digital.mobilesdk.MDEngagementType r1 = com.medallia.digital.mobilesdk.MDEngagementType.appRating     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31016a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.MDEngagementType r1 = com.medallia.digital.mobilesdk.MDEngagementType.form     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10827g3.C10833d.<clinit>():void");
        }
    }

    private C10827g3() {
        C11164w3.m40939b().mo29111a((C11164w3.C11170f) this);
    }

    /* renamed from: d */
    protected static C10827g3 m39512d() {
        if (f30999g == null) {
            f30999g = new C10827g3();
        }
        return f30999g;
    }

    /* renamed from: e */
    private void m39513e() {
        if (this.f31000a.mo28540k()) {
            this.f31004e = false;
            this.f31005f = false;
            C10904j3 j3Var = this.f31000a;
            j3Var.mo28528a(j3Var.mo28537f(), this.f31000a.mo28536e(), this.f31001b, this.f31002c, this.f31003d);
        }
        try {
            if (C10884i4.m39721c().mo28484d().getBaseContext() instanceof Activity) {
                ((Activity) C10884i4.m39721c().mo28484d().getBaseContext()).runOnUiThread(new C10830c());
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: b */
    public void mo28344b() {
        m39513e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo28346c() {
        return this.f31000a.mo28532a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28345b(String str, MDEngagementType mDEngagementType, long j) {
        if (mDEngagementType == null) {
            C10735b4.m39111c("Can't show invitation because of type is null");
            return;
        }
        this.f31001b = System.currentTimeMillis();
        this.f31002c = j;
        int i = C10833d.f31016a[mDEngagementType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C11138v2.m40821f().mo29059a(str, (C10954l2) new C10828a(str, mDEngagementType));
            }
        } else if (m39511a(str)) {
            m39508a(str, mDEngagementType, -1);
        }
    }

    /* renamed from: a */
    public void mo28341a() {
        if (this.f31000a.mo28540k()) {
            this.f31000a.mo28535c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39502a(int i) {
        if (C10884i4.m39721c().mo28484d().getBaseContext() instanceof Activity) {
            Window window = ((Activity) C10884i4.m39721c().mo28484d().getBaseContext()).getWindow();
            if ((i & 4) == 0 && (window.getAttributes().flags & C11398b.f33141t) == 0 && (window.getAttributes().flags & 67108864) == 0) {
                if (this.f31004e && this.f31000a.mo28540k()) {
                    this.f31004e = false;
                    this.f31005f = true;
                    C10904j3 j3Var = this.f31000a;
                    j3Var.mo28529a(j3Var.mo28537f(), this.f31000a.mo28536e(), this.f31001b, this.f31002c, this.f31003d, true);
                }
            } else if (this.f31000a.mo28539j() && window.getDecorView().getSystemUiVisibility() != 4) {
                this.f31004e = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28342a(C10880i3.C10882b bVar) {
        this.f31000a.mo28526a(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39507a(String str, MDEngagementType mDEngagementType) {
        C11013n2 c = C11138v2.m40821f().mo29070c(str);
        if (c != null) {
            C11138v2.m40821f().mo29065b(c);
            C11007m8.m40311b().mo28772a(c, (MedalliaWebView.C10704e) new C10829b(str, mDEngagementType), MedalliaWebView.C10705f.invitationProducer);
            return;
        }
        C10735b4.m39109b("FormId: " + str + " loading failed");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39508a(String str, MDEngagementType mDEngagementType, long j) {
        if (!C11164w3.m40939b().mo29121f() && C11246z6.m41212b().mo29266c() && !this.f31000a.mo28540k() && !this.f31000a.mo28538i()) {
            if (MDEngagementType.form.equals(mDEngagementType)) {
                CollectorsInfrastructure.getInstance().invitationDisplayedCollector.mo28117a(Boolean.TRUE);
                C11089s6.m40668b().mo28984b(C11089s6.C11090a.INVITATION_DISPLAYED, "true");
                C10735b4.m39109b("InvitationDisplayed true saved to SharedPreferences");
            } else if (MDEngagementType.appRating.equals(mDEngagementType) && !C10988l8.m40232b()) {
                C10735b4.m39113e("Device is offline, App Rating prompt won't be displayed");
                return;
            }
            C10735b4.m39109b("Invitation dialog is ready to opened");
            C10735b4.m39109b("displayInvitation called");
            this.f31004e = false;
            this.f31000a.mo28533b(str, mDEngagementType, this.f31001b, this.f31002c, j, this.f31005f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28343a(String str, MDInterceptActionType mDInterceptActionType, MDFailureCallback mDFailureCallback) {
        C10735b4.m39113e("Custom Intercept was Triggered with engagementId: " + str + " and action type: " + mDInterceptActionType.toString());
        this.f31000a.mo28530a(str, mDInterceptActionType, mDFailureCallback);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39509a(String str, Reason reason) {
        AnalyticsBridge.getInstance().reportInterceptMechanismEvent(this.f31001b, System.currentTimeMillis(), str, reason, AnalyticsBridge.C10665c.failure);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m39511a(String str) {
        Reason reason;
        if (!C11246z6.m41212b().mo29266c()) {
            reason = Reason.interceptDisabled;
        } else if (C11164w3.m40939b().mo29121f()) {
            reason = Reason.formInBackground;
        } else if (C11164w3.m40939b().mo29114a("com.medallia.digital.mobilesdk.MedalliaFullFormActivity") || C11164w3.m40939b().mo29114a("com.medallia.digital.mobilesdk.MedalliaModalFormActivity")) {
            reason = Reason.formOpened;
        } else if (!this.f31000a.mo28540k()) {
            return true;
        } else {
            reason = Reason.invitationOpened;
        }
        m39509a(str, reason);
        return false;
    }
}
