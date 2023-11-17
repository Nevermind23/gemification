package iv0;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import kotlin.jvm.internal.C41536l;

/* renamed from: iv0.b */
public final class C36550b {

    /* renamed from: a */
    private final String f88076a;

    /* renamed from: b */
    private final String f88077b;

    /* renamed from: c */
    private final String f88078c;

    /* renamed from: d */
    private final String f88079d;

    /* renamed from: e */
    private final String f88080e;

    /* renamed from: f */
    private final String f88081f;

    /* renamed from: g */
    private final String f88082g;

    /* renamed from: h */
    private final boolean f88083h;

    public C36550b(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        C41536l.m120489i(str, "adapterId");
        C41536l.m120489i(str2, "bankCode");
        C41536l.m120489i(str3, "bic");
        C41536l.m120489i(str4, "id");
        C41536l.m120489i(str6, "name");
        C41536l.m120489i(str7, C11769i.C11770a.f34149l);
        this.f88076a = str;
        this.f88077b = str2;
        this.f88078c = str3;
        this.f88079d = str4;
        this.f88080e = str5;
        this.f88081f = str6;
        this.f88082g = str7;
        this.f88083h = z;
    }

    /* renamed from: a */
    public final String mo89333a() {
        return this.f88078c;
    }

    /* renamed from: b */
    public final String mo89334b() {
        return this.f88079d;
    }

    /* renamed from: c */
    public final String mo89335c() {
        return this.f88081f;
    }

    /* renamed from: d */
    public final boolean mo89336d() {
        return this.f88083h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36550b)) {
            return false;
        }
        C36550b bVar = (C36550b) obj;
        return C41536l.m120484d(this.f88076a, bVar.f88076a) && C41536l.m120484d(this.f88077b, bVar.f88077b) && C41536l.m120484d(this.f88078c, bVar.f88078c) && C41536l.m120484d(this.f88079d, bVar.f88079d) && C41536l.m120484d(this.f88080e, bVar.f88080e) && C41536l.m120484d(this.f88081f, bVar.f88081f) && C41536l.m120484d(this.f88082g, bVar.f88082g) && this.f88083h == bVar.f88083h;
    }

    public int hashCode() {
        int hashCode = ((((((this.f88076a.hashCode() * 31) + this.f88077b.hashCode()) * 31) + this.f88078c.hashCode()) * 31) + this.f88079d.hashCode()) * 31;
        String str = this.f88080e;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f88081f.hashCode()) * 31) + this.f88082g.hashCode()) * 31;
        boolean z = this.f88083h;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f88076a;
        String str2 = this.f88077b;
        String str3 = this.f88078c;
        String str4 = this.f88079d;
        String str5 = this.f88080e;
        String str6 = this.f88081f;
        String str7 = this.f88082g;
        boolean z = this.f88083h;
        return "Bank(adapterId=" + str + ", bankCode=" + str2 + ", bic=" + str3 + ", id=" + str4 + ", idpUrl=" + str5 + ", name=" + str6 + ", url=" + str7 + ", isActive=" + z + ")";
    }
}
