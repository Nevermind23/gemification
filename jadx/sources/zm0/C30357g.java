package zm0;

import android.util.Base64;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import j51.C36735g;
import java.util.HashMap;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import m51.C37228a;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.junior.data.model.ApproveJuniorParams;
import p341ge.bog.mobilebank.junior.presentation.model.ChildRequestApproveUiModel;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import pc0.C27494a;
import rm0.C28054b;
import sm0.C28251c;
import ty0.C38857e;
import ue1.C43075l;

/* renamed from: zm0.g */
public final class C30357g extends C21481a implements C30352b, C30353c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C28054b f76281d;

    /* renamed from: e */
    private final C36735g f76282e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C38857e f76283f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final JuniorRequestDataUiModel f76284g;

    /* renamed from: h */
    private final C27494a f76285h;

    /* renamed from: i */
    private final C30352b f76286i = this;

    /* renamed from: j */
    private final C30353c f76287j = this;

    /* renamed from: k */
    private final C40767b f76288k;

    /* renamed from: l */
    private final C1644x f76289l;

    /* renamed from: m */
    private final C1644x f76290m;

    /* renamed from: n */
    private final C1644x f76291n;

    /* renamed from: o */
    private final C1644x f76292o;

    /* renamed from: p */
    private final C40767b f76293p;

    /* renamed from: q */
    private ApproveJuniorParams f76294q;

    /* renamed from: zm0.g$a */
    static final class C30358a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30357g f76295d;

        /* renamed from: zm0.g$a$a */
        static final class C30359a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C30359a f76296d = new C30359a();

            C30359a() {
                super(1);
            }

            /* renamed from: a */
            public final ChildRequestApproveUiModel invoke(C28251c cVar) {
                C41536l.m120489i(cVar, "it");
                return ChildRequestApproveUiModel.f63533l.mo63043a(cVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30358a(C30357g gVar) {
            super(1);
            this.f76295d = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final ChildRequestApproveUiModel m91525c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (ChildRequestApproveUiModel) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(ApproveJuniorParams approveJuniorParams) {
            C41536l.m120489i(approveJuniorParams, "params");
            C40762x A = this.f76295d.f76281d.mo67597a(this.f76295d.mo70683lw(approveJuniorParams)).mo95062A(new C30356f(C30359a.f76296d));
            C41536l.m120488h(A, "approveChildRequest(getO…  .map { it.toUiModel() }");
            return C31270e.m92880i(A, -1);
        }
    }

    /* renamed from: zm0.g$b */
    static final class C30360b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30357g f76297d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30360b(C30357g gVar) {
            super(1);
            this.f76297d = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m91529c(C30357g gVar) {
            C41536l.m120489i(gVar, "this$0");
            gVar.m91509pw();
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C38857e gw = this.f76297d.f76283f;
            String encodeToString = Base64.encodeToString(C40439w.m117112p(C32343x.m95388F("text.junior.activation.page.agree.terms.text", new Object[0])), 0);
            C41536l.m120488h(encodeToString, "encodeToString(\n        …ULT\n                    )");
            C40734b o = gw.mo92563a("CRA_VERIFY_CUSTOMER_RELATION", encodeToString, String.valueOf(this.f76297d.f76284g.mo52346g()), PensionStatusResult.STATUS_ACTIVE, PensionStatusResult.STATUS_INACTIVE).mo94902o(new C30361h(this.f76297d));
            C41536l.m120488h(o, "confirmClientDocument(\n …arams()\n                }");
            return C31270e.m92878g(o, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30357g(C28054b bVar, C36735g gVar, C38857e eVar, JuniorRequestDataUiModel juniorRequestDataUiModel, C27494a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "approveChildRequest");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(eVar, "confirmClientDocument");
        C41536l.m120489i(juniorRequestDataUiModel, "requestData");
        C41536l.m120489i(aVar, "otpParamsMapBuilder");
        this.f76281d = bVar;
        this.f76282e = gVar;
        this.f76283f = eVar;
        this.f76284g = juniorRequestDataUiModel;
        this.f76285h = aVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<ApproveJuniorParams>()");
        this.f76288k = h1;
        this.f76289l = new C1644x();
        this.f76290m = new C1644x();
        this.f76291n = new C1644x();
        this.f76292o = new C1644x();
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Unit>()");
        this.f76293p = h12;
        m91508nw();
    }

    /* renamed from: nw */
    private final void m91508nw() {
        m91510qw();
        m91512sw();
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public final void m91509pw() {
        Long l;
        String str;
        C37228a a = this.f76282e.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        Long h = this.f76284g.mo52347h();
        String f = this.f76284g.mo52345f();
        String valueOf2 = String.valueOf(this.f76284g.mo52346g());
        String d = this.f76284g.mo52341d();
        String valueOf3 = String.valueOf(this.f76284g.mo52343e());
        Long a2 = this.f76284g.mo52339a();
        if (this.f76284g.mo52347h() == null) {
            str = "COMMON_REGISTER_CHILD_ONBOARDING_REQUEST";
        } else {
            str = "COMMON_APPROVE_CHILD_ONBOARDING_REQUEST";
        }
        ApproveJuniorParams approveJuniorParams = new ApproveJuniorParams(valueOf, h, f, valueOf2, d, valueOf3, a2, this.f76284g.mo52352l(), str, (String) null, (String) null, (String) null, 3584, (DefaultConstructorMarker) null);
        C37224b.m109965d(this.f76289l, approveJuniorParams);
        this.f76294q = approveJuniorParams;
    }

    /* renamed from: qw */
    private final void m91510qw() {
        C40749p L0 = this.f76288k.mo94989L0(new C30355e(new C30358a(this)));
        C41536l.m120488h(L0, "private fun subscribeToA…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f76291n));
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final C40754t m91511rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: sw */
    private final void m91512sw() {
        C40749p L0 = this.f76293p.mo94989L0(new C30354d(new C30360b(this)));
        C41536l.m120488h(L0, "private fun subscribeToD…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f76292o));
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final C40754t m91513tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: d5 */
    public LiveData mo70677d5() {
        return this.f76291n;
    }

    /* renamed from: gt */
    public LiveData mo70678gt() {
        return this.f76290m;
    }

    /* renamed from: i0 */
    public LiveData mo70679i0() {
        return this.f76292o;
    }

    /* renamed from: iu */
    public void mo70676iu(String str, String str2, String str3) {
        ApproveJuniorParams copy$default;
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        ApproveJuniorParams approveJuniorParams = this.f76294q;
        if (approveJuniorParams != null && (copy$default = ApproveJuniorParams.copy$default(approveJuniorParams, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, str, str2, str3, 511, (Object) null)) != null) {
            this.f76288k.onNext(copy$default);
        }
    }

    /* renamed from: jw */
    public void mo70681jw(boolean z, boolean z2) {
        boolean z3;
        C1644x xVar = this.f76290m;
        if (!z || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        xVar.mo4826r(Boolean.valueOf(z3));
    }

    /* renamed from: kw */
    public final C30352b mo70682kw() {
        return this.f76286i;
    }

    /* renamed from: lw */
    public HashMap mo70683lw(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f76285h.mo66809a(otpParams);
    }

    /* renamed from: mw */
    public final C30353c mo70684mw() {
        return this.f76287j;
    }

    /* renamed from: ow */
    public void mo70685ow() {
        this.f76293p.onNext(C41238w.f97225a);
    }

    /* renamed from: t */
    public LiveData mo70680t() {
        return this.f76289l;
    }
}
