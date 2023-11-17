package com.google.maps.android.p044ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.google.maps.android.ui.RotationLayout */
public class RotationLayout extends FrameLayout {

    /* renamed from: d */
    private int f17816d;

    public RotationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void dispatchDraw(Canvas canvas) {
        int i = this.f17816d;
        if (i == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (i == 1) {
            canvas.translate((float) getWidth(), Utils.FLOAT_EPSILON);
            canvas.rotate(90.0f, (float) (getWidth() / 2), Utils.FLOAT_EPSILON);
            canvas.translate((float) (getHeight() / 2), (float) (getWidth() / 2));
        } else if (i == 2) {
            canvas.rotate(180.0f, (float) (getWidth() / 2), (float) (getHeight() / 2));
        } else {
            canvas.translate(Utils.FLOAT_EPSILON, (float) getHeight());
            canvas.rotate(270.0f, (float) (getWidth() / 2), Utils.FLOAT_EPSILON);
            canvas.translate((float) (getHeight() / 2), (float) ((-getWidth()) / 2));
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.f17816d;
        if (i3 == 1 || i3 == 3) {
            super.onMeasure(i, i2);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setViewRotation(int i) {
        this.f17816d = ((i + 360) % 360) / 90;
    }
}
