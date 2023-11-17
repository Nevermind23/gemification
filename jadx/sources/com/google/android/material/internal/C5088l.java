package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0483r1;
import p009a8.C0072b;
import p009a8.C0082l;
import p184n8.C7342b;

/* renamed from: com.google.android.material.internal.l */
public abstract class C5088l {

    /* renamed from: a */
    private static final int[] f16254a = {C0072b.f157p};

    /* renamed from: b */
    private static final int[] f16255b = {C0072b.f158q};

    /* renamed from: a */
    public static void m19890a(Context context) {
        m19894e(context, f16254a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m19891b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0082l.f448G8, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C0082l.f468I8, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C0072b.f164z, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m19892c(context);
            }
        }
        m19890a(context);
    }

    /* renamed from: c */
    public static void m19892c(Context context) {
        m19894e(context, f16255b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m19893d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0082l.f448G8, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C0082l.f478J8, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(C0082l.f458H8, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m19895f(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m19894e(Context context, int[] iArr, String str) {
        if (!m19897h(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: f */
    private static boolean m19895f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    public static boolean m19896g(Context context) {
        return C7342b.m27998b(context, C0072b.isMaterial3Theme, false);
    }

    /* renamed from: h */
    private static boolean m19897h(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: i */
    public static TypedArray m19898i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m19891b(context, attributeSet, i, i2);
        m19893d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: j */
    public static C0483r1 m19899j(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m19891b(context, attributeSet, i, i2);
        m19893d(context, attributeSet, iArr, i, i2, iArr2);
        return C0483r1.m1946v(context, attributeSet, iArr, i, i2);
    }
}
