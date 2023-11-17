package p777gz;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: gz.a */
public final class C24838a {

    /* renamed from: a */
    private final double f63753a;

    /* renamed from: b */
    private final String f63754b;

    /* renamed from: c */
    private final Double f63755c;

    /* renamed from: d */
    private final String f63756d;

    /* renamed from: e */
    private final String f63757e;

    /* renamed from: f */
    private final Integer f63758f;

    /* renamed from: g */
    private final List f63759g;

    /* renamed from: h */
    private final Object f63760h;

    /* renamed from: i */
    private final String f63761i;

    /* renamed from: j */
    private final List f63762j;

    /* renamed from: k */
    private final String f63763k;

    /* renamed from: l */
    private final String f63764l;

    public C24838a(double d, String str, Double d2, String str2, String str3, Integer num, List list, Object obj, String str4, List list2, String str5, String str6) {
        C41536l.m120489i(str, "senderName");
        C41536l.m120489i(str2, "receiverName");
        C41536l.m120489i(str3, "currency");
        C41536l.m120489i(list, "countries");
        C41536l.m120489i(str4, "sendCountry");
        C41536l.m120489i(list2, "senders");
        C41536l.m120489i(str5, "transferNumber");
        this.f63753a = d;
        this.f63754b = str;
        this.f63755c = d2;
        this.f63756d = str2;
        this.f63757e = str3;
        this.f63758f = num;
        this.f63759g = list;
        this.f63760h = obj;
        this.f63761i = str4;
        this.f63762j = list2;
        this.f63763k = str5;
        this.f63764l = str6;
    }

    /* renamed from: a */
    public final double mo63247a() {
        return this.f63753a;
    }

    /* renamed from: b */
    public final List mo63248b() {
        return this.f63759g;
    }

    /* renamed from: c */
    public final String mo63249c() {
        return this.f63757e;
    }

    /* renamed from: d */
    public final String mo63250d() {
        return this.f63764l;
    }

    /* renamed from: e */
    public final String mo63251e() {
        return this.f63761i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24838a)) {
            return false;
        }
        C24838a aVar = (C24838a) obj;
        return Double.compare(this.f63753a, aVar.f63753a) == 0 && C41536l.m120484d(this.f63754b, aVar.f63754b) && C41536l.m120484d(this.f63755c, aVar.f63755c) && C41536l.m120484d(this.f63756d, aVar.f63756d) && C41536l.m120484d(this.f63757e, aVar.f63757e) && C41536l.m120484d(this.f63758f, aVar.f63758f) && C41536l.m120484d(this.f63759g, aVar.f63759g) && C41536l.m120484d(this.f63760h, aVar.f63760h) && C41536l.m120484d(this.f63761i, aVar.f63761i) && C41536l.m120484d(this.f63762j, aVar.f63762j) && C41536l.m120484d(this.f63763k, aVar.f63763k) && C41536l.m120484d(this.f63764l, aVar.f63764l);
    }

    /* renamed from: f */
    public final String mo63253f() {
        return this.f63754b;
    }

    /* renamed from: g */
    public final String mo63254g() {
        return this.f63763k;
    }

    public int hashCode() {
        int a = ((Double.doubleToLongBits(this.f63753a) * 31) + this.f63754b.hashCode()) * 31;
        Double d = this.f63755c;
        int i = 0;
        int hashCode = (((((a + (d == null ? 0 : d.hashCode())) * 31) + this.f63756d.hashCode()) * 31) + this.f63757e.hashCode()) * 31;
        Integer num = this.f63758f;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f63759g.hashCode()) * 31;
        Object obj = this.f63760h;
        int hashCode3 = (((((((hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31) + this.f63761i.hashCode()) * 31) + this.f63762j.hashCode()) * 31) + this.f63763k.hashCode()) * 31;
        String str = this.f63764l;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        double d = this.f63753a;
        String str = this.f63754b;
        Double d2 = this.f63755c;
        String str2 = this.f63756d;
        String str3 = this.f63757e;
        Integer num = this.f63758f;
        List list = this.f63759g;
        Object obj = this.f63760h;
        String str4 = this.f63761i;
        List list2 = this.f63762j;
        String str5 = this.f63763k;
        String str6 = this.f63764l;
        return "MoneyTransfer(amount=" + d + ", senderName=" + str + ", totalFee=" + d2 + ", receiverName=" + str2 + ", currency=" + str3 + ", documentId=" + num + ", countries=" + list + ", message=" + obj + ", sendCountry=" + str4 + ", senders=" + list2 + ", transferNumber=" + str5 + ", mtSystem=" + str6 + ")";
    }
}
