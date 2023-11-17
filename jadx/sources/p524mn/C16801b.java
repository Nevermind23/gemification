package p524mn;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: mn.b */
public final class C16801b {

    /* renamed from: a */
    private final long f47076a;

    /* renamed from: b */
    private final long f47077b;

    /* renamed from: c */
    private final String f47078c;

    /* renamed from: d */
    private final String f47079d;

    /* renamed from: e */
    private final String f47080e;

    /* renamed from: f */
    private final String f47081f;

    /* renamed from: g */
    private final String f47082g;

    /* renamed from: h */
    private final String f47083h;

    public C16801b(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(str2, "firstName");
        C41536l.m120489i(str3, "firstNameInt");
        C41536l.m120489i(str4, "lastName");
        C41536l.m120489i(str5, "lastNameInt");
        C41536l.m120489i(str6, "pin");
        this.f47076a = j;
        this.f47077b = j2;
        this.f47078c = str;
        this.f47079d = str2;
        this.f47080e = str3;
        this.f47081f = str4;
        this.f47082g = str5;
        this.f47083h = str6;
    }

    /* renamed from: a */
    public final long mo43925a() {
        return this.f47076a;
    }

    /* renamed from: b */
    public final long mo43926b() {
        return this.f47077b;
    }

    /* renamed from: c */
    public final String mo43927c() {
        return this.f47078c;
    }

    /* renamed from: d */
    public final String mo43928d() {
        return this.f47079d;
    }

    /* renamed from: e */
    public final String mo43929e() {
        return this.f47080e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16801b)) {
            return false;
        }
        C16801b bVar = (C16801b) obj;
        return this.f47076a == bVar.f47076a && this.f47077b == bVar.f47077b && C41536l.m120484d(this.f47078c, bVar.f47078c) && C41536l.m120484d(this.f47079d, bVar.f47079d) && C41536l.m120484d(this.f47080e, bVar.f47080e) && C41536l.m120484d(this.f47081f, bVar.f47081f) && C41536l.m120484d(this.f47082g, bVar.f47082g) && C41536l.m120484d(this.f47083h, bVar.f47083h);
    }

    /* renamed from: f */
    public final String mo43931f() {
        return this.f47081f;
    }

    /* renamed from: g */
    public final String mo43932g() {
        return this.f47082g;
    }

    /* renamed from: h */
    public final String mo43933h() {
        return this.f47083h;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f47076a) * 31) + C7397t.m28148a(this.f47077b)) * 31;
        String str = this.f47078c;
        return ((((((((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f47079d.hashCode()) * 31) + this.f47080e.hashCode()) * 31) + this.f47081f.hashCode()) * 31) + this.f47082g.hashCode()) * 31) + this.f47083h.hashCode();
    }

    public String toString() {
        long j = this.f47076a;
        long j2 = this.f47077b;
        String str = this.f47078c;
        String str2 = this.f47079d;
        String str3 = this.f47080e;
        String str4 = this.f47081f;
        String str5 = this.f47082g;
        String str6 = this.f47083h;
        return "ChildInfoModel(birthDate=" + j + ", clientKey=" + j2 + ", financialPhone=" + str + ", firstName=" + str2 + ", firstNameInt=" + str3 + ", lastName=" + str4 + ", lastNameInt=" + str5 + ", pin=" + str6 + ")";
    }
}
