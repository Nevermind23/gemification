package xe0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: xe0.r */
public final class C29760r {

    /* renamed from: a */
    private final String f75272a;

    /* renamed from: b */
    private final String f75273b;

    /* renamed from: c */
    private final String f75274c;

    /* renamed from: d */
    private final String f75275d;

    /* renamed from: e */
    private final BigDecimal f75276e;

    /* renamed from: f */
    private final String f75277f;

    /* renamed from: g */
    private C29759q f75278g;

    public C29760r(String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, C29759q qVar) {
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(str3, "securityName");
        C41536l.m120489i(str4, "price");
        C41536l.m120489i(bigDecimal, "pctChange");
        C41536l.m120489i(qVar, "state");
        this.f75272a = str;
        this.f75273b = str2;
        this.f75274c = str3;
        this.f75275d = str4;
        this.f75276e = bigDecimal;
        this.f75277f = str5;
        this.f75278g = qVar;
    }

    /* renamed from: a */
    public final String mo69877a() {
        return this.f75277f;
    }

    /* renamed from: b */
    public final BigDecimal mo69878b() {
        return this.f75276e;
    }

    /* renamed from: c */
    public final String mo69879c() {
        return this.f75275d;
    }

    /* renamed from: d */
    public final String mo69880d() {
        return this.f75274c;
    }

    /* renamed from: e */
    public final C29759q mo69881e() {
        return this.f75278g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29760r)) {
            return false;
        }
        C29760r rVar = (C29760r) obj;
        return C41536l.m120484d(this.f75272a, rVar.f75272a) && C41536l.m120484d(this.f75273b, rVar.f75273b) && C41536l.m120484d(this.f75274c, rVar.f75274c) && C41536l.m120484d(this.f75275d, rVar.f75275d) && C41536l.m120484d(this.f75276e, rVar.f75276e) && C41536l.m120484d(this.f75277f, rVar.f75277f) && this.f75278g == rVar.f75278g;
    }

    /* renamed from: f */
    public final String mo69883f() {
        return this.f75272a;
    }

    /* renamed from: g */
    public final void mo69884g(C29759q qVar) {
        C41536l.m120489i(qVar, "<set-?>");
        this.f75278g = qVar;
    }

    public int hashCode() {
        int hashCode = this.f75272a.hashCode() * 31;
        String str = this.f75273b;
        int i = 0;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f75274c.hashCode()) * 31) + this.f75275d.hashCode()) * 31) + this.f75276e.hashCode()) * 31;
        String str2 = this.f75277f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f75278g.hashCode();
    }

    public String toString() {
        String str = this.f75272a;
        String str2 = this.f75273b;
        String str3 = this.f75274c;
        String str4 = this.f75275d;
        BigDecimal bigDecimal = this.f75276e;
        String str5 = this.f75277f;
        C29759q qVar = this.f75278g;
        return "WatchListSymbol(symbol=" + str + ", symbolType=" + str2 + ", securityName=" + str3 + ", price=" + str4 + ", pctChange=" + bigDecimal + ", imageUrl=" + str5 + ", state=" + qVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29760r(String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, C29759q qVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, bigDecimal, str5, (i & 64) != 0 ? C29759q.TO_REMOVE : qVar);
    }
}
