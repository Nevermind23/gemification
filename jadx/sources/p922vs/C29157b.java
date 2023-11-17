package p922vs;

import ed1.C40762x;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.pfm.analysis.entity.AnalysisApiEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p903tv.C28517a;
import p914uv.C28945a;
import p933ws.C29569a;
import ue1.C43075l;

/* renamed from: vs.b */
public final class C29157b implements C28945a {

    /* renamed from: c */
    public static final C29158a f74174c = new C29158a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f74175a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C29569a f74176b;

    /* renamed from: vs.b$a */
    public static final class C29158a {
        private C29158a() {
        }

        public /* synthetic */ C29158a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: vs.b$b */
    static final class C29159b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29157b f74177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29159b(C29157b bVar) {
            super(1);
            this.f74177d = bVar;
        }

        /* renamed from: a */
        public final C28517a invoke(AnalysisApiEntity analysisApiEntity) {
            C41536l.m120489i(analysisApiEntity, "it");
            return this.f74177d.f74176b.mo69416b(analysisApiEntity);
        }
    }

    public C29157b(IRetrofitService iRetrofitService, C29569a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f74175a = iRetrofitService;
        this.f74176b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C28517a m89087d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28517a) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo68798a(String str, String str2, ArrayList arrayList) {
        String str3;
        C41536l.m120489i(str, "fromDate");
        C41536l.m120489i(str2, "toDate");
        if (arrayList != null) {
            str3 = C41358y.m120017g0(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
        } else {
            str3 = null;
        }
        C40762x<BankApiResponse<AnalysisApiEntity>> analysis = this.f74175a.getAnalysis("PFM_FINANCIAL_ANALYSIS_CONSOLIDATED", str, str2, str3);
        C41536l.m120488h(analysis, "service.getAnalysis(PFM_…, commaSeparatedAccounts)");
        C40762x A = C19273c.m64722h(analysis).mo95062A(new C29156a(new C29159b(this)));
        C41536l.m120488h(A, "override fun getAnalysis…per.transform(it) }\n    }");
        return A;
    }
}
