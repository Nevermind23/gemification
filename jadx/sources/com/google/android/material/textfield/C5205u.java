package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

/* renamed from: com.google.android.material.textfield.u */
abstract class C5205u {
    /* renamed from: a */
    static void m20527a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = C0836a.m3156r(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                C0836a.m3153o(drawable, colorStateList);
            } else {
                C0836a.m3153o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(m20528b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                C0836a.m3154p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: b */
    private static int[] m20528b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: c */
    static void m20529c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(m20528b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = C0836a.m3156r(drawable).mutate();
            C0836a.m3153o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: d */
    static void m20530d(CheckableImageButton checkableImageButton) {
    }

    /* renamed from: e */
    private static void m20531e(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean Q = ViewCompat.m3571Q(checkableImageButton);
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (Q || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(Q);
        checkableImageButton.setPressable(Q);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        ViewCompat.m3544C0(checkableImageButton, i);
    }

    /* renamed from: f */
    static void m20532f(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m20531e(checkableImageButton, onLongClickListener);
    }

    /* renamed from: g */
    static void m20533g(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m20531e(checkableImageButton, onLongClickListener);
    }
}
