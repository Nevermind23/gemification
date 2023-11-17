package p060e1;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: e1.u */
abstract class C6000u {
    /* renamed from: a */
    static C5988q m24096a(View view, ViewGroup viewGroup, Matrix matrix) {
        if (Build.VERSION.SDK_INT == 28) {
            return C5994s.m24072b(view, viewGroup, matrix);
        }
        return C5997t.m24084b(view, viewGroup, matrix);
    }

    /* renamed from: b */
    static void m24097b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            C5994s.m24076f(view);
        } else {
            C5997t.m24088f(view);
        }
    }
}
