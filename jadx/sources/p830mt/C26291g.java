package p830mt;

import ed1.C40734b;
import ed1.C40744k;
import ed1.C40762x;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.referals.entity.ReferalEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p840nt.C26606a;
import p893sw.C28278a;
import p893sw.C28279b;
import p904tw.C28520a;
import ue1.C43075l;

/* renamed from: mt.g */
public final class C26291g implements C28520a {

    /* renamed from: g */
    public static final C26292a f66632g = new C26292a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final IRetrofitService f66633d;

    /* renamed from: e */
    private final C26606a f66634e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ReferalEntity f66635f;

    /* renamed from: mt.g$a */
    public static final class C26292a {
        private C26292a() {
        }

        public /* synthetic */ C26292a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mt.g$b */
    static final class C26293b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26291g f66636d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26293b(C26291g gVar) {
            super(1);
            this.f66636d = gVar;
        }

        /* renamed from: a */
        public final void mo65438a(ReferalEntity referalEntity) {
            this.f66636d.f66635f = referalEntity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo65438a((ReferalEntity) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: mt.g$c */
    static final class C26294c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26291g f66637d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26294c(C26291g gVar) {
            super(1);
            this.f66637d = gVar;
        }

        /* renamed from: a */
        public final Boolean invoke(ReferalEntity referalEntity) {
            C41536l.m120489i(referalEntity, "it");
            return Boolean.valueOf(this.f66637d.m82232h4(referalEntity));
        }
    }

    /* renamed from: mt.g$d */
    static final class C26295d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26291g f66638d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26295d(C26291g gVar) {
            super(1);
            this.f66638d = gVar;
        }

        /* renamed from: a */
        public final C28278a invoke(ReferalEntity referalEntity) {
            C41536l.m120489i(referalEntity, "it");
            return this.f66638d.mo65436i4().mo65858a(referalEntity);
        }
    }

    /* renamed from: mt.g$e */
    static final class C26296e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26291g f66639d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26296e(C26291g gVar) {
            super(1);
            this.f66639d = gVar;
        }

        /* renamed from: a */
        public final void mo65441a(ReferalEntity referalEntity) {
            this.f66639d.f66635f = referalEntity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo65441a((ReferalEntity) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: mt.g$f */
    static final class C26297f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26291g f66640d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26297f(C26291g gVar) {
            super(1);
            this.f66640d = gVar;
        }

        /* renamed from: a */
        public final C28279b invoke(ReferalEntity referalEntity) {
            C41536l.m120489i(referalEntity, "it");
            return this.f66640d.mo65436i4().mo65859b(referalEntity);
        }
    }

    /* renamed from: mt.g$g */
    static final class C26298g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26291g f66641d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26298g(C26291g gVar) {
            super(1);
            this.f66641d = gVar;
        }

        /* renamed from: a */
        public final void mo65443a(BankApiResponse bankApiResponse) {
            this.f66641d.f66635f = null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo65443a((BankApiResponse) obj);
            return C41238w.f97225a;
        }
    }

    public C26291g(IRetrofitService iRetrofitService, C26606a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f66633d = iRetrofitService;
        this.f66634e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h4 */
    public final boolean m82232h4(ReferalEntity referalEntity) {
        if (referalEntity != null) {
            return C41536l.m120484d(referalEntity.isReferralProgramActive(), Boolean.TRUE);
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final void m82233j4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public static final boolean m82234k4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static final C28278a m82235l4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28278a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public static final void m82236m4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public static final C28279b m82237n4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28279b) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public static final void m82238p4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: G3 */
    public C40734b mo65434G3(String str) {
        C41536l.m120489i(str, "promoCode");
        C40762x m = this.f66633d.setReferalCode("COMMON_ACTIVATE_PROMO_CODE", str).mo95084m(new C26288d(new C26298g(this)));
        C41536l.m120488h(m, "override fun setReferalP…   .ignoreResult()\n\n    }");
        return C19273c.m64720f(m);
    }

    /* renamed from: O1 */
    public C40744k mo65435O1() {
        C40744k kVar;
        ReferalEntity referalEntity = this.f66635f;
        if (referalEntity == null) {
            kVar = null;
        } else if (m82232h4(referalEntity)) {
            kVar = C40744k.m118000q(this.f66634e.mo65858a(referalEntity));
        } else {
            kVar = C40744k.m117998k();
        }
        if (kVar != null) {
            return kVar;
        }
        C40762x<BankApiResponse<ReferalEntity>> referralInfo = this.f66633d.getReferralInfo("COMMON_GET_REFERRAL_INFO");
        C41536l.m120488h(referralInfo, "service.getReferralInfo(REFERAL_SERVICE)");
        C40744k r = C19273c.m64722h(referralInfo).mo95084m(new C26285a(new C26293b(this))).mo95086q(new C26286b(new C26294c(this))).mo94956r(new C26287c(new C26295d(this)));
        C41536l.m120488h(r, "run {\n            servic…              }\n        }");
        return r;
    }

    public void clean() {
        this.f66635f = null;
    }

    /* renamed from: i4 */
    public final C26606a mo65436i4() {
        return this.f66634e;
    }

    /* renamed from: s0 */
    public C40762x mo65437s0() {
        C40762x xVar;
        ReferalEntity referalEntity = this.f66635f;
        if (referalEntity != null) {
            xVar = C40762x.m118162z(this.f66634e.mo65859b(referalEntity));
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        C40762x<BankApiResponse<ReferalEntity>> referralInfo = this.f66633d.getReferralInfo("COMMON_GET_REFERRAL_INFO");
        C41536l.m120488h(referralInfo, "service.getReferralInfo(REFERAL_SERVICE)");
        C40762x A = C19273c.m64722h(referralInfo).mo95084m(new C26289e(new C26296e(this))).mo95062A(new C26290f(new C26297f(this)));
        C41536l.m120488h(A, "run {\n            servic…              }\n        }");
        return A;
    }
}
