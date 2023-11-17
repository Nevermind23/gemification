package p537nm;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: nm.o */
public final class C17098o {

    /* renamed from: a */
    private final long f47868a;

    /* renamed from: b */
    private final String f47869b;

    /* renamed from: c */
    private final String f47870c;

    /* renamed from: d */
    private final String f47871d;

    /* renamed from: e */
    private final String f47872e;

    /* renamed from: f */
    private final long f47873f;

    /* renamed from: g */
    private final String f47874g;

    /* renamed from: h */
    private final String f47875h;

    /* renamed from: i */
    private final String f47876i;

    /* renamed from: j */
    private final String f47877j;

    public C17098o(long j, String str, String str2, String str3, String str4, long j2, String str5, String str6, String str7, String str8) {
        C41536l.m120489i(str, "acctNo");
        C41536l.m120489i(str2, "ccy");
        C41536l.m120489i(str3, "planType");
        C41536l.m120489i(str4, "planCode");
        C41536l.m120489i(str5, "cardClass");
        C41536l.m120489i(str6, "cardType");
        C41536l.m120489i(str7, "availableAmount");
        C41536l.m120489i(str8, "acctName");
        this.f47868a = j;
        this.f47869b = str;
        this.f47870c = str2;
        this.f47871d = str3;
        this.f47872e = str4;
        this.f47873f = j2;
        this.f47874g = str5;
        this.f47875h = str6;
        this.f47876i = str7;
        this.f47877j = str8;
    }

    /* renamed from: a */
    public final long mo44451a() {
        return this.f47868a;
    }

    /* renamed from: b */
    public final String mo44452b() {
        return this.f47877j;
    }

    /* renamed from: c */
    public final String mo44453c() {
        return this.f47869b;
    }

    /* renamed from: d */
    public final String mo44454d() {
        return this.f47876i;
    }

    /* renamed from: e */
    public final String mo44455e() {
        return this.f47874g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17098o)) {
            return false;
        }
        C17098o oVar = (C17098o) obj;
        return this.f47868a == oVar.f47868a && C41536l.m120484d(this.f47869b, oVar.f47869b) && C41536l.m120484d(this.f47870c, oVar.f47870c) && C41536l.m120484d(this.f47871d, oVar.f47871d) && C41536l.m120484d(this.f47872e, oVar.f47872e) && this.f47873f == oVar.f47873f && C41536l.m120484d(this.f47874g, oVar.f47874g) && C41536l.m120484d(this.f47875h, oVar.f47875h) && C41536l.m120484d(this.f47876i, oVar.f47876i) && C41536l.m120484d(this.f47877j, oVar.f47877j);
    }

    /* renamed from: f */
    public final String mo44457f() {
        return this.f47875h;
    }

    /* renamed from: g */
    public final String mo44458g() {
        return this.f47870c;
    }

    /* renamed from: h */
    public final long mo44459h() {
        return this.f47873f;
    }

    public int hashCode() {
        return (((((((((((((((((C7397t.m28148a(this.f47868a) * 31) + this.f47869b.hashCode()) * 31) + this.f47870c.hashCode()) * 31) + this.f47871d.hashCode()) * 31) + this.f47872e.hashCode()) * 31) + C7397t.m28148a(this.f47873f)) * 31) + this.f47874g.hashCode()) * 31) + this.f47875h.hashCode()) * 31) + this.f47876i.hashCode()) * 31) + this.f47877j.hashCode();
    }

    /* renamed from: i */
    public final String mo44461i() {
        return this.f47872e;
    }

    /* renamed from: j */
    public final String mo44462j() {
        return this.f47871d;
    }

    public String toString() {
        long j = this.f47868a;
        String str = this.f47869b;
        String str2 = this.f47870c;
        String str3 = this.f47871d;
        String str4 = this.f47872e;
        long j2 = this.f47873f;
        String str5 = this.f47874g;
        String str6 = this.f47875h;
        String str7 = this.f47876i;
        String str8 = this.f47877j;
        return "DebitCardAppAccount(acctKey=" + j + ", acctNo=" + str + ", ccy=" + str2 + ", planType=" + str3 + ", planCode=" + str4 + ", clientKey=" + j2 + ", cardClass=" + str5 + ", cardType=" + str6 + ", availableAmount=" + str7 + ", acctName=" + str8 + ")";
    }
}
