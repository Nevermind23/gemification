package m40;

import kotlin.jvm.internal.C41536l;

/* renamed from: m40.a */
public final class C26141a {

    /* renamed from: a */
    private final String f66259a;

    /* renamed from: b */
    private final String f66260b;

    /* renamed from: c */
    private final String f66261c;

    /* renamed from: d */
    private final String f66262d;

    /* renamed from: e */
    private final boolean f66263e;

    public C26141a(String str, String str2, String str3, String str4, boolean z) {
        C41536l.m120489i(str, "income");
        C41536l.m120489i(str2, "expenses");
        C41536l.m120489i(str3, "difference");
        C41536l.m120489i(str4, "date");
        this.f66259a = str;
        this.f66260b = str2;
        this.f66261c = str3;
        this.f66262d = str4;
        this.f66263e = z;
    }

    /* renamed from: a */
    public final String mo65039a() {
        return this.f66262d;
    }

    /* renamed from: b */
    public final String mo65040b() {
        return this.f66261c;
    }

    /* renamed from: c */
    public final String mo65041c() {
        return this.f66260b;
    }

    /* renamed from: d */
    public final String mo65042d() {
        return this.f66259a;
    }

    /* renamed from: e */
    public final boolean mo65043e() {
        return this.f66263e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26141a)) {
            return false;
        }
        C26141a aVar = (C26141a) obj;
        return C41536l.m120484d(this.f66259a, aVar.f66259a) && C41536l.m120484d(this.f66260b, aVar.f66260b) && C41536l.m120484d(this.f66261c, aVar.f66261c) && C41536l.m120484d(this.f66262d, aVar.f66262d) && this.f66263e == aVar.f66263e;
    }

    public int hashCode() {
        int hashCode = ((((((this.f66259a.hashCode() * 31) + this.f66260b.hashCode()) * 31) + this.f66261c.hashCode()) * 31) + this.f66262d.hashCode()) * 31;
        boolean z = this.f66263e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f66259a;
        String str2 = this.f66260b;
        String str3 = this.f66261c;
        String str4 = this.f66262d;
        boolean z = this.f66263e;
        return "CashFlowFooterDataModel(income=" + str + ", expenses=" + str2 + ", difference=" + str3 + ", date=" + str4 + ", isNegativeBalance=" + z + ")";
    }
}
