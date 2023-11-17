package p341ge.bog.mobilebank.externallibs.materialcalendar;

import android.content.Context;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.c */
class C23316c extends ViewPager {

    /* renamed from: d */
    private boolean f60995d = true;

    public C23316c(Context context) {
        super(context);
    }

    public boolean canScrollHorizontally(int i) {
        return this.f60995d && super.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.f60995d && super.canScrollVertically(i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f60995d && super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f60995d && super.onTouchEvent(motionEvent);
    }

    /* renamed from: v */
    public void mo58988v(boolean z) {
        this.f60995d = z;
    }
}
