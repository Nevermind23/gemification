package com.facetec.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;

/* renamed from: com.facetec.sdk.i */
final class C3201i extends TextureView {

    /* renamed from: b */
    private int f10500b;

    /* renamed from: d */
    private int f10501d;

    public C3201i(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.f10501d;
        if (i4 == 0 || (i3 = this.f10500b) == 0) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, (i3 * size) / i4);
        }
    }

    public final void setAspectRatio(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Size cannot be negative.");
        }
        this.f10501d = i;
        this.f10500b = i2;
        requestLayout();
    }

    public C3201i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3201i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10501d = 0;
        this.f10500b = 0;
    }
}
