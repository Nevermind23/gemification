package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import p032c1.C2221a;

/* renamed from: androidx.swiperefreshlayout.widget.a */
class C1863a extends ImageView {

    /* renamed from: d */
    private Animation.AnimationListener f5591d;

    /* renamed from: e */
    private int f5592e;

    /* renamed from: f */
    private int f5593f;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    private static class C1864a extends OvalShape {

        /* renamed from: d */
        private Paint f5594d = new Paint();

        /* renamed from: e */
        private int f5595e;

        /* renamed from: f */
        private C1863a f5596f;

        C1864a(C1863a aVar, int i) {
            this.f5596f = aVar;
            this.f5595e = i;
            m7257a((int) rect().width());
        }

        /* renamed from: a */
        private void m7257a(int i) {
            float f = (float) (i / 2);
            this.f5594d.setShader(new RadialGradient(f, f, (float) this.f5595e, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = this.f5596f.getWidth() / 2;
            float f = (float) width;
            float height = (float) (this.f5596f.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f5594d);
            canvas.drawCircle(f, height, (float) (width - this.f5595e), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m7257a((int) f);
        }
    }

    C1863a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (Utils.FLOAT_EPSILON * f);
        this.f5592e = (int) (3.5f * f);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C2221a.f6885f);
        this.f5593f = obtainStyledAttributes.getColor(C2221a.f6886g, -328966);
        obtainStyledAttributes.recycle();
        if (m7255a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.m3635z0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C1864a(this, this.f5592e));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f5592e, (float) i2, (float) i, 503316480);
            int i3 = this.f5592e;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f5593f);
        ViewCompat.m3627v0(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m7255a() {
        return true;
    }

    /* renamed from: b */
    public void mo6204b(Animation.AnimationListener animationListener) {
        this.f5591d = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f5591d;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f5591d;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m7255a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f5592e * 2), getMeasuredHeight() + (this.f5592e * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f5593f = i;
        }
    }
}
