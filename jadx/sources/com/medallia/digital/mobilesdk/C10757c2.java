package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.c2 */
class C10757c2 {

    /* renamed from: A */
    private C10733b2 f30754A;

    /* renamed from: B */
    private C10733b2 f30755B;

    /* renamed from: C */
    private C10733b2 f30756C;

    /* renamed from: D */
    private C10733b2 f30757D;

    /* renamed from: E */
    private C10733b2 f30758E;

    /* renamed from: F */
    private C10733b2 f30759F;

    /* renamed from: G */
    private C10733b2 f30760G;

    /* renamed from: H */
    private C10733b2 f30761H;

    /* renamed from: I */
    private C10733b2 f30762I;

    /* renamed from: J */
    private C10733b2 f30763J;

    /* renamed from: K */
    private C10733b2 f30764K;

    /* renamed from: L */
    private C10733b2 f30765L;

    /* renamed from: M */
    private C10733b2 f30766M;

    /* renamed from: N */
    private C10733b2 f30767N;

    /* renamed from: O */
    private C10733b2 f30768O;

    /* renamed from: P */
    private C10733b2 f30769P;

    /* renamed from: Q */
    private C10733b2 f30770Q;

    /* renamed from: R */
    private C10733b2 f30771R;

    /* renamed from: S */
    private C10733b2 f30772S;

    /* renamed from: T */
    private C10733b2 f30773T;

    /* renamed from: U */
    private C10733b2 f30774U;

    /* renamed from: V */
    private C10733b2 f30775V;

    /* renamed from: W */
    private C10733b2 f30776W;

    /* renamed from: X */
    private C10733b2 f30777X;

    /* renamed from: Y */
    private C10733b2 f30778Y;

    /* renamed from: Z */
    private C10733b2 f30779Z;

    /* renamed from: a */
    private C10733b2 f30780a;

    /* renamed from: a0 */
    private C10733b2 f30781a0;

    /* renamed from: b */
    private C10733b2 f30782b;

    /* renamed from: b0 */
    private C10733b2 f30783b0;

    /* renamed from: c */
    private C10733b2 f30784c;

    /* renamed from: c0 */
    private C10733b2 f30785c0;

    /* renamed from: d */
    private C10733b2 f30786d;

    /* renamed from: d0 */
    private C10733b2 f30787d0;

    /* renamed from: e */
    private C10733b2 f30788e;

    /* renamed from: e0 */
    private C10733b2 f30789e0;

    /* renamed from: f */
    private C10733b2 f30790f;

    /* renamed from: f0 */
    private C10733b2 f30791f0;

    /* renamed from: g */
    private C10733b2 f30792g;

    /* renamed from: g0 */
    private C10733b2 f30793g0;

    /* renamed from: h */
    private C10733b2 f30794h;

    /* renamed from: h0 */
    private C10733b2 f30795h0;

    /* renamed from: i */
    private C10733b2 f30796i;

    /* renamed from: i0 */
    private C10733b2 f30797i0;

    /* renamed from: j */
    private C10733b2 f30798j;

    /* renamed from: j0 */
    private C10733b2 f30799j0;

    /* renamed from: k */
    private C10733b2 f30800k;

    /* renamed from: k0 */
    private C10733b2 f30801k0;

    /* renamed from: l */
    private C10733b2 f30802l;

    /* renamed from: l0 */
    private C10733b2 f30803l0;

    /* renamed from: m */
    private C10733b2 f30804m;

    /* renamed from: n */
    private C10733b2 f30805n;

    /* renamed from: o */
    private C10733b2 f30806o;

    /* renamed from: p */
    private C10733b2 f30807p;

    /* renamed from: q */
    private C10733b2 f30808q;

    /* renamed from: r */
    private C10733b2 f30809r;

    /* renamed from: s */
    private C10733b2 f30810s;

    /* renamed from: t */
    private C10733b2 f30811t;

    /* renamed from: u */
    private C10733b2 f30812u;

    /* renamed from: v */
    private C10733b2 f30813v;

    /* renamed from: w */
    private C10733b2 f30814w;

    /* renamed from: x */
    private C10733b2 f30815x;

    /* renamed from: y */
    private C10733b2 f30816y;

    /* renamed from: z */
    private C10733b2 f30817z;

    C10757c2(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        String str2 = "FormDisplayed";
        String str3 = "ShowFormCallback";
        String str4 = "InitCallback";
        String str5 = "CustomInterceptSkipped";
        String str6 = "CustomInterceptDeferred";
        String str7 = "CustomInterceptDeclined";
        String str8 = "CustomInterceptAccepted";
        String str9 = "InvitationDeferred";
        String str10 = "InvitationDeclined";
        try {
            if (!jSONObject2.has("Init") || jSONObject2.isNull("Init")) {
                str = "InvitationAccepted";
            } else {
                str = "InvitationAccepted";
                this.f30780a = new C10733b2(jSONObject2.getJSONObject("Init"));
            }
            if (jSONObject2.has("ShowForm") && !jSONObject2.isNull("ShowForm")) {
                this.f30782b = new C10733b2(jSONObject2.getJSONObject("ShowForm"));
            }
            if (jSONObject2.has("SetCustomParameter") && !jSONObject2.isNull("SetCustomParameter")) {
                this.f30784c = new C10733b2(jSONObject2.getJSONObject("SetCustomParameter"));
            }
            if (jSONObject2.has("SetCustomParameters") && !jSONObject2.isNull("SetCustomParameters")) {
                this.f30786d = new C10733b2(jSONObject2.getJSONObject("SetCustomParameters"));
            }
            if (jSONObject2.has("EnableIntercept") && !jSONObject2.isNull("EnableIntercept")) {
                this.f30788e = new C10733b2(jSONObject2.getJSONObject("EnableIntercept"));
            }
            if (jSONObject2.has("DisableIntercept") && !jSONObject2.isNull("DisableIntercept")) {
                this.f30790f = new C10733b2(jSONObject2.getJSONObject("DisableIntercept"));
            }
            if (jSONObject2.has("HandleNotification") && !jSONObject2.isNull("HandleNotification")) {
                this.f30792g = new C10733b2(jSONObject2.getJSONObject("HandleNotification"));
            }
            if (jSONObject2.has("StopSDK") && !jSONObject2.isNull("StopSDK")) {
                this.f30794h = new C10733b2(jSONObject2.getJSONObject("StopSDK"));
            }
            if (jSONObject2.has("RevertStopSDK") && !jSONObject2.isNull("RevertStopSDK")) {
                this.f30796i = new C10733b2(jSONObject2.getJSONObject("RevertStopSDK"));
            }
            if (jSONObject2.has("FeedbackRetryMechanism") && !jSONObject2.isNull("FeedbackRetryMechanism")) {
                this.f30798j = new C10733b2(jSONObject2.getJSONObject("FeedbackRetryMechanism"));
            }
            if (jSONObject2.has("MediaFeedbackRetryMechanism") && !jSONObject2.isNull("MediaFeedbackRetryMechanism")) {
                this.f30800k = new C10733b2(jSONObject2.getJSONObject("MediaFeedbackRetryMechanism"));
            }
            if (jSONObject2.has("InvitationDisplayed") && !jSONObject2.isNull("InvitationDisplayed")) {
                this.f30802l = new C10733b2(jSONObject2.getJSONObject("InvitationDisplayed"));
            }
            String str11 = str;
            if (jSONObject2.has(str11) && !jSONObject2.isNull(str11)) {
                this.f30804m = new C10733b2(jSONObject2.getJSONObject(str11));
            }
            String str12 = str10;
            if (jSONObject2.has(str12) && !jSONObject2.isNull(str12)) {
                this.f30805n = new C10733b2(jSONObject2.getJSONObject(str12));
            }
            String str13 = str9;
            if (jSONObject2.has(str13) && !jSONObject2.isNull(str13)) {
                this.f30806o = new C10733b2(jSONObject2.getJSONObject(str13));
            }
            String str14 = str8;
            if (jSONObject2.has(str14) && !jSONObject2.isNull(str14)) {
                this.f30808q = new C10733b2(jSONObject2.getJSONObject(str14));
            }
            String str15 = str7;
            if (jSONObject2.has(str15) && !jSONObject2.isNull(str15)) {
                this.f30809r = new C10733b2(jSONObject2.getJSONObject(str15));
            }
            String str16 = str6;
            if (jSONObject2.has(str16) && !jSONObject2.isNull(str16)) {
                this.f30810s = new C10733b2(jSONObject2.getJSONObject(str16));
            }
            String str17 = str5;
            if (jSONObject2.has(str17) && !jSONObject2.isNull(str17)) {
                this.f30811t = new C10733b2(jSONObject2.getJSONObject(str17));
            }
            String str18 = str4;
            if (jSONObject2.has(str18) && !jSONObject2.isNull(str18)) {
                this.f30815x = new C10733b2(jSONObject2.getJSONObject(str18));
            }
            String str19 = str3;
            if (jSONObject2.has(str19) && !jSONObject2.isNull(str19)) {
                this.f30816y = new C10733b2(jSONObject2.getJSONObject(str19));
            }
            String str20 = str2;
            if (jSONObject2.has(str20) && !jSONObject2.isNull(str20)) {
                this.f30817z = new C10733b2(jSONObject2.getJSONObject(str20));
            }
            if (jSONObject2.has("FormLoaded") && !jSONObject2.isNull("FormLoaded")) {
                this.f30754A = new C10733b2(jSONObject2.getJSONObject("FormLoaded"));
            }
            if (jSONObject2.has("FormSubmitted") && !jSONObject2.isNull("FormSubmitted")) {
                this.f30755B = new C10733b2(jSONObject2.getJSONObject("FormSubmitted"));
            }
            if (jSONObject2.has("FormDismissed") && !jSONObject2.isNull("FormDismissed")) {
                this.f30756C = new C10733b2(jSONObject2.getJSONObject("FormDismissed"));
            }
            if (jSONObject2.has("FormClosed") && !jSONObject2.isNull("FormClosed")) {
                this.f30757D = new C10733b2(jSONObject2.getJSONObject("FormClosed"));
            }
            if (jSONObject2.has("ThankYouPromptDisplayed") && !jSONObject2.isNull("ThankYouPromptDisplayed")) {
                this.f30758E = new C10733b2(jSONObject2.getJSONObject("ThankYouPromptDisplayed"));
            }
            if (jSONObject2.has("PromptDisplayed") && !jSONObject2.isNull("PromptDisplayed")) {
                this.f30759F = new C10733b2(jSONObject2.getJSONObject("PromptDisplayed"));
            }
            if (jSONObject2.has("PromptAccepted") && !jSONObject2.isNull("PromptAccepted")) {
                this.f30760G = new C10733b2(jSONObject2.getJSONObject("PromptAccepted"));
            }
            if (jSONObject2.has("PromptDeclined") && !jSONObject2.isNull("PromptDeclined")) {
                this.f30761H = new C10733b2(jSONObject2.getJSONObject("PromptDeclined"));
            }
            if (jSONObject2.has("PromptDeferred") && !jSONObject2.isNull("PromptDeferred")) {
                this.f30762I = new C10733b2(jSONObject2.getJSONObject("PromptDeferred"));
            }
            if (jSONObject2.has("PromptTriggered") && !jSONObject2.isNull("PromptTriggered")) {
                this.f30763J = new C10733b2(jSONObject2.getJSONObject("PromptTriggered"));
            }
            if (jSONObject2.has("RefreshSession") && !jSONObject2.isNull("RefreshSession")) {
                this.f30764K = new C10733b2(jSONObject2.getJSONObject("RefreshSession"));
            }
            if (jSONObject2.has("FormLoadSpinner") && !jSONObject2.isNull("FormLoadSpinner")) {
                this.f30765L = new C10733b2(jSONObject2.getJSONObject("FormLoadSpinner"));
            }
            if (jSONObject2.has("SubmitFeedback") && !jSONObject2.isNull("SubmitFeedback")) {
                this.f30766M = new C10733b2(jSONObject2.getJSONObject("SubmitFeedback"));
            }
            if (jSONObject2.has("MediaCaptureSubmit") && !jSONObject2.isNull("MediaCaptureSubmit")) {
                this.f30767N = new C10733b2(jSONObject2.getJSONObject("MediaCaptureSubmit"));
            }
            if (jSONObject2.has("MediaCaptureCollected") && !jSONObject2.isNull("MediaCaptureCollected")) {
                this.f30768O = new C10733b2(jSONObject2.getJSONObject("MediaCaptureCollected"));
            }
            if (jSONObject2.has("SetInvitationListener") && !jSONObject2.isNull("SetInvitationListener")) {
                this.f30769P = new C10733b2(jSONObject2.getJSONObject("SetInvitationListener"));
            }
            if (jSONObject2.has("SetInterceptListener") && !jSONObject2.isNull("SetInterceptListener")) {
                this.f30770Q = new C10733b2(jSONObject2.getJSONObject("SetInterceptListener"));
            }
            if (jSONObject2.has("SetCustomInterceptListener") && !jSONObject2.isNull("SetCustomInterceptListener")) {
                this.f30771R = new C10733b2(jSONObject2.getJSONObject("SetCustomInterceptListener"));
            }
            if (jSONObject2.has("SetFormListener") && !jSONObject2.isNull("SetFormListener")) {
                this.f30772S = new C10733b2(jSONObject2.getJSONObject("SetFormListener"));
            }
            if (jSONObject2.has("SetFeedbackListener") && !jSONObject2.isNull("SetFeedbackListener")) {
                this.f30773T = new C10733b2(jSONObject2.getJSONObject("SetFeedbackListener"));
            }
            if (jSONObject2.has("Logger") && !jSONObject2.isNull("Logger")) {
                this.f30774U = new C10733b2(jSONObject2.getJSONObject("Logger"));
            }
            if (jSONObject2.has("SetInterceptCallback") && !jSONObject2.isNull("SetInterceptCallback")) {
                this.f30775V = new C10733b2(jSONObject2.getJSONObject("SetInterceptCallback"));
            }
            if (jSONObject2.has("SetCustomInterceptCallback") && !jSONObject2.isNull("SetCustomInterceptCallback")) {
                this.f30776W = new C10733b2(jSONObject2.getJSONObject("SetCustomInterceptCallback"));
            }
            if (jSONObject2.has("CustomInterceptTriggerCallback") && !jSONObject2.isNull("CustomInterceptTriggerCallback")) {
                this.f30777X = new C10733b2(jSONObject2.getJSONObject("CustomInterceptTriggerCallback"));
            }
            if (jSONObject2.has("SetFormCallback") && !jSONObject2.isNull("SetFormCallback")) {
                this.f30778Y = new C10733b2(jSONObject2.getJSONObject("SetFormCallback"));
            }
            if (jSONObject2.has("SetCustomAppearance") && !jSONObject2.isNull("SetCustomAppearance")) {
                this.f30812u = new C10733b2(jSONObject2.getJSONObject("SetCustomAppearance"));
            }
            if (jSONObject2.has("CloseEngagement") && !jSONObject2.isNull("CloseEngagement")) {
                this.f30813v = new C10733b2(jSONObject2.getJSONObject("CloseEngagement"));
            }
            if (jSONObject2.has("SetUserId") && !jSONObject2.isNull("SetUserId")) {
                this.f30814w = new C10733b2(jSONObject2.getJSONObject("SetUserId"));
            }
            if (jSONObject2.has("SetFeedbackCallback") && !jSONObject2.isNull("SetFeedbackCallback")) {
                this.f30779Z = new C10733b2(jSONObject2.getJSONObject("SetFeedbackCallback"));
            }
            if (jSONObject2.has("PreLoadMechanism") && !jSONObject2.isNull("PreLoadMechanism")) {
                this.f30781a0 = new C10733b2(jSONObject2.getJSONObject("PreLoadMechanism"));
            }
            if (jSONObject2.has("TargetEvaluator") && !jSONObject2.isNull("TargetEvaluator")) {
                this.f30783b0 = new C10733b2(jSONObject2.getJSONObject("TargetEvaluator"));
            }
            if (jSONObject2.has("NativeTargetEvaluator") && !jSONObject2.isNull("NativeTargetEvaluator")) {
                this.f30785c0 = new C10733b2(jSONObject2.getJSONObject("NativeTargetEvaluator"));
            }
            if (jSONObject2.has("InterceptMechanism") && !jSONObject2.isNull("InterceptMechanism")) {
                this.f30787d0 = new C10733b2(jSONObject2.getJSONObject("InterceptMechanism"));
            }
            if (jSONObject2.has("RestClient") && !jSONObject2.isNull("RestClient")) {
                this.f30789e0 = new C10733b2(jSONObject2.getJSONObject("RestClient"));
            }
            if (jSONObject2.has("InternalError") && !jSONObject2.isNull("InternalError")) {
                this.f30791f0 = new C10733b2(jSONObject2.getJSONObject("InternalError"));
            }
            if (jSONObject2.has("SetActivity") && !jSONObject2.isNull("SetActivity")) {
                this.f30793g0 = new C10733b2(jSONObject2.getJSONObject("SetActivity"));
            }
            if (jSONObject2.has("MedalliaCrash") && !jSONObject2.isNull("MedalliaCrash")) {
                this.f30795h0 = new C10733b2(jSONObject2.getJSONObject("MedalliaCrash"));
            }
            if (jSONObject2.has("InitOfflineMechanism") && !jSONObject2.isNull("InitOfflineMechanism")) {
                this.f30797i0 = new C10733b2(jSONObject2.getJSONObject("InitOfflineMechanism"));
            }
            if (jSONObject2.has("ResourcesSize") && !jSONObject2.isNull("ResourcesSize")) {
                this.f30799j0 = new C10733b2(jSONObject2.getJSONObject("ResourcesSize"));
            }
            if (jSONObject2.has("RestoreFromKillSDK") && !jSONObject2.isNull("RestoreFromKillSDK")) {
                this.f30803l0 = new C10733b2(jSONObject2.getJSONObject("RestoreFromKillSDK"));
            }
            if (jSONObject2.has("DeleteStorage") && !jSONObject2.isNull("DeleteStorage")) {
                this.f30801k0 = new C10733b2(jSONObject2.getJSONObject("DeleteStorage"));
            }
            if (jSONObject2.has("UpdateCustomLocale") && !jSONObject2.isNull("UpdateCustomLocale")) {
                this.f30807p = new C10733b2(jSONObject2.getJSONObject("UpdateCustomLocale"));
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C10733b2 mo28151A() {
        return this.f30802l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public C10733b2 mo28152B() {
        return this.f30774U;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public C10733b2 mo28153C() {
        return this.f30795h0;
    }

    /* renamed from: D */
    public C10733b2 mo28154D() {
        return this.f30768O;
    }

    /* renamed from: E */
    public C10733b2 mo28155E() {
        return this.f30767N;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public C10733b2 mo28156F() {
        return this.f30800k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public C10733b2 mo28157G() {
        return this.f30785c0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public C10733b2 mo28158H() {
        return this.f30781a0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public C10733b2 mo28159I() {
        return this.f30760G;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public C10733b2 mo28160J() {
        return this.f30761H;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public C10733b2 mo28161K() {
        return this.f30762I;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public C10733b2 mo28162L() {
        return this.f30759F;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public C10733b2 mo28163M() {
        return this.f30763J;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public C10733b2 mo28164N() {
        return this.f30764K;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public C10733b2 mo28165O() {
        return this.f30799j0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public C10733b2 mo28166P() {
        return this.f30789e0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public C10733b2 mo28167Q() {
        return this.f30803l0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public C10733b2 mo28168R() {
        return this.f30796i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public C10733b2 mo28169S() {
        return this.f30793g0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public C10733b2 mo28170T() {
        return this.f30812u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public C10733b2 mo28171U() {
        return this.f30776W;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public C10733b2 mo28172V() {
        return this.f30771R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public C10733b2 mo28173W() {
        return this.f30784c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public C10733b2 mo28174X() {
        return this.f30786d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public C10733b2 mo28175Y() {
        return this.f30779Z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public C10733b2 mo28176Z() {
        return this.f30773T;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10733b2 mo28177a() {
        return this.f30813v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public C10733b2 mo28178a0() {
        return this.f30778Y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10733b2 mo28179b() {
        return this.f30808q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public C10733b2 mo28180b0() {
        return this.f30772S;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C10733b2 mo28181c() {
        return this.f30809r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public C10733b2 mo28182c0() {
        return this.f30775V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C10733b2 mo28183d() {
        return this.f30810s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public C10733b2 mo28184d0() {
        return this.f30770Q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C10733b2 mo28185e() {
        return this.f30811t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public C10733b2 mo28186e0() {
        return this.f30769P;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C10733b2 mo28187f() {
        return this.f30777X;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public C10733b2 mo28188f0() {
        return this.f30814w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C10733b2 mo28189g() {
        return this.f30801k0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public C10733b2 mo28190g0() {
        return this.f30782b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C10733b2 mo28191h() {
        return this.f30790f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public C10733b2 mo28192h0() {
        return this.f30816y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C10733b2 mo28193i() {
        return this.f30788e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public C10733b2 mo28194i0() {
        return this.f30794h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C10733b2 mo28195j() {
        return this.f30798j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public C10733b2 mo28196j0() {
        return this.f30766M;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C10733b2 mo28197k() {
        return this.f30757D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public C10733b2 mo28198k0() {
        return this.f30783b0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C10733b2 mo28199l() {
        return this.f30756C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public C10733b2 mo28200l0() {
        return this.f30807p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C10733b2 mo28201m() {
        return this.f30817z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public String mo28202m0() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"Init\":");
            C10733b2 b2Var = this.f30780a;
            String str = "null";
            sb.append(b2Var == null ? str : b2Var.mo28115e());
            sb.append(",\"ShowForm\":");
            C10733b2 b2Var2 = this.f30782b;
            sb.append(b2Var2 == null ? str : b2Var2.mo28115e());
            sb.append(",\"SetCustomParameter\":");
            C10733b2 b2Var3 = this.f30784c;
            sb.append(b2Var3 == null ? str : b2Var3.mo28115e());
            sb.append(",\"SetCustomParameters\":");
            C10733b2 b2Var4 = this.f30786d;
            sb.append(b2Var4 == null ? str : b2Var4.mo28115e());
            sb.append(",\"EnableIntercept\":");
            C10733b2 b2Var5 = this.f30788e;
            sb.append(b2Var5 == null ? str : b2Var5.mo28115e());
            sb.append(",\"DisableIntercept\":");
            C10733b2 b2Var6 = this.f30790f;
            sb.append(b2Var6 == null ? str : b2Var6.mo28115e());
            sb.append(",\"HandleNotification\":");
            C10733b2 b2Var7 = this.f30792g;
            sb.append(b2Var7 == null ? str : b2Var7.mo28115e());
            sb.append(",\"StopSDK\":");
            C10733b2 b2Var8 = this.f30794h;
            sb.append(b2Var8 == null ? str : b2Var8.mo28115e());
            sb.append(",\"RevertStopSDK\":");
            C10733b2 b2Var9 = this.f30796i;
            sb.append(b2Var9 == null ? str : b2Var9.mo28115e());
            sb.append(",\"FeedbackRetryMechanism\":");
            C10733b2 b2Var10 = this.f30798j;
            sb.append(b2Var10 == null ? str : b2Var10.mo28115e());
            sb.append(",\"MediaFeedbackRetryMechanism\":");
            C10733b2 b2Var11 = this.f30800k;
            sb.append(b2Var11 == null ? str : b2Var11.mo28115e());
            sb.append(",\"InvitationDisplayed\":");
            C10733b2 b2Var12 = this.f30802l;
            sb.append(b2Var12 == null ? str : b2Var12.mo28115e());
            sb.append(",\"InvitationAccepted\":");
            C10733b2 b2Var13 = this.f30804m;
            sb.append(b2Var13 == null ? str : b2Var13.mo28115e());
            sb.append(",\"InvitationDeclined\":");
            C10733b2 b2Var14 = this.f30805n;
            sb.append(b2Var14 == null ? str : b2Var14.mo28115e());
            sb.append(",\"InvitationDeferred\":");
            C10733b2 b2Var15 = this.f30806o;
            sb.append(b2Var15 == null ? str : b2Var15.mo28115e());
            sb.append(",\"CustomInterceptAccepted\":");
            C10733b2 b2Var16 = this.f30808q;
            sb.append(b2Var16 == null ? str : b2Var16.mo28115e());
            sb.append(",\"CustomInterceptDeclined\":");
            C10733b2 b2Var17 = this.f30809r;
            sb.append(b2Var17 == null ? str : b2Var17.mo28115e());
            sb.append(",\"CustomInterceptSkipped\":");
            C10733b2 b2Var18 = this.f30811t;
            sb.append(b2Var18 == null ? str : b2Var18.mo28115e());
            sb.append(",\"CustomInterceptDeferred\":");
            C10733b2 b2Var19 = this.f30810s;
            sb.append(b2Var19 == null ? str : b2Var19.mo28115e());
            sb.append(",\"InitCallback\":");
            C10733b2 b2Var20 = this.f30815x;
            sb.append(b2Var20 == null ? str : b2Var20.mo28115e());
            sb.append(",\"ShowFormCallback\":");
            C10733b2 b2Var21 = this.f30816y;
            sb.append(b2Var21 == null ? str : b2Var21.mo28115e());
            sb.append(",\"FormDisplayed\":");
            C10733b2 b2Var22 = this.f30817z;
            sb.append(b2Var22 == null ? str : b2Var22.mo28115e());
            sb.append(",\"FormLoaded\":");
            C10733b2 b2Var23 = this.f30754A;
            sb.append(b2Var23 == null ? str : b2Var23.mo28115e());
            sb.append(",\"FormSubmitted\":");
            C10733b2 b2Var24 = this.f30755B;
            sb.append(b2Var24 == null ? str : b2Var24.mo28115e());
            sb.append(",\"FormDismissed\":");
            C10733b2 b2Var25 = this.f30756C;
            sb.append(b2Var25 == null ? str : b2Var25.mo28115e());
            sb.append(",\"FormClosed\":");
            C10733b2 b2Var26 = this.f30757D;
            sb.append(b2Var26 == null ? str : b2Var26.mo28115e());
            sb.append(",\"ThankYouPromptDisplayed\":");
            C10733b2 b2Var27 = this.f30758E;
            sb.append(b2Var27 == null ? str : b2Var27.mo28115e());
            sb.append(",\"PromptDisplayed\":");
            C10733b2 b2Var28 = this.f30759F;
            sb.append(b2Var28 == null ? str : b2Var28.mo28115e());
            sb.append(",\"PromptAccepted\":");
            C10733b2 b2Var29 = this.f30760G;
            sb.append(b2Var29 == null ? str : b2Var29.mo28115e());
            sb.append(",\"PromptDeclined\":");
            C10733b2 b2Var30 = this.f30761H;
            sb.append(b2Var30 == null ? str : b2Var30.mo28115e());
            sb.append(",\"PromptDeferred\":");
            C10733b2 b2Var31 = this.f30762I;
            sb.append(b2Var31 == null ? str : b2Var31.mo28115e());
            sb.append(",\"PromptTriggered\":");
            C10733b2 b2Var32 = this.f30763J;
            sb.append(b2Var32 == null ? str : b2Var32.mo28115e());
            sb.append(",\"RefreshSession\":");
            C10733b2 b2Var33 = this.f30764K;
            sb.append(b2Var33 == null ? str : b2Var33.mo28115e());
            sb.append(",\"FormLoadSpinner\":");
            C10733b2 b2Var34 = this.f30765L;
            sb.append(b2Var34 == null ? str : b2Var34.mo28115e());
            sb.append(",\"SubmitFeedback\":");
            C10733b2 b2Var35 = this.f30766M;
            sb.append(b2Var35 == null ? str : b2Var35.mo28115e());
            sb.append(",\"MediaCaptureSubmit\":");
            C10733b2 b2Var36 = this.f30767N;
            sb.append(b2Var36 == null ? str : b2Var36.mo28115e());
            sb.append(",\"MediaCaptureCollected\":");
            C10733b2 b2Var37 = this.f30768O;
            sb.append(b2Var37 == null ? str : b2Var37.mo28115e());
            sb.append(",\"SetInvitationListener\":");
            C10733b2 b2Var38 = this.f30769P;
            sb.append(b2Var38 == null ? str : b2Var38.mo28115e());
            sb.append(",\"SetInterceptListener\":");
            C10733b2 b2Var39 = this.f30770Q;
            sb.append(b2Var39 == null ? str : b2Var39.mo28115e());
            sb.append(",\"SetCustomInterceptListener\":");
            C10733b2 b2Var40 = this.f30771R;
            sb.append(b2Var40 == null ? str : b2Var40.mo28115e());
            sb.append(",\"SetFormListener\":");
            C10733b2 b2Var41 = this.f30772S;
            sb.append(b2Var41 == null ? str : b2Var41.mo28115e());
            sb.append(",\"SetCustomAppearance\":");
            C10733b2 b2Var42 = this.f30812u;
            sb.append(b2Var42 == null ? str : b2Var42.mo28115e());
            sb.append(",\"CloseEngagement\":");
            C10733b2 b2Var43 = this.f30813v;
            sb.append(b2Var43 == null ? str : b2Var43.mo28115e());
            sb.append(",\"SetUserId\":");
            C10733b2 b2Var44 = this.f30814w;
            sb.append(b2Var44 == null ? str : b2Var44.mo28115e());
            sb.append(",\"SetFeedbackListener\":");
            C10733b2 b2Var45 = this.f30773T;
            sb.append(b2Var45 == null ? str : b2Var45.mo28115e());
            sb.append(",\"Logger\":");
            C10733b2 b2Var46 = this.f30774U;
            sb.append(b2Var46 == null ? str : b2Var46.mo28115e());
            sb.append(",\"SetInterceptCallback\":");
            C10733b2 b2Var47 = this.f30775V;
            sb.append(b2Var47 == null ? str : b2Var47.mo28115e());
            sb.append(",\"SetCustomInterceptCallback\":");
            sb.append(this.f30775V == null ? str : this.f30776W.mo28115e());
            sb.append(",\"CustomInterceptTriggerCallback\":");
            C10733b2 b2Var48 = this.f30777X;
            sb.append(b2Var48 == null ? str : b2Var48.mo28115e());
            sb.append(",\"SetFormCallback\":");
            C10733b2 b2Var49 = this.f30778Y;
            sb.append(b2Var49 == null ? str : b2Var49.mo28115e());
            sb.append(",\"SetFeedbackCallback\":");
            C10733b2 b2Var50 = this.f30779Z;
            sb.append(b2Var50 == null ? str : b2Var50.mo28115e());
            sb.append(",\"PreLoadMechanism\":");
            C10733b2 b2Var51 = this.f30781a0;
            sb.append(b2Var51 == null ? str : b2Var51.mo28115e());
            sb.append(",\"TargetEvaluator\":");
            C10733b2 b2Var52 = this.f30783b0;
            sb.append(b2Var52 == null ? str : b2Var52.mo28115e());
            sb.append(",\"NativeTargetEvaluator\":");
            C10733b2 b2Var53 = this.f30785c0;
            sb.append(b2Var53 == null ? str : b2Var53.mo28115e());
            sb.append(",\"InterceptMechanism\":");
            C10733b2 b2Var54 = this.f30787d0;
            sb.append(b2Var54 == null ? str : b2Var54.mo28115e());
            sb.append(",\"RestClient\":");
            C10733b2 b2Var55 = this.f30789e0;
            sb.append(b2Var55 == null ? str : b2Var55.mo28115e());
            sb.append(",\"InternalError\":");
            C10733b2 b2Var56 = this.f30791f0;
            sb.append(b2Var56 == null ? str : b2Var56.mo28115e());
            sb.append(",\"SetActivity\":");
            C10733b2 b2Var57 = this.f30793g0;
            sb.append(b2Var57 == null ? str : b2Var57.mo28115e());
            sb.append(",\"MedalliaCrash\":");
            C10733b2 b2Var58 = this.f30795h0;
            sb.append(b2Var58 == null ? str : b2Var58.mo28115e());
            sb.append(",\"InitOfflineMechanism\":");
            C10733b2 b2Var59 = this.f30797i0;
            sb.append(b2Var59 == null ? str : b2Var59.mo28115e());
            sb.append(",\"ResourcesSize\":");
            C10733b2 b2Var60 = this.f30799j0;
            sb.append(b2Var60 == null ? str : b2Var60.mo28115e());
            sb.append(",\"RestoreFromKillSDK\":");
            C10733b2 b2Var61 = this.f30803l0;
            sb.append(b2Var61 == null ? str : b2Var61.mo28115e());
            sb.append(",\"DeleteStorage\":");
            C10733b2 b2Var62 = this.f30801k0;
            sb.append(b2Var62 == null ? str : b2Var62.mo28115e());
            sb.append(",\"UpdateCustomLocale\":");
            C10733b2 b2Var63 = this.f30807p;
            if (b2Var63 != null) {
                str = b2Var63.mo28115e();
            }
            sb.append(str);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C10733b2 mo28203n() {
        return this.f30765L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C10733b2 mo28204o() {
        return this.f30754A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C10733b2 mo28205p() {
        return this.f30755B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C10733b2 mo28206q() {
        return this.f30758E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C10733b2 mo28207r() {
        return this.f30792g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C10733b2 mo28208s() {
        return this.f30780a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C10733b2 mo28209t() {
        return this.f30815x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C10733b2 mo28210u() {
        return this.f30797i0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C10733b2 mo28211v() {
        return this.f30787d0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C10733b2 mo28212w() {
        return this.f30791f0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C10733b2 mo28213x() {
        return this.f30804m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C10733b2 mo28214y() {
        return this.f30805n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C10733b2 mo28215z() {
        return this.f30806o;
    }
}
