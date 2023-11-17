package ka0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ka0.f */
public final class C25697f {

    /* renamed from: a */
    private final Long f65454a;

    /* renamed from: b */
    private final Long f65455b;

    /* renamed from: c */
    private final String f65456c;

    public C25697f(Long l, Long l2, String str) {
        this.f65454a = l;
        this.f65455b = l2;
        this.f65456c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25697f)) {
            return false;
        }
        C25697f fVar = (C25697f) obj;
        return C41536l.m120484d(this.f65454a, fVar.f65454a) && C41536l.m120484d(this.f65455b, fVar.f65455b) && C41536l.m120484d(this.f65456c, fVar.f65456c);
    }

    public int hashCode() {
        Long l = this.f65454a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f65455b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f65456c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Long l = this.f65454a;
        Long l2 = this.f65455b;
        String str = this.f65456c;
        return "Deposits(agreeKey=" + l + ", appId=" + l2 + ", depositPdfUrl=" + str + ")";
    }
}
