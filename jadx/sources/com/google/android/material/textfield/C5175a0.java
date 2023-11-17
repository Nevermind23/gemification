package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0483r1;
import androidx.core.view.C1058a0;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.C1314o;
import com.google.android.material.internal.C5089m;
import com.google.android.material.internal.CheckableImageButton;
import p009a8.C0074d;
import p009a8.C0076f;
import p009a8.C0078h;
import p009a8.C0082l;
import p184n8.C7343c;

/* renamed from: com.google.android.material.textfield.a0 */
class C5175a0 extends LinearLayout {

    /* renamed from: d */
    private final TextInputLayout f16597d;

    /* renamed from: e */
    private final TextView f16598e;

    /* renamed from: f */
    private CharSequence f16599f;

    /* renamed from: g */
    private final CheckableImageButton f16600g;

    /* renamed from: h */
    private ColorStateList f16601h;

    /* renamed from: i */
    private PorterDuff.Mode f16602i;

    /* renamed from: j */
    private View.OnLongClickListener f16603j;

    /* renamed from: k */
    private boolean f16604k;

    C5175a0(TextInputLayout textInputLayout, C0483r1 r1Var) {
        super(textInputLayout.getContext());
        this.f16597d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C0078h.f297g, this, false);
        this.f16600g = checkableImageButton;
        C5205u.m20530d(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f16598e = appCompatTextView;
        m20331g(r1Var);
        m20330f(r1Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    /* renamed from: f */
    private void m20330f(C0483r1 r1Var) {
        this.f16598e.setVisibility(8);
        this.f16598e.setId(C0076f.f261a0);
        this.f16598e.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.m3623t0(this.f16598e, 1);
        mo17196l(r1Var.mo2327n(C0082l.f861w8, 0));
        int i = C0082l.f871x8;
        if (r1Var.mo2332s(i)) {
            mo17197m(r1Var.mo2316c(i));
        }
        mo17195k(r1Var.mo2329p(C0082l.f851v8));
    }

    /* renamed from: g */
    private void m20331g(C0483r1 r1Var) {
        if (C7343c.m28011i(getContext())) {
            C1058a0.m3952c((ViewGroup.MarginLayoutParams) this.f16600g.getLayoutParams(), 0);
        }
        mo17202q((View.OnClickListener) null);
        mo17203r((View.OnLongClickListener) null);
        int i = C0082l.f398B8;
        if (r1Var.mo2332s(i)) {
            this.f16601h = C7343c.m28004b(getContext(), r1Var, i);
        }
        int i2 = C0082l.f408C8;
        if (r1Var.mo2332s(i2)) {
            this.f16602i = C5089m.m19906g(r1Var.mo2324k(i2, -1), (PorterDuff.Mode) null);
        }
        int i3 = C0082l.f388A8;
        if (r1Var.mo2332s(i3)) {
            mo17201p(r1Var.mo2320g(i3));
            int i4 = C0082l.f891z8;
            if (r1Var.mo2332s(i4)) {
                mo17199o(r1Var.mo2329p(i4));
            }
            mo17198n(r1Var.mo2314a(C0082l.f881y8, true));
        }
    }

    /* renamed from: x */
    private void m20332x() {
        int i;
        boolean z;
        int i2 = 8;
        if (this.f16599f == null || this.f16604k) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f16600g.getVisibility() == 0 || i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 0;
        }
        setVisibility(i2);
        this.f16598e.setVisibility(i);
        this.f16597d.mo17071l0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence mo17187a() {
        return this.f16599f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo17188b() {
        return this.f16598e.getTextColors();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public TextView mo17189c() {
        return this.f16598e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public CharSequence mo17190d() {
        return this.f16600g.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Drawable mo17191e() {
        return this.f16600g.getDrawable();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo17192h() {
        return this.f16600g.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo17193i(boolean z) {
        this.f16604k = z;
        m20332x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo17194j() {
        C5205u.m20529c(this.f16597d, this.f16600g, this.f16601h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo17195k(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f16599f = charSequence2;
        this.f16598e.setText(charSequence);
        m20332x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo17196l(int i) {
        C1314o.m4575q(this.f16598e, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo17197m(ColorStateList colorStateList) {
        this.f16598e.setTextColor(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo17198n(boolean z) {
        this.f16600g.setCheckable(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo17199o(CharSequence charSequence) {
        if (mo17190d() != charSequence) {
            this.f16600g.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo17208w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo17201p(Drawable drawable) {
        this.f16600g.setImageDrawable(drawable);
        if (drawable != null) {
            C5205u.m20527a(this.f16597d, this.f16600g, this.f16601h, this.f16602i);
            mo17206u(true);
            mo17194j();
            return;
        }
        mo17206u(false);
        mo17202q((View.OnClickListener) null);
        mo17203r((View.OnLongClickListener) null);
        mo17199o((CharSequence) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo17202q(View.OnClickListener onClickListener) {
        C5205u.m20532f(this.f16600g, onClickListener, this.f16603j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo17203r(View.OnLongClickListener onLongClickListener) {
        this.f16603j = onLongClickListener;
        C5205u.m20533g(this.f16600g, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo17204s(ColorStateList colorStateList) {
        if (this.f16601h != colorStateList) {
            this.f16601h = colorStateList;
            C5205u.m20527a(this.f16597d, this.f16600g, colorStateList, this.f16602i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo17205t(PorterDuff.Mode mode) {
        if (this.f16602i != mode) {
            this.f16602i = mode;
            C5205u.m20527a(this.f16597d, this.f16600g, this.f16601h, mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo17206u(boolean z) {
        int i;
        if (mo17192h() != z) {
            CheckableImageButton checkableImageButton = this.f16600g;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            mo17208w();
            m20332x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo17207v(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.f16598e.getVisibility() == 0) {
            accessibilityNodeInfoCompat.mo3612k0(this.f16598e);
            accessibilityNodeInfoCompat.mo3636x0(this.f16598e);
            return;
        }
        accessibilityNodeInfoCompat.mo3636x0(this.f16600g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo17208w() {
        int i;
        EditText editText = this.f16597d.f16549g;
        if (editText != null) {
            if (mo17192h()) {
                i = 0;
            } else {
                i = ViewCompat.m3551G(editText);
            }
            ViewCompat.m3552G0(this.f16598e, i, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C0074d.f173B), editText.getCompoundPaddingBottom());
        }
    }
}
