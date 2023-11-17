package com.medallia.digital.mobilesdk;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.medallia.digital.mobilesdk.l1 */
final class C10953l1 {

    /* renamed from: e */
    private static final long f31467e = 400;

    /* renamed from: a */
    private Animation f31468a;

    /* renamed from: b */
    private Animation f31469b;

    /* renamed from: c */
    private int f31470c;

    /* renamed from: d */
    private int f31471d;

    C10953l1() {
    }

    /* renamed from: a */
    private void m40074a(int i) {
        this.f31470c = i;
    }

    /* renamed from: b */
    private void m40077b(int i) {
        this.f31471d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Animation mo28651c(View view) {
        if (!m40076a(view) || this.f31468a == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) (-view.getMeasuredHeight()), Utils.FLOAT_EPSILON);
            this.f31468a = translateAnimation;
            translateAnimation.setDuration(f31467e);
            m40074a(view.getMeasuredHeight());
        }
        return this.f31468a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Animation mo28652d(View view) {
        if (!m40076a(view) || this.f31468a == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) view.getMeasuredHeight(), Utils.FLOAT_EPSILON);
            this.f31468a = translateAnimation;
            translateAnimation.setDuration(f31467e);
            m40074a(view.getMeasuredHeight());
        }
        return this.f31468a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Animation mo28653e(View view) {
        if (!m40078b(view) || this.f31469b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) view.getMeasuredWidth());
            this.f31469b = translateAnimation;
            translateAnimation.setDuration(f31467e);
            m40077b(view.getMeasuredHeight());
        }
        return this.f31469b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Animation mo28654f(View view) {
        if (!m40078b(view) || this.f31469b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(Utils.FLOAT_EPSILON, (float) (-view.getMeasuredWidth()), Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            this.f31469b = translateAnimation;
            translateAnimation.setDuration(f31467e);
            m40077b(view.getMeasuredHeight());
        }
        return this.f31469b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Animation mo28655g(View view) {
        if (!m40078b(view) || this.f31469b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(Utils.FLOAT_EPSILON, (float) view.getMeasuredWidth(), Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            this.f31469b = translateAnimation;
            translateAnimation.setDuration(f31467e);
            m40077b(view.getMeasuredHeight());
        }
        return this.f31469b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Animation mo28656h(View view) {
        if (!m40078b(view) || this.f31469b == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) (-view.getMeasuredWidth()));
            this.f31469b = translateAnimation;
            translateAnimation.setDuration(f31467e);
            m40077b(view.getMeasuredHeight());
        }
        return this.f31469b;
    }

    /* renamed from: a */
    private boolean m40075a(int i, View view) {
        return i == view.getMeasuredHeight();
    }

    /* renamed from: b */
    private boolean m40078b(View view) {
        return m40075a(this.f31471d, view);
    }

    /* renamed from: a */
    private boolean m40076a(View view) {
        return m40075a(this.f31470c, view);
    }
}
