package ug0;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.C41536l;

/* renamed from: ug0.b */
public final class C28785b implements View.OnTouchListener {

    /* renamed from: d */
    private float f73593d;

    /* renamed from: e */
    private boolean f73594e;

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C41536l.m120489i(view, "v");
        C41536l.m120489i(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            this.f73593d = motionEvent.getRawX();
        } else if (motionEvent.getAction() == 2 && Math.abs(motionEvent.getRawX() - this.f73593d) > 10.0f) {
            this.f73594e = true;
        } else if (motionEvent.getAction() == 1) {
            this.f73594e = false;
        } else if (motionEvent.getAction() == 3) {
            this.f73594e = false;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.f73594e);
        }
        return false;
    }
}
