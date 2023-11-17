package cf1;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: cf1.u */
abstract class C40437u extends C40436t {
    /* renamed from: g */
    public static BigDecimal m117095g(String str) {
        C41536l.m120489i(str, "<this>");
        try {
            if (C40427m.f96037b.mo94489f(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Double m117096h(String str) {
        C41536l.m120489i(str, "<this>");
        try {
            if (C40427m.f96037b.mo94489f(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static Float m117097i(String str) {
        C41536l.m120489i(str, "<this>");
        try {
            if (C40427m.f96037b.mo94489f(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
