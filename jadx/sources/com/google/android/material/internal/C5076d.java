package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import p009a8.C0082l;

/* renamed from: com.google.android.material.internal.d */
public abstract class C5076d extends LinearLayoutCompat {

    /* renamed from: s */
    private Drawable f16225s;

    /* renamed from: t */
    private final Rect f16226t = new Rect();

    /* renamed from: u */
    private final Rect f16227u = new Rect();

    /* renamed from: v */
    private int f16228v = 119;

    /* renamed from: w */
    protected boolean f16229w = true;

    /* renamed from: x */
    boolean f16230x = false;

    public C5076d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray i2 = C5088l.m19898i(context, attributeSet, C0082l.f462I2, i, 0, new int[0]);
        this.f16228v = i2.getInt(C0082l.f482K2, this.f16228v);
        Drawable drawable = i2.getDrawable(C0082l.f472J2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f16229w = i2.getBoolean(C0082l.f492L2, true);
        i2.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f16225s;
        if (drawable != null) {
            if (this.f16230x) {
                this.f16230x = false;
                Rect rect = this.f16226t;
                Rect rect2 = this.f16227u;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f16229w) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f16228v, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f16225s;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f16225s;
        if (drawable != null && drawable.isStateful()) {
            this.f16225s.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f16225s;
    }

    public int getForegroundGravity() {
        return this.f16228v;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f16225s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f16230x = z | this.f16230x;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f16230x = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f16225s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f16225s);
            }
            this.f16225s = drawable;
            this.f16230x = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f16228v == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f16228v != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f16228v = i;
            if (i == 119 && this.f16225s != null) {
                this.f16225s.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16225s;
    }
}
