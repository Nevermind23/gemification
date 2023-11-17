package p058e;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0836a;

/* renamed from: e.c */
public abstract class C5876c extends Drawable implements Drawable.Callback {

    /* renamed from: d */
    private Drawable f18452d;

    public C5876c(Drawable drawable) {
        mo19180a(drawable);
    }

    /* renamed from: a */
    public void mo19180a(Drawable drawable) {
        Drawable drawable2 = this.f18452d;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f18452d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f18452d.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f18452d.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f18452d.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f18452d.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f18452d.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f18452d.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f18452d.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f18452d.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f18452d.getPadding(rect);
    }

    public int[] getState() {
        return this.f18452d.getState();
    }

    public Region getTransparentRegion() {
        return this.f18452d.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0836a.m3146h(this.f18452d);
    }

    public boolean isStateful() {
        return this.f18452d.isStateful();
    }

    public void jumpToCurrentState() {
        this.f18452d.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f18452d.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f18452d.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f18452d.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0836a.m3148j(this.f18452d, z);
    }

    public void setChangingConfigurations(int i) {
        this.f18452d.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f18452d.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f18452d.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f18452d.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0836a.m3149k(this.f18452d, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0836a.m3150l(this.f18452d, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f18452d.setState(iArr);
    }

    public void setTint(int i) {
        C0836a.m3152n(this.f18452d, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0836a.m3153o(this.f18452d, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0836a.m3154p(this.f18452d, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f18452d.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
