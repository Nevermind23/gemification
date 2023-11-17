package p537nm;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: nm.g */
public final class C17084g {

    /* renamed from: a */
    private final long f47775a;

    /* renamed from: b */
    private final String f47776b;

    /* renamed from: c */
    private final String f47777c;

    /* renamed from: d */
    private final String f47778d;

    /* renamed from: e */
    private final boolean f47779e;

    public C17084g(long j, String str, String str2, String str3, boolean z) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "dailyLimitType");
        C41536l.m120489i(str3, "limitTypeDesc");
        this.f47775a = j;
        this.f47776b = str;
        this.f47777c = str2;
        this.f47778d = str3;
        this.f47779e = z;
    }

    /* renamed from: a */
    public final String mo44345a() {
        return this.f47777c;
    }

    /* renamed from: b */
    public final long mo44346b() {
        return this.f47775a;
    }

    /* renamed from: c */
    public final String mo44347c() {
        return this.f47778d;
    }

    /* renamed from: d */
    public final String mo44348d() {
        return this.f47776b;
    }

    /* renamed from: e */
    public final boolean mo44349e() {
        return this.f47779e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17084g)) {
            return false;
        }
        C17084g gVar = (C17084g) obj;
        return this.f47775a == gVar.f47775a && C41536l.m120484d(this.f47776b, gVar.f47776b) && C41536l.m120484d(this.f47777c, gVar.f47777c) && C41536l.m120484d(this.f47778d, gVar.f47778d) && this.f47779e == gVar.f47779e;
    }

    public int hashCode() {
        int a = ((((((C7397t.m28148a(this.f47775a) * 31) + this.f47776b.hashCode()) * 31) + this.f47777c.hashCode()) * 31) + this.f47778d.hashCode()) * 31;
        boolean z = this.f47779e;
        if (z) {
            z = true;
        }
        return a + (z ? 1 : 0);
    }

    public String toString() {
        long j = this.f47775a;
        String str = this.f47776b;
        String str2 = this.f47777c;
        String str3 = this.f47778d;
        boolean z = this.f47779e;
        return "CardDailyLimit(id=" + j + ", prodType=" + str + ", dailyLimitType=" + str2 + ", limitTypeDesc=" + str3 + ", showFlag=" + z + ")";
    }
}
