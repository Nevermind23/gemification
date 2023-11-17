package p782hu;

import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hu.a */
public final class C25065a {

    /* renamed from: a */
    private final double f64413a;

    /* renamed from: b */
    private final String f64414b;

    /* renamed from: c */
    private final boolean f64415c;

    public C25065a(double d, String str, boolean z) {
        C41536l.m120489i(str, "currency");
        this.f64413a = d;
        this.f64414b = str;
        this.f64415c = z;
    }

    /* renamed from: a */
    public final double mo63498a() {
        return this.f64413a;
    }

    /* renamed from: b */
    public final boolean mo63499b() {
        return this.f64415c;
    }

    /* renamed from: c */
    public final String mo63500c() {
        return this.f64414b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25065a)) {
            return false;
        }
        C25065a aVar = (C25065a) obj;
        return Double.compare(this.f64413a, aVar.f64413a) == 0 && C41536l.m120484d(this.f64414b, aVar.f64414b) && this.f64415c == aVar.f64415c;
    }

    public int hashCode() {
        int a = ((Double.doubleToLongBits(this.f64413a) * 31) + this.f64414b.hashCode()) * 31;
        boolean z = this.f64415c;
        if (z) {
            z = true;
        }
        return a + (z ? 1 : 0);
    }

    public String toString() {
        double d = this.f64413a;
        String str = this.f64414b;
        boolean z = this.f64415c;
        return "BnplLimitModel(amount=" + d + ", currency=" + str + ", available=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25065a(double d, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Utils.DOUBLE_EPSILON : d, (i & 2) != 0 ? "GEL" : str, (i & 4) != 0 ? false : z);
    }
}
