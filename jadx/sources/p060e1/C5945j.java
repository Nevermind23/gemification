package p060e1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: e1.j */
public class C5945j extends C5936i0 {

    /* renamed from: M */
    private static final String[] f18613M = {"android:changeScroll:x", "android:changeScroll:y"};

    public C5945j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: A0 */
    private void m23868A0(C5989q0 q0Var) {
        q0Var.f18718a.put("android:changeScroll:x", Integer.valueOf(q0Var.f18719b.getScrollX()));
        q0Var.f18718a.put("android:changeScroll:y", Integer.valueOf(q0Var.f18719b.getScrollY()));
    }

    /* renamed from: V */
    public String[] mo19264V() {
        return f18613M;
    }

    /* renamed from: k */
    public void mo16526k(C5989q0 q0Var) {
        m23868A0(q0Var);
    }

    /* renamed from: n */
    public void mo16527n(C5989q0 q0Var) {
        m23868A0(q0Var);
    }

    /* renamed from: r */
    public Animator mo16528r(ViewGroup viewGroup, C5989q0 q0Var, C5989q0 q0Var2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (q0Var == null || q0Var2 == null) {
            return null;
        }
        View view = q0Var2.f18719b;
        int intValue = ((Integer) q0Var.f18718a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) q0Var2.f18718a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) q0Var.f18718a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) q0Var2.f18718a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        return C5985p0.m24056c(objectAnimator, objectAnimator2);
    }
}
