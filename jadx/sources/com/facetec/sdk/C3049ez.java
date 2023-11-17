package com.facetec.sdk;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.facetec.sdk.ez */
public final class C3049ez {
    /* renamed from: b */
    public static DateFormat m12704b(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m12705d(i));
        sb.append(" ");
        sb.append(m12703b(i2));
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    /* renamed from: d */
    private static String m12705d(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i == 1) {
            return "MMMM d, yyyy";
        }
        if (i == 2) {
            return "MMM d, yyyy";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i)));
    }

    /* renamed from: b */
    private static String m12703b(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i)));
    }
}
