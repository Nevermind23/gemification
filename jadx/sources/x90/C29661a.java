package x90;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

/* renamed from: x90.a */
public final class C29661a {

    /* renamed from: a */
    private final long f74845a;

    /* renamed from: b */
    private final String f74846b;

    /* renamed from: c */
    private final long f74847c;

    /* renamed from: d */
    private final Double f74848d;

    /* renamed from: e */
    private final String f74849e;

    /* renamed from: f */
    private final Long f74850f;

    /* renamed from: g */
    private final String f74851g;

    /* renamed from: h */
    private final String f74852h;

    public C29661a(long j, String str, long j2, Double d, String str2, Long l, String str3, String str4) {
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        C41536l.m120489i(str3, "providerNameKey");
        C41536l.m120489i(str4, "logoUrl");
        this.f74845a = j;
        this.f74846b = str;
        this.f74847c = j2;
        this.f74848d = d;
        this.f74849e = str2;
        this.f74850f = l;
        this.f74851g = str3;
        this.f74852h = str4;
    }

    /* renamed from: a */
    public final Double mo69602a() {
        return this.f74848d;
    }

    /* renamed from: b */
    public final long mo69603b() {
        return this.f74845a;
    }

    /* renamed from: c */
    public final String mo69604c() {
        return this.f74852h;
    }

    /* renamed from: d */
    public final Long mo69605d() {
        return this.f74850f;
    }

    /* renamed from: e */
    public final String mo69606e() {
        return this.f74846b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29661a)) {
            return false;
        }
        C29661a aVar = (C29661a) obj;
        return this.f74845a == aVar.f74845a && C41536l.m120484d(this.f74846b, aVar.f74846b) && this.f74847c == aVar.f74847c && C41536l.m120484d(this.f74848d, aVar.f74848d) && C41536l.m120484d(this.f74849e, aVar.f74849e) && C41536l.m120484d(this.f74850f, aVar.f74850f) && C41536l.m120484d(this.f74851g, aVar.f74851g) && C41536l.m120484d(this.f74852h, aVar.f74852h);
    }

    /* renamed from: f */
    public final String mo69608f() {
        return this.f74851g;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f74845a) * 31;
        String str = this.f74846b;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + C7397t.m28148a(this.f74847c)) * 31;
        Double d = this.f74848d;
        int hashCode2 = (((hashCode + (d == null ? 0 : d.hashCode())) * 31) + this.f74849e.hashCode()) * 31;
        Long l = this.f74850f;
        if (l != null) {
            i = l.hashCode();
        }
        return ((((hashCode2 + i) * 31) + this.f74851g.hashCode()) * 31) + this.f74852h.hashCode();
    }

    public String toString() {
        long j = this.f74845a;
        String str = this.f74846b;
        long j2 = this.f74847c;
        Double d = this.f74848d;
        String str2 = this.f74849e;
        Long l = this.f74850f;
        String str3 = this.f74851g;
        String str4 = this.f74852h;
        return "Dd(id=" + j + ", orderName=" + str + ", priority=" + j2 + ", amount=" + d + ", serviceId=" + str2 + ", nextPayDate=" + l + ", providerNameKey=" + str3 + ", logoUrl=" + str4 + ")";
    }
}
