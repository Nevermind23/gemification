package ke0;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;

/* renamed from: ke0.h */
public abstract class C25720h {
    /* renamed from: a */
    private static final String m80953a(Object obj, boolean z, boolean z2) {
        DecimalFormat decimalFormat;
        String str;
        if (z2) {
            decimalFormat = new DecimalFormat("###,##0", new DecimalFormatSymbols(Locale.US));
        } else {
            decimalFormat = new DecimalFormat("###,##0.00", new DecimalFormatSymbols(Locale.US));
        }
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format("%s", Arrays.copyOf(new Object[]{decimalFormat.format(obj)}, 1));
        C41536l.m120488h(format, "format(format, *args)");
        if (z) {
            str = " $";
        } else {
            str = "";
        }
        return format + str;
    }

    /* renamed from: b */
    static /* synthetic */ String m80954b(Object obj, boolean z, boolean z2, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return m80953a(obj, z, z2);
    }
}
