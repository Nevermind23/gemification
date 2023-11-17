package cv0;

import dv0.C31608a;
import dv0.C31609b;
import dv0.C31610c;
import dv0.C31611d;
import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40762x;
import gv0.C36084a;
import he1.C41238w;
import iv0.C36551c;
import iv0.C36559k;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.openbanking.data.model.ConsentApiModel;
import p341ge.bog.mobilebank.openbanking.data.model.TransactionsResultApiModel;
import p341ge.bog.mobilebank.openbanking.domain.AccountsLoadingInProgressException;
import p341ge.bog.mobilebank.openbanking.domain.OperationsPermissionDeniedException;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import ue1.C43075l;

/* renamed from: cv0.h */
public final class C31441h implements C36084a {

    /* renamed from: j */
    public static final C31442a f77990j = new C31442a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C31450i f77991d;

    /* renamed from: e */
    private final C31610c f77992e;

    /* renamed from: f */
    private final C31611d f77993f;

    /* renamed from: g */
    private final C31608a f77994g;

    /* renamed from: h */
    private final C31609b f77995h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public AtomicReference f77996i = new AtomicReference();

    /* renamed from: cv0.h$a */
    public static final class C31442a {
        private C31442a() {
        }

        public /* synthetic */ C31442a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: cv0.h$b */
    /* synthetic */ class C31443b extends C41535k implements C43075l {
        C31443b(Object obj) {
            super(1, obj, C31609b.class, "convert", "convert(Lge/bog/mobilebank/openbanking/data/model/ConsentApiModel;)Lge/bog/mobilebank/openbanking/domain/model/Consent;", 0);
        }

        /* renamed from: b */
        public final C36551c invoke(ConsentApiModel consentApiModel) {
            C41536l.m120489i(consentApiModel, "p0");
            return ((C31609b) this.receiver).mo72023a(consentApiModel);
        }
    }

    /* renamed from: cv0.h$c */
    /* synthetic */ class C31444c extends C41535k implements C43075l {
        C31444c(Object obj) {
            super(1, obj, C31608a.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C31608a) this.receiver).mo72022a(list);
        }
    }

    /* renamed from: cv0.h$d */
    /* synthetic */ class C31445d extends C41535k implements C43075l {
        C31445d(Object obj) {
            super(1, obj, C31610c.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C31610c) this.receiver).mo72024g(list);
        }
    }

    /* renamed from: cv0.h$e */
    static final class C31446e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31441h f77997d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31446e(C31441h hVar) {
            super(1);
            this.f77997d = hVar;
        }

        /* renamed from: a */
        public final void mo71796a(List list) {
            this.f77997d.f77996i.set(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71796a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: cv0.h$f */
    static final class C31447f extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C31447f f77998d = new C31447f();

        C31447f() {
            super(1);
        }

        /* renamed from: a */
        public final C40735b0 invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            if (!(th instanceof ApiError) || !C41536l.m120484d(((ApiError) th).mo84685a().getCode(), "12")) {
                return C40762x.m118158o(th);
            }
            return C40762x.m118158o(new AccountsLoadingInProgressException());
        }
    }

    /* renamed from: cv0.h$g */
    /* synthetic */ class C31448g extends C41535k implements C43075l {
        C31448g(Object obj) {
            super(1, obj, C31611d.class, "convert", "convert(Lge/bog/mobilebank/openbanking/data/model/TransactionsResultApiModel;)Lge/bog/mobilebank/openbanking/domain/model/TransactionData;", 0);
        }

        /* renamed from: b */
        public final C36559k invoke(TransactionsResultApiModel transactionsResultApiModel) {
            C41536l.m120489i(transactionsResultApiModel, "p0");
            return ((C31611d) this.receiver).mo72025b(transactionsResultApiModel);
        }
    }

    /* renamed from: cv0.h$h */
    static final class C31449h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C31449h f77999d = new C31449h();

        C31449h() {
            super(1);
        }

        /* renamed from: a */
        public final C40735b0 invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            if (!(th instanceof ApiError) || !C41536l.m120484d(((ApiError) th).mo84685a().getCode(), BankApiResponse.SCA_AUTH_ERROR_CODE_WITH_LOCK)) {
                return C40762x.m118158o(th);
            }
            return C40762x.m118158o(new OperationsPermissionDeniedException());
        }
    }

    public C31441h(C31450i iVar, C31610c cVar, C31611d dVar, C31608a aVar, C31609b bVar) {
        C41536l.m120489i(iVar, "service");
        C41536l.m120489i(cVar, "productsMapper");
        C41536l.m120489i(dVar, "transactionsMapper");
        C41536l.m120489i(aVar, "banksMapper");
        C41536l.m120489i(bVar, "consentMapper");
        this.f77991d = iVar;
        this.f77992e = cVar;
        this.f77993f = dVar;
        this.f77994g = aVar;
        this.f77995h = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h4 */
    public static final C36551c m93379h4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C36551c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public static final List m93380i4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final List m93381j4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public static final void m93382k4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static final C40735b0 m93383l4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public static final C36559k m93384m4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C36559k) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public static final C40735b0 m93385n4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* renamed from: S */
    public C40762x mo71788S(String str) {
        C41536l.m120489i(str, "bankId");
        C40762x A = this.f77991d.mo71800S(str).mo95062A(new C31434a(new C31443b(this.f77995h)));
        C41536l.m120488h(A, "service.createConsent(ba…p(consentMapper::convert)");
        return A;
    }

    /* renamed from: T */
    public C40762x mo71789T(String str, String str2, String str3, int i) {
        C41536l.m120489i(str, "consentId");
        C41536l.m120489i(str2, "bankId");
        C41536l.m120489i(str3, "productId");
        C40762x C = this.f77991d.mo71801T(str, str2, str3, i).mo95062A(new C31438e(new C31448g(this.f77993f))).mo95064C(new C31439f(C31449h.f77999d));
        C41536l.m120488h(C, "service.getTransactions(…          }\n            }");
        return C;
    }

    /* renamed from: U */
    public C40734b mo71790U(String str, String str2) {
        C41536l.m120489i(str, "bankId");
        C41536l.m120489i(str2, "consentId");
        return this.f77991d.mo71802U(str, str2);
    }

    /* renamed from: V */
    public C40762x mo71791V() {
        C40762x A = this.f77991d.mo71803V().mo95062A(new C31440g(new C31444c(this.f77994g)));
        C41536l.m120488h(A, "service.getBankList().map(banksMapper::convert)");
        return A;
    }

    public void clean() {
        this.f77996i.set((Object) null);
    }

    /* renamed from: e2 */
    public C40762x mo71792e2(boolean z) {
        List list = (List) this.f77996i.get();
        if (list == null || z) {
            C40762x C = this.f77991d.mo71804W().mo95062A(new C31435b(new C31445d(this.f77992e))).mo95084m(new C31436c(new C31446e(this))).mo95064C(new C31437d(C31447f.f77998d));
            C41536l.m120488h(C, "override fun getProducts…        }\n        }\n    }");
            return C;
        }
        C40762x z2 = C40762x.m118162z(list);
        C41536l.m120488h(z2, "{\n            Single.just(productsCache)\n        }");
        return z2;
    }
}
