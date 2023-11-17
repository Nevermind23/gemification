package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p009a8.C0072b;
import p009a8.C0074d;
import p009a8.C0081k;
import p009a8.C0082l;

class ClockHandView extends View {

    /* renamed from: d */
    private ValueAnimator f16733d;

    /* renamed from: e */
    private boolean f16734e;

    /* renamed from: f */
    private float f16735f;

    /* renamed from: g */
    private float f16736g;

    /* renamed from: h */
    private boolean f16737h;

    /* renamed from: i */
    private int f16738i;

    /* renamed from: j */
    private final List f16739j;

    /* renamed from: k */
    private final int f16740k;

    /* renamed from: l */
    private final float f16741l;

    /* renamed from: m */
    private final Paint f16742m;

    /* renamed from: n */
    private final RectF f16743n;

    /* renamed from: o */
    private final int f16744o;

    /* renamed from: p */
    private float f16745p;

    /* renamed from: q */
    private boolean f16746q;

    /* renamed from: r */
    private double f16747r;

    /* renamed from: s */
    private int f16748s;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    class C5219a implements ValueAnimator.AnimatorUpdateListener {
        C5219a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m20628m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    class C5220b extends AnimatorListenerAdapter {
        C5220b() {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    public interface C5221c {
        /* renamed from: a */
        void mo17356a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f128H);
    }

    /* renamed from: c */
    private void m20624c(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f2 = (float) height;
        this.f16742m.setStrokeWidth(Utils.FLOAT_EPSILON);
        canvas.drawCircle((((float) this.f16748s) * ((float) Math.cos(this.f16747r))) + f, (((float) this.f16748s) * ((float) Math.sin(this.f16747r))) + f2, (float) this.f16740k, this.f16742m);
        double sin = Math.sin(this.f16747r);
        double cos = Math.cos(this.f16747r);
        double d = (double) ((float) (this.f16748s - this.f16740k));
        float f3 = (float) (width + ((int) (cos * d)));
        float f4 = (float) (height + ((int) (d * sin)));
        this.f16742m.setStrokeWidth((float) this.f16744o);
        canvas.drawLine(f, f2, f3, f4, this.f16742m);
        canvas.drawCircle(f, f2, this.f16741l, this.f16742m);
    }

    /* renamed from: e */
    private int m20625e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))))) + 90;
        if (degrees < 0) {
            return degrees + 360;
        }
        return degrees;
    }

    /* renamed from: h */
    private Pair m20626h(float f) {
        float f2 = mo17363f();
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(f2), Float.valueOf(f));
    }

    /* renamed from: i */
    private boolean m20627i(float f, float f2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        float e = (float) m20625e(f, f2);
        boolean z5 = false;
        if (mo17363f() != e) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 && z4) {
            return true;
        }
        if (!z4 && !z) {
            return false;
        }
        if (z3 && this.f16734e) {
            z5 = true;
        }
        mo17367l(e, z5);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m20628m(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f16745p = f2;
        this.f16747r = Math.toRadians((double) (f2 - 90.0f));
        float width = ((float) (getWidth() / 2)) + (((float) this.f16748s) * ((float) Math.cos(this.f16747r)));
        float height = ((float) (getHeight() / 2)) + (((float) this.f16748s) * ((float) Math.sin(this.f16747r)));
        RectF rectF = this.f16743n;
        int i = this.f16740k;
        rectF.set(width - ((float) i), height - ((float) i), width + ((float) i), height + ((float) i));
        for (C5221c a : this.f16739j) {
            a.mo17356a(f2, z);
        }
        invalidate();
    }

    /* renamed from: b */
    public void mo17361b(C5221c cVar) {
        this.f16739j.add(cVar);
    }

    /* renamed from: d */
    public RectF mo17362d() {
        return this.f16743n;
    }

    /* renamed from: f */
    public float mo17363f() {
        return this.f16745p;
    }

    /* renamed from: g */
    public int mo17364g() {
        return this.f16740k;
    }

    /* renamed from: j */
    public void mo17365j(int i) {
        this.f16748s = i;
        invalidate();
    }

    /* renamed from: k */
    public void mo17366k(float f) {
        mo17367l(f, false);
    }

    /* renamed from: l */
    public void mo17367l(float f, boolean z) {
        ValueAnimator valueAnimator = this.f16733d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m20628m(f, false);
            return;
        }
        Pair h = m20626h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) h.first).floatValue(), ((Float) h.second).floatValue()});
        this.f16733d = ofFloat;
        ofFloat.setDuration(200);
        this.f16733d.addUpdateListener(new C5219a());
        this.f16733d.addListener(new C5220b());
        this.f16733d.start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m20624c(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo17366k(mo17363f());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.f16735f = x;
            this.f16736g = y;
            this.f16737h = true;
            this.f16746q = false;
            z2 = true;
            z3 = false;
            z = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.f16735f);
            int i2 = (int) (y - this.f16736g);
            if ((i * i) + (i2 * i2) > this.f16738i) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f16737h = z4;
            z3 = this.f16746q;
            if (actionMasked == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            z = z5;
            z2 = false;
        } else {
            z3 = false;
            z2 = false;
            z = false;
        }
        this.f16746q |= m20627i(x, y, z3, z2, z);
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16739j = new ArrayList();
        Paint paint = new Paint();
        this.f16742m = paint;
        this.f16743n = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0082l.f401C1, i, C0081k.f352B);
        this.f16748s = obtainStyledAttributes.getDimensionPixelSize(C0082l.f421E1, 0);
        this.f16740k = obtainStyledAttributes.getDimensionPixelSize(C0082l.f431F1, 0);
        Resources resources = getResources();
        this.f16744o = resources.getDimensionPixelSize(C0074d.f223q);
        this.f16741l = (float) resources.getDimensionPixelSize(C0074d.f221o);
        int color = obtainStyledAttributes.getColor(C0082l.f411D1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        mo17366k(Utils.FLOAT_EPSILON);
        this.f16738i = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.m3544C0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
