package zm0;

import android.os.Bundle;
import android.util.Base64;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import com.google.android.material.datepicker.C5023l;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import he1.C41224m;
import he1.C41238w;
import j51.C36734f;
import j51.C36735g;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k51.C36874b;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import m51.C37228a;
import o21.C37586a;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.junior.data.model.VerifyChildFinancialPhoneParams;
import p341ge.bog.mobilebank.junior.presentation.model.ChildRequestApproveUiModel;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow;
import p355an.C10092j;
import p380ck.C10464h;
import p523mm.C16734c1;
import p537nm.C17090i0;
import p603si.C17799b;
import pc0.C27494a;
import rm0.C28053a;
import rm0.C28058f;
import rm0.C28061i;
import sm0.C28249a;
import sm0.C28250b;
import tm0.C28469c;
import tm0.C28473g;
import ty0.C38857e;
import ue1.C43075l;
import xm0.C29820a;
import ym0.C30096a;
import ym0.C30103b;
import ym0.C30104c;

/* renamed from: zm0.r */
public final class C30372r extends C21481a implements C30363j, C30365k {

    /* renamed from: A */
    private final C1644x f76305A;

    /* renamed from: B */
    private final C1644x f76306B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C1644x f76307C;

    /* renamed from: D */
    private final C1644x f76308D;

    /* renamed from: E */
    private final C1644x f76309E;

    /* renamed from: F */
    private final C1644x f76310F;

    /* renamed from: G */
    private final C1644x f76311G;

    /* renamed from: H */
    private final C1644x f76312H;

    /* renamed from: I */
    private final C1644x f76313I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final C1644x f76314J;

    /* renamed from: K */
    private final C1644x f76315K;

    /* renamed from: L */
    private final C1644x f76316L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final C1644x f76317M;

    /* renamed from: N */
    private final C1644x f76318N;

    /* renamed from: O */
    private final C1644x f76319O;

    /* renamed from: P */
    private final C1644x f76320P;

    /* renamed from: Q */
    private final C1644x f76321Q;

    /* renamed from: R */
    private final C1644x f76322R;

    /* renamed from: S */
    private final C1644x f76323S;

    /* renamed from: T */
    private final C1644x f76324T;

    /* renamed from: U */
    private final C1644x f76325U;

    /* renamed from: V */
    private final C1644x f76326V;

    /* renamed from: W */
    private final C1644x f76327W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public C28250b f76328X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public C30103b f76329Y;

    /* renamed from: d */
    private final C28058f f76330d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C16734c1 f76331e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C36735g f76332f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C28469c f76333g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C28061i f76334h;

    /* renamed from: i */
    private final C36734f f76335i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C28053a f76336j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C28473g f76337k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C38857e f76338l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C10092j f76339m;

    /* renamed from: n */
    private final C27494a f76340n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final JuniorRequestDataUiModel f76341o;

    /* renamed from: p */
    private final NavigatorConstants$JuniorFlow f76342p;

    /* renamed from: q */
    private final boolean f76343q;

    /* renamed from: r */
    private final C30363j f76344r = this;

    /* renamed from: s */
    private final C30365k f76345s = this;

    /* renamed from: t */
    private final C40767b f76346t;

    /* renamed from: u */
    private final C40767b f76347u;

    /* renamed from: v */
    private final C40767b f76348v;

    /* renamed from: w */
    private final C40767b f76349w;

    /* renamed from: x */
    private final C40767b f76350x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C40767b f76351y;

    /* renamed from: z */
    private final C1644x f76352z;

    /* renamed from: zm0.r$a */
    static final class C30373a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30372r f76353d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30373a(C30372r rVar) {
            super(1);
            this.f76353d = rVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            String str;
            String str2;
            C41536l.m120489i(wVar, "it");
            C38857e lw = this.f76353d.f76338l;
            Object[] objArr = new Object[1];
            JuniorRequestDataUiModel qw = this.f76353d.f76341o;
            Long l = null;
            if (qw != null) {
                str = qw.mo52341d();
            } else {
                str = null;
            }
            JuniorRequestDataUiModel qw2 = this.f76353d.f76341o;
            if (qw2 != null) {
                str2 = qw2.mo52343e();
            } else {
                str2 = null;
            }
            objArr[0] = str + " " + str2;
            String encodeToString = Base64.encodeToString(C40439w.m117112p(C32343x.m95388F("child.financial.number.page.agreement.text", objArr)), 0);
            C41536l.m120488h(encodeToString, "encodeToString(\n        …ULT\n                    )");
            JuniorRequestDataUiModel qw3 = this.f76353d.f76341o;
            if (qw3 != null) {
                l = qw3.mo52340b();
            }
            return C31270e.m92878g(lw.mo92563a("PARENT_PERMISSION", encodeToString, String.valueOf(l), PensionStatusResult.STATUS_ACTIVE, PensionStatusResult.STATUS_INACTIVE), -1);
        }
    }

    /* renamed from: zm0.r$b */
    static final class C30374b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30372r f76354d;

        /* renamed from: zm0.r$b$a */
        static final class C30375a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C30372r f76355d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C30375a(C30372r rVar) {
                super(1);
                this.f76355d = rVar;
            }

            /* renamed from: a */
            public final void mo70734a(C28249a aVar) {
                this.f76355d.f76351y.onNext(C41238w.f97225a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo70734a((C28249a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30374b(C30372r rVar) {
            super(1);
            this.f76354d = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m91662c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "pair");
            C40762x m = this.f76354d.f76336j.mo67596a((String) mVar.mo95680f(), ((Number) mVar.mo95678e()).longValue()).mo95084m(new C30384s(new C30375a(this.f76354d)));
            C41536l.m120488h(m, "private fun subscribeToA…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, -1);
        }
    }

    /* renamed from: zm0.r$c */
    static final class C30376c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30372r f76356d;

        /* renamed from: zm0.r$c$a */
        static final class C30377a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C30372r f76357d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C30377a(C30372r rVar) {
                super(1);
                this.f76357d = rVar;
            }

            /* renamed from: a */
            public final void mo70736a(C28250b bVar) {
                C37224b.m109962a(this.f76357d.f76314J);
                this.f76357d.f76328X = bVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo70736a((C28250b) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30376c(C30372r rVar) {
            super(1);
            this.f76356d = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m91666c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "it");
            C40762x m = this.f76356d.f76333g.mo68093a(str).mo95084m(new C30385t(new C30377a(this.f76356d)));
            C41536l.m120488h(m, "private fun subscribeToS…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, -1);
        }
    }

    /* renamed from: zm0.r$d */
    static final class C30378d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30372r f76358d;

        /* renamed from: zm0.r$d$a */
        /* synthetic */ class C30379a extends C41535k implements C43075l {
            C30379a(Object obj) {
                super(1, obj, C37224b.class, "postEvent", "postEvent(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
            }

            /* renamed from: b */
            public final void mo70738b(Throwable th) {
                C41536l.m120489i(th, "p0");
                C37224b.m109965d((C1644x) this.receiver, th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo70738b((Throwable) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30378d(C30372r rVar) {
            super(1);
            this.f76358d = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m91671d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m91672e(C30372r rVar) {
            C41536l.m120489i(rVar, "this$0");
            rVar.m91579Lw(C30103b.m91076b(rVar.f76329Y, (C30096a.C30102f) null, (C30096a.C30102f) null, (C30096a.C30100d) null, (C30096a.C30102f) null, C30096a.C30098b.m91065b(rVar.f76329Y.mo70384f(), C30104c.m91084b(rVar.f76329Y.mo70384f().mo70363c(), (String) null, false, true, 3, (Object) null), false, false, 6, (Object) null), (C30096a.C30097a) null, 47, (Object) null));
        }

        /* renamed from: c */
        public final C40754t invoke(C29820a aVar) {
            C41536l.m120489i(aVar, "it");
            C40734b o = this.f76358d.f76334h.mo67603a(aVar.mo70076b(), aVar.mo70075a(), aVar.mo70077c().mo67782a(), aVar.mo70077c().mo67783b()).mo94903p(new C30386u(new C30379a(this.f76358d.f76317M))).mo94902o(new C30387v(this.f76358d));
            C41536l.m120488h(o, "validateChildOtp(\n      …  )\n                    }");
            return C31270e.m92878g(o, -1);
        }
    }

    /* renamed from: zm0.r$e */
    static final class C30380e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30372r f76359d;

        /* renamed from: zm0.r$e$a */
        /* synthetic */ class C30381a extends C41535k implements C43075l {
            C30381a(Object obj) {
                super(1, obj, C10092j.class, "transform", "transform(Lge/bog/mobilebank/cardapplications/domain/model/ScoolCardInfo;)Lge/bog/mobilebank/cardapplications/presentation/model/ScoolCardInfoUiModel;", 0);
            }

            /* renamed from: b */
            public final ScoolCardInfoUiModel invoke(C17090i0 i0Var) {
                C41536l.m120489i(i0Var, "p0");
                return ((C10092j) this.receiver).mo26562h(i0Var);
            }
        }

        /* renamed from: zm0.r$e$b */
        static final class C30382b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C30372r f76360d;

            /* renamed from: e */
            final /* synthetic */ ChildRequestApproveUiModel f76361e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C30382b(C30372r rVar, ChildRequestApproveUiModel childRequestApproveUiModel) {
                super(1);
                this.f76360d = rVar;
                this.f76361e = childRequestApproveUiModel;
            }

            /* renamed from: a */
            public final void mo70741a(ScoolCardInfoUiModel scoolCardInfoUiModel) {
                C1644x xw = this.f76360d.f76307C;
                long a = this.f76361e.mo63033a();
                C41536l.m120488h(scoolCardInfoUiModel, "it");
                JuniorRequestDataUiModel qw = this.f76360d.f76341o;
                if (qw == null) {
                    qw = this.f76360d.m91572Aw(this.f76361e);
                }
                C37224b.m109965d(xw, new CardApplicationTypeData.SchoolCardOrderData(a, scoolCardInfoUiModel, qw, (StringSource) null, 8, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo70741a((ScoolCardInfoUiModel) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30380e(C30372r rVar) {
            super(1);
            this.f76359d = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final ScoolCardInfoUiModel m91677d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (ScoolCardInfoUiModel) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m91678e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(ChildRequestApproveUiModel childRequestApproveUiModel) {
            Long l;
            C41536l.m120489i(childRequestApproveUiModel, "childApprove");
            C16734c1 sw = this.f76359d.f76331e;
            C37228a a = this.f76359d.f76332f.mo89562a();
            if (a != null) {
                l = Long.valueOf(a.mo90305b());
            } else {
                l = null;
            }
            C40762x m = sw.mo43863a(String.valueOf(l), childRequestApproveUiModel.mo63033a()).mo95062A(new C30388w(new C30381a(this.f76359d.f76339m))).mo95084m(new C30389x(new C30382b(this.f76359d, childRequestApproveUiModel)));
            C41536l.m120488h(m, "private fun subscribeToV…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, -1);
        }
    }

    /* renamed from: zm0.r$f */
    static final class C30383f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30372r f76362d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30383f(C30372r rVar) {
            super(1);
            this.f76362d = rVar;
        }

        /* renamed from: a */
        public final C40754t invoke(VerifyChildFinancialPhoneParams verifyChildFinancialPhoneParams) {
            C41536l.m120489i(verifyChildFinancialPhoneParams, "it");
            return C31270e.m92878g(this.f76362d.f76337k.mo68094b(this.f76362d.mo70729Dw(verifyChildFinancialPhoneParams)), -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30372r(C28058f fVar, C16734c1 c1Var, C36735g gVar, C28469c cVar, C28061i iVar, C36734f fVar2, C28053a aVar, C28473g gVar2, C38857e eVar, C10092j jVar, C27494a aVar2, JuniorRequestDataUiModel juniorRequestDataUiModel, NavigatorConstants$JuniorFlow navigatorConstants$JuniorFlow, boolean z) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        boolean z2;
        boolean z3;
        String str;
        String str2;
        Long l;
        boolean z4;
        C28058f fVar3 = fVar;
        C16734c1 c1Var2 = c1Var;
        C36735g gVar3 = gVar;
        C28469c cVar2 = cVar;
        C28061i iVar2 = iVar;
        C36734f fVar4 = fVar2;
        C28053a aVar3 = aVar;
        C28473g gVar4 = gVar2;
        C38857e eVar2 = eVar;
        C10092j jVar2 = jVar;
        C27494a aVar4 = aVar2;
        JuniorRequestDataUiModel juniorRequestDataUiModel2 = juniorRequestDataUiModel;
        NavigatorConstants$JuniorFlow navigatorConstants$JuniorFlow2 = navigatorConstants$JuniorFlow;
        C41536l.m120489i(fVar3, "rejectChildRequestUseCase");
        C41536l.m120489i(c1Var2, "validateAndGetChildSchoolCard");
        C41536l.m120489i(gVar3, "getLoginInfo");
        C41536l.m120489i(cVar2, "sendOtpToChild");
        C41536l.m120489i(iVar2, "validateChildOtp");
        C41536l.m120489i(fVar4, "getClientPhones");
        C41536l.m120489i(aVar3, "approveChildFinancialContactUseCase");
        C41536l.m120489i(gVar4, "verifyChildFinancialPhone");
        C41536l.m120489i(eVar2, "confirmClientDocument");
        C41536l.m120489i(jVar2, "debitCardMapper");
        C41536l.m120489i(aVar4, "otpParamsMapBuilder");
        C41536l.m120489i(navigatorConstants$JuniorFlow2, "flow");
        String str3 = null;
        boolean z5 = true;
        this.f76330d = fVar3;
        this.f76331e = c1Var2;
        this.f76332f = gVar3;
        this.f76333g = cVar2;
        this.f76334h = iVar2;
        this.f76335i = fVar4;
        this.f76336j = aVar3;
        this.f76337k = gVar4;
        this.f76338l = eVar2;
        this.f76339m = jVar2;
        this.f76340n = aVar4;
        this.f76341o = juniorRequestDataUiModel2;
        this.f76342p = navigatorConstants$JuniorFlow2;
        this.f76343q = z;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<ChildRequestApproveUiModel>()");
        this.f76346t = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<String>()");
        this.f76347u = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<ChildOtpInput>()");
        this.f76348v = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<Pair<Long, String>>()");
        this.f76349w = h14;
        C40767b h15 = C40767b.m118210h1();
        C41536l.m120488h(h15, "create<VerifyChildFinancialPhoneParams>()");
        this.f76350x = h15;
        C40767b h16 = C40767b.m118210h1();
        C41536l.m120488h(h16, "create<Unit>()");
        this.f76351y = h16;
        this.f76352z = new C1644x();
        this.f76305A = new C1644x();
        this.f76306B = new C1644x();
        this.f76307C = new C1644x();
        this.f76308D = new C1644x();
        this.f76309E = new C1644x(juniorRequestDataUiModel2);
        this.f76310F = new C1644x();
        this.f76311G = new C1644x();
        this.f76312H = new C1644x();
        this.f76313I = new C1644x();
        this.f76314J = new C1644x();
        this.f76315K = new C1644x();
        this.f76316L = new C1644x();
        this.f76317M = new C1644x();
        this.f76318N = new C1644x();
        NavigatorConstants$JuniorFlow navigatorConstants$JuniorFlow3 = NavigatorConstants$JuniorFlow.FINANCIAL_NUMBER;
        if (navigatorConstants$JuniorFlow2 == navigatorConstants$JuniorFlow3) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f76319O = new C1644x(Boolean.valueOf(z2));
        if (navigatorConstants$JuniorFlow2 == navigatorConstants$JuniorFlow3) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f76320P = new C1644x(C32343x.m95466m(Boolean.valueOf(z3)));
        this.f76321Q = new C1644x();
        this.f76322R = new C1644x();
        this.f76323S = new C1644x();
        this.f76324T = new C1644x();
        this.f76325U = new C1644x();
        this.f76326V = new C1644x();
        this.f76327W = new C1644x(Boolean.FALSE);
        if (juniorRequestDataUiModel2 != null) {
            str = juniorRequestDataUiModel.mo52341d();
        } else {
            str = null;
        }
        C30096a.C30102f fVar5 = new C30096a.C30102f(str, false, false, (C17799b) null, 14, (DefaultConstructorMarker) null);
        if (juniorRequestDataUiModel2 != null) {
            str2 = juniorRequestDataUiModel.mo52343e();
        } else {
            str2 = null;
        }
        C30096a.C30102f fVar6 = new C30096a.C30102f(str2, false, false, (C17799b) null, 14, (DefaultConstructorMarker) null);
        if (juniorRequestDataUiModel2 != null) {
            l = juniorRequestDataUiModel.mo52339a();
        } else {
            l = null;
        }
        C30096a.C30100d dVar = new C30096a.C30100d(l, false, false, 6, (DefaultConstructorMarker) null);
        C30096a.C30102f fVar7 = new C30096a.C30102f(juniorRequestDataUiModel2 != null ? juniorRequestDataUiModel.mo52346g() : str3, false, false, (C17799b) null, 14, (DefaultConstructorMarker) null);
        String str4 = (juniorRequestDataUiModel2 == null || (str4 = juniorRequestDataUiModel.mo52345f()) == null) ? "" : str4;
        if (juniorRequestDataUiModel2 != null) {
            if (juniorRequestDataUiModel.mo52345f().length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                z5 = false;
            }
        }
        this.f76329Y = new C30103b(fVar5, fVar6, dVar, fVar7, new C30096a.C30098b(new C30104c(str4, z5, false), false, false, 6, (DefaultConstructorMarker) null), new C30096a.C30097a(false));
        m91575Gw();
        m91592Yw();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0  */
    /* renamed from: Aw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel m91572Aw(p341ge.bog.mobilebank.junior.presentation.model.ChildRequestApproveUiModel r14) {
        /*
            r13 = this;
            ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel r12 = new ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel
            ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel r0 = r13.f76341o
            r1 = 0
            if (r0 == 0) goto L_0x0010
            java.lang.Long r0 = r0.mo52347h()
            if (r0 != 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r2 = r0
            goto L_0x0018
        L_0x0010:
            if (r14 == 0) goto L_0x0017
            java.lang.Long r0 = r14.mo63037e()
            goto L_0x000e
        L_0x0017:
            r2 = r1
        L_0x0018:
            ym0.b r0 = r13.f76329Y
            ym0.a$f r0 = r0.mo70385g()
            java.lang.String r3 = r0.mo70373a()
            if (r14 == 0) goto L_0x002e
            long r4 = r14.mo63033a()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
        L_0x002c:
            r4 = r0
            goto L_0x0038
        L_0x002e:
            ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel r0 = r13.f76341o
            if (r0 == 0) goto L_0x0037
            java.lang.Long r0 = r0.mo52340b()
            goto L_0x002c
        L_0x0037:
            r4 = r1
        L_0x0038:
            if (r14 == 0) goto L_0x0040
            java.lang.String r0 = r14.mo63034b()
            if (r0 != 0) goto L_0x004e
        L_0x0040:
            ym0.b r0 = r13.f76329Y
            ym0.a$f r0 = r0.mo70381d()
            java.lang.String r0 = r0.mo70373a()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x004e:
            r5 = r0
            if (r14 == 0) goto L_0x0057
            java.lang.String r14 = r14.mo63035d()
            if (r14 != 0) goto L_0x0061
        L_0x0057:
            ym0.b r14 = r13.f76329Y
            ym0.a$f r14 = r14.mo70382e()
            java.lang.String r14 = r14.mo70373a()
        L_0x0061:
            ym0.b r0 = r13.f76329Y
            ym0.a$d r0 = r0.mo70380c()
            java.lang.Long r6 = r0.mo70369a()
            ym0.b r0 = r13.f76329Y
            ym0.a$b r0 = r0.mo70384f()
            ym0.c r0 = r0.mo70363c()
            java.lang.String r0 = r0.mo70391d()
            java.lang.String r7 = r13.m91593Zw(r0)
            ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel r0 = r13.f76341o
            if (r0 == 0) goto L_0x0087
            java.lang.Long r0 = r0.mo52349i()
            r8 = r0
            goto L_0x0088
        L_0x0087:
            r8 = r1
        L_0x0088:
            ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel r0 = r13.f76341o
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = r0.mo52350j()
            if (r0 != 0) goto L_0x0094
        L_0x0092:
            java.lang.String r0 = ""
        L_0x0094:
            r9 = r0
            ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel r0 = r13.f76341o
            r10 = 0
            if (r0 == 0) goto L_0x00a2
            boolean r0 = r0.mo52351k()
            r11 = 1
            if (r0 != r11) goto L_0x00a2
            r10 = r11
        L_0x00a2:
            sm0.b r0 = r13.f76328X
            if (r0 == 0) goto L_0x00b0
            long r0 = r0.mo67783b()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11 = r0
            goto L_0x00b1
        L_0x00b0:
            r11 = r1
        L_0x00b1:
            r0 = r12
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zm0.C30372r.m91572Aw(ge.bog.mobilebank.junior.presentation.model.ChildRequestApproveUiModel):ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel");
    }

    /* renamed from: Bw */
    static /* synthetic */ JuniorRequestDataUiModel m91573Bw(C30372r rVar, ChildRequestApproveUiModel childRequestApproveUiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            childRequestApproveUiModel = null;
        }
        return rVar.m91572Aw(childRequestApproveUiModel);
    }

    /* renamed from: Fw */
    private final boolean m91574Fw(VerifyChildFinancialPhoneParams verifyChildFinancialPhoneParams) {
        return (verifyChildFinancialPhoneParams.getOperationReference() == null || verifyChildFinancialPhoneParams.getScaAuthCode() == null || verifyChildFinancialPhoneParams.getOperationId() == null) ? false : true;
    }

    /* renamed from: Gw */
    private final void m91575Gw() {
        m91588Uw();
        m91584Qw();
        m91586Sw();
        m91590Ww();
        m91582Ow();
        m91580Mw();
    }

    /* renamed from: Hw */
    private final boolean m91576Hw(String str, List list) {
        boolean z;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C36874b bVar = (C36874b) it.next();
            if (!bVar.mo89807b() || !C41536l.m120484d(m91577Iw(bVar.mo89806a(), this), m91577Iw(str, this))) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Iw */
    private static final String m91577Iw(String str, C30372r rVar) {
        return rVar.m91593Zw(str);
    }

    /* renamed from: Kw */
    private final void m91578Kw(ChildRequestApproveUiModel childRequestApproveUiModel) {
        this.f76346t.onNext(childRequestApproveUiModel);
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public final void m91579Lw(C30103b bVar) {
        this.f76329Y = bVar;
        mo70701p7();
    }

    /* renamed from: Mw */
    private final void m91580Mw() {
        C40749p L0 = this.f76351y.mo94989L0(new C30369o(new C30373a(this)));
        C41536l.m120488h(L0, "private fun subscribeCon…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f76326V));
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final C40754t m91581Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Ow */
    private final void m91582Ow() {
        C40749p L0 = this.f76349w.mo94989L0(new C30368n(new C30374b(this)));
        C41536l.m120488h(L0, "private fun subscribeToA…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f76321Q));
    }

    /* access modifiers changed from: private */
    /* renamed from: Pw */
    public static final C40754t m91583Pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Qw */
    private final void m91584Qw() {
        C40749p L0 = this.f76347u.mo94989L0(new C30371q(new C30376c(this)));
        C41536l.m120488h(L0, "private fun subscribeToS…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f76315K));
    }

    /* access modifiers changed from: private */
    /* renamed from: Rw */
    public static final C40754t m91585Rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Sw */
    private final void m91586Sw() {
        C40749p L0 = this.f76348v.mo94989L0(new C30367m(new C30378d(this)));
        C41536l.m120488h(L0, "private fun subscribeToV…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f76316L));
    }

    /* access modifiers changed from: private */
    /* renamed from: Tw */
    public static final C40754t m91587Tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Uw */
    private final void m91588Uw() {
        C40749p L0 = this.f76346t.mo94989L0(new C30366l(new C30380e(this)));
        C41536l.m120488h(L0, "private fun subscribeToV…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f76306B));
    }

    /* access modifiers changed from: private */
    /* renamed from: Vw */
    public static final C40754t m91589Vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Ww */
    private final void m91590Ww() {
        C40749p L0 = this.f76350x.mo94989L0(new C30370p(new C30383f(this)));
        C41536l.m120488h(L0, "private fun subscribeToV…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f76324T));
    }

    /* access modifiers changed from: private */
    /* renamed from: Xw */
    public static final C40754t m91591Xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Yw */
    private final void m91592Yw() {
        this.f76319O.mo4823o(Boolean.valueOf(this.f76343q));
    }

    /* renamed from: Zw */
    private final String m91593Zw(String str) {
        return C40440x.m117172n0(C40440x.m117172n0(C40440x.m117146P0(str).toString(), "+995"), "995");
    }

    /* renamed from: Ae */
    public LiveData mo70705Ae() {
        return this.f76310F;
    }

    /* renamed from: C7 */
    public void mo70689C7(String str) {
        C41536l.m120489i(str, "phoneNumber");
        C30103b bVar = this.f76329Y;
        m91579Lw(C30103b.m91076b(bVar, (C30096a.C30102f) null, (C30096a.C30102f) null, (C30096a.C30100d) null, (C30096a.C30102f) null, C30096a.C30098b.m91065b(bVar.mo70384f(), C30104c.m91084b(this.f76329Y.mo70384f().mo70363c(), str, false, false, 6, (Object) null), false, false, 6, (Object) null), (C30096a.C30097a) null, 47, (Object) null));
    }

    /* renamed from: Cw */
    public final C30363j mo70728Cw() {
        return this.f76344r;
    }

    /* renamed from: Dk */
    public void mo70690Dk(String str) {
        C41536l.m120489i(str, "lastName");
        m91579Lw(C30103b.m91076b(this.f76329Y, (C30096a.C30102f) null, new C30096a.C30102f(str, false, false, (C17799b) null, 14, (DefaultConstructorMarker) null), (C30096a.C30100d) null, (C30096a.C30102f) null, (C30096a.C30098b) null, (C30096a.C30097a) null, 61, (Object) null));
    }

    /* renamed from: Dw */
    public HashMap mo70729Dw(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f76340n.mo66809a(otpParams);
    }

    /* renamed from: Ec */
    public void mo70691Ec(String str) {
        long j;
        Long b;
        C41536l.m120489i(str, "contact");
        C40767b bVar = this.f76349w;
        JuniorRequestDataUiModel juniorRequestDataUiModel = this.f76341o;
        if (juniorRequestDataUiModel == null || (b = juniorRequestDataUiModel.mo52340b()) == null) {
            j = 0;
        } else {
            j = b.longValue();
        }
        bVar.onNext(new C41224m(Long.valueOf(j), str));
    }

    /* renamed from: Ew */
    public final C30365k mo70730Ew() {
        return this.f76345s;
    }

    /* renamed from: Fr */
    public LiveData mo70706Fr() {
        return this.f76352z;
    }

    /* renamed from: Jw */
    public void mo70731Jw() {
        Long h;
        C28058f fVar = this.f76330d;
        JuniorRequestDataUiModel juniorRequestDataUiModel = this.f76341o;
        if (juniorRequestDataUiModel != null && (h = juniorRequestDataUiModel.mo52347h()) != null) {
            bindToLifecycle(C31270e.m92876e(C31270e.m92878g(fVar.mo67600a(h.longValue()), -1), this.f76311G));
        }
    }

    /* renamed from: L4 */
    public LiveData mo70707L4() {
        return this.f76319O;
    }

    /* renamed from: Lg */
    public LiveData mo70708Lg() {
        return this.f76317M;
    }

    /* renamed from: Ml */
    public void mo70692Ml(ChildRequestApproveUiModel childRequestApproveUiModel) {
        C41536l.m120489i(childRequestApproveUiModel, "data");
        if (!childRequestApproveUiModel.mo63039f()) {
            m91578Kw(childRequestApproveUiModel);
            return;
        }
        this.f76309E.mo4823o(m91573Bw(this, (ChildRequestApproveUiModel) null, 1, (Object) null));
        C37224b.m109965d(this.f76308D, (Object) null);
    }

    /* renamed from: Ok */
    public void mo70693Ok(String str) {
        C41536l.m120489i(str, "firstName");
        m91579Lw(C30103b.m91076b(this.f76329Y, new C30096a.C30102f(str, false, false, (C17799b) null, 14, (DefaultConstructorMarker) null), (C30096a.C30102f) null, (C30096a.C30100d) null, (C30096a.C30102f) null, (C30096a.C30098b) null, (C30096a.C30097a) null, 62, (Object) null));
    }

    /* renamed from: Q4 */
    public LiveData mo70709Q4() {
        return this.f76325U;
    }

    /* renamed from: Qk */
    public void mo70694Qk() {
        if (this.f76329Y.mo70384f().mo70365e()) {
            C40767b bVar = this.f76347u;
            String Zw = m91593Zw(this.f76329Y.mo70384f().mo70363c().mo70391d());
            bVar.onNext("995" + Zw);
        }
    }

    /* renamed from: Qn */
    public LiveData mo70710Qn() {
        return this.f76324T;
    }

    /* renamed from: Rp */
    public void mo70695Rp(long j) {
        m91579Lw(C30103b.m91076b(this.f76329Y, (C30096a.C30102f) null, (C30096a.C30102f) null, new C30096a.C30100d(Long.valueOf(j), false, false, 6, (DefaultConstructorMarker) null), (C30096a.C30102f) null, (C30096a.C30098b) null, (C30096a.C30097a) null, 59, (Object) null));
    }

    /* renamed from: Uh */
    public LiveData mo70711Uh() {
        return this.f76314J;
    }

    /* renamed from: Vp */
    public LiveData mo70712Vp() {
        return this.f76322R;
    }

    /* renamed from: W7 */
    public LiveData mo70713W7() {
        return this.f76315K;
    }

    /* renamed from: Wh */
    public void mo70696Wh(String str) {
        C41536l.m120489i(str, "otp");
        C28250b bVar = this.f76328X;
        if (bVar != null) {
            C40767b bVar2 = this.f76348v;
            String Zw = m91593Zw(this.f76329Y.mo70384f().mo70363c().mo70391d());
            bVar2.onNext(new C29820a("995" + Zw, str, bVar));
        }
    }

    /* renamed from: Y5 */
    public void mo70697Y5() {
        long j;
        long W1 = C5023l.m19556W1();
        Calendar instance = Calendar.getInstance();
        Long a = this.f76329Y.mo70380c().mo70369a();
        if (a != null) {
            j = a.longValue();
        } else {
            j = 0;
        }
        instance.setTimeInMillis(W1);
        instance.set(2, instance.get(2) - 252);
        long timeInMillis = instance.getTimeInMillis();
        instance.setTimeInMillis(W1);
        instance.set(2, instance.get(2) - 48);
        long timeInMillis2 = instance.getTimeInMillis();
        C1644x xVar = this.f76310F;
        CalendarConstraints.C4986b b = new CalendarConstraints.C4986b().mo16158e(DateValidatorPointBackward.m19406a(timeInMillis2)).mo16157d(timeInMillis).mo16155b(timeInMillis2);
        boolean z = false;
        if (timeInMillis <= j && j < timeInMillis2) {
            z = true;
        }
        if (!z) {
            j = timeInMillis2;
        }
        CalendarConstraints a2 = b.mo16156c(j).mo16154a();
        C41536l.m120488h(a2, "Builder()\n              …                 .build()");
        C37224b.m109965d(xVar, new C37586a(a2, (Long) null, 2, (DefaultConstructorMarker) null));
    }

    /* renamed from: c6 */
    public LiveData mo70714c6() {
        return this.f76321Q;
    }

    /* renamed from: eg */
    public LiveData mo70715eg() {
        return this.f76318N;
    }

    /* renamed from: ei */
    public void mo70698ei(String str) {
        C41536l.m120489i(str, "phone");
        C37224b.m109965d(this.f76308D, str);
        C32343x.m95397J0(this, "sCool_number", (String) null, "success_page", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
    }

    /* renamed from: f */
    public LiveData mo70716f() {
        return this.f76305A;
    }

    /* renamed from: fm */
    public void mo70699fm(String str) {
        C41536l.m120489i(str, "phoneNumber");
        if (m91576Hw(str, this.f76335i.mo89561a())) {
            C37224b.m109965d(this.f76318N, Boolean.TRUE);
        } else {
            C37224b.m109965d(this.f76318N, Boolean.FALSE);
        }
    }

    /* renamed from: hq */
    public LiveData mo70717hq() {
        return this.f76309E;
    }

    /* renamed from: hv */
    public LiveData mo70718hv() {
        return this.f76320P;
    }

    /* renamed from: i0 */
    public LiveData mo70719i0() {
        return this.f76326V;
    }

    /* renamed from: k6 */
    public LiveData mo70720k6() {
        return this.f76308D;
    }

    /* renamed from: kq */
    public void mo70700kq() {
        String str;
        JuniorRequestDataUiModel juniorRequestDataUiModel = this.f76341o;
        if (juniorRequestDataUiModel != null) {
            str = juniorRequestDataUiModel.mo52345f();
        } else {
            str = null;
        }
        if (str == null || !m91576Hw(this.f76341o.mo52345f(), this.f76335i.mo89561a())) {
            C37224b.m109965d(this.f76313I, m91573Bw(this, (ChildRequestApproveUiModel) null, 1, (Object) null));
        } else {
            C37224b.m109965d(this.f76318N, Boolean.TRUE);
        }
    }

    /* renamed from: p7 */
    public void mo70701p7() {
        this.f76305A.mo4823o(this.f76329Y);
    }

    /* renamed from: pq */
    public LiveData mo70721pq() {
        return this.f76312H;
    }

    /* renamed from: pr */
    public LiveData mo70722pr() {
        return this.f76306B;
    }

    /* renamed from: qq */
    public void mo70702qq() {
        C37224b.m109962a(this.f76322R);
    }

    /* renamed from: t */
    public LiveData mo70723t() {
        return this.f76323S;
    }

    /* renamed from: t8 */
    public LiveData mo70724t8() {
        return this.f76307C;
    }

    /* renamed from: uj */
    public void mo70703uj(String str, long j, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(str, "contact");
        String str7 = str2;
        C41536l.m120489i(str7, "oneTimeCode");
        String str8 = str3;
        C41536l.m120489i(str8, "approveOperationReference");
        VerifyChildFinancialPhoneParams verifyChildFinancialPhoneParams = new VerifyChildFinancialPhoneParams(str, str7, j, str8, str5, str4, str6, (String) null, 128, (DefaultConstructorMarker) null);
        if (!m91574Fw(verifyChildFinancialPhoneParams)) {
            C37224b.m109965d(this.f76323S, verifyChildFinancialPhoneParams);
            C37224b.m109962a(this.f76325U);
            return;
        }
        this.f76350x.onNext(verifyChildFinancialPhoneParams);
    }

    /* renamed from: ul */
    public void mo70704ul(String str) {
        C41536l.m120489i(str, "pin");
        m91579Lw(C30103b.m91076b(this.f76329Y, (C30096a.C30102f) null, (C30096a.C30102f) null, (C30096a.C30100d) null, new C30096a.C30102f(str, false, false, (C17799b) null, 14, (DefaultConstructorMarker) null), (C30096a.C30098b) null, (C30096a.C30097a) null, 55, (Object) null));
    }

    /* renamed from: uo */
    public LiveData mo70725uo() {
        return this.f76313I;
    }

    /* renamed from: vg */
    public LiveData mo70726vg() {
        return this.f76311G;
    }

    /* renamed from: xh */
    public LiveData mo70727xh() {
        return this.f76316L;
    }
}
