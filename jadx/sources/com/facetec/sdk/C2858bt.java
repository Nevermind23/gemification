package com.facetec.sdk;

import android.animation.Animator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewPropertyAnimator;
import androidx.core.content.C0767a;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.facetec.sdk.C2792ao;
import com.facetec.sdk.FaceTecCancelButtonCustomization;
import com.github.mikephil.charting.utils.Utils;
import java.util.Objects;

/* renamed from: com.facetec.sdk.bt */
final class C2858bt {

    /* renamed from: a */
    protected AnimatedVectorDrawableCompat f9360a;

    /* renamed from: b */
    private boolean f9361b = false;

    /* renamed from: c */
    private boolean f9362c = false;

    /* renamed from: d */
    protected final C2900cm f9363d;

    /* renamed from: e */
    private final Handler f9364e = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private boolean f9365i;

    C2858bt(C2900cm cmVar, boolean z) {
        this.f9363d = cmVar;
        this.f9365i = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m11649t() {
        m11608a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m11650x() {
        m11607a(C2938dc.m12397d(C2857bs.STARTING, this.f9365i));
        this.f9363d.f9636e.animate().alpha(1.0f).setDuration(800).setListener((Animator.AnimatorListener) null).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m11651y() {
        m11608a(false);
    }

    /* renamed from: a */
    private void m11608a(boolean z) {
        m11612c();
        this.f9363d.mo8844e(new C2877c9(this, z));
    }

    /* renamed from: c */
    private void m11612c() {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.f9360a;
        if (animatedVectorDrawableCompat != null) {
            animatedVectorDrawableCompat.stop();
            this.f9360a.mo6265a();
            this.f9360a = null;
        }
    }

    /* renamed from: e */
    private void m11618e(boolean z) {
        float f = z ? 1.0f : Utils.FLOAT_EPSILON;
        FaceTecSessionActivity faceTecSessionActivity = (FaceTecSessionActivity) this.f9363d.getActivity();
        if (FaceTecSDK.f8630e.f8612o.f8592a != FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            this.f9363d.f9641j.animate().alpha(f).setDuration(800).setListener((Animator.AnimatorListener) null).start();
            this.f9363d.f9641j.setEnabled(z);
            return;
        }
        faceTecSessionActivity.f9164o.animate().alpha(f).setDuration(800).setListener((Animator.AnimatorListener) null).start();
        faceTecSessionActivity.f9164o.setEnabled(z);
    }

    /* renamed from: f */
    private void m11619f() {
        int i = this.f9363d.f9639h.getAlpha() == 1.0f ? 0 : 6000;
        m11616e();
        m11615d(false);
        m11611b(false);
        Handler handler = this.f9364e;
        C2900cm cmVar = this.f9363d;
        Objects.requireNonNull(cmVar);
        handler.postDelayed(new C2792ao.C2793e(new C3636v8(this)), (long) i);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m11623g(boolean z) {
        m11619f();
        if (z) {
            ViewPropertyAnimator listener = this.f9363d.f9636e.animate().alpha(Utils.FLOAT_EPSILON).setDuration(800).setListener((Animator.AnimatorListener) null);
            C2900cm cmVar = this.f9363d;
            Objects.requireNonNull(cmVar);
            listener.withEndAction(new C2792ao.C2793e(new C3457n8(this))).start();
            return;
        }
        this.f9363d.mo9038c((Runnable) new C3678x8(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m11624h() {
        if (!this.f9362c && this.f9363d.f9639h.getAlpha() == 1.0f && !this.f9363d.f9639h.isEnabled()) {
            C2983e eVar = this.f9363d.f9639h;
            eVar.mo9158c(true, eVar.getAlpha() > Utils.FLOAT_EPSILON);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m11626i() {
        if (!this.f9361b) {
            ViewPropertyAnimator listener = this.f9363d.f9639h.animate().alpha(1.0f).setDuration((long) (this.f9363d.f9639h.getAlpha() == 1.0f ? 0 : 800)).setListener((Animator.AnimatorListener) null);
            C2900cm cmVar = this.f9363d;
            Objects.requireNonNull(cmVar);
            listener.withEndAction(new C2792ao.C2793e(new C3501p8(this)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m11630j(boolean z) {
        int i;
        int i2;
        Drawable drawable;
        if (this.f9365i) {
            i2 = C2938dc.m12346ba();
            i = C2938dc.m12282aX();
        } else {
            i2 = C2938dc.m12283aY();
            i = C2938dc.m12284aZ();
        }
        Activity activity = this.f9363d.getActivity();
        if (z && i != 0) {
            this.f9360a = C2810ax.m10990b(activity, i);
        } else if (!z && i2 != 0) {
            this.f9360a = C2810ax.m10990b(activity, i2);
        }
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.f9360a;
        if (animatedVectorDrawableCompat != null) {
            this.f9363d.f9635d.setImageDrawable(animatedVectorDrawableCompat);
            this.f9360a.mo6269d(new Animatable2Compat$AnimationCallback() {
                public final void onAnimationEnd(Drawable drawable) {
                    C2858bt.this.f9363d.mo8844e(new C3158g9(this));
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m11656a() {
                    AnimatedVectorDrawableCompat animatedVectorDrawableCompat = C2858bt.this.f9360a;
                    if (animatedVectorDrawableCompat != null) {
                        animatedVectorDrawableCompat.start();
                    }
                }
            });
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = this.f9360a;
            if (animatedVectorDrawableCompat2 != null) {
                animatedVectorDrawableCompat2.start();
                return;
            }
            return;
        }
        this.f9363d.f9635d.getLayoutParams().width = (int) (((float) this.f9363d.f9635d.getLayoutParams().height) * 0.875f);
        this.f9363d.f9635d.requestLayout();
        if (z) {
            int bc = C2938dc.m12348bc();
            if (bc == 0) {
                bc = C2747R.C2748drawable.facetec_internal_nfc;
            }
            drawable = C0767a.m2895e(activity, bc);
        } else {
            int bb = C2938dc.m12347bb();
            if (bb == 0) {
                bb = C2747R.C2748drawable.facetec_internal_nfc;
            }
            drawable = C0767a.m2895e(activity, bb);
        }
        if (drawable != null) {
            this.f9363d.f9635d.setImageDrawable(drawable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m11631k() {
        m11612c();
        this.f9363d.mo9036c().setVisibility(8);
        this.f9363d.f9633b.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m11633l() {
        this.f9363d.f9639h.animate().alpha(Utils.FLOAT_EPSILON).setDuration(800).setListener((Animator.AnimatorListener) null).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m11635m() {
        m11615d(true);
        m11618e(false);
        this.f9363d.f9635d.animate().alpha(Utils.FLOAT_EPSILON).setDuration(800).setListener((Animator.AnimatorListener) null).start();
        ViewPropertyAnimator listener = this.f9363d.f9636e.animate().alpha(Utils.FLOAT_EPSILON).setDuration(800).setListener((Animator.AnimatorListener) null);
        C2900cm cmVar = this.f9363d;
        Objects.requireNonNull(cmVar);
        listener.withEndAction(new C2792ao.C2793e(new C2935d9(this))).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m11637n() {
        m11615d(true);
        m11618e(false);
        ViewPropertyAnimator listener = this.f9363d.f9632a.animate().alpha(Utils.FLOAT_EPSILON).setDuration(800).setListener((Animator.AnimatorListener) null);
        C2900cm cmVar = this.f9363d;
        Objects.requireNonNull(cmVar);
        listener.withEndAction(new C2792ao.C2793e(new C2826b9(this))).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m11639o() {
        m11607a(C2938dc.m12397d(C2857bs.SCANNING, this.f9365i));
        this.f9363d.f9635d.animate().alpha(1.0f).setDuration(800).setListener((Animator.AnimatorListener) null).start();
        this.f9363d.f9636e.animate().alpha(1.0f).setDuration(800).setListener((Animator.AnimatorListener) null).start();
        this.f9363d.mo8845e(new C2995e9(this), 100);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m11641p() {
        m11607a(C2938dc.m12397d(C2857bs.WEAK_CONNECTION, this.f9365i));
        this.f9363d.f9635d.animate().alpha(1.0f).setDuration(800).setListener((Animator.AnimatorListener) null).start();
        this.f9363d.f9636e.animate().alpha(1.0f).setDuration(800).setListener((Animator.AnimatorListener) null).start();
        m11618e(true);
        this.f9363d.mo8845e(new C3522q8(this), 100);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m11643q() {
        m11619f();
        this.f9363d.f9635d.animate().alpha(Utils.FLOAT_EPSILON).setDuration(800).setListener((Animator.AnimatorListener) null).start();
        ViewPropertyAnimator listener = this.f9363d.f9636e.animate().alpha(Utils.FLOAT_EPSILON).setDuration(800).setListener((Animator.AnimatorListener) null);
        C2900cm cmVar = this.f9363d;
        Objects.requireNonNull(cmVar);
        listener.withEndAction(new C2792ao.C2793e(new C3657w8(this))).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m11645r() {
        m11608a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m11647s() {
        FaceTecSessionActivity faceTecSessionActivity = (FaceTecSessionActivity) this.f9363d.getActivity();
        if (faceTecSessionActivity != null) {
            FaceTecCancelButtonCustomization.ButtonLocation buttonLocation = FaceTecSDK.f8630e.f8612o.f8592a;
            FaceTecCancelButtonCustomization.ButtonLocation buttonLocation2 = FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM;
            if (buttonLocation != buttonLocation2 && FaceTecSDK.f8630e.f8612o.f8592a != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
                this.f9363d.f9641j.setVisibility(0);
            } else if (FaceTecSDK.f8630e.f8612o.f8592a == buttonLocation2) {
                faceTecSessionActivity.f9164o.setVisibility(0);
                faceTecSessionActivity.f9164o.setAlpha(Utils.FLOAT_EPSILON);
            }
            if (!C2954dn.m12491a(this.f9363d.getActivity()) || C2954dn.m12497d(faceTecSessionActivity)) {
                m11607a(C2938dc.m12397d(C2857bs.STARTING, this.f9365i));
            } else {
                m11615d(true);
                faceTecSessionActivity.mo8938H();
                m11607a(C2938dc.m12397d(C2857bs.DISABLED, this.f9365i));
            }
            this.f9363d.f9632a.animate().alpha(1.0f).setDuration(800).setListener((Animator.AnimatorListener) null).start();
            this.f9363d.mo9036c().animate().alpha(1.0f).setDuration(800).setListener((Animator.AnimatorListener) null).start();
            m11618e(true);
            this.f9363d.mo8845e(new C3571s8(this), 100);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8983b() {
        this.f9363d.mo8844e(new C3592t8(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8985d() {
        this.f9363d.mo8844e(new C3699y8(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m11610b(String str) {
        this.f9363d.f9636e.setText(str);
    }

    /* renamed from: d */
    private void m11615d(boolean z) {
        this.f9361b = z;
        if (z) {
            m11616e();
            m11611b(true);
            this.f9363d.mo8844e(new C3061f9(this));
        }
    }

    /* renamed from: b */
    private void m11611b(boolean z) {
        this.f9362c = z;
        if (z) {
            m11616e();
            this.f9363d.mo8844e(new C3720z8(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8982a() {
        this.f9363d.mo8844e(new C3480o8(this));
    }

    /* renamed from: a */
    private void m11607a(String str) {
        if (this.f9363d.getActivity() != null) {
            this.f9363d.mo8844e(new C3613u8(this, str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m11621g() {
        C2983e eVar = this.f9363d.f9639h;
        eVar.mo9158c(false, eVar.getAlpha() > Utils.FLOAT_EPSILON);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo8984c(boolean z) {
        if (this.f9363d.getActivity() != null) {
            this.f9363d.mo8844e(new C3543r8(this, z));
        }
    }

    /* renamed from: e */
    private void m11616e() {
        Handler handler = this.f9364e;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m11628j() {
        if (!this.f9362c) {
            int i = (this.f9363d.f9639h.getAlpha() != 1.0f || !this.f9363d.f9639h.isEnabled()) ? 4000 : 0;
            m11611b(false);
            Handler handler = this.f9364e;
            C2900cm cmVar = this.f9363d;
            Objects.requireNonNull(cmVar);
            handler.postDelayed(new C2792ao.C2793e(new C2763a9(this)), (long) i);
        }
    }
}
