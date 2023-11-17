package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i */
public final class C4222i implements C4358q {

    /* renamed from: d */
    private final Double f13324d;

    public C4222i(Double d) {
        if (d == null) {
            this.f13324d = Double.valueOf(Double.NaN);
        } else {
            this.f13324d = d;
        }
    }

    /* renamed from: b */
    public final C4358q mo13077b() {
        return new C4222i(this.f13324d);
    }

    /* renamed from: c */
    public final String mo13078c() {
        int i;
        if (Double.isNaN(this.f13324d.doubleValue())) {
            return "NaN";
        }
        if (!Double.isInfinite(this.f13324d.doubleValue())) {
            BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f13324d.doubleValue()).stripTrailingZeros();
            DecimalFormat decimalFormat = new DecimalFormat("0E0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            if (stripTrailingZeros.scale() > 0) {
                i = stripTrailingZeros.precision();
            } else {
                i = stripTrailingZeros.scale();
            }
            decimalFormat.setMinimumFractionDigits(i - 1);
            String format = decimalFormat.format(stripTrailingZeros);
            int indexOf = format.indexOf("E");
            if (indexOf <= 0) {
                return format;
            }
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) {
                return format.replace("E-", "e-").replace("E", "e+");
            }
            return stripTrailingZeros.toPlainString();
        } else if (this.f13324d.doubleValue() > Utils.DOUBLE_EPSILON) {
            return "Infinity";
        } else {
            return "-Infinity";
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4222i)) {
            return false;
        }
        return this.f13324d.equals(((C4222i) obj).f13324d);
    }

    public final int hashCode() {
        return this.f13324d.hashCode();
    }

    public final String toString() {
        return mo13078c();
    }

    /* renamed from: u */
    public final Double mo13091u() {
        return this.f13324d;
    }

    /* renamed from: v */
    public final Boolean mo13092v() {
        boolean z = false;
        if (!Double.isNaN(this.f13324d.doubleValue()) && this.f13324d.doubleValue() != Utils.DOUBLE_EPSILON) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: w */
    public final Iterator mo13093w() {
        return null;
    }

    /* renamed from: x */
    public final C4358q mo13094x(String str, C4363q4 q4Var, List list) {
        if ("toString".equals(str)) {
            return new C4426u(mo13078c());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{mo13078c(), str}));
    }
}
