package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C1314o;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p009a8.C0074d;
import p009a8.C0076f;
import p026b8.C2170a;
import p026b8.C2171b;
import p184n8.C7343c;

/* renamed from: com.google.android.material.textfield.v */
final class C5206v {

    /* renamed from: a */
    private final Context f16669a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final TextInputLayout f16670b;

    /* renamed from: c */
    private LinearLayout f16671c;

    /* renamed from: d */
    private int f16672d;

    /* renamed from: e */
    private FrameLayout f16673e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Animator f16674f;

    /* renamed from: g */
    private final float f16675g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f16676h;

    /* renamed from: i */
    private int f16677i;

    /* renamed from: j */
    private CharSequence f16678j;

    /* renamed from: k */
    private boolean f16679k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public TextView f16680l;

    /* renamed from: m */
    private CharSequence f16681m;

    /* renamed from: n */
    private int f16682n;

    /* renamed from: o */
    private ColorStateList f16683o;

    /* renamed from: p */
    private CharSequence f16684p;

    /* renamed from: q */
    private boolean f16685q;

    /* renamed from: r */
    private TextView f16686r;

    /* renamed from: s */
    private int f16687s;

    /* renamed from: t */
    private ColorStateList f16688t;

    /* renamed from: u */
    private Typeface f16689u;

    /* renamed from: com.google.android.material.textfield.v$a */
    class C5207a extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ int f16690d;

        /* renamed from: e */
        final /* synthetic */ TextView f16691e;

        /* renamed from: f */
        final /* synthetic */ int f16692f;

        /* renamed from: g */
        final /* synthetic */ TextView f16693g;

        C5207a(int i, TextView textView, int i2, TextView textView2) {
            this.f16690d = i;
            this.f16691e = textView;
            this.f16692f = i2;
            this.f16693g = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C5206v.this.f16676h = this.f16690d;
            Animator unused2 = C5206v.this.f16674f = null;
            TextView textView = this.f16691e;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f16692f == 1 && C5206v.this.f16680l != null) {
                    C5206v.this.f16680l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f16693g;
            if (textView2 != null) {
                textView2.setTranslationY(Utils.FLOAT_EPSILON);
                this.f16693g.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f16693g;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.v$b */
    class C5208b extends View.AccessibilityDelegate {
        C5208b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = C5206v.this.f16670b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public C5206v(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f16669a = context;
        this.f16670b = textInputLayout;
        this.f16675g = (float) context.getResources().getDimensionPixelSize(C0074d.f220n);
    }

    /* renamed from: C */
    private void m20534C(int i, int i2) {
        TextView m;
        TextView m2;
        if (i != i2) {
            if (!(i2 == 0 || (m2 = m20547m(i2)) == null)) {
                m2.setVisibility(0);
                m2.setAlpha(1.0f);
            }
            if (!(i == 0 || (m = m20547m(i)) == null)) {
                m.setVisibility(4);
                if (i == 1) {
                    m.setText((CharSequence) null);
                }
            }
            this.f16676h = i2;
        }
    }

    /* renamed from: K */
    private void m20535K(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: M */
    private void m20536M(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: N */
    private boolean m20537N(TextView textView, CharSequence charSequence) {
        if (!ViewCompat.m3579V(this.f16670b) || !this.f16670b.isEnabled() || (this.f16677i == this.f16676h && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    private void m20538Q(int i, int i2, boolean z) {
        boolean z2 = z;
        if (i != i2) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f16674f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                int i4 = i2;
                m20544i(arrayList2, this.f16685q, this.f16686r, 2, i3, i4);
                m20544i(arrayList2, this.f16679k, this.f16680l, 1, i3, i4);
                C2171b.m8293a(animatorSet, arrayList);
                animatorSet.addListener(new C5207a(i2, m20547m(i), i, m20547m(i2)));
                animatorSet.start();
            } else {
                m20534C(i, i2);
            }
            this.f16670b.mo17072m0();
            this.f16670b.mo17080q0(z2);
            this.f16670b.mo17170w0();
        }
    }

    /* renamed from: g */
    private boolean m20543g() {
        return (this.f16671c == null || this.f16670b.getEditText() == null) ? false : true;
    }

    /* renamed from: i */
    private void m20544i(List list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list.add(m20545j(textView, z2));
                if (i3 == i) {
                    list.add(m20546k(textView));
                }
            }
        }
    }

    /* renamed from: j */
    private ObjectAnimator m20545j(TextView textView, boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C2170a.f6350a);
        return ofFloat;
    }

    /* renamed from: k */
    private ObjectAnimator m20546k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f16675g, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C2170a.f6353d);
        return ofFloat;
    }

    /* renamed from: m */
    private TextView m20547m(int i) {
        if (i == 1) {
            return this.f16680l;
        }
        if (i != 2) {
            return null;
        }
        return this.f16686r;
    }

    /* renamed from: u */
    private int m20548u(boolean z, int i, int i2) {
        return z ? this.f16669a.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: x */
    private boolean m20549x(int i) {
        if (i != 1 || this.f16680l == null || TextUtils.isEmpty(this.f16678j)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo17302A() {
        return this.f16685q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo17303B(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f16671c != null) {
            if (!mo17327y(i) || (frameLayout = this.f16673e) == null) {
                this.f16671c.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.f16672d - 1;
            this.f16672d = i2;
            m20536M(this.f16671c, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo17304D(CharSequence charSequence) {
        this.f16681m = charSequence;
        TextView textView = this.f16680l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo17305E(boolean z) {
        if (this.f16679k != z) {
            mo17316h();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f16669a);
                this.f16680l = appCompatTextView;
                appCompatTextView.setId(C0076f.f257X);
                this.f16680l.setTextAlignment(5);
                Typeface typeface = this.f16689u;
                if (typeface != null) {
                    this.f16680l.setTypeface(typeface);
                }
                mo17306F(this.f16682n);
                mo17307G(this.f16683o);
                mo17304D(this.f16681m);
                this.f16680l.setVisibility(4);
                ViewCompat.m3623t0(this.f16680l, 1);
                mo17314e(this.f16680l, 0);
            } else {
                mo17325v();
                mo17303B(this.f16680l, 0);
                this.f16680l = null;
                this.f16670b.mo17072m0();
                this.f16670b.mo17170w0();
            }
            this.f16679k = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo17306F(int i) {
        this.f16682n = i;
        TextView textView = this.f16680l;
        if (textView != null) {
            this.f16670b.mo17009a0(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo17307G(ColorStateList colorStateList) {
        this.f16683o = colorStateList;
        TextView textView = this.f16680l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo17308H(int i) {
        this.f16687s = i;
        TextView textView = this.f16686r;
        if (textView != null) {
            C1314o.m4575q(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo17309I(boolean z) {
        if (this.f16685q != z) {
            mo17316h();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f16669a);
                this.f16686r = appCompatTextView;
                appCompatTextView.setId(C0076f.f258Y);
                this.f16686r.setTextAlignment(5);
                Typeface typeface = this.f16689u;
                if (typeface != null) {
                    this.f16686r.setTypeface(typeface);
                }
                this.f16686r.setVisibility(4);
                ViewCompat.m3623t0(this.f16686r, 1);
                mo17308H(this.f16687s);
                mo17310J(this.f16688t);
                mo17314e(this.f16686r, 1);
                this.f16686r.setAccessibilityDelegate(new C5208b());
            } else {
                mo17326w();
                mo17303B(this.f16686r, 1);
                this.f16686r = null;
                this.f16670b.mo17072m0();
                this.f16670b.mo17170w0();
            }
            this.f16685q = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo17310J(ColorStateList colorStateList) {
        this.f16688t = colorStateList;
        TextView textView = this.f16686r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo17311L(Typeface typeface) {
        if (typeface != this.f16689u) {
            this.f16689u = typeface;
            m20535K(this.f16680l, typeface);
            m20535K(this.f16686r, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo17312O(CharSequence charSequence) {
        mo17316h();
        this.f16678j = charSequence;
        this.f16680l.setText(charSequence);
        int i = this.f16676h;
        if (i != 1) {
            this.f16677i = 1;
        }
        m20538Q(i, this.f16677i, m20537N(this.f16680l, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo17313P(CharSequence charSequence) {
        mo17316h();
        this.f16684p = charSequence;
        this.f16686r.setText(charSequence);
        int i = this.f16676h;
        if (i != 2) {
            this.f16677i = 2;
        }
        m20538Q(i, this.f16677i, m20537N(this.f16686r, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo17314e(TextView textView, int i) {
        if (this.f16671c == null && this.f16673e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f16669a);
            this.f16671c = linearLayout;
            linearLayout.setOrientation(0);
            this.f16670b.addView(this.f16671c, -1, -2);
            this.f16673e = new FrameLayout(this.f16669a);
            this.f16671c.addView(this.f16673e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f16670b.getEditText() != null) {
                mo17315f();
            }
        }
        if (mo17327y(i)) {
            this.f16673e.setVisibility(0);
            this.f16673e.addView(textView);
        } else {
            this.f16671c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f16671c.setVisibility(0);
        this.f16672d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo17315f() {
        if (m20543g()) {
            EditText editText = this.f16670b.getEditText();
            boolean i = C7343c.m28011i(this.f16669a);
            LinearLayout linearLayout = this.f16671c;
            int i2 = C0074d.f232z;
            ViewCompat.m3552G0(linearLayout, m20548u(i, i2, ViewCompat.m3551G(editText)), m20548u(i, C0074d.f172A, this.f16669a.getResources().getDimensionPixelSize(C0074d.f231y)), m20548u(i, i2, ViewCompat.m3549F(editText)), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo17316h() {
        Animator animator = this.f16674f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo17317l() {
        return m20549x(this.f16677i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public CharSequence mo17318n() {
        return this.f16681m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public CharSequence mo17319o() {
        return this.f16678j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo17320p() {
        TextView textView = this.f16680l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public ColorStateList mo17321q() {
        TextView textView = this.f16680l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public CharSequence mo17322r() {
        return this.f16684p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public View mo17323s() {
        return this.f16686r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo17324t() {
        TextView textView = this.f16686r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo17325v() {
        this.f16678j = null;
        mo17316h();
        if (this.f16676h == 1) {
            if (!this.f16685q || TextUtils.isEmpty(this.f16684p)) {
                this.f16677i = 0;
            } else {
                this.f16677i = 2;
            }
        }
        m20538Q(this.f16676h, this.f16677i, m20537N(this.f16680l, ""));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo17326w() {
        mo17316h();
        int i = this.f16676h;
        if (i == 2) {
            this.f16677i = 0;
        }
        m20538Q(i, this.f16677i, m20537N(this.f16686r, ""));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo17327y(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo17328z() {
        return this.f16679k;
    }
}
