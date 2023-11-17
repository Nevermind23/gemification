package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C1310m;
import p030c.C2219j;

/* renamed from: androidx.appcompat.widget.p */
class C0474p extends PopupWindow {

    /* renamed from: b */
    private static final boolean f2194b = false;

    /* renamed from: a */
    private boolean f2195a;

    public C0474p(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1932a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1932a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0483r1 v = C0483r1.m1946v(context, attributeSet, C2219j.f6783g2, i, i2);
        int i3 = C2219j.f6793i2;
        if (v.mo2332s(i3)) {
            m1933b(v.mo2314a(i3, false));
        }
        setBackgroundDrawable(v.mo2320g(C2219j.f6788h2));
        v.mo2333w();
    }

    /* renamed from: b */
    private void m1933b(boolean z) {
        if (f2194b) {
            this.f2195a = z;
        } else {
            C1310m.m4542a(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f2194b && this.f2195a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f2194b && this.f2195a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f2194b && this.f2195a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
