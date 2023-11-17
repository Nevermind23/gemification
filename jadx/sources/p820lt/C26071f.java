package p820lt;

import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import ee1.C40765a;
import hd0.C24978b;
import he1.C41238w;
import java.util.concurrent.atomic.AtomicBoolean;
import k70.C25677a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AccountsApiEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p810kt.C25764a;
import p863pw.C27631i;
import p873qw.C27867a;
import ue1.C43075l;

/* renamed from: lt.f */
public final class C26071f implements C27867a {

    /* renamed from: i */
    public static final C26072a f66174i = new C26072a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final IRetrofitService f66175d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C25764a f66176e;

    /* renamed from: f */
    private final C25677a f66177f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public AtomicBoolean f66178g = new AtomicBoolean(false);

    /* renamed from: h */
    private C40765a f66179h;

    /* renamed from: lt.f$a */
    public static final class C26072a {
        private C26072a() {
        }

        public /* synthetic */ C26072a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lt.f$b */
    static final class C26073b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26071f f66180d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26073b(C26071f fVar) {
            super(1);
            this.f66180d = fVar;
        }

        /* renamed from: a */
        public final C27631i invoke(AccountsApiEntity accountsApiEntity) {
            C41536l.m120489i(accountsApiEntity, "it");
            return this.f66180d.f66176e.mo64355i(accountsApiEntity);
        }
    }

    /* renamed from: lt.f$c */
    static final class C26074c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26071f f66181d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26074c(C26071f fVar) {
            super(1);
            this.f66181d = fVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f66181d.f66178g.set(true);
        }
    }

    public C26071f(IRetrofitService iRetrofitService, C25764a aVar, C25677a aVar2) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "accountsMapper");
        C41536l.m120489i(aVar2, "updateAccounts");
        this.f66175d = iRetrofitService;
        this.f66176e = aVar;
        this.f66177f = aVar2;
        C40765a i1 = C40765a.m118199i1(m81742i4());
        C41536l.m120488h(i1, "createDefault(getAccountsObservable())");
        this.f66179h = i1;
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public static final void m81740g4(C26071f fVar) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m81745l4();
    }

    /* access modifiers changed from: private */
    /* renamed from: h4 */
    public static final void m81741h4(C26071f fVar) {
        C41536l.m120489i(fVar, "this$0");
        fVar.f66177f.invoke();
    }

    /* renamed from: i4 */
    private final C40749p m81742i4() {
        C40762x<BankApiResponse<AccountsApiEntity>> accountsAndDetails = this.f66175d.getAccountsAndDetails("ACCOUNTS_GET_ACCOUNTS_AND_DETAILS");
        C41536l.m120488h(accountsAndDetails, "service.getAccountsAndDe…NTS_AND_DETAILS\n        )");
        C40749p g = C19273c.m64722h(accountsAndDetails).mo95062A(new C26066a(new C26073b(this))).mo95082k(new C26067b(new C26074c(this))).mo95075O().mo95021g();
        C41536l.m120488h(g, "private fun getAccountsO…           .cache()\n    }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final C27631i m81743j4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C27631i) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public static final void m81744k4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: l4 */
    private final C40749p m81745l4() {
        C40749p i4 = m81742i4();
        this.f66179h.onNext(i4);
        return i4;
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public static final void m81746m4(C26071f fVar) {
        C41536l.m120489i(fVar, "this$0");
        fVar.f66177f.invoke();
    }

    /* renamed from: C2 */
    public C40734b mo64985C2(String str, String str2, C24978b bVar) {
        String str3;
        C41536l.m120489i(str, "productGroup");
        C41536l.m120489i(str2, "productKey");
        C41536l.m120489i(bVar, "hide");
        IRetrofitService iRetrofitService = this.f66175d;
        if (bVar == C24978b.YES) {
            str3 = "Y";
        } else {
            str3 = "N";
        }
        C40762x<BankApiResponse<Object>> changeAccountVisibility = iRetrofitService.changeAccountVisibility("COMMON_CHANGE_CLIENT_PRODUCT_HIDE", str, str2, str3);
        C41536l.m120488h(changeAccountVisibility, "service.changeAccountVis…\"\n            }\n        )");
        C40734b o = C19273c.m64720f(changeAccountVisibility).mo94902o(new C26068c(this));
        C41536l.m120488h(o, "service.changeAccountVis…hAccounts()\n            }");
        return o;
    }

    /* renamed from: I1 */
    public C40734b mo64986I1(long j, String str) {
        C40762x<BankApiResponse<Object>> changeAcctNameSingle = this.f66175d.changeAcctNameSingle("ACCOUNTS_CHANGE_ALL_NAMES_BY_MAIN_ACCT_KEY", j, str);
        C41536l.m120488h(changeAcctNameSingle, "service.changeAcctNameSi…           name\n        )");
        C40734b o = C19273c.m64720f(changeAcctNameSingle).mo94902o(new C26069d(this));
        C41536l.m120488h(o, "service.changeAcctNameSi…eAccounts()\n            }");
        return o;
    }

    /* renamed from: c2 */
    public C40734b mo64987c2(String str, String str2, C24978b bVar) {
        String str3;
        C41536l.m120489i(str, "productGroup");
        C41536l.m120489i(str2, "productKey");
        C41536l.m120489i(bVar, "isDefault");
        IRetrofitService iRetrofitService = this.f66175d;
        if (bVar == C24978b.YES) {
            str3 = "Y";
        } else {
            str3 = "N";
        }
        C40762x<BankApiResponse<Object>> changeProductDefaultState = iRetrofitService.changeProductDefaultState("COMMON_CHANGE_CLIENT_PRODUCT_DEFAULT", str, str2, str3);
        C41536l.m120488h(changeProductDefaultState, "service.changeProductDef…\"\n            }\n        )");
        C40734b o = C19273c.m64720f(changeProductDefaultState).mo94902o(new C26070e(this));
        C41536l.m120488h(o, "service.changeProductDef…eAccounts()\n            }");
        return o;
    }

    public void clean() {
        this.f66178g = new AtomicBoolean(false);
        this.f66179h.onComplete();
        C40765a i1 = C40765a.m118199i1(m81742i4());
        C41536l.m120488h(i1, "createDefault(getAccountsObservable())");
        this.f66179h = i1;
    }

    /* renamed from: x1 */
    public C40734b mo64988x1() {
        C40734b y = this.f66175d.sendStatusPopupClickedLog("BONUSES_SET_VIEWED_CLP_CLIENT_STATUS").mo95092y();
        C41536l.m120488h(y, "service.sendStatusPopupC…        ).ignoreElement()");
        return y;
    }
}
