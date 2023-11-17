package ib1;

import af1.C40303i;
import android.content.Context;
import android.os.Bundle;
import androidx.core.p016os.C0908e;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ba1.C10146d0;
import ba1.C10220y;
import ca1.C10379a;
import cd1.C40393c;
import ce1.C40398b;
import com.google.gson.Gson;
import com.salesforce.marketingcloud.UrlHandler;
import dd1.C40480a1;
import dd1.C40488b1;
import dd1.C40491b4;
import dd1.C40494c1;
import dd1.C40498d;
import dd1.C40501d2;
import dd1.C40509e2;
import dd1.C40515f2;
import dd1.C40531i0;
import dd1.C40541j3;
import dd1.C40542j4;
import dd1.C40545k1;
import dd1.C40565n1;
import dd1.C40578p1;
import dd1.C40582p4;
import dd1.C40596s;
import dd1.C40597s0;
import dd1.C40598s1;
import dd1.C40603t0;
import dd1.C40636z0;
import de1.C40640a;
import ed1.C40734b;
import ed1.C40762x;
import ee1.C40767b;
import fh1.C40951a;
import gb1.C32381m;
import gb1.C32383o;
import gd1.C40992a;
import gh1.C41125a;
import ha1.C15458b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41217g;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kb1.C36929a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import lb1.C37120b;
import lb1.C37122d;
import mb1.C37249a;
import mb1.C37250b;
import nh1.C41806a;
import oc1.C41809a;
import p316xa.C8982a;
import p341ge.bog.sso_client.models.C35937e;
import p341ge.bog.sso_client.models.C35938f;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.C35962r;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import p341ge.bog.sso_client.models.FaceTecErrorCodes;
import p341ge.bog.sso_client.models.GetFaceTecTokenResponse;
import p341ge.bog.sso_client.models.Session;
import p341ge.bog.sso_client.models.UserContact;
import p341ge.bog.sso_client.models.ValidateOnboardingDataResponse;
import p341ge.bog.sso_client.network.ApiException;
import p341ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepEnd;
import p341ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepStart;
import p341ge.bog.sso_client.onboarding.model.RetryLimitExceedErrorsModel;
import p341ge.bog.sso_client.tmx_profiling.TMXFlags;
import p656wi.C18596a;
import pc1.C42117a;
import qa1.C27700a1;
import sso.type.AuthElementType;
import sso.type.ProcessFlow;
import sso.type.UserContactType;
import ue1.C43064a;
import ue1.C43075l;
import yb1.C40043a;

/* renamed from: ib1.c1 */
public final class C36382c1 extends C15458b implements C42117a, C41809a, C36444k, C36427d1 {

    /* renamed from: u0 */
    public static final C36385b f87772u0 = new C36385b((DefaultConstructorMarker) null);

    /* renamed from: v0 */
    static final /* synthetic */ C40303i[] f87773v0 = {C41520a0.m120439e(new C41539o(C36382c1.class, "identificationProgress", "getIdentificationProgress()Lge/bog/sso_client/onboarding/model/identificationprogress/IdentificationProgressState;", 0))};
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public static final List f87774w0 = C41341q.m119910m("FACE_VERIFICATION_RETRY_LIMIT_EXCEEDED", "DOCUMENT_VERIFICATION_RETRY_LIMIT_EXCEEDED", "PROCESS_INITIATION_PIN_LIMIT_EXCEEDED");

    /* renamed from: A */
    private final C40542j4 f87775A;

    /* renamed from: B */
    private final C40597s0 f87776B;

    /* renamed from: C */
    private final C40043a f87777C;

    /* renamed from: D */
    private final C36929a f87778D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final C40545k1 f87779E;

    /* renamed from: F */
    private final C40393c f87780F;

    /* renamed from: G */
    private final C27700a1 f87781G;

    /* renamed from: H */
    private final /* synthetic */ C41809a f87782H;

    /* renamed from: I */
    private String f87783I = "";
    /* access modifiers changed from: private */

    /* renamed from: J */
    public String f87784J = "";

    /* renamed from: K */
    private final C36427d1 f87785K = this;

    /* renamed from: L */
    private final C36444k f87786L = this;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public Boolean f87787M = Boolean.FALSE;

    /* renamed from: N */
    private final C10146d0.C10172e f87788N = ((C10146d0.C10172e) new C36411n0().mo89229b());

    /* renamed from: O */
    private final C41217g f87789O = C41219i.m119470b(new C36396g(this));

    /* renamed from: P */
    private final C41217g f87790P = C41219i.m119470b(new C36417t(this));

    /* renamed from: Q */
    private HashMap f87791Q = new HashMap();

    /* renamed from: R */
    private final C41217g f87792R = C41219i.m119470b(new C36401i0(this));

    /* renamed from: S */
    private final C32383o f87793S = new C32383o();
    /* access modifiers changed from: private */

    /* renamed from: T */
    public final C1644x f87794T = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C1644x f87795U = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C1644x f87796V = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C1644x f87797W = new C1644x();

    /* renamed from: X */
    private final C1644x f87798X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final C1644x f87799Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final C1644x f87800Z;

    /* renamed from: a0 */
    private final C1644x f87801a0;

    /* renamed from: b0 */
    private final C1644x f87802b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public final C1644x f87803c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final C1644x f87804d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public final C32383o f87805e0;

    /* renamed from: f0 */
    private final C1644x f87806f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public boolean f87807g0;

    /* renamed from: h */
    private final Context f87808h;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public final C1644x f87809h0;

    /* renamed from: i */
    private final C40494c1 f87810i;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public final C1644x f87811i0;

    /* renamed from: j */
    private final C40501d2 f87812j;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public final C1644x f87813j0;

    /* renamed from: k */
    private final C40603t0 f87814k;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public final C1644x f87815k0;

    /* renamed from: l */
    private final C40488b1 f87816l;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public final C1644x f87817l0;

    /* renamed from: m */
    private final C40596s f87818m;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public final C32383o f87819m0;

    /* renamed from: n */
    private final C40565n1 f87820n;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public final C1644x f87821n0;

    /* renamed from: o */
    private final C40491b4 f87822o;

    /* renamed from: o0 */
    private final C32383o f87823o0;

    /* renamed from: p */
    private final C40582p4 f87824p;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public final C32383o f87825p0;

    /* renamed from: q */
    private final C40515f2 f87826q;

    /* renamed from: q0 */
    private final C32383o f87827q0;

    /* renamed from: r */
    private final C40545k1 f87828r;

    /* renamed from: r0 */
    private final C1644x f87829r0;

    /* renamed from: s */
    private final C40498d f87830s;

    /* renamed from: s0 */
    private final C41555e f87831s0;

    /* renamed from: t */
    private final C40541j3 f87832t;

    /* renamed from: t0 */
    public UserContact f87833t0;

    /* renamed from: u */
    private final C42117a f87834u;

    /* renamed from: v */
    private final C40509e2 f87835v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C40636z0 f87836w;

    /* renamed from: x */
    private final C40480a1 f87837x;

    /* renamed from: y */
    private final C40531i0 f87838y;

    /* renamed from: z */
    private final C40598s1 f87839z;

    /* renamed from: ib1.c1$a */
    static final class C36383a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C36383a f87840d = new C36383a();

        C36383a() {
            super(0);
        }

        public final String invoke() {
            return C10146d0.C10176g.m37221b();
        }
    }

    /* renamed from: ib1.c1$a0 */
    static final class C36384a0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87841d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36384a0(C36382c1 c1Var) {
            super(1);
            this.f87841d = c1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f87841d.f87797W.mo4823o(new C35947l.C35949b(th));
            ApiException apiException = null;
            if (this.f87841d.mo89144Rc().mo89262e().mo89244c() instanceof C36434g) {
                ApiException apiException2 = th instanceof ApiException ? (ApiException) th : null;
                if (apiException2 != null) {
                    this.f87841d.m107999cy(apiException2);
                }
            } else {
                this.f87841d.mo89174ly(th);
            }
            C36382c1 c1Var = this.f87841d;
            C36425d dVar = C36425d.FAIL;
            if (th instanceof ApiException) {
                apiException = (ApiException) th;
            }
            c1Var.mo89126Bu("first_phone_input", dVar, apiException, C41233s.m119492a("phone_no", String.valueOf(c1Var.mo89198vx().mo88418a())));
        }
    }

    /* renamed from: ib1.c1$b */
    public static final class C36385b {

        /* renamed from: ib1.c1$b$a */
        public static final class C36386a extends C8982a<RetryLimitExceedErrorsModel> {
            C36386a() {
            }
        }

        private C36385b() {
        }

        public /* synthetic */ C36385b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List mo89209a(C40545k1 k1Var) {
            RetryLimitExceedErrorsModel retryLimitExceedErrorsModel;
            List<String> retryLimitExceededErrors;
            C41536l.m120489i(k1Var, "getAppSetting");
            Type type = new C36386a().getType();
            C41536l.m120488h(type, "object : TypeToken<Retry…edErrorsModel?>() {}.type");
            String a = k1Var.mo94579a("DO_RETRY_LIMIT_EXCEEDED_ERRORS");
            if (a == null) {
                return C36382c1.f87774w0;
            }
            Object m = new Gson().mo18171m(a, type);
            if (m instanceof RetryLimitExceedErrorsModel) {
                retryLimitExceedErrorsModel = (RetryLimitExceedErrorsModel) m;
            } else {
                retryLimitExceedErrorsModel = null;
            }
            if (retryLimitExceedErrorsModel == null || (retryLimitExceededErrors = retryLimitExceedErrorsModel.getRetryLimitExceededErrors()) == null) {
                return C36382c1.f87774w0;
            }
            return retryLimitExceededErrors;
        }
    }

    /* renamed from: ib1.c1$b0 */
    static final class C36387b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87842d;

        /* renamed from: e */
        final /* synthetic */ boolean f87843e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36387b0(C36382c1 c1Var, boolean z) {
            super(1);
            this.f87842d = c1Var;
            this.f87843e = z;
        }

        /* renamed from: a */
        public final void mo89210a(GetFaceTecTokenResponse getFaceTecTokenResponse) {
            C36382c1 c1Var = this.f87842d;
            c1Var.mo89187s7("first_phone_input", C36425d.SUCCESS, C41233s.m119492a("phone_no", String.valueOf(c1Var.mo89198vx().mo88418a())));
            String operationReference = getFaceTecTokenResponse.getOperationReference();
            String str = "";
            if (operationReference == null) {
                operationReference = str;
            }
            C10146d0.C10176g.m37229j(operationReference);
            String accessToken = getFaceTecTokenResponse.getAccessToken();
            if (accessToken != null) {
                str = accessToken;
            }
            C10146d0.C10176g.m37226g(str);
            this.f87842d.f87797W.mo4823o(new C35947l.C35951d(C41238w.f97225a));
            if (this.f87843e) {
                this.f87842d.mo89160dy();
            } else {
                this.f87842d.mo89144Rc().mo89268k().mo72877d();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89210a((GetFaceTecTokenResponse) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ib1.c1$c */
    static final class C36388c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87844d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36388c(C36382c1 c1Var) {
            super(1);
            this.f87844d = c1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f87844d.f87799Y.mo4823o(new C35947l.C35949b(th));
            this.f87844d.mo89174ly(th);
        }
    }

    /* renamed from: ib1.c1$c0 */
    static final class C36389c0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87845d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36389c0(C36382c1 c1Var) {
            super(0);
            this.f87845d = c1Var;
        }

        public final void invoke() {
            this.f87845d.f87817l0.mo4823o(C35947l.C35950c.f86976a);
        }
    }

    /* renamed from: ib1.c1$d */
    static final class C36390d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87846d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36390d(C36382c1 c1Var) {
            super(0);
            this.f87846d = c1Var;
        }

        public final void invoke() {
            this.f87846d.f87799Y.mo4823o(new C35947l.C35951d(C41238w.f97225a));
            this.f87846d.mo89160dy();
        }
    }

    /* renamed from: ib1.c1$d0 */
    static final class C36391d0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87847d;

        /* renamed from: e */
        final /* synthetic */ C37120b f87848e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36391d0(C36382c1 c1Var, C37120b bVar) {
            super(1);
            this.f87847d = c1Var;
            this.f87848e = bVar;
        }

        /* renamed from: a */
        public final void mo89212a(String str) {
            C41536l.m120489i(str, "it");
            this.f87847d.f87784J = str;
            this.f87847d.f87817l0.mo4823o(new C35947l.C35951d(this.f87848e));
            this.f87847d.f87819m0.mo72872t();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89212a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ib1.c1$e */
    static final class C36392e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87849d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36392e(C36382c1 c1Var) {
            super(1);
            this.f87849d = c1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f87849d.f87815k0.mo4823o(new C35947l.C35949b(th));
            this.f87849d.mo89174ly(th);
            this.f87849d.mo89126Bu("aml_answered", C36425d.FAIL, th instanceof ApiException ? (ApiException) th : null, new C41224m[0]);
        }
    }

    /* renamed from: ib1.c1$e0 */
    static final class C36393e0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87850d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36393e0(C36382c1 c1Var) {
            super(1);
            this.f87850d = c1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f87850d.mo89174ly(th);
            this.f87850d.f87817l0.mo4823o(new C35947l.C35949b(th));
        }
    }

    /* renamed from: ib1.c1$f */
    static final class C36394f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87851d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36394f(C36382c1 c1Var) {
            super(1);
            this.f87851d = c1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C36382c1 c1Var = this.f87851d;
            C41536l.m120488h(bool, "needsEmailSet");
            c1Var.f87807g0 = bool.booleanValue();
            if (bool.booleanValue()) {
                if (this.f87851d.mo89198vx().mo88424f() == UserContactType.MAIL) {
                    this.f87851d.f87825p0.mo4823o(String.valueOf(this.f87851d.mo89198vx().mo88418a()));
                } else {
                    this.f87851d.f87815k0.mo4823o(new C35947l.C35951d(C41238w.f97225a));
                    this.f87851d.mo89144Rc().mo89258a();
                }
                this.f87851d.mo89192tn("add_mail_for_us_citizen", new C41224m[0]);
                return;
            }
            this.f87851d.mo89187s7("aml_answered", C36425d.SUCCESS, new C41224m[0]);
            this.f87851d.m107965Ex();
        }
    }

    /* renamed from: ib1.c1$f0 */
    static final class C36395f0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87852d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36395f0(C36382c1 c1Var) {
            super(0);
            this.f87852d = c1Var;
        }

        public final void invoke() {
            C36382c1 c1Var = this.f87852d;
            c1Var.m108025uy(C37250b.m109986b(c1Var.m108028wx(), (C18596a) null, (C18596a) null, C18596a.WAITING, (C37249a) null, (String) null, 11, (Object) null));
        }
    }

    /* renamed from: ib1.c1$g */
    static final class C36396g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87853d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36396g(C36382c1 c1Var) {
            super(0);
            this.f87853d = c1Var;
        }

        /* renamed from: b */
        public final C10379a invoke() {
            return this.f87853d.mo89193tx().mo26711b();
        }
    }

    /* renamed from: ib1.c1$g0 */
    static final class C36397g0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87854d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36397g0(C36382c1 c1Var) {
            super(1);
            this.f87854d = c1Var;
        }

        /* renamed from: a */
        public final void mo89217a(ValidateOnboardingDataResponse validateOnboardingDataResponse) {
            C41536l.m120489i(validateOnboardingDataResponse, "it");
            C36382c1 c1Var = this.f87854d;
            c1Var.m108025uy(C37250b.m109986b(c1Var.m108028wx(), (C18596a) null, (C18596a) null, C18596a.SUCCESS, C37249a.REQUEST_CONTACT_APPROVE, (String) null, 3, (Object) null));
            this.f87854d.f87787M = Boolean.valueOf(validateOnboardingDataResponse.getClientHasActualAddress());
            C36382c1 c1Var2 = this.f87854d;
            c1Var2.mo89177my(c1Var2.mo89198vx(), false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89217a((ValidateOnboardingDataResponse) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ib1.c1$h */
    static final class C36398h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87855d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36398h(C36382c1 c1Var) {
            super(1);
            this.f87855d = c1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f87855d.mo89174ly(th);
            ApiException apiException = null;
            if (this.f87855d.f87807g0) {
                this.f87855d.mo89126Bu("validate_mail_for_us_citizen", C36425d.FAIL, th instanceof ApiException ? (ApiException) th : null, new C41224m[0]);
            }
            C36382c1 c1Var = this.f87855d;
            C36425d dVar = C36425d.FAIL;
            if (th instanceof ApiException) {
                apiException = (ApiException) th;
            }
            c1Var.mo89126Bu("validate_otp", dVar, apiException, new C41224m[0]);
        }
    }

    /* renamed from: ib1.c1$h0 */
    static final class C36399h0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87856d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36399h0(C36382c1 c1Var) {
            super(1);
            this.f87856d = c1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C36382c1 c1Var = this.f87856d;
            C37250b Bw = c1Var.m108028wx();
            C18596a aVar = C18596a.ERROR;
            C37249a aVar2 = C37249a.VALIDATE_DATA;
            boolean z = th instanceof ApiException;
            ApiException apiException = null;
            ApiException apiException2 = z ? (ApiException) th : null;
            c1Var.m108025uy(C37250b.m109986b(Bw, (C18596a) null, (C18596a) null, aVar, aVar2, apiException2 != null ? apiException2.getErrorMessage() : null, 3, (Object) null));
            if (z) {
                apiException = (ApiException) th;
            }
            if (apiException != null) {
                this.f87856d.m107999cy(apiException);
            }
        }
    }

    /* renamed from: ib1.c1$i */
    static final class C36400i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87857d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36400i(C36382c1 c1Var) {
            super(1);
            this.f87857d = c1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C36382c1 c1Var = this.f87857d;
            C36425d dVar = C36425d.SUCCESS;
            c1Var.mo89187s7("validate_otp", dVar, new C41224m[0]);
            this.f87857d.f87803c0.mo4823o(Boolean.FALSE);
            C41536l.m120488h(bool, "needsToSetEmail");
            if (bool.booleanValue()) {
                this.f87857d.m108009kx();
            } else if (this.f87857d.f87807g0) {
                this.f87857d.mo89187s7("validate_mail_for_us_citizen", dVar, new C41224m[0]);
                this.f87857d.f87809h0.mo4823o(C41238w.f97225a);
            } else {
                this.f87857d.m107963Dx();
            }
        }
    }

    /* renamed from: ib1.c1$i0 */
    static final class C36401i0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87858d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36401i0(C36382c1 c1Var) {
            super(0);
            this.f87858d = c1Var;
        }

        /* renamed from: b */
        public final List invoke() {
            return C36382c1.f87772u0.mo89209a(this.f87858d.f87779E);
        }
    }

    /* renamed from: ib1.c1$j */
    static final class C36402j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87859d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36402j(C36382c1 c1Var) {
            super(1);
            this.f87859d = c1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "rulesError");
            this.f87859d.mo89174ly(th);
        }
    }

    /* renamed from: ib1.c1$j0 */
    static final class C36403j0 extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C36403j0 f87860d = new C36403j0();

        C36403j0() {
            super(1);
        }

        /* renamed from: a */
        public final void mo89223a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            session.setAvailableAuthTypes$sso_client_release(C41361y0.m120039k(session.getAvailableAuthTypes$sso_client_release(), AuthElementType.BIOMETRY));
            session.setAvailableAuthTypes$sso_client_release(C41361y0.m120039k(session.getAvailableAuthTypes$sso_client_release(), AuthElementType.PASSCODE));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89223a((Session) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ib1.c1$k */
    static final class C36404k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87861d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36404k(C36382c1 c1Var) {
            super(1);
            this.f87861d = c1Var;
        }

        /* renamed from: a */
        public final void mo89224a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f87861d.m108000dx();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89224a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ib1.c1$k0 */
    static final class C36405k0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87862d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36405k0(C36382c1 c1Var) {
            super(1);
            this.f87862d = c1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f87862d.mo89195up(th);
            this.f87862d.mo89174ly(th);
        }
    }

    /* renamed from: ib1.c1$l */
    static final class C36406l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87863d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36406l(C36382c1 c1Var) {
            super(1);
            this.f87863d = c1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f87863d.f87815k0.mo4823o(new C35947l.C35949b(th));
            this.f87863d.f87813j0.mo4823o(new C35947l.C35949b(th));
            this.f87863d.mo89174ly(th);
        }
    }

    /* renamed from: ib1.c1$l0 */
    static final class C36407l0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87864d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36407l0(C36382c1 c1Var) {
            super(0);
            this.f87864d = c1Var;
        }

        public final void invoke() {
            this.f87864d.f87805e0.mo4823o(C41238w.f97225a);
        }
    }

    /* renamed from: ib1.c1$m */
    static final class C36408m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87865d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36408m(C36382c1 c1Var) {
            super(1);
            this.f87865d = c1Var;
        }

        /* renamed from: a */
        public final void mo89227a(C41238w wVar) {
            C1644x Ew = this.f87865d.f87815k0;
            C41238w wVar2 = C41238w.f97225a;
            Ew.mo4823o(new C35947l.C35951d(wVar2));
            this.f87865d.f87813j0.mo4823o(new C35947l.C35951d(wVar2));
            this.f87865d.mo89144Rc().mo89260c().mo72877d();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89227a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ib1.c1$m0 */
    public static final class C36409m0 extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C36382c1 f87866a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36409m0(Object obj, C36382c1 c1Var) {
            super(obj);
            this.f87866a = c1Var;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C37250b bVar = (C37250b) obj;
            this.f87866a.f87821n0.mo4823o((C37250b) obj2);
        }
    }

    /* renamed from: ib1.c1$n */
    static final class C36410n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87867d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36410n(C36382c1 c1Var) {
            super(1);
            this.f87867d = c1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f87867d.mo89172ky((String) null);
        }
    }

    /* renamed from: ib1.c1$n0 */
    public static final class C36411n0 implements C41125a {

        /* renamed from: a */
        private final Object f87868a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo89229b() {
            return this.f87868a;
        }
    }

    /* renamed from: ib1.c1$o */
    static final class C36412o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87869d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36412o(C36382c1 c1Var) {
            super(1);
            this.f87869d = c1Var;
        }

        /* renamed from: a */
        public final void mo89230a(List list) {
            this.f87869d.f87811i0.mo4823o(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89230a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ib1.c1$p */
    static final class C36413p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87870d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36413p(C36382c1 c1Var) {
            super(1);
            this.f87870d = c1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f87870d.f87797W.mo4823o(new C35947l.C35949b(th));
            C40636z0 Aw = this.f87870d.f87836w;
            String message = th.getMessage();
            String str = "";
            if (message == null) {
                message = str;
            }
            String a = Aw.mo94635a(message);
            this.f87870d.mo89172ky(a);
            C36382c1 c1Var = this.f87870d;
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = str;
            }
            if (a != null) {
                str = a;
            }
            c1Var.mo89191sy(message2, str);
        }
    }

    /* renamed from: ib1.c1$q */
    static final class C36414q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87871d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36414q(C36382c1 c1Var) {
            super(0);
            this.f87871d = c1Var;
        }

        public final void invoke() {
            this.f87871d.m108015oy(false);
        }
    }

    /* renamed from: ib1.c1$r */
    static final class C36415r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ boolean f87872d;

        /* renamed from: e */
        final /* synthetic */ C36382c1 f87873e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36415r(boolean z, C36382c1 c1Var) {
            super(1);
            this.f87872d = z;
            this.f87873e = c1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            if (this.f87872d) {
                this.f87873e.f87795U.mo4823o(new C35947l.C35949b(th));
            }
            this.f87873e.mo89174ly(th);
        }
    }

    /* renamed from: ib1.c1$s */
    static final class C36416s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87874d;

        /* renamed from: e */
        final /* synthetic */ boolean f87875e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36416s(C36382c1 c1Var, boolean z) {
            super(1);
            this.f87874d = c1Var;
            this.f87875e = z;
        }

        /* renamed from: a */
        public final void mo89233a(List list) {
            this.f87874d.f87794T.mo4823o(list);
            if (this.f87875e) {
                this.f87874d.f87795U.mo4823o(new C35947l.C35951d(C41238w.f97225a));
                this.f87874d.mo89144Rc().mo89269l().mo72877d();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89233a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ib1.c1$t */
    static final class C36417t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87876d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36417t(C36382c1 c1Var) {
            super(0);
            this.f87876d = c1Var;
        }

        /* renamed from: b */
        public final C36453o0 invoke() {
            return new C36453o0(new C36437h(), this.f87876d.mo89193tx());
        }
    }

    /* renamed from: ib1.c1$u */
    static final class C36418u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87877d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36418u(C36382c1 c1Var) {
            super(1);
            this.f87877d = c1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f87877d.f87800Z.mo4823o(new C35947l.C35949b(th));
            this.f87877d.mo89174ly(th);
        }
    }

    /* renamed from: ib1.c1$v */
    static final class C36419v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87878d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36419v(C36382c1 c1Var) {
            super(0);
            this.f87878d = c1Var;
        }

        public final void invoke() {
            this.f87878d.mo89148Vx(FacetecStepStart.ACCEPT_AND_START);
            this.f87878d.f87800Z.mo4823o(new C35947l.C35951d(new C41224m(C10146d0.C10176g.m37220a(), C10146d0.C10176g.m37223d())));
        }
    }

    /* renamed from: ib1.c1$w */
    static final class C36420w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87879d;

        /* renamed from: e */
        final /* synthetic */ String f87880e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36420w(C36382c1 c1Var, String str) {
            super(1);
            this.f87879d = c1Var;
            this.f87880e = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f87879d.f87795U.mo4823o(new C35947l.C35949b(th));
            this.f87879d.mo89174ly(th);
            String str = null;
            ApiException apiException = th instanceof ApiException ? (ApiException) th : null;
            C36382c1 c1Var = this.f87879d;
            String str2 = this.f87880e;
            C36425d dVar = C36425d.FAIL;
            String valueOf = String.valueOf(apiException != null ? apiException.getErrorCode() : null);
            String errorKey = apiException != null ? apiException.getErrorKey() : null;
            if (apiException != null) {
                str = apiException.getErrorMessage();
            }
            c1Var.m107993Yx("pin_input", str2, dVar, valueOf, errorKey, str);
        }
    }

    /* renamed from: ib1.c1$x */
    static final class C36421x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87881d;

        /* renamed from: e */
        final /* synthetic */ String f87882e;

        /* renamed from: f */
        final /* synthetic */ boolean f87883f;

        /* renamed from: ib1.c1$x$a */
        public /* synthetic */ class C36422a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f87884a;

            static {
                int[] iArr = new int[ProcessFlow.values().length];
                iArr[ProcessFlow.REGISTER_NEW_CLIENT.ordinal()] = 1;
                iArr[ProcessFlow.IDENTIFY_BY_VIDEO.ordinal()] = 2;
                iArr[ProcessFlow.REGISTER_NEW_USER.ordinal()] = 3;
                iArr[ProcessFlow.ADD_FINANCIAL_CONTACT.ordinal()] = 4;
                iArr[ProcessFlow.IDENTIFY_BY_CARD.ordinal()] = 5;
                iArr[ProcessFlow.IDENTIFY_BY_DOCUMENT.ordinal()] = 6;
                iArr[ProcessFlow.IDENTIFY_BY_ONLY_CARD.ordinal()] = 7;
                f87884a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36421x(C36382c1 c1Var, String str, boolean z) {
            super(1);
            this.f87881d = c1Var;
            this.f87882e = str;
            this.f87883f = z;
        }

        /* renamed from: a */
        public final void mo89237a(C35938f fVar) {
            C35938f fVar2;
            int i;
            if (fVar == null) {
                fVar2 = new C35938f(ProcessFlow.UNKNOWN__, "");
            } else {
                fVar2 = fVar;
            }
            C10146d0.C10176g.m37228i(fVar2);
            C36382c1.m107995Zx(this.f87881d, "pin_input", this.f87882e, C36425d.SUCCESS, (String) null, (String) null, (String) null, 56, (Object) null);
            ProcessFlow a = fVar.mo88492a();
            if (a == null) {
                i = -1;
            } else {
                i = C36422a.f87884a[a.ordinal()];
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                    this.f87881d.mo89202wy();
                    return;
                case 4:
                    if (this.f87881d.mo89190sx("DO_ADD_NEW_FINANCIAL_CONTACT_ALLOWED")) {
                        this.f87881d.f87796V.mo4823o(Boolean.TRUE);
                        return;
                    } else {
                        this.f87881d.mo89176mx();
                        return;
                    }
                case 5:
                case 6:
                case 7:
                    if (!this.f87883f) {
                        this.f87881d.f87796V.mo4823o(Boolean.TRUE);
                        return;
                    } else {
                        this.f87881d.mo89202wy();
                        return;
                    }
                default:
                    this.f87881d.mo89176mx();
                    this.f87881d.f87795U.mo4823o(new C35947l.C35951d(C41238w.f97225a));
                    return;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89237a((C35938f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ib1.c1$y */
    static final class C36423y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87885d;

        /* renamed from: e */
        final /* synthetic */ boolean f87886e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36423y(C36382c1 c1Var, boolean z) {
            super(1);
            this.f87885d = c1Var;
            this.f87886e = z;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f87885d.f87804d0.mo4823o(new C35947l.C35949b(th));
            if (!this.f87886e) {
                this.f87885d.f87803c0.mo4823o(Boolean.FALSE);
            }
            this.f87885d.mo89126Bu("send_otp", C36425d.FAIL, th instanceof ApiException ? (ApiException) th : null, new C41224m[0]);
            this.f87885d.mo89174ly(th);
        }
    }

    /* renamed from: ib1.c1$z */
    static final class C36424z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36382c1 f87887d;

        /* renamed from: e */
        final /* synthetic */ UserContact f87888e;

        /* renamed from: f */
        final /* synthetic */ boolean f87889f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36424z(C36382c1 c1Var, UserContact userContact, boolean z) {
            super(1);
            this.f87887d = c1Var;
            this.f87888e = userContact;
            this.f87889f = z;
        }

        /* renamed from: a */
        public final void mo89239a(C35937e eVar) {
            boolean z;
            Boolean c = eVar.mo88487c();
            Boolean bool = Boolean.TRUE;
            if (C41536l.m120484d(c, bool)) {
                this.f87887d.m108009kx();
                this.f87887d.f87804d0.mo4823o(C35947l.C35948a.f86974a);
            } else if (C41536l.m120484d(eVar.mo88486b(), bool)) {
                C36382c1 c1Var = this.f87887d;
                UserContact userContact = this.f87888e;
                String d = eVar.mo88488d();
                if (d == null) {
                    d = "";
                }
                if (!(this.f87888e.mo88424f() == UserContactType.MAIL || eVar.mo88485a() == null)) {
                    List e = C41339p.m119900e("GE");
                    String upperCase = eVar.mo88485a().toUpperCase(Locale.ROOT);
                    C41536l.m120488h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (!e.contains(upperCase)) {
                        z = true;
                        c1Var.m108005ix(userContact, d, z, this.f87889f);
                    }
                }
                z = false;
                c1Var.m108005ix(userContact, d, z, this.f87889f);
            } else if (this.f87887d.f87807g0) {
                this.f87887d.f87803c0.mo4823o(Boolean.FALSE);
                this.f87887d.f87809h0.mo4823o(C41238w.f97225a);
                this.f87887d.f87804d0.mo4823o(C35947l.C35948a.f86974a);
            } else {
                this.f87887d.f87804d0.mo4823o(C35947l.C35948a.f86974a);
                this.f87887d.f87803c0.mo4823o(Boolean.FALSE);
                this.f87887d.m107963Dx();
            }
            this.f87887d.mo89187s7("send_otp", C36425d.SUCCESS, new C41224m[0]);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89239a((C35937e) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36382c1(Context context, C40494c1 c1Var, C40501d2 d2Var, C40603t0 t0Var, C40488b1 b1Var, C40596s sVar, C40565n1 n1Var, C40491b4 b4Var, C40582p4 p4Var, C40515f2 f2Var, C40545k1 k1Var, C40498d dVar, C40541j3 j3Var, C42117a aVar, C40509e2 e2Var, C40636z0 z0Var, C40480a1 a1Var, C40531i0 i0Var, C40598s1 s1Var, C40542j4 j4Var, C40597s0 s0Var, C40043a aVar2, C36929a aVar3, C40545k1 k1Var2, C40393c cVar, C27700a1 a1Var2, C41809a aVar4) {
        super((C40578p1) null, 1, (DefaultConstructorMarker) null);
        Context context2 = context;
        C40494c1 c1Var2 = c1Var;
        C40501d2 d2Var2 = d2Var;
        C40603t0 t0Var2 = t0Var;
        C40488b1 b1Var2 = b1Var;
        C40596s sVar2 = sVar;
        C40565n1 n1Var2 = n1Var;
        C40491b4 b4Var2 = b4Var;
        C40582p4 p4Var2 = p4Var;
        C40515f2 f2Var2 = f2Var;
        C40545k1 k1Var3 = k1Var;
        C40498d dVar2 = dVar;
        C40541j3 j3Var2 = j3Var;
        C40636z0 z0Var2 = z0Var;
        C41536l.m120489i(context2, "context");
        C41536l.m120489i(c1Var2, "getOnBoardingInfoCardsUseCase");
        C41536l.m120489i(d2Var2, "identifyProcessFlow");
        C41536l.m120489i(t0Var2, "getCountryCodes");
        C41536l.m120489i(b1Var2, "getFaceTecToken");
        C41536l.m120489i(sVar2, "confirmOnboardingTerms");
        C41536l.m120489i(n1Var2, "getTurnoverTypesUseCase");
        C41536l.m120489i(b4Var2, "startFaceTec");
        C41536l.m120489i(p4Var2, "validateFaceTecData");
        C41536l.m120489i(f2Var2, "logFaceTecError");
        C41536l.m120489i(k1Var3, "getSettingUseCase");
        C41536l.m120489i(dVar2, "approveFinancialContactUseCase");
        C41536l.m120489i(j3Var2, "requestFinancialContactApprove");
        C41536l.m120489i(aVar, "setUserNamePasswordDelegate");
        C41536l.m120489i(e2Var, "initFaceTecUseCase");
        C41536l.m120489i(z0Var, "getFaceTecErrorTextUseCase");
        C41536l.m120489i(a1Var, "getFaceTecStatusTextUseCase");
        C41536l.m120489i(i0Var, "getAndStoreAccessToken");
        C41536l.m120489i(s1Var, "getUserContacts");
        C41536l.m120489i(j4Var, "updateClientTurnoverInfo");
        C41536l.m120489i(s0Var, "getAuthToken");
        C41536l.m120489i(aVar2, "setupIdentomat");
        C41536l.m120489i(aVar3, "validateDocumentData");
        C41536l.m120489i(k1Var2, "getAppSetting");
        C41536l.m120489i(cVar, "startTMXProfilingUseCase");
        C41536l.m120489i(a1Var2, "storage");
        C41536l.m120489i(aVar4, "logger");
        this.f87808h = context2;
        this.f87810i = c1Var2;
        this.f87812j = d2Var2;
        this.f87814k = t0Var2;
        this.f87816l = b1Var2;
        this.f87818m = sVar2;
        this.f87820n = n1Var2;
        this.f87822o = b4Var2;
        this.f87824p = p4Var2;
        this.f87826q = f2Var2;
        this.f87828r = k1Var3;
        this.f87830s = dVar2;
        this.f87832t = j3Var2;
        this.f87834u = aVar;
        this.f87835v = e2Var;
        this.f87836w = z0Var;
        this.f87837x = a1Var;
        this.f87838y = i0Var;
        this.f87839z = s1Var;
        this.f87775A = j4Var;
        this.f87776B = s0Var;
        this.f87777C = aVar2;
        this.f87778D = aVar3;
        this.f87779E = k1Var2;
        this.f87780F = cVar;
        this.f87781G = a1Var2;
        this.f87782H = aVar4;
        this.f87798X = new C1644x(c1Var.mo94543a());
        this.f87799Y = new C1644x();
        this.f87800Z = new C1644x();
        this.f87801a0 = new C1644x();
        this.f87802b0 = new C1644x();
        this.f87803c0 = new C1644x();
        this.f87804d0 = new C1644x();
        this.f87805e0 = new C32383o();
        this.f87806f0 = new C1644x();
        this.f87809h0 = new C1644x();
        this.f87811i0 = new C1644x();
        this.f87813j0 = new C1644x();
        this.f87815k0 = new C1644x();
        this.f87817l0 = new C1644x();
        this.f87819m0 = new C32383o();
        this.f87821n0 = new C1644x();
        this.f87823o0 = new C32383o();
        this.f87825p0 = new C32383o();
        this.f87827q0 = new C32383o();
        this.f87829r0 = new C1644x();
        C41551a aVar5 = C41551a.f97718a;
        this.f87831s0 = new C36409m0(new C37250b((C18596a) null, (C18596a) null, (C18596a) null, (C37249a) null, (String) null, 31, (DefaultConstructorMarker) null), this);
        C41205b F0 = mo89204yj().mo94981F0(new C36469w0(this));
        C41536l.m120488h(F0, "setUserPassErrorSubject\n…ostError(Throwable(it)) }");
        mo42540ew(F0);
        mo42540ew(mo89184qo());
        mo89166hc(C36383a.f87840d);
        m108030xy();
    }

    /* renamed from: Cx */
    private final List m107961Cx() {
        return (List) this.f87792R.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Dx */
    public final void m107963Dx() {
        if (!mo89142Px()) {
            mo42540ew(C40398b.m116972e(mo89168ij(C10146d0.C10176g.m37221b()), new C36402j(this), new C36404k(this)));
        } else {
            m108000dx();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Ex */
    public final void m107965Ex() {
        C40762x l = mo89168ij(C10146d0.C10176g.m37221b()).mo95083l(new C36461s0(this));
        C41536l.m120488h(l, "getRules(SSO.RegisterSes…lt.Loading)\n            }");
        mo42540ew(C40398b.m116972e(l, new C36406l(this), new C36408m(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Fx */
    public static final void m107967Fx(C36382c1 c1Var, C41205b bVar) {
        C41536l.m120489i(c1Var, "this$0");
        c1Var.f87813j0.mo4823o(C35947l.C35950c.f86976a);
    }

    /* renamed from: Mx */
    private final void m107975Mx() {
        C40734b r = this.f87835v.mo94553a(this.f87808h, this.f87788N.mo26716g()).mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a()).mo94904r(new C36463t0(this));
        C41536l.m120488h(r, "initFaceTecUseCase(conte…lt.Loading)\n            }");
        mo42540ew(C40398b.m116971d(r, new C36413p(this), new C36414q(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Nx */
    public static final void m107977Nx(C36382c1 c1Var, C41205b bVar) {
        C41536l.m120489i(c1Var, "this$0");
        c1Var.f87797W.mo4823o(C35947l.C35950c.f86976a);
    }

    /* access modifiers changed from: private */
    /* renamed from: Rx */
    public static final void m107982Rx(boolean z, C36382c1 c1Var, C41205b bVar) {
        C41536l.m120489i(c1Var, "this$0");
        if (z) {
            c1Var.f87795U.mo4823o(C35947l.C35950c.f86976a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Tx */
    public static final void m107985Tx(C36382c1 c1Var, List list) {
        C41536l.m120489i(c1Var, "this$0");
        c1Var.f87806f0.mo4823o(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ux */
    public static final void m107987Ux(C36382c1 c1Var, Throwable th) {
        C41536l.m120489i(c1Var, "this$0");
        C41536l.m120488h(th, "error");
        c1Var.mo89174ly(th);
    }

    /* renamed from: Xx */
    public static /* synthetic */ void m107991Xx(C36382c1 c1Var, FacetecStepEnd facetecStepEnd, C36425d dVar, String str, String str2, String str3, int i, Object obj) {
        c1Var.mo89150Wx(facetecStepEnd, dVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: Yx */
    public final void m107993Yx(String str, String str2, C36425d dVar, String str3, String str4, String str5) {
        Long l;
        String b;
        C10379a rx = m108020rx();
        if (rx != null) {
            C41224m[] mVarArr = new C41224m[3];
            mVarArr[0] = C41233s.m119492a(UrlHandler.ACTION, str);
            mVarArr[1] = C41233s.m119492a("pin", str2);
            DeviceIdentifier c = this.f87781G.mo67242c();
            if (c != null) {
                l = c.getDeviceId();
            } else {
                l = null;
            }
            mVarArr[2] = C41233s.m119492a("dev_id", String.valueOf(l));
            Bundle b2 = C0908e.m3336b(mVarArr);
            if (!(dVar == null || (b = dVar.mo89240b()) == null)) {
                b2.putString("result", b);
            }
            if (str3 != null) {
                b2.putString("err_code", str3);
            }
            if (str4 != null) {
                b2.putString("err_key", str4);
            }
            if (str5 != null) {
                b2.putString("err_msg", str5);
            }
            C41238w wVar = C41238w.f97225a;
            C10379a.C10380a.m37703a(rx, "digital_onboarding", str, (String) null, b2, (C10379a.C10381b) null, 20, (Object) null);
        }
    }

    /* renamed from: Zx */
    static /* synthetic */ void m107995Zx(C36382c1 c1Var, String str, String str2, C36425d dVar, String str3, String str4, String str5, int i, Object obj) {
        c1Var.m107993Yx(str, str2, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    /* access modifiers changed from: private */
    /* renamed from: cy */
    public final void m107999cy(ApiException apiException) {
        if (apiException.getErrorCode() != null && mo89141Ox(false, apiException.getErrorCode().intValue())) {
            m108025uy(C37250b.m109986b(m108028wx(), (C18596a) null, (C18596a) null, (C18596a) null, C37249a.RETRY, apiException.getErrorMessage(), 7, (Object) null));
        } else if (C41358y.m119999O(m107961Cx(), apiException.getErrorKey())) {
            m108025uy(C37250b.m109986b(m108028wx(), (C18596a) null, (C18596a) null, (C18596a) null, C37249a.FINISH, apiException.getErrorMessage(), 7, (Object) null));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: dx */
    public final void m108000dx() {
        if (C41536l.m120484d(mo89144Rc().mo89262e().mo89244c(), mo89144Rc().mo89261d())) {
            mo89144Rc().mo89261d().mo72877d();
        } else {
            mo89144Rc().mo89264g().mo72879h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ey */
    public static final void m108001ey(C36382c1 c1Var, C41205b bVar) {
        C41536l.m120489i(c1Var, "this$0");
        c1Var.f87800Z.mo4823o(C35947l.C35950c.f86976a);
    }

    /* access modifiers changed from: private */
    /* renamed from: fx */
    public static final void m108002fx(C36382c1 c1Var, C41205b bVar) {
        C41536l.m120489i(c1Var, "this$0");
        c1Var.f87799Y.mo4823o(C35947l.C35950c.f86976a);
    }

    /* access modifiers changed from: private */
    /* renamed from: hx */
    public static final void m108003hx(C36382c1 c1Var, C41205b bVar) {
        C41536l.m120489i(c1Var, "this$0");
        c1Var.f87815k0.mo4823o(C35947l.C35950c.f86976a);
    }

    /* access modifiers changed from: private */
    /* renamed from: ix */
    public final void m108005ix(UserContact userContact, String str, boolean z, boolean z2) {
        this.f87804d0.mo4823o(new C35947l.C35951d(new C37122d(userContact, str, z)));
        if (!z2) {
            this.f87803c0.mo4823o(Boolean.TRUE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: iy */
    public static final void m108006iy(C36382c1 c1Var, C41205b bVar) {
        C41536l.m120489i(c1Var, "this$0");
        c1Var.f87795U.mo4823o(C35947l.C35950c.f86976a);
    }

    /* access modifiers changed from: private */
    /* renamed from: kx */
    public final void m108009kx() {
        mo89192tn("add_mail_for_us_citizen", new C41224m[0]);
        this.f87815k0.mo4823o(new C35947l.C35951d(C41238w.f97225a));
        mo89144Rc().mo89258a();
        mo89144Rc().mo89271o();
    }

    /* access modifiers changed from: private */
    /* renamed from: ny */
    public static final void m108013ny(C36382c1 c1Var, C41205b bVar) {
        C41536l.m120489i(c1Var, "this$0");
        c1Var.f87804d0.mo4823o(C35947l.C35950c.f86976a);
    }

    /* access modifiers changed from: private */
    /* renamed from: oy */
    public final void m108015oy(boolean z) {
        String rawValue;
        C40488b1 b1Var = this.f87816l;
        String a = mo89198vx().mo88418a();
        String str = "";
        if (a == null) {
            a = str;
        }
        ProcessFlow a2 = C10146d0.C10176g.m37222c().mo88492a();
        if (!(a2 == null || (rawValue = a2.getRawValue()) == null)) {
            str = rawValue;
        }
        C40762x l = b1Var.mo94540a(a, str).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95083l(new C36465u0(this));
        C41536l.m120488h(l, "getFaceTecToken(\n       …lt.Loading)\n            }");
        mo42540ew(C40398b.m116972e(l, new C36384a0(this), new C36387b0(this, z)));
    }

    /* access modifiers changed from: private */
    /* renamed from: py */
    public static final void m108017py(C36382c1 c1Var, C41205b bVar) {
        C41536l.m120489i(c1Var, "this$0");
        c1Var.f87797W.mo4823o(C35947l.C35950c.f86976a);
    }

    /* renamed from: rx */
    private final C10379a m108020rx() {
        return (C10379a) this.f87789O.getValue();
    }

    /* renamed from: ry */
    private final void m108021ry() {
        C32381m.m95619h(this.f87778D.mo89871a(this.f87783I, this.f87784J), new C36395f0(this), new C36397g0(this), new C36399h0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final void m108024uw(C36382c1 c1Var, String str) {
        C41536l.m120489i(c1Var, "this$0");
        c1Var.mo89174ly(new Throwable(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: uy */
    public final void m108025uy(C37250b bVar) {
        this.f87831s0.setValue(this, f87773v0[0], bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: wx */
    public final C37250b m108028wx() {
        return (C37250b) this.f87831s0.getValue(this, f87773v0[0]);
    }

    /* renamed from: xy */
    private final void m108030xy() {
        mo42540ew(this.f87780F.mo94454b(TMXFlags.TMX_FLAG_REGISTRATION_KEY));
    }

    /* renamed from: Ax */
    public final C36427d1 mo89123Ax() {
        return this.f87785K;
    }

    /* renamed from: Br */
    public LiveData mo89124Br() {
        return this.f87817l0;
    }

    /* renamed from: Bs */
    public LiveData mo89125Bs() {
        return this.f87805e0;
    }

    /* renamed from: Bu */
    public void mo89126Bu(String str, C36425d dVar, ApiException apiException, C41224m... mVarArr) {
        C41536l.m120489i(str, "actionName");
        C41536l.m120489i(dVar, "result");
        C41536l.m120489i(mVarArr, "extraParams");
        this.f87782H.mo89126Bu(str, dVar, apiException, mVarArr);
    }

    /* renamed from: Bx */
    public final ProcessFlow mo89127Bx() {
        return C10146d0.C10176g.m37222c().mo88492a();
    }

    /* renamed from: De */
    public LiveData mo89128De() {
        return this.f87801a0;
    }

    /* renamed from: Dv */
    public LiveData mo89129Dv() {
        return this.f87795U;
    }

    /* renamed from: G6 */
    public void mo89130G6() {
        m108025uy(C37250b.m109986b(m108028wx(), (C18596a) null, C18596a.SUCCESS, (C18596a) null, C37249a.VALIDATE_DATA, (String) null, 5, (Object) null));
        mo89144Rc().mo89265h().mo72877d();
        m108021ry();
    }

    /* renamed from: Gx */
    public C32383o mo89147Tq() {
        return this.f87827q0;
    }

    /* renamed from: Hi */
    public LiveData mo89132Hi() {
        return this.f87819m0;
    }

    /* renamed from: Hr */
    public LiveData mo89133Hr() {
        return this.f87821n0;
    }

    /* renamed from: Hx */
    public LiveData mo89134Hx() {
        return this.f87799Y;
    }

    /* renamed from: Io */
    public void mo89135Io() {
        mo89147Tq().mo72873u();
    }

    /* renamed from: Ix */
    public final void mo89136Ix() {
        C40762x B = this.f87820n.mo94592c().mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a());
        C41536l.m120488h(B, "getTurnoverTypesUseCase(…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116972e(B, new C36410n(this), new C36412o(this)));
    }

    /* renamed from: Jx */
    public LiveData mo89137Jx() {
        return this.f87811i0;
    }

    /* renamed from: Kx */
    public LiveData mo89138Kx() {
        return this.f87806f0;
    }

    /* renamed from: Lx */
    public final void mo89139Lx() {
        mo89192tn("instructions_reviewed", new C41224m[0]);
        mo89144Rc().mo89266i().mo72877d();
    }

    /* renamed from: Mf */
    public LiveData mo89140Mf() {
        return this.f87823o0;
    }

    /* renamed from: Ox */
    public final boolean mo89141Ox(boolean z, int i) {
        try {
            Gson gson = new Gson();
            String a = this.f87828r.mo94579a("FACETEC_RETRY_ERROR_CODES");
            if (a == null) {
                a = "";
            }
            FaceTecErrorCodes faceTecErrorCodes = (FaceTecErrorCodes) gson.mo18170l(a, FaceTecErrorCodes.class);
            if (z) {
                return faceTecErrorCodes.getRetryFaceScanErrors().contains(Integer.valueOf(i));
            }
            return faceTecErrorCodes.getRetryIDScanErrors().contains(Integer.valueOf(i));
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: Px */
    public final boolean mo89142Px() {
        if (C10146d0.C10176g.m37222c().mo88492a() == ProcessFlow.REGISTER_NEW_CLIENT || C10146d0.C10176g.m37222c().mo88492a() == ProcessFlow.REGISTER_NEW_USER) {
            return true;
        }
        return false;
    }

    /* renamed from: Qx */
    public final void mo89143Qx() {
        boolean d = C41536l.m120484d(mo89144Rc().mo89262e().mo89244c(), mo89144Rc().mo89269l());
        C40762x l = this.f87814k.mo94614a().mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95083l(new C36457q0(d, this));
        C41536l.m120488h(l, "getCountryCodes()\n      …          }\n            }");
        mo42540ew(C40398b.m116972e(l, new C36415r(d, this), new C36416s(this, d)));
    }

    /* renamed from: Rc */
    public C36453o0 mo89144Rc() {
        return (C36453o0) this.f87790P.getValue();
    }

    /* renamed from: S5 */
    public LiveData mo89145S5() {
        return this.f87834u.mo89145S5();
    }

    /* renamed from: Sx */
    public final void mo89146Sx() {
        C40598s1 s1Var = this.f87839z;
        String a = mo89198vx().mo88418a();
        if (a == null) {
            a = "";
        }
        C41205b I = s1Var.mo94611c(a).mo95063B(C40992a.m118827a()).mo95070I(new C36376a1(this), new C36379b1(this));
        C41536l.m120488h(I, "getUserContacts(currentl…ror(error)\n            })");
        mo42540ew(I);
    }

    /* renamed from: Vx */
    public final void mo89148Vx(FacetecStepStart facetecStepStart) {
        C41536l.m120489i(facetecStepStart, "step");
        mo89192tn(facetecStepStart.getActionName(), new C41224m[0]);
    }

    /* renamed from: Wk */
    public LiveData mo89149Wk() {
        return this.f87834u.mo89149Wk();
    }

    /* renamed from: Wx */
    public final void mo89150Wx(FacetecStepEnd facetecStepEnd, C36425d dVar, String str, String str2, String str3) {
        C41536l.m120489i(facetecStepEnd, "step");
        C41536l.m120489i(dVar, "result");
        mo89159dr(facetecStepEnd.getActionName(), dVar, str, str2, str3, new C41224m[0]);
    }

    /* renamed from: Xv */
    public void mo89151Xv() {
        if (m108028wx().mo90328g() == C37249a.FINISH) {
            this.f87823o0.mo72872t();
        } else if (m108028wx().mo90328g() == C37249a.RETRY) {
            m108025uy(new C37250b(C18596a.WAITING, (C18596a) null, (C18596a) null, (C37249a) null, (String) null, 30, (DefaultConstructorMarker) null));
            mo89144Rc().mo89270m().mo72877d();
            m108015oy(true);
        } else if (m108028wx().mo90328g() == C37249a.OPEN_IDENTOMAT) {
            mo89144Rc().mo89263f().mo72877d();
        } else if (m108028wx().mo90328g() == C37249a.REQUEST_CONTACT_APPROVE) {
            mo89177my(mo89198vx(), false);
        } else if (C41536l.m120484d(mo89144Rc().mo89262e().mo89244c(), mo89144Rc().mo89264g())) {
            m108021ry();
        }
    }

    /* renamed from: Y4 */
    public void mo89152Y4() {
        this.f87834u.mo89152Y4();
    }

    /* renamed from: Yf */
    public LiveData mo89153Yf() {
        return this.f87800Z;
    }

    /* renamed from: Zc */
    public LiveData mo89154Zc() {
        return this.f87834u.mo89154Zc();
    }

    /* renamed from: Zu */
    public void mo89155Zu() {
        this.f87834u.mo89155Zu();
    }

    /* renamed from: ao */
    public void mo89156ao(String str, String str2) {
        C41536l.m120489i(str, "username");
        C41536l.m120489i(str2, "password");
        this.f87834u.mo89156ao(str, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.facetec.sdk.FaceTecIDScanResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.facetec.sdk.FaceTecIDScanResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0116, code lost:
        if (r14 == null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0135, code lost:
        if (r14 == null) goto L_0x011a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ay */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89157ay(android.content.Intent r12, java.lang.Boolean r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.C41536l.m120489i(r12, r0)
            java.lang.String r0 = ""
            if (r13 == 0) goto L_0x014b
            boolean r1 = r13.booleanValue()
            if (r1 == 0) goto L_0x0065
            androidx.lifecycle.x r12 = r11.f87802b0
            ge.bog.sso_client.models.l$d r14 = new ge.bog.sso_client.models.l$d
            he1.w r15 = he1.C41238w.f97225a
            r14.<init>(r15)
            r12.mo4823o(r14)
            ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepEnd r1 = p341ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepEnd.FINISH
            ib1.d r2 = ib1.C36425d.SUCCESS
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 28
            r7 = 0
            r0 = r11
            m107991Xx(r0, r1, r2, r3, r4, r5, r6, r7)
            ib1.o0 r12 = r11.mo89144Rc()
            ib1.b r12 = r12.mo89259b()
            boolean r14 = r11.mo89142Px()
            r12.mo89121k(r14)
            ib1.o0 r12 = r11.mo89144Rc()
            ib1.c r12 = r12.mo89260c()
            boolean r14 = r11.mo89142Px()
            r12.mo89122k(r14)
            mb1.b r0 = r11.m108028wx()
            wi.a r1 = p656wi.C18596a.SUCCESS
            r2 = 0
            mb1.a r4 = mb1.C37249a.OPEN_IDENTOMAT
            r6 = 6
            mb1.b r12 = mb1.C37250b.m109986b(r0, r1, r2, r3, r4, r5, r6, r7)
            r11.m108025uy(r12)
            ib1.o0 r12 = r11.mo89144Rc()
            ib1.g r12 = r12.mo89263f()
            r12.mo72877d()
            goto L_0x01b5
        L_0x0065:
            r1 = 1
            r2 = 0
            if (r14 == 0) goto L_0x0072
            boolean r3 = cf1.C40439w.m117118v(r14)
            if (r3 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r3 = r2
            goto L_0x0073
        L_0x0072:
            r3 = r1
        L_0x0073:
            r4 = 0
            if (r3 != 0) goto L_0x009b
            ba1.d0$e r12 = r11.f87788N
            ba1.g0 r12 = r12.mo26716g()
            if (r12 == 0) goto L_0x0084
            java.lang.Object[] r15 = new java.lang.Object[r2]
            java.lang.String r4 = r12.mo26763a(r14, r15)
        L_0x0084:
            r10 = r4
            if (r10 != 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r0 = r10
        L_0x0089:
            r11.mo89191sy(r14, r0)
            r11.mo89172ky(r10)
            ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepEnd r6 = p341ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepEnd.FINISH
            ib1.d r7 = ib1.C36425d.FAIL
            r8 = 0
            r5 = r11
            r9 = r14
            r5.mo89150Wx(r6, r7, r8, r9, r10)
            goto L_0x01b5
        L_0x009b:
            if (r15 == 0) goto L_0x00a5
            boolean r3 = cf1.C40439w.m117118v(r15)
            if (r3 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r1 = r2
        L_0x00a5:
            if (r1 != 0) goto L_0x00be
            if (r14 != 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r0 = r14
        L_0x00ab:
            r11.mo89191sy(r0, r15)
            r11.mo89172ky(r15)
            ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepEnd r2 = p341ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepEnd.FINISH
            ib1.d r3 = ib1.C36425d.FAIL
            r4 = 0
            r1 = r11
            r5 = r14
            r6 = r15
            r1.mo89150Wx(r2, r3, r4, r5, r6)
            goto L_0x01b5
        L_0x00be:
            android.os.Bundle r14 = r12.getExtras()
            if (r14 == 0) goto L_0x00cb
            java.lang.String r15 = "facetecsdk.signup.sessionResult"
            java.lang.Object r14 = r14.get(r15)
            goto L_0x00cc
        L_0x00cb:
            r14 = r4
        L_0x00cc:
            com.facetec.sdk.FaceTecSessionResult r14 = (com.facetec.sdk.FaceTecSessionResult) r14
            android.os.Bundle r12 = r12.getExtras()
            if (r12 == 0) goto L_0x00da
            java.lang.String r15 = "facetecsdk.signup.idScanResult"
            java.lang.Object r4 = r12.get(r15)
        L_0x00da:
            com.facetec.sdk.FaceTecIDScanResult r4 = (com.facetec.sdk.FaceTecIDScanResult) r4
            dd1.a1 r12 = r11.f87837x
            android.content.Context r15 = r11.f87808h
            he1.m r12 = r12.mo94533a(r15)
            java.lang.Object r12 = r12.mo95678e()
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x00ed
            r12 = r0
        L_0x00ed:
            dd1.a1 r15 = r11.f87837x
            android.content.Context r1 = r11.f87808h
            he1.m r15 = r15.mo94533a(r1)
            java.lang.Object r15 = r15.mo95680f()
            java.lang.String r15 = (java.lang.String) r15
            if (r15 != 0) goto L_0x00fe
            r15 = r0
        L_0x00fe:
            if (r14 == 0) goto L_0x011d
            com.facetec.sdk.FaceTecSessionStatus r1 = r14.getStatus()
            com.facetec.sdk.FaceTecSessionStatus r2 = com.facetec.sdk.FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY
            if (r1 == r2) goto L_0x011d
            com.facetec.sdk.FaceTecSessionStatus r12 = r14.getStatus()
            java.lang.String r12 = r12.name()
            dd1.z0 r14 = r11.f87836w
            java.lang.String r14 = r14.mo94635a(r12)
            if (r14 != 0) goto L_0x0119
            goto L_0x011a
        L_0x0119:
            r0 = r14
        L_0x011a:
            r5 = r12
            r6 = r0
            goto L_0x013a
        L_0x011d:
            if (r4 == 0) goto L_0x0138
            com.facetec.sdk.FaceTecIDScanStatus r14 = r4.getStatus()
            com.facetec.sdk.FaceTecIDScanStatus r1 = com.facetec.sdk.FaceTecIDScanStatus.SUCCESS
            if (r14 == r1) goto L_0x0138
            com.facetec.sdk.FaceTecIDScanStatus r12 = r4.getStatus()
            java.lang.String r12 = r12.name()
            dd1.z0 r14 = r11.f87836w
            java.lang.String r14 = r14.mo94635a(r12)
            if (r14 != 0) goto L_0x0119
            goto L_0x011a
        L_0x0138:
            r5 = r12
            r6 = r15
        L_0x013a:
            r11.mo89191sy(r5, r6)
            r11.mo89172ky(r6)
            ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepEnd r2 = p341ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepEnd.FINISH
            ib1.d r3 = ib1.C36425d.FAIL
            r4 = 0
            r1 = r11
            r1.mo89150Wx(r2, r3, r4, r5, r6)
            goto L_0x01b5
        L_0x014b:
            dd1.a1 r12 = r11.f87837x
            android.content.Context r14 = r11.f87808h
            he1.m r12 = r12.mo94533a(r14)
            java.lang.Object r12 = r12.mo95678e()
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x015c
            r12 = r0
        L_0x015c:
            dd1.a1 r14 = r11.f87837x
            android.content.Context r15 = r11.f87808h
            he1.m r14 = r14.mo94533a(r15)
            java.lang.Object r14 = r14.mo95680f()
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L_0x016d
            r14 = r0
        L_0x016d:
            r11.mo89191sy(r12, r14)
            java.lang.Throwable r12 = new java.lang.Throwable
            dd1.a1 r14 = r11.f87837x
            android.content.Context r15 = r11.f87808h
            he1.m r14 = r14.mo94533a(r15)
            java.lang.Object r14 = r14.mo95680f()
            java.lang.String r14 = (java.lang.String) r14
            r12.<init>(r14)
            r11.mo89174ly(r12)
            ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepEnd r2 = p341ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepEnd.FINISH
            ib1.d r3 = ib1.C36425d.FAIL
            r4 = 0
            dd1.a1 r12 = r11.f87837x
            android.content.Context r14 = r11.f87808h
            he1.m r12 = r12.mo94533a(r14)
            java.lang.Object r12 = r12.mo95678e()
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x019d
            r5 = r0
            goto L_0x019e
        L_0x019d:
            r5 = r12
        L_0x019e:
            dd1.a1 r12 = r11.f87837x
            android.content.Context r14 = r11.f87808h
            he1.m r12 = r12.mo94533a(r14)
            java.lang.Object r12 = r12.mo95680f()
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x01b0
            r6 = r0
            goto L_0x01b1
        L_0x01b0:
            r6 = r12
        L_0x01b1:
            r1 = r11
            r1.mo89150Wx(r2, r3, r4, r5, r6)
        L_0x01b5:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r13, r12)
            if (r12 != 0) goto L_0x01e2
            ib1.o0 r12 = r11.mo89144Rc()
            ib1.h r12 = r12.mo89262e()
            gb1.r r12 = r12.mo89244c()
            ib1.o0 r13 = r11.mo89144Rc()
            ib1.g r13 = r13.mo89263f()
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r12, r13)
            if (r12 != 0) goto L_0x01e2
            ib1.o0 r12 = r11.mo89144Rc()
            ib1.h1 r12 = r12.mo89270m()
            r12.mo72877d()
        L_0x01e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ib1.C36382c1.mo89157ay(android.content.Intent, java.lang.Boolean, java.lang.String, java.lang.String):void");
    }

    /* renamed from: d4 */
    public LiveData mo89158d4() {
        return this.f87825p0;
    }

    /* renamed from: dr */
    public void mo89159dr(String str, C36425d dVar, String str2, String str3, String str4, C41224m... mVarArr) {
        C41536l.m120489i(str, "actionName");
        C41536l.m120489i(mVarArr, "extraParams");
        this.f87782H.mo89159dr(str, dVar, str2, str3, str4, mVarArr);
    }

    /* renamed from: dy */
    public final void mo89160dy() {
        C40734b r = this.f87822o.mo94541a().mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a()).mo94904r(new C36459r0(this));
        C41536l.m120488h(r, "startFaceTec()\n         …lt.Loading)\n            }");
        mo42540ew(C40398b.m116971d(r, new C36418u(this), new C36419v(this)));
    }

    /* renamed from: ex */
    public final void mo89161ex(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, String str) {
        C41536l.m120489i(charSequence, "title1");
        C41536l.m120489i(charSequence2, "text1");
        C41536l.m120489i(charSequence3, "title2");
        C41536l.m120489i(charSequence4, "text2");
        C41536l.m120489i(str, "termsLink");
        C35947l lVar = (C35947l) this.f87799Y.mo4814f();
        String b = C10146d0.C10176g.m37222c().mo88493b();
        if (b == null) {
            mo89172ky((String) null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (C10146d0.C10176g.m37222c().mo88492a() == ProcessFlow.REGISTER_NEW_CLIENT) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence);
            sb2.append(' ');
            sb2.append(charSequence2);
            sb2.append(' ');
            sb.append(sb2.toString());
        }
        sb.append(charSequence3 + ' ' + charSequence4 + ' ' + str);
        C40596s sVar = this.f87818m;
        String sb3 = sb.toString();
        C41536l.m120488h(sb3, "documentStringBuilder.toString()");
        C40734b r = sVar.mo94609a(b, "CONFIRMATION_ON_VIDEO_IDENTIFICATION", sb3).mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a()).mo94904r(new C36473y0(this));
        C41536l.m120488h(r, "confirmOnboardingTerms(\n…stValue(Result.Loading) }");
        mo42540ew(C40398b.m116971d(r, new C36388c(this), new C36390d(this)));
    }

    /* renamed from: fy */
    public final void mo89162fy() {
        this.f87803c0.mo4823o((Object) null);
    }

    /* renamed from: gx */
    public final void mo89163gx(boolean z, C41224m mVar) {
        C41536l.m120489i(mVar, "answersPair");
        this.f87791Q.put(mVar.mo95678e(), mVar.mo95680f());
        if (z) {
            mo89144Rc().mo89259b().mo72877d();
            return;
        }
        String str = (String) this.f87791Q.get("TURNOVER_FREQUENCY");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = (String) this.f87791Q.get("TURNOVER_VOLUME");
        if (str3 != null) {
            str2 = str3;
        }
        C40762x l = this.f87775A.mo94577a(str, str2).mo95083l(new C36475z0(this));
        C41536l.m120488h(l, "updateClientTurnoverInfo…stValue(Result.Loading) }");
        mo42540ew(C40398b.m116972e(l, new C36392e(this), new C36394f(this)));
    }

    /* renamed from: gy */
    public final void mo89164gy(String str, String str2) {
        C41536l.m120489i(str, "phoneIndex");
        C41536l.m120489i(str2, "phoneNum");
        UserContactType userContactType = UserContactType.PHONE;
        mo89194ty(new UserContact((String) null, userContactType, str + str2, (Boolean) null, (Boolean) null, 16, (DefaultConstructorMarker) null));
        m107975Mx();
    }

    /* renamed from: ha */
    public LiveData mo89165ha() {
        return this.f87802b0;
    }

    /* renamed from: hc */
    public void mo89166hc(C43064a aVar) {
        C41536l.m120489i(aVar, "getProcessReference");
        this.f87782H.mo89166hc(aVar);
    }

    /* renamed from: hy */
    public final void mo89167hy(String str, boolean z) {
        C41536l.m120489i(str, "pin");
        C40762x l = this.f87812j.mo94548c(str).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95083l(new C36471x0(this));
        C41536l.m120488h(l, "identifyProcessFlow(pin)…stValue(Result.Loading) }");
        mo42540ew(C40398b.m116972e(l, new C36420w(this, str), new C36421x(this, str, z)));
    }

    /* renamed from: ij */
    public C40762x mo89168ij(String str) {
        C41536l.m120489i(str, "reference");
        return this.f87834u.mo89168ij(str);
    }

    /* renamed from: je */
    public LiveData mo89169je() {
        return this.f87796V;
    }

    /* renamed from: jx */
    public final void mo89170jx(UserContact userContact, String str, String str2) {
        String str3;
        C41536l.m120489i(userContact, "contact");
        C41536l.m120489i(str, "oneTimePassword");
        C41536l.m120489i(str2, "operationReference");
        C40498d dVar = this.f87830s;
        String d = userContact.mo88420d();
        UserContactType f = userContact.mo88424f();
        if (f == null) {
            f = UserContactType.PHONE;
        }
        String rawValue = f.getRawValue();
        if (userContact.mo88420d() != null) {
            str3 = null;
        } else {
            str3 = userContact.mo88418a();
            if (str3 == null) {
                str3 = "";
            }
        }
        C40762x B = dVar.mo94546a(d, rawValue, str3, str, str2).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a());
        C41536l.m120488h(B, "approveFinancialContactU…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116972e(B, new C36398h(this), new C36400i(this)));
    }

    /* renamed from: jy */
    public final void mo89171jy() {
        this.f87796V.mo4823o(Boolean.FALSE);
    }

    /* renamed from: ky */
    public final void mo89172ky(String str) {
        if (str == null) {
            str = this.f87808h.getString(C10220y.f28366O0);
            C41536l.m120488h(str, "context.getString(R.string.error_data_general)");
        }
        mo89174ly(new Throwable(str));
    }

    /* renamed from: lx */
    public final void mo89173lx(UserContactType userContactType) {
        C36428e eVar;
        C41536l.m120489i(userContactType, "userContactType");
        C41224m[] mVarArr = new C41224m[1];
        if (userContactType == UserContactType.PHONE) {
            eVar = C36428e.PHONE;
        } else {
            eVar = C36428e.MAIL;
        }
        mVarArr[0] = C41233s.m119492a("contact_type", eVar.mo89241b());
        mo89192tn("select_contact_type", mVarArr);
        mo89144Rc().mo89261d().mo89242k(userContactType);
        if (!C41536l.m120484d(mo89144Rc().mo89262e().mo89244c(), mo89144Rc().mo89261d())) {
            mo89144Rc().mo89264g().mo72877d();
        }
    }

    /* renamed from: ly */
    public final void mo89174ly(Throwable th) {
        C41536l.m120489i(th, "error");
        this.f87793S.mo4823o(new C35947l.C35949b(th));
    }

    /* renamed from: mg */
    public LiveData mo89175mg() {
        return this.f87829r0;
    }

    /* renamed from: mx */
    public final void mo89176mx() {
        C1644x xVar = this.f87795U;
        C41238w wVar = C41238w.f97225a;
        xVar.mo4823o(new C35947l.C35951d(wVar));
        this.f87801a0.mo4823o(wVar);
    }

    /* renamed from: my */
    public final void mo89177my(UserContact userContact, boolean z) {
        String str;
        C41536l.m120489i(userContact, "contact");
        mo89194ty(userContact);
        C40541j3 j3Var = this.f87832t;
        String d = userContact.mo88420d();
        UserContactType f = userContact.mo88424f();
        String str2 = "";
        if (f == null || (str = f.getRawValue()) == null) {
            str = str2;
        }
        if (userContact.mo88420d() != null) {
            str2 = null;
        } else {
            String a = userContact.mo88418a();
            if (a != null) {
                str2 = a;
            }
        }
        C40762x B = j3Var.mo94576a(d, str, str2).mo95072K(C40640a.m117458b()).mo95083l(new C36467v0(this)).mo95063B(C40992a.m118827a());
        C41536l.m120488h(B, "requestFinancialContactA…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116972e(B, new C36423y(this, z), new C36424z(this, userContact, z)));
    }

    /* renamed from: n6 */
    public void mo89178n6() {
        if (C10146d0.C10176g.m37222c().mo88492a() == ProcessFlow.REGISTER_NEW_CLIENT) {
            this.f87829r0.mo4823o(Boolean.TRUE);
        } else {
            this.f87829r0.mo4823o(Boolean.FALSE);
        }
    }

    /* renamed from: ni */
    public LiveData mo89179ni() {
        return this.f87834u.mo89179ni();
    }

    /* renamed from: nx */
    public final void mo89180nx() {
        if (C41536l.m120484d(this.f87787M, Boolean.TRUE)) {
            mo89144Rc().mo89267j().mo72877d();
        }
    }

    /* renamed from: ox */
    public final HashMap mo89181ox() {
        return this.f87791Q;
    }

    /* renamed from: px */
    public LiveData mo89182px() {
        return this.f87815k0;
    }

    /* renamed from: qj */
    public LiveData mo89183qj() {
        return this.f87804d0;
    }

    /* renamed from: qo */
    public C41204a mo89184qo() {
        return this.f87834u.mo89184qo();
    }

    /* renamed from: qx */
    public LiveData mo89185qx() {
        return this.f87809h0;
    }

    /* renamed from: qy */
    public void mo89186qy(C37120b bVar) {
        boolean z;
        C41536l.m120489i(bVar, "documentType");
        m108025uy(C37250b.m109986b(m108028wx(), (C18596a) null, C18596a.SUCCESS, (C18596a) null, (C37249a) null, (String) null, 13, (Object) null));
        C40043a aVar = this.f87777C;
        String d = C10146d0.C10176g.m37223d();
        String b = C10146d0.C10176g.m37221b();
        if (bVar == C37120b.PASSPORT) {
            z = true;
        } else {
            z = false;
        }
        mo42540ew(C32381m.m95619h(aVar.mo93916a(d, b, z), new C36389c0(this), new C36391d0(this, bVar), new C36393e0(this)));
    }

    /* renamed from: s7 */
    public void mo89187s7(String str, C36425d dVar, C41224m... mVarArr) {
        C41536l.m120489i(str, "actionName");
        C41536l.m120489i(dVar, "result");
        C41536l.m120489i(mVarArr, "extraParams");
        this.f87782H.mo89187s7(str, dVar, mVarArr);
    }

    public void setUserName(String str) {
        C41536l.m120489i(str, "userName");
        this.f87834u.setUserName(str);
    }

    /* renamed from: sm */
    public LiveData mo89189sm() {
        return this.f87803c0;
    }

    /* renamed from: sx */
    public final boolean mo89190sx(String str) {
        C41536l.m120489i(str, "settingKey");
        try {
            Gson gson = new Gson();
            String a = this.f87828r.mo94579a(str);
            if (a == null) {
                a = "false";
            }
            Object l = gson.mo18170l(a, Boolean.TYPE);
            C41536l.m120488h(l, "{\n            Gson().fro…a\n            )\n        }");
            return ((Boolean) l).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: sy */
    public final void mo89191sy(String str, String str2) {
        C41536l.m120489i(str, "errorKey");
        C41536l.m120489i(str2, "errorMsg");
        this.f87802b0.mo4823o(new C35947l.C35949b(new Exception(str2)));
        m108025uy(C37250b.m109986b(m108028wx(), C18596a.ERROR, (C18596a) null, (C18596a) null, C37249a.RETRY, str2, 6, (Object) null));
        C41205b E = this.f87826q.mo94557a(str, str2).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95092y().mo94886E();
        C41536l.m120488h(E, "logFaceTecError(errorKey…\n            .subscribe()");
        mo42540ew(E);
    }

    /* renamed from: tn */
    public void mo89192tn(String str, C41224m... mVarArr) {
        C41536l.m120489i(str, "actionName");
        C41536l.m120489i(mVarArr, "extraParams");
        this.f87782H.mo89192tn(str, mVarArr);
    }

    /* renamed from: tx */
    public final C10146d0.C10172e mo89193tx() {
        return this.f87788N;
    }

    /* renamed from: ty */
    public final void mo89194ty(UserContact userContact) {
        C41536l.m120489i(userContact, "<set-?>");
        this.f87833t0 = userContact;
    }

    /* renamed from: up */
    public void mo89195up(Throwable th) {
        C41536l.m120489i(th, "err");
        this.f87834u.mo89195up(th);
    }

    /* renamed from: ux */
    public LiveData mo89196ux() {
        return this.f87794T;
    }

    /* renamed from: vj */
    public LiveData mo89197vj() {
        return this.f87813j0;
    }

    /* renamed from: vx */
    public final UserContact mo89198vx() {
        UserContact userContact = this.f87833t0;
        if (userContact != null) {
            return userContact;
        }
        C41536l.m120506z("currentlyChosenContact");
        return null;
    }

    /* renamed from: vy */
    public final void mo89199vy(String str) {
        C41536l.m120489i(str, "username");
        String ssoToken$sso_client_release = C10146d0.C10159c.m37143b().getSsoToken$sso_client_release();
        C10146d0.C10159c.f28157a.mo26691f(str, false);
        C10146d0.C10159c.m37143b().setSsoToken$sso_client_release(ssoToken$sso_client_release);
        C10146d0.C10159c.m37143b().setProcessReference$sso_client_release(C10146d0.C10176g.m37221b());
        C10146d0.C10159c.m37143b().setOfferSecuritySettingsSetup(Boolean.TRUE);
        C10146d0.C10159c.m37143b().setLoginAuthTypes$sso_client_release(C41357x0.m119989i(AuthElementType.PASSWORD, AuthElementType.OTP));
        C35962r.m107005c(C10146d0.C10159c.m37143b(), C36403j0.f87860d);
        this.f87781G.mo67253m(str);
        C40734b d = this.f87838y.mo94567d().mo94895d(this.f87776B.mo94610b());
        C41536l.m120488h(d, "getAndStoreAccessToken().andThen(getAuthToken())");
        mo42540ew(C40398b.m116971d(d, new C36405k0(this), new C36407l0(this)));
    }

    /* renamed from: wb */
    public LiveData mo89200wb() {
        return this.f87834u.mo89200wb();
    }

    /* renamed from: wr */
    public LiveData mo89201wr() {
        return this.f87797W;
    }

    /* renamed from: wy */
    public final void mo89202wy() {
        mo89144Rc().mo89271o();
        mo89143Qx();
    }

    /* renamed from: xx */
    public LiveData mo89203xx() {
        return this.f87798X;
    }

    /* renamed from: yj */
    public C40767b mo89204yj() {
        return this.f87834u.mo89204yj();
    }

    /* renamed from: yx */
    public final C36444k mo89205yx() {
        return this.f87786L;
    }

    /* renamed from: yy */
    public final C40762x mo89206yy(String str, List list, String str2, List list2) {
        C41536l.m120489i(str, "xUserAgent");
        this.f87783I = str;
        return this.f87824p.mo94599a(str, list, str2, list2);
    }

    /* renamed from: zx */
    public LiveData mo89207zx() {
        return this.f87793S;
    }
}
