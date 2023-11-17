package com.facetec.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;

/* renamed from: com.facetec.sdk.h */
final class C3179h extends SurfaceView {

    /* renamed from: c */
    private int f10472c;

    /* renamed from: e */
    private int f10473e;

    public C3179h(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.f10472c;
        if (i4 == 0 || (i3 = this.f10473e) == 0) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, (i3 * size) / i4);
        }
    }

    public final void setAspectRatio(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Size cannot be negative.");
        }
        this.f10472c = i;
        this.f10473e = i2;
        requestLayout();
    }

    public C3179h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3179h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10472c = 0;
        this.f10473e = 0;
    }
}
