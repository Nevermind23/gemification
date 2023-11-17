package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;

/* renamed from: com.google.android.material.internal.e */
public abstract class C5077e {
    /* renamed from: a */
    public static boolean m19859a() {
        return m19860b() || m19862d();
    }

    /* renamed from: b */
    public static boolean m19860b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("lge");
    }

    /* renamed from: c */
    public static boolean m19861c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }

    /* renamed from: d */
    public static boolean m19862d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("samsung");
    }
}
