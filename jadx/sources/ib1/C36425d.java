package ib1;

import java.util.Locale;
import kotlin.jvm.internal.C41536l;

/* renamed from: ib1.d */
public enum C36425d {
    SUCCESS,
    FAIL;

    /* renamed from: b */
    public final String mo89240b() {
        String name = name();
        Locale locale = Locale.getDefault();
        C41536l.m120488h(locale, "getDefault()");
        String lowerCase = name.toLowerCase(locale);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
