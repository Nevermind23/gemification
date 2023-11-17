package com.alexandrius.accordionswipelayout.library;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import androidx.core.view.ViewCompat;

/* renamed from: com.alexandrius.accordionswipelayout.library.a */
class C2364a extends Animation {

    /* renamed from: d */
    private int f7488d;

    /* renamed from: e */
    private int f7489e = -1;

    /* renamed from: f */
    private View f7490f;

    /* renamed from: g */
    private View f7491g;

    /* renamed from: h */
    private boolean f7492h;

    C2364a(View view, int i, View view2, boolean z) {
        this.f7490f = view;
        this.f7488d = i;
        this.f7491g = view2;
        this.f7492h = z;
        setDuration(300);
        setInterpolator(new DecelerateInterpolator());
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        if (this.f7489e < 0) {
            this.f7489e = this.f7490f.getWidth();
        }
        View view = this.f7490f;
        int i = this.f7489e;
        C2365b.m9140d(view, i + ((int) ((((float) this.f7488d) - ((float) i)) * f)));
        if (this.f7492h) {
            ViewCompat.m3564M0(this.f7491g, (float) this.f7490f.getWidth());
        } else {
            ViewCompat.m3564M0(this.f7491g, (float) (-this.f7490f.getWidth()));
        }
    }

    public boolean willChangeBounds() {
        return true;
    }
}
