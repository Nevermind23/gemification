package com.facetec.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.facetec.sdk.j */
final class C3223j extends LinearLayout {
    public C3223j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEnabled(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m12990e(Runnable runnable, View view) {
        if (isEnabled()) {
            setEnabled(false);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (!isEnabled()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            setAlpha(0.4f);
            postInvalidate();
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getX() < Utils.FLOAT_EPSILON || motionEvent.getX() > ((float) getWidth()) || motionEvent.getY() < Utils.FLOAT_EPSILON || motionEvent.getY() > ((float) getHeight())) {
            setAlpha(1.0f);
            postInvalidate();
        }
        return true;
    }

    public final void setOnClickRunnable(Runnable runnable) {
        setEnabled(true);
        setClickable(true);
        setOnClickListener(new C3624uj(this, runnable));
    }
}
