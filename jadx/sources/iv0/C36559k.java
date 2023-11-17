package iv0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: iv0.k */
public final class C36559k {

    /* renamed from: a */
    private final List f88118a;

    /* renamed from: b */
    private final boolean f88119b;

    public C36559k(List list, boolean z) {
        C41536l.m120489i(list, "transactionItems");
        this.f88118a = list;
        this.f88119b = z;
    }

    /* renamed from: a */
    public final boolean mo89386a() {
        return this.f88119b;
    }

    /* renamed from: b */
    public final List mo89387b() {
        return this.f88118a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36559k)) {
            return false;
        }
        C36559k kVar = (C36559k) obj;
        return C41536l.m120484d(this.f88118a, kVar.f88118a) && this.f88119b == kVar.f88119b;
    }

    public int hashCode() {
        int hashCode = this.f88118a.hashCode() * 31;
        boolean z = this.f88119b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        List list = this.f88118a;
        boolean z = this.f88119b;
        return "TransactionData(transactionItems=" + list + ", hasMoreRows=" + z + ")";
    }
}
