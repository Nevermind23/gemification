package xy0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xy0.j */
public final class C39946j {

    /* renamed from: a */
    private final long f94805a;

    /* renamed from: b */
    private final BigDecimal f94806b;

    /* renamed from: c */
    private final BigDecimal f94807c;

    /* renamed from: d */
    private final BigDecimal f94808d;

    /* renamed from: e */
    private final String f94809e;

    /* renamed from: f */
    private final String f94810f;

    public C39946j(long j, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str, String str2) {
        this.f94805a = j;
        this.f94806b = bigDecimal;
        this.f94807c = bigDecimal2;
        this.f94808d = bigDecimal3;
        this.f94809e = str;
        this.f94810f = str2;
    }

    /* renamed from: a */
    public final long mo93720a() {
        return this.f94805a;
    }

    /* renamed from: b */
    public final BigDecimal mo93721b() {
        return this.f94806b;
    }

    /* renamed from: c */
    public final String mo93722c() {
        return this.f94810f;
    }

    /* renamed from: d */
    public final String mo93723d() {
        return this.f94809e;
    }

    /* renamed from: e */
    public final BigDecimal mo93724e() {
        return this.f94808d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39946j)) {
            return false;
        }
        C39946j jVar = (C39946j) obj;
        return this.f94805a == jVar.f94805a && C41536l.m120484d(this.f94806b, jVar.f94806b) && C41536l.m120484d(this.f94807c, jVar.f94807c) && C41536l.m120484d(this.f94808d, jVar.f94808d) && C41536l.m120484d(this.f94809e, jVar.f94809e) && C41536l.m120484d(this.f94810f, jVar.f94810f);
    }

    /* renamed from: f */
    public final BigDecimal mo93726f() {
        return this.f94807c;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f94805a) * 31;
        BigDecimal bigDecimal = this.f94806b;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f94807c;
        int hashCode2 = (hashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f94808d;
        int hashCode3 = (hashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str = this.f94809e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f94810f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        long j = this.f94805a;
        BigDecimal bigDecimal = this.f94806b;
        BigDecimal bigDecimal2 = this.f94807c;
        BigDecimal bigDecimal3 = this.f94808d;
        String str = this.f94809e;
        String str2 = this.f94810f;
        return "CreditCardDetail(acctKey=" + j + ", atmPercent=" + bigDecimal + ", posPercent=" + bigDecimal2 + ", overdraftLimit=" + bigDecimal3 + ", fileUrl=" + str + ", fileId=" + str2 + ")";
    }
}
