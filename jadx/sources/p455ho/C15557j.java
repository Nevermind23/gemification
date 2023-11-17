package p455ho;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: ho.j */
public final class C15557j {

    /* renamed from: a */
    private final BigDecimal f44184a;

    /* renamed from: b */
    private final Long f44185b;

    /* renamed from: c */
    private final BigDecimal f44186c;

    /* renamed from: d */
    private final Long f44187d;

    public C15557j(BigDecimal bigDecimal, Long l, BigDecimal bigDecimal2, Long l2) {
        this.f44184a = bigDecimal;
        this.f44185b = l;
        this.f44186c = bigDecimal2;
        this.f44187d = l2;
    }

    /* renamed from: a */
    public final BigDecimal mo42767a() {
        return this.f44184a;
    }

    /* renamed from: b */
    public final Long mo42768b() {
        return this.f44185b;
    }

    /* renamed from: c */
    public final BigDecimal mo42769c() {
        return this.f44186c;
    }

    /* renamed from: d */
    public final Long mo42770d() {
        return this.f44187d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15557j)) {
            return false;
        }
        C15557j jVar = (C15557j) obj;
        return C41536l.m120484d(this.f44184a, jVar.f44184a) && C41536l.m120484d(this.f44185b, jVar.f44185b) && C41536l.m120484d(this.f44186c, jVar.f44186c) && C41536l.m120484d(this.f44187d, jVar.f44187d);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.f44184a;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        Long l = this.f44185b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f44186c;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Long l2 = this.f44187d;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f44184a;
        Long l = this.f44185b;
        BigDecimal bigDecimal2 = this.f44186c;
        Long l2 = this.f44187d;
        return "PackageLimit(initialLimitAmount=" + bigDecimal + ", initialLimitCount=" + l + ", limitAmount=" + bigDecimal2 + ", limitCount=" + l2 + ")";
    }
}
