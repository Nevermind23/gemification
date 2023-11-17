package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C1305j;
import p030c.C2219j;
import p045d.C5769a;

/* renamed from: androidx.appcompat.widget.n */
public class C0468n {

    /* renamed from: a */
    private final ImageView f2171a;

    /* renamed from: b */
    private C0476p1 f2172b;

    /* renamed from: c */
    private C0476p1 f2173c;

    /* renamed from: d */
    private C0476p1 f2174d;

    /* renamed from: e */
    private int f2175e = 0;

    public C0468n(ImageView imageView) {
        this.f2171a = imageView;
    }

    /* renamed from: a */
    private boolean m1883a(Drawable drawable) {
        if (this.f2174d == null) {
            this.f2174d = new C0476p1();
        }
        C0476p1 p1Var = this.f2174d;
        p1Var.mo2291a();
        ColorStateList a = C1305j.m4527a(this.f2171a);
        if (a != null) {
            p1Var.f2199d = true;
            p1Var.f2196a = a;
        }
        PorterDuff.Mode b = C1305j.m4528b(this.f2171a);
        if (b != null) {
            p1Var.f2198c = true;
            p1Var.f2197b = b;
        }
        if (!p1Var.f2199d && !p1Var.f2198c) {
            return false;
        }
        C0444i.m1772i(drawable, p1Var, this.f2171a.getDrawableState());
        return true;
    }

    /* renamed from: l */
    private boolean m1884l() {
        return this.f2172b != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2222b() {
        if (this.f2171a.getDrawable() != null) {
            this.f2171a.getDrawable().setLevel(this.f2175e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2223c() {
        Drawable drawable = this.f2171a.getDrawable();
        if (drawable != null) {
            C0485s0.m1968b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m1884l() || !m1883a(drawable)) {
            C0476p1 p1Var = this.f2173c;
            if (p1Var != null) {
                C0444i.m1772i(drawable, p1Var, this.f2171a.getDrawableState());
                return;
            }
            C0476p1 p1Var2 = this.f2172b;
            if (p1Var2 != null) {
                C0444i.m1772i(drawable, p1Var2, this.f2171a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ColorStateList mo2224d() {
        C0476p1 p1Var = this.f2173c;
        if (p1Var != null) {
            return p1Var.f2196a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public PorterDuff.Mode mo2225e() {
        C0476p1 p1Var = this.f2173c;
        if (p1Var != null) {
            return p1Var.f2197b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo2226f() {
        if (this.f2171a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo2227g(AttributeSet attributeSet, int i) {
        int n;
        Context context = this.f2171a.getContext();
        int[] iArr = C2219j.f6695P;
        C0483r1 v = C0483r1.m1946v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f2171a;
        ViewCompat.m3615p0(imageView, imageView.getContext(), iArr, attributeSet, v.mo2331r(), i, 0);
        try {
            Drawable drawable = this.f2171a.getDrawable();
            if (!(drawable != null || (n = v.mo2327n(C2219j.f6700Q, -1)) == -1 || (drawable = C5769a.m23210b(this.f2171a.getContext(), n)) == null)) {
                this.f2171a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0485s0.m1968b(drawable);
            }
            int i2 = C2219j.f6705R;
            if (v.mo2332s(i2)) {
                C1305j.m4529c(this.f2171a, v.mo2316c(i2));
            }
            int i3 = C2219j.f6710S;
            if (v.mo2332s(i3)) {
                C1305j.m4530d(this.f2171a, C0485s0.m1971e(v.mo2324k(i3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.mo2333w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2228h(Drawable drawable) {
        this.f2175e = drawable.getLevel();
    }

    /* renamed from: i */
    public void mo2229i(int i) {
        if (i != 0) {
            Drawable b = C5769a.m23210b(this.f2171a.getContext(), i);
            if (b != null) {
                C0485s0.m1968b(b);
            }
            this.f2171a.setImageDrawable(b);
        } else {
            this.f2171a.setImageDrawable((Drawable) null);
        }
        mo2223c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2230j(ColorStateList colorStateList) {
        if (this.f2173c == null) {
            this.f2173c = new C0476p1();
        }
        C0476p1 p1Var = this.f2173c;
        p1Var.f2196a = colorStateList;
        p1Var.f2199d = true;
        mo2223c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2231k(PorterDuff.Mode mode) {
        if (this.f2173c == null) {
            this.f2173c = new C0476p1();
        }
        C0476p1 p1Var = this.f2173c;
        p1Var.f2197b = mode;
        p1Var.f2198c = true;
        mo2223c();
    }
}
