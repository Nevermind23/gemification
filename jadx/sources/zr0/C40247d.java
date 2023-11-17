package zr0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: zr0.d */
public final class C40247d {

    /* renamed from: a */
    private final BigDecimal f95633a;

    /* renamed from: b */
    private final String f95634b;

    /* renamed from: c */
    private final String f95635c;

    public C40247d(BigDecimal bigDecimal, String str, String str2) {
        C41536l.m120489i(bigDecimal, "amount");
        this.f95633a = bigDecimal;
        this.f95634b = str;
        this.f95635c = str2;
    }

    /* renamed from: a */
    public final BigDecimal mo94196a() {
        return this.f95633a;
    }

    /* renamed from: b */
    public final String mo94197b() {
        return this.f95635c;
    }

    /* renamed from: c */
    public final String mo94198c() {
        return this.f95634b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40247d)) {
            return false;
        }
        C40247d dVar = (C40247d) obj;
        return C41536l.m120484d(this.f95633a, dVar.f95633a) && C41536l.m120484d(this.f95634b, dVar.f95634b) && C41536l.m120484d(this.f95635c, dVar.f95635c);
    }

    public int hashCode() {
        int hashCode = this.f95633a.hashCode() * 31;
        String str = this.f95634b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95635c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f95633a;
        String str = this.f95634b;
        String str2 = this.f95635c;
        return "ScheduleModel(amount=" + bigDecimal + ", text=" + str + ", ccy=" + str2 + ")";
    }
}
