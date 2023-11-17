package p060e1;

import android.os.Build;
import android.view.View;

/* renamed from: e1.l1 */
class C5961l1 extends C5947j1 {

    /* renamed from: h */
    private static boolean f18656h = true;

    C5961l1() {
    }

    /* renamed from: g */
    public void mo19392g(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo19392g(view, i);
        } else if (f18656h) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f18656h = false;
            }
        }
    }
}
