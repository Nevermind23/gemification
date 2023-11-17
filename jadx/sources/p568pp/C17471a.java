package p568pp;

import kotlin.jvm.internal.C41536l;

/* renamed from: pp.a */
public final class C17471a {

    /* renamed from: a */
    private final String f48886a;

    /* renamed from: b */
    private final String f48887b;

    /* renamed from: c */
    private final String f48888c;

    public C17471a(String str, String str2, String str3) {
        C41536l.m120489i(str, "titleKey");
        C41536l.m120489i(str2, "descKey");
        C41536l.m120489i(str3, "imageUrl");
        this.f48886a = str;
        this.f48887b = str2;
        this.f48888c = str3;
    }

    /* renamed from: a */
    public final String mo44975a() {
        return this.f48887b;
    }

    /* renamed from: b */
    public final String mo44976b() {
        return this.f48888c;
    }

    /* renamed from: c */
    public final String mo44977c() {
        return this.f48886a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17471a)) {
            return false;
        }
        C17471a aVar = (C17471a) obj;
        return C41536l.m120484d(this.f48886a, aVar.f48886a) && C41536l.m120484d(this.f48887b, aVar.f48887b) && C41536l.m120484d(this.f48888c, aVar.f48888c);
    }

    public int hashCode() {
        return (((this.f48886a.hashCode() * 31) + this.f48887b.hashCode()) * 31) + this.f48888c.hashCode();
    }

    public String toString() {
        String str = this.f48886a;
        String str2 = this.f48887b;
        String str3 = this.f48888c;
        return "BenefTypeUiModel(titleKey=" + str + ", descKey=" + str2 + ", imageUrl=" + str3 + ")";
    }
}
