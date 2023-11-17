package ul0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ul0.e */
public final class C28878e {

    /* renamed from: a */
    private final String f73713a;

    /* renamed from: b */
    private final String f73714b;

    /* renamed from: c */
    private final String f73715c;

    /* renamed from: d */
    private final String f73716d;

    /* renamed from: e */
    private final String f73717e;

    /* renamed from: f */
    private final Long f73718f;

    public C28878e(String str, String str2, String str3, String str4, String str5, Long l) {
        this.f73713a = str;
        this.f73714b = str2;
        this.f73715c = str3;
        this.f73716d = str4;
        this.f73717e = str5;
        this.f73718f = l;
    }

    /* renamed from: a */
    public final Long mo68620a() {
        return this.f73718f;
    }

    /* renamed from: b */
    public final String mo68621b() {
        return this.f73715c;
    }

    /* renamed from: c */
    public final String mo68622c() {
        return this.f73713a;
    }

    /* renamed from: d */
    public final String mo68623d() {
        return this.f73716d;
    }

    /* renamed from: e */
    public final String mo68624e() {
        return this.f73714b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28878e)) {
            return false;
        }
        C28878e eVar = (C28878e) obj;
        return C41536l.m120484d(this.f73713a, eVar.f73713a) && C41536l.m120484d(this.f73714b, eVar.f73714b) && C41536l.m120484d(this.f73715c, eVar.f73715c) && C41536l.m120484d(this.f73716d, eVar.f73716d) && C41536l.m120484d(this.f73717e, eVar.f73717e) && C41536l.m120484d(this.f73718f, eVar.f73718f);
    }

    /* renamed from: f */
    public final String mo68626f() {
        return this.f73717e;
    }

    public int hashCode() {
        String str = this.f73713a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f73714b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f73715c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f73716d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f73717e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.f73718f;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        String str = this.f73713a;
        String str2 = this.f73714b;
        String str3 = this.f73715c;
        String str4 = this.f73716d;
        String str5 = this.f73717e;
        Long l = this.f73718f;
        return "PreviouslyInsuredPerson(firstNameKA=" + str + ", lastNameKA=" + str2 + ", firstNameEn=" + str3 + ", lastNameEn=" + str4 + ", pin=" + str5 + ", birthDate=" + l + ")";
    }
}
