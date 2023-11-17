package p668xg;

import java.math.BigDecimal;
import java.util.Currency;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: xg.d */
public final class C18762d {

    /* renamed from: a */
    private final Currency f52441a;

    /* renamed from: b */
    private final BigDecimal f52442b;

    /* renamed from: c */
    private final boolean f52443c;

    public C18762d(Currency currency, BigDecimal bigDecimal, boolean z) {
        C41536l.m120489i(currency, "currency");
        C41536l.m120489i(bigDecimal, "amount");
        this.f52441a = currency;
        this.f52442b = bigDecimal;
        this.f52443c = z;
    }

    /* renamed from: a */
    public final BigDecimal mo46543a() {
        return this.f52442b;
    }

    /* renamed from: b */
    public final Currency mo46544b() {
        return this.f52441a;
    }

    /* renamed from: c */
    public final boolean mo46545c() {
        return this.f52443c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18762d)) {
            return false;
        }
        C18762d dVar = (C18762d) obj;
        return C41536l.m120484d(this.f52441a, dVar.f52441a) && C41536l.m120484d(this.f52442b, dVar.f52442b) && this.f52443c == dVar.f52443c;
    }

    public int hashCode() {
        int hashCode = ((this.f52441a.hashCode() * 31) + this.f52442b.hashCode()) * 31;
        boolean z = this.f52443c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        Currency currency = this.f52441a;
        BigDecimal bigDecimal = this.f52442b;
        boolean z = this.f52443c;
        return "CurrencyInfo(currency=" + currency + ", amount=" + bigDecimal + ", showAmount=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18762d(Currency currency, BigDecimal bigDecimal, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(currency, bigDecimal, (i & 4) != 0 ? true : z);
    }
}
