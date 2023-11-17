package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.github.mikephil.charting.utils.Utils;
import p009a8.C0075e;
import p009a8.C0080j;
import p026b8.C2170a;

/* renamed from: com.google.android.material.textfield.f */
class C5183f extends C5204t {

    /* renamed from: e */
    private EditText f16609e;

    /* renamed from: f */
    private final View.OnClickListener f16610f = new C5180d(this);

    /* renamed from: g */
    private final View.OnFocusChangeListener f16611g = new C5182e(this);

    /* renamed from: h */
    private AnimatorSet f16612h;

    /* renamed from: i */
    private ValueAnimator f16613i;

    /* renamed from: com.google.android.material.textfield.f$a */
    class C5184a extends AnimatorListenerAdapter {
        C5184a() {
        }

        public void onAnimationStart(Animator animator) {
            C5183f.this.f16666b.mo17265V(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.f$b */
    class C5185b extends AnimatorListenerAdapter {
        C5185b() {
        }

        public void onAnimationEnd(Animator animator) {
            C5183f.this.f16666b.mo17265V(false);
        }
    }

    C5183f(C5199s sVar) {
        super(sVar);
    }

    /* renamed from: A */
    private void m20357A(boolean z) {
        boolean z2;
        if (this.f16666b.mo17247C() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.f16612h.isRunning()) {
            this.f16613i.cancel();
            this.f16612h.start();
            if (z2) {
                this.f16612h.end();
            }
        } else if (!z) {
            this.f16612h.cancel();
            this.f16613i.start();
            if (z2) {
                this.f16613i.end();
            }
        }
    }

    /* renamed from: B */
    private ValueAnimator m20358B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C2170a.f6350a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C5178c(this));
        return ofFloat;
    }

    /* renamed from: C */
    private ValueAnimator m20359C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C2170a.f6353d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C5176b(this));
        return ofFloat;
    }

    /* renamed from: D */
    private void m20360D() {
        ValueAnimator C = m20359C();
        ValueAnimator B = m20358B(Utils.FLOAT_EPSILON, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f16612h = animatorSet;
        animatorSet.playTogether(new Animator[]{C, B});
        this.f16612h.addListener(new C5184a());
        ValueAnimator B2 = m20358B(1.0f, Utils.FLOAT_EPSILON);
        this.f16613i = B2;
        B2.addListener(new C5185b());
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m20361E(ValueAnimator valueAnimator) {
        this.f16668d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m20362F(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f16668d.setScaleX(floatValue);
        this.f16668d.setScaleY(floatValue);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m20363G(View view) {
        EditText editText = this.f16609e;
        if (editText != null) {
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            mo17301r();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m20364H(View view, boolean z) {
        m20357A(m20366J());
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m20365I() {
        m20357A(true);
    }

    /* renamed from: J */
    private boolean m20366J() {
        EditText editText = this.f16609e;
        if (editText == null || ((!editText.hasFocus() && !this.f16668d.hasFocus()) || this.f16609e.getText().length() <= 0)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17213a(Editable editable) {
        if (this.f16666b.mo17293u() == null) {
            m20357A(m20366J());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo17214c() {
        return C0080j.f332e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo17215d() {
        return C0075e.f238i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View.OnFocusChangeListener mo17216e() {
        return this.f16611g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View.OnClickListener mo17217f() {
        return this.f16610f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public View.OnFocusChangeListener mo17218g() {
        return this.f16611g;
    }

    /* renamed from: n */
    public void mo17219n(EditText editText) {
        this.f16609e = editText;
        this.f16665a.setEndIconVisible(m20366J());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo17220q(boolean z) {
        if (this.f16666b.mo17293u() != null) {
            m20357A(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo17221s() {
        m20360D();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo17222u() {
        EditText editText = this.f16609e;
        if (editText != null) {
            editText.post(new C5174a(this));
        }
    }
}
