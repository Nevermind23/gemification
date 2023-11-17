package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.util.Collection;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.util.j */
public final class C11821j {
    private C11821j() {
    }

    /* renamed from: a */
    public static <T extends CharSequence> T m43271a(T t, String str) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: a */
    public static <T> T m43272a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static <T extends Collection> T m43273a(T t, String str) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: a */
    public static boolean m43274a(boolean z, String str) {
        if (z) {
            return true;
        }
        throw new IllegalArgumentException(str);
    }
}
