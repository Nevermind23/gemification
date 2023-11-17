package iv0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: iv0.f */
public final class C36554f {

    /* renamed from: a */
    private final String f88093a;

    /* renamed from: b */
    private final String f88094b;

    /* renamed from: c */
    private final Double f88095c;

    /* renamed from: d */
    private final String f88096d;

    /* renamed from: e */
    private final String f88097e;

    /* renamed from: f */
    private final String f88098f;

    /* renamed from: g */
    private final String f88099g;

    /* renamed from: h */
    private final List f88100h;

    public C36554f(String str, String str2, Double d, String str3, String str4, String str5, String str6, List list) {
        C41536l.m120489i(str, "resourceId");
        C41536l.m120489i(str2, "iban");
        C41536l.m120489i(str3, "currency");
        C41536l.m120489i(str5, "cashAccountType");
        C41536l.m120489i(list, "balances");
        this.f88093a = str;
        this.f88094b = str2;
        this.f88095c = d;
        this.f88096d = str3;
        this.f88097e = str4;
        this.f88098f = str5;
        this.f88099g = str6;
        this.f88100h = list;
    }

    /* renamed from: a */
    public final Double mo89355a() {
        return this.f88095c;
    }

    /* renamed from: b */
    public final List mo89356b() {
        return this.f88100h;
    }

    /* renamed from: c */
    public final String mo89357c() {
        return this.f88096d;
    }

    /* renamed from: d */
    public final String mo89358d() {
        return this.f88094b;
    }

    /* renamed from: e */
    public final String mo89359e() {
        return this.f88099g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36554f)) {
            return false;
        }
        C36554f fVar = (C36554f) obj;
        return C41536l.m120484d(this.f88093a, fVar.f88093a) && C41536l.m120484d(this.f88094b, fVar.f88094b) && C41536l.m120484d(this.f88095c, fVar.f88095c) && C41536l.m120484d(this.f88096d, fVar.f88096d) && C41536l.m120484d(this.f88097e, fVar.f88097e) && C41536l.m120484d(this.f88098f, fVar.f88098f) && C41536l.m120484d(this.f88099g, fVar.f88099g) && C41536l.m120484d(this.f88100h, fVar.f88100h);
    }

    /* renamed from: f */
    public final String mo89361f() {
        return this.f88093a;
    }

    public int hashCode() {
        int hashCode = ((this.f88093a.hashCode() * 31) + this.f88094b.hashCode()) * 31;
        Double d = this.f88095c;
        int i = 0;
        int hashCode2 = (((hashCode + (d == null ? 0 : d.hashCode())) * 31) + this.f88096d.hashCode()) * 31;
        String str = this.f88097e;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f88098f.hashCode()) * 31;
        String str2 = this.f88099g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.f88100h.hashCode();
    }

    public String toString() {
        String str = this.f88093a;
        String str2 = this.f88094b;
        Double d = this.f88095c;
        String str3 = this.f88096d;
        String str4 = this.f88097e;
        String str5 = this.f88098f;
        String str6 = this.f88099g;
        List list = this.f88100h;
        return "OpenBankAccountRow(resourceId=" + str + ", iban=" + str2 + ", amount=" + d + ", currency=" + str3 + ", product=" + str4 + ", cashAccountType=" + str5 + ", name=" + str6 + ", balances=" + list + ")";
    }
}
