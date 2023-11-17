package androidx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.databinding.g */
public abstract class C1360g {

    /* renamed from: a */
    private static C1358e f3916a = new DataBinderMapperImpl();

    /* renamed from: a */
    static ViewDataBinding m4681a(C1359f fVar, View view, int i) {
        return f3916a.mo3888b(fVar, view, i);
    }

    /* renamed from: b */
    static ViewDataBinding m4682b(C1359f fVar, View[] viewArr, int i) {
        return f3916a.mo3889c(fVar, viewArr, i);
    }

    /* renamed from: c */
    private static ViewDataBinding m4683c(C1359f fVar, ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return m4681a(fVar, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return m4682b(fVar, viewArr, i2);
    }

    /* renamed from: d */
    public static C1359f m4684d() {
        return null;
    }

    /* renamed from: e */
    public static ViewDataBinding m4685e(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, C1359f fVar) {
        boolean z2;
        int i2 = 0;
        if (viewGroup == null || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            i2 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        if (z2) {
            return m4683c(fVar, viewGroup, i2, i);
        }
        return m4681a(fVar, inflate, i);
    }
}
