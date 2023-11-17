package p850ot;

import ed1.C40734b;
import ed1.C40762x;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.savinggoal.entity.DepositPurposeResponse;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p860pt.C27620a;
import p937ww.C29583a;
import ue1.C43075l;

/* renamed from: ot.b */
public final class C27079b implements C29583a {

    /* renamed from: c */
    public static final C27080a f68015c = new C27080a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f68016a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C27620a f68017b;

    /* renamed from: ot.b$a */
    public static final class C27080a {
        private C27080a() {
        }

        public /* synthetic */ C27080a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ot.b$b */
    static final class C27081b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27079b f68018d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27081b(C27079b bVar) {
            super(1);
            this.f68018d = bVar;
        }

        /* renamed from: a */
        public final List invoke(DepositPurposeResponse depositPurposeResponse) {
            C41536l.m120489i(depositPurposeResponse, "it");
            return this.f68018d.f68017b.mo66992a(depositPurposeResponse.getPurposes());
        }
    }

    public C27079b(IRetrofitService iRetrofitService, C27620a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f68016a = iRetrofitService;
        this.f68017b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final List m83943e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: B */
    public C40762x mo66329B(String str) {
        C40762x<BankApiResponse<DepositPurposeResponse>> depositPurposesNew = this.f68016a.getDepositPurposesNew("DEPOSITS_APPLICATIONS_GET_DEPOSIT_PURPOSES_WITH_ID", str);
        C41536l.m120488h(depositPurposesNew, "service.getDepositPurpos…POSIT_PURPOSES, prodType)");
        C40762x A = C19273c.m64722h(depositPurposesNew).mo95062A(new C27078a(new C27081b(this)));
        C41536l.m120488h(A, "override fun getDepositP…form(it.purposes) }\n    }");
        return A;
    }

    /* renamed from: M */
    public C40734b mo66330M(Long l) {
        C40762x<BankApiResponse<Object>> deleteSavingGoal = this.f68016a.deleteSavingGoal("PFM_SAVING_GOAL_DELETE", l);
        C41536l.m120488h(deleteSavingGoal, "service.deleteSavingGoal(SAVING_GOAL_DELETE, id)");
        return C19273c.m64720f(deleteSavingGoal);
    }

    /* renamed from: a */
    public C40734b mo66331a(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, Long l, Long l2, long j) {
        C40762x<BankApiResponse<Object>> createSavingGoal = this.f68016a.createSavingGoal("PFM_SAVING_GOAL_CREATE", str, bigDecimal, bigDecimal2, str2, str3, l, l2, Long.valueOf(j));
        C41536l.m120488h(createSavingGoal, "service.createSavingGoal…       agreeKey\n        )");
        return C19273c.m64720f(createSavingGoal);
    }

    /* renamed from: b */
    public C40734b mo66332b(Long l, String str, BigDecimal bigDecimal, String str2, String str3, Long l2, Long l3, long j) {
        C40762x<BankApiResponse<Object>> editSavingGoal = this.f68016a.editSavingGoal("PFM_SAVING_GOAL_UPDATE", l, str, bigDecimal, str2, str3, l2, l3, Long.valueOf(j));
        C41536l.m120488h(editSavingGoal, "service.editSavingGoal(\n…       agreeKey\n        )");
        return C19273c.m64720f(editSavingGoal);
    }
}
