package p060e1;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: e1.m1 */
class C5964m1 extends C5961l1 {
    C5964m1() {
    }

    /* renamed from: b */
    public float mo19258b(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: d */
    public void mo19304d(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* renamed from: e */
    public void mo19370e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: f */
    public void mo19260f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: g */
    public void mo19392g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: h */
    public void mo19305h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: i */
    public void mo19306i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
