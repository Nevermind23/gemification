package p730cw;

import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.internal.C41536l;

/* renamed from: cw.a */
public final class C19805a {

    /* renamed from: a */
    private final Date f54179a;

    /* renamed from: b */
    private final BigDecimal f54180b;

    /* renamed from: c */
    private final BigDecimal f54181c;

    /* renamed from: d */
    private final String f54182d;

    /* renamed from: e */
    private final String f54183e;

    /* renamed from: f */
    private final String f54184f;

    public C19805a(Date date, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, String str3) {
        C41536l.m120489i(date, "date");
        C41536l.m120489i(bigDecimal, "totalIn");
        C41536l.m120489i(bigDecimal2, "totalOut");
        this.f54179a = date;
        this.f54180b = bigDecimal;
        this.f54181c = bigDecimal2;
        this.f54182d = str;
        this.f54183e = str2;
        this.f54184f = str3;
    }

    /* renamed from: a */
    public final String mo48093a() {
        return this.f54182d;
    }

    /* renamed from: b */
    public final Date mo48094b() {
        return this.f54179a;
    }

    /* renamed from: c */
    public final String mo48095c() {
        return this.f54184f;
    }

    /* renamed from: d */
    public final String mo48096d() {
        return this.f54183e;
    }

    /* renamed from: e */
    public final BigDecimal mo48097e() {
        return this.f54180b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19805a)) {
            return false;
        }
        C19805a aVar = (C19805a) obj;
        return C41536l.m120484d(this.f54179a, aVar.f54179a) && C41536l.m120484d(this.f54180b, aVar.f54180b) && C41536l.m120484d(this.f54181c, aVar.f54181c) && C41536l.m120484d(this.f54182d, aVar.f54182d) && C41536l.m120484d(this.f54183e, aVar.f54183e) && C41536l.m120484d(this.f54184f, aVar.f54184f);
    }

    /* renamed from: f */
    public final BigDecimal mo48099f() {
        return this.f54181c;
    }

    public int hashCode() {
        int hashCode = ((((this.f54179a.hashCode() * 31) + this.f54180b.hashCode()) * 31) + this.f54181c.hashCode()) * 31;
        String str = this.f54182d;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f54183e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f54184f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        Date date = this.f54179a;
        BigDecimal bigDecimal = this.f54180b;
        BigDecimal bigDecimal2 = this.f54181c;
        String str = this.f54182d;
        String str2 = this.f54183e;
        String str3 = this.f54184f;
        return "FinancialCalendarDay(date=" + date + ", totalIn=" + bigDecimal + ", totalOut=" + bigDecimal2 + ", backgroundColor=" + str + ", textColor=" + str2 + ", strokeColor=" + str3 + ")";
    }
}
