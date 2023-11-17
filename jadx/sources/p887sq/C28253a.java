package p887sq;

import ed1.C40734b;
import ed1.C40762x;
import java.util.HashMap;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p909uq.C28925a;

/* renamed from: sq.a */
public final class C28253a implements C28925a {

    /* renamed from: b */
    public static final C28254a f71707b = new C28254a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f71708a;

    /* renamed from: sq.a$a */
    public static final class C28254a {
        private C28254a() {
        }

        public /* synthetic */ C28254a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C28253a(IRetrofitService iRetrofitService) {
        C41536l.m120489i(iRetrofitService, "service");
        this.f71708a = iRetrofitService;
    }

    /* renamed from: a */
    public C40734b mo67811a(String str, String str2) {
        C41536l.m120489i(str, "cardPan");
        C41536l.m120489i(str2, "lastFour");
        C40762x<BankApiResponse<Object>> validateCardLastDigits = this.f71708a.validateCardLastDigits("CARDS_VALIDATE_CARD_LAST4", str, str2);
        C41536l.m120488h(validateCardLastDigits, "service.validateCardLast…       lastFour\n        )");
        return C19273c.m64720f(validateCardLastDigits);
    }

    /* renamed from: b */
    public C40734b mo67812b(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x<BankApiResponse<Object>> useOtpForActionSinglePost = this.f71708a.useOtpForActionSinglePost(hashMap);
        C41536l.m120488h(useOtpForActionSinglePost, "service.useOtpForActionSinglePost(params)");
        return C19273c.m64720f(useOtpForActionSinglePost);
    }
}
