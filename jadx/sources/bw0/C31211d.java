package bw0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: bw0.d */
public final class C31211d {

    /* renamed from: a */
    private final long f77572a;

    /* renamed from: b */
    private final String f77573b;

    public C31211d(long j, String str) {
        C41536l.m120489i(str, "p2pWebStartUrl");
        this.f77572a = j;
        this.f77573b = str;
    }

    /* renamed from: a */
    public final String mo71452a() {
        return this.f77573b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31211d)) {
            return false;
        }
        C31211d dVar = (C31211d) obj;
        return this.f77572a == dVar.f77572a && C41536l.m120484d(this.f77573b, dVar.f77573b);
    }

    public int hashCode() {
        return (C7397t.m28148a(this.f77572a) * 31) + this.f77573b.hashCode();
    }

    public String toString() {
        long j = this.f77572a;
        String str = this.f77573b;
        return "CreateInComeTopUpPayment(opDocKey=" + j + ", p2pWebStartUrl=" + str + ")";
    }
}
