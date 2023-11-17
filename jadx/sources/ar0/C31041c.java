package ar0;

import ed1.C40734b;
import ed1.C40762x;
import er0.C31768a;
import fr0.C31999a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.loanoffers.data.entity.securedloans.ExternalLoanPropertyEntity;
import p341ge.bog.mobilebank.loanoffers.data.entity.securedloans.LoanPropertyEntity;
import ue1.C43075l;
import yq0.C40046a;
import zq0.C40243a;

/* renamed from: ar0.c */
public final class C31041c implements C31999a {

    /* renamed from: a */
    private final C40046a f77220a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C40243a f77221b;

    /* renamed from: ar0.c$a */
    static final class C31042a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31041c f77222d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31042a(C31041c cVar) {
            super(1);
            this.f77222d = cVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            C40243a f = this.f77222d.f77221b;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f.mo94195b((LoanPropertyEntity) it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: ar0.c$b */
    /* synthetic */ class C31043b extends C41535k implements C43075l {
        C31043b(Object obj) {
            super(1, obj, C40243a.class, "transform", "transform(Lge/bog/mobilebank/loanoffers/data/entity/securedloans/ExternalLoanPropertyEntity;)Lge/bog/mobilebank/loanoffers/domain/model/securedloans/ExternalLoanProperty;", 0);
        }

        /* renamed from: b */
        public final C31768a invoke(ExternalLoanPropertyEntity externalLoanPropertyEntity) {
            C41536l.m120489i(externalLoanPropertyEntity, "p0");
            return ((C40243a) this.receiver).mo94194a(externalLoanPropertyEntity);
        }
    }

    public C31041c(C40046a aVar, C40243a aVar2) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "mapper");
        this.f77220a = aVar;
        this.f77221b = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final List m92430g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final C31768a m92431h(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C31768a) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo71235a(String str) {
        C41536l.m120489i(str, "cadastreCode");
        C40762x A = this.f77220a.mo93919a(str).mo95062A(new C31040b(new C31043b(this.f77221b)));
        C41536l.m120488h(A, "service.getLoanExternalP…e).map(mapper::transform)");
        return A;
    }

    /* renamed from: b */
    public C40762x mo71236b() {
        C40762x A = this.f77220a.mo93920b().mo95062A(new C31039a(new C31042a(this)));
        C41536l.m120488h(A, "override fun getClientLo….map(mapper::transform) }");
        return A;
    }

    /* renamed from: c */
    public C40734b mo71237c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str, "applicationType");
        C41536l.m120489i(str2, "product");
        C41536l.m120489i(str3, "subProduct");
        C41536l.m120489i(str4, "loanAmount");
        C41536l.m120489i(str5, "loanCurrency");
        C41536l.m120489i(str6, "collateralInfo");
        return this.f77220a.mo93921c(str, str2, str3, str4, str5, str6, str7);
    }
}
