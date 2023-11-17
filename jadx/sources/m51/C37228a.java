package m51;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: m51.a */
public final class C37228a {

    /* renamed from: a */
    private final long f89647a;

    /* renamed from: b */
    private final String f89648b;

    /* renamed from: c */
    private final long f89649c;

    /* renamed from: d */
    private final String f89650d;

    public C37228a(long j, String str, long j2, String str2) {
        C41536l.m120489i(str, "clientIdCBS");
        C41536l.m120489i(str2, "userName");
        this.f89647a = j;
        this.f89648b = str;
        this.f89649c = j2;
        this.f89650d = str2;
    }

    /* renamed from: a */
    public final String mo90304a() {
        return this.f89648b;
    }

    /* renamed from: b */
    public final long mo90305b() {
        return this.f89649c;
    }

    /* renamed from: c */
    public final long mo90306c() {
        return this.f89647a;
    }

    /* renamed from: d */
    public final String mo90307d() {
        return this.f89650d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37228a)) {
            return false;
        }
        C37228a aVar = (C37228a) obj;
        return this.f89647a == aVar.f89647a && C41536l.m120484d(this.f89648b, aVar.f89648b) && this.f89649c == aVar.f89649c && C41536l.m120484d(this.f89650d, aVar.f89650d);
    }

    public int hashCode() {
        return (((((C7397t.m28148a(this.f89647a) * 31) + this.f89648b.hashCode()) * 31) + C7397t.m28148a(this.f89649c)) * 31) + this.f89650d.hashCode();
    }

    public String toString() {
        long j = this.f89647a;
        String str = this.f89648b;
        long j2 = this.f89649c;
        String str2 = this.f89650d;
        return "LoginInfo(userId=" + j + ", clientIdCBS=" + str + ", customerId=" + j2 + ", userName=" + str2 + ")";
    }
}
