package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C0825b;
import p030c.C2219j;

/* renamed from: androidx.appcompat.widget.n1 */
public abstract class C0470n1 {

    /* renamed from: a */
    private static final ThreadLocal f2176a = new ThreadLocal();

    /* renamed from: b */
    static final int[] f2177b = {-16842910};

    /* renamed from: c */
    static final int[] f2178c = {16842908};

    /* renamed from: d */
    static final int[] f2179d = {16843518};

    /* renamed from: e */
    static final int[] f2180e = {16842919};

    /* renamed from: f */
    static final int[] f2181f = {16842912};

    /* renamed from: g */
    static final int[] f2182g = {16842913};

    /* renamed from: h */
    static final int[] f2183h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f2184i = new int[0];

    /* renamed from: j */
    private static final int[] f2185j = new int[1];

    /* renamed from: a */
    public static void m1922a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C2219j.f6871y0);
        try {
            if (!obtainStyledAttributes.hasValue(C2219j.f6636D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m1923b(Context context, int i) {
        ColorStateList e = m1926e(context, i);
        if (e != null && e.isStateful()) {
            return e.getColorForState(f2177b, e.getDefaultColor());
        }
        TypedValue f = m1927f();
        context.getTheme().resolveAttribute(16842803, f, true);
        return m1925d(context, i, f.getFloat());
    }

    /* renamed from: c */
    public static int m1924c(Context context, int i) {
        int[] iArr = f2185j;
        iArr[0] = i;
        C0483r1 u = C0483r1.m1945u(context, (AttributeSet) null, iArr);
        try {
            return u.mo2315b(0, 0);
        } finally {
            u.mo2333w();
        }
    }

    /* renamed from: d */
    static int m1925d(Context context, int i, float f) {
        int c = m1924c(context, i);
        return C0825b.m3101j(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: e */
    public static ColorStateList m1926e(Context context, int i) {
        int[] iArr = f2185j;
        iArr[0] = i;
        C0483r1 u = C0483r1.m1945u(context, (AttributeSet) null, iArr);
        try {
            return u.mo2316c(0);
        } finally {
            u.mo2333w();
        }
    }

    /* renamed from: f */
    private static TypedValue m1927f() {
        ThreadLocal threadLocal = f2176a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
