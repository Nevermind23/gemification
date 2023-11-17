package com.google.android.material.internal;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.graphics.C0825b;
import androidx.core.view.C1200m3;
import p080f8.C6170a;

/* renamed from: com.google.android.material.internal.c */
public abstract class C5075c {
    /* renamed from: a */
    public static void m19853a(Window window, boolean z, Integer num, Integer num2) {
        boolean z2;
        boolean z3 = false;
        if (num == null || num.intValue() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (num2 == null || num2.intValue() == 0) {
            z3 = true;
        }
        if (z2 || z3) {
            int b = C6170a.m24581b(window.getContext(), 16842801, -16777216);
            if (z2) {
                num = Integer.valueOf(b);
            }
            if (z3) {
                num2 = Integer.valueOf(b);
            }
        }
        C1200m3.m4286b(window, !z);
        int c = m19855c(window.getContext(), z);
        int b2 = m19854b(window.getContext(), z);
        window.setStatusBarColor(c);
        window.setNavigationBarColor(b2);
        m19858f(window, m19856d(c, C6170a.m24585f(num.intValue())));
        m19857e(window, m19856d(b2, C6170a.m24585f(num2.intValue())));
    }

    /* renamed from: b */
    private static int m19854b(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return C0825b.m3101j(C6170a.m24581b(context, 16843858, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return C6170a.m24581b(context, 16843858, -16777216);
    }

    /* renamed from: c */
    private static int m19855c(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return C6170a.m24581b(context, 16843857, -16777216);
    }

    /* renamed from: d */
    private static boolean m19856d(int i, boolean z) {
        return C6170a.m24585f(i) || (i == 0 && z);
    }

    /* renamed from: e */
    public static void m19857e(Window window, boolean z) {
        C1200m3.m4285a(window, window.getDecorView()).mo3541c(z);
    }

    /* renamed from: f */
    public static void m19858f(Window window, boolean z) {
        C1200m3.m4285a(window, window.getDecorView()).mo3542d(z);
    }
}
