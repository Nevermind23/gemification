package g90;

import h00.C24846c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x80.C29658b;

/* renamed from: g90.a */
public final class C20779a {

    /* renamed from: a */
    private final C24846c f55986a;

    /* renamed from: b */
    private final String f55987b;

    /* renamed from: c */
    private final BigDecimal f55988c;

    /* renamed from: d */
    private final String f55989d;

    /* renamed from: e */
    private final List f55990e;

    public C20779a(C24846c cVar, String str, BigDecimal bigDecimal, String str2, List list) {
        C41536l.m120489i(list, "incomes");
        this.f55986a = cVar;
        this.f55987b = str;
        this.f55988c = bigDecimal;
        this.f55989d = str2;
        this.f55990e = list;
    }

    /* renamed from: a */
    public final List mo49322a() {
        return this.f55990e;
    }

    /* renamed from: b */
    public final BigDecimal mo49323b() {
        return this.f55988c;
    }

    /* renamed from: c */
    public final String mo49324c() {
        return this.f55989d;
    }

    /* renamed from: d */
    public final boolean mo49325d() {
        return !this.f55990e.isEmpty();
    }

    /* renamed from: e */
    public final C29658b mo49326e() {
        List<C20782d> list = this.f55990e;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (C20782d o : list) {
            arrayList.add(o.mo49351o());
        }
        return new C29658b(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20779a)) {
            return false;
        }
        C20779a aVar = (C20779a) obj;
        return this.f55986a == aVar.f55986a && C41536l.m120484d(this.f55987b, aVar.f55987b) && C41536l.m120484d(this.f55988c, aVar.f55988c) && C41536l.m120484d(this.f55989d, aVar.f55989d) && C41536l.m120484d(this.f55990e, aVar.f55990e);
    }

    public int hashCode() {
        C24846c cVar = this.f55986a;
        int i = 0;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        String str = this.f55987b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.f55988c;
        int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.f55989d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.f55990e.hashCode();
    }

    public String toString() {
        C24846c cVar = this.f55986a;
        String str = this.f55987b;
        BigDecimal bigDecimal = this.f55988c;
        String str2 = this.f55989d;
        List list = this.f55990e;
        return "ClientIncomesFormData(status=" + cVar + ", currency=" + str + ", loanAmount=" + bigDecimal + ", loanTerm=" + str2 + ", incomes=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20779a(C24846c cVar, String str, BigDecimal bigDecimal, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, str, bigDecimal, str2, (i & 16) != 0 ? new ArrayList() : list);
    }
}
