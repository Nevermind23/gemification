package j71;

import java.util.Date;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: j71.b */
public final class C36749b {

    /* renamed from: a */
    private final long f88659a;

    /* renamed from: b */
    private final long f88660b;

    /* renamed from: c */
    private final Date f88661c;

    /* renamed from: d */
    private final Date f88662d;

    /* renamed from: e */
    private final long f88663e;

    /* renamed from: f */
    private final String f88664f;

    /* renamed from: g */
    private final String f88665g;

    /* renamed from: h */
    private final String f88666h;

    public C36749b(long j, long j2, Date date, Date date2, long j3, String str, String str2, String str3) {
        C41536l.m120489i(date, "startDate");
        C41536l.m120489i(date2, "endDate");
        C41536l.m120489i(str, "typeCode");
        C41536l.m120489i(str2, "passTitle");
        C41536l.m120489i(str3, "passDescription");
        this.f88659a = j;
        this.f88660b = j2;
        this.f88661c = date;
        this.f88662d = date2;
        this.f88663e = j3;
        this.f88664f = str;
        this.f88665g = str2;
        this.f88666h = str3;
    }

    /* renamed from: a */
    public final Date mo89584a() {
        return this.f88662d;
    }

    /* renamed from: b */
    public final String mo89585b() {
        return this.f88666h;
    }

    /* renamed from: c */
    public final Date mo89586c() {
        return this.f88661c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36749b)) {
            return false;
        }
        C36749b bVar = (C36749b) obj;
        return this.f88659a == bVar.f88659a && this.f88660b == bVar.f88660b && C41536l.m120484d(this.f88661c, bVar.f88661c) && C41536l.m120484d(this.f88662d, bVar.f88662d) && this.f88663e == bVar.f88663e && C41536l.m120484d(this.f88664f, bVar.f88664f) && C41536l.m120484d(this.f88665g, bVar.f88665g) && C41536l.m120484d(this.f88666h, bVar.f88666h);
    }

    public int hashCode() {
        return (((((((((((((C7397t.m28148a(this.f88659a) * 31) + C7397t.m28148a(this.f88660b)) * 31) + this.f88661c.hashCode()) * 31) + this.f88662d.hashCode()) * 31) + C7397t.m28148a(this.f88663e)) * 31) + this.f88664f.hashCode()) * 31) + this.f88665g.hashCode()) * 31) + this.f88666h.hashCode();
    }

    public String toString() {
        long j = this.f88659a;
        long j2 = this.f88660b;
        Date date = this.f88661c;
        Date date2 = this.f88662d;
        long j3 = this.f88663e;
        String str = this.f88664f;
        String str2 = this.f88665g;
        String str3 = this.f88666h;
        return "ActivePass(passId=" + j + ", typeId=" + j2 + ", startDate=" + date + ", endDate=" + date2 + ", chargeAcctKey=" + j3 + ", typeCode=" + str + ", passTitle=" + str2 + ", passDescription=" + str3 + ")";
    }
}
