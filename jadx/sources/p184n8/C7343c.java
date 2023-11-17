package p184n8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.C0483r1;
import p009a8.C0082l;
import p045d.C5769a;

/* renamed from: n8.c */
public abstract class C7343c {
    /* renamed from: a */
    public static ColorStateList m28003a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = C5769a.m23209a(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return a;
    }

    /* renamed from: b */
    public static ColorStateList m28004b(Context context, C0483r1 r1Var, int i) {
        int n;
        ColorStateList a;
        if (!r1Var.mo2332s(i) || (n = r1Var.mo2327n(i, 0)) == 0 || (a = C5769a.m23209a(context, n)) == null) {
            return r1Var.mo2316c(i);
        }
        return a;
    }

    /* renamed from: c */
    private static int m28005c(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    /* renamed from: d */
    public static int m28006d(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: e */
    public static Drawable m28007e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = C5769a.m23210b(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return b;
    }

    /* renamed from: f */
    static int m28008f(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: g */
    public static C7344d m28009g(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C7344d(context, resourceId);
    }

    /* renamed from: h */
    public static int m28010h(Context context, int i, int i2) {
        if (i == 0) {
            return i2;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C0082l.f660c7);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(C0082l.f670d7, typedValue);
        obtainStyledAttributes.recycle();
        if (!value) {
            return i2;
        }
        if (m28005c(typedValue) == 2) {
            return Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density);
        }
        return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    /* renamed from: i */
    public static boolean m28011i(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: j */
    public static boolean m28012j(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
