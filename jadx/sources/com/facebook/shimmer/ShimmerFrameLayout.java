package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.shimmer.C2736a;
import p116i5.C6571a;

public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: d */
    private final Paint f8557d = new Paint();

    /* renamed from: e */
    private final C2740b f8558e = new C2740b();

    /* renamed from: f */
    private boolean f8559f = true;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10600b(context, attributeSet);
    }

    /* renamed from: b */
    private void m10600b(Context context, AttributeSet attributeSet) {
        C2736a.C2738b bVar;
        setWillNotDraw(false);
        this.f8558e.setCallback(this);
        if (attributeSet == null) {
            mo8653c(new C2736a.C2737a().mo8668a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6571a.f20046a, 0, 0);
        try {
            int i = C6571a.f20051f;
            if (!obtainStyledAttributes.hasValue(i) || !obtainStyledAttributes.getBoolean(i, false)) {
                bVar = new C2736a.C2737a();
            } else {
                bVar = new C2736a.C2739c();
            }
            mo8653c(bVar.mo8669c(obtainStyledAttributes).mo8668a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void mo8652a() {
        if (this.f8559f) {
            mo8657f();
            this.f8559f = false;
            invalidate();
        }
    }

    /* renamed from: c */
    public ShimmerFrameLayout mo8653c(C2736a aVar) {
        this.f8558e.mo8693d(aVar);
        if (aVar == null || !aVar.f8574o) {
            setLayerType(0, (Paint) null);
        } else {
            setLayerType(2, this.f8557d);
        }
        return this;
    }

    /* renamed from: d */
    public void mo8654d(boolean z) {
        if (!this.f8559f) {
            this.f8559f = true;
            if (z) {
                mo8656e();
            }
        }
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f8559f) {
            this.f8558e.draw(canvas);
        }
    }

    /* renamed from: e */
    public void mo8656e() {
        this.f8558e.mo8695e();
    }

    /* renamed from: f */
    public void mo8657f() {
        this.f8558e.mo8696f();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8558e.mo8692b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo8657f();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f8558e.setBounds(0, 0, getWidth(), getHeight());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8558e;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m10600b(context, attributeSet);
    }
}
