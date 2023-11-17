package p341ge.bog.chatkit.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0767a;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: ge.bog.chatkit.utils.RoundedImageView */
public class RoundedImageView extends AppCompatImageView {

    /* renamed from: d */
    private int f38610d = 0;

    /* renamed from: e */
    private Drawable f38611e;

    /* renamed from: f */
    private float[] f38612f = {Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON};

    /* renamed from: ge.bog.chatkit.utils.RoundedImageView$a */
    private static class C13120a extends Drawable {

        /* renamed from: a */
        private RectF f38613a = new RectF();

        /* renamed from: b */
        private final RectF f38614b;

        /* renamed from: c */
        private final int f38615c;

        /* renamed from: d */
        private final int f38616d;

        /* renamed from: e */
        private final Paint f38617e;

        /* renamed from: f */
        private BitmapShader f38618f;

        /* renamed from: g */
        private float[] f38619g;

        /* renamed from: h */
        private Path f38620h;

        /* renamed from: i */
        private Bitmap f38621i;

        /* renamed from: j */
        private boolean f38622j;

        private C13120a(Bitmap bitmap, Resources resources) {
            RectF rectF = new RectF();
            this.f38614b = rectF;
            this.f38619g = new float[]{Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON};
            this.f38620h = new Path();
            this.f38622j = false;
            this.f38621i = bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f38618f = new BitmapShader(bitmap, tileMode, tileMode);
            int scaledWidth = bitmap.getScaledWidth(resources.getDisplayMetrics());
            this.f38615c = scaledWidth;
            int scaledHeight = bitmap.getScaledHeight(resources.getDisplayMetrics());
            this.f38616d = scaledHeight;
            rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) scaledWidth, (float) scaledHeight);
            Paint paint = new Paint(1);
            this.f38617e = paint;
            paint.setStyle(Paint.Style.FILL);
            paint.setShader(this.f38618f);
        }

        /* renamed from: c */
        private void m49407c(Matrix matrix) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            int i = 0;
            while (true) {
                float[] fArr2 = this.f38619g;
                if (i < fArr2.length) {
                    fArr2[i] = fArr2[i] / fArr[0];
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: d */
        private void m49408d(Canvas canvas) {
            m49407c(canvas.getMatrix());
            this.f38613a.set(this.f38614b);
        }

        /* renamed from: e */
        private static Bitmap m49409e(Drawable drawable) {
            if (drawable == null) {
                return null;
            }
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            try {
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return createBitmap;
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static C13120a m49410f(Bitmap bitmap, Resources resources) {
            if (bitmap != null) {
                return new C13120a(bitmap, resources);
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static Drawable m49411g(Drawable drawable, Resources resources) {
            if (drawable == null || (drawable instanceof C13120a)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), m49411g(layerDrawable.getDrawable(i), resources));
                }
                return layerDrawable;
            }
            Bitmap e = m49409e(drawable);
            if (e != null) {
                return new C13120a(e, resources);
            }
            return drawable;
        }

        public void draw(Canvas canvas) {
            canvas.save();
            if (!this.f38622j) {
                m49408d(canvas);
                this.f38622j = true;
            }
            this.f38620h.addRoundRect(this.f38613a, this.f38619g, Path.Direction.CW);
            canvas.drawPath(this.f38620h, this.f38617e);
            canvas.restore();
        }

        public int getIntrinsicHeight() {
            return this.f38616d;
        }

        public int getIntrinsicWidth() {
            return this.f38615c;
        }

        public int getOpacity() {
            Bitmap bitmap = this.f38621i;
            return (bitmap == null || bitmap.hasAlpha() || this.f38617e.getAlpha() < 255) ? -3 : -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo34581h(float[] fArr) {
            if (fArr != null) {
                if (fArr.length == 8) {
                    System.arraycopy(fArr, 0, this.f38619g, 0, fArr.length);
                    return;
                }
                throw new ArrayIndexOutOfBoundsException("radii[] needs 8 values");
            }
        }

        public void setAlpha(int i) {
            this.f38617e.setAlpha(i);
            invalidateSelf();
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.f38617e.setColorFilter(colorFilter);
            invalidateSelf();
        }

        public void setDither(boolean z) {
            this.f38617e.setDither(z);
            invalidateSelf();
        }

        public void setFilterBitmap(boolean z) {
            this.f38617e.setFilterBitmap(z);
            invalidateSelf();
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    private Drawable m49401c() {
        Drawable drawable;
        if (this.f38610d != 0) {
            try {
                drawable = C0767a.m2895e(getContext(), this.f38610d);
            } catch (Resources.NotFoundException unused) {
                this.f38610d = 0;
            }
            return C13120a.m49411g(drawable, getResources());
        }
        drawable = null;
        return C13120a.m49411g(drawable, getResources());
    }

    /* renamed from: f */
    private void m49402f() {
        Drawable drawable = this.f38611e;
        if (drawable != null) {
            ((C13120a) drawable).mo34581h(this.f38612f);
        }
    }

    /* renamed from: d */
    public void mo34575d(float f, float f2, float f3, float f4) {
        this.f38612f = new float[]{f, f, f2, f2, f3, f3, f4, f4};
        m49402f();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    /* renamed from: e */
    public void mo34576e(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4 = Utils.FLOAT_EPSILON;
        if (i == 0) {
            f = 0.0f;
        } else {
            f = getResources().getDimension(i);
        }
        if (i2 == 0) {
            f2 = 0.0f;
        } else {
            f2 = getResources().getDimension(i2);
        }
        if (i3 == 0) {
            f3 = 0.0f;
        } else {
            f3 = getResources().getDimension(i3);
        }
        if (i4 != 0) {
            f4 = getResources().getDimension(i4);
        }
        mo34575d(f, f2, f3, f4);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f38610d = 0;
        C13120a b = C13120a.m49410f(bitmap, getResources());
        this.f38611e = b;
        super.setImageDrawable(b);
        m49402f();
    }

    public void setImageDrawable(Drawable drawable) {
        this.f38610d = 0;
        Drawable a = C13120a.m49411g(drawable, getResources());
        this.f38611e = a;
        super.setImageDrawable(a);
        m49402f();
    }

    public void setImageResource(int i) {
        if (this.f38610d != i) {
            this.f38610d = i;
            Drawable c = m49401c();
            this.f38611e = c;
            super.setImageDrawable(c);
            m49402f();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }
}
