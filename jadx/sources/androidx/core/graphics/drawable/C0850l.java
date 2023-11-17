package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.core.graphics.drawable.l */
public abstract class C0850l extends Drawable {

    /* renamed from: a */
    final Bitmap f3480a;

    /* renamed from: b */
    private int f3481b = 160;

    /* renamed from: c */
    private int f3482c = 119;

    /* renamed from: d */
    private final Paint f3483d = new Paint(3);

    /* renamed from: e */
    private final BitmapShader f3484e;

    /* renamed from: f */
    private final Matrix f3485f = new Matrix();

    /* renamed from: g */
    private float f3486g;

    /* renamed from: h */
    final Rect f3487h = new Rect();

    /* renamed from: i */
    private final RectF f3488i = new RectF();

    /* renamed from: j */
    private boolean f3489j = true;

    /* renamed from: k */
    private boolean f3490k;

    /* renamed from: l */
    private int f3491l;

    /* renamed from: m */
    private int f3492m;

    C0850l(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.f3481b = resources.getDisplayMetrics().densityDpi;
        }
        this.f3480a = bitmap;
        if (bitmap != null) {
            m3183a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f3484e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f3492m = -1;
        this.f3491l = -1;
        this.f3484e = null;
    }

    /* renamed from: a */
    private void m3183a() {
        this.f3491l = this.f3480a.getScaledWidth(this.f3481b);
        this.f3492m = this.f3480a.getScaledHeight(this.f3481b);
    }

    /* renamed from: d */
    private static boolean m3184d(float f) {
        return f > 0.05f;
    }

    /* renamed from: e */
    private void m3185e() {
        this.f3486g = (float) (Math.min(this.f3492m, this.f3491l) / 2);
    }

    /* renamed from: b */
    public float mo3313b() {
        return this.f3486g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo3311c(int i, int i2, int i3, Rect rect, Rect rect2);

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f3480a;
        if (bitmap != null) {
            mo3315f();
            if (this.f3483d.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.f3487h, this.f3483d);
                return;
            }
            RectF rectF = this.f3488i;
            float f = this.f3486g;
            canvas.drawRoundRect(rectF, f, f, this.f3483d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3315f() {
        if (this.f3489j) {
            if (this.f3490k) {
                int min = Math.min(this.f3491l, this.f3492m);
                mo3311c(this.f3482c, min, min, getBounds(), this.f3487h);
                int min2 = Math.min(this.f3487h.width(), this.f3487h.height());
                this.f3487h.inset(Math.max(0, (this.f3487h.width() - min2) / 2), Math.max(0, (this.f3487h.height() - min2) / 2));
                this.f3486g = ((float) min2) * 0.5f;
            } else {
                mo3311c(this.f3482c, this.f3491l, this.f3492m, getBounds(), this.f3487h);
            }
            this.f3488i.set(this.f3487h);
            if (this.f3484e != null) {
                Matrix matrix = this.f3485f;
                RectF rectF = this.f3488i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f3485f.preScale(this.f3488i.width() / ((float) this.f3480a.getWidth()), this.f3488i.height() / ((float) this.f3480a.getHeight()));
                this.f3484e.setLocalMatrix(this.f3485f);
                this.f3483d.setShader(this.f3484e);
            }
            this.f3489j = false;
        }
    }

    public int getAlpha() {
        return this.f3483d.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f3483d.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f3492m;
    }

    public int getIntrinsicWidth() {
        return this.f3491l;
    }

    public int getOpacity() {
        Bitmap bitmap;
        if (this.f3482c != 119 || this.f3490k || (bitmap = this.f3480a) == null || bitmap.hasAlpha() || this.f3483d.getAlpha() < 255 || m3184d(this.f3486g)) {
            return -3;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f3490k) {
            m3185e();
        }
        this.f3489j = true;
    }

    public void setAlpha(int i) {
        if (i != this.f3483d.getAlpha()) {
            this.f3483d.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3483d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f3483d.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f3483d.setFilterBitmap(z);
        invalidateSelf();
    }
}
