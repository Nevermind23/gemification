package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.d */
class C0597d extends Drawable {

    /* renamed from: a */
    private float f2439a;

    /* renamed from: b */
    private final Paint f2440b;

    /* renamed from: c */
    private final RectF f2441c;

    /* renamed from: d */
    private final Rect f2442d;

    /* renamed from: e */
    private float f2443e;

    /* renamed from: f */
    private boolean f2444f = false;

    /* renamed from: g */
    private boolean f2445g = true;

    /* renamed from: h */
    private ColorStateList f2446h;

    /* renamed from: i */
    private PorterDuffColorFilter f2447i;

    /* renamed from: j */
    private ColorStateList f2448j;

    /* renamed from: k */
    private PorterDuff.Mode f2449k = PorterDuff.Mode.SRC_IN;

    C0597d(ColorStateList colorStateList, float f) {
        this.f2439a = f;
        this.f2440b = new Paint(5);
        m2319e(colorStateList);
        this.f2441c = new RectF();
        this.f2442d = new Rect();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m2318a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m2319e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2446h = colorStateList;
        this.f2440b.setColor(colorStateList.getColorForState(getState(), this.f2446h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m2320i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f2441c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f2442d.set(rect);
        if (this.f2444f) {
            float b = C0598e.m2328b(this.f2443e, this.f2439a, this.f2445g);
            this.f2442d.inset((int) Math.ceil((double) C0598e.m2327a(this.f2443e, this.f2439a, this.f2445g)), (int) Math.ceil((double) b));
            this.f2441c.set(this.f2442d);
        }
    }

    /* renamed from: b */
    public ColorStateList mo2543b() {
        return this.f2446h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo2544c() {
        return this.f2443e;
    }

    /* renamed from: d */
    public float mo2545d() {
        return this.f2439a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f2440b;
        if (this.f2447i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f2447i);
            z = true;
        }
        RectF rectF = this.f2441c;
        float f = this.f2439a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    /* renamed from: f */
    public void mo2547f(ColorStateList colorStateList) {
        m2319e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2548g(float f, boolean z, boolean z2) {
        if (f != this.f2443e || this.f2444f != z || this.f2445g != z2) {
            this.f2443e = f;
            this.f2444f = z;
            this.f2445g = z2;
            m2320i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f2442d, this.f2439a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2551h(float f) {
        if (f != this.f2439a) {
            this.f2439a = f;
            m2320i((Rect) null);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2448j;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && (((colorStateList = this.f2446h) == null || !colorStateList.isStateful()) && !super.isStateful())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m2320i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f2446h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f2440b.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f2440b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f2448j;
        if (colorStateList2 == null || (mode = this.f2449k) == null) {
            return z;
        }
        this.f2447i = m2318a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.f2440b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2440b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2448j = colorStateList;
        this.f2447i = m2318a(colorStateList, this.f2449k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f2449k = mode;
        this.f2447i = m2318a(this.f2448j, mode);
        invalidateSelf();
    }
}
