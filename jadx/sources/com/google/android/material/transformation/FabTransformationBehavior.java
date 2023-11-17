package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: b */
    private final Rect f16775b = new Rect();

    /* renamed from: c */
    private final RectF f16776c = new RectF();

    /* renamed from: d */
    private final RectF f16777d = new RectF();

    /* renamed from: e */
    private final int[] f16778e = new int[2];

    public FabTransformationBehavior() {
    }

    /* renamed from: e */
    public boolean mo3039e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    /* renamed from: g */
    public void mo3041g(CoordinatorLayout.C0647f fVar) {
        if (fVar.f3222h == 0) {
            fVar.f3222h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
