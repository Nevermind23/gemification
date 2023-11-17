package bf0;

import kotlin.jvm.internal.C41536l;

/* renamed from: bf0.a */
public final class C19376a {

    /* renamed from: a */
    private final String f53606a;

    /* renamed from: b */
    private final String f53607b;

    /* renamed from: c */
    private final String f53608c;

    public C19376a(String str, String str2, String str3) {
        C41536l.m120489i(str, "type");
        C41536l.m120489i(str2, "name");
        C41536l.m120489i(str3, "link");
        this.f53606a = str;
        this.f53607b = str2;
        this.f53608c = str3;
    }

    /* renamed from: a */
    public final String mo47588a() {
        return this.f53608c;
    }

    /* renamed from: b */
    public final String mo47589b() {
        return this.f53607b;
    }

    /* renamed from: c */
    public final String mo47590c() {
        return this.f53606a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19376a)) {
            return false;
        }
        C19376a aVar = (C19376a) obj;
        return C41536l.m120484d(this.f53606a, aVar.f53606a) && C41536l.m120484d(this.f53607b, aVar.f53607b) && C41536l.m120484d(this.f53608c, aVar.f53608c);
    }

    public int hashCode() {
        return (((this.f53606a.hashCode() * 31) + this.f53607b.hashCode()) * 31) + this.f53608c.hashCode();
    }

    public String toString() {
        String str = this.f53606a;
        String str2 = this.f53607b;
        String str3 = this.f53608c;
        return "DisclosureTypeModel(type=" + str + ", name=" + str2 + ", link=" + str3 + ")";
    }
}
