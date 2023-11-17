package lx0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: lx0.g */
public final class C37182g {

    /* renamed from: a */
    private final BigDecimal f89555a;

    /* renamed from: b */
    private final String f89556b;

    /* renamed from: c */
    private final String f89557c;

    public C37182g(BigDecimal bigDecimal, String str, String str2) {
        this.f89555a = bigDecimal;
        this.f89556b = str;
        this.f89557c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37182g)) {
            return false;
        }
        C37182g gVar = (C37182g) obj;
        return C41536l.m120484d(this.f89555a, gVar.f89555a) && C41536l.m120484d(this.f89556b, gVar.f89556b) && C41536l.m120484d(this.f89557c, gVar.f89557c);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.f89555a;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.f89556b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f89557c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f89555a;
        String str = this.f89556b;
        String str2 = this.f89557c;
        return "Prize(amount=" + bigDecimal + ", ccy=" + str + ", campaignCode=" + str2 + ")";
    }
}
