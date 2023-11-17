package p668xg;

import java.util.Currency;
import kotlin.jvm.internal.C41536l;

/* renamed from: xg.c */
public final class C18761c {

    /* renamed from: a */
    private final Currency f52438a;

    /* renamed from: b */
    private final boolean f52439b;

    /* renamed from: c */
    private final boolean f52440c;

    public C18761c(Currency currency, boolean z, boolean z2) {
        C41536l.m120489i(currency, "currency");
        this.f52438a = currency;
        this.f52439b = z;
        this.f52440c = z2;
    }

    /* renamed from: a */
    public final boolean mo46537a() {
        return this.f52440c;
    }

    /* renamed from: b */
    public final Currency mo46538b() {
        return this.f52438a;
    }

    /* renamed from: c */
    public final boolean mo46539c() {
        return this.f52439b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18761c)) {
            return false;
        }
        C18761c cVar = (C18761c) obj;
        return C41536l.m120484d(this.f52438a, cVar.f52438a) && this.f52439b == cVar.f52439b && this.f52440c == cVar.f52440c;
    }

    public int hashCode() {
        int hashCode = this.f52438a.hashCode() * 31;
        boolean z = this.f52439b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f52440c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        Currency currency = this.f52438a;
        boolean z = this.f52439b;
        boolean z2 = this.f52440c;
        return "AmountSignInfo(currency=" + currency + ", enabled=" + z + ", activated=" + z2 + ")";
    }
}
