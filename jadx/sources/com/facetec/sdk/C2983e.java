package com.facetec.sdk;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.C0767a;
import com.facetec.sdk.FaceTecSDK;
import com.github.mikephil.charting.utils.Utils;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

/* renamed from: com.facetec.sdk.e */
class C2983e extends AppCompatButton {

    /* renamed from: a */
    private Drawable f10094a;

    /* renamed from: b */
    private Typeface f10095b;

    /* renamed from: c */
    private int f10096c;

    /* renamed from: d */
    boolean f10097d = false;

    /* renamed from: e */
    private int f10098e;

    /* renamed from: f */
    private int f10099f;

    /* renamed from: g */
    private int f10100g;

    /* renamed from: h */
    private int f10101h;

    /* renamed from: i */
    private int f10102i;

    /* renamed from: j */
    private int f10103j = BogInputLayout.INPUT_NORMAL_STATE;

    /* renamed from: k */
    private FaceTecSDK.C2744a f10104k = FaceTecSDK.C2744a.NORMAL;

    /* renamed from: l */
    private ValueAnimator f10105l = new ValueAnimator();

    /* renamed from: m */
    private boolean f10106m = false;

    /* renamed from: n */
    private C2985a f10107n = C2985a.Guidance;

    /* renamed from: o */
    private boolean f10108o = false;

    /* renamed from: p */
    private ValueAnimator f10109p = new ValueAnimator();

    /* renamed from: s */
    private ValueAnimator f10110s = new ValueAnimator();

    /* renamed from: com.facetec.sdk.e$3 */
    static /* synthetic */ class C29843 {

        /* renamed from: e */
        static final /* synthetic */ int[] f10111e;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facetec.sdk.e$a[] r0 = com.facetec.sdk.C2983e.C2985a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10111e = r0
                com.facetec.sdk.e$a r1 = com.facetec.sdk.C2983e.C2985a.Guidance     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10111e     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.e$a r1 = com.facetec.sdk.C2983e.C2985a.IDScan     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10111e     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.e$a r1 = com.facetec.sdk.C2983e.C2985a.OCRConfirmation     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C2983e.C29843.<clinit>():void");
        }
    }

    /* renamed from: com.facetec.sdk.e$a */
    enum C2985a {
        Guidance,
        IDScan,
        OCRConfirmation
    }

    public C2983e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        m12582e(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m12572b(Runnable runnable, View view) {
        m12583e(false, true);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ boolean m12575c(View view, MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            m12583e(true, false);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < Utils.FLOAT_EPSILON || motionEvent.getX() > ((float) getWidth()) || motionEvent.getY() < Utils.FLOAT_EPSILON || motionEvent.getY() > ((float) getHeight())) {
            m12583e(false, true);
        } else if (motionEvent.getAction() == 1) {
            performClick();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m12577d(Context context, ValueAnimator valueAnimator) {
        this.f10098e = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C2938dc.m12253a(this.f10094a, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* renamed from: e */
    private void m12582e(boolean z) {
        int i;
        int i2;
        int i3;
        if (this.f10097d) {
            m12576d();
        }
        this.f10097d = true;
        Context context = getContext();
        float e = C2938dc.m12404e();
        int i4 = z ? this.f10103j : 0;
        int i5 = this.f10098e;
        int i6 = this.f10100g;
        int i7 = this.f10096c;
        int i8 = C29843.f10111e[this.f10107n.ordinal()];
        if (i8 == 1) {
            i3 = C2938dc.m12408e(context, C2938dc.m12244W());
            if (!isEnabled()) {
                i2 = C2938dc.m12408e(context, C2938dc.m12241T());
                i = C2938dc.m12408e(context, C2938dc.m12242U());
            } else if (this.f10108o) {
                i2 = C2938dc.m12408e(context, C2938dc.m12245X());
                i = C2938dc.m12408e(context, C2938dc.m12239R());
            } else {
                i2 = C2938dc.m12408e(context, C2938dc.m12243V());
                i = C2938dc.m12408e(context, C2938dc.m12240S());
            }
        } else if (i8 == 2) {
            i3 = C2938dc.m12408e(context, C2938dc.m12289ae());
            if (!isEnabled()) {
                i2 = C2938dc.m12408e(context, C2938dc.m12291ag());
                i = C2938dc.m12408e(context, C2938dc.m12246Y());
            } else if (this.f10108o) {
                i2 = C2938dc.m12408e(context, C2938dc.m12287ac());
                i = C2938dc.m12408e(context, C2938dc.m12285aa());
            } else {
                i2 = C2938dc.m12408e(context, C2938dc.m12247Z());
                i = C2938dc.m12408e(context, C2938dc.m12286ab());
            }
        } else if (i8 != 3) {
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            i3 = C2938dc.m12408e(context, C2938dc.m12295ak());
            if (!isEnabled()) {
                i2 = C2938dc.m12408e(context, C2938dc.m12294aj());
                i = C2938dc.m12408e(context, C2938dc.m12290af());
            } else if (this.f10108o) {
                i2 = C2938dc.m12408e(context, C2938dc.m12293ai());
                i = C2938dc.m12408e(context, C2938dc.m12292ah());
            } else {
                i2 = C2938dc.m12408e(context, C2938dc.m12296al());
                i = C2938dc.m12408e(context, C2938dc.m12288ad());
            }
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)});
        this.f10105l = ofObject;
        long j = (long) i4;
        ofObject.setDuration(j);
        this.f10105l.addUpdateListener(new C3533qj(this, context));
        this.f10105l.start();
        ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        this.f10110s = ofObject2;
        ofObject2.setDuration(j);
        this.f10110s.addUpdateListener(new C3554rj(this, context, e));
        this.f10110s.start();
        ValueAnimator ofObject3 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i7), Integer.valueOf(i)});
        this.f10109p = ofObject3;
        ofObject3.setDuration(j);
        this.f10109p.addUpdateListener(new C3582sj(this));
        this.f10109p.addListener(new C3603tj(this));
        this.f10109p.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9155a(Runnable runnable) {
        setOnClickListener(new C3512pj(this, runnable));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9154a() {
        this.f10107n = C2985a.IDScan;
        this.f10106m = false;
        mo9156b();
    }

    /* renamed from: d */
    private void m12576d() {
        this.f10105l.cancel();
        this.f10110s.cancel();
        this.f10109p.cancel();
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: b */
    public final void mo9156b() {
        if (!this.f10106m) {
            C2810ax.m10986a((View) this);
            this.f10106m = true;
            Context context = getContext();
            this.f10094a = C0767a.m2895e(context, C2747R.C2748drawable.facetec_button_background);
            int i = C29843.f10111e[this.f10107n.ordinal()];
            if (i == 1) {
                this.f10098e = C2938dc.m12408e(context, isEnabled() ? C2938dc.m12243V() : C2938dc.m12241T());
                this.f10096c = C2938dc.m12408e(context, isEnabled() ? C2938dc.m12240S() : C2938dc.m12242U());
                this.f10100g = C2938dc.m12408e(context, C2938dc.m12244W());
                this.f10101h = C2938dc.m12434k();
                this.f10099f = C2938dc.m12225D();
                this.f10102i = 20;
                this.f10095b = FaceTecSDK.f8630e.f8606i.buttonFont;
            } else if (i == 2) {
                this.f10098e = C2938dc.m12408e(context, isEnabled() ? C2938dc.m12247Z() : C2938dc.m12291ag());
                this.f10096c = C2938dc.m12408e(context, isEnabled() ? C2938dc.m12286ab() : C2938dc.m12246Y());
                this.f10100g = C2938dc.m12408e(context, C2938dc.m12289ae());
                this.f10101h = C2938dc.m12441n();
                this.f10099f = C2938dc.m12222A();
                this.f10102i = 20;
                this.f10095b = FaceTecSDK.f8630e.f8605h.buttonFont;
            } else if (i == 3) {
                this.f10098e = C2938dc.m12408e(context, isEnabled() ? C2938dc.m12296al() : C2938dc.m12294aj());
                this.f10096c = C2938dc.m12408e(context, isEnabled() ? C2938dc.m12288ad() : C2938dc.m12290af());
                this.f10100g = C2938dc.m12408e(context, C2938dc.m12295ak());
                this.f10101h = C2938dc.m12443o();
                this.f10099f = C2938dc.m12227F();
                this.f10102i = 20;
                this.f10095b = FaceTecSDK.f8630e.f8604g.buttonFont;
            }
            setTextSize(2, ((float) this.f10102i) * C2938dc.m12372c() * C2938dc.m12404e());
            setTypeface(this.f10095b);
            setMaxLines(1);
            m12582e(false);
            setOnTouchListener(new C3491oj(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9157c() {
        this.f10107n = C2985a.OCRConfirmation;
        this.f10106m = false;
        mo9156b();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m12573c(ValueAnimator valueAnimator) {
        this.f10096c = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9158c(boolean z, boolean z2) {
        if (isEnabled() != z) {
            super.setEnabled(z);
            this.f10103j = BogInputLayout.INPUT_NORMAL_STATE;
            m12582e(z2);
        } else if (!this.f10097d) {
            m12582e(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m12580e(Context context, float f, ValueAnimator valueAnimator) {
        this.f10100g = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C2938dc.m12379c(this.f10094a, ((Integer) valueAnimator.getAnimatedValue()).intValue(), Math.round(C2810ax.m10988b(this.f10101h) * f), (double) (C2810ax.m10988b(this.f10099f) * f));
        setBackground(this.f10094a);
        postInvalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m12579e(Animator animator) {
        this.f10097d = false;
    }

    /* renamed from: e */
    private void m12583e(boolean z, boolean z2) {
        if (this.f10108o != z && isEnabled()) {
            this.f10108o = z;
            m12582e(z2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo9159e() {
        FaceTecSDK.C2744a aVar = this.f10104k;
        FaceTecSDK.C2744a aVar2 = FaceTecSDK.f8628c;
        if (aVar != aVar2) {
            this.f10104k = aVar2;
            this.f10103j = 1000;
            m12582e(true);
        }
    }
}
