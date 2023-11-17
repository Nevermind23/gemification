package xh0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: xh0.n */
public final class C29798n {

    /* renamed from: a */
    private final List f75452a;

    /* renamed from: b */
    private final Integer f75453b;

    /* renamed from: c */
    private final String f75454c;

    public C29798n(List list, Integer num, String str) {
        this.f75452a = list;
        this.f75453b = num;
        this.f75454c = str;
    }

    /* renamed from: a */
    public final List mo70038a() {
        return this.f75452a;
    }

    /* renamed from: b */
    public final Integer mo70039b() {
        return this.f75453b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29798n)) {
            return false;
        }
        C29798n nVar = (C29798n) obj;
        return C41536l.m120484d(this.f75452a, nVar.f75452a) && C41536l.m120484d(this.f75453b, nVar.f75453b) && C41536l.m120484d(this.f75454c, nVar.f75454c);
    }

    public int hashCode() {
        List list = this.f75452a;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f75453b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f75454c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        List list = this.f75452a;
        Integer num = this.f75453b;
        String str = this.f75454c;
        return "OfferBudget(fixedAmounts=" + list + ", maxCapAmount=" + num + ", maxCapCcy=" + str + ")";
    }
}
