package ny0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ny0.k */
public final class C37510k {

    /* renamed from: a */
    private final String f90228a;

    /* renamed from: b */
    private final long f90229b;

    /* renamed from: c */
    private final Long f90230c;

    /* renamed from: d */
    private final String f90231d;

    /* renamed from: e */
    private final String f90232e;

    /* renamed from: f */
    private final String f90233f;

    /* renamed from: g */
    private final String f90234g;

    /* renamed from: h */
    private final String f90235h;

    /* renamed from: i */
    private final String f90236i;

    public C37510k(String str, long j, Long l, String str2, String str3, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str2, "lookupName");
        C41536l.m120489i(str3, "lookupValue");
        C41536l.m120489i(str4, "dictionaryKeyId");
        C41536l.m120489i(str5, "dictionaryKey");
        C41536l.m120489i(str6, "dictionaryValue");
        C41536l.m120489i(str7, "dictionaryValueEn");
        this.f90228a = str;
        this.f90229b = j;
        this.f90230c = l;
        this.f90231d = str2;
        this.f90232e = str3;
        this.f90233f = str4;
        this.f90234g = str5;
        this.f90235h = str6;
        this.f90236i = str7;
    }

    /* renamed from: a */
    public final String mo90741a() {
        return this.f90234g;
    }

    /* renamed from: b */
    public final String mo90742b() {
        return this.f90228a;
    }

    /* renamed from: c */
    public final Long mo90743c() {
        return this.f90230c;
    }

    /* renamed from: d */
    public final String mo90744d() {
        return this.f90231d;
    }

    /* renamed from: e */
    public final String mo90745e() {
        return this.f90232e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37510k)) {
            return false;
        }
        C37510k kVar = (C37510k) obj;
        return C41536l.m120484d(this.f90228a, kVar.f90228a) && this.f90229b == kVar.f90229b && C41536l.m120484d(this.f90230c, kVar.f90230c) && C41536l.m120484d(this.f90231d, kVar.f90231d) && C41536l.m120484d(this.f90232e, kVar.f90232e) && C41536l.m120484d(this.f90233f, kVar.f90233f) && C41536l.m120484d(this.f90234g, kVar.f90234g) && C41536l.m120484d(this.f90235h, kVar.f90235h) && C41536l.m120484d(this.f90236i, kVar.f90236i);
    }

    /* renamed from: f */
    public final long mo90747f() {
        return this.f90229b;
    }

    public int hashCode() {
        String str = this.f90228a;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + C7397t.m28148a(this.f90229b)) * 31;
        Long l = this.f90230c;
        if (l != null) {
            i = l.hashCode();
        }
        return ((((((((((((hashCode + i) * 31) + this.f90231d.hashCode()) * 31) + this.f90232e.hashCode()) * 31) + this.f90233f.hashCode()) * 31) + this.f90234g.hashCode()) * 31) + this.f90235h.hashCode()) * 31) + this.f90236i.hashCode();
    }

    public String toString() {
        String str = this.f90228a;
        long j = this.f90229b;
        Long l = this.f90230c;
        String str2 = this.f90231d;
        String str3 = this.f90232e;
        String str4 = this.f90233f;
        String str5 = this.f90234g;
        String str6 = this.f90235h;
        String str7 = this.f90236i;
        return "SavingGoalPurpose(iconUrl=" + str + ", savingGoalId=" + j + ", id=" + l + ", lookupName=" + str2 + ", lookupValue=" + str3 + ", dictionaryKeyId=" + str4 + ", dictionaryKey=" + str5 + ", dictionaryValue=" + str6 + ", dictionaryValueEn=" + str7 + ")";
    }
}
