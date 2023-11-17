package tr0;

import kotlin.jvm.internal.C41536l;

/* renamed from: tr0.j */
public final class C38789j {

    /* renamed from: a */
    private final String f92794a;

    /* renamed from: b */
    private final String f92795b;

    /* renamed from: c */
    private final String f92796c;

    /* renamed from: d */
    private final String f92797d;

    /* renamed from: e */
    private final String f92798e;

    public C38789j(String str, String str2, String str3, String str4, String str5) {
        this.f92794a = str;
        this.f92795b = str2;
        this.f92796c = str3;
        this.f92797d = str4;
        this.f92798e = str5;
    }

    /* renamed from: a */
    public final String mo92461a() {
        return this.f92795b;
    }

    /* renamed from: b */
    public final String mo92462b() {
        return this.f92797d;
    }

    /* renamed from: c */
    public final String mo92463c() {
        return this.f92794a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38789j)) {
            return false;
        }
        C38789j jVar = (C38789j) obj;
        return C41536l.m120484d(this.f92794a, jVar.f92794a) && C41536l.m120484d(this.f92795b, jVar.f92795b) && C41536l.m120484d(this.f92796c, jVar.f92796c) && C41536l.m120484d(this.f92797d, jVar.f92797d) && C41536l.m120484d(this.f92798e, jVar.f92798e);
    }

    public int hashCode() {
        String str = this.f92794a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f92795b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f92796c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f92797d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f92798e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.f92794a;
        String str2 = this.f92795b;
        String str3 = this.f92796c;
        String str4 = this.f92797d;
        String str5 = this.f92798e;
        return "OfferedPlanTypes(planTypeDictionaryKey=" + str + ", planType=" + str2 + ", planTypeDictionaryKeyValue=" + str3 + ", planTypeDescDictionaryKey=" + str4 + ", planTypeDescDictionaryKeyValue=" + str5 + ")";
    }
}
