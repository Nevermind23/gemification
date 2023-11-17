package com.alexandrius.accordionswipelayout.library;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.alexandrius.accordionswipelayout.library.c */
class C2366c extends Animation {

    /* renamed from: d */
    private float f7493d = -1.0f;

    /* renamed from: e */
    private float f7494e = -1.0f;

    /* renamed from: f */
    private final float f7495f;

    /* renamed from: g */
    private View f7496g;

    C2366c(float f, View view) {
        this.f7495f = f;
        this.f7496g = view;
        setDuration(200);
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        if (this.f7493d < Utils.FLOAT_EPSILON) {
            float a = C2365b.m9137a(this.f7496g);
            this.f7493d = a;
            this.f7494e = this.f7495f - a;
        }
        C2365b.m9139c(this.f7496g, this.f7493d + (this.f7494e * f));
    }

    public boolean willChangeBounds() {
        return true;
    }
}
