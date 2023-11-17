package nc1;

import com.github.mikephil.charting.utils.Utils;
import he1.C41217g;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

/* renamed from: nc1.a */
public final class C41772a {

    /* renamed from: a */
    public static final C41772a f98076a = new C41772a();

    /* renamed from: b */
    private static final C41217g f98077b = C41219i.m119470b(C41773a.f98078d);

    /* renamed from: nc1.a$a */
    static final class C41773a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C41773a f98078d = new C41773a();

        C41773a() {
            super(0);
        }

        /* renamed from: b */
        public final DecimalFormat invoke() {
            return new DecimalFormat("#,###.####", new DecimalFormatSymbols(Locale.US));
        }
    }

    private C41772a() {
    }

    /* renamed from: b */
    private final DecimalFormat m121125b() {
        return (DecimalFormat) f98077b.getValue();
    }

    /* renamed from: a */
    public final String mo96594a(String str, String str2) {
        double d;
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "ccy");
        Double h = C40437u.m117096h(str);
        if (h != null) {
            d = h.doubleValue();
        } else {
            d = Utils.DOUBLE_EPSILON;
        }
        return m121125b().format(d) + ' ' + mo96595c(str2);
    }

    /* renamed from: c */
    public final String mo96595c(String str) {
        C41536l.m120489i(str, "<this>");
        switch (str.hashCode()) {
            case 69026:
                if (!str.equals("EUR")) {
                    return str;
                }
                return "€";
            case 70357:
                if (!str.equals("GBP")) {
                    return str;
                }
                return "£";
            case 70446:
                if (str.equals("GEL")) {
                    return "₾";
                }
                return str;
            case 84326:
                if (!str.equals("USD")) {
                    return str;
                }
                return "$";
            default:
                return str;
        }
    }
}
