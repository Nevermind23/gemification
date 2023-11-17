package m70;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: m70.j */
public final class C26157j {

    /* renamed from: a */
    private final long f66357a;

    /* renamed from: b */
    private final String f66358b;

    /* renamed from: c */
    private final long f66359c;

    public C26157j(long j, String str, long j2) {
        C41536l.m120489i(str, "acctNo");
        this.f66357a = j;
        this.f66358b = str;
        this.f66359c = j2;
    }

    /* renamed from: a */
    public final long mo65194a() {
        return this.f66357a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26157j)) {
            return false;
        }
        C26157j jVar = (C26157j) obj;
        return this.f66357a == jVar.f66357a && C41536l.m120484d(this.f66358b, jVar.f66358b) && this.f66359c == jVar.f66359c;
    }

    public int hashCode() {
        return (((C7397t.m28148a(this.f66357a) * 31) + this.f66358b.hashCode()) * 31) + C7397t.m28148a(this.f66359c);
    }

    public String toString() {
        long j = this.f66357a;
        String str = this.f66358b;
        long j2 = this.f66359c;
        return "ClosableAccount(acctKey=" + j + ", acctNo=" + str + ", clientKey=" + j2 + ")";
    }
}
