package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.C0214c;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.C10880i3;
import com.medallia.digital.mobilesdk.C10992m1;
import com.medallia.digital.mobilesdk.C11089s6;
import com.medallia.digital.mobilesdk.C11221y3;
import com.medallia.digital.mobilesdk.InviteData;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import p337z7.C9219c;
import p337z7.Task;

/* renamed from: com.medallia.digital.mobilesdk.j3 */
class C10904j3 {

    /* renamed from: r */
    private static final String f31321r = "https://play.google.com/store/apps/details?id=";

    /* renamed from: a */
    private InviteData f31322a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f31323b;

    /* renamed from: c */
    private MDEngagementType f31324c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C0214c f31325d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11184x f31326e;

    /* renamed from: f */
    private long f31327f = 0;

    /* renamed from: g */
    private boolean f31328g = false;

    /* renamed from: h */
    private boolean f31329h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C11062q f31330i;

    /* renamed from: j */
    private boolean f31331j;

    /* renamed from: k */
    private C11013n2 f31332k;

    /* renamed from: l */
    private String f31333l;

    /* renamed from: m */
    private boolean f31334m = false;

    /* renamed from: n */
    private String f31335n;

    /* renamed from: o */
    private boolean f31336o = false;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f31337p = false;

    /* renamed from: q */
    private String f31338q;

    /* renamed from: com.medallia.digital.mobilesdk.j3$a */
    class C10905a implements C9219c {

        /* renamed from: a */
        final /* synthetic */ ReviewManager f31339a;

        /* renamed from: com.medallia.digital.mobilesdk.j3$a$a */
        class C10906a implements C9219c {
            C10906a() {
            }

            public void onComplete(Task task) {
                C10735b4.m39113e("In App review completed successfully");
            }
        }

        C10905a(ReviewManager reviewManager) {
            this.f31339a = reviewManager;
        }

        public void onComplete(Task task) {
            if (task.mo24873r()) {
                C10735b4.m39113e("In App review task success - calling show method");
                try {
                    Task launchReviewFlow = this.f31339a.launchReviewFlow((Activity) C10884i4.m39721c().mo28484d().getBaseContext(), (ReviewInfo) task.mo24869n());
                    C10735b4.m39113e("In App review launch review called");
                    CollectorsInfrastructure.getInstance().appRatingLastTriggerTimestampCollector.mo28117a(Long.valueOf(System.currentTimeMillis()));
                    AnalyticsBridge.getInstance().reportPromptTriggeredEvent(C10904j3.this.f31330i.mo28920a());
                    Broadcasts.C10691e.m38946a(Broadcasts.C10691e.C10692a.interceptTriggered, C10904j3.this.f31323b);
                    launchReviewFlow.mo24858c(new C10906a());
                } catch (Exception unused) {
                    C10735b4.m39111c("In App review task failure - unable to get current Activity");
                    boolean unused2 = C10904j3.this.f31337p = false;
                }
            } else {
                C10735b4.m39111c(task.mo24868m() != null ? task.mo24868m().getMessage() : "In App review Error");
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.j3$b */
    class C10907b extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ long f31342a;

        /* renamed from: b */
        final /* synthetic */ BannerData f31343b;

        /* renamed from: c */
        final /* synthetic */ boolean f31344c;

        /* renamed from: com.medallia.digital.mobilesdk.j3$b$a */
        class C10908a extends C11207y {
            C10908a() {
            }

            /* renamed from: a */
            public void mo28403a() {
            }

            /* renamed from: b */
            public void mo28406b(C10880i3 i3Var) {
                C10904j3.this.m39807a(i3Var);
                C11184x unused = C10904j3.this.f31326e = null;
            }

            /* renamed from: c */
            public void mo28407c(C10880i3 i3Var) {
                C10904j3.this.m39821c(i3Var);
                C11184x unused = C10904j3.this.f31326e = null;
            }

            /* renamed from: a */
            public void mo28404a(C10880i3 i3Var) {
                C10904j3.this.m39819b(i3Var);
                C11184x unused = C10904j3.this.f31326e = null;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo28405a(C11184x xVar) {
            }
        }

        C10907b(long j, BannerData bannerData, boolean z) {
            this.f31342a = j;
            this.f31343b = bannerData;
            this.f31344c = z;
        }

        /* renamed from: a */
        public void mo27617a() {
            if (!C10904j3.this.m39810a(this.f31342a)) {
                C10904j3.this.m39818b();
                return;
            }
            C10984l5 a = C10986l7.m40219c().mo28704a(this.f31343b.getThemeName());
            C10904j3 j3Var = C10904j3.this;
            C11184x unused = j3Var.f31326e = j3Var.mo28525a(this.f31343b, this.f31344c, a, (C11207y) new C10908a());
            if (!C10904j3.this.m39810a(this.f31342a)) {
                C10904j3.this.m39818b();
                C11184x unused2 = C10904j3.this.f31326e = null;
            } else if (!C10904j3.this.m39810a(this.f31342a)) {
                C10904j3.this.mo28526a((C10880i3.C10882b) null);
            } else {
                C10904j3.this.f31326e.mo29168B();
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.j3$c */
    class C10909c extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ long f31347a;

        /* renamed from: b */
        final /* synthetic */ InviteData f31348b;

        /* renamed from: com.medallia.digital.mobilesdk.j3$c$a */
        class C10910a implements DialogInterface.OnClickListener {
            C10910a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C10904j3.this.m39821c(new C10880i3((C10880i3.C10883c) null, false));
                if (C10904j3.this.f31325d != null && C10904j3.this.f31325d.isShowing()) {
                    C10904j3.this.f31325d.dismiss();
                    C0214c unused = C10904j3.this.f31325d = null;
                }
            }
        }

        /* renamed from: com.medallia.digital.mobilesdk.j3$c$b */
        class C10911b implements DialogInterface.OnClickListener {
            C10911b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C10904j3.this.m39819b(new C10880i3((C10880i3.C10883c) null, C10880i3.C10881a.buttonClicked, false));
                if (C10904j3.this.f31325d != null && C10904j3.this.f31325d.isShowing()) {
                    C10904j3.this.f31325d.dismiss();
                    C0214c unused = C10904j3.this.f31325d = null;
                }
            }
        }

        /* renamed from: com.medallia.digital.mobilesdk.j3$c$c */
        class C10912c implements DialogInterface.OnClickListener {
            C10912c() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C10904j3.this.m39807a(new C10880i3((C10880i3.C10883c) null, C10880i3.C10882b.maybeLater, false));
                if (C10904j3.this.f31325d != null && C10904j3.this.f31325d.isShowing()) {
                    C10904j3.this.f31325d.dismiss();
                    C0214c unused = C10904j3.this.f31325d = null;
                }
            }
        }

        /* renamed from: com.medallia.digital.mobilesdk.j3$c$d */
        class C10913d implements DialogInterface.OnCancelListener {
            C10913d() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                C10904j3.this.m39807a(new C10880i3((C10880i3.C10883c) null, C10880i3.C10882b.androidBackButton, false));
                if (C10904j3.this.f31325d != null) {
                    C10904j3.this.f31325d.dismiss();
                    C0214c unused = C10904j3.this.f31325d = null;
                }
            }
        }

        C10909c(long j, InviteData inviteData) {
            this.f31347a = j;
            this.f31348b = inviteData;
        }

        /* renamed from: a */
        public void mo27617a() {
            if (!C10904j3.this.m39810a(this.f31347a)) {
                C10904j3.this.m39818b();
                return;
            }
            C10904j3 j3Var = C10904j3.this;
            C0214c unused = j3Var.f31325d = j3Var.m39816b(this.f31348b, MDAppearanceMode.unknown, (DialogInterface.OnClickListener) new C10910a(), (DialogInterface.OnClickListener) new C10911b(), (DialogInterface.OnClickListener) new C10912c(), (DialogInterface.OnCancelListener) new C10913d());
            if (!C10904j3.this.m39810a(this.f31347a)) {
                C10904j3.this.m39818b();
                C0214c unused2 = C10904j3.this.f31325d = null;
                return;
            }
            if (C10904j3.this.f31325d != null) {
                C10904j3.this.f31325d.show();
            }
            C10904j3.this.m39804a(-1, C10706R.C10708id.invitation_positive);
            C10904j3.this.m39804a(-2, C10706R.C10708id.invitation_negative);
            C10904j3.this.m39804a(-3, C10706R.C10708id.invitation_neutral);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.j3$d */
    class C10914d extends C11033o4 {
        C10914d() {
        }

        /* renamed from: a */
        public void mo27617a() {
            C11007m8.m40311b().mo28768a(MedalliaWebView.C10705f.invitationProducer);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.j3$e */
    static /* synthetic */ class C10915e {

        /* renamed from: a */
        static final /* synthetic */ int[] f31355a;

        /* renamed from: b */
        static final /* synthetic */ int[] f31356b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|5|6|7|8|(2:9|10)|11|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                com.medallia.digital.mobilesdk.MDInterceptActionType[] r0 = com.medallia.digital.mobilesdk.MDInterceptActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31356b = r0
                r1 = 1
                com.medallia.digital.mobilesdk.MDInterceptActionType r2 = com.medallia.digital.mobilesdk.MDInterceptActionType.accepted     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f31356b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.MDInterceptActionType r3 = com.medallia.digital.mobilesdk.MDInterceptActionType.declined     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f31356b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.medallia.digital.mobilesdk.MDInterceptActionType r3 = com.medallia.digital.mobilesdk.MDInterceptActionType.skipped     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = f31356b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.medallia.digital.mobilesdk.MDInterceptActionType r3 = com.medallia.digital.mobilesdk.MDInterceptActionType.deferred     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.medallia.digital.mobilesdk.MDEngagementType[] r2 = com.medallia.digital.mobilesdk.MDEngagementType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f31355a = r2
                com.medallia.digital.mobilesdk.MDEngagementType r3 = com.medallia.digital.mobilesdk.MDEngagementType.appRating     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f31355a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.medallia.digital.mobilesdk.MDEngagementType r2 = com.medallia.digital.mobilesdk.MDEngagementType.form     // Catch:{ NoSuchFieldError -> 0x004e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10904j3.C10915e.<clinit>():void");
        }
    }

    C10904j3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C0214c m39816b(InviteData inviteData, MDAppearanceMode mDAppearanceMode, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnCancelListener onCancelListener) {
        String invitationTitle;
        String invitationBody;
        int i;
        Context context;
        String provideButtonText = inviteData.getProvideButtonText();
        String declineButtonText = inviteData.getDeclineButtonText();
        String laterButtonText = inviteData.getLaterButtonText();
        if (inviteData.getType() == InviteData.C10698a.ALERT) {
            invitationTitle = inviteData.getInvitationHeadline();
            invitationBody = inviteData.getInvitationText();
        } else if (inviteData.getBannerData().getInvitationTitle() == null && inviteData.getBannerData().getInvitationBody() == null) {
            if (!MDEngagementType.form.equals(this.f31324c)) {
                invitationTitle = C10884i4.m39721c().mo28483b().getString(C10706R.string.alert_form_default_title);
                context = C10884i4.m39721c().mo28483b();
                i = C10706R.string.alert_form_default_message;
            } else {
                invitationTitle = C10884i4.m39721c().mo28483b().getString(C10706R.string.alert_app_rating_default_title);
                context = C10884i4.m39721c().mo28483b();
                i = C10706R.string.alert_app_rating_default_message;
            }
            invitationBody = context.getString(i);
        } else {
            invitationTitle = inviteData.getBannerData().getInvitationTitle();
            invitationBody = inviteData.getBannerData().getInvitationBody();
        }
        return C10986l7.m40219c().mo28702a(this.f31336o, provideButtonText, declineButtonText, laterButtonText, invitationTitle, invitationBody, onClickListener, onClickListener2, onClickListener3, onCancelListener, this.f31334m, mDAppearanceMode).create();
    }

    /* renamed from: g */
    private C10880i3.C10883c m39827g() {
        C11184x xVar = this.f31326e;
        if (xVar == null) {
            return null;
        }
        return xVar.mo29173p();
    }

    /* renamed from: h */
    private boolean m39828h() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) C10884i4.m39721c().mo28481a().getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    /* renamed from: l */
    private void m39829l() {
        try {
            this.f31337p = true;
            ReviewManager create = ReviewManagerFactory.create(C10884i4.m39721c().mo28483b());
            Task requestReviewFlow = create.requestReviewFlow();
            C10735b4.m39113e("In App review calling API");
            requestReviewFlow.mo24858c(new C10905a(create));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        this.f31337p = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0214c mo28523a(InviteData inviteData, MDAppearanceMode mDAppearanceMode, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnCancelListener onCancelListener) {
        C0214c b = m39816b(inviteData, mDAppearanceMode, onClickListener, onClickListener2, onClickListener3, onCancelListener);
        this.f31325d = b;
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo28535c() {
        this.f31331j = true;
        try {
            C0214c cVar = this.f31325d;
            if (cVar != null && cVar.isShowing()) {
                this.f31325d.dismiss();
                this.f31325d = null;
            }
            C11184x xVar = this.f31326e;
            if (xVar != null && xVar.mo29181x()) {
                this.f31327f = this.f31326e.mo29170i();
                this.f31328g = this.f31326e.mo29180w();
                this.f31326e.mo29169b();
                this.f31326e = null;
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo28537f() {
        return this.f31323b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo28538i() {
        return this.f31337p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo28539j() {
        InviteData inviteData = this.f31322a;
        return (inviteData == null || inviteData.getType() == null || this.f31322a.getType() != InviteData.C10698a.BANNER) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f31326e;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo28540k() {
        /*
            r1 = this;
            androidx.appcompat.app.c r0 = r1.f31325d
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x0018
        L_0x000a:
            com.medallia.digital.mobilesdk.x r0 = r1.f31326e
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.mo29181x()
            if (r0 != 0) goto L_0x0018
        L_0x0014:
            boolean r0 = r1.f31331j
            if (r0 == 0) goto L_0x001a
        L_0x0018:
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10904j3.mo28540k():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m39821c(C10880i3 i3Var) {
        boolean z;
        String a = m39802a(this.f31322a);
        if (a != null && !a.equals("CUSTOM")) {
            Broadcasts.C10691e.m38947a(Broadcasts.C10691e.C10692a.interceptAccepted, this.f31323b, a, this.f31324c, i3Var);
        }
        int i = C10915e.f31355a[this.f31324c.ordinal()];
        boolean z2 = true;
        if (i == 1) {
            if (a != null && !a.equals("CUSTOM")) {
                AnalyticsBridge.getInstance().reportPromptAcceptedEvent(this.f31323b, a, i3Var);
            }
            Intent intent = new Intent("com.medallia.digital.mobilesdk.AppRatingLastAcceptedTimestampCollectorFilter");
            intent.putExtra("com.medallia.digital.mobilesdk.AppRatingLastAcceptedTimestampCollector", System.currentTimeMillis());
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(intent);
            Context b = C10884i4.m39721c().mo28483b();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setFlags(268435456);
            String str = f31321r + b.getPackageName();
            C11062q qVar = this.f31330i;
            if (!(qVar == null || qVar.mo28923c() == null)) {
                str = f31321r + this.f31330i.mo28923c();
            }
            intent2.setData(Uri.parse(str));
            b.startActivity(intent2);
        } else if (i == 2) {
            ConfigurationContract a2 = C11208y0.m41106c().mo29204a();
            if (a2 == null || a2.getSdkConfiguration() == null || a2.getSdkConfiguration().getFormConfigurations() == null) {
                z = false;
            } else {
                z2 = a2.getSdkConfiguration().getFormConfigurations().isVulnEnabled();
                z = a2.getSdkConfiguration().getFormConfigurations().isInheritOrientation();
            }
            if (a != null && !a.equals("CUSTOM")) {
                AnalyticsBridge.getInstance().reportInvitationAcceptedEvent(this.f31323b, a, i3Var);
            }
            Context b2 = C10884i4.m39721c().mo28483b();
            C11013n2 c = C11138v2.m40821f().mo29070c(this.f31323b);
            Intent intent3 = new Intent(b2, (c == null || c.getFormViewType() != FormViewType.modal) ? MedalliaFullFormActivity.class : MedalliaModalFormActivity.class);
            intent3.putExtra("com.medallia.digital.mobilesdk.form_data", c);
            intent3.putExtra("com.medallia.digital.mobilesdk.vuln_enabled", z2);
            intent3.putExtra("com.medallia.digital.mobilesdk.inherit_orientation", z);
            intent3.addFlags(268435456);
            b2.startActivity(intent3);
        }
    }

    /* renamed from: d */
    private String m39825d() {
        MDEngagementType mDEngagementType = this.f31324c;
        if (mDEngagementType == MDEngagementType.form) {
            C11013n2 n2Var = this.f31332k;
            if (n2Var == null) {
                return null;
            }
            return n2Var.getFormLanguage();
        } else if (mDEngagementType == MDEngagementType.appRating) {
            C11062q qVar = this.f31330i;
            if (qVar == null) {
                return null;
            }
            return qVar.mo28922b();
        } else if (this.f31334m) {
            return this.f31335n;
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public MDEngagementType mo28536e() {
        return this.f31324c;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m39818b() {
        C10914d dVar = new C10914d();
        try {
            ((Activity) C10884i4.m39721c().mo28484d().getBaseContext()).runOnUiThread(dVar);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            try {
                C11004m7.m40304b().mo28764c().execute(dVar);
            } catch (Exception unused) {
                C10735b4.m39111c(e.getMessage());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m39819b(C10880i3 i3Var) {
        String a = m39802a(this.f31322a);
        if (a != null && !a.equals("CUSTOM")) {
            Broadcasts.C10691e.m38947a(Broadcasts.C10691e.C10692a.interceptDeclined, this.f31323b, a, this.f31324c, i3Var);
        }
        int i = C10915e.f31355a[this.f31324c.ordinal()];
        if (i == 1) {
            AnalyticsBridge.getInstance().reportPromptDeclinedEvent(this.f31323b, a, i3Var);
            Intent intent = new Intent("com.medallia.digital.mobilesdk.AppRatingLastDeclineTimestampCollectorFilter");
            intent.putExtra("com.medallia.digital.mobilesdk.AppRatingLastDeclineTimestampCollector", System.currentTimeMillis());
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(intent);
        } else if (i == 2) {
            AnalyticsBridge.getInstance().reportInvitationDeclinedEvent(this.f31323b, a, i3Var);
            long currentTimeMillis = System.currentTimeMillis();
            Intent intent2 = new Intent("com.medallia.digital.mobilesdk.LastDeclineTimestampCollectorFilter");
            intent2.putExtra("com.medallia.digital.mobilesdk.LastDeclineTimestampCollector", currentTimeMillis);
            C10933k4.m40000a(C10884i4.m39721c().mo28483b()).mo28628a(intent2);
            C11089s6.m40668b().mo28984b(C11089s6.C11090a.LAST_DECLINE_TIMESTAMP, String.valueOf(currentTimeMillis));
            C10735b4.m39109b("LastDeclineTimestamp: " + currentTimeMillis + " saved to SharedPreferences");
            m39818b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11184x mo28524a(BannerData bannerData, C10984l5 l5Var, C11207y yVar) {
        C11184x a = mo28525a(bannerData, false, l5Var, yVar);
        this.f31326e = a;
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11184x mo28525a(BannerData bannerData, boolean z, C10984l5 l5Var, C11207y yVar) {
        C10731b0 b0Var = new C10731b0();
        C10992m1.C10995c position = C10992m1.C10995c.getPosition(bannerData.getPosition());
        b0Var.mo28105d(bannerData.getBackgroundColor());
        b0Var.mo28109h(bannerData.getTextColor());
        b0Var.mo28099a(bannerData.getAcceptButtonBackgroundColor());
        b0Var.mo28106e(bannerData.getCloseButtonColor());
        b0Var.mo28103c(bannerData.getAcceptButtonTextColor());
        if (!((!this.f31334m && !this.f31336o) || l5Var == null || l5Var.mo28698b() == null || l5Var.mo28699c() == null || l5Var.mo28697a() == null)) {
            b0Var.mo28105d(l5Var.mo28698b().mo28239a());
            b0Var.mo28109h(l5Var.mo28699c().mo29236c());
            b0Var.mo28099a(l5Var.mo28697a().mo28236a());
            b0Var.mo28106e(l5Var.mo28697a().mo28237b());
            b0Var.mo28103c(l5Var.mo28699c().mo29234a());
        }
        b0Var.mo28098a(position);
        b0Var.mo28108g(bannerData.getInvitationBody());
        b0Var.mo28110i(bannerData.getInvitationTitle());
        b0Var.mo28101b(bannerData.getAcceptButtonText());
        b0Var.mo28102b(bannerData.isPartial());
        b0Var.mo28104c(bannerData.isSticky());
        b0Var.mo28100a(bannerData.isButtonsDisplay());
        b0Var.mo28107f(bannerData.getFont());
        return C11184x.m41026a(this.f31327f, this.f31328g, (Activity) C10884i4.m39721c().mo28484d().getBaseContext(), b0Var.mo28097a(C10884i4.m39721c().mo28484d().getBaseContext(), m39825d()), new C10992m1.C10994b().mo28727a(bannerData.getInvitationTimeout()).mo28726a(position).mo28728a(z).mo28729a(), yVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28533b(String str, MDEngagementType mDEngagementType, long j, long j2, long j3, boolean z) {
        this.f31324c = mDEngagementType;
        this.f31323b = str;
        this.f31331j = false;
        int i = C10915e.f31355a[mDEngagementType.ordinal()];
        if (i == 1) {
            C11062q b = C11138v2.m40821f().mo29064b(str);
            this.f31330i = b;
            if (b == null) {
                m39806a(j, (String) null, Reason.inviteDataMissing, AnalyticsBridge.C10665c.failure);
                return;
            } else if (b.mo28925e()) {
                m39829l();
                return;
            } else {
                this.f31322a = this.f31330i.mo28924d();
                this.f31336o = this.f31330i.mo28927f();
                CollectorsInfrastructure.getInstance().promptDisplayedCollector.mo28117a(Boolean.TRUE);
            }
        } else if (i == 2) {
            C11013n2 c = C11138v2.m40821f().mo29070c(str);
            this.f31332k = c;
            if (c != null) {
                this.f31322a = c.getInviteData();
                this.f31336o = this.f31332k.isDarkModeEnabled();
            } else {
                m39806a(j, (String) null, Reason.inviteDataMissing, AnalyticsBridge.C10665c.failure);
            }
        } else {
            return;
        }
        m39805a(j, j2, j3, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28534b(boolean z) {
        this.f31334m = z;
    }

    /* renamed from: a */
    private String m39802a(InviteData inviteData) {
        if (inviteData == null) {
            return null;
        }
        return inviteData.getType() != null ? inviteData.getType().toString() : "";
    }

    /* renamed from: a */
    private String m39803a(C11221y3.C11224c cVar) {
        String d;
        C11238z3 localization;
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) C10884i4.m39721c().mo28483b().getSystemService("accessibility");
            if (accessibilityManager == null || !accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (d = m39825d()) == null || (localization = C11208y0.m41106c().mo29204a().getLocalization()) == null) {
                return "";
            }
            ResourceContract f = localization.mo29251f();
            String a = C11221y3.m41127d().mo29210a(f != null ? f.getLocalUrl() : null, d, cVar, (C11221y3.C11222a) null);
            return !TextUtils.isEmpty(a) ? a : "";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39804a(int i, int i2) {
        Button i3 = this.f31325d.mo574i(i);
        i3.setMaxLines(1);
        i3.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) i3.getLayoutParams();
        layoutParams.gravity = 8388613;
        i3.setLayoutParams(layoutParams);
        i3.setId(i2);
    }

    /* renamed from: a */
    private void m39805a(long j, long j2, long j3, boolean z) {
        AnalyticsBridge.C10665c cVar;
        Reason reason;
        String str;
        MDAppearanceMode mDAppearanceMode;
        MDAppearanceMode mDAppearanceMode2;
        MDEngagementType mDEngagementType;
        String str2;
        Broadcasts.C10691e.C10692a aVar;
        long j4 = j;
        if (this.f31322a == null) {
            str = this.f31323b;
            reason = Reason.inviteDataMissing;
        } else if (C10884i4.m39721c().mo28484d() != null) {
            C0214c cVar2 = this.f31325d;
            if (cVar2 == null || !cVar2.isShowing()) {
                if (this.f31322a.getType() == InviteData.C10698a.CUSTOM) {
                    if (!m39813a(this.f31322a.getCustomInterceptData(), j, j2, j3)) {
                        return;
                    }
                } else if (this.f31322a.getType() == InviteData.C10698a.ALERT) {
                    if (!m39812a(this.f31322a, j)) {
                        return;
                    }
                } else if (!m39811a(this.f31322a.getBannerData(), j, z)) {
                    return;
                }
                if (!this.f31329h) {
                    String a = m39802a(this.f31322a);
                    if (a != null && !a.equals("CUSTOM")) {
                        if (this.f31336o) {
                            aVar = Broadcasts.C10691e.C10692a.interceptDisplayed;
                            str2 = this.f31323b;
                            mDEngagementType = this.f31324c;
                            mDAppearanceMode2 = C10986l7.m40219c().mo28706b();
                            mDAppearanceMode = C10986l7.m40219c().mo28703a();
                        } else {
                            aVar = Broadcasts.C10691e.C10692a.interceptDisplayed;
                            str2 = this.f31323b;
                            mDEngagementType = this.f31324c;
                            mDAppearanceMode2 = MDAppearanceMode.unknown;
                            mDAppearanceMode = MDAppearanceMode.light;
                        }
                        Broadcasts.C10691e.m38948a(aVar, str2, a, mDEngagementType, (C10880i3) null, mDAppearanceMode2, mDAppearanceMode);
                    }
                    InviteData inviteData = this.f31322a;
                    boolean z2 = (inviteData == null || inviteData.getBannerData() == null || !this.f31322a.getBannerData().isButtonsDisplay()) ? false : true;
                    InviteData inviteData2 = this.f31322a;
                    C10880i3.C10883c cVar3 = (inviteData2 == null || inviteData2.getBannerData() == null || !this.f31322a.getBannerData().isSticky()) ? C10880i3.C10883c.No : C10880i3.C10883c.StickyByConfiguration;
                    if (MDEngagementType.form.equals(this.f31324c) && a != null && !a.equals("CUSTOM")) {
                        AnalyticsBridge.getInstance().reportInvitationDisplayedEvent(this.f31323b, a, new C10880i3(cVar3, z2), C10986l7.m40219c().mo28706b());
                    } else if (MDEngagementType.appRating.equals(this.f31324c)) {
                        AnalyticsBridge.getInstance().reportPromptDisplayedEvent(this.f31323b, a, new C10880i3(cVar3, z2), C10986l7.m40219c().mo28706b());
                    }
                    str = this.f31323b;
                    cVar = AnalyticsBridge.C10665c.success;
                    reason = null;
                    m39806a(j, str, reason, cVar);
                }
                return;
            }
            m39806a(j, this.f31323b, Reason.invitationOpened, AnalyticsBridge.C10665c.failure);
            return;
        } else {
            str = this.f31323b;
            reason = Reason.formInBackground;
        }
        cVar = AnalyticsBridge.C10665c.failure;
        m39806a(j, str, reason, cVar);
    }

    /* renamed from: a */
    private void m39806a(long j, String str, Reason reason, AnalyticsBridge.C10665c cVar) {
        AnalyticsBridge.getInstance().reportInterceptMechanismEvent(j, System.currentTimeMillis(), str, reason, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28526a(C10880i3.C10882b bVar) {
        try {
            this.f31329h = false;
            this.f31331j = false;
            C0214c cVar = this.f31325d;
            if (cVar != null && cVar.isShowing()) {
                this.f31325d.dismiss();
                this.f31325d = null;
                if (bVar != null) {
                    m39807a(new C10880i3((C10880i3.C10883c) null, bVar, false));
                }
            }
            C11184x xVar = this.f31326e;
            if (xVar != null && xVar.mo29181x()) {
                boolean u = this.f31326e.mo29179u();
                this.f31326e.mo29169b();
                this.f31326e = null;
                if (bVar != null) {
                    m39807a(new C10880i3(m39827g(), bVar, u));
                }
            }
            this.f31327f = 0;
            this.f31328g = false;
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39807a(C10880i3 i3Var) {
        String a = m39802a(this.f31322a);
        if (i3Var.mo28476a().equals(C10880i3.C10882b.closed.toString())) {
            Broadcasts.C10691e.m38948a(Broadcasts.C10691e.C10692a.interceptClosed, this.f31323b, this.f31338q, this.f31324c, (C10880i3) null, C10986l7.m40219c().mo28706b(), C10986l7.m40219c().mo28703a());
            AnalyticsBridge.getInstance().reportCloseEngagementEvent(this.f31324c.toString(), this.f31338q, this.f31323b);
        } else {
            Broadcasts.C10691e.m38947a(Broadcasts.C10691e.C10692a.interceptDeferred, this.f31323b, a, this.f31324c, i3Var);
            int i = C10915e.f31355a[this.f31324c.ordinal()];
            if (i == 1) {
                AnalyticsBridge.getInstance().reportPromptDeferredEvent(this.f31323b, a, i3Var);
            } else if (i == 2) {
                AnalyticsBridge.getInstance().reportInvitationDeferredEvent(this.f31323b, a, i3Var);
            }
        }
        MDEngagementType mDEngagementType = this.f31324c;
        if (mDEngagementType != null && mDEngagementType.equals(MDEngagementType.form)) {
            m39818b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28527a(String str) {
        this.f31335n = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28528a(String str, MDEngagementType mDEngagementType, long j, long j2, long j3) {
        mo28529a(str, mDEngagementType, j, j2, j3, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28529a(String str, MDEngagementType mDEngagementType, long j, long j2, long j3, boolean z) {
        this.f31329h = true;
        try {
            C0214c cVar = this.f31325d;
            if (cVar != null && cVar.isShowing()) {
                this.f31325d.dismiss();
                this.f31325d = null;
            }
            C11184x xVar = this.f31326e;
            if (xVar != null && xVar.mo29181x()) {
                this.f31327f = this.f31326e.mo29170i();
                this.f31328g = this.f31326e.mo29180w();
                this.f31326e.mo29169b();
                this.f31326e = null;
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        mo28533b(str, mDEngagementType, j, j2, j3, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28530a(String str, MDInterceptActionType mDInterceptActionType, MDFailureCallback mDFailureCallback) {
        String str2;
        StringBuilder sb;
        MDEngagementType mDEngagementType = this.f31324c;
        String str3 = mDEngagementType != null ? mDEngagementType.toString() : null;
        String str4 = this.f31333l;
        if (str4 == null || !str4.equals(str)) {
            MDExternalError mDExternalError = new MDExternalError(MDExternalError.ExternalError.FORM_INVALID_ENGAGEMENT_ID);
            mDFailureCallback.onError(mDExternalError);
            AnalyticsBridge.getInstance().reportCustomInterceptTriggerCallbackEvent(AnalyticsBridge.C10665c.failure, str, str3, Integer.valueOf(mDExternalError.getErrorCode()), mDExternalError.getMessage());
            C10735b4.m39111c(mDExternalError.getMessage() + ", engagementId ID: " + str);
            return;
        }
        AnalyticsBridge.getInstance().reportCustomInterceptTriggerCallbackEvent(AnalyticsBridge.C10665c.success, str, str3, (Integer) null, (String) null);
        int i = C10915e.f31356b[mDInterceptActionType.ordinal()];
        if (i == 1) {
            m39821c((C10880i3) null);
            AnalyticsBridge.getInstance().reportCustomInterceptAcceptedEvent(str);
            sb = new StringBuilder();
            str2 = "Custom Intercept was Accepted engagementId: ";
        } else if (i == 2) {
            m39819b((C10880i3) null);
            AnalyticsBridge.getInstance().reportCustomInterceptDeclinedEvent(str);
            sb = new StringBuilder();
            str2 = "Custom Intercept was Declined engagementId: ";
        } else if (i != 3) {
            if (i == 4) {
                m39818b();
                AnalyticsBridge.getInstance().reportCustomInterceptDeferredEvent(str);
                sb = new StringBuilder();
                str2 = "Custom Intercept was Deferred engagementId: ";
            }
            this.f31333l = null;
        } else {
            m39821c((C10880i3) null);
            AnalyticsBridge.getInstance().reportCustomInterceptSkippedEvent(str);
            sb = new StringBuilder();
            str2 = "Custom Intercept was Skipped engagementId: ";
        }
        sb.append(str2);
        sb.append(str);
        sb.append(", engagementType: ");
        sb.append(str3);
        C10735b4.m39113e(sb.toString());
        this.f31333l = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28531a(boolean z) {
        this.f31331j = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28532a() {
        if (!mo28540k()) {
            return false;
        }
        mo28526a(C10880i3.C10882b.closed);
        this.f31338q = (this.f31322a.getType() == InviteData.C10698a.BANNER ? C10774d3.BANNER : C10774d3.ALERT).toString();
        C10735b4.m39113e(this.f31338q + " Closed successfully");
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m39810a(long j) {
        String str;
        Reason reason;
        C11184x xVar;
        if (!C11246z6.m41212b().mo29266c()) {
            str = this.f31323b;
            reason = Reason.interceptDisabled;
        } else if (C11164w3.m40939b().mo29120e()) {
            str = this.f31323b;
            reason = Reason.formOpened;
        } else {
            C0214c cVar = this.f31325d;
            if ((cVar == null || !cVar.isShowing()) && ((xVar = this.f31326e) == null || !xVar.mo29181x())) {
                C10864h7 f = C10887i7.m39741e().mo28491f();
                if (f == null || !f.isShowing()) {
                    return true;
                }
                str = this.f31323b;
                reason = Reason.thankYouPromptOpened;
            } else {
                str = this.f31323b;
                reason = Reason.invitationOpened;
            }
        }
        m39806a(j, str, reason, AnalyticsBridge.C10665c.failure);
        return false;
    }

    /* renamed from: a */
    private boolean m39811a(BannerData bannerData, long j, boolean z) {
        if (bannerData == null || bannerData.getInvitationBody() == null || bannerData.getInvitationTitle() == null) {
            m39806a(j, this.f31323b, Reason.inviteDataMissing, AnalyticsBridge.C10665c.failure);
            return false;
        }
        try {
            ((Activity) C10884i4.m39721c().mo28484d().getBaseContext()).runOnUiThread(new C10907b(j, bannerData, z));
            return true;
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    private boolean m39812a(InviteData inviteData, long j) {
        if (inviteData.getProvideButtonText() == null || inviteData.getDeclineButtonText() == null || inviteData.getLaterButtonText() == null) {
            m39806a(j, this.f31323b, Reason.inviteDataMissing, AnalyticsBridge.C10665c.failure);
            return false;
        }
        try {
            ((Activity) C10884i4.m39721c().mo28484d().getBaseContext()).runOnUiThread(new C10909c(j, inviteData));
            return true;
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    private boolean m39813a(C10803f1 f1Var, long j, long j2, long j3) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        this.f31333l = this.f31323b;
        if (!m39810a(j)) {
            return false;
        }
        if (f1Var != null) {
            String c = f1Var.mo28290c();
            String b = f1Var.mo28289b();
            String e = f1Var.mo28292e();
            str2 = f1Var.mo28288a();
            str = f1Var.mo28291d();
            str4 = b;
            str3 = e;
            str5 = c;
        } else {
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        Broadcasts.C10684b.m38935a(Broadcasts.C10684b.C10685a.TargetEvaluationSuccess, this.f31323b, j3, j2, this.f31324c, new MDCustomInterceptPayload(str5, str4, str3, str2, str));
        return true;
    }
}
