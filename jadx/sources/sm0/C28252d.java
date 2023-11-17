package sm0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: sm0.d */
public final class C28252d {

    /* renamed from: a */
    private final long f71697a;

    /* renamed from: b */
    private final String f71698b;

    /* renamed from: c */
    private final Long f71699c;

    /* renamed from: d */
    private final String f71700d;

    /* renamed from: e */
    private final String f71701e;

    /* renamed from: f */
    private final Long f71702f;

    /* renamed from: g */
    private final String f71703g;

    /* renamed from: h */
    private final Long f71704h;

    /* renamed from: i */
    private final String f71705i;

    /* renamed from: j */
    private final boolean f71706j;

    public C28252d(long j, String str, Long l, String str2, String str3, Long l2, String str4, Long l3, String str5, boolean z) {
        this.f71697a = j;
        this.f71698b = str;
        this.f71699c = l;
        this.f71700d = str2;
        this.f71701e = str3;
        this.f71702f = l2;
        this.f71703g = str4;
        this.f71704h = l3;
        this.f71705i = str5;
        this.f71706j = z;
    }

    /* renamed from: a */
    public final Long mo67798a() {
        return this.f71702f;
    }

    /* renamed from: b */
    public final Long mo67799b() {
        return this.f71699c;
    }

    /* renamed from: c */
    public final String mo67800c() {
        return this.f71700d;
    }

    /* renamed from: d */
    public final String mo67801d() {
        return this.f71701e;
    }

    /* renamed from: e */
    public final String mo67802e() {
        return this.f71703g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28252d)) {
            return false;
        }
        C28252d dVar = (C28252d) obj;
        return this.f71697a == dVar.f71697a && C41536l.m120484d(this.f71698b, dVar.f71698b) && C41536l.m120484d(this.f71699c, dVar.f71699c) && C41536l.m120484d(this.f71700d, dVar.f71700d) && C41536l.m120484d(this.f71701e, dVar.f71701e) && C41536l.m120484d(this.f71702f, dVar.f71702f) && C41536l.m120484d(this.f71703g, dVar.f71703g) && C41536l.m120484d(this.f71704h, dVar.f71704h) && C41536l.m120484d(this.f71705i, dVar.f71705i) && this.f71706j == dVar.f71706j;
    }

    /* renamed from: f */
    public final String mo67804f() {
        return this.f71698b;
    }

    /* renamed from: g */
    public final long mo67805g() {
        return this.f71697a;
    }

    /* renamed from: h */
    public final Long mo67806h() {
        return this.f71704h;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f71697a) * 31;
        String str = this.f71698b;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f71699c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f71700d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71701e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f71702f;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.f71703g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.f71704h;
        int hashCode7 = (hashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str5 = this.f71705i;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i2 = (hashCode7 + i) * 31;
        boolean z = this.f71706j;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final String mo67808i() {
        return this.f71705i;
    }

    /* renamed from: j */
    public final boolean mo67809j() {
        return this.f71706j;
    }

    public String toString() {
        long j = this.f71697a;
        String str = this.f71698b;
        Long l = this.f71699c;
        String str2 = this.f71700d;
        String str3 = this.f71701e;
        Long l2 = this.f71702f;
        String str4 = this.f71703g;
        Long l3 = this.f71704h;
        String str5 = this.f71705i;
        boolean z = this.f71706j;
        return "JuniorRequestData(id=" + j + ", childPin=" + str + ", childClientKey=" + l + ", childFirstName=" + str2 + ", childLastName=" + str3 + ", childBirthDate=" + l2 + ", childMobileNumber=" + str4 + ", parentClientKey=" + l3 + ", parentMobileNumber=" + str5 + ", status=" + z + ")";
    }
}
