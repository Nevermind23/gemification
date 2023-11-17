package d81;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel;

/* renamed from: d81.a */
public final class C31549a {

    /* renamed from: a */
    private final String f78104a;

    /* renamed from: b */
    private final String f78105b;

    /* renamed from: c */
    private final String f78106c;

    /* renamed from: d */
    private final ConsumerLoanDetailsViewModel.C20943b f78107d;

    public C31549a(String str, String str2, String str3, ConsumerLoanDetailsViewModel.C20943b bVar) {
        C41536l.m120489i(bVar, "confirmationRequest");
        this.f78104a = str;
        this.f78105b = str2;
        this.f78106c = str3;
        this.f78107d = bVar;
    }

    /* renamed from: a */
    public final ConsumerLoanDetailsViewModel.C20943b mo71952a() {
        return this.f78107d;
    }

    /* renamed from: b */
    public final String mo71953b() {
        return this.f78104a;
    }

    /* renamed from: c */
    public final String mo71954c() {
        return this.f78105b;
    }

    /* renamed from: d */
    public final String mo71955d() {
        return this.f78106c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31549a)) {
            return false;
        }
        C31549a aVar = (C31549a) obj;
        return C41536l.m120484d(this.f78104a, aVar.f78104a) && C41536l.m120484d(this.f78105b, aVar.f78105b) && C41536l.m120484d(this.f78106c, aVar.f78106c) && this.f78107d == aVar.f78107d;
    }

    public int hashCode() {
        String str = this.f78104a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f78105b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f78106c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f78107d.hashCode();
    }

    public String toString() {
        String str = this.f78104a;
        String str2 = this.f78105b;
        String str3 = this.f78106c;
        ConsumerLoanDetailsViewModel.C20943b bVar = this.f78107d;
        return "OTPResult(operationId=" + str + ", operationReference=" + str2 + ", scaAuthCode=" + str3 + ", confirmationRequest=" + bVar + ")";
    }
}
