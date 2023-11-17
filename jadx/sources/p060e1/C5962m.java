package p060e1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: e1.m */
public class C5962m extends C5974o1 {

    /* renamed from: P */
    private static final TimeInterpolator f18657P = new DecelerateInterpolator();

    /* renamed from: Q */
    private static final TimeInterpolator f18658Q = new AccelerateInterpolator();

    /* renamed from: O */
    private int[] f18659O = new int[2];

    public C5962m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo19360w0(new C5957l());
    }

    /* renamed from: A0 */
    private void m23919A0(C5989q0 q0Var) {
        View view = q0Var.f18719b;
        view.getLocationOnScreen(this.f18659O);
        int[] iArr = this.f18659O;
        int i = iArr[0];
        int i2 = iArr[1];
        q0Var.f18718a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    /* renamed from: I0 */
    private static float m23920I0(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    /* renamed from: J0 */
    private static float m23921J0(View view, int i, int i2) {
        return m23920I0((float) Math.max(i, view.getWidth() - i), (float) Math.max(i2, view.getHeight() - i2));
    }

    /* renamed from: K0 */
    private void m23922K0(View view, Rect rect, int[] iArr) {
        int i;
        int i2;
        View view2 = view;
        view2.getLocationOnScreen(this.f18659O);
        int[] iArr2 = this.f18659O;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        Rect H = mo19318H();
        if (H == null) {
            i2 = (view.getWidth() / 2) + i3 + Math.round(view.getTranslationX());
            i = (view.getHeight() / 2) + i4 + Math.round(view.getTranslationY());
        } else {
            int centerX = H.centerX();
            i = H.centerY();
            i2 = centerX;
        }
        float centerX2 = (float) (rect.centerX() - i2);
        float centerY = (float) (rect.centerY() - i);
        if (centerX2 == Utils.FLOAT_EPSILON && centerY == Utils.FLOAT_EPSILON) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float I0 = m23920I0(centerX2, centerY);
        float J0 = m23921J0(view2, i2 - i3, i - i4);
        iArr[0] = Math.round((centerX2 / I0) * J0);
        iArr[1] = Math.round(J0 * (centerY / I0));
    }

    /* renamed from: D0 */
    public Animator mo19298D0(ViewGroup viewGroup, View view, C5989q0 q0Var, C5989q0 q0Var2) {
        if (q0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) q0Var2.f18718a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        m23922K0(viewGroup, rect, this.f18659O);
        int[] iArr = this.f18659O;
        return C5995s0.m24078a(view, q0Var2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, f18657P, this);
    }

    /* renamed from: F0 */
    public Animator mo19299F0(ViewGroup viewGroup, View view, C5989q0 q0Var, C5989q0 q0Var2) {
        float f;
        float f2;
        if (q0Var == null) {
            return null;
        }
        Rect rect = (Rect) q0Var.f18718a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) q0Var.f18719b.getTag(C5894c0.f18493f);
        if (iArr != null) {
            int i3 = iArr[0];
            f2 = ((float) (i3 - rect.left)) + translationX;
            int i4 = iArr[1];
            f = ((float) (i4 - rect.top)) + translationY;
            rect.offsetTo(i3, i4);
        } else {
            f2 = translationX;
            f = translationY;
        }
        m23922K0(viewGroup, rect, this.f18659O);
        int[] iArr2 = this.f18659O;
        return C5995s0.m24078a(view, q0Var, i, i2, translationX, translationY, f2 + ((float) iArr2[0]), f + ((float) iArr2[1]), f18658Q, this);
    }

    /* renamed from: k */
    public void mo16526k(C5989q0 q0Var) {
        super.mo16526k(q0Var);
        m23919A0(q0Var);
    }

    /* renamed from: n */
    public void mo16527n(C5989q0 q0Var) {
        super.mo16527n(q0Var);
        m23919A0(q0Var);
    }
}
