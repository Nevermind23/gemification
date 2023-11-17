package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1266x;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import p292w.C8720a;

/* renamed from: com.google.android.material.appbar.f */
abstract class C4928f extends C4929g {

    /* renamed from: d */
    final Rect f15501d = new Rect();

    /* renamed from: e */
    final Rect f15502e = new Rect();

    /* renamed from: f */
    private int f15503f = 0;

    /* renamed from: g */
    private int f15504g;

    public C4928f() {
    }

    /* renamed from: N */
    private static int m18720N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo15462F(CoordinatorLayout coordinatorLayout, View view, int i) {
        View H = mo15364H(coordinatorLayout.mo2992l(view));
        if (H != null) {
            CoordinatorLayout.C0647f fVar = (CoordinatorLayout.C0647f) view.getLayoutParams();
            Rect rect = this.f15501d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, H.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.m3632y(coordinatorLayout) && !ViewCompat.m3632y(view)) {
                rect.left += lastWindowInsets.mo3494j();
                rect.right -= lastWindowInsets.mo3495k();
            }
            Rect rect2 = this.f15502e;
            C1266x.m4405a(m18720N(fVar.f3217c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int I = mo15463I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            this.f15503f = rect2.top - H.getBottom();
            return;
        }
        super.mo15462F(coordinatorLayout, view, i);
        this.f15503f = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public abstract View mo15364H(List list);

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final int mo15463I(View view) {
        if (this.f15504g == 0) {
            return 0;
        }
        float J = mo15365J(view);
        int i = this.f15504g;
        return C8720a.m32478b((int) (J * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public abstract float mo15365J(View view);

    /* renamed from: K */
    public final int mo15464K() {
        return this.f15504g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo15366L(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final int mo15465M() {
        return this.f15503f;
    }

    /* renamed from: O */
    public final void mo15466O(int i) {
        this.f15504g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public boolean mo15467P() {
        return false;
    }

    /* renamed from: m */
    public boolean mo3047m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View H;
        int i5;
        WindowInsetsCompat lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (H = mo15364H(coordinatorLayout.mo2992l(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (ViewCompat.m3632y(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.mo3496l() + lastWindowInsets.mo3493i();
        }
        int L = size + mo15366L(H);
        int measuredHeight = H.getMeasuredHeight();
        if (mo15467P()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            view.setTranslationY(Utils.FLOAT_EPSILON);
            L -= measuredHeight;
        }
        if (i6 == -1) {
            i5 = 1073741824;
        } else {
            i5 = Integer.MIN_VALUE;
        }
        coordinatorLayout.mo2969D(view, i, i2, View.MeasureSpec.makeMeasureSpec(L, i5), i4);
        return true;
    }

    public C4928f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
