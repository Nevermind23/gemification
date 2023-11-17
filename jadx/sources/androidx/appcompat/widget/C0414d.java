package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import p030c.C2219j;

/* renamed from: androidx.appcompat.widget.d */
class C0414d {

    /* renamed from: a */
    private final View f2065a;

    /* renamed from: b */
    private final C0444i f2066b;

    /* renamed from: c */
    private int f2067c = -1;

    /* renamed from: d */
    private C0476p1 f2068d;

    /* renamed from: e */
    private C0476p1 f2069e;

    /* renamed from: f */
    private C0476p1 f2070f;

    C0414d(View view) {
        this.f2065a = view;
        this.f2066b = C0444i.m1769b();
    }

    /* renamed from: a */
    private boolean m1674a(Drawable drawable) {
        if (this.f2070f == null) {
            this.f2070f = new C0476p1();
        }
        C0476p1 p1Var = this.f2070f;
        p1Var.mo2291a();
        ColorStateList s = ViewCompat.m3620s(this.f2065a);
        if (s != null) {
            p1Var.f2199d = true;
            p1Var.f2196a = s;
        }
        PorterDuff.Mode t = ViewCompat.m3622t(this.f2065a);
        if (t != null) {
            p1Var.f2198c = true;
            p1Var.f2197b = t;
        }
        if (!p1Var.f2199d && !p1Var.f2198c) {
            return false;
        }
        C0444i.m1772i(drawable, p1Var, this.f2065a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m1675k() {
        return this.f2068d != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2019b() {
        Drawable background = this.f2065a.getBackground();
        if (background == null) {
            return;
        }
        if (!m1675k() || !m1674a(background)) {
            C0476p1 p1Var = this.f2069e;
            if (p1Var != null) {
                C0444i.m1772i(background, p1Var, this.f2065a.getDrawableState());
                return;
            }
            C0476p1 p1Var2 = this.f2068d;
            if (p1Var2 != null) {
                C0444i.m1772i(background, p1Var2, this.f2065a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo2020c() {
        C0476p1 p1Var = this.f2069e;
        if (p1Var != null) {
            return p1Var.f2196a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo2021d() {
        C0476p1 p1Var = this.f2069e;
        if (p1Var != null) {
            return p1Var.f2197b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2022e(AttributeSet attributeSet, int i) {
        Context context = this.f2065a.getContext();
        int[] iArr = C2219j.f6714S3;
        C0483r1 v = C0483r1.m1946v(context, attributeSet, iArr, i, 0);
        View view = this.f2065a;
        ViewCompat.m3615p0(view, view.getContext(), iArr, attributeSet, v.mo2331r(), i, 0);
        try {
            int i2 = C2219j.f6719T3;
            if (v.mo2332s(i2)) {
                this.f2067c = v.mo2327n(i2, -1);
                ColorStateList f = this.f2066b.mo2129f(this.f2065a.getContext(), this.f2067c);
                if (f != null) {
                    mo2025h(f);
                }
            }
            int i3 = C2219j.f6724U3;
            if (v.mo2332s(i3)) {
                ViewCompat.m3629w0(this.f2065a, v.mo2316c(i3));
            }
            int i4 = C2219j.f6729V3;
            if (v.mo2332s(i4)) {
                ViewCompat.m3631x0(this.f2065a, C0485s0.m1971e(v.mo2324k(i4, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.mo2333w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2023f(Drawable drawable) {
        this.f2067c = -1;
        mo2025h((ColorStateList) null);
        mo2019b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2024g(int i) {
        ColorStateList colorStateList;
        this.f2067c = i;
        C0444i iVar = this.f2066b;
        if (iVar != null) {
            colorStateList = iVar.mo2129f(this.f2065a.getContext(), i);
        } else {
            colorStateList = null;
        }
        mo2025h(colorStateList);
        mo2019b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2025h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2068d == null) {
                this.f2068d = new C0476p1();
            }
            C0476p1 p1Var = this.f2068d;
            p1Var.f2196a = colorStateList;
            p1Var.f2199d = true;
        } else {
            this.f2068d = null;
        }
        mo2019b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2026i(ColorStateList colorStateList) {
        if (this.f2069e == null) {
            this.f2069e = new C0476p1();
        }
        C0476p1 p1Var = this.f2069e;
        p1Var.f2196a = colorStateList;
        p1Var.f2199d = true;
        mo2019b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2027j(PorterDuff.Mode mode) {
        if (this.f2069e == null) {
            this.f2069e = new C0476p1();
        }
        C0476p1 p1Var = this.f2069e;
        p1Var.f2197b = mode;
        p1Var.f2198c = true;
        mo2019b();
    }
}
