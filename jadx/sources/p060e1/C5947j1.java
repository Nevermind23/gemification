package p060e1;

import android.view.View;

/* renamed from: e1.j1 */
abstract class C5947j1 extends C5931h1 {

    /* renamed from: g */
    private static boolean f18617g = true;

    C5947j1() {
    }

    /* renamed from: e */
    public void mo19370e(View view, int i, int i2, int i3, int i4) {
        if (f18617g) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f18617g = false;
            }
        }
    }
}
