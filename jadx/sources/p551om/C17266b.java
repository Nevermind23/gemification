package p551om;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: om.b */
public final class C17266b {

    /* renamed from: a */
    private final String f48544a;

    /* renamed from: b */
    private final long f48545b;

    /* renamed from: c */
    private final long f48546c;

    public C17266b(String str, long j, long j2) {
        C41536l.m120489i(str, "districtName");
        this.f48544a = str;
        this.f48545b = j;
        this.f48546c = j2;
    }

    /* renamed from: a */
    public final long mo44659a() {
        return this.f48546c;
    }

    /* renamed from: b */
    public final String mo44660b() {
        return this.f48544a;
    }

    /* renamed from: c */
    public final long mo44661c() {
        return this.f48545b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17266b)) {
            return false;
        }
        C17266b bVar = (C17266b) obj;
        return C41536l.m120484d(this.f48544a, bVar.f48544a) && this.f48545b == bVar.f48545b && this.f48546c == bVar.f48546c;
    }

    public int hashCode() {
        return (((this.f48544a.hashCode() * 31) + C7397t.m28148a(this.f48545b)) * 31) + C7397t.m28148a(this.f48546c);
    }

    public String toString() {
        String str = this.f48544a;
        long j = this.f48545b;
        long j2 = this.f48546c;
        return "DebitCardDeliveryDistrict(districtName=" + str + ", id=" + j + ", cityId=" + j2 + ")";
    }
}
