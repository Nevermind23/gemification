package lx0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: lx0.b */
public final class C37177b {

    /* renamed from: a */
    private final BigDecimal f89529a;

    /* renamed from: b */
    private final BigDecimal f89530b;

    /* renamed from: c */
    private final String f89531c;

    /* renamed from: d */
    private final String f89532d;

    /* renamed from: e */
    private final String f89533e;

    /* renamed from: f */
    private final String f89534f;

    public C37177b(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, String str3, String str4) {
        C41536l.m120489i(bigDecimal, "commission");
        this.f89529a = bigDecimal;
        this.f89530b = bigDecimal2;
        this.f89531c = str;
        this.f89532d = str2;
        this.f89533e = str3;
        this.f89534f = str4;
    }

    /* renamed from: a */
    public final BigDecimal mo90174a() {
        return this.f89529a;
    }

    /* renamed from: b */
    public final String mo90175b() {
        return this.f89532d;
    }

    /* renamed from: c */
    public final String mo90176c() {
        return this.f89534f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37177b)) {
            return false;
        }
        C37177b bVar = (C37177b) obj;
        return C41536l.m120484d(this.f89529a, bVar.f89529a) && C41536l.m120484d(this.f89530b, bVar.f89530b) && C41536l.m120484d(this.f89531c, bVar.f89531c) && C41536l.m120484d(this.f89532d, bVar.f89532d) && C41536l.m120484d(this.f89533e, bVar.f89533e) && C41536l.m120484d(this.f89534f, bVar.f89534f);
    }

    public int hashCode() {
        int hashCode = this.f89529a.hashCode() * 31;
        BigDecimal bigDecimal = this.f89530b;
        int i = 0;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.f89531c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f89532d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f89533e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f89534f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f89529a;
        BigDecimal bigDecimal2 = this.f89530b;
        String str = this.f89531c;
        String str2 = this.f89532d;
        String str3 = this.f89533e;
        String str4 = this.f89534f;
        return "PaymentCommission(commission=" + bigDecimal + ", oldCommission=" + bigDecimal2 + ", limitType=" + str + ", infoDictionaryKey=" + str2 + ", clientsAmountIsOverLimit=" + str3 + ", randomString=" + str4 + ")";
    }
}
