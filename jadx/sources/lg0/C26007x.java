package lg0;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: lg0.x */
public final class C26007x {

    /* renamed from: a */
    private final String f66075a;

    /* renamed from: b */
    private final List f66076b;

    /* renamed from: c */
    private final BigDecimal f66077c;

    /* renamed from: d */
    private final String f66078d;

    public C26007x(String str, List list, BigDecimal bigDecimal, String str2) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(list, "amountData");
        C41536l.m120489i(bigDecimal, "profitRate");
        this.f66075a = str;
        this.f66076b = list;
        this.f66077c = bigDecimal;
        this.f66078d = str2;
    }

    /* renamed from: a */
    public final List mo64892a() {
        return this.f66076b;
    }

    /* renamed from: b */
    public final String mo64893b() {
        return this.f66078d;
    }

    /* renamed from: c */
    public final String mo64894c() {
        return this.f66075a;
    }

    /* renamed from: d */
    public final BigDecimal mo64895d() {
        return this.f66077c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26007x)) {
            return false;
        }
        C26007x xVar = (C26007x) obj;
        return C41536l.m120484d(this.f66075a, xVar.f66075a) && C41536l.m120484d(this.f66076b, xVar.f66076b) && C41536l.m120484d(this.f66077c, xVar.f66077c) && C41536l.m120484d(this.f66078d, xVar.f66078d);
    }

    public int hashCode() {
        int hashCode = ((((this.f66075a.hashCode() * 31) + this.f66076b.hashCode()) * 31) + this.f66077c.hashCode()) * 31;
        String str = this.f66078d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f66075a;
        List list = this.f66076b;
        BigDecimal bigDecimal = this.f66077c;
        String str2 = this.f66078d;
        return "GTShareHeaderDataUiModel(name=" + str + ", amountData=" + list + ", profitRate=" + bigDecimal + ", imageUrl=" + str2 + ")";
    }
}
