package t10;

import kotlin.jvm.internal.C41536l;

/* renamed from: t10.b */
public final class C28297b {

    /* renamed from: a */
    private final String f71805a;

    /* renamed from: b */
    private final String f71806b;

    /* renamed from: c */
    private final boolean f71807c;

    /* renamed from: d */
    private final String f71808d;

    public C28297b(String str, String str2, boolean z, String str3) {
        this.f71805a = str;
        this.f71806b = str2;
        this.f71807c = z;
        this.f71808d = str3;
    }

    /* renamed from: a */
    public final String mo67933a() {
        return this.f71805a;
    }

    /* renamed from: b */
    public final String mo67934b() {
        return this.f71806b;
    }

    /* renamed from: c */
    public final String mo67935c() {
        return this.f71808d;
    }

    /* renamed from: d */
    public final boolean mo67936d() {
        return this.f71807c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28297b)) {
            return false;
        }
        C28297b bVar = (C28297b) obj;
        return C41536l.m120484d(this.f71805a, bVar.f71805a) && C41536l.m120484d(this.f71806b, bVar.f71806b) && this.f71807c == bVar.f71807c && C41536l.m120484d(this.f71808d, bVar.f71808d);
    }

    public int hashCode() {
        String str = this.f71805a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f71806b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.f71807c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str3 = this.f71808d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.f71805a;
        String str2 = this.f71806b;
        boolean z = this.f71807c;
        String str3 = this.f71808d;
        return "ContactNameItem(fullName=" + str + ", nickName=" + str2 + ", showPhoneNumberInput=" + z + ", phoneNumber=" + str3 + ")";
    }
}
