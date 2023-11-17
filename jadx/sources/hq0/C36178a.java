package hq0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hq0.a */
public final class C36178a {

    /* renamed from: a */
    private final String f87369a;

    /* renamed from: b */
    private final boolean f87370b;

    public C36178a(String str, boolean z) {
        C41536l.m120489i(str, "amount");
        this.f87369a = str;
        this.f87370b = z;
    }

    /* renamed from: a */
    public final String mo88932a() {
        return this.f87369a;
    }

    /* renamed from: b */
    public final boolean mo88933b() {
        return this.f87370b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36178a)) {
            return false;
        }
        C36178a aVar = (C36178a) obj;
        return C41536l.m120484d(this.f87369a, aVar.f87369a) && this.f87370b == aVar.f87370b;
    }

    public int hashCode() {
        int hashCode = this.f87369a.hashCode() * 31;
        boolean z = this.f87370b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f87369a;
        boolean z = this.f87370b;
        return "AmountInputData(amount=" + str + ", isValid=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36178a(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
