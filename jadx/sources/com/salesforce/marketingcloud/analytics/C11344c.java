package com.salesforce.marketingcloud.analytics;

import android.annotation.SuppressLint;
import java.util.List;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.analytics.c */
public final class C11344c {
    private C11344c() {
    }

    /* renamed from: a */
    public static String m41478a(List<C11341b> list) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (C11341b next : list) {
            if (next != null) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(next.mo29768c());
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String[] m41479a(String str) {
        return str.split("\\s*,\\s*");
    }
}
