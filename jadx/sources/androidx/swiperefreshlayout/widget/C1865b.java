package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.C1008h;
import com.github.mikephil.charting.utils.Utils;
import p124j0.C6633b;

/* renamed from: androidx.swiperefreshlayout.widget.b */
public class C1865b extends Drawable implements Animatable {

    /* renamed from: j */
    private static final Interpolator f5597j = new LinearInterpolator();

    /* renamed from: k */
    private static final Interpolator f5598k = new C6633b();

    /* renamed from: l */
    private static final int[] f5599l = {-16777216};

    /* renamed from: d */
    private final C1868c f5600d;

    /* renamed from: e */
    private float f5601e;

    /* renamed from: f */
    private Resources f5602f;

    /* renamed from: g */
    private Animator f5603g;

    /* renamed from: h */
    float f5604h;

    /* renamed from: i */
    boolean f5605i;

    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    class C1866a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        final /* synthetic */ C1868c f5606d;

        C1866a(C1868c cVar) {
            this.f5606d = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1865b.this.mo6223n(floatValue, this.f5606d);
            C1865b.this.mo6211b(floatValue, this.f5606d, false);
            C1865b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    class C1867b implements Animator.AnimatorListener {

        /* renamed from: d */
        final /* synthetic */ C1868c f5608d;

        C1867b(C1868c cVar) {
            this.f5608d = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            C1865b.this.mo6211b(1.0f, this.f5608d, true);
            this.f5608d.mo6233A();
            this.f5608d.mo6245l();
            C1865b bVar = C1865b.this;
            if (bVar.f5605i) {
                bVar.f5605i = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f5608d.mo6257x(false);
                return;
            }
            bVar.f5604h += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            C1865b.this.f5604h = Utils.FLOAT_EPSILON;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    private static class C1868c {

        /* renamed from: a */
        final RectF f5610a = new RectF();

        /* renamed from: b */
        final Paint f5611b;

        /* renamed from: c */
        final Paint f5612c;

        /* renamed from: d */
        final Paint f5613d;

        /* renamed from: e */
        float f5614e;

        /* renamed from: f */
        float f5615f;

        /* renamed from: g */
        float f5616g;

        /* renamed from: h */
        float f5617h;

        /* renamed from: i */
        int[] f5618i;

        /* renamed from: j */
        int f5619j;

        /* renamed from: k */
        float f5620k;

        /* renamed from: l */
        float f5621l;

        /* renamed from: m */
        float f5622m;

        /* renamed from: n */
        boolean f5623n;

        /* renamed from: o */
        Path f5624o;

        /* renamed from: p */
        float f5625p;

        /* renamed from: q */
        float f5626q;

        /* renamed from: r */
        int f5627r;

        /* renamed from: s */
        int f5628s;

        /* renamed from: t */
        int f5629t;

        /* renamed from: u */
        int f5630u;

        C1868c() {
            Paint paint = new Paint();
            this.f5611b = paint;
            Paint paint2 = new Paint();
            this.f5612c = paint2;
            Paint paint3 = new Paint();
            this.f5613d = paint3;
            this.f5614e = Utils.FLOAT_EPSILON;
            this.f5615f = Utils.FLOAT_EPSILON;
            this.f5616g = Utils.FLOAT_EPSILON;
            this.f5617h = 5.0f;
            this.f5625p = 1.0f;
            this.f5629t = C11051p3.f31759c;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo6233A() {
            this.f5620k = this.f5614e;
            this.f5621l = this.f5615f;
            this.f5622m = this.f5616g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6234a(Canvas canvas, Rect rect) {
            RectF rectF = this.f5610a;
            float f = this.f5626q;
            float f2 = (this.f5617h / 2.0f) + f;
            if (f <= Utils.FLOAT_EPSILON) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f5627r) * this.f5625p) / 2.0f, this.f5617h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f5614e;
            float f4 = this.f5616g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f5615f + f4) * 360.0f) - f5;
            this.f5611b.setColor(this.f5630u);
            this.f5611b.setAlpha(this.f5629t);
            float f7 = this.f5617h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f5613d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f5611b);
            mo6235b(canvas, f5, f6, rectF);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6235b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f5623n) {
                Path path = this.f5624o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f5624o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f5624o.moveTo(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                this.f5624o.lineTo(((float) this.f5627r) * this.f5625p, Utils.FLOAT_EPSILON);
                Path path3 = this.f5624o;
                float f3 = this.f5625p;
                path3.lineTo((((float) this.f5627r) * f3) / 2.0f, ((float) this.f5628s) * f3);
                this.f5624o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f5627r) * this.f5625p) / 2.0f), rectF.centerY() + (this.f5617h / 2.0f));
                this.f5624o.close();
                this.f5612c.setColor(this.f5630u);
                this.f5612c.setAlpha(this.f5629t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f5624o, this.f5612c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo6236c() {
            return this.f5629t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public float mo6237d() {
            return this.f5615f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo6238e() {
            return this.f5618i[mo6239f()];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo6239f() {
            return (this.f5619j + 1) % this.f5618i.length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public float mo6240g() {
            return this.f5614e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo6241h() {
            return this.f5618i[this.f5619j];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public float mo6242i() {
            return this.f5621l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public float mo6243j() {
            return this.f5622m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public float mo6244k() {
            return this.f5620k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo6245l() {
            mo6253t(mo6239f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo6246m() {
            this.f5620k = Utils.FLOAT_EPSILON;
            this.f5621l = Utils.FLOAT_EPSILON;
            this.f5622m = Utils.FLOAT_EPSILON;
            mo6258y(Utils.FLOAT_EPSILON);
            mo6255v(Utils.FLOAT_EPSILON);
            mo6256w(Utils.FLOAT_EPSILON);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo6247n(int i) {
            this.f5629t = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo6248o(float f, float f2) {
            this.f5627r = (int) f;
            this.f5628s = (int) f2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo6249p(float f) {
            if (f != this.f5625p) {
                this.f5625p = f;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo6250q(float f) {
            this.f5626q = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo6251r(int i) {
            this.f5630u = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo6252s(ColorFilter colorFilter) {
            this.f5611b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo6253t(int i) {
            this.f5619j = i;
            this.f5630u = this.f5618i[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo6254u(int[] iArr) {
            this.f5618i = iArr;
            mo6253t(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo6255v(float f) {
            this.f5615f = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo6256w(float f) {
            this.f5616g = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo6257x(boolean z) {
            if (this.f5623n != z) {
                this.f5623n = z;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo6258y(float f) {
            this.f5614e = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo6259z(float f) {
            this.f5617h = f;
            this.f5611b.setStrokeWidth(f);
        }
    }

    public C1865b(Context context) {
        this.f5602f = ((Context) C1008h.m3530g(context)).getResources();
        C1868c cVar = new C1868c();
        this.f5600d = cVar;
        cVar.mo6254u(f5599l);
        mo6221k(2.5f);
        m7262m();
    }

    /* renamed from: a */
    private void m7258a(float f, C1868c cVar) {
        mo6223n(f, cVar);
        cVar.mo6258y(cVar.mo6244k() + (((cVar.mo6242i() - 0.01f) - cVar.mo6244k()) * f));
        cVar.mo6255v(cVar.mo6242i());
        cVar.mo6256w(cVar.mo6243j() + ((((float) (Math.floor((double) (cVar.mo6243j() / 0.8f)) + 1.0d)) - cVar.mo6243j()) * f));
    }

    /* renamed from: c */
    private int m7259c(float f, int i, int i2) {
        int i3 = (i >> 24) & C11051p3.f31759c;
        int i4 = (i >> 16) & C11051p3.f31759c;
        int i5 = (i >> 8) & C11051p3.f31759c;
        int i6 = i & C11051p3.f31759c;
        return ((i3 + ((int) (((float) (((i2 >> 24) & C11051p3.f31759c) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & C11051p3.f31759c) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & C11051p3.f31759c) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & C11051p3.f31759c) - i6)))));
    }

    /* renamed from: h */
    private void m7260h(float f) {
        this.f5601e = f;
    }

    /* renamed from: i */
    private void m7261i(float f, float f2, float f3, float f4) {
        C1868c cVar = this.f5600d;
        float f5 = this.f5602f.getDisplayMetrics().density;
        cVar.mo6259z(f2 * f5);
        cVar.mo6250q(f * f5);
        cVar.mo6253t(0);
        cVar.mo6248o(f3 * f5, f4 * f5);
    }

    /* renamed from: m */
    private void m7262m() {
        C1868c cVar = this.f5600d;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 1.0f});
        ofFloat.addUpdateListener(new C1866a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f5597j);
        ofFloat.addListener(new C1867b(cVar));
        this.f5603g = ofFloat;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6211b(float f, C1868c cVar, boolean z) {
        float f2;
        float f3;
        if (this.f5605i) {
            m7258a(f, cVar);
        } else if (f != 1.0f || z) {
            float j = cVar.mo6243j();
            if (f < 0.5f) {
                f2 = cVar.mo6244k();
                f3 = (f5598k.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float k = cVar.mo6244k() + 0.79f;
                float f4 = k;
                f2 = k - (((1.0f - f5598k.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f4;
            }
            cVar.mo6258y(f2);
            cVar.mo6255v(f3);
            cVar.mo6256w(j + (0.20999998f * f));
            m7260h((f + this.f5604h) * 216.0f);
        }
    }

    /* renamed from: d */
    public void mo6212d(boolean z) {
        this.f5600d.mo6257x(z);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f5601e, bounds.exactCenterX(), bounds.exactCenterY());
        this.f5600d.mo6234a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void mo6214e(float f) {
        this.f5600d.mo6249p(f);
        invalidateSelf();
    }

    /* renamed from: f */
    public void mo6215f(int... iArr) {
        this.f5600d.mo6254u(iArr);
        this.f5600d.mo6253t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void mo6216g(float f) {
        this.f5600d.mo6256w(f);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f5600d.mo6236c();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f5603g.isRunning();
    }

    /* renamed from: j */
    public void mo6220j(float f, float f2) {
        this.f5600d.mo6258y(f);
        this.f5600d.mo6255v(f2);
        invalidateSelf();
    }

    /* renamed from: k */
    public void mo6221k(float f) {
        this.f5600d.mo6259z(f);
        invalidateSelf();
    }

    /* renamed from: l */
    public void mo6222l(int i) {
        if (i == 0) {
            m7261i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m7261i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo6223n(float f, C1868c cVar) {
        if (f > 0.75f) {
            cVar.mo6251r(m7259c((f - 0.75f) / 0.25f, cVar.mo6241h(), cVar.mo6238e()));
        } else {
            cVar.mo6251r(cVar.mo6241h());
        }
    }

    public void setAlpha(int i) {
        this.f5600d.mo6247n(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f5600d.mo6252s(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f5603g.cancel();
        this.f5600d.mo6233A();
        if (this.f5600d.mo6237d() != this.f5600d.mo6240g()) {
            this.f5605i = true;
            this.f5603g.setDuration(666);
            this.f5603g.start();
            return;
        }
        this.f5600d.mo6253t(0);
        this.f5600d.mo6246m();
        this.f5603g.setDuration(1332);
        this.f5603g.start();
    }

    public void stop() {
        this.f5603g.cancel();
        m7260h(Utils.FLOAT_EPSILON);
        this.f5600d.mo6257x(false);
        this.f5600d.mo6253t(0);
        this.f5600d.mo6246m();
        invalidateSelf();
    }
}
