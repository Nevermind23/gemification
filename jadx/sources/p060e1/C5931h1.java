package p060e1;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: e1.h1 */
abstract class C5931h1 extends C5898d1 {

    /* renamed from: d */
    private static boolean f18563d = true;

    /* renamed from: e */
    private static boolean f18564e = true;

    /* renamed from: f */
    private static boolean f18565f = true;

    C5931h1() {
    }

    /* renamed from: d */
    public void mo19304d(View view, Matrix matrix) {
        if (f18563d) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f18563d = false;
            }
        }
    }

    /* renamed from: h */
    public void mo19305h(View view, Matrix matrix) {
        if (f18564e) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f18564e = false;
            }
        }
    }

    /* renamed from: i */
    public void mo19306i(View view, Matrix matrix) {
        if (f18565f) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f18565f = false;
            }
        }
    }
}
