package p737dt;

import d50.C19909b;
import de1.C40640a;
import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40744k;
import ed1.C40762x;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryAddResponse;
import p341ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryResponse;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.ClientCurrencyApiEntity;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p747et.C20290a;
import p760fw.C20575a;
import p774gw.C24835a;
import p863pw.C27638p;
import ue1.C43075l;

/* renamed from: dt.p */
public final class C20087p implements C24835a {

    /* renamed from: f */
    public static final C20088a f54706f = new C20088a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f54707a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C20290a f54708b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C20072b f54709c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C20100q f54710d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List f54711e = C41341q.m119907j();

    /* renamed from: dt.p$a */
    public static final class C20088a {
        private C20088a() {
        }

        public /* synthetic */ C20088a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: dt.p$b */
    static final class C20089b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20087p f54712d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20089b(C20087p pVar) {
            super(1);
            this.f54712d = pVar;
        }

        /* renamed from: a */
        public final C20575a invoke(TransactionCategoryAddResponse transactionCategoryAddResponse) {
            C41536l.m120489i(transactionCategoryAddResponse, "it");
            return this.f54712d.f54708b.mo48770a(transactionCategoryAddResponse);
        }
    }

    /* renamed from: dt.p$c */
    static final class C20090c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20087p f54713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20090c(C20087p pVar) {
            super(1);
            this.f54713d = pVar;
        }

        /* renamed from: a */
        public final C20575a invoke(TransactionCategoryAddResponse transactionCategoryAddResponse) {
            C41536l.m120489i(transactionCategoryAddResponse, "it");
            return this.f54713d.f54708b.mo48770a(transactionCategoryAddResponse);
        }
    }

    /* renamed from: dt.p$d */
    static final class C20091d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20087p f54714d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20091d(C20087p pVar) {
            super(1);
            this.f54714d = pVar;
        }

        /* renamed from: a */
        public final void mo48485a(C20575a aVar) {
            this.f54714d.f54710d.mo48495b(C19909b.EDIT_CATEGORY);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48485a((C20575a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: dt.p$e */
    static final class C20092e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C20092e f54715d = new C20092e();

        C20092e() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "list");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ClientCurrencyApiEntity clientCurrencyApiEntity = (ClientCurrencyApiEntity) it.next();
                arrayList.add(new C27638p(clientCurrencyApiEntity.getCCY(), clientCurrencyApiEntity.getOrderNo(), clientCurrencyApiEntity.getDictionaryValue()));
            }
            return arrayList;
        }
    }

    /* renamed from: dt.p$f */
    static final class C20093f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20087p f54716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20093f(C20087p pVar) {
            super(1);
            this.f54716d = pVar;
        }

        /* renamed from: a */
        public final void mo48487a(List list) {
            C20087p pVar = this.f54716d;
            C41536l.m120488h(list, "it");
            pVar.f54711e = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48487a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: dt.p$g */
    static final class C20094g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20087p f54717d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20094g(C20087p pVar) {
            super(1);
            this.f54717d = pVar;
        }

        /* renamed from: a */
        public final void mo48488a(TransactionCategoryResponse transactionCategoryResponse) {
            if (transactionCategoryResponse.getPfmData() != null) {
                C20072b t = this.f54717d.f54709c;
                C41536l.m120488h(transactionCategoryResponse, "it");
                t.mo48475b(transactionCategoryResponse);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48488a((TransactionCategoryResponse) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: dt.p$h */
    static final class C20095h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20087p f54718d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20095h(C20087p pVar) {
            super(1);
            this.f54718d = pVar;
        }

        /* renamed from: a */
        public final List invoke(TransactionCategoryResponse transactionCategoryResponse) {
            C41536l.m120489i(transactionCategoryResponse, "it");
            C20290a u = this.f54718d.f54708b;
            List<TransactionCategoryEntity> pfmData = transactionCategoryResponse.getPfmData();
            C41536l.m120486f(pfmData);
            return u.mo48772c(pfmData);
        }
    }

    /* renamed from: dt.p$i */
    static final class C20096i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C20096i f54719d = new C20096i();

        C20096i() {
            super(1);
        }

        /* renamed from: a */
        public final Long invoke(TransactionCategoryResponse transactionCategoryResponse) {
            Boolean bool;
            TransactionCategoryEntity transactionCategoryEntity;
            C41536l.m120489i(transactionCategoryResponse, "it");
            List<TransactionCategoryEntity> pfmData = transactionCategoryResponse.getPfmData();
            if (pfmData == null || (transactionCategoryEntity = (TransactionCategoryEntity) C41358y.m120010Z(pfmData, 0)) == null) {
                bool = null;
            } else {
                bool = transactionCategoryEntity.getCatIsbudgetizable();
            }
            if (bool != null) {
                return Long.valueOf(transactionCategoryResponse.getHashCode());
            }
            throw new RuntimeException();
        }
    }

    /* renamed from: dt.p$j */
    static final class C20097j extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C20097j f54720d = new C20097j();

        C20097j() {
            super(1);
        }

        /* renamed from: a */
        public final Long invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            return -1L;
        }
    }

    /* renamed from: dt.p$k */
    static final class C20098k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20087p f54721d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20098k(C20087p pVar) {
            super(1);
            this.f54721d = pVar;
        }

        public final C40735b0 invoke(Long l) {
            C41536l.m120489i(l, "it");
            return this.f54721d.m66003D(l.longValue());
        }
    }

    /* renamed from: dt.p$l */
    static final class C20099l extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C20099l f54722d = new C20099l();

        C20099l() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(TransactionCategoryResponse transactionCategoryResponse) {
            boolean z;
            C41536l.m120489i(transactionCategoryResponse, "it");
            if (transactionCategoryResponse.getPfmData() != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public C20087p(IRetrofitService iRetrofitService, C20290a aVar, C20072b bVar, C20100q qVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(bVar, "categoriesCache");
        C41536l.m120489i(qVar, "propertyUpdateEventPoster");
        this.f54707a = iRetrofitService;
        this.f54708b = aVar;
        this.f54709c = bVar;
        this.f54710d = qVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final void m66000A(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static final List m66001B(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final void m66002C(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final C40762x m66003D(long j) {
        C40762x<BankApiResponse<TransactionCategoryResponse>> transactionCategories = this.f54707a.getTransactionCategories("PFM_CATEGORIES_GET", j);
        C41536l.m120488h(transactionCategories, "service.getTransactionCa…CATEGORIES_GET, hashcode)");
        C40762x m = C19273c.m64722h(transactionCategories).mo95084m(new C20077f(new C20094g(this)));
        C41536l.m120488h(m, "private fun getRemoteCat…    }\n            }\n    }");
        return m;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static final void m66004E(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static final Long m66005F(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Long) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static final Long m66006G(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Long) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static final C40735b0 m66007H(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static final boolean m66008I(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static final List m66009J(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static final void m66010K(C20087p pVar) {
        C41536l.m120489i(pVar, "this$0");
        pVar.f54710d.mo48495b(C19909b.DELETE_CATEGORY);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static final void m66011L(C20087p pVar) {
        C41536l.m120489i(pVar, "this$0");
        pVar.f54710d.mo48495b(C19909b.EDIT_CATEGORY);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final C20575a m66030y(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C20575a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final C20575a m66031z(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C20575a) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40734b mo48477a(long j) {
        C40762x<BankApiResponse<Object>> removeTransactionCategory = this.f54707a.removeTransactionCategory("PFM_CATEGORIES_DELETE", Long.valueOf(j));
        C41536l.m120488h(removeTransactionCategory, "service.removeTransactio…FM_CATEGORIES_DELETE, id)");
        C40734b o = C19273c.m64720f(removeTransactionCategory).mo94902o(new C20074c(this));
        C41536l.m120488h(o, "service.removeTransactio…          )\n            }");
        return o;
    }

    /* renamed from: b */
    public C40762x mo48478b() {
        C40744k d = this.f54709c.mo48476c().mo94948d();
        C40762x A = d.mo94956r(new C20084m(C20096i.f54719d)).mo94958t(new C20085n(C20097j.f54720d)).mo94944A(C40762x.m118162z(-1L));
        C41536l.m120488h(A, "cachedCategories.map {\n …IfEmpty(Single.just(-1L))");
        C40762x K = C40744k.m117995e(A.mo95087r(new C20086o(new C20098k(this))).mo95074N(), d).mo94935q(new C20075d(C20099l.f54722d)).mo94936r().mo95062A(new C20076e(new C20095h(this))).mo95072K(C40640a.m117458b());
        C41536l.m120488h(K, "override fun getTransact…On(Schedulers.io())\n    }");
        return K;
    }

    /* renamed from: c */
    public C40762x mo48479c(String str, long j) {
        C41536l.m120489i(str, "name");
        C40762x<BankApiResponse<TransactionCategoryAddResponse>> addTransactionCategory = this.f54707a.addTransactionCategory("PFM_CATEGORIES_CREATE", str, Long.valueOf(j));
        C41536l.m120488h(addTransactionCategory, "service.addTransactionCa…REATE, name, parentCatId)");
        C40762x A = C19273c.m64722h(addTransactionCategory).mo95062A(new C20081j(new C20089b(this)));
        C41536l.m120488h(A, "override fun addTransact…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: d */
    public C40762x mo48480d(long j, long j2, String str) {
        C41536l.m120489i(str, "name");
        C40762x<BankApiResponse<TransactionCategoryAddResponse>> editTransactionCategory = this.f54707a.editTransactionCategory("PFM_CATEGORIES_UPDATE", str, Long.valueOf(j2), Long.valueOf(j));
        C41536l.m120488h(editTransactionCategory, "service.editTransactionC…E, name, parentCatId, id)");
        C40762x m = C19273c.m64722h(editTransactionCategory).mo95062A(new C20079h(new C20090c(this))).mo95084m(new C20080i(new C20091d(this)));
        C41536l.m120488h(m, "override fun editTransac…    )\n            }\n    }");
        return m;
    }

    /* renamed from: e */
    public C40734b mo48481e(long j, long j2, Long l) {
        C40762x<BankApiResponse<Object>> transactionData = this.f54707a.transactionData(BankApi.SERVICE_PFM_TRANSACTION_DATA, Long.valueOf(j), Long.valueOf(j2), l);
        C41536l.m120488h(transactionData, "service.transactionData(…Id, catId, operationDate)");
        C40734b o = C19273c.m64720f(transactionData).mo94902o(new C20078g(this));
        C41536l.m120488h(o, "service.transactionData(…          )\n            }");
        return o;
    }

    /* renamed from: f */
    public C40762x mo48482f() {
        if (!this.f54711e.isEmpty()) {
            C40762x z = C40762x.m118162z(this.f54711e);
            C41536l.m120488h(z, "{\n            Single.jus…ientCurrencies)\n        }");
            return z;
        }
        C40762x<BankApiResponse<List<ClientCurrencyApiEntity>>> clientCurencies = this.f54707a.getClientCurencies("COMMON_GET_CLIENT_CCYS");
        C41536l.m120488h(clientCurencies, "service.getClientCurencies(COMMON_GET_CLIENT_CCYS)");
        C40762x m = C19273c.m64722h(clientCurencies).mo95062A(new C20082k(C20092e.f54715d)).mo95084m(new C20083l(new C20093f(this)));
        C41536l.m120488h(m, "override fun getClientCu…        }\n        }\n    }");
        return m;
    }
}
