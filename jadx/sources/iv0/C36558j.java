package iv0;

import hd0.C24977a;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: iv0.j */
public final class C36558j {

    /* renamed from: a */
    private final C24977a f88115a;

    /* renamed from: b */
    private final String f88116b;

    /* renamed from: c */
    private final long f88117c;

    public C36558j(C24977a aVar, String str, long j) {
        C41536l.m120489i(aVar, "transactionAmount");
        this.f88115a = aVar;
        this.f88116b = str;
        this.f88117c = j;
    }

    /* renamed from: a */
    public final long mo89380a() {
        return this.f88117c;
    }

    /* renamed from: b */
    public final String mo89381b() {
        return this.f88116b;
    }

    /* renamed from: c */
    public final C24977a mo89382c() {
        return this.f88115a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36558j)) {
            return false;
        }
        C36558j jVar = (C36558j) obj;
        return C41536l.m120484d(this.f88115a, jVar.f88115a) && C41536l.m120484d(this.f88116b, jVar.f88116b) && this.f88117c == jVar.f88117c;
    }

    public int hashCode() {
        int hashCode = this.f88115a.hashCode() * 31;
        String str = this.f88116b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + C7397t.m28148a(this.f88117c);
    }

    public String toString() {
        C24977a aVar = this.f88115a;
        String str = this.f88116b;
        long j = this.f88117c;
        return "Transaction(transactionAmount=" + aVar + ", operationTitle=" + str + ", operationDate=" + j + ")";
    }
}
