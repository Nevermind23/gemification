package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import p030c.C2219j;

/* renamed from: androidx.appcompat.widget.w */
class C0507w extends C0477q {

    /* renamed from: d */
    private final SeekBar f2266d;

    /* renamed from: e */
    private Drawable f2267e;

    /* renamed from: f */
    private ColorStateList f2268f = null;

    /* renamed from: g */
    private PorterDuff.Mode f2269g = null;

    /* renamed from: h */
    private boolean f2270h = false;

    /* renamed from: i */
    private boolean f2271i = false;

    C0507w(SeekBar seekBar) {
        super(seekBar);
        this.f2266d = seekBar;
    }

    /* renamed from: f */
    private void m2046f() {
        Drawable drawable = this.f2267e;
        if (drawable == null) {
            return;
        }
        if (this.f2270h || this.f2271i) {
            Drawable r = C0836a.m3156r(drawable.mutate());
            this.f2267e = r;
            if (this.f2270h) {
                C0836a.m3153o(r, this.f2268f);
            }
            if (this.f2271i) {
                C0836a.m3154p(this.f2267e, this.f2269g);
            }
            if (this.f2267e.isStateful()) {
                this.f2267e.setState(this.f2266d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2293c(AttributeSet attributeSet, int i) {
        super.mo2293c(attributeSet, i);
        Context context = this.f2266d.getContext();
        int[] iArr = C2219j.f6715T;
        C0483r1 v = C0483r1.m1946v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f2266d;
        ViewCompat.m3615p0(seekBar, seekBar.getContext(), iArr, attributeSet, v.mo2331r(), i, 0);
        Drawable h = v.mo2321h(C2219j.f6720U);
        if (h != null) {
            this.f2266d.setThumb(h);
        }
        mo2361j(v.mo2320g(C2219j.f6725V));
        int i2 = C2219j.f6735X;
        if (v.mo2332s(i2)) {
            this.f2269g = C0485s0.m1971e(v.mo2324k(i2, -1), this.f2269g);
            this.f2271i = true;
        }
        int i3 = C2219j.f6730W;
        if (v.mo2332s(i3)) {
            this.f2268f = v.mo2316c(i3);
            this.f2270h = true;
        }
        v.mo2333w();
        m2046f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2358g(Canvas canvas) {
        int i;
        if (this.f2267e != null) {
            int max = this.f2266d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f2267e.getIntrinsicWidth();
                int intrinsicHeight = this.f2267e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f2267e.setBounds(-i, -i2, i, i2);
                float width = ((float) ((this.f2266d.getWidth() - this.f2266d.getPaddingLeft()) - this.f2266d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f2266d.getPaddingLeft(), (float) (this.f2266d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2267e.draw(canvas);
                    canvas.translate(width, Utils.FLOAT_EPSILON);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2359h() {
        Drawable drawable = this.f2267e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f2266d.getDrawableState())) {
            this.f2266d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2360i() {
        Drawable drawable = this.f2267e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2361j(Drawable drawable) {
        Drawable drawable2 = this.f2267e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2267e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f2266d);
            C0836a.m3151m(drawable, ViewCompat.m3541B(this.f2266d));
            if (drawable.isStateful()) {
                drawable.setState(this.f2266d.getDrawableState());
            }
            m2046f();
        }
        this.f2266d.invalidate();
    }
}
