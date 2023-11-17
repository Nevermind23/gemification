package androidx.core.view;

import android.view.MotionEvent;

/* renamed from: androidx.core.view.u0 */
public abstract class C1248u0 {
    /* renamed from: a */
    public static int m4354a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    /* renamed from: b */
    public static int m4355b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    /* renamed from: c */
    public static int m4356c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    /* renamed from: d */
    public static int m4357d(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    /* renamed from: e */
    public static int m4358e(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    /* renamed from: f */
    public static float m4359f(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    /* renamed from: g */
    public static float m4360g(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    /* renamed from: h */
    public static boolean m4361h(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
