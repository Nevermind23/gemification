package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.facetec.sdk.cu */
class C2916cu extends View {

    /* renamed from: p */
    private static final int f9770p = ((int) C2810ax.m10988b(10));

    /* renamed from: a */
    protected Paint f9771a;

    /* renamed from: b */
    protected Paint f9772b;

    /* renamed from: c */
    RectF f9773c;

    /* renamed from: d */
    private boolean f9774d;

    /* renamed from: e */
    protected RectF f9775e;

    /* renamed from: f */
    protected final float f9776f = (C2810ax.m10988b(C2938dc.m12462y()) * C2938dc.m12404e());

    /* renamed from: g */
    protected RectF f9777g;

    /* renamed from: h */
    protected RectF f9778h;

    /* renamed from: i */
    AnimatorSet f9779i;

    /* renamed from: j */
    protected final float f9780j = (C2810ax.m10988b(C2938dc.m12455u()) * C2938dc.m12404e());

    /* renamed from: k */
    private Paint f9781k;

    /* renamed from: l */
    AnimatorSet f9782l;

    /* renamed from: m */
    private C2919b f9783m;

    /* renamed from: n */
    AnimatorSet f9784n;

    /* renamed from: o */
    private AnimatorSet f9785o;

    /* renamed from: q */
    private boolean f9786q = false;

    /* renamed from: r */
    private Animator f9787r = null;

    /* renamed from: s */
    private final Handler f9788s = new Handler();

    /* renamed from: com.facetec.sdk.cu$4 */
    static /* synthetic */ class C29184 {

        /* renamed from: e */
        static final /* synthetic */ int[] f9790e;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facetec.sdk.FaceTecExitAnimationStyle[] r0 = com.facetec.sdk.FaceTecExitAnimationStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9790e = r0
                com.facetec.sdk.FaceTecExitAnimationStyle r1 = com.facetec.sdk.FaceTecExitAnimationStyle.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9790e     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.FaceTecExitAnimationStyle r1 = com.facetec.sdk.FaceTecExitAnimationStyle.RIPPLE_IN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9790e     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.FaceTecExitAnimationStyle r1 = com.facetec.sdk.FaceTecExitAnimationStyle.RIPPLE_OUT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9790e     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.FaceTecExitAnimationStyle r1 = com.facetec.sdk.FaceTecExitAnimationStyle.CIRCLE_FADE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2916cu.C29184.<clinit>():void");
        }
    }

    public C2916cu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        post(new C3645vh(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void mo8905e() {
        mo9060b(false);
        mo8902a();
        float width = this.f9773c.width() / this.f9775e.width();
        float height = this.f9773c.height() / this.f9775e.height();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.SCALE_X, new float[]{1.0f, width});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, View.SCALE_Y, new float[]{1.0f, height});
        AnimatorSet animatorSet = new AnimatorSet();
        this.f9779i = animatorSet;
        animatorSet.setInterpolator(new OvershootInterpolator(0.8f));
        this.f9779i.setDuration(1600);
        this.f9779i.playTogether(new Animator[]{ofFloat, ofFloat2});
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f9785o = animatorSet2;
        animatorSet2.setDuration(0);
        this.f9785o.playTogether(new Animator[]{ofFloat, ofFloat2});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, View.SCALE_X, new float[]{1.0f, width});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, View.SCALE_Y, new float[]{1.0f, height});
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f9782l = animatorSet3;
        animatorSet3.setInterpolator(new OvershootInterpolator(1.5f));
        this.f9782l.setDuration(1200);
        this.f9782l.playTogether(new Animator[]{ofFloat3, ofFloat4});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, View.SCALE_X, new float[]{width, 1.0f});
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, View.SCALE_Y, new float[]{height, 1.0f});
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f9784n = animatorSet4;
        animatorSet4.setDuration(700);
        this.f9784n.playTogether(new Animator[]{ofFloat5, ofFloat6});
    }

    /* renamed from: d */
    public final void mo9061d() {
        C2919b bVar = this.f9783m;
        if (bVar != null) {
            bVar.mo9075d();
        }
    }

    /* renamed from: f */
    public final void mo9063f() {
        mo8904c();
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo9064g() {
        return this.f9774d;
    }

    /* renamed from: h */
    public final int mo9065h() {
        return (int) this.f9775e.bottom;
    }

    /* renamed from: i */
    public final RectF mo9066i() {
        return this.f9775e;
    }

    /* renamed from: j */
    public final void mo9067j() {
        setOvalHasExpanded(false);
        mo9062e(this.f9784n);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9775e != null) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(-400.0f, -400.0f, (float) (getWidth() + 800), (float) (getHeight() + 800), this.f9781k);
            canvas.drawOval(this.f9775e, this.f9771a);
            canvas.drawOval(this.f9777g, this.f9772b);
        }
        C2919b bVar = this.f9783m;
        if (bVar != null && bVar.f9794d != null) {
            float f = bVar.f9791a;
            float f2 = -(f - bVar.f9800j);
            canvas.drawArc(bVar.f9795e, f, f2, false, bVar.f9793c);
            Canvas canvas3 = canvas;
            canvas3.drawArc(bVar.f9795e, (bVar.f9791a + 180.0f) % 360.0f, f2, false, bVar.f9792b);
        }
    }

    public void setOvalHasExpanded(boolean z) {
        this.f9774d = z;
    }

    public void setOvalStrokeWidth(int i) {
        if (this.f9772b == null) {
            mo8902a();
            mo8904c();
        }
        this.f9772b.setStrokeWidth((float) i);
        invalidate();
    }

    public void setTransparentBackground() {
        if (this.f9781k == null) {
            mo8902a();
            mo8904c();
        }
        this.f9781k.setColor(0);
        invalidate();
    }

    /* renamed from: a */
    private void mo8902a() {
        setLayerType(1, (Paint) null);
        Paint paint = new Paint(1);
        this.f9771a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f9771a.setAlpha(0);
        this.f9771a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayerType(2, (Paint) null);
        Paint paint2 = new Paint(1);
        this.f9772b = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f9772b.setStrokeWidth(this.f9776f);
        String[] strArr = {"Nokia 2.2", "Nokia_2_2", "G5", "G5_Plus", "LM-X320", "LM-X420", "LM-X520", "JAT-L29"};
        for (int i = 0; i < 8; i++) {
            if (Build.MODEL.equals(strArr[i])) {
                this.f9772b.setAntiAlias(false);
            }
        }
        Paint paint3 = new Paint(1);
        this.f9781k = paint3;
        paint3.setStyle(Paint.Style.FILL);
        mo8904c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m12174b(AnimatorSet animatorSet) {
        if (animatorSet != null) {
            animatorSet.start();
        } else {
            C3555s.m13898c(getContext(), C2867c.NON_FATAL_ERROR, "animatorSet is null unexpectedly.");
        }
    }

    /* renamed from: c */
    private void mo8904c() {
        if (this.f9781k != null) {
            Context context = getContext();
            this.f9772b.setColor(C2938dc.m12444o(context));
            this.f9781k.setColor(C2938dc.m12435k(context));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9059b(java.lang.Runnable r10, boolean r11) {
        /*
            r9 = this;
            r9.mo9063f()
            if (r11 == 0) goto L_0x000a
            com.facetec.sdk.FaceTecCustomization r11 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecExitAnimationStyle r11 = r11.f8614r
            goto L_0x000e
        L_0x000a:
            com.facetec.sdk.FaceTecCustomization r11 = com.facetec.sdk.FaceTecSDK.f8630e
            com.facetec.sdk.FaceTecExitAnimationStyle r11 = r11.f8615s
        L_0x000e:
            int[] r0 = com.facetec.sdk.C2916cu.C29184.f9790e
            int r1 = r11.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 800(0x320, float:1.121E-42)
            if (r0 == r1) goto L_0x0029
            r4 = 3
            r5 = 1074161254(0x40066666, float:2.1)
            r6 = 1072064102(0x3fe66666, float:1.8)
            if (r0 == r4) goto L_0x003a
            r4 = 4
            if (r0 == r4) goto L_0x002b
        L_0x0029:
            r5 = r2
            goto L_0x003b
        L_0x002b:
            android.content.Context r0 = r9.getContext()
            int r0 = com.facetec.sdk.C2938dc.m12435k(r0)
            android.graphics.Paint r2 = r9.f9772b
            r2.setColor(r0)
            r3 = 1000(0x3e8, float:1.401E-42)
        L_0x003a:
            r2 = r6
        L_0x003b:
            com.facetec.sdk.FaceTecExitAnimationStyle r0 = com.facetec.sdk.FaceTecExitAnimationStyle.NONE
            if (r11 == r0) goto L_0x008e
            android.util.Property r11 = android.view.View.SCALE_X
            float[] r0 = new float[r1]
            float r4 = r9.getScaleX()
            r6 = 0
            r0[r6] = r4
            r4 = 1
            r0[r4] = r2
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r9, r11, r0)
            android.util.Property r0 = android.view.View.SCALE_Y
            float[] r2 = new float[r1]
            float r7 = r9.getScaleY()
            r2[r6] = r7
            r2[r4] = r5
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r9, r0, r2)
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            long r7 = (long) r3
            r2.setDuration(r7)
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>()
            r2.setInterpolator(r3)
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r1[r6] = r11
            r1[r4] = r0
            r2.playTogether(r1)
            com.facetec.sdk.wh r11 = new com.facetec.sdk.wh
            r11.<init>(r9, r10)
            r2.addListener(r11)
            com.facetec.sdk.cu$1 r10 = new com.facetec.sdk.cu$1
            r10.<init>()
            r2.addListener(r10)
            r9.mo9062e(r2)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2916cu.mo9059b(java.lang.Runnable, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m12176b(Runnable runnable, Animator animator) {
        setVisibility(4);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: com.facetec.sdk.cu$b */
    class C2919b {

        /* renamed from: a */
        float f9791a = Utils.FLOAT_EPSILON;

        /* renamed from: b */
        final Paint f9792b;

        /* renamed from: c */
        final Paint f9793c;

        /* renamed from: d */
        AnimatorSet f9794d = null;

        /* renamed from: e */
        RectF f9795e = null;

        /* renamed from: f */
        private final ValueAnimator.AnimatorUpdateListener f9796f = new C3687xh(this);

        /* renamed from: g */
        private final int f9797g;

        /* renamed from: h */
        private final int f9798h;

        /* renamed from: i */
        private final TimeInterpolator f9799i;

        /* renamed from: j */
        float f9800j = Utils.FLOAT_EPSILON;

        C2919b(Context context) {
            int e = C2938dc.m12408e(context, FaceTecSDK.f8630e.f8610m.progressColor1);
            int e2 = C2938dc.m12408e(context, FaceTecSDK.f8630e.f8610m.progressColor2);
            this.f9792b = m12191c(e);
            this.f9793c = m12191c(e2);
            this.f9797g = C2938dc.m12374c(context, FaceTecSDK.f8630e.f8610m.progressColor1);
            this.f9798h = C2938dc.m12374c(context, FaceTecSDK.f8630e.f8610m.progressColor2);
            this.f9799i = new AccelerateDecelerateInterpolator();
        }

        /* renamed from: b */
        private boolean m12190b() {
            AnimatorSet animatorSet = this.f9794d;
            return animatorSet != null && animatorSet.isStarted();
        }

        /* renamed from: c */
        private Paint m12191c(int i) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(C2916cu.this.f9780j);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setColor(i);
            return paint;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m12193e(ValueAnimator valueAnimator) {
            C2916cu.this.invalidate();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo9075d() {
            float f;
            if (!m12190b()) {
                if (this.f9795e == null) {
                    int i = FaceTecSDK.f8630e.f8610m.progressRadialOffset;
                    if (i == 0) {
                        C2916cu cuVar = C2916cu.this;
                        f = cuVar.f9780j + cuVar.f9776f;
                    } else {
                        f = C2810ax.m10988b((int) (((float) i) * C2938dc.m12404e()));
                    }
                    RectF rectF = C2916cu.this.f9777g;
                    this.f9795e = new RectF(rectF.left + f, rectF.top + f, rectF.right - f, rectF.bottom - f);
                }
                ObjectAnimator d = m12192d(this.f9792b, this.f9797g);
                ObjectAnimator d2 = m12192d(this.f9793c, this.f9798h);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "startStrokePosition", new float[]{Utils.FLOAT_EPSILON, 360.0f});
                boolean g = C2916cu.this.mo9064g();
                ofFloat.addUpdateListener(this.f9796f);
                ofFloat.setInterpolator(this.f9799i);
                long j = 1000;
                ofFloat.setDuration(g ? 1000 : 800);
                this.f9800j = Utils.FLOAT_EPSILON;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "endStrokePosition", new float[]{Utils.FLOAT_EPSILON, 360.0f});
                if (!g) {
                    j = 800;
                }
                ofFloat2.setDuration(j);
                ofFloat2.addUpdateListener(this.f9796f);
                ofFloat2.setInterpolator(this.f9799i);
                ofFloat2.setStartDelay(g ? 200 : 100);
                AnimatorSet animatorSet = new AnimatorSet();
                this.f9794d = animatorSet;
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, d, d2});
                this.f9794d.start();
            }
        }

        public final void setEndStrokePosition(float f) {
            this.f9800j = f;
        }

        public final void setStartStrokePosition(float f) {
            this.f9791a = f;
        }

        /* renamed from: d */
        private ObjectAnimator m12192d(Paint paint, int i) {
            paint.setAlpha(Math.max(0, i - 50));
            double d = (double) i;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(paint, "alpha", new int[]{(int) (0.8d * d), (int) (d * 0.24d)});
            ofInt.setDuration(500);
            ofInt.setInterpolator(new DecelerateInterpolator());
            ofInt.setStartDelay(C2916cu.this.mo9064g() ? 600 : 400);
            return ofInt;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo9060b(boolean z) {
        if (!this.f9786q || z) {
            this.f9786q = true;
            int width = getWidth();
            int height = C2938dc.m12404e() < 1.0f ? Resources.getSystem().getDisplayMetrics().heightPixels : getHeight();
            float f = (float) width;
            float f2 = 0.65f * f;
            float f3 = (f - f2) / 2.0f;
            float height2 = (((float) getHeight()) - (f2 * 1.48f)) / 2.0f;
            RectF rectF = new RectF();
            this.f9775e = rectF;
            rectF.set(f3, height2, f - f3, ((float) getHeight()) - height2);
            RectF rectF2 = new RectF();
            this.f9777g = rectF2;
            RectF rectF3 = this.f9775e;
            float f4 = rectF3.left;
            float f5 = this.f9776f;
            rectF2.set(f4 + (f5 / 2.0f), rectF3.top + (f5 / 2.0f), rectF3.right - (f5 / 2.0f), rectF3.bottom - (f5 / 2.0f));
            RectF rectF4 = new RectF();
            this.f9778h = rectF4;
            RectF rectF5 = this.f9775e;
            float f6 = rectF5.left;
            float f7 = this.f9776f;
            rectF4.set(f6 + f7, rectF5.top + f7, rectF5.right - f7, rectF5.bottom - f7);
            float f8 = 0.98f * f;
            float f9 = (f - f8) / 2.0f;
            float f12 = f8 * 1.7f;
            float f13 = (float) (height - (f9770p << 1));
            if (f13 <= f12) {
                f12 = f13;
            }
            float height3 = (((float) getHeight()) - f12) / 2.0f;
            RectF rectF6 = new RectF();
            this.f9773c = rectF6;
            rectF6.set(f9, height3, f - f9, ((float) getHeight()) - height3);
            this.f9783m = new C2919b(getContext());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo9062e(AnimatorSet animatorSet) {
        this.f9787r = animatorSet;
        this.f9788s.post(new C3622uh(this, animatorSet));
    }
}
