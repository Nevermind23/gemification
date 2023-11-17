package p563pk;

import kotlin.jvm.internal.C41536l;

/* renamed from: pk.j */
public final class C17380j {

    /* renamed from: a */
    private final String f48762a;

    /* renamed from: b */
    private final String f48763b;

    /* renamed from: c */
    private final String f48764c;

    public C17380j(String str, String str2, String str3) {
        this.f48762a = str;
        this.f48763b = str2;
        this.f48764c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17380j)) {
            return false;
        }
        C17380j jVar = (C17380j) obj;
        return C41536l.m120484d(this.f48762a, jVar.f48762a) && C41536l.m120484d(this.f48763b, jVar.f48763b) && C41536l.m120484d(this.f48764c, jVar.f48764c);
    }

    public int hashCode() {
        String str = this.f48762a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f48763b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f48764c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f48762a;
        String str2 = this.f48763b;
        String str3 = this.f48764c;
        return "PaymentPeriod(code=" + str + ", periodGe=" + str2 + ", periodEn=" + str3 + ")";
    }
}
