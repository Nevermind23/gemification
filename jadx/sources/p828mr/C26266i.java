package p828mr;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.model.otpparameter.ProcessLoanRegistrationParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

/* renamed from: mr.i */
public final class C26266i {

    /* renamed from: a */
    private final String f66595a;

    /* renamed from: b */
    private final String f66596b;

    /* renamed from: c */
    private final String f66597c;

    /* renamed from: d */
    private final String f66598d;

    /* renamed from: e */
    private final String f66599e;

    /* renamed from: f */
    private final ProcessLoanRegistrationParams f66600f;

    public C26266i(String str, String str2, String str3, String str4, String str5, ProcessLoanRegistrationParams processLoanRegistrationParams) {
        C41536l.m120489i(str, IRetrofitService.TERMINAL);
        C41536l.m120489i(str2, "limitId");
        C41536l.m120489i(str3, "decNo");
        C41536l.m120489i(str4, "decisionScheme");
        C41536l.m120489i(str5, "cardPan");
        C41536l.m120489i(processLoanRegistrationParams, "params");
        this.f66595a = str;
        this.f66596b = str2;
        this.f66597c = str3;
        this.f66598d = str4;
        this.f66599e = str5;
        this.f66600f = processLoanRegistrationParams;
    }

    /* renamed from: a */
    public final ProcessLoanRegistrationParams mo65423a() {
        return this.f66600f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26266i)) {
            return false;
        }
        C26266i iVar = (C26266i) obj;
        return C41536l.m120484d(this.f66595a, iVar.f66595a) && C41536l.m120484d(this.f66596b, iVar.f66596b) && C41536l.m120484d(this.f66597c, iVar.f66597c) && C41536l.m120484d(this.f66598d, iVar.f66598d) && C41536l.m120484d(this.f66599e, iVar.f66599e) && C41536l.m120484d(this.f66600f, iVar.f66600f);
    }

    public int hashCode() {
        return (((((((((this.f66595a.hashCode() * 31) + this.f66596b.hashCode()) * 31) + this.f66597c.hashCode()) * 31) + this.f66598d.hashCode()) * 31) + this.f66599e.hashCode()) * 31) + this.f66600f.hashCode();
    }

    public String toString() {
        String str = this.f66595a;
        String str2 = this.f66596b;
        String str3 = this.f66597c;
        String str4 = this.f66598d;
        String str5 = this.f66599e;
        ProcessLoanRegistrationParams processLoanRegistrationParams = this.f66600f;
        return "RegisterLoanOptions(terminal=" + str + ", limitId=" + str2 + ", decNo=" + str3 + ", decisionScheme=" + str4 + ", cardPan=" + str5 + ", params=" + processLoanRegistrationParams + ")";
    }
}
