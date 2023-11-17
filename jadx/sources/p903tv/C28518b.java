package p903tv;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: tv.b */
public final class C28518b {

    /* renamed from: a */
    private final List f72331a;

    /* renamed from: b */
    private final String f72332b;

    /* renamed from: c */
    private final long f72333c;

    /* renamed from: d */
    private final String f72334d;

    /* renamed from: e */
    private final BigDecimal f72335e;

    public C28518b(List list, String str, long j, String str2, BigDecimal bigDecimal) {
        C41536l.m120489i(str, "color");
        C41536l.m120489i(str2, "titleKey");
        C41536l.m120489i(bigDecimal, C11755a.C11756a.f34100b);
        this.f72331a = list;
        this.f72332b = str;
        this.f72333c = j;
        this.f72334d = str2;
        this.f72335e = bigDecimal;
    }

    /* renamed from: a */
    public final List mo68120a() {
        return this.f72331a;
    }

    /* renamed from: b */
    public final String mo68121b() {
        return this.f72332b;
    }

    /* renamed from: c */
    public final long mo68122c() {
        return this.f72333c;
    }

    /* renamed from: d */
    public final String mo68123d() {
        return this.f72334d;
    }

    /* renamed from: e */
    public final BigDecimal mo68124e() {
        return this.f72335e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28518b)) {
            return false;
        }
        C28518b bVar = (C28518b) obj;
        return C41536l.m120484d(this.f72331a, bVar.f72331a) && C41536l.m120484d(this.f72332b, bVar.f72332b) && this.f72333c == bVar.f72333c && C41536l.m120484d(this.f72334d, bVar.f72334d) && C41536l.m120484d(this.f72335e, bVar.f72335e);
    }

    public int hashCode() {
        List list = this.f72331a;
        return ((((((((list == null ? 0 : list.hashCode()) * 31) + this.f72332b.hashCode()) * 31) + C7397t.m28148a(this.f72333c)) * 31) + this.f72334d.hashCode()) * 31) + this.f72335e.hashCode();
    }

    public String toString() {
        List list = this.f72331a;
        String str = this.f72332b;
        long j = this.f72333c;
        String str2 = this.f72334d;
        BigDecimal bigDecimal = this.f72335e;
        return "AnalysisChild(children=" + list + ", color=" + str + ", id=" + j + ", titleKey=" + str2 + ", value=" + bigDecimal + ")";
    }
}
