package ke0;

import g91.C32343x;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.C41536l;

/* renamed from: ke0.i */
public abstract class C25721i {
    /* renamed from: a */
    public static final BigDecimal m80955a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.valueOf(0);
            C41536l.m120488h(bigDecimal, "valueOf(this.toLong())");
        }
        if (bigDecimal2 == null) {
            bigDecimal2 = BigDecimal.valueOf(0);
            C41536l.m120488h(bigDecimal2, "valueOf(this.toLong())");
        }
        if (bigDecimal2.compareTo(BigDecimal.ZERO) == 0) {
            BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
            C41536l.m120488h(subtract, "this.subtract(other)");
            BigDecimal multiply = subtract.multiply(new BigDecimal(100));
            C41536l.m120488h(multiply, "this.multiply(other)");
            return C32343x.m95427Y0(multiply, 2);
        }
        BigDecimal subtract2 = bigDecimal.subtract(bigDecimal2);
        C41536l.m120488h(subtract2, "this.subtract(other)");
        BigDecimal multiply2 = subtract2.multiply(new BigDecimal(100));
        C41536l.m120488h(multiply2, "this.multiply(other)");
        BigDecimal divide = multiply2.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        C41536l.m120488h(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return C32343x.m95427Y0(divide, 2);
    }
}
