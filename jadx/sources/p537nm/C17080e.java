package p537nm;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: nm.e */
public final class C17080e {

    /* renamed from: a */
    private final long f47738a;

    /* renamed from: b */
    private final String f47739b;

    /* renamed from: c */
    private final String f47740c;

    /* renamed from: d */
    private final String f47741d;

    /* renamed from: e */
    private final String f47742e;

    public C17080e(long j, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "objectType");
        C41536l.m120489i(str2, "objectCode");
        C41536l.m120489i(str3, "objectUrl");
        C41536l.m120489i(str4, "languageCode");
        this.f47738a = j;
        this.f47739b = str;
        this.f47740c = str2;
        this.f47741d = str3;
        this.f47742e = str4;
    }

    /* renamed from: a */
    public final long mo44302a() {
        return this.f47738a;
    }

    /* renamed from: b */
    public final String mo44303b() {
        return this.f47742e;
    }

    /* renamed from: c */
    public final String mo44304c() {
        return this.f47740c;
    }

    /* renamed from: d */
    public final String mo44305d() {
        return this.f47739b;
    }

    /* renamed from: e */
    public final String mo44306e() {
        return this.f47741d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17080e)) {
            return false;
        }
        C17080e eVar = (C17080e) obj;
        return this.f47738a == eVar.f47738a && C41536l.m120484d(this.f47739b, eVar.f47739b) && C41536l.m120484d(this.f47740c, eVar.f47740c) && C41536l.m120484d(this.f47741d, eVar.f47741d) && C41536l.m120484d(this.f47742e, eVar.f47742e);
    }

    public int hashCode() {
        return (((((((C7397t.m28148a(this.f47738a) * 31) + this.f47739b.hashCode()) * 31) + this.f47740c.hashCode()) * 31) + this.f47741d.hashCode()) * 31) + this.f47742e.hashCode();
    }

    public String toString() {
        long j = this.f47738a;
        String str = this.f47739b;
        String str2 = this.f47740c;
        String str3 = this.f47741d;
        String str4 = this.f47742e;
        return "CardBenefit(id=" + j + ", objectType=" + str + ", objectCode=" + str2 + ", objectUrl=" + str3 + ", languageCode=" + str4 + ")";
    }
}
