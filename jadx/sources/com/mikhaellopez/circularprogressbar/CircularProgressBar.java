package com.mikhaellopez.circularprogressbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p444hd.C15483a;
import p444hd.C15484b;
import p444hd.C15485c;
import ue1.C43075l;

public final class CircularProgressBar extends View {

    /* renamed from: E */
    public static final C11250a f32619E = new C11250a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private float f32620A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C11252c f32621B;

    /* renamed from: C */
    private float f32622C;

    /* renamed from: D */
    private final Runnable f32623D;

    /* renamed from: d */
    private ValueAnimator f32624d;

    /* renamed from: e */
    private Handler f32625e;

    /* renamed from: f */
    private RectF f32626f;

    /* renamed from: g */
    private Paint f32627g;

    /* renamed from: h */
    private Paint f32628h;

    /* renamed from: i */
    private float f32629i;

    /* renamed from: j */
    private float f32630j;

    /* renamed from: k */
    private float f32631k;

    /* renamed from: l */
    private float f32632l;

    /* renamed from: m */
    private int f32633m;

    /* renamed from: n */
    private Integer f32634n;

    /* renamed from: o */
    private Integer f32635o;

    /* renamed from: p */
    private C11251b f32636p;

    /* renamed from: q */
    private int f32637q;

    /* renamed from: r */
    private Integer f32638r;

    /* renamed from: s */
    private Integer f32639s;

    /* renamed from: t */
    private C11251b f32640t;

    /* renamed from: u */
    private boolean f32641u;

    /* renamed from: v */
    private float f32642v;

    /* renamed from: w */
    private C11252c f32643w;

    /* renamed from: x */
    private boolean f32644x;

    /* renamed from: y */
    private C43075l f32645y;

    /* renamed from: z */
    private C43075l f32646z;

    /* renamed from: com.mikhaellopez.circularprogressbar.CircularProgressBar$a */
    public static final class C11250a {
        private C11250a() {
        }

        public /* synthetic */ C11250a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.mikhaellopez.circularprogressbar.CircularProgressBar$b */
    public enum C11251b {
        LEFT_TO_RIGHT(1),
        RIGHT_TO_LEFT(2),
        TOP_TO_BOTTOM(3),
        BOTTOM_TO_END(4);
        

        /* renamed from: d */
        private final int f32652d;

        private C11251b(int i) {
            this.f32652d = i;
        }

        /* renamed from: a */
        public final int mo29310a() {
            return this.f32652d;
        }
    }

    /* renamed from: com.mikhaellopez.circularprogressbar.CircularProgressBar$c */
    public enum C11252c {
        TO_RIGHT(1),
        TO_LEFT(2);
        

        /* renamed from: d */
        private final int f32656d;

        private C11252c(int i) {
            this.f32656d = i;
        }

        /* renamed from: a */
        public final int mo29311a() {
            return this.f32656d;
        }
    }

    /* renamed from: com.mikhaellopez.circularprogressbar.CircularProgressBar$d */
    static final class C11253d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ CircularProgressBar f32657d;

        C11253d(CircularProgressBar circularProgressBar) {
            this.f32657d = circularProgressBar;
        }

        public final void run() {
            if (this.f32657d.getIndeterminateMode()) {
                this.f32657d.m41242n();
                CircularProgressBar circularProgressBar = this.f32657d;
                circularProgressBar.setProgressDirectionIndeterminateMode(circularProgressBar.m41244p(circularProgressBar.f32621B));
                CircularProgressBar circularProgressBar2 = this.f32657d;
                if (circularProgressBar2.m41239k(circularProgressBar2.f32621B)) {
                    CircularProgressBar.m41245r(this.f32657d, Utils.FLOAT_EPSILON, 1500L, (TimeInterpolator) null, (Long) null, 12, (Object) null);
                    return;
                }
                CircularProgressBar circularProgressBar3 = this.f32657d;
                CircularProgressBar.m41245r(circularProgressBar3, circularProgressBar3.getProgressMax(), 1500L, (TimeInterpolator) null, (Long) null, 12, (Object) null);
            }
        }
    }

    /* renamed from: com.mikhaellopez.circularprogressbar.CircularProgressBar$e */
    static final class C11254e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        final /* synthetic */ CircularProgressBar f32658d;

        C11254e(CircularProgressBar circularProgressBar) {
            this.f32658d = circularProgressBar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C41536l.m120485e(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (!(animatedValue instanceof Float)) {
                animatedValue = null;
            }
            Float f = (Float) animatedValue;
            if (f != null) {
                float floatValue = f.floatValue();
                if (this.f32658d.getIndeterminateMode()) {
                    this.f32658d.setProgressIndeterminateMode(floatValue);
                } else {
                    this.f32658d.setProgress(floatValue);
                }
                if (this.f32658d.getIndeterminateMode()) {
                    float f2 = (floatValue * ((float) 360)) / ((float) 100);
                    CircularProgressBar circularProgressBar = this.f32658d;
                    if (!circularProgressBar.m41239k(circularProgressBar.f32621B)) {
                        f2 = -f2;
                    }
                    circularProgressBar.setStartAngleIndeterminateMode(f2 + 270.0f);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120490j(context, "context");
        this.f32626f = new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        this.f32627g = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        this.f32628h = paint2;
        this.f32630j = 100.0f;
        this.f32631k = getResources().getDimension(C15484b.default_stroke_width);
        this.f32632l = getResources().getDimension(C15484b.default_background_stroke_width);
        this.f32633m = -16777216;
        C11251b bVar = C11251b.LEFT_TO_RIGHT;
        this.f32636p = bVar;
        this.f32637q = -7829368;
        this.f32640t = bVar;
        this.f32642v = 270.0f;
        C11252c cVar = C11252c.TO_RIGHT;
        this.f32643w = cVar;
        this.f32621B = cVar;
        this.f32622C = 270.0f;
        this.f32623D = new C11253d(this);
        m41238j(context, attributeSet);
    }

    /* renamed from: h */
    private final LinearGradient m41236h(int i, int i2, C11251b bVar) {
        float f;
        float f2;
        float f3;
        float f4;
        int i3 = C15483a.f43933a[bVar.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                f4 = (float) getWidth();
                f3 = 0.0f;
            } else if (i3 == 3) {
                f = (float) getHeight();
                f4 = 0.0f;
                f3 = 0.0f;
                f2 = 0.0f;
            } else if (i3 != 4) {
                f4 = 0.0f;
                f3 = 0.0f;
            } else {
                f3 = (float) getHeight();
                f4 = 0.0f;
                f2 = 0.0f;
                f = f2;
            }
            f2 = f3;
            f = f2;
        } else {
            f2 = (float) getWidth();
            f4 = 0.0f;
            f3 = 0.0f;
            f = 0.0f;
        }
        return new LinearGradient(f4, f3, f2, f, i, i2, Shader.TileMode.CLAMP);
    }

    /* renamed from: i */
    private final float m41237i(float f) {
        Resources system = Resources.getSystem();
        C41536l.m120485e(system, "Resources.getSystem()");
        return f * system.getDisplayMetrics().density;
    }

    /* renamed from: j */
    private final void m41238j(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C15485c.f43934a, 0, 0);
        C41536l.m120485e(obtainStyledAttributes, "context.theme.obtainStyl…ircularProgressBar, 0, 0)");
        setProgress(obtainStyledAttributes.getFloat(C15485c.f43941h, this.f32629i));
        setProgressMax(obtainStyledAttributes.getFloat(C15485c.f43943j, this.f32630j));
        setProgressBarWidth(m41243o(obtainStyledAttributes.getDimension(C15485c.f43948o, this.f32631k)));
        setBackgroundProgressBarWidth(m41243o(obtainStyledAttributes.getDimension(C15485c.f43939f, this.f32632l)));
        setProgressBarColor(obtainStyledAttributes.getInt(C15485c.f43944k, this.f32633m));
        int color = obtainStyledAttributes.getColor(C15485c.f43947n, 0);
        if (color != 0) {
            setProgressBarColorStart(Integer.valueOf(color));
        }
        int color2 = obtainStyledAttributes.getColor(C15485c.f43946m, 0);
        if (color2 != 0) {
            setProgressBarColorEnd(Integer.valueOf(color2));
        }
        setProgressBarColorDirection(m41246s(obtainStyledAttributes.getInteger(C15485c.f43945l, this.f32636p.mo29310a())));
        setBackgroundProgressBarColor(obtainStyledAttributes.getInt(C15485c.f43935b, this.f32637q));
        int color3 = obtainStyledAttributes.getColor(C15485c.f43938e, 0);
        if (color3 != 0) {
            setBackgroundProgressBarColorStart(Integer.valueOf(color3));
        }
        int color4 = obtainStyledAttributes.getColor(C15485c.f43937d, 0);
        if (color4 != 0) {
            setBackgroundProgressBarColorEnd(Integer.valueOf(color4));
        }
        setBackgroundProgressBarColorDirection(m41246s(obtainStyledAttributes.getInteger(C15485c.f43936c, this.f32640t.mo29310a())));
        setProgressDirection(m41247t(obtainStyledAttributes.getInteger(C15485c.f43942i, this.f32643w.mo29311a())));
        setRoundBorder(obtainStyledAttributes.getBoolean(C15485c.f43949p, this.f32641u));
        setStartAngle(obtainStyledAttributes.getFloat(C15485c.f43950q, Utils.FLOAT_EPSILON));
        setIndeterminateMode(obtainStyledAttributes.getBoolean(C15485c.f43940g, this.f32644x));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final boolean m41239k(C11252c cVar) {
        return cVar == C11252c.TO_RIGHT;
    }

    /* renamed from: l */
    private final void m41240l() {
        int i;
        int i2;
        Paint paint = this.f32627g;
        Integer num = this.f32638r;
        if (num != null) {
            i = num.intValue();
        } else {
            i = this.f32637q;
        }
        Integer num2 = this.f32639s;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = this.f32637q;
        }
        paint.setShader(m41236h(i, i2, this.f32640t));
    }

    /* renamed from: m */
    private final void m41241m() {
        int i;
        int i2;
        Paint paint = this.f32628h;
        Integer num = this.f32634n;
        if (num != null) {
            i = num.intValue();
        } else {
            i = this.f32633m;
        }
        Integer num2 = this.f32635o;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = this.f32633m;
        }
        paint.setShader(m41236h(i, i2, this.f32636p));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m41242n() {
        Handler handler = this.f32625e;
        if (handler != null) {
            handler.postDelayed(this.f32623D, 1500);
        }
    }

    /* renamed from: o */
    private final float m41243o(float f) {
        Resources system = Resources.getSystem();
        C41536l.m120485e(system, "Resources.getSystem()");
        return f / system.getDisplayMetrics().density;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final C11252c m41244p(C11252c cVar) {
        return m41239k(cVar) ? C11252c.TO_LEFT : C11252c.TO_RIGHT;
    }

    /* renamed from: r */
    public static /* synthetic */ void m41245r(CircularProgressBar circularProgressBar, float f, Long l, TimeInterpolator timeInterpolator, Long l2, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            timeInterpolator = null;
        }
        if ((i & 8) != 0) {
            l2 = null;
        }
        circularProgressBar.mo29289q(f, l, timeInterpolator, l2);
    }

    /* renamed from: s */
    private final C11251b m41246s(int i) {
        if (i == 1) {
            return C11251b.LEFT_TO_RIGHT;
        }
        if (i == 2) {
            return C11251b.RIGHT_TO_LEFT;
        }
        if (i == 3) {
            return C11251b.TOP_TO_BOTTOM;
        }
        if (i == 4) {
            return C11251b.BOTTOM_TO_END;
        }
        throw new IllegalArgumentException("This value is not supported for GradientDirection: " + i);
    }

    /* access modifiers changed from: private */
    public final void setProgressDirectionIndeterminateMode(C11252c cVar) {
        this.f32621B = cVar;
        invalidate();
    }

    /* access modifiers changed from: private */
    public final void setProgressIndeterminateMode(float f) {
        this.f32620A = f;
        invalidate();
    }

    /* access modifiers changed from: private */
    public final void setStartAngleIndeterminateMode(float f) {
        this.f32622C = f;
        invalidate();
    }

    /* renamed from: t */
    private final C11252c m41247t(int i) {
        if (i == 1) {
            return C11252c.TO_RIGHT;
        }
        if (i == 2) {
            return C11252c.TO_LEFT;
        }
        throw new IllegalArgumentException("This value is not supported for ProgressDirection: " + i);
    }

    public final int getBackgroundProgressBarColor() {
        return this.f32637q;
    }

    public final C11251b getBackgroundProgressBarColorDirection() {
        return this.f32640t;
    }

    public final Integer getBackgroundProgressBarColorEnd() {
        return this.f32639s;
    }

    public final Integer getBackgroundProgressBarColorStart() {
        return this.f32638r;
    }

    public final float getBackgroundProgressBarWidth() {
        return this.f32632l;
    }

    public final boolean getIndeterminateMode() {
        return this.f32644x;
    }

    public final C43075l getOnIndeterminateModeChangeListener() {
        return this.f32646z;
    }

    public final C43075l getOnProgressChangeListener() {
        return this.f32645y;
    }

    public final float getProgress() {
        return this.f32629i;
    }

    public final int getProgressBarColor() {
        return this.f32633m;
    }

    public final C11251b getProgressBarColorDirection() {
        return this.f32636p;
    }

    public final Integer getProgressBarColorEnd() {
        return this.f32635o;
    }

    public final Integer getProgressBarColorStart() {
        return this.f32634n;
    }

    public final float getProgressBarWidth() {
        return this.f32631k;
    }

    public final C11252c getProgressDirection() {
        return this.f32643w;
    }

    public final float getProgressMax() {
        return this.f32630j;
    }

    public final boolean getRoundBorder() {
        return this.f32641u;
    }

    public final float getStartAngle() {
        return this.f32642v;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f32624d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Handler handler = this.f32625e;
        if (handler != null) {
            handler.removeCallbacks(this.f32623D);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        boolean z;
        int i;
        float f2;
        C41536l.m120490j(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawOval(this.f32626f, this.f32627g);
        boolean z2 = this.f32644x;
        if (z2) {
            f = this.f32620A;
        } else {
            f = this.f32629i;
        }
        float f3 = (f * 100.0f) / this.f32630j;
        boolean z3 = true;
        if (!z2 || !m41239k(this.f32621B)) {
            z = false;
        } else {
            z = true;
        }
        if (this.f32644x || !m41239k(this.f32643w)) {
            z3 = false;
        }
        if (z || z3) {
            i = 360;
        } else {
            i = -360;
        }
        float f4 = (((float) i) * f3) / ((float) 100);
        RectF rectF = this.f32626f;
        if (this.f32644x) {
            f2 = this.f32622C;
        } else {
            f2 = this.f32642v;
        }
        canvas.drawArc(rectF, f2, f4, false, this.f32628h);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int min = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(min, min);
        float f = this.f32631k;
        float f2 = this.f32632l;
        if (f <= f2) {
            f = f2;
        }
        float f3 = f / ((float) 2);
        float f4 = ((float) 0) + f3;
        float f5 = ((float) min) - f3;
        this.f32626f.set(f4, f4, f5, f5);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m41241m();
        m41240l();
        invalidate();
    }

    /* renamed from: q */
    public final void mo29289q(float f, Long l, TimeInterpolator timeInterpolator, Long l2) {
        float f2;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f32624d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        float[] fArr = new float[2];
        if (this.f32644x) {
            f2 = this.f32620A;
        } else {
            f2 = this.f32629i;
        }
        fArr[0] = f2;
        fArr[1] = f;
        this.f32624d = ValueAnimator.ofFloat(fArr);
        if (l != null) {
            long longValue = l.longValue();
            ValueAnimator valueAnimator3 = this.f32624d;
            if (valueAnimator3 != null) {
                valueAnimator3.setDuration(longValue);
            }
        }
        if (!(timeInterpolator == null || (valueAnimator = this.f32624d) == null)) {
            valueAnimator.setInterpolator(timeInterpolator);
        }
        if (l2 != null) {
            long longValue2 = l2.longValue();
            ValueAnimator valueAnimator4 = this.f32624d;
            if (valueAnimator4 != null) {
                valueAnimator4.setStartDelay(longValue2);
            }
        }
        ValueAnimator valueAnimator5 = this.f32624d;
        if (valueAnimator5 != null) {
            valueAnimator5.addUpdateListener(new C11254e(this));
        }
        ValueAnimator valueAnimator6 = this.f32624d;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }

    public void setBackgroundColor(int i) {
        setBackgroundProgressBarColor(i);
    }

    public final void setBackgroundProgressBarColor(int i) {
        this.f32637q = i;
        m41240l();
        invalidate();
    }

    public final void setBackgroundProgressBarColorDirection(C11251b bVar) {
        C41536l.m120490j(bVar, C11755a.C11756a.f34100b);
        this.f32640t = bVar;
        m41240l();
        invalidate();
    }

    public final void setBackgroundProgressBarColorEnd(Integer num) {
        this.f32639s = num;
        m41240l();
        invalidate();
    }

    public final void setBackgroundProgressBarColorStart(Integer num) {
        this.f32638r = num;
        m41240l();
        invalidate();
    }

    public final void setBackgroundProgressBarWidth(float f) {
        float i = m41237i(f);
        this.f32632l = i;
        this.f32627g.setStrokeWidth(i);
        requestLayout();
        invalidate();
    }

    public final void setIndeterminateMode(boolean z) {
        this.f32644x = z;
        C43075l lVar = this.f32646z;
        if (lVar != null) {
            C41238w wVar = (C41238w) lVar.invoke(Boolean.valueOf(z));
        }
        setProgressIndeterminateMode(Utils.FLOAT_EPSILON);
        setProgressDirectionIndeterminateMode(C11252c.TO_RIGHT);
        setStartAngleIndeterminateMode(270.0f);
        Handler handler = this.f32625e;
        if (handler != null) {
            handler.removeCallbacks(this.f32623D);
        }
        ValueAnimator valueAnimator = this.f32624d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Handler handler2 = new Handler();
        this.f32625e = handler2;
        if (this.f32644x) {
            handler2.post(this.f32623D);
        }
    }

    public final void setOnIndeterminateModeChangeListener(C43075l lVar) {
        this.f32646z = lVar;
    }

    public final void setOnProgressChangeListener(C43075l lVar) {
        this.f32645y = lVar;
    }

    public final void setProgress(float f) {
        float f2 = this.f32629i;
        float f3 = this.f32630j;
        if (f2 > f3) {
            f = f3;
        }
        this.f32629i = f;
        C43075l lVar = this.f32645y;
        if (lVar != null) {
            C41238w wVar = (C41238w) lVar.invoke(Float.valueOf(f));
        }
        invalidate();
    }

    public final void setProgressBarColor(int i) {
        this.f32633m = i;
        m41241m();
        invalidate();
    }

    public final void setProgressBarColorDirection(C11251b bVar) {
        C41536l.m120490j(bVar, C11755a.C11756a.f34100b);
        this.f32636p = bVar;
        m41241m();
        invalidate();
    }

    public final void setProgressBarColorEnd(Integer num) {
        this.f32635o = num;
        m41241m();
        invalidate();
    }

    public final void setProgressBarColorStart(Integer num) {
        this.f32634n = num;
        m41241m();
        invalidate();
    }

    public final void setProgressBarWidth(float f) {
        float i = m41237i(f);
        this.f32631k = i;
        this.f32628h.setStrokeWidth(i);
        requestLayout();
        invalidate();
    }

    public final void setProgressDirection(C11252c cVar) {
        C41536l.m120490j(cVar, C11755a.C11756a.f34100b);
        this.f32643w = cVar;
        invalidate();
    }

    public final void setProgressMax(float f) {
        if (this.f32630j < ((float) 0)) {
            f = 100.0f;
        }
        this.f32630j = f;
        invalidate();
    }

    public final void setProgressWithAnimation(float f) {
        m41245r(this, f, (Long) null, (TimeInterpolator) null, (Long) null, 14, (Object) null);
    }

    public final void setRoundBorder(boolean z) {
        Paint.Cap cap;
        this.f32641u = z;
        Paint paint = this.f32628h;
        if (z) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
        invalidate();
    }

    public final void setStartAngle(float f) {
        int i;
        float f2 = f + 270.0f;
        while (true) {
            float f3 = (float) 360;
            i = (f2 > f3 ? 1 : (f2 == f3 ? 0 : -1));
            if (i <= 0) {
                break;
            }
            f2 -= f3;
        }
        if (f2 < ((float) 0)) {
            f2 = Utils.FLOAT_EPSILON;
        } else if (i > 0) {
            f2 = 360.0f;
        }
        this.f32642v = f2;
        invalidate();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CircularProgressBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
