package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.util.Arrays;

public class CropOverlayView extends View {

    /* renamed from: A */
    private float f34563A = (((float) this.f34589y) / ((float) this.f34590z));

    /* renamed from: B */
    private CropImageView.C11850d f34564B;

    /* renamed from: C */
    private CropImageView.C11849c f34565C;

    /* renamed from: D */
    private final Rect f34566D = new Rect();

    /* renamed from: E */
    private boolean f34567E;

    /* renamed from: d */
    private ScaleGestureDetector f34568d;

    /* renamed from: e */
    private boolean f34569e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C11869e f34570f = new C11869e();

    /* renamed from: g */
    private C11859b f34571g;

    /* renamed from: h */
    private final RectF f34572h = new RectF();

    /* renamed from: i */
    private Paint f34573i;

    /* renamed from: j */
    private Paint f34574j;

    /* renamed from: k */
    private Paint f34575k;

    /* renamed from: l */
    private Paint f34576l;

    /* renamed from: m */
    private Path f34577m = new Path();

    /* renamed from: n */
    private final float[] f34578n = new float[8];

    /* renamed from: o */
    private final RectF f34579o = new RectF();

    /* renamed from: p */
    private int f34580p;

    /* renamed from: q */
    private int f34581q;

    /* renamed from: r */
    private float f34582r;

    /* renamed from: s */
    private float f34583s;

    /* renamed from: t */
    private float f34584t;

    /* renamed from: u */
    private float f34585u;

    /* renamed from: v */
    private float f34586v;

    /* renamed from: w */
    private C11870f f34587w;

    /* renamed from: x */
    private boolean f34588x;

    /* renamed from: y */
    private int f34589y;

    /* renamed from: z */
    private int f34590z;

    /* renamed from: com.theartofdev.edmodo.cropper.CropOverlayView$b */
    public interface C11859b {
        /* renamed from: a */
        void mo31821a(boolean z);
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropOverlayView$c */
    private class C11860c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private C11860c() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RectF h = CropOverlayView.this.f34570f.mo31875h();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f = focusY - currentSpanY;
            float f2 = focusX - currentSpanX;
            float f3 = focusX + currentSpanX;
            float f4 = focusY + currentSpanY;
            if (f2 >= f3 || f > f4 || f2 < Utils.FLOAT_EPSILON || f3 > CropOverlayView.this.f34570f.mo31871c() || f < Utils.FLOAT_EPSILON || f4 > CropOverlayView.this.f34570f.mo31870b()) {
                return true;
            }
            h.set(f2, f, f3, f4);
            CropOverlayView.this.f34570f.mo31880r(h);
            CropOverlayView.this.invalidate();
            return true;
        }
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    private boolean m43421b(RectF rectF) {
        float f;
        float f2;
        float f3;
        RectF rectF2 = rectF;
        float u = C11865c.m43471u(this.f34578n);
        float w = C11865c.m43473w(this.f34578n);
        float v = C11865c.m43472v(this.f34578n);
        float p = C11865c.m43466p(this.f34578n);
        if (!m43431n()) {
            this.f34579o.set(u, w, v, p);
            return false;
        }
        float[] fArr = this.f34578n;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        if (f9 < f5) {
            float f12 = fArr[3];
            if (f5 < f12) {
                float f13 = fArr[2];
                f5 = f7;
                f2 = f8;
                f7 = f12;
                f = f9;
                float f14 = f6;
                f6 = f13;
                f4 = f14;
            } else {
                float f15 = f4;
                f4 = fArr[2];
                f2 = f6;
                f6 = f15;
                float f16 = f7;
                f7 = f5;
                f5 = f12;
                f = f16;
            }
        } else {
            f = fArr[3];
            if (f5 > f) {
                f2 = fArr[2];
                f6 = f8;
                f7 = f9;
            } else {
                f2 = f4;
                f = f5;
                f4 = f8;
                f5 = f9;
            }
        }
        float f17 = (f5 - f) / (f4 - f2);
        float f18 = -1.0f / f17;
        float f19 = f - (f17 * f2);
        float f22 = f - (f2 * f18);
        float f23 = f7 - (f17 * f6);
        float f24 = f7 - (f6 * f18);
        float centerY = rectF.centerY() - rectF2.top;
        float centerX = rectF.centerX();
        float f25 = rectF2.left;
        float f26 = centerY / (centerX - f25);
        float f27 = -f26;
        float f28 = rectF2.top;
        float f29 = f28 - (f25 * f26);
        float f32 = rectF2.right;
        float f33 = f28 - (f27 * f32);
        float f34 = f17 - f26;
        float f35 = (f29 - f19) / f34;
        if (f35 < f32) {
            f3 = f35;
        } else {
            f3 = u;
        }
        float max = Math.max(u, f3);
        float f36 = (f29 - f22) / (f18 - f26);
        if (f36 >= rectF2.right) {
            f36 = max;
        }
        float max2 = Math.max(max, f36);
        float f37 = f18 - f27;
        float f38 = (f33 - f24) / f37;
        float f39 = p;
        if (f38 >= rectF2.right) {
            f38 = max2;
        }
        float max3 = Math.max(max2, f38);
        float f42 = (f33 - f22) / f37;
        if (f42 <= rectF2.left) {
            f42 = v;
        }
        float min = Math.min(v, f42);
        float f43 = (f33 - f23) / (f17 - f27);
        if (f43 <= rectF2.left) {
            f43 = min;
        }
        float min2 = Math.min(min, f43);
        float f44 = (f29 - f23) / f34;
        if (f44 <= rectF2.left) {
            f44 = min2;
        }
        float min3 = Math.min(min2, f44);
        float max4 = Math.max(w, Math.max((f17 * max3) + f19, (f18 * min3) + f22));
        float min4 = Math.min(f39, Math.min((f18 * max3) + f24, (f17 * min3) + f23));
        RectF rectF3 = this.f34579o;
        rectF3.left = max3;
        rectF3.top = max4;
        rectF3.right = min3;
        rectF3.bottom = min4;
        return true;
    }

    /* renamed from: c */
    private void m43422c(boolean z) {
        try {
            C11859b bVar = this.f34571g;
            if (bVar != null) {
                bVar.mo31821a(z);
            }
        } catch (Exception e) {
            Log.e("AIC", "Exception in crop window changed", e);
        }
    }

    /* renamed from: d */
    private void m43423d(Canvas canvas) {
        RectF h = this.f34570f.mo31875h();
        float max = Math.max(C11865c.m43471u(this.f34578n), Utils.FLOAT_EPSILON);
        float max2 = Math.max(C11865c.m43473w(this.f34578n), Utils.FLOAT_EPSILON);
        float min = Math.min(C11865c.m43472v(this.f34578n), (float) getWidth());
        float min2 = Math.min(C11865c.m43466p(this.f34578n), (float) getHeight());
        if (this.f34565C != CropImageView.C11849c.RECTANGLE) {
            this.f34577m.reset();
            int i = Build.VERSION.SDK_INT;
            this.f34572h.set(h.left, h.top, h.right, h.bottom);
            this.f34577m.addOval(this.f34572h, Path.Direction.CW);
            canvas.save();
            if (i >= 26) {
                boolean unused = canvas.clipOutPath(this.f34577m);
            } else {
                canvas.clipPath(this.f34577m, Region.Op.XOR);
            }
            canvas.drawRect(max, max2, min, min2, this.f34576l);
            canvas.restore();
        } else if (m43431n()) {
            int i2 = Build.VERSION.SDK_INT;
            this.f34577m.reset();
            Path path = this.f34577m;
            float[] fArr = this.f34578n;
            path.moveTo(fArr[0], fArr[1]);
            Path path2 = this.f34577m;
            float[] fArr2 = this.f34578n;
            path2.lineTo(fArr2[2], fArr2[3]);
            Path path3 = this.f34577m;
            float[] fArr3 = this.f34578n;
            path3.lineTo(fArr3[4], fArr3[5]);
            Path path4 = this.f34577m;
            float[] fArr4 = this.f34578n;
            path4.lineTo(fArr4[6], fArr4[7]);
            this.f34577m.close();
            canvas.save();
            if (i2 >= 26) {
                boolean unused2 = canvas.clipOutPath(this.f34577m);
            } else {
                canvas.clipPath(this.f34577m, Region.Op.INTERSECT);
            }
            canvas.clipRect(h, Region.Op.XOR);
            canvas.drawRect(max, max2, min, min2, this.f34576l);
            canvas.restore();
        } else {
            Canvas canvas2 = canvas;
            float f = max;
            float f2 = min;
            canvas2.drawRect(f, max2, f2, h.top, this.f34576l);
            canvas2.drawRect(f, h.bottom, f2, min2, this.f34576l);
            canvas2.drawRect(f, h.top, h.left, h.bottom, this.f34576l);
            canvas.drawRect(h.right, h.top, min, h.bottom, this.f34576l);
        }
    }

    /* renamed from: e */
    private void m43424e(Canvas canvas) {
        Paint paint = this.f34573i;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth();
            RectF h = this.f34570f.mo31875h();
            float f = strokeWidth / 2.0f;
            h.inset(f, f);
            if (this.f34565C == CropImageView.C11849c.RECTANGLE) {
                canvas.drawRect(h, this.f34573i);
            } else {
                canvas.drawOval(h, this.f34573i);
            }
        }
    }

    /* renamed from: f */
    private void m43425f(Canvas canvas) {
        float f;
        if (this.f34574j != null) {
            Paint paint = this.f34573i;
            float f2 = Utils.FLOAT_EPSILON;
            if (paint != null) {
                f = paint.getStrokeWidth();
            } else {
                f = 0.0f;
            }
            float strokeWidth = this.f34574j.getStrokeWidth();
            float f3 = strokeWidth / 2.0f;
            if (this.f34565C == CropImageView.C11849c.RECTANGLE) {
                f2 = this.f34582r;
            }
            float f4 = f2 + f3;
            RectF h = this.f34570f.mo31875h();
            h.inset(f4, f4);
            float f5 = (strokeWidth - f) / 2.0f;
            float f6 = f3 + f5;
            float f7 = h.left;
            float f8 = h.top;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f7 - f5, f8 - f6, f7 - f5, f8 + this.f34583s, this.f34574j);
            float f9 = h.left;
            float f12 = h.top;
            canvas2.drawLine(f9 - f6, f12 - f5, f9 + this.f34583s, f12 - f5, this.f34574j);
            float f13 = h.right;
            float f14 = h.top;
            canvas2.drawLine(f13 + f5, f14 - f6, f13 + f5, f14 + this.f34583s, this.f34574j);
            float f15 = h.right;
            float f16 = h.top;
            canvas2.drawLine(f15 + f6, f16 - f5, f15 - this.f34583s, f16 - f5, this.f34574j);
            float f17 = h.left;
            float f18 = h.bottom;
            canvas2.drawLine(f17 - f5, f18 + f6, f17 - f5, f18 - this.f34583s, this.f34574j);
            float f19 = h.left;
            float f22 = h.bottom;
            canvas2.drawLine(f19 - f6, f22 + f5, f19 + this.f34583s, f22 + f5, this.f34574j);
            float f23 = h.right;
            float f24 = h.bottom;
            canvas2.drawLine(f23 + f5, f24 + f6, f23 + f5, f24 - this.f34583s, this.f34574j);
            float f25 = h.right;
            float f26 = h.bottom;
            canvas2.drawLine(f25 + f6, f26 + f5, f25 - this.f34583s, f26 + f5, this.f34574j);
        }
    }

    /* renamed from: g */
    private void m43426g(Canvas canvas) {
        float f;
        if (this.f34575k != null) {
            Paint paint = this.f34573i;
            if (paint != null) {
                f = paint.getStrokeWidth();
            } else {
                f = Utils.FLOAT_EPSILON;
            }
            RectF h = this.f34570f.mo31875h();
            h.inset(f, f);
            float width = h.width() / 3.0f;
            float height = h.height() / 3.0f;
            if (this.f34565C == CropImageView.C11849c.OVAL) {
                float width2 = (h.width() / 2.0f) - f;
                float height2 = (h.height() / 2.0f) - f;
                float f2 = h.left + width;
                float f3 = h.right - width;
                float sin = (float) (((double) height2) * Math.sin(Math.acos((double) ((width2 - width) / width2))));
                canvas.drawLine(f2, (h.top + height2) - sin, f2, (h.bottom - height2) + sin, this.f34575k);
                canvas.drawLine(f3, (h.top + height2) - sin, f3, (h.bottom - height2) + sin, this.f34575k);
                float f4 = h.top + height;
                float f5 = h.bottom - height;
                float cos = (float) (((double) width2) * Math.cos(Math.asin((double) ((height2 - height) / height2))));
                canvas.drawLine((h.left + width2) - cos, f4, (h.right - width2) + cos, f4, this.f34575k);
                canvas.drawLine((h.left + width2) - cos, f5, (h.right - width2) + cos, f5, this.f34575k);
                return;
            }
            float f6 = h.left + width;
            float f7 = h.right - width;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f6, h.top, f6, h.bottom, this.f34575k);
            canvas.drawLine(f7, h.top, f7, h.bottom, this.f34575k);
            float f8 = h.top + height;
            float f9 = h.bottom - height;
            canvas2.drawLine(h.left, f8, h.right, f8, this.f34575k);
            canvas.drawLine(h.left, f9, h.right, f9, this.f34575k);
        }
    }

    /* renamed from: h */
    private void m43427h(RectF rectF) {
        if (rectF.width() < this.f34570f.mo31873e()) {
            float e = (this.f34570f.mo31873e() - rectF.width()) / 2.0f;
            rectF.left -= e;
            rectF.right += e;
        }
        if (rectF.height() < this.f34570f.mo31872d()) {
            float d = (this.f34570f.mo31872d() - rectF.height()) / 2.0f;
            rectF.top -= d;
            rectF.bottom += d;
        }
        if (rectF.width() > this.f34570f.mo31871c()) {
            float width = (rectF.width() - this.f34570f.mo31871c()) / 2.0f;
            rectF.left += width;
            rectF.right -= width;
        }
        if (rectF.height() > this.f34570f.mo31870b()) {
            float height = (rectF.height() - this.f34570f.mo31870b()) / 2.0f;
            rectF.top += height;
            rectF.bottom -= height;
        }
        m43421b(rectF);
        if (this.f34579o.width() > Utils.FLOAT_EPSILON && this.f34579o.height() > Utils.FLOAT_EPSILON) {
            float max = Math.max(this.f34579o.left, Utils.FLOAT_EPSILON);
            float max2 = Math.max(this.f34579o.top, Utils.FLOAT_EPSILON);
            float min = Math.min(this.f34579o.right, (float) getWidth());
            float min2 = Math.min(this.f34579o.bottom, (float) getHeight());
            if (rectF.left < max) {
                rectF.left = max;
            }
            if (rectF.top < max2) {
                rectF.top = max2;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (this.f34588x && ((double) Math.abs(rectF.width() - (rectF.height() * this.f34563A))) > 0.1d) {
            if (rectF.width() > rectF.height() * this.f34563A) {
                float abs = Math.abs((rectF.height() * this.f34563A) - rectF.width()) / 2.0f;
                rectF.left += abs;
                rectF.right -= abs;
                return;
            }
            float abs2 = Math.abs((rectF.width() / this.f34563A) - rectF.height()) / 2.0f;
            rectF.top += abs2;
            rectF.bottom -= abs2;
        }
    }

    /* renamed from: j */
    private static Paint m43428j(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        return paint;
    }

    /* renamed from: k */
    private static Paint m43429k(float f, int i) {
        if (f <= Utils.FLOAT_EPSILON) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    /* renamed from: l */
    private void m43430l() {
        float max = Math.max(C11865c.m43471u(this.f34578n), Utils.FLOAT_EPSILON);
        float max2 = Math.max(C11865c.m43473w(this.f34578n), Utils.FLOAT_EPSILON);
        float min = Math.min(C11865c.m43472v(this.f34578n), (float) getWidth());
        float min2 = Math.min(C11865c.m43466p(this.f34578n), (float) getHeight());
        if (min > max && min2 > max2) {
            RectF rectF = new RectF();
            this.f34567E = true;
            float f = this.f34584t;
            float f2 = min - max;
            float f3 = f * f2;
            float f4 = min2 - max2;
            float f5 = f * f4;
            if (this.f34566D.width() > 0 && this.f34566D.height() > 0) {
                rectF.left = (((float) this.f34566D.left) / this.f34570f.mo31877k()) + max;
                rectF.top = (((float) this.f34566D.top) / this.f34570f.mo31876j()) + max2;
                rectF.right = rectF.left + (((float) this.f34566D.width()) / this.f34570f.mo31877k());
                rectF.bottom = rectF.top + (((float) this.f34566D.height()) / this.f34570f.mo31876j());
                rectF.left = Math.max(max, rectF.left);
                rectF.top = Math.max(max2, rectF.top);
                rectF.right = Math.min(min, rectF.right);
                rectF.bottom = Math.min(min2, rectF.bottom);
            } else if (!this.f34588x || min <= max || min2 <= max2) {
                rectF.left = max + f3;
                rectF.top = max2 + f5;
                rectF.right = min - f3;
                rectF.bottom = min2 - f5;
            } else if (f2 / f4 > this.f34563A) {
                rectF.top = max2 + f5;
                rectF.bottom = min2 - f5;
                float width = ((float) getWidth()) / 2.0f;
                this.f34563A = ((float) this.f34589y) / ((float) this.f34590z);
                float max3 = Math.max(this.f34570f.mo31873e(), rectF.height() * this.f34563A) / 2.0f;
                rectF.left = width - max3;
                rectF.right = width + max3;
            } else {
                rectF.left = max + f3;
                rectF.right = min - f3;
                float height = ((float) getHeight()) / 2.0f;
                float max4 = Math.max(this.f34570f.mo31872d(), rectF.width() / this.f34563A) / 2.0f;
                rectF.top = height - max4;
                rectF.bottom = height + max4;
            }
            m43427h(rectF);
            this.f34570f.mo31880r(rectF);
        }
    }

    /* renamed from: n */
    private boolean m43431n() {
        float[] fArr = this.f34578n;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    /* renamed from: o */
    private void m43432o(float f, float f2) {
        C11870f f3 = this.f34570f.mo31874f(f, f2, this.f34585u, this.f34565C);
        this.f34587w = f3;
        if (f3 != null) {
            invalidate();
        }
    }

    /* renamed from: p */
    private void m43433p(float f, float f2) {
        if (this.f34587w != null) {
            float f3 = this.f34586v;
            RectF h = this.f34570f.mo31875h();
            if (m43421b(h)) {
                f3 = Utils.FLOAT_EPSILON;
            }
            RectF rectF = h;
            float f4 = f;
            float f5 = f2;
            this.f34587w.mo31882m(rectF, f4, f5, this.f34579o, this.f34580p, this.f34581q, f3, this.f34588x, this.f34563A);
            this.f34570f.mo31880r(h);
            m43422c(true);
            invalidate();
        }
    }

    /* renamed from: q */
    private void m43434q() {
        if (this.f34587w != null) {
            this.f34587w = null;
            m43422c(false);
            invalidate();
        }
    }

    public int getAspectRatioX() {
        return this.f34589y;
    }

    public int getAspectRatioY() {
        return this.f34590z;
    }

    public CropImageView.C11849c getCropShape() {
        return this.f34565C;
    }

    public RectF getCropWindowRect() {
        return this.f34570f.mo31875h();
    }

    public CropImageView.C11850d getGuidelines() {
        return this.f34564B;
    }

    public Rect getInitialCropWindowRect() {
        return this.f34566D;
    }

    /* renamed from: i */
    public void mo31836i() {
        RectF cropWindowRect = getCropWindowRect();
        m43427h(cropWindowRect);
        this.f34570f.mo31880r(cropWindowRect);
    }

    /* renamed from: m */
    public boolean mo31837m() {
        return this.f34588x;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m43423d(canvas);
        if (this.f34570f.mo31881s()) {
            CropImageView.C11850d dVar = this.f34564B;
            if (dVar == CropImageView.C11850d.ON) {
                m43426g(canvas);
            } else if (dVar == CropImageView.C11850d.ON_TOUCH && this.f34587w != null) {
                m43426g(canvas);
            }
        }
        m43424e(canvas);
        m43425f(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f34569e) {
            this.f34568d.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    m43433p(motionEvent.getX(), motionEvent.getY());
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                } else if (action != 3) {
                    return false;
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            m43434q();
            return true;
        }
        m43432o(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    /* renamed from: r */
    public void mo31840r() {
        if (this.f34567E) {
            setCropWindowRect(C11865c.f34627b);
            m43430l();
            invalidate();
        }
    }

    /* renamed from: s */
    public void mo31841s(float[] fArr, int i, int i2) {
        if (fArr == null || !Arrays.equals(this.f34578n, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f34578n, Utils.FLOAT_EPSILON);
            } else {
                System.arraycopy(fArr, 0, this.f34578n, 0, fArr.length);
            }
            this.f34580p = i;
            this.f34581q = i2;
            RectF h = this.f34570f.mo31875h();
            if (h.width() == Utils.FLOAT_EPSILON || h.height() == Utils.FLOAT_EPSILON) {
                m43430l();
            }
        }
    }

    public void setAspectRatioX(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f34589y != i) {
            this.f34589y = i;
            this.f34563A = ((float) i) / ((float) this.f34590z);
            if (this.f34567E) {
                m43430l();
                invalidate();
            }
        }
    }

    public void setAspectRatioY(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f34590z != i) {
            this.f34590z = i;
            this.f34563A = ((float) this.f34589y) / ((float) i);
            if (this.f34567E) {
                m43430l();
                invalidate();
            }
        }
    }

    public void setCropShape(CropImageView.C11849c cVar) {
        if (this.f34565C != cVar) {
            this.f34565C = cVar;
            invalidate();
        }
    }

    public void setCropWindowChangeListener(C11859b bVar) {
        this.f34571g = bVar;
    }

    public void setCropWindowRect(RectF rectF) {
        this.f34570f.mo31880r(rectF);
    }

    public void setFixedAspectRatio(boolean z) {
        if (this.f34588x != z) {
            this.f34588x = z;
            if (this.f34567E) {
                m43430l();
                invalidate();
            }
        }
    }

    public void setGuidelines(CropImageView.C11850d dVar) {
        if (this.f34564B != dVar) {
            this.f34564B = dVar;
            if (this.f34567E) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        this.f34570f.mo31879q(cropImageOptions);
        setCropShape(cropImageOptions.f34476d);
        setSnapRadius(cropImageOptions.f34477e);
        setGuidelines(cropImageOptions.f34479g);
        setFixedAspectRatio(cropImageOptions.f34487o);
        setAspectRatioX(cropImageOptions.f34488p);
        setAspectRatioY(cropImageOptions.f34489q);
        mo31853u(cropImageOptions.f34484l);
        this.f34585u = cropImageOptions.f34478f;
        this.f34584t = cropImageOptions.f34486n;
        this.f34573i = m43429k(cropImageOptions.f34490r, cropImageOptions.f34491s);
        this.f34582r = cropImageOptions.f34493u;
        this.f34583s = cropImageOptions.f34494v;
        this.f34574j = m43429k(cropImageOptions.f34492t, cropImageOptions.f34495w);
        this.f34575k = m43429k(cropImageOptions.f34496x, cropImageOptions.f34497y);
        this.f34576l = m43428j(cropImageOptions.f34498z);
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.f34566D;
        if (rect == null) {
            rect = C11865c.f34626a;
        }
        rect2.set(rect);
        if (this.f34567E) {
            m43430l();
            invalidate();
            m43422c(false);
        }
    }

    public void setSnapRadius(float f) {
        this.f34586v = f;
    }

    /* renamed from: t */
    public void mo31852t(float f, float f2, float f3, float f4) {
        this.f34570f.mo31878p(f, f2, f3, f4);
    }

    /* renamed from: u */
    public boolean mo31853u(boolean z) {
        if (this.f34569e == z) {
            return false;
        }
        this.f34569e = z;
        if (!z || this.f34568d != null) {
            return true;
        }
        this.f34568d = new ScaleGestureDetector(getContext(), new C11860c());
        return true;
    }
}
