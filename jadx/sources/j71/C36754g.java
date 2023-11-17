package j71;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: j71.g */
public final class C36754g {

    /* renamed from: a */
    private final String f88696a;

    /* renamed from: b */
    private final String f88697b;

    /* renamed from: c */
    private final int f88698c;

    /* renamed from: d */
    private final String f88699d;

    /* renamed from: e */
    private final String f88700e;

    /* renamed from: f */
    private final long f88701f;

    /* renamed from: g */
    private final long f88702g;

    /* renamed from: h */
    private final boolean f88703h;

    /* renamed from: i */
    private final String f88704i;

    /* renamed from: j */
    private final C36756i f88705j;

    /* renamed from: k */
    private final String f88706k;

    public C36754g(String str, String str2, int i, String str3, String str4, long j, long j2, boolean z, String str5, C36756i iVar, String str6) {
        C41536l.m120489i(str, "typeId");
        C41536l.m120489i(str2, "passTitle");
        C41536l.m120489i(str3, "deviceType");
        C41536l.m120489i(str4, "deviceName");
        C41536l.m120489i(str5, "lastFour");
        C41536l.m120489i(iVar, "status");
        this.f88696a = str;
        this.f88697b = str2;
        this.f88698c = i;
        this.f88699d = str3;
        this.f88700e = str4;
        this.f88701f = j;
        this.f88702g = j2;
        this.f88703h = z;
        this.f88704i = str5;
        this.f88705j = iVar;
        this.f88706k = str6;
    }

    /* renamed from: a */
    public final String mo89622a() {
        return this.f88700e;
    }

    /* renamed from: b */
    public final long mo89623b() {
        return this.f88702g;
    }

    /* renamed from: c */
    public final String mo89624c() {
        return this.f88704i;
    }

    /* renamed from: d */
    public final String mo89625d() {
        return this.f88697b;
    }

    /* renamed from: e */
    public final int mo89626e() {
        return this.f88698c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36754g)) {
            return false;
        }
        C36754g gVar = (C36754g) obj;
        return C41536l.m120484d(this.f88696a, gVar.f88696a) && C41536l.m120484d(this.f88697b, gVar.f88697b) && this.f88698c == gVar.f88698c && C41536l.m120484d(this.f88699d, gVar.f88699d) && C41536l.m120484d(this.f88700e, gVar.f88700e) && this.f88701f == gVar.f88701f && this.f88702g == gVar.f88702g && this.f88703h == gVar.f88703h && C41536l.m120484d(this.f88704i, gVar.f88704i) && this.f88705j == gVar.f88705j && C41536l.m120484d(this.f88706k, gVar.f88706k);
    }

    /* renamed from: f */
    public final long mo89628f() {
        return this.f88701f;
    }

    /* renamed from: g */
    public final C36756i mo89629g() {
        return this.f88705j;
    }

    /* renamed from: h */
    public final String mo89630h() {
        return this.f88706k;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f88696a.hashCode() * 31) + this.f88697b.hashCode()) * 31) + this.f88698c) * 31) + this.f88699d.hashCode()) * 31) + this.f88700e.hashCode()) * 31) + C7397t.m28148a(this.f88701f)) * 31) + C7397t.m28148a(this.f88702g)) * 31;
        boolean z = this.f88703h;
        if (z) {
            z = true;
        }
        int hashCode2 = (((((hashCode + (z ? 1 : 0)) * 31) + this.f88704i.hashCode()) * 31) + this.f88705j.hashCode()) * 31;
        String str = this.f88706k;
        return hashCode2 + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: i */
    public final boolean mo89632i() {
        return this.f88703h;
    }

    public String toString() {
        String str = this.f88696a;
        String str2 = this.f88697b;
        int i = this.f88698c;
        String str3 = this.f88699d;
        String str4 = this.f88700e;
        long j = this.f88701f;
        long j2 = this.f88702g;
        boolean z = this.f88703h;
        String str5 = this.f88704i;
        C36756i iVar = this.f88705j;
        String str6 = this.f88706k;
        return "PurchasedPass(typeId=" + str + ", passTitle=" + str2 + ", price=" + i + ", deviceType=" + str3 + ", deviceName=" + str4 + ", startDate=" + j + ", endDate=" + j2 + ", isPhysicalDevice=" + z + ", lastFour=" + str5 + ", status=" + iVar + ", successDictionaryKey=" + str6 + ")";
    }
}
