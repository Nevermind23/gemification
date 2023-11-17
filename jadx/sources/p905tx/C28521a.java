package p905tx;

import ed1.C40734b;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p927vx.C29182a;

/* renamed from: tx.a */
public final class C28521a implements C29182a {

    /* renamed from: b */
    public static final C28522a f72338b = new C28522a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f72339a;

    /* renamed from: tx.a$a */
    public static final class C28522a {
        private C28522a() {
        }

        public /* synthetic */ C28522a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C28521a(IRetrofitService iRetrofitService) {
        C41536l.m120489i(iRetrofitService, "service");
        this.f72339a = iRetrofitService;
    }

    /* renamed from: a */
    public C40734b mo68134a(String str, long j, String str2) {
        C41536l.m120489i(str, "productType");
        C41536l.m120489i(str2, "reversalReason");
        C40762x<BankApiResponse<Object>> reverseLoan = this.f72339a.reverseLoan("LOANS_REVERSE_LOAN", "REVERSE_LOAN", str, j, str2);
        C41536l.m120488h(reverseLoan, "service.reverseLoan(\n   … reversalReason\n        )");
        return C19273c.m64720f(reverseLoan);
    }
}
