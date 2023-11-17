package xy0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xy0.q */
public final class C39953q {

    /* renamed from: a */
    private final long f94882a;

    /* renamed from: b */
    private final C39951o f94883b;

    /* renamed from: c */
    private final C39962z f94884c;

    /* renamed from: d */
    private final C39957u f94885d;

    /* renamed from: e */
    private final C39955s f94886e;

    public C39953q(long j, C39951o oVar, C39962z zVar, C39957u uVar, C39955s sVar) {
        this.f94882a = j;
        this.f94883b = oVar;
        this.f94884c = zVar;
        this.f94885d = uVar;
        this.f94886e = sVar;
    }

    /* renamed from: a */
    public final C39955s mo93761a() {
        return this.f94886e;
    }

    /* renamed from: b */
    public final C39951o mo93762b() {
        return this.f94883b;
    }

    /* renamed from: c */
    public final long mo93763c() {
        return this.f94882a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39953q)) {
            return false;
        }
        C39953q qVar = (C39953q) obj;
        return this.f94882a == qVar.f94882a && C41536l.m120484d(this.f94883b, qVar.f94883b) && C41536l.m120484d(this.f94884c, qVar.f94884c) && C41536l.m120484d(this.f94885d, qVar.f94885d) && C41536l.m120484d(this.f94886e, qVar.f94886e);
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f94882a) * 31;
        C39951o oVar = this.f94883b;
        int i = 0;
        int hashCode = (a + (oVar == null ? 0 : oVar.hashCode())) * 31;
        C39962z zVar = this.f94884c;
        int hashCode2 = (hashCode + (zVar == null ? 0 : zVar.hashCode())) * 31;
        C39957u uVar = this.f94885d;
        int hashCode3 = (hashCode2 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        C39955s sVar = this.f94886e;
        if (sVar != null) {
            i = sVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        long j = this.f94882a;
        C39951o oVar = this.f94883b;
        C39962z zVar = this.f94884c;
        C39957u uVar = this.f94885d;
        C39955s sVar = this.f94886e;
        return "LoanDetails(loanKey=" + j + ", lndDetails=" + oVar + ", plnDetails=" + zVar + ", schedule=" + uVar + ", invoice=" + sVar + ")";
    }
}
