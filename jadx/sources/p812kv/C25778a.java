package p812kv;

import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: kv.a */
public final class C25778a {

    /* renamed from: a */
    private final boolean f65566a;

    /* renamed from: b */
    private final long f65567b;

    /* renamed from: c */
    private final double f65568c;

    /* renamed from: d */
    private final double f65569d;

    /* renamed from: e */
    private final String f65570e;

    /* renamed from: f */
    private final boolean f65571f;

    /* renamed from: g */
    private final double f65572g;

    /* renamed from: h */
    private final float f65573h;

    public C25778a(boolean z, long j, double d, double d2, String str, boolean z2) {
        double d3;
        boolean z3;
        float f;
        this.f65566a = z;
        this.f65567b = j;
        this.f65568c = d;
        this.f65569d = d2;
        this.f65570e = str;
        this.f65571f = z2;
        if (z2) {
            BigDecimal subtract = new BigDecimal(String.valueOf(d)).subtract(new BigDecimal(String.valueOf(d2)));
            C41536l.m120488h(subtract, "this.subtract(other)");
            d3 = subtract.doubleValue();
        } else {
            d3 = d2;
        }
        this.f65572g = d3;
        Double valueOf = Double.valueOf(d);
        if (valueOf.doubleValue() == Utils.DOUBLE_EPSILON) {
            z3 = true;
        } else {
            z3 = false;
        }
        valueOf = !(z3 ^ true) ? null : valueOf;
        if (valueOf != null) {
            valueOf.doubleValue();
            f = ((float) (d2 / d)) * ((float) 100);
        } else {
            f = 100.0f;
        }
        this.f65573h = f;
    }

    /* renamed from: a */
    public final String mo64371a() {
        return this.f65570e;
    }

    /* renamed from: b */
    public final float mo64372b() {
        return this.f65573h;
    }

    /* renamed from: c */
    public final boolean mo64373c() {
        return this.f65571f;
    }

    /* renamed from: d */
    public final long mo64374d() {
        return this.f65567b;
    }

    /* renamed from: e */
    public final double mo64375e() {
        return this.f65568c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25778a)) {
            return false;
        }
        C25778a aVar = (C25778a) obj;
        return this.f65566a == aVar.f65566a && this.f65567b == aVar.f65567b && Double.compare(this.f65568c, aVar.f65568c) == 0 && Double.compare(this.f65569d, aVar.f65569d) == 0 && C41536l.m120484d(this.f65570e, aVar.f65570e) && this.f65571f == aVar.f65571f;
    }

    /* renamed from: f */
    public final double mo64377f() {
        return this.f65572g;
    }

    /* renamed from: g */
    public final boolean mo64378g() {
        return this.f65566a;
    }

    public int hashCode() {
        boolean z = this.f65566a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int a = (((((((z ? 1 : 0) * true) + C7397t.m28148a(this.f65567b)) * 31) + Double.doubleToLongBits(this.f65568c)) * 31) + Double.doubleToLongBits(this.f65569d)) * 31;
        String str = this.f65570e;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        boolean z3 = this.f65571f;
        if (!z3) {
            z2 = z3;
        }
        return hashCode + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f65566a;
        long j = this.f65567b;
        double d = this.f65568c;
        double d2 = this.f65569d;
        String str = this.f65570e;
        boolean z2 = this.f65571f;
        return "ContactMoneyRequest(isRequestFromContact=" + z + ", requestId=" + j + ", requestedAmount=" + d + ", transferredAmount=" + d2 + ", description=" + str + ", rejected=" + z2 + ")";
    }
}
