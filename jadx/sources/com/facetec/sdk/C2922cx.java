package com.facetec.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* renamed from: com.facetec.sdk.cx */
class C2922cx extends RelativeLayout {

    /* renamed from: b */
    private int f9812b = ((int) (((float) Resources.getSystem().getDisplayMetrics().widthPixels) * C2938dc.m12404e()));

    public C2922cx(Context context) {
        super(context);
    }

    public void setXFraction(float f) {
        float f2;
        int i = this.f9812b;
        if (i > 0) {
            f2 = f * ((float) i);
        } else {
            f2 = -9999.0f;
        }
        setX(f2);
    }

    public C2922cx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
