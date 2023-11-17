package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;

/* renamed from: com.theartofdev.edmodo.cropper.d */
final class C11868d extends Animation implements Animation.AnimationListener {

    /* renamed from: d */
    private final ImageView f34637d;

    /* renamed from: e */
    private final CropOverlayView f34638e;

    /* renamed from: f */
    private final float[] f34639f = new float[8];

    /* renamed from: g */
    private final float[] f34640g = new float[8];

    /* renamed from: h */
    private final RectF f34641h = new RectF();

    /* renamed from: i */
    private final RectF f34642i = new RectF();

    /* renamed from: j */
    private final float[] f34643j = new float[9];

    /* renamed from: k */
    private final float[] f34644k = new float[9];

    /* renamed from: l */
    private final RectF f34645l = new RectF();

    /* renamed from: m */
    private final float[] f34646m = new float[8];

    /* renamed from: n */
    private final float[] f34647n = new float[9];

    public C11868d(ImageView imageView, CropOverlayView cropOverlayView) {
        this.f34637d = imageView;
        this.f34638e = cropOverlayView;
        setDuration(300);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    /* renamed from: a */
    public void mo31864a(float[] fArr, Matrix matrix) {
        System.arraycopy(fArr, 0, this.f34640g, 0, 8);
        this.f34642i.set(this.f34638e.getCropWindowRect());
        matrix.getValues(this.f34644k);
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        float[] fArr;
        RectF rectF = this.f34645l;
        RectF rectF2 = this.f34641h;
        float f2 = rectF2.left;
        RectF rectF3 = this.f34642i;
        rectF.left = f2 + ((rectF3.left - f2) * f);
        float f3 = rectF2.top;
        rectF.top = f3 + ((rectF3.top - f3) * f);
        float f4 = rectF2.right;
        rectF.right = f4 + ((rectF3.right - f4) * f);
        float f5 = rectF2.bottom;
        rectF.bottom = f5 + ((rectF3.bottom - f5) * f);
        this.f34638e.setCropWindowRect(rectF);
        int i = 0;
        int i2 = 0;
        while (true) {
            fArr = this.f34646m;
            if (i2 >= fArr.length) {
                break;
            }
            float f6 = this.f34639f[i2];
            fArr[i2] = f6 + ((this.f34640g[i2] - f6) * f);
            i2++;
        }
        this.f34638e.mo31841s(fArr, this.f34637d.getWidth(), this.f34637d.getHeight());
        while (true) {
            float[] fArr2 = this.f34647n;
            if (i < fArr2.length) {
                float f7 = this.f34643j[i];
                fArr2[i] = f7 + ((this.f34644k[i] - f7) * f);
                i++;
            } else {
                Matrix imageMatrix = this.f34637d.getImageMatrix();
                imageMatrix.setValues(this.f34647n);
                this.f34637d.setImageMatrix(imageMatrix);
                this.f34637d.invalidate();
                this.f34638e.invalidate();
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo31866b(float[] fArr, Matrix matrix) {
        reset();
        System.arraycopy(fArr, 0, this.f34639f, 0, 8);
        this.f34641h.set(this.f34638e.getCropWindowRect());
        matrix.getValues(this.f34643j);
    }

    public void onAnimationEnd(Animation animation) {
        this.f34637d.clearAnimation();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
