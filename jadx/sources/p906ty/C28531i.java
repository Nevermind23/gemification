package p906ty;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ty.i */
public final class C28531i {

    /* renamed from: a */
    private final long f72427a;

    /* renamed from: b */
    private final String f72428b;

    /* renamed from: c */
    private final Double f72429c;

    public C28531i(long j, String str, Double d) {
        this.f72427a = j;
        this.f72428b = str;
        this.f72429c = d;
    }

    /* renamed from: a */
    public final String mo68243a() {
        return this.f72428b;
    }

    /* renamed from: b */
    public final long mo68244b() {
        return this.f72427a;
    }

    /* renamed from: c */
    public final Double mo68245c() {
        return this.f72429c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28531i)) {
            return false;
        }
        C28531i iVar = (C28531i) obj;
        return this.f72427a == iVar.f72427a && C41536l.m120484d(this.f72428b, iVar.f72428b) && C41536l.m120484d(this.f72429c, iVar.f72429c);
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f72427a) * 31;
        String str = this.f72428b;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f72429c;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.f72427a;
        String str = this.f72428b;
        Double d = this.f72429c;
        return "CasTotal(clientKey=" + j + ", ccy=" + str + ", totalAmount=" + d + ")";
    }
}
