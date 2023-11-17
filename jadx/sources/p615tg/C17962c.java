package p615tg;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;

/* renamed from: tg.c */
public final class C17962c {

    /* renamed from: a */
    public static final C17962c f51156a = new C17962c();

    /* renamed from: b */
    private static final DecimalFormat f51157b = new DecimalFormat("###,##0.00", DecimalFormatSymbols.getInstance(Locale.ROOT));

    private C17962c() {
    }

    /* renamed from: a */
    public final String mo45632a(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "currencyCode");
        DecimalFormat decimalFormat = f51157b;
        decimalFormat.setCurrency(Currency.getInstance(str));
        String format = decimalFormat.format(bigDecimal);
        String a = C17961b.f51154a.mo45631a(str);
        if (a != null) {
            str = a;
        }
        return format + " " + str;
    }
}
