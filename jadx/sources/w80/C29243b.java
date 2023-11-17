package w80;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import y80.C29954a;

/* renamed from: w80.b */
public final class C29243b {

    /* renamed from: a */
    private final C29954a f74310a;

    public C29243b(C29954a aVar) {
        C41536l.m120489i(aVar, "clApplicationRepository");
        this.f74310a = aVar;
    }

    /* renamed from: a */
    public final C40762x mo69088a(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        C41536l.m120489i(str, "applicationType");
        C41536l.m120489i(str2, "product");
        C41536l.m120489i(str3, "subProduct");
        C41536l.m120489i(str4, "loanAmount");
        C41536l.m120489i(str5, "term");
        String str8 = str6;
        C41536l.m120489i(str8, "loanCurrency");
        String str9 = str7;
        C41536l.m120489i(str9, "approveForRSCustomerInfoDocument");
        return this.f74310a.mo48965a(str, str2, str3, str4, str5, str8, z, str9);
    }
}
