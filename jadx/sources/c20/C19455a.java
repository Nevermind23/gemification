package c20;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;

/* renamed from: c20.a */
public final class C19455a {

    /* renamed from: a */
    public static final C19455a f53689a = new C19455a();

    private C19455a() {
    }

    /* renamed from: b */
    public static /* synthetic */ String m64963b(C19455a aVar, Number number, char c, int i, Object obj) {
        if ((i & 2) != 0) {
            c = ' ';
        }
        return aVar.mo47671a(number, c);
    }

    /* renamed from: a */
    public final String mo47671a(Number number, char c) {
        C41536l.m120489i(number, "points");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(c);
        String format = new DecimalFormat("###,###.##", decimalFormatSymbols).format(number);
        C41536l.m120488h(format, "formatter.format(points)");
        return format;
    }
}
