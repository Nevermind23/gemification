package ny0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ny0.d */
public final class C37502d {

    /* renamed from: a */
    private final long f90185a;

    /* renamed from: b */
    private final long f90186b;

    /* renamed from: c */
    private final String f90187c;

    public C37502d(long j, long j2, String str) {
        this.f90185a = j;
        this.f90186b = j2;
        this.f90187c = str;
    }

    /* renamed from: a */
    public final String mo90694a() {
        return this.f90187c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37502d)) {
            return false;
        }
        C37502d dVar = (C37502d) obj;
        return this.f90185a == dVar.f90185a && this.f90186b == dVar.f90186b && C41536l.m120484d(this.f90187c, dVar.f90187c);
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f90185a) * 31) + C7397t.m28148a(this.f90186b)) * 31;
        String str = this.f90187c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.f90185a;
        long j2 = this.f90186b;
        String str = this.f90187c;
        return "DepositBondDetails(clientKey=" + j + ", cdGroupId=" + j2 + ", agreeNo=" + str + ")";
    }
}
