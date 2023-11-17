package p852ov;

import kotlin.jvm.internal.C41536l;

/* renamed from: ov.e */
public final class C27091e {

    /* renamed from: a */
    private final String f68050a;

    /* renamed from: b */
    private final String f68051b;

    public C27091e(String str, String str2) {
        C41536l.m120489i(str, "productCode");
        this.f68050a = str;
        this.f68051b = str2;
    }

    /* renamed from: a */
    public final String mo66367a() {
        return this.f68051b;
    }

    /* renamed from: b */
    public final String mo66368b() {
        return this.f68050a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27091e)) {
            return false;
        }
        C27091e eVar = (C27091e) obj;
        return C41536l.m120484d(this.f68050a, eVar.f68050a) && C41536l.m120484d(this.f68051b, eVar.f68051b);
    }

    public int hashCode() {
        int hashCode = this.f68050a.hashCode() * 31;
        String str = this.f68051b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f68050a;
        String str2 = this.f68051b;
        return "OfferProduct(productCode=" + str + ", offerDtl=" + str2 + ")";
    }
}
