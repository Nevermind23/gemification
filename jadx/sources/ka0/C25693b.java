package ka0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ka0.b */
public final class C25693b {

    /* renamed from: a */
    private final String f65415a;

    /* renamed from: b */
    private final String f65416b;

    /* renamed from: c */
    private final String f65417c;

    public C25693b(String str, String str2, String str3) {
        this.f65415a = str;
        this.f65416b = str2;
        this.f65417c = str3;
    }

    /* renamed from: a */
    public final String mo64198a() {
        return this.f65417c;
    }

    /* renamed from: b */
    public final String mo64199b() {
        return this.f65415a;
    }

    /* renamed from: c */
    public final String mo64200c() {
        return this.f65416b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25693b)) {
            return false;
        }
        C25693b bVar = (C25693b) obj;
        return C41536l.m120484d(this.f65415a, bVar.f65415a) && C41536l.m120484d(this.f65416b, bVar.f65416b) && C41536l.m120484d(this.f65417c, bVar.f65417c);
    }

    public int hashCode() {
        String str = this.f65415a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f65416b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f65417c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f65415a;
        String str2 = this.f65416b;
        String str3 = this.f65417c;
        return "DepositFeature(lookupName=" + str + ", lookupValue=" + str2 + ", dictionaryKey=" + str3 + ")";
    }
}
