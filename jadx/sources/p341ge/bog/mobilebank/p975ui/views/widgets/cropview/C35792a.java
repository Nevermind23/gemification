package p341ge.bog.mobilebank.p975ui.views.widgets.cropview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import g91.C32355x0;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;
import p366bk.C10319h;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.a */
class C35792a extends SubsamplingScaleImageView {

    /* renamed from: d */
    int f86458d;

    /* renamed from: e */
    float f86459e;

    /* renamed from: f */
    float f86460f;

    /* renamed from: g */
    float f86461g;

    /* renamed from: h */
    private boolean f86462h;

    public C35792a(Context context, boolean z) {
        this(context, (AttributeSet) null, z);
    }

    /* renamed from: M */
    public Bitmap mo87644M() {
        Rect N = mo87645N();
        return Bitmap.createBitmap(this.bitmap, N.left, N.top, N.width(), N.height());
    }

    /* renamed from: N */
    public Rect mo87645N() {
        PointF viewToSourceCoord = viewToSourceCoord((float) getPaddingLeft(), (float) getPaddingTop());
        PointF viewToSourceCoord2 = viewToSourceCoord((float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
        return new Rect((int) viewToSourceCoord.x, (int) viewToSourceCoord.y, (int) viewToSourceCoord2.x, (int) viewToSourceCoord2.y);
    }

    /* access modifiers changed from: protected */
    public void fitToBounds(boolean z, SubsamplingScaleImageView.ScaleAndTranslate scaleAndTranslate) {
        float f;
        int i;
        if (this.panLimit == 2 && isReady()) {
            z = false;
        }
        PointF pointF = scaleAndTranslate.vTranslate;
        float limitedScale = limitedScale(scaleAndTranslate.scale);
        float sWidth = ((float) sWidth()) * limitedScale;
        float sHeight = ((float) sHeight()) * limitedScale;
        if (this.panLimit == 3 && isReady()) {
            pointF.x = Math.max(pointF.x, ((float) (getWidth() / 2)) - sWidth);
            pointF.y = Math.max(pointF.y, ((float) (getHeight() / 2)) - sHeight);
        } else if (z) {
            pointF.x = Math.max(pointF.x, (((float) getWidth()) - sWidth) - ((float) getPaddingRight()));
            pointF.y = Math.max(pointF.y, (((float) getHeight()) - sHeight) - ((float) getPaddingBottom()));
        } else {
            pointF.x = Math.max(pointF.x, -sWidth);
            pointF.y = Math.max(pointF.y, -sHeight);
        }
        if (this.panLimit == 3 && isReady()) {
            f = (float) Math.max(0, getWidth() / 2);
            i = Math.max(0, getHeight() / 2);
        } else if (z) {
            f = (float) Math.max(0, getPaddingLeft());
            i = Math.max(0, getPaddingTop());
        } else {
            f = (float) Math.max(0, getWidth());
            i = Math.max(0, getHeight());
        }
        pointF.x = Math.min(pointF.x, f);
        pointF.y = Math.min(pointF.y, (float) i);
        scaleAndTranslate.scale = limitedScale;
    }

    /* access modifiers changed from: protected */
    public void onImageLoaded() {
        int i;
        super.onImageLoaded();
        float scale = getScale();
        if (this.bitmap.getHeight() > this.bitmap.getWidth()) {
            if (this.bitmap.getWidth() > getWidth()) {
                i = this.bitmap.getWidth() / getWidth();
            } else {
                i = getWidth() / this.bitmap.getWidth();
            }
            scale = (float) i;
        }
        setScaleAndCenter(scale, new PointF((float) (sWidth() / 2), (float) (sHeight() / 2)));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        this.f86458d = C32355x0.m95511b(16.0f, getContext());
        if (this.f86462h) {
            i5 = (getHeight() - (getWidth() - (this.f86458d * 2))) / 2;
            this.f86459e = ((float) C32355x0.m95521l(getContext())) - (((float) this.f86458d) * 2.0f);
        } else {
            this.f86461g = ((float) C32355x0.m95521l(getContext())) - (((float) this.f86458d) * 2.0f);
            this.f86460f = (float) C32355x0.m95516g(C10319h.product_child_item_height);
            i5 = (int) ((((float) getHeight()) - this.f86460f) / 2.0f);
        }
        int i6 = this.f86458d;
        setPadding(i6, i5, i6, i5);
        setPanLimit(1);
    }

    /* access modifiers changed from: protected */
    public void recalculateMaxScale() {
        float f;
        float f2;
        super.recalculateMaxScale();
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            float height = (float) bitmap.getHeight();
            float width = (float) this.bitmap.getWidth();
            if (this.f86462h) {
                float f3 = this.f86459e;
                f = (f3 * 3.0f) / width;
                f2 = (f3 * 3.0f) / height;
            } else {
                f = (this.f86461g * 3.0f) / width;
                f2 = (this.f86460f * 3.0f) / height;
            }
            float max = Math.max(f, f2);
            if (max < 2.0f) {
                max = 2.0f;
            }
            setMaxScale(max);
        }
    }

    public C35792a(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f86462h = z;
        setOrientation(-1);
        setMinimumScaleType(2);
    }
}
