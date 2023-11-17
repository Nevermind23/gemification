package ug0;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.C41536l;

/* renamed from: ug0.g */
public abstract class C28794g {
    /* renamed from: a */
    public static final String m88258a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C41536l.m120489i(bigDecimal, "profitPercent");
        C41536l.m120489i(bigDecimal2, "profitValue");
        String f = C28786c.m88250f(bigDecimal);
        BigDecimal scale = bigDecimal2.setScale(2, RoundingMode.UP);
        return f + " (" + scale + " $)";
    }
}
