package p060e1;

import android.view.View;

/* renamed from: e1.p1 */
public abstract class C5987p1 extends C5963m0 {

    /* renamed from: a */
    private static final String[] f18717a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: d */
    private static int m24058d(C5989q0 q0Var, int i) {
        int[] iArr;
        if (q0Var == null || (iArr = (int[]) q0Var.f18718a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    /* renamed from: a */
    public void mo19393a(C5989q0 q0Var) {
        View view = q0Var.f18719b;
        Integer num = (Integer) q0Var.f18718a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        q0Var.f18718a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = round;
        iArr[0] = round + (view.getWidth() / 2);
        int round2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = round2;
        iArr[1] = round2 + (view.getHeight() / 2);
        q0Var.f18718a.put("android:visibilityPropagation:center", iArr);
    }

    /* renamed from: b */
    public String[] mo19394b() {
        return f18717a;
    }

    /* renamed from: e */
    public int mo19426e(C5989q0 q0Var) {
        Integer num;
        if (q0Var == null || (num = (Integer) q0Var.f18718a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public int mo19427f(C5989q0 q0Var) {
        return m24058d(q0Var, 0);
    }

    /* renamed from: g */
    public int mo19428g(C5989q0 q0Var) {
        return m24058d(q0Var, 1);
    }
}
