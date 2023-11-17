package xe0;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ShareStatus;

/* renamed from: xe0.l */
public final class C29754l {

    /* renamed from: a */
    private final String f75229a;

    /* renamed from: b */
    private final BigDecimal f75230b;

    /* renamed from: c */
    private final double f75231c;

    /* renamed from: d */
    private final String f75232d;

    /* renamed from: e */
    private final String f75233e;

    /* renamed from: f */
    private final C29747e f75234f;

    /* renamed from: g */
    private final ShareStatus f75235g;

    /* renamed from: h */
    private final C29755m f75236h;

    /* renamed from: i */
    private final List f75237i;

    /* renamed from: j */
    private final String f75238j;

    public C29754l(String str, BigDecimal bigDecimal, double d, String str2, String str3, C29747e eVar, ShareStatus shareStatus, C29755m mVar, List list, String str4) {
        C41536l.m120489i(str, "currency");
        C41536l.m120489i(bigDecimal, "profitRate");
        C41536l.m120489i(str2, "name");
        C41536l.m120489i(list, "shareWatchLists");
        this.f75229a = str;
        this.f75230b = bigDecimal;
        this.f75231c = d;
        this.f75232d = str2;
        this.f75233e = str3;
        this.f75234f = eVar;
        this.f75235g = shareStatus;
        this.f75236h = mVar;
        this.f75237i = list;
        this.f75238j = str4;
    }

    /* renamed from: a */
    public final String mo69826a() {
        return this.f75233e;
    }

    /* renamed from: b */
    public final C29747e mo69827b() {
        return this.f75234f;
    }

    /* renamed from: c */
    public final String mo69828c() {
        return this.f75229a;
    }

    /* renamed from: d */
    public final C29755m mo69829d() {
        return this.f75236h;
    }

    /* renamed from: e */
    public final String mo69830e() {
        return this.f75238j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29754l)) {
            return false;
        }
        C29754l lVar = (C29754l) obj;
        return C41536l.m120484d(this.f75229a, lVar.f75229a) && C41536l.m120484d(this.f75230b, lVar.f75230b) && Double.compare(this.f75231c, lVar.f75231c) == 0 && C41536l.m120484d(this.f75232d, lVar.f75232d) && C41536l.m120484d(this.f75233e, lVar.f75233e) && C41536l.m120484d(this.f75234f, lVar.f75234f) && this.f75235g == lVar.f75235g && C41536l.m120484d(this.f75236h, lVar.f75236h) && C41536l.m120484d(this.f75237i, lVar.f75237i) && C41536l.m120484d(this.f75238j, lVar.f75238j);
    }

    /* renamed from: f */
    public final double mo69832f() {
        return this.f75231c;
    }

    /* renamed from: g */
    public final String mo69833g() {
        return this.f75232d;
    }

    /* renamed from: h */
    public final BigDecimal mo69834h() {
        return this.f75230b;
    }

    public int hashCode() {
        int hashCode = ((((((this.f75229a.hashCode() * 31) + this.f75230b.hashCode()) * 31) + Double.doubleToLongBits(this.f75231c)) * 31) + this.f75232d.hashCode()) * 31;
        String str = this.f75233e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C29747e eVar = this.f75234f;
        int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        ShareStatus shareStatus = this.f75235g;
        int hashCode4 = (hashCode3 + (shareStatus == null ? 0 : shareStatus.hashCode())) * 31;
        C29755m mVar = this.f75236h;
        int hashCode5 = (((hashCode4 + (mVar == null ? 0 : mVar.hashCode())) * 31) + this.f75237i.hashCode()) * 31;
        String str2 = this.f75238j;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: i */
    public final List mo69836i() {
        return this.f75237i;
    }

    /* renamed from: j */
    public final ShareStatus mo69837j() {
        return this.f75235g;
    }

    public String toString() {
        String str = this.f75229a;
        BigDecimal bigDecimal = this.f75230b;
        double d = this.f75231c;
        String str2 = this.f75232d;
        String str3 = this.f75233e;
        C29747e eVar = this.f75234f;
        ShareStatus shareStatus = this.f75235g;
        C29755m mVar = this.f75236h;
        List list = this.f75237i;
        String str4 = this.f75238j;
        return "ShareSummery(currency=" + str + ", profitRate=" + bigDecimal + ", mktPrice=" + d + ", name=" + str2 + ", about=" + str3 + ", clientPosition=" + eVar + ", status=" + shareStatus + ", fundamentals=" + mVar + ", shareWatchLists=" + list + ", imageUrl=" + str4 + ")";
    }
}
