package p563pk;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: pk.b */
public final class C17372b {

    /* renamed from: a */
    private final String f48712a;

    /* renamed from: b */
    private final String f48713b;

    /* renamed from: c */
    private final String f48714c;

    /* renamed from: d */
    private final C17374d f48715d;

    /* renamed from: e */
    private final long f48716e;

    public C17372b(String str, String str2, String str3, C17374d dVar, long j) {
        C41536l.m120489i(str, "firsName");
        C41536l.m120489i(str2, "latName");
        C41536l.m120489i(str3, "idNumber");
        C41536l.m120489i(dVar, "gender");
        this.f48712a = str;
        this.f48713b = str2;
        this.f48714c = str3;
        this.f48715d = dVar;
        this.f48716e = j;
    }

    /* renamed from: a */
    public final long mo44821a() {
        return this.f48716e;
    }

    /* renamed from: b */
    public final String mo44822b() {
        return this.f48712a;
    }

    /* renamed from: c */
    public final C17374d mo44823c() {
        return this.f48715d;
    }

    /* renamed from: d */
    public final String mo44824d() {
        return this.f48714c;
    }

    /* renamed from: e */
    public final String mo44825e() {
        return this.f48713b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17372b)) {
            return false;
        }
        C17372b bVar = (C17372b) obj;
        return C41536l.m120484d(this.f48712a, bVar.f48712a) && C41536l.m120484d(this.f48713b, bVar.f48713b) && C41536l.m120484d(this.f48714c, bVar.f48714c) && this.f48715d == bVar.f48715d && this.f48716e == bVar.f48716e;
    }

    public int hashCode() {
        return (((((((this.f48712a.hashCode() * 31) + this.f48713b.hashCode()) * 31) + this.f48714c.hashCode()) * 31) + this.f48715d.hashCode()) * 31) + C7397t.m28148a(this.f48716e);
    }

    public String toString() {
        String str = this.f48712a;
        String str2 = this.f48713b;
        String str3 = this.f48714c;
        C17374d dVar = this.f48715d;
        long j = this.f48716e;
        return "CarOwnerInfo(firsName=" + str + ", latName=" + str2 + ", idNumber=" + str3 + ", gender=" + dVar + ", dateOfBirth=" + j + ")";
    }
}
