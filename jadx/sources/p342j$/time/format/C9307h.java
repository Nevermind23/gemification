package p342j$.time.format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import p342j$.time.temporal.C9333a;
import p342j$.time.temporal.C9347o;
import p342j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.h */
final class C9307h implements C9306g {

    /* renamed from: a */
    private final TemporalField f25787a;

    /* renamed from: b */
    private final int f25788b;

    /* renamed from: c */
    private final int f25789c;

    /* renamed from: d */
    private final boolean f25790d;

    C9307h(C9333a aVar, int i, int i2, boolean z) {
        if (aVar == null) {
            throw new NullPointerException("field");
        } else if (!aVar.mo25112e().mo25139f()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        } else if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        } else if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        } else if (i2 >= i) {
            this.f25787a = aVar;
            this.f25788b = i;
            this.f25789c = i2;
            this.f25790d = z;
        } else {
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    /* renamed from: a */
    public final boolean mo25039a(C9321v vVar, StringBuilder sb) {
        TemporalField temporalField = this.f25787a;
        Long e = vVar.mo25080e(temporalField);
        if (e == null) {
            return false;
        }
        C9324y b = vVar.mo25077b();
        long longValue = e.longValue();
        C9347o e2 = temporalField.mo25112e();
        e2.mo25135b(temporalField, longValue);
        BigDecimal valueOf = BigDecimal.valueOf(e2.mo25137e());
        BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(e2.mo25136d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        int scale = stripTrailingZeros.scale();
        boolean z = this.f25790d;
        int i = this.f25788b;
        if (scale != 0) {
            String substring = stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), i), this.f25789c), RoundingMode.FLOOR).toPlainString().substring(2);
            b.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        } else if (i <= 0) {
            return true;
        } else {
            if (z) {
                b.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                b.getClass();
                sb.append('0');
            }
            return true;
        }
    }

    public final String toString() {
        String str = this.f25790d ? ",DecimalPoint" : "";
        return "Fraction(" + this.f25787a + "," + this.f25788b + "," + this.f25789c + str + ")";
    }
}
