package l50;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: l50.q */
public final class C25837q {

    /* renamed from: a */
    private final long f65736a;

    /* renamed from: b */
    private final BigDecimal f65737b;

    /* renamed from: c */
    private final String f65738c;

    /* renamed from: d */
    private final String f65739d;

    /* renamed from: e */
    private final boolean f65740e;

    /* renamed from: f */
    private final C25829i f65741f;

    public C25837q(long j, BigDecimal bigDecimal, String str, String str2, boolean z, C25829i iVar) {
        C41536l.m120489i(str, "realAmountFormated");
        C41536l.m120489i(str2, "ccy");
        this.f65736a = j;
        this.f65737b = bigDecimal;
        this.f65738c = str;
        this.f65739d = str2;
        this.f65740e = z;
        this.f65741f = iVar;
    }

    /* renamed from: a */
    public final long mo64565a() {
        return this.f65736a;
    }

    /* renamed from: b */
    public final String mo64566b() {
        return this.f65739d;
    }

    /* renamed from: c */
    public final boolean mo64567c() {
        return this.f65740e;
    }

    /* renamed from: d */
    public final C25829i mo64568d() {
        return this.f65741f;
    }

    /* renamed from: e */
    public final BigDecimal mo64569e() {
        return this.f65737b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25837q)) {
            return false;
        }
        C25837q qVar = (C25837q) obj;
        return this.f65736a == qVar.f65736a && C41536l.m120484d(this.f65737b, qVar.f65737b) && C41536l.m120484d(this.f65738c, qVar.f65738c) && C41536l.m120484d(this.f65739d, qVar.f65739d) && this.f65740e == qVar.f65740e && C41536l.m120484d(this.f65741f, qVar.f65741f);
    }

    /* renamed from: f */
    public final String mo64571f() {
        return this.f65738c;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f65736a) * 31;
        BigDecimal bigDecimal = this.f65737b;
        int i = 0;
        int hashCode = (((((a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.f65738c.hashCode()) * 31) + this.f65739d.hashCode()) * 31;
        boolean z = this.f65740e;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        C25829i iVar = this.f65741f;
        if (iVar != null) {
            i = iVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        long j = this.f65736a;
        BigDecimal bigDecimal = this.f65737b;
        String str = this.f65738c;
        String str2 = this.f65739d;
        boolean z = this.f65740e;
        C25829i iVar = this.f65741f;
        return "AccountsWithCardsSubAccountUIModel(acctKey=" + j + ", realAmount=" + bigDecimal + ", realAmountFormated=" + str + ", ccy=" + str2 + ", hasOverdraft=" + z + ", overdraftParam=" + iVar + ")";
    }
}
