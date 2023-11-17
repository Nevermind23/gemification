package p093g8;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import com.google.android.material.internal.C5088l;
import p009a8.C0074d;
import p009a8.C0082l;

/* renamed from: g8.c */
public abstract class C6257c {
    /* renamed from: a */
    public static Rect m24863a(Context context, int i, int i2) {
        TypedArray i3 = C5088l.m19898i(context, (AttributeSet) null, C0082l.f656c3, i, i2, new int[0]);
        int dimensionPixelSize = i3.getDimensionPixelSize(C0082l.f686f3, context.getResources().getDimensionPixelSize(C0074d.f176G));
        int dimensionPixelSize2 = i3.getDimensionPixelSize(C0082l.f696g3, context.getResources().getDimensionPixelSize(C0074d.f177H));
        int dimensionPixelSize3 = i3.getDimensionPixelSize(C0082l.f676e3, context.getResources().getDimensionPixelSize(C0074d.f175F));
        int dimensionPixelSize4 = i3.getDimensionPixelSize(C0082l.f666d3, context.getResources().getDimensionPixelSize(C0074d.f174E));
        i3.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            int i4 = dimensionPixelSize3;
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = i4;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    /* renamed from: b */
    public static InsetDrawable m24864b(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
