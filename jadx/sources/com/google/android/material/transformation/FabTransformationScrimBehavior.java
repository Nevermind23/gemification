package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p026b8.C2174e;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: b */
    private final C2174e f16779b = new C2174e(75, 150);

    /* renamed from: c */
    private final C2174e f16780c = new C2174e(0, 150);

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: D */
    public boolean mo3034D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo3034D(coordinatorLayout, view, motionEvent);
    }

    /* renamed from: e */
    public boolean mo3039e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
