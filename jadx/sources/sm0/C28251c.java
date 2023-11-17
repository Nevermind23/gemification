package sm0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: sm0.c */
public final class C28251c {

    /* renamed from: a */
    private final long f71689a;

    /* renamed from: b */
    private final String f71690b;

    /* renamed from: c */
    private final int f71691c;

    /* renamed from: d */
    private final boolean f71692d;

    /* renamed from: e */
    private final String f71693e;

    /* renamed from: f */
    private final String f71694f;

    /* renamed from: g */
    private final String f71695g;

    /* renamed from: h */
    private final Long f71696h;

    public C28251c(long j, String str, int i, boolean z, String str2, String str3, String str4, Long l) {
        C41536l.m120489i(str, "childFirstNameInt");
        C41536l.m120489i(str2, "childLastName");
        C41536l.m120489i(str3, "childFirstName");
        C41536l.m120489i(str4, "childLastNameInt");
        this.f71689a = j;
        this.f71690b = str;
        this.f71691c = i;
        this.f71692d = z;
        this.f71693e = str2;
        this.f71694f = str3;
        this.f71695g = str4;
        this.f71696h = l;
    }

    /* renamed from: a */
    public final long mo67787a() {
        return this.f71689a;
    }

    /* renamed from: b */
    public final String mo67788b() {
        return this.f71694f;
    }

    /* renamed from: c */
    public final String mo67789c() {
        return this.f71690b;
    }

    /* renamed from: d */
    public final String mo67790d() {
        return this.f71693e;
    }

    /* renamed from: e */
    public final String mo67791e() {
        return this.f71695g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28251c)) {
            return false;
        }
        C28251c cVar = (C28251c) obj;
        return this.f71689a == cVar.f71689a && C41536l.m120484d(this.f71690b, cVar.f71690b) && this.f71691c == cVar.f71691c && this.f71692d == cVar.f71692d && C41536l.m120484d(this.f71693e, cVar.f71693e) && C41536l.m120484d(this.f71694f, cVar.f71694f) && C41536l.m120484d(this.f71695g, cVar.f71695g) && C41536l.m120484d(this.f71696h, cVar.f71696h);
    }

    /* renamed from: f */
    public final Long mo67793f() {
        return this.f71696h;
    }

    /* renamed from: g */
    public final boolean mo67794g() {
        return this.f71692d;
    }

    /* renamed from: h */
    public final int mo67795h() {
        return this.f71691c;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f71689a) * 31) + this.f71690b.hashCode()) * 31) + this.f71691c) * 31;
        boolean z = this.f71692d;
        if (z) {
            z = true;
        }
        int hashCode = (((((((a + (z ? 1 : 0)) * 31) + this.f71693e.hashCode()) * 31) + this.f71694f.hashCode()) * 31) + this.f71695g.hashCode()) * 31;
        Long l = this.f71696h;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        long j = this.f71689a;
        String str = this.f71690b;
        int i = this.f71691c;
        boolean z = this.f71692d;
        String str2 = this.f71693e;
        String str3 = this.f71694f;
        String str4 = this.f71695g;
        Long l = this.f71696h;
        return "ChildRequestApprove(childClientKey=" + j + ", childFirstNameInt=" + str + ", resultCode=" + i + ", hasSchoolCard=" + z + ", childLastName=" + str2 + ", childFirstName=" + str3 + ", childLastNameInt=" + str4 + ", childRequestId=" + l + ")";
    }
}
