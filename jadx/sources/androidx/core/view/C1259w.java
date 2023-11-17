package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: androidx.core.view.w */
public final class C1259w {

    /* renamed from: a */
    private final C1260a f3827a;

    /* renamed from: androidx.core.view.w$a */
    interface C1260a {
        /* renamed from: a */
        boolean mo3732a(MotionEvent motionEvent);
    }

    /* renamed from: androidx.core.view.w$b */
    static class C1261b implements C1260a {

        /* renamed from: a */
        private final GestureDetector f3828a;

        C1261b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f3828a = new GestureDetector(context, onGestureListener, handler);
        }

        /* renamed from: a */
        public boolean mo3732a(MotionEvent motionEvent) {
            return this.f3828a.onTouchEvent(motionEvent);
        }
    }

    public C1259w(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (Handler) null);
    }

    /* renamed from: a */
    public boolean mo3731a(MotionEvent motionEvent) {
        return this.f3827a.mo3732a(motionEvent);
    }

    public C1259w(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f3827a = new C1261b(context, onGestureListener, handler);
    }
}
