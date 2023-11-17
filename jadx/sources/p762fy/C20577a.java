package p762fy;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p786hy.C25079a;

/* renamed from: fy.a */
public final class C20577a implements C25079a {

    /* renamed from: b */
    public static final C20578a f55624b = new C20578a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f55625a;

    /* renamed from: fy.a$a */
    public static final class C20578a {
        private C20578a() {
        }

        public /* synthetic */ C20578a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C20577a(IRetrofitService iRetrofitService) {
        C41536l.m120489i(iRetrofitService, "service");
        this.f55625a = iRetrofitService;
    }

    /* renamed from: a */
    public C40734b mo49116a(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "applicationType");
        C41536l.m120489i(str2, "product");
        C41536l.m120489i(str3, "subProduct");
        C41536l.m120489i(str4, "loanAmount");
        C41536l.m120489i(str5, "loanCurrency");
        C40734b y = this.f55625a.sendLeadApplication("LOANS_PREPARE_IPO_APPLICATION_V2", str, str2, str3, str4, str5).mo95092y();
        C41536l.m120488h(y, "service.sendLeadApplicat…        ).ignoreElement()");
        return y;
    }
}
